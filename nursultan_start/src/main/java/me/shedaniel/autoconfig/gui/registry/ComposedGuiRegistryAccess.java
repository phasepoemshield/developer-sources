/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 */
package me.shedaniel.autoconfig.gui.registry;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import me.shedaniel.autoconfig.gui.registry.api.GuiRegistryAccess;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;

public class ComposedGuiRegistryAccess
implements GuiRegistryAccess {
    private List<GuiRegistryAccess> children;

    public ComposedGuiRegistryAccess(GuiRegistryAccess ... guiRegistryAccessArray) {
        this.children = Arrays.asList(guiRegistryAccessArray);
    }

    @Override
    public List<AbstractConfigListEntry> get(String string, Field field, Object object, Object object2, GuiRegistryAccess guiRegistryAccess) {
        return this.children.stream().map(guiRegistryAccess2 -> guiRegistryAccess2.get(string, field, object, object2, guiRegistryAccess)).filter(Objects::nonNull).findFirst().orElseThrow(() -> new RuntimeException("No ConfigGuiProvider match!"));
    }

    @Override
    public List<AbstractConfigListEntry> transform(List<AbstractConfigListEntry> list, String string, Field field, Object object, Object object2, GuiRegistryAccess guiRegistryAccess) {
        for (GuiRegistryAccess guiRegistryAccess2 : this.children) {
            list = guiRegistryAccess2.transform(list, string, field, object, object2, guiRegistryAccess);
        }
        return list;
    }
}

