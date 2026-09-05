/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10668
 *  Nursultan.class10671
 *  Nursultan.class10672
 *  minecraft.class01407
 *  minecraft.class01421
 *  minecraft.class02566
 *  minecraft.class06752
 *  minecraft.class06754
 *  minecraft.class06889
 *  minecraft.class06959
 *  org.joml.Matrix4f
 */
package minecraft;

import Nursultan.class10668;
import Nursultan.class10671;
import Nursultan.class10672;
import minecraft.class01407;
import minecraft.class01421;
import minecraft.class02566;
import minecraft.class06715;
import minecraft.class06720;
import minecraft.class06722;
import minecraft.class06752;
import minecraft.class06754;
import minecraft.class06889;
import minecraft.class06959;
import org.joml.Matrix4f;

public class class06732
implements class06722 {
    private final class06720 N = new class06720(true);
    private final class06720 y = new class06720(false);
    private boolean L = true;

    @Override
    public void N(class06889 class068892, class06889 class068893, class06889 class068894, class06889 class068895, int n) {
        this.N(n).L().add(new class06754(class068892, class068893, class068894, class068895, n));
        this.L = false;
    }

    @Override
    public void N(class06889 class068892, String string, class06715 class067152) {
        this.N(class067152.y()).i().add(new class10672(class068892, string, class067152));
        this.L = false;
    }

    public void N(class01421 class014212, class01407 class014072, class06959 class069592, Matrix4f matrix4f) {
        this.N.N(class014212, class014072, class069592, matrix4f);
        this.y.N(class014212, class014072, class069592, matrix4f);
    }

    public boolean N() {
        return this.L;
    }

    private class06720 N(int n) {
        if (class02566.y((int)n) < 255) {
            return this.y;
        }
        return this.N;
    }

    @Override
    public void N(class06889 class068892, int n, float f) {
        this.N(n).R().add(new class10671(class068892, n, f));
        this.L = false;
    }

    @Override
    public void N(class06889 class068892, class06889 class068893, int n, float f) {
        this.N(n).y().add(new class10668(class068892, class068893, n, f));
        this.L = false;
    }

    @Override
    public void N(class06889[] class06889Array, int n) {
        this.N(n).u().add(new class06752(class06889Array, n));
        this.L = false;
    }
}

