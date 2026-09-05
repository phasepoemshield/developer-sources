/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.BaritoneAPI
 *  baritone.api.event.events.TickEvent
 *  baritone.api.event.events.TickEvent$Type
 *  baritone.api.utils.IInputOverrideHandler
 *  baritone.api.utils.input.Input
 *  baritone.behavior.Behavior
 *  minecraft.class04462
 *  minecraft.class04474
 *  minecraft.class05630
 */
package baritone.utils;

import baritone.Baritone;
import baritone.api.BaritoneAPI;
import baritone.api.event.events.TickEvent;
import baritone.api.utils.IInputOverrideHandler;
import baritone.api.utils.input.Input;
import baritone.behavior.Behavior;
import baritone.utils.BlockBreakHelper;
import baritone.utils.BlockPlaceHelper;
import baritone.utils.PlayerMovementInput;
import java.util.HashMap;
import java.util.Map;
import minecraft.class04462;
import minecraft.class04474;
import minecraft.class05630;

public final class InputOverrideHandler
extends Behavior
implements IInputOverrideHandler {
    private final Map<Input, Boolean> inputForceStateMap = new HashMap<Input, Boolean>();
    private final BlockBreakHelper blockBreakHelper;
    private final BlockPlaceHelper blockPlaceHelper;

    public InputOverrideHandler(Baritone baritone) {
        super(baritone);
        this.blockBreakHelper = new BlockBreakHelper(baritone.getPlayerContext());
        this.blockPlaceHelper = new BlockPlaceHelper(baritone.getPlayerContext());
    }

    public final void onTick(TickEvent tickEvent) {
        if (tickEvent.getType() == TickEvent.Type.OUT) {
            return;
        }
        if (this.isInputForcedDown(Input.CLICK_LEFT)) {
            this.setInputForceState(Input.CLICK_RIGHT, false);
        }
        this.blockBreakHelper.tick(this.isInputForcedDown(Input.CLICK_LEFT));
        this.blockPlaceHelper.tick(this.isInputForcedDown(Input.CLICK_RIGHT));
        if (this.inControl()) {
            if (((class04474)this.ctx.player().L_1).getClass() != PlayerMovementInput.class) {
                PlayerMovementInput playerMovementInput = new PlayerMovementInput(this);
                this.ctx.player().L_1 = playerMovementInput;
            }
        } else if (((class04474)this.ctx.player().L_1).getClass() == PlayerMovementInput.class) {
            class04462 class044622 = new class04462((class05630)this.ctx.minecraft().i_7);
            this.ctx.player().L_1 = class044622;
        }
    }

    private boolean inControl() {
        for (Input input : new Input[]{Input.MOVE_FORWARD, Input.MOVE_BACK, Input.MOVE_LEFT, Input.MOVE_RIGHT, Input.SNEAK, Input.JUMP}) {
            if (!this.isInputForcedDown(input)) continue;
            return true;
        }
        return this.baritone.getPathingBehavior().isPathing() || this.baritone != BaritoneAPI.getProvider().getPrimaryBaritone();
    }

    public final void setInputForceState(Input input, boolean bl) {
        this.inputForceStateMap.put(input, bl);
    }

    public final boolean isInputForcedDown(Input input) {
        return input == null ? false : this.inputForceStateMap.getOrDefault(input, false);
    }

    public final void clearAllKeys() {
        this.inputForceStateMap.clear();
    }

    public BlockBreakHelper getBlockBreakHelper() {
        return this.blockBreakHelper;
    }
}

