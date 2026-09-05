/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class02953
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06758
 *  minecraft.class06918
 *  minecraft.class06942
 *  minecraft.class07209
 *  minecraft.class07210
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class08092
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class01989;
import minecraft.class02953;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class06918;
import minecraft.class06942;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08092;
import org.slf4j.Logger;

public class class02035
extends class01989 {
    private static final Logger N = LogUtils.getLogger();

    protected class06584 N(class07210 class072102, class06584 class065842) {
        this.N(false);
        class06581 class065812 = class065842.B();
        if (class065812 instanceof class06918) {
            class07211 class072112 = (class07211)class072102.u().L((class08092)class06758.y);
            class07209 class072092 = class072102.L().method_10093(class072112);
            class07211 class072113 = class072102.y().R(class072092.method_10074()) ? class072112 : class07211.field_11036;
            try {
                this.N(((class06918)class065812).y((class06942)new class02953((class07299)class072102.y(), class072092, class072112, class065842, class072113)).N());
            }
            catch (Exception exception) {
                N.error("Error trying to place shulker box at {}", (Object)class072092, (Object)exception);
            }
        }
        return class065842;
    }
}

