/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01321
 *  minecraft.class01590
 *  minecraft.class01883
 *  minecraft.class01894
 *  minecraft.class04141
 *  minecraft.class04602
 *  minecraft.class04897
 *  minecraft.class04982
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05699
 *  minecraft.class06613
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01321;
import minecraft.class01590;
import minecraft.class01883;
import minecraft.class01894;
import minecraft.class04141;
import minecraft.class04602;
import minecraft.class04739;
import minecraft.class04897;
import minecraft.class04982;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05699;
import minecraft.class06613;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

class class04707
extends class05699<class04707> {
    private static final class01883 L = new class01883(class01894.y((String)"icon/link"), class01894.y((String)"icon/link_highlighted"));
    private static final class01883 u = new class01883(class01894.y((String)"icon/video_link"), class01894.y((String)"icon/video_link_highlighted"));
    private static final class00392 i = class00392.L((String)"mco.template.info.tooltip");
    private static final class00392 R = class00392.L((String)"mco.template.trailer.tooltip");
    public final class04982 N;
    private @Nullable class04897 M;
    private @Nullable class04897 B;
    final /* synthetic */ class04739 y;

    public class04707(class04739 class047392, class04982 class049822) {
        this.y = class047392;
        this.N = class049822;
        if (!class049822.i().isBlank()) {
            this.M = new class04897(15, 15, L, class01321.y((class05096)class047392, (String)class049822.i()), i);
            this.M.method_47400(class04141.N((class00392)i));
        }
        if (!class049822.M().isBlank()) {
            this.B = new class04897(15, 15, u, class01321.y((class05096)class047392, (String)class049822.M()), R);
            this.B.method_47400(class04141.N((class00392)R));
        }
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        this.y.R = this.N;
        this.y.N();
        if (bl && this.method_25370()) {
            this.y.u.accept(this.N);
        }
        if (this.M != null) {
            this.M.method_25402(class066132, bl);
        }
        if (this.B != null) {
            this.B.method_25402(class066132, bl);
        }
        return super.method_25402(class066132, bl);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        class010542.N(class08394.Na, class04602.N((String)this.N.N(), (String)this.N.R()), this.method_73380() + 1, this.method_73382() + 1 + 1, 0.0f, 0.0f, 38, 38, 38, 38);
        class010542.N(class08394.Na, class04739.y, this.method_73380(), this.method_73382() + 1, 40, 40);
        int n3 = 5;
        int n4 = class04739.y(this.y).y(this.N.L());
        if (this.M != null) {
            this.M.y(this.method_73389() - n4 - this.M.method_25368() - 10, this.method_73382());
            this.M.method_25394(class010542, n, n2, f);
        }
        if (this.B != null) {
            this.B.y(this.method_73389() - n4 - this.B.method_25368() * 2 - 15, this.method_73382());
            this.B.method_25394(class010542, n, n2, f);
        }
        int n5 = this.method_73380() + 45 + 20;
        int n6 = this.method_73382() + 5;
        class010542.y(class04739.L(this.y), this.N.y(), n5, n6, -1);
        class010542.y(class04739.u(this.y), this.N.L(), this.method_73389() - n4 - 5, n6, -6250336);
        class01590 class015902 = class04739.i(this.y);
        String string = this.N.u();
        Objects.requireNonNull(class04739.R(this.y));
        class010542.y(class015902, string, n5, n6 + 9 + 5, -6250336);
        if (!this.N.B().isBlank()) {
            class01590 class015903 = class04739.M(this.y);
            String string2 = this.N.B();
            int n7 = this.method_73386();
            Objects.requireNonNull(class04739.B(this.y));
            class010542.y(class015903, string2, n5, n7 - 4 - 5, -8355712);
        }
    }

    public class00392 method_37006() {
        class00392 class003922 = class05220.y((class00392[])new class00392[]{class00392.y((String)this.N.y()), class00392.N((String)"mco.template.select.narrate.authors", (Object[])new Object[]{this.N.u()}), class00392.y((String)this.N.B()), class00392.N((String)"mco.template.select.narrate.version", (Object[])new Object[]{this.N.L()})});
        return class00392.N((String)"narrator.select", (Object[])new Object[]{class003922});
    }
}

