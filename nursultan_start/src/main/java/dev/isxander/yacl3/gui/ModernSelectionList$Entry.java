/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05729
 *  minecraft.class06601
 *  minecraft.class06626
 */
package dev.isxander.yacl3.gui;

import minecraft.class05729;
import minecraft.class06601;
import minecraft.class06626;

public abstract class ModernSelectionList$Entry<E extends ModernSelectionList$Entry<E>>
extends class05729<E> {
    public boolean method_25404(class06601 class066012) {
        return this.keyPressed(class066012.v(), class066012.n(), class066012.y());
    }

    public boolean method_25400(class06626 class066262) {
        return this.charTyped((char)class066262.L(), class066262.u());
    }

    protected boolean keyPressed(int n, int n2, int n3) {
        return super.method_25404(new class06601(n, n2, n3));
    }

    protected boolean charTyped(char c, int n) {
        return super.method_25400(new class06626((int)c, n));
    }
}

