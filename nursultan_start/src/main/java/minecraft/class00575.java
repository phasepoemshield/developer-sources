/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01609
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00580;
import minecraft.class00620;
import minecraft.class01609;

class class00575
implements class01609 {
    final /* synthetic */ float N;
    final /* synthetic */ float y;
    final /* synthetic */ Consumer L;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class00575(float f, float f2, Consumer consumer) {
        this.N = f;
        this.y = f2;
        this.L = consumer;
    }

    private void N(class00620 class006202) {
        if (class00580.N(this.N, this.y, class006202.P(), class006202.s(), class006202.T(), class006202.b())) {
            this.L.accept(class006202.z());
        }
    }
}

