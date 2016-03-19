/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_pbo_kel_4;

/**
 *
 * @author ACER E1
 */
public class Pesawat extends Kendaraan{
    private String namaPesawat;
    private double tarif;
    private int sisaPenumpang=super.getMaxPenumpang();
    public double getTarif(){
        return tarif;
    }
    public void setHargaPerTiket(int harga){
        super.daftarHarga[0]=harga;
    }
    public void setTarif(int dewasa,int lansia){
        tarif=(super.daftarHarga[0]*dewasa)+(super.daftarHarga[0]*lansia*0.75);
    }
    
    public void tambahPenumpang(Pemesan pm){
        sisaPenumpang=sisaPenumpang-(pm.getNPenumpang()+1);
    }
    public void kurangPenumpang(Pemesan pm){
        sisaPenumpang=sisaPenumpang+(pm.getNPenumpang()+1);
    }
    public boolean cekKuota(){
        if(sisaPenumpang>0){
            return true;
        }else{
            return false;
        }
    }
}