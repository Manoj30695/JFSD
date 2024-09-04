package com.klef.jfsd.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.jfsd.Model.AddEmployee;
import com.klef.jfsd.Model.AdminRegistration;
import com.klef.jfsd.Model.ApplyLeave;
import com.klef.jfsd.Repository.AddEmployeeRepository;
import com.klef.jfsd.Repository.AdminRepositoy;
import com.klef.jfsd.Repository.ApplyLeaveRepo;

@Service
public class AdminServiceImpl implements AdminService{
   
	@Autowired
	private AdminRepositoy adminRepositoy;
	
	@Autowired
	private ApplyLeaveRepo applyleave;
	
	@Autowired
	private AddEmployeeRepository addstudRepo;
	
	@Override
	public String RegisterAdmin(AdminRegistration ar) {
		adminRepositoy.save(ar);
		return "Successfully Registered";
	}
	@Override
	public AdminRegistration checkLogin(String username, String pwd) {
		AdminRegistration ar = adminRepositoy.checkLogin(username, pwd);
		return ar;
	}
	@Override
	public String AddEmployee(AddEmployee addstud) {
		addstudRepo.save(addstud);
		return "Successfully Added Student";
	}
	@Override
	public AddEmployee checkStdLogin(String username, String pwd) {
		AddEmployee addstud = addstudRepo.checkStdLogin(username, pwd);
		return addstud;
	}
	@Override
	public String leaveapp(ApplyLeave apl) {
	    applyleave.save(apl);
		return "Successfully Applied For Leave";
	}
	@Override
	public List<ApplyLeave> leavehistory() {
		List<ApplyLeave> list = applyleave.findAll();
		return list;
	}
	@Override
	public int acceptleave(int id,String date, String status) {
		
		return  applyleave.acceptorrejectquery(id,date, status);
	}
	@Override
	public int checkapplyleave(int id, String date) {
		return applyleave.chechkinsertwhileapplying(id, date);
		
	}
	
	@Override
	public AddEmployee employeeprofile(int id) {
		
		Optional<AddEmployee> op=addstudRepo.findById(id);
		if(op.isPresent())
		{
			AddEmployee empprof= op.get();
			return empprof;
		}
		return null;
	}
	
	@Override
	public List<ApplyLeave> myleaves(int id) {
	    // Assuming applyleaveRepo is the repository for ApplyLeave entities
	    Optional<List<ApplyLeave>> op = Optional.ofNullable(applyleave.getalldata(id));
	    if (op.isPresent()) {
	        return op.get();
	    }
	    return Collections.emptyList(); // Return an empty list if no leaves found for the employee
	}
             
}
