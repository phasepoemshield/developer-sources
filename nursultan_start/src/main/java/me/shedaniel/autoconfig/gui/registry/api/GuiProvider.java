/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 */
package me.shedaniel.autoconfig.gui.registry.api;

import java.lang.reflect.Field;
import java.util.List;
import me.shedaniel.autoconfig.gui.registry.api.GuiRegistryAccess;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;

@FunctionalInterface
public interface GuiProvider {
    public List<AbstractConfigListEntry> get(String var1, Field var2, Object var3, Object var4, GuiRegistryAccess var5);
}

