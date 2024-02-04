package Daily0201;

public class ItemManager {
    public static void main(String[] args) {
        Album album1 = new Album(1, "Proof",74200,"BTS" );
        Movie movie1 = new Movie(2, "서울의봄",19000, "김성수", "정우성");
        Book book1 = new Book(3, "자바의정석 3rd Edition", 27000, "남궁성", "9788994492032");


        // Album 객체 속성 출력
        System.out.println("Album ID: " + album1.getId());
        System.out.println("Album Name: " + album1.getName());
        System.out.println("Album Price: " + album1.getPrice());
        System.out.println("Album Artist: " + album1.getArtist());
        System.out.println("=====================================");
        // Movie 객체 속성 출력
        System.out.println("Movie ID: " + movie1.getId());
        System.out.println("Movie Name: " + movie1.getName());
        System.out.println("Movie Price: " + movie1.getPrice());
        System.out.println("Movie Director: " + movie1.getDirector());
        System.out.println("Movie Actor: " + movie1.getActor());
        System.out.println("=====================================");
        // Book 객체 속성 출력
        System.out.println("Book ID: " + book1.getId());
        System.out.println("Book Name: " + book1.getName());
        System.out.println("Book Price: " + book1.getPrice());
        System.out.println("Book Author: " + book1.getAuthor());
        System.out.println("Book ISBN: " + book1.getIsbn());
    }
}
