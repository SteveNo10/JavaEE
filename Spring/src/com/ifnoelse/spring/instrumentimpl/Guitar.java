package com.ifnoelse.spring.instrumentimpl;

import org.springframework.stereotype.Component;

import com.ifnoelse.spring.iinstrument.IInstrument;

@Component
public class Guitar implements IInstrument {

	@Override
	public void echo() {
		System.out.println("Guitar echo");
	}

}
