/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09176
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.serialization.DynamicOps
 *  it.unimi.dsi.fastutil.chars.CharList
 *  java.lang.runtime.SwitchBootstraps
 *  java.util.HexFormat
 *  minecraft.class00139
 *  minecraft.class00150
 *  minecraft.class00154
 *  minecraft.class00157
 *  minecraft.class00162
 *  minecraft.class00164
 *  minecraft.class00170
 *  minecraft.class00171
 *  minecraft.class00174
 *  minecraft.class00182
 *  minecraft.class00392
 *  minecraft.class02165
 *  minecraft.class02169
 *  minecraft.class02179
 *  minecraft.class02315
 *  minecraft.class02324
 *  minecraft.class02325
 *  minecraft.class02332
 *  minecraft.class02344
 *  minecraft.class02353
 *  minecraft.class08499
 *  minecraft.class08501
 *  minecraft.class08513
 *  minecraft.class08515
 *  minecraft.class08522
 *  minecraft.class08524
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09176;
import com.google.common.collect.ImmutableMap;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.chars.CharList;
import java.lang.runtime.SwitchBootstraps;
import java.util.HexFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import minecraft.class00139;
import minecraft.class00150;
import minecraft.class00154;
import minecraft.class00157;
import minecraft.class00162;
import minecraft.class00164;
import minecraft.class00170;
import minecraft.class00171;
import minecraft.class00174;
import minecraft.class00182;
import minecraft.class00392;
import minecraft.class02165;
import minecraft.class02169;
import minecraft.class02179;
import minecraft.class02315;
import minecraft.class02324;
import minecraft.class02325;
import minecraft.class02332;
import minecraft.class02344;
import minecraft.class02353;
import minecraft.class08499;
import minecraft.class08501;
import minecraft.class08513;
import minecraft.class08515;
import minecraft.class08522;
import minecraft.class08524;
import minecraft.class08850;
import minecraft.class08851;
import minecraft.class08863;
import minecraft.class08878;
import minecraft.class08886;
import minecraft.class08891;
import org.jspecify.annotations.Nullable;

public class class08876 {
    private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(object -> class00392.y((String)"snbt.parser.number_parse_failure", (Object[])new Object[]{object}));
    public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"snbt.parser.expected_hex_escape", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType R = new DynamicCommandExceptionType(object -> class00392.y((String)"snbt.parser.invalid_codepoint", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType M = new DynamicCommandExceptionType(object -> class00392.y((String)"snbt.parser.no_such_operation", (Object[])new Object[]{object}));
    static final class08524<CommandSyntaxException> y = class08524.N((SimpleCommandExceptionType)new SimpleCommandExceptionType((Message)class00392.L((String)"snbt.parser.expected_integer_type")));
    private static final class08524<CommandSyntaxException> B = class08524.N((SimpleCommandExceptionType)new SimpleCommandExceptionType((Message)class00392.L((String)"snbt.parser.expected_float_type")));
    static final class08524<CommandSyntaxException> L = class08524.N((SimpleCommandExceptionType)new SimpleCommandExceptionType((Message)class00392.L((String)"snbt.parser.expected_non_negative_number")));
    private static final class08524<CommandSyntaxException> Z = class08524.N((SimpleCommandExceptionType)new SimpleCommandExceptionType((Message)class00392.L((String)"snbt.parser.invalid_character_name")));
    static final class08524<CommandSyntaxException> u = class08524.N((SimpleCommandExceptionType)new SimpleCommandExceptionType((Message)class00392.L((String)"snbt.parser.invalid_array_element_type")));
    private static final class08524<CommandSyntaxException> z = class08524.N((SimpleCommandExceptionType)new SimpleCommandExceptionType((Message)class00392.L((String)"snbt.parser.invalid_unquoted_start")));
    private static final class08524<CommandSyntaxException> U = class08524.N((SimpleCommandExceptionType)new SimpleCommandExceptionType((Message)class00392.L((String)"snbt.parser.expected_unquoted_string")));
    private static final class08524<CommandSyntaxException> E = class08524.N((SimpleCommandExceptionType)new SimpleCommandExceptionType((Message)class00392.L((String)"snbt.parser.invalid_string_contents")));
    private static final class08524<CommandSyntaxException> W = class08524.N((SimpleCommandExceptionType)new SimpleCommandExceptionType((Message)class00392.L((String)"snbt.parser.expected_binary_numeral")));
    private static final class08524<CommandSyntaxException> m = class08524.N((SimpleCommandExceptionType)new SimpleCommandExceptionType((Message)class00392.L((String)"snbt.parser.underscore_not_allowed")));
    private static final class08524<CommandSyntaxException> P = class08524.N((SimpleCommandExceptionType)new SimpleCommandExceptionType((Message)class00392.L((String)"snbt.parser.expected_decimal_numeral")));
    private static final class08524<CommandSyntaxException> s = class08524.N((SimpleCommandExceptionType)new SimpleCommandExceptionType((Message)class00392.L((String)"snbt.parser.expected_hex_numeral")));
    private static final class08524<CommandSyntaxException> T = class08524.N((SimpleCommandExceptionType)new SimpleCommandExceptionType((Message)class00392.L((String)"snbt.parser.empty_key")));
    private static final class08524<CommandSyntaxException> b = class08524.N((SimpleCommandExceptionType)new SimpleCommandExceptionType((Message)class00392.L((String)"snbt.parser.leading_zero_not_allowed")));
    private static final class08524<CommandSyntaxException> j = class08524.N((SimpleCommandExceptionType)new SimpleCommandExceptionType((Message)class00392.L((String)"snbt.parser.infinity_not_allowed")));
    private static final HexFormat v = HexFormat.of().withUpperCase();
    private static final class08499 n = new class08850(W, m);
    private static final class08499 t = new class08863(P, m);
    private static final class08499 G = new class08891(s, m);
    private static final class08522 l = new class08851(1, E);
    private static final class02165 d = new class08878(CharList.of());
    private static final Pattern w = Pattern.compile("[-a-zA-Z0-9 ]+");

    private static boolean L(char c) {
        return !class08876.y(c);
    }

    static boolean y(char c) {
        return switch (c) {
            case '+', '-', '.', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> true;
            default -> false;
        };
    }

    private static <T> @Nullable T y(DynamicOps<T> dynamicOps, class02325<?> class023252, String string) {
        double d = Double.parseDouble(string);
        if (!Double.isFinite(d)) {
            class023252.y().N(class023252.M(), j);
            return null;
        }
        return (T)dynamicOps.createDouble(d);
    }

    public static @Nullable String N(char c) {
        return switch (c) {
            case '\b' -> "b";
            case '\t' -> "t";
            case '\n' -> "n";
            case '\f' -> "f";
            case '\r' -> "r";
            default -> c < ' ' ? "x" + v.toHexDigits((byte)c) : null;
        };
    }

    static class08524<CommandSyntaxException> N(NumberFormatException numberFormatException) {
        return class08524.N((DynamicCommandExceptionType)i, (String)numberFormatException.getMessage());
    }

    private static String N(List<String> list) {
        return switch (list.size()) {
            case 0 -> "";
            case 1 -> (String)list.getFirst();
            default -> String.join((CharSequence)"", list);
        };
    }

    public static <T> class02169<T> N(DynamicOps<T> dynamicOps) {
        Object object = dynamicOps.createBoolean(true);
        Object object2 = dynamicOps.createBoolean(false);
        Object object3 = dynamicOps.emptyMap();
        Object object4 = dynamicOps.emptyList();
        class02344 class023442 = new class02344();
        class02353 class023532 = class02353.N((String)"sign");
        class023442.N(class023532, class02315.y((class02315[])new class02315[]{class02315.N((class02315[])new class02315[]{class02179.N((char)'+'), class02315.N((class02353)class023532, (Object)class00150.field_58014)}), class02315.N((class02315[])new class02315[]{class02179.N((char)'-'), class02315.N((class02353)class023532, (Object)class00150.field_58015)})}), class023322 -> (class00150)class023322.y(class023532));
        class02353 class023533 = class02353.N((String)"integer_suffix");
        class023442.N(class023533, class02315.y((class02315[])new class02315[]{class02315.N((class02315[])new class02315[]{class02179.N((char)'u', (char)'U'), class02315.y((class02315[])new class02315[]{class02315.N((class02315[])new class02315[]{class02179.N((char)'b', (char)'B'), class02315.N((class02353)class023533, (Object)new class00154(class00162.field_58018, class00157.field_58022))}), class02315.N((class02315[])new class02315[]{class02179.N((char)'s', (char)'S'), class02315.N((class02353)class023533, (Object)new class00154(class00162.field_58018, class00157.field_58023))}), class02315.N((class02315[])new class02315[]{class02179.N((char)'i', (char)'I'), class02315.N((class02353)class023533, (Object)new class00154(class00162.field_58018, class00157.field_58024))}), class02315.N((class02315[])new class02315[]{class02179.N((char)'l', (char)'L'), class02315.N((class02353)class023533, (Object)new class00154(class00162.field_58018, class00157.field_58025))})})}), class02315.N((class02315[])new class02315[]{class02179.N((char)'s', (char)'S'), class02315.y((class02315[])new class02315[]{class02315.N((class02315[])new class02315[]{class02179.N((char)'b', (char)'B'), class02315.N((class02353)class023533, (Object)new class00154(class00162.field_58017, class00157.field_58022))}), class02315.N((class02315[])new class02315[]{class02179.N((char)'s', (char)'S'), class02315.N((class02353)class023533, (Object)new class00154(class00162.field_58017, class00157.field_58023))}), class02315.N((class02315[])new class02315[]{class02179.N((char)'i', (char)'I'), class02315.N((class02353)class023533, (Object)new class00154(class00162.field_58017, class00157.field_58024))}), class02315.N((class02315[])new class02315[]{class02179.N((char)'l', (char)'L'), class02315.N((class02353)class023533, (Object)new class00154(class00162.field_58017, class00157.field_58025))})})}), class02315.N((class02315[])new class02315[]{class02179.N((char)'b', (char)'B'), class02315.N((class02353)class023533, (Object)new class00154(null, class00157.field_58022))}), class02315.N((class02315[])new class02315[]{class02179.N((char)'s', (char)'S'), class02315.N((class02353)class023533, (Object)new class00154(null, class00157.field_58023))}), class02315.N((class02315[])new class02315[]{class02179.N((char)'i', (char)'I'), class02315.N((class02353)class023533, (Object)new class00154(null, class00157.field_58024))}), class02315.N((class02315[])new class02315[]{class02179.N((char)'l', (char)'L'), class02315.N((class02353)class023533, (Object)new class00154(null, class00157.field_58025))})}), class023322 -> (class00154)class023322.y(class023533));
        class02353 class023534 = class02353.N((String)"binary_numeral");
        class023442.N(class023534, (class02324)n);
        class02353 class023535 = class02353.N((String)"decimal_numeral");
        class023442.N(class023535, (class02324)t);
        class02353 class023536 = class02353.N((String)"hex_numeral");
        class023442.N(class023536, (class02324)G);
        class02353 class023537 = class02353.N((String)"integer_literal");
        class08501 class085012 = class023442.N(class023537, class02315.N((class02315[])new class02315[]{class02315.N((class02315)class023442.L(class023532)), class02315.y((class02315[])new class02315[]{class02315.N((class02315[])new class02315[]{class02179.N((char)'0'), class02315.L(), class02315.y((class02315[])new class02315[]{class02315.N((class02315[])new class02315[]{class02179.N((char)'x', (char)'X'), class02315.L(), class023442.L(class023536)}), class02315.N((class02315[])new class02315[]{class02179.N((char)'b', (char)'B'), class023442.L(class023534)}), class02315.N((class02315[])new class02315[]{class023442.L(class023535), class02315.L(), class02315.N(b)}), class02315.N((class02353)class023535, (Object)"0")})}), class023442.L(class023535)}), class02315.N((class02315)class023442.L(class023533))}), class023322 -> {
            class00154 class001542 = (class00154)class023322.y(class023533, (Object)class00154.L);
            class00150 class001502 = (class00150)class023322.y(class023532, (Object)class00150.field_58014);
            String string = (String)class023322.N(class023535);
            if (string != null) {
                return new class00170(class001502, class00182.field_58010, string, class001542);
            }
            String string2 = (String)class023322.N(class023536);
            if (string2 != null) {
                return new class00170(class001502, class00182.field_58011, string2, class001542);
            }
            String string3 = (String)class023322.y(class023534);
            return new class00170(class001502, class00182.field_58009, string3, class001542);
        });
        class02353 class023538 = class02353.N((String)"float_type_suffix");
        class023442.N(class023538, class02315.y((class02315[])new class02315[]{class02315.N((class02315[])new class02315[]{class02179.N((char)'f', (char)'F'), class02315.N((class02353)class023538, (Object)class00157.field_58020)}), class02315.N((class02315[])new class02315[]{class02179.N((char)'d', (char)'D'), class02315.N((class02353)class023538, (Object)class00157.field_58021)})}), class023322 -> (class00157)class023322.y(class023538));
        class02353 class023539 = class02353.N((String)"float_exponent_part");
        class023442.N(class023539, class02315.N((class02315[])new class02315[]{class02179.N((char)'e', (char)'E'), class02315.N((class02315)class023442.L(class023532)), class023442.L(class023535)}), class023322 -> new class00139((class00150)class023322.y(class023532, (Object)class00150.field_58014), (Object)((String)class023322.y(class023535))));
        class02353 class0235310 = class02353.N((String)"float_whole_part");
        class02353 class0235311 = class02353.N((String)"float_fraction_part");
        class02353 class0235312 = class02353.N((String)"float_literal");
        class023442.N(class0235312, class02315.N((class02315[])new class02315[]{class02315.N((class02315)class023442.L(class023532)), class02315.y((class02315[])new class02315[]{class02315.N((class02315[])new class02315[]{class023442.N(class023535, class0235310), class02179.N((char)'.'), class02315.L(), class02315.N((class02315)class023442.N(class023535, class0235311)), class02315.N((class02315)class023442.L(class023539)), class02315.N((class02315)class023442.L(class023538))}), class02315.N((class02315[])new class02315[]{class02179.N((char)'.'), class02315.L(), class023442.N(class023535, class0235311), class02315.N((class02315)class023442.L(class023539)), class02315.N((class02315)class023442.L(class023538))}), class02315.N((class02315[])new class02315[]{class023442.N(class023535, class0235310), class023442.L(class023539), class02315.L(), class02315.N((class02315)class023442.L(class023538))}), class02315.N((class02315[])new class02315[]{class023442.N(class023535, class0235310), class02315.N((class02315)class023442.L(class023539)), class023442.L(class023538)})})}), class023252 -> {
            class02332 class023322 = class023252.N();
            class00150 class001502 = (class00150)class023322.y(class023532, (Object)class00150.field_58014);
            String string = (String)class023322.N(class0235310);
            String string2 = (String)class023322.N(class0235311);
            class00139 class001392 = (class00139)class023322.N(class023539);
            class00157 class001572 = (class00157)class023322.N(class023538);
            return class08876.N(dynamicOps, class001502, string, string2, (class00139<String>)class001392, class001572, class023252);
        });
        class02353 class0235313 = class02353.N((String)"string_hex_2");
        class023442.N(class0235313, (class02324)new class09176(2));
        class02353 class0235314 = class02353.N((String)"string_hex_4");
        class023442.N(class0235314, (class02324)new class09176(4));
        class02353 class0235315 = class02353.N((String)"string_hex_8");
        class023442.N(class0235315, (class02324)new class09176(8));
        class02353 class0235316 = class02353.N((String)"string_unicode_name");
        class023442.N(class0235316, (class02324)new class08513(w, Z));
        class02353 class0235317 = class02353.N((String)"string_escape_sequence");
        class023442.N(class0235317, class02315.y((class02315[])new class02315[]{class02315.N((class02315[])new class02315[]{class02179.N((char)'b'), class02315.N((class02353)class0235317, (Object)"\b")}), class02315.N((class02315[])new class02315[]{class02179.N((char)'s'), class02315.N((class02353)class0235317, (Object)" ")}), class02315.N((class02315[])new class02315[]{class02179.N((char)'t'), class02315.N((class02353)class0235317, (Object)"\t")}), class02315.N((class02315[])new class02315[]{class02179.N((char)'n'), class02315.N((class02353)class0235317, (Object)"\n")}), class02315.N((class02315[])new class02315[]{class02179.N((char)'f'), class02315.N((class02353)class0235317, (Object)"\f")}), class02315.N((class02315[])new class02315[]{class02179.N((char)'r'), class02315.N((class02353)class0235317, (Object)"\r")}), class02315.N((class02315[])new class02315[]{class02179.N((char)'\\'), class02315.N((class02353)class0235317, (Object)"\\")}), class02315.N((class02315[])new class02315[]{class02179.N((char)'\''), class02315.N((class02353)class0235317, (Object)"'")}), class02315.N((class02315[])new class02315[]{class02179.N((char)'\"'), class02315.N((class02353)class0235317, (Object)"\"")}), class02315.N((class02315[])new class02315[]{class02179.N((char)'x'), class023442.L(class0235313)}), class02315.N((class02315[])new class02315[]{class02179.N((char)'u'), class023442.L(class0235314)}), class02315.N((class02315[])new class02315[]{class02179.N((char)'U'), class023442.L(class0235315)}), class02315.N((class02315[])new class02315[]{class02179.N((char)'N'), class02179.N((char)'{'), class023442.L(class0235316), class02179.N((char)'}')})}), class023252 -> {
            int n;
            class02332 class023322 = class023252.N();
            String string = (String)class023322.y(new class02353[]{class0235317});
            if (string != null) {
                return string;
            }
            String string2 = (String)class023322.y(new class02353[]{class0235313, class0235314, class0235315});
            if (string2 != null) {
                int n2 = HexFormat.fromHexDigits((CharSequence)string2);
                if (!Character.isValidCodePoint(n2)) {
                    class023252.y().N(class023252.M(), (Object)class08524.N((DynamicCommandExceptionType)R, (String)String.format(Locale.ROOT, "U+%08X", n2)));
                    return null;
                }
                return Character.toString(n2);
            }
            String string3 = (String)class023322.y(class0235316);
            try {
                n = Character.codePointOf(string3);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                class023252.y().N(class023252.M(), Z);
                return null;
            }
            return Character.toString(n);
        });
        class02353 class0235318 = class02353.N((String)"string_plain_contents");
        class023442.N(class0235318, (class02324)l);
        class02353 class0235319 = class02353.N((String)"string_chunks");
        class02353 class0235320 = class02353.N((String)"string_contents");
        class02353 class0235321 = class02353.N((String)"single_quoted_string_chunk");
        class08501 class085013 = class023442.N(class0235321, class02315.y((class02315[])new class02315[]{class023442.N(class0235318, class0235320), class02315.N((class02315[])new class02315[]{class02179.N((char)'\\'), class023442.N(class0235317, class0235320)}), class02315.N((class02315[])new class02315[]{class02179.N((char)'\"'), class02315.N((class02353)class0235320, (Object)"\"")})}), class023322 -> (String)class023322.y(class0235320));
        class02353 class0235322 = class02353.N((String)"single_quoted_string_contents");
        class023442.N(class0235322, class02315.N((class08501)class085013, (class02353)class0235319), class023322 -> class08876.N((List)class023322.y(class0235319)));
        class02353 class0235323 = class02353.N((String)"double_quoted_string_chunk");
        class08501 class085014 = class023442.N(class0235323, class02315.y((class02315[])new class02315[]{class023442.N(class0235318, class0235320), class02315.N((class02315[])new class02315[]{class02179.N((char)'\\'), class023442.N(class0235317, class0235320)}), class02315.N((class02315[])new class02315[]{class02179.N((char)'\''), class02315.N((class02353)class0235320, (Object)"'")})}), class023322 -> (String)class023322.y(class0235320));
        class02353 class0235324 = class02353.N((String)"double_quoted_string_contents");
        class023442.N(class0235324, class02315.N((class08501)class085014, (class02353)class0235319), class023322 -> class08876.N((List)class023322.y(class0235319)));
        class02353 class0235325 = class02353.N((String)"quoted_string_literal");
        class023442.N(class0235325, class02315.y((class02315[])new class02315[]{class02315.N((class02315[])new class02315[]{class02179.N((char)'\"'), class02315.L(), class02315.N((class02315)class023442.N(class0235324, class0235320)), class02179.N((char)'\"')}), class02315.N((class02315[])new class02315[]{class02179.N((char)'\''), class02315.N((class02315)class023442.N(class0235322, class0235320)), class02179.N((char)'\'')})}), class023322 -> (String)class023322.y(class0235320));
        class02353 class0235326 = class02353.N((String)"unquoted_string");
        class023442.N(class0235326, (class02324)new class08515(1, U));
        class02353 class0235327 = class02353.N((String)"literal");
        class02353 class0235328 = class02353.N((String)"arguments");
        class023442.N(class0235328, class02315.N((class08501)class023442.y(class0235327), (class02353)class0235328, (class02315)class02179.N((char)',')), class023322 -> (List)class023322.y(class0235328));
        class02353 class0235329 = class02353.N((String)"unquoted_string_or_builtin");
        class023442.N(class0235329, class02315.N((class02315[])new class02315[]{class023442.L(class0235326), class02315.N((class02315)class02315.N((class02315[])new class02315[]{class02179.N((char)'('), class023442.L(class0235328), class02179.N((char)')')}))}), class023252 -> {
            class02332 class023322 = class023252.N();
            String string = (String)class023322.y(class0235326);
            if (string.isEmpty() || !class08876.L(string.charAt(0))) {
                class023252.y().N(class023252.M(), class00174.R, z);
                return null;
            }
            List list = (List)class023322.N(class0235328);
            if (list != null) {
                class00164 class001642 = new class00164(string, list.size());
                class00171 class001712 = (class00171)class00174.i.get(class001642);
                if (class001712 != null) {
                    return class001712.N(dynamicOps, list, class023252);
                }
                class023252.y().N(class023252.M(), (Object)class08524.N((DynamicCommandExceptionType)M, (String)class001642.toString()));
                return null;
            }
            if (string.equalsIgnoreCase("true")) {
                return object;
            }
            if (string.equalsIgnoreCase("false")) {
                return object2;
            }
            return dynamicOps.createString(string);
        });
        class02353 class0235330 = class02353.N((String)"map_key");
        class023442.N(class0235330, class02315.y((class02315[])new class02315[]{class023442.L(class0235325), class023442.L(class0235326)}), class023322 -> (String)class023322.L(new class02353[]{class0235325, class0235326}));
        class02353 class0235331 = class02353.N((String)"map_entry");
        class08501 class085015 = class023442.N(class0235331, class02315.N((class02315[])new class02315[]{class023442.L(class0235330), class02179.N((char)':'), class023442.L(class0235327)}), class023252 -> {
            class02332 class023322 = class023252.N();
            String string = (String)class023322.y(class0235330);
            if (string.isEmpty()) {
                class023252.y().N(class023252.M(), T);
                return null;
            }
            Object object = class023322.y(class0235327);
            return Map.entry(string, object);
        });
        class02353 class0235332 = class02353.N((String)"map_entries");
        class023442.N(class0235332, class02315.N((class08501)class085015, (class02353)class0235332, (class02315)class02179.N((char)',')), class023322 -> (List)class023322.y(class0235332));
        class02353 class0235333 = class02353.N((String)"map_literal");
        class023442.N(class0235333, class02315.N((class02315[])new class02315[]{class02179.N((char)'{'), class023442.L(class0235332), class02179.N((char)'}')}), class023322 -> {
            List list = (List)class023322.y(class0235332);
            if (list.isEmpty()) {
                return object3;
            }
            ImmutableMap.Builder builder = ImmutableMap.builderWithExpectedSize((int)list.size());
            for (Map.Entry entry : list) {
                builder.put(dynamicOps.createString((String)entry.getKey()), entry.getValue());
            }
            return dynamicOps.createMap((Map)builder.buildKeepingLast());
        });
        class02353 class0235334 = class02353.N((String)"list_entries");
        class023442.N(class0235334, class02315.N((class08501)class023442.y(class0235327), (class02353)class0235334, (class02315)class02179.N((char)',')), class023322 -> (List)class023322.y(class0235334));
        class02353 class0235335 = class02353.N((String)"array_prefix");
        class023442.N(class0235335, class02315.y((class02315[])new class02315[]{class02315.N((class02315[])new class02315[]{class02179.N((char)'B'), class02315.N((class02353)class0235335, (Object)((Object)class08886.field_58002))}), class02315.N((class02315[])new class02315[]{class02179.N((char)'L'), class02315.N((class02353)class0235335, (Object)((Object)class08886.field_58004))}), class02315.N((class02315[])new class02315[]{class02179.N((char)'I'), class02315.N((class02353)class0235335, (Object)((Object)class08886.field_58003))})}), class023322 -> (class08886)((Object)((Object)class023322.y(class0235335))));
        class02353 class0235336 = class02353.N((String)"int_array_entries");
        class023442.N(class0235336, class02315.N((class08501)class085012, (class02353)class0235336, (class02315)class02179.N((char)',')), class023322 -> (List)class023322.y(class0235336));
        class02353 class0235337 = class02353.N((String)"list_literal");
        class023442.N(class0235337, class02315.N((class02315[])new class02315[]{class02179.N((char)'['), class02315.y((class02315[])new class02315[]{class02315.N((class02315[])new class02315[]{class023442.L(class0235335), class02179.N((char)';'), class023442.L(class0235336)}), class023442.L(class0235334)}), class02179.N((char)']')}), class023252 -> {
            class02332 class023322 = class023252.N();
            class08886 class088862 = (class08886)((Object)((Object)class023322.N(class0235335)));
            if (class088862 != null) {
                List list = (List)class023322.y(class0235336);
                return list.isEmpty() ? class088862.N(dynamicOps) : class088862.N(dynamicOps, list, class023252);
            }
            List list = (List)class023322.y(class0235334);
            return list.isEmpty() ? object4 : dynamicOps.createList(list.stream());
        });
        class08501 class085016 = class023442.N(class0235327, class02315.y((class02315[])new class02315[]{class02315.N((class02315[])new class02315[]{class02315.y((class02315)d), class02315.y((class02315[])new class02315[]{class023442.N(class0235312, class0235327), class023442.L(class023537)})}), class02315.N((class02315[])new class02315[]{class02315.y((class02315)class02179.N((char)'\"', (char)'\'')), class02315.L(), class023442.L(class0235325)}), class02315.N((class02315[])new class02315[]{class02315.y((class02315)class02179.N((char)'{')), class02315.L(), class023442.N(class0235333, class0235327)}), class02315.N((class02315[])new class02315[]{class02315.y((class02315)class02179.N((char)'[')), class02315.L(), class023442.N(class0235337, class0235327)}), class023442.N(class0235329, class0235327)}), class023252 -> {
            class02332 class023322 = class023252.N();
            String string = (String)class023322.N(class0235325);
            if (string != null) {
                return dynamicOps.createString(string);
            }
            class00170 class001702 = (class00170)class023322.N(class023537);
            if (class001702 != null) {
                return class001702.N(dynamicOps, class023252);
            }
            return class023322.y(class0235327);
        });
        return new class02169(class023442, class085016);
    }

    static void N(StringBuilder stringBuilder, String string, boolean bl) {
        if (bl) {
            for (char c : string.toCharArray()) {
                if (c == '_') continue;
                stringBuilder.append(c);
            }
        } else {
            stringBuilder.append(string);
        }
    }

    private static <T> @Nullable T N(DynamicOps<T> dynamicOps, class02325<?> class023252, String string) {
        float f = Float.parseFloat(string);
        if (!Float.isFinite(f)) {
            class023252.y().N(class023252.M(), j);
            return null;
        }
        return (T)dynamicOps.createFloat(f);
    }

    private static <T> @Nullable T N(DynamicOps<T> dynamicOps, class00150 class001502, @Nullable String string, @Nullable String string2, @Nullable class00139<String> class001392, @Nullable class00157 class001572, class02325<?> class023252) {
        StringBuilder stringBuilder = new StringBuilder();
        class001502.N(stringBuilder);
        if (string != null) {
            class08876.N(stringBuilder, string);
        }
        if (string2 != null) {
            stringBuilder.append('.');
            class08876.N(stringBuilder, string2);
        }
        if (class001392 != null) {
            stringBuilder.append('e');
            class001392.N().N(stringBuilder);
            class08876.N(stringBuilder, (String)class001392.y());
        }
        try {
            String string3 = stringBuilder.toString();
            class00157 class001573 = class001572;
            int n = 0;
            return switch (SwitchBootstraps.enumSwitch("enumSwitch", new Object[]{"FLOAT", "DOUBLE"}, (class00157)class001573, (int)n)) {
                case 0 -> class08876.N(dynamicOps, class023252, string3);
                case 1 -> class08876.y(dynamicOps, class023252, string3);
                case -1 -> class08876.y(dynamicOps, class023252, string3);
                default -> {
                    class023252.y().N(class023252.M(), B);
                    yield null;
                }
            };
        }
        catch (NumberFormatException numberFormatException) {
            class023252.y().N(class023252.M(), class08876.N(numberFormatException));
            return null;
        }
    }

    static short N(String string, int n) {
        int n2 = Integer.parseInt(string, n);
        if (n2 >> 16 == 0) {
            return (short)n2;
        }
        throw new NumberFormatException("out of range: " + n2);
    }

    private static void N(StringBuilder stringBuilder, String string) {
        class08876.N(stringBuilder, string, class08876.N(string));
    }

    static boolean N(String string) {
        return string.indexOf(95) != -1;
    }
}

