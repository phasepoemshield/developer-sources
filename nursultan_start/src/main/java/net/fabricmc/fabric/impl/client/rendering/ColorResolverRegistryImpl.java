/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceMap
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap
 *  minecraft.class03202
 *  minecraft.class05917
 *  minecraft.class06229
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.rendering;

import it.unimi.dsi.fastutil.objects.Reference2ReferenceMap;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import minecraft.class03202;
import minecraft.class05917;
import minecraft.class06229;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class ColorResolverRegistryImpl {
    private static final Set<class03202> ALL_RESOLVERS = new HashSet<class03202>();
    private static final Set<class03202> CUSTOM_RESOLVERS = new HashSet<class03202>();
    private static final Set<class03202> ALL_RESOLVERS_VIEW = Collections.unmodifiableSet(ALL_RESOLVERS);
    private static final Set<class03202> CUSTOM_RESOLVERS_VIEW = Collections.unmodifiableSet(CUSTOM_RESOLVERS);

    private ColorResolverRegistryImpl() {
    }

    static {
        ALL_RESOLVERS.add(class06229.N);
        ALL_RESOLVERS.add(class06229.y);
        ALL_RESOLVERS.add(class06229.u);
    }

    public static void register(class03202 class032022) {
        ALL_RESOLVERS.add(class032022);
        CUSTOM_RESOLVERS.add(class032022);
    }

    public static Reference2ReferenceMap<class03202, class05917> createCustomCacheMap(Function<class03202, class05917> function) {
        Reference2ReferenceOpenHashMap reference2ReferenceOpenHashMap = new Reference2ReferenceOpenHashMap();
        for (class03202 class032022 : CUSTOM_RESOLVERS) {
            reference2ReferenceOpenHashMap.put((Object)class032022, (Object)function.apply(class032022));
        }
        reference2ReferenceOpenHashMap.trim();
        return reference2ReferenceOpenHashMap;
    }

    public static Set<class03202> getAllResolvers() {
        return ALL_RESOLVERS_VIEW;
    }

    public static Set<class03202> getCustomResolvers() {
        return CUSTOM_RESOLVERS_VIEW;
    }
}

