package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Map;

//문제
@AllArgsConstructor
@ToString
class Book{
    private String isbn;
    private String title;
    private String author;
    private String price;
    private String publisher;
}

public class BookJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        Book book = new Book(
                "978-1234567890",
                "자바의 정석",
                "남궁성",
                "30000",
                "도우출판");

        String jsonBook = gson.toJson(book);

        Map<String,String> bookMap = gson.fromJson(jsonBook,Map.class);
        System.out.println("Json->Map");
        System.out.println(bookMap);

        String prettyJsonFromMap = gsonBuilder.toJson(bookMap);
        System.out.println("Map->Pretty Json");
        System.out.println(prettyJsonFromMap);

        Book parsedBook = gson.fromJson(jsonBook,Book.class);
        System.out.println("Json->Book");
        System.out.println(parsedBook);
    }
}
