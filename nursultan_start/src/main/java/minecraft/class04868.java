/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  minecraft.class00608
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class03556
 *  minecraft.class03949
 *  minecraft.class04057
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05372
 *  minecraft.class05715
 *  minecraft.class06555
 *  minecraft.class06889
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07305
 *  minecraft.class07321
 *  minecraft.class07376
 *  minecraft.class07713
 *  minecraft.class08413
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.List;
import java.util.OptionalInt;
import minecraft.class00608;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class03556;
import minecraft.class03949;
import minecraft.class04057;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04877;
import minecraft.class04882;
import minecraft.class04885;
import minecraft.class05372;
import minecraft.class05715;
import minecraft.class06555;
import minecraft.class06889;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07305;
import minecraft.class07321;
import minecraft.class07376;
import minecraft.class07713;
import minecraft.class08413;
import org.jspecify.annotations.Nullable;

public class class04868
extends class06555 {
    private static final String u = "raids";
    public static final Codec<class04868> N = RecordCodecBuilder.create(instance -> instance.group((App)class04885.L.listOf().optionalFieldOf(u, List.of()).forGetter(class048682 -> class048682.i.int2ObjectEntrySet().stream().map(class04885::N).toList()), (App)Codec.INT.fieldOf("next_id").forGetter(class048682 -> class048682.R), (App)Codec.INT.fieldOf("tick").forGetter(class048682 -> class048682.M)).apply(instance, class04868::new));
    public static final class08413<class04868> y = new class08413("raids", class04868::new, N, class05715.field_45081);
    public static final class08413<class04868> L = new class08413("raids_end", class04868::new, N, class05715.field_45081);
    private final Int2ObjectMap<class04877> i = new Int2ObjectOpenHashMap();
    private int R = 1;
    private int M;

    private class04868(List<class04885> list, int n, int n2) {
        for (class04885 class048852 : list) {
            this.i.put(class048852.N(), (Object)class048852.y());
        }
        this.R = n;
        this.M = n2;
    }

    public class04868() {
        this.method_80();
    }

    public @Nullable class04877 N(class07209 class072092, int n) {
        class04877 class048772 = null;
        double d = n;
        for (class04877 class048773 : this.i.values()) {
            double d2 = class048773.s().method_10262((class00753)class072092);
            if (!class048773.T() || !(d2 < d)) continue;
            class048772 = class048773;
            d = d2;
        }
        return class048772;
    }

    public List<class07209> N(class07321 class073212) {
        return this.i.values().stream().map(class04877::s).filter(arg_0 -> ((class07321)class073212).y(arg_0)).toList();
    }

    public static class08413<class04868> N(class03556<class07376> class035562) {
        if (class035562.N(class04057.L)) {
            return L;
        }
        return y;
    }

    public static boolean N(class04882 class048822) {
        return class048822.method_5805() && class048822.q() && class048822.method_6131() <= 2400;
    }

    public void N(class04782 class047822) {
        ++this.M;
        ObjectIterator var2 = this.i.values().iterator();
        while (var2.hasNext()) {
            class04877 class048772 = (class04877)var2.next();
            if (!((Boolean)class047822.method_64395().N(class07305.c)).booleanValue()) {
                class048772.W();
            }
            if (class048772.u()) {
                var2.remove();
                this.method_80();
                continue;
            }
            class048772.N(class047822);
        }
        if (this.M % 200 == 0) {
            this.method_80();
        }
    }

    public OptionalInt N(class04877 class048772) {
        for (Int2ObjectMap.Entry entry : this.i.int2ObjectEntrySet()) {
            if (entry.getValue() != class048772) continue;
            return OptionalInt.of(entry.getIntKey());
        }
        return OptionalInt.empty();
    }

    public @Nullable class04877 N(int n) {
        return (class04877)this.i.get(n);
    }

    private int N() {
        return ++this.R;
    }

    public static class04868 N(class07001 class070012) {
        return N.parse((DynamicOps)class07713.N, (Object)class070012).resultOrPartial().orElseGet(class04868::new);
    }

    private class04877 N(class04782 class047822, class07209 class072092) {
        class04877 class048772 = class047822.method_19502(class072092);
        return class048772 != null ? class048772 : new class04877(class072092, class047822.y());
    }

    public @Nullable class04877 N(class04770 class047702, class07209 class072092) {
        class07209 class072093;
        Object object2;
        if (class047702.method_7325()) {
            return null;
        }
        class04782 class047822 = class047702.method_51469();
        if (!((Boolean)class047822.method_64395().N(class07305.c)).booleanValue()) {
            return null;
        }
        if (!((Boolean)class047822.method_75728().N(class00608.k, class072092)).booleanValue()) {
            return null;
        }
        List list = class047822.method_19494().i(class035562 -> class035562.N(class03949.y), class072092, 64, class05372.field_18488).toList();
        int n = 0;
        class06889 class068892 = class06889.L;
        for (Object object2 : list) {
            class07209 class072094 = object2.M();
            class068892 = class068892.y((double)class072094.method_10263(), (double)class072094.method_10264(), (double)class072094.method_10260());
            ++n;
        }
        if (n > 0) {
            class068892 = class068892.L(1.0 / (double)n);
            class072093 = class07209.method_49638((class00737)class068892);
        } else {
            class072093 = class072092;
        }
        object2 = this.N(class047822, class072093);
        if (!((class04877)object2).Z() && !this.i.containsValue(object2)) {
            this.i.put(this.N(), object2);
        }
        if (!((class04877)object2).Z() || ((class04877)object2).E() < ((class04877)object2).U()) {
            ((class04877)object2).N(class047702);
        }
        this.method_80();
        return object2;
    }
}

