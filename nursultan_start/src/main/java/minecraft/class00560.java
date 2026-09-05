/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class08051
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class08051;

public final class class00560
extends Record
implements class00381<class08051> {
    private final int slot;
    private final List<String> pages;
    private final Optional<String> title;
    public static final class02362<class00667, class00560> N = class02362.N((class02362)class02389.B, class00560::N, (class02362)class02389.y((int)1024).N_33(class02389.L((int)100)), class00560::y, (class02362)class02389.y((int)32).N_33(class02389::N), class00560::L, class00560::new);

    public Optional<String> L() {
        return this.title;
    }

    public class00560(int n, List<String> list, Optional<String> optional) {
        list = List.copyOf(list);
        this.slot = n;
        this.pages = list;
        this.title = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00560.class, "slot;pages;title", "slot", "pages", "title"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00560.class, "slot;pages;title", "slot", "pages", "title"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00560.class, "slot;pages;title", "slot", "pages", "title"}, this);
    }

    public List<String> y() {
        return this.pages;
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12053(this);
    }

    public int N() {
        return this.slot;
    }

    public class02897<class00560> method_65080() {
        return class04248.yV;
    }
}

