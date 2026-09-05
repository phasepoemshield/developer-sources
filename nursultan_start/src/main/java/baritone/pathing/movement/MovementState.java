/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.pathing.movement.MovementStatus
 *  baritone.api.utils.input.Input
 */
package baritone.pathing.movement;

import baritone.api.pathing.movement.MovementStatus;
import baritone.api.utils.input.Input;
import baritone.pathing.movement.MovementState$MovementTarget;
import java.util.HashMap;
import java.util.Map;

public class MovementState {
    private MovementStatus status;
    private MovementState$MovementTarget target = new MovementState$MovementTarget();
    private final Map<Input, Boolean> inputState = new HashMap<Input, Boolean>();

    public MovementState$MovementTarget getTarget() {
        return this.target;
    }

    public MovementState setTarget(MovementState$MovementTarget movementState$MovementTarget) {
        this.target = movementState$MovementTarget;
        return this;
    }

    public MovementState setInput(Input input, boolean bl) {
        this.inputState.put(input, bl);
        return this;
    }

    public MovementStatus getStatus() {
        return this.status;
    }

    public MovementState setStatus(MovementStatus movementStatus) {
        this.status = movementStatus;
        return this;
    }

    public Map<Input, Boolean> getInputStates() {
        return this.inputState;
    }
}

