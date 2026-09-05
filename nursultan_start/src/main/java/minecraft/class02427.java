/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04681
 *  minecraft.class05005
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04681;
import minecraft.class05005;
import org.jspecify.annotations.Nullable;

public class class02427 {
    public static final int N = 105;
    public static final int y = 10;
    private static final int L = 5;
    private final class01590 u;
    private @Nullable class04681 i;
    private String R = "root";
    private int M = 0;

    public class02427(class01590 class015902) {
        this.u = class015902;
    }

    public void y(int n) {
        if (this.i == null) {
            return;
        }
        List var2 = this.i.N(this.R);
        if (var2.isEmpty()) {
            return;
        }
        class05005 class050052 = (class05005)var2.remove(0);
        if (n == 0) {
            int n2;
            if (!class050052.u.isEmpty() && (n2 = this.R.lastIndexOf(30)) >= 0) {
                this.R = this.R.substring(0, n2);
            }
        } else if (--n < var2.size() && !"unspecified".equals(((class05005)var2.get((int)n)).u)) {
            if (!this.R.isEmpty()) {
                this.R = this.R + "\u001e";
            }
            this.R = this.R + ((class05005)var2.get((int)n)).u;
        }
    }

    public void N(@Nullable class04681 class046812) {
        this.i = class046812;
    }

    public void N(class01054 class010542) {
        if (this.i == null) {
            return;
        }
        List var2 = this.i.N(this.R);
        class05005 class050052 = (class05005)var2.removeFirst();
        int n = class010542.N() - 105 - 10;
        int n2 = n - 105;
        int n3 = n + 105;
        int n4 = var2.size();
        Objects.requireNonNull(this.u);
        int n5 = n4 * 9;
        int n6 = class010542.y() - this.M - 5;
        int n7 = n6 - n5;
        int n8 = 62;
        int n9 = n7 - 62 - 5;
        class010542.N(n2 - 5, n9 - 62 - 5, n3 + 5, n6 + 5, -1873784752);
        class010542.N(var2, n2, n9 - 62 + 10, n3, n9 + 62);
        DecimalFormat decimalFormat = new DecimalFormat("##0.00", DecimalFormatSymbols.getInstance(Locale.ROOT));
        String string = class04681.y((String)class050052.u);
        Object object = "";
        if (!"unspecified".equals(string)) {
            object = (String)object + "[0] ";
        }
        object = string.isEmpty() ? (String)object + "ROOT " : (String)object + string + " ";
        int n10 = -1;
        int n11 = n9 - 62;
        class010542.y(this.u, (String)object, n2, n11, -1);
        object = decimalFormat.format(class050052.y) + "%";
        class010542.y(this.u, (String)object, n3 - this.u.y((String)object), n11, -1);
        for (int i = 0; i < var2.size(); ++i) {
            class05005 class050053 = (class05005)var2.get(i);
            StringBuilder stringBuilder = new StringBuilder();
            if ("unspecified".equals(class050053.u)) {
                stringBuilder.append("[?] ");
            } else {
                stringBuilder.append("[").append(i + 1).append("] ");
            }
            Object object2 = stringBuilder.append(class050053.u).toString();
            Objects.requireNonNull(this.u);
            int n12 = n7 + i * 9;
            class010542.y(this.u, (String)object2, n2, n12, class050053.N());
            object2 = decimalFormat.format(class050053.N) + "%";
            class010542.y(this.u, (String)object2, n3 - 50 - this.u.y((String)object2), n12, class050053.N());
            object2 = decimalFormat.format(class050053.y) + "%";
            class010542.y(this.u, (String)object2, n3 - this.u.y((String)object2), n12, class050053.N());
        }
    }

    public void N(int n) {
        this.M = n;
    }
}

