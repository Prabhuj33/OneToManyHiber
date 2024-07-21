package Controller;

import dao.CompanyDao;
import dao.EmployeeDao;
import dto.Company;
import dto.Employee;

public class CompanyEmployeeControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Company c=new Company();
//		c.setId(1);
//		c.setName("Lenovo");
//		c.setGst("*lenovo*");
//		
//		CompanyDao da=new CompanyDao();
//		da.saveCompany(c);
//		
//		
//		Employee e=new Employee();
//		e.setId(101);
//		e.setName("prabhu");
//		e.setAddress("lakno");
//		
//		EmployeeDao dao=new EmployeeDao();
//		dao.saveEmployee(1, e);
//		
//		
//		
//		Employee e1=new Employee();
//		e1.setId(102);
//		e1.setName("prabhu");
//		e1.setAddress("lakno");
//		
//		EmployeeDao dao1=new EmployeeDao();
//		dao1.saveEmployee(1, e1);
		

//		Company c=new Company();
//		c.setId(2);
//		c.setName("Hp");
//		c.setGst("*HP2993*");
//
//		Company c1=new Company();
//		c1.setId(3);
//		c1.setName("AZAUS");
//		c1.setGst("AZU2829");
//		
//		CompanyDao dao=new CompanyDao();
//		dao.saveCompany(c);
//		dao.saveCompany(c1);
		
		
		
//		Employee e=new Employee();
//		e.setId(104);
//		e.setName("Ramya");
//		e.setAddress("pune");
//		
//		
//		EmployeeDao dao1=new EmployeeDao();
//		dao1.saveEmployee(4, e);
		
//		
//		Company c=new Company();
//	    c.setId(1);
//	    c.setName("Duba");
//	    c.setGst("pojh");
//	    
//	    CompanyDao da=new CompanyDao();
//	    da.updateCompany(1, c);
//		
		
		
//		Employee e=new Employee();
//		e.setId(102);
//		e.setName("Raja");
//		e.setAddress("thanjai");
//		
//		EmployeeDao dao=new EmployeeDao();
//		dao.updateEmployee(102, e);
		
		
//		CompanyDao da=new CompanyDao();
//		da.findCompany(3);
////		
//		EmployeeDao dao=new EmployeeDao();
//		dao.findEmployee(103);
	
		
//		CompanyDao dao=new CompanyDao();
//		dao.deleteCompany(1);
//		
//		
		EmployeeDao dao=new EmployeeDao();
		dao.deleteEmployee(101);

	
	
	}

}
