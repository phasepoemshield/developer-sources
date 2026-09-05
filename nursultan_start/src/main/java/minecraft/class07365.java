/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.utils.accessor.IPalettedContainer$IData
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 *  minecraft.class00750
 *  minecraft.class04552
 *  minecraft.class06617
 *  minecraft.class07340
 *  minecraft.class07342
 */
package minecraft;

import baritone.utils.accessor.IPalettedContainer;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00667;
import minecraft.class00750;
import minecraft.class04552;
import minecraft.class06617;
import minecraft.class07340;
import minecraft.class07342;

public final class class07365<T>
extends Record
implements IPalettedContainer.IData {
    private final class06617 configuration;
    final class04552 storage;
    final class07340<T> palette;

    public class04552 L() {
        return this.storage;
    }

    public class07365(class06617 class066172, class04552 class045522, class07340<T> class073402) {
        this.configuration = class066172;
        this.storage = class045522;
        this.palette = class073402;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07365.class, "configuration;storage;palette", "configuration", "storage", "palette"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07365.class, "configuration;storage;palette", "configuration", "storage", "palette"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07365.class, "configuration;storage;palette", "configuration", "storage", "palette"}, this);
    }

    public class07340<T> u() {
        return this.palette;
    }

    public class06617 y() {
        return this.configuration;
    }

    public void N(class07340<T> class073402, class04552 class045522) {
        class07342 class073422 = class07342.N();
        for (int i = 0; i < class045522.y(); ++i) {
            Object object = class073402.method_12288(class045522.N(i));
            this.storage.y(i, this.palette.method_12291(object, class073422));
        }
    }

    public class07365<T> N() {
        return new class07365<T>(this.configuration, this.storage.u(), this.palette.method_39956());
    }

    public void N(class00667 class006672, class00750<T> class007502) {
        class006672.writeByte(this.storage.L());
        this.palette.method_12287(class006672, class007502);
        class006672.y(this.storage.N());
    }

    public int N(class00750<T> class007502) {
        return 1 + this.palette.method_12290(class007502) + this.storage.N().length * 8;
    }

    public /* synthetic */ class07340 getPalette() {
        return this.palette;
    }

    public /* synthetic */ class04552 getStorage() {
        return this.storage;
    }
}

