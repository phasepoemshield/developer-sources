/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00753
 *  minecraft.class02362
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class07209
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00753;
import minecraft.class02362;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class07209;
import minecraft.class07299;

public final class class06289
extends Record {
    private final class05946<class07299> dimension;
    private final class07209 pos;
    public static final MapCodec<class06289> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07299.field_25178.fieldOf("dimension").forGetter(class06289::N), (App)class07209.field_25064.fieldOf("pos").forGetter(class06289::y)).apply(instance, class06289::N));
    public static final Codec<class06289> y = N.codec();
    public static final class02362<ByteBuf, class06289> L = class02362.N((class02362)class05946.y((class05946)class04227.yg), class06289::N, (class02362)class07209.field_48404, class06289::y, class06289::N);

    public class06289(class05946<class07299> class059462, class07209 class072092) {
        this.dimension = class059462;
        this.pos = class072092;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06289.class, "dimension;pos", "dimension", "pos"}, this, object);
    }

    public String toString() {
        return String.valueOf(this.dimension) + " " + String.valueOf(this.pos);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06289.class, "dimension;pos", "dimension", "pos"}, this);
    }

    public class07209 y() {
        return this.pos;
    }

    public class05946<class07299> N() {
        return this.dimension;
    }

    public static class06289 N(class05946<class07299> class059462, class07209 class072092) {
        return new class06289(class059462, class072092);
    }

    public boolean N(class05946<class07299> class059462, class07209 class072092, int n) {
        return this.dimension.equals(class059462) && this.pos.method_65076((class00753)class072092) <= n;
    }
}

