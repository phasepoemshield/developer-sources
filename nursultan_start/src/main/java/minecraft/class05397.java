/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class00155
 *  minecraft.class00169
 *  minecraft.class00608
 *  minecraft.class00772
 *  minecraft.class01368
 *  minecraft.class01374
 *  minecraft.class03556
 *  minecraft.class04453
 *  minecraft.class04891
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06731
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class09033
 *  net.irisshaders.iris.mixinterface.BiomeAmbienceInterface
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Objects;
import minecraft.class00040;
import minecraft.class00044;
import minecraft.class00155;
import minecraft.class00169;
import minecraft.class00608;
import minecraft.class00772;
import minecraft.class01368;
import minecraft.class01374;
import minecraft.class03556;
import minecraft.class04453;
import minecraft.class04891;
import minecraft.class04995;
import minecraft.class05386;
import minecraft.class06069;
import minecraft.class06731;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class09033;
import net.irisshaders.iris.mixinterface.BiomeAmbienceInterface;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05397
implements class00169,
BiomeAmbienceInterface {
    private static final int N = 40;
    private static final float y = 0.001f;
    private final class04453 L;
    private final class09033 u;
    private final class06069 i;
    private final Object2ObjectArrayMap<class03556<class04891>, class05386> R = new Object2ObjectArrayMap();
    private float M;
    private @Nullable class03556<class04891> B;
    private float Z;

    public class05397(class04453 class044532, class09033 class090332) {
        this.i = class044532.method_73183().method_8409();
        this.L = class044532;
        this.u = class090332;
    }

    public float y() {
        return this.M;
    }

    private void N(class07299 class072992, class01374 class013742, CallbackInfo callbackInfo, class07209 class072092) {
        int n = this.L.method_73183().method_8314(class00772.field_9284, class072092);
        this.Z = n > 0 ? (this.Z -= (float)n / 15.0f * 0.001f) : (this.Z -= (float)(this.L.method_73183().method_8314(class00772.field_9282, class072092) - 1) / (float)class013742.y());
        this.Z = class04995.N((float)this.Z, (float)0.0f, (float)1.0f);
    }

    public void N() {
        this.R.values().removeIf(class00155::N);
        class07299 class072992 = this.L.method_73183();
        class06731 class067312 = (class06731)class072992.method_75728().N(class00608.l, this.L.method_73189());
        class03556 var4 = class067312.N().orElse(null);
        if (!Objects.equals(var4, this.B)) {
            this.B = var4;
            this.R.values().forEach(class05386::b);
            if (var4 != null) {
                this.R.compute((Object)var4, (class035563, class053862) -> {
                    if (class053862 == null) {
                        class053862 = new class05386((class04891)var4.N());
                        this.u.N((class00044)class053862);
                    }
                    class053862.j();
                    return class053862;
                });
            }
        }
        for (class01368 class013682 : class067312.L()) {
            if (!(this.i.U() < class013682.y())) continue;
            this.u.N((class00044)class00040.y((class04891)((class04891)class013682.N().N())));
        }
        class067312.y().ifPresent(class013742 -> {
            int n = class013742.L() * 2 + 1;
            class07209 class072092 = class07209.method_49637((double)(this.L.method_23317() + (double)this.i.y(n) - (double)class013742.L()), (double)(this.L.method_23320() + (double)this.i.y(n) - (double)class013742.L()), (double)(this.L.method_23321() + (double)this.i.y(n) - (double)class013742.L()));
            this.N(class072992, (class01374)class013742, null, class072092);
            int n2 = class072992.method_8314(class00772.field_9284, class072092);
            this.M = n2 > 0 ? (this.M -= (float)n2 / 15.0f * 0.001f) : (this.M -= (float)(class072992.method_8314(class00772.field_9282, class072092) - 1) / (float)class013742.y());
            if (this.M >= 1.0f) {
                double d = (double)class072092.method_10263() + 0.5;
                double d2 = (double)class072092.method_10264() + 0.5;
                double d3 = (double)class072092.method_10260() + 0.5;
                double d4 = d - this.L.method_23317();
                double d5 = d2 - this.L.method_23320();
                double d6 = d3 - this.L.method_23321();
                double d7 = Math.sqrt(d4 * d4 + d5 * d5 + d6 * d6);
                double d8 = d7 + class013742.u();
                class00040 class000402 = class00040.N((class04891)((class04891)class013742.N().N()), (class06069)this.i, (double)(this.L.method_23317() + d4 / d7 * d8), (double)(this.L.method_23320() + d5 / d7 * d8), (double)(this.L.method_23321() + d6 / d7 * d8));
                this.u.N((class00044)class000402);
                this.M = 0.0f;
            } else {
                this.M = Math.max(this.M, 0.0f);
            }
        });
    }

    public float getConstantMood() {
        return this.Z;
    }
}

