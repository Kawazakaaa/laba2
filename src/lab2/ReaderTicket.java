package lab2;

import java.util.Scanner;

public class ReaderTicket {
    private String readerName; // фамилия читателя
    private String bookAuthor; // автор книги
    private String bookTitle;  // название книги
    private String issueDate;  // дата выдачи книги (формат дд.мм.гг)

    // Конструктор с параметрами
    public ReaderTicket(String readerName, String bookAuthor,
                        String bookTitle, String issueDate) {
        this.setReaderName(readerName);
        this.setBookAuthor(bookAuthor);
        this.setBookTitle(bookTitle);
        this.setIssueDate(issueDate);
    }

    // Конструктор по умолчанию (ввод с клавиатуры)
    public ReaderTicket() {
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.print("Фамилия читателя : ");
        this.setReaderName(sc.nextLine());
        System.out.print("\tАвтор книги    : ");
        this.setBookAuthor(sc.nextLine());
        System.out.print("\tНазвание книги : ");
        this.setBookTitle(sc.nextLine());
        System.out.print("\tДата выдачи    : ");
        this.setIssueDate(sc.nextLine());
    }

    @Override
    public String toString() {
        return String.format(
                "Читатель: %-12s | Автор: %-10s | Книга: %-25s | Дата выдачи: %s",
                readerName, bookAuthor, bookTitle, issueDate
        );
    }

    // Геттеры и сеттеры с проверками
    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String value) {
        if (value == null || value.trim().isEmpty()) {
            System.out.println("Недопустимое значение: фамилия читателя!");
        } else {
            this.readerName = value.trim();
        }
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String value) {
        if (value == null || value.trim().isEmpty()) {
            System.out.println("Недопустимое значение: автор книги!");
        } else {
            this.bookAuthor = value.trim();
        }
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String value) {
        if (value == null || value.trim().isEmpty()) {
            System.out.println("Недопустимое значение: название книги!");
        } else {
            this.bookTitle = value.trim();
        }
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String value) {
        if (value == null || !value.matches("\\d{2}\\.\\d{2}\\.\\d{2}")) {
            System.out.println("Недопустимое значение: дата должна быть в формате дд.мм.гг!");
        } else {
            this.issueDate = value;
        }
    }
}