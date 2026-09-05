/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09378
 *  Nursultan.class11938
 *  Nursultan.class11997
 *  org.msgpack.core.MessageBufferPacker
 *  org.msgpack.value.ArrayValue
 */
package Nursultan;

import Nursultan.class09378;
import Nursultan.class11490;
import Nursultan.class11531;
import Nursultan.class11938;
import Nursultan.class11997;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.value.ArrayValue;

public class class11506
extends class11490<class11997>
implements class11531 {
    public Object N_0;
    public boolean N_init;

    @Override
    public void L(class11997 class119972) {
        class11938.y().N(class119972.L(), class119972.y(), class119972.N());
    }

    public class11506(String string, int n) {
        super(string, n, class09378.MACROS);
        this.B();
    }

    private void B() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = false;
        }
    }

    @Override
    public class11506 N(boolean bl) {
        this.B();
        this.N_0 = bl;
        return this;
    }

    @Override
    public void y(class11997 class119972) {
        class11938.y().N(class119972.L());
    }

    @Override
    public class11997 N(int n, ArrayValue arrayValue) {
        return new class11997(arrayValue.get(0).asStringValue().asString(), arrayValue.get(1).asStringValue().asString(), arrayValue.get(2).asIntegerValue().asInt());
    }

    @Override
    public boolean y() {
        this.B();
        return (Boolean)this.N_0;
    }

    @Override
    public Object N(class11997 class119972) {
        return class119972.L();
    }

    @Override
    public void N(MessageBufferPacker messageBufferPacker, class11997 class119972) throws IOException {
        messageBufferPacker.packArrayHeader(3);
        messageBufferPacker.packString(class119972.L());
        messageBufferPacker.packString(class119972.y());
        messageBufferPacker.packInt(class119972.N());
    }

    @Override
    public List<class11997> N() {
        return class11938.y().L();
    }

    @Override
    public boolean N(class11997 class119972, class11997 class119973) {
        return class119972.N() == class119973.N() && Objects.equals(class119972.y(), class119973.y());
    }
}

