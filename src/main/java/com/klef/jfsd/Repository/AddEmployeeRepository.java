package com.klef.jfsd.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.Model.AddEmployee;

@Repository
public interface AddEmployeeRepository extends JpaRepository<AddEmployee, Integer>{

	@Query("from AddEmployee addstud where addstud.email=?1 and addstud.dob=?2")
	public AddEmployee checkStdLogin(String username,String pwd);
}
