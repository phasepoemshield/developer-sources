/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01422
 *  minecraft.class01540
 *  minecraft.class02708
 *  minecraft.class03386
 *  minecraft.class03571
 *  minecraft.class04790
 *  minecraft.class05913
 *  minecraft.class06202
 *  minecraft.class06271
 *  minecraft.class06563
 *  minecraft.class08097
 *  minecraft.class08133
 *  minecraft.class08874
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01422;
import minecraft.class01540;
import minecraft.class02708;
import minecraft.class03386;
import minecraft.class03571;
import minecraft.class04790;
import minecraft.class05913;
import minecraft.class06202;
import minecraft.class06271;
import minecraft.class06563;
import minecraft.class08097;
import minecraft.class08133;
import minecraft.class08667;
import minecraft.class08672;
import minecraft.class08874;

public class class08664
extends class08672<class08667> {
    private final class08097 y;

    public class08664(class01422 class014222, class08097 class080972) {
        super(class014222);
        this.y = class080972;
    }

    @Override
    protected String y() {
        return "banner result";
    }

    @Override
    protected void N(class08667 class086672, class01421 class014212) {
        ((class03386)class06202.Nq().i_5).v().N(class01540.field_60026);
        class014212.N(0.0f, 0.25f, 0.0f);
        class08133 class081332 = ((class03386)class06202.Nq().i_5).L();
        class04790 class047902 = class081332.L();
        class03571.N((class08097)this.y, (class01421)class014212, (class01237)class047902, (int)0xF000F0, (int)class01384.u, (class06271)class086672.y(), (Object)Float.valueOf(0.0f), (class05913)class08874.B, (boolean)true, (class06563)class086672.L(), (class02708)class086672.u(), (boolean)false, null, (int)0);
        class081332.N();
    }

    @Override
    public Class<class08667> N() {
        return class08667.class;
    }
}

