/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ibm.icu.text.DateFormat
 *  com.ibm.icu.text.SimpleDateFormat
 *  com.ibm.icu.util.Calendar
 *  com.ibm.icu.util.TimeZone
 *  com.ibm.icu.util.ULocale
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00336
 *  minecraft.class00372
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class06584
 *  minecraft.class07438
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.TimeZone;
import com.ibm.icu.util.ULocale;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Date;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import minecraft.class00336;
import minecraft.class00372;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class06584;
import minecraft.class07438;
import minecraft.class07536;
import minecraft.class08340;
import org.jspecify.annotations.Nullable;

public class class08351
implements class00372<String> {
    public static final String N = "";
    private static final long u = TimeUnit.SECONDS.toMillis(1L);
    public static final Codec<String> y = Codec.STRING;
    private static final Codec<TimeZone> i = y.comapFlatMap(string -> {
        TimeZone timeZone = TimeZone.getTimeZone((String)string);
        if (timeZone.equals((Object)TimeZone.UNKNOWN_ZONE)) {
            return DataResult.error(() -> "Unknown timezone: " + string);
        }
        return DataResult.success((Object)timeZone);
    }, TimeZone::getID);
    private static final MapCodec<class08340> R = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.fieldOf("pattern").forGetter(class083402 -> class083402.N()), (App)Codec.STRING.optionalFieldOf("locale", (Object)N).forGetter(class083402 -> class083402.y()), (App)i.optionalFieldOf("time_zone").forGetter(class083402 -> class083402.L())).apply(instance, class08340::new));
    public static final class00336<class08351, String> L = class00336.N((MapCodec)R.flatXmap(class08351::N, class083512 -> DataResult.success((Object)((Object)class083512.M))), y);
    private final class08340 M;
    private final DateFormat B;
    private long Z;
    private String z = "";

    private String L() {
        return this.B.format(new Date());
    }

    private class08351(class08340 class083402, DateFormat dateFormat) {
        this.M = class083402;
        this.B = dateFormat;
    }

    public Codec<String> y() {
        return y;
    }

    private static DataResult<class08351> N(class08340 class083402) {
        ULocale uLocale = new ULocale(class083402.y());
        Calendar calendar = class083402.L().map(timeZone -> Calendar.getInstance((TimeZone)timeZone, (ULocale)uLocale)).orElseGet(() -> Calendar.getInstance((ULocale)uLocale));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(class083402.N(), uLocale);
        simpleDateFormat.setCalendar(calendar);
        try {
            simpleDateFormat.format(new Date());
        }
        catch (Exception exception) {
            return DataResult.error(() -> "Invalid time format '" + String.valueOf(simpleDateFormat) + "': " + exception.getMessage());
        }
        return DataResult.success((Object)new class08351(class083402, (DateFormat)simpleDateFormat));
    }

    public static class08351 N(String string2, String string3, Optional<TimeZone> optional) {
        return (class08351)class08351.N(new class08340(string2, string3, optional)).getOrThrow(string -> new IllegalStateException("Failed to validate format: " + string));
    }

    public class00336<class08351, String> N() {
        return L;
    }

    public @Nullable String y(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382, int n, class03662 class036622) {
        long l = class07536.L();
        if (l > this.Z) {
            this.z = this.L();
            this.Z = l + u;
        }
        return this.z;
    }
}

