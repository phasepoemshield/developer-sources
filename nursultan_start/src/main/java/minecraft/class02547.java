/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02536
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Iterator;
import java.util.List;
import minecraft.class02536;
import minecraft.class02556;
import minecraft.class06069;

public final class class02547
extends Record
implements class02536 {
    private final List<class02536> effects;
    public static final MapCodec<class02547> N = class02556.N(class02536.y, class02547::new, class02547::y);

    public class02547(List<class02536> list) {
        this.effects = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02547.class, "effects", "effects"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02547.class, "effects", "effects"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02547.class, "effects", "effects"}, this);
    }

    public List<class02536> y() {
        return this.effects;
    }

    public float N(int n, class06069 class060692, float f) {
        Iterator<class02536> var4 = this.effects.iterator();
        while (var4.hasNext()) {
            f = var4.next().N(n, class060692, f);
        }
        return f;
    }

    public MapCodec<class02547> N() {
        return N;
    }
}

