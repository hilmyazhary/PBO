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
public class Pemesan {
    private String name;
    private String userName;
    private String password;
    private String email;
    private Penumpang[] p;
    private int nPenumpang=0;
    private int sisaPenumpang;
    
    public Pemesan(int sisaPenumpang){
        this.sisaPenumpang=sisaPenumpang;
        p=new Penumpang[sisaPenumpang];
    }
    public boolean login(String userName,String password){
        if((userName==this.userName)&&(password==this.password)){
            return true;
        }else{
            return false;
        }
    }
    public void registrasi(String name,String userName,String password,String email){
        this.name=name;
        this.userName=userName;
        this.password=password;
        this.email=email;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public Penumpang getPenumpang(int i){
        return p[i];
    }
    public void addPenumpang(Penumpang pen){
        if(nPenumpang<sisaPenumpang){
            p[nPenumpang]=pen;
            nPenumpang++;
        }else{
            System.out.println("penuh");
        }
    }
    public int getNPenumpang(){
        return nPenumpang;
    }
}
