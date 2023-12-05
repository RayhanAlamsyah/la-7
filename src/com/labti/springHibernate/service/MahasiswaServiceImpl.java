/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.springHibernate.service;

import com.labti.springHibernate.dao.MahasiswaDao;
import com.labti.springHibernate.model.MahasiswaDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.import org.springframework.transaction.annotation.Transactional;

@Service("MahasiswaService")
@Transactional(readOnly = true)
public class MahasiswaServiceImpl implements MahasiswaService {

	@Autowired
	private MahasiswaDao mahasiswaDao;
	
	@Transactional
	@Override
	public void save(Mahasiswa mahasiswa) {
		mahasiswaDao.save(mahasiswa);
	}
	
	@Transactional
	@Override
	public void update(Mahasiswa mahasiswa) {
		mahasiswaDao.update(mahasiswa);
        }

	@Transactional
	@Override
	public void delete(Mahasiswa mahasiswa) {
		mahasiswaDao.Delete(mahasiswa);
	}
        
        @Override
        public Mahasiswa getMahasiswa(String npm) {
            retrun mahasiswaDao.getMahasiswa(npm);
        }
        
        @Override
        public List<Mahasiswa> getMahasiswas() {
            return mahasiswaDao.getMahasiswas();
            
        }
}