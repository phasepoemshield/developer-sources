/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05543
 *  minecraft.class06069
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07212
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class04063;
import minecraft.class04065;
import minecraft.class04076;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05543;
import minecraft.class06069;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07212;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public class class04083 {
    private static final ObjectArrayList<class00753> u = (ObjectArrayList)class07536.N((Object)new ObjectArrayList(18), objectArrayList -> class07209.method_20437((class07209)new class07209(-1, -1, -1), (class07209)new class07209(1, 1, 1)).filter(class072092 -> (class072092.method_10263() == 0 || class072092.method_10264() == 0 || class072092.method_10260() == 0) && !class072092.equals((Object)class07209.field_10980)).map(class07209::method_10062).forEach(arg_0 -> ((ObjectArrayList)objectArrayList).add(arg_0)));
    public static final int N = 1;
    private class07209 i;
    int y;
    private int R;
    private int M;
    private @Nullable Set<class07211> B;
    private static final Codec<Set<class07211>> Z = class07211.field_29502.listOf().xmap(list -> Sets.newEnumSet((Iterable)list, class07211.class), Lists::newArrayList);
    public static final Codec<class04083> L = RecordCodecBuilder.create(instance -> instance.group((App)class07209.field_25064.fieldOf("pos").forGetter(class04083::N), (App)Codec.intRange((int)0, (int)1000).fieldOf("charge").orElse((Object)0).forGetter(class04083::y), (App)Codec.intRange((int)0, (int)1).fieldOf("decay_delay").orElse((Object)1).forGetter(class04083::L), (App)Codec.intRange((int)0, (int)Integer.MAX_VALUE).fieldOf("update_delay").orElse((Object)0).forGetter(class040832 -> class040832.R), (App)Z.lenientOptionalFieldOf("facings").forGetter(class040832 -> Optional.ofNullable(class040832.u()))).apply(instance, class04083::new));

    public int L() {
        return this.M;
    }

    private class04083(class07209 class072092, int n, int n2, int n3, Optional<Set<class07211>> optional) {
        this.i = class072092;
        this.y = n;
        this.M = n2;
        this.R = n3;
        this.B = optional.orElse(null);
    }

    public class04083(class07209 class072092, int n) {
        this(class072092, n, 1, 0, Optional.empty());
    }

    public @Nullable Set<class07211> u() {
        return this.B;
    }

    public int y() {
        return this.y;
    }

    public class07209 N() {
        return this.i;
    }

    private static boolean N(class07284 class072842, class07209 class072092, class07211 class072112) {
        class07209 class072093 = class072092.method_10093(class072112);
        return !class072842.method_8320(class072093).L((class07290)class072842, class072093, class072112.b());
    }

    private static List<class00753> N(class06069 class060692) {
        return class07536.N(u, (class06069)class060692);
    }

    private static class04065 N(class00500 class005002) {
        class00891 class008912 = class005002.i();
        return class008912 instanceof class04065 ? (class04065)class008912 : class04065.y_;
    }

    void N(class04083 class040832) {
        this.y += class040832.y;
        class040832.y = 0;
        this.R = Math.min(this.R, class040832.R);
    }

    public void N(class07284 class072842, class07209 class072092, class06069 class060692, class04076 class040762, boolean bl) {
        if (!this.N(class072842, class072092, class040762.R)) {
            return;
        }
        if (this.R > 0) {
            --this.R;
            return;
        }
        class00500 class005002 = class072842.method_8320(this.i);
        class04065 class040652 = class04083.N(class005002);
        if (bl && class040652.N(class072842, this.i, class005002, this.B, class040762.B())) {
            if (class040652.u()) {
                class005002 = class072842.method_8320(this.i);
                class040652 = class04083.N(class005002);
            }
            class072842.method_8396(null, this.i, class04909.dX, class04911.field_15245, 1.0f, 1.0f);
        }
        this.y = class040652.N(this, class072842, class072092, class060692, class040762, bl);
        if (this.y <= 0) {
            class040652.N(class072842, class005002, this.i, class060692);
            return;
        }
        class07209 class072093 = class04083.N(class072842, this.i, class060692);
        if (class072093 != null) {
            class040652.N(class072842, class005002, this.i, class060692);
            this.i = class072093.method_10062();
            if (class040762.B() && !this.i.method_19771(new class00753(class072092.method_10263(), this.i.method_10264(), class072092.method_10260()), 15.0)) {
                this.y = 0;
                return;
            }
            class005002 = class072842.method_8320(class072093);
        }
        if (class005002.i() instanceof class04065) {
            this.B = class05543.U((class00500)class005002);
        }
        this.M = class040652.f_(this.M);
        this.R = class040652.L();
    }

    private boolean N(class07284 class072842, class07209 class072092, boolean bl) {
        if (this.y <= 0) {
            return false;
        }
        if (bl) {
            return true;
        }
        if (class072842 instanceof class04782) {
            return ((class04782)class072842).method_41411(class072092);
        }
        return false;
    }

    boolean N(class07209 class072092) {
        return this.i.method_65076((class00753)class072092) > 1024;
    }

    private static @Nullable class07209 N(class07284 class072842, class07209 class072092, class06069 class060692) {
        class07218 class072182 = class072092.method_25503();
        class07218 class072183 = class072092.method_25503();
        for (class00753 class007532 : class04083.N(class060692)) {
            class072183.N((class00753)class072092, class007532);
            class00500 class005002 = class072842.method_8320((class07209)class072183);
            if (!(class005002.i() instanceof class04065) || !class04083.N(class072842, class072092, (class07209)class072183)) continue;
            class072182.N((class00753)class072183);
            if (!class04063.N(class072842, class005002, (class07209)class072183)) continue;
            break;
        }
        return class072182.equals((Object)class072092) ? null : class072182;
    }

    private static boolean N(class07284 class072842, class07209 class072092, class07209 class072093) {
        if (class072092.method_19455((class00753)class072093) == 1) {
            return true;
        }
        class07209 class072094 = class072093.method_10059((class00753)class072092);
        class07211 class072112 = class07211.N((class07185)class07185.field_11048, (class07212)(class072094.method_10263() < 0 ? class07212.field_11060 : class07212.field_11056));
        class07211 class072113 = class07211.N((class07185)class07185.field_11052, (class07212)(class072094.method_10264() < 0 ? class07212.field_11060 : class07212.field_11056));
        class07211 class072114 = class07211.N((class07185)class07185.field_11051, (class07212)(class072094.method_10260() < 0 ? class07212.field_11060 : class07212.field_11056));
        if (class072094.method_10263() == 0) {
            return class04083.N(class072842, class072092, class072113) || class04083.N(class072842, class072092, class072114);
        }
        if (class072094.method_10264() == 0) {
            return class04083.N(class072842, class072092, class072112) || class04083.N(class072842, class072092, class072114);
        }
        return class04083.N(class072842, class072092, class072112) || class04083.N(class072842, class072092, class072113);
    }
}

