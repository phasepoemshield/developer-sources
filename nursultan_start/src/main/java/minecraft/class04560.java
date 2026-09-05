/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ca.weblite.objc.Client
 *  ca.weblite.objc.NSObject
 *  com.sun.jna.Pointer
 *  minecraft.class03652
 *  minecraft.class08844
 *  org.lwjgl.glfw.GLFWNativeCocoa
 */
package minecraft;

import ca.weblite.objc.Client;
import ca.weblite.objc.NSObject;
import com.sun.jna.Pointer;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.Locale;
import java.util.Optional;
import minecraft.class03652;
import minecraft.class08844;
import org.lwjgl.glfw.GLFWNativeCocoa;

public class class04560 {
    public static final boolean N = System.getProperty("os.name").toLowerCase(Locale.ROOT).contains("mac");
    private static final int y = 8;
    private static final int L = 16384;

    private static Optional<NSObject> L(class08844 class088442) {
        long l = GLFWNativeCocoa.glfwGetCocoaWindow((long)class088442.B());
        if (l != 0L) {
            return Optional.of(new NSObject(new Pointer(l)));
        }
        return Optional.empty();
    }

    private static void L(NSObject nSObject) {
        nSObject.send("toggleFullScreen:", new Object[]{Pointer.NULL});
    }

    private static long y(NSObject nSObject) {
        return (Long)nSObject.sendRaw("styleMask", new Object[0]);
    }

    public static void y(class08844 class088442) {
        class04560.L(class088442).ifPresent(nSObject -> {
            long l = class04560.y(nSObject);
            nSObject.send("setStyleMask:", new Object[]{l & 0xFFFFFFFFFFFFFFF7L});
        });
    }

    private static boolean N(NSObject nSObject) {
        return (class04560.y(nSObject) & 0x4000L) != 0L;
    }

    public static void N(class03652<InputStream> class036522) throws IOException {
        try (InputStream inputStream = (InputStream)class036522.get();){
            String string = Base64.getEncoder().encodeToString(inputStream.readAllBytes());
            Client client = Client.getInstance();
            Object object = client.sendProxy("NSData", "alloc", new Object[0]).send("initWithBase64Encoding:", new Object[]{string});
            Object object2 = client.sendProxy("NSImage", "alloc", new Object[0]).send("initWithData:", new Object[]{object});
            client.sendProxy("NSApplication", "sharedApplication", new Object[0]).send("setApplicationIconImage:", new Object[]{object2});
        }
    }

    public static void N(class08844 class088442) {
        class04560.L(class088442).filter(class04560::N).ifPresent(class04560::L);
    }
}

