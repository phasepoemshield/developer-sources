/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10412
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03529
 *  minecraft.class04227
 *  minecraft.class04480
 *  minecraft.class04489
 *  minecraft.class05537
 *  minecraft.class05561
 *  minecraft.class05566
 *  minecraft.class05576
 *  minecraft.class05908
 *  minecraft.class05925
 *  minecraft.class05946
 *  minecraft.class05952
 *  minecraft.class05955
 *  minecraft.class05957
 *  minecraft.class07693
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10412;
import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03529;
import minecraft.class04227;
import minecraft.class04480;
import minecraft.class04489;
import minecraft.class05537;
import minecraft.class05561;
import minecraft.class05566;
import minecraft.class05576;
import minecraft.class05908;
import minecraft.class05925;
import minecraft.class05946;
import minecraft.class05952;
import minecraft.class05955;
import minecraft.class05957;
import minecraft.class07693;
import org.slf4j.Logger;

public final class class01429
extends Record
implements class05957 {
    private final class05946<class05957> name;
    private static final Logger R = LogUtils.getLogger();
    public static final MapCodec<class01429> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05946.N((class05946)class04227.yq).fieldOf("name").forGetter(class01429::L)).apply(instance, class01429::new));

    public class05946<class05957> L() {
        return this.name;
    }

    public class01429(class05946<class05957> class059462) {
        this.name = class059462;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01429.class, "name", "name"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01429.class, "name", "name"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01429.class, "name", "name"}, this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean test(class05908 class059082) {
        class05957 class059572 = class059082.N().u(this.name).map(class03529::N).orElse(null);
        if (class059572 == null) {
            R.warn("Tried using unknown condition table called {}", (Object)this.name.N());
            return false;
        }
        class05925 class059252 = class05908.N((class05957)class059572);
        if (class059082.y(class059252)) {
            try {
                boolean bl = class059572.test((Object)class059082);
                return bl;
            }
            finally {
                class059082.L(class059252);
            }
        }
        R.warn("Detected infinite loop in loot tables");
        return false;
    }

    public void N(class05561 class055612) {
        if (!class055612.y()) {
            class055612.N((class04480)new class05566(this.name));
            return;
        }
        if (class055612.N(this.name)) {
            class055612.N((class04480)new class05537(this.name));
            return;
        }
        super.N(class055612);
        class055612.N().u(this.name).ifPresentOrElse(class035292 -> ((class05957)class035292.N()).N(class055612.N((class04489)new class10412(this.name), this.name)), () -> class055612.N((class04480)new class05576(this.name)));
    }

    public static class05952 N(class05946<class05957> class059462) {
        return () -> new class01429(class059462);
    }

    public class05955 N() {
        return class07693.s;
    }
}

