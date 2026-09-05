/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.Optional;
import me.shedaniel.clothconfig2.gui.entries.AbstractTextFieldListListEntry$AbstractTextFieldListCell;
import me.shedaniel.clothconfig2.gui.entries.DoubleListListEntry;
import minecraft.class00392;

public class DoubleListListEntry$DoubleListCell
extends AbstractTextFieldListListEntry$AbstractTextFieldListCell<Double, DoubleListListEntry$DoubleListCell, DoubleListListEntry> {
    public DoubleListListEntry$DoubleListCell(Double d, DoubleListListEntry doubleListListEntry) {
        super(d, doubleListListEntry);
    }

    @Override
    public Double getValue() {
        try {
            return Double.valueOf(this.widget.method_1882());
        }
        catch (NumberFormatException numberFormatException) {
            return 0.0;
        }
    }

    @Override
    public Optional<class00392> getError() {
        try {
            double d = Double.parseDouble(this.widget.method_1882());
            if (d > ((DoubleListListEntry)this.listListEntry).maximum) {
                return Optional.of(class00392.N((String)"text.cloth-config.error.too_large", (Object[])new Object[]{((DoubleListListEntry)this.listListEntry).maximum}));
            }
            if (d < ((DoubleListListEntry)this.listListEntry).minimum) {
                return Optional.of(class00392.N((String)"text.cloth-config.error.too_small", (Object[])new Object[]{((DoubleListListEntry)this.listListEntry).minimum}));
            }
        }
        catch (NumberFormatException numberFormatException) {
            return Optional.of(class00392.L((String)"text.cloth-config.error.not_valid_number_double"));
        }
        return Optional.empty();
    }

    @Override
    protected boolean isValidText(String string) {
        return string.chars().allMatch(n -> Character.isDigit(n) || n == 45 || n == 46);
    }

    @Override
    protected Double substituteDefault(Double d) {
        if (d == null) {
            return 0.0;
        }
        return d;
    }
}

