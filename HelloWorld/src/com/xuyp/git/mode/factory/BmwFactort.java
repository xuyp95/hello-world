package com.xuyp.git.mode.factory;
/*
 * File Name: BmwFactort.java
 * Created by xuyp on 2017年4月24日 下午5:04:30.
 * Copyright:Copyright © 1985-2017 xuyp Inc.All right reserved.
 */
/**
 * 工厂类
 * @author xuyp
 * @date 2017年4月24日 下午5:08:02
 * @version v1.0
 */
public class BmwFactort {
	
	public BMW createBmw(String type) {
		switch (type) {
		case "510":
			return new BMW510();
		case "510i":
			return new BMW510i();
		default:
			break;
		}
		return null;
	}
}
