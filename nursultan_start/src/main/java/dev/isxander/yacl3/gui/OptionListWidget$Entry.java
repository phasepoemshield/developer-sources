/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.gui;

import dev.isxander.yacl3.gui.OptionListWidget;
import dev.isxander.yacl3.gui.YACLSelectionList$Entry;

public abstract class OptionListWidget$Entry
extends YACLSelectionList$Entry<OptionListWidget$Entry> {
    protected boolean searchQueryMatches = true;

    public OptionListWidget$Entry(OptionListWidget optionListWidget) {
        super(optionListWidget);
    }

    public int method_25364() {
        if (!this.isViewable()) {
            return 0;
        }
        return super.method_25364();
    }

    protected void refreshVisibilityState() {
        if (this.isViewable()) {
            this.onBecameViewable();
        } else {
            this.onBecameHidden();
        }
    }

    public boolean isViewable() {
        return this.searchQueryMatches;
    }

    public boolean updateSearchQuery(String string) {
        boolean bl = string.isEmpty();
        if (this.searchQueryMatches != bl) {
            this.searchQueryMatches = bl;
            this.refreshVisibilityState();
        }
        return this.searchQueryMatches;
    }

    protected void onBecameHidden() {
        this.method_73383(0);
    }

    protected void onBecameViewable() {
    }
}

