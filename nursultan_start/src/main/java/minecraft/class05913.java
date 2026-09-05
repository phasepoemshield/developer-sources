/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01391
 *  minecraft.class01407
 *  minecraft.class01894
 *  minecraft.class02862
 *  minecraft.class07311
 *  minecraft.class08097
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import minecraft.class01391;
import minecraft.class01407;
import minecraft.class01894;
import minecraft.class02862;
import minecraft.class07311;
import minecraft.class08097;
import org.jspecify.annotations.Nullable;

public class class05913 {
    public static final Comparator<class05913> N = Comparator.comparing(class05913::N).thenComparing(class05913::y);
    private final class01894 y;
    private final class01894 L;
    private @Nullable class07311 u;

    public class05913(class01894 class018942, class01894 class018943) {
        this.y = class018942;
        this.L = class018943;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        class05913 class059132 = (class05913)object;
        return this.y.equals((Object)class059132.y) && this.L.equals((Object)class059132.L);
    }

    public String toString() {
        return "Material{atlasLocation=" + String.valueOf(this.y) + ", texture=" + String.valueOf(this.L) + "}";
    }

    public int hashCode() {
        return Objects.hash(this.y, this.L);
    }

    public class01894 y() {
        return this.L;
    }

    public class01391 N(class08097 class080972, class01407 class014072, Function<class01894, class07311> function, boolean bl, boolean bl2) {
        return class080972.N(this).method_24108(class02862.N((class01407)class014072, (class07311)this.N(function), (boolean)bl, (boolean)bl2));
    }

    public class07311 N(Function<class01894, class07311> function) {
        if (this.u == null) {
            this.u = function.apply(this.y);
        }
        return this.u;
    }

    public class01391 N(class08097 class080972, class01407 class014072, Function<class01894, class07311> function) {
        return class080972.N(this).method_24108(class014072.method_73477(this.N(function)));
    }

    public class01894 N() {
        return this.y;
    }
}

