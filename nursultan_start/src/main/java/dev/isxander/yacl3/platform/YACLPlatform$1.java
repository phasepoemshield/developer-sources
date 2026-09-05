/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 */
package dev.isxander.yacl3.platform;

import net.fabricmc.api.EnvType;

class YACLPlatform$1 {
    static final /* synthetic */ int[] $SwitchMap$net$fabricmc$api$EnvType;

    static {
        $SwitchMap$net$fabricmc$api$EnvType = new int[EnvType.values().length];
        try {
            YACLPlatform$1.$SwitchMap$net$fabricmc$api$EnvType[EnvType.CLIENT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            YACLPlatform$1.$SwitchMap$net$fabricmc$api$EnvType[EnvType.SERVER.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

