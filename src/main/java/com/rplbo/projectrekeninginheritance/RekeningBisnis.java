package com.rplbo.projectrekeninginheritance;

public class RekeningBisnis extends Rekening {

    public RekeningBisnis(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }

    public RekeningBisnis(Nasabah nasabah) {
        super(nasabah);
    }

    public void penyetoran(int jumlah) {
        int total = jumlah + (int) bunga(jumlah);
        penarikan(total);
    }

    private double bunga(int jumlah) {
        return (int) (jumlah * 0.01/100);
        
    }
}

