/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class04650
 *  minecraft.class04680
 *  minecraft.class05630
 *  minecraft.class05936
 *  minecraft.class06086
 *  minecraft.class06202
 *  minecraft.class06563
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import minecraft.class00095;
import minecraft.class00111;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class04650;
import minecraft.class04680;
import minecraft.class05630;
import minecraft.class05936;
import minecraft.class06086;
import minecraft.class06202;
import minecraft.class06563;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public class class00108
implements class04680 {
    private static final class01894 N = class01894.y((String)"toast/now_playing");
    private static final class01894 i = class01894.N((String)"icon/music_notes");
    private static final int R = 7;
    private static final int M = 16;
    private static final int B = 30;
    private static final int Z = 30;
    private static final int z = 5000;
    private static final int U = class06563.field_7967.R();
    private static final long E = 25L;
    private static int W;
    private static long m;
    private static int P;
    private boolean s;
    private double T;
    private final class06202 b;
    private class04650 j = class04650.field_2209;

    public int L() {
        return class00108.N(class00108.B(), (class01590)this.b.i_3);
    }

    public class00108() {
        this.b = class06202.Nq();
    }

    static {
        P = -1;
    }

    private static @Nullable String B() {
        return class06202.Nq().A().u();
    }

    public class04650 i() {
        return this.j;
    }

    public int u() {
        return 30;
    }

    public void y() {
        this.s = false;
    }

    public float N(int n) {
        return 0.0f;
    }

    public float N(int n, float f) {
        return (float)this.L() * f - (float)this.L();
    }

    public static void N() {
        long l;
        if (class00108.B() != null && (l = System.currentTimeMillis()) > m + 25L) {
            m = l;
            P = class00095.N(class00111.field_60688, (float)(++W));
        }
    }

    public void N(class04650 class046502) {
        this.j = class046502;
    }

    private static class00392 N(@Nullable String string) {
        if (string == null) {
            return class00392.i();
        }
        return class00392.L((String)string.replace("/", "."));
    }

    public void N(class05630 class056302) {
        this.s = true;
        this.T = (Double)class056302.K().method_41753();
        this.N(class04650.field_2210);
    }

    public void N(class06086 class060862, long l) {
        if (this.s) {
            this.j = (double)l < 5000.0 * this.T ? class04650.field_2210 : class04650.field_2209;
            class00108.N();
        }
    }

    public void N(class01054 class010542, class01590 class015902, long l) {
        class00108.N(class010542, class015902);
    }

    public static void N(class01054 class010542, class01590 class015902) {
        String string = class00108.B();
        if (string != null) {
            class010542.N(class08394.Na, N, 0, 0, class00108.N(string, class015902), 30);
            int n = 7;
            class010542.N(class08394.Na, i, 7, 7, 16, 16, P);
            class00392 class003922 = class00108.N(string);
            Objects.requireNonNull(class015902);
            class010542.y(class015902, class003922, 30, 15 - 4, U);
        }
    }

    private static int N(@Nullable String string, class01590 class015902) {
        return 30 + class015902.N((class05936)class00108.N(string)) + 7;
    }
}

