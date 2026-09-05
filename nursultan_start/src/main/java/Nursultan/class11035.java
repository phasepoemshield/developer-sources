/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.EntityESP
 *  Nursultan.class09093
 *  Nursultan.class11535
 *  Nursultan.class11791
 *  minecraft.class00717
 *  minecraft.class01054
 *  minecraft.class02484
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class06584
 *  minecraft.class07049
 *  org.joml.Vector4f
 */
package Nursultan;

import Nursultan.EntityESP;
import Nursultan.class09093;
import Nursultan.class11051;
import Nursultan.class11535;
import Nursultan.class11791;
import minecraft.class00717;
import minecraft.class01054;
import minecraft.class02484;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class07049;
import org.joml.Vector4f;

public class class11035
extends class11051<class00717> {
    public class11035(EntityESP entityESP, String string, boolean bl) {
        super(entityESP, string, bl);
    }

    @Override
    public void N(class01054 class010542, class09093 class090932, Vector4f vector4f, class00717 class007172) {
        boolean bl;
        class06584 class065842 = class007172.N();
        boolean bl2 = ((class11535)((EntityESP)this.N_0).Z_0).U() || ((class11535)((EntityESP)this.N_0).Z_2).U();
        boolean bl3 = ((class11535)((EntityESP)this.N_0).Z_1).U() || ((class11535)((EntityESP)this.N_0).Z_2).U();
        boolean bl4 = bl = class065842.y().method_58694(class02484.B) != null;
        if (bl2) {
            super.N(class010542, class090932, vector4f, class007172);
        }
        if (bl3 && (!bl2 || bl)) {
            if (bl2) {
                vector4f.y = Math.round(vector4f.y - 4.0f);
            }
            this.N(class010542, class090932, vector4f, class007172, this.N(class065842), this.y(class007172), this.u(class007172));
        }
    }

    public boolean test(class07049 class070492) {
        return class11791.M().test(class070492);
    }

    @Override
    public class05216 L(class00717 class007172) {
        class06584 class065842 = class007172.N();
        class05216 class052162 = class065842.Y().L();
        if (class065842.c() <= 1) {
            return class052162;
        }
        return class052162.i(String.valueOf(class06541.field_1080) + " x" + class065842.c());
    }

    private class05216 N(class06584 class065842) {
        class05216 class052162 = class065842.k().L().N(class065842.O().N());
        if (class065842.c() <= 1) {
            return class052162;
        }
        return class052162.i(String.valueOf(class06541.field_1080) + " x" + class065842.c());
    }
}

