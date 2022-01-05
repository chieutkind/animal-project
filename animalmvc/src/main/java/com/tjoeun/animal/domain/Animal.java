package com.tjoeun.animal.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Animal {
	private String aban_dog_id;
	private String aban_dog_name;
	private int aban_dog_age;
	private String aban_dog_gender;
	private String aban_dog_date;
	private String aban_dog_location;
	private String aban_dog_guardian;
	private String aban_dog_image;
	private Date inst_dtm;
	private Date updt_dtm;
	private Date del_dtm;
	private String member_id;
	private String state_cd;
	private String type_cd;
}
