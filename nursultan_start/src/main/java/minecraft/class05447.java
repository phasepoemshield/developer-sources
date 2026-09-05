/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.ibm.icu.lang.UCharacter
 *  com.ibm.icu.text.ArabicShaping
 *  com.ibm.icu.text.Bidi
 *  com.ibm.icu.text.BidiRun
 *  minecraft.class01028
 *  minecraft.class05936
 */
package minecraft;

import com.google.common.collect.Lists;
import com.ibm.icu.lang.UCharacter;
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.Bidi;
import com.ibm.icu.text.BidiRun;
import java.util.ArrayList;
import java.util.List;
import minecraft.class01028;
import minecraft.class05438;
import minecraft.class05936;

public class class05447 {
    public static class01028 N(class05936 class059362, boolean bl) {
        class05438 class054382 = class05438.N(class059362, UCharacter::getMirror, class05447::N);
        Bidi bidi = new Bidi(class054382.N(), bl ? 127 : 126);
        bidi.setReorderingMode(0);
        ArrayList arrayList = Lists.newArrayList();
        int n = bidi.countRuns();
        for (int i = 0; i < n; ++i) {
            BidiRun bidiRun = bidi.getVisualRun(i);
            arrayList.addAll(class054382.N(bidiRun.getStart(), bidiRun.getLength(), bidiRun.isOddRun()));
        }
        return class01028.a_((List)arrayList);
    }

    private static String N(String string) {
        try {
            return new ArabicShaping(8).shape(string);
        }
        catch (Exception exception) {
            return string;
        }
    }
}

