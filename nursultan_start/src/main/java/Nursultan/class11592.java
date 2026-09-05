/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AnarchyHelper
 *  Nursultan.class11300
 *  minecraft.class02484
 *  minecraft.class06517
 *  minecraft.class06584
 */
package Nursultan;

import Nursultan.AnarchyHelper;
import Nursultan.class11300;
import Nursultan.class11561;
import Nursultan.class11664;
import java.util.Optional;
import minecraft.class02484;
import minecraft.class06517;
import minecraft.class06584;

public class class11592
extends class11561 {
    public static Object y_0;
    public Object L_0;
    public Object L_1;

    public class11592(AnarchyHelper anarchyHelper, String string, class11664 class116642, String string2) {
        super(anarchyHelper, string, class116642::N, class116642.y(), string2);
        this.Z();
        this.L_0 = class116642;
    }

    static {
        class11592.i();
    }

    private void Z() {
    }

    private static void i() {
        y_0 = 10;
    }

    private Optional<Integer> z() {
        this.Z();
        if ((Optional)this.L_1 == null) {
            try {
                this.L_1 = ((class06517)((class11664)this.L_0).N().a_(class02484.h, (Object)class06517.N)).R();
            }
            catch (IllegalStateException illegalStateException) {
                return Optional.empty();
            }
        }
        return (Optional)this.L_1;
    }

    @Override
    public boolean N(class06584 class065842) {
        Optional var2 = ((class06517)class065842.a_(class02484.h, (Object)class06517.N)).R();
        if (var2.isEmpty()) {
            return false;
        }
        return this.z().map(n -> class11300.N((int)n, (int)((Integer)var2.get()), (int)10)).orElse(false);
    }
}

