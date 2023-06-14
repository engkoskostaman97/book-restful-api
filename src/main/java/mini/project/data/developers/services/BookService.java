package mini.project.data.developers.services;


import mini.project.data.developers.payloads.requests.BookRequest;
import mini.project.data.developers.payloads.responses.Response;

public interface BookService {
    Response addBook(BookRequest request);

    Response getBooks();

    Response getBookById(String uuid);

    Response updateBookById(String uuid, BookRequest request);

    Response deleteBookById(String uuid);
}