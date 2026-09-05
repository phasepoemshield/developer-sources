/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.HashMap;
import java.util.Map;

public class class11979
extends Enum<class11979> {
    public static final /* enum */ class11979 REQUEST_LIST = new class11979(1);
    public static final /* enum */ class11979 REQUEST_PULL = new class11979(2);
    public static final /* enum */ class11979 REQUEST_PUSH = new class11979(3);
    public static Map staticFields_0e216cba4bdb837199db281281e4a83a3_3;
    private static final /* synthetic */ class11979[] $VALUES;
    public Integer fields_0e216cba4bdb837199db281281e4a83a3_0;
    public boolean fields_0e216cba4bdb837199db281281e4a83a3_init;

    private static /* synthetic */ class11979[] L() {
        return new class11979[]{REQUEST_LIST, REQUEST_PULL, REQUEST_PUSH};
    }

    private void M() {
        if (!this.fields_0e216cba4bdb837199db281281e4a83a3_init) {
            this.fields_0e216cba4bdb837199db281281e4a83a3_init = true;
            this.fields_0e216cba4bdb837199db281281e4a83a3_0 = 0;
        }
    }

    private class11979(int n2) {
        this.M();
        this.fields_0e216cba4bdb837199db281281e4a83a3_0 = n2;
    }

    static {
        $VALUES = class11979.L();
        staticFields_0e216cba4bdb837199db281281e4a83a3_3 = new HashMap();
        class11979[] class11979Array = class11979.values();
        staticFields_0e216cba4bdb837199db281281e4a83a3_3.put(Integer.valueOf(class11979Array[0].fields_0e216cba4bdb837199db281281e4a83a3_0), (Object)((Object)class11979Array[0]));
        staticFields_0e216cba4bdb837199db281281e4a83a3_3.put(Integer.valueOf(class11979Array[1].fields_0e216cba4bdb837199db281281e4a83a3_0), (Object)((Object)class11979Array[1]));
        staticFields_0e216cba4bdb837199db281281e4a83a3_3.put(Integer.valueOf(class11979Array[2].fields_0e216cba4bdb837199db281281e4a83a3_0), (Object)((Object)class11979Array[2]));
    }

    public static class11979[] values() {
        return (class11979[])$VALUES.clone();
    }

    public static class11979 valueOf(String string) {
        return Enum.valueOf(class11979.class, string);
    }

    private static void B() {
        REQUEST_LIST = null;
        REQUEST_PULL = null;
        REQUEST_PUSH = null;
        staticFields_0e216cba4bdb837199db281281e4a83a3_3 = null;
        $VALUES = null;
    }

    public int N() {
        return this.fields_0e216cba4bdb837199db281281e4a83a3_0;
    }

    public static class11979 N(int n) {
        return (class11979)((Object)staticFields_0e216cba4bdb837199db281281e4a83a3_3.get(n));
    }
}

