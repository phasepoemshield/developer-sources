/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00753
 *  minecraft.class04160
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06551
 *  minecraft.class06695
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class06925
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00394;
import minecraft.class00753;
import minecraft.class04160;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06551;
import minecraft.class06695;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class06925;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public interface class03136
extends class06695 {
    public static final String r_ = "LootTable";
    public static final String s_ = "LootTableSeed";

    public @Nullable class05946<class05074> M();

    public long B();

    public class07209 d();

    default public void y(@Nullable class08036 class080362) {
        class07299 class072992 = this.G();
        class07209 class072092 = this.d();
        class05946<class05074> var4 = this.M();
        if (var4 != null && class072992 != null && class072992.method_8503() != null) {
            class05074 class050742 = class072992.method_8503().yd().N(var4);
            if (class080362 instanceof class04770) {
                class06912.F.N((class04770)class080362, var4);
            }
            this.N(null);
            class04160 class041602 = new class04160((class04782)class072992).N(class06551.B, (Object)class06889.y((class00753)class072092));
            if (class080362 != null) {
                class041602.N(class080362.method_7292()).N(class06551.N, (Object)class080362);
            }
            class050742.N((class06695)this, class041602.N(class06925.u), this.B());
        }
    }

    default public void N(class05946<class05074> class059462, long l) {
        this.N(class059462);
        this.N(l);
    }

    public static void N(class07290 class072902, class06069 class060692, class07209 class072092, class05946<class05074> class059462) {
        class00394 class003942 = class072902.method_8321(class072092);
        if (class003942 instanceof class03136) {
            ((class03136)class003942).N(class059462, class060692.B());
        }
    }

    public void N(long var1);

    public void N(@Nullable class05946<class05074> var1);

    default public boolean a_(class08329 class083292) {
        class05946<class05074> var2 = this.M();
        if (var2 == null) {
            return false;
        }
        class083292.N(r_, class05074.N, var2);
        long l = this.B();
        if (l != 0L) {
            class083292.N(s_, l);
        }
        return true;
    }

    public @Nullable class07299 G();

    default public boolean c_(class08299 class082992) {
        class05946 var2 = class082992.N(r_, class05074.N).orElse(null);
        this.N((class05946<class05074>)var2);
        this.N(class082992.N(s_, 0L));
        return var2 != null;
    }
}

