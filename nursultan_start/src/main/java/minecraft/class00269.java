/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07049
 *  minecraft.class07280
 *  minecraft.class08716
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07049;
import minecraft.class07280;
import minecraft.class08716;

public final class class00269
extends Record
implements class00381<class07280> {
    private final int id;
    private final class08716 values;
    private final boolean onGround;
    public static final class02362<class00667, class00269> N = class02362.N((class02362)class02389.B, class00269::N, (class02362)class08716.N, class00269::y, (class02362)class02389.y, class00269::L, class00269::new);

    public boolean L() {
        return this.onGround;
    }

    public class00269(int n, class08716 class087162, boolean bl) {
        this.id = n;
        this.values = class087162;
        this.onGround = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00269.class, "id;values;onGround", "id", "values", "onGround"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00269.class, "id;values;onGround", "id", "values", "onGround"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00269.class, "id;values;onGround", "id", "values", "onGround"}, this);
    }

    public class08716 y() {
        return this.values;
    }

    public static class00269 N(class07049 class070492) {
        return new class00269(class070492.method_5628(), new class08716(class070492.method_43390(), class070492.method_18798(), class070492.method_36454(), class070492.method_36455()), class070492.method_24828());
    }

    @Override
    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public int N() {
        return this.id;
    }

    @Override
    public class02897<class00269> method_65080() {
        return class04248.o;
    }
}

