package youtube.coderminion.com.androidcardview;


public class Item {
    private String name;
    private int photo;
    private String company;

    public Item() {
        //Might Need Empty constructor, might not!
    }

    public Item(String name, int photo, String company) {
        this.name = name;
        this.photo = photo;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
