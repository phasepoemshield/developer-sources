/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class02277
 *  minecraft.class02877
 *  minecraft.class05715
 *  minecraft.class05946
 *  minecraft.class06172
 *  minecraft.class06820
 *  minecraft.class07001
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07529
 *  minecraft.class07717
 */
package minecraft;

import java.nio.file.Path;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class02277;
import minecraft.class02877;
import minecraft.class05715;
import minecraft.class05946;
import minecraft.class06172;
import minecraft.class06691;
import minecraft.class06711;
import minecraft.class06820;
import minecraft.class07001;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07529;
import minecraft.class07717;

public abstract class class06698
extends class06691 {
    public final /* synthetic */ class06711 u;

    public class06698(class06711 class067112, class05715 class057152, String string, class00392 class003922, class00392 class003923) {
        this.u = class067112;
        super(class067112, class057152, string, string, class003922, class003923);
    }

    protected abstract class07001 N(class06172 var1, class07001 var2);

    @Override
    protected boolean N(class06172 class061722, class07321 class073212, class05946<class07299> class059462) {
        class07001 class070012 = ((Optional)class061722.u(class073212).join()).orElse(null);
        if (class070012 != null) {
            int n = class07717.R((class07001)class070012);
            class07001 class070013 = this.N(class061722, class070012);
            if (n < class07529.y().comp_4026().y() || this.u.U) {
                if (this.N != null) {
                    this.N.join();
                }
                this.N = class061722.N(class073212, class070013);
                return true;
            }
        }
        return false;
    }

    @Override
    protected class06172 N(class02277 class022772, Path path) {
        return this.u.U ? new class02877(class022772.N("source"), path, class022772.N("target"), class06711.N(path), this.u.W, true, this.y, class06820.N) : new class06172(class022772, path, this.u.W, true, this.y);
    }
}

