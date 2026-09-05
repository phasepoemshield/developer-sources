/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00265
 *  minecraft.class00296
 *  minecraft.class00299
 *  minecraft.class00311
 *  minecraft.class00315
 *  minecraft.class00326
 *  minecraft.class00392
 *  minecraft.class01883
 *  minecraft.class01894
 *  minecraft.class02429
 *  minecraft.class02604
 *  minecraft.class02741
 *  minecraft.class02763
 *  minecraft.class05287
 *  minecraft.class05306
 *  minecraft.class05322
 *  minecraft.class06222
 *  minecraft.class06570
 *  minecraft.class06923
 *  minecraft.class06937
 */
package minecraft;

import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import java.util.Objects;
import minecraft.class00265;
import minecraft.class00296;
import minecraft.class00299;
import minecraft.class00311;
import minecraft.class00315;
import minecraft.class00326;
import minecraft.class00392;
import minecraft.class01883;
import minecraft.class01894;
import minecraft.class02429;
import minecraft.class02604;
import minecraft.class02741;
import minecraft.class02763;
import minecraft.class05287;
import minecraft.class05306;
import minecraft.class05322;
import minecraft.class06222;
import minecraft.class06570;
import minecraft.class06923;
import minecraft.class06937;

public class class02411
extends class05306<class02763> {
    private static final class01883 B = new class01883(class01894.y((String)"recipe_book/filter_enabled"), class01894.y((String)"recipe_book/filter_disabled"), class01894.y((String)"recipe_book/filter_enabled_highlighted"), class01894.y((String)"recipe_book/filter_disabled_highlighted"));
    private static final class00392 Z = class00392.L((String)"gui.recipebook.toggleRecipes.craftable");
    private static final List<class05322> z = List.of(new class05322(class00296.field_54837), new class05322(class06570.TV, class06570.TQ, class06222.L), new class05322(class06570.iA, class06222.N), new class05322(class06570.jW, class06570.sS, class06222.u), new class05322(class06570.WY, class06222.y));

    public class02411(class02763 class027632) {
        super((class06923)class027632, z);
    }

    protected class01883 y() {
        return B;
    }

    private boolean y(class00265 class002652) {
        int n = ((class02763)this.R).b();
        int n2 = ((class02763)this.R).j();
        class00265 class002653 = class002652;
        Objects.requireNonNull(class002653);
        class00265 class002654 = class002653;
        int n3 = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class00326.class, class00315.class}, (Object)class002654, (int)n3)) {
            case 0 -> {
                class00326 var6_6 = (class00326)class002654;
                if (n >= var6_6.y() && n2 >= var6_6.L()) {
                    yield true;
                }
                yield false;
            }
            case 1 -> {
                class00315 var7_7 = (class00315)class002654;
                if (n * n2 >= var7_7.y().size()) {
                    yield true;
                }
                yield false;
            }
            default -> false;
        };
    }

    protected void N(class05287 class052872, class02741 class027412) {
        class052872.N(class027412, this::y);
    }

    protected boolean N(class06937 class069372) {
        return ((class02763)this.R).W() == class069372 || ((class02763)this.R).m().contains(class069372);
    }

    protected void N(class02429 class024292, class00265 class002652, class00311 class003112) {
        class024292.y(((class02763)this.R).W(), class003112, class002652.u());
        class00265 class002653 = class002652;
        Objects.requireNonNull(class002653);
        class00265 class002654 = class002653;
        int n4 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class00326.class, class00315.class}, (Object)class002654, (int)n4)) {
            case 0: {
                class00326 class003262 = (class00326)class002654;
                List var7 = ((class02763)this.R).m();
                class02604.N((int)((class02763)this.R).b(), (int)((class02763)this.R).j(), (int)class003262.y(), (int)class003262.L(), (Iterable)class003262.R(), (class002992, n, n2, n3) -> {
                    class06937 class069372 = (class06937)var7.get(n);
                    class024292.N(class069372, class003112, class002992);
                });
                break;
            }
            case 1: {
                class00315 class003152 = (class00315)class002654;
                List var8 = ((class02763)this.R).m();
                int n5 = Math.min(class003152.y().size(), var8.size());
                for (int i = 0; i < n5; ++i) {
                    class024292.N((class06937)var8.get(i), class003112, (class00299)class003152.y().get(i));
                }
                break;
            }
        }
    }

    protected class00392 R() {
        return Z;
    }
}

