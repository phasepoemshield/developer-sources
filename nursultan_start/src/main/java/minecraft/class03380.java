/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class03752
 */
package minecraft;

import java.util.List;
import java.util.Locale;
import minecraft.class00392;
import minecraft.class03752;

public final class class03380
extends Enum<class03380> {
    public static final /* enum */ class03380 field_53035 = new class03380("i_want_to_report_them");
    public static final /* enum */ class03380 field_39659 = new class03380("hate_speech");
    public static final /* enum */ class03380 field_39664 = new class03380("harassment_or_bullying");
    public static final /* enum */ class03380 field_39667 = new class03380("self_harm_or_suicide");
    public static final /* enum */ class03380 field_39662 = new class03380("imminent_harm");
    public static final /* enum */ class03380 field_39666 = new class03380("defamation_impersonation_false_information");
    public static final /* enum */ class03380 field_39670 = new class03380("alcohol_tobacco_drugs");
    public static final /* enum */ class03380 field_39661 = new class03380("child_sexual_exploitation_or_abuse");
    public static final /* enum */ class03380 field_39660 = new class03380("terrorism_or_violent_extremism");
    public static final /* enum */ class03380 field_39663 = new class03380("non_consensual_intimate_imagery");
    public static final /* enum */ class03380 field_53036 = new class03380("sexually_inappropriate");
    private final String field_39671;
    private final class00392 field_39672;
    private final class00392 field_39673;
    private static final /* synthetic */ class03380[] field_39674;

    public class00392 L() {
        return this.field_39673;
    }

    private class03380(String string2) {
        this.field_39671 = string2.toUpperCase(Locale.ROOT);
        String string3 = "gui.abuseReport.reason." + string2;
        this.field_39672 = class00392.L((String)string3);
        this.field_39673 = class00392.L((String)(string3 + ".description"));
    }

    static {
        field_39674 = class03380.u();
    }

    public static class03380[] values() {
        return (class03380[])field_39674.clone();
    }

    public static class03380 valueOf(String string) {
        return Enum.valueOf(class03380.class, string);
    }

    private static /* synthetic */ class03380[] u() {
        return new class03380[]{field_53035, field_39659, field_39664, field_39667, field_39662, field_39666, field_39670, field_39661, field_39660, field_39663, field_53036};
    }

    public class00392 y() {
        return this.field_39672;
    }

    public String N() {
        return this.field_39671;
    }

    public static List<class03380> N(class03752 class037522) {
        return switch (class037522) {
            case class03752.field_46064 -> List.of(field_53036);
            case class03752.field_46065 -> List.of(field_39662, field_39666);
            default -> List.of();
        };
    }
}

