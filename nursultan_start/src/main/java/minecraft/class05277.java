/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  minecraft.class00753
 *  minecraft.class02625
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class05880
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06889
 *  minecraft.class06937
 *  minecraft.class07057
 *  minecraft.class07299
 *  minecraft.class07304
 *  minecraft.class07323
 *  minecraft.class08036
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import minecraft.class00753;
import minecraft.class02625;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class05262;
import minecraft.class05880;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06889;
import minecraft.class06937;
import minecraft.class07057;
import minecraft.class07299;
import minecraft.class07304;
import minecraft.class07323;
import minecraft.class08036;

class class05277
extends class06937 {
    final /* synthetic */ class05880 N;
    final /* synthetic */ class05262 y;

    private int M(class06584 class065842) {
        int n = 0;
        for (Object2IntMap.Entry entry : class07323.y((class06584)class065842).y()) {
            class03556 var6 = (class03556)entry.getKey();
            int n2 = entry.getIntValue();
            if (var6.N(class02625.P)) continue;
            n += ((class07304)var6.N()).y(n2);
        }
        return n;
    }

    class05277(class05262 class052622, class06695 class066952, int n, int n2, int n3, class05880 class058802) {
        this.y = class052622;
        this.N = class058802;
        super(class066952, n, n2, n3);
    }

    private int N(class07299 class072992) {
        int n = 0;
        n += this.M(this.y.i.method_5438(0));
        if ((n += this.M(this.y.i.method_5438(1))) > 0) {
            int n2 = (int)Math.ceil((double)n / 2.0);
            return n2 + class072992.field_9229.y(n2);
        }
        return 0;
    }

    public void N(class08036 class080362, class06584 class065842) {
        this.N.N_53((class072992, class072092) -> {
            if (class072992 instanceof class04782) {
                class07057.N((class04782)((class04782)class072992), (class06889)class06889.y((class00753)class072092), (int)this.N((class07299)class072992));
            }
            class072992.N(1042, class072092, 0);
        });
        this.y.i.method_5447(0, class06584.E);
        this.y.i.method_5447(1, class06584.E);
    }

    public boolean N(class06584 class065842) {
        return false;
    }
}

