/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09250
 *  Nursultan.class11166
 *  Nursultan.class11776
 *  Nursultan.class11938
 *  Nursultan.class11991
 *  org.msgpack.core.MessageBufferPacker
 *  org.msgpack.value.ArrayValue
 */
package Nursultan;

import Nursultan.class09250;
import Nursultan.class11166;
import Nursultan.class11490;
import Nursultan.class11776;
import Nursultan.class11938;
import Nursultan.class11991;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.value.ArrayValue;

public class class11495
extends class11490<class09250> {
    public static Object N_0;
    public static Object N_1;

    public Object L(class09250 class092502) {
        return class092502.R();
    }

    public class11495(String string, int n) {
        super(string, n, null);
    }

    static {
        class11495.B();
    }

    private static void B() {
        N_0 = 0;
        N_1 = 1;
    }

    @Override
    public class09250 N(int n, ArrayValue arrayValue) {
        if (arrayValue.get(0).asIntegerValue().asInt() == 0) {
            String string = arrayValue.get(1).asStringValue().asString();
            long l = arrayValue.get(2).asIntegerValue().asLong();
            boolean bl = arrayValue.get(3).asBooleanValue().getBoolean();
            boolean bl2 = arrayValue.get(4).asBooleanValue().getBoolean();
            UUID uUID = bl2 ? new UUID(arrayValue.get(5).asIntegerValue().asLong(), arrayValue.get(6).asIntegerValue().asLong()) : null;
            boolean bl3 = arrayValue.get(7).asBooleanValue().getBoolean();
            return new class09250((class11776)new class11991(string, uUID, bl), bl3, l);
        }
        String string = arrayValue.get(1).asStringValue().asString();
        long l = arrayValue.get(2).asIntegerValue().asLong();
        UUID uUID = new UUID(arrayValue.get(3).asIntegerValue().asLong(), arrayValue.get(4).asIntegerValue().asLong());
        boolean bl = arrayValue.get(5).asBooleanValue().getBoolean();
        byte[] byArray = arrayValue.get(6).asBinaryValue().asByteArray();
        boolean bl4 = arrayValue.get(7).asBooleanValue().getBoolean();
        return new class09250((class11776)new class11166(bl, uUID, string, byArray), bl4, l);
    }

    @Override
    public void y(class09250 class092502) {
        class11938.s().y(class092502);
    }

    @Override
    public void N(MessageBufferPacker messageBufferPacker, class09250 class092502) throws IOException {
        class11776 class117762 = class092502.i();
        if (class117762 instanceof class11991) {
            class11991 class119912 = (class11991)class117762;
            UUID uUID = class119912.i();
            messageBufferPacker.packArrayHeader(8);
            messageBufferPacker.packInt(0);
            messageBufferPacker.packString(class119912.u());
            messageBufferPacker.packLong(class092502.M());
            messageBufferPacker.packBoolean(class119912.R());
            messageBufferPacker.packBoolean(uUID != null);
            messageBufferPacker.packLong(uUID != null ? uUID.getMostSignificantBits() : 0L);
            messageBufferPacker.packLong(uUID != null ? uUID.getLeastSignificantBits() : 0L);
            messageBufferPacker.packBoolean(class092502.y());
            return;
        }
        class11166 class111662 = (class11166)class117762;
        byte[] byArray = class111662.R();
        messageBufferPacker.packArrayHeader(8);
        messageBufferPacker.packInt(1);
        messageBufferPacker.packString(class111662.u());
        messageBufferPacker.packLong(class092502.M());
        messageBufferPacker.packLong(class111662.y().getMostSignificantBits());
        messageBufferPacker.packLong(class111662.y().getLeastSignificantBits());
        messageBufferPacker.packBoolean(class111662.i());
        messageBufferPacker.packBinaryHeader(byArray.length);
        messageBufferPacker.writePayload(byArray);
        messageBufferPacker.packBoolean(class092502.y());
    }

    public void N(class09250 class092502) {
        class11938.s().N(class092502);
    }

    @Override
    public boolean N(class09250 class092502, class09250 class092503) {
        return class092502.L() == class092503.L() && class092502.u().equals(class092503.u()) && class092502.M() == class092503.M() && class092502.y() == class092503.y();
    }

    @Override
    public List<class09250> N() {
        return class11938.s().u();
    }
}

