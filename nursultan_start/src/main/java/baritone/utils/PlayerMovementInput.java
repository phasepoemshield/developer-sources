/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09311
 *  Nursultan.class11938
 *  baritone.api.utils.input.Input
 *  minecraft.class04462
 *  minecraft.class04474
 *  minecraft.class07109
 *  minecraft.class08687
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package baritone.utils;

import Nursultan.class09311;
import Nursultan.class11938;
import baritone.api.utils.input.Input;
import baritone.utils.InputOverrideHandler;
import minecraft.class04462;
import minecraft.class04474;
import minecraft.class07109;
import minecraft.class08687;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class PlayerMovementInput
extends class04474 {
    private final InputOverrideHandler handler;

    PlayerMovementInput(InputOverrideHandler inputOverrideHandler) {
        this.handler = inputOverrideHandler;
    }

    private void handler$cij001$nursultan$injectTick(CallbackInfo callbackInfo) {
        class09311 class093112 = class09311.N((class08687)this.field_54155);
        class11938.L().L((Object)class093112);
        this.field_54155 = class093112.N();
        this.field_55868 = new class07109(class04462.N((boolean)this.field_54155.L(), (boolean)this.field_54155.u()), class04462.N((boolean)this.field_54155.N(), (boolean)this.field_54155.y()));
    }

    public void method_3129() {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean bl5 = this.handler.isInputForcedDown(Input.JUMP);
        boolean bl6 = this.handler.isInputForcedDown(Input.MOVE_FORWARD);
        if (bl6) {
            f2 += 1.0f;
        }
        if (bl4 = this.handler.isInputForcedDown(Input.MOVE_BACK)) {
            f2 -= 1.0f;
        }
        if (bl3 = this.handler.isInputForcedDown(Input.MOVE_LEFT)) {
            f += 1.0f;
        }
        if (bl2 = this.handler.isInputForcedDown(Input.MOVE_RIGHT)) {
            f -= 1.0f;
        }
        if (bl = this.handler.isInputForcedDown(Input.SNEAK)) {
            f = (float)((double)f * 0.3);
            f2 = (float)((double)f2 * 0.3);
        }
        this.field_55868 = new class07109(f, f2);
        boolean bl7 = this.handler.isInputForcedDown(Input.SPRINT);
        this.field_54155 = new class08687(bl6, bl4, bl3, bl2, bl5, bl, bl7);
        this.handler$cij001$nursultan$injectTick(null);
    }
}

