/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.config.search;

import java.util.List;
import net.caffeinemc.mods.sodium.client.config.search.TextSource;

public interface SearchQuerySession {
    public List<? extends TextSource> getSearchResults(String var1);
}

