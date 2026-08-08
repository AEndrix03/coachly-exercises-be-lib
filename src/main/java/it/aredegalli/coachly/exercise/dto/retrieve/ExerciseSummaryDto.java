package it.aredegalli.coachly.exercise.dto.retrieve;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseSummaryDto {
    private UUID id;
    private String code;
    private Map<String, String> nameI18n;
    private Map<String, String> descriptionI18n;
    private Map<String, String> tipsI18n;
    private String exerciseKind;
    private String technicalDemand;
    private String jointClass;
    private String kineticChain;
    private boolean isUnilateral;
    private boolean isBodyweight;
}
