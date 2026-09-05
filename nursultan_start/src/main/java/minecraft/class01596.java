/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00751
 *  minecraft.class04206
 *  minecraft.class06338
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00751;
import minecraft.class01624;
import minecraft.class04206;
import minecraft.class06338;
import minecraft.class07536;

public class class01596 {
    public static final MapCodec<class01596> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04206.NY.T().fieldOf("type").forGetter(class01596::N), (App)class06338.T.fieldOf("level").forGetter(class01596::y), (App)Codec.LONG.optionalFieldOf("ticks_left", (Object)0L).forGetter(class015962 -> class015962.u)).apply(instance, class01596::new));
    private final class01624 y;
    private final int L;
    private long u;

    public void L() {
        this.u = this.y.M();
    }

    public class01596(class01624 class016242, int n) {
        this(class016242, n, class016242.M());
    }

    private class01596(class01624 class016242, int n, long l) {
        this.y = class016242;
        this.L = n;
        this.u = l;
    }

    public String toString() {
        if (this.y.R()) {
            return "Ticket[" + class07536.N((class00751)class04206.NY, (Object)((Object)this.y)) + " " + this.L + "] with " + this.u + " ticks left ( out of" + this.y.M() + ")";
        }
        return "Ticket[" + class07536.N((class00751)class04206.NY, (Object)((Object)this.y)) + " " + this.L + "] with no timeout";
    }

    public boolean i() {
        return this.y.R() && this.u < 0L;
    }

    public void u() {
        if (this.y.R()) {
            --this.u;
        }
    }

    public int y() {
        return this.L;
    }

    public class01624 N() {
        return this.y;
    }
}

