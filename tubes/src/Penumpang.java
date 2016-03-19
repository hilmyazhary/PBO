/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.DateFormat;
import java.util.Scanner;

public class penumpang{
	private String nama;
	private String noKtp;
	private Date tgl;

	public penumpang(String nama, String noKtp,Date tgl){
		setNama(nama);
		setNoKtp(noKtp);
		this.tgl = tgl;
	}
	public void setNama(String nama){
		this.nama = nama;
	}
	public void setNoKtp(String noKtp){
		this.noKtp = noKtp;
	}
	public String getNama(){
		return nama;
	}
	public String getNoKtp(){
		return noKtp;
	}
	public String getJenisPenumpang(){
		int umur = 2016-thn;
		if(umur<=3)
			return "Anak-anak";
		else if(umur>=60)
			return "Lanjut Usia";
		else
			return "Dewasa";
	}
	
}

