package dev.demoassist.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.demoassist.model.KnowledgeBase;

@Repository
public interface KnowledgeBaseRepository extends MongoRepository<KnowledgeBase, String> {

}
