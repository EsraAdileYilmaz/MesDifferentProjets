package day03_projetDeLivre;

import java.time.LocalDateTime;

public class Kitap {

    private int kitapNo;
    private String kitapAdi,yazarAdi;
    private double kitapFiyati;
    private LocalDateTime kayitTarihi;

    public Kitap() {
    }

    public Kitap(int kitapNo, String kitapAdi, String yazarAdi, double kitapFiyati, LocalDateTime kayitTarihi) {
        this.kitapNo = kitapNo;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.kitapFiyati = kitapFiyati;
        this.kayitTarihi = kayitTarihi;
    }

    public int getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(int kitapNo) {
        this.kitapNo = kitapNo;
    }
    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public double getKitapFiyati() {
        return kitapFiyati;
    }

    public void setKitapFiyati(double kitapFiyati) {
        this.kitapFiyati = kitapFiyati;
    }

    public LocalDateTime getKayitTarihi() {
        return kayitTarihi;
    }

    public void setKayitTarihi(LocalDateTime kayitTarihi) {
        this.kayitTarihi = kayitTarihi;
    }
    @Override
    public String toString() {
        return "kitapNo=" + kitapNo +
                "  kitapAdi=" + kitapAdi +
                "  yazarAdi=" + yazarAdi +
                "  kitapFiyati=" + kitapFiyati +
                "  kayitTarihi=" + kayitTarihi;
    }



}
