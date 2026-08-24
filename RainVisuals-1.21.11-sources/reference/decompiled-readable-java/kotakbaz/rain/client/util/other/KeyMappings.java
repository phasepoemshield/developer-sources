/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.glfw.GLFW
 */
package kotakbaz.rain.client.util.other;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R'\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0018"}, d2={"Loxxxde/\u0637\u0650;", "", "<init>", "()V", "", "key", "", "getKey", "(I)Ljava/lang/String;", "input", "formatKeyLabel", "(Ljava/lang/String;)Ljava/lang/String;", "raw", "formatWord", "NONE", "Ljava/lang/String;", "", "mouseLabels", "Ljava/util/Map;", "keyLabels$delegate", "Lkotlin/Lazy;", "getKeyLabels", "()Ljava/util/Map;", "keyLabels", "rain-visuals"})
public final class KeyMappings {
    @NotNull
    private static final String NONE = "None";
    @NotNull
    private static final Lazy keyLabels$delegate;
    @NotNull
    private static final Map<Integer, String> mouseLabels;
    @NotNull
    public static final KeyMappings INSTANCE;

    private KeyMappings() {
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final String getKey(int key) {
        if (key == -1) {
            return NONE;
        }
        String string = mouseLabels.get(key);
        if (string != null) {
            void var3_3;
            String it = string;
            boolean bl = false;
            return var3_3;
        }
        String string2 = this.getKeyLabels().get(key);
        if (string2 == null) {
            string2 = NONE;
        }
        return string2;
    }

    static {
        INSTANCE = new KeyMappings();
        Pair[] pairArray = new Pair[8];
        pairArray[0] = TuplesKt.to(0, "MouseLeft");
        pairArray[1] = TuplesKt.to(1, "MouseRight");
        pairArray[2] = TuplesKt.to(2, "MouseMiddle");
        pairArray[3] = TuplesKt.to(3, "Mouse4");
        pairArray[4] = TuplesKt.to(4, "Mouse5");
        pairArray[5] = TuplesKt.to(5, "Mouse6");
        pairArray[6] = TuplesKt.to(6, "Mouse7");
        pairArray[7] = TuplesKt.to(7, "Mouse8");
        mouseLabels = MapsKt.mapOf(pairArray);
        keyLabels$delegate = LazyKt.lazy(KeyMappings::keyLabels_delegate$lambda$0);
    }

    /*
     * WARNING - void declaration
     */
    private final String formatWord(String raw) {
        String string;
        boolean bl = ((CharSequence)raw).length() == 0;
        if (bl) {
            return "";
        }
        String string2 = raw.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
        String value = string2;
        value = StringsKt.replace$default(value, "accent", "", false, 4, null);
        value = StringsKt.replace$default(value, "control", "ctrl", false, 4, null);
        value = StringsKt.replace$default(value, "super", "Super", false, 4, null);
        value = StringsKt.replace$default(value, "minus", "Minus", false, 4, null);
        value = StringsKt.replace$default(value, "equals", "Equals", false, 4, null);
        String string3 = value;
        boolean bl2 = ((CharSequence)string3).length() > 0;
        if (bl2) {
            void var4_4;
            char it = string3.charAt(0);
            StringBuilder stringBuilder = new StringBuilder();
            int n = 0;
            StringBuilder stringBuilder2 = stringBuilder.append((Object)(Character.isLowerCase((char)var4_4) ? CharsKt.titlecase((char)var4_4) : String.valueOf((char)var4_4)));
            String string4 = string3;
            n = 1;
            String string5 = string4.substring(n);
            Intrinsics.checkNotNullExpressionValue(string5, "substring(...)");
            string = stringBuilder2.append(string5).toString();
        } else {
            string = string3;
        }
        return string;
    }

    private final String formatKeyLabel(String input) {
        if (((CharSequence)input).length() == 0) {
            return input;
        }
        if (StringsKt.startsWith$default(input, "LEFT_", false, 2, null)) {
            String string = input.substring(5);
            Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
            return "L" + this.formatWord(string);
        }
        if (StringsKt.startsWith$default(input, "RIGHT_", false, 2, null)) {
            String string = input.substring(6);
            Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
            return "R" + this.formatWord(string);
        }
        if (StringsKt.startsWith$default(input, "KP_", false, 2, null)) {
            String string = input.substring(3);
            Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
            return "Numpad" + this.formatWord(string);
        }
        return switch (input) {
            case "PRINT_SCREEN" -> "PrintScreen";
            case "CAPS_LOCK" -> "CapsLock";
            case "NUM_LOCK" -> "NumLock";
            case "PAGE_UP" -> "PageUp";
            case "PAGE_DOWN" -> "PageDown";
            default -> this.formatWord(StringsKt.replace$default(input, "_", "", false, 4, null));
        };
    }

    private final Map<Integer, String> getKeyLabels() {
        Lazy lazy = keyLabels$delegate;
        return (Map)lazy.getValue();
    }

    /*
     * WARNING - void declaration
     */
    private static final HashMap keyLabels_delegate$lambda$0() {
        void var0;
        HashMap mappings = new HashMap();
        Field[] fieldArray = GLFW.class.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(fieldArray, "getDeclaredFields(...)");
        Field[] fieldArray2 = fieldArray;
        int n = fieldArray2.length;
        for (int i = 0; i < n; ++i) {
            Object object;
            Field field = fieldArray2[i];
            String string = field.getName();
            Intrinsics.checkNotNullExpressionValue(string, "getName(...)");
            if (!StringsKt.startsWith$default(string, "GLFW_KEY_", false, 2, null) || !Intrinsics.areEqual(field.getType(), Integer.TYPE)) continue;
            Object object2 = INSTANCE;
            try {
                KeyMappings $this$keyLabels_delegate_u24lambda_u240_u240 = object2;
                boolean bl = false;
                object = Result.constructor-impl(field.getInt(null));
            }
            catch (Throwable throwable) {
                object = Result.constructor-impl(ResultKt.createFailure(throwable));
            }
            object2 = object;
            Integer n2 = (Integer)(Result.isFailure-impl(object2) ? null : object2);
            if (n2 == null) {
                continue;
            }
            int keyCode = n2;
            String string2 = field.getName();
            Intrinsics.checkNotNullExpressionValue(string2, "getName(...)");
            String rawName = StringsKt.removePrefix(string2, (CharSequence)"GLFW_KEY_");
            ((Map)mappings).put(keyCode, INSTANCE.formatKeyLabel(rawName));
        }
        return var0;
    }
}

