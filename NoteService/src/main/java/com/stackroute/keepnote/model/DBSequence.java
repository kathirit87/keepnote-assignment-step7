package com.stackroute.keepnote.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DBSequence {
	
	@Id
	private String id;
	private Long seq;
	public DBSequence() {
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getSeq() {
		return seq;
	}
	public void setSeq(Long seq) {
		this.seq = seq;
	}
	@Override
	public String toString() {
		return "DBSequence [id=" + id + ", seq=" + seq + "]";
	}
	

}
