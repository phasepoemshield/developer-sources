/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00263
 *  minecraft.class00279
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class05946
 *  minecraft.class06156
 *  minecraft.class07280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.Map;
import minecraft.class00263;
import minecraft.class00279;
import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class05946;
import minecraft.class06156;
import minecraft.class07280;

public final class class08069
extends Record
implements class00381<class07280> {
    private final Map<class05946<class00263>, class00263> itemSets;
    private final class00279<class06156> stonecutterRecipes;
    public static final class02362<class04247, class08069> N = class02362.N((class02362)class02389.N(HashMap::new, (class02362)class05946.y((class05946)class00263.N), (class02362)class00263.Z), class08069::N, (class02362)class00279.y(), class08069::y, class08069::new);

    public class08069(Map<class05946<class00263>, class00263> map, class00279<class06156> class002792) {
        this.itemSets = map;
        this.stonecutterRecipes = class002792;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08069.class, "itemSets;stonecutterRecipes", "itemSets", "stonecutterRecipes"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08069.class, "itemSets;stonecutterRecipes", "itemSets", "stonecutterRecipes"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08069.class, "itemSets;stonecutterRecipes", "itemSets", "stonecutterRecipes"}, this);
    }

    public class00279<class06156> y() {
        return this.stonecutterRecipes;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public Map<class05946<class00263>, class00263> N() {
        return this.itemSets;
    }

    public class02897<class08069> method_65080() {
        return class04248.ym;
    }
}

