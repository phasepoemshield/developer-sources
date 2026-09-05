/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.Optional;
import me.shedaniel.clothconfig2.gui.entries.AbstractTextFieldListListEntry$AbstractTextFieldListCell;
import me.shedaniel.clothconfig2.gui.entries.IntegerListListEntry;
import minecraft.class00392;

public class IntegerListListEntry$IntegerListCell
extends AbstractTextFieldListListEntry$AbstractTextFieldListCell<Integer, IntegerListListEntry$IntegerListCell, IntegerListListEntry> {
    public IntegerListListEntry$IntegerListCell(Integer n, IntegerListListEntry integerListListEntry) {
        super(n, integerListListEntry);
    }

    @Override
    public Integer getValue() {
        try {
            return Integer.valueOf(this.widget.method_1882());
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    @Override
    public Optional<class00392> getError() {
        try {
            int n = Integer.parseInt(this.widget.method_1882());
            if (n > ((IntegerListListEntry)this.listListEntry).maximum) {
                return Optional.of(class00392.N((String)"text.cloth-config.error.too_large", (Object[])new Object[]{((IntegerListListEntry)this.listListEntry).maximum}));
            }
            if (n < ((IntegerListListEntry)this.listListEntry).minimum) {
                return Optional.of(class00392.N((String)"text.cloth-config.error.too_small", (Object[])new Object[]{((IntegerListListEntry)this.listListEntry).minimum}));
            }
        }
        catch (NumberFormatException numberFormatException) {
            return Optional.of(class00392.L((String)"text.cloth-config.error.not_valid_number_int"));
        }
        return Optional.empty();
    }

    @Override
    protected boolean isValidText(String string) {
        return string.chars().allMatch(n -> Character.isDigit(n) || n == 45);
    }

    @Override
    protected Integer substituteDefault(Integer n) {
        if (n == null) {
            return 0;
        }
        return n;
    }
}

