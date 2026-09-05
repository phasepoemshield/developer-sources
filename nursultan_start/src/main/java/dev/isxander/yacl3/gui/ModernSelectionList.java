/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class04654
 *  minecraft.class06202
 *  minecraft.class06318
 *  minecraft.class06595
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class06626
 *  org.jspecify.annotations.Nullable
 */
package dev.isxander.yacl3.gui;

import dev.isxander.yacl3.gui.ModernSelectionList$Entry;
import minecraft.class01054;
import minecraft.class04654;
import minecraft.class06202;
import minecraft.class06318;
import minecraft.class06595;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class06626;
import org.jspecify.annotations.Nullable;

public abstract class ModernSelectionList<E extends ModernSelectionList$Entry<E>>
extends class06318<E> {
    private boolean doneRefresh;

    public ModernSelectionList(class06202 class062022, int n, int n2, int n3, int n4) {
        super(class062022, n, n2, n3, n4);
    }

    public boolean method_25404(class06601 class066012) {
        return this.keyPressed(class066012.v(), class066012.n(), class066012.y());
    }

    public /* synthetic */ @Nullable class04654 method_25399() {
        return super.method_25336();
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        return this.mouseDragged(class066132.n(), class066132.t(), class066132.v(), d, d2);
    }

    public boolean method_25400(class06626 class066262) {
        return this.charTyped((char)class066262.L(), class066262.u());
    }

    public boolean method_25406(class06613 class066132) {
        return this.mouseReleased(class066132.n(), class066132.t(), class066132.v());
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        return this.mouseClicked(class066132.n(), class066132.t(), class066132.v());
    }

    protected boolean keyPressed(int n, int n2, int n3) {
        return super.method_25404(new class06601(n, n2, n3));
    }

    protected boolean mouseReleased(double d, double d2, int n) {
        return super.method_25406(new class06613(d, d2, new class06595(n, 0)));
    }

    protected boolean mouseClicked(double d, double d2, int n) {
        return super.method_25402(new class06613(d, d2, new class06595(n, 0)), false);
    }

    protected boolean mouseDragged(double d, double d2, int n, double d3, double d4) {
        return super.method_25403(new class06613(d, d2, new class06595(n, 0)), d3, d4);
    }

    protected boolean charTyped(char c, int n) {
        return super.method_25400(new class06626((int)c, n));
    }

    protected void repositionEntries() {
        this.method_44382(this.method_44387());
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        if (!this.doneRefresh) {
            this.repositionEntries();
            this.doneRefresh = true;
        }
        super.method_48579(class010542, n, n2, f);
    }
}

