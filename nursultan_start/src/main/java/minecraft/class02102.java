/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03255
 *  minecraft.class06478
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class03255;
import minecraft.class06478;

public interface class02102 {
    default public void y(int n, int n2) {
        this.method_46421(n);
        this.method_46419(n2);
    }

    default public class03255 method_48202() {
        return new class03255(this.method_46426(), this.method_46427(), this.method_25368(), this.method_25364());
    }

    public void method_48206(Consumer<class06478> var1);

    public int method_46427();

    public void method_46419(int var1);

    public int method_46426();

    public void method_46421(int var1);

    public int method_25364();

    public int method_25368();
}

