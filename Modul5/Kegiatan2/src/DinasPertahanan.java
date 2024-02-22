class DinasPertanahan {
    private String alamat;
    private int panjangTanah;
    private int luasTanah;

    public DinasPertanahan(String alamat, int panjangTanah, int luasTanah) {
        this.alamat = alamat;
        this.panjangTanah = panjangTanah;
        this.luasTanah = luasTanah;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getPanjangTanah() {
        return panjangTanah;
    }

    public void setPanjangTanah(int panjangTanah) {
        this.panjangTanah = panjangTanah;
    }

    public int getLuasTanah() {
        return luasTanah;
    }

    public void setLuasTanah(int luasTanah) {
        this.luasTanah = luasTanah;
    }

    public void display() {
        System.out.println("Alamat: " + alamat);
        System.out.println("Panjang Tanah: " + panjangTanah);
        System.out.println("Luas Tanah: " + luasTanah);
    }

    public String toString() {
        return alamat + "," + panjangTanah + "," + luasTanah;
    }
}