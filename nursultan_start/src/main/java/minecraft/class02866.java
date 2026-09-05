/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00803
 *  minecraft.class04688
 *  minecraft.class05487
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00803;
import minecraft.class02875;
import minecraft.class04688;
import minecraft.class05487;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;

class class02866
implements class02875 {
    class02866() {
    }

    @Override
    public class07209 N(class05487 class054872, class07209 class072092) {
        class07209 class072093 = class072092.method_10074();
        if (class054872.method_8320(class072093).N(class08791.field_50)) {
            return class072093;
        }
        return class072092;
    }

    private boolean N(class05487 class054872, class07209 class072092, class07078<?> class070782) {
        class00500 class005002 = class054872.method_8320(class072092);
        return class00803.N((class07290)class054872, (class07209)class072092, (class00500)class005002, (class04688)class005002.Y(), class070782);
    }

    @Override
    public boolean isSpawnPositionOk(class05487 class054872, class07209 class072092, @Nullable class07078<?> class070782) {
        if (class070782 == null || !class054872.method_8621().N(class072092)) {
            return false;
        }
        class07209 class072093 = class072092.method_10084();
        class07209 class072094 = class072092.method_10074();
        if (!class054872.method_8320(class072094).N((class07290)class054872, class072094, class070782)) {
            return false;
        }
        return this.N(class054872, class072092, class070782) && this.N(class054872, class072093, class070782);
    }
}

