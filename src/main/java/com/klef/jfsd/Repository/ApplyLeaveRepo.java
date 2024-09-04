package com.klef.jfsd.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.Model.ApplyLeave;

import jakarta.transaction.Transactional;

@Repository
public interface ApplyLeaveRepo extends JpaRepository<ApplyLeave, String> {

	@Transactional
	@Modifying
	@Query("update ApplyLeave s set s.applystatus=?3 where s.id=?1 and s.Sdate=?2")
	public int acceptorrejectquery(int id,String date, String status) ;
	
	
	
	@Query("select count(s) from ApplyLeave s where s.id = ?1 and s.Sdate = ?2")
	public int chechkinsertwhileapplying(int id, String date);
     
	@Query("SELECT s FROM ApplyLeave s WHERE s.id = ?1")
	public List<ApplyLeave> getalldata(int id);



}
