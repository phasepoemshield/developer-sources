/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00667
 *  minecraft.class07709
 *  minecraft.class07726
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Supplier;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class07709;
import minecraft.class07726;

class class02387
implements class02362<ByteBuf, Optional<class07709>> {
    final /* synthetic */ Supplier N;

    class02387(Supplier supplier) {
        this.N = supplier;
    }

    public Optional<class07709> decode(ByteBuf byteBuf) {
        return Optional.ofNullable(class00667.N((ByteBuf)byteBuf, (class07726)((class07726)this.N.get())));
    }

    public void encode(ByteBuf byteBuf, Optional<class07709> optional) {
        class00667.N((ByteBuf)byteBuf, (class07709)optional.orElse(null));
    }
}

