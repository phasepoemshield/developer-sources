/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class01255
 *  minecraft.class05934
 *  minecraft.class07312
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00751;
import minecraft.class01255;
import minecraft.class05934;
import minecraft.class07312;

final class class01899
extends Record {
    final class07312 levelSettings;
    final class05934 options;
    final class00751<class01255> existingDimensions;

    public class00751<class01255> L() {
        return this.existingDimensions;
    }

    class01899(class07312 class073122, class05934 class059342, class00751<class01255> class007512) {
        this.levelSettings = class073122;
        this.options = class059342;
        this.existingDimensions = class007512;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01899.class, "levelSettings;options;existingDimensions", "levelSettings", "options", "existingDimensions"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01899.class, "levelSettings;options;existingDimensions", "levelSettings", "options", "existingDimensions"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01899.class, "levelSettings;options;existingDimensions", "levelSettings", "options", "existingDimensions"}, this);
    }

    public class05934 y() {
        return this.options;
    }

    public class07312 N() {
        return this.levelSettings;
    }
}

