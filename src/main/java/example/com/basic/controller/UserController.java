package example.com.basic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import example.com.basic.dto.GetUserResponseDto;
import example.com.basic.dto.PostUserRequestDto;
import example.com.basic.service.UserService;
import example.com.basic.dto.ResponseDto;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @PostMapping("")
  public ResponseEntity<ResponseDto> postUser(
    @RequestBody @Valid PostUserRequestDto requestBody
  ) {
    ResponseEntity<ResponseDto> response  = userService.postUser(requestBody);
    return response;
  }
  
  @GetMapping("/{userId}")
  public ResponseEntity<? super GetUserResponseDto> getUser(
    @PathVariable("userId") String userId
  ) {
    ResponseEntity<? super GetUserResponseDto> response = userService.getUser(userId);
    return response;
  }

  @DeleteMapping("/{userId}")
  public ResponseEntity<ResponseDto> deleteUser(
    @PathVariable("userId") String userId
  ) {
    ResponseEntity<ResponseDto> response = userService.deletetUser(userId);
    return response;
  }

}