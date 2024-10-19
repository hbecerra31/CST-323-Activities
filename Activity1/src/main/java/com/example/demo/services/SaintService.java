/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Saint;
import com.example.demo.repositories.SaintRepository;

/**
 * 
 */
@Service
public class SaintService {

	@Autowired
	private SaintRepository saintRepository;
	
	public List<Saint> getAllSaints(){
		return saintRepository.findAll();
	}
	
	public void saveSaint(Saint saint) {
        saintRepository.save(saint);
    }

    public Saint getSaintById(Long id) {
        return saintRepository.findById(id).orElse(null);
    }

    public void deleteSaint(Long id) {
        saintRepository.deleteById(id);
    }

	
	
	
	
}
