/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01180
 *  minecraft.class03662
 *  minecraft.class06584
 *  minecraft.class07070
 *  minecraft.class07438
 *  minecraft.class08155
 *  minecraft.class08476
 *  minecraft.class08943
 */
package minecraft;

import minecraft.class01180;
import minecraft.class03662;
import minecraft.class06584;
import minecraft.class07070;
import minecraft.class07438;
import minecraft.class08155;
import minecraft.class08476;
import minecraft.class08898;
import minecraft.class08943;

public class class08827
extends class08476 {
    public class07070 NJ = class07070.field_6183;
    public class01180 No = class01180.field_3409;
    public final class08898 Nq = new class08898();
    public class06584 NK = class06584.E;
    public class01180 NV = class01180.field_3409;
    public final class08898 Ne = new class08898();
    public class06584 NH = class06584.E;
    public class08155 Nc = class08155.field_63399;
    public float NX;

    public class06584 i() {
        return this.NJ == class07070.field_6183 ? this.NK : this.NH;
    }

    public class08898 u() {
        return this.NJ == class07070.field_6183 ? this.Nq : this.Ne;
    }

    public class06584 y(class07070 class070702) {
        return class070702 == class07070.field_6183 ? this.NK : this.NH;
    }

    public float N(class07070 class070702) {
        return 0.0f;
    }

    public static void N(class07438 class074382, class08827 class088272, class08943 class089432, float f) {
        class088272.NJ = class074382.method_6068();
        class06584 class065842 = class074382.method_6047();
        class088272.Nc = class065842.e().N();
        class088272.NX = class074382.method_6055(f);
        class089432.N(class088272.Nq, class074382.method_61420(class07070.field_6183), class03662.field_4320, class074382);
        class089432.N(class088272.Ne, class074382.method_61420(class07070.field_6182), class03662.field_4323, class074382);
        class088272.NH = class074382.method_61420(class07070.field_6182).t();
        class088272.NK = class074382.method_61420(class07070.field_6183).t();
    }
}

