/*
 * File Name: Factory.java
 * Created by xuyp on 2017年4月24日 下午5:52:33.
 * Copyright:Copyright © 1985-2017 xuyp Inc.All right reserved.
 */
package com.xuyp.git.mode.factory.impl;

import com.xuyp.git.mode.factory.IFactory;

public class Factory510 implements IFactory {

	@Override
	public BMW createBMW() {
		return new BMW510();
	}
	
	public void abcd() {
		
	}
}
