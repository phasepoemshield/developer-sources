/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ReferenceArrayList
 */
package net.caffeinemc.mods.sodium.client.config.search;

import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.List;
import net.caffeinemc.mods.sodium.client.config.search.SearchIndex;
import net.caffeinemc.mods.sodium.client.config.search.TextSource;

public abstract class SourceStoringIndex
extends SearchIndex {
    protected final List<TextSource> sources = new ReferenceArrayList();

    SourceStoringIndex(Runnable runnable) {
        super(runnable);
    }

    @Override
    public void register(TextSource textSource) {
        this.sources.add(textSource);
    }

    @Override
    protected void invalidateSourcesForRebuild() {
        for (TextSource textSource : this.sources) {
            textSource.invalidateText();
        }
    }

    @Override
    public void buildIndexInitial() {
        this.rebuildIndex();
    }
}

