/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06510
 *  minecraft.class06581
 *  minecraft.class06584
 */
package minecraft;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06510;
import minecraft.class06581;
import minecraft.class06584;

public class class00263 {
    public static final class05946<? extends class00751<class00263>> N = class05946.N((class01894)class01894.y((String)"recipe_property_set"));
    public static final class05946<class00263> y = class00263.N("smithing_base");
    public static final class05946<class00263> L = class00263.N("smithing_template");
    public static final class05946<class00263> u = class00263.N("smithing_addition");
    public static final class05946<class00263> i = class00263.N("furnace_input");
    public static final class05946<class00263> R = class00263.N("blast_furnace_input");
    public static final class05946<class00263> M = class00263.N("smoker_input");
    public static final class05946<class00263> B = class00263.N("campfire_input");
    public static final class02362<class04247, class00263> Z = class06581.i.N_33(class02389.N()).N_10(list -> new class00263(Set.copyOf(list)), class002632 -> List.copyOf(class002632.U));
    public static final class00263 z = new class00263(Set.of());
    private final Set<class03556<class06581>> U;

    private class00263(Set<class03556<class06581>> set) {
        this.U = set;
    }

    static class00263 N(Collection<class06510> collection) {
        Set<class03556<class06581>> set = collection.stream().flatMap(class06510::method_8105).collect(Collectors.toUnmodifiableSet());
        return new class00263(set);
    }

    private static class05946<class00263> N(String string) {
        return class05946.N(N, (class01894)class01894.y((String)string));
    }

    public boolean N(class06584 class065842) {
        return this.U.contains(class065842.Z());
    }
}

