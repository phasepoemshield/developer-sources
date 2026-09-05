/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05946
 *  net.fabricmc.fabric.api.event.registry.RegistryAttribute
 *  net.fabricmc.fabric.api.event.registry.RegistryAttributeHolder
 *  net.fabricmc.loader.api.FabricLoader
 */
package net.fabricmc.fabric.impl.registry.sync;

import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import minecraft.class05946;
import net.fabricmc.fabric.api.event.registry.RegistryAttribute;
import net.fabricmc.fabric.api.event.registry.RegistryAttributeHolder;
import net.fabricmc.loader.api.FabricLoader;

public final class RegistryAttributeImpl
implements RegistryAttributeHolder {
    private static final Map<class05946<?>, RegistryAttributeHolder> HOLDER_MAP = new ConcurrentHashMap();
    private final EnumSet<RegistryAttribute> attributes = EnumSet.noneOf(RegistryAttribute.class);

    public void removeAttribute(RegistryAttribute registryAttribute) {
        if (!FabricLoader.getInstance().isDevelopmentEnvironment()) {
            throw new AssertionError();
        }
        this.attributes.remove(registryAttribute);
    }

    public boolean hasAttribute(RegistryAttribute registryAttribute) {
        return this.attributes.contains(registryAttribute);
    }

    private RegistryAttributeImpl() {
    }

    public EnumSet<RegistryAttribute> getAttributes() {
        return this.attributes;
    }

    public RegistryAttributeHolder addAttribute(RegistryAttribute registryAttribute) {
        this.attributes.add(registryAttribute);
        return this;
    }

    public static RegistryAttributeHolder getHolder(class05946<?> class059463) {
        return (RegistryAttributeHolder)HOLDER_MAP.computeIfAbsent(class059463, class059462 -> new RegistryAttributeImpl());
    }
}

