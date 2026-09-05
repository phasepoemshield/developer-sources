/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00158
 *  minecraft.class00636
 *  minecraft.class02362
 *  minecraft.class07346
 */
package minecraft;

import minecraft.class00158;
import minecraft.class00636;
import minecraft.class02362;
import minecraft.class04247;
import minecraft.class04259;
import minecraft.class07346;

class class04281
implements class02362<class04247, class07346> {
    final /* synthetic */ class04259 N;
    final /* synthetic */ class02362 y;

    class04281(class04259 class042592, class02362 class023622) {
        this.N = class042592;
        this.y = class023622;
    }

    public class07346 decode(class04247 class042472) {
        if (!this.N.method_68733()) {
            throw new class00158("Not in creative mode");
        }
        return (class07346)this.y.decode((Object)class042472);
    }

    public void encode(class04247 class042472, class07346 class073462) {
        if (!this.N.method_68733()) {
            throw new class00636("Not in creative mode");
        }
        this.y.encode((Object)class042472, (Object)class073462);
    }
}

