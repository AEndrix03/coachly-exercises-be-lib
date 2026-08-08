package it.aredegalli.coachly.exercise.dto.retrieve;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * The exercise as the catalogue knows it. Four axes, and nothing else:
 *
 * <ol>
 *   <li>what moves - movement patterns and joint actions</li>
 *   <li>what is trained - muscle involvement and tension profile</li>
 *   <li>how it is loaded - equipment, stability, spinal loading</li>
 *   <li>how it is recorded - tracking and comparison context</li>
 * </ol>
 *
 * <p>Deliberately absent: goals, scores, SFR, recommended sets or reps. Those
 * are decisions computed from context, not properties of an exercise.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseDetailDto {
    private UUID id;
    /** Stable identity key. {@code name} may change, this does not. */
    private String code;
    private UUID createdBy;
    private boolean personal;
    private Map<String, String> nameI18n;
    private Map<String, String> descriptionI18n;
    private Map<String, String> tipsI18n;
    /** Execution errors, one entry per mistake, per locale. */
    private Map<String, List<String>> commonMistakesI18n;

    private FamilyDto family;
    private String exerciseKind;
    private String technicalDemand;
    private String jointClass;
    /** open = distal segment free; closed = fixed against a surface. */
    private String kineticChain;
    private String catalogStatus;
    private boolean isUnilateral;
    private boolean isBodyweight;

    private MovementProfileDto movementProfile;
    private List<MuscleAssociationDto> muscles;
    private BiomechanicsDto biomechanics;
    private TrackingDto tracking;
    private SafetyDto safety;

    private List<EquipmentAssociationDto> equipments;
    private List<VariantDto> variants;
    private List<MediaDto> media;
    private List<CategoryDto> categories;
    private List<TagDto> tags;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class FamilyDto {
        private UUID id;
        private String code;
        private Map<String, String> nameI18n;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MovementProfileDto {
        private List<MovementPatternDto> patterns;
        private List<JointActionDto> jointActions;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MovementPatternDto {
        private UUID id;
        private String code;
        private Map<String, String> nameI18n;
        /** primary or secondary */
        private String role;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class JointActionDto {
        private UUID id;
        private String jointCode;
        private String actionCode;
        private Map<String, String> nameI18n;
        private String role;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MuscleAssociationDto {
        private NamedResourceDto muscle;
        private List<MuscleGroupDto> groups;
        /** primary, secondary or stabilizer */
        private String involvement;
        private TensionProfileDto tensionProfile;
        private String evidenceBasis;
        private String confidence;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MuscleGroupDto {
        private UUID id;
        private String code;
        private String groupType;
        private Map<String, String> nameI18n;
    }

    /**
     * Qualitative tension at three muscle lengths. {@code lengthBias} is
     * DERIVED from the three - it is not stored - so it can never disagree
     * with them.
     */
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TensionProfileDto {
        private String lengthened;
        private String midrange;
        private String shortened;
        /** lengthened / mid_range / shortened / broad, computed on read. */
        private String lengthBias;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class BiomechanicsDto {
        private String resistanceSource;
        private String stabilityDemand;
        private String spinalLoading;
        private String externalResistanceProfile;
        private String evidenceBasis;
        private String confidence;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TrackingDto {
        private String trackingType;
        /**
         * per_implement means the logged number is the load of a SINGLE
         * implement: a 32 kg dumbbell curl is logged as 32, not 64.
         */
        private String loadInputMode;
        private String sideMode;
        /**
         * How far this load may legitimately be compared: across gyms, only
         * within one machine, or bodyweight-adjusted.
         */
        private String comparisonScope;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SafetyDto {
        private String spotterPolicy;
        private Map<String, String> notesI18n;
        /** Same shape as commonMistakesI18n: one entry per note, per locale. */
        private Map<String, List<String>> notesListI18n;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class VariantDto {
        private UUID id;
        private String code;
        private Map<String, String> nameI18n;
        private Map<String, String> descriptionI18n;
        private String exerciseKind;
        private String technicalDemand;
        private String jointClass;
        private String kineticChain;
        private boolean isUnilateral;
        private boolean isBodyweight;
        /** WHAT differs from this exercise: grip, angle, equipment, rom... */
        private String variationAxis;
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
    public static class CategoryDto {
        private UUID id;
        private String code;
        private Map<String, String> nameI18n;
        private Map<String, String> descriptionI18n;
        private boolean isPrimary;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class EquipmentAssociationDto {
        private NamedResourceDto equipment;
        private String equipmentClass;
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
