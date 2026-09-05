/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.compatibility.environment.probe.GraphicsAdapterVendor
 *  org.jspecify.annotations.NonNull
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.system.Struct
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import net.caffeinemc.mods.sodium.client.compatibility.environment.probe.GraphicsAdapterVendor;
import net.caffeinemc.mods.sodium.client.platform.windows.WindowsFileVersion;
import net.caffeinemc.mods.sodium.client.platform.windows.api.Gdi32;
import net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt.D3DKMT$WDDMAdapterInfo;
import net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt.D3DKMTAdapterInfoStruct;
import net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt.D3DKMTAdapterInfoStruct$Buffer;
import net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt.D3DKMTAdapterRegistryInfoStruct;
import net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt.D3DKMTEnumAdaptersStruct;
import net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt.D3DKMTOpenGLInfoStruct;
import net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt.D3DKMTQueryAdapterInfoStruct;
import net.caffeinemc.mods.sodium.client.platform.windows.api.version.Version;
import net.caffeinemc.mods.sodium.client.platform.windows.api.version.VersionFixedFileInfoStruct;
import net.caffeinemc.mods.sodium.client.platform.windows.api.version.VersionInfo;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Struct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class D3DKMT {
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"Sodium-D3DKMT");

    private static void apiCheckError(String string, int n) {
        if (n != 0) {
            throw new RuntimeException("%s returned non-zero result (error=%s)".formatted(new Object[]{string, Integer.toHexString(n)}));
        }
    }

    private static @NonNull ArrayList<D3DKMT$WDDMAdapterInfo> queryAdapters(@NonNull D3DKMTAdapterInfoStruct$Buffer d3DKMTAdapterInfoStruct$Buffer) {
        ArrayList<D3DKMT$WDDMAdapterInfo> arrayList = new ArrayList<D3DKMT$WDDMAdapterInfo>();
        for (int i = d3DKMTAdapterInfoStruct$Buffer.position(); i < d3DKMTAdapterInfoStruct$Buffer.limit(); ++i) {
            D3DKMTAdapterInfoStruct d3DKMTAdapterInfoStruct = (D3DKMTAdapterInfoStruct)d3DKMTAdapterInfoStruct$Buffer.get(i);
            int n = d3DKMTAdapterInfoStruct.getAdapterHandle();
            D3DKMT$WDDMAdapterInfo d3DKMT$WDDMAdapterInfo = D3DKMT.getAdapterInfo(n);
            if (d3DKMT$WDDMAdapterInfo == null) continue;
            arrayList.add(d3DKMT$WDDMAdapterInfo);
        }
        return arrayList;
    }

    private static @Nullable D3DKMT$WDDMAdapterInfo getAdapterInfo(int n) {
        int n2 = D3DKMT.queryAdapterType(n);
        if (!D3DKMT.isSupportedAdapterType(n2)) {
            return null;
        }
        String string = D3DKMT.queryFriendlyName(n);
        String string2 = D3DKMT.queryDriverFileName(n);
        WindowsFileVersion windowsFileVersion = null;
        GraphicsAdapterVendor graphicsAdapterVendor = GraphicsAdapterVendor.UNKNOWN;
        if (string2 != null) {
            windowsFileVersion = D3DKMT.queryDriverVersion(string2);
            graphicsAdapterVendor = GraphicsAdapterVendor.fromIcdName((String)D3DKMT.getOpenGlIcdName(string2));
        }
        return new D3DKMT$WDDMAdapterInfo(graphicsAdapterVendor, string, n2, string2, windowsFileVersion);
    }

    private static int queryAdapterType(int n) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            IntBuffer intBuffer = memoryStack.callocInt(1);
            D3DKMT.d3dkmtQueryAdapterInfo(n, 15, MemoryUtil.memByteBuffer((IntBuffer)intBuffer));
            int n2 = intBuffer.get(0);
            return n2;
        }
    }

    static String getOpenGlIcdName(@Nullable String string) {
        if (string == null) {
            return null;
        }
        Path path = Paths.get(string, new String[0]).getFileName();
        if (path == null) {
            return null;
        }
        return path.toString();
    }

    private static @Nullable WindowsFileVersion queryDriverVersion(String string) {
        VersionInfo versionInfo = Version.getModuleFileVersion(string);
        if (versionInfo == null) {
            return null;
        }
        VersionFixedFileInfoStruct versionFixedFileInfoStruct = versionInfo.queryFixedFileInfo();
        if (versionFixedFileInfoStruct == null) {
            return null;
        }
        return WindowsFileVersion.fromFileVersion(versionFixedFileInfoStruct);
    }

    private static @NonNull String queryFriendlyName(int n) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            D3DKMTAdapterRegistryInfoStruct d3DKMTAdapterRegistryInfoStruct = D3DKMTAdapterRegistryInfoStruct.calloc(memoryStack);
            D3DKMT.d3dkmtQueryAdapterInfo(n, 8, MemoryUtil.memByteBuffer((Struct)d3DKMTAdapterRegistryInfoStruct));
            String string = d3DKMTAdapterRegistryInfoStruct.getAdapterString();
            if (string == null) {
                string = "<unknown>";
            }
            String string2 = string;
            return string2;
        }
    }

    private static void freeAdapters(@NonNull D3DKMTAdapterInfoStruct$Buffer d3DKMTAdapterInfoStruct$Buffer) {
        for (int i = d3DKMTAdapterInfoStruct$Buffer.position(); i < d3DKMTAdapterInfoStruct$Buffer.limit(); ++i) {
            D3DKMTAdapterInfoStruct d3DKMTAdapterInfoStruct = (D3DKMTAdapterInfoStruct)d3DKMTAdapterInfoStruct$Buffer.get(i);
            D3DKMT.apiCheckError("D3DKMTCloseAdapter", D3DKMT.d3dkmtCloseAdapter(d3DKMTAdapterInfoStruct.getAdapterHandle()));
        }
    }

    private static int d3dkmtCloseAdapter(int n) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            IntBuffer intBuffer = memoryStack.ints(n);
            int n2 = Gdi32.nD3DKMTCloseAdapter(MemoryUtil.memAddress((IntBuffer)intBuffer));
            return n2;
        }
    }

    private static void d3dkmtQueryAdapterInfo(int n, int n2, ByteBuffer byteBuffer) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            D3DKMTQueryAdapterInfoStruct d3DKMTQueryAdapterInfoStruct = D3DKMTQueryAdapterInfoStruct.malloc(memoryStack);
            d3DKMTQueryAdapterInfoStruct.setAdapterHandle(n);
            d3DKMTQueryAdapterInfoStruct.setType(n2);
            d3DKMTQueryAdapterInfoStruct.setDataPointer(MemoryUtil.memAddress((ByteBuffer)byteBuffer));
            d3DKMTQueryAdapterInfoStruct.setDataLength(byteBuffer.remaining());
            D3DKMT.apiCheckError("D3DKMTQueryAdapterInfo", Gdi32.nd3dKmtQueryAdapterInfo(d3DKMTQueryAdapterInfoStruct.address()));
        }
    }

    private static @Nullable String queryDriverFileName(int n) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            D3DKMTOpenGLInfoStruct d3DKMTOpenGLInfoStruct = D3DKMTOpenGLInfoStruct.calloc(memoryStack);
            D3DKMT.d3dkmtQueryAdapterInfo(n, 2, MemoryUtil.memByteBuffer((Struct)d3DKMTOpenGLInfoStruct));
            String string = d3DKMTOpenGLInfoStruct.getUserModeDriverFileName();
            return string;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static List<D3DKMT$WDDMAdapterInfo> findGraphicsAdapters() {
        if (!Gdi32.isD3DKMTSupported()) {
            LOGGER.warn("Unable to query graphics adapters when the operating system is older than Windows 8.0.");
            return List.of();
        }
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            ArrayList<D3DKMT$WDDMAdapterInfo> arrayList;
            D3DKMTEnumAdaptersStruct d3DKMTEnumAdaptersStruct = D3DKMTEnumAdaptersStruct.calloc(memoryStack);
            D3DKMT.apiCheckError("D3DKMTEnumAdapters", Gdi32.nD3DKMTEnumAdapters(d3DKMTEnumAdaptersStruct.address()));
            D3DKMTAdapterInfoStruct$Buffer d3DKMTAdapterInfoStruct$Buffer = d3DKMTEnumAdaptersStruct.getAdapters();
            try {
                arrayList = D3DKMT.queryAdapters(d3DKMTAdapterInfoStruct$Buffer);
            }
            catch (Throwable throwable) {
                D3DKMT.freeAdapters(d3DKMTAdapterInfoStruct$Buffer);
                throw throwable;
            }
            D3DKMT.freeAdapters(d3DKMTAdapterInfoStruct$Buffer);
            return arrayList;
        }
    }

    private static boolean isSupportedAdapterType(int n) {
        if ((n & 1) == 0) {
            return false;
        }
        return (n & 4) == 0;
    }
}

