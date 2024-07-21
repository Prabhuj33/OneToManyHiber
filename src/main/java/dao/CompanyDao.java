package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Company;

public class CompanyDao
{
public EntityManager getenEntityManager()
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
	EntityManager em=emf.createEntityManager();
	return em;
	 
}

public void saveCompany(Company company)
{
   EntityManager em=getenEntityManager();
   EntityTransaction et=em.getTransaction();
   et.begin();
   em.persist(company); 
   et.commit();
	
}

public void updateCompany(int id,Company company)
{
EntityManager em=getenEntityManager();
EntityTransaction et=em.getTransaction();
Company dbCompany=em.find(Company.class, id);
if(dbCompany!=null)
{
	et.begin();
	company.setId(id);
	company.setEmployee(dbCompany.getEmployee());
	em.merge(company);
	et.commit();
}
else 
{
	System.out.println("sorry id is not present");
	
}

}

public void findCompany(int id)
{
EntityManager em=getenEntityManager();
Company dbCompany=em.find(Company.class,id);
if(dbCompany!=null)
{
System.out.println(dbCompany);	
}
else
{
System.out.println("sorry id not presend");	
}
}


public void deleteCompany(int id)
{
	EntityManager em=getenEntityManager();
	EntityTransaction et=em.getTransaction();
	Company dbCompany=em.find(Company.class,id);
	if(dbCompany!=null)
	{
	et.begin();
	em.remove(dbCompany);
	et.commit();
	}
	else
	{
	System.out.println("sorry id not presend");	
	}
	}
	

	
	
	
}
