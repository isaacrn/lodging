package lodging.domain;

import javax.persistence.Entity;

@Entity
public class Suite extends AbstractEntity{

    private String nameSuite;
    private String typeSuite;
    private int numberSuite;
    private RoomItems roomItems;

    public Suite() {
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
