/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05096
 */
package me.flashyreese.mods.reeses_sodium_options.compat;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import minecraft.class05096;

public class IrisCompat {
    private static boolean irisPresent;
    private static MethodHandle handleScreen;
    private static MethodHandle handleTranslationKey;
    private static Object apiInstance;

    static {
        try {
            Class<?> clazz = Class.forName("net.irisshaders.iris.api.v0.IrisApi");
            apiInstance = clazz.cast(clazz.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
            handleScreen = MethodHandles.lookup().findVirtual(clazz, "openMainIrisScreenObj", MethodType.methodType(Object.class, Object.class));
            handleTranslationKey = MethodHandles.lookup().findVirtual(clazz, "getMainScreenLanguageKey", MethodType.methodType(String.class));
            irisPresent = true;
        }
        catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            irisPresent = false;
        }
    }

    public static String getIrisShaderPacksScreenLanguageKey() {
        if (irisPresent) {
            try {
                return handleTranslationKey.invoke(apiInstance);
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        return null;
    }

    public static boolean isIrisPresent() {
        return irisPresent;
    }

    public static class05096 getIrisShaderPacksScreen(class05096 class050962) {
        if (irisPresent) {
            try {
                return (class05096)handleScreen.invokeWithArguments(apiInstance, class050962);
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        return null;
    }
}

