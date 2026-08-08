package it.aredegalli.coachly.exercise.dto;

import it.aredegalli.coachly.exercise.enums.VariationAxis;
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
    /** WHAT differs between the two: grip, angle, equipment, rom, tempo... */
    private VariationAxis variationAxis;
}
