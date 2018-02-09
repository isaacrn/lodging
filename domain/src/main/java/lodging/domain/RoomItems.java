package lodging.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "RoomItens")
public class RoomItems {

    @Id
    private String idRoomItem;
    private String itemDescription;
    private Float entryValue;
    private Float outValue;
    private Item item;

    public String getIdRoomItem() {
        return idRoomItem;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Float getEntryValue() {
        return entryValue;
    }

    public void setEntryValue(Float entryValue) {
        this.entryValue = entryValue;
    }

    public Float getOutValue() {
        return outValue;
    }

    public void setOutValue(Float outValue) {
        this.outValue = outValue;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
