/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02548
 *  minecraft.class02556
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07049
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Iterator;
import java.util.List;
import minecraft.class02525;
import minecraft.class02548;
import minecraft.class02556;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07049;

public final class class02539
extends Record
implements class02548 {
    private final List<class02548> effects;
    public static final MapCodec<class02539> N = class02556.N((Codec)class02548.L, class02539::new, class02539::y);

    public class02539(List<class02548> list) {
        this.effects = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02539.class, "effects", "effects"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02539.class, "effects", "effects"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02539.class, "effects", "effects"}, this);
    }

    public List<class02548> y() {
        return this.effects;
    }

    public void N(class02525 class025252, class07049 class070492, class06889 class068892, int n) {
        Iterator<class02548> var5 = this.effects.iterator();
        while (var5.hasNext()) {
            var5.next().N(class025252, class070492, class068892, n);
        }
    }

    public void N(class04782 class047822, int n, class02525 class025252, class07049 class070492, class06889 class068892, boolean bl) {
        Iterator<class02548> var7 = this.effects.iterator();
        while (var7.hasNext()) {
            var7.next().N(class047822, n, class025252, class070492, class068892, bl);
        }
    }

    public MapCodec<class02539> N() {
        return N;
    }
}

