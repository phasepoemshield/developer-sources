/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09666
 *  Nursultan.class09991
 */
package Nursultan;

import Nursultan.class09666;
import Nursultan.class09991;

public class class11763
extends Enum<class11763> {
    public static final /* enum */ class11763 LEFT;
    public static final /* enum */ class11763 CENTER;
    public static final /* enum */ class11763 RIGHT;
    private static final /* synthetic */ class11763[] $VALUES;
    public Float fields_033c692263dec3df9a50f4d3e389deeb9_0;
    public class09991 fields_033c692263dec3df9a50f4d3e389deeb9_1;
    public boolean fields_033c692263dec3df9a50f4d3e389deeb9_init;

    private static /* synthetic */ class11763[] M() {
        return new class11763[]{LEFT, CENTER, RIGHT};
    }

    private class11763(float f) {
        this.R();
        this.fields_033c692263dec3df9a50f4d3e389deeb9_0 = Float.valueOf(f);
        this.fields_033c692263dec3df9a50f4d3e389deeb9_1 = f == 0.0f ? class09991.N : class09991.N().N(class09666.y((float)(-f * 100.0f)));
    }

    static {
        class11763.B();
        LEFT = new class11763(0.0f);
        CENTER = new class11763(0.5f);
        RIGHT = new class11763(1.0f);
        $VALUES = class11763.M();
    }

    public static class11763[] values() {
        return (class11763[])$VALUES.clone();
    }

    public static class11763 valueOf(String string) {
        return Enum.valueOf(class11763.class, string);
    }

    private static void B() {
    }

    public class09991 y() {
        return this.fields_033c692263dec3df9a50f4d3e389deeb9_1;
    }

    public float N() {
        return this.fields_033c692263dec3df9a50f4d3e389deeb9_0.floatValue();
    }

    public static class11763 N(float f, float f2) {
        if (f2 <= 0.0f || f < f2 / 3.0f) {
            return LEFT;
        }
        return f < f2 * 2.0f / 3.0f ? CENTER : RIGHT;
    }

    private void R() {
        if (!this.fields_033c692263dec3df9a50f4d3e389deeb9_init) {
            this.fields_033c692263dec3df9a50f4d3e389deeb9_init = true;
            this.fields_033c692263dec3df9a50f4d3e389deeb9_0 = Float.valueOf(0.0f);
        }
    }
}

