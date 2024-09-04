package com.klef.jfsd.Service;

import com.klef.jfsd.Model.AdminRegistration;
import com.klef.jfsd.Model.ApplyLeave;

import java.util.List;

import com.klef.jfsd.Model.AddEmployee;

public interface AdminService {
   public String RegisterAdmin(AdminRegistration ar);
   public AdminRegistration checkLogin(String username,String pwd);
   public String AddEmployee(AddEmployee addstud);
   public AddEmployee checkStdLogin(String username,String pwd);
   public String leaveapp(ApplyLeave apl);
   public List<ApplyLeave> leavehistory();
   public int acceptleave(int id,String date, String status);
   public int checkapplyleave(int id, String date);
   public AddEmployee employeeprofile(int id);
   public List<ApplyLeave> myleaves(int id);
   
}
