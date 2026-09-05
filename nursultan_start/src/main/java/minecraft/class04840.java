/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GLX
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderSystem
 *  minecraft.class00570
 *  minecraft.class01285
 *  minecraft.class01894
 *  minecraft.class05834
 *  minecraft.class06202
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Locale;
import minecraft.class00570;
import minecraft.class01285;
import minecraft.class01894;
import minecraft.class05834;
import minecraft.class06202;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class04840
implements class01285 {
    private static final class01894 N = class01894.y((String)"system");

    public void method_72751(class05834 class058342, @Nullable class07299 class072992, @Nullable class00570 class005702, @Nullable class00570 class005703) {
        GpuDevice gpuDevice = RenderSystem.getDevice();
        class058342.N(N, List.of(String.format(Locale.ROOT, "Java: %s", System.getProperty("java.version")), String.format(Locale.ROOT, "CPU: %s", GLX._getCpuInfo()), String.format(Locale.ROOT, "Display: %dx%d (%s)", class06202.Nq().Nt().U(), class06202.Nq().Nt().E(), gpuDevice.getVendor()), gpuDevice.getRenderer(), String.format(Locale.ROOT, "%s %s", gpuDevice.getBackendName(), gpuDevice.getVersion())));
    }

    public boolean method_72753(boolean bl) {
        return true;
    }
}

