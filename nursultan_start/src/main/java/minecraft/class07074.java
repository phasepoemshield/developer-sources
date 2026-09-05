/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10712
 *  com.google.common.collect.Lists
 *  minecraft.class00500
 *  minecraft.class01296
 *  minecraft.class05474
 *  minecraft.class07209
 *  minecraft.class07455
 */
package minecraft;

import Nursultan.class10712;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Locale;
import minecraft.class00500;
import minecraft.class01296;
import minecraft.class05474;
import minecraft.class07209;
import minecraft.class07455;

public class class07074 {
    private final String N;
    private final List<class10712> y = Lists.newArrayList();
    private StackTraceElement[] L = new StackTraceElement[0];

    public class07074(String string) {
        this.N = string;
    }

    public void y(int n) {
        StackTraceElement[] stackTraceElementArray = new StackTraceElement[this.L.length - n];
        System.arraycopy(this.L, 0, stackTraceElementArray, 0, stackTraceElementArray.length);
        this.L = stackTraceElementArray;
    }

    public StackTraceElement[] N() {
        return this.L;
    }

    public void N(StringBuilder stringBuilder) {
        stringBuilder.append("-- ").append(this.N).append(" --\n");
        stringBuilder.append("Details:");
        for (class10712 class107122 : this.y) {
            stringBuilder.append("\n\t");
            stringBuilder.append(class107122.N());
            stringBuilder.append(": ");
            stringBuilder.append(class107122.y());
        }
        if (this.L != null && this.L.length > 0) {
            stringBuilder.append("\nStacktrace:");
            for (StackTraceElement stackTraceElement : this.L) {
                stringBuilder.append("\n\tat ");
                stringBuilder.append(stackTraceElement);
            }
        }
    }

    public static String N(double d, double d2, double d3) {
        return String.format(Locale.ROOT, "%.2f,%.2f,%.2f", d, d2, d3);
    }

    public boolean N(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        if (this.L.length == 0 || stackTraceElement == null) {
            return false;
        }
        StackTraceElement stackTraceElement3 = this.L[0];
        if (!(stackTraceElement3.isNativeMethod() == stackTraceElement.isNativeMethod() && stackTraceElement3.getClassName().equals(stackTraceElement.getClassName()) && stackTraceElement3.getFileName().equals(stackTraceElement.getFileName()) && stackTraceElement3.getMethodName().equals(stackTraceElement.getMethodName()))) {
            return false;
        }
        if (stackTraceElement2 != null != this.L.length > 1) {
            return false;
        }
        if (stackTraceElement2 != null && !this.L[1].equals(stackTraceElement2)) {
            return false;
        }
        this.L[0] = stackTraceElement;
        return true;
    }

    public static void N(class07074 class070742, class05474 class054742, class07209 class072092, class00500 class005002) {
        class070742.N("Block", (class07455<String>)((class07455)() -> ((class00500)class005002).toString()));
        class07074.N(class070742, class054742, class072092);
    }

    public static class07074 N(class07074 class070742, class05474 class054742, class07209 class072092) {
        return class070742.N("Block location", (class07455<String>)((class07455)() -> class07074.N(class054742, class072092)));
    }

    public int N(int n) {
        StackTraceElement[] stackTraceElementArray = Thread.currentThread().getStackTrace();
        if (stackTraceElementArray.length <= 0) {
            return 0;
        }
        this.L = new StackTraceElement[stackTraceElementArray.length - 3 - n];
        System.arraycopy(stackTraceElementArray, 3 + n, this.L, 0, this.L.length);
        return this.L.length;
    }

    public static String N(class05474 class054742, class07209 class072092) {
        return class07074.N(class054742, class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public static String N(class05474 class054742, int n, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append(String.format(Locale.ROOT, "World: (%d,%d,%d)", n, n2, n3));
        }
        catch (Throwable throwable) {
            stringBuilder.append("(Error finding world loc)");
        }
        stringBuilder.append(", ");
        try {
            int n15 = class01296.N((int)n);
            n14 = class01296.N((int)n2);
            n13 = class01296.N((int)n3);
            n12 = n & 0xF;
            n11 = n2 & 0xF;
            n10 = n3 & 0xF;
            n9 = class01296.L((int)n15);
            n8 = class054742.method_31607();
            n7 = class01296.L((int)n13);
            n6 = class01296.L((int)(n15 + 1)) - 1;
            n5 = class054742.method_31600();
            n4 = class01296.L((int)(n13 + 1)) - 1;
            stringBuilder.append(String.format(Locale.ROOT, "Section: (at %d,%d,%d in %d,%d,%d; chunk contains blocks %d,%d,%d to %d,%d,%d)", n12, n11, n10, n15, n14, n13, n9, n8, n7, n6, n5, n4));
        }
        catch (Throwable throwable) {
            stringBuilder.append("(Error finding chunk loc)");
        }
        stringBuilder.append(", ");
        try {
            int n16 = n >> 9;
            n14 = n3 >> 9;
            n13 = n16 << 5;
            n12 = n14 << 5;
            n11 = (n16 + 1 << 5) - 1;
            n10 = (n14 + 1 << 5) - 1;
            n9 = n16 << 9;
            n8 = class054742.method_31607();
            n7 = n14 << 9;
            n6 = (n16 + 1 << 9) - 1;
            n5 = class054742.method_31600();
            n4 = (n14 + 1 << 9) - 1;
            stringBuilder.append(String.format(Locale.ROOT, "Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,%d,%d to %d,%d,%d)", n16, n14, n13, n12, n11, n10, n9, n8, n7, n6, n5, n4));
        }
        catch (Throwable throwable) {
            stringBuilder.append("(Error finding world loc)");
        }
        return stringBuilder.toString();
    }

    public class07074 N(String string, class07455<String> class074552) {
        try {
            this.N(string, class074552.call());
        }
        catch (Throwable throwable) {
            this.N(string, throwable);
        }
        return this;
    }

    public class07074 N(String string, Object object) {
        this.y.add(new class10712(string, object));
        return this;
    }

    public void N(String string, Throwable throwable) {
        this.N(string, (Object)throwable);
    }

    public static String N(class05474 class054742, double d, double d2, double d3) {
        return String.format(Locale.ROOT, "%.2f,%.2f,%.2f - %s", d, d2, d3, class07074.N(class054742, class07209.method_49637((double)d, (double)d2, (double)d3)));
    }
}

