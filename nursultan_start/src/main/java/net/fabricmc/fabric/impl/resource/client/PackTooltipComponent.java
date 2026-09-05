/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04830
 *  minecraft.class06357
 *  minecraft.class06541
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.resource.client;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04830;
import minecraft.class06357;
import minecraft.class06541;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public record PackTooltipComponent(Optional<class00392> name, Optional<List<class01028>> description) implements class04830,
class06357
{
    public void method_32665(class01054 class010542, class01590 class015902, int n, int n2) {
        if (this.name.isPresent()) {
            class010542.N(class015902, this.name.get(), n, n2, -1, true);
            Objects.requireNonNull(class015902);
            n2 += 9 + 1;
            if (this.description.isPresent()) {
                Objects.requireNonNull(class015902);
                n2 += 9;
            }
        }
        if (this.description.isPresent()) {
            for (class01028 class010282 : this.description.get()) {
                class010542.N(class015902, class010282, n, n2, -1, true);
                Objects.requireNonNull(class015902);
                n2 += 9 + 1;
            }
        }
    }

    public void method_32666(class01590 class015902, int n, int n2, int n3, int n4, class01054 class010542) {
        if (this.name.isPresent() && this.description.isPresent()) {
            Objects.requireNonNull(class015902);
            int n5 = n + this.method_32664(class015902);
            Objects.requireNonNull(class015902);
            class010542.N(n, n2 + 9 + 4, n5, n2 + 9 + 5, 0xFF000000 | class06541.field_1080.i());
        }
    }

    public int method_32664(class01590 class015902) {
        return Math.max(this.name.map(arg_0 -> ((class01590)class015902).N(arg_0)).orElse(0), this.description.map(list -> list.stream().mapToInt(arg_0 -> ((class01590)class015902).N(arg_0)).max().orElse(0)).orElse(0));
    }

    public int method_32661(class01590 class015902) {
        int n = 0;
        if (this.name.isPresent()) {
            Objects.requireNonNull(class015902);
            n += 9 + 2;
        }
        if (this.description.isPresent()) {
            int n2 = this.description.get().size();
            Objects.requireNonNull(class015902);
            n += n2 * 9 + 3;
        }
        if (this.name.isPresent() && this.description.isPresent()) {
            Objects.requireNonNull(class015902);
            n += 9;
        }
        return n;
    }
}

