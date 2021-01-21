package com.telusko.springmvc.dao;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import com.telusko.springmvc.model.Alien;


@Component
public class AlienDao
{
	@Autowired
	HibernateTemplate hibernatetemplate;
	
	@Transactional
public List<Alien> getAliens()
{
	List <Alien> aliens = hibernatetemplate.loadAll(Alien.class);
	return aliens;
}
	@Transactional
	public void addAlien(Alien a)
	{
		
		int i;
		i=(Integer) hibernatetemplate.save(a);
		if(i==0)
			System.out.println("Error in add process");
	}
	
	
/*	@Transactional
	public Alien getAlien(int aid) 
	{
		Alien a= hibernatetemplate.find(queryString, values)
		return a;
	}  */
}
