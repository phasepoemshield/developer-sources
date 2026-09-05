/*
 * Decompiled with CFR 0.152.
 */
package me.flashyreese.mods.reeses_sodium_options.client.search;

public final class SearchResult<T> {
    private final T item;
    private final double score;
    private final int documentId;

    SearchResult(T t, double d, int n) {
        this.item = t;
        this.score = d;
        this.documentId = n;
    }

    public T item() {
        return this.item;
    }

    public double score() {
        return this.score;
    }

    int documentId() {
        return this.documentId;
    }
}

