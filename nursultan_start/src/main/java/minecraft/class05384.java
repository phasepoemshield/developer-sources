/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  java.lang.MatchException
 *  minecraft.class01331
 *  minecraft.class03063
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class05187
 *  minecraft.class05283
 *  minecraft.class05946
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07536
 *  minecraft.class08753
 *  minecraft.class08761
 *  minecraft.class08771
 *  minecraft.class08773
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.concurrent.TimeUnit;
import minecraft.class01331;
import minecraft.class03063;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05187;
import minecraft.class05283;
import minecraft.class05946;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07536;
import minecraft.class08753;
import minecraft.class08761;
import minecraft.class08771;
import minecraft.class08773;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05384
implements class08773 {
    static final Logger N = LogUtils.getLogger();
    private static final long L = TimeUnit.SECONDS.toMillis(30L);
    public static final long y = 500L;
    private final class08761 u = new class08761(true);
    private @Nullable class08771 i;
    private volatile @Nullable class08753 R;
    private @Nullable class05283 M;
    private final long B;

    public void L() {
        if (this.M != null) {
            this.M = this.M.L();
        }
    }

    public class05384() {
        this(0L);
    }

    public class05384(long l) {
        this.B = l;
    }

    public float i() {
        return this.u.N();
    }

    public @Nullable class08771 u() {
        return this.i;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean y() {
        long l;
        class05283 class052832 = this.M;
        if (!(class052832 instanceof class01331)) return false;
        try {
            l = ((class01331)class052832).N();
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
        if (class07536.L() < l + this.B) return false;
        return true;
    }

    public void N(class08753 class087532) {
        this.u.N(class087532);
    }

    public void N(class05946<class07299> class059462, class07321 class073212) {
        if (this.i != null) {
            this.i.N(class059462, class073212);
        }
    }

    public void N(class08753 class087532, int n) {
        this.u.N(class087532, n);
        this.R = class087532;
    }

    public void N() {
        if (this.M != null) {
            this.M = this.M.y();
        }
    }

    public void N(class04453 class044532, class03448 class034482, class03063 class030632) {
        this.M = new class05187(class044532, class034482, class030632, class07536.L() + L);
    }

    public void N(class08771 class087712) {
        this.i = class087712;
    }

    public void N(class08753 class087532, int n, int n2) {
        this.u.N(class087532, n, n2);
    }

    public boolean R() {
        return this.R != null;
    }
}

