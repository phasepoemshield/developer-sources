/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09045
 *  Nursultan.class11067
 *  Nursultan.class11509
 *  Nursultan.class11512
 *  Nursultan.class11530
 *  Nursultan.class11536
 *  Nursultan.class11938
 *  Nursultan.class12002
 *  org.msgpack.core.MessagePack
 *  org.msgpack.core.MessageUnpacker
 *  org.msgpack.value.ArrayValue
 *  org.msgpack.value.ImmutableValue
 *  org.msgpack.value.Value
 */
package Nursultan;

import Nursultan.class09045;
import Nursultan.class11067;
import Nursultan.class11509;
import Nursultan.class11512;
import Nursultan.class11530;
import Nursultan.class11536;
import Nursultan.class11938;
import Nursultan.class12002;
import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ArrayValue;
import org.msgpack.value.ImmutableValue;
import org.msgpack.value.Value;

public class class11304 {
    private void L(MessageUnpacker messageUnpacker) throws IOException {
        int n = messageUnpacker.unpackArrayHeader();
        for (int i = 0; i < n; ++i) {
            this.N(messageUnpacker);
        }
    }

    static {
        class11304.N();
    }

    private void u() {
        for (class11067 class110672 : class11938.u().NN()) {
            class110672.N(false);
            class110672.N(class12002.UNKNOWN, 0, class09045.TOGGLE, true);
            for (class11536 var4 : class110672.w().values()) {
                this.N(var4);
            }
        }
    }

    private void y(MessageUnpacker messageUnpacker) throws IOException {
        int n = messageUnpacker.unpackArrayHeader();
        for (int i = 0; i < n; ++i) {
            int n2 = messageUnpacker.unpackArrayHeader();
            String string = messageUnpacker.unpackString();
            String string2 = messageUnpacker.unpackString();
            boolean bl = messageUnpacker.unpackBoolean();
            int n3 = messageUnpacker.unpackInt();
            messageUnpacker.unpackValue();
            int n4 = n2 >= 6 ? messageUnpacker.unpackInt() : 0;
            class11938.b().N(string).ifPresent(class091732 -> class091732.N(class12002.y((int)n3), n4, class09045.N((String)string2), bl));
        }
    }

    private void N(class11536<?> class115362) {
        class115362.s();
        for (class11536 var3 : class115362.w().values()) {
            this.N(var3);
        }
    }

    private /* synthetic */ void N(boolean bl, Value value, class11067 class110672) {
        try {
            if (bl) {
                class110672.N(true);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (!value.isNilValue()) {
            this.N((class11512)class110672, value.asArrayValue());
        }
    }

    private void N(MessageUnpacker messageUnpacker) throws IOException {
        messageUnpacker.unpackArrayHeader();
        String string = messageUnpacker.unpackString();
        boolean bl = messageUnpacker.unpackBoolean();
        messageUnpacker.unpackValue();
        ImmutableValue immutableValue = messageUnpacker.unpackValue();
        class11938.u().N(string).ifPresent(arg_0 -> this.N(bl, (Value)immutableValue, arg_0));
    }

    public void N(byte[] byArray) throws IllegalStateException {
        if (byArray == null || byArray.length == 0) {
            return;
        }
        byte[] byArray2 = class11509.N((byte[])byArray);
        this.u();
        try (MessageUnpacker messageUnpacker = MessagePack.newDefaultUnpacker((byte[])byArray2);){
            int n = messageUnpacker.unpackArrayHeader();
            messageUnpacker.unpackInt();
            this.L(messageUnpacker);
            if (n >= 3) {
                this.y(messageUnpacker);
            }
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Failed to deserialize preset (v1)", iOException);
        }
    }

    private void N(class11512 class115122, ArrayValue arrayValue) {
        Iterator var3 = arrayValue.iterator();
        while (var3.hasNext()) {
            ArrayValue arrayValue2 = ((Value)var3.next()).asArrayValue();
            String string = arrayValue2.get(0).asStringValue().asString();
            Value value = arrayValue2.get(1);
            Value value2 = arrayValue2.get(2);
            this.N(class115122, string).ifPresent(class115362 -> {
                try {
                    class11530.N((class11536)class115362, (Value)value);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                if (!value2.isNilValue()) {
                    this.N((class11512)class115362, value2.asArrayValue());
                }
            });
        }
    }

    private static void N() {
    }

    private Optional<class11536<?>> N(class11512 class115122, String string) {
        for (class11536 var4 : class115122.w().values()) {
            if (var4.P().N().equals(string)) {
                return Optional.of(var4);
            }
            Optional<class11536<?>> var5 = this.N((class11512)var4, string);
            if (!var5.isPresent()) continue;
            return var5;
        }
        return Optional.empty();
    }
}

