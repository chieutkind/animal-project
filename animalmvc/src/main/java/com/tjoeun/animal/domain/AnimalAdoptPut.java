package com.tjoeun.animal.domain;

import java.util.Date;

import lombok.Data;

@Data
public class AnimalAdoptPut {
	private int put_num;
	private String put_title;
	private String put_content;
	private int put_count;
	private Date put_date;
	private Date inst_dtm;
	private Date updt_dtm;
	private Date del_dtm;
	private String put_writer;
}
