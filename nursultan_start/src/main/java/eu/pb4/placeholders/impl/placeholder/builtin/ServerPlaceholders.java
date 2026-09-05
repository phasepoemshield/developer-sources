/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.PlaceholderResult
 *  eu.pb4.placeholders.api.Placeholders
 *  eu.pb4.placeholders.api.arguments.StringArgs
 *  minecraft.class00392
 *  minecraft.class00518
 *  minecraft.class01772
 *  minecraft.class01894
 *  minecraft.class02796
 *  minecraft.class06394
 *  minecraft.class06541
 *  minecraft.class07806
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  org.apache.commons.lang3.time.DurationFormatUtils
 */
package eu.pb4.placeholders.impl.placeholder.builtin;

import eu.pb4.placeholders.api.PlaceholderResult;
import eu.pb4.placeholders.api.Placeholders;
import eu.pb4.placeholders.api.arguments.StringArgs;
import eu.pb4.placeholders.impl.GeneralUtils;
import eu.pb4.placeholders.impl.placeholder.builtin.ServerPlaceholders$1;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import minecraft.class00392;
import minecraft.class00518;
import minecraft.class01772;
import minecraft.class01894;
import minecraft.class02796;
import minecraft.class06394;
import minecraft.class06541;
import minecraft.class07806;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import org.apache.commons.lang3.time.DurationFormatUtils;

public class ServerPlaceholders {
    public static void register() {
        Placeholders.register((class01894)class01894.N((String)"server", (String)"tps"), (placeholderContext, string) -> {
            double d = (float)TimeUnit.SECONDS.toMillis(1L) / Math.max(placeholderContext.server().yE(), placeholderContext.server().yW().M());
            Object object = "%.1f";
            if (string != null) {
                try {
                    int n = Integer.parseInt(string);
                    object = "%." + n + "f";
                }
                catch (Exception exception) {
                    object = "%.1f";
                }
            }
            return PlaceholderResult.value((String)String.format((String)object, d));
        });
        Placeholders.register((class01894)class01894.N((String)"server", (String)"tps_colored"), (placeholderContext, string) -> {
            double d = (float)TimeUnit.SECONDS.toMillis(1L) / Math.max(placeholderContext.server().yE(), placeholderContext.server().yW().M());
            Object object = "%.1f";
            if (string != null) {
                try {
                    int n = Integer.parseInt(string);
                    object = "%." + n + "f";
                }
                catch (Exception exception) {
                    object = "%.1f";
                }
            }
            return PlaceholderResult.value((class00392)class00392.y((String)String.format((String)object, d)).N(d > 19.0 ? class06541.field_1060 : (d > 16.0 ? class06541.field_1065 : class06541.field_1061)));
        });
        Placeholders.register((class01894)class01894.N((String)"server", (String)"mspt"), (placeholderContext, string) -> PlaceholderResult.value((String)String.format("%.0f", Float.valueOf(placeholderContext.server().yE()))));
        Placeholders.register((class01894)class01894.N((String)"server", (String)"mspt_colored"), (placeholderContext, string) -> {
            float f = placeholderContext.server().yE();
            return PlaceholderResult.value((class00392)class00392.y((String)String.format("%.0f", Float.valueOf(f))).N(f < 45.0f ? class06541.field_1060 : (f < 51.0f ? class06541.field_1065 : class06541.field_1061)));
        });
        Placeholders.register((class01894)class01894.N((String)"server", (String)"time"), (placeholderContext, string) -> {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string != null ? string : "HH:mm:ss");
            return PlaceholderResult.value((String)simpleDateFormat.format(new Date(System.currentTimeMillis())));
        });
        Placeholders.register((class01894)class01894.N((String)"server", (String)"time_new"), (placeholderContext, string) -> {
            StringArgs stringArgs = string == null ? StringArgs.empty() : StringArgs.full((String)string, (char)' ', (char)':');
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(stringArgs.get("format", "HH:mm:ss"));
            LocalDateTime localDateTime = stringArgs.get("zone") != null ? LocalDateTime.now(ZoneId.of(stringArgs.get("zone", ""))) : LocalDateTime.now();
            return PlaceholderResult.value((String)dateTimeFormatter.format(localDateTime));
        });
        ServerPlaceholders$1 serverPlaceholders$1 = new ServerPlaceholders$1();
        Placeholders.register((class01894)class01894.N((String)"server", (String)"uptime"), (placeholderContext, string) -> {
            if (serverPlaceholders$1.server == null || !serverPlaceholders$1.server.refersTo(placeholderContext.server())) {
                serverPlaceholders$1.server = new WeakReference<class02796>(placeholderContext.server());
                serverPlaceholders$1.ms = System.currentTimeMillis() - (long)placeholderContext.server().NF() * 50L;
            }
            return PlaceholderResult.value((String)(string != null ? DurationFormatUtils.formatDuration((long)(System.currentTimeMillis() - serverPlaceholders$1.ms), (String)string, (boolean)true) : GeneralUtils.durationToString((System.currentTimeMillis() - serverPlaceholders$1.ms) / 1000L)));
        });
        Placeholders.register((class01894)class01894.N((String)"server", (String)"version"), (placeholderContext, string) -> PlaceholderResult.value((String)placeholderContext.server().w()));
        Placeholders.register((class01894)class01894.N((String)"server", (String)"motd"), (placeholderContext, string) -> {
            class07806 class078062 = placeholderContext.server().NC();
            if (class078062 == null) {
                return PlaceholderResult.invalid((String)"Server metadata missing!");
            }
            return PlaceholderResult.value((class00392)class078062.N());
        });
        Placeholders.register((class01894)class01894.N((String)"server", (String)"mod_version"), (placeholderContext, string) -> {
            Optional optional;
            if (string != null && (optional = FabricLoader.getInstance().getModContainer(string)).isPresent()) {
                return PlaceholderResult.value((class00392)class00392.y((String)((ModContainer)optional.get()).getMetadata().getVersion().getFriendlyString()));
            }
            return PlaceholderResult.invalid((String)"Invalid argument");
        });
        Placeholders.register((class01894)class01894.N((String)"server", (String)"mod_name"), (placeholderContext, string) -> {
            Optional optional;
            if (string != null && (optional = FabricLoader.getInstance().getModContainer(string)).isPresent()) {
                return PlaceholderResult.value((class00392)class00392.y((String)((ModContainer)optional.get()).getMetadata().getName()));
            }
            return PlaceholderResult.invalid((String)"Invalid argument");
        });
        Placeholders.register((class01894)class01894.N((String)"server", (String)"brand"), (placeholderContext, string) -> PlaceholderResult.value((class00392)class00392.y((String)placeholderContext.server().Ng())));
        Placeholders.register((class01894)class01894.N((String)"server", (String)"mod_count"), (placeholderContext, string) -> PlaceholderResult.value((class00392)class00392.y((String)("" + FabricLoader.getInstance().getAllMods().size()))));
        Placeholders.register((class01894)class01894.N((String)"server", (String)"mod_description"), (placeholderContext, string) -> {
            Optional optional;
            if (string != null && (optional = FabricLoader.getInstance().getModContainer(string)).isPresent()) {
                return PlaceholderResult.value((class00392)class00392.y((String)((ModContainer)optional.get()).getMetadata().getDescription()));
            }
            return PlaceholderResult.invalid((String)"Invalid argument");
        });
        Placeholders.register((class01894)class01894.N((String)"server", (String)"name"), (placeholderContext, string) -> PlaceholderResult.value((String)placeholderContext.server().as_()));
        Placeholders.register((class01894)class01894.N((String)"server", (String)"used_ram"), (placeholderContext, string) -> {
            MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
            MemoryUsage memoryUsage = memoryMXBean.getHeapMemoryUsage();
            return PlaceholderResult.value((String)(Objects.equals(string, "gb") ? String.format("%.1f", Float.valueOf((float)memoryUsage.getUsed() / 1.07374182E9f)) : String.format("%d", memoryUsage.getUsed() / 0x100000L)));
        });
        Placeholders.register((class01894)class01894.N((String)"server", (String)"max_ram"), (placeholderContext, string) -> {
            MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
            MemoryUsage memoryUsage = memoryMXBean.getHeapMemoryUsage();
            return PlaceholderResult.value((String)(Objects.equals(string, "gb") ? String.format("%.1f", Float.valueOf((float)memoryUsage.getMax() / 1.07374182E9f)) : String.format("%d", memoryUsage.getMax() / 0x100000L)));
        });
        Placeholders.register((class01894)class01894.N((String)"server", (String)"online"), (placeholderContext, string) -> PlaceholderResult.value((String)String.valueOf(placeholderContext.server().Nm().m())));
        Placeholders.register((class01894)class01894.N((String)"server", (String)"max_players"), (placeholderContext, string) -> PlaceholderResult.value((String)String.valueOf(placeholderContext.server().Nm().P())));
        Placeholders.register((class01894)class01894.N((String)"server", (String)"objective_name_top"), (placeholderContext, string) -> {
            String[] stringArray = string.split(" ");
            if (stringArray.length >= 2) {
                class06394 class063942 = placeholderContext.server().yB();
                class00518 class005182 = class063942.N(stringArray[0]);
                if (class005182 == null) {
                    return PlaceholderResult.invalid((String)"Invalid objective!");
                }
                try {
                    int n = Integer.parseInt(stringArray[1]);
                    ArrayList<class01772> arrayList = new ArrayList<class01772>(class063942.N(class005182));
                    arrayList.sort(Comparator.comparingInt(class01772::u).reversed());
                    class01772 class017722 = (class01772)arrayList.get(n - 1);
                    return PlaceholderResult.value((class00392)class017722.y());
                }
                catch (Exception exception) {
                    return PlaceholderResult.invalid((String)"Invalid position!");
                }
            }
            return PlaceholderResult.invalid((String)"Not enough arguments!");
        });
        Placeholders.register((class01894)class01894.N((String)"server", (String)"objective_score_top"), (placeholderContext, string) -> {
            String[] stringArray = string.split(" ");
            if (stringArray.length >= 2) {
                class06394 class063942 = placeholderContext.server().yB();
                class00518 class005182 = class063942.N(stringArray[0]);
                if (class005182 == null) {
                    return PlaceholderResult.invalid((String)"Invalid objective!");
                }
                try {
                    int n = Integer.parseInt(stringArray[1]);
                    ArrayList<class01772> arrayList = new ArrayList<class01772>(class063942.N(class005182));
                    arrayList.sort(Comparator.comparingInt(class01772::u).reversed());
                    class01772 class017722 = (class01772)arrayList.get(n - 1);
                    return PlaceholderResult.value((String)String.valueOf(class017722.u()));
                }
                catch (Exception exception) {
                    return PlaceholderResult.invalid((String)"Invalid position!");
                }
            }
            return PlaceholderResult.invalid((String)"Not enough arguments!");
        });
        Placeholders.register((class01894)class01894.N((String)"server", (String)"objective_score_player"), (placeholderContext, string) -> {
            String[] stringArray = string.split(" ");
            if (stringArray.length >= 2) {
                class06394 class063942 = placeholderContext.server().yB();
                class00518 class005182 = class063942.N(stringArray[0]);
                if (class005182 == null) {
                    return PlaceholderResult.invalid((String)"Invalid Objective!");
                }
                try {
                    Collection collection = class063942.N(class005182);
                    class01772 class017723 = (class01772)collection.stream().filter(class017722 -> class017722.y().getString().equals(stringArray[1])).toList().getFirst();
                    return PlaceholderResult.value((String)String.valueOf(class017723.u()));
                }
                catch (Exception exception) {
                    return PlaceholderResult.invalid((String)"Player Not Found!");
                }
            }
            return PlaceholderResult.invalid((String)"Not enough arguments!");
        });
    }
}

