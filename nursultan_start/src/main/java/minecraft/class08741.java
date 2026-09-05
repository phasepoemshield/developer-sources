/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GLX
 *  com.mojang.blaze3d.systems.GpuDevice
 *  minecraft.class07533
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.GpuDevice;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import minecraft.class07533;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public class class08741 {
    private static final List<String> N = List.of("i3-1000g1", "i3-1000g4", "i3-1000ng4", "i3-1005g1", "i3-l13g4", "i5-1030g4", "i5-1030g7", "i5-1030ng7", "i5-1034g1", "i5-1035g1", "i5-1035g4", "i5-1035g7", "i5-1038ng7", "i5-l16g7", "i7-1060g7", "i7-1060ng7", "i7-1065g7", "i7-1068g7", "i7-1068ng7");
    private static final List<String> y = List.of("x6211e", "x6212re", "x6214re", "x6413e", "x6414re", "x6416re", "x6425e", "x6425re", "x6427fe");
    private static final List<String> L = List.of("j6412", "j6413", "n4500", "n4505", "n5095", "n5095a", "n5100", "n5105", "n6210", "n6211");
    private static final List<String> u = List.of("6805", "j6426", "n6415", "n6000", "n6005");
    private static @Nullable class08741 i;
    private final WeakReference<GpuDevice> R;
    private final boolean M;
    private final boolean B;
    private final boolean Z;

    public boolean L() {
        return this.Z;
    }

    private static boolean L(GpuDevice gpuDevice) {
        return class07536.m() == class07533.field_1133 && class07536.P() || gpuDevice.getRenderer().startsWith("D3D12");
    }

    private class08741(GpuDevice gpuDevice) {
        this.R = new WeakReference<GpuDevice>(gpuDevice);
        this.M = class08741.y(gpuDevice);
        this.B = class08741.L(gpuDevice);
        this.Z = class08741.u(gpuDevice);
    }

    private static boolean u(GpuDevice gpuDevice) {
        return gpuDevice.getRenderer().contains("AMD");
    }

    public boolean y() {
        return this.B;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean y(GpuDevice gpuDevice) {
        String string = GLX._getCpuInfo().toLowerCase(Locale.ROOT);
        String string2 = gpuDevice.getRenderer().toLowerCase(Locale.ROOT);
        if (!string.contains("intel")) return false;
        if (!string2.contains("intel")) return false;
        if (string2.contains("mesa")) {
            return false;
        }
        if (string2.endsWith("gen11")) {
            return true;
        }
        if (!string2.contains("uhd graphics") && !string2.contains("iris")) {
            return false;
        }
        if (string.contains("atom")) {
            if (y.stream().anyMatch(string::contains)) return true;
        }
        if (string.contains("celeron")) {
            if (L.stream().anyMatch(string::contains)) return true;
        }
        if (string.contains("pentium")) {
            if (u.stream().anyMatch(string::contains)) return true;
        }
        if (!N.stream().anyMatch(string::contains)) return false;
        return true;
    }

    public boolean N() {
        return this.M;
    }

    public static class08741 N(GpuDevice gpuDevice) {
        class08741 class087412 = i;
        if (class087412 == null || class087412.R.get() != gpuDevice) {
            i = class087412 = new class08741(gpuDevice);
        }
        return class087412;
    }
}

