package kalkulatorpbo;

// KELAS INDUK (Abstract Class)
public abstract class BangunRuang {
    public abstract double hitungVolume();
    public abstract double hitungLuas();
}

// OBJEK 1: KUBUS
class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    @Override
    public double hitungLuas() {
        return 6 * (sisi * sisi);
    }
}

// OBJEK 2: BALOK
class Balok extends BangunRuang {
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double hitungLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
}

// OBJEK 3: TABUNG
class Tabung extends BangunRuang {
    private double jariJari, tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return 3.14 * jariJari * jariJari * tinggi;
    }

    @Override
    public double hitungLuas() {
        return 2 * 3.14 * jariJari * (jariJari + tinggi);
    }
}
