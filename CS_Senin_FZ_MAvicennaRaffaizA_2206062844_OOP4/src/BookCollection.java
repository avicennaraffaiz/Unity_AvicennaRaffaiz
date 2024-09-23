import java.util.List;
import java.util.stream.Collectors;

public class BookCollection extends LibraryCollection<Book>{
    public BookCollection() {
        super();
    }

    public List<Book> findByTitle(String title) {
        return getAllItems().stream().filter(book -> book.title.toLowerCase()
                .contains(title.toLowerCase())).collect(Collectors.toList());
    }

    public List<Book> findByAuthor(String author) {
        return getAllItems().stream().filter(book -> book.author.toLowerCase()
                .contains(author.toLowerCase())).collect(Collectors.toList());
    }

    public List<Book> findByYear(int year) {
        return getAllItems().stream().filter(book -> book.year == year)
                .collect(Collectors.toList());
    }
}
