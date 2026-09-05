/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class07079
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08372
 *  minecraft.class08636
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import minecraft.class04782;
import minecraft.class07079;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08372;
import minecraft.class08636;
import org.jspecify.annotations.Nullable;

public interface class01279 {
    public static final String n_ = "anger_end_time";
    public static final String o_ = "angry_at";
    public static final long p_ = -1L;

    public @Nullable class07438 T();

    public class07299 method_73183();

    default public void y(class04782 class047822, class08036 class080362) {
        if (!((Boolean)class047822.method_64395().N(class07305.P)).booleanValue()) {
            return;
        }
        class08372<class07438> var3 = this.W();
        if (var3 == null || !var3.y((class08636)class080362)) {
            return;
        }
        this.R_();
    }

    default public void y(long l) {
        this.N(this.method_73183().N() + l);
    }

    public void y(@Nullable class07438 var1);

    public long E();

    default public void N(class04782 class047822, boolean bl) {
        class07438 class074382 = this.T();
        class08372<class07438> var4 = this.W();
        if (class074382 != null && class074382.method_29504() && var4 != null && var4.y((class08636)class074382) && class074382 instanceof class07079) {
            this.R_();
            return;
        }
        if (class074382 != null) {
            if (var4 == null || !var4.y((class08636)class074382)) {
                this.N((class08372<class07438>)class08372.N((class08636)class074382));
            }
            this.W_();
        }
        if (!(var4 == null || this.P_() || class074382 != null && class01279.N(class074382) && bl)) {
            this.R_();
        }
    }

    private static boolean N(class07438 class074382) {
        class08036 class080362;
        return class074382 instanceof class08036 && !(class080362 = (class08036)class074382).method_68878() && !class080362.method_7325();
    }

    public void N(@Nullable class08372<class07438> var1);

    public void N(long var1);

    default public boolean N(class07438 class074382, class04782 class047822) {
        if (!this.method_18395(class074382)) {
            return false;
        }
        if (class01279.N(class074382) && this.a_(class047822)) {
            return true;
        }
        class08372<class07438> var3 = this.W();
        return var3 != null && var3.y((class08636)class074382);
    }

    default public void N(class08329 class083292) {
        class083292.N(n_, this.E());
        class083292.y(o_, class08372.N(), this.W());
    }

    default public void N(class07299 class072992, class08299 class082992) {
        Optional var3 = class082992.R(n_);
        if (var3.isPresent()) {
            this.N((Long)var3.get());
        } else {
            Optional var4 = class082992.i("AngerTime");
            if (var4.isPresent()) {
                this.y(((Integer)var4.get()).intValue());
            } else {
                this.N(-1L);
            }
        }
        if (!(class072992 instanceof class04782)) {
            return;
        }
        this.N((class08372<class07438>)class08372.N((class08299)class082992, (String)o_));
        this.y(class08372.y(this.W(), (class07299)class072992));
    }

    public @Nullable class08372<class07438> W();

    default public boolean a_(class04782 class047822) {
        return (Boolean)class047822.method_64395().N(class07305.NR) != false && this.P_() && this.W() == null;
    }

    public @Nullable class07438 method_6065();

    public boolean method_18395(class07438 var1);

    public void method_6015(@Nullable class07438 var1);

    public void W_();

    default public boolean P_() {
        long l = this.E();
        if (l > 0L) {
            return l - this.method_73183().N() > 0L;
        }
        return false;
    }

    default public void Q_() {
        this.R_();
        this.W_();
    }

    default public void R_() {
        this.method_6015(null);
        this.N((class08372<class07438>)null);
        this.y(null);
        this.N(-1L);
    }
}

