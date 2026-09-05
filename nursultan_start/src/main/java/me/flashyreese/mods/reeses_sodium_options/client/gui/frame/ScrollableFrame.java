/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.AbstractWidgetExtended
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.Dim2iAccess
 *  minecraft.class01054
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class05096
 *  minecraft.class06613
 *  net.caffeinemc.mods.sodium.client.config.structure.ModOptions
 *  net.caffeinemc.mods.sodium.client.gui.options.control.ControlElement
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package me.flashyreese.mods.reeses_sodium_options.client.gui.frame;

import java.util.concurrent.atomic.AtomicReference;
import me.flashyreese.mods.reeses_sodium_options.client.gui.AbstractWidgetExtended;
import me.flashyreese.mods.reeses_sodium_options.client.gui.Dim2iAccess;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.AbstractFrame;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.ScrollableFrame$Builder;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.components.ScrollBarComponent;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.components.ScrollBarComponent$ScrollDirection;
import minecraft.class01054;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class05096;
import minecraft.class06613;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.gui.options.control.ControlElement;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public class ScrollableFrame
extends AbstractFrame {
    protected final Dim2i frameOrigin;
    protected final AbstractFrame frame;
    private boolean canScrollHorizontal;
    private boolean canScrollVertical;
    private Dim2i viewPortDimension = null;
    private ScrollBarComponent verticalScrollBar = null;
    private ScrollBarComponent horizontalScrollBar = null;

    public ScrollableFrame(Dim2i dim2i, class05096 class050962, ModOptions modOptions, AbstractFrame abstractFrame, boolean bl, AtomicReference<Integer> atomicReference, AtomicReference<Integer> atomicReference2) {
        super(dim2i, class050962, bl, modOptions);
        this.frame = abstractFrame;
        this.frameOrigin = new Dim2i(((AbstractWidgetExtended)abstractFrame).getDim().x(), ((AbstractWidgetExtended)abstractFrame).getDim().y(), 0, 0);
        this.setupFrame(atomicReference, atomicReference2);
        this.buildFrame();
    }

    public static ScrollableFrame$Builder builder() {
        return new ScrollableFrame$Builder();
    }

    @Override
    public class02106 method_48205(class02089 class020892) {
        return super.method_48205(class020892);
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        if (this.canScrollHorizontal || this.canScrollVertical) {
            if (this.renderOutline) {
                this.drawBorder(class010542, ((AbstractWidgetExtended)this).getDim().x(), ((AbstractWidgetExtended)this).getDim().y(), ((AbstractWidgetExtended)this).getDim().getLimitX(), ((AbstractWidgetExtended)this).getDim().getLimitY(), -5592406);
            }
            this.applyScissor(class010542, this.viewPortDimension.x(), this.viewPortDimension.y(), this.viewPortDimension.width(), this.viewPortDimension.height(), () -> super.method_25394(class010542, n, n2, f));
        } else {
            super.method_25394(class010542, n, n2, f);
        }
        if (this.canScrollHorizontal) {
            this.horizontalScrollBar.method_25394(class010542, n, n2, f);
        }
        if (this.canScrollVertical) {
            this.verticalScrollBar.method_25394(class010542, n, n2, f);
        }
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        return super.method_25403(class066132, d, d2) || this.canScrollHorizontal && this.horizontalScrollBar.method_25403(class066132, d, d2) || this.canScrollVertical && this.verticalScrollBar.method_25403(class066132, d, d2);
    }

    @Override
    public boolean method_25401(double d, double d2, double d3, double d4) {
        return super.method_25401(d, d2, d3, d4) || this.canScrollHorizontal && this.horizontalScrollBar.method_25401(d, d2, d3, d4) || this.canScrollVertical && this.verticalScrollBar.method_25401(d, d2, d3, d4);
    }

    public boolean method_25406(class06613 class066132) {
        return super.method_25406(class066132) || this.canScrollHorizontal && this.horizontalScrollBar.method_25406(class066132) || this.canScrollVertical && this.verticalScrollBar.method_25406(class066132);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        return super.method_25402(class066132, bl) || this.canScrollHorizontal && this.horizontalScrollBar.method_25402(class066132, bl) || this.canScrollVertical && this.verticalScrollBar.method_25402(class066132, bl);
    }

    @Override
    public void buildFrame() {
        this.children.clear();
        this.controlElements.clear();
        if (this.canScrollHorizontal) {
            this.horizontalScrollBar.updateThumbLocation();
        }
        if (this.canScrollVertical) {
            this.verticalScrollBar.updateThumbLocation();
        }
        if (this.canScrollHorizontal) {
            ((Dim2iAccess)((AbstractWidgetExtended)this.frame).getDim()).setX(this.frameOrigin.x() - this.horizontalScrollBar.getOffset());
            this.children.add(this.horizontalScrollBar);
        }
        if (this.canScrollVertical) {
            ((Dim2iAccess)((AbstractWidgetExtended)this.frame).getDim()).setY(this.frameOrigin.y() - this.verticalScrollBar.getOffset());
            this.children.add(this.verticalScrollBar);
        }
        this.frame.buildFrame();
        this.children.add(this.frame);
        super.buildFrame();
        this.frame.registerFocusListener(class046542 -> {
            if (class046542 instanceof ControlElement) {
                ControlElement controlElement = (ControlElement)class046542;
                if (this.canScrollVertical) {
                    Dim2i dim2i = ((AbstractWidgetExtended)controlElement).getDim();
                    int n = this.verticalScrollBar.getOffset();
                    if (dim2i.y() <= this.viewPortDimension.y()) {
                        n += dim2i.y() - this.viewPortDimension.y();
                    } else if (dim2i.getLimitY() >= this.viewPortDimension.getLimitY()) {
                        n += dim2i.getLimitY() - this.viewPortDimension.getLimitY();
                    }
                    this.verticalScrollBar.setOffset(n);
                }
            }
        });
    }

    public void setupFrame(AtomicReference<Integer> atomicReference, AtomicReference<Integer> atomicReference2) {
        int n2 = 0;
        int n3 = 0;
        if (!((Dim2iAccess)((AbstractWidgetExtended)this).getDim()).canFitDimension(((AbstractWidgetExtended)this.frame).getDim())) {
            int n4;
            if (((AbstractWidgetExtended)this).getDim().getLimitX() < ((AbstractWidgetExtended)this.frame).getDim().getLimitX() && n2 < (n4 = ((AbstractWidgetExtended)this.frame).getDim().x() - ((AbstractWidgetExtended)this).getDim().x() + ((AbstractWidgetExtended)this.frame).getDim().width())) {
                n2 = n4;
            }
            if (((AbstractWidgetExtended)this).getDim().getLimitY() < ((AbstractWidgetExtended)this.frame).getDim().getLimitY() && n3 < (n4 = ((AbstractWidgetExtended)this.frame).getDim().y() - ((AbstractWidgetExtended)this).getDim().y() + ((AbstractWidgetExtended)this.frame).getDim().height())) {
                n3 = n4;
            }
        }
        if (n2 > 0) {
            this.canScrollHorizontal = true;
        }
        if (n3 > 0) {
            this.canScrollVertical = true;
        }
        if (this.canScrollHorizontal && this.canScrollVertical) {
            this.viewPortDimension = new Dim2i(((AbstractWidgetExtended)this).getDim().x(), ((AbstractWidgetExtended)this).getDim().y(), ((AbstractWidgetExtended)this).getDim().width() - 11, ((AbstractWidgetExtended)this).getDim().height() - 11);
        } else if (this.canScrollHorizontal) {
            this.viewPortDimension = new Dim2i(((AbstractWidgetExtended)this).getDim().x(), ((AbstractWidgetExtended)this).getDim().y(), ((AbstractWidgetExtended)this).getDim().width(), ((AbstractWidgetExtended)this).getDim().height() - 11);
            ((Dim2iAccess)((AbstractWidgetExtended)this.frame).getDim()).setHeight(((AbstractWidgetExtended)this.frame).getDim().height() - 11);
        } else if (this.canScrollVertical) {
            this.viewPortDimension = new Dim2i(((AbstractWidgetExtended)this).getDim().x(), ((AbstractWidgetExtended)this).getDim().y(), ((AbstractWidgetExtended)this).getDim().width() - 11, ((AbstractWidgetExtended)this).getDim().height());
            ((Dim2iAccess)((AbstractWidgetExtended)this.frame).getDim()).setWidth(((AbstractWidgetExtended)this.frame).getDim().width() - 11);
        }
        if (this.canScrollHorizontal) {
            this.horizontalScrollBar = new ScrollBarComponent(new Dim2i(this.viewPortDimension.x(), this.viewPortDimension.getLimitY() + 1, this.viewPortDimension.width(), 10), ScrollBarComponent$ScrollDirection.HORIZONTAL, ((AbstractWidgetExtended)this.frame).getDim().width(), this.viewPortDimension.width(), n -> {
                ((Dim2iAccess)((AbstractWidgetExtended)this.frame).getDim()).setX(this.frameOrigin.x() - this.horizontalScrollBar.getOffset());
                atomicReference2.set((Integer)n);
            });
            this.horizontalScrollBar.setOffset(atomicReference2.get());
        }
        if (this.canScrollVertical) {
            this.verticalScrollBar = new ScrollBarComponent(new Dim2i(this.viewPortDimension.getLimitX() + 1, this.viewPortDimension.y(), 10, this.viewPortDimension.height()), ScrollBarComponent$ScrollDirection.VERTICAL, ((AbstractWidgetExtended)this.frame).getDim().height(), this.viewPortDimension.height(), n -> {
                ((Dim2iAccess)((AbstractWidgetExtended)this.frame).getDim()).setY(this.frameOrigin.y() - this.verticalScrollBar.getOffset());
                atomicReference.set((Integer)n);
            }, this.viewPortDimension);
            this.verticalScrollBar.setOffset(atomicReference.get());
        }
    }
}

