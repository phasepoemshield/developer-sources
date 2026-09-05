/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01224
 *  minecraft.class03291
 *  minecraft.class03860
 *  minecraft.class04367
 *  minecraft.class04748
 *  minecraft.class04758
 *  minecraft.class04764
 *  minecraft.class04780
 *  minecraft.class04914
 *  minecraft.class04940
 *  minecraft.class05163
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07209
 *  minecraft.class07830
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import minecraft.class01224;
import minecraft.class03291;
import minecraft.class03860;
import minecraft.class04367;
import minecraft.class04748;
import minecraft.class04758;
import minecraft.class04764;
import minecraft.class04780;
import minecraft.class04914;
import minecraft.class04940;
import minecraft.class05163;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07209;
import minecraft.class07830;

public class class05592
extends class04748 {
    public static final MapCodec<class05592> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05592.N(instance), (App)Codec.BOOL.fieldOf("is_beached").forGetter(class055922 -> class055922.y)).apply(instance, class05592::new));
    public final boolean y;

    public class05592(class04758 class047582, boolean bl) {
        super(class047582);
        this.y = bl;
    }

    private void N(class03291 class032912, class04764 class047642) {
        class06993 class069932 = class06993.N((class06069)class047642.R());
        class07209 class072092 = new class07209(class047642.B().i(), 90, class047642.B().R());
        class04940 class049402 = class04914.N((class01224)class047642.i(), (class07209)class072092, (class06993)class069932, (class03860)class032912, (class06069)class047642.R(), (boolean)this.y);
        if (class049402.y()) {
            int n;
            class05163 class051632 = class049402.L();
            if (this.y) {
                int n2 = class04748.y((class04764)class047642, (int)class051632.B(), (int)class051632.u(), (int)class051632.z(), (int)class051632.R());
                n = class049402.N(n2, (class06069)class047642.R());
            } else {
                n = class04748.N((class04764)class047642, (int)class051632.B(), (int)class051632.u(), (int)class051632.z(), (int)class051632.R());
            }
            class049402.N(n);
        }
    }

    public Optional<class04780> N(class04764 class047642) {
        class07830 class078302 = this.y ? class07830.field_13194 : class07830.field_13195;
        return class05592.N((class04764)class047642, (class07830)class078302, class032912 -> this.N((class03291)class032912, class047642));
    }

    public class04367<?> N() {
        return class04367.W;
    }
}

