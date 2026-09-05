/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class02705
 *  minecraft.class02903
 *  minecraft.class03762
 *  minecraft.class04493
 *  minecraft.class06510
 *  minecraft.class06514
 *  minecraft.class06548
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07329
 *  minecraft.class07769
 */
package minecraft;

import java.util.Map;
import minecraft.class01929;
import minecraft.class02484;
import minecraft.class02705;
import minecraft.class02903;
import minecraft.class03762;
import minecraft.class04493;
import minecraft.class06510;
import minecraft.class06514;
import minecraft.class06548;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07329;
import minecraft.class07769;

public class class06487
extends class07329 {
    private static class06584 L(class02903 class029032) {
        for (int i = 0; i < class029032.N(); ++i) {
            class06584 class065842 = class029032.N(i);
            if (!class065842.L(class02484.f)) continue;
            return class065842;
        }
        return class06584.E;
    }

    public class06487(class03762 class037622) {
        super("", class037622, class04493.N(Map.of(Character.valueOf('#'), class06510.method_8101((class07310)class06570.jk), Character.valueOf('x'), class06510.method_8101((class07310)class06570.vh)), (String[])new String[]{"###", "#x#", "###"}), new class06584((class07310)class06570.Gt));
    }

    public class06584 method_8116(class02903 class029032, class01929 class019292) {
        class06584 class065842 = class06487.L(class029032).L(1);
        class065842.N(class02484.S, (Object)class02705.field_49354);
        return class065842;
    }

    public boolean method_8115(class02903 class029032, class07299 class072992) {
        if (!super.method_8115(class029032, class072992)) {
            return false;
        }
        class06584 class065842 = class06487.L(class029032);
        if (class065842.R()) {
            return false;
        }
        class07769 class077692 = class06548.y((class06584)class065842, (class07299)class072992);
        if (class077692 == null) {
            return false;
        }
        if (class077692.u()) {
            return false;
        }
        return class077692.M < 4;
    }

    public class06514<class06487> method_8119() {
        return class06514.M;
    }

    public boolean method_8118() {
        return true;
    }
}

