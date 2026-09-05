/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07512
 *  minecraft.class08036
 *  squeek.appleskin.util.IntPoint
 */
package squeek.appleskin.client;

import java.util.Random;
import java.util.Vector;
import minecraft.class07512;
import minecraft.class08036;
import squeek.appleskin.ModConfig;
import squeek.appleskin.util.IntPoint;

class HUDOverlayHandler$OffsetsCache {
    protected final Vector<IntPoint> foodBarOffsets = new Vector();
    protected final Vector<IntPoint> healthBarOffsets = new Vector();
    public int lastGuiTick = 0;
    protected final Random random = new Random();

    HUDOverlayHandler$OffsetsCache() {
    }

    protected void generate(int n, class08036 class080362) {
        int n2;
        int n3;
        int n4;
        block13: {
            block12: {
                float f;
                int n5 = 10;
                int n6 = 10;
                float f2 = class080362.method_6063();
                n4 = (int)Math.ceil((f2 + (f = (float)Math.ceil(class080362.method_6067()))) / 2.0f);
                if (n4 < 0) break block12;
                if (n4 <= 1000) break block13;
            }
            n4 = 0;
        }
        int n7 = (int)Math.ceil((float)n4 / 10.0f);
        int n8 = Math.max(10 - (n7 - 2), 3);
        boolean bl = false;
        boolean bl2 = false;
        if (ModConfig.INSTANCE.showVanillaAnimationsOverlay) {
            class07512 class075122 = class080362.method_7344();
            float f = class075122.u();
            n3 = class075122.N();
            bl2 = f <= 0.0f && n % (n3 * 3 + 1) == 0;
            bl = Math.ceil(class080362.method_6032()) <= 4.0;
        }
        this.random.setSeed(n * 312871);
        if (this.healthBarOffsets.size() != n4) {
            this.healthBarOffsets.setSize(n4);
        }
        if (this.foodBarOffsets.size() != 10) {
            this.foodBarOffsets.setSize(10);
        }
        for (n2 = n4 - 1; n2 >= 0; --n2) {
            IntPoint intPoint;
            int n9 = (int)Math.ceil((float)(n2 + 1) / 10.0f) - 1;
            n3 = n2 % 10 * 8;
            int n10 = -(n9 * n8);
            if (bl) {
                n10 += this.random.nextInt(2);
            }
            if ((intPoint = this.healthBarOffsets.get(n2)) == null) {
                intPoint = new IntPoint();
                this.healthBarOffsets.set(n2, intPoint);
            }
            intPoint.x = n3;
            intPoint.y = n10;
        }
        for (n2 = 0; n2 < 10; ++n2) {
            IntPoint intPoint;
            int n11 = -(n2 * 8) - 9;
            n3 = 0;
            if (bl2) {
                n3 += this.random.nextInt(3) - 1;
            }
            if ((intPoint = this.foodBarOffsets.get(n2)) == null) {
                intPoint = new IntPoint();
                this.foodBarOffsets.set(n2, intPoint);
            }
            intPoint.x = n11;
            intPoint.y = n3;
        }
    }

    public Vector<IntPoint> healthBarOffsets(int n, class08036 class080362) {
        if (n != this.lastGuiTick) {
            this.generate(n, class080362);
            this.lastGuiTick = n;
        }
        return this.healthBarOffsets;
    }

    public Vector<IntPoint> foodBarOffsets(int n, class08036 class080362) {
        if (n != this.lastGuiTick) {
            this.generate(n, class080362);
            this.lastGuiTick = n;
        }
        return this.foodBarOffsets;
    }
}

