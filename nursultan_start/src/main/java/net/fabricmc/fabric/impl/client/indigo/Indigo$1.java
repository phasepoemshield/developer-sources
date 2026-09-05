/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.indigo;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.util.TriState;

@Environment(value=EnvType.CLIENT)
class Indigo$1 {
    static final /* synthetic */ int[] $SwitchMap$net$fabricmc$fabric$api$util$TriState;

    static {
        $SwitchMap$net$fabricmc$fabric$api$util$TriState = new int[TriState.values().length];
        try {
            Indigo$1.$SwitchMap$net$fabricmc$fabric$api$util$TriState[TriState.TRUE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Indigo$1.$SwitchMap$net$fabricmc$fabric$api$util$TriState[TriState.FALSE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

