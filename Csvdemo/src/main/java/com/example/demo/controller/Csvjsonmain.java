package com.example.demo.controller;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper; 
@Service
public class Csvjsonmain{
	public String csvToJson() {
	String jsonResult=null;
	try {
		FileReader file_reader=new FileReader("C:\\Users\\SURYA\\Desktop\\java exercises\\employee.csv");
			BufferedReader in = new BufferedReader(file_reader);
			int i=0;
	    HashMap<Integer,ArrayList<String>> data=new HashMap<Integer,ArrayList<String>>();
	    String s=null;
	    while((s=in.readLine())!=null) {
	    	String lines[] = s.split(",");
	    	System.out.println(lines);
	    	ArrayList<String> array=new ArrayList<String>();
	    	array.add(lines[0]);
	    	array.add(lines[1]);
	    	array.add(lines[2]);
	    	data.put(i,array);
	    	i++;
	    }
	    ObjectMapper mapper = new ObjectMapper();
	    
	    System.out.println(data);
	     jsonResult = mapper.writerWithDefaultPrettyPrinter()
	    		  .writeValueAsString(data);
	}
	catch(Exception e) {
		
	}
	System.out.println(jsonResult);
	return jsonResult;
	}
	
}

