/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class00751
 *  minecraft.class03515
 *  minecraft.class03542
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import minecraft.class00191;
import minecraft.class00751;
import minecraft.class03515;
import minecraft.class03542;
import minecraft.class05946;

class class00187
implements class03542 {
    final /* synthetic */ class00191 N;

    class00187(class00191 class001912) {
        this.N = class001912;
    }

    public <T> Optional<class03515<T>> N(class05946<? extends class00751<? extends T>> class059462) {
        return this.N.N.method_46759(class059462).map(class03515::N).or(() -> Optional.of(new class03515(this.N.y.y(), this.N.y.N(), Lifecycle.experimental())));
    }
}

