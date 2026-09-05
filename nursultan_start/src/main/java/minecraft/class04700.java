/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00061
 *  minecraft.class00392
 *  minecraft.class01321
 *  minecraft.class01590
 *  minecraft.class02057
 *  minecraft.class02071
 *  minecraft.class02072
 *  minecraft.class02080
 *  minecraft.class02091
 *  minecraft.class02102
 *  minecraft.class02252
 *  minecraft.class03286
 *  minecraft.class03597
 *  minecraft.class04944
 *  minecraft.class04959
 *  minecraft.class04981
 *  minecraft.class05092
 *  minecraft.class05096
 *  minecraft.class05097
 *  minecraft.class05111
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05685
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.FormatStyle;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import minecraft.class00061;
import minecraft.class00392;
import minecraft.class01321;
import minecraft.class01590;
import minecraft.class02057;
import minecraft.class02071;
import minecraft.class02072;
import minecraft.class02080;
import minecraft.class02091;
import minecraft.class02102;
import minecraft.class02252;
import minecraft.class03286;
import minecraft.class03597;
import minecraft.class04601;
import minecraft.class04944;
import minecraft.class04959;
import minecraft.class04981;
import minecraft.class05092;
import minecraft.class05096;
import minecraft.class05097;
import minecraft.class05111;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05685;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

class class04700
extends class03286
implements class00061 {
    private static final Logger y = LogUtils.getLogger();
    private static final int L = 200;
    private static final int u = 2;
    private static final int i = 6;
    static final class00392 N = class00392.L((String)"mco.configure.world.subscription.tab");
    private static final class00392 R = class00392.L((String)"mco.configure.world.subscription.start");
    private static final class00392 M = class00392.L((String)"mco.configure.world.subscription.timeleft");
    private static final class00392 B = class00392.L((String)"mco.configure.world.subscription.recurring.daysleft");
    private static final class00392 z = class00392.L((String)"mco.configure.world.subscription.expired").N(class06541.field_1080);
    private static final class00392 U = class00392.L((String)"mco.configure.world.subscription.less_than_a_day").N(class06541.field_1080);
    private static final class00392 E = class00392.L((String)"mco.configure.world.subscription.unknown");
    private static final class00392 W = class00392.L((String)"mco.configure.world.subscription.recurring.info");
    private final class05092 m;
    private final class06202 P;
    private final class05362 s;
    private final class02091 T;
    private final class02071 b;
    private final class02071 j;
    private final class02071 v;
    private class04981 n;
    private class00392 t = E;
    private class00392 G = E;
    private @Nullable class04959 l;

    public class00392 method_71245() {
        return class05220.y((class00392[])new class00392[]{N, R, this.G, M, this.t});
    }

    class04700(class05092 class050922, class06202 class062022, class04981 class049812) {
        super(N);
        this.m = class050922;
        this.P = class062022;
        this.n = class049812;
        class02080 class020802 = this.Z.y(6).u(1);
        class01590 class015902 = class050922.method_64506();
        Objects.requireNonNull(class015902);
        class020802.N((class02102)new class02071(200, 9, R, class015902));
        Objects.requireNonNull(class015902);
        this.b = (class02071)class020802.N((class02102)new class02071(200, 9, this.G, class015902));
        class020802.N((class02102)class02057.y((int)2));
        Objects.requireNonNull(class015902);
        this.j = (class02071)class020802.N((class02102)new class02071(200, 9, M, class015902));
        Objects.requireNonNull(class015902);
        this.v = (class02071)class020802.N((class02102)new class02071(200, 9, this.t, class015902));
        class020802.N((class02102)class02057.y((int)2));
        class020802.N((class02102)class05362.method_46430((class00392)class00392.L((String)"mco.configure.world.subscription.extend"), class053622 -> class01321.N((class05096)class050922, (String)class03597.N((String)class049812.L, (UUID)class062022.Ny().y()))).N(0, 0, 200, 20).N());
        class020802.N((class02102)class02057.y((int)2));
        this.s = (class05362)class020802.N((class02102)class05362.method_46430((class00392)class00392.L((String)"mco.configure.world.delete.button"), class053622 -> class062022.N((class05096)class02252.y((class05096)class050922, (class00392)class00392.L((String)"mco.configure.world.delete.question.line1"), class037232 -> this.N()))).N(0, 0, 200, 20).N());
        class020802.N((class02102)class02057.y((int)2));
        this.T = (class02091)class020802.N((class02102)class02091.N((class00392)class00392.i(), (class01590)class015902).N(200).N(), class02072.Z().y());
        this.T.N(false);
        this.N(class049812);
    }

    private void N(long l) {
        class05111 class051112 = class05111.N();
        try {
            class04944 class049442 = class051112.M(l);
            this.t = this.N(class049442.y());
            this.G = class04700.N(class049442.N());
            this.l = class049442.L();
        }
        catch (class05097 class050972) {
            y.error("Couldn't get subscription", (Throwable)class050972);
            this.P.N(this.m.N(class050972));
        }
    }

    private class00392 N(int n) {
        boolean bl;
        if (n < 0 && this.n.U) {
            return z;
        }
        if (n <= 1) {
            return U;
        }
        int n2 = n / 30;
        int n3 = n % 30;
        boolean bl2 = n2 > 0;
        boolean bl3 = bl = n3 > 0;
        if (bl2 && bl) {
            return class00392.N((String)"mco.configure.world.subscription.remaining.months.days", (Object[])new Object[]{n2, n3}).N(class06541.field_1080);
        }
        if (bl2) {
            return class00392.N((String)"mco.configure.world.subscription.remaining.months", (Object[])new Object[]{n2}).N(class06541.field_1080);
        }
        if (bl) {
            return class00392.N((String)"mco.configure.world.subscription.remaining.days", (Object[])new Object[]{n3}).N(class06541.field_1080);
        }
        return class00392.i();
    }

    public void N(class04981 class049812) {
        this.n = class049812;
        this.N(class049812.y);
        this.b.method_25355(this.G);
        if (this.l == class04959.field_19443) {
            this.j.method_25355(M);
        } else if (this.l == class04959.field_19444) {
            this.j.method_25355(B);
        }
        this.v.method_25355(this.t);
        boolean bl = class05685.N() && class049812.t != null;
        this.s.field_22763 = class049812.U;
        if (bl) {
            this.T.method_25355((class00392)class00392.N((String)"mco.snapshot.subscription.info", (Object[])new Object[]{class049812.t}));
        } else {
            this.T.method_25355(W);
        }
        this.Z.N();
    }

    private void N() {
        class04601.N(class051112 -> class051112.Z(this.n.y), class04601.N(arg_0 -> ((class05092)this.m).N(arg_0), "Couldn't delete world")).thenRunAsync(() -> this.P.N(this.m.L()), (Executor)this.P);
        this.P.N((class05096)this.m);
    }

    private static class00392 N(Instant instant) {
        return class00392.y((String)ZonedDateTime.ofInstant(instant, ZoneId.systemDefault()).format(class07536.N((FormatStyle)FormatStyle.MEDIUM))).N(class06541.field_1080);
    }
}

