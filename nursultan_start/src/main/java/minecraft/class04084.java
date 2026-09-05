/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10303
 *  Nursultan.class10304
 *  minecraft.class01818
 *  minecraft.class01894
 *  minecraft.class02055
 *  minecraft.class02063
 *  minecraft.class03008
 *  minecraft.class03019
 *  minecraft.class03222
 *  minecraft.class03866
 *  minecraft.class03881
 *  minecraft.class04227
 *  minecraft.class05041
 *  minecraft.class05056
 *  minecraft.class05943
 *  minecraft.class05946
 *  net.fabricmc.fabric.impl.biome.MultiNoiseSamplerHooks
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10303;
import Nursultan.class10304;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import minecraft.class01818;
import minecraft.class01894;
import minecraft.class02055;
import minecraft.class02063;
import minecraft.class03008;
import minecraft.class03019;
import minecraft.class03222;
import minecraft.class03866;
import minecraft.class03881;
import minecraft.class04227;
import minecraft.class05041;
import minecraft.class05056;
import minecraft.class05943;
import minecraft.class05946;
import net.fabricmc.fabric.impl.biome.MultiNoiseSamplerHooks;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class class04084 {
    public final class01818 N;
    private final class02055<class05056> y;
    private final class03866 L;
    private final class03222 u;
    private final class03019 i;
    private final class01818 R;
    private final class01818 M;
    private final Map<class05946<class05056>, class05041> B;
    private final Map<class01894, class01818> Z;

    public class03019 L() {
        return this.i;
    }

    private class04084(class05943 class059432, class02055<class05056> class020552, long l) {
        this.N = class059432.u().N(l).L();
        this.y = class020552;
        this.R = this.N.N(class01894.y((String)"aquifer")).L();
        this.M = this.N.N(class01894.y((String)"ore")).L();
        this.B = new ConcurrentHashMap<class05946<class05056>, class05041>();
        this.Z = new ConcurrentHashMap<class01894, class01818>();
        this.i = new class03019(this, class059432.M(), class059432.E(), this.N);
        boolean bl = class059432.m();
        this.L = class059432.Z().N((class03881)new class10304(this, l, bl));
        class10303 class103032 = new class10303(this);
        this.u = new class03222(this.L.i().N((class03881)class103032), this.L.R().N((class03881)class103032), this.L.M().N((class03881)class103032), this.L.B().N((class03881)class103032), this.L.Z().N((class03881)class103032), this.L.z().N((class03881)class103032), class059432.U());
        this.N(class059432, class020552, l, null);
    }

    public class01818 i() {
        return this.M;
    }

    public class01818 u() {
        return this.R;
    }

    public class03222 y() {
        return this.u;
    }

    private void N(class05943 class059432, class02055 class020552, long l, CallbackInfo callbackInfo) {
        ((MultiNoiseSamplerHooks)this.u).fabric_setSeed(l);
    }

    public static class04084 N(class05943 class059432, class02055<class05056> class020552, long l) {
        return new class04084(class059432, class020552, l);
    }

    public class05041 N(class05946<class05056> class059462) {
        return this.B.computeIfAbsent(class059462, class059463 -> class03008.N(this.y, (class01818)this.N, (class05946)class059462));
    }

    public class01818 N(class01894 class018942) {
        return this.Z.computeIfAbsent(class018942, class018943 -> this.N.N(class018942).L());
    }

    public class03866 N() {
        return this.L;
    }

    public static class04084 N(class02063 class020632, class05946<class05943> class059462, long l) {
        return class04084.N((class05943)class020632.L(class04227.yE).y(class059462).N(), (class02055<class05056>)class020632.L(class04227.yW), l);
    }
}

