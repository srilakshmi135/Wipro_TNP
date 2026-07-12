package OOPSInheritance.EncapsulationAbstraction;

public class Book {

    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    // Parameterized Constructor
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    // Setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }


    public void displayBookDetails() {

        System.out.println("Book Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qtyInStock);

        System.out.println("Author Details:");
        author.displayAuthor();
    }


    public static void main(String[] args) {

        Author author = new Author(
                "Robert Martin",
                "robert@gmail.com",
                'M'
        );

        Book book = new Book(
                "Clean Code",
                author,
                550.0,
                10
        );

        book.displayBookDetails();
    }
}