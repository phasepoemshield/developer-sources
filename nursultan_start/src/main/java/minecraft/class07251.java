/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04247
 *  minecraft.class06685
 *  minecraft.class06702
 */
package minecraft;

import java.util.UUID;
import minecraft.class04247;
import minecraft.class06685;
import minecraft.class06702;
import minecraft.class07238;
import minecraft.class07239;
import minecraft.class07262;

class class07251
implements class07238 {
    private final class06685 N;
    private final class06702 y;

    class07251(class06685 class066852, class06702 class067022) {
        this.N = class066852;
        this.y = class067022;
    }

    public class07251(class04247 class042472) {
        this.N = (class06685)class042472.y(class06685.class);
        this.y = (class06702)class042472.y(class06702.class);
    }

    @Override
    public void N(UUID uUID, class07262 class072622) {
        class072622.N(uUID, this.N, this.y);
    }

    @Override
    public void N(class04247 class042472) {
        class042472.N((Enum)this.N);
        class042472.N((Enum)this.y);
    }

    @Override
    public class07239 N() {
        return class07239.field_29111;
    }
}

