/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;

public final class class01883
extends Record {
    private final class01894 enabled;
    private final class01894 disabled;
    private final class01894 enabledFocused;
    private final class01894 disabledFocused;

    public class01894 L() {
        return this.enabledFocused;
    }

    public class01883(class01894 class018942, class01894 class018943, class01894 class018944, class01894 class018945) {
        this.enabled = class018942;
        this.disabled = class018943;
        this.enabledFocused = class018944;
        this.disabledFocused = class018945;
    }

    public class01883(class01894 class018942, class01894 class018943, class01894 class018944) {
        this(class018942, class018943, class018944, class018943);
    }

    public class01883(class01894 class018942, class01894 class018943) {
        this(class018942, class018942, class018943, class018943);
    }

    public class01883(class01894 class018942) {
        this(class018942, class018942, class018942, class018942);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01883.class, "enabled;disabled;enabledFocused;disabledFocused", "enabled", "disabled", "enabledFocused", "disabledFocused"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01883.class, "enabled;disabled;enabledFocused;disabledFocused", "enabled", "disabled", "enabledFocused", "disabledFocused"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01883.class, "enabled;disabled;enabledFocused;disabledFocused", "enabled", "disabled", "enabledFocused", "disabledFocused"}, this);
    }

    public class01894 u() {
        return this.disabledFocused;
    }

    public class01894 y() {
        return this.disabled;
    }

    public class01894 N(boolean bl, boolean bl2) {
        if (bl) {
            return bl2 ? this.enabledFocused : this.enabled;
        }
        return bl2 ? this.disabledFocused : this.disabled;
    }

    public class01894 N() {
        return this.enabled;
    }
}

