package lv.rvt;

public class Book {
    private String title;
    private Integer pages;
    private Integer publicationyear;

    public Book(int pages, int publicationyear, String title) {
        this.title = title;
        this.pages = pages;
        this.publicationyear = publicationyear;

    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public int getPublicationYear() {
        return this.publicationyear;
    }

    public String vissIevaditais() {
            return "Title:" + this.title + ", " + "Lapas: "+ this.pages + ", " + "Publication Year: " + this.publicationyear;
    }

    

}
