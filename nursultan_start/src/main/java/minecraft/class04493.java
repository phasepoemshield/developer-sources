/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.chars.CharArraySet
 *  it.unimi.dsi.fastutil.chars.CharSet
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02903
 *  minecraft.class04247
 *  minecraft.class06510
 *  minecraft.class06584
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.chars.CharArraySet;
import it.unimi.dsi.fastutil.chars.CharSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02903;
import minecraft.class04247;
import minecraft.class04491;
import minecraft.class06510;
import minecraft.class06584;
import minecraft.class07536;

public final class class04493 {
    private static final int u = 3;
    public static final char N = ' ';
    public static final MapCodec<class04493> y = class04491.L.flatXmap(class04493::N, class044932 -> class044932.B.map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Cannot encode unpacked recipe")));
    public static final class02362<class04247, class04493> L = class02362.N((class02362)class02389.B, (T class044932) -> class044932.i, (class02362)class02389.B, (T class044932) -> class044932.R, (class02362)class06510.field_52595.N_33(class02389.N()), (T class044932) -> class044932.M, class04493::N);
    private final int i;
    private final int R;
    private final List<Optional<class06510>> M;
    private final Optional<class04491> B;
    private final int Z;
    private final boolean z;

    public List<Optional<class06510>> L() {
        return this.M;
    }

    public class04493(int n, int n2, List<Optional<class06510>> list, Optional<class04491> optional) {
        this.i = n;
        this.R = n2;
        this.M = list;
        this.B = optional;
        this.Z = (int)list.stream().flatMap(Optional::stream).count();
        this.z = class07536.N((int)n, (int)n2, list);
    }

    public int y() {
        return this.R;
    }

    private static int y(String string) {
        int n;
        for (n = string.length() - 1; n >= 0 && string.charAt(n) == ' '; --n) {
        }
        return n;
    }

    private static DataResult<class04493> N(class04491 class044912) {
        String[] stringArray = class04493.N(class044912.y());
        int n = stringArray[0].length();
        int n2 = stringArray.length;
        ArrayList<Optional<class06510>> arrayList = new ArrayList<Optional<class06510>>(n * n2);
        CharArraySet charArraySet = new CharArraySet(class044912.N().keySet());
        for (String string : stringArray) {
            for (int i = 0; i < string.length(); ++i) {
                Optional<Object> optional;
                char c = string.charAt(i);
                if (c == ' ') {
                    optional = Optional.empty();
                } else {
                    class06510 class065102 = class044912.N().get(Character.valueOf(c));
                    if (class065102 == null) {
                        return DataResult.error(() -> "Pattern references symbol '" + c + "' but it's not defined in the key");
                    }
                    optional = Optional.of(class065102);
                }
                charArraySet.remove(c);
                arrayList.add(optional);
            }
        }
        if (!charArraySet.isEmpty()) {
            return DataResult.error(() -> class04493.N((CharSet)charArraySet));
        }
        return DataResult.success((Object)new class04493(n, n2, arrayList, Optional.of(class044912)));
    }

    private static class04493 N(Integer n, Integer n2, List<Optional<class06510>> list) {
        return new class04493(n, n2, list, Optional.empty());
    }

    private boolean N(class02903 class029032, boolean bl) {
        for (int i = 0; i < this.R; ++i) {
            for (int j = 0; j < this.i; ++j) {
                Optional<class06510> optional;
                if (bl) {
                    Optional<class06510> var5 = this.M.get(this.i - j - 1 + i * this.i);
                } else {
                    optional = this.M.get(j + i * this.i);
                }
                class06584 class065842 = class029032.N(j, i);
                if (class06510.method_61676(optional, (class06584)class065842)) continue;
                return false;
            }
        }
        return true;
    }

    public boolean N(class02903 class029032) {
        if (class029032.i() != this.Z) {
            return false;
        }
        if (class029032.R() == this.i && class029032.M() == this.R) {
            if (!this.z && this.N(class029032, true)) {
                return true;
            }
            if (this.N(class029032, false)) {
                return true;
            }
        }
        return false;
    }

    private static int N(String string) {
        int n;
        for (n = 0; n < string.length() && string.charAt(n) == ' '; ++n) {
        }
        return n;
    }

    static String[] N(List<String> list) {
        int n = Integer.MAX_VALUE;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        for (int i = 0; i < list.size(); ++i) {
            String string = list.get(i);
            n = Math.min(n, class04493.N(string));
            int n5 = class04493.y(string);
            n2 = Math.max(n2, n5);
            if (n5 < 0) {
                if (n3 == i) {
                    ++n3;
                }
                ++n4;
                continue;
            }
            n4 = 0;
        }
        if (list.size() == n4) {
            return new String[0];
        }
        String[] stringArray = new String[list.size() - n4 - n3];
        for (int i = 0; i < stringArray.length; ++i) {
            stringArray[i] = list.get(i + n3).substring(n, n2 + 1);
        }
        return stringArray;
    }

    private static /* synthetic */ String N(CharSet charSet) {
        return "Key defines symbols that aren't used in pattern: " + String.valueOf(charSet);
    }

    public static class04493 N(Map<Character, class06510> map, String ... stringArray) {
        return class04493.N(map, List.of(stringArray));
    }

    public static class04493 N(Map<Character, class06510> map, List<String> list) {
        return (class04493)class04493.N(new class04491(map, list)).getOrThrow();
    }

    public int N() {
        return this.i;
    }
}

