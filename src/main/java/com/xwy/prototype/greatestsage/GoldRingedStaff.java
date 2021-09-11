package com.xwy.prototype.greatestsage;

import java.io.Serializable;

/**
 * 2021年3月14日14:39:10
 */
public class GoldRingedStaff implements Serializable{

	private float height = 100; //长度
	private float diameter = 10;//直径



	/**
	 * 金箍棒长大
	 */
	public void grow(){
		this.diameter *= 2;
		this.height *= 2;
	}

	/**
	 * 金箍棒缩小
	 */
	public void shrink(){
		this.diameter /= 2;
		this.height /= 2;
	}

}