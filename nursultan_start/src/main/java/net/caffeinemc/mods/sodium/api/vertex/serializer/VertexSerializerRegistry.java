/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 */
package net.caffeinemc.mods.sodium.api.vertex.serializer;

import com.mojang.blaze3d.vertex.VertexFormat;
import net.caffeinemc.mods.sodium.api.internal.DependencyInjection;
import net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializer;

public interface VertexSerializerRegistry {
    public static final VertexSerializerRegistry INSTANCE = DependencyInjection.load(VertexSerializerRegistry.class, "net.caffeinemc.mods.sodium.client.render.vertex.serializers.VertexSerializerRegistryImpl");

    public void registerSerializer(VertexFormat var1, VertexFormat var2, VertexSerializer var3);

    public VertexSerializer get(VertexFormat var1, VertexFormat var2);

    public static VertexSerializerRegistry instance() {
        return INSTANCE;
    }
}

