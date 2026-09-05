/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04804
 *  minecraft.class07049
 *  minecraft.class07078
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.rendering;

import java.util.HashMap;
import java.util.function.BiConsumer;
import minecraft.class04804;
import minecraft.class07049;
import minecraft.class07078;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class EntityRendererRegistryImpl {
    private static HashMap<class07078<?>, class04804<?>> map = new HashMap();
    private static BiConsumer<class07078<?>, class04804<?>> handler = (class070782, class048042) -> map.put((class07078<?>)class070782, (class04804<?>)class048042);

    private EntityRendererRegistryImpl() {
    }

    public static <T extends class07049> void register(class07078<? extends T> class070782, class04804<T> class048042) {
        handler.accept(class070782, class048042);
    }

    public static void setup(BiConsumer<class07078<?>, class04804<?>> biConsumer) {
        map.forEach(biConsumer);
        handler = biConsumer;
    }
}

