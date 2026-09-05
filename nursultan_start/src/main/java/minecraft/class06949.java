/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00681
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class01194
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class06113
 *  minecraft.class06501
 *  minecraft.class06573
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07438
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00681;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class01194;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class06113;
import minecraft.class06501;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06942;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07438;

public class class06949
extends class06581 {
    public class06949(class06573 class065732) {
        super(class065732);
    }

    public class07082 N(class06501 class065012) {
        if (class065012.method_8038() == class07211.field_11033) {
            return class07082.u;
        }
        class07299 class072992 = class065012.method_8045();
        class07209 class072092 = new class06942(class065012).method_8037();
        class06584 class065842 = class065012.method_8041();
        class06889 class068892 = class06889.L((class00753)class072092);
        class00734 class007342 = class07078.B.E().N(class068892.N(), class068892.y(), class068892.L());
        if (!class072992.method_8587(null, class007342) || !class072992.N_70(null, class007342).isEmpty()) {
            return class07082.u;
        }
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            Consumer consumer = class07078.N((class07299)class047822, (class06584)class065842, (class07438)class065012.method_8036());
            class00681 class006812 = (class00681)class07078.B.y(class047822, consumer, class072092, class06113.field_16465, true, true);
            if (class006812 == null) {
                return class07082.u;
            }
            float f = (float)class04995.y((float)((class04995.R((float)(class065012.method_8044() - 180.0f)) + 22.5f) / 45.0f)) * 45.0f;
            class006812.method_5808(class006812.method_23317(), class006812.method_23318(), class006812.method_23321(), f, 0.0f);
            class047822.y((class07049)class006812);
            class072992.method_43128(null, class006812.method_23317(), class006812.method_23318(), class006812.method_23321(), class04909.NJ, class04911.field_15245, 0.75f, 0.8f);
            class006812.method_32875((class03556)class01194.v, (class07049)class065012.method_8036());
        }
        class065842.B(1);
        return class07082.N;
    }
}

