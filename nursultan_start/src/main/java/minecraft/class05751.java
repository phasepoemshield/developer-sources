/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00737
 *  minecraft.class04051
 *  minecraft.class05378
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07438
 */
package minecraft;

import java.util.Optional;
import minecraft.class00737;
import minecraft.class04051;
import minecraft.class05378;
import minecraft.class05779;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07438;

public class class05751
implements class05779 {
    private final class07049 N;
    private final boolean y;
    private final boolean L;

    public class07049 L() {
        return this.N;
    }

    public class05751(class07049 class070492, boolean bl) {
        this(class070492, bl, false);
    }

    public class05751(class07049 class070492, boolean bl, boolean bl2) {
        this.N = class070492;
        this.y = bl;
        this.L = bl2;
    }

    public String toString() {
        return "EntityTracker for " + String.valueOf(this.N);
    }

    @Override
    public class07209 y() {
        return this.L ? class07209.method_49638((class00737)this.N.method_33571()) : this.N.method_24515();
    }

    @Override
    public class06889 N() {
        return this.y ? this.N.method_73189().y(0.0, (double)this.N.method_5751(), 0.0) : this.N.method_73189();
    }

    @Override
    public boolean N(class07438 class074382) {
        class07049 class070492 = this.N;
        if (!(class070492 instanceof class07438)) {
            return true;
        }
        class07438 class074383 = (class07438)class070492;
        if (!class074383.method_5805()) {
            return false;
        }
        Optional var3 = class074382.method_18868().L(class05378.B);
        return var3.isPresent() && ((class04051)var3.get()).N(class074383);
    }
}

