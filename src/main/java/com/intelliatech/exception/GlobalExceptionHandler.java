package com.intelliatech.exception;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import net.bytebuddy.asm.Advice.Local;

@ControllerAdvice
public class GlobalExceptionHandler  extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String massege=ex.getMessage();
		List<String>deatils=new ArrayList<>();
				deatils.add("Request Not supported");
				ApiException apiex= new ApiException(massege,deatils,status,LocalDateTime.now());
				return ResponseEntity.status(status).body(apiex);
			}

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
String massege=ex.getMessage();
List<String>deatils=new ArrayList<>();
		deatils.add("Media type Not supported");
		ApiException apiex= new ApiException(massege,deatils,status,LocalDateTime.now());
		return ResponseEntity.status(status).body(apiex);
	}

	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String massege=ex.getMessage();
		List<String>deatils=new ArrayList<>();
				deatils.add("MissingPathVariable");
				ApiException apiex= new ApiException(massege,deatils,status,LocalDateTime.now());
				return ResponseEntity.status(status).body(apiex);
			}

	@Override
	protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String massege=ex.getMessage();
		List<String>deatils=new ArrayList<>();
				deatils.add("Messing RequestParameter");
				ApiException apiex= new ApiException(massege,deatils,status,LocalDateTime.now());
				return ResponseEntity.status(status).body(apiex);
			}

	@Override
	protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String massege=ex.getMessage();
		List<String>deatils=new ArrayList<>();
				deatils.add("TypeMismatch ");
				ApiException apiex= new ApiException(massege,deatils,status,LocalDateTime.now());
				return ResponseEntity.status(status).body(apiex);
			}
	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String massege=ex.getMessage();
		List<String>deatils=new ArrayList<>();
				deatils.add("Messege not readable");
				ApiException apiex= new ApiException(massege,deatils,status,LocalDateTime.now());
				return ResponseEntity.status(status).body(apiex);
			}
	
         
	                  //CoustomezExceptionHandler
	
	
@ExceptionHandler(ItemListNotFoundException.class )
	public ResponseEntity<Object> handleItemListNotFondException(ItemListNotFoundException ex){
		String massege=ex.getMessage();
		List<String>deatils=new ArrayList<>();
				deatils.add("Item Not Found");
				ApiException apiex= new ApiException(massege,deatils,HttpStatus.NOT_FOUND,LocalDateTime.now());
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiex);
			}
	
@ExceptionHandler(ItemNotFoundEcxeption.class)
	public ResponseEntity<Object>handleItemNotFoundException(ItemNotFoundEcxeption ex){
		String massege=ex.getMessage();
		List<String>deatils=new ArrayList<>();
				deatils.add("Media type Not supported");
				ApiException apiex= new ApiException(massege,deatils,HttpStatus.BAD_REQUEST,LocalDateTime.now());
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(apiex);
			}


@ExceptionHandler(CategoryIdNotNotPoundEception.class)
public ResponseEntity<Object>handleItemNotFoundException(CategoryIdNotNotPoundEception ex){
String massege=ex.getMessage();
List<String>deatils=new ArrayList<>();
		deatils.add("Media type Not supported");
		ApiException apiex= new ApiException(massege,deatils,HttpStatus.NOT_FOUND,LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiex);
	}



@ExceptionHandler(ItemNameNotfoundException.class)
public ResponseEntity<Object>handlItemNameNotfoundException(ItemNameNotfoundException ex){
	String massege=ex.getMessage();
	List<String> deatils=new ArrayList<String>();
	deatils.add("Item Name Not Found In Item List");
	ApiException expi= new ApiException(massege, deatils, HttpStatus.NOT_FOUND,LocalDateTime.now());
 return ResponseEntity.status(HttpStatus.NOT_FOUND).body(expi);
 
}
 
 
 @ExceptionHandler(IsEmptyException.class)
 public  ResponseEntity<Object>handlIsEmptyException(IsEmptyException empty){
	 String massege=empty.getMessage();
		List<String> deatils=new ArrayList<String>();
		deatils.add("Not have any data");
		ApiException expi= new ApiException(massege, deatils, HttpStatus.NO_CONTENT,LocalDateTime.now());
	 return ResponseEntity.status(HttpStatus.NO_CONTENT).body(expi);
 }
	
 
 @ExceptionHandler(Exception.class)
	
	public ResponseEntity<Object> OtherExceptionHandler(Exception ex){
		
		String massege=ex.getMessage();
		List<String>deatils=new ArrayList<>();
				deatils.add("Other type Exception");
				//deatils.add(ex.getMessage());
				ApiException apiex= new ApiException(massege,deatils,HttpStatus.BAD_REQUEST,LocalDateTime.now());
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(apiex);
			}
	}


