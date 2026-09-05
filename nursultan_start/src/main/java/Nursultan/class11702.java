/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11676;
import java.util.stream.IntStream;

public class class11702
extends class11676 {
    public class11702(String string) {
        super(string);
    }

    @Override
    public int[] N(int n2) {
        return IntStream.iterate(n2 - 1, n -> n >= 0, n -> n - 1).toArray();
    }
}

