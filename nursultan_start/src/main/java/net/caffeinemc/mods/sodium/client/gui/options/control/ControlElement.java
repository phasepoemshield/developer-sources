/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.OptionExtended
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class01054
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class03428
 *  minecraft.class03457
 *  minecraft.class05216
 *  minecraft.class06541
 *  net.caffeinemc.mods.sodium.client.config.structure.Option
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.gui.options.control;

import me.flashyreese.mods.reeses_sodium_options.client.gui.OptionExtended;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01054;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class03428;
import minecraft.class03457;
import minecraft.class05216;
import minecraft.class06541;
import net.caffeinemc.mods.sodium.client.config.structure.Option;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.options.control.AbstractOptionList;
import net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;
import org.jspecify.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class ControlElement
extends AbstractWidget {
    protected final AbstractOptionList list;
    protected final ColorTheme theme;

    public ControlElement(AbstractOptionList abstractOptionList, Dim2i dim2i, ColorTheme colorTheme) {
        super(dim2i);
        this.list = abstractOptionList;
        this.theme = colorTheme;
    }

    public abstract Option getOption();

    @Override
    public int getY() {
        return super.getY() - this.list.getScrollAmount();
    }

    @Override
    public @Nullable class02106 method_48205(class02089 class020892) {
        if (!this.getOption().isEnabled()) {
            return null;
        }
        return super.method_48205(class020892);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        Object object = this.getOption().getName().getString();
        if (this.getOption().isEnabled() && this.getOption().hasChanged()) {
            object = (String)object + " *";
        }
        object = this.truncateLabelToFit((String)object);
        String string = this.getOption().isEnabled() ? (this.getOption().hasChanged() ? String.valueOf(class06541.field_1056) + (String)object : String.valueOf(class06541.field_1068) + (String)object) : String.valueOf(class06541.field_1080) + String.valueOf(class06541.field_1055) + (String)object;
        this.hovered = this.method_25405(n, n2);
        this.drawRect(class010542, this.getX(), this.getY(), this.getLimitX(), this.getLimitY(), this.hovered ? -536870912 : 0x40000000);
        int n3 = -1;
        int n4 = this.getCenterY() + -4;
        int n5 = this.getX() + 6;
        String string2 = string;
        class01054 class010543 = class010542;
        ControlElement controlElement = this;
        this.redirect$cjg000$reeses-sodium-options$drawString(controlElement, class010543, string2, n5, n4, n3);
        if (this.method_25370()) {
            this.drawBorder(class010542, this.getX(), this.getY(), this.getLimitX(), this.getLimitY(), -1);
        }
    }

    @Override
    public void method_37020(class03428 class034282) {
        class034282.N(class03457.field_33788, this.getOption().getName());
        super.method_37020(class034282);
    }

    public int getContentWidth() {
        return this.getOption().getControl().getMaxWidth();
    }

    protected String truncateLabelToFit(String string) {
        return this.truncateTextToFit(string, this.getWidth() - this.getContentWidth() - 20);
    }

    protected class05216 formatDisabledControlValue(class00392 class003922) {
        return class003922.L().L(class00405.N.N(class06541.field_1080).y(Boolean.valueOf(true)));
    }

    public void redirect$cjg000$reeses-sodium-options$drawString(ControlElement controlElement, class01054 class010542, String string, int n, int n2, int n3) {
        OptionExtended optionExtended;
        Object object = this.getOption();
        if (object instanceof OptionExtended && (optionExtended = (OptionExtended)object).isHighlight()) {
            object = optionExtended.getSelected() ? class06541.field_1077.toString() : class06541.field_1054.toString();
            string = string.replace(class06541.field_1068.toString(), String.valueOf(class06541.field_1068) + (String)object);
            string = string.replace(class06541.field_1055.toString(), String.valueOf(class06541.field_1055) + (String)object);
            string = string.replace(class06541.field_1056.toString(), String.valueOf(class06541.field_1056) + (String)object);
        }
        this.drawString(class010542, string, n, n2, n3);
    }
}

