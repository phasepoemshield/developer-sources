/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class01885
 *  minecraft.class02091
 *  minecraft.class02102
 *  minecraft.class03686
 *  minecraft.class04705
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01590;
import minecraft.class01885;
import minecraft.class02091;
import minecraft.class02102;
import minecraft.class03686;
import minecraft.class04705;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;

public class class05695
extends class05096 {
    private static final class00392 N = class00392.L((String)"outOfMemory.title");
    private static final class00392 y = class00392.L((String)"outOfMemory.message");
    private static final int L = 300;
    private final class03686 u = new class03686((class05096)this);

    public class05695() {
        super(N);
    }

    public void method_25426() {
        this.u.N(N, this.field_22793);
        this.u.L((class02102)class02091.N((class00392)y, (class01590)this.field_22793).N(300).N());
        class01885 class018852 = (class01885)this.u.y((class02102)class01885.i().N(8));
        class018852.N((class02102)class05362.method_46430((class00392)class05220.E, class053622 -> this.field_22787.N((class05096)new class04705())).N());
        class018852.N((class02102)class05362.method_46430((class00392)class00392.L((String)"menu.quit"), class053622 -> this.field_22787.NP()).N());
        this.u.method_48206(arg_0 -> ((class05695)this).method_37063(arg_0));
        this.method_48640();
    }

    public boolean method_25422() {
        return false;
    }

    public void method_48640() {
        this.u.N();
    }
}

