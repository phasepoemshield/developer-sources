/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  minecraft.class00392
 *  minecraft.class01304
 *  minecraft.class01321
 *  minecraft.class01590
 *  minecraft.class01885
 *  minecraft.class02071
 *  minecraft.class02077
 *  minecraft.class02102
 *  minecraft.class03255
 *  minecraft.class03597
 *  minecraft.class04141
 *  minecraft.class04230
 *  minecraft.class04785
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05227
 *  minecraft.class05231
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class05733
 *  minecraft.class06202
 *  minecraft.class06307
 *  minecraft.class06541
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.LambdaMetafactory;
import java.net.URI;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import minecraft.class00392;
import minecraft.class01304;
import minecraft.class01321;
import minecraft.class01590;
import minecraft.class01885;
import minecraft.class02071;
import minecraft.class02077;
import minecraft.class02102;
import minecraft.class03103;
import minecraft.class03142;
import minecraft.class03255;
import minecraft.class03597;
import minecraft.class04141;
import minecraft.class04230;
import minecraft.class04785;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05227;
import minecraft.class05231;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class05733;
import minecraft.class06202;
import minecraft.class06307;
import minecraft.class06541;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03117
extends class05096 {
    private static final Logger N = LogUtils.getLogger();
    private static final int y = 25;
    private static final class00392 L = class00392.L((String)"recover_world.title").N(class06541.field_1067);
    private static final class00392 u = class00392.L((String)"recover_world.bug_tracker");
    private static final class00392 i = class00392.L((String)"recover_world.restore");
    private static final class00392 R = class00392.L((String)"recover_world.no_fallback");
    private static final class00392 M = class00392.L((String)"recover_world.done.title");
    private static final class00392 B = class00392.L((String)"recover_world.done.success");
    private static final class00392 Z = class00392.L((String)"recover_world.done.failed");
    private static final class00392 z = class00392.L((String)"recover_world.issue.none").N(class06541.field_1060);
    private static final class00392 U = class00392.L((String)"recover_world.issue.missing_file").N(class06541.field_1061);
    private final BooleanConsumer E;
    private final class01885 W = class01885.u().N(8);
    private final class00392 m;
    private final class04230 P;
    private final class04230 s;
    private final class04785 T;

    public class03117(class06202 class062022, BooleanConsumer booleanConsumer, class04785 class047852) {
        super(L);
        this.E = booleanConsumer;
        this.m = class00392.N((String)"recover_world.message", (Object[])new Object[]{class00392.y((String)class047852.R()).N(class06541.field_1080)});
        this.P = new class04230(this.m, (class01590)class062022.i_3);
        this.T = class047852;
        Exception exception = this.N(class047852, false);
        Exception exception2 = this.N(class047852, true);
        class05216 class052162 = class00392.i().y(this.N(class047852, false, exception)).i("\n").y(this.N(class047852, true, exception2));
        this.s = new class04230((class00392)class052162, (class01590)class062022.i_3);
        boolean bl = exception != null && exception2 == null;
        this.W.L().y();
        this.W.N((class02102)new class02071(this.field_22785, (class01590)class062022.i_3));
        this.W.N((class02102)this.P.N(true));
        this.W.N((class02102)this.s);
        class01885 class018852 = class01885.i().N(5);
        class018852.N((class02102)class05362.method_46430((class00392)u, (class05361)class01321.y((class05096)this, (URI)class03597.z)).y(120, 20).N());
        ((class05362)class018852.N((class02102)class05362.method_46430((class00392)class03117.i, (class05361)(class05361)LambdaMetafactory.metafactory(null, null, null, (Lminecraft/class05362;)V, N(minecraft.class06202 minecraft.class05362 ), (Lminecraft/class05362;)V)((class03117)this, (class06202)class062022)).y((int)120, (int)20).N((class04141)(bl ? null : class04141.N((class00392)class03117.R))).N())).field_22763 = bl;
        this.W.N((class02102)class018852);
        this.W.N((class02102)class05362.method_46430((class00392)class05220.U, class053622 -> this.method_25419()).y(120, 20).N());
        this.W.method_48206(arg_0 -> ((class03117)this).method_37063(arg_0));
    }

    private void N(class06202 class062022) {
        Exception exception = this.N(this.T, false);
        Exception exception2 = this.N(this.T, true);
        if (exception == null || exception2 != null) {
            N.error("Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}", (Object)(exception != null ? exception.getMessage() : "no issues"), (Object)(exception2 != null ? exception2.getMessage() : "no issues"));
            class062022.N((class05096)new class01304(() -> this.E.accept(false), M, Z));
            return;
        }
        class062022.y((class05096)new class06307((class00392)class00392.L((String)"recover_world.restoring")));
        class05227.N((class04785)this.T);
        if (this.T.m()) {
            class062022.N((class05096)new class05733(this.E, M, B, class05220.z, class05220.U));
        } else {
            class062022.N((class05096)new class01304(() -> this.E.accept(false), M, Z));
        }
    }

    private /* synthetic */ void N(class06202 class062022, class05362 class053622) {
        this.N(class062022);
    }

    private class00392 N(class04785 class047852, boolean bl, @Nullable Exception exception) {
        if (bl && exception instanceof FileNotFoundException) {
            return class00392.i();
        }
        class05216 class052162 = class00392.i();
        Instant instant = class047852.N(bl);
        class05216 class052163 = instant != null ? class00392.y((String)class05231.N.format(ZonedDateTime.ofInstant(instant, ZoneId.systemDefault()))) : class00392.L((String)"recover_world.state_entry.unknown");
        class052162.y((class00392)class00392.N((String)"recover_world.state_entry", (Object[])new Object[]{class052163.N(class06541.field_1080)}));
        if (exception == null) {
            class052162.y(z);
        } else if (exception instanceof FileNotFoundException) {
            class052162.y(U);
        } else if (exception instanceof class03103) {
            class052162.y((class00392)class00392.y((String)exception.getCause().toString()).N(class06541.field_1061));
        } else {
            class052162.y((class00392)class00392.y((String)exception.toString()).N(class06541.field_1061));
        }
        return class052162;
    }

    private @Nullable Exception N(class04785 class047852, boolean bl) {
        try {
            if (!bl) {
                class047852.N(class047852.B());
            } else {
                class047852.N(class047852.Z());
            }
        }
        catch (IOException | class03103 | class03142 object) {
            return object;
        }
        return null;
    }

    public void method_25426() {
        super.method_25426();
        this.method_48640();
    }

    public void method_48640() {
        this.s.N(this.field_22789 - 50);
        this.P.N(this.field_22789 - 50);
        this.W.N();
        class02077.N((class02102)this.W, (class03255)this.method_48202());
    }

    public void method_25419() {
        this.E.accept(false);
    }

    public class00392 method_25435() {
        return class05220.N((class00392[])new class00392[]{super.method_25435(), this.m});
    }
}

