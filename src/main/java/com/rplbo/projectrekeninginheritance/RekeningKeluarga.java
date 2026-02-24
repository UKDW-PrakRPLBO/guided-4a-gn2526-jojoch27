package com.rplbo.projectrekeninginheritance;

public class RekeningKeluarga extends Rekening{

    public RekeningKeluarga(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }

    public RekeningKeluarga(Nasabah nasabah) {
        super(nasabah);
    }

    public void penyetoran(int jumlah) {
        int total = jumlah + (int)bunga(jumlah);
        super.penyetoran(total);
    }

    private double bunga(int jumlah) {
       return (int) (jumlah * 0.5 / 100);
    }

    @Override
    public void penarikan(int jumlah) {
        super.penarikan(jumlah);
    }
}
