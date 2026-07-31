/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.hud.container;

import java.awt.Color;
import kotakbaz.rain.client.ClickGuiSettings;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\r\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004\u00a2\u0006\u0004\b\n\u0010\u0006J\r\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000b\u0010\u0006J\r\u0010\f\u001a\u00020\u0004\u00a2\u0006\u0004\b\f\u0010\u0006J\r\u0010\r\u001a\u00020\u0004\u00a2\u0006\u0004\b\r\u0010\u0006J\r\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000e\u0010\u0006J\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0017\u0010\u001a\u001a\u00020\u00198\u0006\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\u00020\u00198\u0006\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010 \u001a\u00020\u00198\u0006\u00a2\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\"\u001a\u00020\u00198\u0006\u00a2\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0017\u0010$\u001a\u00020\u00198\u0006\u00a2\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001d\u00a8\u0006&"}, d2={"Lkotakbaz/rain/module/modules/hud/container/HudStyle;", "", "<init>", "()V", "", "scale", "()F", "value", "scaled", "(F)F", "margin", "headerTextSize", "rowTextSize", "rowLeadingGap", "rowDividerWidth", "textSize", "rowLeadingSize", "MARGIN", "F", "HEADER_TEXT_SIZE", "ROW_TEXT_SIZE", "ROW_LEADING_GAP", "ROW_DIVIDER_WIDTH", "CONTAINER_ANIMATION_DURATION", "ELEMENT_ANIMATION_DURATION", "Ljava/awt/Color;", "PANEL_COLOR", "Ljava/awt/Color;", "getPANEL_COLOR", "()Ljava/awt/Color;", "HEADER_COLOR", "getHEADER_COLOR", "TITLE_COLOR", "getTITLE_COLOR", "VALUE_COLOR", "getVALUE_COLOR", "ICON_COLOR", "getICON_COLOR", "rain-visuals"})
public final class HudStyle {
    @NotNull
    public static final HudStyle INSTANCE;
    public static final float a = 6.0f;
    public static final float A = 9.0f;
    public static final float b = 7.0f;
    public static final float B = 6.0f;
    public static final float c = 1.2f;
    public static final float C = 80.0f;
    public static final float d = 80.0f;
    @NotNull
    private static final Color D;
    @NotNull
    private static final Color e;
    @NotNull
    private static final Color E;
    @NotNull
    private static final Color f;
    @NotNull
    private static final Color F;
    public static int[] G;

    private HudStyle() {
    }

    @NotNull
    public final Color getPANEL_COLOR() {
        return D;
    }

    @NotNull
    public final Color getHEADER_COLOR() {
        return e;
    }

    @NotNull
    public final Color getTITLE_COLOR() {
        return E;
    }

    @NotNull
    public final Color getVALUE_COLOR() {
        return f;
    }

    @NotNull
    public final Color getICON_COLOR() {
        return F;
    }

    public final float scale() {
        return ClickGuiSettings.INSTANCE.hudScale();
    }

    public final float scaled(float value2) {
        return value2 * this.scale();
    }

    public final float margin() {
        return this.scaled(6.0f);
    }

    public final float headerTextSize() {
        return this.scaled(9.0f);
    }

    public final float rowTextSize() {
        return this.scaled(7.0f);
    }

    public final float rowLeadingGap() {
        return this.scaled(6.0f);
    }

    public final float rowDividerWidth() {
        return this.scaled(1.2f);
    }

    public final float rowLeadingSize(float textSize) {
        return textSize + this.scaled(1.0f);
    }

    static {
        HudStyle.a();
        INSTANCE = new HudStyle();
        int n2 = G[0];
        n2 ^= G[1];
        n2 ^= G[2];
        int n3 = G[3];
        n3 ^= G[4];
        int n4 = G[6];
        n4 -= G[7];
        int n5 = G[9];
        n5 ^= G[10];
        D = new Color(n2, n3 ^= G[5], n4 ^= G[8], n5 -= G[11]);
        int n6 = G[12];
        n6 += G[13];
        n6 += G[14];
        int n7 = G[15];
        n7 ^= G[16];
        int n8 = G[18];
        n8 += G[19];
        int n9 = G[21];
        n9 += G[22];
        e = new Color(n6, n7 -= G[17], n8 += G[20], n9 ^= G[23]);
        int n10 = G[24];
        n10 += G[25];
        n10 += G[26];
        int n11 = G[27];
        n11 += G[28];
        int n12 = G[30];
        n12 += G[31];
        int n13 = G[33];
        n13 -= G[34];
        E = new Color(n10, n11 -= G[29], n12 -= G[32], n13 ^= G[35]);
        int n14 = G[36];
        n14 -= G[37];
        n14 ^= G[38];
        int n15 = G[39];
        n15 -= G[40];
        int n16 = G[42];
        n16 ^= G[43];
        int n17 = G[45];
        n17 += G[46];
        f = new Color(n14, n15 += G[41], n16 += G[44], n17 += G[47]);
        int n18 = G[48];
        n18 += G[49];
        n18 ^= G[50];
        int n19 = G[51];
        n19 += G[52];
        int n20 = G[54];
        n20 += G[55];
        int n21 = G[57];
        n21 ^= G[58];
        F = new Color(n18, n19 += G[53], n20 += G[56], n21 -= G[59]);
    }

    public static void a() {
        G = new int[0x1EDF ^ 0x1EE3];
        HudStyle.G[0xBBD5 ^ 0xBBF0] = 0xBBB2 ^ 0xBBF0;
        HudStyle.G[0x8DDD ^ 0x8DCB] = 0xFFFF7237 ^ 0x8DCB;
        HudStyle.G[0x1AAE ^ 0x1AA3] = 0xFFFFE56F ^ 0x1AA3;
        HudStyle.G[0x1041B ^ 0x10420] = 0xFFFEFBE8 ^ 0x10420;
        HudStyle.G[0xD03E ^ 0xD00C] = 0xFFFF2FAC ^ 0xD00C;
        HudStyle.G[0x5F13 ^ 0x5F17] = 0xFFFFA0BD ^ 0x5F17;
        HudStyle.G[0x4021 ^ 0x403A] = 0x40A0 ^ 0x403A;
        HudStyle.G[0x78F3 ^ 0x78C4] = 0x7896 ^ 0x78C4;
        HudStyle.G[0xCC1B ^ 0xCC2D] = 0xCC0E ^ 0xCC2D;
        HudStyle.G[0xE98E ^ 0xE9A6] = 0xFFFF1658 ^ 0xE9A6;
        HudStyle.G[0x111 ^ 0x122] = 0x172 ^ 0x122;
        HudStyle.G[0xE3BB ^ 0xE38A] = 0xFFFF1C36 ^ 0xE38A;
        HudStyle.G[0x61F1 ^ 0x61D8] = 0x6189 ^ 0x61D8;
        HudStyle.G[0x10442 ^ 0x10478] = 0xFFFEFBC5 ^ 0x10478;
        HudStyle.G[0xEA3B ^ 0xEA3E] = 0xEA20 ^ 0xEA3E;
        HudStyle.G[0x27C9 ^ 0x27E6] = 0x27F5 ^ 0x27E6;
        HudStyle.G[0x58A9 ^ 0x5889] = 0x58A6 ^ 0x5889;
        HudStyle.G[0x949E ^ 0x9495] = 0x94A7 ^ 0x9495;
        HudStyle.G[0xEF94 ^ 0xEFAC] = 0xEFA7 ^ 0xEFAC;
        HudStyle.G[0x9861 ^ 0x9845] = 0x9974 ^ 0x9845;
        HudStyle.G[0xCD73 ^ 0xCD61] = 0xCC71 ^ 0xCD61;
        HudStyle.G[0x9322 ^ 0x9309] = 0x936A ^ 0x9309;
        HudStyle.G[0x3D05 ^ 0x3D22] = 0x3D0F ^ 0x3D22;
        HudStyle.G[0x46E8 ^ 0x46CB] = 0x46F2 ^ 0x46CB;
        HudStyle.G[0x7E67 ^ 0x7E4B] = 0x7E44 ^ 0x7E4B;
        HudStyle.G[0xB839 ^ 0xB81B] = 0xFFFF4792 ^ 0xB81B;
        HudStyle.G[0xA997 ^ 0xA9A7] = 0xFFFF56C3 ^ 0xA9A7;
        HudStyle.G[0x9530 ^ 0x9530] = 0x9579 ^ 0x9530;
        HudStyle.G[0xBAC7 ^ 0xBADA] = 0xFFFF4543 ^ 0xBADA;
        HudStyle.G[0xAF6A ^ 0xAF44] = 0xFFFF50D9 ^ 0xAF44;
        HudStyle.G[0x51EF ^ 0x51F3] = 0xFFFFAE18 ^ 0x51F3;
        HudStyle.G[0x7446 ^ 0x7444] = 0xFFFF8B96 ^ 0x7444;
        HudStyle.G[0x6042 ^ 0x6048] = 0xFFFF9FD6 ^ 0x6048;
        HudStyle.G[0x376A ^ 0x3740] = 0x3752 ^ 0x3740;
        HudStyle.G[0x2D6 ^ 0x2E3] = 0x2FD ^ 0x2E3;
        HudStyle.G[0x51F5 ^ 0x51EB] = 0x5063 ^ 0x51EB;
        HudStyle.G[0xBAD0 ^ 0xBAE9] = 0xFFFF4593 ^ 0xBAE9;
        HudStyle.G[0xFB7D ^ 0xFB74] = 0xFFFF05DB ^ 0xFB74;
        HudStyle.G[0xEFA2 ^ 0xEF83] = 0xEFCC ^ 0xEF83;
        HudStyle.G[0x10864 ^ 0x1086C] = 0xFFFEF78C ^ 0x1086C;
        HudStyle.G[0x1089B ^ 0x1089D] = 0x108FD ^ 0x1089D;
        HudStyle.G[0xB576 ^ 0xB577] = 0xFFFF4AE4 ^ 0xB577;
        HudStyle.G[0xDF9 ^ 0xDEA] = 0xD82 ^ 0xDEA;
        HudStyle.G[0x5DAB ^ 0x5DBB] = 0xFFFFA210 ^ 0x5DBB;
        HudStyle.G[0x814B ^ 0x815F] = 0xFFFF7ED8 ^ 0x815F;
        HudStyle.G[0x17F6 ^ 0x17E9] = 0xFFFFE87E ^ 0x17E9;
        HudStyle.G[0x50FC ^ 0x50E6] = 0xFFFFAF27 ^ 0x50E6;
        HudStyle.G[0xE0D9 ^ 0xE0C8] = 0xE0F1 ^ 0xE0C8;
        HudStyle.G[0x6482 ^ 0x64B6] = 0x64A4 ^ 0x64B6;
        HudStyle.G[0xBC5F ^ 0xBC5C] = 0xFFFF43E0 ^ 0xBC5C;
        HudStyle.G[0x2BA6 ^ 0x2BB1] = 0xFFFFD44B ^ 0x2BB1;
        HudStyle.G[0x1002E ^ 0x10021] = 0xFFFEFEB2 ^ 0x10021;
        HudStyle.G[0xD248 ^ 0xD265] = 0xD32A ^ 0xD265;
        HudStyle.G[0xA4FB ^ 0xA4E3] = 0xA5E0 ^ 0xA4E3;
        HudStyle.G[0xB9B6 ^ 0xB990] = 0xB9FF ^ 0xB990;
        HudStyle.G[0xC936 ^ 0xC931] = 0xC949 ^ 0xC931;
        HudStyle.G[0x88FE ^ 0x88E7] = 0x88CF ^ 0x88E7;
        HudStyle.G[0x4AB6 ^ 0x4AA3] = 0xFFFFB544 ^ 0x4AA3;
        HudStyle.G[0x9BFC ^ 0x9BF0] = 0x9AFD ^ 0x9BF0;
        HudStyle.G[0xFA81 ^ 0xFA8F] = 0xFAA9 ^ 0xFA8F;
    }
}

