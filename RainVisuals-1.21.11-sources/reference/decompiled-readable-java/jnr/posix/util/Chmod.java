/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix.util;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Chmod {
    private static final boolean CHMOD_API_AVAILABLE;
    private static final Method setReadable;
    private static final Method setWritable;
    private static final Method setExecutable;

    /*
     * WARNING - void declaration
     */
    static {
        void var0;
        void var3_3;
        void var2_2;
        void var1_1;
        boolean apiAvailable = false;
        Method setWritableVar = null;
        Method setReadableVar = null;
        Method setExecutableVar = null;
        try {
            Class[] classArray = new Class[2];
            classArray[0] = Boolean.TYPE;
            classArray[1] = Boolean.TYPE;
            setWritableVar = File.class.getMethod("setWritable", classArray);
            Class[] classArray2 = new Class[2];
            classArray2[0] = Boolean.TYPE;
            classArray2[1] = Boolean.TYPE;
            setReadableVar = File.class.getMethod("setReadable", classArray2);
            Class[] classArray3 = new Class[2];
            classArray3[0] = Boolean.TYPE;
            classArray3[1] = Boolean.TYPE;
            setExecutableVar = File.class.getMethod("setExecutable", classArray3);
            apiAvailable = true;
        }
        catch (Exception exception) {
            // empty catch block
        }
        setWritable = var1_1;
        setReadable = var2_2;
        setExecutable = var3_3;
        CHMOD_API_AVAILABLE = var0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean setPermissions(File file, char permChar, boolean userOnly) {
        int permValue = Character.digit(permChar, 8);
        try {
            if ((permValue & 1) != 0) {
                Object[] objectArray = new Object[2];
                objectArray[0] = Boolean.TRUE;
                objectArray[1] = userOnly;
                setExecutable.invoke((Object)file, objectArray);
            } else {
                Object[] objectArray = new Object[2];
                objectArray[0] = Boolean.FALSE;
                objectArray[1] = userOnly;
                setExecutable.invoke((Object)file, objectArray);
            }
            if ((permValue & 2) != 0) {
                Object[] objectArray = new Object[2];
                objectArray[0] = Boolean.TRUE;
                objectArray[1] = userOnly;
                setWritable.invoke((Object)file, objectArray);
            } else {
                Object[] objectArray = new Object[2];
                objectArray[0] = Boolean.FALSE;
                objectArray[1] = userOnly;
                setWritable.invoke((Object)file, objectArray);
            }
            if ((permValue & 4) != 0) {
                Object[] objectArray = new Object[2];
                objectArray[0] = Boolean.TRUE;
                objectArray[1] = userOnly;
                setReadable.invoke((Object)file, objectArray);
            } else {
                void var2_2;
                Object[] objectArray = new Object[2];
                objectArray[0] = Boolean.FALSE;
                objectArray[1] = (boolean)var2_2;
                setReadable.invoke((Object)file, objectArray);
            }
            return true;
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public static int chmod(File file, String mode) {
        if (CHMOD_API_AVAILABLE) {
            char other = '0';
            if (mode.length() >= 1) {
                other = mode.charAt(mode.length() - 1);
            }
            char user = '0';
            if (mode.length() >= 3) {
                user = mode.charAt(mode.length() - 3);
            }
            if (!Chmod.setPermissions(file, other, false)) {
                return -1;
            }
            if (!Chmod.setPermissions(file, user, true)) {
                return -1;
            }
            return 0;
        }
        try {
            void ie;
            Process chmod = Runtime.getRuntime().exec("/bin/chmod " + mode + " " + file.getAbsolutePath());
            chmod.waitFor();
            return ie.exitValue();
        }
        catch (IOException iOException) {
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
        return -1;
    }
}

