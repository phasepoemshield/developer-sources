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
 *  minecraft.class06681
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

public final class class08063
extends Record
implements class00381<class07280> {
    private final int id;
    private final class08716 change;
    private final Set<class06681> relatives;
    private final boolean onGround;
    public static final class02362<class00667, class08063> N = class02362.N((class02362)class02389.B, class08063::N, (class02362)class08716.N, class08063::y, (class02362)class06681.field_54095, class08063::L, (class02362)class02389.y, class08063::u, class08063::new);

    public Set<class06681> L() {
        return this.relatives;
    }

    public class08063(int n, class08716 class087162, Set<class06681> set, boolean bl) {
        this.id = n;
        this.change = class087162;
        this.relatives = set;
        this.onGround = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08063.class, "id;change;relatives;onGround", "id", "change", "relatives", "onGround"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08063.class, "id;change;relatives;onGround", "id", "change", "relatives", "onGround"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08063.class, "id;change;relatives;onGround", "id", "change", "relatives", "onGround"}, this);
    }

    public boolean u() {
        return this.onGround;
    }

    public class08716 y() {
        return this.change;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public static class08063 N(int n, class08716 class087162, Set<class06681> set, boolean bl) {
        return new class08063(n, class087162, set, bl);
    }

    public int N() {
        return this.id;
    }

    public class02897<class08063> method_65080() {
        return class04248.yZ;
    }
}

