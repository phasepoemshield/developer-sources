/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03927
 *  minecraft.class04782
 *  minecraft.class06289
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03927;
import minecraft.class04782;
import minecraft.class06289;
import minecraft.class07209;

public final class class02687
extends Record {
    private final Optional<class06289> target;
    private final boolean tracked;
    public static final Codec<class02687> N = RecordCodecBuilder.create(instance -> instance.group((App)class06289.y.optionalFieldOf("target").forGetter(class02687::N), (App)Codec.BOOL.optionalFieldOf("tracked", (Object)true).forGetter(class02687::y)).apply(instance, class02687::new));
    public static final class02362<ByteBuf, class02687> y = class02362.N((class02362)class06289.L.N_33(class02389::N), class02687::N, (class02362)class02389.y, class02687::y, class02687::new);

    public class02687(Optional<class06289> optional, boolean bl) {
        this.target = optional;
        this.tracked = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02687.class, "target;tracked", "target", "tracked"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02687.class, "target;tracked", "target", "tracked"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02687.class, "target;tracked", "target", "tracked"}, this);
    }

    public boolean y() {
        return this.tracked;
    }

    public Optional<class06289> N() {
        return this.target;
    }

    public class02687 N(class04782 class047822) {
        if (!this.tracked || this.target.isEmpty()) {
            return this;
        }
        if (this.target.get().N() != class047822.method_27983()) {
            return this;
        }
        class07209 class072092 = this.target.get().y();
        if (!class047822.method_24794(class072092) || !class047822.method_19494().N(class03927.j, class072092)) {
            return new class02687(Optional.empty(), true);
        }
        return this;
    }
}

