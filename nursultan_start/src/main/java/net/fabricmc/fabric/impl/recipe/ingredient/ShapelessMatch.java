/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06510
 *  minecraft.class06584
 */
package net.fabricmc.fabric.impl.recipe.ingredient;

import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import minecraft.class06510;
import minecraft.class06584;

public class ShapelessMatch {
    private final int[] match;
    private final BitSet bitSet;

    private ShapelessMatch(int n) {
        this.match = new int[n];
        this.bitSet = new BitSet(n * (n + 1));
    }

    public static boolean isMatch(List<class06584> list, List<class06510> list2) {
        int n;
        if (list.size() != list2.size()) {
            return false;
        }
        ShapelessMatch shapelessMatch = new ShapelessMatch(list2.size());
        for (n = 0; n < list.size(); ++n) {
            class06584 class065842 = list.get(n);
            for (int i = 0; i < list2.size(); ++i) {
                if (!list2.get(i).method_8093(class065842)) continue;
                shapelessMatch.bitSet.set((n + 1) * shapelessMatch.match.length + i);
            }
        }
        Arrays.fill(shapelessMatch.match, -1);
        for (n = 0; n < list2.size(); ++n) {
            if (!shapelessMatch.augment(n)) {
                return false;
            }
            shapelessMatch.bitSet.set(0, shapelessMatch.match.length, false);
        }
        return true;
    }

    private boolean augment(int n) {
        if (this.bitSet.get(n)) {
            return false;
        }
        this.bitSet.set(n);
        for (int i = 0; i < this.match.length; ++i) {
            if (!this.bitSet.get(this.match.length + n * this.match.length + i) || this.match[i] != -1 && !this.augment(this.match[i])) continue;
            this.match[i] = n;
            return true;
        }
        return false;
    }
}

