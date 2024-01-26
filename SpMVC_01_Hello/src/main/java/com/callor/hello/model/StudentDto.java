package com.callor.hello.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class StudentDto {
	private String stNum;
	private String stName;
	private String stDept;
	private String stGrade;
	private String stTel;
	private String stAddr;
}
