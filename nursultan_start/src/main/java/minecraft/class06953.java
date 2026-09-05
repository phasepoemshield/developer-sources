/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02362
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class06955;

public final class class06953
extends Record
implements class06955 {
    private final class01894 id;
    private final class01894 texturePath;
    public static final Codec<class06953> N = class01894.N.xmap(class06953::new, class06953::N);
    public static final MapCodec<class06953> y = N.fieldOf("asset_id");
    public static final class02362<ByteBuf, class06953> L = class01894.y.N_10(class06953::new, class06953::N);

    public class06953(class01894 class018942) {
        this(class018942, class018942.N(string -> "textures/" + string + ".png"));
    }

    public class06953(class01894 class018942, class01894 class018943) {
        this.id = class018942;
        this.texturePath = class018943;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06953.class, "id;texturePath", "id", "texturePath"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06953.class, "id;texturePath", "id", "texturePath"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06953.class, "id;texturePath", "id", "texturePath"}, this);
    }

    @Override
    public class01894 y() {
        return this.texturePath;
    }

    @Override
    public class01894 N() {
        return this.id;
    }
}

