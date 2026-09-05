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
import minecraft.class07280;

public final class class08068
extends Record
implements class00381<class07280> {
    private final long gameTime;
    private final long dayTime;
    private final boolean tickDayTime;
    public static final class02362<class00667, class08068> N = class02362.N((class02362)class02389.z, class08068::N, (class02362)class02389.z, class08068::y, (class02362)class02389.y, class08068::L, class08068::new);

    public boolean L() {
        return this.tickDayTime;
    }

    public class08068(long l, long l2, boolean bl) {
        this.gameTime = l;
        this.dayTime = l2;
        this.tickDayTime = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08068.class, "gameTime;dayTime;tickDayTime", "gameTime", "dayTime", "tickDayTime"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08068.class, "gameTime;dayTime;tickDayTime", "gameTime", "dayTime", "tickDayTime"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08068.class, "gameTime;dayTime;tickDayTime", "gameTime", "dayTime", "tickDayTime"}, this);
    }

    public long y() {
        return this.dayTime;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public long N() {
        return this.gameTime;
    }

    public class02897<class08068> method_65080() {
        return class04248.ND;
    }
}

