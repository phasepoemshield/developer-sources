/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class05494;
import minecraft.class05513;
import minecraft.class05520;
import minecraft.class05532;

class class05505
implements class05532 {
    final /* synthetic */ Consumer N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class05505(class05494 class054942, Consumer consumer) {
        this.N = consumer;
    }

    @Override
    public void y(class05513 class055132, class05520 class055202) {
        this.N.accept(class055132);
    }

    @Override
    public void N(class05513 class055132, class05513 class055133, class05520 class055202) {
    }

    @Override
    public void N(class05513 class055132, class05520 class055202) {
    }

    @Override
    public void N(class05513 class055132) {
    }
}

