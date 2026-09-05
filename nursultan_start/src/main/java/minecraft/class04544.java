/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10452
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.logging.LogUtils
 *  com.sun.jna.Memory
 *  com.sun.jna.Native
 *  com.sun.jna.Platform
 *  com.sun.jna.Pointer
 *  com.sun.jna.platform.win32.Kernel32
 *  com.sun.jna.platform.win32.Kernel32Util
 *  com.sun.jna.platform.win32.Tlhelp32$MODULEENTRY32W
 *  com.sun.jna.platform.win32.Version
 *  com.sun.jna.platform.win32.Win32Exception
 *  com.sun.jna.ptr.IntByReference
 *  com.sun.jna.ptr.PointerByReference
 *  minecraft.class07074
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10452;
import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.Kernel32Util;
import com.sun.jna.platform.win32.Tlhelp32;
import com.sun.jna.platform.win32.Version;
import com.sun.jna.platform.win32.Win32Exception;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import minecraft.class04572;
import minecraft.class07074;
import org.slf4j.Logger;

public class class04544 {
    private static final Logger N = LogUtils.getLogger();
    private static final int y = 65535;
    private static final int L = 1033;
    private static final int u = -65536;
    private static final int i = 0x4B00000;

    private static String y(Pointer pointer, String string, IntByReference intByReference) {
        try {
            byte[] byArray = class04544.N(pointer, string, intByReference).getByteArray(0L, (intByReference.getValue() - 1) * 2);
            return new String(byArray, StandardCharsets.UTF_16LE);
        }
        catch (Exception exception) {
            return "";
        }
    }

    public static void N(class07074 class070742) {
        class070742.N("Modules", () -> class04544.N().stream().sorted(Comparator.comparing(class045722 -> class045722.N)).map(class045722 -> "\n\t\t" + String.valueOf(class045722)).collect(Collectors.joining()));
    }

    private static Optional<class10452> N(String string) {
        try {
            IntByReference intByReference = new IntByReference();
            int n = Version.INSTANCE.GetFileVersionInfoSize(string, intByReference);
            if (n == 0) {
                int n2 = Native.getLastError();
                if (n2 == 1813 || n2 == 1812) {
                    return Optional.empty();
                }
                throw new Win32Exception(n2);
            }
            Memory memory = new Memory((long)n);
            if (!Version.INSTANCE.GetFileVersionInfo(string, 0, n, (Pointer)memory)) {
                throw new Win32Exception(Native.getLastError());
            }
            IntByReference intByReference2 = new IntByReference();
            OptionalInt optionalInt = class04544.N(class04544.N((Pointer)memory, "\\VarFileInfo\\Translation", intByReference2).getIntArray(0L, intByReference2.getValue() / 4));
            if (optionalInt.isEmpty()) {
                return Optional.empty();
            }
            int n3 = optionalInt.getAsInt();
            int n4 = n3 & 0xFFFF;
            int n5 = (n3 & 0xFFFF0000) >> 16;
            String string2 = class04544.y((Pointer)memory, class04544.N("FileDescription", n4, n5), intByReference2);
            String string3 = class04544.y((Pointer)memory, class04544.N("CompanyName", n4, n5), intByReference2);
            String string4 = class04544.y((Pointer)memory, class04544.N("FileVersion", n4, n5), intByReference2);
            return Optional.of(new class10452(string2, string4, string3));
        }
        catch (Exception exception) {
            N.info("Failed to find module info for {}", (Object)string, (Object)exception);
            return Optional.empty();
        }
    }

    private static String N(String string, int n, int n2) {
        return String.format(Locale.ROOT, "\\StringFileInfo\\%04x%04x\\%s", n, n2, string);
    }

    private static OptionalInt N(int[] nArray) {
        OptionalInt optionalInt = OptionalInt.empty();
        for (int n : nArray) {
            if ((n & 0xFFFF0000) == 0x4B00000 && (n & 0xFFFF) == 1033) {
                return OptionalInt.of(n);
            }
            optionalInt = OptionalInt.of(n);
        }
        return optionalInt;
    }

    private static Pointer N(Pointer pointer, String string, IntByReference intByReference) {
        PointerByReference pointerByReference = new PointerByReference();
        if (!Version.INSTANCE.VerQueryValue(pointer, string, pointerByReference, intByReference)) {
            throw new UnsupportedOperationException("Can't get version value " + string);
        }
        return pointerByReference.getValue();
    }

    public static List<class04572> N() {
        if (!Platform.isWindows()) {
            return ImmutableList.of();
        }
        int n = Kernel32.INSTANCE.GetCurrentProcessId();
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Tlhelp32.MODULEENTRY32W mODULEENTRY32W : Kernel32Util.getModules((int)n)) {
            String string = mODULEENTRY32W.szModule();
            Optional<class10452> var6 = class04544.N(mODULEENTRY32W.szExePath());
            builder.add((Object)new class04572(string, var6));
        }
        return builder.build();
    }
}

