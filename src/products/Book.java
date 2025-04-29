package products;

public class Book extends Product {
    private String author;
    private String publication;
    private String genre;

    private static final int bookCode = 1000;
    private static int numberOfBooks = 0;

    public Book(String title, Double price, String author, String genre, String publication) {
        super(title, price);
        setAuthor(author);
        setPublication(publication);
        setGenre(genre);
    }

    @Override
    protected String generateId(){
        numberOfBooks++;
        return String.valueOf(bookCode + numberOfBooks);
    }

    @Override
    public String toString(){
        return super.toString() + "\nAuthor: " + this.author + "\nPublication: " + this.publication + "\nGenre: " + this.genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Author is invalid");
        }
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        if (publication == null || publication.isEmpty()) {
            throw new IllegalArgumentException("Publication is invalid");
        }
        this.publication = publication;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (genre == null || genre.isEmpty()) {
            throw new IllegalArgumentException("Genre is invalid");
        }
        this.genre = genre;
    }
}
