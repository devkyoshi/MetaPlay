package com.metaplay.backend.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class GameRequestDTO {
    private String title;
    private String category;
}
