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
public interface GuiTransformer {
    public List<AbstractConfigListEntry> transform(List<AbstractConfigListEntry> var1, String var2, Field var3, Object var4, Object var5, GuiRegistryAccess var6);
}

