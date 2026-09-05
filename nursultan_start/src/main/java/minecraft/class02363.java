/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00667
 *  minecraft.class07001
 *  minecraft.class07709
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.Optional;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class07001;
import minecraft.class07709;

class class02363
implements class02362<ByteBuf, Optional<class07001>> {
    class02363() {
    }

    public Optional<class07001> decode(ByteBuf byteBuf) {
        return Optional.ofNullable(class00667.Z((ByteBuf)byteBuf));
    }

    public void encode(ByteBuf byteBuf, Optional<class07001> optional) {
        class00667.N((ByteBuf)byteBuf, (class07709)optional.orElse(null));
    }
}

