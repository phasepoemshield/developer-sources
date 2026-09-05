/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class06202
 *  minecraft.class06601
 *  minecraft.class06613
 */
package net.irisshaders.iris.gui.element;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class06202;
import minecraft.class06601;
import minecraft.class06613;
import net.irisshaders.iris.gui.GuiUtil;
import net.irisshaders.iris.gui.element.ShaderPackSelectionList;
import net.irisshaders.iris.gui.element.ShaderPackSelectionList$BaseEntry;

class ShaderPackSelectionList$PinnedEntry
extends ShaderPackSelectionList$BaseEntry {
    public final boolean allowPressButton;
    private final class00392 label;
    private final Runnable onClick;

    public ShaderPackSelectionList$PinnedEntry(class00392 class003922, Runnable runnable, ShaderPackSelectionList shaderPackSelectionList) {
        this.allowPressButton = true;
        this.label = class003922;
        this.onClick = runnable;
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.u()) {
            Objects.requireNonNull(this);
            GuiUtil.playButtonClickSound();
            this.onClick.run();
            return false;
        }
        return false;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        Objects.requireNonNull(this);
        GuiUtil.playButtonClickSound();
        this.onClick.run();
        return false;
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = this.method_73380();
        int n4 = this.method_73382();
        int n5 = this.method_73387();
        int n6 = this.method_73384();
        GuiUtil.bindIrisWidgetsTexture();
        GuiUtil.drawButton(class010542, n3 - 2, n4 - 2, n5, n6 + 2, bl, false);
        class010542.N((class01590)class06202.Nq().i_3, this.label, n3 + n5 / 2 - 2, n4 + (n6 - 11) / 2, -1);
    }
}

