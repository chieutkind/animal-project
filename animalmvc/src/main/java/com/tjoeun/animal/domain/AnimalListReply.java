package com.tjoeun.animal.domain;

import java.util.Date;

import lombok.Data;

@Data
public class AnimalListReply {
	private int list_reply_num;
	private Date inst_dtm;
	private Date updt_dtm;
	private Date del_dtm;
	private int list_num;
	private String reply_writer;
}
