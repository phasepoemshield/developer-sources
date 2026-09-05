/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.Optional;
import me.shedaniel.clothconfig2.gui.entries.AbstractTextFieldListListEntry$AbstractTextFieldListCell;
import me.shedaniel.clothconfig2.gui.entries.LongListListEntry;
import minecraft.class00392;

public class LongListListEntry$LongListCell
extends AbstractTextFieldListListEntry$AbstractTextFieldListCell<Long, LongListListEntry$LongListCell, LongListListEntry> {
    public LongListListEntry$LongListCell(Long l, LongListListEntry longListListEntry) {
        super(l, longListListEntry);
    }

    @Override
    public Long getValue() {
        try {
            return Long.valueOf(this.widget.method_1882());
        }
        catch (NumberFormatException numberFormatException) {
            return 0L;
        }
    }

    @Override
    public Optional<class00392> getError() {
        try {
            long l = Long.parseLong(this.widget.method_1882());
            if (l > ((LongListListEntry)this.listListEntry).maximum) {
                return Optional.of(class00392.N((String)"text.cloth-config.error.too_large", (Object[])new Object[]{((LongListListEntry)this.listListEntry).maximum}));
            }
            if (l < ((LongListListEntry)this.listListEntry).minimum) {
                return Optional.of(class00392.N((String)"text.cloth-config.error.too_small", (Object[])new Object[]{((LongListListEntry)this.listListEntry).minimum}));
            }
        }
        catch (NumberFormatException numberFormatException) {
            return Optional.of(class00392.L((String)"text.cloth-config.error.not_valid_number_long"));
        }
        return Optional.empty();
    }

    @Override
    protected boolean isValidText(String string) {
        return string.chars().allMatch(n -> Character.isDigit(n) || n == 45);
    }

    @Override
    protected Long substituteDefault(Long l) {
        if (l == null) {
            return 0L;
        }
        return l;
    }
}

