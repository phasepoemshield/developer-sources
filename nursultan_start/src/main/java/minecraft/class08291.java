/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00560
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class05018
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05671
 *  minecraft.class05884
 *  minecraft.class05936
 *  minecraft.class06541
 *  minecraft.class06601
 *  minecraft.class07050
 *  minecraft.class08036
 *  minecraft.class08394
 */
package minecraft;

import java.util.List;
import java.util.Optional;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00560;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class05018;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05671;
import minecraft.class05884;
import minecraft.class05936;
import minecraft.class06541;
import minecraft.class06601;
import minecraft.class07050;
import minecraft.class08036;
import minecraft.class08394;

public class class08291
extends class05096 {
    private static final class00392 N = class00392.L((String)"book.editTitle");
    private static final class00392 y = class00392.L((String)"book.finalizeWarning");
    private static final class00392 L = class00392.L((String)"book.sign.title");
    private static final class00392 u = class00392.L((String)"book.sign.titlebox");
    private final class05884 i;
    private final class08036 R;
    private final List<String> M;
    private final class07050 B;
    private final class00392 Z;
    private class04927 z;
    private String U = "";

    public class08291(class05884 class058842, class08036 class080362, class07050 class070502, List<String> list) {
        super(L);
        this.i = class058842;
        this.R = class080362;
        this.B = class070502;
        this.M = list;
        this.Z = class00392.N((String)"book.byAuthor", (Object[])new Object[]{class080362.method_5477()}).N(class06541.field_1063);
    }

    private void N() {
        int n = this.B == class07050.field_5808 ? this.R.method_31548().N() : 40;
        this.field_22787.NE().N((class00381)new class00560(n, this.M, Optional.of(this.z.method_1882().trim())));
    }

    public void method_25426() {
        class05362 class053623 = class05362.method_46430((class00392)class00392.L((String)"book.finalizeButton"), class053622 -> {
            this.N();
            this.field_22787.N(null);
        }).N(this.field_22789 / 2 - 100, 196, 98, 20).N();
        class053623.field_22763 = false;
        this.z = (class04927)this.method_37063((class04654)new class04927((class01590)this.field_22787.i_3, (this.field_22789 - 114) / 2 - 3, 50, 114, 20, u));
        this.z.method_1880(15);
        this.z.method_1858(false);
        this.z.method_71502(true);
        this.z.method_1868(-16777216);
        this.z.method_71503(false);
        this.z.method_1863(string -> {
            class053622.field_22763 = !class05018.B((String)string);
        });
        this.z.method_1852(this.U);
        this.method_37063((class04654)class053623);
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.i, class053622 -> {
            this.U = this.z.method_1882();
            this.field_22787.N((class05096)this.i);
        }).N(this.field_22789 / 2 + 2, 196, 98, 20).N());
    }

    protected void method_56131() {
        this.method_48265((class04654)this.z);
    }

    public boolean method_25404(class06601 class066012) {
        if (this.z.method_25370() && !this.z.method_1882().isEmpty() && class066012.u()) {
            this.N();
            this.field_22787.N(null);
            return true;
        }
        return super.method_25404(class066012);
    }

    public boolean method_73150() {
        return true;
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
        super.method_25420(class010542, n, n2, f);
        class010542.N(class08394.Na, class05671.i, (this.field_22789 - 192) / 2, 2, 0.0f, 0.0f, 192, 192, 256, 256);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        int n3 = (this.field_22789 - 192) / 2;
        int n4 = 2;
        int n5 = this.field_22793.N((class05936)N);
        class010542.N(this.field_22793, N, n3 + 36 + (114 - n5) / 2, 34, -16777216, false);
        int n6 = this.field_22793.N((class05936)this.Z);
        class010542.N(this.field_22793, this.Z, n3 + 36 + (114 - n6) / 2, 60, -16777216, false);
        class010542.N(this.field_22793, (class05936)y, n3 + 36, 82, 114, -16777216, false);
    }
}

