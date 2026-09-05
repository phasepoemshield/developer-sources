/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04247
 */
package minecraft;

import java.util.UUID;
import minecraft.class04247;
import minecraft.class07238;
import minecraft.class07239;
import minecraft.class07254;
import minecraft.class07262;

class class07240
implements class07238 {
    private final boolean N;
    private final boolean y;
    private final boolean L;

    class07240(boolean bl, boolean bl2, boolean bl3) {
        this.N = bl;
        this.y = bl2;
        this.L = bl3;
    }

    public class07240(class04247 class042472) {
        short s = class042472.readUnsignedByte();
        this.N = (s & 1) > 0;
        this.y = (s & 2) > 0;
        this.L = (s & 4) > 0;
    }

    @Override
    public void N(UUID uUID, class07262 class072622) {
        class072622.N(uUID, this.N, this.y, this.L);
    }

    @Override
    public void N(class04247 class042472) {
        class042472.writeByte(class07254.N(this.N, this.y, this.L));
    }

    @Override
    public class07239 N() {
        return class07239.field_29112;
    }
}

