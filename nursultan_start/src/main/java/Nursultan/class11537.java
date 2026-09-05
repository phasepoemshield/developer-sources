/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Nuker
 *  Nursultan.class09378
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

import Nursultan.Nuker;
import Nursultan.class09378;
import Nursultan.class11488;
import Nursultan.class11531;
import Nursultan.class11938;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class04206;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;

public class class11537
extends class11488
implements class11531 {
    public Object N_0;
    public boolean N_init;
    public static Object y_0;

    private void M() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = false;
        }
    }

    public class11537(String string, int n) {
        super(string, n, class09378.NUKER);
        this.M();
    }

    static {
        class11537.Z();
        y_0 = LogManager.getLogger(String.class);
    }

    private Nuker B() {
        return class11938.u().b();
    }

    private static void Z() {
        y_0 = null;
    }

    @Override
    public class11537 N(boolean bl) {
        this.M();
        this.N_0 = bl;
        return this;
    }

    @Override
    public boolean y() {
        this.M();
        return (Boolean)this.N_0;
    }

    @Override
    public void N(int n, MessageUnpacker messageUnpacker) throws IOException {
        Set var3 = this.B().m();
        int n2 = messageUnpacker.unpackArrayHeader();
        HashSet<class00891> hashSet = new HashSet<class00891>(n2);
        for (int i = 0; i < n2; ++i) {
            try {
                String string = messageUnpacker.unpackString();
                class01894 class018942 = class01894.L((String)string);
                if (class018942 == null || !class04206.i.u(class018942)) {
                    ((Logger)y_0).warn("Unknown block id '{}' in {}, skipped", (Object)string, (Object)this.u());
                    continue;
                }
                hashSet.add((class00891)class04206.i.N(class018942));
                continue;
            }
            catch (Exception exception) {
                ((Logger)y_0).warn("Skipped corrupt record #{} in {}: {}", (Object)i, (Object)this.u(), (Object)exception.getMessage());
            }
        }
        var3.removeIf(class008912 -> !hashSet.contains(class008912));
        var3.addAll(hashSet);
    }

    @Override
    public void N(MessageBufferPacker messageBufferPacker) throws IOException {
        Set var2 = this.B().m();
        messageBufferPacker.packArrayHeader(var2.size());
        for (class00891 class008912 : var2) {
            messageBufferPacker.packString(class04206.i.y((Object)class008912).toString());
        }
    }

    @Override
    public boolean d_() {
        return this.B().m().isEmpty();
    }
}

