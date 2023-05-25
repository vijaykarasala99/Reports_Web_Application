package com.vijayit.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.vijayit.entity.CitizenPlan;
import com.vijayit.request.SearchRequest;

public interface ReportService {

	public List<String> getPlanNames();

	public List<String> getPlanStatuses();

	public List<CitizenPlan> search(SearchRequest request);

	public boolean exportExcel(HttpServletResponse response) throws Exception;
	
	public boolean exportPdf(HttpServletResponse response) throws Exception;

}
