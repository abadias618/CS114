//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//library
package BookLibrary;

public class Book {
    private String title;
    private String author;

    Book(String title, String author){
        this.title=title;
        this.author=author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return title+" by "+author;
    }
}
