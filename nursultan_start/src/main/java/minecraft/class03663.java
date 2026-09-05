/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10228
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import Nursultan.class10228;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class class03663
extends Record {
    private final List<class10228> lines;
    private final int width;

    public class03663(List<class10228> list, int n) {
        this.lines = list;
        this.width = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03663.class, "lines;width", "lines", "width"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03663.class, "lines;width", "lines", "width"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03663.class, "lines;width", "lines", "width"}, this);
    }

    public int y() {
        return this.width;
    }

    public List<class10228> N() {
        return this.lines;
    }
}

