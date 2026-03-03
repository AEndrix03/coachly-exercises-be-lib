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
public class ExerciseCategoryDto {
    private UUID exerciseId;
    private UUID categoryId;
    private boolean primary;
}
