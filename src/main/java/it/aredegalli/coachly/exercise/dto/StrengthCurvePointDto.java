package it.aredegalli.coachly.exercise.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * One sample of the resistance profile of an exercise.
 *
 * <p>{@code romPct} is normalised so that 0 is the target muscle at its maximum
 * length and 100 is the muscle fully shortened. {@code relativeLoad} is the
 * external torque at that point, scaled so the peak of the curve is 100.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StrengthCurvePointDto {
    private Double romPct;
    private Integer relativeLoad;
}
