/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09250
 *  Nursultan.class11776
 *  Nursultan.class11938
 *  Nursultan.class11991
 *  org.apache.commons.lang3.RandomStringUtils
 *  org.apache.logging.log4j.LogManager
 */
package Nursultan;

import Nursultan.class09250;
import Nursultan.class11776;
import Nursultan.class11938;
import Nursultan.class11991;
import java.util.Locale;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;

public class class11351 {
    private static String[] L;
    public static Object N_0;

    private class11351() {
        throw new UnsupportedOperationException(L[0]);
    }

    static {
        class11351.i();
        class11351.u();
        N_0 = LogManager.getLogger(String.class);
    }

    private static void i() {
        L = new String[1];
        class11351.L[0] = "This is a utility class and cannot be instantiated";
    }

    private static void u() {
    }

    public static String N() {
        String string = RandomStringUtils.insecure().nextAlphabetic(10, 15).toLowerCase(Locale.ENGLISH);
        StringBuilder stringBuilder = new StringBuilder();
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            char c = cArray[i];
            if (i == 0) {
                stringBuilder.append(Character.toUpperCase(c));
                continue;
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static void N(String string) {
        class11938.s().L(new class09250((class11776)class11991.N((String)string), false, System.currentTimeMillis()));
    }
}

