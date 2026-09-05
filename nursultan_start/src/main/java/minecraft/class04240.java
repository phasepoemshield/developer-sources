/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class02117
 *  minecraft.class02129
 *  minecraft.class03428
 *  minecraft.class03457
 *  minecraft.class04217
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class08813
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.DoubleConsumer;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class02117;
import minecraft.class02129;
import minecraft.class03428;
import minecraft.class03457;
import minecraft.class04217;
import minecraft.class04229;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class08813;
import org.jspecify.annotations.Nullable;

public class class04240
extends class08813 {
    private static final int N = 32;
    private static final String y = "telemetry.event.required";
    private static final String L = "telemetry.event.optional";
    private static final String u = "telemetry.event.optional.disabled";
    private static final class00392 i = class00392.L((String)"telemetry_info.property_title").N(class06541.field_1073);
    private final class01590 R;
    private class04229 M;
    private @Nullable DoubleConsumer B;

    private int L() {
        return this.field_22758 - this.method_65512();
    }

    public class04240(int n, int n2, int n3, int n4, class01590 class015902) {
        super(n, n2, n3, n4, (class00392)class00392.i());
        this.R = class015902;
        this.M = this.y(class06202.Nq().yz());
    }

    private class04229 y(boolean bl) {
        class04217 class042172 = new class04217(this.L());
        ArrayList<class02129> arrayList = new ArrayList<class02129>(class02129.M());
        arrayList.sort(Comparator.comparing(class02129::u));
        for (int i = 0; i < arrayList.size(); ++i) {
            class02129 class021292 = (class02129)arrayList.get(i);
            boolean bl2 = class021292.u() && !bl;
            this.N(class042172, class021292, bl2);
            if (i >= arrayList.size() - 1) continue;
            Objects.requireNonNull(this.R);
            class042172.N(9);
        }
        return class042172.N();
    }

    public void y() {
        this.M = this.y(class06202.Nq().yz());
        this.method_65506();
    }

    private void N(class02129 class021292, class04217 class042172, boolean bl) {
        for (class02117 var5 : class021292.y()) {
            class042172.N(this.R, this.N((class00392)var5.N(), bl));
        }
    }

    private void N(class04217 class042172, class02129 class021292, boolean bl) {
        String string = class021292.u() ? (bl ? u : L) : y;
        class042172.y(this.R, this.N((class00392)class00392.N((String)string, (Object[])new Object[]{class021292.i()}), bl));
        class042172.y(this.R, (class00392)class021292.R().N(class06541.field_1080));
        Objects.requireNonNull(this.R);
        class042172.N(4);
        class042172.N(this.R, this.N(i, bl), 2);
        this.N(class021292, class042172, bl);
    }

    private class00392 N(class00392 class003922, boolean bl) {
        if (bl) {
            return class003922.L().N(class06541.field_1080);
        }
        return class003922;
    }

    public void N(boolean bl) {
        this.M = this.y(bl);
        this.method_65506();
    }

    public void N(@Nullable DoubleConsumer doubleConsumer) {
        this.B = doubleConsumer;
    }

    protected void method_44389(class01054 class010542, int n, int n2, float f) {
        int n3 = this.method_65514();
        int n4 = this.method_65513();
        class010542.i().pushMatrix();
        class010542.i().translate((float)n4, (float)n3);
        this.M.N().method_48206(class064782 -> class064782.method_25394(class010542, n, n2, f));
        class010542.i().popMatrix();
    }

    protected int method_44391() {
        return this.M.N().method_25364();
    }

    public void method_44382(double d) {
        super.method_44382(d);
        if (this.B != null) {
            this.B.accept(this.method_44387());
        }
    }

    protected void method_47399(class03428 class034282) {
        class034282.N(class03457.field_33788, this.M.y());
    }

    protected double method_44393() {
        Objects.requireNonNull(this.R);
        return 9.0;
    }
}

