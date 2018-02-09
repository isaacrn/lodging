package lodging.controller;

import java.util.List;

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

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/allItems")
    public List<Item> getItems() {
        return itemRepository.findAll();
    }

    @PostMapping("/addItem")
    public void addItem(@RequestBody AddItemRequest addItemRequest) {
        Item item = new Item(addItemRequest.getNameItem(), addItemRequest.getQuantity());
        itemRepository.insert(item);
    }

    @PutMapping("/updateItem/{id}")
    public void updateItem(@PathVariable String id, @RequestBody AddItemRequest addItemRequest) {
        Item item = itemRepository.findOne(id);
        itemRepository.save(editItem(item, addItemRequest));
    }

    private Item editItem(Item item, AddItemRequest addItemRequest) {
        item.setNameItem(addItemRequest.getNameItem());
        item.setQuantity(addItemRequest.getQuantity());
        return item;
    }

    @DeleteMapping("/deleteItem/{id}")
    public void deleteItem(@PathVariable("id") String id) {
        this.itemRepository.delete(id);
    }
}
