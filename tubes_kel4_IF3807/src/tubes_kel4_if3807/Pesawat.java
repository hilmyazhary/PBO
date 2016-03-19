/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_kel4_if3807;

/**
 *
 * @author ACER E1
 */
public class Pesawat {
    private String namaPesawat;
    private int tarifkendaraan;
    private int[] harga=new int[2];
    private int tarif;
    public int getTarif(){
        return tarif;
    }
    public void setTarif(int balita,int dewasa,int lansia){
        tarif=(int) ((dewasa*harga[0])+(lansia*harga[0]*0.5));
    }
    
    
}
