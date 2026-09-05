/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.BanDetails
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class01321
 *  minecraft.class01980
 *  minecraft.class03597
 *  minecraft.class05220
 *  minecraft.class06541
 *  minecraft.class07536
 *  org.apache.commons.lang3.StringUtils
 */
package minecraft;

import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01321;
import minecraft.class01980;
import minecraft.class03597;
import minecraft.class05220;
import minecraft.class06541;
import minecraft.class07536;
import org.apache.commons.lang3.StringUtils;

public class class03051 {
    private static final class00392 y = class00392.L((String)"gui.banned.title.temporary").N(class06541.field_1067);
    private static final class00392 L = class00392.L((String)"gui.banned.title.permanent").N(class06541.field_1067);
    public static final class00392 N = class00392.L((String)"gui.banned.name.title").N(class06541.field_1067);
    private static final class00392 u = class00392.L((String)"gui.banned.skin.title").N(class06541.field_1067);
    private static final class00392 i = class00392.N((String)"gui.banned.skin.description", (Object[])new Object[]{class00392.N((URI)class03597.m)});

    private static class00392 L(BanDetails banDetails) {
        String string = banDetails.reason();
        String string2 = banDetails.reasonMessage();
        if (StringUtils.isNumeric((CharSequence)string)) {
            int n = Integer.parseInt(string);
            class01980 class019802 = class01980.N((int)n);
            Object object = class019802 != null ? class00390.N((class00392)class019802.N(), (class00405)class00405.N.N(Boolean.valueOf(true))) : (string2 != null ? class00392.N((String)"gui.banned.description.reason_id_message", (Object[])new Object[]{n, string2}).N(class06541.field_1067) : class00392.N((String)"gui.banned.description.reason_id", (Object[])new Object[]{n}).N(class06541.field_1067));
            return class00392.N((String)"gui.banned.description.reason", (Object[])new Object[]{object});
        }
        return class00392.L((String)"gui.banned.description.unknownreason");
    }

    private static class00392 i(BanDetails banDetails) {
        Duration duration = Duration.between(Instant.now(), banDetails.expires());
        long l = duration.toHours();
        if (l > 72L) {
            return class05220.N((long)duration.toDays());
        }
        if (l < 1L) {
            return class05220.L((long)duration.toMinutes());
        }
        return class05220.y((long)duration.toHours());
    }

    private static class00392 u(BanDetails banDetails) {
        if (class03051.R(banDetails)) {
            class00392 class003922 = class03051.i(banDetails);
            return class00392.N((String)"gui.banned.description.temporary", (Object[])new Object[]{class00392.N((String)"gui.banned.description.temporary.duration", (Object[])new Object[]{class003922}).N(class06541.field_1067)});
        }
        return class00392.L((String)"gui.banned.description.permanent").N(class06541.field_1067);
    }

    private static class00392 y(BanDetails banDetails) {
        return class00392.N((String)"gui.banned.description", (Object[])new Object[]{class03051.L(banDetails), class03051.u(banDetails), class00392.N((URI)class03597.m)});
    }

    public static class01321 N(Runnable runnable) {
        URI uRI = class03597.m;
        return new class01321(bl -> {
            if (bl) {
                class07536.m().N(uRI);
            }
            runnable.run();
        }, u, i, uRI, class05220.W, true);
    }

    public static class01321 N(BooleanConsumer booleanConsumer, BanDetails banDetails) {
        return new class01321(booleanConsumer, class03051.N(banDetails), class03051.y(banDetails), class03597.m, class05220.W, true);
    }

    private static class00392 N(BanDetails banDetails) {
        return class03051.R(banDetails) ? y : L;
    }

    public static class01321 N(String string, Runnable runnable) {
        URI uRI = class03597.m;
        return new class01321(bl -> {
            if (bl) {
                class07536.m().N(uRI);
            }
            runnable.run();
        }, N, (class00392)class00392.N((String)"gui.banned.name.description", (Object[])new Object[]{class00392.y((String)string).N(class06541.field_1054), class00392.N((URI)class03597.m)}), uRI, class05220.W, true);
    }

    private static boolean R(BanDetails banDetails) {
        return banDetails.expires() != null;
    }
}

