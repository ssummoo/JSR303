package kr.co.softsoldesk.beans;


import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DataBean {

	
	@AssertTrue
	private boolean data1;
	
	@AssertFalse
	private boolean data2;
	
	@Max(100)
	@Min(10)
	private String data3;
	
	@DecimalMax(value="100" , inclusive=false)
	@DecimalMin(value="10", inclusive=false)
	private String data4;
	
	@Null
	private String data5;
	
	@NotNull
	private String data6;
	
	@Digits(integer = 3, fraction = 3)  //정수 3자리 소수점아래 3자리
	private String data7;
	
	@Size(min=3, max=10)
	private String data8;
	
	@Pattern(regexp = "[a-zA-Z]")
	private String data9;
	
	@Pattern(regexp=".+@.+\\.[a-z]+")
	private String data10;
	
	@Pattern(regexp="^[0-9]+[0-9a-zA-Z]*$")
	private String data11;
	
	
	
	public DataBean() {
		this.data1=true;
		this.data2=false;
		this.data3="50";
		this.data4="50";
		this.data5=null;
		this.data6="check2";
		this.data7="111.111";
		this.data8="에코프로";
		this.data9="aaZZ";
		this.data10="asdf@asdf.asdf";
		this.data11="1dfDfva";
	}
}