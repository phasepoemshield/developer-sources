/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class05936
 *  minecraft.class06202
 */
package net.irisshaders.iris.gui.element;

import java.util.function.Function;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class05936;
import minecraft.class06202;
import net.irisshaders.iris.gui.element.IrisElementRow$ButtonElement;

public class IrisElementRow$TextButtonElement
extends IrisElementRow$ButtonElement<IrisElementRow$TextButtonElement> {
    protected final class01590 font;
    public class00392 text;

    public IrisElementRow$TextButtonElement(class00392 class003922, Function<IrisElementRow$TextButtonElement, Boolean> function) {
        super(function);
        this.font = (class01590)class06202.Nq().i_3;
        this.text = class003922;
    }

    @Override
    public void renderLabel(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, float f, boolean bl) {
        int n7 = n + (int)((double)(n3 - this.font.N((class05936)this.text)) * 0.5);
        int n8 = n2 + (int)((double)(n4 - 8) * 0.5);
        class010542.y(this.font, this.text, n7, n8, -1);
    }
}

