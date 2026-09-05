/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02837
 *  minecraft.class04791
 *  minecraft.class04794
 *  minecraft.class04821
 *  minecraft.class05644
 *  minecraft.class05908
 *  minecraft.class05919
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06584
 *  minecraft.class07001
 *  minecraft.class07439
 *  minecraft.class07491
 *  minecraft.class07709
 *  org.apache.commons.lang3.mutable.MutableObject
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import minecraft.class00453;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02837;
import minecraft.class04791;
import minecraft.class04794;
import minecraft.class04821;
import minecraft.class05275;
import minecraft.class05644;
import minecraft.class05908;
import minecraft.class05919;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class07001;
import minecraft.class07439;
import minecraft.class07491;
import minecraft.class07709;
import org.apache.commons.lang3.mutable.MutableObject;

public class class05268
extends class00453 {
    public static final MapCodec<class05268> N = RecordCodecBuilder.mapCodec(instance -> class05268.N(instance).and(instance.group((App)class04821.N.fieldOf("source").forGetter(class052682 -> class052682.y), (App)class05644.N.listOf().fieldOf("ops").forGetter(class052682 -> class052682.L))).apply(instance, class05268::new));
    private final class04794 y;
    private final List<class05644> L;

    class05268(List<class05957> list, class04794 class047942, List<class05644> list2) {
        super(list);
        this.y = class047942;
        this.L = List.copyOf(list2);
    }

    public Set<class07491<?>> y() {
        return this.y.y();
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        class07709 class077092 = this.y.N(class059082);
        if (class077092 == null) {
            return class065842;
        }
        MutableObject mutableObject = new MutableObject();
        Supplier<class07709> supplier = () -> {
            if (mutableObject.get() == null) {
                mutableObject.setValue((Object)((class02837)class065842.a_(class02484.y, (Object)class02837.N)).y());
            }
            return (class07709)mutableObject.get();
        };
        this.L.forEach(class056442 -> class056442.N(supplier, class077092));
        class07001 class070012 = (class07001)mutableObject.get();
        if (class070012 != null) {
            class02837.N((class02477)class02484.y, (class06584)class065842, (class07001)class070012);
        }
        return class065842;
    }

    @Deprecated
    public static class05275 N(class04794 class047942) {
        return new class05275(class047942);
    }

    public static class05275 N(class05919 class059192) {
        return new class05275(class04791.N((class05919)class059192));
    }

    public class05959<class05268> N() {
        return class07439.Q;
    }
}

