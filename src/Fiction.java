public class Fiction extends Book {
    void setPrice(double price) {
        BookPrice = price;
    }

    Fiction(String title) {
        super(title);
        setPrice(24.99);
    }
}
