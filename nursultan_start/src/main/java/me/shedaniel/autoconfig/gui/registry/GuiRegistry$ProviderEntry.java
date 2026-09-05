/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.autoconfig.gui.registry;

import java.lang.reflect.Field;
import java.util.function.Predicate;
import me.shedaniel.autoconfig.gui.registry.api.GuiProvider;

class GuiRegistry$ProviderEntry {
    final Predicate<Field> predicate;
    final GuiProvider provider;

    GuiRegistry$ProviderEntry(Predicate<Field> predicate, GuiProvider guiProvider) {
        this.predicate = predicate;
        this.provider = guiProvider;
    }
}

