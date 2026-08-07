package it.aredegalli.coachly.exercise.dto;

import it.aredegalli.coachly.exercise.enums.DataConfidence;
import it.aredegalli.coachly.exercise.enums.LoadLevel;
import it.aredegalli.coachly.exercise.enums.MomentArmProfile;
import it.aredegalli.coachly.exercise.enums.ResistanceCurve;
import it.aredegalli.coachly.exercise.enums.ResistanceSource;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Biomechanical profile of an exercise: where the external load actually peaks
 * along the range of motion, and what causes it.
 *
 * <p>Convention for {@link ResistanceCurve}: {@code ASCENDING} means hardest at
 * the start of the concentric (stretched position), {@code DESCENDING} hardest
 * at the end (shortened position). {@code peakTorqueRomPct} is the numeric form
 * of the same information and should be preferred when drawing charts.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseBiomechanicsDto {
    private UUID exerciseId;
    private ResistanceSource resistanceSource;
    private ResistanceCurve resistanceCurve;
    private Integer peakTorqueRomPct;
    private MomentArmProfile momentArmProfile;
    private Integer momentArmPeakRomPct;
    private LoadLevel stabilityDemand;
    private LoadLevel axialLoad;
    private Integer sfrRating;
    private Map<String, String> jointPositionBias;
    private List<StrengthCurvePointDto> strengthCurvePoints;
    private DataConfidence dataConfidence;
    private String sourceNote;
}
