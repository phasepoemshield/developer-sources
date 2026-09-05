/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class01960
 *  minecraft.class04995
 *  minecraft.class06665
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07768
 *  minecraft.class08071
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00734;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class01960;
import minecraft.class04995;
import minecraft.class06665;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07768;
import minecraft.class08071;
import minecraft.class08092;

public class class00644
extends class07768 {
    public static final MapCodec<class00644> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.intRange((int)1, (int)1024).fieldOf("max_weight").forGetter(class006442 -> class006442.i), (App)class01960.N.fieldOf("block_set_type").forGetter(class006442 -> class006442.y), (App)class00644.t()).apply(instance, class00644::new));
    public static final class08071 u = class06665.ND;
    private final int i;

    public class00644(int n, class01960 class019602, class01362 class013622) {
        super(class013622, class019602);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)u, (Comparable)Integer.valueOf(0)));
        this.i = n;
    }

    protected int U(class00500 class005002) {
        return (Integer)class005002.L((class08092)u);
    }

    protected int y() {
        return 10;
    }

    protected int y(class07299 class072992, class07209 class072092) {
        int n = Math.min(class00644.N((class07299)class072992, (class00734)N.N(class072092), class07049.class), this.i);
        if (n > 0) {
            return class04995.u((float)((float)Math.min(this.i, n) / (float)this.i * 15.0f));
        }
        return 0;
    }

    public MapCodec<class00644> N() {
        return L;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{u});
    }

    protected class00500 N(class00500 class005002, int n) {
        return (class00500)class005002.y((class08092)u, (Comparable)Integer.valueOf(n));
    }
}

