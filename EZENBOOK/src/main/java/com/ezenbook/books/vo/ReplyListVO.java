package com.ezenbook.books.vo;

import java.util.Date;
import com.ezenbook.books.vo.ReplyListVO;
import lombok.Data;

@Data
public class ReplyListVO {
	private long no, repNum;
	private String id, repCon;
	private Date repDate;
	private String name;
}