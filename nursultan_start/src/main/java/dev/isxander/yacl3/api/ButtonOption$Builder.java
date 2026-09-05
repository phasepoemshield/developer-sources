/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.gui.YACLScreen
 *  minecraft.class00392
 */
package dev.isxander.yacl3.api;

import dev.isxander.yacl3.api.ButtonOption;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.gui.YACLScreen;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import minecraft.class00392;

public interface ButtonOption$Builder {
    public ButtonOption$Builder description(OptionDescription var1);

    public ButtonOption$Builder name(class00392 var1);

    @Deprecated
    public ButtonOption$Builder action(Consumer<YACLScreen> var1);

    public ButtonOption$Builder action(BiConsumer<YACLScreen, ButtonOption> var1);

    public ButtonOption$Builder available(boolean var1);

    public ButtonOption build();

    public ButtonOption$Builder text(class00392 var1);
}

