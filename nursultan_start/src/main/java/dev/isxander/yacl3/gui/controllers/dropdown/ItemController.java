/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.utils.Dimension
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class06581
 */
package dev.isxander.yacl3.gui.controllers.dropdown;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.AbstractWidget;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.dropdown.AbstractDropdownController;
import dev.isxander.yacl3.gui.controllers.dropdown.ItemControllerElement;
import dev.isxander.yacl3.gui.utils.ItemRegistryHelper;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class06581;

public class ItemController
extends AbstractDropdownController<class06581> {
    @Override
    public String getString() {
        return class04206.B.y((Object)((class06581)this.option.pendingValue())).toString();
    }

    public ItemController(Option<class06581> option) {
        super(option);
    }

    @Override
    public AbstractWidget provideWidget(YACLScreen yACLScreen, Dimension<Integer> dimension) {
        return new ItemControllerElement(this, yACLScreen, dimension);
    }

    @Override
    public class00392 formatValue() {
        return class00392.y((String)this.getString());
    }

    @Override
    public boolean isValueValid(String string) {
        return ItemRegistryHelper.isRegisteredItem(string);
    }

    @Override
    public void setFromString(String string) {
        this.option.requestSet((Object)ItemRegistryHelper.getItemFromName(string, (class06581)this.option.pendingValue()));
    }

    @Override
    protected String getValidValue(String string, int n) {
        return ItemRegistryHelper.getMatchingItemIdentifiers(string).skip(n).findFirst().map(class01894::toString).orElseGet(this::getString);
    }
}

