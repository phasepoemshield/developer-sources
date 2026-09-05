/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class05699
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class08302
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00048;
import minecraft.class00050;
import minecraft.class00073;
import minecraft.class00082;
import minecraft.class00089;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class05699;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class08302;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

class class00075
extends class05699<class00075> {
    final class08302 N;
    private final class00392 L;
    final /* synthetic */ class00048 y;

    public class00075(class00048 class000482, @Nullable class00050 class000502, class00082 class000822) {
        this(class000482, new class08302(class000502, class000822));
    }

    public class00075(class00048 class000482, class08302 class083022) {
        this.y = class000482;
        this.N = class083022;
        this.L = class083022.N() == class00050.field_60228 ? (class083022.y() != null ? class00392.L((String)class083022.y().field_60201) : class00392.i()) : class00392.L((String)class083022.N().field_60231);
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.L()) {
            this.y.method_25354(class00048.y(this.y).Nr());
            this.y.N.N();
            return true;
        }
        return super.method_25404(class066012);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        this.y.method_25313(this);
        if (bl) {
            this.y.method_25354(class00048.N(this.y).Nr());
            this.y.N.N();
            return true;
        }
        return super.method_25402(class066132, bl);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        class010542.y(class00089.y(this.y.N), this.L, this.method_73380() + 5, this.method_73382() + 2, -1);
        if (this.N.y() != null && this.y.N.N.containsKey((Object)this.N.y())) {
            class00073 class000732 = this.y.N.N.getOrDefault((Object)this.N.y(), class00073.field_60237);
            class010542.N(class08394.Na, class000732.y(), this.method_73389() - 18, this.method_73382() + 2, 10, 8);
        }
    }

    public class00392 method_37006() {
        return class00392.N((String)"narrator.select", (Object[])new Object[]{this.L});
    }
}

