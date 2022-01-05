package com.tjoeun.animal.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Member {
	 private String member_id;
	 private String member_pw;
	 private String member_name;
	 private String member_dob;
	 private char member_gender;
	 private String member_phone;
	 private String member_address;
	 private Date inst_dtm;
	 private Date updt_dtm;
	 private Date del_dtm;
	 private char admin_yn;
	 private String email;
	 private int grade_cd;
}
