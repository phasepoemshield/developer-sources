/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.Optional;
import me.shedaniel.clothconfig2.gui.entries.AbstractTextFieldListListEntry$AbstractTextFieldListCell;
import me.shedaniel.clothconfig2.gui.entries.StringListListEntry;
import minecraft.class00392;

public class StringListListEntry$StringListCell
extends AbstractTextFieldListListEntry$AbstractTextFieldListCell<String, StringListListEntry$StringListCell, StringListListEntry> {
    public StringListListEntry$StringListCell(String string, StringListListEntry stringListListEntry) {
        super(string, stringListListEntry);
    }

    @Override
    public String getValue() {
        return this.widget.method_1882();
    }

    @Override
    public Optional<class00392> getError() {
        return Optional.empty();
    }

    @Override
    protected boolean isValidText(String string) {
        return true;
    }

    @Override
    protected String substituteDefault(String string) {
        if (string == null) {
            return "";
        }
        return string;
    }
}

