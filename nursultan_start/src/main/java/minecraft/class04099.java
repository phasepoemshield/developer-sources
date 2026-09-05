/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class05543
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class04072;
import minecraft.class04089;
import minecraft.class04090;
import minecraft.class05543;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import org.jspecify.annotations.Nullable;

public interface class04099 {
    default public boolean y(class00500 class005002, class07211 class072112) {
        return this.N(class005002) || this.N(class005002, class072112);
    }

    default public boolean N(class00500 class005002, class07211 class072112) {
        return class05543.N((class00500)class005002, (class07211)class072112);
    }

    default public boolean N(class00500 class005002) {
        return false;
    }

    default public boolean N(class07284 class072842, class04089 class040892, class00500 class005002, boolean bl) {
        class00500 class005003 = this.N(class005002, (class07290)class072842, class040892.N(), class040892.y());
        if (class005003 != null) {
            if (bl) {
                class072842.method_8500(class040892.N()).u(class040892.N());
            }
            return class072842.method_8652(class040892.N(), class005003, 2);
        }
        return false;
    }

    default public class04072[] N() {
        return class04090.N;
    }

    public boolean N(class07290 var1, class07209 var2, class04089 var3);

    public @Nullable class00500 N(class00500 var1, class07290 var2, class07209 var3, class07211 var4);
}

