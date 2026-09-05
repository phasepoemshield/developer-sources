/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00780
 *  minecraft.class03556
 *  minecraft.class07209
 *  minecraft.class07290
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.blockview.v2;

import minecraft.class00394;
import minecraft.class00780;
import minecraft.class03556;
import minecraft.class07209;
import minecraft.class07290;
import org.jspecify.annotations.Nullable;

public interface FabricBlockView {
    default public @Nullable Object getBlockEntityRenderData(class07209 class072092) {
        class00394 class003942 = ((class07290)this).method_8321(class072092);
        return class003942 == null ? null : class003942.getRenderData();
    }

    default public boolean hasBiomes() {
        return false;
    }

    default public class03556<class00780> getBiomeFabric(class07209 class072092) {
        return null;
    }
}

