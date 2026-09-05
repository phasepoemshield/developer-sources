/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11290
 *  Nursultan.class11291
 *  Nursultan.class11938
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.msgpack.core.MessageBufferPacker
 *  org.msgpack.core.MessageUnpacker
 */
package Nursultan;

import Nursultan.class11290;
import Nursultan.class11291;
import Nursultan.class11488;
import Nursultan.class11938;
import java.io.IOException;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;

public class class11521
extends class11488 {
    public Object N_0;
    public static Object y_0;

    private void L() {
        this.B();
        class11290 class112902 = class11938.G().N((UUID)this.N_0).orElse(null);
        if (class112902 == null || !class112902.N() || class112902.U() == null) {
            return;
        }
        try {
            new class11291().N(class112902.L(), class112902.U());
        }
        catch (RuntimeException runtimeException) {
            ((Logger)y_0).error("Failed to apply selected preset {}", (Object)class112902.i(), (Object)runtimeException);
        }
    }

    public class11521(String string, int n) {
        super(string, n, null);
        this.B();
    }

    static {
        class11521.U();
        y_0 = LogManager.getLogger(String.class);
    }

    private void B() {
    }

    private static void U() {
        y_0 = null;
    }

    public UUID y() {
        this.B();
        return (UUID)this.N_0;
    }

    @Override
    public void N(int n, MessageUnpacker messageUnpacker) throws IOException {
        this.B();
        if (!messageUnpacker.unpackBoolean()) {
            this.N_0 = null;
            return;
        }
        long l = messageUnpacker.unpackLong();
        long l2 = messageUnpacker.unpackLong();
        this.N_0 = new UUID(l, l2);
        this.L();
    }

    public class11521 N(UUID uUID) {
        this.B();
        this.N_0 = uUID;
        return this;
    }

    @Override
    public void N(MessageBufferPacker messageBufferPacker) throws IOException {
        this.B();
        if ((UUID)this.N_0 == null) {
            messageBufferPacker.packBoolean(false);
            return;
        }
        messageBufferPacker.packBoolean(true);
        messageBufferPacker.packLong(((UUID)this.N_0).getMostSignificantBits());
        messageBufferPacker.packLong(((UUID)this.N_0).getLeastSignificantBits());
    }

    @Override
    public boolean d_() {
        this.B();
        return (UUID)this.N_0 == null;
    }
}

