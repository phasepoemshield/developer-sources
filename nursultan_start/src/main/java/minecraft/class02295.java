/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class00683
 *  minecraft.class00704
 *  minecraft.class01134
 *  minecraft.class01894
 *  minecraft.class02745
 *  minecraft.class02795
 *  minecraft.class04832
 *  minecraft.class05564
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07438
 *  minecraft.class08464
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class00683;
import minecraft.class00704;
import minecraft.class01134;
import minecraft.class01894;
import minecraft.class02745;
import minecraft.class02795;
import minecraft.class04832;
import minecraft.class05564;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07438;
import minecraft.class08464;
import minecraft.class08476;

public class class02295
extends class02795<class00683, class08464, class05564> {
    private static final class01894 N = class01894.y((String)"textures/entity/llama/creamy.png");
    private static final class01894 i = class01894.y((String)"textures/entity/llama/white.png");
    private static final class01894 R = class01894.y((String)"textures/entity/llama/brown.png");
    private static final class01894 M = class01894.y((String)"textures/entity/llama/gray.png");

    public class02295(class04832 class048322, class01134 class011342, class01134 class011343) {
        super(class048322, (class06078)new class05564(class048322.N(class011342)), (class06078)new class05564(class048322.N(class011343)), 0.7f);
        this.N((class06249)new class02745((class06252)this, class048322.R(), class048322.B()));
    }

    public class08464 method_55269() {
        return new class08464();
    }

    public void method_62354(class00683 class006832, class08464 class084642, float f) {
        super.method_62354((class07438)class006832, (class08476)class084642, f);
        class084642.N = class006832.yN();
        class084642.y = !class006832.method_6109() && class006832.v();
        class084642.L = class006832.NZ();
        class084642.u = class006832.ND();
    }

    public class01894 N(class08464 class084642) {
        return switch (class084642.N) {
            default -> throw new MatchException(null, null);
            case class00704.field_41586 -> N;
            case class00704.field_41587 -> i;
            case class00704.field_41588 -> R;
            case class00704.field_41589 -> M;
        };
    }
}

