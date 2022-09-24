public abstract class Book {
    String BookTitle;
    double BookPrice;
    Book(String title)
    {
        this.BookTitle = title;
    }
    public String getTitle()
    {
        return BookTitle;
    }
    public double getPrice()
    {
        return BookPrice;
    }

    abstract void setPrice(double price);
}

