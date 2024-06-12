package lk.ijse.spring.advisor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Created By Ravindu Prathibha
 * @created 6/12/2024 - 9:55 PM
 * @project Spring_Framework
 */
@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler {

    @ExceptionHandler({Exception.class})
    public String exceptionHandler(Exception e){
        return e.getMessage();
    }
}
