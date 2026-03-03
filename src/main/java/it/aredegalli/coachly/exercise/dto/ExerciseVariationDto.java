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
public class ExerciseVariationDto {
    private UUID baseExerciseId;
    private UUID variantExerciseId;
    private String variationType;
    private Integer difficultyDelta;
}
