package com.ezenbook.books.vo;

import java.util.Date;
import com.ezenbook.books.vo.BooksReplyVO;
import lombok.Data;

@Data
public class BooksReplyVO {
	private long no, repNum;
	private String id, repCon;
	private Date repDate;
}