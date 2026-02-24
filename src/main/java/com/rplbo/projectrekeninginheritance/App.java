package com.rplbo.projectrekeninginheritance;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
            RekeningBisnis rb = new RekeningBisnis(new Nasabah("a", "1", "jl1"), 100000);
            rb.penyetoran(100000);
            rb.penarikan(25000);
            System.out.println(rb.getSaldo());

            RekeningKeluarga rk = new RekeningKeluarga(new Nasabah("a", "1", "jl1"), 100000);
            rk.penyetoran(100000);
            rk.penarikan(25000);
            System.out.println(rk.getSaldo());

            RekeningSyariah rs = new RekeningSyariah(new Nasabah("a", "1", "jl1"), 100000);
            rs.penyetoran(150000);
            rs.penarikan(25000);
            rs.sumbangan(30000);
            System.out.println(rs.getSaldo());

            RekeningUtama ru = new RekeningUtama(new Nasabah("a", "1", "jl1"), 100000);
            rs.penyetoran(100000);
            rs.penarikan(25000);
            System.out.println(rs.getSaldo());

            RekeningTambahan rt = new RekeningTambahan(new Nasabah("a", "1", "jl1"), 100000);
            rs.penyetoran(100000);
            rs.penarikan(25000);
            System.out.println(rs.getSaldo());

        
    }
}
