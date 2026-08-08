package it.aredegalli.coachly.exercise.dto.retrieve;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Search surface over the V2 model. Every filter maps to something structured;
 * there is deliberately no "goal" filter, because an exercise does not have one.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseFilterDto {
    private String scope;
    private String textFilter;
    private String langFilter;

    // anatomy
    private List<String> muscleIds;
    private List<String> muscleGroupIds;
    private String involvement;

    // movement
    private List<String> movementPatternIds;
    private List<String> jointActionIds;
    private List<String> familyIds;

    /**
     * Where the target muscle should be loaded: lengthened, midrange or
     * shortened. Translates into a query on the tension profile.
     */
    private String tensionBias;

    // equipment
    private List<String> equipmentIds;
    private List<String> equipmentClasses;

    // characteristics
    private String exerciseKind;
    private String jointClass;
    private String kineticChain;
    private String technicalDemand;
    private Boolean isUnilateral;
    private Boolean isBodyweight;

    // biomechanics
    private String stabilityDemand;
    private String maxSpinalLoading;

    // tracking
    private List<String> trackingTypes;

    private List<String> categoryIds;
}
