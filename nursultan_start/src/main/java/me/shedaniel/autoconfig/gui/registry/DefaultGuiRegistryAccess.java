/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 *  org.apache.logging.log4j.LogManager
 */
package me.shedaniel.autoconfig.gui.registry;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import me.shedaniel.autoconfig.gui.registry.api.GuiRegistryAccess;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import org.apache.logging.log4j.LogManager;

public class DefaultGuiRegistryAccess
implements GuiRegistryAccess {
    @Override
    public List<AbstractConfigListEntry> get(String string, Field field, Object object, Object object2, GuiRegistryAccess guiRegistryAccess) {
        LogManager.getLogger().error("No GUI provider registered for field '{}'!", (Object)field);
        return Collections.emptyList();
    }

    @Override
    public List<AbstractConfigListEntry> transform(List<AbstractConfigListEntry> list, String string, Field field, Object object, Object object2, GuiRegistryAccess guiRegistryAccess) {
        return list;
    }
}

