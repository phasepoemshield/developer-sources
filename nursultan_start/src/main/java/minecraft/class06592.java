/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00891
 *  minecraft.class02484
 *  minecraft.class02689
 *  minecraft.class06502
 *  minecraft.class07211
 */
package minecraft;

import minecraft.class00392;
import minecraft.class00891;
import minecraft.class02484;
import minecraft.class02689;
import minecraft.class06502;
import minecraft.class06573;
import minecraft.class06584;
import minecraft.class07211;

public class class06592
extends class06502 {
    public class06592(class00891 class008912, class00891 class008913, class06573 class065732) {
        super(class008912, class008913, class07211.field_11033, class065732);
    }

    public class00392 N(class06584 class065842) {
        class02689 class026892 = (class02689)class065842.method_58694(class02484.Nb);
        if (class026892 != null && class026892.u().isPresent()) {
            return class00392.N((String)(this.W + ".named"), (Object[])new Object[]{class026892.u().get()});
        }
        return super.N(class065842);
    }
}

