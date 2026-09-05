/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  minecraft.class02578
 *  minecraft.class02613
 *  minecraft.class03950
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07080
 *  minecraft.class08728
 *  minecraft.class08743
 *  minecraft.class08777
 */
package minecraft;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import minecraft.class01296;
import minecraft.class02578;
import minecraft.class02613;
import minecraft.class03335;
import minecraft.class03337;
import minecraft.class03345;
import minecraft.class03354;
import minecraft.class03950;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07080;
import minecraft.class08728;
import minecraft.class08743;
import minecraft.class08777;

class class03352
extends class03354 {
    private final class08777 R;
    final /* synthetic */ class03345 i;

    public class03352(class03345 class033452, class08777 class087772) {
        this.i = class033452;
        super(class033452, true);
        this.R = class087772;
    }

    @Override
    protected String y() {
        return "rend_chk_sort";
    }

    @Override
    public void N() {
        this.N.set(true);
    }

    @Override
    public CompletableFuture<class03335> N(class03950 class039502) {
        if (this.N.get()) {
            return CompletableFuture.completedFuture(class03335.field_21439);
        }
        class02578 class025782 = this.R.u();
        if (class025782 == null || this.R.N(class08743.field_60926)) {
            return CompletableFuture.completedFuture(class03335.field_21439);
        }
        long l = this.i.u;
        class03337 class033372 = this.i.N(class01296.N((long)l));
        class08728 class087282 = class08728.N((class06889)this.i.R.M, (long)l);
        if (!this.R.y(class087282) && !class087282.N()) {
            return CompletableFuture.completedFuture(class03335.field_21439);
        }
        class02613 class026132 = class025782.N(class039502.N(class08743.field_60926), class033372);
        if (class026132 == null) {
            return CompletableFuture.completedFuture(class03335.field_21439);
        }
        if (this.N.get()) {
            class026132.close();
            return CompletableFuture.completedFuture(class03335.field_21439);
        }
        return this.i.N(this.R, class026132, class08743.field_60926).handle((void_, throwable) -> {
            if (throwable != null && !(throwable instanceof CancellationException) && !(throwable instanceof InterruptedException)) {
                class06202.Nq().u(class07080.N((Throwable)throwable, (String)"Rendering section"));
            }
            if (this.N.get()) {
                return class03335.field_21439;
            }
            this.R.N(class087282);
            return class03335.field_21438;
        });
    }
}

