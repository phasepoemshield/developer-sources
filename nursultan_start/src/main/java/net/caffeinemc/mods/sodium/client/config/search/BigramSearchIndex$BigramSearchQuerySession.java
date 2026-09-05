/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet
 */
package net.caffeinemc.mods.sodium.client.config.search;

import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import net.caffeinemc.mods.sodium.client.config.search.BigramSearchIndex;
import net.caffeinemc.mods.sodium.client.config.search.BigramSearchIndex$BigramSources;
import net.caffeinemc.mods.sodium.client.config.search.BigramSearchIndex$SourceBigramCount;
import net.caffeinemc.mods.sodium.client.config.search.SearchQuerySession;
import net.caffeinemc.mods.sodium.client.config.search.TextSource;

class BigramSearchIndex$BigramSearchQuerySession
implements SearchQuerySession {
    final /* synthetic */ BigramSearchIndex this$0;

    BigramSearchIndex$BigramSearchQuerySession(BigramSearchIndex bigramSearchIndex) {
        this.this$0 = bigramSearchIndex;
    }

    @Override
    public List<? extends TextSource> getSearchResults(String string) {
        Object2IntMap.Entry entry2;
        if ((string = BigramSearchIndex.conditionText(string)).isEmpty()) {
            return List.of();
        }
        Object2IntLinkedOpenHashMap object2IntLinkedOpenHashMap = new Object2IntLinkedOpenHashMap(string.length());
        BigramSearchIndex.addLeadingBigram(string, (Object2IntLinkedOpenHashMap<String>)object2IntLinkedOpenHashMap);
        BigramSearchIndex.addInnerBigrams(string, (Object2IntMap<String>)object2IntLinkedOpenHashMap);
        float f = 1.0f / (float)(string.length() + 1);
        ReferenceLinkedOpenHashSet referenceLinkedOpenHashSet = new ReferenceLinkedOpenHashSet();
        float f2 = 0.0f;
        for (Object2IntMap.Entry entry2 : object2IntLinkedOpenHashMap.object2IntEntrySet()) {
            String string2 = (String)entry2.getKey();
            int n = entry2.getIntValue();
            float f3 = (float)n * f;
            BigramSearchIndex$BigramSources bigramSearchIndex$BigramSources = (BigramSearchIndex$BigramSources)this.this$0.bigramIndex.get((Object)string2);
            if (bigramSearchIndex$BigramSources == null) continue;
            float f4 = bigramSearchIndex$BigramSources.prevalenceInv;
            for (BigramSearchIndex$SourceBigramCount bigramSearchIndex$SourceBigramCount : bigramSearchIndex$BigramSources.counts) {
                TextSource textSource = bigramSearchIndex$SourceBigramCount.source;
                int n2 = bigramSearchIndex$SourceBigramCount.count;
                float f5 = f3 * ((float)Math.log(n2) + 1.0f) * f4;
                if (textSource.getText().toLowerCase(Locale.ROOT).startsWith(string.trim())) {
                    f5 *= 3.0f;
                } else if (textSource.getText().toLowerCase(Locale.ROOT).contains(string.trim())) {
                    f5 *= 2.0f;
                }
                if (n > n2) {
                    f5 *= (float)n2 / (float)(n2 + 2 * (n - n2));
                }
                if (referenceLinkedOpenHashSet.add((Object)textSource)) {
                    textSource.setScore(f5);
                    f2 = Math.max(f2, f5);
                    continue;
                }
                float f6 = textSource.getScore() + f5;
                textSource.setScore(f6);
                f2 = Math.max(f2, f6);
            }
        }
        float f7 = f2 * 0.2f;
        entry2 = new ObjectArrayList(referenceLinkedOpenHashSet.size());
        for (TextSource textSource : referenceLinkedOpenHashSet) {
            if (!(textSource.getScore() >= f7)) continue;
            entry2.add((Object)textSource);
        }
        entry2.sort(Comparator.comparing(TextSource::getScore).reversed());
        if (entry2.size() > 10) {
            entry2 = entry2.subList(0, 10);
        }
        return entry2;
    }
}

