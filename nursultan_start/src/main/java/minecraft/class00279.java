/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00252
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class06521
 *  minecraft.class06584
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00252;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import minecraft.class06521;
import minecraft.class06584;

public final class class00279<T extends class06521<?>>
extends Record {
    private final List<class00252<T>> entries;

    public boolean L() {
        return this.entries.isEmpty();
    }

    public class00279(List<class00252<T>> list) {
        this.entries = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00279.class, "entries", "entries"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00279.class, "entries", "entries"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00279.class, "entries", "entries"}, this);
    }

    public List<class00252<T>> i() {
        return this.entries;
    }

    public int u() {
        return this.entries.size();
    }

    public static <T extends class06521<?>> class02362<class04247, class00279<T>> y() {
        return class02362.N((class02362)class00252.N().N_33(class02389.N()), class00279::i, class00279::new);
    }

    public class00279<T> y(class06584 class065842) {
        return new class00279<T>(this.entries.stream().filter(class002522 -> class002522.y().method_8093(class065842)).toList());
    }

    public static <T extends class06521<?>> class00279<T> N() {
        return new class00279<T>(List.of());
    }

    public boolean N(class06584 class065842) {
        return this.entries.stream().anyMatch(class002522 -> class002522.y().method_8093(class065842));
    }
}

