/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10014
 *  Nursultan.class11647
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02833
 *  minecraft.class02834
 *  minecraft.class03274
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04891
 *  minecraft.class05298
 *  minecraft.class05946
 *  minecraft.class06581
 *  minecraft.class07085
 *  minecraft.class07463
 *  minecraft.class07471
 */
package minecraft;

import Nursultan.class10014;
import Nursultan.class11647;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class01894;
import minecraft.class02833;
import minecraft.class02834;
import minecraft.class03274;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04891;
import minecraft.class05298;
import minecraft.class05946;
import minecraft.class06581;
import minecraft.class07085;
import minecraft.class07463;
import minecraft.class07471;

public final class class06932
extends Record {
    private final int durability;
    private final Map<class03274, Integer> defense;
    private final int enchantmentValue;
    private final class03556<class04891> equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final class03530<class06581> repairIngredient;
    private final class05946<class11647> assetId;

    public int L() {
        return this.enchantmentValue;
    }

    public class03530<class06581> M() {
        return this.repairIngredient;
    }

    public class06932(int n, Map<class03274, Integer> map, int n2, class03556<class04891> class035562, float f, float f2, class03530<class06581> class035302, class05946<class11647> class059462) {
        this.durability = n;
        this.defense = map;
        this.enchantmentValue = n2;
        this.equipSound = class035562;
        this.toughness = f;
        this.knockbackResistance = f2;
        this.repairIngredient = class035302;
        this.assetId = class059462;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06932.class, "durability;defense;enchantmentValue;equipSound;toughness;knockbackResistance;repairIngredient;assetId", "durability", "defense", "enchantmentValue", "equipSound", "toughness", "knockbackResistance", "repairIngredient", "assetId"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06932.class, "durability;defense;enchantmentValue;equipSound;toughness;knockbackResistance;repairIngredient;assetId", "durability", "defense", "enchantmentValue", "equipSound", "toughness", "knockbackResistance", "repairIngredient", "assetId"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06932.class, "durability;defense;enchantmentValue;equipSound;toughness;knockbackResistance;repairIngredient;assetId", "durability", "defense", "enchantmentValue", "equipSound", "toughness", "knockbackResistance", "repairIngredient", "assetId"}, this);
    }

    public class05946<class11647> B() {
        return this.assetId;
    }

    public float i() {
        return this.toughness;
    }

    public class03556<class04891> u() {
        return this.equipSound;
    }

    public Map<class03274, Integer> y() {
        return this.defense;
    }

    public class02833 N(class03274 class032742) {
        int n = this.defense.getOrDefault(class032742, 0);
        class10014 class100142 = class02833.N();
        class02834 class028342 = class02834.N((class07085)class032742.N());
        class01894 class018942 = class01894.y((String)("armor." + class032742.y()));
        class100142.N(class05298.y, new class07471(class018942, (double)n, class07463.field_6328), class028342);
        class100142.N(class05298.L, new class07471(class018942, (double)this.toughness, class07463.field_6328), class028342);
        if (this.knockbackResistance > 0.0f) {
            class100142.N(class05298.b, new class07471(class018942, (double)this.knockbackResistance, class07463.field_6328), class028342);
        }
        return class100142.N();
    }

    public int N() {
        return this.durability;
    }

    public float R() {
        return this.knockbackResistance;
    }
}

