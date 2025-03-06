package example.com.basic.service;

import org.springframework.http.ResponseEntity;

import example.com.basic.dto.GetUserListResponseDto;
import example.com.basic.dto.GetUserResponseDto;
import example.com.basic.dto.PatchUserRequestDto;
import example.com.basic.dto.PostUserRequestDto;
import example.com.basic.dto.ResponseDto;

public interface UserService {
  
  ResponseEntity<ResponseDto> postUser(PostUserRequestDto dto);
  ResponseEntity<? super GetUserListResponseDto> getUserList();
  ResponseEntity<? super GetUserResponseDto> getUser(String userId);
  ResponseEntity<ResponseDto> patchUser(String userId, PatchUserRequestDto dto);
  ResponseEntity<ResponseDto> deletetUser(String userId);

}