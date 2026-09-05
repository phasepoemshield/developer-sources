/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 */
package me.flashyreese.mods.reeses_sodium_options.client.gui;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import minecraft.class00392;
import minecraft.class01894;

public final class SodiumVideoOptionsScreen$UiState {
    private final AtomicReference<class00392> tabFrameSelectedTab = new AtomicReference<Object>(null);
    private final AtomicReference<Integer> tabFrameScrollBarOffset = new AtomicReference<Integer>(0);
    private final AtomicReference<Integer> optionPageScrollBarOffset = new AtomicReference<Integer>(0);
    private final AtomicReference<String> lastSearch = new AtomicReference<String>("");
    private final AtomicReference<Integer> lastSearchIndex = new AtomicReference<Integer>(0);
    private final List<class01894> searchResultIds = new ArrayList<class01894>();

    public AtomicReference<Integer> lastSearchIndex() {
        return this.lastSearchIndex;
    }

    public List<class01894> searchResultIds() {
        return List.copyOf(this.searchResultIds);
    }

    public AtomicReference<String> lastSearch() {
        return this.lastSearch;
    }

    public AtomicReference<Integer> tabFrameScrollBarOffset() {
        return this.tabFrameScrollBarOffset;
    }

    public boolean updateSearchResults(List<class01894> list) {
        if (this.searchResultIds.equals(list)) {
            return false;
        }
        this.searchResultIds.clear();
        this.searchResultIds.addAll(list);
        return true;
    }

    public AtomicReference<Integer> optionPageScrollBarOffset() {
        return this.optionPageScrollBarOffset;
    }

    public AtomicReference<class00392> tabFrameSelectedTab() {
        return this.tabFrameSelectedTab;
    }
}

