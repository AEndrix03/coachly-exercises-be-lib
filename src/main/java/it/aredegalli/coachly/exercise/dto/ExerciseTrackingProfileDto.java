package it.aredegalli.coachly.exercise.dto;

import it.aredegalli.coachly.exercise.enums.ComparisonScope;
import it.aredegalli.coachly.exercise.enums.ConfidenceLevel;
import it.aredegalli.coachly.exercise.enums.EvidenceBasis;
import it.aredegalli.coachly.exercise.enums.LoadInputMode;
import it.aredegalli.coachly.exercise.enums.SideMode;
import it.aredegalli.coachly.exercise.enums.TrackingType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseTrackingProfileDto {
    private UUID exerciseId;
    private TrackingType trackingType;
    /** PER_IMPLEMENT means a single implement's load: 32 kg dumbbells log 32. */
    private LoadInputMode loadInputMode;
    private SideMode sideMode;
    private ComparisonScope comparisonScope;
    private EvidenceBasis evidenceBasis;
    private ConfidenceLevel confidence;
}
