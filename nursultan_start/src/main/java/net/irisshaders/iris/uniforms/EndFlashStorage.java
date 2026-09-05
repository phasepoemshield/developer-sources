/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class06202
 */
package net.irisshaders.iris.uniforms;

import minecraft.class03448;
import minecraft.class06202;
import net.irisshaders.iris.uniforms.CapturedRenderingState;

public class EndFlashStorage {
    private float lastEndFlash;
    private float currentEndFlash;

    public void tick() {
        this.lastEndFlash = this.currentEndFlash;
        this.currentEndFlash = ((class03448)class06202.Nq().T_3).R() == null ? 0.0f : ((class03448)class06202.Nq().T_3).R().N(CapturedRenderingState.INSTANCE.getTickDelta());
    }

    public float getLastEndFlash() {
        return this.lastEndFlash;
    }

    public float getCurrentEndFlash() {
        return this.currentEndFlash;
    }
}

