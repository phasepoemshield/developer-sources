/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02556
 *  minecraft.class02560
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
import minecraft.class02556;
import minecraft.class02560;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07049;

public final class class02531
extends Record
implements class02560 {
    private final List<class02560> effects;
    public static final MapCodec<class02531> N = class02556.N((Codec)class02560.y, class02531::new, class02531::y);

    public class02531(List<class02560> list) {
        this.effects = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02531.class, "effects", "effects"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02531.class, "effects", "effects"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02531.class, "effects", "effects"}, this);
    }

    public List<class02560> y() {
        return this.effects;
    }

    public void N(class04782 class047822, int n, class02525 class025252, class07049 class070492, class06889 class068892) {
        Iterator<class02560> var6 = this.effects.iterator();
        while (var6.hasNext()) {
            var6.next().N(class047822, n, class025252, class070492, class068892);
        }
    }

    public MapCodec<class02531> N() {
        return N;
    }
}

