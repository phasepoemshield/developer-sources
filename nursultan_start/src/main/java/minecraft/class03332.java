/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  minecraft.class01296
 *  minecraft.class02586
 *  minecraft.class03498
 *  minecraft.class03950
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07080
 *  minecraft.class08694
 *  minecraft.class08700
 *  minecraft.class08728
 *  minecraft.class08744
 *  minecraft.class08777
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import minecraft.class01296;
import minecraft.class02586;
import minecraft.class03335;
import minecraft.class03345;
import minecraft.class03354;
import minecraft.class03498;
import minecraft.class03950;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07080;
import minecraft.class08694;
import minecraft.class08700;
import minecraft.class08728;
import minecraft.class08744;
import minecraft.class08777;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;

public class class03332
extends class03354 {
    protected final class03498 i;
    final /* synthetic */ class03345 R;
    private final Object2IntMap M;

    public class03332(class03345 class033452, class03498 class034982, boolean bl) {
        this.R = class033452;
        super(class033452, bl);
        this.M = this.i();
        this.i = class034982;
    }

    private Object2IntMap i() {
        return WorldRenderingSettings.INSTANCE.getBlockStateIds();
    }

    @Override
    protected String y() {
        return "rend_chk_rebuild";
    }

    @Override
    public void N() {
        if (this.N.compareAndSet(false, true)) {
            this.R.y(false);
        }
    }

    @Override
    public CompletableFuture<class03335> N(class03950 class039502) {
        class02586 class025862;
        if (this.N.get()) {
            return CompletableFuture.completedFuture(class03335.field_21439);
        }
        long l = this.R.u;
        class01296 class012962 = class01296.N((long)l);
        if (this.N.get()) {
            return CompletableFuture.completedFuture(class03335.field_21439);
        }
        try (class08694 class086942 = class08700.N().i("Compile Section");){
            class025862 = this.R.R.B.N(class012962, this.i, this.R.N(class012962), class039502);
        }
        class086942 = class08728.N((class06889)this.R.R.M, (long)l);
        if (this.N.get()) {
            class025862.N();
            return CompletableFuture.completedFuture(class03335.field_21439);
        }
        class08777 class087772 = new class08777((class08728)class086942, class025862);
        CompletableFuture<Void> var8 = this.R.N(class025862.y, class087772);
        return var8.handle((void_, throwable) -> {
            if (throwable != null && !(throwable instanceof CancellationException) && !(throwable instanceof InterruptedException)) {
                class06202.Nq().u(class07080.N((Throwable)throwable, (String)"Rendering section"));
            }
            if (this.N.get() || this.R.R.u) {
                this.R.R.y.add((class08744)class087772);
                return class03335.field_21439;
            }
            this.R.N((class08744)class087772);
            return class03335.field_21438;
        });
    }
}

