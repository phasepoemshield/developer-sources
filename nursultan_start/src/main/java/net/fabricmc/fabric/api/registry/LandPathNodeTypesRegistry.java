/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class04425
 *  minecraft.class07209
 *  minecraft.class07290
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.api.registry;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class04425;
import minecraft.class07209;
import minecraft.class07290;
import net.fabricmc.fabric.api.registry.LandPathNodeTypesRegistry$DynamicPathNodeTypeProvider;
import net.fabricmc.fabric.api.registry.LandPathNodeTypesRegistry$PathNodeTypeProvider;
import net.fabricmc.fabric.api.registry.LandPathNodeTypesRegistry$StaticPathNodeTypeProvider;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class LandPathNodeTypesRegistry {
    private static final Logger LOGGER = LoggerFactory.getLogger(LandPathNodeTypesRegistry.class);
    private static final Map<class00891, LandPathNodeTypesRegistry$PathNodeTypeProvider> NODE_TYPES = new IdentityHashMap<class00891, LandPathNodeTypesRegistry$PathNodeTypeProvider>();

    private LandPathNodeTypesRegistry() {
    }

    public static void register(class00891 class008912, @Nullable class04425 class044252, @Nullable class04425 class044253) {
        Objects.requireNonNull(class008912, "Block cannot be null!");
        LandPathNodeTypesRegistry.register(class008912, (class005002, bl) -> bl ? class044253 : class044252);
    }

    public static void register(class00891 class008912, LandPathNodeTypesRegistry$StaticPathNodeTypeProvider landPathNodeTypesRegistry$StaticPathNodeTypeProvider) {
        Objects.requireNonNull(class008912, "Block cannot be null!");
        Objects.requireNonNull(landPathNodeTypesRegistry$StaticPathNodeTypeProvider, "StaticPathNodeTypeProvider cannot be null!");
        LandPathNodeTypesRegistry$PathNodeTypeProvider landPathNodeTypesRegistry$PathNodeTypeProvider = NODE_TYPES.put(class008912, landPathNodeTypesRegistry$StaticPathNodeTypeProvider);
        if (landPathNodeTypesRegistry$PathNodeTypeProvider != null) {
            LOGGER.debug("Replaced PathNodeType provider for the block {}", (Object)class008912);
        }
    }

    public static @Nullable class04425 getPathNodeType(class00500 class005002, class07290 class072902, class07209 class072092, boolean bl) {
        Objects.requireNonNull(class005002, "BlockState cannot be null!");
        Objects.requireNonNull(class072902, "BlockView cannot be null!");
        Objects.requireNonNull(class072092, "BlockPos cannot be null!");
        LandPathNodeTypesRegistry$PathNodeTypeProvider landPathNodeTypesRegistry$PathNodeTypeProvider = LandPathNodeTypesRegistry.getPathNodeTypeProvider(class005002.i());
        if (landPathNodeTypesRegistry$PathNodeTypeProvider == null) {
            return null;
        }
        if (landPathNodeTypesRegistry$PathNodeTypeProvider instanceof LandPathNodeTypesRegistry$DynamicPathNodeTypeProvider) {
            return ((LandPathNodeTypesRegistry$DynamicPathNodeTypeProvider)landPathNodeTypesRegistry$PathNodeTypeProvider).getPathNodeType(class005002, class072902, class072092, bl);
        }
        return ((LandPathNodeTypesRegistry$StaticPathNodeTypeProvider)landPathNodeTypesRegistry$PathNodeTypeProvider).getPathNodeType(class005002, bl);
    }

    public static @Nullable LandPathNodeTypesRegistry$PathNodeTypeProvider getPathNodeTypeProvider(class00891 class008912) {
        Objects.requireNonNull(class008912, "Block cannot be null!");
        return NODE_TYPES.get(class008912);
    }

    public static void registerDynamic(class00891 class008912, LandPathNodeTypesRegistry$DynamicPathNodeTypeProvider landPathNodeTypesRegistry$DynamicPathNodeTypeProvider) {
        Objects.requireNonNull(class008912, "Block cannot be null!");
        Objects.requireNonNull(landPathNodeTypesRegistry$DynamicPathNodeTypeProvider, "DynamicPathNodeTypeProvider cannot be null!");
        LandPathNodeTypesRegistry$PathNodeTypeProvider landPathNodeTypesRegistry$PathNodeTypeProvider = NODE_TYPES.put(class008912, landPathNodeTypesRegistry$DynamicPathNodeTypeProvider);
        if (landPathNodeTypesRegistry$PathNodeTypeProvider != null) {
            LOGGER.debug("Replaced PathNodeType provider for the block {}", (Object)class008912);
        }
    }
}

