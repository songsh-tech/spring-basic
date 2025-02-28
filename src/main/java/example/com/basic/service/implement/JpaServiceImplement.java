package example.com.basic.service.implement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import example.com.basic.entity.SampleTableEntity;
import example.com.basic.repository.SampleTable1Repository;
import example.com.basic.service.JpaService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JpaServiceImplement implements JpaService {

  private final SampleTable1Repository sampleTable1Repository;

  @Override
  public ResponseEntity<String> createSampleTable1() {

    SampleTableEntity entity = new SampleTableEntity ("a", 1, false );
    
    sampleTable1Repository.save(entity);

    return ResponseEntity.status(HttpStatus.CREATED).body("성공");

  }

}