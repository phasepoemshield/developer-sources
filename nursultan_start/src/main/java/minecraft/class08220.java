/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class06093
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07322
 *  minecraft.class07504
 *  minecraft.class07760
 *  minecraft.class08080
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class06093;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07322;
import minecraft.class07504;
import minecraft.class07760;
import minecraft.class08080;
import org.jspecify.annotations.Nullable;

public class class08220
extends class06093 {
    private @Nullable class07209 N;
    private @Nullable class07209 y;

    protected class08220(class07504 class075042, boolean bl) {
        super((class07049)class075042, bl, false);
        this.N(class075042);
    }

    private void N(class07504 class075042) {
        class07209 class072092 = class075042.L();
        class00500 class005002 = class075042.method_73183().method_8320(class072092);
        if (class07760.U((class00500)class005002)) {
            this.N = class072092.method_10074();
            class08080 class080802 = (class08080)class005002.L(((class07760)class005002.i()).L());
            if (class080802.y()) {
                this.y = switch (class080802) {
                    case class08080.field_12667 -> class072092.method_10078();
                    case class08080.field_12666 -> class072092.method_10067();
                    case class08080.field_12670 -> class072092.method_10095();
                    case class08080.field_12668 -> class072092.method_10072();
                    default -> null;
                };
            }
        }
    }

    public class00494 N(class00500 class005002, class07322 class073222, class07209 class072092) {
        if (class072092.equals((Object)this.N) || class072092.equals((Object)this.y)) {
            return class00389.N();
        }
        return super.N(class005002, class073222, class072092);
    }
}

