/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.floats.FloatIntPair
 */
package com.viaversion.viafabricplus.features.mouse_sensitivity;

import it.unimi.dsi.fastutil.floats.FloatIntPair;

public final class MouseSensitivity1_13_2 {
    public static FloatIntPair get1_13SliderValue(float f) {
        int n = 142;
        int n2 = (int)(142.0f * f);
        float f2 = (float)n2 / 142.0f;
        int n3 = (int)(f2 * 200.0f);
        return FloatIntPair.of((float)f2, (int)n3);
    }
}

