package com.ifnoelse.spring.perform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ifnoelse.spring.iidol.IPerformer;

@Component
public class Perform {
	
	@Autowired
	private IPerformer performer1;
	
	public IPerformer getPerformer1() {
		return performer1;
	}

	public void setPerformer1(IPerformer performer1) {
		this.performer1 = performer1;
	}

	public void performing() {
		performer1.perform();
	}
	
}
