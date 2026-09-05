/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01391
 *  net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.render.vertex;

import minecraft.class01391;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import net.caffeinemc.mods.sodium.client.render.vertex.VertexConsumerTracker;
import org.jspecify.annotations.Nullable;

public class VertexConsumerUtils {
    public static @Nullable VertexBufferWriter convertOrLog(class01391 class013912) {
        VertexBufferWriter vertexBufferWriter = VertexBufferWriter.tryOf((class01391)class013912);
        if (vertexBufferWriter == null) {
            VertexConsumerTracker.logBadConsumer(class013912);
        }
        return vertexBufferWriter;
    }
}

