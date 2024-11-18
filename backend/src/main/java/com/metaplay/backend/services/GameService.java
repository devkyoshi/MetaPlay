package com.metaplay.backend.services;

import com.metaplay.backend.dto.GameRequestDTO;
import com.metaplay.backend.models.Game;
import com.metaplay.backend.repository.GameRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public boolean addNewGame(GameRequestDTO gameRequestDTO) {

        Game game = new Game();

        try{
            game.setTitle(gameRequestDTO.getTitle());
            game.setCategory(gameRequestDTO.getCategory());

            // Save the game to the database
            gameRepository.save(game);
            return true;
        } catch (Exception e) {
            log.error("Error while saving the game: {}", e.getMessage());
            return false;
        }
    }
}
