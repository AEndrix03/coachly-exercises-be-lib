package it.aredegalli.coachly.exercise.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EquipmentDto {
    private UUID id;
    private String code;
    private String category;
    private String translations;
}
