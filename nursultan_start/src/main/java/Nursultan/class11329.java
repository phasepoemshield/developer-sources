/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09378
 *  Nursultan.class11481
 *  Nursultan.class11490
 *  Nursultan.class11531
 *  Nursultan.class11938
 *  minecraft.class06889
 *  org.msgpack.core.MessageBufferPacker
 *  org.msgpack.value.ArrayValue
 */
package Nursultan;

import Nursultan.class09378;
import Nursultan.class11481;
import Nursultan.class11490;
import Nursultan.class11531;
import Nursultan.class11938;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import minecraft.class06889;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.value.ArrayValue;

public class class11329
extends class11490<class11481>
implements class11531 {
    public Object N_0;
    public boolean N_init;

    public Object L(class11481 class114812) {
        return class114812.m();
    }

    private void M() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = false;
        }
    }

    public class11329(String string, int n) {
        super(string, n, class09378.WAYPOINTS);
        this.M();
    }

    public class11329 N(boolean bl) {
        this.M();
        this.N_0 = bl;
        return this;
    }

    public class11481 N(int n, ArrayValue arrayValue) {
        String string = arrayValue.get(0).asStringValue().asString();
        String string2 = arrayValue.get(1).asStringValue().asString();
        double d = arrayValue.get(2).asFloatValue().toDouble();
        double d2 = arrayValue.get(3).asFloatValue().toDouble();
        double d3 = arrayValue.get(4).asFloatValue().toDouble();
        return new class11481(string, new class06889(d, d2, d3), string2);
    }

    public void y(class11481 class114812) {
        class11938.E().N(class114812);
    }

    public boolean y() {
        this.M();
        return (Boolean)this.N_0;
    }

    public void N(MessageBufferPacker messageBufferPacker, class11481 class114812) throws IOException {
        class06889 class068892 = class114812.W();
        messageBufferPacker.packArrayHeader(5);
        messageBufferPacker.packString(class114812.m());
        messageBufferPacker.packString(class114812.s());
        messageBufferPacker.packDouble(class068892.M);
        messageBufferPacker.packDouble(class068892.B);
        messageBufferPacker.packDouble(class068892.Z);
    }

    public List<class11481> N() {
        return class11938.E().N().stream().filter(class11481::U).toList();
    }

    public void N(class11481 class114812) {
        class11938.E().N(class114812.m());
    }

    public boolean N(class11481 class114812, class11481 class114813) {
        return Objects.equals(class114812.s(), class114813.s()) && class114812.W().equals((Object)class114813.W());
    }
}

