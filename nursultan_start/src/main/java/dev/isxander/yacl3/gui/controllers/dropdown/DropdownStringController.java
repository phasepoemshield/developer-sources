/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.utils.Dimension
 */
package dev.isxander.yacl3.gui.controllers.dropdown;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.AbstractWidget;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.dropdown.AbstractDropdownController;
import dev.isxander.yacl3.gui.controllers.dropdown.DropdownStringControllerElement;
import java.util.List;

public class DropdownStringController
extends AbstractDropdownController<String> {
    @Override
    public String getString() {
        return (String)this.option().pendingValue();
    }

    public DropdownStringController(Option<String> option, List<String> list, boolean bl, boolean bl2) {
        super(option, list, bl, bl2);
    }

    @Override
    public AbstractWidget provideWidget(YACLScreen yACLScreen, Dimension<Integer> dimension) {
        return new DropdownStringControllerElement(this, yACLScreen, dimension);
    }

    @Override
    public void setFromString(String string) {
        this.option().requestSet((Object)this.getValidValue(string));
    }
}

