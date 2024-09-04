package com.klef.jfsd.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.Model.ApplyLeave;
import com.klef.jfsd.Model.AddEmployee;
import com.klef.jfsd.Model.AdminRegistration;
import com.klef.jfsd.Service.AdminService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class ClientController {
	
	@Autowired
	private AdminService  adminservice;
	
	@GetMapping("/")
	public ModelAndView hello() {
		ModelAndView mv =new ModelAndView();
		mv.setViewName("Navbar");
		return mv;
	}
	
	@GetMapping("AdminRegister")
	public ModelAndView Admin_Registration() {
		ModelAndView mv =new ModelAndView();
		mv.setViewName("AdminRegistration");
		return mv;
	}
	
	@GetMapping("AdminLogin")
	public ModelAndView Admin_Login() {
		ModelAndView mv =new ModelAndView();
		mv.setViewName("Admin_Login");
		return mv;
	}
	
	@GetMapping("EmpLogin")
	public ModelAndView Emp_Login() {
		ModelAndView mv =new ModelAndView();
		mv.setViewName("Emp_Login");
		return mv;
	}
	
	@GetMapping("empcontact")
	public ModelAndView Emp_Contact() {
		ModelAndView mv = new ModelAndView("Emp_Contact");
		return mv;
	}
	
	@GetMapping("addemp")
	public ModelAndView AddEmployee() {
		ModelAndView mv = new ModelAndView("AddEmployee");
		return mv;
	}
	
	@GetMapping("LeaveApp")
	public ModelAndView ApplyLeave() {
		ModelAndView mv =new ModelAndView("LeaveApp");
		return mv;
	}
	
	@GetMapping("admindash")
	public ModelAndView AdminDash() {
		ModelAndView mv = new ModelAndView("Admin_Dashboard");
		return mv;
	}
	
	@GetMapping("empdash")
	public ModelAndView EmpDash() {
		ModelAndView mv = new ModelAndView("Emp_Dashboard");
		return mv;
	}
	
	@GetMapping("myleaves")
	public ModelAndView Myleaves(HttpServletRequest request) {
		HttpSession session = request.getSession();
		int id=(int) session.getAttribute("sid");
		ModelAndView mv = new ModelAndView("Emp_Viewleaves");
		List<ApplyLeave> myleaves = adminservice.myleaves(id);
		mv.addObject("mylea", myleaves);
		return mv;
	}
	
	@GetMapping("empprofile")
	public ModelAndView EmpProfile(HttpServletRequest request) {
		HttpSession session = request.getSession();
		int id=(int) session.getAttribute("sid");
		ModelAndView mv = new ModelAndView("Emp_Profile");
		AddEmployee empprof =adminservice.employeeprofile(id);
		mv.addObject("emppro", empprof);
		return mv;
	}
	
	@GetMapping("adminlogin")
	public ModelAndView checkadminlogin(HttpServletRequest request) 
	{
		ModelAndView mv=new ModelAndView();
		String username=request.getParameter("admin_username");
		String password=request.getParameter("admin_password");
		AdminRegistration ar =adminservice.checkLogin(username, password);
		String msg="Invalid Credentials";
		if(ar!=null) {
			mv.setViewName("Admin_Navbar");
		}
		else {
			mv.setViewName("Admin_Login");
			mv.addObject("msg", msg);
		}
		return mv;
	}
	
	@GetMapping("adminLeaveHis")
	public ModelAndView viewleaves()
	{
		ModelAndView mv =new ModelAndView("Admin_Viewleaves");
		List<ApplyLeave> list = adminservice.leavehistory();
		mv.addObject("list", list);
		return mv;
	}
	@GetMapping("stdlogin")
	public ModelAndView checkStdLogin(HttpServletRequest request) 
	{
		ModelAndView mv =new ModelAndView();
		String username=request.getParameter("employee_username");
		String password=request.getParameter("employee_password");
		AddEmployee addstud = adminservice.checkStdLogin(username, password);
		String msg="Invalid Credentials";
		if(addstud!=null) {
			
			HttpSession session=request.getSession();
			session.setAttribute("sid", addstud.getId());
			mv.setViewName("Emp_Navbar");
		}
		else {
			mv.setViewName("Emp_Login");
			mv.addObject("msg", msg);
		}
		return mv;
	}
	
	@PostMapping("addadmin")
	public ModelAndView addadmin(HttpServletRequest request) 
	{
		ModelAndView mv=new ModelAndView("Admin_Login");
		String fullname=request.getParameter("admin_fullname");
		String email=request.getParameter("admin_email");
		String username=request.getParameter("admin_username");
		String password=request.getParameter("admin_password");
		String confirmpassword=request.getParameter("confirm_password");
		String contact=request.getParameter("admin_phone");
		String address=request.getParameter("admin_address");
		
		AdminRegistration ar=new AdminRegistration();
		ar.setFullname(fullname);
		ar.setEmail(email);
		ar.setUsername(username);
		ar.setPassword(password);
		ar.setConfirmpassword(confirmpassword);
		ar.setContact(contact);
		ar.setAddress(address);
		String str=adminservice.RegisterAdmin(ar);
		mv.addObject("msg", str);
		return mv;
		
	}
	
	@PostMapping("addemployee")
	public ModelAndView addstudent(HttpServletRequest request) 
	{
		ModelAndView mv=new ModelAndView("AddEmployee");
		String id=request.getParameter("student_id");
		int sid=Integer.parseInt(id);
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String dob=request.getParameter("dob");
		String gender=request.getParameter("gender");
		String department=request.getParameter("department");
		String course=request.getParameter("course");
		double grade=Double.parseDouble(request.getParameter("grade"));
		String contact=request.getParameter("contact");
		
		AddEmployee addstud=new AddEmployee();
		addstud.setId(sid);
		addstud.setName(name);
		addstud.setEmail(email);
		addstud.setDob(dob);
		addstud.setGender(gender);
		addstud.setDepartment(department);
		addstud.setCourse(course);
		addstud.setGrade(grade);
		addstud.setContact(contact);
		String str=adminservice.AddEmployee(addstud);
		mv.addObject("msg", str);
		return mv;
	}
	
	@PostMapping("applyleave")
	public ModelAndView applyLeave(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView("LeaveApp");
		String id=request.getParameter("student_id");
		int sid=Integer.parseInt(id);
		String name=request.getParameter("student_name");
		String department=request.getParameter("department");
		String LType=request.getParameter("leave_type");
		String Sdate=request.getParameter("start_date");
		String Edate=request.getParameter("end_date");
		String reason=request.getParameter("reason");
		
		ApplyLeave apl=new ApplyLeave();
		apl.setId(sid);
		apl.setName(name);
		apl.setDepartment(department);
		apl.setLType(LType);
		apl.setSdate(Sdate);
		apl.setEdate(Edate);
		apl.setReason(reason);
		apl.setApplystatus("Pending");
		
		HttpSession session=request.getSession();
		session.setAttribute("sid", apl.getId());
		
		int check = adminservice.checkapplyleave(sid, Sdate);
		
		if(check>0) {
			mv.addObject("appliedmes", "applied Already");
		}else {
		String str=adminservice.leaveapp(apl);
		mv.addObject("msg", str);
		}
		return mv;
	}
	
	
	@GetMapping("acceptorrejectleave")
	public ModelAndView acceptorrejectleave(@RequestParam("id") int id, @RequestParam("date")String date,@RequestParam("status")String status)
	{
		int n =adminservice.acceptleave(id, date, status);
		ModelAndView mv =new ModelAndView("Admin_Viewleaves");
		List<ApplyLeave> list = adminservice.leavehistory();
		if(n>0) {
			mv.addObject("mess", "updated Sucessfully");
		}
		else {
			mv.addObject("mess", "Failed to Update");			
		}
		mv.addObject("list", list);
		return mv;
	}
	
	
}