/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class04770
 *  minecraft.class06541
 *  minecraft.class06573
 *  minecraft.class06918
 *  minecraft.class06942
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class04770;
import minecraft.class06089;
import minecraft.class06541;
import minecraft.class06573;
import minecraft.class06918;
import minecraft.class06942;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class06107
extends class06918 {
    public @Nullable class06942 L(class06942 class069422) {
        class00891 class008912;
        class07209 class072092 = class069422.method_8037();
        class07299 class072992 = class069422.method_8045();
        class00500 class005002 = class072992.method_8320(class072092);
        if (class005002.N(class008912 = this.L())) {
            class07211 class072112 = class069422.method_8046() ? (class069422.method_17699() ? class069422.method_8038().b() : class069422.method_8038()) : (class069422.method_8038() == class07211.field_11036 ? class069422.method_8042() : class07211.field_11036);
            int n = 0;
            class07218 class072182 = class072092.method_25503().N(class072112);
            while (n < 7) {
                if (!class072992.method_8608() && !class072992.method_24794((class07209)class072182)) {
                    class08036 class080362 = class069422.method_8036();
                    int n2 = class072992.method_31600();
                    if (!(class080362 instanceof class04770) || class072182.method_10264() <= n2) break;
                    ((class04770)class080362).method_43502((class00392)class00392.N((String)"build.tooHigh", (Object[])new Object[]{n2}).N(class06541.field_1061), true);
                    break;
                }
                class005002 = class072992.method_8320((class07209)class072182);
                if (!class005002.N(this.L())) {
                    if (!class005002.N(class069422)) break;
                    return class06942.N((class06942)class069422, (class07209)class072182, (class07211)class072112);
                }
                class072182.N(class072112);
                if (!class072112.z().L()) continue;
                ++n;
            }
            return null;
        }
        if (class06089.N((class07290)class072992, class072092) == 7) {
            return null;
        }
        return class069422;
    }

    public class06107(class00891 class008912, class06573 class065732) {
        super(class008912, class065732);
    }

    protected boolean y() {
        return false;
    }
}

