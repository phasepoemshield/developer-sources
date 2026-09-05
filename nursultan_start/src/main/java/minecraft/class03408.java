/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.exceptions.MinecraftClientException$ErrorType
 */
package minecraft;

import com.mojang.authlib.exceptions.MinecraftClientException;

class class03408 {
    static final /* synthetic */ int[] N;

    static {
        N = new int[MinecraftClientException.ErrorType.values().length];
        try {
            class03408.N[MinecraftClientException.ErrorType.SERVICE_UNAVAILABLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class03408.N[MinecraftClientException.ErrorType.HTTP_ERROR.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class03408.N[MinecraftClientException.ErrorType.JSON_ERROR.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

