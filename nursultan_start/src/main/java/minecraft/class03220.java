/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00891
 *  minecraft.class01042
 *  minecraft.class01392
 *  minecraft.class01929
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03543
 *  minecraft.class04247
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class06338
 *  minecraft.class06541
 *  minecraft.class06646
 *  minecraft.class07001
 *  minecraft.class08303
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00891;
import minecraft.class01042;
import minecraft.class01392;
import minecraft.class01929;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03543;
import minecraft.class04247;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class06338;
import minecraft.class06541;
import minecraft.class06646;
import minecraft.class07001;
import minecraft.class08303;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03220 {
    private static final Logger i = LogUtils.getLogger();
    public static final Codec<class03220> N = class06338.L((Codec)class01392.N, (Codec)class06338.y((Codec)class01392.N.listOf())).xmap(class03220::new, $$0 -> $$0.M);
    public static final class02362<class04247, class03220> y = class02362.N((class02362)class01392.y.N_33(class02389.N()), (T $$0) -> $$0.M, class03220::new);
    public static final class00392 L = class00392.L((String)"item.canBreak").N(class06541.field_1080);
    public static final class00392 u = class00392.L((String)"item.canPlace").N(class06541.field_1080);
    private static final class00392 R = class00392.L((String)"item.canUse.unknown").N(class06541.field_1080);
    private final List<class01392> M;
    private @Nullable List<class00392> B;
    private @Nullable class06646 Z;
    private boolean z;
    private boolean U;

    public class03220(List<class01392> list) {
        this.M = list;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof class03220) {
            class03220 class032202 = (class03220)object;
            return this.M.equals(class032202.M);
        }
        return false;
    }

    public String toString() {
        return "AdventureModePredicate{predicates=" + String.valueOf(this.M) + "}";
    }

    public int hashCode() {
        return this.M.hashCode();
    }

    private static /* synthetic */ List y(class03220 class032202) {
        return class032202.M;
    }

    private static /* synthetic */ List N(class03220 class032202) {
        return class032202.M;
    }

    private static class07001 N(class00394 class003942, class01042 class010422, class04490 class044902) {
        class08303 class083032 = class08303.N((class04490)class044902.N_46(class003942.J()), (class01929)class010422);
        class003942.u((class08329)class083032);
        return class083032.y();
    }

    public void N(Consumer<class00392> consumer) {
        this.N().forEach(consumer);
    }

    private static List<class00392> N(List<class01392> list) {
        Iterator<class01392> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().y().isEmpty()) continue;
            return List.of(R);
        }
        return list.stream().flatMap(class013922 -> ((class03543)class013922.y().orElseThrow()).N()).distinct().map(class035562 -> ((class00891)class035562.N()).M().N(class06541.field_1063)).toList();
    }

    private static boolean N(class06646 class066462, @Nullable class06646 class066463, boolean bl) {
        if (class066463 == null || class066462.N() != class066463.N()) {
            return false;
        }
        if (!bl) {
            return true;
        }
        if (class066462.y() == null && class066463.y() == null) {
            return true;
        }
        if (class066462.y() == null || class066463.y() == null) {
            return false;
        }
        try (class04495 class044952 = new class04495(i);){
            class01042 class010422 = class066462.L().method_30349();
            class07001 class070012 = class03220.N(class066462.y(), class010422, (class04490)class044952);
            class07001 class070013 = class03220.N(class066463.y(), class010422, (class04490)class044952);
            boolean bl2 = Objects.equals(class070012, class070013);
            return bl2;
        }
    }

    private List<class00392> N() {
        if (this.B == null) {
            this.B = class03220.N(this.M);
        }
        return this.B;
    }

    public boolean N(class06646 class066462) {
        if (class03220.N(class066462, this.Z, this.U)) {
            return this.z;
        }
        this.Z = class066462;
        this.U = false;
        for (class01392 class013922 : this.M) {
            if (!class013922.N(class066462)) continue;
            this.U |= class013922.N();
            this.z = true;
            return true;
        }
        this.z = false;
        return false;
    }
}

