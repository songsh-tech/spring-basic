package example.com.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.com.basic.entity.SampleTable2Entity;

@Repository
public interface SampleTable2Repository 
extends JpaRepository<SampleTable2Entity, Integer> {
  
}
