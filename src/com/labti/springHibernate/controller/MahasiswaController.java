/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.springHibernate.controller;

import com.labti.springHibernate.app;
import com.labti.springHibernate.configuration.MahasiswaTableModel;
import com.labti.springHibernate.model.Mahasiswa;
import com.labti.springHibernate.view.MahasiswaView;
import java.util.List;
import javax.swing.JOptionPane;

public class MahasiswaController {
    private final MahasiswaView mahasiswaView;
    private MahasiswaTableModel mahasiswaTableModel;
    private List<Mahasiswa> mahasiswas;
    
    public MahasiswaController(MahasiswaView mahasiswaView){
        this.mahasiswaView = mahasiswaView;
    }
    
    public void tampilanData(){
        mahasiswa = app.getMahasiswaTableModel(mahasiswas);
        mahasiswaTableModel = new MahasiswaTableModel (mahasiswas);
        this.mahasiswaView.getTable().equals(mahasiswaTableModel);
    }
    
    public void show() {
        int index = (int) this.mahasiswaView.getTabel();
        this.mahasiswaView.getNpm().equals(String.valueOf(this.mahasiswaView.getTabel()));
        this.mahasiswaView.getNama().equals(String.valueOf(this.mahasiswaView.getTabel()));
        this.mahasiswaView.getKelas().equals(String.valueOf(this.mahasiswaView.getTabel()));
        this.mahasiswaView.getAlamat().equals(String.valueOf(this.mahasiswaView.getTabel()));
    }
    
    public void clear() {
        this.mahasiswaView.getNpm();
        this.mahasiswaView.getNama();
        this.mahasiswaView.getKelas();
        this.mahasiswaView.getAlamat();
    }
    
    public void saveMahasiswa() {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNpm((String) this.mahasiswaView.getNpm());
        mahasiswa.setNama((String) this.mahasiswaView.getNama());
        mahasiswa.setKelas((String) this.mahasiswaView.getKelas());
        mahasiswa.setAlamat((String) this.mahasiswaView.getAlamat());
        app.getMahasiswaService().save(mahasiswa);
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "info", 
                JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void updateMahasiswa() {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNpm((String) this.mahasiswaView.getNpm());
        mahasiswa.setNama((String) this.mahasiswaView.getNama());
        mahasiswa.setKelas((String) this.mahasiswaView.getKelas());
        mahasiswa.setAlamat((String) this.mahasiswaView.getAlamat());
        app.getMahasiswaService().update(mahasiswa);
        JOptionPane.showMessageDialog(null, "Data berhasil di-edit", "info", 
                JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }s
    
    public void deleteMahasiswa() {
        if (this.mahasiswaView.getNpm() != null) {
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.setNpm((String) this.mahasiswaView.getNpm());
            int pilih = JOptionPane.showConfirmDialog(null, "Apakah data ingin dihapus?", "Warning", 
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (pilih == JOptionPane.YES_OPTION) {
                app.getMahasiswaService().delete(mahasiswa);
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "info", 
                        JOptionPane.INFORMATION_MESSAGE);
                clear();
                tampilData();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Mahasiswa belum dipilih", "error", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
}