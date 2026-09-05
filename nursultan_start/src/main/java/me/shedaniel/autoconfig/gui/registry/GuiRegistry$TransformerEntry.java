/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.autoconfig.gui.registry;

import java.lang.reflect.Field;
import java.util.function.Predicate;
import me.shedaniel.autoconfig.gui.registry.api.GuiTransformer;

class GuiRegistry$TransformerEntry {
    final Predicate<Field> predicate;
    final GuiTransformer transformer;

    GuiRegistry$TransformerEntry(Predicate<Field> predicate, GuiTransformer guiTransformer) {
        this.predicate = predicate;
        this.transformer = guiTransformer;
    }
}

