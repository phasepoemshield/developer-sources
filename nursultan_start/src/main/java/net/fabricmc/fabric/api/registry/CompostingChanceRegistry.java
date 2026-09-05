/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.util.Item2ObjectMap
 *  net.fabricmc.fabric.impl.content.registry.CompostingChanceRegistryImpl
 */
package net.fabricmc.fabric.api.registry;

import net.fabricmc.fabric.api.util.Item2ObjectMap;
import net.fabricmc.fabric.impl.content.registry.CompostingChanceRegistryImpl;

public interface CompostingChanceRegistry
extends Item2ObjectMap<Float> {
    public static final CompostingChanceRegistry INSTANCE = new CompostingChanceRegistryImpl();
}

