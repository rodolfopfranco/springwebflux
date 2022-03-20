package com.spring.spring.Webflux.repositories;


import com.spring.spring.Webflux.documents.Playlist;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

//Reactive Repository for Mongo DB:
@Repository
public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String> {
}
