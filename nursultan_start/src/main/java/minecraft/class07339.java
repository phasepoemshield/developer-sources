/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class03711
 *  minecraft.class04248
 *  minecraft.class07349
 *  minecraft.class08051
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class03711;
import minecraft.class04248;
import minecraft.class07349;
import minecraft.class08051;
import org.jspecify.annotations.Nullable;

public class class07339
implements class00381<class08051> {
    public static final class02362<class00667, class07339> N = class00381.N(class07339::N, class07339::new);
    private final class07349 y;
    private final @Nullable class01894 L;

    public @Nullable class01894 L() {
        return this.L;
    }

    private class07339(class00667 class006672) {
        this.y = (class07349)class006672.y(class07349.class);
        this.L = this.y == class07349.field_13024 ? class006672.T() : null;
    }

    public class07339(class07349 class073492, @Nullable class01894 class018942) {
        this.y = class073492;
        this.L = class018942;
    }

    public class07349 y() {
        return this.y;
    }

    public static class07339 N(class03711 class037112) {
        return new class07339(class07349.field_13024, class037112.N());
    }

    private void N(class00667 class006672) {
        class006672.N((Enum)this.y);
        if (this.y == class07349.field_13024) {
            class006672.N(this.L);
        }
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12058(this);
    }

    public static class07339 N() {
        return new class07339(class07349.field_13023, null);
    }

    public class02897<class07339> method_65080() {
        return class04248.LM;
    }
}

