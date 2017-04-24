package com.xuyp.git.mode.abstractFactory.impl;

import com.xuyp.git.mode.abstractFactory.IAbstractFactory;
import com.xuyp.git.mode.abstractFactory.IAircondition;
import com.xuyp.git.mode.abstractFactory.IEngine;

public class FactoryBMW321 implements IAbstractFactory {

	@Override
	public IEngine createEngine() {
		return new EngineA();
	}

	@Override
	public IAircondition createAircondition() {
		return new AirconditionA();
	}
}
