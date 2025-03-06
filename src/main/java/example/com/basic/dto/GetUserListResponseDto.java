package example.com.basic.dto;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import example.com.basic.entity.UserEntity;
import example.com.basic.vo.User;

import lombok.Getter;

@Getter
public class GetUserListResponseDto extends ResponseDto {

  private List<User> userList;

  private GetUserListResponseDto(List<UserEntity> userEntities) {
    super("SU", "Success.");
    this.userList = User.getList(userEntities);
  }
  
  public static ResponseEntity<GetUserListResponseDto> success(List<UserEntity>userEntities) {
    GetUserListResponseDto responseBody = new GetUserListResponseDto(userEntities);
    return ResponseEntity.status(HttpStatus.OK).body(responseBody);
  }

}