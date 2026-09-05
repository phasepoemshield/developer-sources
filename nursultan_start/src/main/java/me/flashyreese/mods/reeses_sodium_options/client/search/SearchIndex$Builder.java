/*
 * Decompiled with CFR 0.152.
 */
package me.flashyreese.mods.reeses_sodium_options.client.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import me.flashyreese.mods.reeses_sodium_options.client.search.SearchIndex;

public final class SearchIndex$Builder<T> {
    final Function<T, String> extractSearchableText;
    final List<T> items = new ArrayList<T>();
    boolean foldDiacritics;
    int maxResults = 10;
    double minScore = 0.15;
    boolean rerankWithEditDistance = true;
    int rerankLimit = 50;
    double rerankWeight = 0.1;

    SearchIndex$Builder(Function<T, String> function) {
        this.extractSearchableText = Objects.requireNonNull(function, "extractSearchableText");
    }

    public SearchIndex$Builder<T> add(T t) {
        this.items.add(t);
        return this;
    }

    public SearchIndex$Builder<T> addAll(List<T> list) {
        this.items.addAll(list);
        return this;
    }

    public SearchIndex<T> build() {
        return new SearchIndex(this);
    }

    public SearchIndex$Builder<T> maxResults(int n) {
        this.maxResults = Math.max(1, n);
        return this;
    }

    public SearchIndex$Builder<T> minScore(double d) {
        this.minScore = Math.max(0.0, d);
        return this;
    }

    public SearchIndex$Builder<T> foldDiacritics(boolean bl) {
        this.foldDiacritics = bl;
        return this;
    }

    public SearchIndex$Builder<T> rerankLimit(int n) {
        this.rerankLimit = Math.max(1, n);
        return this;
    }

    public SearchIndex$Builder<T> rerankWeight(double d) {
        this.rerankWeight = Math.max(0.0, d);
        return this;
    }

    public SearchIndex$Builder<T> rerankWithEditDistance(boolean bl) {
        this.rerankWithEditDistance = bl;
        return this;
    }
}

