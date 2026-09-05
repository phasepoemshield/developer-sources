/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.input.Input
 *  minecraft.class04995
 */
package baritone.pathing.movement;

import baritone.api.utils.input.Input;
import baritone.pathing.movement.MovementState;
import java.util.stream.Stream;
import minecraft.class04995;

public record MovementOption(Input input1, Input input2, float motionX, float motionZ) {
    private static final float SPRINT_MULTIPLIER = 1.3f;

    public static Stream<MovementOption> getOptions(float f, float f2, boolean bl) {
        return Stream.of(new MovementOption(Input.MOVE_FORWARD, bl ? f * 1.3f : f, bl ? f2 * 1.3f : f2), new MovementOption(Input.MOVE_BACK, -f, -f2), new MovementOption(Input.MOVE_LEFT, -f2, f), new MovementOption(Input.MOVE_RIGHT, f2, -f), new MovementOption(Input.MOVE_FORWARD, Input.MOVE_LEFT, (bl ? f * 1.3f : f) - f2, (bl ? f2 * 1.3f : f2) + f), new MovementOption(Input.MOVE_FORWARD, Input.MOVE_RIGHT, (bl ? f * 1.3f : f) + f2, (bl ? f2 * 1.3f : f2) - f), new MovementOption(Input.MOVE_BACK, Input.MOVE_LEFT, -f - f2, -f2 + f), new MovementOption(Input.MOVE_BACK, Input.MOVE_RIGHT, -f + f2, -f2 - f));
    }

    public MovementOption(Input input, float f, float f2) {
        this(input, null, f, f2);
    }

    public void setInputs(MovementState movementState) {
        if (this.input1 != null) {
            movementState.setInput(this.input1, true);
        }
        if (this.input2 != null) {
            movementState.setInput(this.input2, true);
        }
    }

    public float distanceToSq(float f, float f2) {
        return class04995.L((float)(this.motionX() - f)) + class04995.L((float)(this.motionZ() - f2));
    }
}

