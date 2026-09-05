/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class06202
 */
package net.irisshaders.iris.gui.element;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class06202;
import net.irisshaders.iris.gui.element.ShaderPackSelectionList$BaseEntry;

public class ShaderPackSelectionList$LabelEntry
extends ShaderPackSelectionList$BaseEntry {
    private final class00392 label;

    public ShaderPackSelectionList$LabelEntry(class00392 class003922) {
        this.label = class003922;
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = this.method_73380();
        int n4 = this.method_73382();
        int n5 = this.method_73387();
        int n6 = this.method_73384();
        class010542.N((class01590)class06202.Nq().i_3, this.label, n3 + n5 / 2 - 2, n4 + (n6 - 11) / 2, -4013374);
    }
}

