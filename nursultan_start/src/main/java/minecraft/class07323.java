/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10735
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  minecraft.class00500
 *  minecraft.class01042
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02523
 *  minecraft.class02525
 *  minecraft.class02530
 *  minecraft.class02536
 *  minecraft.class02558
 *  minecraft.class02710
 *  minecraft.class02715
 *  minecraft.class02766
 *  minecraft.class02834
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04531
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05033
 *  minecraft.class05908
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07085
 *  minecraft.class07438
 *  minecraft.class07468
 *  minecraft.class07471
 *  minecraft.class07536
 *  minecraft.class08005
 *  net.fabricmc.fabric.api.item.v1.EnchantingContext
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.apache.commons.lang3.mutable.MutableFloat
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10735;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class00500;
import minecraft.class01042;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02523;
import minecraft.class02525;
import minecraft.class02530;
import minecraft.class02536;
import minecraft.class02558;
import minecraft.class02710;
import minecraft.class02715;
import minecraft.class02766;
import minecraft.class02834;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04531;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05033;
import minecraft.class05908;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07085;
import minecraft.class07304;
import minecraft.class07306;
import minecraft.class07310;
import minecraft.class07317;
import minecraft.class07438;
import minecraft.class07468;
import minecraft.class07471;
import minecraft.class07536;
import minecraft.class08005;
import net.fabricmc.fabric.api.item.v1.EnchantingContext;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public class class07323 {
    public static int L(class04782 class047822, class06584 class065842, class07049 class070492) {
        MutableFloat mutableFloat = new MutableFloat(0.0f);
        class07323.N(class065842, (class035562, n) -> ((class07304)((Object)((Object)class035562.N()))).y(class047822, n, class065842, class070492, mutableFloat));
        return Math.max(0, mutableFloat.intValue());
    }

    public static class02477<class02710> L(class06584 class065842) {
        return class065842.N(class06570.Gq) ? class02484.p : class02484.P;
    }

    public static <T> @Nullable Pair<T, Integer> L(class06584 class065842, class02477<T> class024772) {
        MutableObject mutableObject = new MutableObject();
        class07323.N(class065842, (class035562, n) -> {
            Object object;
            if ((mutableObject.get() == null || (Integer)((Pair)mutableObject.get()).getSecond() < n) && (object = ((class07304)((Object)((Object)class035562.N()))).Z().method_58694(class024772)) != null) {
                mutableObject.setValue((Object)Pair.of((Object)object, (Object)n));
            }
        });
        return (Pair)mutableObject.get();
    }

    public static float L(class04782 class047822, class06584 class065842, class07049 class070492, class07072 class070722, float f) {
        MutableFloat mutableFloat = new MutableFloat(f);
        class07323.N(class065842, (class035562, n) -> ((class07304)((Object)((Object)class035562.N()))).i(class047822, n, class065842, class070492, class070722, mutableFloat));
        return mutableFloat.floatValue();
    }

    public static int L(class04782 class047822, class06584 class065842, int n2) {
        MutableFloat mutableFloat = new MutableFloat((float)n2);
        class07323.N(class065842, (class035562, n) -> ((class07304)((Object)((Object)class035562.N()))).i(class047822, n, class065842, mutableFloat));
        return Math.max(0, mutableFloat.intValue());
    }

    public static float u(class04782 class047822, class06584 class065842, class07049 class070492, class07072 class070722, float f) {
        MutableFloat mutableFloat = new MutableFloat(f);
        class07323.N(class065842, (class035562, n) -> ((class07304)((Object)((Object)class035562.N()))).u(class047822, n, class065842, class070492, class070722, mutableFloat));
        return mutableFloat.floatValue();
    }

    public static boolean u(class06584 class065842) {
        return !((class02710)class065842.a_(class02484.P, (Object)class02710.N)).u() || !((class02710)class065842.a_(class02484.p, (Object)class02710.N)).u();
    }

    public static void y(class04782 class047822, class07438 class074382) {
        class07323.N(class074382, (class03556<class07304> class035562, int n, class02525 class025252) -> ((class07304)((Object)((Object)class035562.N()))).y(class047822, n, class025252, (class07049)class074382));
    }

    public static List<class07317> y(class06069 class060692, class06584 class065842, int n, Stream<class03556<class07304>> stream) {
        ArrayList arrayList = Lists.newArrayList();
        class02766 class027662 = (class02766)class065842.method_58694(class02484.J);
        if (class027662 == null) {
            return arrayList;
        }
        n += 1 + class060692.y(class027662.N() / 4 + 1) + class060692.y(class027662.N() / 4 + 1);
        float f = (class060692.z() + class060692.z() - 1.0f) * 0.15f;
        List<class07317> var7 = class07323.N(n = class04995.N((int)Math.round((float)n + (float)n * f), (int)1, (int)Integer.MAX_VALUE), class065842, stream);
        if (!var7.isEmpty()) {
            class04531.N((class06069)class060692, var7, class07317::N).ifPresent(arrayList::add);
            while (class060692.y(50) <= n) {
                if (!arrayList.isEmpty()) {
                    class07323.N(var7, (class07317)((Object)arrayList.getLast()));
                }
                if (var7.isEmpty()) break;
                class04531.N((class06069)class060692, var7, class07317::N).ifPresent(arrayList::add);
                n /= 2;
            }
        }
        return arrayList;
    }

    public static float y(class04782 class047822, class06584 class065842, class07049 class070492) {
        MutableFloat mutableFloat = new MutableFloat(0.0f);
        class07323.N(class065842, (class035562, n) -> ((class07304)((Object)((Object)class035562.N()))).L(class047822, n, class065842, class070492, mutableFloat));
        return Math.max(0.0f, mutableFloat.floatValue());
    }

    public static <T> Optional<T> y(class06584 class065842, class02477<List<T>> class024772) {
        Pair<List<T>, Integer> pair = class07323.L(class065842, class024772);
        if (pair != null) {
            List list = (List)pair.getFirst();
            int n = (Integer)pair.getSecond();
            return Optional.of(list.get(Math.min(n, list.size()) - 1));
        }
        return Optional.empty();
    }

    public static int y(class04782 class047822, class06584 class065842, int n2) {
        MutableFloat mutableFloat = new MutableFloat((float)n2);
        class07323.N(class065842, (class035562, n) -> ((class07304)((Object)((Object)class035562.N()))).u(class047822, n, class065842, mutableFloat));
        return mutableFloat.intValue();
    }

    public static float y(class04782 class047822, class06584 class065842, class07049 class070492, class07072 class070722, float f) {
        MutableFloat mutableFloat = new MutableFloat(f);
        class07323.N(class065842, (class035562, n) -> ((class07304)((Object)((Object)class035562.N()))).L(class047822, n, class065842, class070492, class070722, mutableFloat));
        return mutableFloat.floatValue();
    }

    public static class02710 y(class06584 class065842) {
        return (class02710)class065842.a_(class07323.L(class065842), (Object)class02710.N);
    }

    public static float y(class04782 class047822, class07438 class074382, class07072 class070722) {
        MutableFloat mutableFloat = new MutableFloat(0.0f);
        class07323.N(class074382, (class03556<class07304> class035562, int n, class02525 class025252) -> ((class07304)((Object)((Object)class035562.N()))).N(class047822, n, class025252.N(), (class07049)class074382, class070722, mutableFloat));
        return mutableFloat.floatValue();
    }

    private static boolean N(class07304 class073042, class06584 class065842, class06584 class065843, boolean bl, class03556 class035562) {
        return class065842.canBeEnchantedWith(class035562, EnchantingContext.PRIMARY);
    }

    private static /* synthetic */ void N(class04782 class047822, class02525 class025252, class08005 class080052, class03556 class035562, int n) {
        ((class07304)((Object)class035562.N())).L(class047822, n, class025252, (class07049)class080052);
    }

    private static /* synthetic */ void N(class04782 class047822, class02525 class025252, class07049 class070492, class07072 class070722, class03556 class035562, int n) {
        ((class07304)((Object)class035562.N())).N(class047822, n, class025252, class02558.field_51683, class070492, class070722);
    }

    public static void N(class04782 class047822, class07049 class070492, class07072 class070722, @Nullable class06584 class065842, @Nullable Consumer<class06581> consumer) {
        class07438 class074382;
        if (class070492 instanceof class07438) {
            class074382 = (class07438)class070492;
            class07323.N(class074382, (class03556<class07304> class035562, int n, class02525 class025252) -> ((class07304)((Object)((Object)class035562.N()))).N(class047822, n, class025252, class02558.field_51685, class070492, class070722));
        }
        if (class065842 != null) {
            class07049 class070493 = class070722.u();
            if (class070493 instanceof class07438) {
                class074382 = (class07438)class070493;
                class07323.N(class065842, class07085.field_6173, class074382, (class03556<class07304> class035562, int n, class02525 class025252) -> ((class07304)((Object)((Object)class035562.N()))).N(class047822, n, class025252, class02558.field_51683, class070492, class070722));
            } else if (consumer != null) {
                class070493 = new class02525(class065842, null, null, consumer);
                class07323.N(class065842, (arg_0, arg_1) -> class07323.N(class047822, (class02525)class070493, class070492, class070722, arg_0, arg_1));
            }
        }
    }

    public static void N(class04782 class047822, class07049 class070492, class07072 class070722, @Nullable class06584 class065842) {
        class07323.N(class047822, class070492, class070722, class065842, null);
    }

    public static void N(class04782 class047822, class07049 class070492) {
        if (class070492 instanceof class07438) {
            class07438 class074382 = (class07438)class070492;
            class07323.N(class070492.method_59958(), class07085.field_6173, class074382, (class03556<class07304> class035562, int n, class02525 class025252) -> ((class07304)((Object)((Object)class035562.N()))).N(class047822, n, class025252, class070492));
        }
    }

    public static void N(class04782 class047822, class07049 class070492, class07072 class070722) {
        class07049 class070493 = class070722.u();
        if (class070493 instanceof class07438) {
            class07438 class074382 = (class07438)class070493;
            class07323.N(class047822, class070492, class070722, class074382.method_59958());
        } else {
            class07323.N(class047822, class070492, class070722, null);
        }
    }

    public static float N(class04782 class047822, class06584 class065842, class07049 class070492, class07072 class070722, float f) {
        MutableFloat mutableFloat = new MutableFloat(f);
        class07323.N(class065842, (class035562, n) -> ((class07304)((Object)((Object)class035562.N()))).y(class047822, n, class065842, class070492, class070722, mutableFloat));
        return mutableFloat.floatValue();
    }

    public static boolean N(class04782 class047822, class07438 class074382, class07072 class070722) {
        MutableBoolean mutableBoolean = new MutableBoolean();
        class07323.N(class074382, (class03556<class07304> class035562, int n, class02525 class025252) -> mutableBoolean.setValue(mutableBoolean.isTrue() || ((class07304)((Object)((Object)class035562.N()))).N(class047822, n, (class07049)class074382, class070722)));
        return mutableBoolean.isTrue();
    }

    public static int N(class04782 class047822, class06584 class065842, class07049 class070492, int n2) {
        MutableFloat mutableFloat = new MutableFloat((float)n2);
        class07323.N(class065842, (class035562, n) -> ((class07304)((Object)((Object)class035562.N()))).i(class047822, n, class065842, class070492, mutableFloat));
        return Math.max(0, mutableFloat.intValue());
    }

    public static int N(class03556<class07304> class035562, class07438 class074382) {
        Collection<class06584> var2 = ((class07304)((Object)class035562.N())).N(class074382).values();
        int n = 0;
        for (class06584 class065842 : var2) {
            int n2 = class07323.N(class035562, class065842);
            if (n2 <= n) continue;
            n = n2;
        }
        return n;
    }

    public static void N(class06584 class065842, class07438 class074382, class07085 class070852) {
        class07323.N(class065842, class070852, class074382, (class03556<class07304> class035562, int n, class02525 class025252) -> ((class07304)((Object)((Object)class035562.N()))).N(n, class025252, class074382));
    }

    public static void N(class07438 class074382) {
        class07323.N(class074382, (class03556<class07304> class035562, int n, class02525 class025252) -> ((class07304)((Object)((Object)class035562.N()))).N(n, class025252, class074382));
    }

    public static void N(class04782 class047822, class06584 class065842, class07438 class074382, class07085 class070852) {
        class07323.N(class065842, class070852, class074382, (class03556<class07304> class035562, int n, class02525 class025252) -> ((class07304)((Object)((Object)class035562.N()))).N(class047822, n, class025252, class074382));
    }

    public static void N(class04782 class047822, class07438 class074382) {
        class07323.N(class074382, (class03556<class07304> class035562, int n, class02525 class025252) -> ((class07304)((Object)((Object)class035562.N()))).N(class047822, n, class025252, class074382));
    }

    public static int N(class04782 class047822, class06584 class065842, class06584 class065843, int n2) {
        MutableFloat mutableFloat = new MutableFloat((float)n2);
        class07323.N(class065842, (class035562, n) -> ((class07304)((Object)((Object)class035562.N()))).y(class047822, n, class065843, mutableFloat));
        return mutableFloat.intValue();
    }

    public static int N(class04782 class047822, class06584 class065842, int n2) {
        MutableFloat mutableFloat = new MutableFloat((float)n2);
        class07323.N(class065842, (class035562, n) -> ((class07304)((Object)((Object)class035562.N()))).N(class047822, n, class065842, mutableFloat));
        return mutableFloat.intValue();
    }

    public static void N(class06584 class065842, class02710 class027102) {
        class065842.N(class07323.L(class065842), (Object)class027102);
    }

    public static boolean N(class06584 class065842) {
        return class065842.L(class07323.L(class065842));
    }

    public static class02710 N(class06584 class065842, Consumer<class02715> consumer) {
        class02477<class02710> var2 = class07323.L(class065842);
        class02710 class027102 = (class02710)class065842.method_58694(var2);
        if (class027102 == null) {
            return class02710.N;
        }
        class02715 class027152 = new class02715(class027102);
        consumer.accept(class027152);
        class02710 class027103 = class027152.y();
        class065842.N(var2, (Object)class027103);
        return class027103;
    }

    public static int N(class03556<class07304> class035562, class06584 class065842) {
        return ((class02710)class065842.a_(class02484.P, (Object)class02710.N)).N(class035562);
    }

    public static void N(class07438 class074382, class07306 class073062) {
        for (class07085 class070852 : class07085.field_54086) {
            class07323.N(class074382.method_6118(class070852), class070852, class074382, class073062);
        }
    }

    public static void N(class06584 class065842, class07085 class070852, class07438 class074382, class07306 class073062) {
        if (class065842.R()) {
            return;
        }
        class02710 class027102 = (class02710)class065842.method_58694(class02484.P);
        if (class027102 == null || class027102.u()) {
            return;
        }
        class02525 class025252 = new class02525(class065842, class070852, class074382);
        for (Object2IntMap.Entry entry : class027102.y()) {
            class03556 var8 = (class03556)entry.getKey();
            if (!((class07304)((Object)var8.N())).N(class070852)) continue;
            class073062.accept((class03556<class07304>)var8, entry.getIntValue(), class025252);
        }
    }

    public static void N(class06584 class065842, class10735 class107352) {
        for (Object2IntMap.Entry entry : ((class02710)class065842.a_(class02484.P, (Object)class02710.N)).y()) {
            class107352.accept((class03556)entry.getKey(), entry.getIntValue());
        }
    }

    public static class06584 N(class07317 class073172) {
        class06584 class065842 = new class06584((class07310)class06570.Gq);
        class065842.N(class073172.y(), class073172.L());
        return class065842;
    }

    public static int N(class04782 class047822, @Nullable class07049 class070492, class07049 class070493, int n2) {
        if (class070492 instanceof class07438) {
            class07438 class074382 = (class07438)class070492;
            MutableFloat mutableFloat = new MutableFloat((float)n2);
            class07323.N(class074382, (class03556<class07304> class035562, int n, class02525 class025252) -> ((class07304)((Object)((Object)class035562.N()))).N(class047822, n, class025252.N(), class070493, mutableFloat));
            return mutableFloat.intValue();
        }
        return n2;
    }

    public static void N(List<class07317> list, class07317 class073172) {
        list.removeIf(class073173 -> !class07304.N(class073172.y(), class073173.y()));
    }

    public static class06584 N(class06069 class060692, class06584 class065842, int n, Stream<class03556<class07304>> stream) {
        List<class07317> var4 = class07323.y(class060692, class065842, n, stream);
        if (class065842.N(class06570.jY)) {
            class065842 = new class06584((class07310)class06570.Gq);
        }
        for (class07317 class073172 : var4) {
            class065842.N(class073172.y(), class073172.L());
        }
        return class065842;
    }

    public static class06584 N(class06069 class060692, class06584 class065842, int n, class01042 class010422, Optional<? extends class03543<class07304>> optional) {
        return class07323.N(class060692, class065842, n, optional.map(class03543::N).orElseGet(() -> class010422.L(class04227.yR).z().map(class035292 -> class035292)));
    }

    public static int N(class06069 class060692, int n, int n2, class06584 class065842) {
        if ((class02766)class065842.method_58694(class02484.J) == null) {
            return 0;
        }
        if (n2 > 15) {
            n2 = 15;
        }
        int n3 = class060692.y(8) + 1 + (n2 >> 1) + class060692.y(n2 + 1);
        if (n == 0) {
            return Math.max(n3 / 3, 1);
        }
        if (n == 1) {
            return n3 * 2 / 3 + 1;
        }
        return Math.max(n3, n2 * 2);
    }

    public static Optional<class02525> N(class02477<?> class024772, class07438 class074382, Predicate<class06584> predicate) {
        ArrayList<class02525> arrayList = new ArrayList<class02525>();
        for (class07085 class070852 : class07085.field_54086) {
            class06584 class065842 = class074382.method_6118(class070852);
            if (!predicate.test(class065842)) continue;
            Iterator var8 = ((class02710)class065842.a_(class02484.P, (Object)class02710.N)).y().iterator();
            while (var8.hasNext()) {
                class03556 var10 = (class03556)((Object2IntMap.Entry)var8.next()).getKey();
                if (!((class07304)((Object)var10.N())).Z().N(class024772) || !((class07304)((Object)var10.N())).N(class070852)) continue;
                arrayList.add(new class02525(class065842, class070852, class074382));
            }
        }
        return class07536.y_9(arrayList, (class06069)class074382.method_59922());
    }

    public static boolean N(class06584 class065842, class02477<?> class024772) {
        MutableBoolean mutableBoolean = new MutableBoolean(false);
        class07323.N(class065842, (class035562, n) -> {
            if (((class07304)((Object)((Object)class035562.N()))).Z().N(class024772)) {
                mutableBoolean.setTrue();
            }
        });
        return mutableBoolean.booleanValue();
    }

    public static void N(class06584 class065842, class01042 class010422, class05946<class02530> class059462, class07052 class070522, class06069 class060692) {
        class02530 class025302 = (class02530)class010422.L(class04227.yi).L(class059462);
        if (class025302 != null) {
            class07323.N(class065842, (class02715 class027152) -> class025302.N(class065842, class027152, class060692, class070522));
        }
    }

    public static List<class07317> N(int n, class06584 class065842, Stream<class03556<class07304>> stream) {
        ArrayList arrayList = Lists.newArrayList();
        boolean bl = class065842.N(class06570.jY);
        stream.filter(class035562 -> class07323.N((class07304)((Object)((Object)class035562.N())), class065842, class065842, bl, class035562) || bl).forEach(class035562 -> {
            class07304 class073042 = (class07304)((Object)((Object)class035562.N()));
            for (int i = class073042.i(); i >= class073042.u(); --i) {
                if (n < class073042.y(i) || n > class073042.L(i)) continue;
                arrayList.add(new class07317((class03556<class07304>)class035562, i));
                break;
            }
        });
        return arrayList;
    }

    public static boolean N(Collection<class03556<class07304>> collection, class03556<class07304> class035562) {
        Iterator<class03556<class07304>> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (class07304.N(iterator.next(), class035562)) continue;
            return false;
        }
        return true;
    }

    public static void N(class06584 class065842, class02834 class028342, BiConsumer<class03556<class07468>, class07471> biConsumer) {
        class07323.N(class065842, (class035562, n) -> ((class07304)((Object)((Object)class035562.N()))).N(class02523.W).forEach(class025412 -> {
            if (((class07304)((Object)((Object)((Object)class035562.N())))).M().B().contains(class028342)) {
                biConsumer.accept(class025412.L(), class025412.N(n, (class05033)class028342));
            }
        }));
    }

    public static float N(class04782 class047822, class07438 class074382, class07072 class070722, float f) {
        MutableFloat mutableFloat = new MutableFloat(f);
        class06069 class060692 = class074382.method_59922();
        class07323.N(class074382, (class03556<class07304> class035562, int n, class02525 class025252) -> {
            class05908 class059082 = class07304.y(class047822, n, (class07049)class074382, class070722);
            ((class07304)((Object)((Object)class035562.N()))).N(class02523.m).forEach(class025502 -> {
                if (class025502.N() == class02558.field_51685 && class025502.y() == class02558.field_51685 && class025502.N(class059082)) {
                    mutableFloat.setValue(((class02536)class025502.L()).N(n, class060692, mutableFloat.floatValue()));
                }
            });
        });
        class07049 class070492 = class070722.u();
        if (class070492 instanceof class07438) {
            class07323.N((class07438)class070492, (class03556<class07304> class035562, int n, class02525 class025252) -> {
                class05908 class059082 = class07304.y(class047822, n, (class07049)class074382, class070722);
                ((class07304)((Object)((Object)class035562.N()))).N(class02523.m).forEach(class025502 -> {
                    if (class025502.N() == class02558.field_51683 && class025502.y() == class02558.field_51685 && class025502.N(class059082)) {
                        mutableFloat.setValue(((class02536)class025502.L()).N(n, class060692, mutableFloat.floatValue()));
                    }
                });
            });
        }
        return mutableFloat.floatValue();
    }

    public static void N(class04782 class047822, class06584 class065842, @Nullable class07438 class074382, class07049 class070492, @Nullable class07085 class070852, class06889 class068892, class00500 class005002, Consumer<class06581> consumer) {
        class02525 class025252 = new class02525(class065842, class070852, class074382, consumer);
        class07323.N(class065842, (class035562, n) -> ((class07304)((Object)((Object)class035562.N()))).N(class047822, n, class025252, class070492, class068892, class005002));
    }

    public static void N(class04782 class047822, class06584 class065842, class08005 class080052, Consumer<class06581> consumer) {
        class07438 class074382;
        class07049 class070492 = class080052.z();
        class07438 class074383 = class070492 instanceof class07438 ? (class074382 = (class07438)class070492) : null;
        class074382 = new class02525(class065842, null, class074383, consumer);
        class07323.N(class065842, (arg_0, arg_1) -> class07323.N(class047822, (class02525)class074382, class080052, arg_0, arg_1));
    }

    public static int N(class04782 class047822, class06584 class065842, class06584 class065843) {
        MutableFloat mutableFloat = new MutableFloat(0.0f);
        class07323.N(class065842, (class035562, n) -> ((class07304)((Object)((Object)class035562.N()))).L(class047822, n, class065843, mutableFloat));
        return Math.max(0, mutableFloat.intValue());
    }

    public static float N(class04782 class047822, class06584 class065842, class07049 class070492, float f) {
        MutableFloat mutableFloat = new MutableFloat(f);
        class07323.N(class065842, (class035562, n) -> ((class07304)((Object)((Object)class035562.N()))).R(class047822, n, class065842, class070492, mutableFloat));
        return Math.max(0.0f, mutableFloat.floatValue());
    }

    public static boolean N(class06584 class065842, class03530<class07304> class035302) {
        Iterator var3 = ((class02710)class065842.a_(class02484.P, (Object)class02710.N)).y().iterator();
        while (var3.hasNext()) {
            if (!((class03556)((Object2IntMap.Entry)var3.next()).getKey()).N(class035302)) continue;
            return true;
        }
        return false;
    }

    public static float N(class06584 class065842, class07438 class074382) {
        MutableFloat mutableFloat = new MutableFloat(0.0f);
        class07323.N(class065842, (class035562, n) -> ((class07304)((Object)((Object)class035562.N()))).N(class074382.method_59922(), n, mutableFloat));
        return mutableFloat.floatValue();
    }

    public static float N(class06584 class065842, class07438 class074382, float f) {
        MutableFloat mutableFloat = new MutableFloat(f);
        class07323.N(class065842, (class035562, n) -> ((class07304)((Object)((Object)class035562.N()))).y(class074382.method_59922(), n, mutableFloat));
        return Math.max(0.0f, mutableFloat.floatValue());
    }

    public static int N(class04782 class047822, class06584 class065842, class07049 class070492) {
        MutableFloat mutableFloat = new MutableFloat(0.0f);
        class07323.N(class065842, (class035562, n) -> ((class07304)((Object)((Object)class035562.N()))).u(class047822, n, class065842, class070492, mutableFloat));
        return Math.max(0, mutableFloat.intValue());
    }

    public static void N(class06584 class065842, class07085 class070852, BiConsumer<class03556<class07468>, class07471> biConsumer) {
        class07323.N(class065842, (class035562, n) -> ((class07304)((Object)((Object)class035562.N()))).N(class02523.W).forEach(class025412 -> {
            if (((class07304)((Object)((Object)((Object)class035562.N())))).N(class070852)) {
                biConsumer.accept(class025412.L(), class025412.N(n, (class05033)class070852));
            }
        }));
    }
}

