package com.stackroute.keepnote.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.Objects;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;

import com.stackroute.keepnote.model.DBSequence;

@Service
public class DBSequenceGeneratorService {
	
	@Autowired
	MongoOperations mongoOperations;
	
	public DBSequenceGeneratorService(MongoOperations mongoOperations) {
		this.mongoOperations= mongoOperations;
	}

	public Long generateSeq(String seqName) {
		
		DBSequence sequence = mongoOperations.findAndModify(query(where("_id").is(seqName)), 
				new Update().inc("seq", 1), options().returnNew(true).upsert(true),
				DBSequence.class);
		
		return !Objects.isNull(sequence) ? sequence.getSeq() : 1;
		
	}

}
