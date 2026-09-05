/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 */
package me.flashyreese.mods.reeses_sodium_options.client.search;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import me.flashyreese.mods.reeses_sodium_options.client.search.NgramGenerator;
import me.flashyreese.mods.reeses_sodium_options.client.search.SearchIndex$Builder;
import me.flashyreese.mods.reeses_sodium_options.client.search.SearchIndexContext;
import me.flashyreese.mods.reeses_sodium_options.client.search.SearchNormalizer;
import me.flashyreese.mods.reeses_sodium_options.client.search.SearchSession;

public final class SearchIndex<T>
implements SearchIndexContext<T> {
    private final List<T> items;
    private final List<String> normalizedTexts;
    private final List<Map<String, Integer>> documentTermCounts;
    private final Map<String, IntArrayList> invertedIndex;
    private final Map<String, Double> idfWeights;
    private final SearchNormalizer normalizer;
    private final NgramGenerator ngramGenerator;
    private final int maxResults;
    private final double minScore;
    private final boolean rerankWithEditDistance;
    private final int rerankLimit;
    private final double rerankWeight;

    @Override
    public List<T> items() {
        return this.items;
    }

    SearchIndex(SearchIndex$Builder<T> searchIndex$Builder) {
        this.normalizer = new SearchNormalizer(searchIndex$Builder.foldDiacritics);
        this.ngramGenerator = new NgramGenerator(2, 3, true);
        this.items = new ArrayList<T>(searchIndex$Builder.items.size());
        this.normalizedTexts = new ArrayList<String>(searchIndex$Builder.items.size());
        this.documentTermCounts = new ArrayList<Map<String, Integer>>(searchIndex$Builder.items.size());
        this.invertedIndex = new HashMap<String, IntArrayList>();
        this.idfWeights = new HashMap<String, Double>();
        this.maxResults = searchIndex$Builder.maxResults;
        this.minScore = searchIndex$Builder.minScore;
        this.rerankWithEditDistance = searchIndex$Builder.rerankWithEditDistance;
        this.rerankLimit = searchIndex$Builder.rerankLimit;
        this.rerankWeight = searchIndex$Builder.rerankWeight;
        this.build(searchIndex$Builder.items, searchIndex$Builder.extractSearchableText);
    }

    @Override
    public int size() {
        return this.items.size();
    }

    public static <T> SearchIndex$Builder<T> builder(Function<T, String> function) {
        return new SearchIndex$Builder<T>(function);
    }

    private void build(List<T> list, Function<T, String> function) {
        for (Object object : list) {
            String object2 = function.apply(object);
            String string2 = this.normalizer.normalize(object2);
            this.items.add(object);
            this.normalizedTexts.add(string2);
            HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
            if (!string2.isEmpty()) {
                List<String> list2 = this.ngramGenerator.generate(string2);
                HashSet<String> hashSet = new HashSet<String>(list2.size());
                for (String string3 : list2) {
                    hashMap.merge(string3, 1, Integer::sum);
                    if (!hashSet.add(string3)) continue;
                    this.invertedIndex.computeIfAbsent(string3, string -> new IntArrayList()).add(this.items.size() - 1);
                }
                for (String string3 : hashSet) {
                    this.idfWeights.merge(string3, 1.0, Double::sum);
                }
            }
            this.documentTermCounts.add(hashMap);
        }
        int n = Math.max(1, this.items.size());
        for (Map.Entry entry : this.idfWeights.entrySet()) {
            double d = (Double)entry.getValue();
            double d2 = Math.log(((double)n + 1.0) / (d + 1.0)) + 1.0;
            entry.setValue(d2);
        }
    }

    @Override
    public SearchNormalizer normalizer() {
        return this.normalizer;
    }

    public SearchSession<T> newSession(String string) {
        return new SearchSession(this, string);
    }

    @Override
    public int maxResults() {
        return this.maxResults;
    }

    @Override
    public double minScore() {
        return this.minScore;
    }

    @Override
    public Map<String, Double> idfWeights() {
        return this.idfWeights;
    }

    @Override
    public int rerankLimit() {
        return this.rerankLimit;
    }

    @Override
    public Map<String, IntArrayList> invertedIndex() {
        return this.invertedIndex;
    }

    @Override
    public double rerankWeight() {
        return this.rerankWeight;
    }

    @Override
    public List<Map<String, Integer>> documentTermCounts() {
        return this.documentTermCounts;
    }

    @Override
    public List<String> normalizedTexts() {
        return this.normalizedTexts;
    }

    @Override
    public NgramGenerator ngramGenerator() {
        return this.ngramGenerator;
    }

    @Override
    public boolean rerankWithEditDistance() {
        return this.rerankWithEditDistance;
    }
}

