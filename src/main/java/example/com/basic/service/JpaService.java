package example.com.basic.service;

import org.springframework.http.ResponseEntity;

public interface JpaService {
  ResponseEntity<String> createSampleTable1();
}