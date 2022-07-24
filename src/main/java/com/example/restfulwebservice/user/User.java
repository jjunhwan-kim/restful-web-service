package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@ApiModel(description = "사용자 상세 정보를 위한 도메인 객체")
//@JsonIgnoreProperties({"password", "ssn"})
//@JsonFilter("UserInfo")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;

    @ApiModelProperty("사용자의 이름을 읿력해 주세요.")
    @Size(min = 2, message = "Name은 2글자 이상 입력해주세요.")
    private String name;

    @ApiModelProperty("사용자의 등록일 읿력해 주세요.")
    @Past
    private Date joinDate;

    @ApiModelProperty("사용자의 패스워드를 읿력해 주세요.")
    //@JsonIgnore
    private String password;

    @ApiModelProperty("사용자의 주민번호를 읿력해 주세요.")
    //@JsonIgnore
    private String ssn;
}
