/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09276
 *  io.netty.buffer.ByteBuf
 */
package Nursultan;

import Nursultan.class09276;
import Nursultan.class11940;
import Nursultan.class11951;
import io.netty.buffer.ByteBuf;
import java.io.IOException;

public class class11968
implements class11951<class09276> {
    private static String[] u;
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
        }
    }

    private static void M() {
        u = new String[1];
        class11968.u[0] = "Payload may not be larger than 32767 bytes";
    }

    public class11968() {
        this.L();
    }

    public class11968(int n, class11940 class119402) {
        this.L();
        this.N_0 = n;
        this.N_1 = class119402;
    }

    static {
        class11968.M();
    }

    public int y() {
        return (Integer)this.N_0;
    }

    @Override
    public void y(class11940 class119402) throws IOException {
        this.N_0 = (int)class119402.E();
        int n = class119402.y();
        if (n < 0 || n > Short.MAX_VALUE) {
            throw new IOException(u[0]);
        }
        this.N_1 = new class11940(class119402.N(n), class119402.z());
    }

    public class11940 N() {
        return (class11940)((Object)this.N_1);
    }

    @Override
    public void N(class11940 class119402) {
        class119402.L((Integer)this.N_0);
        ByteBuf byteBuf = ((class11940)((Object)this.N_1)).W();
        class119402.N(byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes());
    }

    @Override
    public void N(class09276 class092762) {
        try {
            class092762.N(this);
        }
        finally {
            if ((class11940)((Object)this.N_1) != null && ((class11940)((Object)this.N_1)).W().refCnt() > 0) {
                ((class11940)((Object)this.N_1)).s();
            }
        }
    }
}

