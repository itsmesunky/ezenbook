package com.ezenbook.cart.vo;

import java.util.Date;
import com.ezenbook.cart.vo.CartListVO;
import lombok.Data;

@Data
public class CartListVO {
	private long cartNum, no, cartStock;
	private String id;
	private Date addDate;
	private int num;
	private String bookName;
	private String bookPrice;
	private String fileName;
}