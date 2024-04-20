import java.util.List;

interface Collection<T> {
    void addBook(T book);
    T searchBook(String title, String isbn);
    List<T> listBooks();
    List<User> listUsers();
}
