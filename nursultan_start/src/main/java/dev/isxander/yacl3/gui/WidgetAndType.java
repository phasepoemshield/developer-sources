/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06478
 */
package dev.isxander.yacl3.gui;

import dev.isxander.yacl3.gui.WidgetAndType$1;
import minecraft.class06478;

public interface WidgetAndType<T> {
    public T getType();

    public class06478 getWidget();

    public static <T extends class06478> WidgetAndType<T> ofWidget(T t) {
        return new WidgetAndType$1(t);
    }
}

