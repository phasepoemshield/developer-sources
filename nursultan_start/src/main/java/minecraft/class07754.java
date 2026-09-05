/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.bytes.ByteArrayList
 *  minecraft.class07029
 *  minecraft.class07037
 */
package minecraft;

import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import minecraft.class07029;
import minecraft.class07037;
import minecraft.class07709;
import minecraft.class07723;
import minecraft.class07743;

class class07754
implements class07723 {
    private final ByteArrayList N = new ByteArrayList();

    public class07754(byte[] byArray) {
        this.N.addElements(0, byArray);
    }

    @Override
    public class07723 N(class07709 class077092) {
        if (class077092 instanceof class07037) {
            class07037 class070372 = (class07037)class077092;
            this.N.add(class070372.z());
            return this;
        }
        return new class07743(this.N).N(class077092);
    }

    @Override
    public class07709 N() {
        return new class07029(this.N.toByteArray());
    }
}

