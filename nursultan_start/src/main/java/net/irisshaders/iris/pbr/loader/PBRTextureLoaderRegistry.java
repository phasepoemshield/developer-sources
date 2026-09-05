/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00349
 *  minecraft.class08626
 *  minecraft.class08918
 */
package net.irisshaders.iris.pbr.loader;

import java.util.HashMap;
import java.util.Map;
import minecraft.class00349;
import minecraft.class08626;
import minecraft.class08918;
import net.irisshaders.iris.pbr.loader.AtlasPBRLoader;
import net.irisshaders.iris.pbr.loader.PBRTextureLoader;
import net.irisshaders.iris.pbr.loader.SimplePBRLoader;

public class PBRTextureLoaderRegistry {
    public static final PBRTextureLoaderRegistry INSTANCE = new PBRTextureLoaderRegistry();
    private final Map<Class<?>, PBRTextureLoader<?>> loaderMap = new HashMap();

    static {
        INSTANCE.register(class00349.class, new SimplePBRLoader());
        INSTANCE.register(class08626.class, new AtlasPBRLoader());
    }

    public <T extends class08918> void register(Class<? extends T> clazz, PBRTextureLoader<T> pBRTextureLoader) {
        this.loaderMap.put(clazz, pBRTextureLoader);
    }

    public <T extends class08918> PBRTextureLoader<T> getLoader(Class<? extends T> clazz) {
        return this.loaderMap.get(clazz);
    }
}

