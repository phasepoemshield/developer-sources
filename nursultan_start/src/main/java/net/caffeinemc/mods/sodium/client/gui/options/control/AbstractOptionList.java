/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.gui.options.control;

import java.util.ArrayList;
import java.util.List;
import net.caffeinemc.mods.sodium.client.gui.options.control.AbstractScrollable;
import net.caffeinemc.mods.sodium.client.gui.options.control.ControlElement;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public abstract class AbstractOptionList
extends AbstractScrollable {
    protected final List<ControlElement> controls = new ArrayList<ControlElement>();

    public AbstractOptionList(Dim2i dim2i) {
        super(dim2i);
    }

    public List<ControlElement> getControls() {
        return this.controls;
    }
}

