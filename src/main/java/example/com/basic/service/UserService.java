package example.com.basic.service;

import org.springframework.http.ResponseEntity;

import example.com.basic.dto.PostUserRequestDto;
import example.com.basic.dto.ResponseDto;

public interface UserService {
  
  ResponseEntity<ResponseDto> postUser(PostUserRequestDto dto);

}