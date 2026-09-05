/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01194
 *  minecraft.class03556
 *  minecraft.class06113
 *  minecraft.class06530
 *  minecraft.class06584
 *  minecraft.class06758
 *  minecraft.class07078
 *  minecraft.class07206
 *  minecraft.class07210
 *  minecraft.class07211
 *  minecraft.class08092
 */
package Nursultan;

import minecraft.class01194;
import minecraft.class03556;
import minecraft.class06113;
import minecraft.class06530;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07078;
import minecraft.class07206;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class08092;

public class class09395
extends class07206 {
    public class06584 N(class07210 class072102, class06584 class065842) {
        class07211 class072112 = (class07211)class072102.u().L((class08092)class06758.y);
        class07078 var4 = ((class06530)class065842.B()).u(class065842);
        if (var4 == null) {
            return class065842;
        }
        try {
            var4.N(class072102.y(), class065842, null, class072102.L().method_10093(class072112), class06113.field_16470, class072112 != class07211.field_11036, false);
        }
        catch (Exception exception) {
            y.error("Error while dispensing spawn egg from dispenser at {}", (Object)class072102.L(), (Object)exception);
            return class06584.E;
        }
        class065842.B(1);
        class072102.y().N(null, (class03556)class01194.v, class072102.L());
        return class065842;
    }
}

