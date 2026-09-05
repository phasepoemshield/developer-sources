/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02028
 *  minecraft.class03662
 *  minecraft.class03702
 *  minecraft.class08388
 *  minecraft.class08838
 *  minecraft.class08931
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02028;
import minecraft.class03662;
import minecraft.class03702;
import minecraft.class08388;
import minecraft.class08529;
import minecraft.class08838;
import minecraft.class08931;

public final class class08517
extends Record {
    private final boolean usesBlockLight;
    private final class08388 particleIcon;
    private final class03702 transforms;

    public class03702 L() {
        return this.transforms;
    }

    public class08517(boolean bl, class08388 class083882, class03702 class037022) {
        this.usesBlockLight = bl;
        this.particleIcon = class083882;
        this.transforms = class037022;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08517.class, "usesBlockLight;particleIcon;transforms", "usesBlockLight", "particleIcon", "transforms"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08517.class, "usesBlockLight;particleIcon;transforms", "usesBlockLight", "particleIcon", "transforms"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08517.class, "usesBlockLight;particleIcon;transforms", "usesBlockLight", "particleIcon", "transforms"}, this);
    }

    public class08388 y() {
        return this.particleIcon;
    }

    public void N(class08931 class089312, class03662 class036622) {
        class089312.N(this.usesBlockLight);
        class089312.N(this.particleIcon);
        class089312.N(this.transforms.N(class036622));
    }

    public static class08517 N(class02028 class020282, class08529 class085292, class08838 class088382) {
        class08388 class083882 = class085292.N(class088382, class020282);
        return new class08517(class085292.i().N(), class083882, class085292.R());
    }

    public boolean N() {
        return this.usesBlockLight;
    }
}

