/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11940
 *  Nursultan.class11951
 *  io.netty.buffer.ByteBuf
 */
package Nursultan;

import Nursultan.class09263;
import Nursultan.class11940;
import Nursultan.class11951;
import io.netty.buffer.ByteBuf;
import java.io.IOException;

public class class09270
implements class11951<class09263> {
    private static String[] y;
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = (byte)0;
        }
    }

    public class09270(byte by, class11940 class119402) {
        this.L();
        this.N_0 = by;
        this.N_1 = class119402;
    }

    public class09270() {
        this.L();
    }

    static {
        class09270.R();
    }

    public byte y() {
        return (Byte)this.N_0;
    }

    public void y(class11940 class119402) throws IOException {
        this.N_0 = class119402.E();
        int n = class119402.y();
        if (n < 0 || n > Short.MAX_VALUE) {
            throw new IOException(y[0]);
        }
        this.N_1 = new class11940(class119402.N(n), class119402.z());
    }

    public class11940 N() {
        return (class11940)this.N_1;
    }

    public void N(class09263 class092632) {
        try {
            class092632.N(this);
        }
        finally {
            if ((class11940)this.N_1 != null && ((class11940)this.N_1).W().refCnt() > 0) {
                ((class11940)this.N_1).s();
            }
        }
    }

    public void N(class11940 class119402) {
        class119402.L((int)((Byte)this.N_0).byteValue());
        ByteBuf byteBuf = ((class11940)this.N_1).W();
        class119402.N(byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes());
    }

    private static void R() {
        y = new String[1];
        class09270.y[0] = "Payload may not be larger than 32767 bytes";
    }
}

