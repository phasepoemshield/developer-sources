/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class09791
extends Record {
    private final int maxDepth;
    private final String subtreeKey;
    private final boolean fullStyle;

    public String L() {
        return this.subtreeKey;
    }

    public class09791(int n, String string, boolean bl) {
        this.maxDepth = n;
        this.subtreeKey = string;
        this.fullStyle = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09791.class, "maxDepth;subtreeKey;fullStyle", "maxDepth", "subtreeKey", "fullStyle"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09791.class, "maxDepth;subtreeKey;fullStyle", "maxDepth", "subtreeKey", "fullStyle"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09791.class, "maxDepth;subtreeKey;fullStyle", "maxDepth", "subtreeKey", "fullStyle"}, this);
    }

    public boolean u() {
        return this.fullStyle;
    }

    public int y() {
        return this.maxDepth;
    }

    public static class09791 N() {
        return new class09791(Integer.MAX_VALUE, null, false);
    }

    public class09791 N(boolean bl) {
        return new class09791(this.maxDepth, this.subtreeKey, bl);
    }

    public class09791 N(int n) {
        return new class09791(n, this.subtreeKey, this.fullStyle);
    }

    public class09791 N(String string) {
        return new class09791(this.maxDepth, string, this.fullStyle);
    }
}

