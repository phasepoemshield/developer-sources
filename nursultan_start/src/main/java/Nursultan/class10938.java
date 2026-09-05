/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09233
 *  Nursultan.class11165
 *  Nursultan.class11303
 *  Nursultan.class11343
 *  Nursultan.class11882
 *  Nursultan.class11938
 *  minecraft.class00392
 *  minecraft.class02484
 *  minecraft.class02710
 *  minecraft.class02833
 *  minecraft.class02848
 *  minecraft.class05946
 *  minecraft.class06244
 *  minecraft.class06517
 *  minecraft.class06584
 *  minecraft.class07314
 *  minecraft.class07471
 */
package Nursultan;

import Nursultan.class09233;
import Nursultan.class10879;
import Nursultan.class11165;
import Nursultan.class11303;
import Nursultan.class11343;
import Nursultan.class11882;
import Nursultan.class11938;
import java.util.List;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import minecraft.class00392;
import minecraft.class02484;
import minecraft.class02710;
import minecraft.class02833;
import minecraft.class02848;
import minecraft.class05946;
import minecraft.class06244;
import minecraft.class06517;
import minecraft.class06584;
import minecraft.class07314;
import minecraft.class07471;

public class class10938
extends class11882 {
    public Object L_0;

    private List<class10879<?>> P() {
        this.s();
        if ((List)this.L_0 == null || ((Boolean)class11938.L_3).booleanValue()) {
            this.L_0 = this.T();
        }
        return (List)this.L_0;
    }

    private List<class10879<?>> T() {
        return class09233.y().N("lore", (T class065842) -> (class02848)class065842.y().method_58694(class02484.W), this::N).N("unbreakable", (T class065842) -> (class06244)class065842.y().method_58694(class02484.R), (T class062442, U class062443) -> class062442 == class062443 && class062442 == class06244.field_17274).N("attributes", (T class065842) -> (class02833)class065842.y().method_58694(class02484.b), this::N).N("enchantments", (T class065842) -> (class02710)class065842.y().method_58694(class02484.P), this::N).N("potion", (T class065842) -> (class06517)class065842.y().method_58694(class02484.h), this::N).N();
    }

    public class10938(class06584 class065842, String string, String string2, class11165 class111652) {
        super(class065842, string, string2, class111652);
        this.s();
    }

    private void s() {
    }

    public boolean u(class06584 class065842) {
        class11343 class113432 = (class11343)class11343.y[0];
        for (class10879<?> var4 : this.P()) {
            if (var4.N((class06584)this.y_5, class065842)) continue;
            class113432 = (Boolean)class11938.L_3 != false ? class11343.N((String)var4.y()) : (class11343)class11343.y[1];
            break;
        }
        if (((Boolean)class11938.L_3).booleanValue() && !class113432.y()) {
            class11303.N((Object)("AutoBuy [" + this.R() + "] rejected on check: " + class113432.N()));
        }
        return class113432.y();
    }

    private boolean N(class02710 class027102, class02710 class027103) {
        if (this.B() && class027103.N().stream().anyMatch(class035562 -> class035562.N((T class059462) -> class059462 == class07314.B))) {
            return false;
        }
        Set var3 = class027102.N();
        Set var4 = class027103.N();
        if (var3.isEmpty() && var4.isEmpty()) {
            return true;
        }
        return class10938.N(var3, var4, (T class035562, T class035563) -> class035562.N((class05946)class035563.i().get()) && class027102.N(class035562) == class027103.N(class035563));
    }

    private boolean N(class02833 class028332, class02833 class028333) {
        if (class028332.y().isEmpty() && class028333.y().isEmpty()) {
            return true;
        }
        return class10938.N(class028332.y(), class028333.y(), (T class028242, T class028243) -> {
            class07471 class074712 = class028242.y();
            class07471 class074713 = class028243.y();
            return class028242.L() == class028243.L() && class028242.N() == class028243.N() && class074712.L() == class074713.L() && class074712.y() == class074713.y();
        });
    }

    public static <T> boolean N(Iterable<T> iterable, Iterable<T> iterable2, BiPredicate<T, T> biPredicate) {
        return StreamSupport.stream(iterable.spliterator(), false).allMatch(object -> StreamSupport.stream(iterable2.spliterator(), false).anyMatch(object2 -> biPredicate.test(object, object2)));
    }

    private boolean N(class06517 class065172, class06517 class065173) {
        Iterable var3 = class065172.N();
        if (!var3.iterator().hasNext()) {
            return true;
        }
        return class10938.N(var3, class065173.N(), (T class070552, T class070553) -> class070552.i() == class070553.i() && class070552.u() == class070553.u());
    }

    private static String N(class02848 class028482) {
        return class028482.N().stream().map(class00392::getString).collect(Collectors.joining());
    }

    private boolean N(class02848 class028482, class02848 class028483) {
        String string = class10938.N(class028482);
        return string.isEmpty() || class10938.N(class028483).contains(string);
    }
}

