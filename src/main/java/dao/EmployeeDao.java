package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Company;
import dto.Employee;

public class EmployeeDao
{

	public EntityManager getEntityManager()
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
		EntityManager em=emf.createEntityManager();
		return em;
	}
	
public void saveEmployee(int id,Employee employee)
{
	EntityManager em=getEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Company dbCompany=em.find(Company.class,id);
	
	if(dbCompany!=null)
	{
		et.begin();
		em.persist(employee);
		List<Employee>employee1=dbCompany.getEmployee();
		employee1.add(employee);
		dbCompany.setEmployee(employee1);
		et.commit();
	}
	
	}
	


public void updateEmployee(int id,Employee employee)
{
EntityManager em=getEntityManager();
EntityTransaction et=em.getTransaction();

Employee dbEmployee=em.find(Employee.class ,id);

if(dbEmployee!=null)
{
et.begin();

employee.setId(id);
em.merge(employee);
et.commit();
}
else 
{
System.out.println("sorry id is not present");	
}
}


public void findEmployee(int id)
{
EntityManager em=getEntityManager();
Employee dbEmployee=em.find(Employee.class,id);
if(dbEmployee!=null)
{
System.out.println(dbEmployee);	
}
else 
{
	
System.out.println("orry id is not be present");

}
}

public void deleteEmployee(int id)
{
EntityManager em=getEntityManager();
Employee dbEmployee=em.find(Employee.class,id);
if(dbEmployee!=null)
{
EntityTransaction et=em.getTransaction();
et.begin();
em.remove(dbEmployee);
et.commit();
}
else 
{
System.out.println("orry id is  not present");	
}
}



}



