/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01304
 *  minecraft.class01590
 *  minecraft.class01885
 *  minecraft.class02102
 *  minecraft.class03686
 *  minecraft.class03725
 *  minecraft.class04654
 *  minecraft.class04702
 *  minecraft.class04734
 *  minecraft.class04736
 *  minecraft.class04927
 *  minecraft.class04981
 *  minecraft.class05018
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05407
 *  minecraft.class05685
 *  minecraft.class06478
 *  minecraft.class07536
 */
package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import minecraft.class00392;
import minecraft.class01304;
import minecraft.class01590;
import minecraft.class01885;
import minecraft.class02102;
import minecraft.class03686;
import minecraft.class03725;
import minecraft.class04654;
import minecraft.class04702;
import minecraft.class04734;
import minecraft.class04736;
import minecraft.class04927;
import minecraft.class04981;
import minecraft.class05018;
import minecraft.class05096;
import minecraft.class05097;
import minecraft.class05111;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05407;
import minecraft.class05685;
import minecraft.class06478;
import minecraft.class07536;

public class class05132
extends class05407 {
    private static final class00392 N = class00392.L((String)"mco.selectServer.create");
    private static final class00392 y = class00392.L((String)"mco.configure.world.name");
    private static final class00392 L = class00392.L((String)"mco.configure.world.description");
    private static final int u = 10;
    private static final int i = 210;
    private final class05685 R;
    private final class03686 M = new class03686((class05096)((Object)this));
    private class04927 B;
    private class04927 Z;
    private final Runnable z;

    public class05132(class05685 class056852, class04981 class049812, boolean bl) {
        super(N);
        this.R = class056852;
        this.z = () -> this.N(class049812, bl);
    }

    private void y(class04981 class049812) {
        class04734 class047342 = new class04734(class049812.y, this.B.method_1882(), this.Z.method_1882());
        class04736 class047362 = class04736.N((class05096)((Object)this), (class04981)class049812, (class04734)class047342, () -> this.field_22787.execute(() -> {
            class05685.u();
            this.field_22787.N((class05096)this.R);
        }));
        this.field_22787.N((class05096)class047362);
    }

    private void N(class04981 class049813, boolean bl) {
        if (!class049813.Z() && bl) {
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.field_22787.N((class05096)new class01304(() -> {
                atomicBoolean.set(true);
                this.R.i();
                this.field_22787.N((class05096)this.R);
            }, (class00392)class00392.L((String)"mco.upload.preparing"), (class00392)class00392.i()));
            CompletableFuture.supplyAsync(() -> class05132.N(class049813), (Executor)class07536.B()).thenAcceptAsync(class049812 -> {
                if (!atomicBoolean.get()) {
                    this.y((class04981)class049812);
                }
            }, (Executor)this.field_22787).exceptionallyAsync(throwable -> {
                this.R.i();
                Throwable throwable2 = throwable.getCause();
                Object object = throwable2 instanceof class05097 ? ((class05097)throwable2).N.y() : class00392.L((String)"mco.errorMessage.initialize.failed");
                this.field_22787.N((class05096)new class04702((class00392)object, (class05096)this.R));
                return null;
            }, (Executor)this.field_22787);
        } else {
            this.y(class049813);
        }
    }

    private static class04981 N(class04981 class049812) {
        class05111 class051112 = class05111.N();
        try {
            return class051112.N((Long)class049812.y);
        }
        catch (class05097 class050972) {
            throw new RuntimeException(class050972);
        }
    }

    public void method_25426() {
        this.M.N(this.field_22785, this.field_22793);
        class01885 class018852 = ((class01885)this.M.L((class02102)class01885.u())).N(10);
        class05362 class053623 = class05362.method_46430((class00392)class05220.z, class053622 -> this.z.run()).N();
        class053623.field_22763 = false;
        this.B = new class04927(this.field_22793, 210, 20, y);
        this.B.method_1863(string -> {
            class053622.field_22763 = !class05018.B((String)string);
        });
        this.Z = new class04927(this.field_22793, 210, 20, L);
        class018852.N((class02102)class03725.N((class01590)this.field_22793, (class02102)this.B, (class00392)y));
        class018852.N((class02102)class03725.N((class01590)this.field_22793, (class02102)this.Z, (class00392)L));
        class01885 class018853 = (class01885)this.M.y((class02102)class01885.i().N(10));
        class018853.N((class02102)class053623);
        class018853.N((class02102)class05362.method_46430((class00392)class05220.U, class053622 -> this.method_25419()).N());
        this.M.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    protected void method_56131() {
        this.method_48265((class04654)this.B);
    }

    public void method_48640() {
        this.M.N();
    }

    public void method_25419() {
        this.field_22787.N((class05096)this.R);
    }
}

