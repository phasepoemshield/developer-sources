/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03042
 *  minecraft.class07209
 *  minecraft.class07211
 *  net.caffeinemc.mods.sodium.client.services.PlatformBlockAccess
 */
package net.caffeinemc.mods.sodium.client.model.light.flat;

import java.util.Arrays;
import minecraft.class03042;
import minecraft.class07209;
import minecraft.class07211;
import net.caffeinemc.mods.sodium.client.model.light.LightPipeline;
import net.caffeinemc.mods.sodium.client.model.light.data.LightDataAccess;
import net.caffeinemc.mods.sodium.client.model.light.data.QuadLightData;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import net.caffeinemc.mods.sodium.client.services.PlatformBlockAccess;

public class FlatLightPipeline
implements LightPipeline {
    private final LightDataAccess lightCache;

    public FlatLightPipeline(LightDataAccess lightDataAccess) {
        this.lightCache = lightDataAccess;
    }

    @Override
    public void calculate(ModelQuadView modelQuadView, class07209 class072092, QuadLightData quadLightData, class07211 class072112, class07211 class072113, boolean bl, boolean bl2) {
        int n;
        if (class072112 != null) {
            n = this.getOffsetLightmap(class072092, class072112);
            Arrays.fill(quadLightData.br, this.lightCache.getLevel().method_24852(class072113, bl));
        } else {
            int n2 = modelQuadView.getFlags();
            if ((n2 & 4) != 0 || (n2 & 2) != 0 && LightDataAccess.unpackFC(this.lightCache.get(class072092))) {
                n = this.getOffsetLightmap(class072092, class072113);
                Arrays.fill(quadLightData.br, this.lightCache.getLevel().method_24852(class072113, bl));
            } else {
                n = LightDataAccess.getEmissiveLightmap(this.lightCache.get(class072092));
                Arrays.fill(quadLightData.br, bl2 ? PlatformBlockAccess.getInstance().getNormalVectorShade(modelQuadView, this.lightCache.getLevel(), bl) : this.lightCache.getLevel().method_24852(class072113, bl));
            }
        }
        Arrays.fill(quadLightData.lm, n);
    }

    private int getOffsetLightmap(class07209 class072092, class07211 class072112) {
        int n = this.lightCache.get(class072092);
        if (LightDataAccess.unpackEM(n)) {
            return 0xF000F0;
        }
        int n2 = this.lightCache.get(class072092, class072112);
        return class03042.N((int)Math.max(LightDataAccess.unpackBL(n2), LightDataAccess.unpackLU(n)), (int)LightDataAccess.unpackSL(n2));
    }
}

