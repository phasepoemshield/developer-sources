/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.helper;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class ColorHelper {
    private ColorHelper() {
    }

    public static int maxLight(int n, int n2) {
        if (n == 0) {
            return n2;
        }
        if (n2 == 0) {
            return n;
        }
        return Math.max(n & 0xFFFF, n2 & 0xFFFF) | Math.max(n & 0xFFFF0000, n2 & 0xFFFF0000);
    }
}

