package com.tjoeun.animal.domain;

import java.util.Date;

import lombok.Data;

@Data
public class AnimalAdoptReviewReply {
	private int review_reply_num;
	private String review_reply_content;
	private Date inst_dtm;
	private Date updt_dtm;
	private Date del_dtm;
	private int review_num;
	private String reply_writer;
}
