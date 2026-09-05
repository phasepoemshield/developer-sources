/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01885
 *  minecraft.class02102
 *  minecraft.class03695
 *  minecraft.class04430
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05304
 *  minecraft.class05362
 *  minecraft.class05630
 *  minecraft.class06541
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01885;
import minecraft.class02102;
import minecraft.class03695;
import minecraft.class04430;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05304;
import minecraft.class05362;
import minecraft.class05630;
import minecraft.class06541;

public class class06002
extends class04430 {
    private static final class00392 y = class00392.L((String)"multiplayerWarning.header").N(class06541.field_1067);
    private static final class00392 L = class00392.L((String)"multiplayerWarning.message");
    private static final class00392 u = class00392.L((String)"multiplayerWarning.check").y(-2039584);
    private static final class00392 i = y.L().i("\n").y(L);
    private final class05096 R;

    public class06002(class05096 class050962) {
        super(y, L, u, i);
        this.R = class050962;
    }

    protected class03695 N() {
        class01885 class018852 = class01885.i().N(8);
        class018852.N((class02102)class05362.method_46430((class00392)class05220.Z, class053622 -> {
            if (this.N.y()) {
                ((class05630)this.field_22787.i_7).v = true;
                ((class05630)this.field_22787.i_7).Np();
            }
            this.field_22787.N((class05096)new class05304(this.R));
        }).N());
        class018852.N((class02102)class05362.method_46430((class00392)class05220.U, class053622 -> this.method_25419()).N());
        return class018852;
    }

    public void method_25419() {
        this.field_22787.N(this.R);
    }
}

