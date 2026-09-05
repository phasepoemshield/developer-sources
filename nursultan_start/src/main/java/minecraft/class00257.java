/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00329
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00329;
import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07280;

public final class class00257
extends Record
implements class00381<class07280> {
    private final List<class00329> recipes;
    public static final class02362<ByteBuf, class00257> N = class02362.N((class02362)class00329.N.N_33(class02389.N()), class00257::N, class00257::new);

    public class00257(List<class00329> list) {
        this.recipes = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00257.class, "recipes", "recipes"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00257.class, "recipes", "recipes"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00257.class, "recipes", "recipes"}, this);
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public List<class00329> N() {
        return this.recipes;
    }

    public class02897<class00257> method_65080() {
        return class04248.NT;
    }
}

