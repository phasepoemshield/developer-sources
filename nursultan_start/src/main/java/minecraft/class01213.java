/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06069
 */
package minecraft;

import minecraft.class01216;
import minecraft.class06069;

public class class01213
extends class01216 {
    @Override
    public String L(class06069 class060692) {
        return "1x2_se" + (class060692.y(1) + 1);
    }

    @Override
    public String i(class06069 class060692) {
        return "2x2_s1";
    }

    @Override
    public String u(class06069 class060692) {
        return "2x2_b" + (class060692.y(5) + 1);
    }

    @Override
    public String y(class06069 class060692, boolean bl) {
        if (bl) {
            return "1x2_d_stairs";
        }
        return "1x2_d" + (class060692.y(5) + 1);
    }

    @Override
    public String y(class06069 class060692) {
        return "1x1_as" + (class060692.y(4) + 1);
    }

    @Override
    public String N(class06069 class060692, boolean bl) {
        if (bl) {
            return "1x2_c_stairs";
        }
        return "1x2_c" + (class060692.y(4) + 1);
    }

    @Override
    public String N(class06069 class060692) {
        return "1x1_b" + (class060692.y(5) + 1);
    }
}

