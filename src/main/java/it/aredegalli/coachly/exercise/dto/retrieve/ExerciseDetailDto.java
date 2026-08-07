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
    private UUID createdBy;
    private boolean personal;
    private Map<String, String> nameI18n;
    private Map<String, String> descriptionI18n;
    private Map<String, String> tipsI18n;
    private String difficultyLevel;
    private String mechanicsType;
    private String forceType;
    private boolean isUnilateral;
    private boolean isBodyweight;
    private List<VariantDto> variants;
    private List<MediaDto> media;
    private List<CategoryNodeDto> categories;
    private List<SafetyDto> safety;
    private List<MuscleAssociationDto> muscles;
    private List<EquipmentAssociationDto> equipments;
    private List<TagDto> tags;
    private BiomechanicsDto biomechanics;

    /**
     * Where the external load actually peaks along the range of motion, and
     * what causes it.
     *
     * <p>{@code resistanceCurve} is {@code ascending} when the exercise is
     * hardest at the start of the concentric (stretched position) and
     * {@code descending} when it is hardest at the end (shortened position);
     * {@code peakTorqueRomPct} carries the same information numerically and
     * should be preferred when drawing charts.
     *
     * <p>{@code dataConfidence} is never {@code measured} for generated rows:
     * clients must not present {@code estimated} values as experimental fact.
     */
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class BiomechanicsDto {
        private String resistanceSource;
        private String resistanceCurve;
        private Integer peakTorqueRomPct;
        private String momentArmProfile;
        private Integer momentArmPeakRomPct;
        private String stabilityDemand;
        private String axialLoad;
        private Integer sfrRating;
        private Map<String, String> jointPositionBias;
        private List<StrengthCurvePointDto> strengthCurvePoints;
        private String dataConfidence;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class StrengthCurvePointDto {
        /** 0 = target muscle fully lengthened, 100 = fully shortened. */
        private Double romPct;
        /** External torque at that point, scaled so the curve peak is 100. */
        private Integer relativeLoad;
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
    public static class MuscleAssociationDto {
        private NamedResourceDto muscle;
        private Integer activationPercentage;
        /** lengthened / mid_range / shortened, relative to THIS muscle. */
        private String lengthBias;
        private Integer romStretchPct;
        private Integer romContractPct;
        /**
         * Residual external load at maximum muscle length: distinguishes an
         * exercise that merely reaches the stretch from one that loads it.
         */
        private Integer tensionAtStretch;
        private Integer tensionAtContraction;
        private boolean activeInsufficiency;
        private boolean passiveInsufficiency;
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
