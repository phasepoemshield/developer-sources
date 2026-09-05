/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01206
 *  minecraft.class06685
 *  minecraft.class06702
 *  minecraft.class07262
 */
package minecraft;

import java.util.UUID;
import minecraft.class00392;
import minecraft.class01206;
import minecraft.class06455;
import minecraft.class06685;
import minecraft.class06702;
import minecraft.class07262;

class class06481
implements class07262 {
    final /* synthetic */ class06455 N;

    class06481(class06455 class064552) {
        this.N = class064552;
    }

    public void N(UUID uUID, class00392 class003922) {
        this.N.N.get(uUID).N(class003922);
    }

    public void N(UUID uUID, class06685 class066852, class06702 class067022) {
        class01206 class012062 = this.N.N.get(uUID);
        class012062.N(class066852);
        class012062.N(class067022);
    }

    public void N(UUID uUID, boolean bl, boolean bl2, boolean bl3) {
        class01206 class012062 = this.N.N.get(uUID);
        class012062.N(bl);
        class012062.y(bl2);
        class012062.L(bl3);
    }

    public void N(UUID uUID, float f) {
        this.N.N.get(uUID).N(f);
    }

    public void N(UUID uUID) {
        this.N.N.remove(uUID);
    }

    public void N(UUID uUID, class00392 class003922, float f, class06685 class066852, class06702 class067022, boolean bl, boolean bl2, boolean bl3) {
        this.N.N.put(uUID, new class01206(uUID, class003922, f, class066852, class067022, bl, bl2, bl3));
    }
}

