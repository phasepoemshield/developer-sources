/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00780
 *  minecraft.class00795
 *  minecraft.class03216
 *  minecraft.class03221
 *  minecraft.class05946
 *  net.fabricmc.fabric.impl.biome.NetherBiomeData
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;
import minecraft.class00780;
import minecraft.class00795;
import minecraft.class03216;
import minecraft.class03221;
import minecraft.class03581;
import minecraft.class05946;
import net.fabricmc.fabric.impl.biome.NetherBiomeData;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

class class03586
implements class03581 {
    class03586() {
    }

    @Override
    public <T> class03221<T> N(Function<class05946<class00780>, T> function) {
        class03221 class032212 = new class03221(List.of(Pair.of((Object)class03216.N((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f), function.apply((class05946<class00780>)class00795.Nu)), Pair.of((Object)class03216.N((float)0.0f, (float)-0.5f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f), function.apply((class05946<class00780>)class00795.NM)), Pair.of((Object)class03216.N((float)0.4f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f), function.apply((class05946<class00780>)class00795.NR)), Pair.of((Object)class03216.N((float)0.0f, (float)0.5f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.375f), function.apply((class05946<class00780>)class00795.Ni)), Pair.of((Object)class03216.N((float)-0.5f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.175f), function.apply((class05946<class00780>)class00795.NB))));
        class03221 class032213 = class032212;
        class032213 = new CallbackInfoReturnable("", true, (Object)class032213);
        this.N(function, (CallbackInfoReturnable)class032213);
        if (class032213.isCancelled()) {
            return (class03221)class032213.getReturnValue();
        }
        return class032212;
    }

    public void N(Function function, CallbackInfoReturnable callbackInfoReturnable) {
        callbackInfoReturnable.setReturnValue((Object)NetherBiomeData.withModdedBiomeEntries((class03221)((class03221)callbackInfoReturnable.getReturnValue()), (Function)function));
    }
}

