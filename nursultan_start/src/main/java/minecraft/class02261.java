/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00381
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class01929
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07269
 *  minecraft.class07280
 *  minecraft.class07299
 *  minecraft.class07536
 *  minecraft.class07713
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.DynamicOps;
import minecraft.class00381;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class01929;
import minecraft.class02264;
import minecraft.class02274;
import minecraft.class02281;
import minecraft.class02296;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07269;
import minecraft.class07280;
import minecraft.class07299;
import minecraft.class07536;
import minecraft.class07713;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class02261
extends class00394 {
    private final class02296 N = new class02296();
    private final class02274 y = new class02274();
    private final class02264 L = new class02264();
    private class02281 u = class02281.y;

    public class02274 L() {
        return this.y;
    }

    public class02261(class07209 class072092, class00500 class005002) {
        super(class00404.field_48859, class072092, class005002);
    }

    public @Nullable class00381<class07280> i() {
        return class07269.N((class00394)this);
    }

    public class02264 u() {
        return this.L;
    }

    static /* synthetic */ void y(class07299 class072992, class07209 class072092, class00500 class005002) {
        class02261.N((class07299)class072992, (class07209)class072092, (class00500)class005002);
    }

    public void N(class02281 class022812) {
        this.u = class022812;
    }

    public class07001 N(class01929 class019292) {
        return (class07001)class07536.N((Object)new class07001(), class070012 -> class070012.N("shared_data", class02274.y, (DynamicOps)class019292.N((DynamicOps)class07713.N), (Object)this.y));
    }

    public @Nullable class02296 N() {
        return this.z == null || this.z.method_8608() ? null : this.N;
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        class082992.N("server_data", class02296.y).ifPresent(this.N::N);
        this.u = class082992.N("config", class02281.L).orElse(class02281.y);
        class082992.N("shared_data", class02274.y).ifPresent(this.y::N);
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        class083292.N("config", class02281.L, (Object)this.u);
        class083292.N("shared_data", class02274.y, (Object)this.y);
        class083292.N("server_data", class02296.y, (Object)this.N);
    }

    public class02281 R() {
        return this.u;
    }
}

