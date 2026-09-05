/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10644
 *  Nursultan.class10662
 *  minecraft.class00394
 *  minecraft.class04803
 *  minecraft.class05266
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06843
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08978
 *  net.caffeinemc.mods.lithium.api.inventory.LithiumCooldownReceivingInventory
 *  net.caffeinemc.mods.lithium.api.inventory.LithiumTransferConditionInventory
 *  net.caffeinemc.mods.lithium.mixin.block.hopper.ContainerMixin
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10644;
import Nursultan.class10662;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00394;
import minecraft.class04803;
import minecraft.class05266;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06843;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08978;
import net.caffeinemc.mods.lithium.api.inventory.LithiumCooldownReceivingInventory;
import net.caffeinemc.mods.lithium.api.inventory.LithiumTransferConditionInventory;
import net.caffeinemc.mods.lithium.mixin.block.hopper.ContainerMixin;
import org.jspecify.annotations.Nullable;

public interface class06695
extends class05266,
class06843,
Iterable<class06584>,
LithiumCooldownReceivingInventory,
LithiumTransferConditionInventory,
ContainerMixin {
    public static final float c_ = 4.0f;

    default public @Nullable class04803 method_32318(int n) {
        if (n < 0 || n >= this.method_5439()) {
            return null;
        }
        return new class10662(this, n);
    }

    @Override
    default public Iterator<class06584> iterator() {
        return new class10644(this);
    }

    default public boolean N_13(Set<class06581> set) {
        return this.N_60(class065842 -> !class065842.R() && set.contains(class065842.B()));
    }

    default public boolean N_60(Predicate<class06584> predicate) {
        for (class06584 class065842 : this) {
            if (!predicate.test(class065842)) continue;
            return true;
        }
        return false;
    }

    default public int N_61(class06581 class065812) {
        int n = 0;
        for (class06584 class065842 : this) {
            if (!class065842.B().equals(class065812)) continue;
            n += class065842.c();
        }
        return n;
    }

    default public boolean N(class06695 class066952, int n, class06584 class065842) {
        return true;
    }

    public static boolean N(class00394 class003942, class08036 class080362, float f) {
        class07299 class072992 = class003942.G();
        class07209 class072092 = class003942.d();
        if (class072992 == null) {
            return false;
        }
        if (class072992.method_8321(class072092) != class003942) {
            return false;
        }
        return class080362.method_56093(class072092, (double)f);
    }

    public static boolean N(class00394 class003942, class08036 class080362) {
        return class06695.N(class003942, class080362, 4.0f);
    }

    public boolean method_5443(class08036 var1);

    default public void method_5432(class08978 class089782) {
    }

    default public void method_5435(class08978 class089782) {
    }

    default public boolean method_5437(int n, class06584 class065842) {
        return true;
    }

    default public int method_5444() {
        return 99;
    }

    public void method_5447(int var1, class06584 var2);

    public void method_5431();

    public class06584 method_5434(int var1, int var2);

    public class06584 method_5441(int var1);

    public boolean method_5442();

    default public List<class08978> j_() {
        return List.of();
    }

    default public int a_(class06584 class065842) {
        return Math.min(this.method_5444(), class065842.U());
    }

    public class06584 method_5438(int var1);

    public int method_5439();
}

