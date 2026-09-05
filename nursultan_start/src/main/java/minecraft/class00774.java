/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00576
 *  minecraft.class00587
 *  minecraft.class00607
 *  minecraft.class00619
 *  minecraft.class01002
 *  minecraft.class01029
 *  minecraft.class05987
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00576;
import minecraft.class00587;
import minecraft.class00607;
import minecraft.class00619;
import minecraft.class00777;
import minecraft.class00780;
import minecraft.class00785;
import minecraft.class01002;
import minecraft.class01029;
import minecraft.class05987;
import org.jspecify.annotations.Nullable;

public class class00774 {
    private boolean N = true;
    private @Nullable Float y;
    private class00785 L = class00785.field_26407;
    private @Nullable Float u;
    private final class00576 i = class00587.N();
    private @Nullable class05987 R;
    private @Nullable class01002 M;
    private @Nullable class01029 B;

    public String toString() {
        return "BiomeBuilder{\nhasPrecipitation=" + this.N + ",\ntemperature=" + this.y + ",\ntemperatureModifier=" + String.valueOf((Object)this.L) + ",\ndownfall=" + this.u + ",\nspecialEffects=" + String.valueOf(this.R) + ",\nmobSpawnSettings=" + String.valueOf(this.M) + ",\ngenerationSettings=" + String.valueOf(this.B) + ",\n}";
    }

    public class00774 y(float f) {
        this.u = Float.valueOf(f);
        return this;
    }

    public class00774 N(class01029 class010292) {
        this.B = class010292;
        return this;
    }

    public class00774 N(class01002 class010022) {
        this.M = class010022;
        return this;
    }

    public class00774 N(class05987 class059872) {
        this.R = class059872;
        return this;
    }

    public class00774 N(class00785 class007852) {
        this.L = class007852;
        return this;
    }

    public class00780 N() {
        if (this.y == null || this.u == null || this.R == null || this.M == null || this.B == null) {
            throw new IllegalStateException("You are missing parameters to build a proper biome\n" + String.valueOf(this));
        }
        return new class00780(new class00777(this.N, this.y.floatValue(), this.L, this.u.floatValue()), this.i.N(), this.R, this.B, this.M);
    }

    public <Value, Parameter> class00774 N(class00607<Value> class006072, class00619<Value, Parameter> class006192, Parameter Parameter) {
        this.i.N(class006072, class006192, Parameter);
        return this;
    }

    public class00774 N(float f) {
        this.y = Float.valueOf(f);
        return this;
    }

    public class00774 N(class00587 class005872) {
        this.i.N(class005872);
        return this;
    }

    public class00774 N(class00576 class005762) {
        return this.N(class005762.N());
    }

    public <Value> class00774 N(class00607<Value> class006072, Value Value) {
        this.i.N(class006072, Value);
        return this;
    }

    public class00774 N(boolean bl) {
        this.N = bl;
        return this;
    }
}

