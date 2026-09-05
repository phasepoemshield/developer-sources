/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09378
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.msgpack.core.MessageBufferPacker
 *  org.msgpack.core.MessageUnpacker
 */
package Nursultan;

import Nursultan.class09378;
import Nursultan.class11531;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;

public abstract class class11488 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public boolean L_init;
    public static Object u_0;

    public class11488(String string, int n, class09378 class093782) {
        this.Z();
        this.L_0 = string;
        this.L_1 = n;
        this.L_2 = class093782;
    }

    static {
        class11488.z();
        u_0 = LogManager.getLogger(String.class);
    }

    private void Z() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_1 = 0;
        }
    }

    public class09378 i() {
        return (class09378)this.L_2;
    }

    private static void z() {
        u_0 = null;
    }

    public String u() {
        return (String)this.L_0;
    }

    public void y(MessageBufferPacker messageBufferPacker) throws IOException {
        messageBufferPacker.packInt(((Integer)this.L_1).intValue());
        class11488 var3 = this;
        if (var3 instanceof class11531) {
            class11531 class115312 = (class11531)((Object)var3);
            messageBufferPacker.packBoolean(class115312.y());
        }
        this.N(messageBufferPacker);
    }

    public abstract void N(int var1, MessageUnpacker var2) throws IOException;

    public abstract void N(MessageBufferPacker var1) throws IOException;

    public void N(MessageUnpacker messageUnpacker) throws IOException {
        int n = messageUnpacker.unpackInt();
        if (!this.N(n)) {
            ((Logger)u_0).warn("Unknown schema version {} in {}", (Object)n, (Object)((String)this.L_0));
            return;
        }
        class11488 var4 = this;
        if (var4 instanceof class11531) {
            ((class11531)((Object)var4)).N(messageUnpacker.unpackBoolean());
        }
        this.N(n, messageUnpacker);
    }

    public boolean N(int n) {
        return n == (Integer)this.L_1;
    }

    public int R() {
        return (Integer)this.L_1;
    }

    public abstract boolean d_();
}

