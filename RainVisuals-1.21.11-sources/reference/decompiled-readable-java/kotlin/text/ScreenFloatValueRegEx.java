/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c2\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lkotlin/text/ScreenFloatValueRegEx;", "", "<init>", "()V", "Lkotlin/text/Regex;", "value", "Lkotlin/text/Regex;", "kotlin-stdlib"})
final class ScreenFloatValueRegEx {
    @JvmField
    @NotNull
    public static final Regex value;
    @NotNull
    public static final ScreenFloatValueRegEx INSTANCE;

    /*
     * WARNING - void declaration
     */
    static {
        void var8_8;
        ScreenFloatValueRegEx screenFloatValueRegEx;
        ScreenFloatValueRegEx $this$value_u24lambda_u240 = screenFloatValueRegEx = (INSTANCE = new ScreenFloatValueRegEx());
        boolean bl = false;
        String Digits = "(\\p{Digit}+)";
        String HexDigits = "(\\p{XDigit}+)";
        String Exp = "[eE][+-]?" + Digits;
        String HexString = "(0[xX]" + HexDigits + "(\\.)?)|(0[xX]" + HexDigits + "?(\\.)" + HexDigits + ')';
        String Number2 = '(' + Digits + "(\\.)?(" + Digits + "?)(" + Exp + ")?)|(\\.(" + Digits + ")(" + Exp + ")?)|((" + HexString + ")[pP][+-]?" + Digits + ')';
        String fpRegex = "[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + Number2 + ")[fFdD]?))[\\x00-\\x20]*";
        value = new Regex((String)var8_8);
    }

    private ScreenFloatValueRegEx() {
    }
}

