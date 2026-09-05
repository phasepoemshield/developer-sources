/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11647
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class02484
 *  minecraft.class04802
 *  minecraft.class05564
 *  minecraft.class05946
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06271
 *  minecraft.class06584
 *  minecraft.class08464
 *  minecraft.class08699
 *  minecraft.class08719
 *  minecraft.class08720
 *  minecraft.class08725
 */
package minecraft;

import Nursultan.class11647;
import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class02484;
import minecraft.class04802;
import minecraft.class05564;
import minecraft.class05946;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06271;
import minecraft.class06584;
import minecraft.class08464;
import minecraft.class08699;
import minecraft.class08719;
import minecraft.class08720;
import minecraft.class08725;

public class class02745
extends class06249<class08464, class05564> {
    private final class05564 N;
    private final class05564 y;
    private final class08720 L;

    public class02745(class06252<class08464, class05564> class062522, class01140 class011402, class08720 class087202) {
        super(class062522);
        this.L = class087202;
        this.N = new class05564(class011402.N(class04802.ya));
        this.y = new class05564(class011402.N(class04802.yX));
    }

    private void N(class01421 class014212, class01237 class012372, class08464 class084642, class06584 class065842, class05946<class11647> class059462, int n) {
        class05564 class055642 = class084642.NB ? this.y : this.N;
        this.L.N(class08719.field_54130, class059462, (class06271)class055642, (Object)class084642, class065842, class014212, class012372, n, class084642.l);
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08464 class084642, float f, float f2) {
        class06584 class065842 = class084642.L;
        class08725 class087252 = (class08725)class065842.method_58694(class02484.o);
        if (class087252 != null && class087252.u().isPresent()) {
            this.N(class014212, class012372, class084642, class065842, (class05946<class11647>)((class05946)class087252.u().get()), n);
        } else if (class084642.u) {
            this.N(class014212, class012372, class084642, class06584.E, (class05946<class11647>)class08699.m, n);
        }
    }
}

