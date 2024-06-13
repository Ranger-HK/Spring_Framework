package lk.ijse.spring.advisor;

import lk.ijse.spring.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Created By Ravindu Prathibha
 * @created 6/12/2024 - 9:55 PM
 * @project Spring_Framework
 */
@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler {

   /* @ExceptionHandler({Exception.class})
    public String exceptionHandler(Exception e){
        return e.getMessage();
    }*/

    /*@ExceptionHandler({Exception.class})
    public ResponseUtil exceptionHandler(Exception e){
        return new ResponseUtil(500,e.getMessage(),null);
    }*/


   /*
   //1st Way
   @ExceptionHandler({Exception.class})
    public ResponseEntity exceptionHandler(Exception e){
        return new ResponseEntity (new ResponseUtil(500,e.getMessage(),null), HttpStatus.INTERNAL_SERVER_ERROR);
    }*/

    //2nd Way
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({Exception.class})
    public ResponseUtil exceptionHandler(Exception e){
        return new ResponseUtil(500,e.getMessage(),null);
    }
}
