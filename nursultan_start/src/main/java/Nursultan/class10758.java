/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class01894
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06521
 *  minecraft.class07499
 *  minecraft.class07692
 */
package Nursultan;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import minecraft.class01894;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06521;
import minecraft.class07499;
import minecraft.class07692;

public class class10758 {
    private int N;
    private final ImmutableList.Builder<class05946<class05074>> y = ImmutableList.builder();
    private final ImmutableList.Builder<class05946<class06521<?>>> L = ImmutableList.builder();
    private Optional<class01894> u = Optional.empty();

    public static class10758 L(class05946<class06521<?>> class059462) {
        return new class10758().u(class059462);
    }

    public class10758 u(class05946<class06521<?>> class059462) {
        this.L.add(class059462);
        return this;
    }

    public class10758 y(class01894 class018942) {
        this.u = Optional.of(class018942);
        return this;
    }

    public class10758 y(int n) {
        this.N += n;
        return this;
    }

    public class10758 y(class05946<class05074> class059462) {
        this.y.add(class059462);
        return this;
    }

    public class07499 N() {
        return new class07499(this.N, (List)this.y.build(), (List)this.L.build(), this.u.map(class07692::new));
    }

    public static class10758 N(class05946<class05074> class059462) {
        return new class10758().y(class059462);
    }

    public static class10758 N(class01894 class018942) {
        return new class10758().y(class018942);
    }

    public static class10758 N(int n) {
        return new class10758().y(n);
    }
}

