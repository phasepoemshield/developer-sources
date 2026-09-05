/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  minecraft.class07529
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  net.irisshaders.iris.Iris
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  oshi.SystemInfo
 *  oshi.hardware.CentralProcessor
 *  oshi.hardware.CentralProcessor$ProcessorIdentifier
 *  oshi.hardware.GlobalMemory
 *  oshi.hardware.GraphicsCard
 *  oshi.hardware.HardwareAbstractionLayer
 *  oshi.hardware.PhysicalMemory
 *  oshi.hardware.VirtualMemory
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.lang.management.ManagementFactory;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import minecraft.class07529;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.irisshaders.iris.Iris;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.GraphicsCard;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.PhysicalMemory;
import oshi.hardware.VirtualMemory;

public class class03463 {
    public static final long N = 0x100000L;
    private static final long y = 1000000000L;
    private static final Logger L = LogUtils.getLogger();
    private static final String u = System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version");
    private static final String i = System.getProperty("java.version") + ", " + System.getProperty("java.vendor");
    private static final String R = System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor");
    private final Map<String, String> M = Maps.newLinkedHashMap();

    public class03463() {
        this.N("Minecraft Version", class07529.y().comp_4025());
        this.N("Minecraft Version ID", class07529.y().comp_4024());
        this.N("Operating System", u);
        this.N("Java Version", i);
        this.N("Java VM Version", R);
        this.N("Memory", () -> {
            Runtime runtime = Runtime.getRuntime();
            long l = runtime.maxMemory();
            long l2 = runtime.totalMemory();
            long l3 = runtime.freeMemory();
            long l4 = l / 0x100000L;
            long l5 = l2 / 0x100000L;
            long l6 = l3 / 0x100000L;
            return l3 + " bytes (" + l6 + " MiB) / " + l2 + " bytes (" + l5 + " MiB) up to " + l + " bytes (" + l4 + " MiB)";
        });
        this.N("CPUs", () -> String.valueOf(Runtime.getRuntime().availableProcessors()));
        this.N_39("hardware", () -> this.N(new SystemInfo()));
        this.N("JVM Flags", () -> class03463.N((String string) -> string.startsWith("-X")));
        this.N("Debug Flags", () -> class03463.N((String string) -> string.startsWith("-DMC_DEBUG_")));
        this.N((CallbackInfo)null);
        this.y((CallbackInfo)null);
    }

    private void y(CallbackInfo callbackInfo) {
        if (Iris.getCurrentPackName() == null) {
            return;
        }
        this.N("Loaded Shaderpack", () -> {
            StringBuilder stringBuilder = new StringBuilder(Iris.getCurrentPackName() + (Iris.isFallback() ? " (fallback)" : ""));
            Iris.getCurrentPack().ifPresent(shaderPack -> {
                stringBuilder.append("\n\t\t");
                stringBuilder.append(shaderPack.getProfileInfo());
            });
            return stringBuilder.toString();
        });
    }

    private void y(String string, Supplier<@Nullable String> supplier) {
        String string2 = "Space in storage for " + string + " (MiB)";
        try {
            String string3 = supplier.get();
            if (string3 == null) {
                this.N(string2, "<path not set>");
                return;
            }
            FileStore fileStore = Files.getFileStore(Path.of(string3, new String[0]));
            this.N(string2, String.format(Locale.ROOT, "available: %.2f, total: %.2f", Float.valueOf(class03463.N(fileStore.getUsableSpace())), Float.valueOf(class03463.N(fileStore.getTotalSpace()))));
        }
        catch (InvalidPathException invalidPathException) {
            L.warn("{} is not a path", (Object)string, (Object)invalidPathException);
            this.N(string2, "<invalid path>");
        }
        catch (Exception exception) {
            L.warn("Failed retrieving storage space for {}", (Object)string, (Object)exception);
            this.N(string2, "ERR");
        }
    }

    private void y() {
        this.N("jna.tmpdir");
        this.N("org.lwjgl.system.SharedLibraryExtractPath");
        this.N("io.netty.native.workdir");
        this.N("java.io.tmpdir");
        this.y("workdir", () -> "");
    }

    private void y(List<GraphicsCard> list) {
        int n = 0;
        for (GraphicsCard graphicsCard : list) {
            String string = String.format(Locale.ROOT, "Graphics card #%d ", n++);
            this.N(string + "name", () -> ((GraphicsCard)graphicsCard).getName());
            this.N(string + "vendor", () -> ((GraphicsCard)graphicsCard).getVendor());
            this.N(string + "VRAM (MiB)", () -> String.format(Locale.ROOT, "%.2f", Float.valueOf(class03463.N(graphicsCard.getVRam()))));
            this.N(string + "deviceId", () -> ((GraphicsCard)graphicsCard).getDeviceId());
            this.N(string + "versionInfo", () -> ((GraphicsCard)graphicsCard).getVersionInfo());
        }
    }

    private void N_39(String string, Runnable runnable) {
        try {
            runnable.run();
        }
        catch (Throwable throwable) {
            L.warn("Failed retrieving info for group {}", (Object)string, (Object)throwable);
        }
    }

    private void N(CallbackInfo callbackInfo) {
        this.N("Fabric Mods", () -> {
            ArrayList<ModContainer> arrayList = new ArrayList<ModContainer>();
            for (ModContainer modContainer : FabricLoader.getInstance().getAllMods()) {
                if (!modContainer.getContainingMod().isEmpty()) continue;
                arrayList.add(modContainer);
            }
            StringBuilder stringBuilder = new StringBuilder();
            class03463.N(stringBuilder, 2, arrayList);
            return stringBuilder.toString();
        });
    }

    private void N(SystemInfo systemInfo) {
        HardwareAbstractionLayer hardwareAbstractionLayer = systemInfo.getHardware();
        this.N_39("processor", () -> this.N(hardwareAbstractionLayer.getProcessor()));
        this.N_39("graphics", () -> this.y(hardwareAbstractionLayer.getGraphicsCards()));
        this.N_39("memory", () -> this.N(hardwareAbstractionLayer.getMemory()));
        this.N_39("storage", this::y);
    }

    public static float N(long l) {
        return (float)l / 1048576.0f;
    }

    private void N(List<PhysicalMemory> list) {
        int n = 0;
        for (PhysicalMemory physicalMemory : list) {
            String string = String.format(Locale.ROOT, "Memory slot #%d ", n++);
            this.N(string + "capacity (MiB)", () -> String.format(Locale.ROOT, "%.2f", Float.valueOf(class03463.N(physicalMemory.getCapacity()))));
            this.N(string + "clockSpeed (GHz)", () -> String.format(Locale.ROOT, "%.2f", Float.valueOf((float)physicalMemory.getClockSpeed() / 1.0E9f)));
            this.N(string + "type", () -> ((PhysicalMemory)physicalMemory).getMemoryType());
        }
    }

    private void N(VirtualMemory virtualMemory) {
        this.N("Virtual memory max (MiB)", () -> String.format(Locale.ROOT, "%.2f", Float.valueOf(class03463.N(virtualMemory.getVirtualMax()))));
        this.N("Virtual memory used (MiB)", () -> String.format(Locale.ROOT, "%.2f", Float.valueOf(class03463.N(virtualMemory.getVirtualInUse()))));
        this.N("Swap memory total (MiB)", () -> String.format(Locale.ROOT, "%.2f", Float.valueOf(class03463.N(virtualMemory.getSwapTotal()))));
        this.N("Swap memory used (MiB)", () -> String.format(Locale.ROOT, "%.2f", Float.valueOf(class03463.N(virtualMemory.getSwapUsed()))));
    }

    private static String N(Predicate<String> predicate) {
        List list = ManagementFactory.getRuntimeMXBean().getInputArguments().stream().filter(predicate).toList();
        return String.format(Locale.ROOT, "%d total; %s", list.size(), String.join((CharSequence)" ", list));
    }

    public void N(String string, String string2) {
        this.M.put(string, string2);
    }

    public void N(String string, Supplier<String> supplier) {
        try {
            this.N(string, supplier.get());
        }
        catch (Exception exception) {
            L.warn("Failed to get system info for {}", (Object)string, (Object)exception);
            this.N(string, "ERR");
        }
    }

    private static void N(StringBuilder stringBuilder, int n, ArrayList arrayList) {
        arrayList.sort(Comparator.comparing(modContainer -> modContainer.getMetadata().getId()));
        for (ModContainer modContainer2 : arrayList) {
            stringBuilder.append('\n');
            stringBuilder.append("\t".repeat(n));
            stringBuilder.append(modContainer2.getMetadata().getId());
            stringBuilder.append(": ");
            stringBuilder.append(modContainer2.getMetadata().getName());
            stringBuilder.append(' ');
            stringBuilder.append(modContainer2.getMetadata().getVersion().getFriendlyString());
            if (modContainer2.getContainedMods().isEmpty()) continue;
            ArrayList arrayList2 = new ArrayList(modContainer2.getContainedMods());
            class03463.N(stringBuilder, n + 1, arrayList2);
        }
    }

    public void N(StringBuilder stringBuilder) {
        stringBuilder.append("-- ").append("System Details").append(" --\n");
        stringBuilder.append("Details:");
        this.M.forEach((string, string2) -> {
            stringBuilder.append("\n\t");
            stringBuilder.append((String)string);
            stringBuilder.append(": ");
            stringBuilder.append((String)string2);
        });
    }

    public String N() {
        return this.M.entrySet().stream().map(entry -> (String)entry.getKey() + ": " + (String)entry.getValue()).collect(Collectors.joining(System.lineSeparator()));
    }

    private void N(GlobalMemory globalMemory) {
        this.N_39("physical memory", () -> this.N(globalMemory.getPhysicalMemory()));
        this.N_39("virtual memory", () -> this.N(globalMemory.getVirtualMemory()));
    }

    private void N(CentralProcessor centralProcessor) {
        CentralProcessor.ProcessorIdentifier processorIdentifier = centralProcessor.getProcessorIdentifier();
        this.N("Processor Vendor", () -> ((CentralProcessor.ProcessorIdentifier)processorIdentifier).getVendor());
        this.N("Processor Name", () -> ((CentralProcessor.ProcessorIdentifier)processorIdentifier).getName());
        this.N("Identifier", () -> ((CentralProcessor.ProcessorIdentifier)processorIdentifier).getIdentifier());
        this.N("Microarchitecture", () -> ((CentralProcessor.ProcessorIdentifier)processorIdentifier).getMicroarchitecture());
        this.N("Frequency (GHz)", () -> String.format(Locale.ROOT, "%.2f", Float.valueOf((float)processorIdentifier.getVendorFreq() / 1.0E9f)));
        this.N("Number of physical packages", () -> String.valueOf(centralProcessor.getPhysicalPackageCount()));
        this.N("Number of physical CPUs", () -> String.valueOf(centralProcessor.getPhysicalProcessorCount()));
        this.N("Number of logical CPUs", () -> String.valueOf(centralProcessor.getLogicalProcessorCount()));
    }

    private void N(String string) {
        this.y(string, () -> System.getProperty(string));
    }
}

