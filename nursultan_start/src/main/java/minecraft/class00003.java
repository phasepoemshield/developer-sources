/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11340
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00077
 *  minecraft.class01894
 *  minecraft.class04468
 *  minecraft.class07536
 */
package minecraft;

import Nursultan.class11340;
import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import minecraft.class00077;
import minecraft.class01894;
import minecraft.class04468;
import minecraft.class07536;

public class class00003<T>
implements class00077<T> {
    protected final Comparator<T> N;
    protected final class04468<T> y;

    public class00003(Function<T, Stream<class01894>> function, List<T> list) {
        ToIntFunction toIntFunction = class07536.R(list);
        this.N = Comparator.comparingInt(toIntFunction);
        this.y = class04468.N(list, function);
    }

    protected List<T> N(String string, String string2) {
        List list = this.y.y(string);
        List list2 = this.y.N(string2);
        return ImmutableList.copyOf((Iterator)new class11340(list.iterator(), list2.iterator(), this.N));
    }

    protected List<T> N(String string) {
        return this.y.N(string);
    }

    public List<T> method_4810(String string) {
        int n = string.indexOf(58);
        if (n == -1) {
            return this.N(string);
        }
        return this.N(string.substring(0, n).trim(), string.substring(n + 1).trim());
    }
}

