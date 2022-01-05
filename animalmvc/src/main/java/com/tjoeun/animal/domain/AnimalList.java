package com.tjoeun.animal.domain;

import java.util.Date;

import lombok.Data;

@Data
public class AnimalList {
	private int list_num;
	private String list_title;
	private String list_content;
	private String list_file;
	private int list_count;
	private Date list_date;
	private Date inst_dtm;
	private Date updt_dtm;
	private Date del_dtm;
	private String list_writer;
}
