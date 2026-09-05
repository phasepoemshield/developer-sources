/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.desktop;

import java.awt.GraphicsEnvironment;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import net.caffeinemc.mods.sodium.desktop.utils.browse.BrowseUrlHandler;

public class LaunchWarn {
    private static final String HELP_URL = "https://link.caffeinemc.net/guides/sodium/installation";
    private static final String RICH_MESSAGE = "<html><body><p style='width: 600px; padding: 0 0 8px 0;'>You have tried to launch Sodium (a Minecraft mod) directly, but it is not an executable program or mod installer. Instead, you must install Fabric Loader for Minecraft, and then place this file in your mods directory.</p><p style='width: 600px; padding: 0 0 8px 0;'>If this is your first time installing mods with Fabric Loader, then click the \"Help\" button for an installation guide.</p></body></html>";
    private static final String FALLBACK_MESSAGE = "<html><body><p style='width: 600px; padding: 0 0 8px 0;'>You have tried to launch Sodium (a Minecraft mod) directly, but it is not an executable program or mod installer. Instead, you must install Fabric Loader for Minecraft, and then place this file in your mods directory.</p><p style='width: 600px; padding: 0 0 8px 0;'>If this is your first time installing mods with Fabric Loader, then visit <i>https://link.caffeinemc.net/guides/sodium/installation</i> for an installation guide.</p></body></html>";
    private static final String FAILED_TO_BROWSE_MESSAGE = "<html><body><p style='width: 400px; padding: 0 0 8px 0;'>Failed to open the default browser! Your system may be misconfigured. Please open the URL <i>https://link.caffeinemc.net/guides/sodium/installation</i> manually.</p></body></html>";
    public static final String WINDOW_TITLE = "Sodium";

    public static void main(String[] stringArray) {
        if (GraphicsEnvironment.isHeadless()) {
            LaunchWarn.showHeadlessError();
        } else {
            LaunchWarn.showGraphicalError();
        }
    }

    private static void log(String string, Throwable throwable) {
        System.err.println(string);
        throwable.printStackTrace(System.err);
    }

    private static void log(String string) {
        System.err.println(string);
    }

    private static void trySetSystemFontPreferences() {
        System.setProperty("awt.useSystemAAFontSettings", "on");
    }

    private static void showFallbackGraphicalDialog() {
        LaunchWarn.showDialogBox(FALLBACK_MESSAGE, WINDOW_TITLE, -1, 1, null, null);
    }

    private static void showHeadlessError() {
        System.err.println(FALLBACK_MESSAGE);
    }

    private static void showGraphicalError() {
        LaunchWarn.trySetSystemLookAndFeel();
        LaunchWarn.trySetSystemFontPreferences();
        BrowseUrlHandler browseUrlHandler = BrowseUrlHandler.createImplementation();
        if (browseUrlHandler != null) {
            LaunchWarn.showRichGraphicalDialog(browseUrlHandler);
        } else {
            LaunchWarn.showFallbackGraphicalDialog();
        }
        System.exit(0);
    }

    private static int showDialogBox(String string, String string2, int n, int n2, String[] stringArray, Object object) {
        JOptionPane jOptionPane = new JOptionPane(string, n2, n, null, stringArray, object);
        JDialog jDialog = jOptionPane.createDialog(string2);
        jDialog.setVisible(true);
        Object object2 = jOptionPane.getValue();
        if (object2 == null) {
            return -1;
        }
        if (stringArray == null) {
            if (object2 instanceof Integer) {
                return (Integer)object2;
            }
            return -1;
        }
        for (int i = 0; i < stringArray.length; ++i) {
            String string3 = stringArray[i];
            if (!string3.equals(object2)) continue;
            return i;
        }
        return -1;
    }

    private static void trySetSystemLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (ReflectiveOperationException | UnsupportedLookAndFeelException exception) {
            // empty catch block
        }
    }

    private static void showRichGraphicalDialog(BrowseUrlHandler browseUrlHandler) {
        int n = LaunchWarn.showDialogBox(RICH_MESSAGE, WINDOW_TITLE, 0, 1, new String[]{"Help", "Close"}, 0);
        if (n == 0) {
            LaunchWarn.log("Opening URL: https://link.caffeinemc.net/guides/sodium/installation");
            try {
                browseUrlHandler.browseTo(HELP_URL);
            }
            catch (IOException iOException) {
                LaunchWarn.log("Failed to open default web browser!", iOException);
                LaunchWarn.showDialogBox(FAILED_TO_BROWSE_MESSAGE, WINDOW_TITLE, -1, 2, null, -1);
            }
        }
    }
}

