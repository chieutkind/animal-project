package com.tjoeun.animal.domain;

import java.util.Date;

import lombok.Data;

@Data
public class AnimalAdoptReview {
	private int review_num;
	private String review_title;
	private String review_file1;
	private String review_file2;
	private int review_count;
	private Date inst_dtm;
	private Date updt_dtm;
	private Date del_dtm;
	private String review_writer;
}
