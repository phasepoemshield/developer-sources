/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class03670;
import minecraft.class03688;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class07078;
import minecraft.class07299;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class03672
extends class03688 {
    public static final String s = "block_state";
    private static final class02131<class00500> T = class03289.N(class03672.class, (class04383)class02154.Z);
    private @Nullable class03670 b;

    public @Nullable class03670 T() {
        return this.b;
    }

    @Override
    public void method_5674(class02131<?> class021312) {
        super.method_5674(class021312);
        if (class021312.equals(T)) {
            this.P = true;
        }
    }

    @Override
    protected void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(T, (Object)class00869.N.W());
    }

    @Override
    protected void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N(s, class00500.N, (Object)this.s());
    }

    @Override
    protected void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N(s, class00500.N).orElse(class00869.N.W()));
    }

    public class03672(class07078<?> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public final class00500 s() {
        return (class00500)this.field_6011.N(T);
    }

    public final void N(class00500 class005002) {
        this.field_6011.N(T, (Object)class005002);
    }

    @Override
    protected void N(boolean bl, float f) {
        this.b = new class03670(this.s());
    }
}

