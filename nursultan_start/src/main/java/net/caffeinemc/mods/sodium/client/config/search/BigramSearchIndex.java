/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2ReferenceMap
 *  it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.config.search;

import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2ReferenceMap;
import it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap;
import java.util.Locale;
import java.util.regex.Pattern;
import net.caffeinemc.mods.sodium.client.config.search.BigramSearchIndex$BigramSearchQuerySession;
import net.caffeinemc.mods.sodium.client.config.search.BigramSearchIndex$BigramSources;
import net.caffeinemc.mods.sodium.client.config.search.BigramSearchIndex$SourceBigramCount;
import net.caffeinemc.mods.sodium.client.config.search.SearchQuerySession;
import net.caffeinemc.mods.sodium.client.config.search.SourceStoringIndex;
import net.caffeinemc.mods.sodium.client.config.search.TextSource;
import org.jspecify.annotations.NonNull;

public class BigramSearchIndex
extends SourceStoringIndex {
    final Object2ReferenceMap<String, BigramSearchIndex$BigramSources> bigramIndex = new Object2ReferenceOpenHashMap();
    private static final Pattern NON_WORD = Pattern.compile("[\\W_]+", 256);

    public BigramSearchIndex(Runnable runnable) {
        super(runnable);
    }

    static void addLeadingBigram(String string, Object2IntLinkedOpenHashMap<String> object2IntLinkedOpenHashMap) {
        String string2 = " " + string.charAt(0);
        object2IntLinkedOpenHashMap.put((Object)string2, object2IntLinkedOpenHashMap.getInt((Object)string2) + 1);
    }

    static String conditionText(String string) {
        string = string.toLowerCase(Locale.ROOT);
        string = NON_WORD.matcher(string).replaceAll(" ");
        return string;
    }

    private static @NonNull Object2IntMap<String> countBigrams(String string) {
        int n = string.length();
        Object2IntLinkedOpenHashMap object2IntLinkedOpenHashMap = new Object2IntLinkedOpenHashMap(n + 1);
        BigramSearchIndex.addLeadingBigram(string, (Object2IntLinkedOpenHashMap<String>)object2IntLinkedOpenHashMap);
        BigramSearchIndex.addInnerBigrams(string, (Object2IntMap<String>)object2IntLinkedOpenHashMap);
        BigramSearchIndex.addTrailingBigram(string, n, (Object2IntLinkedOpenHashMap<String>)object2IntLinkedOpenHashMap);
        return object2IntLinkedOpenHashMap;
    }

    @Override
    public void rebuildIndex() {
        this.bigramIndex.clear();
        for (Object object2 : this.sources) {
            String string = ((TextSource)object2).getText();
            if (string == null) continue;
            if (string.isBlank()) {
                throw new IllegalStateException("Text source " + String.valueOf(object2) + " returned blank text");
            }
            string = BigramSearchIndex.conditionText(string).trim();
            for (Object2IntMap.Entry entry : BigramSearchIndex.countBigrams(string).object2IntEntrySet()) {
                String string2 = (String)entry.getKey();
                int n = entry.getIntValue();
                BigramSearchIndex$BigramSources bigramSearchIndex$BigramSources = (BigramSearchIndex$BigramSources)this.bigramIndex.computeIfAbsent((Object)string2, object -> new BigramSearchIndex$BigramSources());
                bigramSearchIndex$BigramSources.counts.add(new BigramSearchIndex$SourceBigramCount((TextSource)object2, n));
            }
        }
        for (Object object2 : this.bigramIndex.values()) {
            ((BigramSearchIndex$BigramSources)object2).prevalenceInv = (float)this.sources.size() / (float)((BigramSearchIndex$BigramSources)object2).counts.size();
        }
    }

    static void addInnerBigrams(String string, Object2IntMap<String> object2IntMap) {
        int n = string.length();
        for (int i = 0; i < n - 1; ++i) {
            String string2 = string.substring(i, i + 2);
            object2IntMap.put((Object)string2, object2IntMap.getInt((Object)string2) + 1);
        }
    }

    private static void addTrailingBigram(String string, int n, Object2IntLinkedOpenHashMap<String> object2IntLinkedOpenHashMap) {
        String string2 = string.charAt(n - 1) + " ";
        object2IntLinkedOpenHashMap.put((Object)string2, object2IntLinkedOpenHashMap.getInt((Object)string2) + 1);
    }

    @Override
    protected SearchQuerySession createQuery() {
        return new BigramSearchIndex$BigramSearchQuerySession(this);
    }
}

