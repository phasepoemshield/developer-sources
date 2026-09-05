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
 *  minecraft.class07280
 *  minecraft.class08716
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class06681;
import minecraft.class07280;
import minecraft.class08716;

public final class class06663
extends Record
implements class00381<class07280> {
    private final int id;
    private final class08716 change;
    private final Set<class06681> relatives;
    public static final class02362<class00667, class06663> N = class02362.N((class02362)class02389.B, class06663::N, (class02362)class08716.N, class06663::y, class06681.field_54095, class06663::L, class06663::new);

    public Set<class06681> L() {
        return this.relatives;
    }

    public class06663(int n, class08716 class087162, Set<class06681> set) {
        this.id = n;
        this.change = class087162;
        this.relatives = set;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06663.class, "id;change;relatives", "id", "change", "relatives"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06663.class, "id;change;relatives", "id", "change", "relatives"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06663.class, "id;change;relatives", "id", "change", "relatives"}, this);
    }

    public class08716 y() {
        return this.change;
    }

    public static class06663 N(int n, class08716 class087162, Set<class06681> set) {
        return new class06663(n, class087162, set);
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public int N() {
        return this.id;
    }

    public class02897<class06663> method_65080() {
        return class04248.Nm;
    }
}

