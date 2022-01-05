package com.tjoeun.animal.domain;

import java.util.Date;

import lombok.Data;

@Data
public class AnimalAdoptPutReply {
	private int put_reply_num;
	private String put_reply_content;
	private Date inst_dtm;
	private Date updt_dtm;
	private Date del_dtm;
	private int put_num;
	private String reply_writer;
}
