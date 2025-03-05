package example.com.basic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
  
}