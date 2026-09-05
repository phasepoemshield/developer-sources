/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class05300
 *  minecraft.class07468
 *  minecraft.class07469
 *  minecraft.class07471
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Map;
import java.util.function.Consumer;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class05300;
import minecraft.class07468;
import minecraft.class07469;
import minecraft.class07471;
import org.jspecify.annotations.Nullable;

public class class05308 {
    private final Map<class03556<class07468>, class07469> N;

    public boolean L(class03556<class07468> class035562) {
        return this.N.containsKey(class035562);
    }

    class05308(Map<class03556<class07468>, class07469> map) {
        this.N = map;
    }

    private class07469 u(class03556<class07468> class035562) {
        class07469 class074692 = this.N.get(class035562);
        if (class074692 == null) {
            throw new IllegalArgumentException("Can't find attribute " + class035562.M());
        }
        return class074692;
    }

    public boolean y(class03556<class07468> class035562, class01894 class018942) {
        class07469 class074692 = this.N.get(class035562);
        return class074692 != null && class074692.N(class018942) != null;
    }

    public double y(class03556<class07468> class035562) {
        return this.u(class035562).y();
    }

    public double N(class03556<class07468> class035562, class01894 class018942) {
        class07471 class074712 = this.u(class035562).N(class018942);
        if (class074712 == null) {
            throw new IllegalArgumentException("Can't find modifier " + String.valueOf(class018942) + " on attribute " + class035562.M());
        }
        return class074712.y();
    }

    public double N(class03556<class07468> class035562) {
        return this.u(class035562).M();
    }

    public static class05300 N() {
        return new class05300();
    }

    public @Nullable class07469 N(Consumer<class07469> consumer, class03556<class07468> class035562) {
        class07469 class074692 = this.N.get(class035562);
        if (class074692 == null) {
            return null;
        }
        class07469 class074693 = new class07469(class035562, consumer);
        class074693.N(class074692);
        return class074693;
    }
}

