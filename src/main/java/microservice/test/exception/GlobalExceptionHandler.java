package microservice.test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import microservice.test.playLoad.ApiException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourseNotFoundException.class)
	public ResponseEntity<ApiException> handlerResouresNotFoundException(ResourseNotFoundException ex){
		
	String message	= ex.getMessage();
	ApiException response = ApiException.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();	
		
		return new ResponseEntity<ApiException>(response, HttpStatus.NOT_FOUND);
		
	}

}
