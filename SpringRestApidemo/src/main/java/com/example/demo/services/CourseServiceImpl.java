package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService{
	List<Courses> list;
	List<Courses> list1;
	public CourseServiceImpl() {
		list=new ArrayList<>();
		Courses C = new Courses(1, "Java", "Ashish");
		Courses D = new Courses(2, "SpringBoot", "Rest API");
		Courses E = new Courses(6, "Microservices", "SpringBoot-Rest API");
		list.add(C);
		list.add(D);
		list.add(E);
	}

	@Override
	public List<Courses> getCourses() {
		
		return list;
	}
	@Override
	public List<Courses> delbyid(int id)
	{
//		list1=list.stream().filter(book -> book.getCourseID() != id).collect(Collectors.toList());
		list1=new ArrayList<>();
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i).getCourseID() != id)
			{
				list1.add(list.get(i));
			}
		}
//		Iterator<Courses> itr= list.iterator();
////		ListIterator<Courses> itr=list.listIterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next().getCourseID());
//			if (itr.next().getCourseID() != id) 
//			{
////				System.out.println(itr.next().getCourseID());
//				list1.add(itr.next());
//			}
//		}
//		System.out.println(list1);
		return list1;
	}
	@Override
	public void addData(Courses C) {
		list.add(C);
	}
}