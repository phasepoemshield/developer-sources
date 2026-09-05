/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02484
 *  minecraft.class02845
 *  minecraft.class03448
 *  minecraft.class06338
 *  minecraft.class06572
 *  minecraft.class06584
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02484;
import minecraft.class02845;
import minecraft.class03448;
import minecraft.class06338;
import minecraft.class06572;
import minecraft.class06584;
import minecraft.class08961;
import org.jspecify.annotations.Nullable;

public final class class08926
extends Record
implements class06572 {
    private final int index;
    public static final MapCodec<class08926> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.T.optionalFieldOf("index", (Object)0).forGetter(class08926::y)).apply(instance, class08926::new));

    public class08926(int n) {
        this.index = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08926.class, "index", "index"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08926.class, "index", "index"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08926.class, "index", "index"}, this);
    }

    public int y() {
        return this.index;
    }

    public MapCodec<class08926> N() {
        return N;
    }

    public float N(class06584 class065842, @Nullable class03448 class034482, @Nullable class08961 class089612, int n) {
        Float f;
        class02845 class028452 = (class02845)class065842.method_58694(class02484.j);
        if (class028452 != null && (f = class028452.N(this.index)) != null) {
            return f.floatValue();
        }
        return 0.0f;
    }
}

