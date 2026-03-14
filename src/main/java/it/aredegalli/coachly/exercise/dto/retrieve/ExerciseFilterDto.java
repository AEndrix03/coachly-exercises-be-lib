package it.aredegalli.coachly.exercise.dto.retrieve;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseFilterDto {
    private String textFilter;
    private String langFilter;
    private String difficultyLevel;
    private String mechanicsType;
    private String forceType;
    private Boolean isUnilateral;
    private Boolean isBodyweight;
    private List<String> categoryIds;
    private List<String> muscleIds;
}
