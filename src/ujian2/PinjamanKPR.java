package ujian2;

import java.util.Scanner;

public class PinjamanKPR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Pinjaman Bulanan KPR");
		int datefrom, platfon, bunga, lamapinjaman,angsuran;
		
		
		System.out.println("Masukkan Pinjaman Yang Dibutuhkan :");
		platfon = input.nextInt();
		
		System.out.println("Masukkan Besar bunga Perbulan : ");
		bunga = input.nextInt();
		
		System.out.println("Masukkan Lama Pinjaman : ");
		lamapinjaman = input.nextInt();
		
		angsuran = platfon/lamapinjaman;
		
		
		System.out.println("| Angsuran ke- | Tanggal | Total Angsuran | Angsuran Pokok | Angsuran Bunga | Sisa Pinjaman |");		
		for(int i=0; i<lamapinjaman; i++){
			datefrom = angsuran + (platfon * bunga / 100);
			platfon = platfon - angsuran;
			bunga = lamapinjaman * platfon;
		
	    System.out.println("|   "+(i+1)+"    | tanggal | " +"Rp."+platfon+"  | angsuran Pokok | Rp. "+bunga+" | Sisa Pinjaman |");
	    
	}

	}
}
