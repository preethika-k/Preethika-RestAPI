package com.example.Education.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Education.Model.loanapplication;
import com.example.Education.Repo.loanapplicationRepo;

@Service
public class adminService {
	 @Autowired
	 loanapplicationRepo loanApp;
	 public List<loanapplication> getAdmin()
	 {
		 return loanApp.findAll();
	 }
     public loanapplication saveDetails(loanapplication lm)
     {
    	 return loanApp.save(lm);
     }
     public loanapplication putDetails(loanapplication ab)
     {
    	 return loanApp.saveAndFlush(ab);
     }
    public void deleteDetails(int loanid)
    {
    	loanApp.deleteById(loanid);
    }

}
