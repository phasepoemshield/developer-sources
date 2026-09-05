/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00611
 *  minecraft.class00780
 *  minecraft.class01001
 *  minecraft.class03556
 *  minecraft.class07209
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00611;
import minecraft.class00780;
import minecraft.class01001;
import minecraft.class03556;
import minecraft.class07209;

public final class class08579
extends Record {
    private final class07209 pos;
    private final class01001 level;
    private final class00611 environmentAttributes;
    private final class03556<class00780> biome;

    public class00611 L() {
        return this.environmentAttributes;
    }

    public class08579(class07209 class072092, class01001 class010012, class00611 class006112, class03556<class00780> class035562) {
        this.pos = class072092;
        this.level = class010012;
        this.environmentAttributes = class006112;
        this.biome = class035562;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08579.class, "pos;level;environmentAttributes;biome", "pos", "level", "environmentAttributes", "biome"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08579.class, "pos;level;environmentAttributes;biome", "pos", "level", "environmentAttributes", "biome"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08579.class, "pos;level;environmentAttributes;biome", "pos", "level", "environmentAttributes", "biome"}, this);
    }

    public class03556<class00780> u() {
        return this.biome;
    }

    public class01001 y() {
        return this.level;
    }

    public static class08579 N(class01001 class010012, class07209 class072092) {
        class03556 var2 = class010012.i(class072092);
        return new class08579(class072092, class010012, class010012.method_75598(), (class03556<class00780>)var2);
    }

    public class07209 N() {
        return this.pos;
    }
}

