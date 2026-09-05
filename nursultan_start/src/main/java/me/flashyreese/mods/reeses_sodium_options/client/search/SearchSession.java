/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 */
package me.flashyreese.mods.reeses_sodium_options.client.search;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.flashyreese.mods.reeses_sodium_options.client.search.SearchIndexContext;
import me.flashyreese.mods.reeses_sodium_options.client.search.SearchResult;

public final class SearchSession<T> {
    private final SearchIndexContext<T> index;
    private final String query;

    public List<SearchResult<T>> results() {
        Object object;
        String string3;
        Double d;
        String string2 = this.index.normalizer().normalize(this.query);
        if (string2.isEmpty()) {
            return List.of();
        }
        List<String> list = this.index.ngramGenerator().generate(string2);
        if (list.isEmpty()) {
            return List.of();
        }
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for (String string3 : list) {
            hashMap.merge(string3, 1, Integer::sum);
        }
        double d2 = 0.0;
        for (Map.Entry object22 : hashMap.entrySet()) {
            d = this.index.idfWeights().get(object22.getKey());
            if (d == null) continue;
            d2 += d * (double)((Integer)object22.getValue()).intValue();
        }
        if (d2 == 0.0) {
            return List.of();
        }
        int n = this.index.size();
        boolean[] blArray = new boolean[n];
        d = new IntArrayList();
        for (String string3 : hashMap.keySet()) {
            IntArrayList n3 = this.index.invertedIndex().get(string3);
            if (n3 == null) continue;
            object = n3.iterator();
            while (object.hasNext()) {
                int map = (Integer)object.next();
                if (blArray[map]) continue;
                blArray[map] = true;
                d.add(map);
            }
        }
        if (d.isEmpty()) {
            return List.of();
        }
        ArrayList arrayList = new ArrayList();
        string3 = d.iterator();
        while (string3.hasNext()) {
            int n2 = (Integer)string3.next();
            object = this.index.normalizedTexts().get(n2);
            if (((String)object).isEmpty()) continue;
            Map<String, Integer> map = this.index.documentTermCounts().get(n2);
            double d3 = 0.0;
            for (Map.Entry entry : hashMap.entrySet()) {
                Integer n3 = map.get(entry.getKey());
                if (n3 == null) continue;
                double d4 = this.index.idfWeights().getOrDefault(entry.getKey(), 0.0);
                d3 += d4 * (double)Math.min((Integer)entry.getValue(), n3);
            }
            double d5 = d3 / d2;
            if (!((d5 = this.applyBoosts(d5, string2, (String)object)) >= this.index.minScore())) continue;
            arrayList.add(new SearchResult<T>(this.index.items().get(n2), d5, n2));
        }
        if (arrayList.isEmpty()) {
            return List.of();
        }
        arrayList.sort(Comparator.comparingDouble(SearchResult::score).reversed().thenComparingInt(SearchResult::documentId));
        if (this.index.rerankWithEditDistance()) {
            this.rerank(arrayList, string2);
        }
        if (arrayList.size() > this.index.maxResults()) {
            return new ArrayList<SearchResult<T>>(arrayList.subList(0, this.index.maxResults()));
        }
        return arrayList;
    }

    SearchSession(SearchIndexContext<T> searchIndexContext, String string) {
        this.index = searchIndexContext;
        this.query = string == null ? "" : string;
    }

    private void rerank(List<SearchResult<T>> list, String string) {
        int n = Math.min(this.index.rerankLimit(), list.size());
        if (n <= 1) {
            return;
        }
        ArrayList<SearchResult<T>> arrayList = new ArrayList<SearchResult<T>>(list.subList(0, n));
        arrayList.sort(Comparator.comparingDouble(searchResult -> {
            String string2 = this.index.normalizedTexts().get(searchResult.documentId());
            return -this.adjustedScore(searchResult.score(), string, string2);
        }).thenComparingInt(SearchResult::documentId));
        for (int i = 0; i < n; ++i) {
            list.set(i, (SearchResult)arrayList.get(i));
        }
    }

    private double applyBoosts(double d, String string, String string2) {
        double d2 = d;
        if (string2.equals(string)) {
            d2 += 0.6;
        } else if (string2.startsWith(string)) {
            d2 += 0.3;
        } else if (string2.contains(string)) {
            d2 += 0.15;
        }
        int n = Math.abs(string2.length() - string.length());
        int n2 = Math.max(1, Math.max(string2.length(), string.length()));
        return d2 -= 0.05 * ((double)n / (double)n2);
    }

    private double adjustedScore(double d, String string, String string2) {
        double d2 = this.normalizedLevenshtein(string, string2);
        return d + this.index.rerankWeight() * (1.0 - d2);
    }

    private double normalizedLevenshtein(String string, String string2) {
        int n;
        int[] nArray = string.codePoints().toArray();
        int[] nArray2 = string2.codePoints().toArray();
        int n2 = nArray.length;
        int n3 = nArray2.length;
        if (n2 == 0 && n3 == 0) {
            return 0.0;
        }
        int[] nArray3 = new int[n3 + 1];
        int[] nArray4 = new int[n3 + 1];
        for (n = 0; n <= n3; ++n) {
            nArray3[n] = n;
        }
        for (n = 1; n <= n2; ++n) {
            nArray4[0] = n;
            for (int i = 1; i <= n3; ++i) {
                int n4 = nArray[n - 1] == nArray2[i - 1] ? 0 : 1;
                int n5 = nArray3[i] + 1;
                int n6 = nArray4[i - 1] + 1;
                int n7 = nArray3[i - 1] + n4;
                nArray4[i] = Math.min(Math.min(n5, n6), n7);
            }
            int[] nArray5 = nArray3;
            nArray3 = nArray4;
            nArray4 = nArray5;
        }
        n = nArray3[n3];
        int n8 = Math.max(n2, n3);
        return (double)n / (double)n8;
    }
}

