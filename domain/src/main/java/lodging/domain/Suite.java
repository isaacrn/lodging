package lodging.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Suites")
public class Suite {

    @Id
    ObjectId idSuite = new ObjectId();
    private String nameSuite;
    private String typeSuite;
    private int numberSuite;
    private RoomItems roomItems;

    public ObjectId getIdSuite() {
        return idSuite;
    }

    public String getNameSuite() {
        return nameSuite;
    }

    public void setNameSuite(String nameSuite) {
        this.nameSuite = nameSuite;
    }

    public String getTypeSuite() {
        return typeSuite;
    }

    public void setTypeSuite(String typeSuite) {
        this.typeSuite = typeSuite;
    }

    public int getNumberSuite() {
        return numberSuite;
    }

    public void setNumberSuite(int numberSuite) {
        this.numberSuite = numberSuite;
    }

    public RoomItems getRoomItems() {
        return roomItems;
    }

    public void setRoomItems(RoomItems roomItems) {
        this.roomItems = roomItems;
    }
}
