/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 */
package me.flashyreese.mods.reeses_sodium_options.client.search;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import minecraft.class01894;

public final class NgramGenerator {
    private static final int START = 2;
    private static final int END = 3;
    private final int minGram;
    private final int maxGram;
    private final boolean tokenizeOnLetterDigit;

    public NgramGenerator(int n, int n2, boolean bl) {
        if (n < 1 || n2 < n) {
            throw new IllegalArgumentException("Invalid gram range");
        }
        this.minGram = n;
        this.maxGram = n2;
        this.tokenizeOnLetterDigit = bl;
    }

    public List<String> generate(String string) {
        int n;
        if (string == null || string.isEmpty()) {
            return List.of();
        }
        String string2 = Normalizer.normalize(string, Normalizer.Form.NFKC).toLowerCase(Locale.ROOT).trim();
        if (string2.isEmpty()) {
            return List.of();
        }
        ArrayList<String> arrayList = new ArrayList<String>(Math.max(8, string2.length() * 2));
        if (!this.tokenizeOnLetterDigit) {
            this.addTokenGrams(string2, arrayList);
            return arrayList;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string2.length(); i += Character.charCount(n)) {
            n = string2.codePointAt(i);
            if (this.isTokenChar(n)) {
                stringBuilder.appendCodePoint(n);
                continue;
            }
            this.flushToken(stringBuilder, arrayList);
        }
        this.flushToken(stringBuilder, arrayList);
        return arrayList;
    }

    private void flushToken(StringBuilder stringBuilder, List<String> list) {
        if (stringBuilder.isEmpty()) {
            return;
        }
        this.addTokenGrams(stringBuilder.toString(), list);
        stringBuilder.setLength(0);
    }

    private void addTokenGrams(String string, List<String> list) {
        int n;
        int[] nArray = string.codePoints().toArray();
        int n2 = Math.max(1, this.maxGram - 1);
        int[] nArray2 = new int[n2 + nArray.length + 1];
        for (n = 0; n < n2; ++n) {
            nArray2[n] = 2;
        }
        System.arraycopy(nArray, 0, nArray2, n2, nArray.length);
        nArray2[nArray2.length - 1] = 3;
        for (n = this.minGram; n <= this.maxGram; ++n) {
            if (nArray2.length < n) continue;
            for (int i = 0; i <= nArray2.length - n; ++i) {
                if (NgramGenerator.allBoundary(nArray2, i, n)) continue;
                list.add(new String(nArray2, i, n));
            }
        }
    }

    private boolean isTokenChar(int n) {
        if (!this.tokenizeOnLetterDigit) {
            return true;
        }
        if (Character.isLetterOrDigit(n)) {
            return true;
        }
        if (n <= 127) {
            return class01894.N((char)((char)n));
        }
        return false;
    }

    private static boolean allBoundary(int[] nArray, int n, int n2) {
        for (int i = 0; i < n2; ++i) {
            int n3 = nArray[n + i];
            if (n3 == 2 || n3 == 3) continue;
            return false;
        }
        return true;
    }
}

