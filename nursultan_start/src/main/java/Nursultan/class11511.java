/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.BlockESP
 *  Nursultan.class11025
 *  Nursultan.class11938
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class04206
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.msgpack.core.MessageBufferPacker
 *  org.msgpack.core.MessageUnpacker
 */
package Nursultan;

import Nursultan.BlockESP;
import Nursultan.class11025;
import Nursultan.class11488;
import Nursultan.class11938;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class04206;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;

public class class11511
extends class11488 {
    public static Object N_0;

    public class11511(String string, int n) {
        super(string, n, null);
    }

    static {
        class11511.Z();
        N_0 = LogManager.getLogger(String.class);
    }

    private static void Z() {
        N_0 = null;
    }

    private BlockESP y() {
        return class11938.u().N();
    }

    @Override
    public void N(MessageBufferPacker messageBufferPacker) throws IOException {
        Collection var2 = this.y().m();
        messageBufferPacker.packArrayHeader(var2.size());
        for (class11025 class110252 : var2) {
            messageBufferPacker.packString(class04206.i.y((Object)class110252.N()).toString());
            messageBufferPacker.packInt(class110252.y());
        }
    }

    @Override
    public void N(int n, MessageUnpacker messageUnpacker) throws IOException {
        int n2 = messageUnpacker.unpackArrayHeader();
        ArrayList<class11025> arrayList = new ArrayList<class11025>(n2);
        for (int i = 0; i < n2; ++i) {
            try {
                String string = messageUnpacker.unpackString();
                int n3 = messageUnpacker.unpackInt();
                class01894 class018942 = class01894.L((String)string);
                if (class018942 == null || !class04206.i.u(class018942)) {
                    ((Logger)N_0).warn("Unknown block id '{}' in {}, skipped", (Object)string, (Object)this.u());
                    continue;
                }
                arrayList.add(new class11025((class00891)class04206.i.N(class018942), n3));
                continue;
            }
            catch (Exception exception) {
                ((Logger)N_0).warn("Skipped corrupt record #{} in {}: {}", (Object)i, (Object)this.u(), (Object)exception.getMessage());
            }
        }
        this.y().y(arrayList);
    }

    @Override
    public boolean d_() {
        return this.y().m().isEmpty();
    }
}

