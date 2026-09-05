/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas
 */
package Nursultan;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas;

@Environment(value=EnvType.CLIENT)
public class class11650 {
    public static final /* synthetic */ int[] N;

    static {
        N = new int[QuadAtlas.values().length];
        try {
            class11650.N[QuadAtlas.BLOCK.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class11650.N[QuadAtlas.ITEM.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

