package com.coronavirus.springboot.coronavirustracker.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.coronavirus.springboot.coronavirustracker.models.LocationStats;
import com.coronavirus.springboot.coronavirustracker.services.CoronaVirusDataService;

@Controller
public class HomeController {
	@Autowired
	CoronaVirusDataService coronaVirusDataService;
	
	@GetMapping("/")
	public String home(Model theModel) {
		List<LocationStats> allStats=coronaVirusDataService.getAllStats();
		long totalReportedCases=allStats.stream().mapToInt(stat->stat.getLatestTotalCases()).sum();
		
		String [] dates=new String[7];
		
		Calendar cal = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		cal.add(Calendar.DATE, -7);
		for (int i = 0; i < dates.length; i++) {
			
			Date todate = cal.getTime();
			dates[i]=dateFormat.format(todate);
			cal.add(Calendar.DATE, +1);
		}
		
		theModel.addAttribute("stats",allStats);
		theModel.addAttribute("totalReportedCases",totalReportedCases);
		theModel.addAttribute("dates",dates);
		
		return "home";
	}
}
