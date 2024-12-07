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

    public boolean updateGame(Long gameId, GameRequestDTO gameRequestDTO) {
        try{
            // Find the game by id
            Game game = gameRepository.findById(gameId).orElse(null);

            if(game == null) {
                log.error("Game not found with id: {}", gameId);
                return false;
            }

            // Update the game
            if(gameRequestDTO.getTitle() != null){
                log.info("Updating game title to: {}", gameRequestDTO.getTitle());
                game.setTitle(gameRequestDTO.getTitle());
            }
            if(gameRequestDTO.getCategory() != null){
                log.info("Updating game category to: {}", gameRequestDTO.getCategory());
                game.setCategory(gameRequestDTO.getCategory());
            }

            // Save the updated game to the database
            gameRepository.save(game);
            log.info("Game updated successfully with id: {}", gameId);
            return true;
        } catch (Exception e) {
            log.error("Error while updating the game: {}", e.getMessage());
           return false;
        }

    }
}
