/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01231
 *  minecraft.class01362
 *  minecraft.class04206
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06942
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01231;
import minecraft.class01362;
import minecraft.class04206;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06942;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class06787
extends class00891 {
    public static final MapCodec<class00891> N = class04206.i.T().fieldOf("dead");
    public static final MapCodec<class06787> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)N.forGetter(class067872 -> class067872.L), (App)class06787.t()).apply(instance, class06787::new));
    private final class00891 L;

    public class06787(class00891 class008912, class01362 class013622) {
        super(class013622);
        this.L = class008912;
    }

    public @Nullable class00500 N(class06942 class069422) {
        if (!this.N((class07290)class069422.method_8045(), class069422.method_8037())) {
            class069422.method_8045().N(class069422.method_8037(), (class00891)this, 60 + class069422.method_8045().method_8409().y(40));
        }
        return this.W();
    }

    protected boolean N(class07290 class072902, class07209 class072092) {
        for (class07211 class072112 : class07211.values()) {
            if (!class072902.method_8316(class072092.method_10093(class072112)).N(class01231.N)) continue;
            return true;
        }
        return false;
    }

    public MapCodec<class06787> N() {
        return y;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (!this.N((class07290)class054872, class072092)) {
            class087132.N(class072092, (class00891)this, 60 + class060692.y(40));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (!this.N((class07290)class047822, class072092)) {
            class047822.method_8652(class072092, this.L.W(), 2);
        }
    }
}

