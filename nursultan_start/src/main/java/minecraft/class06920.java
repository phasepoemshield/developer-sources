/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class06502
 *  minecraft.class06563
 *  minecraft.class06573
 *  minecraft.class07211
 *  minecraft.class07685
 *  org.apache.commons.lang3.Validate
 */
package minecraft;

import minecraft.class00891;
import minecraft.class06502;
import minecraft.class06563;
import minecraft.class06573;
import minecraft.class07211;
import minecraft.class07685;
import org.apache.commons.lang3.Validate;

public class class06920
extends class06502 {
    public class06920(class00891 class008912, class00891 class008913, class06573 class065732) {
        super(class008912, class008913, class07211.field_11033, class065732);
        Validate.isInstanceOf(class07685.class, (Object)class008912);
        Validate.isInstanceOf(class07685.class, (Object)class008913);
    }

    public class06563 N() {
        return ((class07685)this.L()).y();
    }
}

