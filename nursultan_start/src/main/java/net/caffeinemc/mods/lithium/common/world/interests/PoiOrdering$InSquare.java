/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05368
 *  minecraft.class07209
 */
package net.caffeinemc.mods.lithium.common.world.interests;

import minecraft.class05368;
import minecraft.class07209;
import net.caffeinemc.mods.lithium.common.world.interests.PoiOrdering;
import net.caffeinemc.mods.lithium.common.world.interests.PoiOrdering$InChunk;

public record PoiOrdering$InSquare() implements PoiOrdering
{
    public static final PoiOrdering$InSquare INSTANCE = new PoiOrdering$InSquare();

    @Override
    public int compare(class07209 class072092, class05368 class053682, class07209 class072093, class07209 class072094) {
        int n;
        int n2;
        int n3 = class072093.method_10260() >> 4;
        int n4 = Integer.compare(n3, n2 = class072094.method_10260() >> 4);
        if (n4 != 0) {
            return n4;
        }
        int n5 = class072093.method_10263() >> 4;
        int n6 = Integer.compare(n5, n = class072094.method_10263() >> 4);
        if (n6 != 0) {
            return n6;
        }
        return PoiOrdering$InChunk.INSTANCE.compare(class072092, class053682, class072093, class072094);
    }
}

