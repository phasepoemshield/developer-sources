/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10968
 *  Nursultan.class11847
 *  Nursultan.class11910
 *  Nursultan.class11938
 *  Nursultan.class11951
 *  com.mojang.logging.LogUtils
 *  io.netty.channel.ChannelFuture
 *  minecraft.class00392
 *  minecraft.class00642
 *  minecraft.class01054
 *  minecraft.class03330
 *  minecraft.class03371
 *  minecraft.class03415
 *  minecraft.class03420
 *  minecraft.class04254
 *  minecraft.class04568
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05153
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class06202
 *  minecraft.class07536
 *  minecraft.class07980
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.mixin.networking.client.accessor.ConnectScreenAccessor
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10968;
import Nursultan.class11847;
import Nursultan.class11910;
import Nursultan.class11938;
import Nursultan.class11951;
import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.util.concurrent.atomic.AtomicInteger;
import minecraft.class00392;
import minecraft.class00642;
import minecraft.class01054;
import minecraft.class03330;
import minecraft.class03371;
import minecraft.class03415;
import minecraft.class03420;
import minecraft.class04254;
import minecraft.class04568;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05153;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05740;
import minecraft.class06202;
import minecraft.class07536;
import minecraft.class07980;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.mixin.networking.client.accessor.ConnectScreenAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class05763
extends class05096
implements ConnectScreenAccessor {
    private static final AtomicInteger Z = new AtomicInteger(0);
    static final Logger N = LogUtils.getLogger();
    private static final long z = 2000L;
    public static final class00392 y = class00392.L((String)"connect.aborted");
    public static final class00392 L = class00392.N((String)"disconnect.genericReason", (Object[])new Object[]{class00392.L((String)"disconnect.unknownHost")});
    volatile @Nullable class00642 u;
    @Nullable ChannelFuture i;
    volatile boolean R;
    final class05096 M;
    private class00392 U = class00392.L((String)"connect.connecting");
    private long E = -1L;
    final class00392 B;

    public /* synthetic */ class00642 getConnection() {
        return this.u;
    }

    private class05763(class05096 class050962, class00392 class003922) {
        super(class05153.N);
        this.M = class050962;
        this.B = class003922;
    }

    private static void N(class05096 class050962, class06202 class062022, class03420 class034202, class04568 class045682, boolean bl, class04254 class042542, CallbackInfo callbackInfo) {
        class11938.z().N((class11951)class11847.N());
    }

    public static void N(class05096 class050962, class06202 class062022, class03420 class034202, class04568 class045682, boolean bl, @Nullable class04254 class042542) {
        if ((class05096)class062022.v_3 instanceof class05763) {
            N.error("Attempt to connect while already connecting");
            return;
        }
        class00392 class003922 = class042542 != null ? class05220.j : (bl ? class03330.N : class05220.v);
        class05763 class057632 = new class05763(class050962, class003922);
        if (class042542 != null) {
            class057632.N((class00392)class00392.L((String)"connect.transferring"));
        }
        class062022.y(false);
        class062022.No();
        class062022.N(class03415.N((String)class045682.y));
        class062022.Nl().N(class03371.field_44569, class045682.y, class045682.N);
        class062022.N((class05096)class057632);
        class057632.N(class062022, class034202, class045682, class042542);
        class05763.N(class050962, class062022, class034202, class045682, bl, class042542, null);
    }

    private void N(class06202 class062022, class03420 class034202, class04568 class045682, class04254 class042542, CallbackInfo callbackInfo) {
        if (class045682 != null) {
            class11910.N_6 = class045682;
        }
        class11938.L().L((Object)class10968.N((class03420)class034202));
    }

    public final void N(class00392 class003922) {
        this.U = class003922;
    }

    private void N(class06202 class062022, class03420 class034202, class04568 class045682, @Nullable class04254 class042542) {
        this.N(class062022, class034202, class045682, class042542, null);
        N.info("Connecting to {}, {}", (Object)class034202.N(), (Object)class034202.y());
        class05740 class057402 = new class05740(this, "Server Connector #" + Z.incrementAndGet(), class034202, class062022, class045682, class042542);
        class057402.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new class07980(N));
        class057402.start();
    }

    public void method_25426() {
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.i, class053622 -> {
            class05763 class057632 = this;
            synchronized (class057632) {
                this.R = true;
                if (this.i != null) {
                    this.i.cancel(true);
                    this.i = null;
                }
                if (this.u != null) {
                    this.u.method_10747(y);
                }
            }
            this.field_22787.N(this.M);
        }).N(this.field_22789 / 2 - 100, this.field_22790 / 4 + 120 + 12, 200, 20).N());
    }

    public boolean method_25422() {
        return false;
    }

    public void method_25393() {
        if (this.u != null) {
            if (this.u.method_10758()) {
                this.u.method_10754();
            } else {
                this.u.method_10768();
            }
        }
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        long l = class07536.L();
        if (l - this.E > 2000L) {
            this.E = l;
            this.field_22787.NT().u((class00392)class00392.L((String)"narrator.joining"));
        }
        class010542.N(this.field_22793, this.U, this.field_22789 / 2, this.field_22790 / 2 - 50, -1);
    }
}

