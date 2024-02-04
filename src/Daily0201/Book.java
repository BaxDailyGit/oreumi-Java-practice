package Daily0201;
class Book extends Item {
    private String author;
    private String isbn;

    public Book(int id, String name, int price, String author, String isbn) {
        super(id, name, price);
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String setAuthor(String author) {
        return this.author = author;
    }

    public String setIsbn(String isbn) {
        return this.isbn = isbn;
    }
}