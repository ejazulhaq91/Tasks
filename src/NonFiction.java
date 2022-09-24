public class NonFiction extends Book {
    void setPrice(double price) {
        BookPrice = price;
    }

    NonFiction(String title) {
        super(title);
        setPrice(37.99);
    }
}
