/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class05946
 *  net.fabricmc.fabric.impl.registry.sync.RegistryAttributeImpl
 */
package net.fabricmc.fabric.api.event.registry;

import minecraft.class00751;
import minecraft.class05946;
import net.fabricmc.fabric.api.event.registry.RegistryAttribute;
import net.fabricmc.fabric.impl.registry.sync.RegistryAttributeImpl;

public interface RegistryAttributeHolder {
    public boolean hasAttribute(RegistryAttribute var1);

    public static RegistryAttributeHolder get(class05946<?> class059462) {
        return RegistryAttributeImpl.getHolder(class059462);
    }

    public static RegistryAttributeHolder get(class00751<?> class007512) {
        return RegistryAttributeHolder.get(class007512.i());
    }

    public RegistryAttributeHolder addAttribute(RegistryAttribute var1);
}

