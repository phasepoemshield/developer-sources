/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class00392
 *  minecraft.class02484
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class03689
 *  minecraft.class03691
 *  minecraft.class05946
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07438
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class02484;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class03689;
import minecraft.class03691;
import minecraft.class05946;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class07072 {
    private final class03556<class03689> N;
    private final @Nullable class07049 y;
    private final @Nullable class07049 L;
    private final @Nullable class06889 u;

    public @Nullable class07049 L() {
        return this.L;
    }

    public boolean M() {
        return switch (this.U().y()) {
            default -> throw new MatchException(null, null);
            case class03691.field_42285 -> false;
            case class03691.field_42286 -> {
                if (this.y instanceof class07438 && !(this.y instanceof class08036)) {
                    yield true;
                }
                yield false;
            }
            case class03691.field_42287 -> true;
        };
    }

    public class07072(class03556<class03689> class035562) {
        this(class035562, null, null, null);
    }

    public class07072(class03556<class03689> class035562, @Nullable class07049 class070492, @Nullable class07049 class070493) {
        this(class035562, class070492, class070493, null);
    }

    public class07072(class03556<class03689> class035562, @Nullable class07049 class070492) {
        this(class035562, class070492, class070492);
    }

    private class07072(class03556<class03689> class035562, @Nullable class07049 class070492, @Nullable class07049 class070493, @Nullable class06889 class068892) {
        this.N = class035562;
        this.y = class070493;
        this.L = class070492;
        this.u = class068892;
    }

    public class07072(class03556<class03689> class035562, class06889 class068892) {
        this(class035562, null, null, class068892);
    }

    public String toString() {
        return "DamageSource (" + this.U().N() + ")";
    }

    public boolean B() {
        class07049 class070492 = this.u();
        return class070492 instanceof class08036 && ((class08036)class070492).method_31549().u;
    }

    public @Nullable class06889 Z() {
        if (this.u != null) {
            return this.u;
        }
        if (this.L != null) {
            return this.L.method_73189();
        }
        return null;
    }

    public @Nullable class06584 i() {
        return this.L != null ? this.L.method_59958() : null;
    }

    public class03689 U() {
        return (class03689)this.N.N();
    }

    public @Nullable class06889 z() {
        return this.u;
    }

    public @Nullable class07049 u() {
        return this.y;
    }

    public boolean y() {
        return this.y == this.L;
    }

    public class03556<class03689> E() {
        return this.N;
    }

    public class00392 N(class07438 class074382) {
        String string = "death.attack." + this.U().N();
        if (this.y != null || this.L != null) {
            class06584 class065842;
            class00392 class003922 = this.y == null ? this.L.method_5476() : this.y.method_5476();
            class07049 class070492 = this.y;
            class06584 class065843 = class065842 = class070492 instanceof class07438 ? ((class07438)class070492).method_6047() : class06584.E;
            if (!class065842.R() && class065842.L(class02484.B)) {
                return class00392.N((String)(string + ".item"), (Object[])new Object[]{class074382.method_5476(), class003922, class065842.V()});
            }
            return class00392.N((String)string, (Object[])new Object[]{class074382.method_5476(), class003922});
        }
        class07438 class074383 = class074382.method_6124();
        String string2 = string + ".player";
        if (class074383 != null) {
            return class00392.N((String)string2, (Object[])new Object[]{class074382.method_5476(), class074383.method_5476()});
        }
        return class00392.N((String)string, (Object[])new Object[]{class074382.method_5476()});
    }

    public boolean N(class05946<class03689> class059462) {
        return this.N.N(class059462);
    }

    public boolean N(class03530<class03689> class035302) {
        return this.N.N(class035302);
    }

    public float N() {
        return this.U().L();
    }

    public String R() {
        return this.U().N();
    }
}

