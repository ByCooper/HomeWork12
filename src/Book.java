public class Book {
    String name;
    int year;
    Author author;

    public Book (String  fName, String mName, String name, int year) {
        this.author = new Author(fName, mName);
        this.name = name;
        this.year = year;
    }

    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}

