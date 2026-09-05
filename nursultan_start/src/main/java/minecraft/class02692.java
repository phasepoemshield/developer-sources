/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class06497
 *  minecraft.class06517
 *  minecraft.class06584
 *  minecraft.class06591
 *  minecraft.class07055
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07536
 *  minecraft.class08209
 *  minecraft.class08237
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02666;
import minecraft.class02679;
import minecraft.class02694;
import minecraft.class04247;
import minecraft.class06497;
import minecraft.class06517;
import minecraft.class06584;
import minecraft.class06591;
import minecraft.class07055;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07536;
import minecraft.class08209;
import minecraft.class08237;

public final class class02692
extends Record
implements class02694,
class08237 {
    private final List<class02679> effects;
    public static final class02692 N = new class02692(List.of());
    public static final int y = 160;
    public static final Codec<class02692> L = class02679.N.listOf().xmap(class02692::new, class02692::N);
    public static final class02362<class04247, class02692> u = class02679.y.N_33(class02389.N()).N_10(class02692::new, class02692::N);

    public class02692(List<class02679> list) {
        this.effects = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02692.class, "effects", "effects"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02692.class, "effects", "effects"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02692.class, "effects", "effects"}, this);
    }

    public void N(class07299 class072992, class07438 class074382, class06584 class065842, class08209 class082092) {
        for (class02679 class026792 : this.effects) {
            class074382.method_6092(class026792.N());
        }
    }

    public List<class02679> N() {
        return this.effects;
    }

    @Override
    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        if (class064972.y()) {
            ArrayList<class07055> arrayList = new ArrayList<class07055>();
            for (class02679 class026792 : this.effects) {
                arrayList.add(class026792.N());
            }
            class06517.N(arrayList, consumer, (float)1.0f, (float)class065912.y());
        }
    }

    public class02692 N(class02679 class026792) {
        return new class02692(class07536.N(this.effects, (Object)((Object)class026792)));
    }
}

