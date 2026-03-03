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
public class ExerciseEquipmentDto {
    private UUID exerciseId;
    private UUID equipmentId;
    private boolean required;
    private boolean primary;
    private int quantityNeeded;
}
