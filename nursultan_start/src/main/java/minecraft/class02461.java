/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00751
 *  minecraft.class02362
 *  minecraft.class04206
 *  minecraft.class04247
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00751;
import minecraft.class02362;
import minecraft.class02477;
import minecraft.class04206;
import minecraft.class04247;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

class class02461<T>
implements class02477<T> {
    private final @Nullable Codec<T> i;
    private final class02362<? super class04247, T> R;
    private final boolean M;

    class02461(@Nullable Codec<T> codec, class02362<? super class04247, T> class023622, boolean bl) {
        this.i = codec;
        this.R = class023622;
        this.M = bl;
    }

    public String toString() {
        return class07536.N((class00751)class04206.NW, (Object)this);
    }

    @Override
    public boolean i() {
        return this.M;
    }

    @Override
    public @Nullable Codec<T> y() {
        return this.i;
    }

    @Override
    public class02362<? super class04247, T> R() {
        return this.R;
    }
}

