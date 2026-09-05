/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class03264
 *  minecraft.class04123
 *  minecraft.class04127
 *  minecraft.class05390
 *  minecraft.class05395
 *  minecraft.class05399
 *  minecraft.class05406
 *  minecraft.class05415
 *  minecraft.class08092
 *  minecraft.class08503
 *  minecraft.class08880
 */
package minecraft;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import minecraft.class00891;
import minecraft.class03264;
import minecraft.class04123;
import minecraft.class04127;
import minecraft.class05390;
import minecraft.class05395;
import minecraft.class05399;
import minecraft.class05406;
import minecraft.class05415;
import minecraft.class08092;
import minecraft.class08503;
import minecraft.class08880;

public class class05427
implements class05399 {
    private final class00891 N;
    private final List<class05406> y;
    private final Set<class08092<?>> L;

    class05427(class00891 class008912, List<class05406> list, Set<class08092<?>> set) {
        this.N = class008912;
        this.y = list;
        this.L = set;
    }

    public class04127 y() {
        HashMap<String, class08880> hashMap = new HashMap<String, class08880>();
        for (class05406 class054062 : this.y) {
            hashMap.put(class054062.N().N(), class054062.y().N());
        }
        return new class04127(Optional.of(new class04123(hashMap)), Optional.empty());
    }

    public static class05395 N(class00891 class008912) {
        return new class05395(class008912);
    }

    public static class05427 N(class00891 class008912, class03264 class032642) {
        return new class05427(class008912, List.of(new class05406(class05390.N, class032642)), Set.of());
    }

    static Set<class08092<?>> N(Set<class08092<?>> set, class00891 class008912, class05415<?> class054152) {
        List var3 = class054152.y();
        var3.forEach(class080922 -> {
            if (class008912.E().N(class080922.R()) != class080922) {
                throw new IllegalStateException("Property " + String.valueOf(class080922) + " is not defined for block " + String.valueOf(class008912));
            }
            if (set.contains(class080922)) {
                throw new IllegalStateException("Values of property " + String.valueOf(class080922) + " already defined for block " + String.valueOf(class008912));
            }
        });
        HashSet hashSet = new HashSet(set);
        hashSet.addAll(var3);
        return hashSet;
    }

    public class05427 N(class05415<class08503> class054152) {
        Set<class08092<?>> var2 = class05427.N(this.L, this.N, class054152);
        List list = this.y.stream().flatMap(class054062 -> class054062.N(class054152)).toList();
        return new class05427(this.N, list, var2);
    }

    public class05427 N(class08503 class085032) {
        List list = this.y.stream().flatMap(class054062 -> class054062.N(class085032)).toList();
        return new class05427(this.N, list, this.L);
    }

    public class00891 N() {
        return this.N;
    }
}

