/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 */
package me.shedaniel.autoconfig.gui.registry.api;

import java.lang.reflect.Field;
import java.util.List;
import me.shedaniel.autoconfig.gui.registry.api.GuiProvider;
import me.shedaniel.autoconfig.gui.registry.api.GuiTransformer;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;

public interface GuiRegistryAccess
extends GuiProvider,
GuiTransformer {
    default public List<AbstractConfigListEntry> getAndTransform(String string, Field field, Object object, Object object2, GuiRegistryAccess guiRegistryAccess) {
        return this.transform(this.get(string, field, object, object2, guiRegistryAccess), string, field, object, object2, guiRegistryAccess);
    }
}

