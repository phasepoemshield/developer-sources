/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01384
 *  minecraft.class01391
 *  minecraft.class01407
 *  minecraft.class01421
 *  minecraft.class01422
 *  minecraft.class01540
 *  minecraft.class03386
 *  minecraft.class05904
 *  minecraft.class05911
 *  minecraft.class05913
 *  minecraft.class06202
 *  minecraft.class06260
 *  minecraft.class08097
 *  minecraft.class08663
 */
package minecraft;

import minecraft.class01384;
import minecraft.class01391;
import minecraft.class01407;
import minecraft.class01421;
import minecraft.class01422;
import minecraft.class01540;
import minecraft.class03386;
import minecraft.class05904;
import minecraft.class05911;
import minecraft.class05913;
import minecraft.class06202;
import minecraft.class06260;
import minecraft.class08097;
import minecraft.class08663;
import minecraft.class08672;

public class class08680
extends class08672<class08663> {
    private final class08097 y;

    public class08680(class01422 class014222, class08097 class080972) {
        super(class014222);
        this.y = class080972;
    }

    @Override
    protected String y() {
        return "sign";
    }

    @Override
    protected void N(class08663 class086632, class01421 class014212) {
        ((class03386)class06202.Nq().i_5).v().N(class01540.field_60026);
        class014212.N(0.0f, -0.75f, 0.0f);
        class05913 class059132 = class05911.N((class05904)class086632.L());
        class06260 class062602 = class086632.y();
        class01391 class013912 = class059132.N(this.y, (class01407)this.N, arg_0 -> ((class06260)class062602).method_23500(arg_0));
        class062602.method_60879(class014212, class013912, 0xF000F0, class01384.u);
    }

    @Override
    public Class<class08663> N() {
        return class08663.class;
    }
}

