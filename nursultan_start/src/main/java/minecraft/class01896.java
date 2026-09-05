/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09545
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class01022
 *  minecraft.class01248
 *  minecraft.class01255
 *  minecraft.class02003
 *  minecraft.class02969
 *  minecraft.class03678
 *  minecraft.class03764
 *  minecraft.class03776
 *  minecraft.class03796
 *  minecraft.class04227
 *  minecraft.class05934
 *  minecraft.class06826
 *  minecraft.class08707
 */
package minecraft;

import Nursultan.class09545;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Iterator;
import minecraft.class00751;
import minecraft.class01022;
import minecraft.class01248;
import minecraft.class01255;
import minecraft.class01935;
import minecraft.class02003;
import minecraft.class02969;
import minecraft.class03678;
import minecraft.class03764;
import minecraft.class03776;
import minecraft.class03796;
import minecraft.class04227;
import minecraft.class05934;
import minecraft.class06826;
import minecraft.class08707;

public final class class01896
extends Record {
    private final class05934 options;
    private final class00751<class01255> datapackDimensions;
    private final class03764 selectedDimensions;
    private final class02003<class02969> worldgenRegistries;
    private final class01248 dataPackResources;
    private final class03776 dataConfiguration;
    private final class08707 initialWorldCreationOptions;

    public class05934 L() {
        return this.options;
    }

    public class01248 M() {
        return this.dataPackResources;
    }

    public class01896(class03796 class037962, class02003<class02969> class020032, class01248 class012482, class03776 class037762) {
        this(class037962.N(), class037962.y(), class020032, class012482, class037762, new class08707(class03678.field_20624, class06826.N(), null));
    }

    public class01896(class05934 class059342, class00751<class01255> class007512, class03764 class037642, class02003<class02969> class020032, class01248 class012482, class03776 class037762, class08707 class087072) {
        this.options = class059342;
        this.datapackDimensions = class007512;
        this.selectedDimensions = class037642;
        this.worldgenRegistries = class020032;
        this.dataPackResources = class012482;
        this.dataConfiguration = class037762;
        this.initialWorldCreationOptions = class087072;
    }

    public class01896(class05934 class059342, class03764 class037642, class02003<class02969> class020032, class01248 class012482, class03776 class037762, class08707 class087072) {
        this(class059342, (class00751<class01255>)class020032.N((Object)class02969.field_39973).L(class04227.yI), class037642, (class02003<class02969>)class020032.N((Object)class02969.field_39973, new class01022[0]), class012482, class037762, class087072);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01896.class, "options;datapackDimensions;selectedDimensions;worldgenRegistries;dataPackResources;dataConfiguration;initialWorldCreationOptions", "options", "datapackDimensions", "selectedDimensions", "worldgenRegistries", "dataPackResources", "dataConfiguration", "initialWorldCreationOptions"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01896.class, "options;datapackDimensions;selectedDimensions;worldgenRegistries;dataPackResources;dataConfiguration;initialWorldCreationOptions", "options", "datapackDimensions", "selectedDimensions", "worldgenRegistries", "dataPackResources", "dataConfiguration", "initialWorldCreationOptions"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01896.class, "options;datapackDimensions;selectedDimensions;worldgenRegistries;dataPackResources;dataConfiguration;initialWorldCreationOptions", "options", "datapackDimensions", "selectedDimensions", "worldgenRegistries", "dataPackResources", "dataConfiguration", "initialWorldCreationOptions"}, this);
    }

    public class03776 B() {
        return this.dataConfiguration;
    }

    public class08707 Z() {
        return this.initialWorldCreationOptions;
    }

    public class03764 i() {
        return this.selectedDimensions;
    }

    public class00751<class01255> u() {
        return this.datapackDimensions;
    }

    public void y() {
        Iterator var1 = this.u().iterator();
        while (var1.hasNext()) {
            ((class01255)var1.next()).y().N();
        }
    }

    public class01896 N(class05934 class059342, class03764 class037642) {
        return new class01896(class059342, this.datapackDimensions, class037642, this.worldgenRegistries, this.dataPackResources, this.dataConfiguration, this.initialWorldCreationOptions);
    }

    public class01022 N() {
        return this.worldgenRegistries.N();
    }

    public class01896 N(class09545 class095452) {
        return new class01896((class05934)class095452.apply((Object)this.options), this.datapackDimensions, this.selectedDimensions, this.worldgenRegistries, this.dataPackResources, this.dataConfiguration, this.initialWorldCreationOptions);
    }

    public class01896 N(class01935 class019352) {
        return new class01896(this.options, this.datapackDimensions, (class03764)class019352.apply(this.N(), this.selectedDimensions), this.worldgenRegistries, this.dataPackResources, this.dataConfiguration, this.initialWorldCreationOptions);
    }

    public class02003<class02969> R() {
        return this.worldgenRegistries;
    }
}

