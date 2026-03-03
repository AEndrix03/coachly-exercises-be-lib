package it.aredegalli.coachly.exercise.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MuscleDto {
    private UUID id;
    private String code;
    private String groupCode;
    private String translations;
}
