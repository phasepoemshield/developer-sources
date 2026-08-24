/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ClientModInitializer
 */
package rainpatch;

import java.awt.Desktop;
import java.net.URI;
import net.fabricmc.api.ClientModInitializer;

public final class RainPatchEntryPoint
implements ClientModInitializer {
    private static final String LINK = "https://t.me/wtfcrashdami";

    public void onInitializeClient() {
        System.out.println("Leaked by LORDMAKAVTOJJ && t.me/wtfcrashdami");
        System.setProperty("rain.debug.usernamX", LINK.replace("https://", ""));
        RainPatchEntryPoint.openLink();
        try {
            Class<?> clazz = Class.forName("oxxxde.\u0635\u0635");
            Object object = clazz.getField("INSTANCE").get(null);
            clazz.getMethod("onInitializeClient", new Class[0]).invoke(object, new Object[0]);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private static void openLink() {
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(URI.create(LINK));
                return;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            if (System.getProperty("os.name", "").toLowerCase().contains("win")) {
                Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", "start", "", LINK});
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }
}

