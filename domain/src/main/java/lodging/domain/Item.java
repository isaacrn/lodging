package lodging.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Items")
public class Item {

    @Id
    private String idItem;
    private String nameItem;
    private int quantity;

    public Item(String nameItem, int quantity) {
        this.nameItem = nameItem;
        this.quantity = quantity;
    }

    public String getIdItem() {
        return idItem;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
