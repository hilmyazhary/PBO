/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_pbo_kel_4;

import java.util.Date;
abstract class Kendaraan {
    private String asal;
    private String tujuan;
    int[] daftarHarga = new int[2];
    private Date tanggal = new Date();
    private int jumlahPenumpang;
    private int maxPenumpang;
    
    public String getAsal(){
        return asal;
    }
    
    public void setAsal(String asal){
        this.asal = asal;
    }
    
    public String getTujuan(){
        return tujuan;
    }
    
    public void setTujuan(String tujuan){
        this.tujuan = tujuan;
    }
    
    public int getDaftarHarga(){
        for(int i=0;i<3;i++){
            return daftarHarga[i];
        }
    }
    
    public Date getTanggal(){
        return tanggal;
    }
    
    public void setTanggal(Date tanggal){
        this.tanggal = tanggal;
    }
    
    public int getJumlahPenumpang(){
        return jumlahPenumpang;
    }
    
    public void setJumlahPenumpang(int jumlahPenumpang){
        this.jumlahPenumpang = jumlahPenumpang;
    }
    
    public int getMaxPenumpang(){
        return maxPenumpang;
    }
    
    public void setMaxPenumpang(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
    }
    
    abstract public void tambahPenumpang(int jumlahPenumpang,Pemesan pm);
    abstract public void kurangPenumpang(int jumlahPenumpang,Pemesan pm);
    abstract public boolean cekKuota();
}
