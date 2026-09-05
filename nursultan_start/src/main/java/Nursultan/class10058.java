/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09781
 *  Nursultan.class09838
 *  Nursultan.class09868
 */
package Nursultan;

import Nursultan.class09781;
import Nursultan.class09838;
import Nursultan.class09868;
import Nursultan.class10026;
import Nursultan.class10056;
import java.util.ArrayList;
import java.util.Objects;

final class class10058 {
    private class10058() {
    }

    private static float y(class09868 class098682, String string, float f, class09838 class098382) {
        float f2 = 0.0f;
        int n = -1;
        int n2 = 0;
        while (n2 < string.length()) {
            int n3 = string.codePointAt(n2);
            n2 += Character.charCount(n3);
            if (n3 == 13 || n3 == 10) {
                n = -1;
                continue;
            }
            if (n >= 0) {
                f2 += class098682.N(n, n3, f, class098382);
            }
            f2 += class098682.N(n3, f, class098382);
            n = n3;
        }
        return Math.max(0.0f, f2);
    }

    private static class10026 N(class09868 class098682, String string, float f, class09838 class098382, float f2) {
        String[] stringArray = string.split("\\n", -1);
        float f3 = 0.0f;
        for (String string2 : stringArray) {
            f3 = Math.max(f3, class10058.y(class098682, string2, f, class098382));
        }
        return new class10026(string, f3, (float)stringArray.length * f2, stringArray.length);
    }

    private static float N(class09868 class098682, String string, float f, class09838 class098382) {
        float f2 = 0.0f;
        int n = -1;
        for (int i = 0; i < string.length(); ++i) {
            if (!Character.isWhitespace(string.charAt(i))) {
                if (n >= 0) continue;
                n = i;
                continue;
            }
            if (n < 0) continue;
            f2 = Math.max(f2, class10058.y(class098682, string.substring(n, i), f, class098382));
            n = -1;
        }
        if (n >= 0) {
            f2 = Math.max(f2, class10058.y(class098682, string.substring(n), f, class098382));
        }
        return f2;
    }

    static class10056 N(class09781 class097812, String string, float f, class09838 class098382) {
        Objects.requireNonNull(class097812, "context");
        String string2 = string == null ? "" : string.replace("\r", "");
        class09868 class098682 = class097812.y();
        float f2 = class098682.N(f, class098382);
        float f3 = class10058.N(class098682, string2, f, class098382, f2).y();
        float f4 = class10058.N(class098682, string2, f, class098382);
        return new class10056(f3, f2, f4);
    }

    static class10026 N(class09781 class097812, String string, float f, float f2, class09838 class098382, class10056 class100562) {
        Objects.requireNonNull(class097812, "context");
        class10056 class100563 = class100562 == null ? class10058.N(class097812, string, f2, class098382) : class100562;
        String string2 = string == null ? "" : string.replace("\r", "");
        float f3 = class100563.y();
        if (string2.isEmpty()) {
            return new class10026("", 0.0f, f3, 1);
        }
        if (Float.isInfinite(f)) {
            return class10058.N(class097812.y(), string2, f2, class098382, f3);
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        boolean bl = false;
        int n = 0;
        while (n < string2.length()) {
            float f7;
            char c;
            char c2 = string2.charAt(n);
            if (c2 == '\n') {
                f6 = Math.max(f6, f4);
                arrayList.add(stringBuilder.toString());
                stringBuilder.setLength(0);
                stringBuilder2.setLength(0);
                f4 = 0.0f;
                f5 = 0.0f;
                bl = false;
                ++n;
                continue;
            }
            boolean bl2 = Character.isWhitespace(c2);
            int n2 = n;
            if (bl2) {
                while (n < string2.length() && (c = string2.charAt(n)) != '\n' && Character.isWhitespace(c)) {
                    ++n;
                }
                if (!bl) continue;
                String string3 = string2.substring(n2, n);
                stringBuilder2.append(string3);
                f5 += class10058.y(class097812.y(), string3, f2, class098382);
                continue;
            }
            while (n < string2.length() && (c = string2.charAt(n)) != '\n' && !Character.isWhitespace(c)) {
                ++n;
            }
            String string4 = string2.substring(n2, n);
            float f8 = class10058.y(class097812.y(), string4, f2, class098382);
            float f9 = f7 = bl ? f4 + f5 + f8 : f8;
            if (bl && f7 > f + 0.01f) {
                f6 = Math.max(f6, f4);
                arrayList.add(stringBuilder.toString());
                stringBuilder.setLength(0);
                stringBuilder2.setLength(0);
                f4 = 0.0f;
                f5 = 0.0f;
                bl = false;
            }
            if (bl && !stringBuilder2.isEmpty()) {
                stringBuilder.append((CharSequence)stringBuilder2);
                f4 += f5;
                stringBuilder2.setLength(0);
                f5 = 0.0f;
            }
            stringBuilder.append(string4);
            f4 += f8;
            bl = true;
        }
        f6 = Math.max(f6, f4);
        arrayList.add(stringBuilder.toString());
        return new class10026(String.join((CharSequence)"\n", arrayList), f6, (float)arrayList.size() * f3, arrayList.size());
    }
}

