package net.gnsmk;

import java.io.*;
import java.util.*;

import com.opencsv.*;
import com.opencsv.bean.*;

public class CSVToBean {

	public List<Employee> getList(){
		CSVReader reader = null;

		try{
			reader = new CSVReader(new FileReader("D://xampp//htdocs//Manoj//filesharing//javaTraining//Maven Trails//DdDb//users.csv"), ',');
		}catch(Exception e){
			e.printStackTrace();
		}

		ColumnPositionMappingStrategy<Employee> beanStrategy = new ColumnPositionMappingStrategy<Employee>();
		beanStrategy.setType(Employee.class);
		beanStrategy.setColumnMapping(new String[] {"name","age","phone"});
		
		CsvToBean<Employee> csvToBean = new CsvToBean<Employee>();
		
		List<Employee> emps = csvToBean.parse(beanStrategy, reader);
		
		return emps;
	}
}