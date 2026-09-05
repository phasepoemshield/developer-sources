/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02840
 *  minecraft.class03093
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07438
 *  minecraft.class08047
 *  minecraft.class08260
 *  minecraft.class08476
 *  minecraft.class08480
 *  minecraft.class08837
 *  minecraft.class08943
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02840;
import minecraft.class03093;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07438;
import minecraft.class08047;
import minecraft.class08260;
import minecraft.class08476;
import minecraft.class08480;
import minecraft.class08837;
import minecraft.class08943;

public class class02914
extends class02840<class08047, class08260, class03093> {
    private static final class01894 N = class01894.y((String)"textures/entity/witch.png");

    public class02914(class04832 class048322) {
        super(class048322, (class06078)new class03093(class048322.N(class04802.iz)), 0.5f);
        this.N((class06249)new class08480((class06252)this));
    }

    public class08260 method_55269() {
        return new class08260();
    }

    public void method_62354(class08047 class080472, class08260 class082602, float f) {
        super.method_62354((class07438)class080472, (class08476)class082602, f);
        class08837.N((class07438)class080472, (class08837)class082602, (class08943)this.L);
        class082602.N = class080472.method_5628();
        class06584 class065842 = class080472.method_6047();
        class082602.y = !class065842.R();
        class082602.L = class065842.N(class06570.ns);
    }

    public class01894 N(class08260 class082602) {
        return N;
    }
}

