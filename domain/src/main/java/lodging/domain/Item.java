package lodging.domain;

import javax.persistence.Entity;

@Entity
public class Item extends AbstractEntity{


    private String nameItem;
    private int quantity;

    public Item(String nameItem, int quantity) {
        this.nameItem = nameItem;
        this.quantity = quantity;
    }

    public Item() {
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
