/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class01285
 *  minecraft.class01582
 *  minecraft.class01894
 *  minecraft.class05834
 *  minecraft.class07299
 *  net.caffeinemc.mods.sodium.client.util.MathUtil
 *  net.caffeinemc.mods.sodium.client.util.NativeBuffer
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import java.lang.management.ManagementFactory;
import java.util.List;
import java.util.Locale;
import minecraft.class00570;
import minecraft.class01285;
import minecraft.class01582;
import minecraft.class01894;
import minecraft.class05834;
import minecraft.class07299;
import net.caffeinemc.mods.sodium.client.util.MathUtil;
import net.caffeinemc.mods.sodium.client.util.NativeBuffer;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04743
implements class01285 {
    private static final class01894 N = class01894.y((String)"memory");
    private final class01582 y = new class01582();

    private static long y() {
        return ManagementFactory.getMemoryMXBean().getNonHeapMemoryUsage().getUsed() + NativeBuffer.getTotalAllocated();
    }

    private void N(class05834 class058342, class07299 class072992, class00570 class005702, class00570 class005703, CallbackInfo callbackInfo) {
        class058342.N(N, class04743.N());
    }

    private static String N() {
        return "Off-Heap: +" + MathUtil.toMib((long)class04743.y()) + "MB";
    }

    private static long N(long l) {
        return l / 1024L / 1024L;
    }

    public void method_72751(class05834 class058342, @Nullable class07299 class072992, @Nullable class00570 class005702, @Nullable class00570 class005703) {
        long l = Runtime.getRuntime().maxMemory();
        long l2 = Runtime.getRuntime().totalMemory();
        long l3 = Runtime.getRuntime().freeMemory();
        long l4 = l2 - l3;
        class058342.N(N, List.of(String.format(Locale.ROOT, "Mem: %2d%% %03d/%03dMB", l4 * 100L / l, class04743.N(l4), class04743.N(l)), String.format(Locale.ROOT, "Allocation rate: %03dMB/s", class04743.N(this.y.N(l4))), String.format(Locale.ROOT, "Allocated: %2d%% %03dMB", l2 * 100L / l, class04743.N(l2))));
        this.N(class058342, class072992, class005702, class005703, null);
    }

    public boolean method_72753(boolean bl) {
        return true;
    }
}

