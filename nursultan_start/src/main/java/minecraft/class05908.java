/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  minecraft.class01894
 *  minecraft.class02063
 *  minecraft.class03347
 *  minecraft.class04162
 *  minecraft.class04782
 *  minecraft.class05074
 *  minecraft.class06069
 *  minecraft.class06584
 *  minecraft.class07491
 *  minecraft.class08122
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.Consumer;
import minecraft.class01894;
import minecraft.class02063;
import minecraft.class03347;
import minecraft.class04162;
import minecraft.class04782;
import minecraft.class05074;
import minecraft.class05925;
import minecraft.class05957;
import minecraft.class06069;
import minecraft.class06584;
import minecraft.class07491;
import minecraft.class08122;
import org.jspecify.annotations.Nullable;

public class class05908 {
    private final class04162 N;
    private final class06069 y;
    private final class02063 L;
    private final Set<class05925<?>> u = Sets.newLinkedHashSet();

    public <T> @Nullable T L(class07491<T> class074912) {
        return (T)this.N.y().L(class074912);
    }

    public float L() {
        return this.N.L();
    }

    public void L(class05925<?> class059252) {
        this.u.remove(class059252);
    }

    class05908(class04162 class041622, class06069 class060692, class02063 class020632) {
        this.N = class041622;
        this.y = class060692;
        this.L = class020632;
    }

    public class04782 u() {
        return this.N.N();
    }

    public class06069 y() {
        return this.y;
    }

    public <T> T y(class07491<T> class074912) {
        return (T)this.N.y().y(class074912);
    }

    public boolean y(class05925<?> class059252) {
        return this.u.add(class059252);
    }

    public static class05925<class08122> N(class08122 class081222) {
        return new class05925<class08122>(class03347.y, class081222);
    }

    public static class05925<class05074> N(class05074 class050742) {
        return new class05925<class05074>(class03347.L, class050742);
    }

    public static class05925<class05957> N(class05957 class059572) {
        return new class05925<class05957>(class03347.N, class059572);
    }

    public boolean N(class05925<?> class059252) {
        return this.u.contains(class059252);
    }

    public class02063 N() {
        return this.L;
    }

    public void N(class01894 class018942, Consumer<class06584> consumer) {
        this.N.N(class018942, consumer);
    }

    public boolean N(class07491<?> class074912) {
        return this.N.y().N(class074912);
    }
}

