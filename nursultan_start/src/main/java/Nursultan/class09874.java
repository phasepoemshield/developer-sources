/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09853;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;

final class class09874
extends Record {
    private final List<String> segments;

    class09874(List<String> list) {
        this.segments = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09874.class, "segments", "segments"}, this, object);
    }

    public String toString() {
        return String.join((CharSequence)"/", this.segments);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09874.class, "segments", "segments"}, this);
    }

    class09874 y(String string) {
        ArrayList<String> arrayList = new ArrayList<String>(this.segments.size() + 1);
        arrayList.addAll(this.segments);
        arrayList.add(string);
        return new class09874(List.copyOf(arrayList));
    }

    public List<String> N() {
        return this.segments;
    }

    static class09874 N(String string) {
        return new class09874(List.of(class09853.N(string, "rootKey")));
    }
}

