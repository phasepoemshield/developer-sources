/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ReferenceSet
 *  it.unimi.dsi.fastutil.objects.ReferenceSets
 *  minecraft.class01391
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.caffeinemc.mods.sodium.client.render.vertex;

import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceSet;
import it.unimi.dsi.fastutil.objects.ReferenceSets;
import minecraft.class01391;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VertexConsumerTracker {
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"Sodium-VertexConsumerTracker");
    private static final ReferenceSet<Class<? extends class01391>> BAD_CONSUMERS = ReferenceSets.synchronize((ReferenceSet)new ReferenceOpenHashSet());

    public static void logBadConsumer(class01391 class013912) {
        if (BAD_CONSUMERS.add((Object)class013912.getClass())) {
            LOGGER.warn("Class {} does not support optimized vertex writing code paths, which may cause reduced rendering performance", (Object)class013912.getClass().getName());
        }
    }
}

