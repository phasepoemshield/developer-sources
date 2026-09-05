/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09435
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.mojang.authlib.ProfileLookupCallback
 *  com.mojang.logging.LogUtils
 *  minecraft.class01487
 *  minecraft.class02796
 *  minecraft.class05018
 *  minecraft.class05071
 *  minecraft.class05152
 *  minecraft.class05170
 *  minecraft.class05623
 *  minecraft.class06633
 *  minecraft.class07408
 *  minecraft.class08774
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class09435;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import minecraft.class01046;
import minecraft.class01049;
import minecraft.class01060;
import minecraft.class01062;
import minecraft.class01070;
import minecraft.class01072;
import minecraft.class01075;
import minecraft.class01077;
import minecraft.class01085;
import minecraft.class01086;
import minecraft.class01487;
import minecraft.class02796;
import minecraft.class05018;
import minecraft.class05071;
import minecraft.class05152;
import minecraft.class05170;
import minecraft.class05623;
import minecraft.class06633;
import minecraft.class07408;
import minecraft.class08774;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01067 {
    static final Logger N = LogUtils.getLogger();
    public static final File y = new File("banned-ips.txt");
    public static final File L = new File("banned-players.txt");
    public static final File u = new File("ops.txt");
    public static final File i = new File("white-list.txt");

    public static boolean L(class02796 class027962) {
        class01077 class010772 = new class01077(class01062.L, (class06633)new class07408());
        if (u.exists() && u.isFile()) {
            if (class010772.L().exists()) {
                try {
                    class010772.M();
                }
                catch (IOException iOException) {
                    N.warn("Could not load existing file {}", (Object)class010772.L().getName(), (Object)iOException);
                }
            }
            try {
                List var2 = Files.readLines((File)u, (Charset)StandardCharsets.UTF_8);
                class01085 class010852 = new class01085(class027962, class010772);
                class01067.N(class027962, var2, class010852);
                class010772.R();
                class01067.y(u);
            }
            catch (IOException iOException) {
                N.warn("Could not read old oplist to convert it!", (Throwable)iOException);
                return false;
            }
            catch (class09435 class094352) {
                N.error("Conversion failed, please try again later", (Throwable)class094352);
                return false;
            }
            return true;
        }
        return true;
    }

    private static File M(class02796 class027962) {
        return class027962.N(class05071.u).toFile();
    }

    public static boolean i(class02796 class027962) {
        boolean bl = class01067.N();
        bl = bl && class01067.R(class027962);
        return bl;
    }

    public static boolean u(class02796 class027962) {
        class05152 class051522 = new class05152(class01062.u, (class06633)new class07408());
        if (i.exists() && i.isFile()) {
            if (class051522.L().exists()) {
                try {
                    class051522.M();
                }
                catch (IOException iOException) {
                    N.warn("Could not load existing file {}", (Object)class051522.L().getName(), (Object)iOException);
                }
            }
            try {
                List var2 = Files.readLines((File)i, (Charset)StandardCharsets.UTF_8);
                class01049 class010492 = new class01049(class027962, class051522);
                class01067.N(class027962, var2, class010492);
                class051522.R();
                class01067.y(i);
            }
            catch (IOException iOException) {
                N.warn("Could not read old whitelist to convert it!", (Throwable)iOException);
                return false;
            }
            catch (class09435 class094352) {
                N.error("Conversion failed, please try again later", (Throwable)class094352);
                return false;
            }
            return true;
        }
        return true;
    }

    private static void y(File file) {
        File file2 = new File(file.getName() + ".converted");
        file.renameTo(file2);
    }

    public static boolean y(class02796 class027962) {
        class01086 class010862 = new class01086(class01062.y, (class06633)new class07408());
        if (y.exists() && y.isFile()) {
            if (class010862.L().exists()) {
                try {
                    class010862.M();
                }
                catch (IOException iOException) {
                    N.warn("Could not load existing file {}", (Object)class010862.L().getName(), (Object)iOException);
                }
            }
            try {
                HashMap hashMap = Maps.newHashMap();
                class01067.N(y, hashMap);
                for (String string : hashMap.keySet()) {
                    String[] stringArray = (String[])hashMap.get(string);
                    Date date = stringArray.length > 1 ? class01067.N(stringArray[1], null) : null;
                    String string2 = stringArray.length > 2 ? stringArray[2] : null;
                    Date date2 = stringArray.length > 3 ? class01067.N(stringArray[3], null) : null;
                    String string3 = stringArray.length > 4 ? stringArray[4] : null;
                    class010862.N(new class01072(string, date, string2, date2, string3));
                }
                class010862.R();
                class01067.y(y);
            }
            catch (IOException iOException) {
                N.warn("Could not parse old ip banlist to convert it!", (Throwable)iOException);
                return false;
            }
            return true;
        }
        return true;
    }

    static List<String> N(File file, Map<String, String[]> map) throws IOException {
        List var2 = Files.readLines((File)file, (Charset)StandardCharsets.UTF_8);
        for (String string : var2) {
            if ((string = string.trim()).startsWith("#") || string.isEmpty()) continue;
            String[] stringArray = string.split("\\|");
            map.put(stringArray[0].toLowerCase(Locale.ROOT), stringArray);
        }
        return var2;
    }

    static Date N(String string, Date date) {
        Date date2;
        try {
            date2 = class01060.N.parse(string);
        }
        catch (ParseException parseException) {
            date2 = date;
        }
        return date2;
    }

    static void N(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            throw new class09435("Can't create directory " + file.getName() + " in world save directory.");
        }
        if (!file.mkdirs()) {
            throw new class09435("Can't create directory " + file.getName() + " in world save directory.");
        }
    }

    public static @Nullable UUID N(class02796 class027962, String string) {
        if (class05018.y((String)string) || string.length() > 16) {
            try {
                return UUID.fromString(string);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return null;
            }
        }
        Optional<UUID> optional = class027962.Nf().R().N(string).map(class08774::N);
        if (optional.isPresent()) {
            return optional.get();
        }
        if (class027962.No() || !class027962.NH()) {
            return class01487.N((String)string);
        }
        ArrayList arrayList = new ArrayList();
        class01046 class010462 = new class01046(class027962, arrayList);
        class01067.N(class027962, Lists.newArrayList((Object[])new String[]{string}), class010462);
        if (!arrayList.isEmpty()) {
            return ((class08774)arrayList.getFirst()).N();
        }
        return null;
    }

    public static boolean N(class02796 class027962) {
        class05170 class051702 = new class05170(class01062.N, (class06633)new class07408());
        if (L.exists() && L.isFile()) {
            if (class051702.L().exists()) {
                try {
                    class051702.M();
                }
                catch (IOException iOException) {
                    N.warn("Could not load existing file {}", (Object)class051702.L().getName(), (Object)iOException);
                }
            }
            try {
                HashMap hashMap = Maps.newHashMap();
                class01067.N(L, hashMap);
                class01070 class010702 = new class01070(class027962, hashMap, class051702);
                class01067.N(class027962, hashMap.keySet(), class010702);
                class051702.R();
                class01067.y(L);
            }
            catch (IOException iOException) {
                N.warn("Could not read old user banlist to convert it!", (Throwable)iOException);
                return false;
            }
            catch (class09435 class094352) {
                N.error("Conversion failed, please try again later", (Throwable)class094352);
                return false;
            }
            return true;
        }
        return true;
    }

    private static void N(class02796 class027962, Collection<String> collection, ProfileLookupCallback profileLookupCallback) {
        String[] stringArray = (String[])collection.stream().filter(string -> !class05018.y((String)string)).toArray(String[]::new);
        if (class027962.NH()) {
            class027962.Nf().i().findProfilesByNames(stringArray, profileLookupCallback);
        } else {
            for (String string2 : stringArray) {
                profileLookupCallback.onProfileLookupSucceeded(string2, class01487.N((String)string2));
            }
        }
    }

    private static boolean N() {
        boolean bl = false;
        if (L.exists() && L.isFile()) {
            bl = true;
        }
        boolean bl2 = false;
        if (y.exists() && y.isFile()) {
            bl2 = true;
        }
        boolean bl3 = false;
        if (u.exists() && u.isFile()) {
            bl3 = true;
        }
        boolean bl4 = false;
        if (i.exists() && i.isFile()) {
            bl4 = true;
        }
        if (bl || bl2 || bl3 || bl4) {
            N.warn("**** FAILED TO START THE SERVER AFTER ACCOUNT CONVERSION!");
            N.warn("** please remove the following files and restart the server:");
            if (bl) {
                N.warn("* {}", (Object)L.getName());
            }
            if (bl2) {
                N.warn("* {}", (Object)y.getName());
            }
            if (bl3) {
                N.warn("* {}", (Object)u.getName());
            }
            if (bl4) {
                N.warn("* {}", (Object)i.getName());
            }
            return false;
        }
        return true;
    }

    public static boolean N(class05623 class056232) {
        File file = class01067.M((class02796)class056232);
        File file2 = new File(file.getParentFile(), "playerdata");
        File file3 = new File(file.getParentFile(), "unknownplayers");
        if (!file.exists() || !file.isDirectory()) {
            return true;
        }
        File[] fileArray = file.listFiles();
        ArrayList arrayList = Lists.newArrayList();
        Object[] objectArray = fileArray;
        int n = objectArray.length;
        for (int i = 0; i < n; ++i) {
            String string;
            String string2 = objectArray[i].getName();
            if (!string2.toLowerCase(Locale.ROOT).endsWith(".dat") || (string = string2.substring(0, string2.length() - ".dat".length())).isEmpty()) continue;
            arrayList.add(string);
        }
        try {
            objectArray = arrayList.toArray(new String[arrayList.size()]);
            class01075 class010752 = new class01075(class056232, file2, file3, file, (String[])objectArray);
            class01067.N((class02796)class056232, Lists.newArrayList((Object[])objectArray), class010752);
        }
        catch (class09435 class094352) {
            N.error("Conversion failed, please try again later", (Throwable)class094352);
            return false;
        }
        return true;
    }

    private static boolean R(class02796 class027962) {
        File file = class01067.M(class027962);
        if (file.exists() && file.isDirectory() && (file.list().length > 0 || !file.delete())) {
            N.warn("**** DETECTED OLD PLAYER DIRECTORY IN THE WORLD SAVE");
            N.warn("**** THIS USUALLY HAPPENS WHEN THE AUTOMATIC CONVERSION FAILED IN SOME WAY");
            N.warn("** please restart the server and if the problem persists, remove the directory '{}'", (Object)file.getPath());
            return false;
        }
        return true;
    }
}

