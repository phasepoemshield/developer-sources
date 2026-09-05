/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.Optional;
import me.shedaniel.clothconfig2.gui.entries.AbstractTextFieldListListEntry$AbstractTextFieldListCell;
import me.shedaniel.clothconfig2.gui.entries.FloatListListEntry;
import minecraft.class00392;

public class FloatListListEntry$FloatListCell
extends AbstractTextFieldListListEntry$AbstractTextFieldListCell<Float, FloatListListEntry$FloatListCell, FloatListListEntry> {
    public FloatListListEntry$FloatListCell(Float f, FloatListListEntry floatListListEntry) {
        super(f, floatListListEntry);
    }

    @Override
    public Float getValue() {
        try {
            return Float.valueOf(this.widget.method_1882());
        }
        catch (NumberFormatException numberFormatException) {
            return Float.valueOf(0.0f);
        }
    }

    @Override
    public Optional<class00392> getError() {
        try {
            float f = Float.parseFloat(this.widget.method_1882());
            if (f > ((FloatListListEntry)this.listListEntry).maximum) {
                return Optional.of(class00392.N((String)"text.cloth-config.error.too_large", (Object[])new Object[]{Float.valueOf(((FloatListListEntry)this.listListEntry).maximum)}));
            }
            if (f < ((FloatListListEntry)this.listListEntry).minimum) {
                return Optional.of(class00392.N((String)"text.cloth-config.error.too_small", (Object[])new Object[]{Float.valueOf(((FloatListListEntry)this.listListEntry).minimum)}));
            }
        }
        catch (NumberFormatException numberFormatException) {
            return Optional.of(class00392.L((String)"text.cloth-config.error.not_valid_number_float"));
        }
        return Optional.empty();
    }

    @Override
    protected boolean isValidText(String string) {
        return string.chars().allMatch(n -> Character.isDigit(n) || n == 45 || n == 46);
    }

    @Override
    protected Float substituteDefault(Float f) {
        if (f == null) {
            return Float.valueOf(0.0f);
        }
        return f;
    }
}

