/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01199
 *  minecraft.class01894
 *  minecraft.class04383
 *  minecraft.class05946
 *  net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder
 *  net.fabricmc.fabric.api.event.registry.RegistryAttribute
 *  net.fabricmc.fabric.api.event.registry.RegistryIdRemapCallback
 *  net.fabricmc.fabric.mixin.object.builder.EntityDataSerializersAccessor
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.object.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import minecraft.class00751;
import minecraft.class01199;
import minecraft.class01894;
import minecraft.class04383;
import minecraft.class05946;
import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder;
import net.fabricmc.fabric.api.event.registry.RegistryAttribute;
import net.fabricmc.fabric.api.event.registry.RegistryIdRemapCallback;
import net.fabricmc.fabric.mixin.object.builder.EntityDataSerializersAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class FabricTrackedDataRegistryImpl {
    private static final Logger LOGGER = LoggerFactory.getLogger(FabricTrackedDataRegistryImpl.class);
    private static final class01894 HANDLER_REGISTRY_ID = class01894.N((String)"fabric-object-builder-api-v1", (String)"tracked_data_handler");
    private static final class05946<class00751<class04383<?>>> HANDLER_REGISTRY_KEY = class05946.N((class01894)HANDLER_REGISTRY_ID);
    private static final List<class04383<?>> VANILLA_HANDLERS = new ArrayList();
    private static @Nullable class00751<class04383<?>> handlerRegistry = null;
    private static final List<class04383<?>> EXTERNAL_MODDED_HANDLERS = new ArrayList();

    private FabricTrackedDataRegistryImpl() {
    }

    public static @Nullable class04383<?> get(class01894 class018942) {
        Objects.requireNonNull(class018942, "Tracked data handler ID cannot be null!");
        if (handlerRegistry == null) {
            return null;
        }
        return (class04383)handlerRegistry.N(class018942);
    }

    public static void register(class01894 class018942, class04383<?> class043832) {
        Objects.requireNonNull(class018942, "Tracked data handler ID cannot be null!");
        Objects.requireNonNull(class043832, "Tracked data handler cannot be null!");
        FabricTrackedDataRegistryImpl.storeExternalHandlers();
        if (VANILLA_HANDLERS.contains(class043832) || EXTERNAL_MODDED_HANDLERS.contains(class043832)) {
            throw new IllegalArgumentException("Cannot register tracked data handler previously added via TrackedDataHandlerRegistry.register");
        }
        if (handlerRegistry == null) {
            handlerRegistry = FabricRegistryBuilder.createSimple(HANDLER_REGISTRY_KEY).attribute(RegistryAttribute.SYNCED).buildAndRegister();
            RegistryIdRemapCallback.event(handlerRegistry).register(remapState -> {
                FabricTrackedDataRegistryImpl.storeExternalHandlers();
                FabricTrackedDataRegistryImpl.reorderHandlers();
            });
        }
        class00751.N(handlerRegistry, (class01894)class018942, class043832);
        FabricTrackedDataRegistryImpl.reorderHandlers();
    }

    public static @Nullable class01894 getId(class04383<?> class043832) {
        Objects.requireNonNull(class043832, "Tracked data handler cannot be null!");
        if (handlerRegistry == null) {
            return null;
        }
        return handlerRegistry.y(class043832);
    }

    private static void reorderHandlers() {
        class01199 class011992 = EntityDataSerializersAccessor.fabric_getDataHandlers();
        LOGGER.debug("Reordering tracked data handlers containing {} entries", (Object)class011992.L());
        class011992.N();
        for (class04383<?> class043832 : VANILLA_HANDLERS) {
            class011992.u(class043832);
        }
        if (handlerRegistry != null) {
            for (class04383<?> class043832 : handlerRegistry) {
                class011992.u(class043832);
            }
        }
        for (class04383<?> class043832 : EXTERNAL_MODDED_HANDLERS) {
            class011992.u(class043832);
        }
        LOGGER.debug("Finished reordering tracked data handlers containing {} entries", (Object)class011992.L());
    }

    public static void storeVanillaHandlers() {
        if (FabricTrackedDataRegistryImpl.hasStoredVanillaHandlers()) {
            throw new IllegalStateException("Already stored vanilla handlers!");
        }
        class01199 class011992 = EntityDataSerializersAccessor.fabric_getDataHandlers();
        for (class04383 class043832 : class011992) {
            VANILLA_HANDLERS.add(class043832);
        }
        LOGGER.debug("Stored {} vanilla handlers", (Object)VANILLA_HANDLERS.size());
    }

    public static boolean hasStoredVanillaHandlers() {
        return !VANILLA_HANDLERS.isEmpty();
    }

    private static void storeExternalHandlers() {
        class01199 class011992 = EntityDataSerializersAccessor.fabric_getDataHandlers();
        for (class04383 class043832 : class011992) {
            if (VANILLA_HANDLERS.contains(class043832) || handlerRegistry != null && handlerRegistry.y((Object)class043832) != null || EXTERNAL_MODDED_HANDLERS.contains(class043832)) continue;
            EXTERNAL_MODDED_HANDLERS.add(class043832);
            LOGGER.warn("Tracked data handler {} is not managed by vanilla or Fabric API; it may be prone to desynchronization!", (Object)class043832);
        }
    }
}

