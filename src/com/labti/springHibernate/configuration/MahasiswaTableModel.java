/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.springHibernate.configuration;

import com.labti.springHibernate.model.Mahasiswa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class MahasiswaTableModel extends AbstractTableModel {
    private List<Mahasiswa> mahasiswas = new ArrayList<>();
    private final String HEADER[] = {"NPM","Nama","Kelas","Alamat"};


    public MahasiswaTableModel (List<Mahasiswa> mahasiswas) {
        this.mahasiswas = mahasiswas;
    }
    @Override
    public int getRowCount(){
    return mahasiswas.size();
    }
    @Override
    public int getColumnCount(){
    return HEADER.length;
    }
    @Override
    public String getColumnName (int columnIndex) {
        return HEADER[columnIndex];
    }    
    @Override
    public object getValueAt(int rowIndex, int columnIndex){
        Mahasiswa mahasiswa = mahasiswa.get (rowIndex);
        switch (columnIndex) {
            case 0:
                return mahasiswa.getNPM();
            case 1:
                return mahasiswa.getNama();
            case 2:
                return mahasiswa.getKelas();
            case 3:
                return mahasiswa.getAlamat();
            default:
                return null;
        }
    }

    private static class object {

        public object() {
        }
    }
}
