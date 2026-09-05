/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11676;
import java.util.stream.IntStream;

public class class11671
extends class11676 {
    public class11671(String string, boolean bl) {
        super(string, bl);
    }

    static {
        class11671.N();
    }

    private static void N() {
    }

    @Override
    public int[] N(int n3) {
        return IntStream.iterate(0, n2 -> n2 < n3, n -> n + 1).toArray();
    }
}

