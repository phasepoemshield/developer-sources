/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class05630
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class06069
 *  minecraft.class06143
 *  minecraft.class06202
 */
package minecraft;

import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05630;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class06069;
import minecraft.class06143;
import minecraft.class06202;

public class class04075
extends class05848 {
    private static final class06069 N = class06069.u();
    private final class06143 y;
    private float L = 1.0f;

    public class04075(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class06143 class061432) {
        super(class034482, d, d2, d3, 0.5 - N.U(), d5, 0.5 - N.U(), class061432.method_74304());
        this.field_28786 = 0.96f;
        this.field_3844 = -0.1f;
        this.field_28787 = true;
        this.y = class061432;
        this.field_3869 *= (double)0.2f;
        if (d4 == 0.0 && d6 == 0.0) {
            this.field_3852 *= (double)0.1f;
            this.field_3850 *= (double)0.1f;
        }
        this.field_17867 *= 0.75f;
        this.field_3847 = (int)(8.0 / ((double)this.field_3840.z() * 0.8 + 0.2));
        this.field_3862 = false;
        this.method_74306(class061432);
        if (this.N()) {
            this.method_74308(0.0f);
        }
    }

    private boolean N() {
        class06202 class062022 = class06202.Nq();
        class04453 class044532 = (class04453)class062022.T_4;
        return class044532 != null && class044532.method_33571().L(this.field_3874, this.field_3854, this.field_3871) <= 9.0 && ((class05630)class062022.i_7).NS().N() && class044532.method_31550();
    }

    public class05846 method_74255() {
        return class05846.u;
    }

    public void method_3070() {
        super.method_3070();
        this.method_74306(this.y);
        this.field_62636 = this.N() ? 0.0f : class04995.B((float)0.05f, (float)this.field_62636, (float)this.L);
    }

    public void method_74308(float f) {
        super.method_74308(f);
        this.L = f;
    }
}

