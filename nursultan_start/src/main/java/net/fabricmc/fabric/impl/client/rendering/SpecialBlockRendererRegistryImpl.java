/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00335
 *  minecraft.class00891
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.rendering;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import minecraft.class00335;
import minecraft.class00891;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class SpecialBlockRendererRegistryImpl {
    private static final Map<class00891, class00335> MAP = new HashMap<class00891, class00335>();
    private static BiConsumer<class00891, class00335> handler = MAP::put;

    public static void register(class00891 class008912, class00335 class003352) {
        handler.accept(class008912, class003352);
    }

    public static void setup(BiConsumer<class00891, class00335> biConsumer) {
        MAP.forEach(biConsumer);
        handler = biConsumer;
    }
}

