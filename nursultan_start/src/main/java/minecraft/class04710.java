/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00061
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class02072
 *  minecraft.class02080
 *  minecraft.class02102
 *  minecraft.class03255
 *  minecraft.class03286
 *  minecraft.class04981
 *  minecraft.class05092
 *  minecraft.class05096
 *  minecraft.class05362
 *  minecraft.class06202
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class00061;
import minecraft.class00392;
import minecraft.class01590;
import minecraft.class02072;
import minecraft.class02080;
import minecraft.class02102;
import minecraft.class03255;
import minecraft.class03286;
import minecraft.class04725;
import minecraft.class04738;
import minecraft.class04981;
import minecraft.class05092;
import minecraft.class05096;
import minecraft.class05362;
import minecraft.class06202;
import org.slf4j.Logger;

class class04710
extends class03286
implements class00061 {
    static final Logger N = LogUtils.getLogger();
    static final class00392 y = class00392.L((String)"mco.configure.world.players.title");
    static final class00392 L = class00392.L((String)"mco.question");
    private static final int z = 8;
    final class05092 u;
    final class06202 i;
    final class01590 R;
    class04981 M;
    final class04738 B;

    public void method_48611(class03255 class032552) {
        this.B.method_57714(this.u.field_22789, this.N(), this.u.N.L());
        super.method_48611(class032552);
    }

    class04710(class05092 class050922, class06202 class062022, class04981 class049812) {
        super(y);
        this.u = class050922;
        this.i = class062022;
        this.R = class050922.method_64506();
        this.M = class049812;
        class02080 class020802 = this.Z.L(8).u(1);
        this.B = (class04738)class020802.N((class02102)new class04738(this, class050922.field_22789, this.N()), class02072.Z().u().y());
        class020802.N((class02102)class05362.method_46430((class00392)class00392.L((String)"mco.configure.world.buttons.invite"), class053622 -> class062022.N((class05096)new class04725(class050922, class049812))).N(), class02072.Z().R().y());
        this.N(class049812);
    }

    public int N() {
        return this.u.N() - 20 - 16;
    }

    public void N(class04981 class049812) {
        this.M = class049812;
        this.B.N(class049812);
    }
}

