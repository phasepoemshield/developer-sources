/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.irisshaders.iris.gl.BooleanStateExtended
 *  net.irisshaders.iris.mixin.statelisteners.BooleanStateAccessor
 *  org.lwjgl.opengl.GL11
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.mojang.blaze3d.opengl;

import com.mojang.blaze3d.systems.RenderSystem;
import net.irisshaders.iris.gl.BooleanStateExtended;
import net.irisshaders.iris.mixin.statelisteners.BooleanStateAccessor;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class GlStateManager$class_1018
implements BooleanStateExtended,
BooleanStateAccessor {
    private final int field_5050;
    public boolean field_5051;
    private boolean stateUnknown;

    public GlStateManager$class_1018(int n) {
        this.field_5050 = n;
    }

    public /* synthetic */ boolean isEnabled() {
        return this.field_5051;
    }

    private void handler$bcj000$iris$setUnknownState(boolean bl, CallbackInfo callbackInfo) {
        if (this.stateUnknown) {
            callbackInfo.cancel();
            this.field_5051 = bl;
            this.stateUnknown = false;
            if (bl) {
                GL11.glEnable((int)this.field_5050);
            } else {
                GL11.glDisable((int)this.field_5050);
            }
        }
    }

    public void setUnknownState() {
        this.stateUnknown = true;
    }

    public void method_4470(boolean bl) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.handler$bcj000$iris$setUnknownState(bl, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        RenderSystem.assertOnRenderThread();
        if (bl != this.field_5051) {
            this.field_5051 = bl;
            if (bl) {
                GL11.glEnable((int)this.field_5050);
            } else {
                GL11.glDisable((int)this.field_5050);
            }
        }
    }

    public void method_4471() {
        this.method_4470(true);
    }

    public void method_4469() {
        this.method_4470(false);
    }
}

