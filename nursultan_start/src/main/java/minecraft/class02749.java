/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01226
 *  minecraft.class02055
 *  minecraft.class02191
 *  minecraft.class02197
 *  minecraft.class02484
 *  minecraft.class02833
 *  minecraft.class02834
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class05298
 *  minecraft.class06573
 *  minecraft.class06581
 *  minecraft.class07463
 *  minecraft.class07471
 *  minecraft.class08609
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00751;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01226;
import minecraft.class02055;
import minecraft.class02191;
import minecraft.class02197;
import minecraft.class02484;
import minecraft.class02833;
import minecraft.class02834;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class05298;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class07463;
import minecraft.class07471;
import minecraft.class08609;

public final class class02749
extends Record {
    private final class03530<class00891> incorrectBlocksForDrops;
    private final int durability;
    private final float speed;
    private final float attackDamageBonus;
    private final int enchantmentValue;
    private final class03530<class06581> repairItems;
    public static final class02749 N = new class02749((class03530<class00891>)class01210.LL, 59, 2.0f, 0.0f, 15, (class03530<class06581>)class01226.yt);
    public static final class02749 y = new class02749((class03530<class00891>)class01210.LN, 131, 4.0f, 1.0f, 5, (class03530<class06581>)class01226.yG);
    public static final class02749 L = new class02749((class03530<class00891>)class01210.yr, 190, 5.0f, 1.0f, 13, (class03530<class06581>)class01226.yl);
    public static final class02749 u = new class02749((class03530<class00891>)class01210.yh, 250, 6.0f, 2.0f, 14, (class03530<class06581>)class01226.yd);
    public static final class02749 i = new class02749((class03530<class00891>)class01210.yD, 1561, 8.0f, 3.0f, 10, (class03530<class06581>)class01226.yk);
    public static final class02749 R = new class02749((class03530<class00891>)class01210.Ly, 32, 12.0f, 0.0f, 22, (class03530<class06581>)class01226.yw);
    public static final class02749 M = new class02749((class03530<class00891>)class01210.yx, 2031, 9.0f, 4.0f, 15, (class03530<class06581>)class01226.yY);

    public float L() {
        return this.speed;
    }

    public class02749(class03530<class00891> class035302, int n, float f, float f2, int n2, class03530<class06581> class035303) {
        this.incorrectBlocksForDrops = class035302;
        this.durability = n;
        this.speed = f;
        this.attackDamageBonus = f2;
        this.enchantmentValue = n2;
        this.repairItems = class035303;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02749.class, "incorrectBlocksForDrops;durability;speed;attackDamageBonus;enchantmentValue;repairItems", "incorrectBlocksForDrops", "durability", "speed", "attackDamageBonus", "enchantmentValue", "repairItems"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02749.class, "incorrectBlocksForDrops;durability;speed;attackDamageBonus;enchantmentValue;repairItems", "incorrectBlocksForDrops", "durability", "speed", "attackDamageBonus", "enchantmentValue", "repairItems"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02749.class, "incorrectBlocksForDrops;durability;speed;attackDamageBonus;enchantmentValue;repairItems", "incorrectBlocksForDrops", "durability", "speed", "attackDamageBonus", "enchantmentValue", "repairItems"}, this);
    }

    public int i() {
        return this.enchantmentValue;
    }

    public float u() {
        return this.attackDamageBonus;
    }

    public int y() {
        return this.durability;
    }

    private class02833 y(float f, float f2) {
        return class02833.N().N(class05298.u, new class07471(class06581.M, (double)(f + this.attackDamageBonus), class07463.field_6328), class02834.field_49217).N(class05298.R, new class07471(class06581.B, (double)f2, class07463.field_6328), class02834.field_49217).N();
    }

    private class02833 N(float f, float f2) {
        return class02833.N().N(class05298.u, new class07471(class06581.M, (double)(f + this.attackDamageBonus), class07463.field_6328), class02834.field_49217).N(class05298.R, new class07471(class06581.B, (double)f2, class07463.field_6328), class02834.field_49217).N();
    }

    private class06573 N(class06573 class065732) {
        return class065732.y(this.durability).N(this.repairItems).L(this.enchantmentValue);
    }

    public class06573 N(class06573 class065732, float f, float f2) {
        class02055 class020552 = class04206.N((class00751)class04206.i);
        return this.N(class065732).N(class02484.O, (Object)new class02197(List.of(class02191.N((class03543)class03543.N((class03556[])new class03556[]{class00869.yw.s()}), (float)15.0f), class02191.y((class03543)class020552.y(class01210.yA), (float)Float.MAX_VALUE), class02191.y((class03543)class020552.y(class01210.yF), (float)1.5f)), 1.0f, 2, false)).N(this.y(f, f2)).N(class02484.g, (Object)new class08609(1));
    }

    public class06573 N(class06573 class065732, class03530<class00891> class035302, float f, float f2, float f3) {
        class02055 class020552 = class04206.N((class00751)class04206.i);
        return this.N(class065732).N(class02484.O, (Object)new class02197(List.of(class02191.N((class03543)class020552.y(this.incorrectBlocksForDrops)), class02191.N((class03543)class020552.y(class035302), (float)this.speed)), 1.0f, 1, true)).N(this.N(f, f2)).N(class02484.g, (Object)new class08609(2, f3));
    }

    public class03530<class00891> N() {
        return this.incorrectBlocksForDrops;
    }

    public class03530<class06581> R() {
        return this.repairItems;
    }
}

