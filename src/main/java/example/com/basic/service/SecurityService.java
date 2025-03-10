package example.com.basic.service;

import org.springframework.http.ResponseEntity;

import example.com.basic.dto.SignUpRequestDto;

public interface SecurityService {
  ResponseEntity<String> signUp(SignUpRequestDto dto);
}