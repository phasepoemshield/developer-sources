/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class06745
 *  minecraft.class06747
 *  minecraft.class06755
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07211
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00734;
import minecraft.class00753;
import minecraft.class06715;
import minecraft.class06719;
import minecraft.class06721;
import minecraft.class06723;
import minecraft.class06728;
import minecraft.class06730;
import minecraft.class06734;
import minecraft.class06737;
import minecraft.class06740;
import minecraft.class06742;
import minecraft.class06745;
import minecraft.class06747;
import minecraft.class06755;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07211;
import org.jspecify.annotations.Nullable;

public class class06724 {
    static final ThreadLocal<@Nullable class06728> N = new ThreadLocal();

    private class06724() {
    }

    public static class06723 y(class06889 class068892, class06889 class068893, int n, float f) {
        return class06724.N((class06730)new class06755(class068892, class068893, n, f));
    }

    public static class06723 y(class06889 class068892, class06889 class068893, int n) {
        return class06724.N((class06730)new class06755(class068892, class068893, n, 2.5f));
    }

    public static class06723 N(class06889 class068892, int n, float f) {
        return class06724.N(new class06721(class068892, n, f));
    }

    public static class06723 N(class06889 class068892, class06889 class068893, class06889 class068894, class06889 class068895, class06747 class067472) {
        return class06724.N(new class06740(class068892, class068893, class068894, class068895, class067472));
    }

    public static class06723 N(class06889 class068892, class06889 class068893, class07211 class072112, class06747 class067472) {
        return class06724.N(class06740.N(class068892, class068893, class072112, class067472));
    }

    public static class06723 N(String string, class07209 class072092, int n, int n2, float f) {
        double d = 1.3;
        double d2 = 0.2;
        class06723 class067232 = class06724.N(string, class06889.N((class00753)class072092, (double)0.5, (double)(1.3 + (double)n * 0.2), (double)0.5), class06715.N(n2).N(f));
        class067232.N();
        return class067232;
    }

    public static class06723 N(class07049 class070492, int n, String string, int n2, float f) {
        double d = 2.4;
        double d2 = 0.25;
        double d3 = (double)class070492.method_31477() + 0.5;
        double d4 = class070492.method_23318() + 2.4 + (double)n * 0.25;
        double d5 = (double)class070492.method_31479() + 0.5;
        float f2 = 0.5f;
        class06723 class067232 = class06724.N(string, new class06889(d3, d4, d5), class06715.y(n2).N(f).y(0.5f));
        class067232.N();
        return class067232;
    }

    public static class06723 N(String string, class06889 class068892, class06715 class067152) {
        return class06724.N(new class06719(class068892, string, class067152));
    }

    public static class06723 N(class06889 class068892, class06889 class068893, int n, float f) {
        return class06724.N(new class06742(class068892, class068893, n, f));
    }

    public static class06723 N(class07209 class072092, float f, class06747 class067472) {
        return class06724.N(new class00734(class072092).M((double)f), class067472);
    }

    public static class06723 N(class07209 class072092, class06747 class067472) {
        return class06724.N(new class00734(class072092), class067472);
    }

    public static class06723 N(class00734 class007342, class06747 class067472, boolean bl) {
        return class06724.N(new class06737(class007342, class067472, bl));
    }

    public static class06723 N(class00734 class007342, class06747 class067472) {
        return class06724.N(class007342, class067472, false);
    }

    public static class06723 N(class06730 class067302) {
        class06728 class067282 = N.get();
        if (class067282 == null) {
            throw new IllegalStateException("Gizmos cannot be created here! No GizmoCollector has been registered.");
        }
        return class067282.method_75532(class067302);
    }

    public static class06734 N(class06728 class067282) {
        class06734 class067342 = new class06734();
        N.set(class067282);
        return class067342;
    }

    public static class06723 N(class06889 class068892, class06889 class068893, int n) {
        return class06724.N(new class06742(class068892, class068893, n, 3.0f));
    }

    public static class06723 N(class06889 class068892, float f, class06747 class067472) {
        return class06724.N((class06730)new class06745(class068892, f, class067472));
    }
}

