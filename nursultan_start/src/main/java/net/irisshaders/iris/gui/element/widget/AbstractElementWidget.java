/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class03255
 *  minecraft.class03428
 *  minecraft.class03432
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class06601
 *  minecraft.class06613
 *  net.irisshaders.iris.shaderpack.option.menu.OptionMenuElement
 */
package net.irisshaders.iris.gui.element.widget;

import minecraft.class01054;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class03255;
import minecraft.class03428;
import minecraft.class03432;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class06601;
import minecraft.class06613;
import net.irisshaders.iris.gui.NavigationController;
import net.irisshaders.iris.gui.element.widget.AbstractElementWidget$1;
import net.irisshaders.iris.gui.screen.ShaderPackScreen;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuElement;

public abstract class AbstractElementWidget<T extends OptionMenuElement>
implements class03434,
class04654 {
    public static final AbstractElementWidget<OptionMenuElement> EMPTY = new AbstractElementWidget$1(null);
    protected final T element;
    public class03255 bounds = class03255.N();
    private boolean focused;

    public AbstractElementWidget(T t) {
        this.element = t;
    }

    public void init(ShaderPackScreen shaderPackScreen, NavigationController navigationController) {
    }

    public boolean method_25404(class06601 class066012) {
        return false;
    }

    public class02106 method_48205(class02089 class020892) {
        return !this.method_25370() ? class02106.N((class04654)this) : null;
    }

    public void method_37020(class03428 class034282) {
    }

    public class03255 method_48202() {
        return this.bounds;
    }

    public class03432 method_37018() {
        return class03432.field_33784;
    }

    public void method_25365(boolean bl) {
        this.focused = bl;
    }

    public boolean method_25370() {
        return this.focused;
    }

    public boolean method_25406(class06613 class066132) {
        return false;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        return false;
    }

    public abstract void render(class01054 var1, int var2, int var3, float var4, boolean var5);
}

