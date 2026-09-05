/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class04995
 *  minecraft.class05946
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07536
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class00392;
import minecraft.class04995;
import minecraft.class05946;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07536;
import minecraft.class08753;
import minecraft.class08761;
import minecraft.class08773;
import org.slf4j.Logger;

public class class08759
implements class08773 {
    private static final Logger N = LogUtils.getLogger();
    private final boolean y;
    private final class08761 L;
    private boolean u;
    private long i = Long.MAX_VALUE;
    private long R = Long.MAX_VALUE;

    public class08759(boolean bl) {
        this.y = bl;
        this.L = new class08761(bl);
    }

    public static class08759 y() {
        return new class08759(true);
    }

    @Override
    public void N(class08753 class087532) {
        class08753 class087533;
        if (this.u) {
            return;
        }
        this.L.N(class087532);
        class08753 class087534 = class087533 = this.y ? class08753.field_61108 : class08753.field_61107;
        if (class087532 == class087533) {
            N.info("Time elapsed: {} ms", (Object)(class07536.L() - this.i));
            this.R = Long.MAX_VALUE;
            this.u = true;
        }
    }

    @Override
    public void N(class05946<class07299> class059462, class07321 class073212) {
    }

    @Override
    public void N(class08753 class087532, int n, int n2) {
        if (this.u) {
            return;
        }
        this.L.N(class087532, n, n2);
        if (class07536.L() > this.R) {
            this.R += 500L;
            int n3 = class04995.y((float)(this.L.N() * 100.0f));
            N.info(class00392.N((String)"menu.preparingSpawn", (Object[])new Object[]{n3}).getString());
        }
    }

    public static class08759 N() {
        return new class08759(false);
    }

    @Override
    public void N(class08753 class087532, int n) {
        if (this.u) {
            return;
        }
        if (this.i == Long.MAX_VALUE) {
            long l;
            this.i = l = class07536.L();
            this.R = l;
        }
        this.L.N(class087532, n);
        switch (class087532) {
            case field_61106: {
                N.info("Selecting global world spawn...");
                break;
            }
            case field_61107: {
                N.info("Loading {} persistent chunks...", (Object)n);
                break;
            }
            case field_61108: {
                N.info("Loading {} chunks for player spawn...", (Object)n);
            }
        }
    }
}

