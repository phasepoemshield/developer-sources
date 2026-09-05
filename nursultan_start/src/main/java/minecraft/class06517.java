/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02484
 *  minecraft.class02566
 *  minecraft.class02666
 *  minecraft.class02694
 *  minecraft.class02833
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class04782
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class06497
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07063
 *  minecraft.class07084
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07463
 *  minecraft.class07468
 *  minecraft.class07471
 *  minecraft.class07536
 *  minecraft.class08036
 *  minecraft.class08209
 *  minecraft.class08237
 */
package minecraft;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02484;
import minecraft.class02566;
import minecraft.class02666;
import minecraft.class02694;
import minecraft.class02833;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class04782;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class06497;
import minecraft.class06525;
import minecraft.class06541;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06591;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07063;
import minecraft.class07084;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07463;
import minecraft.class07468;
import minecraft.class07471;
import minecraft.class07536;
import minecraft.class08036;
import minecraft.class08209;
import minecraft.class08237;

public final class class06517
extends Record
implements class02694,
class08237 {
    private final Optional<class03556<class06525>> potion;
    private final Optional<Integer> customColor;
    private final List<class07055> customEffects;
    private final Optional<String> customName;
    public static final class06517 N = new class06517(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
    private static final class00392 Z = class00392.L((String)"effect.none").N(class06541.field_1080);
    public static final int y = -13083194;
    private static final Codec<class06517> z = RecordCodecBuilder.create(instance -> instance.group((App)class06525.N.optionalFieldOf("potion").forGetter(class06517::i), (App)Codec.INT.optionalFieldOf("custom_color").forGetter(class06517::R), (App)class07055.u.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(class06517::u), (App)Codec.STRING.optionalFieldOf("custom_name").forGetter(class06517::M)).apply(instance, class06517::new));
    public static final Codec<class06517> L = Codec.withAlternative(z, class06525.N, class06517::new);
    public static final class02362<class04247, class06517> u = class02362.N((class02362)class06525.y.N_33(class02389::N), class06517::i, (class02362)class02389.M.N_33(class02389::N), class06517::R, (class02362)class07055.i.N_33(class02389.N()), class06517::u, (class02362)class02389.s.N_33(class02389::N), class06517::M, class06517::new);

    public boolean L() {
        if (!this.customEffects.isEmpty()) {
            return true;
        }
        return this.potion.isPresent() && !((class06525)this.potion.get().N()).N().isEmpty();
    }

    public Optional<String> M() {
        return this.customName;
    }

    public class06517(Optional<class03556<class06525>> optional, Optional<Integer> optional2, List<class07055> list, Optional<String> optional3) {
        this.potion = optional;
        this.customColor = optional2;
        this.customEffects = list;
        this.customName = optional3;
    }

    public class06517(class03556<class06525> class035562) {
        this(Optional.of(class035562), Optional.empty(), List.of(), Optional.empty());
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06517.class, "potion;customColor;customEffects;customName", "potion", "customColor", "customEffects", "customName"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06517.class, "potion;customColor;customEffects;customName", "potion", "customColor", "customEffects", "customName"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06517.class, "potion;customColor;customEffects;customName", "potion", "customColor", "customEffects", "customName"}, this);
    }

    public Optional<class03556<class06525>> i() {
        return this.potion;
    }

    public List<class07055> u() {
        return Lists.transform(this.customEffects, class07055::new);
    }

    public class06517 y(class03556<class06525> class035562) {
        return new class06517(Optional.of(class035562), this.customColor, this.customEffects, this.customName);
    }

    public int y() {
        return this.N(-13083194);
    }

    public static void N(Iterable<class07055> iterable, Consumer<class00392> consumer, float f, float f2) {
        ArrayList arrayList = Lists.newArrayList();
        boolean bl = true;
        for (class07055 class070552 : iterable) {
            bl = false;
            class03556 var8 = class070552.L();
            int n = class070552.i();
            ((class07084)var8.N()).N(n, (T class035562, U class074712) -> arrayList.add(new Pair(class035562, class074712)));
            class05216 class052162 = class06517.N((class03556<class07084>)var8, n);
            if (!class070552.N(20)) {
                class052162 = class00392.N((String)"potion.withDuration", (Object[])new Object[]{class052162, class07063.N((class07055)class070552, (float)f, (float)f2)});
            }
            consumer.accept((class00392)class052162.N(((class07084)var8.N()).B().N()));
        }
        if (bl) {
            consumer.accept(Z);
        }
        if (!arrayList.isEmpty()) {
            consumer.accept(class05220.N);
            consumer.accept((class00392)class00392.L((String)"potion.whenDrank").N(class06541.field_1064));
            for (class07055 class070552 : arrayList) {
                class07471 class074713 = (class07471)class070552.getSecond();
                double d = class074713.y();
                double d2 = class074713.L() == class07463.field_6330 || class074713.L() == class07463.field_6331 ? class074713.y() * 100.0 : class074713.y();
                if (d > 0.0) {
                    consumer.accept((class00392)class00392.N((String)("attribute.modifier.plus." + class074713.L().N()), (Object[])new Object[]{class02833.u.format(d2), class00392.L((String)((class07468)((class03556)class070552.getFirst()).N()).L())}).N(class06541.field_1078));
                    continue;
                }
                if (!(d < 0.0)) continue;
                consumer.accept((class00392)class00392.N((String)("attribute.modifier.take." + class074713.L().N()), (Object[])new Object[]{class02833.u.format(d2 *= -1.0), class00392.L((String)((class07468)((class03556)class070552.getFirst()).N()).L())}).N(class06541.field_1061));
            }
        }
    }

    private static /* synthetic */ void N(class04782 class047822, class08036 class080362, class07438 class074382, class07055 class070552) {
        if (((class07084)class070552.L().N()).N()) {
            ((class07084)class070552.L().N()).N(class047822, (class07049)class080362, (class07049)class080362, class074382, class070552.i(), 1.0);
        } else {
            class074382.method_6092(class070552);
        }
    }

    public boolean N(class03556<class06525> class035562) {
        return this.potion.isPresent() && this.potion.get().N(class035562) && this.customEffects.isEmpty();
    }

    public static class06584 N(class06581 class065812, class03556<class06525> class035562) {
        class06584 class065842 = new class06584(class065812);
        class065842.N(class02484.h, new class06517(class035562));
        return class065842;
    }

    public void N(class07438 class074382, float f) {
        class07299 class072992 = class074382.method_73183();
        if (!(class072992 instanceof class04782)) {
            return;
        }
        class04782 class047822 = (class04782)class072992;
        class072992 = class074382 instanceof class08036 ? (class08036)class074382 : null;
        this.N(arg_0 -> class06517.N(class047822, (class08036)class072992, class074382, arg_0), f);
    }

    public void N(Consumer<class07055> consumer, float f) {
        if (this.potion.isPresent()) {
            for (class07055 class070552 : ((class06525)this.potion.get().N()).N()) {
                consumer.accept(class070552.N(f));
            }
        }
        for (class07055 class070552 : this.customEffects) {
            consumer.accept(class070552.N(f));
        }
    }

    public static OptionalInt N(Iterable<class07055> iterable) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        for (class07055 class070552 : iterable) {
            if (!class070552.M()) continue;
            int n5 = ((class07084)class070552.L().N()).Z();
            int n6 = class070552.i() + 1;
            n += n6 * class02566.L((int)n5);
            n2 += n6 * class02566.u((int)n5);
            n3 += n6 * class02566.i((int)n5);
            n4 += n6;
        }
        if (n4 == 0) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(class02566.N((int)(n / n4), (int)(n2 / n4), (int)(n3 / n4)));
    }

    public class00392 N(String string) {
        String string2 = this.customName.or(() -> this.potion.map(class035562 -> ((class06525)class035562.N()).y())).orElse("empty");
        return class00392.L((String)(string + string2));
    }

    public int N(int n) {
        if (this.customColor.isPresent()) {
            return this.customColor.get();
        }
        return class06517.N(this.N()).orElse(n);
    }

    public class06517 N(class07055 class070552) {
        return new class06517(this.potion, this.customColor, class07536.N(this.customEffects, (Object)class070552), this.customName);
    }

    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        class06517.N(this.N(), consumer, ((Float)class026662.a_(class02484.r, (Object)Float.valueOf(1.0f))).floatValue(), class065912.y());
    }

    public void N(class07299 class072992, class07438 class074382, class06584 class065842, class08209 class082092) {
        this.N(class074382, ((Float)class065842.a_(class02484.r, Float.valueOf(1.0f))).floatValue());
    }

    public static class05216 N(class03556<class07084> class035562, int n) {
        class05216 class052162 = class00392.L((String)((class07084)class035562.N()).R());
        if (n > 0) {
            return class00392.N((String)"potion.withAmplifier", (Object[])new Object[]{class052162, class00392.L((String)("potion.potency." + n))});
        }
        return class052162;
    }

    public Iterable<class07055> N() {
        if (this.potion.isEmpty()) {
            return this.customEffects;
        }
        if (this.customEffects.isEmpty()) {
            return ((class06525)this.potion.get().N()).N();
        }
        return Iterables.concat(((class06525)this.potion.get().N()).N(), this.customEffects);
    }

    public Optional<Integer> R() {
        return this.customColor;
    }
}

