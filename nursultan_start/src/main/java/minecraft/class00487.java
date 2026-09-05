/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00508
 *  minecraft.class00667
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00508;
import minecraft.class00667;
import org.jspecify.annotations.Nullable;

public final class class00487
extends Record {
    public final @Nullable class00508 stub;
    public final int flags;
    public final int redirect;
    public final int[] children;

    public int L() {
        return this.redirect;
    }

    class00487(@Nullable class00508 class005082, int n, int n2, int[] nArray) {
        this.stub = class005082;
        this.flags = n;
        this.redirect = n2;
        this.children = nArray;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00487.class, "stub;flags;redirect;children", "stub", "flags", "redirect", "children"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00487.class, "stub;flags;redirect;children", "stub", "flags", "redirect", "children"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00487.class, "stub;flags;redirect;children", "stub", "flags", "redirect", "children"}, this);
    }

    public int[] u() {
        return this.children;
    }

    public boolean y(IntSet intSet) {
        for (int n : this.children) {
            if (!intSet.contains(n)) continue;
            return false;
        }
        return true;
    }

    public int y() {
        return this.flags;
    }

    public @Nullable class00508 N() {
        return this.stub;
    }

    public void N(class00667 class006672) {
        class006672.writeByte(this.flags);
        class006672.N(this.children);
        if ((this.flags & 8) != 0) {
            class006672.L(this.redirect);
        }
        if (this.stub != null) {
            this.stub.N(class006672);
        }
    }

    public boolean N(IntSet intSet) {
        if ((this.flags & 8) != 0) {
            return !intSet.contains(this.redirect);
        }
        return true;
    }
}

