/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02484
 *  minecraft.class02812
 *  minecraft.class02842
 *  minecraft.class03091
 *  minecraft.class04802
 *  minecraft.class05946
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06271
 *  minecraft.class06584
 *  minecraft.class06851
 *  minecraft.class08285
 *  minecraft.class08719
 *  minecraft.class08720
 *  minecraft.class08725
 */
package minecraft;

import java.util.Map;
import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02484;
import minecraft.class02812;
import minecraft.class02842;
import minecraft.class03091;
import minecraft.class04802;
import minecraft.class05946;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06271;
import minecraft.class06584;
import minecraft.class06851;
import minecraft.class08285;
import minecraft.class08719;
import minecraft.class08720;
import minecraft.class08725;

public class class04255
extends class06249<class08285, class03091> {
    private final class03091 N;
    private final class03091 y;
    private final class08720 L;
    private static final Map<class02842, class01894> u = Map.of(class02842.field_21082, class01894.y((String)"textures/entity/wolf/wolf_armor_crackiness_low.png"), class02842.field_21083, class01894.y((String)"textures/entity/wolf/wolf_armor_crackiness_medium.png"), class02842.field_21084, class01894.y((String)"textures/entity/wolf/wolf_armor_crackiness_high.png"));

    public class04255(class06252<class08285, class03091> class062522, class01140 class011402, class08720 class087202) {
        super(class062522);
        this.N = new class03091(class011402.N(class04802.ib));
        this.y = new class03091(class011402.N(class04802.iv));
        this.L = class087202;
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08285 class082852, float f, float f2) {
        class06584 class065842 = class082852.Z;
        class08725 class087252 = (class08725)class065842.method_58694(class02484.o);
        if (class087252 == null || class087252.u().isEmpty()) {
            return;
        }
        class03091 class030912 = class082852.NB ? this.y : this.N;
        this.L.N(class08719.field_54128, (class05946)class087252.u().get(), (class06271)class030912, (Object)class082852, class065842, class014212, class012372, n, class082852.l);
        this.N(class014212, class012372, n, class065842, (class06271<class08285>)class030912, class082852);
    }

    private void N(class01421 class014212, class01237 class012372, int n, class06584 class065842, class06271<class08285> class062712, class08285 class082852) {
        class02842 class028422 = class02812.y.N(class065842);
        if (class028422 == class02842.field_21081) {
            return;
        }
        class01894 class018942 = u.get(class028422);
        class012372.N(class062712, (Object)class082852, class014212, class06851.L((class01894)class018942), n, class01384.u, class082852.l, null);
    }
}

