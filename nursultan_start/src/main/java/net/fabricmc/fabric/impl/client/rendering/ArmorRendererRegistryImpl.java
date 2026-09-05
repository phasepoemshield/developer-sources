/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04206
 *  minecraft.class04832
 *  minecraft.class06581
 *  minecraft.class07310
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer
 *  net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer$Factory
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.client.rendering;

import java.util.HashMap;
import java.util.Objects;
import minecraft.class04206;
import minecraft.class04832;
import minecraft.class06581;
import minecraft.class07310;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class ArmorRendererRegistryImpl {
    private static final HashMap<class06581, ArmorRenderer.Factory> FACTORIES = new HashMap();
    private static final HashMap<class06581, ArmorRenderer> RENDERERS = new HashMap();

    public static @Nullable ArmorRenderer get(class06581 class065812) {
        return RENDERERS.get(class065812);
    }

    public static void register(ArmorRenderer.Factory factory, class07310 ... class07310Array) {
        Objects.requireNonNull(factory, "renderer factory is null");
        if (class07310Array.length == 0) {
            throw new IllegalArgumentException("Armor renderer registered for no item");
        }
        for (class07310 class073102 : class07310Array) {
            Objects.requireNonNull(class073102.B(), "armor item is null");
            if (FACTORIES.putIfAbsent(class073102.B(), factory) == null) continue;
            throw new IllegalArgumentException("Custom armor renderer already exists for " + String.valueOf(class04206.B.y((Object)class073102.B())));
        }
    }

    public static void register(ArmorRenderer armorRenderer, class07310 ... class07310Array) {
        Objects.requireNonNull(armorRenderer, "renderer is null");
        ArmorRendererRegistryImpl.register(class048322 -> armorRenderer, class07310Array);
    }

    public static void createArmorRenderers(class04832 class048322) {
        RENDERERS.clear();
        FACTORIES.forEach((class065812, factory) -> RENDERERS.put((class06581)class065812, factory.createArmorRenderer(class048322)));
    }
}

