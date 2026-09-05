/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class07049
 *  minecraft.class07084
 *  minecraft.class07280
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07049;
import minecraft.class07084;
import minecraft.class07280;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public final class class06648
extends Record
implements class00381<class07280> {
    private final int entityId;
    private final class03556<class07084> effect;
    public static final class02362<class04247, class06648> N = class02362.N((class02362)class02389.B, class06648::N, (class02362)class07084.y, class06648::y, class06648::new);

    public class06648(int n, class03556<class07084> class035562) {
        this.entityId = n;
        this.effect = class035562;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06648.class, "entityId;effect", "entityId", "effect"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06648.class, "entityId;effect", "entityId", "effect"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06648.class, "entityId;effect", "entityId", "effect"}, this);
    }

    public class03556<class07084> y() {
        return this.effect;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public int N() {
        return this.entityId;
    }

    public @Nullable class07049 N(class07299 class072992) {
        return class072992.method_8469(this.entityId);
    }

    public class02897<class06648> method_65080() {
        return class04248.Nv;
    }
}

