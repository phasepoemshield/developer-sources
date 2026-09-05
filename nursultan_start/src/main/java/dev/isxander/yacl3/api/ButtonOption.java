/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.gui.YACLScreen
 *  dev.isxander.yacl3.impl.ButtonOptionImpl$BuilderImpl
 */
package dev.isxander.yacl3.api;

import dev.isxander.yacl3.api.ButtonOption$Builder;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.impl.ButtonOptionImpl;
import java.util.function.BiConsumer;

public interface ButtonOption
extends Option<BiConsumer<YACLScreen, ButtonOption>> {
    public BiConsumer<YACLScreen, ButtonOption> action();

    public static ButtonOption$Builder createBuilder() {
        return new ButtonOptionImpl.BuilderImpl();
    }
}

