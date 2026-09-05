/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02484
 *  minecraft.class03556
 *  minecraft.class04770
 *  minecraft.class06517
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06912
 *  minecraft.class06937
 *  minecraft.class08036
 */
package minecraft;

import java.util.Optional;
import minecraft.class01894;
import minecraft.class02484;
import minecraft.class03556;
import minecraft.class04770;
import minecraft.class06517;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06912;
import minecraft.class06937;
import minecraft.class07489;
import minecraft.class08036;

class class07484
extends class06937 {
    public class01894 L() {
        return class07489.y;
    }

    public class07484(class06695 class066952, int n, int n2, int n3) {
        super(class066952, n, n2, n3);
    }

    public static boolean y(class06584 class065842) {
        return class065842.N(class06570.ns) || class065842.N(class06570.lO) || class065842.N(class06570.lJ) || class065842.N(class06570.nP);
    }

    public int y() {
        return 1;
    }

    public boolean N(class06584 class065842) {
        return class07484.y(class065842);
    }

    public void N(class08036 class080362, class06584 class065842) {
        Optional var3 = ((class06517)class065842.a_(class02484.h, (Object)class06517.N)).i();
        if (var3.isPresent() && class080362 instanceof class04770) {
            class04770 class047702 = (class04770)class080362;
            class06912.E.N(class047702, (class03556)var3.get());
        }
        super.N(class080362, class065842);
    }
}

