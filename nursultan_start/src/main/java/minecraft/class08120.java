/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01407
 *  minecraft.class01422
 *  minecraft.class01583
 *  minecraft.class01590
 *  minecraft.class07937
 */
package minecraft;

import java.util.Comparator;
import minecraft.class01407;
import minecraft.class01422;
import minecraft.class01583;
import minecraft.class01590;
import minecraft.class07937;
import minecraft.class08112;
import minecraft.class08142;

public class class08120 {
    public void N(class07937 class079372, class01422 class014222, class01590 class015902) {
        class08112 class081122 = class079372.L();
        class081122.N.sort(Comparator.comparing(class08142::B).reversed());
        for (class08142 class081422 : class081122.N) {
            class015902.N(class081422.u(), class081422.y(), class081422.L(), class081422.R(), false, class081422.N(), (class01407)class014222, class01583.field_33994, class081422.M(), class081422.i());
        }
        for (class08142 class081422 : class081122.y) {
            class015902.N(class081422.u(), class081422.y(), class081422.L(), class081422.R(), false, class081422.N(), (class01407)class014222, class01583.field_33993, class081422.M(), class081422.i());
        }
    }
}

