/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11882
 *  Nursultan.class11938
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.msgpack.core.MessageBufferPacker
 *  org.msgpack.core.MessageUnpacker
 *  org.msgpack.value.ImmutableValue
 *  org.msgpack.value.Value
 */
package Nursultan;

import Nursultan.class11488;
import Nursultan.class11530;
import Nursultan.class11536;
import Nursultan.class11882;
import Nursultan.class11938;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ImmutableValue;
import org.msgpack.value.Value;

public class class11516
extends class11488 {
    public static Object N_0;

    public class11516(String string, int n) {
        super(string, n, null);
    }

    static {
        class11516.B();
        N_0 = LogManager.getLogger(String.class);
    }

    private static void B() {
        N_0 = null;
    }

    private static List<class11536<?>> y(class11882 class118822) {
        ArrayList arrayList = new ArrayList();
        for (class11536 var3 : class118822.w().values()) {
            if (!var3.c_() || var3.N()) continue;
            arrayList.add(var3);
        }
        return arrayList;
    }

    @Override
    public void N(int n, MessageUnpacker messageUnpacker) throws IOException {
        int n2 = messageUnpacker.unpackArrayHeader();
        for (int i = 0; i < n2; ++i) {
            messageUnpacker.unpackArrayHeader();
            String string = messageUnpacker.unpackString();
            boolean bl = messageUnpacker.unpackBoolean();
            int n3 = messageUnpacker.unpackArrayHeader();
            class11882 class118822 = class11938.n().N(string).orElse(null);
            if (class118822 == null) {
                ((Logger)N_0).warn("Unknown autobuy item '{}' in {}, skipped", (Object)string, (Object)this.u());
            } else {
                class118822.N(bl);
            }
            for (int j = 0; j < n3; ++j) {
                messageUnpacker.unpackArrayHeader();
                String string2 = messageUnpacker.unpackString();
                ImmutableValue immutableValue = messageUnpacker.unpackValue();
                if (class118822 == null) continue;
                class11536 class115362 = class118822.L(string2);
                if (class115362 == null) {
                    ((Logger)N_0).warn("Unknown autobuy setting '{}' for '{}' in {}, skipped", (Object)string2, (Object)string, (Object)this.u());
                    continue;
                }
                try {
                    class11530.N(class115362, (Value)immutableValue);
                    continue;
                }
                catch (Exception exception) {
                    ((Logger)N_0).warn("Skipped corrupt autobuy setting '{}' in {}: {}", (Object)string2, (Object)this.u(), (Object)exception.getMessage());
                }
            }
        }
    }

    @Override
    public void N(MessageBufferPacker messageBufferPacker) throws IOException {
        List var2 = class11938.n().L().filter(class11516::N).toList();
        messageBufferPacker.packArrayHeader(var2.size());
        for (class11882 class118822 : var2) {
            List<class11536<?>> var5 = class11516.y(class118822);
            messageBufferPacker.packArrayHeader(3);
            messageBufferPacker.packString(class118822.L().N());
            messageBufferPacker.packBoolean(class118822.M());
            messageBufferPacker.packArrayHeader(var5.size());
            for (class11536<?> var7 : var5) {
                messageBufferPacker.packArrayHeader(2);
                messageBufferPacker.packString(var7.P().N());
                class11530.N(messageBufferPacker, var7);
            }
        }
    }

    private static boolean N(class11882 class118822) {
        return class118822.M() || class118822.w().values().stream().anyMatch(class11536::c_);
    }

    @Override
    public boolean d_() {
        return class11938.n().L().noneMatch(class11516::N);
    }
}

