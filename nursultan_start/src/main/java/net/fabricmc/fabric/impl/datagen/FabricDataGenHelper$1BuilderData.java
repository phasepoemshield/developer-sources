/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class02039
 *  minecraft.class02061
 *  minecraft.class02076
 *  minecraft.class04116
 *  minecraft.class05946
 */
package net.fabricmc.fabric.impl.datagen;

import com.mojang.serialization.Lifecycle;
import java.util.ArrayList;
import java.util.List;
import minecraft.class02039;
import minecraft.class02061;
import minecraft.class02076;
import minecraft.class04116;
import minecraft.class05946;

class FabricDataGenHelper$1BuilderData {
    final class05946 key;
    List<class02039<?>> bootstrapFunctions;
    Lifecycle lifecycle;

    FabricDataGenHelper$1BuilderData(class05946 class059462) {
        this.key = class059462;
        this.bootstrapFunctions = new ArrayList();
        this.lifecycle = Lifecycle.stable();
    }

    void apply(class02061 class020612) {
        class020612.N(this.key, this.lifecycle, this::bootstrap);
    }

    void with(class02076<?> class020762) {
        this.bootstrapFunctions.add(class020762.L());
        this.lifecycle = class020762.y().add(this.lifecycle);
    }

    void bootstrap(class04116 class041162) {
        for (class02039<?> class020392 : this.bootstrapFunctions) {
            class020392.run(class041162);
        }
    }
}

