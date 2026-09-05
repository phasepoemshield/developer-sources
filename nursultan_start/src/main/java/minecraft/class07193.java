/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01362
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06657
 *  minecraft.class06665
 *  minecraft.class06942
 *  minecraft.class07101
 *  minecraft.class07290
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01362;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06657;
import minecraft.class06665;
import minecraft.class06942;
import minecraft.class07101;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public abstract class class07193
extends class07101 {
    public static final class08064<class06657> L = class06665.D;

    public class07193(class01362 class013622) {
        super(class013622);
    }

    protected static class07211 U(class00500 class005002) {
        switch ((class06657)class005002.L(L)) {
            case field_12473: {
                return class07211.field_11033;
            }
            case field_12475: {
                return class07211.field_11036;
            }
        }
        return (class07211)((Object)class005002.L((class08092)R));
    }

    public static boolean y(class05487 class054872, class07209 class072092, class07211 class072112) {
        class07209 class072093 = class072092.method_10093(class072112);
        return class054872.method_8320(class072093).L((class07290)class054872, class072093, class072112.b());
    }

    public @Nullable class00500 N(class06942 class069422) {
        for (class07211 class072112 : class069422.i()) {
            class00500 class005002 = class072112.z() == class07185.field_11052 ? (class00500)((class00500)this.W().y(L, (Comparable)(class072112 == class07211.field_11036 ? class06657.field_12473 : class06657.field_12475))).y((class08092)R, (Comparable)((Object)class069422.method_8042())) : (class00500)((class00500)this.W().y(L, (Comparable)class06657.field_12471)).y((class08092)R, (Comparable)((Object)class072112.b()));
            if (!class005002.N((class05487)class069422.method_8045(), class069422.method_8037())) continue;
            return class005002;
        }
        return null;
    }

    protected abstract MapCodec<? extends class07193> N();

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class07193.U(class005002).b() == class072112 && !class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return class07193.y(class054872, class072092, class07193.U(class005002).b());
    }
}

