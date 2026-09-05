/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09139
 *  Nursultan.class09170
 *  Nursultan.class11499
 *  minecraft.class04995
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class09139;
import Nursultan.class09170;
import Nursultan.class11087;
import Nursultan.class11499;
import minecraft.class04995;
import minecraft.class07438;

public class class11083 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    private void M() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0L;
            this.N_1 = Float.valueOf(0.0f);
            this.N_2 = Float.valueOf(0.0f);
        }
    }

    public class11083() {
        this.M();
    }

    public class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, boolean bl, boolean bl2, boolean bl3) {
        class11499 class114994;
        if (!class110872.N(class074382, class114992) || bl || bl3) {
            return class114993;
        }
        float f = class09170.N((float)class114992.y(), (float)class114993.y());
        float f2 = class114993.R() - class114992.R();
        float f3 = Math.abs(f);
        float f4 = Math.abs(f2);
        if (f3 <= 0.55f && f4 <= 0.28f) {
            class11499 class114995 = this.N(class110872, class074382, class114992, bl2);
            return class114995 == null ? class114993 : class114995;
        }
        if (f3 > 6.4f || f4 > 3.1f) {
            return class114993;
        }
        long l = System.currentTimeMillis();
        if (l >= (Long)this.N_0) {
            float f5 = bl2 ? 1.0f : 0.0f;
            this.N_1 = Float.valueOf(class09139.N((double)(-0.42f - f5 * 0.22f), (double)(0.52f + f5 * 0.28f)));
            this.N_2 = Float.valueOf(class09139.N((double)(-0.18f - f5 * 0.08f), (double)(0.22f + f5 * 0.1f)));
            this.N_0 = l + (long)class09139.N((double)95.0, (double)(bl2 ? 210.0 : 310.0));
        }
        if (class110872.N(class074382, class114994 = new class11499(class114992.y() + class04995.N((float)(f * 0.22f + ((Float)this.N_1).floatValue()), (float)-0.88f, (float)0.94f), class04995.N((float)(class114992.R() + class04995.N((float)(f2 * 0.16f + ((Float)this.N_2).floatValue()), (float)-0.38f, (float)0.42f)), (float)-90.0f, (float)90.0f)))) {
            return class114994;
        }
        class11499 class114996 = new class11499(class114992.y() + class04995.N((float)(f * 0.16f), (float)-0.54f, (float)0.56f), class114992.R());
        if (class110872.N(class074382, class114996)) {
            return class114996;
        }
        class11499 class114997 = this.N(class110872, class074382, class114992, bl2);
        return class114997 == null ? class114993 : class114997;
    }

    public void N() {
        this.N_0 = 0L;
        this.N_1 = Float.valueOf(0.0f);
        this.N_2 = Float.valueOf(0.0f);
    }

    private class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, boolean bl) {
        float f = bl ? 1.0f : 0.0f;
        float[][] fArrayArray = new float[][]{{class09139.N((double)(-0.72f - f * 0.22f), (double)(0.82f + f * 0.28f)), class09139.N((double)-0.22f, (double)0.26f)}, {class09139.N((double)-0.46f, (double)0.52f), class09139.N((double)(-0.34f - f * 0.08f), (double)(0.34f + f * 0.1f))}, {class09139.N((double)-1.05f, (double)1.12f), class09139.N((double)-0.08f, (double)0.08f)}, {class09139.N((double)-0.22f, (double)0.22f), class09139.N((double)-0.42f, (double)0.46f)}, {class09139.N((double)-1.38f, (double)1.46f), class09139.N((double)-0.28f, (double)0.32f)}};
        for (float[] fArray : fArrayArray) {
            class11499 class114993 = new class11499(class114992.y() + fArray[0], class04995.N((float)(class114992.R() + fArray[1]), (float)-90.0f, (float)90.0f));
            if (!class110872.N(class074382, class114993)) continue;
            return class114993;
        }
        return null;
    }
}

