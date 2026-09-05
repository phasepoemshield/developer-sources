/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.utils.Dimension
 */
package dev.isxander.yacl3.gui.controllers.slider;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.AbstractWidget;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.slider.SliderControllerElement;

public interface ISliderController<T extends Number>
extends Controller<T> {
    public double min();

    public double max();

    default public double range() {
        return this.max() - this.min();
    }

    public double interval();

    default public AbstractWidget provideWidget(YACLScreen yACLScreen, Dimension<Integer> dimension) {
        return new SliderControllerElement(this, yACLScreen, dimension, this.min(), this.max(), this.interval());
    }

    public double pendingValue();

    public void setPendingValue(double var1);
}

