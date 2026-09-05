/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  minecraft.class03776
 *  minecraft.class07086
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import minecraft.class03776;
import minecraft.class07086;
import minecraft.class07282;
import minecraft.class07305;
import org.slf4j.Logger;

public final class class07312 {
    private static final Logger N = LogUtils.getLogger();
    private final String y;
    private final class07282 L;
    private final boolean u;
    private final class07086 i;
    private final boolean R;
    private final class07305 M;
    private final class03776 B;

    public boolean L() {
        return this.u;
    }

    public class03776 M() {
        return this.B;
    }

    public class07312(String string, class07282 class072822, boolean bl, class07086 class070862, boolean bl2, class07305 class073052, class03776 class037762) {
        this.y = string;
        this.L = class072822;
        this.u = bl;
        this.i = class070862;
        this.R = bl2;
        this.M = class073052;
        this.B = class037762;
    }

    public class07312 B() {
        return new class07312(this.y, this.L, this.u, this.i, this.R, this.M.y(this.B.y()), this.B);
    }

    public boolean i() {
        return this.R;
    }

    public class07086 u() {
        return this.i;
    }

    public class07282 y() {
        return this.L;
    }

    public class07312 N(class03776 class037762) {
        return new class07312(this.y, this.L, this.u, this.i, this.R, this.M, class037762);
    }

    public class07312 N(class07086 class070862) {
        return new class07312(this.y, this.L, this.u, class070862, this.R, this.M, this.B);
    }

    public String N() {
        return this.y;
    }

    public static class07312 N(Dynamic<?> dynamic, class03776 class037762) {
        class07282 class072822 = class07282.N(dynamic.get("GameType").asInt(0));
        return new class07312(dynamic.get("LevelName").asString(""), class072822, dynamic.get("hardcore").asBoolean(false), dynamic.get("Difficulty").asNumber().map(number -> class07086.N((int)number.byteValue())).result().orElse(class07086.field_5802), dynamic.get("allowCommands").asBoolean(class072822 == class07282.field_9220), (class07305)class07305.N(class037762.y()).parse(dynamic.get("game_rules").orElseEmptyMap()).resultOrPartial(arg_0 -> ((Logger)N).warn(arg_0)).orElseThrow(), class037762);
    }

    public class07312 N(class07282 class072822) {
        return new class07312(this.y, class072822, this.u, this.i, this.R, this.M, this.B);
    }

    public class07305 R() {
        return this.M;
    }
}

