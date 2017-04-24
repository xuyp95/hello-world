package com.xuyp.git.mode.abstractFactory;

public interface IAbstractFactory {
	
	//制造发动机  
    public IEngine createEngine();  
    //制造空调   
    public IAircondition createAircondition(); 
}
