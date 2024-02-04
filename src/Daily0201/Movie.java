package Daily0201;

class Movie extends Item {
    private String director;
    private String actor;

    public Movie(int id, String name, int price, String director, String actor) {
        super(id, name, price);
        this.director = director;
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }

    public String getActor() {
        return actor;
    }

    public String setDirector(String director) {
        return this.director = director;
    }

    public String setActor(String actor) {
        return this.actor = actor;
    }
}