/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class07282
 */
package minecraft;

import minecraft.class00392;
import minecraft.class07282;

public final class class03678
extends Enum<class03678> {
    public static final /* enum */ class03678 field_20624 = new class03678("survival", class07282.field_9215);
    public static final /* enum */ class03678 field_20625 = new class03678("hardcore", class07282.field_9215);
    public static final /* enum */ class03678 field_20626 = new class03678("creative", class07282.field_9220);
    public static final /* enum */ class03678 field_20627 = new class03678("spectator", class07282.field_9219);
    public final class07282 field_20629;
    public final class00392 field_42224;
    private final class00392 field_42225;
    private static final /* synthetic */ class03678[] field_20630;

    private class03678(String string2, class07282 class072822) {
        this.field_20629 = class072822;
        this.field_42224 = class00392.L((String)("selectWorld.gameMode." + string2));
        this.field_42225 = class00392.L((String)("selectWorld.gameMode." + string2 + ".info"));
    }

    static {
        field_20630 = class03678.y();
    }

    public static class03678[] values() {
        return (class03678[])field_20630.clone();
    }

    public static class03678 valueOf(String string) {
        return Enum.valueOf(class03678.class, string);
    }

    private static /* synthetic */ class03678[] y() {
        return new class03678[]{field_20624, field_20625, field_20626, field_20627};
    }

    public class00392 N() {
        return this.field_42225;
    }
}

