/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class06584
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class01054;
import minecraft.class01894;
import minecraft.class05490;
import minecraft.class06584;
import minecraft.class08394;

final class class05525
extends Enum<class05525> {
    public static final /* enum */ class05525 field_2678 = new class05525(new class05490(class01894.y((String)"advancements/tab_above_left_selected"), class01894.y((String)"advancements/tab_above_middle_selected"), class01894.y((String)"advancements/tab_above_right_selected")), new class05490(class01894.y((String)"advancements/tab_above_left"), class01894.y((String)"advancements/tab_above_middle"), class01894.y((String)"advancements/tab_above_right")), 28, 32, 8);
    public static final /* enum */ class05525 field_2673 = new class05525(new class05490(class01894.y((String)"advancements/tab_below_left_selected"), class01894.y((String)"advancements/tab_below_middle_selected"), class01894.y((String)"advancements/tab_below_right_selected")), new class05490(class01894.y((String)"advancements/tab_below_left"), class01894.y((String)"advancements/tab_below_middle"), class01894.y((String)"advancements/tab_below_right")), 28, 32, 8);
    public static final /* enum */ class05525 field_2675 = new class05525(new class05490(class01894.y((String)"advancements/tab_left_top_selected"), class01894.y((String)"advancements/tab_left_middle_selected"), class01894.y((String)"advancements/tab_left_bottom_selected")), new class05490(class01894.y((String)"advancements/tab_left_top"), class01894.y((String)"advancements/tab_left_middle"), class01894.y((String)"advancements/tab_left_bottom")), 32, 28, 5);
    public static final /* enum */ class05525 field_2677 = new class05525(new class05490(class01894.y((String)"advancements/tab_right_top_selected"), class01894.y((String)"advancements/tab_right_middle_selected"), class01894.y((String)"advancements/tab_right_bottom_selected")), new class05490(class01894.y((String)"advancements/tab_right_top"), class01894.y((String)"advancements/tab_right_middle"), class01894.y((String)"advancements/tab_right_bottom")), 32, 28, 5);
    private final class05490 field_45423;
    private final class05490 field_45424;
    private final int field_2671;
    private final int field_2670;
    private final int field_2669;
    private static final /* synthetic */ class05525[] field_2676;

    public int L() {
        return this.field_2669;
    }

    private class05525(class05490 class054902, class05490 class054903, int n2, int n3, int n4) {
        this.field_45423 = class054902;
        this.field_45424 = class054903;
        this.field_2671 = n2;
        this.field_2670 = n3;
        this.field_2669 = n4;
    }

    static {
        field_2676 = class05525.u();
    }

    public static class05525[] values() {
        return (class05525[])field_2676.clone();
    }

    public static class05525 valueOf(String string) {
        return Enum.valueOf(class05525.class, string);
    }

    private static /* synthetic */ class05525[] u() {
        return new class05525[]{field_2678, field_2673, field_2675, field_2677};
    }

    public int y(int n) {
        switch (this.ordinal()) {
            case 0: {
                return -this.field_2670 + 4;
            }
            case 1: {
                return 136;
            }
            case 2: {
                return this.field_2670 * n;
            }
            case 3: {
                return this.field_2670 * n;
            }
        }
        throw new UnsupportedOperationException("Don't know what this tab type is!" + String.valueOf((Object)this));
    }

    public int y() {
        return this.field_2670;
    }

    public boolean N(int n, int n2, int n3, double d, double d2) {
        int n4 = n + this.N(n3);
        int n5 = n2 + this.y(n3);
        return d > (double)n4 && d < (double)(n4 + this.field_2671) && d2 > (double)n5 && d2 < (double)(n5 + this.field_2670);
    }

    public void N(class01054 class010542, int n, int n2, boolean bl, int n3) {
        class05490 class054902;
        class05490 class054903 = class054902 = bl ? this.field_45423 : this.field_45424;
        class01894 class018942 = n3 == 0 ? class054902.N() : (n3 == this.field_2669 - 1 ? class054902.L() : class054902.y());
        class010542.N(class08394.Na, class018942, n, n2, this.field_2671, this.field_2670);
    }

    public int N(int n) {
        switch (this.ordinal()) {
            case 0: {
                return (this.field_2671 + 4) * n;
            }
            case 1: {
                return (this.field_2671 + 4) * n;
            }
            case 2: {
                return -this.field_2671 + 4;
            }
            case 3: {
                return 248;
            }
        }
        throw new UnsupportedOperationException("Don't know what this tab type is!" + String.valueOf((Object)this));
    }

    public void N(class01054 class010542, int n, int n2, int n3, class06584 class065842) {
        int n4 = n + this.N(n3);
        int n5 = n2 + this.y(n3);
        switch (this.ordinal()) {
            case 0: {
                n4 += 6;
                n5 += 9;
                break;
            }
            case 1: {
                n4 += 6;
                n5 += 6;
                break;
            }
            case 2: {
                n4 += 10;
                n5 += 5;
                break;
            }
            case 3: {
                n4 += 6;
                n5 += 5;
            }
        }
        class010542.y(class065842, n4, n5);
    }

    public int N() {
        return this.field_2671;
    }
}

