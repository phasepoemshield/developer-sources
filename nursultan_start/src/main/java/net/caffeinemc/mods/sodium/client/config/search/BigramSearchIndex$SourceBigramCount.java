/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package net.caffeinemc.mods.sodium.client.config.search;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.caffeinemc.mods.sodium.client.config.search.TextSource;

final class BigramSearchIndex$SourceBigramCount
extends Record {
    final TextSource source;
    final int count;

    BigramSearchIndex$SourceBigramCount(TextSource textSource, int n) {
        this.source = textSource;
        this.count = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{BigramSearchIndex$SourceBigramCount.class, "source;count", "source", "count"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{BigramSearchIndex$SourceBigramCount.class, "source;count", "source", "count"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{BigramSearchIndex$SourceBigramCount.class, "source;count", "source", "count"}, this);
    }

    public int count() {
        return this.count;
    }

    public TextSource source() {
        return this.source;
    }
}

