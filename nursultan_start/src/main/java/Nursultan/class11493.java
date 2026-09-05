/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09332
 *  Nursultan.class09378
 *  Nursultan.class11938
 *  org.msgpack.core.MessageBufferPacker
 *  org.msgpack.value.ArrayValue
 */
package Nursultan;

import Nursultan.class09332;
import Nursultan.class09378;
import Nursultan.class11490;
import Nursultan.class11531;
import Nursultan.class11938;
import java.io.IOException;
import java.util.List;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.value.ArrayValue;

public class class11493
extends class11490<class09332>
implements class11531 {
    public Object N_0;
    public boolean N_init;

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = false;
        }
    }

    public Object L(class09332 class093322) {
        return class093322.y();
    }

    public class11493(String string, int n) {
        super(string, n, class09378.FRIENDS);
        this.L();
    }

    @Override
    public class11493 N(boolean bl) {
        this.L();
        this.N_0 = bl;
        return this;
    }

    @Override
    public void y(class09332 class093322) {
        class11938.t().N(class093322.y(), class093322.N());
    }

    @Override
    public class09332 N(int n, ArrayValue arrayValue) {
        return new class09332(arrayValue.get(0).asStringValue().asString(), arrayValue.get(1).asIntegerValue().asLong());
    }

    @Override
    public boolean y() {
        this.L();
        return (Boolean)this.N_0;
    }

    @Override
    public List<class09332> N() {
        return class11938.t().y();
    }

    @Override
    public void N(MessageBufferPacker messageBufferPacker, class09332 class093322) throws IOException {
        messageBufferPacker.packArrayHeader(2);
        messageBufferPacker.packString(class093322.y());
        messageBufferPacker.packLong(class093322.N());
    }

    public void N(class09332 class093322) {
        class11938.t().y(class093322.y());
    }

    @Override
    public boolean N(class09332 class093322, class09332 class093323) {
        return class093322.N() == class093323.N();
    }
}

