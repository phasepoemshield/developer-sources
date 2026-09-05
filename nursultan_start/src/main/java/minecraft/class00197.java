/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00869
 *  minecraft.class01054
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class06366
 *  minecraft.class07209
 *  minecraft.class08594
 *  minecraft.class08640
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import minecraft.class00235;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00869;
import minecraft.class01054;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class06366;
import minecraft.class07209;
import minecraft.class08594;
import minecraft.class08640;
import org.jspecify.annotations.Nullable;

public class class00197
extends class05096 {
    private static final List<class00235> N = List.of(class00235.values());
    private static final class00392 y = class00392.L((String)class00869.TN.w());
    private static final class00392 L = class00392.L((String)"test_block.message");
    private final class07209 u;
    private class00235 i;
    private String R;
    private @Nullable class04927 M;

    public class00197(class08594 class085942) {
        super(y);
        this.u = class085942.d();
        this.i = class085942.L();
        this.R = class085942.Z();
    }

    private void y() {
        this.field_22787.N(null);
    }

    private void N(class00235 class002352) {
        this.i = class002352;
        this.M.field_22764 = class002352 != class00235.field_56024;
    }

    private void N() {
        this.R = this.M.method_1882();
        this.field_22787.NE().N((class00381)new class08640(this.u, this.i, this.R));
        this.method_25419();
    }

    public void method_25426() {
        this.M = new class04927(this.field_22793, this.field_22789 / 2 - 152, 80, 240, 20, (class00392)class00392.L((String)"test_block.message"));
        this.M.method_1880(128);
        this.M.method_1852(this.R);
        this.method_37063((class04654)this.M);
        this.N(this.i);
        this.method_37063((class04654)class06366.N(class00235::N, (Object)((Object)this.i)).N(N).N().N(this.field_22789 / 2 - 4 - 150, 185, 50, 20, y, (class063662, class002352) -> this.N((class00235)((Object)class002352))));
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.u, class053622 -> this.N()).N(this.field_22789 / 2 - 4 - 150, 210, 150, 20).N());
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.i, class053622 -> this.y()).N(this.field_22789 / 2 + 4, 210, 150, 20).N());
    }

    protected void method_56131() {
        if (this.M != null) {
            this.method_48265((class04654)this.M);
        } else {
            super.method_56131();
        }
    }

    public boolean method_73150() {
        return true;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class010542.N(this.field_22793, this.field_22785, this.field_22789 / 2, 10, -1);
        if (this.i != class00235.field_56024) {
            class010542.y(this.field_22793, L, this.field_22789 / 2 - 153, 70, -6250336);
        }
        class010542.y(this.field_22793, this.i.y(), this.field_22789 / 2 - 153, 174, -6250336);
    }

    public void method_25419() {
        this.y();
    }

    public boolean method_25421() {
        return false;
    }
}

