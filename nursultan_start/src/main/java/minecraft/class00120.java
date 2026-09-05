/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class01885
 *  minecraft.class02086
 *  minecraft.class02091
 *  minecraft.class02102
 *  minecraft.class05220
 *  minecraft.class06202
 *  minecraft.class09013
 *  minecraft.class09022
 */
package minecraft;

import minecraft.class00103;
import minecraft.class00105;
import minecraft.class00125;
import minecraft.class00134;
import minecraft.class00392;
import minecraft.class01590;
import minecraft.class01885;
import minecraft.class02086;
import minecraft.class02091;
import minecraft.class02102;
import minecraft.class05220;
import minecraft.class06202;
import minecraft.class09013;
import minecraft.class09022;

class class00120
implements class00105<class09013> {
    class00120() {
    }

    @Override
    public class02102 N(class00134<?> class001342, class09013 class090132) {
        if (class090132.L().isPresent()) {
            class09022 class090222 = (class09022)class090132.L().get();
            class01885 class018852 = class01885.i().N(2);
            class018852.L().i();
            class00125 class001252 = new class00125(class06202.Nq(), 0, 0, class090132.R(), class090132.M(), class05220.N, class090132.y(), class090132.u(), class090132.i());
            class018852.N((class02102)class001252);
            class018852.N((class02102)class02091.N((class00392)class090222.y(), (class01590)class001342.method_64506()).N(class090222.L()).N(false).N(class02086.field_62119).N().N(class004052 -> class00103.N(class001342, class004052)));
            return class018852;
        }
        return new class00125(class06202.Nq(), 0, 0, class090132.R(), class090132.M(), class090132.y().d(), class090132.y(), class090132.u(), class090132.i());
    }
}

