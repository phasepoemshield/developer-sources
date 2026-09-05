/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class03748
 *  minecraft.class04247
 *  minecraft.class06685
 *  minecraft.class06687
 *  minecraft.class06702
 */
package minecraft;

import java.util.UUID;
import minecraft.class00392;
import minecraft.class03748;
import minecraft.class04247;
import minecraft.class06685;
import minecraft.class06687;
import minecraft.class06702;
import minecraft.class07238;
import minecraft.class07239;
import minecraft.class07254;
import minecraft.class07262;

class class07244
implements class07238 {
    private final class00392 N;
    private final float y;
    private final class06685 L;
    private final class06702 u;
    private final boolean i;
    private final boolean R;
    private final boolean M;

    class07244(class06687 class066872) {
        this.N = class066872.y();
        this.y = class066872.L();
        this.L = class066872.u();
        this.u = class066872.i();
        this.i = class066872.R();
        this.R = class066872.M();
        this.M = class066872.B();
    }

    public class07244(class04247 class042472) {
        this.N = (class00392)class03748.u.decode((Object)class042472);
        this.y = class042472.readFloat();
        this.L = (class06685)class042472.y(class06685.class);
        this.u = (class06702)class042472.y(class06702.class);
        short s = class042472.readUnsignedByte();
        this.i = (s & 1) > 0;
        this.R = (s & 2) > 0;
        this.M = (s & 4) > 0;
    }

    @Override
    public void N(UUID uUID, class07262 class072622) {
        class072622.N(uUID, this.N, this.y, this.L, this.u, this.i, this.R, this.M);
    }

    @Override
    public void N(class04247 class042472) {
        class03748.u.encode((Object)class042472, (Object)this.N);
        class042472.writeFloat(this.y);
        class042472.N((Enum)this.L);
        class042472.N((Enum)this.u);
        class042472.writeByte(class07254.N(this.i, this.R, this.M));
    }

    @Override
    public class07239 N() {
        return class07239.field_29107;
    }
}

