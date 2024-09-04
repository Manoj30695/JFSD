package com.klef.jfsd.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.Model.AdminRegistration;

@Repository
public interface AdminRepositoy extends JpaRepository<AdminRegistration, String> {
	
	@Query("from AdminRegistration ar where ar.username=?1 and ar.password=?2")
	public AdminRegistration checkLogin(String username, String pwd);
	
}
