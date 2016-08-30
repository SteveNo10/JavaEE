package com.ifnoelse.spring.mvc.annotation.controller;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.ifnoelse.spring.mvc.annotation.model.Person;

@Controller
@RequestMapping("/mvc")
public class MVCController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/person")
	public String toPerson(String name, int age) {
		System.out.println(name + " " + age);
		return "hello";
	}
	
	@RequestMapping("/personModel") 
	public String toPerson(Person person) {
		System.out.println(person.getName() + ":" + person.getAge());
		return "hello";
	}
	
	@RequestMapping("/date")
	public String date(Date date) {
		System.out.println(date);
		return "hello";
	}
	
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyyMMdd HH:mm:ss"), true));
	}
	
	@RequestMapping("/show")
	public String showPerson(Map<String, Object> map) {
		Person person = new Person();
		map.put("p", person);
		person.setName("bbb");
		person.setAge(20);
		return "show";
	}
	
//	@RequestMapping("/getPerson")
//	public void getPerson(String name, PrintWriter pw) {
//		pw.write("hello," + name);
//	}
//	
//	@RequestMapping("/name")
//	public String sayHello() {
//		return "name";
//	}
	
	@RequestMapping("/redirect")
	public String redirect() {
		return "redirect:hello";
	}
	
	@RequestMapping(value="/upload",method=RequestMethod.POST)
	public String upload(HttpServletRequest req) throws Exception{
	    MultipartHttpServletRequest mreq = (MultipartHttpServletRequest)req;
	    MultipartFile file = mreq.getFile("file");
	    String fileName = file.getOriginalFilename();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");        
	    FileOutputStream fos = new FileOutputStream("E:/upload/"+sdf.format(new Date())+fileName.substring(fileName.lastIndexOf('.')));
	    fos.write(file.getBytes());
	    fos.flush();
	    fos.close();
	     
	    return "hello";
	}
	
	@RequestMapping("/param")
	public String testRequestParam(@RequestParam(value="pname") String name, @RequestParam(value="page",defaultValue="50",required=false) int age) {
		System.out.println(name + ":" + age);
		return "hello";
	}
}
