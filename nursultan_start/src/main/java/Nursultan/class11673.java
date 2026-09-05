/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11676;
import java.util.ArrayList;
import java.util.Collections;

public class class11673
extends class11676 {
    public class11673(String string) {
        super(string);
    }

    static {
        class11673.N();
    }

    @Override
    public int[] N(int n2) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < n2; ++i) {
            arrayList.add(i);
        }
        Collections.shuffle(arrayList);
        return arrayList.stream().mapToInt(n -> n).toArray();
    }

    private static void N() {
    }
}

