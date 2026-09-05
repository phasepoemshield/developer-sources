/*
 * Decompiled with CFR 0.152.
 */
package me.flashyreese.mods.reeses_sodium_options.client.search;

import java.text.Normalizer;
import java.util.Locale;

public final class SearchNormalizer {
    private final boolean foldDiacritics;

    public SearchNormalizer(boolean bl) {
        this.foldDiacritics = bl;
    }

    public String normalize(String string) {
        int n;
        if (string == null || string.isEmpty()) {
            return "";
        }
        String string2 = Normalizer.normalize(string, Normalizer.Form.NFKC).toLowerCase(Locale.ROOT);
        if (this.foldDiacritics) {
            string2 = Normalizer.normalize(string2, Normalizer.Form.NFD).replaceAll("\\p{M}", "");
        }
        StringBuilder stringBuilder = new StringBuilder(string2.length());
        boolean bl = false;
        int n2 = string2.length();
        for (int i = 0; i < n2; i += Character.charCount(n)) {
            boolean bl2;
            n = string2.codePointAt(i);
            int n3 = Character.getType(n);
            boolean bl3 = Character.isWhitespace(n) || n3 == 12 || n3 == 13 || n3 == 14;
            boolean bl4 = bl2 = n3 == 23 || n3 == 20 || n3 == 21 || n3 == 22 || n3 == 24 || n3 == 29 || n3 == 30;
            if (bl3 || bl2) {
                if (bl) continue;
                stringBuilder.append(' ');
                bl = true;
                continue;
            }
            stringBuilder.appendCodePoint(n);
            bl = false;
        }
        String string3 = stringBuilder.toString().trim();
        return string3.isEmpty() ? "" : string3;
    }
}

