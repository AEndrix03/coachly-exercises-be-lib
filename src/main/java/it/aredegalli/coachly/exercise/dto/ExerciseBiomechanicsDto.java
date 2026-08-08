package it.aredegalli.coachly.exercise.dto;

import it.aredegalli.coachly.exercise.enums.ConfidenceLevel;
import it.aredegalli.coachly.exercise.enums.EvidenceBasis;
import it.aredegalli.coachly.exercise.enums.ExternalResistanceProfile;
import it.aredegalli.coachly.exercise.enums.LoadLevel;
import it.aredegalli.coachly.exercise.enums.ResistanceSource;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * How the exercise loads the body. The implement's resistance curve is not
 * here on purpose: it is not the same as each muscle's tension curve, and the
 * latter is what the engine uses.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseBiomechanicsDto {
    private UUID exerciseId;
    private ResistanceSource resistanceSource;
    private LoadLevel stabilityDemand;
    private LoadLevel spinalLoading;
    private ExternalResistanceProfile externalResistanceProfile;
    private EvidenceBasis evidenceBasis;
    private ConfidenceLevel confidence;
    private String methodNote;
}
