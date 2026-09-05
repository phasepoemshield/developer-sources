/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09378
 *  Nursultan.class11938
 *  Nursultan.class12023
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.msgpack.core.MessageBufferPacker
 *  org.msgpack.core.MessageUnpacker
 *  org.msgpack.value.ImmutableValue
 *  org.msgpack.value.Value
 */
package Nursultan;

import Nursultan.class09378;
import Nursultan.class11472;
import Nursultan.class11488;
import Nursultan.class11530;
import Nursultan.class11531;
import Nursultan.class11536;
import Nursultan.class11938;
import Nursultan.class12023;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ImmutableValue;
import org.msgpack.value.Value;

public class class11514
extends class11488
implements class11531 {
    public static Object N_0;
    public Object y_0;
    public Object y_1;
    public boolean y_init;

    public class12023 L() {
        this.z();
        return (class12023)this.y_0;
    }

    public class11514(String string, int n) {
        super(string, n, class09378.CLIENT_SETTINGS);
        this.z();
        this.y_0 = class11938.B();
    }

    static {
        class11514.U();
        N_0 = LogManager.getLogger(String.class);
    }

    private static void U() {
        N_0 = null;
    }

    private void z() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_1 = false;
        }
    }

    @Override
    public boolean y() {
        this.z();
        return (Boolean)this.y_1;
    }

    @Override
    public class11514 N(boolean bl) {
        this.z();
        this.y_1 = bl;
        return this;
    }

    @Override
    public void N(MessageBufferPacker messageBufferPacker) throws IOException {
        this.z();
        ArrayList<class11536> arrayList = new ArrayList<class11536>();
        for (class11536 var4 : ((class12023)this.y_0).w().values()) {
            if (!var4.c_() || var4.N()) continue;
            arrayList.add(var4);
        }
        messageBufferPacker.packArrayHeader(arrayList.size());
        for (class11536 class115362 : arrayList) {
            messageBufferPacker.packArrayHeader(2);
            messageBufferPacker.packString(class115362.P().N());
            class11530.N(messageBufferPacker, class115362);
        }
        messageBufferPacker.packInt(((class11472)class11938.L_2).L());
    }

    @Override
    public void N(int n, MessageUnpacker messageUnpacker) throws IOException {
        this.z();
        int n2 = messageUnpacker.unpackArrayHeader();
        for (int i = 0; i < n2; ++i) {
            messageUnpacker.unpackArrayHeader();
            String string = messageUnpacker.unpackString();
            ImmutableValue immutableValue = messageUnpacker.unpackValue();
            class11536 class115362 = ((class12023)this.y_0).L(string);
            if (class115362 == null) {
                ((Logger)N_0).warn("Unknown client setting '{}' in {}, skipped", (Object)string, (Object)this.u());
                continue;
            }
            try {
                class11530.N(class115362, (Value)immutableValue);
                continue;
            }
            catch (Exception exception) {
                ((Logger)N_0).warn("Skipped corrupt client setting '{}' in {}: {}", (Object)string, (Object)this.u(), (Object)exception.getMessage());
            }
        }
        if (messageUnpacker.hasNext()) {
            ((class11472)class11938.L_2).L(messageUnpacker.unpackInt());
        }
    }

    @Override
    public boolean d_() {
        this.z();
        return ((class11472)class11938.L_2).L() == -1 && ((class12023)this.y_0).w().values().stream().noneMatch(class11536::c_);
    }
}

