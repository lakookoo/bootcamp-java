import java.util.ArrayList;

public class Store {
    private ArrayList<Book> books;

    public Store(){
        this.books = new ArrayList<Book>();
    }

    public Book getBook(int index){
        Book copy = this.books.get(index);
        return copy;
    }

    public void setBook(int index, Book newBook){
        Book copy = new Book(newBook);
        this.books.add(index, copy);
    }

    public void addBook(Book newBook){
        this.books.add(new Book(newBook));
    }

    public boolean contains(Book book) {
        return this.books.contains(book);
    }

    public void sellBook(String title){
        for ( Book book : this.books){
            if( book.getTitle().equals(title)){
                this.books.remove(book);
            }
        }
    }
    
}
