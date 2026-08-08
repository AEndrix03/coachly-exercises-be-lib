package it.aredegalli.coachly.exercise.enums;

/**
 * Clinical definition: CLOSED when the distal segment is fixed against a
 * surface and the body moves around it (squat, push-up, pull-up); OPEN when
 * the distal segment travels freely (bench press, leg extension, curl).
 *
 * <p>Deliberately not the NSCA reading, which classifies by "multiple joints
 * against a linear resistance" and would merely restate {@link JointClass}.
 */
public enum KineticChain {
    OPEN,
    CLOSED
}
