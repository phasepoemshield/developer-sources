/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.utils.Dimension
 */
package dev.isxander.yacl3.gui.controllers.cycling;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.AbstractWidget;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.cycling.CyclingControllerElement;

public interface ICyclingController<T>
extends Controller<T> {
    default public AbstractWidget provideWidget(YACLScreen yACLScreen, Dimension<Integer> dimension) {
        return new CyclingControllerElement(this, yACLScreen, dimension);
    }

    public int getCycleLength();

    public void setPendingValue(int var1);

    public int getPendingValue();
}

