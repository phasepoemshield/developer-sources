/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07018
 */
package net.caffeinemc.mods.sodium.client.config.search;

import minecraft.class07018;
import net.caffeinemc.mods.sodium.client.config.search.SearchQuerySession;
import net.caffeinemc.mods.sodium.client.config.search.TextSource;

public abstract class SearchIndex {
    private final Runnable registerCallback;
    private class07018 builtLanguage;

    SearchIndex(Runnable runnable) {
        this.registerCallback = runnable;
    }

    public abstract void register(TextSource var1);

    public SearchQuerySession startQuery() {
        class07018 class070182 = class07018.y();
        if (this.builtLanguage == null) {
            this.builtLanguage = class070182;
            this.registerCallback.run();
            this.buildIndexInitial();
        } else if (this.builtLanguage != class070182) {
            this.builtLanguage = class070182;
            this.invalidateSourcesForRebuild();
            this.rebuildIndex();
        }
        return this.createQuery();
    }

    abstract void invalidateSourcesForRebuild();

    abstract void buildIndexInitial();

    abstract void rebuildIndex();

    protected abstract SearchQuerySession createQuery();
}

