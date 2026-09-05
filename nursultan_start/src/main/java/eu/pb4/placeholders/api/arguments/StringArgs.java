/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  eu.pb4.placeholders.impl.StringArgOps
 *  minecraft.class01036
 *  minecraft.class01929
 */
package eu.pb4.placeholders.api.arguments;

import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import eu.pb4.placeholders.api.arguments.SimpleArguments;
import eu.pb4.placeholders.impl.StringArgOps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import minecraft.class01036;
import minecraft.class01929;

public final class StringArgs {
    private static final StringArgs EMPTY = new StringArgs("");
    private final List<String> ordered = new ArrayList<String>();
    private final Map<String, String> keyed = new HashMap<String, String>();
    private final Map<String, StringArgs> keyedMaps = new HashMap<String, StringArgs>();
    private final String input;
    private int currentOrdered = 0;

    private StringArgs(String string) {
        this.input = string;
    }

    public int size() {
        return Math.max(this.keyed.size(), this.ordered.size());
    }

    public <T> DataResult<T> get(String string, Codec<T> codec, class01929 class019292) {
        String string2 = this.get(string);
        StringArgs stringArgs = this.getNested(string);
        return string2 == null && stringArgs == null ? DataResult.error(() -> "Empty") : codec.decode((DynamicOps)class019292.N((DynamicOps)StringArgOps.INSTANCE), (Object)(string2 != null ? Either.left((Object)string2) : Either.right((Object)stringArgs))).map(Pair::getFirst);
    }

    public String get(String string, int n) {
        String string2 = this.keyed.get(string);
        if (string2 != null) {
            return string2;
        }
        if (n < this.ordered.size()) {
            return this.ordered.get(n);
        }
        return null;
    }

    public String get(String string, String string2) {
        return this.keyed.getOrDefault(string, string2);
    }

    public String get(String string) {
        return this.keyed.get(string);
    }

    public String get(String string, int n, String string2) {
        String string3 = this.get(string, n);
        return string3 != null ? string3 : string2;
    }

    public <T> DataResult<T> get(String string, Codec<T> codec) {
        String string2 = this.get(string);
        StringArgs stringArgs = this.getNested(string);
        return string2 == null && stringArgs == null ? DataResult.error(() -> "Empty") : codec.decode((DynamicOps)StringArgOps.INSTANCE, (Object)(string2 != null ? Either.left((Object)string2) : Either.right((Object)stringArgs))).map(Pair::getFirst);
    }

    public String toString() {
        return "StringArgs{ordered=" + String.valueOf(this.ordered) + ", keyed=" + String.valueOf(this.keyed) + ", keyedMaps=" + String.valueOf(this.keyedMaps) + "}";
    }

    public boolean isEmpty() {
        return this.keyed.isEmpty() && this.ordered.isEmpty();
    }

    public boolean contains(String string) {
        return this.keyed.containsKey(string);
    }

    public static StringArgs empty() {
        return EMPTY;
    }

    public static StringArgs full(String string, char c, char c2) {
        return StringArgs.full(string, c, c2, true, SimpleArguments::isWrapCharacter);
    }

    public static StringArgs full(String string3, char c, char c2, boolean bl, class01036 class010362) {
        StringArgs stringArgs = new StringArgs(string3);
        StringArgs.keyDecomposition(string3, 0, c, c2, class010362, bl, '\u0000', (string, string2) -> {
            if (string != null) {
                stringArgs.keyed.put((String)string, string2 != null ? SimpleArguments.unwrap(string2, class010362) : "");
                if (string2 == null) {
                    stringArgs.ordered.add(SimpleArguments.unwrap(string, class010362));
                }
            }
        }, stringArgs.keyedMaps::put);
        return stringArgs;
    }

    public String input() {
        return this.input;
    }

    public void ifPresent(String string, Consumer<String> consumer) {
        String string2 = this.get(string);
        if (string2 != null) {
            consumer.accept(string2);
        }
    }

    public List<String> ordered() {
        return Collections.unmodifiableList(this.ordered);
    }

    public static StringArgs ordered(String string, char c) {
        StringArgs stringArgs = new StringArgs(string);
        stringArgs.ordered.addAll(SimpleArguments.split(string, c));
        return stringArgs;
    }

    public String getNext(String string, String string2) {
        String string3 = this.getNext(string);
        return string3 != null ? string3 : string2;
    }

    public String getNext(String string) {
        String string2 = this.keyed.get(string);
        if (string2 != null) {
            return string2;
        }
        if (this.currentOrdered < this.ordered.size()) {
            return this.ordered.get(this.currentOrdered++);
        }
        return null;
    }

    public Map<String, String> unsafeKeyed() {
        return this.keyed;
    }

    public List<String> unsafeOrdered() {
        return this.ordered;
    }

    public StringArgs getNestedOrEmpty(String string) {
        return this.keyedMaps.getOrDefault(string, EMPTY);
    }

    public Map<String, StringArgs> unsafeKeyedMap() {
        return this.keyedMaps;
    }

    private static int keyDecomposition(String string3, int n, char c, char c2, class01036 class010362, boolean bl, char c3, BiConsumer<String, String> biConsumer, BiConsumer<String, StringArgs> biConsumer2) {
        int n2;
        String string4 = null;
        String string5 = null;
        StringBuilder stringBuilder = new StringBuilder();
        char c4 = '\u0000';
        for (n2 = n; n2 < string3.length(); ++n2) {
            char c5;
            char c6 = string3.charAt(n2);
            char c7 = c5 = n2 != string3.length() - 1 ? string3.charAt(n2 + 1) : (char)'\u0000';
            if (c6 == c3 && c4 == '\u0000') break;
            if (string4 != null && stringBuilder.isEmpty() && bl && (c6 == '{' || c6 == '[') && c4 == '\u0000') {
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                int n3 = StringArgs.keyDecomposition(string3, n2 + 1, c, c2, class010362, true, c6 == '{' ? (char)'}' : ']', (string, string2) -> {
                    if (string != null) {
                        hashMap.put(string, string2 != null ? SimpleArguments.unwrap(string2, class010362) : "");
                        if (string2 == null) {
                            arrayList.add(SimpleArguments.unwrap(string, class010362));
                        }
                    }
                }, hashMap2::put);
                if (n3 == string3.length()) {
                    stringBuilder.append(c6);
                    continue;
                }
                StringArgs stringArgs = new StringArgs(string3.substring(n2, n3));
                stringArgs.ordered.addAll(arrayList);
                stringArgs.keyed.putAll(hashMap);
                stringArgs.keyedMaps.putAll(hashMap2);
                biConsumer2.accept(string4, stringArgs);
                string4 = null;
                n2 = n3;
                continue;
            }
            if (c6 == c2 && c4 == '\u0000' && string4 == null) {
                string4 = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                continue;
            }
            if (c6 == '\\' && c5 != '\u0000' || c5 != '\u0000' && c6 == c5 && class010362.test(c6)) {
                stringBuilder.append(c5);
                ++n2;
                continue;
            }
            if (class010362.test(c6) && (c4 == '\u0000' || c4 == c6)) {
                c4 = c4 == '\u0000' ? c6 : (char)'\u0000';
                continue;
            }
            if (c6 == c && c4 == '\u0000') {
                if (stringBuilder.isEmpty() && string4 == null) {
                    biConsumer.accept(null, null);
                    continue;
                }
                if (string4 == null) {
                    string4 = stringBuilder.toString();
                } else {
                    string5 = stringBuilder.toString();
                }
                biConsumer.accept(string4, string5);
                string4 = null;
                string5 = null;
                stringBuilder = new StringBuilder();
                continue;
            }
            stringBuilder.append(c6);
        }
        if (string4 != null) {
            biConsumer.accept(string4, stringBuilder.isEmpty() ? null : stringBuilder.toString());
        } else if (!stringBuilder.isEmpty()) {
            biConsumer.accept(stringBuilder.toString(), null);
        }
        return n2;
    }

    public StringArgs getNested(String string) {
        return this.keyedMaps.get(string);
    }

    public static StringArgs keyed(String string, char c, char c2) {
        return StringArgs.keyed(string, c, c2, true, SimpleArguments::isWrapCharacter);
    }

    public static StringArgs keyed(String string3, char c, char c2, boolean bl, class01036 class010362) {
        StringArgs stringArgs = new StringArgs(string3);
        StringArgs.keyDecomposition(string3, 0, c, c2, class010362, bl, '\u0000', (string, string2) -> {
            if (string != null) {
                stringArgs.keyed.put((String)string, string2 != null ? SimpleArguments.unwrap(string2, class010362) : "");
            }
        }, stringArgs.keyedMaps::put);
        return stringArgs;
    }

    public static StringArgs emptyNew() {
        return new StringArgs("");
    }
}

