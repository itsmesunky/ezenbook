package com.ezenbook.books.mapper;

import com.ezenbook.books.vo.BooksReplyVO;

public interface BooksReplyMapper {
	
	// 댓글 작성
	public int registReply(BooksReplyVO reply) throws Exception;
	
	// 댓글 삭제
	public int deleteReply(BooksReplyVO reply) throws Exception;
}