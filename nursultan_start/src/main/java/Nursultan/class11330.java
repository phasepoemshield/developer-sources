/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09173
 *  Nursultan.class11067
 *  Nursultan.class11509
 *  Nursultan.class11512
 *  Nursultan.class11530
 *  Nursultan.class11536
 *  org.msgpack.core.MessageBufferPacker
 *  org.msgpack.core.MessagePack
 */
package Nursultan;

import Nursultan.class09173;
import Nursultan.class11067;
import Nursultan.class11509;
import Nursultan.class11512;
import Nursultan.class11530;
import Nursultan.class11536;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;

public class class11330 {
    private static String[] u;
    public static Object N_0;

    private byte[] L(Iterable<class11067> iterable) throws IOException {
        class11067 class11067222;
        ArrayList<class11067> arrayList = new ArrayList<class11067>();
        for (class11067 class11067222 : iterable) {
            if (!this.N(class11067222)) continue;
            arrayList.add(class11067222);
        }
        List<class09173> var3 = this.y(iterable);
        class11067222 = MessagePack.newDefaultBufferPacker();
        try {
            class11067222.packArrayHeader(3);
            class11067222.packInt(1);
            class11067222.packArrayHeader(arrayList.size());
            for (class11067 class110673 : arrayList) {
                this.N((MessageBufferPacker)class11067222, class110673);
            }
            class11067222.packArrayHeader(var3.size());
            for (class09173 class091732 : var3) {
                this.N((MessageBufferPacker)class11067222, class091732);
            }
            Object object = class11067222.toByteArray();
            return object;
        }
        finally {
            if (class11067222 != null) {
                class11067222.close();
            }
        }
    }

    static {
        class11330.N();
        class11330.y();
        class11330.u();
    }

    private static void u() {
        N_0 = 1;
    }

    private static void y() {
        u = new String[1];
        class11330.u[0] = "Failed to serialize preset (v1)";
    }

    private List<class09173> y(Iterable<class11067> iterable) {
        ArrayList<class09173> arrayList = new ArrayList<class09173>();
        for (class11067 class110672 : iterable) {
            this.N(arrayList, class110672.R());
            this.N((class11512)class110672, arrayList);
        }
        return arrayList;
    }

    private void N(class11512 class115122, List<class09173> list) {
        for (class11536 var4 : class115122.w().values()) {
            this.N((class11512)var4, list);
        }
    }

    private void N(MessageBufferPacker messageBufferPacker, class11536<?> class115362) throws IOException {
        List var3 = class115362.w().values().stream().filter(this::N).toList();
        messageBufferPacker.packArrayHeader(3);
        messageBufferPacker.packString(class115362.P().N());
        class11530.N((MessageBufferPacker)messageBufferPacker, class115362);
        if (!var3.isEmpty()) {
            messageBufferPacker.packArrayHeader(var3.size());
            for (class11536 var5 : var3) {
                this.N(messageBufferPacker, var5);
            }
            return;
        }
        messageBufferPacker.packNil();
    }

    private boolean N(class11067 class110672) {
        if (class110672.U()) {
            return true;
        }
        for (class11536 var3 : class110672.w().values()) {
            if (!this.N(var3)) continue;
            return true;
        }
        return false;
    }

    private void N(MessageBufferPacker messageBufferPacker, class11067 class110672) throws IOException {
        List var3 = class110672.w().values().stream().filter(this::N).toList();
        messageBufferPacker.packArrayHeader(4);
        messageBufferPacker.packString(class110672.N());
        messageBufferPacker.packBoolean(class110672.U());
        messageBufferPacker.packNil();
        if (!var3.isEmpty()) {
            messageBufferPacker.packArrayHeader(var3.size());
            for (class11536 var5 : var3) {
                this.N(messageBufferPacker, var5);
            }
            return;
        }
        messageBufferPacker.packNil();
    }

    private static void N() {
    }

    private void N(List<class09173> list, class09173 class091732) {
        if (!class091732.B()) {
            list.add(class091732);
        }
    }

    private boolean N(class11536<?> class115362) {
        if (class115362.N()) {
            return false;
        }
        if (class115362.c_()) {
            return true;
        }
        for (class11536 var3 : class115362.w().values()) {
            if (!this.N(var3)) continue;
            return true;
        }
        return false;
    }

    private void N(MessageBufferPacker messageBufferPacker, class09173 class091732) throws IOException {
        messageBufferPacker.packArrayHeader(6);
        messageBufferPacker.packString(class091732.L());
        messageBufferPacker.packString(class091732.i().N());
        messageBufferPacker.packBoolean(class091732.N());
        messageBufferPacker.packInt(class091732.y().L());
        if (class091732.R() == null) {
            messageBufferPacker.packNil();
        } else {
            messageBufferPacker.packString(class091732.R());
        }
        messageBufferPacker.packInt(class091732.Z());
    }

    public byte[] N(Iterable<class11067> iterable) {
        try {
            byte[] byArray = this.L(iterable);
            return class11509.y((byte[])byArray);
        }
        catch (IOException iOException) {
            throw new IllegalStateException(u[0], iOException);
        }
    }
}

