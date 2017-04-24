package com.xuyp.git.mode.factory.impl;

import com.xuyp.git.mode.factory.IFactory;

/*
 * File Name: Factory510i.java
 * Created by xuyp on 2017年4月24日 下午5:54:59.
 * Copyright:Copyright © 1985-2017 xuyp Inc.All right reserved.
 */
public class Factory510i implements IFactory {

	@Override
	public BMW createBMW() {
		return new BMW510i();
	}

}
