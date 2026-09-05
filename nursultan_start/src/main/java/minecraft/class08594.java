/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00235
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01929
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07269
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class00235;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01929;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07269;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08620;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class08594
extends class00394 {
    private static final Logger N = LogUtils.getLogger();
    private static final String y = "";
    private static final boolean L = false;
    private class00235 u;
    private String i = "";
    private boolean R = false;
    private boolean M;

    public class00235 L() {
        return this.u;
    }

    public void M() {
        if (!this.i.isBlank()) {
            N.info("Test {} (at {}): {}", new Object[]{this.u.method_15434(), this.d(), this.i});
        }
    }

    public class08594(class07209 class072092, class00500 class005002) {
        super(class00404.field_55992, class072092, class005002);
        this.u = (class00235)class005002.L(class08620.y);
    }

    public boolean B() {
        return this.M;
    }

    public String Z() {
        return this.i;
    }

    private class00891 U() {
        return this.w().i();
    }

    private void z() {
        if (this.z == null) {
            return;
        }
        class07209 class072092 = this.d();
        class00500 class005002 = this.z.method_8320(class072092);
        if (class005002.N(class00869.TN)) {
            this.z.method_8652(class072092, (class00500)class005002.y(class08620.y, (Comparable)this.u), 2);
        }
    }

    public void u() {
        this.M = false;
        if (this.u == class00235.field_56024 && this.z != null) {
            this.N(false);
            this.z.method_8408(this.d(), this.U());
        }
    }

    public boolean y() {
        return this.R;
    }

    protected void N(class08329 class083292) {
        class083292.N("mode", class00235.field_56028, (Object)this.u);
        class083292.N("message", this.i);
        class083292.N("powered", this.R);
    }

    public void N(String string) {
        this.i = string;
    }

    public void N(class00235 class002352) {
        this.u = class002352;
        this.z();
    }

    public void N(boolean bl) {
        this.R = bl;
    }

    public class07001 N(class01929 class019292) {
        return this.u(class019292);
    }

    public @Nullable class07269 i() {
        return class07269.N((class00394)this);
    }

    protected void N(class08299 class082992) {
        this.u = class082992.N("mode", class00235.field_56028).orElse(class00235.field_56026);
        this.i = class082992.N("message", y);
        this.R = class082992.N("powered", false);
    }

    public void R() {
        if (this.u == class00235.field_56024 && this.z != null) {
            this.N(true);
            class07209 class072092 = this.d();
            this.z.method_8408(class072092, this.U());
            this.z.method_8397().y(class072092, (Object)this.U());
            this.M();
            return;
        }
        if (this.u == class00235.field_56025) {
            this.M();
        }
        this.M = true;
    }
}

