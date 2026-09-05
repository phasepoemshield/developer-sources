/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class01054
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class06541
 *  minecraft.class06601
 *  minecraft.class06626
 *  net.caffeinemc.mods.sodium.client.config.ConfigManager
 *  net.caffeinemc.mods.sodium.client.config.search.SearchQuerySession
 *  net.caffeinemc.mods.sodium.client.config.search.TextSource
 *  net.caffeinemc.mods.sodium.client.config.structure.Option$OptionNameSource
 *  net.caffeinemc.mods.sodium.client.gui.ButtonTheme
 *  net.caffeinemc.mods.sodium.client.gui.widgets.AbstractParentWidget
 *  net.caffeinemc.mods.sodium.client.gui.widgets.FlatButtonWidget
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01054;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class06541;
import minecraft.class06601;
import minecraft.class06626;
import net.caffeinemc.mods.sodium.client.config.ConfigManager;
import net.caffeinemc.mods.sodium.client.config.search.SearchQuerySession;
import net.caffeinemc.mods.sodium.client.config.search.TextSource;
import net.caffeinemc.mods.sodium.client.config.structure.Option;
import net.caffeinemc.mods.sodium.client.gui.ButtonTheme;
import net.caffeinemc.mods.sodium.client.gui.widgets.AbstractParentWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.FlatButtonWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;
import org.jspecify.annotations.NonNull;

public class SearchWidget
extends AbstractParentWidget {
    private static final int MAX_ORDER_DIST_ERROR = 2;
    private static final ButtonTheme CLEAR_BUTTON_THEME = new ButtonTheme(-1, -1, -5592406, 0x60000000, 0x40000000, 0x40000000);
    private final Consumer<List<Option.OptionNameSource>> onSearchResults;
    private final SearchQuerySession searchQuerySession;
    private String query = "";
    private class04927 searchBox;
    private FlatButtonWidget clearButton;
    private int lastRebuildWidth = -1;

    public SearchWidget(Consumer<List<Option.OptionNameSource>> consumer, Dim2i dim2i) {
        super(dim2i);
        this.onSearchResults = consumer;
        this.searchQuerySession = ConfigManager.CONFIG.startSearchQuery();
    }

    private void search() {
        List list = this.searchQuerySession.getSearchResults(this.query);
        for (int i = 0; i < list.size(); ++i) {
            TextSource textSource = (TextSource)list.get(i);
            textSource.setResultIndex(i);
            if (textSource instanceof Option.OptionNameSource) continue;
            throw new UnsupportedOperationException("Unsupported search text source type: " + textSource.getClass().getName());
        }
        List list2 = list;
        this.improveGrouping(list2);
        this.onSearchResults.accept(list2);
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.i() && this.method_25399() == this.searchBox) {
            this.clearSearch();
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_25394(@NonNull class01054 class010542, int n, int n2, float f) {
        class010542.N(this.getX(), this.getY(), this.getX() + this.lastRebuildWidth, this.getLimitY(), -1879048192);
        this.searchBox.method_25394(class010542, n, n2, f);
        this.clearButton.method_25394(class010542, n, n2, f);
        super.method_25394(class010542, n, n2, f);
    }

    public boolean method_25400(class06626 class066262) {
        return this.searchBox.method_25400(class066262);
    }

    public void method_25365(boolean bl) {
        super.method_25365(bl);
        if (bl) {
            this.method_25395((class04654)this.searchBox);
        }
    }

    private void updateClearButtonVisibility() {
        this.clearButton.setVisible(!this.query.isEmpty());
    }

    public void updateWidgetWidth(int n) {
        if (n != this.lastRebuildWidth) {
            this.lastRebuildWidth = n;
            this.rebuildForWidth(n);
        }
    }

    public boolean isSearching() {
        return this.searchBox.method_25370();
    }

    private void improveGrouping(List<Option.OptionNameSource> list) {
        int n = list.size();
        for (int i = 1; i < n - 1; ++i) {
            Option.OptionNameSource optionNameSource = list.get(i - 1);
            Option.OptionNameSource optionNameSource2 = list.get(i);
            Option.OptionNameSource optionNameSource3 = list.get(i + 1);
            if (Math.abs(i - optionNameSource.getResultIndex()) > 2 || Math.abs(i + 1 - optionNameSource3.getResultIndex()) > 2) continue;
            int n2 = this.getGroupScore(optionNameSource, optionNameSource2);
            int n3 = this.getGroupScore(optionNameSource, optionNameSource3);
            if (n3 <= n2) continue;
            list.set(i, optionNameSource3);
            list.set(i + 1, optionNameSource2);
        }
    }

    private int getGroupScore(Option.OptionNameSource optionNameSource, Option.OptionNameSource optionNameSource2) {
        if (optionNameSource.getModOptions() != optionNameSource2.getModOptions()) {
            return 0;
        }
        if (optionNameSource.getPage() != optionNameSource2.getPage()) {
            return 1;
        }
        if (optionNameSource.getOptionGroup() != optionNameSource2.getOptionGroup()) {
            return 2;
        }
        return 3;
    }

    private void triggerSearch(String string) {
        if (string.equals(this.query)) {
            return;
        }
        this.query = string.stripLeading();
        this.updateClearButtonVisibility();
        this.search();
    }

    private void rebuildForWidth(int n) {
        this.clearChildren();
        int n2 = this.getX();
        int n3 = this.getY();
        int n4 = n - 20;
        this.clearButton = new FlatButtonWidget(new Dim2i(n2 + n4, n3, 20, 20), (class00392)class00392.y((String)"\u00d7"), this::clearSearch, true, false, CLEAR_BUTTON_THEME);
        Objects.requireNonNull(this.font);
        this.searchBox = new class04927(this.font, n2 + 5, n3 + 10 - 9 / 2, n4 - 20, 20, (class00392)class00392.L((String)"sodium.options.search"));
        this.searchBox.method_1880(200);
        this.searchBox.method_1858(false);
        this.searchBox.method_1863(this::triggerSearch);
        this.searchBox.method_47404((class00392)class00392.L((String)"sodium.options.search.hint").L(class00405.N.N(class06541.field_1080)));
        this.addChild((class04654)this.searchBox);
        this.addChild((class04654)this.clearButton);
        this.updateClearButtonVisibility();
    }

    private void clearSearch() {
        this.searchBox.method_1852("");
        this.query = "";
        this.updateClearButtonVisibility();
        this.search();
        this.method_25395(null);
    }
}

