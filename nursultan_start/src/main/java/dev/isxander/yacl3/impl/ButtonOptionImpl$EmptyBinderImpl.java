/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Binding
 *  dev.isxander.yacl3.api.ButtonOption
 */
package dev.isxander.yacl3.impl;

import dev.isxander.yacl3.api.Binding;
import dev.isxander.yacl3.api.ButtonOption;
import dev.isxander.yacl3.gui.YACLScreen;
import java.util.function.BiConsumer;

class ButtonOptionImpl$EmptyBinderImpl
implements Binding<BiConsumer<YACLScreen, ButtonOption>> {
    ButtonOptionImpl$EmptyBinderImpl() {
    }

    public BiConsumer<YACLScreen, ButtonOption> getValue() {
        throw new UnsupportedOperationException();
    }

    public BiConsumer<YACLScreen, ButtonOption> defaultValue() {
        throw new UnsupportedOperationException();
    }

    public void setValue(BiConsumer<YACLScreen, ButtonOption> biConsumer) {
    }
}

