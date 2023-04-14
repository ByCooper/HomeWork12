import java.util.Objects;

public class Book {
    String name;
    int year;
    Author author;

    public Book (String  fName, String mName, String name, int year) {
        this.author = new Author(fName, mName);
        this.name = name;
        this.year = year;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return year == book.year && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, name, author);
    }

    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year) {
        if(year < 0) {
            throw new IllegalArgumentException("Год издания не может быть отрицательным");
        }
        this.year = year;
    }
    public String toString() {
        return "Произведение " + this.name + " написал очень известный писатель " + this.author.getFirstName() + " " + this.author.getMiddleName() + " в " + this.year + " году";
    }
}

