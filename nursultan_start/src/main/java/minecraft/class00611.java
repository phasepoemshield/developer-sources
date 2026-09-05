/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class06889
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00590;
import minecraft.class00602;
import minecraft.class00607;
import minecraft.class00753;
import minecraft.class06889;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public interface class00611 {
    public static final class00611 N = new class00590();

    public <Value> Value N(class00607<Value> var1);

    public <Value> Value N(class00607<Value> var1, class06889 var2, @Nullable class00602 var3);

    default public <Value> Value N(class00607<Value> class006072, class06889 class068892) {
        return this.N(class006072, class068892, null);
    }

    default public <Value> Value N(class00607<Value> class006072, class07209 class072092) {
        return this.N(class006072, class06889.y((class00753)class072092));
    }
}

