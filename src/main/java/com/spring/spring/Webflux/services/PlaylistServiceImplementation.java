package com.spring.spring.Webflux.services;

import com.spring.spring.Webflux.documents.Playlist;
import com.spring.spring.Webflux.repositories.PlaylistRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlaylistServiceImplementation implements PlaylistService{

    private final PlaylistRepository playlistRepository;

    public PlaylistServiceImplementation(PlaylistRepository playlistRepository) {
        this.playlistRepository = playlistRepository;
    }

    @Override
    public Flux<Playlist> findAll() {
        return this.playlistRepository.findAll();
    }

    @Override
    public Mono<Playlist> findById(String id) {
        return this.playlistRepository.findById(id);
    }

    @Override
    public Mono<Playlist> save(Playlist playlist) {
        return this.playlistRepository.save(playlist);
    }
}
