/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07295
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.block.v1;

import minecraft.class00500;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07295;
import org.jspecify.annotations.Nullable;

public interface FabricBlockState {
    default public class00500 getAppearance(class07295 class072952, class07209 class072092, class07211 class072112, @Nullable class00500 class005002, @Nullable class07209 class072093) {
        class00500 class005003 = (class00500)this;
        return class005003.i().getAppearance(class005003, class072952, class072092, class072112, class005002, class072093);
    }
}

