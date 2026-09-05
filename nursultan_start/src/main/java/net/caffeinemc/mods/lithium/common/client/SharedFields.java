/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class01289
 */
package net.caffeinemc.mods.lithium.common.client;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import minecraft.class01289;
import net.caffeinemc.mods.lithium.common.client.SharedFields$1;
import net.caffeinemc.mods.lithium.common.util.collections.DummyList;

public class SharedFields {
    public static final AtomicInteger MAXIMUM_BIOME_PARTICLE_CHANCE = new AtomicInteger(Float.floatToIntBits(0.0f));
    public static final class01289<?> DUMMY_BRAIN = new class01289(new DummyList(), List.of(), ImmutableList.of(), () -> new SharedFields$1());
}

