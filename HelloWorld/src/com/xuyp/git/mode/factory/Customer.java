package com.xuyp.git.mode.factory;
/*
 * File Name: Customer.java
 * Created by xuyp on 2017年4月24日 下午5:07:43.
 * Copyright:Copyright © 1985-2017 xuyp Inc.All right reserved.
 */
/**
 * 客户类
 * @author xuyp
 * @date 2017年4月24日 下午5:07:49
 * @version v1.0
 */
public class Customer {
	
	public static void main(String[] args) {
		BmwFactort factory = new BmwFactort();
		factory.createBmw("510");
		factory.createBmw("510i");
	}
}
