/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00500
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02477
 *  minecraft.class02523
 *  minecraft.class02525
 *  minecraft.class02536
 *  minecraft.class02548
 *  minecraft.class02550
 *  minecraft.class02558
 *  minecraft.class02560
 *  minecraft.class02625
 *  minecraft.class02695
 *  minecraft.class02834
 *  minecraft.class02944
 *  minecraft.class03539
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class03748
 *  minecraft.class04160
 *  minecraft.class04162
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class04782
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05908
 *  minecraft.class05927
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06541
 *  minecraft.class06551
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06925
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07085
 *  minecraft.class07438
 *  org.apache.commons.lang3.mutable.MutableFloat
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00500;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02477;
import minecraft.class02523;
import minecraft.class02525;
import minecraft.class02536;
import minecraft.class02548;
import minecraft.class02550;
import minecraft.class02558;
import minecraft.class02560;
import minecraft.class02625;
import minecraft.class02695;
import minecraft.class02834;
import minecraft.class02944;
import minecraft.class03539;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class03748;
import minecraft.class04160;
import minecraft.class04162;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class04782;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05908;
import minecraft.class05927;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06541;
import minecraft.class06551;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06925;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07085;
import minecraft.class07286;
import minecraft.class07300;
import minecraft.class07301;
import minecraft.class07438;
import org.apache.commons.lang3.mutable.MutableFloat;

public final class class07304
extends Record {
    private final class00392 description;
    private final class07286 definition;
    private final class03543<class07304> exclusiveSet;
    private final class02695 effects;
    public static final int N = 255;
    public static final Codec<class07304> y = RecordCodecBuilder.create(instance -> instance.group((App)class03748.N.fieldOf("description").forGetter(class07304::R), (App)class07286.L.forGetter(class07304::M), (App)class03541.N((class05946)class04227.yR).optionalFieldOf("exclusive_set", (Object)class03543.N((class03556[])new class03556[0])).forGetter(class07304::B), (App)class02523.y.optionalFieldOf("effects", (Object)class02695.N).forGetter(class07304::Z)).apply(instance, class07304::new));
    public static final Codec<class03556<class07304>> L = class03539.N((class05946)class04227.yR);
    public static final class02362<class04247, class03556<class07304>> u = class02389.y((class05946)class04227.yR);

    public int L() {
        return this.definition.M();
    }

    public void L(class04782 class047822, int n, class06584 class065842, class07049 class070492, MutableFloat mutableFloat) {
        this.N((class02477<List<class02944<class02536>>>)class02523.G, class047822, n, class065842, class070492, mutableFloat);
    }

    public void L(class04782 class047822, int n, class06584 class065842, MutableFloat mutableFloat) {
        this.N((class02477<List<class02944<class02536>>>)class02523.b, class047822, n, class065842, mutableFloat);
    }

    public boolean L(class06584 class065842) {
        return this.definition.N().N(class065842.Z());
    }

    public int L(int n) {
        return this.definition.R().N(n);
    }

    public void L(class04782 class047822, int n, class06584 class065842, class07049 class070492, class07072 class070722, MutableFloat mutableFloat) {
        this.N((class02477<List<class02944<class02536>>>)class02523.R, class047822, n, class065842, class070492, class070722, mutableFloat);
    }

    public void L(class04782 class047822, int n, class02525 class025252, class07049 class070492) {
        class07304.N(this.N(class02523.j), class07304.N(class047822, n, class070492, class070492.method_73189()), (T class025602) -> class025602.N(class047822, n, class025252, class070492, class070492.method_73189()));
    }

    public class07286 M() {
        return this.definition;
    }

    public class07304(class00392 class003922, class07286 class072862, class03543<class07304> class035432, class02695 class026952) {
        this.description = class003922;
        this.definition = class072862;
        this.exclusiveSet = class035432;
        this.effects = class026952;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07304.class, "description;definition;exclusiveSet;effects", "description", "definition", "exclusiveSet", "effects"}, this, object);
    }

    public String toString() {
        return "Enchantment " + this.description.getString();
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07304.class, "description;definition;exclusiveSet;effects", "description", "definition", "exclusiveSet", "effects"}, this);
    }

    public class03543<class07304> B() {
        return this.exclusiveSet;
    }

    public class02695 Z() {
        return this.effects;
    }

    public void i(class04782 class047822, int n, class06584 class065842, class07049 class070492, class07072 class070722, MutableFloat mutableFloat) {
        this.N((class02477<List<class02944<class02536>>>)class02523.B, class047822, n, class065842, class070492, class070722, mutableFloat);
    }

    public void i(class04782 class047822, int n, class06584 class065842, MutableFloat mutableFloat) {
        this.N((class02477<List<class02944<class02536>>>)class02523.k, class047822, n, class065842, mutableFloat);
    }

    public int i() {
        return this.definition.u();
    }

    public void i(class04782 class047822, int n, class06584 class065842, class07049 class070492, MutableFloat mutableFloat) {
        this.N((class02477<List<class02944<class02536>>>)class02523.n, class047822, n, class065842, class070492, mutableFloat);
    }

    public void u(class04782 class047822, int n, class06584 class065842, MutableFloat mutableFloat) {
        this.N((class02477<List<class02944<class02536>>>)class02523.d, class047822, n, class065842, mutableFloat);
    }

    public void u(class04782 class047822, int n, class06584 class065842, class07049 class070492, MutableFloat mutableFloat) {
        this.N((class02477<List<class02944<class02536>>>)class02523.l, class047822, n, class065842, class070492, mutableFloat);
    }

    public void u(class04782 class047822, int n, class06584 class065842, class07049 class070492, class07072 class070722, MutableFloat mutableFloat) {
        this.N((class02477<List<class02944<class02536>>>)class02523.M, class047822, n, class065842, class070492, class070722, mutableFloat);
    }

    public int u() {
        return 1;
    }

    public void y(class06069 class060692, int n, MutableFloat mutableFloat) {
        this.N((class02477<class02536>)class02523.Y, class060692, n, mutableFloat);
    }

    public int y(int n) {
        return this.definition.i().N(n);
    }

    public void y(class04782 class047822, int n, class02525 class025252, class07049 class070492) {
        class07304.N(this.N(class02523.s), class07304.N(class047822, n, class070492, class070492.method_73189()), (T class025602) -> class025602.N(class047822, n, class025252, class070492, class070492.method_73189()));
    }

    public static class05908 y(class04782 class047822, int n, class07049 class070492, class07072 class070722) {
        class04162 class041622 = new class04160(class047822).N(class06551.N, (Object)class070492).N(class06551.W, (Object)n).N(class06551.B, (Object)class070492.method_73189()).N(class06551.i, (Object)class070722).y(class06551.R, (Object)class070722.u()).y(class06551.M, (Object)class070722.L()).N(class06925.G);
        return new class05927(class041622).N(Optional.empty());
    }

    public void y(class04782 class047822, int n, class06584 class065842, class07049 class070492, class07072 class070722, MutableFloat mutableFloat) {
        this.N((class02477<List<class02944<class02536>>>)class02523.i, class047822, n, class065842, class070492, class070722, mutableFloat);
    }

    public boolean y(class06584 class065842) {
        return class065842.N(this.definition.N());
    }

    public void y(class04782 class047822, int n, class06584 class065842, MutableFloat mutableFloat) {
        this.N((class02477<List<class02944<class02536>>>)class02523.T, class047822, n, class065842, mutableFloat);
    }

    public int y() {
        return this.definition.L();
    }

    public void y(class04782 class047822, int n, class06584 class065842, class07049 class070492, MutableFloat mutableFloat) {
        this.N((class02477<List<class02944<class02536>>>)class02523.t, class047822, n, class065842, class070492, mutableFloat);
    }

    public static class05908 N(class04782 class047822, int n, class07049 class070492, boolean bl) {
        class04162 class041622 = new class04160(class047822).N(class06551.N, (Object)class070492).N(class06551.W, (Object)n).N(class06551.B, (Object)class070492.method_73189()).N(class06551.m, (Object)bl).N(class06925.d);
        return new class05927(class041622).N(Optional.empty());
    }

    public void N(class04782 class047822, int n, class02525 class025252, class07438 class074382) {
        class07085 class070852 = class025252.y();
        if (class070852 == null) {
            return;
        }
        Map map = class074382.method_59926(class070852);
        if (!this.N(class070852)) {
            Set set = (Set)map.remove((Object)this);
            if (set != null) {
                set.forEach(class025482 -> class025482.N(class025252, (class07049)class074382, class074382.method_73189(), n));
            }
            return;
        }
        Set set = (Set)map.get((Object)this);
        for (class02944 class029442 : this.N(class02523.P)) {
            boolean bl;
            class02548 class025483 = (class02548)class029442.N();
            boolean bl2 = bl = set != null && set.contains(class025483);
            if (class029442.N(class07304.N(class047822, n, (class07049)class074382, bl))) {
                if (!bl) {
                    if (set == null) {
                        set = new ObjectArraySet();
                        map.put(this, set);
                    }
                    set.add(class025483);
                }
                class025483.N(class047822, n, class025252, (class07049)class074382, class074382.method_73189(), !bl);
                continue;
            }
            if (set == null || !set.remove(class025483)) continue;
            class025483.N(class025252, (class07049)class074382, class074382.method_73189(), n);
        }
        if (set != null && set.isEmpty()) {
            map.remove((Object)this);
        }
    }

    public void N(int n, class02525 class025252, class07438 class074382) {
        class07085 class070852 = class025252.y();
        if (class070852 == null) {
            return;
        }
        Set set = (Set)class074382.method_59926(class070852).remove((Object)this);
        if (set == null) {
            return;
        }
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            ((class02548)iterator.next()).N(class025252, (class07049)class074382, class074382.method_73189(), n);
        }
    }

    public static <T> void N(List<class02944<T>> list, class05908 class059082, Consumer<T> consumer) {
        for (class02944<T> class029442 : list) {
            if (!class029442.N(class059082)) continue;
            consumer.accept(class029442.N());
        }
    }

    public static class07301 N(class07286 class072862) {
        return new class07301(class072862);
    }

    public static class05908 N(class04782 class047822, int n, class07049 class070492, class06889 class068892, class00500 class005002) {
        class04162 class041622 = new class04160(class047822).N(class06551.N, (Object)class070492).N(class06551.W, (Object)n).N(class06551.B, (Object)class068892).N(class06551.Z, (Object)class005002).N(class06925.k);
        return new class05927(class041622).N(Optional.empty());
    }

    public static class05908 N(class04782 class047822, int n, class07049 class070492, class06889 class068892) {
        class04162 class041622 = new class04160(class047822).N(class06551.N, (Object)class070492).N(class06551.W, (Object)n).N(class06551.B, (Object)class068892).N(class06925.w);
        return new class05927(class041622).N(Optional.empty());
    }

    public static class07300 N(int n) {
        return new class07300(n, 0);
    }

    public static void N(class02550<class02560> class025502, class04782 class047822, int n, class02525 class025252, class07049 class070492, class07072 class070722) {
        if (class025502.N(class07304.y(class047822, n, class070492, class070722))) {
            class07049 class070493;
            switch (class025502.y()) {
                default: {
                    throw new MatchException(null, null);
                }
                case field_51683: {
                    class07049 class070494 = class070722.u();
                    break;
                }
                case field_51684: {
                    class07049 class070494 = class070722.L();
                    break;
                }
                case field_51685: {
                    class07049 class070494 = class070493 = class070492;
                }
            }
            if (class070493 != null) {
                ((class02560)class025502.L()).N(class047822, n, class025252, class070493, class070493.method_73189());
            }
        }
    }

    public static class07300 N(int n, int n2) {
        return new class07300(n, n2);
    }

    public void N(class04782 class047822, int n, class06584 class065842, MutableFloat mutableFloat) {
        this.N((class02477<List<class02944<class02536>>>)class02523.E, class047822, n, class065842, mutableFloat);
    }

    public boolean N(class07085 class070852) {
        return this.definition.B().stream().anyMatch(class028342 -> class028342.y(class070852));
    }

    public void N(class04782 class047822, int n, class06584 class065842, class07049 class070492, MutableFloat mutableFloat) {
        this.N((class02477<List<class02944<class02536>>>)class02523.w, class047822, n, class065842, class070492, mutableFloat);
    }

    public void N(class06069 class060692, int n, MutableFloat mutableFloat) {
        this.N((class02477<class02536>)class02523.J, class060692, n, mutableFloat);
    }

    public class03543<class06581> N() {
        return this.definition.N();
    }

    public Map<class07085, class06584> N(class07438 class074382) {
        EnumMap enumMap = Maps.newEnumMap(class07085.class);
        for (class07085 class070852 : class07085.field_54086) {
            class06584 class065842;
            if (!this.N(class070852) || (class065842 = class074382.method_6118(class070852)).R()) continue;
            enumMap.put(class070852, class065842);
        }
        return enumMap;
    }

    public static boolean N(class03556<class07304> class035562, class03556<class07304> class035563) {
        return !class035562.equals(class035563) && !((class07304)((Object)class035562.N())).exclusiveSet.N(class035563) && !((class07304)((Object)class035563.N())).exclusiveSet.N(class035562);
    }

    public static class00392 N(class03556<class07304> class035562, int n) {
        class05216 class052162 = ((class07304)((Object)class035562.N())).description.L();
        class052162 = class035562.N(class02625.P) ? class00390.N((class05216)class052162, (class00405)class00405.N.N(class06541.field_1061)) : class00390.N((class05216)class052162, (class00405)class00405.N.N(class06541.field_1080));
        if (n != 1 || ((class07304)((Object)class035562.N())).i() != 1) {
            class052162.y(class05220.l).y((class00392)class00392.L((String)("enchantment.level." + n)));
        }
        return class052162;
    }

    public boolean N(class06584 class065842) {
        return this.y(class065842) && (this.definition.y().isEmpty() || class065842.N(this.definition.y().get()));
    }

    public <T> List<T> N(class02477<List<T>> class024772) {
        return (List)this.effects.a_(class024772, List.of());
    }

    public boolean N(class04782 class047822, int n, class07049 class070492, class07072 class070722) {
        class05908 class059082 = class07304.y(class047822, n, class070492, class070722);
        Iterator iterator = this.N(class02523.u).iterator();
        while (iterator.hasNext()) {
            if (!((class02944)iterator.next()).N(class059082)) continue;
            return true;
        }
        return false;
    }

    public void N(class04782 class047822, int n, class06584 class065842, class07049 class070492, class07072 class070722, MutableFloat mutableFloat) {
        class05908 class059082 = class07304.y(class047822, n, class070492, class070722);
        for (class02944 class029442 : this.N(class02523.L)) {
            if (!class029442.N(class059082)) continue;
            mutableFloat.setValue(((class02536)class029442.N()).N(n, class070492.method_59922(), mutableFloat.floatValue()));
        }
    }

    public static class07286 N(class03543<class06581> class035432, class03543<class06581> class035433, int n, int n2, class07300 class073002, class07300 class073003, int n3, class02834 ... class02834Array) {
        return new class07286(class035432, Optional.of(class035433), n, n2, class073002, class073003, n3, List.of(class02834Array));
    }

    public void N(class04782 class047822, int n, class02525 class025252, class07049 class070492, class06889 class068892, class00500 class005002) {
        class07304.N(this.N(class02523.U), class07304.N(class047822, n, class070492, class068892, class005002), (T class025602) -> class025602.N(class047822, n, class025252, class070492, class068892));
    }

    public final void N(class02477<List<class02944<class02536>>> class024772, class04782 class047822, int n, class06584 class065842, MutableFloat mutableFloat) {
        class07304.N(this.N(class024772), class07304.N(class047822, n, class065842), (T class025362) -> mutableFloat.setValue(class025362.N(n, class047822.method_8409(), mutableFloat.floatValue())));
    }

    public final void N(class02477<List<class02944<class02536>>> class024772, class04782 class047822, int n, class06584 class065842, class07049 class070492, MutableFloat mutableFloat) {
        class07304.N(this.N(class024772), class07304.N(class047822, n, class070492, class070492.method_73189()), (T class025362) -> mutableFloat.setValue(class025362.N(n, class070492.method_59922(), mutableFloat.floatValue())));
    }

    public final void N(class02477<List<class02944<class02536>>> class024772, class04782 class047822, int n, class06584 class065842, class07049 class070492, class07072 class070722, MutableFloat mutableFloat) {
        class07304.N(this.N(class024772), class07304.y(class047822, n, class070492, class070722), (T class025362) -> mutableFloat.setValue(class025362.N(n, class070492.method_59922(), mutableFloat.floatValue())));
    }

    public static class05908 N(class04782 class047822, int n, class06584 class065842) {
        class04162 class041622 = new class04160(class047822).N(class06551.U, (Object)class065842).N(class06551.W, (Object)n).N(class06925.l);
        return new class05927(class041622).N(Optional.empty());
    }

    public static class07286 N(class03543<class06581> class035432, int n, int n2, class07300 class073002, class07300 class073003, int n3, class02834 ... class02834Array) {
        return new class07286(class035432, Optional.empty(), n, n2, class073002, class073003, n3, List.of(class02834Array));
    }

    public void N(class04782 class047822, int n, class02525 class025252, class02558 class025582, class07049 class070492, class07072 class070722) {
        for (class02550 class025502 : this.N(class02523.Z)) {
            if (class025582 != class025502.N()) continue;
            class07304.N((class02550<class02560>)class025502, class047822, n, class025252, class070492, class070722);
        }
    }

    public void N(class04782 class047822, int n, class02525 class025252, class07049 class070492) {
        class07304.N(this.N(class02523.z), class07304.N(class047822, n, class070492, class070492.method_73189()), (T class025602) -> class025602.N(class047822, n, class025252, class070492, class070492.method_73189()));
    }

    public void N(class02477<class02536> class024772, class06069 class060692, int n, MutableFloat mutableFloat) {
        class02536 class025362 = (class02536)this.effects.method_58694(class024772);
        if (class025362 != null) {
            mutableFloat.setValue(class025362.N(n, class060692, mutableFloat.floatValue()));
        }
    }

    public void R(class04782 class047822, int n, class06584 class065842, class07049 class070492, MutableFloat mutableFloat) {
        this.N((class02477<List<class02944<class02536>>>)class02523.v, class047822, n, class065842, class070492, mutableFloat);
    }

    public class00392 R() {
        return this.description;
    }
}

