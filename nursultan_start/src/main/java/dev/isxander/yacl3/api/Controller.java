/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.utils.Dimension
 *  dev.isxander.yacl3.gui.AbstractWidget
 *  dev.isxander.yacl3.gui.YACLScreen
 *  minecraft.class00392
 */
package dev.isxander.yacl3.api;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.AbstractWidget;
import dev.isxander.yacl3.gui.YACLScreen;
import minecraft.class00392;

public interface Controller<T> {
    public Option<T> option();

    public AbstractWidget provideWidget(YACLScreen var1, Dimension<Integer> var2);

    public class00392 formatValue();
}

