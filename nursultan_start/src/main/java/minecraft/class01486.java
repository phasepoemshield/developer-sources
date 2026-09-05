/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02450
 *  minecraft.class04995
 *  minecraft.class05402
 *  minecraft.class07070
 *  minecraft.class08447
 *  minecraft.class08467
 */
package minecraft;

import minecraft.class01484;
import minecraft.class01686;
import minecraft.class02450;
import minecraft.class04995;
import minecraft.class05402;
import minecraft.class07070;
import minecraft.class08447;
import minecraft.class08467;

public class class01486
extends class02450<class08447> {
    private void L(class08447 class084472) {
        if (class084472.NJ == class07070.field_6182) {
            this.U.i = -1.8f;
        } else {
            this.z.i = -1.8f;
        }
    }

    public class01486(class01686 class016862) {
        super(class016862);
    }

    protected void y(class08447 class084472) {
        float f = class084472.NX;
        if (f > 0.0f && class084472.p == class01484.field_25165) {
            class05402.N((class01686)this.z, (class01686)this.U, (class07070)class084472.NJ, (float)f, (float)class084472.P);
            return;
        }
        super.y((class08467)class084472);
    }

    public void N(boolean bl) {
        super.N(bl);
        this.m.U = bl;
        this.P.U = bl;
        this.s.U = bl;
        this.T.U = bl;
        this.b.U = bl;
    }

    public void method_2819(class08447 class084472) {
        super.method_2819((class08467)class084472);
        float f = 0.5235988f;
        float f2 = class084472.NX;
        class01484 class014842 = class084472.p;
        if (class014842 == class01484.field_25166) {
            float f3 = class084472.P / 60.0f;
            this.j.M = 0.5235988f + (float)Math.PI / 180 * class04995.m((double)(f3 * 30.0f)) * 10.0f;
            this.v.M = -0.5235988f - (float)Math.PI / 180 * class04995.P((double)(f3 * 30.0f)) * 10.0f;
            this.M.y += class04995.m((double)(f3 * 10.0f));
            this.M.L += class04995.m((double)(f3 * 40.0f)) + 0.4f;
            this.z.M = (float)Math.PI / 180 * (70.0f + class04995.P((double)(f3 * 40.0f)) * 10.0f);
            this.U.M = this.z.M * -1.0f;
            this.z.L += class04995.m((double)(f3 * 40.0f)) * 0.5f - 0.5f;
            this.U.L += class04995.m((double)(f3 * 40.0f)) * 0.5f + 0.5f;
            this.Z.L += class04995.m((double)(f3 * 40.0f)) * 0.35f;
        } else if (class014842 == class01484.field_25165 && f2 == 0.0f) {
            this.L(class084472);
        } else if (class014842 == class01484.field_22383) {
            class05402.N((class01686)this.z, (class01686)this.U, (class01686)this.M, (class084472.NJ == class07070.field_6183 ? 1 : 0) != 0);
        } else if (class014842 == class01484.field_22384) {
            class05402.N((class01686)this.z, (class01686)this.U, (float)class084472.a, (float)class084472.R, (class084472.NJ == class07070.field_6183 ? 1 : 0) != 0);
        } else if (class014842 == class01484.field_22385) {
            this.M.i = 0.5f;
            this.M.R = 0.0f;
            if (class084472.NJ == class07070.field_6182) {
                this.z.R = -0.5f;
                this.z.i = -0.9f;
            } else {
                this.U.R = 0.5f;
                this.U.i = -0.9f;
            }
        }
    }
}

