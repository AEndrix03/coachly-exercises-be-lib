package it.aredegalli.coachly.exercise.dto;

import it.aredegalli.coachly.exercise.enums.InvolvementLevel;
import it.aredegalli.coachly.exercise.enums.LengthBias;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseMuscleDto {
    private UUID exerciseId;
    private UUID muscleId;
    private InvolvementLevel involvement;
    private Integer activationPercentage;

    /** Where peak tension lands relative to THIS muscle's own length. */
    private LengthBias lengthBias;
    /** Share of the muscle's available ROM reached at the stretched end. */
    private Integer romStretchPct;
    /** Share of the muscle's available ROM reached at the contracted end. */
    private Integer romContractPct;
    /**
     * Residual external load at maximum muscle length. Distinguishes an
     * exercise that merely reaches the stretch from one that loads it.
     */
    private Integer tensionAtStretch;
    private Integer tensionAtContraction;
    private Boolean activeInsufficiency;
    private Boolean passiveInsufficiency;
}
