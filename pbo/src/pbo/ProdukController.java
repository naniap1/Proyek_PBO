package pbo;

import javafx.beans.property.*;

public class ProdukController {

    private final IntegerProperty id = new SimpleIntegerProperty();
    private final StringProperty kode = new SimpleStringProperty();
    private final StringProperty jenisProduk = new SimpleStringProperty();
    private final StringProperty namaProduk = new SimpleStringProperty();
    private final DoubleProperty harga = new SimpleDoubleProperty();
    private final IntegerProperty stok = new SimpleIntegerProperty();

    // Constructors
    public ProdukController() {
    }

    public ProdukController(int id, String kode, String jenisProduk, String namaProduk, double harga, int stok) {
        setId(id);
        setKode(kode);
        setJenisProduk(jenisProduk);
        setNamaProduk(namaProduk);
        setHarga(harga);
        setStok(stok);
    }

    // Getter and Setter methods

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public String getKode() {
        return kode.get();
    }

    public void setKode(String kode) {
        this.kode.set(kode);
    }

    public StringProperty kodeProperty() {
        return kode;
    }

    public String getJenisProduk() {
        return jenisProduk.get();
    }

    public void setJenisProduk(String jenisProduk) {
        this.jenisProduk.set(jenisProduk);
    }

    public StringProperty jenisProdukProperty() {
        return jenisProduk;
    }

    public String getNamaProduk() {
        return namaProduk.get();
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk.set(namaProduk);
    }

    public StringProperty namaProdukProperty() {
        return namaProduk;
    }

    public double getHarga() {
        return harga.get();
    }

    public void setHarga(double harga) {
        this.harga.set(harga);
    }

    public DoubleProperty hargaProperty() {
        return harga;
    }

    public int getStok() {
        return stok.get();
    }

    public void setStok(int stok) {
        this.stok.set(stok);
    }

    public IntegerProperty stokProperty() {
        return stok;
    }
}
