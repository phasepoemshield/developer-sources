/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01903
 *  minecraft.class01921
 *  minecraft.class03529
 *  minecraft.class05946
 */
package Nursultan;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class01903;
import minecraft.class01921;
import minecraft.class03529;
import minecraft.class05946;

public class class09540<T>
implements class01903<T> {
    final /* synthetic */ Predicate N;
    final /* synthetic */ class01921 y;

    public class09540(class01921 class019212, Predicate predicate) {
        this.y = class019212;
        this.N = predicate;
    }

    public Stream<class03529<T>> z() {
        return this.N().z().filter(class035292 -> this.N.test(class035292.N()));
    }

    public Optional<class03529<T>> N(class05946<T> class059462) {
        return this.N().N(class059462).filter(class035292 -> this.N.test(class035292.N()));
    }

    public class01921<T> N() {
        return this.y;
    }
}

