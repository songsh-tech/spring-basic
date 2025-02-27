package example.com.basic.service;

import org.springframework.http.ResponseEntity;

public interface BasicService {
  
  ResponseEntity<String> getService();

}