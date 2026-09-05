/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.AbstractWidgetExtended
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.Dim2iAccess
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.Point2iAccess
 *  minecraft.class01054
 *  minecraft.class01294
 *  minecraft.class01295
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class04654
 *  minecraft.class05096
 *  net.caffeinemc.mods.sodium.client.config.structure.ModOptions
 *  net.caffeinemc.mods.sodium.client.gui.options.control.AbstractOptionList
 *  net.caffeinemc.mods.sodium.client.gui.options.control.ControlElement
 *  net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package me.flashyreese.mods.reeses_sodium_options.client.gui.frame;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import me.flashyreese.mods.reeses_sodium_options.client.gui.AbstractWidgetExtended;
import me.flashyreese.mods.reeses_sodium_options.client.gui.Dim2iAccess;
import me.flashyreese.mods.reeses_sodium_options.client.gui.Point2iAccess;
import minecraft.class01054;
import minecraft.class01294;
import minecraft.class01295;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class04654;
import minecraft.class05096;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.gui.options.control.AbstractOptionList;
import net.caffeinemc.mods.sodium.client.gui.options.control.ControlElement;
import net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public abstract class AbstractFrame
extends AbstractOptionList
implements class01295 {
    protected final class05096 screen;
    protected final List<AbstractWidget> children = new ArrayList<AbstractWidget>();
    protected final List<ControlElement> controlElements = new ArrayList<ControlElement>();
    protected final ModOptions modOptions;
    protected boolean renderOutline;
    private class04654 focused;
    private boolean dragging;
    private Consumer<class04654> focusListener;

    public AbstractFrame(Dim2i dim2i, class05096 class050962, boolean bl, ModOptions modOptions) {
        super(dim2i);
        this.screen = class050962;
        this.renderOutline = bl;
        this.modOptions = modOptions;
    }

    public List<? extends class04654> method_25396() {
        return this.children;
    }

    public class04654 method_25399() {
        return this.focused;
    }

    public class02106 method_48205(class02089 class020892) {
        return super.method_48205(class020892);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        if (this.renderOutline) {
            this.drawBorder(class010542, this.getX(), this.getY(), this.getLimitX(), this.getLimitY(), -5592406);
        }
        for (class01294 class012942 : this.children) {
            class012942.method_25394(class010542, n, n2, f);
        }
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        for (class04654 class046542 : this.children) {
            AbstractFrame abstractFrame;
            if (class046542 instanceof AbstractFrame) {
                abstractFrame = (AbstractFrame)class046542;
                for (ControlElement controlElement : abstractFrame.controlElements) {
                    if (!controlElement.method_25401(d, d2, d3, d4)) continue;
                    return true;
                }
                if (abstractFrame.method_25401(d, d2, d3, d4)) {
                    return true;
                }
            }
            if (!(class046542 instanceof ControlElement) || !(abstractFrame = (ControlElement)class046542).method_25401(d, d2, d3, d4)) continue;
            return true;
        }
        return false;
    }

    public void method_25395(class04654 class046542) {
        if (this.focused != null) {
            this.focused.method_25365(false);
        }
        this.focused = class046542;
        if (this.focusListener != null) {
            this.focusListener.accept(class046542);
        }
    }

    public void method_25398(boolean bl) {
        this.dragging = bl;
    }

    public boolean method_25397() {
        return this.dragging;
    }

    public int getScrollAmount() {
        return 0;
    }

    public void buildFrame() {
        for (class04654 class046542 : this.children) {
            if (class046542 instanceof AbstractFrame) {
                AbstractFrame abstractFrame = (AbstractFrame)class046542;
                this.controlElements.addAll(abstractFrame.controlElements);
            }
            if (!(class046542 instanceof ControlElement)) continue;
            this.controlElements.add((ControlElement)class046542);
        }
    }

    public void applyScissor(class01054 class010542, int n, int n2, int n3, int n4, Runnable runnable) {
        class010542.L(n, n2, n + n3, n2 + n4);
        runnable.run();
        class010542.R();
    }

    protected static void setDimPoint(Dim2i dim2i, Point2iAccess point2iAccess) {
        ((Dim2iAccess)dim2i).setPoint2i(point2iAccess);
    }

    protected Dim2i getFrameDim() {
        return ((AbstractWidgetExtended)this).getDim();
    }

    public void registerFocusListener(Consumer<class04654> consumer) {
        this.focusListener = consumer;
    }
}

