/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06601
 *  minecraft.class06613
 */
package net.irisshaders.iris.gui.element;

import java.util.function.Function;
import minecraft.class06601;
import minecraft.class06613;
import net.irisshaders.iris.gui.element.IrisElementRow$Element;

public abstract class IrisElementRow$ButtonElement<T extends IrisElementRow$ButtonElement<T>>
extends IrisElementRow$Element {
    private final Function<T, Boolean> onClick;

    protected IrisElementRow$ButtonElement(Function<T, Boolean> function) {
        this.onClick = function;
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.u()) {
            return this.onClick.apply(this);
        }
        return false;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.disabled) {
            return false;
        }
        if (class066132.v() == 0) {
            return this.onClick.apply(this);
        }
        return super.method_25402(class066132, bl);
    }
}

