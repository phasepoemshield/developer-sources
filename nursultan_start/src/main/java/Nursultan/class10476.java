/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class03556
 *  minecraft.class03927
 *  minecraft.class04782
 *  minecraft.class04882
 *  minecraft.class05368
 *  minecraft.class05372
 *  minecraft.class05475
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07430
 *  minecraft.class07473
 *  minecraft.class07475
 *  net.caffeinemc.mods.lithium.common.util.POIRegistryEntries
 *  net.caffeinemc.mods.lithium.common.world.interests.iterator.SinglePointOfInterestTypeFilter
 */
package Nursultan;

import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class03556;
import minecraft.class03927;
import minecraft.class04782;
import minecraft.class04882;
import minecraft.class05368;
import minecraft.class05372;
import minecraft.class05475;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07430;
import minecraft.class07473;
import minecraft.class07475;
import net.caffeinemc.mods.lithium.common.util.POIRegistryEntries;
import net.caffeinemc.mods.lithium.common.world.interests.iterator.SinglePointOfInterestTypeFilter;

public class class10476
extends class07473 {
    private final class04882 N;
    private final double y;
    private class07209 L;
    private final List<class07209> u = Lists.newArrayList();
    private final int i;
    private boolean R;

    public void L() {
        super.L();
        this.N.method_16826(0);
        this.N.f().N((double)this.L.method_10263(), (double)this.L.method_10264(), (double)this.L.method_10260(), this.y);
        this.R = false;
    }

    private boolean M() {
        return this.N.NQ() && !this.N.K().N();
    }

    public class10476(class04882 class048822, double d, int n) {
        this.N = class048822;
        this.y = d;
        this.i = n;
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    private boolean Z() {
        class04782 class047822 = (class04782)this.N.method_73183();
        class07209 class072092 = this.N.method_24515();
        class06069 class060692 = class04882.i((class04882)this.N);
        int n = 48;
        class07209 class072093 = class072092;
        class05372 class053722 = class05372.field_18489;
        Predicate<class07209> predicate = this::N;
        Predicate<class03556> predicate2 = class035562 -> class035562.N(class03927.m);
        class05368 class053682 = class047822.method_19494();
        Optional optional = this.N(class053682, predicate2, predicate, class053722, class072093, n, class060692);
        if (optional.isEmpty()) {
            return false;
        }
        this.L = ((class07209)optional.get()).method_10062();
        return true;
    }

    public void i() {
        if (this.N.f().U()) {
            class06889 class068892 = class06889.L((class00753)this.L);
            class06889 class068893 = class05475.N((class07475)this.N, (int)16, (int)7, (class06889)class068892, (double)0.3141592741012573);
            if (class068893 == null) {
                class068893 = class05475.N((class07475)this.N, (int)8, (int)7, (class06889)class068892, (double)1.5707963705062866);
            }
            if (class068893 == null) {
                this.R = true;
                return;
            }
            this.N.f().N(class068893.M, class068893.B, class068893.Z, this.y);
        }
    }

    private void U() {
        if (this.u.size() > 2) {
            this.u.remove(0);
        }
    }

    public void u() {
        if (this.L.method_19769((class00737)this.N.method_73189(), (double)this.i)) {
            this.u.add(this.L);
        }
    }

    public boolean y() {
        if (this.N.f().U()) {
            return false;
        }
        return this.N.T() == null && !this.L.method_19769((class00737)this.N.method_73189(), (double)(this.N.method_17681() + (float)this.i)) && !this.R;
    }

    private Optional N(class05368 class053682, Predicate predicate, Predicate predicate2, class05372 class053722, class07209 class072092, int n, class06069 class060692) {
        return class053682.N((Predicate)new SinglePointOfInterestTypeFilter(POIRegistryEntries.HOME_ENTRY), predicate2, class053722, class072092, n, class060692);
    }

    private boolean N(class07209 class072092) {
        for (class07209 class072093 : this.u) {
            if (!Objects.equals(class072092, class072093)) continue;
            return false;
        }
        return true;
    }

    public boolean N() {
        this.U();
        return this.M() && this.Z() && this.N.T() == null;
    }
}

