/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 *  minecraft.class01315
 *  minecraft.class07070
 *  minecraft.class08027
 *  minecraft.class08036
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00667;
import minecraft.class01315;
import minecraft.class07070;
import minecraft.class08027;
import minecraft.class08036;

public final class class03737
extends Record {
    private final String language;
    private final int viewDistance;
    private final class08027 chatVisibility;
    private final boolean chatColors;
    private final int modelCustomisation;
    private final class07070 mainHand;
    private final boolean textFilteringEnabled;
    private final boolean allowsListing;
    private final class01315 particleStatus;
    public static final int N = 16;

    public int L() {
        return this.viewDistance;
    }

    public class07070 M() {
        return this.mainHand;
    }

    public class03737(class00667 class006672) {
        this(class006672.u(16), class006672.readByte(), (class08027)class006672.y(class08027.class), class006672.readBoolean(), class006672.readUnsignedByte(), (class07070)class006672.y(class07070.class), class006672.readBoolean(), class006672.readBoolean(), (class01315)class006672.y(class01315.class));
    }

    public class03737(String string, int n, class08027 class080272, boolean bl, int n2, class07070 class070702, boolean bl2, boolean bl3, class01315 class013152) {
        this.language = string;
        this.viewDistance = n;
        this.chatVisibility = class080272;
        this.chatColors = bl;
        this.modelCustomisation = n2;
        this.mainHand = class070702;
        this.textFilteringEnabled = bl2;
        this.allowsListing = bl3;
        this.particleStatus = class013152;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03737.class, "language;viewDistance;chatVisibility;chatColors;modelCustomisation;mainHand;textFilteringEnabled;allowsListing;particleStatus", "language", "viewDistance", "chatVisibility", "chatColors", "modelCustomisation", "mainHand", "textFilteringEnabled", "allowsListing", "particleStatus"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03737.class, "language;viewDistance;chatVisibility;chatColors;modelCustomisation;mainHand;textFilteringEnabled;allowsListing;particleStatus", "language", "viewDistance", "chatVisibility", "chatColors", "modelCustomisation", "mainHand", "textFilteringEnabled", "allowsListing", "particleStatus"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03737.class, "language;viewDistance;chatVisibility;chatColors;modelCustomisation;mainHand;textFilteringEnabled;allowsListing;particleStatus", "language", "viewDistance", "chatVisibility", "chatColors", "modelCustomisation", "mainHand", "textFilteringEnabled", "allowsListing", "particleStatus"}, this);
    }

    public boolean B() {
        return this.textFilteringEnabled;
    }

    public boolean Z() {
        return this.allowsListing;
    }

    public boolean i() {
        return this.chatColors;
    }

    public class01315 z() {
        return this.particleStatus;
    }

    public class08027 u() {
        return this.chatVisibility;
    }

    public String y() {
        return this.language;
    }

    public static class03737 N() {
        return new class03737("en_us", 2, class08027.field_7538, true, 0, class08036.field_62509, false, false, class01315.field_18197);
    }

    public void N(class00667 class006672) {
        class006672.N(this.language);
        class006672.writeByte(this.viewDistance);
        class006672.N((Enum)this.chatVisibility);
        class006672.writeBoolean(this.chatColors);
        class006672.writeByte(this.modelCustomisation);
        class006672.N((Enum)this.mainHand);
        class006672.writeBoolean(this.textFilteringEnabled);
        class006672.writeBoolean(this.allowsListing);
        class006672.N((Enum)this.particleStatus);
    }

    public int R() {
        return this.modelCustomisation;
    }
}

