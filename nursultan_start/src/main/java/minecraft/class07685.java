/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00393
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class01362
 *  minecraft.class05487
 *  minecraft.class06563
 *  minecraft.class06584
 *  minecraft.class07209
 *  minecraft.class07796
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00393;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class01362;
import minecraft.class05487;
import minecraft.class06563;
import minecraft.class06584;
import minecraft.class07209;
import minecraft.class07796;

public abstract class class07685
extends class07796 {
    private final class06563 N;

    protected class07685(class06563 class065632, class01362 class013622) {
        super(class013622);
        this.N = class065632;
    }

    public class06563 y() {
        return this.N;
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class00393(class072092, class005002, this.N);
    }

    protected abstract MapCodec<? extends class07685> N();

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        class00394 class003942 = class054872.method_8321(class072092);
        if (class003942 instanceof class00393) {
            return ((class00393)class003942).L();
        }
        return super.N(class054872, class072092, class005002, bl);
    }

    public boolean c_(class00500 class005002) {
        return true;
    }
}

