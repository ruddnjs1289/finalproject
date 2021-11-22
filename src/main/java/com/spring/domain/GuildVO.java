package com.spring.domain;

import java.util.Date;

public class GuildVO {
	
	/*`Bno` INT(11) NOT NULL AUTO_INCREMENT COMMENT '고유번호',
	`Title` VARCHAR(50) NULL DEFAULT NULL COMMENT '제목',
	`Content` VARCHAR(50) NULL DEFAULT NULL COMMENT '제목',
	`Writer` VARCHAR(50) NULL DEFAULT NULL COMMENT '글쓴이=member.Nickname',
	`regDate` DATE NULL DEFAULT NULL COMMENT '날짜',
	`Server` VARCHAR(50) NULL DEFAULT NULL COMMENT '서버이름',
	`Cnt` VARCHAR(50) NULL DEFAULT NULL COMMENT '조회수',
	PRIMARY KEY (`Bno`)
*/
	
	private int Bno;
	private String Title;
	private String Content;
	private String Writer;
	private Date regDate;
	private String Server;
	private int Cnt;
	public int getBno() {
		return Bno;
	}
	public void setBno(int bno) {
		Bno = bno;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getWriter() {
		return Writer;
	}
	public void setWriter(String writer) {
		Writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getServer() {
		return Server;
	}
	public void setServer(String server) {
		Server = server;
	}
	public int getCnt() {
		return Cnt;
	}
	public void setCnt(int cnt) {
		Cnt = cnt;
	}
	
	public GuildVO(int bno, String title, String content, String writer, Date regDate, String server, int cnt) {
		super();
		Bno = bno;
		Title = title;
		Content = content;
		Writer = writer;
		this.regDate = regDate;
		Server = server;
		Cnt = cnt;
	}
	
	
	
	
	
	
}
