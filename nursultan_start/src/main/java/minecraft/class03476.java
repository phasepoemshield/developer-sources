/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 */
package minecraft;

import java.util.BitSet;
import java.util.Locale;
import java.util.Set;
import minecraft.class07211;

public class class03476 {
    private static final int N = class07211.values().length;
    private final BitSet y = new BitSet(N * N);

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(' ');
        for (class07211 class072112 : class07211.values()) {
            stringBuilder.append(' ').append(class072112.toString().toUpperCase(Locale.ROOT).charAt(0));
        }
        stringBuilder.append('\n');
        for (class07211 class072112 : class07211.values()) {
            stringBuilder.append(class072112.toString().toUpperCase(Locale.ROOT).charAt(0));
            for (class07211 class072113 : class07211.values()) {
                if (class072112 == class072113) {
                    stringBuilder.append("  ");
                    continue;
                }
                boolean bl = this.N(class072112, class072113);
                stringBuilder.append(' ').append(bl ? (char)'Y' : 'n');
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }

    public void N(boolean bl) {
        this.y.set(0, this.y.size(), bl);
    }

    public boolean N(class07211 class072112, class07211 class072113) {
        return this.y.get(class072112.ordinal() + class072113.ordinal() * N);
    }

    public void N(Set<class07211> set) {
        for (class07211 class072112 : set) {
            for (class07211 class072113 : set) {
                this.N(class072112, class072113, true);
            }
        }
    }

    public void N(class07211 class072112, class07211 class072113, boolean bl) {
        this.y.set(class072112.ordinal() + class072113.ordinal() * N, bl);
        this.y.set(class072113.ordinal() + class072112.ordinal() * N, bl);
    }
}

