/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarmahasiswa;

/**
 *
 * @author sekar
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String nilai;
    private String jenisKelamin;
    private String kelas;
    
    public Mahasiswa(String nim, String nama, String nilai,  String jenisKelamin, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
        this.jenisKelamin = jenisKelamin;
        this.kelas = kelas;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setNilai(String nilai) {
        this.nilai = nilai;
    }
    
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public String getNim() {
        return this.nim;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public String getNilai() {
        return this.nilai;
    }
    
     public String getJenisKelamin() {
        return this.jenisKelamin;
    }
    
    public String getKelas() {
        return this.kelas;
    }
}
