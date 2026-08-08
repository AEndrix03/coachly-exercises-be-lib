package it.aredegalli.coachly.exercise.dto;

import it.aredegalli.coachly.exercise.enums.ConfidenceLevel;
import it.aredegalli.coachly.exercise.enums.EvidenceBasis;
import it.aredegalli.coachly.exercise.enums.InvolvementLevel;
import it.aredegalli.coachly.exercise.enums.TensionLevel;
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

    /** Qualitative tension at the three muscle lengths. */
    private TensionLevel tensionLengthened;
    private TensionLevel tensionMidrange;
    private TensionLevel tensionShortened;

    private EvidenceBasis evidenceBasis;
    private ConfidenceLevel confidence;
}
