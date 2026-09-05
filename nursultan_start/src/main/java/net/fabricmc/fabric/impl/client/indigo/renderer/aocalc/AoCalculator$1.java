/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.aocalc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.indigo.renderer.aocalc.AoConfig;

@Environment(value=EnvType.CLIENT)
class AoCalculator$1 {
    static final /* synthetic */ int[] $SwitchMap$net$fabricmc$fabric$impl$client$indigo$renderer$aocalc$AoConfig;

    static {
        $SwitchMap$net$fabricmc$fabric$impl$client$indigo$renderer$aocalc$AoConfig = new int[AoConfig.values().length];
        try {
            AoCalculator$1.$SwitchMap$net$fabricmc$fabric$impl$client$indigo$renderer$aocalc$AoConfig[AoConfig.VANILLA.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AoCalculator$1.$SwitchMap$net$fabricmc$fabric$impl$client$indigo$renderer$aocalc$AoConfig[AoConfig.EMULATE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AoCalculator$1.$SwitchMap$net$fabricmc$fabric$impl$client$indigo$renderer$aocalc$AoConfig[AoConfig.HYBRID.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AoCalculator$1.$SwitchMap$net$fabricmc$fabric$impl$client$indigo$renderer$aocalc$AoConfig[AoConfig.ENHANCED.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

