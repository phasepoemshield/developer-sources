/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.reflect.TypeToken
 *  minecraft.class01079
 *  minecraft.class01894
 *  minecraft.class06202
 */
package Nursultan;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import minecraft.class01079;
import minecraft.class01894;
import minecraft.class06202;

public class class11911 {
    public static Object N_0;
    public static Object N_1;

    private static void L() {
        N_0 = null;
        N_1 = null;
    }

    public static class01079 L(String string) {
        return ((class06202)N_0).Nm().L(class11911.N(string));
    }

    private class11911() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class11911.L();
        N_0 = class06202.Nq();
        N_1 = new Gson();
    }

    public static Reader y(String string) {
        return ((class06202)N_0).Nm().i(class11911.N(string));
    }

    public static Set<class01894> N(String string, Predicate<class01894> predicate) {
        return ((class06202)N_0).Nm().y(string, predicate).keySet();
    }

    /*
     * Enabled aggressive exception aggregation
     */
    private static String N(class01894 class018942) {
        try (InputStream inputStream = class06202.Nq().Nm().u(class018942);){
            String string;
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));){
                string = bufferedReader.lines().collect(Collectors.joining("\n"));
            }
            return string;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public static <T> T N(class01894 class018942, TypeToken<?> typeToken) {
        return (T)((Gson)N_1).fromJson(class11911.N(class018942), typeToken.getType());
    }

    public static <T> T N(class01894 class018942, Class<T> clazz) {
        return (T)((Gson)N_1).fromJson(class11911.N(class018942), clazz);
    }

    public static class01894 N(String string) {
        return class01894.N((String)"nursultan-client", (String)string);
    }
}

