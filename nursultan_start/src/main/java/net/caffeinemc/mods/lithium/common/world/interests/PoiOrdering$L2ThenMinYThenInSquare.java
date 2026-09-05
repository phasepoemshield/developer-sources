/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class05368
 *  minecraft.class07209
 */
package net.caffeinemc.mods.lithium.common.world.interests;

import minecraft.class00753;
import minecraft.class05368;
import minecraft.class07209;
import net.caffeinemc.mods.lithium.common.world.interests.PoiOrdering;
import net.caffeinemc.mods.lithium.common.world.interests.PoiOrdering$InSquare;

public record PoiOrdering$L2ThenMinYThenInSquare() implements PoiOrdering
{
    public static final PoiOrdering$L2ThenMinYThenInSquare INSTANCE = new PoiOrdering$L2ThenMinYThenInSquare();

    @Override
    public int compare(class07209 class072092, class05368 class053682, class07209 class072093, class07209 class072094) {
        double d;
        double d2 = class072092.method_10262((class00753)class072093);
        int n = Double.compare(d2, d = class072092.method_10262((class00753)class072094));
        if (n != 0) {
            return n;
        }
        int n2 = Integer.compare(class072093.method_10264(), class072094.method_10264());
        if (n2 != 0) {
            return n2;
        }
        return PoiOrdering$InSquare.INSTANCE.compare(class072092, class053682, class072093, class072094);
    }
}

