/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class01885
 *  minecraft.class01894
 *  minecraft.class02057
 *  minecraft.class02060
 *  minecraft.class02071
 *  minecraft.class02072
 *  minecraft.class02080
 *  minecraft.class02102
 *  minecraft.class03686
 *  minecraft.class04654
 *  minecraft.class04697
 *  minecraft.class04969
 *  minecraft.class04981
 *  minecraft.class04982
 *  minecraft.class05096
 *  minecraft.class05129
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05407
 *  minecraft.class05434
 *  minecraft.class05685
 *  minecraft.class06202
 *  minecraft.class06350
 *  minecraft.class06478
 *  minecraft.class08702
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01590;
import minecraft.class01885;
import minecraft.class01894;
import minecraft.class02057;
import minecraft.class02060;
import minecraft.class02071;
import minecraft.class02072;
import minecraft.class02080;
import minecraft.class02102;
import minecraft.class03686;
import minecraft.class04654;
import minecraft.class04697;
import minecraft.class04708;
import minecraft.class04720;
import minecraft.class04724;
import minecraft.class04728;
import minecraft.class04734;
import minecraft.class04739;
import minecraft.class04969;
import minecraft.class04981;
import minecraft.class04982;
import minecraft.class05096;
import minecraft.class05129;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05407;
import minecraft.class05434;
import minecraft.class05685;
import minecraft.class06202;
import minecraft.class06350;
import minecraft.class06478;
import minecraft.class08702;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04736
extends class05407 {
    static final Logger N = LogUtils.getLogger();
    private static final class00392 B = class00392.L((String)"mco.selectServer.create");
    private static final class00392 Z = class00392.L((String)"mco.selectServer.create.subtitle").y(-6250336);
    private static final class00392 z = class00392.L((String)"mco.configure.world.switch.slot");
    private static final class00392 U = class00392.L((String)"mco.configure.world.switch.slot.subtitle").y(-6250336);
    private static final class00392 E = class00392.L((String)"mco.reset.world.generate");
    private static final class00392 W = class00392.L((String)"mco.reset.world.title");
    private static final class00392 m = class00392.L((String)"mco.reset.world.warning").y(-65536);
    public static final class00392 y = class00392.L((String)"mco.create.world.reset.title");
    private static final class00392 P = class00392.L((String)"mco.reset.world.resetting.screen.title");
    private static final class00392 s = class00392.L((String)"mco.reset.world.template");
    private static final class00392 T = class00392.L((String)"mco.reset.world.adventure");
    private static final class00392 b = class00392.L((String)"mco.reset.world.experience");
    private static final class00392 j = class00392.L((String)"mco.reset.world.inspiration");
    private final class05096 v;
    private final class04981 n;
    private final class00392 t;
    private final class00392 e;
    private static final class01894 H = class01894.y((String)"textures/gui/realms/upload.png");
    private static final class01894 c = class01894.y((String)"textures/gui/realms/adventure.png");
    private static final class01894 X = class01894.y((String)"textures/gui/realms/survival_spawn.png");
    private static final class01894 a = class01894.y((String)"textures/gui/realms/new_world.png");
    private static final class01894 p = class01894.y((String)"textures/gui/realms/experience.png");
    private static final class01894 F = class01894.y((String)"textures/gui/realms/inspiration.png");
    class05434 L;
    class05434 u;
    class05434 i;
    class05434 R;
    public final int M;
    private final @Nullable class04734 A;
    private final Runnable f;
    private final class03686 C = new class03686((class05096)this);

    private class04736(class05096 class050962, class04981 class049812, int n, class00392 class003922, class00392 class003923, class00392 class003924, Runnable runnable) {
        this(class050962, class049812, n, class003922, class003923, class003924, null, runnable);
    }

    public class04736(class05096 class050962, class04981 class049812, int n, class00392 class003922, class00392 class003923, class00392 class003924, @Nullable class04734 class047342, Runnable runnable) {
        super(class003922);
        this.v = class050962;
        this.n = class049812;
        this.M = n;
        this.t = class003923;
        this.e = class003924;
        this.A = class047342;
        this.f = runnable;
    }

    static /* synthetic */ class01590 y(class04736 class047362) {
        return class047362.field_22793;
    }

    public static class04736 N(class05096 class050962, int n, class04981 class049812, Runnable runnable) {
        return new class04736(class050962, class049812, n, z, U, y, runnable);
    }

    static /* synthetic */ class06202 N(class04736 class047362) {
        return class047362.field_22787;
    }

    public static class04736 N(class05096 class050962, class04981 class049812, class04734 class047342, Runnable runnable) {
        return new class04736(class050962, class049812, class049812.T, B, Z, y, class047342, runnable);
    }

    private void N(@Nullable class04982 class049822) {
        this.field_22787.N((class05096)this);
        if (class049822 != null) {
            this.N((class05129)new class06350(class049822, this.n.y, this.e, this.f));
        }
        class05685.u();
    }

    private void N(class05129 class051292) {
        ArrayList<class05129> arrayList = new ArrayList<class05129>();
        if (this.A != null) {
            arrayList.add(this.A);
        }
        if (this.M != this.n.T) {
            arrayList.add(new class04724(this.n.y, this.M, () -> {}));
        }
        arrayList.add(class051292);
        this.field_22787.N((class05096)new class04708(this.v, arrayList.toArray(new class05129[0])));
    }

    public static class04736 N(class05096 class050962, class04981 class049812, Runnable runnable) {
        return new class04736(class050962, class049812, class049812.T, W, m, P, runnable);
    }

    public void method_25426() {
        class01885 class018852 = (class01885)this.C.N((class02102)class01885.u());
        class02072 class020722 = class018852.L();
        Objects.requireNonNull(this.field_22793);
        class020722.N(3);
        class018852.N((class02102)new class02071(this.field_22785, this.field_22793), class02072::y);
        class018852.N((class02102)new class02071(this.t, this.field_22793), class02072::y);
        new class04697(this, "Realms-reset-world-fetcher").start();
        class02080 class020802 = ((class02060)this.C.L((class02102)new class02060())).u(3);
        class020802.L().R(16);
        class020802.N((class02102)new class04728(this, (class01590)this.field_22787.i_3, E, a, class053622 -> class08702.N((class06202)this.field_22787, (class05096)this.v, (class05096)this, (int)this.M, (class04981)this.n, (class04734)this.A)));
        class020802.N((class02102)new class04728(this, (class01590)this.field_22787.i_3, class04720.N, H, class053622 -> this.field_22787.N((class05096)new class04720(this.A, this.n.y, this.M, this))));
        class020802.N((class02102)new class04728(this, (class01590)this.field_22787.i_3, s, X, class053622 -> this.field_22787.N((class05096)new class04739(s, this::N, class04969.field_19437, this.L))));
        class020802.N((class02102)class02057.y((int)16), 3);
        class020802.N((class02102)new class04728(this, (class01590)this.field_22787.i_3, T, c, class053622 -> this.field_22787.N((class05096)new class04739(T, this::N, class04969.field_19439, this.u))));
        class020802.N((class02102)new class04728(this, (class01590)this.field_22787.i_3, b, p, class053622 -> this.field_22787.N((class05096)new class04739(b, this::N, class04969.field_19440, this.i))));
        class020802.N((class02102)new class04728(this, (class01590)this.field_22787.i_3, j, F, class053622 -> this.field_22787.N((class05096)new class04739(j, this::N, class04969.field_19441, this.R))));
        this.C.y((class02102)class05362.method_46430((class00392)class05220.U, class053622 -> this.method_25419()).N());
        this.C.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    public void method_48640() {
        this.C.N();
    }

    public void method_25419() {
        this.field_22787.N(this.v);
    }

    public class00392 method_25435() {
        return class05220.N((class00392[])new class00392[]{this.method_25440(), this.t});
    }
}

