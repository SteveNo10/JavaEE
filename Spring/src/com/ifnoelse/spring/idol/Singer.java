package com.ifnoelse.spring.idol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ifnoelse.spring.iidol.IPerformer;
import com.ifnoelse.spring.iinstrument.IInstrument;

@Component
public class Singer implements IPerformer {
	
	@Autowired
	private IInstrument instrument;
	public IInstrument getInstrument() {
		return instrument;
	}

	public void setInstrument(IInstrument instrument) {
		this.instrument = instrument;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	private String song = "GUOGE";
	
	@Override
	public void perform() {
		instrument.echo();
		System.out.println("SING " + song + " HIGHLY.");
	}

}
