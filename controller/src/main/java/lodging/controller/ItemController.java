package lodging.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lodging.domain.Item;
import lodging.model.request.AddItemRequest;
import lodging.persistence.ItemRepository;

@RestController
@RequestMapping("/items")
public class ItemController {

    private ItemRepository itemRepository;

    @Autowired
    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/allItems")
    public ResponseEntity<?> getItems() {
        return new ResponseEntity<>(itemRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/addItem")
    public ResponseEntity<?> addItem(@RequestBody AddItemRequest addItemRequest) {
        Item item = new Item(addItemRequest.getNameItem(), addItemRequest.getQuantity());
        return new ResponseEntity<>(itemRepository.save(item), HttpStatus.OK);
    }

    @PutMapping("/updateItem/{id}")
    public ResponseEntity<?> updateItem(@PathVariable Long id, @RequestBody AddItemRequest addItemRequest) {
        Item item = itemRepository.findOne(id);
        return new ResponseEntity<>(itemRepository.save(editItem(item, addItemRequest)), HttpStatus.OK);
    }

    private Item editItem(Item item, AddItemRequest addItemRequest) {
        item.setNameItem(addItemRequest.getNameItem());
        item.setQuantity(addItemRequest.getQuantity());
        return item;
    }

    @DeleteMapping("/deleteItem/{id}")
    public ResponseEntity<?> deleteItem(@PathVariable("id") Long id) {
        itemRepository.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
