/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06478
 */
package dev.isxander.yacl3.gui;

import dev.isxander.yacl3.gui.WidgetAndType;
import minecraft.class06478;

class WidgetAndType$1
implements WidgetAndType<T> {
    final /* synthetic */ class06478 val$widget;

    WidgetAndType$1(class06478 class064782) {
        this.val$widget = class064782;
    }

    @Override
    public T getType() {
        return this.val$widget;
    }

    @Override
    public class06478 getWidget() {
        return this.val$widget;
    }
}

