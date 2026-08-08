package it.aredegalli.coachly.exercise.dto;

import it.aredegalli.coachly.exercise.enums.CatalogStatus;
import it.aredegalli.coachly.exercise.enums.ExerciseKind;
import it.aredegalli.coachly.exercise.enums.JointClass;
import it.aredegalli.coachly.exercise.enums.SpotterPolicy;
import it.aredegalli.coachly.exercise.enums.TechnicalDemand;
import it.aredegalli.coachly.exercise.enums.Visibility;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseDto {
    private UUID id;
    private String code;
    private String name;
    private UUID familyId;
    private ExerciseKind exerciseKind;
    private TechnicalDemand technicalDemand;
    private JointClass jointClass;
    private boolean unilateral;
    private boolean bodyweight;
    private SpotterPolicy spotterPolicy;
    private CatalogStatus catalogStatus;
    private UUID ownerUserId;
    private Visibility visibility;
    private String translations;
}
