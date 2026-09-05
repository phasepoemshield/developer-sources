/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  minecraft.class01894
 *  minecraft.class02267
 *  minecraft.class03652
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import minecraft.class01591;
import minecraft.class01593;
import minecraft.class01598;
import minecraft.class01603;
import minecraft.class01894;
import minecraft.class02267;
import minecraft.class03652;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01597
extends class01598 {
    static final Logger N = LogUtils.getLogger();
    private final class01591 u;
    private final String i;

    class01597(class02267 class022672, class01591 class015912, String string) {
        super(class022672);
        this.u = class015912;
        this.i = string;
    }

    @Override
    public void close() {
        this.u.close();
    }

    private @Nullable class03652<InputStream> y(String string) {
        ZipFile zipFile = this.u.N();
        if (zipFile == null) {
            return null;
        }
        ZipEntry zipEntry = zipFile.getEntry(this.N(string));
        if (zipEntry == null) {
            return null;
        }
        return class03652.N((ZipFile)zipFile, (ZipEntry)zipEntry);
    }

    private static String N(class01603 class016032, class01894 class018942) {
        return String.format(Locale.ROOT, "%s/%s/%s", class016032.N(), class018942.y(), class018942.N());
    }

    public static String N(String string, String string2) {
        if (!string2.startsWith(string)) {
            return "";
        }
        int n = string.length();
        int n2 = string2.indexOf(47, n);
        if (n2 == -1) {
            return string2.substring(n);
        }
        return string2.substring(n, n2);
    }

    private String N(String string) {
        if (this.i.isEmpty()) {
            return string;
        }
        return this.i + "/" + string;
    }

    @Override
    public @Nullable class03652<InputStream> method_14410(String ... stringArray) {
        return this.y(String.join((CharSequence)"/", stringArray));
    }

    @Override
    public Set<String> method_14406(class01603 class016032) {
        ZipFile zipFile = this.u.N();
        if (zipFile == null) {
            return Set.of();
        }
        Enumeration<? extends ZipEntry> var3 = zipFile.entries();
        HashSet hashSet = Sets.newHashSet();
        String string = this.N(class016032.N() + "/");
        while (var3.hasMoreElements()) {
            String string2 = var3.nextElement().getName();
            String string3 = class01597.N(string, string2);
            if (string3.isEmpty()) continue;
            if (class01894.z((String)string3)) {
                hashSet.add(string3);
                continue;
            }
            N.warn("Non [a-z0-9_.-] character in namespace {} in pack {}, ignoring", (Object)string3, (Object)this.u.N);
        }
        return hashSet;
    }

    @Override
    public class03652<InputStream> method_14405(class01603 class016032, class01894 class018942) {
        return this.y(class01597.N(class016032, class018942));
    }

    @Override
    public void method_14408(class01603 class016032, String string, String string2, class01593 class015932) {
        ZipFile zipFile = this.u.N();
        if (zipFile == null) {
            return;
        }
        Enumeration<? extends ZipEntry> var6 = zipFile.entries();
        String string3 = this.N(class016032.N() + "/" + string + "/");
        String string4 = string3 + string2 + "/";
        while (var6.hasMoreElements()) {
            String string5;
            ZipEntry zipEntry = var6.nextElement();
            if (zipEntry.isDirectory() || !(string5 = zipEntry.getName()).startsWith(string4)) continue;
            String string6 = string5.substring(string3.length());
            class01894 class018942 = class01894.y((String)string, (String)string6);
            if (class018942 != null) {
                class015932.accept(class018942, class03652.N((ZipFile)zipFile, (ZipEntry)zipEntry));
                continue;
            }
            N.warn("Invalid path in datapack: {}:{}, ignoring", (Object)string, (Object)string6);
        }
    }
}

