/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09559
 *  minecraft.class02040
 *  minecraft.class03255
 *  minecraft.class04995
 *  minecraft.class07536
 */
package minecraft;

import Nursultan.class09559;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class02040;
import minecraft.class02072;
import minecraft.class02102;
import minecraft.class03255;
import minecraft.class04995;
import minecraft.class07536;

public class class02077
extends class02040 {
    private final List<class09559> L = new ArrayList<class09559>();
    private int u;
    private int i;
    private final class02072 R = class02072.Z().N(0.5f, 0.5f);

    public class02072 L() {
        return this.R;
    }

    public class02077() {
        this(0, 0, 0, 0);
    }

    public class02077(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
        this.N(n3, n4);
    }

    public class02077(int n, int n2) {
        this(0, 0, n, n2);
    }

    public class02072 y() {
        return this.R.M();
    }

    public class02077 y(int n) {
        this.u = n;
        return this;
    }

    public static void N(class02102 class021022, class03255 class032552, float f, float f2) {
        class02077.N(class021022, class032552.u(), class032552.y(), class032552.M(), class032552.B(), f, f2);
    }

    public static void N(class02102 class021022, class03255 class032552) {
        class02077.N(class021022, class032552.R().N(), class032552.R().y(), class032552.M(), class032552.B());
    }

    public static void N(class02102 class021022, int n, int n2, int n3, int n4) {
        class02077.N(class021022, n, n2, n3, n4, 0.5f, 0.5f);
    }

    public void N(Consumer<class02102> consumer) {
        this.L.forEach(class095592 -> consumer.accept(class095592.N));
    }

    public static void N(class02102 class021022, int n, int n2, int n3, int n4, float f, float f2) {
        class02077.N(n, n3, class021022.method_25368(), class021022::method_46421, f);
        class02077.N(n2, n4, class021022.method_25364(), class021022::method_46419, f2);
    }

    public static void N(int n, int n2, int n3, Consumer<Integer> consumer, float f) {
        int n4 = (int)class04995.B((float)f, (float)0.0f, (float)(n2 - n3));
        consumer.accept(n + n4);
    }

    public class02077 N(int n, int n2) {
        return this.y(n).N(n2);
    }

    public class02077 N(int n) {
        this.i = n;
        return this;
    }

    public void N() {
        super.N();
        int n = this.u;
        int n2 = this.i;
        for (class09559 class095592 : this.L) {
            n = Math.max(n, class095592.y());
            n2 = Math.max(n2, class095592.N());
        }
        for (class09559 class095592 : this.L) {
            class095592.N(this.method_46426(), n);
            class095592.y(this.method_46427(), n2);
        }
        this.N = n;
        this.y = n2;
    }

    public <T extends class02102> T N(T t) {
        return this.N(t, this.y());
    }

    public <T extends class02102> T N(T t, class02072 class020722) {
        this.L.add(new class09559(t, class020722));
        return t;
    }

    public <T extends class02102> T N(T t, Consumer<class02072> consumer) {
        return this.N(t, (class02072)class07536.N((Object)this.y(), consumer));
    }
}

