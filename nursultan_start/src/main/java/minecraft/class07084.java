/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class00392
 *  minecraft.class01286
 *  minecraft.class01894
 *  minecraft.class02329
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02566
 *  minecraft.class02957
 *  minecraft.class02995
 *  minecraft.class03556
 *  minecraft.class03767
 *  minecraft.class03794
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04995
 *  minecraft.class05320
 *  minecraft.class05946
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07438
 *  minecraft.class07463
 *  minecraft.class07468
 *  minecraft.class07469
 *  minecraft.class07471
 *  minecraft.class07536
 *  net.fabricmc.fabric.api.entity.event.v1.effect.FabricMobEffect
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class01286;
import minecraft.class01894;
import minecraft.class02329;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02566;
import minecraft.class02957;
import minecraft.class02995;
import minecraft.class03556;
import minecraft.class03767;
import minecraft.class03794;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04995;
import minecraft.class05320;
import minecraft.class05946;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07062;
import minecraft.class07072;
import minecraft.class07073;
import minecraft.class07103;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07438;
import minecraft.class07463;
import minecraft.class07468;
import minecraft.class07469;
import minecraft.class07471;
import minecraft.class07536;
import net.fabricmc.fabric.api.entity.event.v1.effect.FabricMobEffect;
import org.jspecify.annotations.Nullable;

public class class07084
implements class02995,
FabricMobEffect {
    public static final Codec<class03556<class07084>> N = class04206.u.b();
    public static final class02362<class04247, class03556<class07084>> y = class02389.y((class05946)class04227.Ni);
    private static final int L = class04995.y((float)38.25f);
    private final Map<class03556<class07468>, class07073> u = new Object2ObjectOpenHashMap();
    private final class01286 i;
    private final int R;
    private final Function<class07055, class07126> M;
    private @Nullable String B;
    private int Z;
    private int z;
    private int U;
    private Optional<class04891> E = Optional.empty();
    private class03767 W = class03794.M;

    public int L() {
        return this.z;
    }

    public class00392 M() {
        return class00392.L((String)this.R());
    }

    public class07084(class01286 class012862, int n) {
        this.i = class012862;
        this.R = n;
        this.M = class070552 -> {
            int n2 = class070552.R() ? L : 255;
            return class02329.N((class07103)class07107.t, (int)class02566.R((int)n2, (int)n));
        };
    }

    public class07084(class01286 class012862, int n, class07126 class071262) {
        this.i = class012862;
        this.R = n;
        this.M = class070552 -> class071262;
    }

    public class01286 B() {
        return this.i;
    }

    public int Z() {
        return this.R;
    }

    protected String i() {
        if (this.B == null) {
            this.B = class07536.N((String)"effect", (class01894)class04206.u.y((Object)this));
        }
        return this.B;
    }

    public boolean z() {
        return this.i == class01286.field_18271;
    }

    public int u() {
        return this.U;
    }

    public void y(class07438 class074382, int n) {
        this.E.ifPresent(class048912 -> class074382.method_73183().method_43128(null, class074382.method_23317(), class074382.method_23318(), class074382.method_23321(), class048912, class074382.method_5634(), 1.0f, 1.0f));
    }

    public int y() {
        return this.Z;
    }

    public class07126 N(class07055 class070552) {
        return this.M.apply(class070552);
    }

    public boolean N(class04782 class047822, class07438 class074382, int n) {
        return true;
    }

    public void N(class05320 class053202, int n) {
        for (Map.Entry<class03556<class07468>, class07073> entry : this.u.entrySet()) {
            class07469 class074692 = class053202.N(entry.getKey());
            if (class074692 == null) continue;
            class074692.L(entry.getValue().N());
            class074692.u(entry.getValue().N(n));
        }
    }

    public void N(class05320 class053202) {
        for (Map.Entry<class03556<class07468>, class07073> entry : this.u.entrySet()) {
            class07469 class074692 = class053202.N(entry.getKey());
            if (class074692 == null) continue;
            class074692.L(entry.getValue().N());
        }
    }

    public class07084 N(class02957 ... class02957Array) {
        this.W = class03794.i.N(class02957Array);
        return this;
    }

    public class07084 N(class04891 class048912) {
        this.E = Optional.of(class048912);
        return this;
    }

    public boolean N() {
        return false;
    }

    public void N(class04782 class047822, @Nullable class07049 class070492, @Nullable class07049 class070493, class07438 class074382, int n, double d) {
        this.N(class047822, class074382, n);
    }

    public void N(class04782 class047822, class07438 class074382, int n, class07072 class070722, float f) {
    }

    public void N(class04782 class047822, class07438 class074382, int n, class07062 class070622) {
    }

    public void N(class07438 class074382, int n) {
    }

    public boolean N(int n, int n2) {
        return false;
    }

    public void N(int n, BiConsumer<class03556<class07468>, class07471> biConsumer) {
        this.u.forEach((class035562, class070732) -> biConsumer.accept((class03556<class07468>)class035562, class070732.N(n)));
    }

    public class07084 N(int n) {
        return this.N(n, n, n);
    }

    public class07084 N(class03556<class07468> class035562, class01894 class018942, double d, class07463 class074632) {
        this.u.put(class035562, new class07073(class018942, d, class074632));
        return this;
    }

    public class07084 N(int n, int n2, int n3) {
        this.Z = n;
        this.z = n2;
        this.U = n3;
        return this;
    }

    public String R() {
        return this.i();
    }

    public class03767 method_45322() {
        return this.W;
    }
}

