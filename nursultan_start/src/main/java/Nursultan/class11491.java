/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09250
 *  Nursultan.class09303
 *  Nursultan.class11938
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.msgpack.core.MessageBufferPacker
 *  org.msgpack.core.MessageUnpacker
 */
package Nursultan;

import Nursultan.class09250;
import Nursultan.class09303;
import Nursultan.class11488;
import Nursultan.class11938;
import java.io.IOException;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;

public class class11491
extends class11488 {
    public Object N_0;
    public static Object y_0;

    private void M() {
        this.B();
        class09250 class092502 = class11938.s().L((UUID)this.N_0).orElse(null);
        if (class092502 == null) {
            return;
        }
        try {
            class09303.N((class09250)class092502);
        }
        catch (RuntimeException runtimeException) {
            ((Logger)y_0).error("Failed to apply selected account {}", (Object)class092502.u(), (Object)runtimeException);
        }
    }

    public class11491(String string, int n) {
        super(string, n, null);
        this.B();
    }

    static {
        class11491.Z();
        y_0 = LogManager.getLogger(String.class);
    }

    private void B() {
    }

    private static void Z() {
        y_0 = null;
    }

    public UUID y() {
        this.B();
        return (UUID)this.N_0;
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

    public class11491 N(UUID uUID) {
        this.B();
        this.N_0 = uUID;
        return this;
    }

    @Override
    public void N(int n, MessageUnpacker messageUnpacker) throws IOException {
        this.B();
        if (!messageUnpacker.unpackBoolean()) {
            this.N_0 = null;
            return;
        }
        this.N_0 = new UUID(messageUnpacker.unpackLong(), messageUnpacker.unpackLong());
        this.M();
    }

    @Override
    public boolean d_() {
        this.B();
        return (UUID)this.N_0 == null;
    }
}

