/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt.D3DKMT
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.caffeinemc.mods.sodium.client.compatibility.environment.probe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import net.caffeinemc.mods.sodium.client.compatibility.environment.OsUtils;
import net.caffeinemc.mods.sodium.client.compatibility.environment.OsUtils$OperatingSystem;
import net.caffeinemc.mods.sodium.client.compatibility.environment.probe.GraphicsAdapterInfo;
import net.caffeinemc.mods.sodium.client.compatibility.environment.probe.GraphicsAdapterInfo$LinuxPciAdapterInfo;
import net.caffeinemc.mods.sodium.client.compatibility.environment.probe.GraphicsAdapterVendor;
import net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt.D3DKMT;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GraphicsAdapterProbe {
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"Sodium-GraphicsAdapterProbe");
    private static final Set<String> LINUX_PCI_CLASSES = Set.of("0x030000", "0x030001", "0x030200", "0x038000");
    private static List<? extends GraphicsAdapterInfo> ADAPTERS = List.of();

    public static void findAdapters() {
        List<? extends GraphicsAdapterInfo> list;
        LOGGER.info("Searching for graphics cards...");
        try {
            list = switch (OsUtils.getOs()) {
                case OsUtils$OperatingSystem.WIN -> GraphicsAdapterProbe.findAdapters$Windows();
                case OsUtils$OperatingSystem.LINUX -> GraphicsAdapterProbe.findAdapters$Linux();
                default -> null;
            };
        }
        catch (Exception exception) {
            LOGGER.error("Failed to find graphics adapters!", (Throwable)exception);
            return;
        }
        if (list == null) {
            return;
        }
        if (list.isEmpty()) {
            LOGGER.warn("Could not find any graphics adapters! Probably the device is not on a bus we can probe, or there are no devices supporting 3D acceleration.");
        } else {
            for (GraphicsAdapterInfo graphicsAdapterInfo : list) {
                LOGGER.info("Found graphics adapter: {}", (Object)graphicsAdapterInfo);
            }
        }
        ADAPTERS = list;
    }

    private static List<? extends GraphicsAdapterInfo> findAdapters$Linux() {
        ArrayList<GraphicsAdapterInfo$LinuxPciAdapterInfo> arrayList = new ArrayList<GraphicsAdapterInfo$LinuxPciAdapterInfo>();
        try (Stream<Path> stream = Files.list(Path.of("/sys/bus/pci/devices/", new String[0]));){
            Iterable iterable = stream::iterator;
            for (Path path : iterable) {
                String string = Files.readString(path.resolve("class")).trim();
                if (!LINUX_PCI_CLASSES.contains(string)) continue;
                String string2 = Files.readString(path.resolve("vendor")).trim();
                String string3 = Files.readString(path.resolve("device")).trim();
                GraphicsAdapterVendor graphicsAdapterVendor = GraphicsAdapterVendor.fromPciVendorId(string2);
                String string4 = GraphicsAdapterProbe.getPciDeviceName$Linux(string2, string3);
                if (string4 == null) {
                    string4 = "<unknown>";
                }
                GraphicsAdapterInfo$LinuxPciAdapterInfo graphicsAdapterInfo$LinuxPciAdapterInfo = new GraphicsAdapterInfo$LinuxPciAdapterInfo(graphicsAdapterVendor, string4, string2, string3);
                arrayList.add(graphicsAdapterInfo$LinuxPciAdapterInfo);
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return arrayList;
    }

    public static Collection<? extends GraphicsAdapterInfo> getAdapters() {
        if (ADAPTERS == null) {
            LOGGER.error("Graphics adapters not probed yet; returning an empty list.");
            return Collections.emptyList();
        }
        return ADAPTERS;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static @Nullable String getPciDeviceName$Linux(String string, String string2) {
        String string3 = string.substring(2) + ":" + string2.substring(2);
        try {
            Process process = Runtime.getRuntime().exec(new String[]{"lspci", "-vmm", "-d", string3});
            int n = process.waitFor();
            if (n != 0) {
                throw new IOException("lspci exited with error code: %s".formatted(new Object[]{n}));
            }
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));){
                String string4;
                do {
                    if ((string4 = bufferedReader.readLine()) == null) throw new IOException("lspci did not return a device name");
                } while (!string4.startsWith("Device:"));
                String string5 = string4.substring("Device:".length()).trim();
                return string5;
            }
        }
        catch (Throwable throwable) {
            LOGGER.warn("Failed to query PCI device name for %s:%s".formatted(new Object[]{string, string2}), throwable);
            return null;
        }
    }

    private static List<? extends GraphicsAdapterInfo> findAdapters$Windows() {
        return D3DKMT.findGraphicsAdapters();
    }
}

