package com.metaplay.backend.controllers;


import com.metaplay.backend.dto.GameRequestDTO;
import com.metaplay.backend.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    GameService gameService;

    @PostMapping("/add")
    public ResponseEntity<Boolean> addGame(@RequestBody GameRequestDTO gameRequestDTO) {
        boolean isSaved = gameService.addNewGame(gameRequestDTO);
        if(!isSaved) {
            return ResponseEntity.badRequest().body(false);
        }
        return ResponseEntity.ok(true);
    }

    @PostMapping("/update/{gameId}")
    public ResponseEntity<Boolean> updateGame(@RequestBody GameRequestDTO gameRequestDTO, @PathVariable Long gameId) {
        boolean isUpdated = gameService.updateGame(gameId, gameRequestDTO);
        if(!isUpdated) {
            return ResponseEntity.badRequest().body(false);
        }
        return ResponseEntity.ok(true);
    }


}
