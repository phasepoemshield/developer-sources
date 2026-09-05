/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  minecraft.class00392
 *  minecraft.class01312
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class02689
 *  minecraft.class02697
 *  minecraft.class03289
 *  minecraft.class03748
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class07040
 *  minecraft.class07070
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class08030
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Arrays;
import java.util.Optional;
import java.util.Set;
import minecraft.class00392;
import minecraft.class01312;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class02689;
import minecraft.class02697;
import minecraft.class03289;
import minecraft.class03748;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class06600;
import minecraft.class07040;
import minecraft.class07070;
import minecraft.class07078;
import minecraft.class07299;
import minecraft.class08030;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class06622
extends class06600 {
    protected static final class02131<class02689> N = class03289.N(class06622.class, (class04383)class02154.e);
    private static final class02131<Boolean> i = class03289.N(class06622.class, (class04383)class02154.U);
    private static final class02131<Optional<class00392>> R = class03289.N(class06622.class, (class04383)class02154.M);
    private static final byte M = (byte)Arrays.stream(class08030.values()).mapToInt(class08030::N).reduce(0, (n, n2) -> n | n2);
    private static final Set<class01312> B = Set.of(class01312.field_18076, class01312.field_18081, class01312.field_18079, class01312.field_18077, class01312.field_18078);
    public static final Codec<class01312> y = class01312.field_63012.validate(class013122 -> B.contains(class013122) ? DataResult.success((Object)class013122) : DataResult.error(() -> "Invalid pose: " + class013122.method_15434()));
    private static final Codec<Byte> Z = class08030.field_62532.listOf().xmap(list -> (byte)list.stream().mapToInt(class08030::N).reduce(M, (n, n2) -> n & ~n2), by -> Arrays.stream(class08030.values()).filter(class080302 -> (by & class080302.N()) == 0).toList());
    public static final class02689 L = class02697.i;
    private static final class00392 W = class00392.L((String)"entity.minecraft.mannequin.label");
    public static class07040<class06622> u = class06622::new;
    private static final String m = "profile";
    private static final String P = "hidden_layers";
    private static final String s = "main_hand";
    private static final String T = "pose";
    private static final String b = "immovable";
    private static final String j = "description";
    private static final String v = "hide_description";
    private class00392 n = W;
    private boolean t = false;

    private boolean L() {
        return (Boolean)this.field_6011.N(i);
    }

    public boolean method_6034() {
        return !this.L() && super.method_6034();
    }

    protected void method_66649(class02666 class026662) {
        this.method_66650(class026662, class02484.Nb);
        super.method_66649(class026662);
    }

    @Override
    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(N, (Object)L);
        class042932.N(i, (Object)false);
        class042932.N(R, Optional.of(W));
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N(m, class02689.N, (Object)this.N());
        class083292.N(P, Z, (Object)((Byte)this.field_6011.N(field_62514)));
        class083292.N(s, class07070.field_45121, (Object)this.method_6068());
        class083292.N(T, y, (Object)this.method_18376());
        class083292.N(b, this.L());
        class00392 class003922 = this.y();
        if (class003922 != null) {
            if (!class003922.equals((Object)W)) {
                class083292.N(j, class03748.N, (Object)class003922);
            }
        } else {
            class083292.N(v, true);
        }
    }

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        if (class024772 == class02484.Nb) {
            return (T)class06622.method_66651(class024772, (Object)this.N());
        }
        return (T)super.method_58694(class024772);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        class082992.N(m, class02689.N).ifPresent(this::N);
        this.field_6011.N(field_62514, (Object)class082992.N(P, Z).orElse(M));
        this.method_74090(class082992.N(s, class07070.field_45121).orElse(field_62509));
        this.method_18380(class082992.N(T, y).orElse(class01312.field_18076));
        this.N(class082992.N(b, false));
        this.y(class082992.N(v, false));
        this.N(class082992.N(j, class03748.N).orElse(W));
    }

    public class06622(class07078<class06622> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.field_6011.N(field_62514, (Object)M);
    }

    public class06622(class07299 class072992) {
        this((class07078<class06622>)class07078.No, class072992);
    }

    private void u() {
        this.field_6011.N(R, this.t ? Optional.empty() : Optional.of(this.n));
    }

    protected @Nullable class00392 y() {
        return ((Optional)this.field_6011.N(R)).orElse(null);
    }

    private void y(boolean bl) {
        this.t = bl;
        this.u();
    }

    private void N(class02689 class026892) {
        this.field_6011.N(N, (Object)class026892);
    }

    protected class02689 N() {
        return (class02689)this.field_6011.N(N);
    }

    public static @Nullable class06622 N(class07078<class06622> class070782, class07299 class072992) {
        return (class06622)u.create(class070782, class072992);
    }

    private void N(boolean bl) {
        this.field_6011.N(i, (Object)bl);
    }

    private void N(class00392 class003922) {
        this.n = class003922;
        this.u();
    }

    protected <T> boolean method_66654(class02477<T> class024772, T t) {
        if (class024772 == class02484.Nb) {
            this.N((class02689)class06622.method_66651((class02477)class02484.Nb, t));
            return true;
        }
        return super.method_66654(class024772, t);
    }

    public boolean method_6062() {
        return this.L() || super.method_6062();
    }
}

