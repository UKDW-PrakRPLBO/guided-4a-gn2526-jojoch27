package com.rplbo.projectrekeninginheritance;

public class RekeningSyariah extends Rekening{
    public RekeningSyariah(Nasabah nasabah) {
        super(nasabah);
    }

    public RekeningSyariah(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }

    @Override
    public void penarikan(int jumlah) {
        int total = 0;
        if(jumlah > 100000){
            total = jumlah + total;
        } else {total = jumlah;}
        super.penarikan(jumlah);
    }
    public void sumbangan(int jumlah){
        super.penarikan(jumlah);
    }
}
