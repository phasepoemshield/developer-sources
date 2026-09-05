/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Iterator;
import java.util.List;
import minecraft.class04779;

public final class class04749
extends Record
implements Iterable<class04779> {
    final List<class04779> levels;

    public class04749(List<class04779> list) {
        this.levels = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04749.class, "levels", "levels"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04749.class, "levels", "levels"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04749.class, "levels", "levels"}, this);
    }

    @Override
    public Iterator<class04779> iterator() {
        return this.levels.iterator();
    }

    public List<class04779> y() {
        return this.levels;
    }

    public boolean N() {
        return this.levels.isEmpty();
    }
}

