/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10041
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class10041;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class class09915
extends Record {
    private final class10041 textSnapshot;
    private final boolean caretVisible;
    static final class09915 N = new class09915(class10041.N, false);

    class09915(class10041 class100412, boolean bl) {
        this.textSnapshot = class100412;
        this.caretVisible = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09915.class, "textSnapshot;caretVisible", "textSnapshot", "caretVisible"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09915.class, "textSnapshot;caretVisible", "textSnapshot", "caretVisible"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09915.class, "textSnapshot;caretVisible", "textSnapshot", "caretVisible"}, this);
    }

    public boolean y() {
        return this.caretVisible;
    }

    public class10041 N() {
        return this.textSnapshot;
    }
}

