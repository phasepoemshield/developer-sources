/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 */
package ruhack.phobia;

import net.minecraft.class_332;
import ruhack.phobia.cr;

public interface au {
    public static final int b;
    public static final boolean c;
    public static final boolean a;

    public void setHeight(int var1);

    public void setY(int var1);

    public void render(class_332 var1, float var2);

    public void tick();

    public void setEnabled(boolean var1);

    public int getY();

    public boolean isEnabled();

    public void setX(int var1);

    public int getX();

    /*
     * Enabled aggressive block sorting
     */
    default public boolean mouseReleased(double d2, double d3, int n2) {
        boolean bl2 = c;
        int n3 = b;
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3 || bl3) {
            return false;
        }
        return false;
    }

    public String getName();

    public int getHeight();

    /*
     * Unable to fully structure code
     */
    default public float getRoundingRadius() {
        var3_1 = au.c;
        var2_2 = au.b;
        var1_3 = au.a;
        if (var3_1) {
            throw null;
lbl6:
            // 2 sources

            return 0.192029f;
        }
        if (var1_3) ** GOTO lbl6
        if (var2_2 == 0) ** GOTO lbl-1000
        switch (var2_2) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                return 4.0f;
            }
lbl14:
            // 2 sources

            case 0: {
                do {
                    var2_2 = 3;
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 = 1;
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 = 3;
                if (!var3_1) ** GOTO lbl14
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 = 2;
        } while (!var3_1);
        throw null;
    }

    public void setWidth(int var1);

    default public boolean visible() {
        boolean bl2 = c;
        int n2 = b;
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        return !bl3 && !bl3;
    }

    /*
     * Unable to fully structure code
     */
    default public boolean mouseClicked(double var1_1, double var3_2, int var5_3) {
        var8_4 = au.c;
        var7_5 = au.b;
        var6_6 = au.a;
        if (var8_4) {
            throw null;
lbl6:
            // 2 sources

            return true;
        }
        if (var6_6) ** GOTO lbl6
        if (var7_5 == 0) ** GOTO lbl-1000
        switch (var7_5) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_6) ** continue;
                return false;
            }
            case 0: {
                var7_5 = 0;
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl23
            }
            case 1: {
                var7_5 = 3;
                if (var8_4) {
                    throw null;
                }
            }
lbl23:
            // 4 sources

            case 2: {
                var7_5 = 0;
                if (!var8_4) break;
                throw null;
            }
            case 3: 
        }
        do {
            var7_5 = 3;
        } while (!var8_4);
        throw null;
    }

    /*
     * Unable to fully structure code
     */
    default public void onPacket(cr var1_1) {
        var4_2 = au.c;
        var3_3 = au.b;
        var2_4 = au.a;
        if (var4_2) {
            throw null;
lbl6:
            // 2 sources

            return;
        }
        if (var2_4) ** GOTO lbl6
        if (var3_3 == 0) ** GOTO lbl-1000
        block0 : switch (var3_3) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                return;
            }
            case 0: {
                var3_3 = 1;
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl23
            }
            case 1: {
                var3_3 = 1;
                if (var4_2) {
                    throw null;
                }
            }
lbl23:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 = 3;
                    if (!var4_2) break block0;
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 = 1;
        ** while (!var4_2)
lbl31:
        // 1 sources

        throw null;
    }

    public int getWidth();
}

