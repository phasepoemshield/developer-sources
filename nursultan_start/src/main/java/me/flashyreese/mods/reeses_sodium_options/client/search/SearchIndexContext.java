/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 */
package me.flashyreese.mods.reeses_sodium_options.client.search;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.List;
import java.util.Map;
import me.flashyreese.mods.reeses_sodium_options.client.search.NgramGenerator;
import me.flashyreese.mods.reeses_sodium_options.client.search.SearchNormalizer;

interface SearchIndexContext<T> {
    public List<T> items();

    public int size();

    public SearchNormalizer normalizer();

    public int maxResults();

    public double minScore();

    public Map<String, Double> idfWeights();

    public int rerankLimit();

    public Map<String, IntArrayList> invertedIndex();

    public double rerankWeight();

    public List<Map<String, Integer>> documentTermCounts();

    public List<String> normalizedTexts();

    public NgramGenerator ngramGenerator();

    public boolean rerankWithEditDistance();
}

