/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00381
 *  minecraft.class01646
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04250
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class00381;
import minecraft.class01646;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04250;

public class class07839
implements class00381<class01646> {
    public static final class02362<ByteBuf, class07839> N = class00381.N(class07839::N, class07839::new);
    private final long y;

    public class07839(long l) {
        this.y = l;
    }

    private class07839(ByteBuf byteBuf) {
        this.y = byteBuf.readLong();
    }

    public void method_65081(class01646 class016462) {
        class016462.method_12697(this);
    }

    private void N(ByteBuf byteBuf) {
        byteBuf.writeLong(this.y);
    }

    public long N() {
        return this.y;
    }

    public class02897<class07839> method_65080() {
        return class04250.y;
    }
}

