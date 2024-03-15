public class Buku {
    private String id;
    private String judul;
    private String penulis;
    private String genre;
    private int stok;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(){
        this.genre = genre;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public Buku(String id, String judul, String penulis, String genre, int stok) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.genre = genre;
        this.stok = stok;
    }


}