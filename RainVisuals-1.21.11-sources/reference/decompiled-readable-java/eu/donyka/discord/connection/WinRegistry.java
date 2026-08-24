/*
 * Decompiled with CFR 0.152.
 */
package eu.donyka.discord.connection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.prefs.Preferences;

class WinRegistry {
    private static final Method regSetValueEx;
    private static final Method regCreateKeyEx;
    private static final Method regCloseKey;
    private static final Method regQueryValueEx;
    static final Preferences userRoot;
    private static final Method regOpenKey;
    private static final Class<? extends Preferences> userClass;
    private static final int KEY_READ = 131097;
    private static final int KEY_ALL_ACCESS = 983103;
    static final int HKEY_CURRENT_USER = -2147483647;
    private static final int REG_SUCCESS = 0;

    static void writeStringValue(String key, String valueName, String value) throws InvocationTargetException, IllegalAccessException, IllegalArgumentException {
        WinRegistry.writeStringValue(userRoot, -2147483647, key, valueName, value);
    }

    /*
     * WARNING - void declaration
     */
    private static void writeStringValue(Preferences root, int hkey, String key, String valueName, String value) throws InvocationTargetException, IllegalArgumentException, IllegalAccessException {
        void var5_5;
        Object[] objectArray = new Object[3];
        objectArray[0] = hkey;
        objectArray[1] = WinRegistry.toCstr(key);
        objectArray[2] = 983103;
        int[] handles = (int[])regOpenKey.invoke((Object)root, objectArray);
        Object[] objectArray2 = new Object[3];
        objectArray2[0] = handles[0];
        objectArray2[1] = WinRegistry.toCstr(valueName);
        objectArray2[2] = WinRegistry.toCstr(value);
        regSetValueEx.invoke((Object)root, objectArray2);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = (int)var5_5[0];
        regCloseKey.invoke((Object)root, objectArray3);
    }

    static void createKey(String key) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        int[] ret = WinRegistry.createKey(userRoot, -2147483647, key);
        Object[] objectArray = new Object[1];
        objectArray[0] = ret[0];
        regCloseKey.invoke((Object)userRoot, objectArray);
        if (ret[1] != 0) {
            throw new IllegalArgumentException("rc=" + ret[1] + "  key=" + key);
        }
    }

    static {
        userRoot = Preferences.userRoot();
        userClass = userRoot.getClass();
        try {
            Class[] classArray = new Class[3];
            classArray[0] = Integer.TYPE;
            classArray[1] = byte[].class;
            classArray[2] = Integer.TYPE;
            regOpenKey = userClass.getDeclaredMethod("WindowsRegOpenKey", classArray);
            regOpenKey.setAccessible(true);
            Class[] classArray2 = new Class[1];
            classArray2[0] = Integer.TYPE;
            regCloseKey = userClass.getDeclaredMethod("WindowsRegCloseKey", classArray2);
            regCloseKey.setAccessible(true);
            Class[] classArray3 = new Class[2];
            classArray3[0] = Integer.TYPE;
            classArray3[1] = byte[].class;
            regQueryValueEx = userClass.getDeclaredMethod("WindowsRegQueryValueEx", classArray3);
            regQueryValueEx.setAccessible(true);
            Class[] classArray4 = new Class[2];
            classArray4[0] = Integer.TYPE;
            classArray4[1] = byte[].class;
            regCreateKeyEx = userClass.getDeclaredMethod("WindowsRegCreateKeyEx", classArray4);
            regCreateKeyEx.setAccessible(true);
            Class[] classArray5 = new Class[3];
            classArray5[0] = Integer.TYPE;
            classArray5[1] = byte[].class;
            classArray5[2] = byte[].class;
            regSetValueEx = userClass.getDeclaredMethod("WindowsRegSetValueEx", classArray5);
            regSetValueEx.setAccessible(true);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private WinRegistry() {
    }

    /*
     * WARNING - void declaration
     */
    private static byte[] toCstr(String str) {
        void var1_1;
        byte[] result = new byte[str.length() + 1];
        int i = 0;
        while (i < str.length()) {
            void var2_2;
            result[i] = (byte)str.charAt(i);
            ++var2_2;
        }
        result[str.length()] = 0;
        return var1_1;
    }

    private static int[] createKey(Preferences root, int hkey, String key) throws IllegalAccessException, InvocationTargetException, IllegalArgumentException {
        Object[] objectArray = new Object[2];
        objectArray[0] = hkey;
        objectArray[1] = WinRegistry.toCstr(key);
        return (int[])regCreateKeyEx.invoke((Object)root, objectArray);
    }

    /*
     * WARNING - void declaration
     */
    static String readString() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        void var1_1;
        Object[] objectArray = new Object[3];
        objectArray[0] = -2147483647;
        objectArray[1] = WinRegistry.toCstr("Software\\\\Valve\\\\Steam");
        objectArray[2] = 131097;
        int[] handles = (int[])regOpenKey.invoke((Object)userRoot, objectArray);
        if (handles[1] != 0) {
            return null;
        }
        Object[] objectArray2 = new Object[2];
        objectArray2[0] = handles[0];
        objectArray2[1] = WinRegistry.toCstr("SteamExe");
        byte[] valb = (byte[])regQueryValueEx.invoke((Object)userRoot, objectArray2);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = handles[0];
        regCloseKey.invoke((Object)userRoot, objectArray3);
        return valb != null ? new String((byte[])var1_1).trim() : null;
    }
}

