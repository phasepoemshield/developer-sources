/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class06889
 *  minecraft.class07050
 */
package minecraft;

import minecraft.class00533;
import minecraft.class00563;
import minecraft.class00565;
import minecraft.class00667;
import minecraft.class06889;
import minecraft.class07050;

class class00545
implements class00533 {
    private final class07050 N;
    private final class06889 y;

    class00545(class07050 class070502, class06889 class068892) {
        this.N = class070502;
        this.y = class068892;
    }

    public class00545(class00667 class006672) {
        this.y = new class06889((double)class006672.readFloat(), (double)class006672.readFloat(), (double)class006672.readFloat());
        this.N = (class07050)class006672.y(class07050.class);
    }

    @Override
    public void N(class00565 class005652) {
        class005652.N(this.N, this.y);
    }

    @Override
    public void N(class00667 class006672) {
        class006672.writeFloat((float)this.y.M);
        class006672.writeFloat((float)this.y.B);
        class006672.writeFloat((float)this.y.Z);
        class006672.N((Enum)this.N);
    }

    @Override
    public class00563 N() {
        return class00563.field_29173;
    }
}

