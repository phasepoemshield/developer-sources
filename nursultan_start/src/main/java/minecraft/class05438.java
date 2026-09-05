/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 *  minecraft.class00405
 *  minecraft.class01028
 *  minecraft.class05232
 *  minecraft.class05936
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.UnaryOperator;
import minecraft.class00405;
import minecraft.class01028;
import minecraft.class05232;
import minecraft.class05936;

public class class05438 {
    private final String N;
    private final List<class00405> y;
    private final Int2IntFunction L;

    private class05438(String string, List<class00405> list, Int2IntFunction int2IntFunction) {
        this.N = string;
        this.y = ImmutableList.copyOf(list);
        this.L = int2IntFunction;
    }

    public String N() {
        return this.N;
    }

    public List<class01028> N(int n, int n2, boolean bl) {
        if (n2 == 0) {
            return ImmutableList.of();
        }
        ArrayList arrayList = Lists.newArrayList();
        class00405 class004052 = this.y.get(n);
        int n3 = n;
        for (int i = 1; i < n2; ++i) {
            int n4 = n + i;
            class00405 class004053 = this.y.get(n4);
            if (class004053.equals((Object)class004052)) continue;
            String string = this.N.substring(n3, n4);
            arrayList.add(bl ? class01028.y((String)string, (class00405)class004052, (Int2IntFunction)this.L) : class01028.a_((String)string, (class00405)class004052));
            class004052 = class004053;
            n3 = n4;
        }
        if (n3 < n + n2) {
            String string = this.N.substring(n3, n + n2);
            arrayList.add(bl ? class01028.y((String)string, (class00405)class004052, (Int2IntFunction)this.L) : class01028.a_((String)string, (class00405)class004052));
        }
        return bl ? Lists.reverse((List)arrayList) : arrayList;
    }

    public static class05438 N(class05936 class059362) {
        return class05438.N(class059362, n -> n, string -> string);
    }

    public static class05438 N(class05936 class059362, Int2IntFunction int2IntFunction, UnaryOperator<String> unaryOperator) {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList arrayList = Lists.newArrayList();
        class059362.N((class004053, string) -> {
            class05232.L((String)string, (class00405)class004053, (n, class004052, n2) -> {
                stringBuilder.appendCodePoint(n2);
                int n3 = Character.charCount(n2);
                for (int i = 0; i < n3; ++i) {
                    arrayList.add(class004052);
                }
                return true;
            });
            return Optional.empty();
        }, class00405.N);
        return new class05438((String)unaryOperator.apply(stringBuilder.toString()), arrayList, int2IntFunction);
    }
}

