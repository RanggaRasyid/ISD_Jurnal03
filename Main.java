package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) { Linked<Class> LinkedList = new Linked<>();
        Scanner input = new Scanner(System.in);
        String dataNip, dataNama, dataDivisi, opsi;
        int masukan=0;
        int hapusData=0;

        while(masukan!=4){
            System.out.println("Pilih Masukkan:");
            System.out.println("1. Input data");
            System.out.println("2. Hapus data");
            System.out.println("3. Cek list anggota");
            System.out.println("4. Keluar");
            masukan=input.nextInt();

            if(masukan==1){
                System.out.println("Masukkan data anggota ");
                System.out.println("Tuliskan nip, nama dan divisi");
                dataNip=input.next();
                dataNama=input.next();
                dataDivisi=input.next();

                System.out.println("Tambahkan sebuah data di awal list? (iya/tidak)");
                opsi=input.next();
                if(opsi.equals("iya")){
                    LinkedList.insertAtFront(new Class(dataNip, dataNama, dataDivisi));
                }
                if(opsi.equals("tidak")){
                    LinkedList.insertAtBack(new Class(dataNip, dataNama, dataDivisi));
                }
            }
            else if(masukan==2){
                System.out.println("Pilih opsi data yang akan dihapus:");
                System.out.println("1. Data Awal");
                System.out.println("2. Data Akhir");
                hapusData=input.nextInt();
                if(hapusData==1){
                    LinkedList.removeFromFront();
                    LinkedList.print();
                }
                else if(hapusData==2){
                    LinkedList.removeFromBack();
                    LinkedList.print();
                }
            }
            else if(masukan==3) {
                LinkedList.print();

            }
        }
    }
}