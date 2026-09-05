/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09080
 *  Nursultan.class09093
 *  Nursultan.class09794
 *  Nursultan.class09838
 *  Nursultan.class09868
 *  Nursultan.class09870
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09080;
import Nursultan.class09093;
import Nursultan.class09794;
import Nursultan.class09838;
import Nursultan.class09868;
import Nursultan.class09870;

public class class11725
implements class09868 {
    public Object N_0;

    private boolean L(class09838 class098382) {
        return class098382 != null && class098382.L() == class09870.ITALIC;
    }

    public class11725() {
        this.u();
    }

    private void u() {
    }

    private class09079 y(class09838 class098382) {
        return class09079.N((float)class098382.y()).orElse(class09079.REGULAR);
    }

    private float N(float f, float f2) {
        return Math.max(1.0f, (float)Math.round(f * f2));
    }

    public float N(String string, float f, class09838 class098382) {
        float f2 = ((class09794)this.N_0).N();
        return class11725.N(class098382).y(string, this.N(f, f2), this.y(class098382), this.L(class098382)) / f2;
    }

    public float N(int n, float f, class09838 class098382) {
        class09079 class090792 = this.y(class098382);
        boolean bl = this.L(class098382);
        float f2 = ((class09794)this.N_0).N();
        float f3 = this.N(f, f2);
        return switch (n) {
            case 10, 13 -> 0.0f;
            case 9 -> (float)Math.round(class11725.N(class098382).N(f3, class090792, bl, 32) * 4.0f) / f2;
            default -> (float)Math.round(class11725.N(class098382).N(f3, class090792, bl, n)) / f2;
        };
    }

    private static class09093 N(class09838 class098382) {
        class09093 class090932 = class09080.N((String)class098382.N());
        if (class090932 == null) {
            throw new IllegalArgumentException("Unknown font family: " + class098382.N());
        }
        return class090932;
    }

    public void N(class09794 class097942) {
        this.N_0 = class097942;
    }

    public float N(float f, class09838 class098382) {
        float f2 = ((class09794)this.N_0).N();
        return class11725.N(class098382).N(this.N(f, f2), this.y(class098382), this.L(class098382)) / f2;
    }

    public float N(int n, int n2, float f, class09838 class098382) {
        float f2 = ((class09794)this.N_0).N();
        class09093 class090932 = class11725.N(class098382);
        class09079 class090792 = this.y(class098382);
        boolean bl = this.L(class098382);
        float f3 = this.N(f, f2);
        float f4 = class090932.N(f3, class090792, bl, n);
        float f5 = class090932.N(f3, class090792, bl, n, n2);
        return (float)(Math.round(f4 + f5) - Math.round(f4)) / f2;
    }
}

