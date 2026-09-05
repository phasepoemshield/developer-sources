/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class01328
 *  minecraft.class06889
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07305
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07453
 *  minecraft.class07475
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class00734;
import minecraft.class01328;
import minecraft.class06889;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07305;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07453;
import minecraft.class07475;
import minecraft.class07953;
import org.jspecify.annotations.Nullable;

public class class07989
extends class07953 {
    private static final class01328 N = class01328.N().u().i();
    private static final int y = 10;
    private boolean L;
    private int u;
    private final Class<?>[] Z;
    private Class<?> @Nullable [] z;

    @Override
    public void L() {
        this.i.y(this.i.method_6065());
        this.M = this.i.T();
        this.u = this.i.method_6117();
        this.B = 300;
        if (this.L) {
            this.M();
        }
        super.L();
    }

    protected void M() {
        double d = this.Z();
        class00734 class007342 = class00734.N((class06889)this.i.method_73189()).L(d, 10.0, d);
        for (class07079 class070792 : this.i.method_73183().N(this.i.getClass(), class007342, class07042.R)) {
            if (this.i == class070792 || class070792.T() != null || this.i instanceof class07453 && ((class07453)this.i).L_() != ((class07453)class070792).L_() || class070792.method_5722((class07049)this.i.method_6065())) continue;
            if (this.z != null) {
                boolean bl = false;
                for (Class<?> var11 : this.z) {
                    if (class070792.getClass() != var11) continue;
                    bl = true;
                    break;
                }
                if (bl) continue;
            }
            this.N(class070792, this.i.method_6065());
        }
    }

    public class07989(class07475 class074752, Class<?> ... classArray) {
        super((class07079)class074752, true);
        this.Z = classArray;
        this.N_71(EnumSet.of(class07430.field_18408));
    }

    public class07989 N(Class<?> ... classArray) {
        this.L = true;
        this.z = classArray;
        return this;
    }

    protected void N(class07079 class070792, class07438 class074382) {
        class070792.y(class074382);
    }

    public boolean N() {
        int n = this.i.method_6117();
        class07438 class074382 = this.i.method_6065();
        if (n == this.u || class074382 == null) {
            return false;
        }
        if (class074382.method_5864() == class07078.Ly && ((Boolean)class07989.N((class07049)this.i).method_64395().N(class07305.NR)).booleanValue()) {
            return false;
        }
        Class<?>[] var3 = this.Z;
        int n2 = var3.length;
        for (int i = 0; i < n2; ++i) {
            if (!var3[i].isAssignableFrom(class074382.getClass())) continue;
            return false;
        }
        return this.N(class074382, N);
    }
}

