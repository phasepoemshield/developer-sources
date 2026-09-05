/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06202
 */
package dev.isxander.yacl3.gui;

import dev.isxander.yacl3.gui.ModernSelectionList;
import dev.isxander.yacl3.gui.WidgetAndType;
import dev.isxander.yacl3.gui.YACLSelectionList$Entry;
import minecraft.class06202;

public abstract class YACLSelectionList<E extends YACLSelectionList$Entry<E>>
extends ModernSelectionList<E> {
    public YACLSelectionList(class06202 class062022, int n, int n2, int n3) {
        super(class062022, n, n2, n3, 20);
    }

    public static <T extends YACLSelectionList<?>> WidgetAndType<T> asWidget(T t) {
        return WidgetAndType.ofWidget(t);
    }
}

