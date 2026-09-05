/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import org.jspecify.annotations.Nullable;

public final class class01980
extends Enum<class01980> {
    public static final /* enum */ class01980 field_42891 = new class01980("generic_violation");
    public static final /* enum */ class01980 field_42892 = new class01980("false_reporting");
    public static final /* enum */ class01980 field_42893 = new class01980("hate_speech");
    public static final /* enum */ class01980 field_42894 = new class01980("hate_terrorism_notorious_figure");
    public static final /* enum */ class01980 field_42895 = new class01980("harassment_or_bullying");
    public static final /* enum */ class01980 field_42896 = new class01980("defamation_impersonation_false_information");
    public static final /* enum */ class01980 field_42897 = new class01980("drugs");
    public static final /* enum */ class01980 field_42898 = new class01980("fraud");
    public static final /* enum */ class01980 field_42899 = new class01980("spam_or_advertising");
    public static final /* enum */ class01980 field_42900 = new class01980("nudity_or_pornography");
    public static final /* enum */ class01980 field_42901 = new class01980("sexually_inappropriate");
    public static final /* enum */ class01980 field_42902 = new class01980("extreme_violence_or_gore");
    public static final /* enum */ class01980 field_42903 = new class01980("imminent_harm_to_person_or_property");
    private final class00392 field_42904;
    private static final /* synthetic */ class01980[] field_42905;

    private class01980(String string2) {
        this.field_42904 = class00392.L((String)("gui.banned.reason." + string2));
    }

    static {
        field_42905 = class01980.y();
    }

    public static class01980[] values() {
        return (class01980[])field_42905.clone();
    }

    public static class01980 valueOf(String string) {
        return Enum.valueOf(class01980.class, string);
    }

    private static /* synthetic */ class01980[] y() {
        return new class01980[]{field_42891, field_42892, field_42893, field_42894, field_42895, field_42896, field_42897, field_42898, field_42899, field_42900, field_42901, field_42902, field_42903};
    }

    public static @Nullable class01980 N(int n) {
        return switch (n) {
            case 17, 19, 23, 31 -> field_42891;
            case 2 -> field_42892;
            case 5 -> field_42893;
            case 16, 25 -> field_42894;
            case 21 -> field_42895;
            case 27 -> field_42896;
            case 28 -> field_42897;
            case 29 -> field_42898;
            case 30 -> field_42899;
            case 32 -> field_42900;
            case 33, 35, 36 -> field_42901;
            case 34 -> field_42902;
            case 53 -> field_42903;
            default -> null;
        };
    }

    public class00392 N() {
        return this.field_42904;
    }
}

