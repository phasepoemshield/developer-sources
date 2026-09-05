/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormatElement$Usage
 */
package minecraft;

import com.mojang.blaze3d.vertex.VertexFormatElement;

public class class08852 {
    public static final /* synthetic */ int[] N;

    static {
        N = new int[VertexFormatElement.Usage.values().length];
        try {
            class08852.N[VertexFormatElement.Usage.POSITION.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class08852.N[VertexFormatElement.Usage.GENERIC.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class08852.N[VertexFormatElement.Usage.UV.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class08852.N[VertexFormatElement.Usage.NORMAL.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class08852.N[VertexFormatElement.Usage.COLOR.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

