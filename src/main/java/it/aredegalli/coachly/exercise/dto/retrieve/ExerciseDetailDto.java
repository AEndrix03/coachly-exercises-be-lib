package it.aredegalli.coachly.exercise.dto.retrieve;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseDetailDto {
    private UUID id;
    private Map<String, String> nameI18n;
    private Map<String, String> descriptionI18n;
    private Map<String, String> tipsI18n;
    private String difficultyLevel;
    private String mechanicsType;
    private String forceType;
    private boolean isUnilateral;
    private boolean isBodyweight;
    private EnvironmentDto environment;
    private List<InstructionDto> instructions;
    private MovementPatternDto movementPattern;
    private List<VariantDto> variants;
    private List<MediaDto> media;
    private List<CategoryNodeDto> categories;
    private List<SafetyDto> safety;
    private List<SafetyContraindicationDto> safetyContraindications;
    private List<MuscleAssociationDto> muscles;
    private List<EquipmentAssociationDto> equipments;
    private List<TagDto> tags;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class EnvironmentDto {
        private UUID id;
        private Boolean canDoAtHome;
        private Boolean canDoInGym;
        private Boolean equipmentSetupRequired;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class InstructionDto {
        private UUID id;
        private String instructionType;
        private Integer stepNumber;
        private Map<String, String> instructionTextI18n;
        private Boolean isCritical;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MovementPatternDto {
        private UUID id;
        private String movementPlane;
        private String movementPattern;
        private String powerGenerationLevel;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class VariantDto {
        private UUID id;
        private Map<String, String> nameI18n;
        private Map<String, String> descriptionI18n;
        private Map<String, String> tipsI18n;
        private String difficultyLevel;
        private String mechanicsType;
        private String forceType;
        private boolean isUnilateral;
        private boolean isBodyweight;
        private String variationType;
        private Integer difficultyDelta;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MediaDto {
        private UUID id;
        private String mediaType;
        private String mediaUrl;
        private String thumbnailUrl;
        private String mediaPurpose;
        private String viewAngle;
        private boolean isPrimary;
        private boolean isPublic;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CategoryNodeDto {
        private UUID id;
        private String code;
        private Map<String, String> nameI18n;
        private Map<String, String> descriptionI18n;
        private Integer categoryLevel;
        private boolean isPrimary;
        private List<CategoryNodeDto> children;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SafetyDto {
        private UUID id;
        private String overallRiskLevel;
        private boolean spotterRequired;
        private Map<String, String> safetyNotesI18n;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SafetyContraindicationDto {
        private UUID id;
        private String contraindicationType;
        private String conditionName;
        private Map<String, String> warningTextI18n;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MuscleAssociationDto {
        private NamedResourceDto muscle;
        private String involvementLevel;
        private NamedResourceDto primaryContractionType;
        private Integer activationPercentage;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class EquipmentAssociationDto {
        private NamedResourceDto equipment;
        private boolean isRequired;
        private boolean isPrimary;
        private Integer quantityNeeded;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TagDto {
        private UUID id;
        private String code;
        private Map<String, String> nameI18n;
        private Map<String, String> descriptionI18n;
        private String tagType;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class NamedResourceDto {
        private UUID id;
        private String code;
        private Map<String, String> nameI18n;
        private Map<String, String> descriptionI18n;
    }
}
