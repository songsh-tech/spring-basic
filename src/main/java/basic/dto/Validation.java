package basic.dto;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// client request body 데이터 유효성 검사
// - spring-boot-starter-validation 의존성 사용
// - 스프링 프레임워크에서 제공하는 유효성 검사 인터페이스 라이브러리
// - 클라이언트가 서버로 데이터를 전송할 때 유효한 데이터일 때만 서버에 데이터를 전송할 수 있도록 도움을 줌
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Validation {
  
  // @NotNull: null을 허용하지 않음
  @NotNull
  private String notNull;

  // 기본형 데이터타입은 @NotNull 필수 지정 못함
  // Wrapper 타입으로 지정해줘야 함
  @NotNull
  private Integer intNotNull;

  // @NotEmpty: 문자열에서 null과 빈문자열을 허용하지 않음
  @NotEmpty
  private String notEmpty;

  // Range(min=?, max=?): 정수의 최소 최대를 검사할 수 있음
  @Range(min=5, max=15)
  private Integer range;

  // @Pattern(regexp=정규식): 정규식을 이용해서 문자열의 패턴을 검사할 수 있음
}
