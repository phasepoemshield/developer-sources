/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05340
 *  minecraft.class05355
 *  minecraft.class07438
 */
package net.caffeinemc.mods.lithium.mixin.ai.useless_sensors;

import java.util.Map;
import minecraft.class05340;
import minecraft.class05355;
import minecraft.class07438;

public interface BrainAccessor<E extends class07438> {
    public Map<class05340<? extends class05355<? super E>>, class05355<? super E>> getSensors();
}

