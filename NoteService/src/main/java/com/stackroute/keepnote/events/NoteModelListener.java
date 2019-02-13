/*package com.stackroute.keepnote.events;

import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;

import com.stackroute.keepnote.model.NoteUser;
import com.stackroute.keepnote.service.DBSequenceGeneratorService;

public class NoteModelListener extends AbstractMongoEventListener<NoteUser>{

	private DBSequenceGeneratorService seqGenerator;
	
	
	
	public NoteModelListener(DBSequenceGeneratorService seqGenerator) {
		this.seqGenerator = seqGenerator;
	}


	@Override
	public void onBeforeConvert(BeforeConvertEvent<NoteUser> event) {

		event.getSource().setUserId(seqGenerator.generateSeq(NoteUser.SEQ_NAME).toString());
	}
	
	

}
*/