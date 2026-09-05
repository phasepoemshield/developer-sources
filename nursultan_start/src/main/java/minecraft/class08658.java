/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09111
 *  Nursultan.class11340
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00003
 *  minecraft.class00077
 *  minecraft.class01894
 */
package minecraft;

import Nursultan.class09111;
import Nursultan.class11340;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import minecraft.class00003;
import minecraft.class00077;
import minecraft.class01894;

public class class08658<T>
extends class00003<T> {
    private final class00077<T> L;

    public class08658(Function<T, Stream<String>> function, Function<T, Stream<class01894>> function2, List<T> list) {
        super(function2, list);
        this.L = class00077.N(list, function);
    }

    protected List<T> N(String string) {
        return this.L.method_4810(string);
    }

    protected List<T> N(String string, String string2) {
        List list = this.y.y(string);
        List list2 = this.y.N(string2);
        List list3 = this.L.method_4810(string2);
        class09111 class091112 = new class09111(list2.iterator(), list3.iterator(), this.N);
        return ImmutableList.copyOf((Iterator)new class11340(list.iterator(), (Iterator)class091112, this.N));
    }
}

