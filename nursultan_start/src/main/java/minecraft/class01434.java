/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02579
 *  minecraft.class07311
 */
package minecraft;

import java.util.Optional;
import minecraft.class01391;
import minecraft.class01407;
import minecraft.class01422;
import minecraft.class01456;
import minecraft.class02579;
import minecraft.class07311;

public class class01434
implements class01407 {
    private final class01422 N = class01407.N(new class02579(1536));
    private int y = -1;

    public void N() {
        this.N.u();
    }

    public void N(int n) {
        this.y = n;
    }

    @Override
    public class01391 method_73477(class07311 class073112) {
        if (class073112.method_24295()) {
            class01391 class013912 = this.N.method_73477(class073112);
            return new class01456(class013912, this.y);
        }
        Optional var2 = class073112.method_23289();
        if (var2.isPresent()) {
            class01391 class013913 = this.N.method_73477((class07311)var2.get());
            return new class01456(class013913, this.y);
        }
        throw new IllegalStateException("Can't render an outline for this rendertype!");
    }
}

