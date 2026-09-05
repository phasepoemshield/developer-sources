/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.utils.Dimension
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07310
 */
package dev.isxander.yacl3.gui.controllers.dropdown;

import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.dropdown.AbstractDropdownControllerElement;
import dev.isxander.yacl3.gui.controllers.dropdown.ItemController;
import dev.isxander.yacl3.gui.utils.ItemRegistryHelper;
import dev.isxander.yacl3.gui.utils.MiscUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07310;

public class ItemControllerElement
extends AbstractDropdownControllerElement<class06581, class01894> {
    private final ItemController itemController;
    protected class06581 currentItem = null;
    protected Map<class01894, class06581> matchingItems = new HashMap<class01894, class06581>();

    @Override
    public String getString(class01894 class018942) {
        return class018942.toString();
    }

    public ItemControllerElement(ItemController itemController, YACLScreen yACLScreen, Dimension<Integer> dimension) {
        super(itemController, yACLScreen, dimension);
        this.itemController = itemController;
    }

    @Override
    public class00392 getValueText() {
        if (this.inputField.isEmpty() || this.itemController == null) {
            return super.getValueText();
        }
        if (this.inputFieldFocused) {
            return class00392.y((String)this.inputField);
        }
        return ((class06581)this.itemController.option().pendingValue()).U();
    }

    @Override
    public List<class01894> computeMatchingValues() {
        List list = ItemRegistryHelper.getMatchingItemIdentifiers(this.inputField).toList();
        this.currentItem = ItemRegistryHelper.getItemFromName(this.inputField, null);
        for (class01894 class018942 : list) {
            this.matchingItems.put(class018942, (class06581)MiscUtil.getFromRegistry(class04206.B, class018942));
        }
        return list;
    }

    @Override
    protected void renderDropdownEntry(class01054 class010542, Dimension<Integer> dimension, class01894 class018942) {
        super.renderDropdownEntry(class010542, dimension, class018942);
        class010542.y(new class06584((class07310)this.matchingItems.get(class018942)), (Integer)dimension.xLimit() - 2, (Integer)dimension.y() + 1);
    }

    @Override
    protected int getDropdownEntryPadding() {
        return 4;
    }

    @Override
    protected int getDecorationPadding() {
        return 16;
    }

    @Override
    public int getControlWidth() {
        return super.getControlWidth() + this.getDecorationPadding();
    }

    @Override
    public void drawValueText(class01054 class010542, int n, int n2, float f) {
        Dimension<Integer> dimension = this.getDimension();
        this.setDimension((Dimension<Integer>)this.getDimension().withWidth((Number)((Integer)this.getDimension().width() - this.getDecorationPadding())));
        super.drawValueText(class010542, n, n2, f);
        this.setDimension(dimension);
        if (this.currentItem != null) {
            class010542.y(new class06584((class07310)this.currentItem), (Integer)this.getDimension().xLimit() - this.getXPadding() - this.getDecorationPadding() + 2, (Integer)this.getDimension().y() + 2);
        }
    }
}

