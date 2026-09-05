/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.suggestion.Suggestion
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class02963
 *  minecraft.class04995
 *  minecraft.class05910
 *  minecraft.class06220
 *  minecraft.class06601
 *  minecraft.class06608
 *  minecraft.class07109
 */
package minecraft;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.suggestion.Suggestion;
import java.util.List;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class02963;
import minecraft.class04995;
import minecraft.class05910;
import minecraft.class06220;
import minecraft.class06601;
import minecraft.class06608;
import minecraft.class07109;

public class class05888 {
    private final class02963 L;
    private final String u;
    private final List<Suggestion> i;
    private int R;
    private int M;
    private class07109 B = class07109.N;
    boolean N;
    private int Z;
    final /* synthetic */ class05910 y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class05888(class05910 class059102, int n, int n2, int n3, List list, boolean bl) {
        this.y = class059102;
        int n4 = n - (class059102.y.method_1851() ? 0 : 1);
        int n5 = class059102.R ? n2 - 3 - Math.min(list.size(), class059102.i) * 12 : n2 - (class059102.y.method_1851() ? 1 : 0);
        this.L = new class02963(n4, n5, n3 + 1, Math.min(list.size(), class059102.i) * 12);
        this.u = class059102.y.method_1882();
        this.Z = bl ? -1 : 0;
        this.i = list;
        this.y(0);
    }

    public void y(int n) {
        this.M = n;
        if (this.M < 0) {
            this.M += this.i.size();
        }
        if (this.M >= this.i.size()) {
            this.M -= this.i.size();
        }
        Suggestion suggestion = this.i.get(this.M);
        this.y.y.method_1887(class05910.N((String)this.y.y.method_1882(), (String)suggestion.apply(this.u)));
        if (this.Z != this.M) {
            this.y.N.NT().u(this.y());
        }
    }

    class00392 y() {
        this.Z = this.M;
        Suggestion suggestion = this.i.get(this.M);
        Message message = suggestion.getTooltip();
        if (message != null) {
            return class00392.N((String)"narration.suggestion.tooltip", (Object[])new Object[]{this.M + 1, this.i.size(), suggestion.getText(), class00392.N((Message)message)});
        }
        return class00392.N((String)"narration.suggestion", (Object[])new Object[]{this.M + 1, this.i.size(), suggestion.getText()});
    }

    public boolean N(class06601 class066012) {
        if (class066012.B()) {
            this.N(-1);
            this.N = false;
            return true;
        }
        if (class066012.Z()) {
            this.N(1);
            this.N = false;
            return true;
        }
        if (class066012.z()) {
            if (this.N) {
                this.N(class066012.W() ? -1 : 1);
            }
            this.N();
            return true;
        }
        if (class066012.i()) {
            this.y.L();
            this.y.y.method_1887(null);
            return true;
        }
        return false;
    }

    public void N() {
        Suggestion suggestion = this.i.get(this.M);
        this.y.B = true;
        this.y.y.method_1852(suggestion.apply(this.u));
        int n = suggestion.getRange().getStart() + suggestion.getText().length();
        this.y.y.method_1875(n);
        this.y.y.method_1884(n);
        this.y(this.M);
        this.y.B = false;
        this.N = true;
    }

    public void N(class01054 class010542, int n, int n2) {
        Message message;
        int n3;
        boolean bl;
        int n4 = Math.min(this.i.size(), this.y.i);
        int n5 = -5592406;
        boolean bl2 = this.R > 0;
        boolean bl3 = this.i.size() > this.R + n4;
        boolean bl4 = bl2 || bl3;
        boolean bl5 = bl = this.B.z != (float)n || this.B.U != (float)n2;
        if (bl) {
            this.B = new class07109((float)n, (float)n2);
        }
        if (bl4) {
            class010542.N(this.L.N(), this.L.y() - 1, this.L.N() + this.L.L(), this.L.y(), this.y.M);
            class010542.N(this.L.N(), this.L.y() + this.L.u(), this.L.N() + this.L.L(), this.L.y() + this.L.u() + 1, this.y.M);
            if (bl2) {
                for (n3 = 0; n3 < this.L.L(); ++n3) {
                    if (n3 % 2 != 0) continue;
                    class010542.N(this.L.N() + n3, this.L.y() - 1, this.L.N() + n3 + 1, this.L.y(), -1);
                }
            }
            if (bl3) {
                for (n3 = 0; n3 < this.L.L(); ++n3) {
                    if (n3 % 2 != 0) continue;
                    class010542.N(this.L.N() + n3, this.L.y() + this.L.u(), this.L.N() + n3 + 1, this.L.y() + this.L.u() + 1, -1);
                }
            }
        }
        n3 = 0;
        for (int i = 0; i < n4; ++i) {
            Suggestion suggestion = this.i.get(i + this.R);
            class010542.N(this.L.N(), this.L.y() + 12 * i, this.L.N() + this.L.L(), this.L.y() + 12 * i + 12, this.y.M);
            if (n > this.L.N() && n < this.L.N() + this.L.L() && n2 > this.L.y() + 12 * i && n2 < this.L.y() + 12 * i + 12) {
                if (bl) {
                    this.y(i + this.R);
                }
                n3 = 1;
            }
            class010542.y(this.y.L, suggestion.getText(), this.L.N() + 1, this.L.y() + 2 + 12 * i, i + this.R == this.M ? -256 : -5592406);
        }
        if (n3 != 0 && (message = this.i.get(this.M).getTooltip()) != null) {
            class010542.N(this.y.L, class00390.N((Message)message), n, n2);
        }
        if (this.L.y(n, n2)) {
            class010542.N(class06608.u);
        }
    }

    public void N(int n) {
        this.y(this.M + n);
        int n2 = this.R;
        int n3 = this.R + this.y.i - 1;
        if (this.M < n2) {
            this.R = class04995.N((int)this.M, (int)0, (int)Math.max(this.i.size() - this.y.i, 0));
        } else if (this.M > n3) {
            this.R = class04995.N((int)(this.M + this.y.u - this.y.i), (int)0, (int)Math.max(this.i.size() - this.y.i, 0));
        }
    }

    public boolean N(int n, int n2) {
        if (!this.L.y(n, n2)) {
            return false;
        }
        int n3 = (n2 - this.L.y()) / 12 + this.R;
        if (n3 >= 0 && n3 < this.i.size()) {
            this.y(n3);
            this.N();
        }
        return true;
    }

    public boolean N(double d) {
        int n;
        int n2 = (int)((class06220)this.y.N.L_2).y(this.y.N.Nt());
        if (this.L.y(n2, n = (int)((class06220)this.y.N.L_2).L(this.y.N.Nt()))) {
            this.R = class04995.N((int)((int)((double)this.R - d)), (int)0, (int)Math.max(this.i.size() - this.y.i, 0));
            return true;
        }
        return false;
    }
}

