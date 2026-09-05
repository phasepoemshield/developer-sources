/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  minecraft.class02806
 *  minecraft.class05018
 *  minecraft.class06290
 *  minecraft.class08227
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class02806;
import minecraft.class05018;
import minecraft.class06290;
import minecraft.class08227;
import org.jspecify.annotations.Nullable;

public abstract class class02770 {
    private static final String N = "/\\*(?:[^*]|\\*+[^*/])*\\*+/";
    private static final String y = "//[^\\v]*";
    private static final Pattern L = Pattern.compile("(#(?:/\\*(?:[^*]|\\*+[^*/])*\\*+/|\\h)*moj_import(?:/\\*(?:[^*]|\\*+[^*/])*\\*+/|\\h)*(?:\"(.*)\"|<(.*)>))");
    private static final Pattern u = Pattern.compile("(#(?:/\\*(?:[^*]|\\*+[^*/])*\\*+/|\\h)*version(?:/\\*(?:[^*]|\\*+[^*/])*\\*+/|\\h)*(\\d+))\\b");
    private static final Pattern i = Pattern.compile("(?:^|\\v)(?:\\s|/\\*(?:[^*]|\\*+[^*/])*\\*+/|(//[^\\v]*))*\\z");

    private static boolean N(String string, Matcher matcher, int n) {
        if (matcher.start() - n == 0) {
            return false;
        }
        Matcher matcher2 = i.matcher(string.substring(n, matcher.start()));
        if (!matcher2.find()) {
            return true;
        }
        return matcher2.end(1) == matcher.start();
    }

    public abstract @Nullable String N(boolean var1, String var2);

    public static String N(String string, class08227 class082272) {
        if (class082272.L()) {
            return string;
        }
        int n = string.indexOf(10) + 1;
        return string.substring(0, n) + class082272.y() + "#line 1 0\n" + string.substring(n);
    }

    private static boolean N(String string, Matcher matcher) {
        return !class02770.N(string, matcher, 0);
    }

    private List<String> N(String string, class02806 class028062, String string2) {
        String string3;
        int n = class028062.y;
        int n2 = 0;
        String string4 = "";
        ArrayList arrayList = Lists.newArrayList();
        Matcher matcher = L.matcher(string);
        while (matcher.find()) {
            int n3;
            boolean bl;
            if (class02770.N(string, matcher, n2)) continue;
            string3 = matcher.group(2);
            boolean bl2 = bl = string3 != null;
            if (!bl) {
                string3 = matcher.group(3);
            }
            if (string3 == null) continue;
            String string5 = string.substring(n2, matcher.start(1));
            String string6 = string2 + string3;
            Object object = this.N(bl, string6);
            if (!Strings.isNullOrEmpty((String)object)) {
                if (!class05018.u((String)object)) {
                    object = (String)object + System.lineSeparator();
                }
                ++class028062.y;
                n3 = class028062.y;
                List<String> var15 = this.N((String)object, class028062, bl ? class06290.L((String)string6) : "");
                var15.set(0, String.format(Locale.ROOT, "#line %d %d\n%s", 0, n3, this.N(var15.get(0), class028062)));
                if (!class05018.B((String)string5)) {
                    arrayList.add(string5);
                }
                arrayList.addAll(var15);
            } else {
                String string7 = bl ? String.format(Locale.ROOT, "/*#moj_import \"%s\"*/", string3) : String.format(Locale.ROOT, "/*#moj_import <%s>*/", string3);
                arrayList.add(string4 + string5 + string7);
            }
            n3 = class05018.L((String)string.substring(0, matcher.end(1)));
            string4 = String.format(Locale.ROOT, "#line %d %d", n3, n);
            n2 = matcher.end(1);
        }
        string3 = string.substring(n2);
        if (!class05018.B((String)string3)) {
            arrayList.add(string4 + string3);
        }
        return arrayList;
    }

    private String N(String string, class02806 class028062) {
        Matcher matcher = u.matcher(string);
        if (matcher.find() && class02770.N(string, matcher)) {
            class028062.N = Math.max(class028062.N, Integer.parseInt(matcher.group(2)));
            return string.substring(0, matcher.start(1)) + "/*" + string.substring(matcher.start(1), matcher.end(1)) + "*/" + string.substring(matcher.end(1));
        }
        return string;
    }

    private String N(String string, int n) {
        Matcher matcher = u.matcher(string);
        if (matcher.find() && class02770.N(string, matcher)) {
            return string.substring(0, matcher.start(2)) + Math.max(n, Integer.parseInt(matcher.group(2))) + string.substring(matcher.end(2));
        }
        return string;
    }

    public List<String> N(String string) {
        class02806 class028062 = new class02806();
        List<String> var3 = this.N(string, class028062, "");
        var3.set(0, this.N(var3.get(0), class028062.N));
        return var3;
    }
}

