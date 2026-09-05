/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris;

import java.awt.Desktop;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.net.URI;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class LaunchWarn {
    public static void main(String[] stringArray) {
        String string = "This file is the mod version of Iris, meant to be installed as a mod. Would you like to get the Iris Installer instead?";
        String string2 = "This file is the mod version of Iris, meant to be installed as a mod. Please download the Iris Installer from https://irisshaders.dev.";
        if (GraphicsEnvironment.isHeadless()) {
            System.err.println(string2);
        } else {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }
            catch (ReflectiveOperationException | UnsupportedLookAndFeelException exception) {
                // empty catch block
            }
            if (Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                int n = JOptionPane.showOptionDialog(null, string, "Iris Installer", 0, 1, null, null, null);
                if (n == 0) {
                    try {
                        Desktop.getDesktop().browse(URI.create("https://irisshaders.dev"));
                    }
                    catch (IOException iOException) {
                        System.out.println("Welp; we're screwed.");
                        iOException.printStackTrace();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, string2);
            }
        }
        System.exit(0);
    }
}

