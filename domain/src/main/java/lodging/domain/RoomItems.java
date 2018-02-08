package lodging.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "RoomItens")
public class RoomItems {

    @Id
    private ObjectId idRoomItem = new ObjectId();
    private String itemDescription;
    private Float entryValue;
    private Float outValue;
    private Item item;

    public ObjectId getIdRoomItem() {
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
}
