package com.company;

public class Class {
    private String nip;
    private String nama;
    private String divisi;

    public Class(String nip, String nama, String divisi) {
        this.nip = nip;
        this.nama = nama;
        this.divisi = divisi;
    }

    public String getNip() {
        return nip;
    }

    @Override
    public String toString() {
        return	"Class {nip='" + nip + '\'' + ", nama='" + nama + '\''  + ", divisi='" + divisi + '\'' + "}" ;
    }
}