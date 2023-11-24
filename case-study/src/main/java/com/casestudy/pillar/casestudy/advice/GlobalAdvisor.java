package com.casestudy.pillar.casestudy.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.casestudy.pillar.casestudy.CustomException.UnableToGenerateDataException;

@RestControllerAdvice
public class GlobalAdvisor {

	@ExceptionHandler(UnableToGenerateDataException.class)
	@ResponseBody
	public ResponseEntity<Map<String, String>> dataGenerationExceptionHandler(UnableToGenerateDataException ex) {
		Map<String, String> mp = new HashMap<String, String>();
		mp.put("message", "Exception Occured");
		mp.put("object type",ex.objectType );
		//mp.put(null, null)
		return new ResponseEntity<Map<String, String>>(mp, HttpStatus.OK);

	}
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public ResponseEntity<Map<String, String>> dataGenerationExceptionHandler(RuntimeException ex) {
		Map<String, String> mp = new HashMap<String, String>();
		mp.put("message", "Exception Occured");
		mp.put("object type",ex.getMessage() );
		//mp.put(null, null)
		return new ResponseEntity<Map<String, String>>(mp, HttpStatus.OK);

	}
}
