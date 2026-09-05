/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class02060
 *  minecraft.class02071
 *  minecraft.class02102
 *  minecraft.class04141
 *  minecraft.class04230
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class06202
 *  minecraft.class06347
 *  minecraft.class06366
 *  minecraft.class06541
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01590;
import minecraft.class02060;
import minecraft.class02071;
import minecraft.class02102;
import minecraft.class03658;
import minecraft.class03676;
import minecraft.class03680;
import minecraft.class04141;
import minecraft.class04230;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class06202;
import minecraft.class06347;
import minecraft.class06366;
import minecraft.class06541;
import org.jspecify.annotations.Nullable;

public class class03703 {
    private final class00392 N;
    private final BooleanSupplier y;
    private final Consumer<Boolean> L;
    private @Nullable class00392 u;
    private @Nullable BooleanSupplier i;
    private final int R;

    class03703(class00392 class003922, BooleanSupplier booleanSupplier, Consumer<Boolean> consumer, int n) {
        this.N = class003922;
        this.y = booleanSupplier;
        this.L = consumer;
        this.R = n;
    }

    public class03703 N(BooleanSupplier booleanSupplier) {
        this.i = booleanSupplier;
        return this;
    }

    public class03703 N(class00392 class003922) {
        this.u = class003922;
        return this;
    }

    class03680 N(class03658 class036582, class02060 class020602, int n) {
        boolean bl2;
        class036582.N();
        class02071 class020712 = new class02071(this.N, (class01590)class06202.Nq().i_3);
        class020602.N((class02102)class020712, class036582.u, n, class020602.y().N(0.0f, 0.5f).y(class036582.y));
        Optional<class03676> var5 = class036582.i;
        class06347 var6 = class06366.N((boolean)this.y.getAsBoolean());
        var6.N();
        boolean bl3 = bl2 = this.u != null && var5.isEmpty();
        if (bl2) {
            class04141 class041412 = class04141.N((class00392)this.u);
            var6.N(bl -> class041412);
        }
        if (this.u != null && !bl2) {
            var6.N_57(class063662 -> class05220.N((class00392[])new class00392[]{this.N, class063662.L(), this.u}));
        } else {
            var6.N_57(class063662 -> class05220.N((class00392[])new class00392[]{this.N, class063662.L()}));
        }
        class06366 var8 = var6.N(0, 0, this.R, 20, (class00392)class00392.i(), (class063662, bl) -> this.L.accept((Boolean)bl));
        if (this.i != null) {
            var8.field_22763 = this.i.getAsBoolean();
        }
        class020602.N((class02102)var8, class036582.u, n + 1, class020602.y().L());
        if (this.u != null) {
            var5.ifPresent(class036762 -> {
                int n2;
                class05216 class052162 = this.u.L().N(class06541.field_1080);
                class01590 class015902 = (class01590)class06202.Nq().i_3;
                class04230 class042302 = new class04230((class00392)class052162, class015902);
                class042302.N(class036582.N - class036582.y - this.R);
                class042302.y(class036762.N());
                class036582.N();
                if (class036762.y()) {
                    Objects.requireNonNull(class015902);
                    n2 = 9 * class036762.N() - class042302.method_25364();
                } else {
                    n2 = 0;
                }
                int n3 = n2;
                class020602.N((class02102)class042302, class036582.u, n, class020602.y().L(-class036582.L).i(n3));
            });
        }
        return new class03680((class06366<Boolean>)var8, this.y, this.i);
    }
}

