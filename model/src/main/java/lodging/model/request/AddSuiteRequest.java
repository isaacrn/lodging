package lodging.model.request;

public class AddSuiteRequest {

    private String nameSuite;
    private String typeSuite;
    private int numberSuite;

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
}
