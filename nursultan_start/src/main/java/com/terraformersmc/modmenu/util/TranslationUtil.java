/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class08392
 */
package com.terraformersmc.modmenu.util;

import java.text.NumberFormat;
import java.util.Arrays;
import minecraft.class00392;
import minecraft.class08392;

public class TranslationUtil {
    public static class00392 translateNumeric(String string, int[] ... nArray) {
        Object[] objectArray = new Object[nArray.length];
        for (int i = 0; i < nArray.length; ++i) {
            NumberFormat numberFormat = NumberFormat.getInstance();
            if (nArray[i].length == 1) {
                objectArray[i] = numberFormat.format(nArray[i][0]);
                continue;
            }
            assert (nArray[i].length == 2);
            objectArray[i] = numberFormat.format(nArray[i][0]) + "/" + numberFormat.format(nArray[i][1]);
        }
        int[] nArray2 = new int[nArray.length];
        Arrays.fill(nArray2, -1);
        for (int i = 0; i < nArray.length; ++i) {
            int[] nArray3 = nArray[i];
            if (nArray3 == null) {
                throw new NullPointerException("args[" + i + "]");
            }
            if (nArray3.length != 1) continue;
            nArray2[i] = nArray3[0];
        }
        String string2 = string;
        for (int i = (1 << nArray.length) - 1; i >= 0; --i) {
            StringBuilder stringBuilder = new StringBuilder(string);
            for (int j = 0; j < nArray.length; ++j) {
                stringBuilder.append('.');
                if ((i & 1 << j) != 0 && nArray2[j] != -1) {
                    stringBuilder.append(nArray2[j]);
                    continue;
                }
                stringBuilder.append('n');
            }
            string2 = stringBuilder.toString();
            if (!class08392.N((String)string2)) continue;
            return class00392.N((String)string2, (Object[])objectArray);
        }
        return class00392.N((String)string2, (Object[])objectArray);
    }

    public static String translationKeyOf(String string, String string2) {
        return string + ".modmenu." + string2;
    }
}

