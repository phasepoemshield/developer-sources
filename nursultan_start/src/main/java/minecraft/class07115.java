/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class02362
 *  minecraft.class04247
 *  minecraft.class07103
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import minecraft.class02362;
import minecraft.class04247;
import minecraft.class07103;

class class07115<T>
extends class07103<T> {
    final /* synthetic */ Function N;
    final /* synthetic */ Function y;

    class07115(boolean bl, Function function, Function function2) {
        this.N = function;
        this.y = function2;
        super(bl);
    }

    public MapCodec<T> method_29138() {
        return (MapCodec)this.N.apply(this);
    }

    public class02362<? super class04247, T> method_56179() {
        return (class02362)this.y.apply(this);
    }
}

