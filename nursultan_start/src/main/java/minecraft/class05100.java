/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class03255
 *  minecraft.class03556
 *  minecraft.class03723
 *  minecraft.class03754
 *  minecraft.class04141
 *  minecraft.class04282
 *  minecraft.class04909
 *  minecraft.class04981
 *  minecraft.class05220
 *  minecraft.class05685
 *  minecraft.class05728
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class08394
 */
package minecraft;

import java.util.Objects;
import minecraft.class00040;
import minecraft.class00044;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class03255;
import minecraft.class03556;
import minecraft.class03723;
import minecraft.class03754;
import minecraft.class04141;
import minecraft.class04282;
import minecraft.class04909;
import minecraft.class04981;
import minecraft.class05096;
import minecraft.class05132;
import minecraft.class05220;
import minecraft.class05685;
import minecraft.class05728;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class08394;

class class05100
extends class05728 {
    private static final class00392 y = class00392.L((String)"mco.snapshot.start");
    private static final int M = 5;
    private final class04282 B;
    private final class04981 Z;
    final /* synthetic */ class05685 N;

    public class05100(class05685 class056852, class04981 class049812) {
        this.N = class056852;
        super(class056852);
        this.B = new class04282();
        this.Z = class049812;
        this.B.N(class04141.N((class00392)class00392.L((String)"mco.snapshot.tooltip")));
    }

    private void N() {
        class05685.t((class05685)this.N).Nr().N((class00044)class00040.N((class03556)class04909.OK, (float)1.0f));
        class05685.G((class05685)this.N).N((class05096)new class03754((class05096)this.N, (class00392)class00392.L((String)"mco.snapshot.createSnapshotPopup.title")).N((class00392)class00392.L((String)"mco.snapshot.createSnapshotPopup.text")).N((class00392)class00392.L((String)"mco.selectServer.create"), class037232 -> class05685.l((class05685)this.N).N((class05096)((Object)((Object)((Object)new class05132(this.N, this.Z, true)))))).N(class05220.i, class03723::method_25419).N());
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.L()) {
            this.N();
            return false;
        }
        return super.method_25404(class066012);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        this.N();
        return true;
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        class010542.N(class08394.Na, class05685.y, this.method_73380() - 5, this.method_73385() - 10, 40, 20);
        int n3 = this.method_73385();
        Objects.requireNonNull(class05685.j((class05685)this.N));
        int n4 = n3 - 4;
        class010542.y(class05685.v((class05685)this.N), y, this.method_73380() + 40 - 2, n4 - 5, -8388737);
        class010542.y(class05685.n((class05685)this.N), (class00392)class00392.N((String)"mco.snapshot.description", (Object[])new Object[]{Objects.requireNonNullElse(this.Z.u, "unknown server")}), this.method_73380() + 40 - 2, n4 + 5, -8355712);
        this.B.N(class010542, n, n2, bl, this.method_25370(), new class03255(this.method_73380(), this.method_73382(), this.method_73387(), this.method_73384()));
    }

    public class00392 method_37006() {
        return class00392.N((String)"gui.narrate.button", (Object[])new Object[]{class05220.N((class00392[])new class00392[]{y, class00392.N((String)"mco.snapshot.description", (Object[])new Object[]{Objects.requireNonNullElse(this.Z.u, "unknown server")})})});
    }
}

