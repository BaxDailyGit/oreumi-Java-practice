package Daily0201;

class Album extends Item {
    private String artist;

    public Album(int id, String name, int price, String artist) {
        super(id, name, price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public String setArtist(String artist) {
        return this.artist = artist;
    }
}
