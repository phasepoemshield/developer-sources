/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import org.jspecify.annotations.Nullable;

public final class class00082
extends Enum<class00082> {
    public static final /* enum */ class00082 field_60176 = new class00082("AustraliaEast", "realms.configuration.region.australia_east");
    public static final /* enum */ class00082 field_60177 = new class00082("AustraliaSoutheast", "realms.configuration.region.australia_southeast");
    public static final /* enum */ class00082 field_60178 = new class00082("BrazilSouth", "realms.configuration.region.brazil_south");
    public static final /* enum */ class00082 field_60179 = new class00082("CentralIndia", "realms.configuration.region.central_india");
    public static final /* enum */ class00082 field_60180 = new class00082("CentralUs", "realms.configuration.region.central_us");
    public static final /* enum */ class00082 field_60181 = new class00082("EastAsia", "realms.configuration.region.east_asia");
    public static final /* enum */ class00082 field_60182 = new class00082("EastUs", "realms.configuration.region.east_us");
    public static final /* enum */ class00082 field_60183 = new class00082("EastUs2", "realms.configuration.region.east_us_2");
    public static final /* enum */ class00082 field_60184 = new class00082("FranceCentral", "realms.configuration.region.france_central");
    public static final /* enum */ class00082 field_60185 = new class00082("JapanEast", "realms.configuration.region.japan_east");
    public static final /* enum */ class00082 field_60186 = new class00082("JapanWest", "realms.configuration.region.japan_west");
    public static final /* enum */ class00082 field_60187 = new class00082("KoreaCentral", "realms.configuration.region.korea_central");
    public static final /* enum */ class00082 field_60188 = new class00082("NorthCentralUs", "realms.configuration.region.north_central_us");
    public static final /* enum */ class00082 field_60189 = new class00082("NorthEurope", "realms.configuration.region.north_europe");
    public static final /* enum */ class00082 field_60190 = new class00082("SouthCentralUs", "realms.configuration.region.south_central_us");
    public static final /* enum */ class00082 field_60191 = new class00082("SoutheastAsia", "realms.configuration.region.southeast_asia");
    public static final /* enum */ class00082 field_60192 = new class00082("SwedenCentral", "realms.configuration.region.sweden_central");
    public static final /* enum */ class00082 field_60193 = new class00082("UAENorth", "realms.configuration.region.uae_north");
    public static final /* enum */ class00082 field_60194 = new class00082("UKSouth", "realms.configuration.region.uk_south");
    public static final /* enum */ class00082 field_60195 = new class00082("WestCentralUs", "realms.configuration.region.west_central_us");
    public static final /* enum */ class00082 field_60196 = new class00082("WestEurope", "realms.configuration.region.west_europe");
    public static final /* enum */ class00082 field_60197 = new class00082("WestUs", "realms.configuration.region.west_us");
    public static final /* enum */ class00082 field_60198 = new class00082("WestUs2", "realms.configuration.region.west_us_2");
    public static final /* enum */ class00082 field_60199 = new class00082("invalid", "");
    public final String field_60200;
    public final String field_60201;
    private static final /* synthetic */ class00082[] field_60175;

    private class00082(String string2, String string3) {
        this.field_60200 = string2;
        this.field_60201 = string3;
    }

    static {
        field_60175 = class00082.N();
    }

    public static class00082[] values() {
        return (class00082[])field_60175.clone();
    }

    public static class00082 valueOf(String string) {
        return Enum.valueOf(class00082.class, string);
    }

    private static /* synthetic */ class00082[] N() {
        return new class00082[]{field_60176, field_60177, field_60178, field_60179, field_60180, field_60181, field_60182, field_60183, field_60184, field_60185, field_60186, field_60187, field_60188, field_60189, field_60190, field_60191, field_60192, field_60193, field_60194, field_60195, field_60196, field_60197, field_60198, field_60199};
    }

    public static @Nullable class00082 N(String string) {
        for (class00082 class000822 : class00082.values()) {
            if (!class000822.field_60200.equals(string)) continue;
            return class000822;
        }
        return null;
    }
}

