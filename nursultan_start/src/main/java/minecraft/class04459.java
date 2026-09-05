/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class03748
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class03748;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07280;

public final class class04459
extends Record
implements class00381<class07280> {
    private final class00392 content;
    private final boolean overlay;
    public static final class02362<class04247, class04459> N = class02362.N((class02362)class03748.u, class04459::N, (class02362)class02389.y, class04459::y, class04459::new);

    public class04459(class00392 class003922, boolean bl) {
        this.content = class003922;
        this.overlay = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04459.class, "content;overlay", "content", "overlay"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04459.class, "content;overlay", "content", "overlay"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04459.class, "content;overlay", "content", "overlay"}, this);
    }

    public boolean i() {
        return true;
    }

    public boolean y() {
        return this.overlay;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class00392 N() {
        return this.content;
    }

    public class02897<class04459> method_65080() {
        return class04248.yi;
    }
}

