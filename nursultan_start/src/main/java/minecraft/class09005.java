/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  me.flashyreese.mods.sodiumextra.client.config.FogTypeConfig
 *  me.flashyreese.mods.sodiumextra.client.fog.FogEnvironmentExtended
 *  minecraft.class02233
 *  minecraft.class03448
 *  minecraft.class03970
 *  minecraft.class04798
 *  minecraft.class05363
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import me.flashyreese.mods.sodiumextra.client.config.FogTypeConfig;
import me.flashyreese.mods.sodiumextra.client.fog.FogEnvironmentExtended;
import minecraft.class02233;
import minecraft.class03448;
import minecraft.class03970;
import minecraft.class04798;
import minecraft.class05363;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public abstract class class09005
implements FogEnvironmentExtended {
    public boolean y() {
        return false;
    }

    public abstract boolean N(@Nullable class04798 var1, class07049 var2);

    public float N(class07438 class074382, float f, float f2) {
        return f;
    }

    public boolean N() {
        return true;
    }

    public int N(class03448 class034482, class05363 class053632, int n, float f) {
        return -1;
    }

    public abstract void N(class03970 var1, class05363 var2, class03448 var3, float var4, class02233 var5);

    public void sodium_extra$applyFogSettings(class04798 class047983, class03970 class039702, class07049 class070492, class07209 class072092, class03448 class034482, float f) {
        FogTypeConfig fogTypeConfig = SodiumExtraClientMod.options().renderSettings.fogTypeConfig.computeIfAbsent(class047983, class047982 -> new FogTypeConfig());
        if (!SodiumExtraClientMod.options().renderSettings.globalFog || !fogTypeConfig.enable) {
            class039702.N = Float.MAX_VALUE;
            class039702.L = Float.MAX_VALUE;
            class039702.y = Float.MAX_VALUE;
            class039702.u = Float.MAX_VALUE;
            class039702.i = Float.MAX_VALUE;
            class039702.R = Float.MAX_VALUE;
            return;
        }
        float f2 = (float)fogTypeConfig.environmentStartMultiplier / 100.0f;
        float f3 = (float)fogTypeConfig.environmentEndMultiplier / 100.0f;
        float f4 = (float)fogTypeConfig.renderDistanceStartMultiplier / 100.0f;
        float f5 = (float)fogTypeConfig.renderDistanceEndMultiplier / 100.0f;
        float f6 = (float)fogTypeConfig.skyEndMultiplier / 100.0f;
        float f7 = (float)fogTypeConfig.cloudEndMultiplier / 100.0f;
        class039702.N *= f2;
        class039702.L *= f3;
        class039702.y *= f4;
        class039702.u *= f5;
        class039702.i *= f6;
        class039702.R *= f7;
    }
}

