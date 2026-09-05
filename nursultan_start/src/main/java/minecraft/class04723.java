/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00072
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class02252
 *  minecraft.class04654
 *  minecraft.class04699
 *  minecraft.class04927
 *  minecraft.class04969
 *  minecraft.class04980
 *  minecraft.class05092
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05389
 *  minecraft.class05407
 *  minecraft.class05936
 *  minecraft.class06355
 *  minecraft.class06366
 *  minecraft.class07086
 *  minecraft.class07282
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class00072;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class02252;
import minecraft.class04654;
import minecraft.class04699;
import minecraft.class04927;
import minecraft.class04969;
import minecraft.class04980;
import minecraft.class05092;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05389;
import minecraft.class05407;
import minecraft.class05936;
import minecraft.class06355;
import minecraft.class06366;
import minecraft.class07086;
import minecraft.class07282;

public class class04723
extends class05407 {
    private static final int M = 2;
    public static final List<class07086> N = ImmutableList.of((Object)class07086.field_5801, (Object)class07086.field_5805, (Object)class07086.field_5802, (Object)class07086.field_5807);
    private static final int B = 0;
    public static final List<class07282> y = ImmutableList.of((Object)class07282.field_9215, (Object)class07282.field_9220, (Object)class07282.field_9216);
    private static final class00392 Z = class00392.L((String)"mco.configure.world.edit.slot.name");
    static final class00392 L = class00392.L((String)"mco.configure.world.spawnProtection");
    private class04927 z;
    protected final class05092 u;
    private int U;
    private int E;
    private final class00072 W;
    private final class04969 m;
    private class07086 P;
    private class07282 s;
    private final String T;
    private String b;
    int i;
    private boolean j;
    class04699 R;

    public class04723(class05092 class050922, class00072 class000722, class04969 class049692, int n) {
        super((class00392)class00392.L((String)"mco.configure.world.buttons.options"));
        this.u = class050922;
        this.W = class000722;
        this.m = class049692;
        this.P = class04723.N(N, class000722.y.L, 2);
        this.s = class04723.N(y, class000722.y.u, 0);
        this.T = class000722.y.y(n);
        this.N(class000722.y.N(n));
        if (class049692 == class04969.field_19437) {
            this.i = class000722.y.N;
            this.j = class000722.y.y;
        } else {
            this.i = 0;
            this.j = false;
        }
    }

    private void N() {
        int n = class04723.N(N, this.P, 2);
        int n2 = class04723.N(y, this.s, 0);
        if (this.m == class04969.field_19439 || this.m == class04969.field_19440 || this.m == class04969.field_19441) {
            this.u.N(new class00072(this.W.N, new class04980(this.W.y.N, n, n2, this.W.y.y, this.b, this.W.y.i, this.W.y.R), this.W.L));
        } else {
            this.u.N(new class00072(this.W.N, new class04980(this.i, n, n2, this.j, this.b, this.W.y.i, this.W.y.R), this.W.L));
        }
    }

    private static <T> int N(List<T> list, T t, int n) {
        int n2 = list.indexOf(t);
        return n2 == -1 ? n : n2;
    }

    private static <T> T N(List<T> list, int n, int n2) {
        try {
            return list.get(n);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            return list.get(n2);
        }
    }

    private void N(String string) {
        this.b = string.equals(this.T) ? "" : string;
    }

    private class06355<Boolean> N(class00392 class003922, Consumer<Boolean> consumer) {
        return (class063662, bl) -> {
            if (bl.booleanValue()) {
                consumer.accept(true);
            } else {
                this.field_22787.N((class05096)class02252.y((class05096)this, (class00392)class003922, class037232 -> {
                    consumer.accept(false);
                    class037232.method_25419();
                }));
            }
        };
    }

    public void method_25426() {
        class05216 class052162;
        this.E = 170;
        this.U = this.field_22789 / 2 - this.E;
        int n = this.field_22789 / 2 + 10;
        if (this.m != class04969.field_19437) {
            class052162 = this.m == class04969.field_19439 ? class00392.L((String)"mco.configure.world.edit.subscreen.adventuremap") : (this.m == class04969.field_19441 ? class00392.L((String)"mco.configure.world.edit.subscreen.inspiration") : class00392.L((String)"mco.configure.world.edit.subscreen.experience"));
            this.N(new class05389((class00392)class052162, this.field_22789 / 2, 26, -65536));
        }
        this.z = (class04927)this.method_25429((class04654)new class04927((class01590)this.field_22787.i_3, this.U, class04723.N((int)1), this.E, 20, null, (class00392)class00392.L((String)"mco.configure.world.edit.slot.name")));
        this.z.method_1852(this.b);
        this.z.method_1863(this::N);
        class052162 = (class06366)this.method_37063((class04654)class06366.N(class07086::y, (Object)this.P).N(N).N(n, class04723.N((int)1), this.E, 20, (class00392)class00392.L((String)"options.difficulty"), (class063662, class070862) -> {
            this.P = class070862;
        }));
        class06366 class063663 = (class06366)this.method_37063((class04654)class06366.N(class07282::u, (Object)this.s).N(y).N(this.U, class04723.N((int)3), this.E, 20, (class00392)class00392.L((String)"selectWorld.gameMode"), (class063662, class072822) -> {
            this.s = class072822;
        }));
        class06366 var4 = (class06366)this.method_37063((class04654)class06366.N((boolean)this.j).N(n, class04723.N((int)3), this.E, 20, (class00392)class00392.L((String)"mco.configure.world.forceGameMode"), (class063662, bl) -> {
            this.j = bl;
        }));
        this.R = (class04699)this.method_37063((class04654)new class04699(this, this.U, class04723.N((int)5), this.E, this.i, 0.0f, 16.0f));
        if (this.m != class04969.field_19437) {
            this.R.field_22763 = false;
            var4.field_22763 = false;
        }
        if (this.W.y()) {
            class052162.field_22763 = false;
            class063663.field_22763 = false;
            var4.field_22763 = false;
        }
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"mco.configure.world.buttons.done"), class053622 -> this.N()).N(this.U, class04723.N((int)13), this.E, 20).N());
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.i, class053622 -> this.method_25419()).N(n, class04723.N((int)13), this.E, 20).N());
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class010542.N(this.field_22793, this.field_22785, this.field_22789 / 2, 17, -1);
        class010542.y(this.field_22793, Z, this.U + this.E / 2 - this.field_22793.N((class05936)Z) / 2, class04723.N((int)0) - 5, -1);
        this.z.method_25394(class010542, n, n2, f);
    }

    public void method_25419() {
        this.field_22787.N((class05096)this.u);
    }

    public class00392 method_25435() {
        return class05220.N((class00392[])new class00392[]{this.method_25440(), this.z()});
    }
}

