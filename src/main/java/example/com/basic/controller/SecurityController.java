package example.com.basic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import example.com.basic.dto.SignUpRequestDto;
import example.com.basic.provider.JwtProvider;
import example.com.basic.service.SecurityService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/security")
@RequiredArgsConstructor
public class SecurityController {
  
  private final example.com.basic.service.SecurityService SecurityService;
  private final JwtProvider jwtProvider;
  
  @GetMapping("/jwt")
  public String getJwt(
    @RequestParam("name") String name
  ) {
    String jwt = jwtProvider.create(name);
    return jwt;
  }
  
  @PostMapping("/jwt")
  public String validateJwt(
    @RequestBody String jwt
  ) {
    String subject = jwtProvider.validate(jwt);
    return subject;
  }

  @PostMapping("/sign-up")
  public ResponseEntity<String> signUp(
    @RequestBody @Valid SignUpRequestDto requestBody
  ) {
    ResponseEntity<String> response = SecurityService.signUp(requestBody);
    return response;
  }
    
}