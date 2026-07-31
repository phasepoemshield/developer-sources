/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.player;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.event.events.AttackEvent;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2fStack;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u0003R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000e\u0010#\u00a8\u0006$"}, d2={"Lkotakbaz/rain/module/modules/player/CrosshairHpModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "Lkotakbaz/rain/event/events/AttackEvent;", "event", "", "onAttack", "(Lkotakbaz/rain/event/events/AttackEvent;)V", "Lnet/minecraft/class_332;", "context", "render", "(Lnet/minecraft/class_332;)V", "Lnet/minecraft/class_1657;", "target", "renderIndicator", "(Lnet/minecraft/class_332;Lnet/minecraft/class_1657;)V", "", "health", "Lnet/minecraft/class_124;", "healthFormatting", "(F)Lnet/minecraft/class_124;", "player", "", "isUsableTarget", "(Lnet/minecraft/class_1657;)Z", "", "timeSinceLastAttack", "()J", "onDisable", "", "TEXT_Y_OFFSET", "I", "lastAttackAt", "J", "Lnet/minecraft/class_1657;", "rain-visuals"})
public final class CrosshairHpModule
extends Module {
    @NotNull
    public static final CrosshairHpModule INSTANCE;
    private static final int a = 7;
    private static long A;
    @Nullable
    private static PlayerEntity b;
    private static Object[] B;
    private static Object C;
    private static Object[] d;
    private static Object[] c;
    private static Object[] D;
    public static int[] e;

    private CrosshairHpModule() {
        int n2 = e[0];
        n2 += e[1];
        int n3 = e[3];
        n3 -= e[4];
        int n4 = e[6];
        n4 += e[7];
        super((String)B[n2 += e[2]], a_0.getPLAYER(), (String)B[n3 += e[5]] + (String)B[n4 -= e[8]]);
    }

    @Commando
    public final void onAttack(@NotNull AttackEvent event) {
        PlayerEntity playerEntity;
        int n2 = e[9];
        n2 ^= e[10];
        Intrinsics.checkNotNullParameter(event, (String)B[n2 += e[11]]);
        Entity entity = event.getEntity();
        PlayerEntity playerEntity2 = playerEntity = entity instanceof PlayerEntity ? (PlayerEntity)entity : null;
        if (playerEntity == null || !this.isUsableTarget(playerEntity)) {
            A = 0L;
            return;
        }
        A = System.currentTimeMillis();
        if (b != playerEntity) {
            b = playerEntity;
        }
    }

    public final void render(@NotNull DrawContext context) {
        int n2 = e[12];
        n2 ^= e[13];
        Intrinsics.checkNotNullParameter(context, (String)B[n2 ^= e[14]]);
        if (!this.isEnabled()) {
            return;
        }
        if (this.timeSinceLastAttack() > 10000L) {
            return;
        }
        PlayerEntity playerEntity = b;
        if (playerEntity == null) {
            return;
        }
        PlayerEntity playerEntity2 = playerEntity;
        if (!this.isUsableTarget(playerEntity2)) {
            return;
        }
        this.renderIndicator(context, playerEntity2);
    }

    private final void renderIndicator(DrawContext context, PlayerEntity target) {
        long l2 = 2827946010806678991L;
        long l3 = -2150262575971377178L;
        long l4 = -1083018458299691733L;
        long l5 = -996565635190795477L;
        long l6 = -6899850810136952092L;
        long l7 = -5927110463525954009L;
        int n2 = e[15];
        n2 -= e[16];
        long l8 = l7;
        int n3 = e[18];
        n3 += e[19];
        l7 = l8 ^ ((long)((int)target.getHealth()) << (n2 ^= e[17]) ^ l8) & -1L << (n3 -= e[20]);
        float f2 = 1.0f;
        int n4 = e[21];
        n4 -= e[22];
        Formatting formatting = this.healthFormatting((int)(l7 >>> (n4 += e[23])));
        int n5 = e[24];
        n5 += e[25];
        long l9 = l7;
        int n6 = e[27];
        n6 += e[28];
        l7 = l9 ^ ((long)((int)(l7 >>> (n5 += e[26]))) ^ l9) & -1L >>> (n6 -= e[29]);
        Formatting formatting2 = formatting;
        String string = "" + formatting2 + (int)l7;
        long l10 = l3;
        int n7 = e[30];
        n7 -= e[31];
        l3 = l10 ^ ((long)kotakbaz.rain.client.extensions.b.getMc().textRenderer.getWidth(string) ^ l10) & -1L >>> (n7 ^= e[32]);
        int n8 = e[33];
        n8 += e[34];
        long l11 = l5;
        int n9 = e[36];
        n9 -= e[37];
        l5 = l11 ^ ((long)((int)((float)kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledHeight() / (f2 * 2.0f))) << (n8 += e[35]) ^ l11) & -1L << (n9 ^= e[38]);
        int n10 = e[39];
        n10 -= e[40];
        long l12 = l4;
        int n11 = e[42];
        n11 += e[43];
        l4 = l12 ^ ((long)((int)((float)kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledWidth() / (f2 * 2.0f) - (float)((int)l3) / 2.0f)) << (n10 ^= e[41]) ^ l12) & -1L << (n11 += e[44]);
        Matrix3x2fStack matrix3x2fStack = context.getMatrices();
        matrix3x2fStack.pushMatrix();
        if (f2 > 1.0f) {
            matrix3x2fStack.scale(f2, f2);
        }
        int n12 = e[45];
        n12 -= e[46];
        n12 -= e[47];
        int n13 = e[48];
        n13 -= e[49];
        n13 += e[50];
        int n14 = e[51];
        n14 -= e[52];
        int n15 = e[54];
        n15 ^= e[55];
        boolean bl = e[57];
        bl ^= e[58];
        context.drawText(kotakbaz.rain.client.extensions.b.getMc().textRenderer, (Text)Text.literal((String)string), (int)(l4 >>> n12), (int)(l5 >>> n13) + (n14 -= e[53]), n15 += e[56], bl += e[59]);
        matrix3x2fStack.popMatrix();
    }

    private final Formatting healthFormatting(float health) {
        return health <= 5.0f ? Formatting.RED : (health <= 10.0f ? Formatting.GOLD : (health <= 15.0f ? Formatting.YELLOW : (health <= 20.0f ? Formatting.GREEN : Formatting.DARK_GREEN)));
    }

    private final boolean isUsableTarget(PlayerEntity player) {
        int n2;
        if (!player.isRemoved() && player.isAlive() && !player.isInvisible()) {
            int n3 = e[60];
            n3 ^= e[61];
            n2 = n3 ^= e[62];
        } else {
            int n4 = e[63];
            n4 ^= e[64];
            n2 = n4 += e[65];
        }
        return n2 != 0;
    }

    private final long timeSinceLastAttack() {
        return System.currentTimeMillis() - A;
    }

    @Override
    public void onDisable() {
        A = 0L;
        b = null;
    }

    static {
        CrosshairHpModule.b();
        long l2 = 1371017401245091367L;
        long l3 = 6772598118488460339L;
        long l4 = 6693003727271282914L;
        long l5 = 500231821148498751L;
        long l6 = -1479677740099755845L;
        long l7 = 7482072807072028645L;
        long l8 = 7929891954382750531L;
        long l9 = -159877998625507653L;
        long l10 = 412128031480926571L;
        long l11 = -7258765229167464728L;
        long l12 = -5915433712250608074L;
        long l13 = -1562682120309163527L;
        long l14 = -5005101717571724112L;
        long l15 = 8197029521700592885L;
        int n2 = e[66];
        n2 -= e[67];
        B = new Object[n2 ^= e[68]];
        long l16 = l15;
        int n3 = e[69];
        n3 += e[70];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= e[71]);
        Object[] objectArray = new Object[e[72]];
        objectArray[CrosshairHpModule.e[73]] = c;
        objectArray[CrosshairHpModule.e[74]] = e[75];
        int n4 = e[76];
        Object object = CrosshairHpModule.A()[e[77]];
        if (object == null) {
            char[] cArray = "\uef68\uef69\uef03\uef44\uef77\uef7a\uef7e\uef02\uef49\uef79\uef53\uef76\uef68\uef5d\uef03\uef02\uef50\uef45\uef55\uef47\uef6b\uef64\uef70\uef74\uef55\uef69\uef44\uef04\uef61\uef61\uef54\uef03\uef43\uef5e\uef7c\uef58\uef79\uef57\uef61\uef55\uef77\uef67\uef73\uef64\uef73\uef7c\uef63\uef42\uef68\uef5b\uef62\uefba\uef65\uef0b\uef05\uef5a\uefba\uef08\uef61\uef43\uef44\uef61\uef43\uef5f\uef5b\uef46\uef65\uef41\uef03\uef5d\uef79\uef5b\uef7c\uef5e\uef05\uef03\uef64\uef0b\uef57\uef40\uefbe\uef61\uef70\uef06\uef46\uef47\uef59\uef60\uef65\uef68\uef09\uefba\uef02\uef0b\uef54\uef08\uef5d\uef00\uef5a\uef63\uefba\uef43\uef7f\uef75\uef63\uef5b\uef08\uef78\uef61\uef07\uef59\uef6b\uef7d\uef73\uef59\uef5d\uef72\uef48\uef7a\uef48\uef09\uef59\uef00\uef05\uef55\uef40\uef62\uef58\uef54\uef08\uef7a\uef7c\uef03\uef55\uef46\uef05\uef09\uef5b\uef52\uef60\uef5f\uef48\uef52\uef79\uefba\uef64\uef70\uef52\uef7d\uef76\uef4c\uef4c".toCharArray();
            for (int i2 = e[78]; i2 < e[79]; ++i2) {
                int n5 = cArray[i2];
                n5 -= e[80];
                n5 ^= e[81];
                n5 -= e[82];
                n5 ^= e[83];
                n5 ^= e[84];
                n5 ^= e[85];
                n5 ^= e[86];
                n5 ^= e[87];
                n5 ^= e[88];
                n5 += e[89];
                n5 += e[90];
                n5 ^= e[91];
                n5 ^= e[92];
                cArray[i2] = (char)(n5 ^= e[93]);
            }
            object = CrosshairHpModule.A()[CrosshairHpModule.e[94]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)CrosshairHpModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = e[95];
        n6 -= e[96];
        l6 = l17 ^ (0x4100000000L ^ l17) & -1L << (n6 ^= e[97]);
        long l18 = l13;
        int n7 = e[98];
        n7 += e[99];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= e[100]);
        while (true) {
            int n8 = e[101];
            n8 -= e[102];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= e[103]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = e[104];
            n10 ^= e[105];
            int n11 = e[107];
            n11 -= e[108];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= e[106])) & -1L >>> (n11 -= e[109]);
            long l20 = l9;
            int n12 = e[110];
            n12 ^= e[111];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += e[112]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = e[113];
            n14 -= e[114];
            int n15 = e[116];
            n15 ^= e[117];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= e[115])) & -1L >>> (n15 += e[118]);
            int n16 = e[119];
            n16 += e[120];
            long l22 = l10;
            int n17 = e[122];
            n17 += e[123];
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= e[121]) ^ l22) & -1L << (n17 += e[124]);
            int n18 = e[125];
            n18 -= e[126];
            n18 ^= e[127];
            int n19 = e[128];
            n19 ^= e[129];
            long l23 = l12;
            int n20 = e[131];
            n20 -= e[132];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= e[130]))) ^ l23) & -1L >>> (n20 += e[133]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = e[134];
            n21 += e[135];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 += e[136]);
            while (true) {
                int n22 = e[137];
                n22 += e[138];
                if ((int)(l14 >>> (n22 ^= e[139])) >= (int)l12) break;
                int n23 = e[140];
                n23 ^= e[141];
                int n24 = e[143];
                n24 += e[144];
                cArray2[(int)(l14 >>> (n23 -= CrosshairHpModule.e[142]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += e[145]))];
                l14 += 0x100000000L;
            }
            int n25 = e[146];
            n25 ^= e[147];
            int n26 = (int)(l15 >>> (n25 += e[148]));
            l15 += 0x100000000L;
            CrosshairHpModule.B[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = e[149];
            n27 += e[150];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= e[151]);
        }
        INSTANCE = new CrosshairHpModule();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[e[152]];
        String string = (String)object[e[153]];
        object = object[e[154]];
        Object[] objectArray = d;
        if (d == null) {
            objectArray = d = new Object[e[155]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[e[156]];
                c = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[e[158] ^ e[159]];
                byArray[CrosshairHpModule.e[160] ^ CrosshairHpModule.e[161]] = e[162] ^ e[163];
                byArray[CrosshairHpModule.e[164] ^ CrosshairHpModule.e[165]] = e[166] ^ e[167];
                byArray[CrosshairHpModule.e[168] ^ CrosshairHpModule.e[169]] = e[170] ^ e[171];
                byArray[CrosshairHpModule.e[172] ^ CrosshairHpModule.e[173]] = e[174] ^ e[175];
                byArray[CrosshairHpModule.e[176] ^ CrosshairHpModule.e[177]] = e[178] ^ e[179];
                byArray[CrosshairHpModule.e[180] ^ CrosshairHpModule.e[181]] = e[182] ^ e[183];
                byArray[CrosshairHpModule.e[184] ^ CrosshairHpModule.e[185]] = e[186] ^ e[187];
                byArray[CrosshairHpModule.e[188] ^ CrosshairHpModule.e[189]] = e[190] ^ e[191];
                byArray[CrosshairHpModule.e[192] ^ CrosshairHpModule.e[193]] = e[194] ^ e[195];
                byArray[CrosshairHpModule.e[196] ^ CrosshairHpModule.e[197]] = e[198] ^ e[199];
                byArray[CrosshairHpModule.e[200] ^ CrosshairHpModule.e[201]] = e[202] ^ e[203];
                byArray[CrosshairHpModule.e[204] ^ CrosshairHpModule.e[205]] = e[206] ^ e[207];
                byArray[CrosshairHpModule.e[208] ^ CrosshairHpModule.e[209]] = e[210] ^ e[211];
                byArray[CrosshairHpModule.e[212] ^ CrosshairHpModule.e[213]] = e[214] ^ e[215];
                byArray[CrosshairHpModule.e[216] ^ CrosshairHpModule.e[217]] = e[218] ^ e[219];
                byArray[CrosshairHpModule.e[220] ^ CrosshairHpModule.e[221]] = e[222] ^ e[223];
                objectArray2[CrosshairHpModule.e[157]] = byArray;
            }
            byte[] byArray = (byte[])object3[e[224]];
            if (C == null) {
                byte[] byArray2 = new byte[e[225] ^ e[226]];
                byArray2[CrosshairHpModule.e[227] ^ CrosshairHpModule.e[228]] = e[229] ^ e[230];
                byArray2[CrosshairHpModule.e[231] ^ CrosshairHpModule.e[232]] = e[233] ^ e[234];
                byArray2[CrosshairHpModule.e[235] ^ CrosshairHpModule.e[236]] = e[237] ^ e[238];
                byArray2[CrosshairHpModule.e[239] ^ CrosshairHpModule.e[240]] = e[241] ^ e[242];
                byArray2[CrosshairHpModule.e[243] ^ CrosshairHpModule.e[244]] = e[245] ^ e[246];
                byArray2[CrosshairHpModule.e[247] ^ CrosshairHpModule.e[248]] = e[249] ^ e[250];
                byArray2[CrosshairHpModule.e[251] ^ CrosshairHpModule.e[252]] = e[253] ^ e[254];
                byArray2[CrosshairHpModule.e[255] ^ CrosshairHpModule.e[256]] = e[257] ^ e[258];
                byArray2[CrosshairHpModule.e[259] ^ CrosshairHpModule.e[260]] = e[261] ^ e[262];
                byArray2[CrosshairHpModule.e[263] ^ CrosshairHpModule.e[264]] = e[265] ^ e[266];
                byArray2[CrosshairHpModule.e[267] ^ CrosshairHpModule.e[268]] = e[269] ^ e[270];
                byArray2[CrosshairHpModule.e[271] ^ CrosshairHpModule.e[272]] = e[273] ^ e[274];
                byArray2[CrosshairHpModule.e[275] ^ CrosshairHpModule.e[276]] = e[277] ^ e[278];
                byArray2[CrosshairHpModule.e[279] ^ CrosshairHpModule.e[280]] = e[281] ^ e[282];
                byArray2[CrosshairHpModule.e[283] ^ CrosshairHpModule.e[284]] = e[285] ^ e[286];
                byArray2[CrosshairHpModule.e[287] ^ CrosshairHpModule.e[288]] = e[289] ^ e[290];
                byArray2[CrosshairHpModule.e[291] ^ CrosshairHpModule.e[292]] = e[293] ^ e[294];
                byArray2[CrosshairHpModule.e[295] ^ CrosshairHpModule.e[296]] = e[297] ^ e[298];
                byArray2[CrosshairHpModule.e[299] ^ CrosshairHpModule.e[300]] = e[301] ^ e[302];
                byArray2[CrosshairHpModule.e[303] ^ CrosshairHpModule.e[304]] = e[305] ^ e[306];
                byArray2[CrosshairHpModule.e[307] ^ CrosshairHpModule.e[308]] = e[309] ^ e[310];
                byArray2[CrosshairHpModule.e[311] ^ CrosshairHpModule.e[312]] = e[313] ^ e[314];
                byArray2[CrosshairHpModule.e[315] ^ CrosshairHpModule.e[316]] = e[317] ^ e[318];
                byArray2[CrosshairHpModule.e[319] ^ CrosshairHpModule.e[320]] = e[321] ^ e[322];
                byArray2[CrosshairHpModule.e[323] ^ CrosshairHpModule.e[324]] = e[325] ^ e[326];
                byArray2[CrosshairHpModule.e[327] ^ CrosshairHpModule.e[328]] = e[329] ^ e[330];
                byArray2[CrosshairHpModule.e[331] ^ CrosshairHpModule.e[332]] = e[333] ^ e[334];
                byArray2[CrosshairHpModule.e[335] ^ CrosshairHpModule.e[336]] = e[337] ^ e[338];
                byArray2[CrosshairHpModule.e[339] ^ CrosshairHpModule.e[340]] = e[341] ^ e[342];
                byArray2[CrosshairHpModule.e[343] ^ CrosshairHpModule.e[344]] = e[345] ^ e[346];
                byArray2[CrosshairHpModule.e[347] ^ CrosshairHpModule.e[348]] = e[349] ^ e[350];
                byArray2[CrosshairHpModule.e[351] ^ CrosshairHpModule.e[352]] = e[353] ^ e[354];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, e[355], byArray3, e[356], byArray.length);
                System.arraycopy(byArray2, e[357], byArray3, byArray.length, byArray2.length);
                Object object4 = CrosshairHpModule.A()[e[358]];
                if (object4 == null) {
                    char[] cArray = "\u5791\u5787\u579a\u5795\u578b\u58f7\u5796\u5a3c\u5a05\u5a29\u5789\u5a30\u5a34\u5a32\u5762\u5789\u5794\u58c4".toCharArray();
                    for (int i2 = e[359]; i2 < e[360]; ++i2) {
                        int n3 = cArray[i2];
                        n3 += e[361];
                        n3 ^= e[362];
                        n3 += e[363];
                        n3 += e[364];
                        n3 -= e[365];
                        n3 += e[366];
                        n3 -= e[367];
                        n3 -= e[368];
                        n3 ^= e[369];
                        n3 += e[370];
                        n3 -= e[371];
                        n3 ^= e[372];
                        cArray[i2] = (char)(n3 += e[373]);
                    }
                    object4 = CrosshairHpModule.A()[CrosshairHpModule.e[374]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[e[375]];
                byArray4[CrosshairHpModule.e[376]] = e[377];
                byArray4[CrosshairHpModule.e[378]] = e[379];
                byArray4[CrosshairHpModule.e[380]] = e[381];
                byArray4[CrosshairHpModule.e[382]] = e[383];
                byArray4[CrosshairHpModule.e[384]] = e[385];
                byArray4[CrosshairHpModule.e[386]] = e[387];
                byArray4[CrosshairHpModule.e[388]] = e[389];
                byArray4[CrosshairHpModule.e[390]] = e[391];
                byArray4[CrosshairHpModule.e[392]] = e[393];
                byArray4[CrosshairHpModule.e[394]] = e[395];
                byArray4[CrosshairHpModule.e[396]] = e[397];
                byArray4[CrosshairHpModule.e[398]] = e[399];
                byArray4[2] = 26;
                byArray4[5] = -15;
                byArray4[8] = -29;
                byArray4[4] = 26;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 21, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = CrosshairHpModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u19d6\u19ca\u19b4".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 += 34560;
                        n4 += 38339;
                        n4 ^= 0xC709;
                        n4 -= 34192;
                        n4 += 63249;
                        n4 -= 52950;
                        n4 -= 65334;
                        n4 += 27192;
                        n4 += 8857;
                        n4 ^= 0xB9A;
                        n4 += 18459;
                        n4 += 12540;
                        cArray[i3] = (char)(n4 += 23774);
                    }
                    object5 = CrosshairHpModule.A()[2] = new String(cArray);
                }
                C = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = CrosshairHpModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\ue360\ue2ac\ue29e\ue192\ue30e\ue2ad\ue30e\ue192\ue30f\ue2f6\ue30e\ue29e\ue19c\ue30f\ue2c0\ue30b\ue30b\ue308\ue2d1\ue30a".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 10640;
                    n5 ^= 0x6690;
                    n5 ^= 0xA241;
                    n5 += 62514;
                    n5 ^= 0x6194;
                    n5 ^= 0xD985;
                    n5 += 29943;
                    n5 ^= 0xB438;
                    n5 ^= 0xAA5E;
                    cArray[i4] = (char)(n5 -= 8254);
                }
                object6 = CrosshairHpModule.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)C), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = D;
        if (D == null) {
            D = new Object[4];
            objectArray = D;
        }
        return objectArray;
    }

    public static void b() {
        e = new int[0x1732 ^ 0x16A2];
        CrosshairHpModule.e[0x1F96 ^ 0x1FC6] = 0xB8C6 ^ 0x1FC6;
        CrosshairHpModule.e[0xC727 ^ 0xC782] = 0x5137 ^ 0xC782;
        CrosshairHpModule.e[0x8BE1 ^ 0x8AC3] = 0x9AC3 ^ 0x8AC3;
        CrosshairHpModule.e[0xF03 ^ 0xF3B] = 0xF41 ^ 0xF3B;
        CrosshairHpModule.e[0x5260 ^ 0x520C] = 0x523C ^ 0x520C;
        CrosshairHpModule.e[0xE34A ^ 0xE2C6] = 0xE2CF ^ 0xE2C6;
        CrosshairHpModule.e[0x3633 ^ 0x367A] = 0x367A ^ 0x367A;
        CrosshairHpModule.e[0x16AD ^ 0x1693] = 0x16AA ^ 0x1693;
        CrosshairHpModule.e[0x6BC1 ^ 0x6BC5] = 0xFFFF940E ^ 0x6BC5;
        CrosshairHpModule.e[0x44E9 ^ 0x4457] = 0xFFFF8E72 ^ 0x4457;
        CrosshairHpModule.e[0xFA0F ^ 0xFAC0] = 0x4EF ^ 0xFAC0;
        CrosshairHpModule.e[0x5F ^ 0x74] = 0xFFFFFFC1 ^ 0x74;
        CrosshairHpModule.e[0x1059E ^ 0x1058B] = 0xFFFEFA6A ^ 0x1058B;
        CrosshairHpModule.e[0x1760 ^ 0x17C9] = 0x72A7 ^ 0x17C9;
        CrosshairHpModule.e[0x1FCF ^ 0x1F52] = 0x1F52 ^ 0x1F52;
        CrosshairHpModule.e[0xB68C ^ 0xB675] = 0xD312 ^ 0xB675;
        CrosshairHpModule.e[0x4AD1 ^ 0x4BA1] = 0xAFCC ^ 0x4BA1;
        CrosshairHpModule.e[0xB5C7 ^ 0xB4BA] = 0xB4AE ^ 0xB4BA;
        CrosshairHpModule.e[0x605A ^ 0x614E] = 0xCB94 ^ 0x614E;
        CrosshairHpModule.e[0xFB9D ^ 0xFAF4] = 0xA3B6 ^ 0xFAF4;
        CrosshairHpModule.e[0x3558 ^ 0x357C] = 0x3569 ^ 0x357C;
        CrosshairHpModule.e[0xDE34 ^ 0xDE2C] = 0xDE2C ^ 0xDE2C;
        CrosshairHpModule.e[0xA16B ^ 0xA040] = 0x4DA3 ^ 0xA040;
        CrosshairHpModule.e[0x45CC ^ 0x44FE] = 0x65E9 ^ 0x44FE;
        CrosshairHpModule.e[0xCC0 ^ 0xDA7] = 0xDA7 ^ 0xDA7;
        CrosshairHpModule.e[0x2444 ^ 0x2520] = 0x2520 ^ 0x2520;
        CrosshairHpModule.e[0x4BE7 ^ 0x4B94] = 0x4BFA ^ 0x4B94;
        CrosshairHpModule.e[0x6D10 ^ 0x6D4F] = 0xFFFF92BA ^ 0x6D4F;
        CrosshairHpModule.e[0xCF56 ^ 0xCF6F] = 0xFFFF30E0 ^ 0xCF6F;
        CrosshairHpModule.e[0xBF3A ^ 0xBFCF] = 0xFFFF0F13 ^ 0xBFCF;
        CrosshairHpModule.e[0x6377 ^ 0x6262] = 0xFFFF3700 ^ 0x6262;
        CrosshairHpModule.e[0xF8B4 ^ 0xF9AB] = 0xE9BE ^ 0xF9AB;
        CrosshairHpModule.e[0xF566 ^ 0xF511] = 0xF508 ^ 0xF511;
        CrosshairHpModule.e[0x4485 ^ 0x4491] = 0xFFFFBB77 ^ 0x4491;
        CrosshairHpModule.e[0x8318 ^ 0x8274] = 0x33DC ^ 0x8274;
        CrosshairHpModule.e[0xBBFD ^ 0xBBC0] = 0xFFFF447C ^ 0xBBC0;
        CrosshairHpModule.e[0x5C14 ^ 0x5D50] = 0x7D97 ^ 0x5D50;
        CrosshairHpModule.e[0x83BC ^ 0x83C3] = 0x83E0 ^ 0x83C3;
        CrosshairHpModule.e[0xCE9A ^ 0xCF81] = 0x5827 ^ 0xCF81;
        CrosshairHpModule.e[0xF971 ^ 0xF99A] = 0xE95F ^ 0xF99A;
        CrosshairHpModule.e[0x6799 ^ 0x66FA] = 0x66FA ^ 0x66FA;
        CrosshairHpModule.e[0x3CDC ^ 0x3C6B] = 0xDF2F ^ 0x3C6B;
        CrosshairHpModule.e[0x36B ^ 0x37A] = 0x364 ^ 0x37A;
        CrosshairHpModule.e[0x3B68 ^ 0x3B3C] = 0xE017 ^ 0x3B3C;
        CrosshairHpModule.e[0xF869 ^ 0xF85D] = 0xFFFF07E8 ^ 0xF85D;
        CrosshairHpModule.e[0x4DF4 ^ 0x4CBB] = 0xB26D ^ 0x4CBB;
        CrosshairHpModule.e[0xDC47 ^ 0xDCCF] = 0xDCF4 ^ 0xDCCF;
        CrosshairHpModule.e[0x3F12 ^ 0x3E6A] = 0x3E69 ^ 0x3E6A;
        CrosshairHpModule.e[0xD442 ^ 0xD4C1] = 0xD48A ^ 0xD4C1;
        CrosshairHpModule.e[0x65CD ^ 0x644E] = 0x647B ^ 0x644E;
        CrosshairHpModule.e[0x6671 ^ 0x66A1] = 0xCED4 ^ 0x66A1;
        CrosshairHpModule.e[0x9634 ^ 0x966F] = 0x45F3 ^ 0x966F;
        CrosshairHpModule.e[0x11CC ^ 0x119F] = 0xE6F5 ^ 0x119F;
        CrosshairHpModule.e[0x44C8 ^ 0x4419] = 0xEC64 ^ 0x4419;
        CrosshairHpModule.e[0x204 ^ 0x212] = 0xFFFFFD80 ^ 0x212;
        CrosshairHpModule.e[0x70F0 ^ 0x7058] = 0x1533 ^ 0x7058;
        CrosshairHpModule.e[0x34FF ^ 0x348D] = 0x34E5 ^ 0x348D;
        CrosshairHpModule.e[0xC60A ^ 0xC780] = 0xC78C ^ 0xC780;
        CrosshairHpModule.e[0x8BA9 ^ 0x8B45] = 0x9B82 ^ 0x8B45;
        CrosshairHpModule.e[0xB183 ^ 0xB0B2] = 0x91F4 ^ 0xB0B2;
        CrosshairHpModule.e[0xDC35 ^ 0xDCB3] = 0xDCEE ^ 0xDCB3;
        CrosshairHpModule.e[0xCF29 ^ 0xCE5B] = 0x1520 ^ 0xCE5B;
        CrosshairHpModule.e[0xDE2 ^ 0xCFF] = 0xFFFF6485 ^ 0xCFF;
        CrosshairHpModule.e[0x10267 ^ 0x102BF] = 0x16BDA ^ 0x102BF;
        CrosshairHpModule.e[0x2025 ^ 0x20E9] = 0xDEC7 ^ 0x20E9;
        CrosshairHpModule.e[0xB0D ^ 0xA4F] = 0x5C87 ^ 0xA4F;
        CrosshairHpModule.e[0x68C6 ^ 0x680B] = 0x9624 ^ 0x680B;
        CrosshairHpModule.e[0xBE08 ^ 0xBEF4] = 0x2319 ^ 0xBEF4;
        CrosshairHpModule.e[0xBB41 ^ 0xBA36] = 0xBA26 ^ 0xBA36;
        CrosshairHpModule.e[0xE1E6 ^ 0xE1A8] = 0xE1A8 ^ 0xE1A8;
        CrosshairHpModule.e[0x5CB7 ^ 0x5C1B] = 0x1073 ^ 0x5C1B;
        CrosshairHpModule.e[0x4B6D ^ 0x4B3B] = 0xCEAA ^ 0x4B3B;
        CrosshairHpModule.e[0x101AF ^ 0x10123] = 0x10119 ^ 0x10123;
        CrosshairHpModule.e[0xBBBA ^ 0xBBC3] = 0xBBEA ^ 0xBBC3;
        CrosshairHpModule.e[0xD1E0 ^ 0xD13D] = 0x7214 ^ 0xD13D;
        CrosshairHpModule.e[0x7B8E ^ 0x7B14] = 0x7B14 ^ 0x7B14;
        CrosshairHpModule.e[0x392C ^ 0x392B] = 0xFFFFC6AC ^ 0x392B;
        CrosshairHpModule.e[0xE78C ^ 0xE603] = 0xFFFF19ED ^ 0xE603;
        CrosshairHpModule.e[0x8642 ^ 0x8705] = 0x2D9A ^ 0x8705;
        CrosshairHpModule.e[0x13F8 ^ 0x13B9] = 0xFFFFEC3F ^ 0x13B9;
        CrosshairHpModule.e[0xD32B ^ 0xD3F5] = 0x70FF ^ 0xD3F5;
        CrosshairHpModule.e[0xFE55 ^ 0xFF57] = 0x562D ^ 0xFF57;
        CrosshairHpModule.e[0x8600 ^ 0x8720] = 0x9720 ^ 0x8720;
        CrosshairHpModule.e[0x1C38 ^ 0x1CCB] = 0x53B6 ^ 0x1CCB;
        CrosshairHpModule.e[0xF230 ^ 0xF212] = 0xF258 ^ 0xF212;
        CrosshairHpModule.e[0xBC5 ^ 0xB21] = 0x4116 ^ 0xB21;
        CrosshairHpModule.e[0x3A5D ^ 0x3B65] = 0x105A ^ 0x3B65;
        CrosshairHpModule.e[0x60E0 ^ 0x6041] = 0x225E ^ 0x6041;
        CrosshairHpModule.e[0xCB87 ^ 0xCA94] = 0x6056 ^ 0xCA94;
        CrosshairHpModule.e[0xF078 ^ 0xF159] = 0xFFFF1E86 ^ 0xF159;
        CrosshairHpModule.e[0x5A98 ^ 0x5AD5] = 0x5AD5 ^ 0x5AD5;
        CrosshairHpModule.e[0x23C3 ^ 0x23E0] = 0xFFFFDC40 ^ 0x23E0;
        CrosshairHpModule.e[0x287 ^ 0x221] = 0xFFFF6B1E ^ 0x221;
        CrosshairHpModule.e[0xD4B7 ^ 0xD5D6] = 0x1DBC9 ^ 0xD5D6;
        CrosshairHpModule.e[0x2C1A ^ 0x2C1F] = 0x2C4B ^ 0x2C1F;
        CrosshairHpModule.e[0xD69C ^ 0xD65D] = 0xF87 ^ 0xD65D;
        CrosshairHpModule.e[0x7558 ^ 0x7581] = 0x1CE4 ^ 0x7581;
        CrosshairHpModule.e[0x6177 ^ 0x6148] = 0xFFFF9E9B ^ 0x6148;
        CrosshairHpModule.e[0x49FE ^ 0x48D9] = 0xABF8 ^ 0x48D9;
        CrosshairHpModule.e[0x8656 ^ 0x870A] = 0x1835F ^ 0x870A;
        CrosshairHpModule.e[0x961A ^ 0x96D2] = 0x1D48 ^ 0x96D2;
        CrosshairHpModule.e[0x2C22 ^ 0x2D1F] = 0xAD18 ^ 0x2D1F;
        CrosshairHpModule.e[0x4D84 ^ 0x4D1A] = 0x836B ^ 0x4D1A;
        CrosshairHpModule.e[0xC314 ^ 0xC27A] = 0xA7D1 ^ 0xC27A;
        CrosshairHpModule.e[0x50CB ^ 0x51A9] = 0x15FEB ^ 0x51A9;
        CrosshairHpModule.e[0x5136 ^ 0x5028] = 0xC787 ^ 0x5028;
        CrosshairHpModule.e[0x408D ^ 0x41B7] = 0x6A88 ^ 0x41B7;
        CrosshairHpModule.e[0x3777 ^ 0x3641] = 0x5F43 ^ 0x3641;
        CrosshairHpModule.e[0xC7B ^ 0xCE0] = 0xCE1 ^ 0xCE0;
        CrosshairHpModule.e[0xB521 ^ 0xB597] = 0xFFFFA95A ^ 0xB597;
        CrosshairHpModule.e[0x5614 ^ 0x5623] = 0xFFFFA9D9 ^ 0x5623;
        CrosshairHpModule.e[0x993C ^ 0x99AD] = 0x99DB ^ 0x99AD;
        CrosshairHpModule.e[0x89A8 ^ 0x8998] = 0x89BC ^ 0x8998;
        CrosshairHpModule.e[0x79BD ^ 0x789B] = 0xD837 ^ 0x789B;
        CrosshairHpModule.e[0xF252 ^ 0xF2EA] = 0xB46 ^ 0xF2EA;
        CrosshairHpModule.e[0xB3C8 ^ 0xB3A2] = 0xB3FC ^ 0xB3A2;
        CrosshairHpModule.e[0xCB97 ^ 0xCB65] = 0x8F9 ^ 0xCB65;
        CrosshairHpModule.e[0x28A1 ^ 0x28BE] = 0xFFFFD725 ^ 0x28BE;
        CrosshairHpModule.e[0x5B28 ^ 0x5A65] = 0x12DE ^ 0x5A65;
        CrosshairHpModule.e[0xFDD8 ^ 0xFD3A] = 0x4E1D ^ 0xFD3A;
        CrosshairHpModule.e[0xC48F ^ 0xC58B] = 0x977 ^ 0xC58B;
        CrosshairHpModule.e[0x2DD1 ^ 0x2D30] = 0x9E37 ^ 0x2D30;
        CrosshairHpModule.e[0xA52E ^ 0xA503] = 0xFFFF5AA5 ^ 0xA503;
        CrosshairHpModule.e[0x467E ^ 0x467D] = 0xFFFFB904 ^ 0x467D;
        CrosshairHpModule.e[0x49DE ^ 0x4937] = 0xFFFFBB90 ^ 0x4937;
        CrosshairHpModule.e[0x104F ^ 0x104F] = 0x10C6 ^ 0x104F;
        CrosshairHpModule.e[0x10498 ^ 0x10422] = 0x1FDBF ^ 0x10422;
        CrosshairHpModule.e[0x5406 ^ 0x54E6] = 0x54E6 ^ 0x54E6;
        CrosshairHpModule.e[0x141 ^ 0xC7] = 0xC8 ^ 0xC7;
        CrosshairHpModule.e[0x62F4 ^ 0x63B4] = 0x357C ^ 0x63B4;
        CrosshairHpModule.e[0xB840 ^ 0xB84B] = 0xB876 ^ 0xB84B;
        CrosshairHpModule.e[0xE6B9 ^ 0xE7BE] = 0x4930 ^ 0xE7BE;
        CrosshairHpModule.e[0xA32D ^ 0xA3DA] = 0xC6A2 ^ 0xA3DA;
        CrosshairHpModule.e[0xBD40 ^ 0xBD82] = 0xFFFF9BA6 ^ 0xBD82;
        CrosshairHpModule.e[0xE2E ^ 0xE55] = 0xFFFFF19E ^ 0xE55;
        CrosshairHpModule.e[0xA2E1 ^ 0xA29C] = 0xA2FF ^ 0xA29C;
        CrosshairHpModule.e[0xD459 ^ 0xD5D2] = 0xFFFF2A24 ^ 0xD5D2;
        CrosshairHpModule.e[0x3B2D ^ 0x3B78] = 0x49F6 ^ 0x3B78;
        CrosshairHpModule.e[0x5027 ^ 0x5051] = 0x503B ^ 0x5051;
        CrosshairHpModule.e[0xC061 ^ 0xC0E0] = 0xC0E3 ^ 0xC0E0;
        CrosshairHpModule.e[0x9441 ^ 0x9464] = 0xFFFF6B8C ^ 0x9464;
        CrosshairHpModule.e[0x854D ^ 0x85CA] = 0xFFFF7A42 ^ 0x85CA;
        CrosshairHpModule.e[0x987D ^ 0x9910] = 0x2CBA ^ 0x9910;
        CrosshairHpModule.e[0x269 ^ 0x362] = 0x10FC7 ^ 0x362;
        CrosshairHpModule.e[0x297D ^ 0x29D6] = 0x4CB8 ^ 0x29D6;
        CrosshairHpModule.e[0x48DA ^ 0x483F] = 0x258 ^ 0x483F;
        CrosshairHpModule.e[0x544C ^ 0x5512] = 0x15147 ^ 0x5512;
        CrosshairHpModule.e[0xF690 ^ 0xF7C1] = 0xFFFFF686 ^ 0xF7C1;
        CrosshairHpModule.e[0xE544 ^ 0xE5B0] = 0xAAD4 ^ 0xE5B0;
        CrosshairHpModule.e[0xC9FA ^ 0xC9E4] = 0xFFFF3662 ^ 0xC9E4;
        CrosshairHpModule.e[0x3B22 ^ 0x3BE8] = 0xFFFF4FFB ^ 0x3BE8;
        CrosshairHpModule.e[0xE4F9 ^ 0xE4BF] = 0xE4B6 ^ 0xE4BF;
        CrosshairHpModule.e[0x10CB9 ^ 0x10C37] = 0x10C28 ^ 0x10C37;
        CrosshairHpModule.e[0xF8A7 ^ 0xF8E2] = 0xFFFF072F ^ 0xF8E2;
        CrosshairHpModule.e[0xDC9C ^ 0xDC48] = 0xD15F ^ 0xDC48;
        CrosshairHpModule.e[0xDC7E ^ 0xDC27] = 0xEDD3 ^ 0xDC27;
        CrosshairHpModule.e[0xF968 ^ 0xF9E2] = 0xFFFF063E ^ 0xF9E2;
        CrosshairHpModule.e[0xC7A2 ^ 0xC7C5] = 0xC798 ^ 0xC7C5;
        CrosshairHpModule.e[0x231F ^ 0x229E] = 0xFFFFDD54 ^ 0x229E;
        CrosshairHpModule.e[0xFB90 ^ 0xFABC] = 0x1759 ^ 0xFABC;
        CrosshairHpModule.e[0x2A49 ^ 0x2A8E] = 0x4868 ^ 0x2A8E;
        CrosshairHpModule.e[0xF952 ^ 0xF87F] = 0x15C1 ^ 0xF87F;
        CrosshairHpModule.e[0x6850 ^ 0x68FD] = 0x249F ^ 0x68FD;
        CrosshairHpModule.e[0x9662 ^ 0x967E] = 0xFFFF69C1 ^ 0x967E;
        CrosshairHpModule.e[0xF9F9 ^ 0xF8A1] = 0x63DB ^ 0xF8A1;
        CrosshairHpModule.e[0xF348 ^ 0xF3DD] = 0xFFFF0C71 ^ 0xF3DD;
        CrosshairHpModule.e[0xA37A ^ 0xA3C7] = 0x9659 ^ 0xA3C7;
        CrosshairHpModule.e[0xC25A ^ 0xC210] = 0xC211 ^ 0xC210;
        CrosshairHpModule.e[0x9CAC ^ 0x9DAA] = 0x5156 ^ 0x9DAA;
        CrosshairHpModule.e[0x1938 ^ 0x191F] = 0xFFFFE667 ^ 0x191F;
        CrosshairHpModule.e[0x5446 ^ 0x554F] = 0xFFFF041C ^ 0x554F;
        CrosshairHpModule.e[0xC723 ^ 0xC77B] = 0x4048 ^ 0xC77B;
        CrosshairHpModule.e[0xC124 ^ 0xC062] = 0xE0A5 ^ 0xC062;
        CrosshairHpModule.e[0x2AA9 ^ 0x2B9E] = 0xA4 ^ 0x2B9E;
        CrosshairHpModule.e[0x10B66 ^ 0x10A1A] = 0x10A10 ^ 0x10A1A;
        CrosshairHpModule.e[0x6065 ^ 0x6025] = 0xFFFF9F8C ^ 0x6025;
        CrosshairHpModule.e[0x41EE ^ 0x4152] = 0x74C8 ^ 0x4152;
        CrosshairHpModule.e[0xF7AC ^ 0xF7E4] = 0xF7E7 ^ 0xF7E4;
        CrosshairHpModule.e[0xDE5C ^ 0xDED3] = 0xDECF ^ 0xDED3;
        CrosshairHpModule.e[0x6E73 ^ 0x6E3F] = 0x6E3D ^ 0x6E3F;
        CrosshairHpModule.e[0x241F ^ 0x2564] = 0xFFFFDA9C ^ 0x2564;
        CrosshairHpModule.e[0x59BB ^ 0x58A1] = 0x73C2 ^ 0x58A1;
        CrosshairHpModule.e[0x857C ^ 0x85AF] = 0x2DD2 ^ 0x85AF;
        CrosshairHpModule.e[0x73D6 ^ 0x72C7] = 0xC850 ^ 0x72C7;
        CrosshairHpModule.e[0x10321 ^ 0x1020F] = 0x1EFEA ^ 0x1020F;
        CrosshairHpModule.e[0x29AC ^ 0x2956] = 0x4C35 ^ 0x2956;
        CrosshairHpModule.e[0x63EC ^ 0x62AF] = 0x427F ^ 0x62AF;
        CrosshairHpModule.e[0x74E2 ^ 0x748A] = 0xFFFF8B00 ^ 0x748A;
        CrosshairHpModule.e[0xE341 ^ 0xE20A] = 0xAAA4 ^ 0xE20A;
        CrosshairHpModule.e[0x9CF4 ^ 0x9C3A] = 0xFFFF9DFD ^ 0x9C3A;
        CrosshairHpModule.e[0x26C5 ^ 0x2790] = 0xFFFF9269 ^ 0x2790;
        CrosshairHpModule.e[0x6E0E ^ 0x6EED] = 0x24D2 ^ 0x6EED;
        CrosshairHpModule.e[0x9890 ^ 0x98AB] = 0xFFFF670B ^ 0x98AB;
        CrosshairHpModule.e[0xB807 ^ 0xB980] = 0xB9A1 ^ 0xB980;
        CrosshairHpModule.e[0x9F4 ^ 0x9C8] = 0xFFFFF64C ^ 0x9C8;
        CrosshairHpModule.e[0xD427 ^ 0xD574] = 0x9F02 ^ 0xD574;
        CrosshairHpModule.e[0x10C9E ^ 0x10C70] = 0x11CB7 ^ 0x10C70;
        CrosshairHpModule.e[0x103B8 ^ 0x10340] = 0x16623 ^ 0x10340;
        CrosshairHpModule.e[0xDE75 ^ 0xDE0D] = 0xDE3D ^ 0xDE0D;
        CrosshairHpModule.e[0x2214 ^ 0x224A] = 0x224A ^ 0x224A;
        CrosshairHpModule.e[0xF5AF ^ 0xF48B] = 0x5427 ^ 0xF48B;
        CrosshairHpModule.e[0xA547 ^ 0xA5E7] = 0xE7FA ^ 0xA5E7;
        CrosshairHpModule.e[0xA3A6 ^ 0xA2FB] = 0xFFFE5975 ^ 0xA2FB;
        CrosshairHpModule.e[0x4914 ^ 0x49CE] = 0xFFFFDF6D ^ 0x49CE;
        CrosshairHpModule.e[0x8646 ^ 0x86D4] = 0x86D0 ^ 0x86D4;
        CrosshairHpModule.e[0xA42F ^ 0xA4E4] = 0x2F73 ^ 0xA4E4;
        CrosshairHpModule.e[0xC4A2 ^ 0xC413] = 0x426 ^ 0xC413;
        CrosshairHpModule.e[0x2D74 ^ 0x2CF6] = 0x2CF8 ^ 0x2CF6;
        CrosshairHpModule.e[0x7587 ^ 0x756A] = 0x65BA ^ 0x756A;
        CrosshairHpModule.e[0xA62F ^ 0xA61E] = 0xFFFF59E8 ^ 0xA61E;
        CrosshairHpModule.e[0x5CEF ^ 0x5C8B] = 0x5C85 ^ 0x5C8B;
        CrosshairHpModule.e[0x69BD ^ 0x695B] = 0x236C ^ 0x695B;
        CrosshairHpModule.e[0xBF75 ^ 0xBFDB] = 0xF3A1 ^ 0xBFDB;
        CrosshairHpModule.e[0xF7DB ^ 0xF6A4] = 0xF6AE ^ 0xF6A4;
        CrosshairHpModule.e[0x9617 ^ 0x968F] = 0x968E ^ 0x968F;
        CrosshairHpModule.e[0xC426 ^ 0xC4F3] = 0xC9EB ^ 0xC4F3;
        CrosshairHpModule.e[0xE08A ^ 0xE062] = 0xED2B ^ 0xE062;
        CrosshairHpModule.e[0x10349 ^ 0x1039F] = 0x10EF6 ^ 0x1039F;
        CrosshairHpModule.e[0xA59B ^ 0xA48B] = 0x1E65 ^ 0xA48B;
        CrosshairHpModule.e[0xEC73 ^ 0xECEF] = 0xECEE ^ 0xECEF;
        CrosshairHpModule.e[0x69A0 ^ 0x69F2] = 0xB496 ^ 0x69F2;
        CrosshairHpModule.e[0x6B3E ^ 0x6B31] = 0x6B93 ^ 0x6B31;
        CrosshairHpModule.e[0xA93E ^ 0xA872] = 0xE0DC ^ 0xA872;
        CrosshairHpModule.e[0xD5E4 ^ 0xD5FE] = 0xD5E2 ^ 0xD5FE;
        CrosshairHpModule.e[0xD6D9 ^ 0xD6B2] = 0xD691 ^ 0xD6B2;
        CrosshairHpModule.e[0x4462 ^ 0x452C] = 0xD82 ^ 0x452C;
        CrosshairHpModule.e[0x459F ^ 0x456E] = 0xFFFF797D ^ 0x456E;
        CrosshairHpModule.e[0xEFB9 ^ 0xEEA0] = 0xC5A2 ^ 0xEEA0;
        CrosshairHpModule.e[0xB29C ^ 0xB2F3] = 0xB2C5 ^ 0xB2F3;
        CrosshairHpModule.e[0xE20C ^ 0xE2DB] = 0xEFC3 ^ 0xE2DB;
        CrosshairHpModule.e[0x9665 ^ 0x9732] = 0xC4B ^ 0x9732;
        CrosshairHpModule.e[0x1F1C ^ 0x1F2E] = 0xFFFFE0DC ^ 0x1F2E;
        CrosshairHpModule.e[0xF8C8 ^ 0xF8C4] = 0xF8E1 ^ 0xF8C4;
        CrosshairHpModule.e[0x702B ^ 0x70D4] = 0xD9A2 ^ 0x70D4;
        CrosshairHpModule.e[0xBE2 ^ 0xAFE] = 0x9D51 ^ 0xAFE;
        CrosshairHpModule.e[0xCB83 ^ 0xCB3C] = 0xFEA2 ^ 0xCB3C;
        CrosshairHpModule.e[0xD063 ^ 0xD12A] = 0xFFFF8406 ^ 0xD12A;
        CrosshairHpModule.e[0x6107 ^ 0x6144] = 0xFFFF9EB9 ^ 0x6144;
        CrosshairHpModule.e[0x5E ^ 0x71] = 0xFFFFFFF3 ^ 0x71;
        CrosshairHpModule.e[0x1475 ^ 0x1453] = 0x145E ^ 0x1453;
        CrosshairHpModule.e[0xB69B ^ 0xB6FE] = 0xB67B ^ 0xB6FE;
        CrosshairHpModule.e[0x109D2 ^ 0x10888] = 0x193F2 ^ 0x10888;
        CrosshairHpModule.e[0x72DF ^ 0x73BF] = 0x17DFD ^ 0x73BF;
        CrosshairHpModule.e[0x2320 ^ 0x220A] = 0xC12F ^ 0x220A;
        CrosshairHpModule.e[0x10281 ^ 0x103EE] = 0x18983 ^ 0x103EE;
        CrosshairHpModule.e[0x137E ^ 0x1225] = 0x1166D ^ 0x1225;
        CrosshairHpModule.e[0xC899 ^ 0xC85F] = 0xFFFF5565 ^ 0xC85F;
        CrosshairHpModule.e[0x76A7 ^ 0x7729] = 0x772E ^ 0x7729;
        CrosshairHpModule.e[0xD60 ^ 0xC6D] = 0x100FA ^ 0xC6D;
        CrosshairHpModule.e[0x22F ^ 0x30C] = 0xA3BE ^ 0x30C;
        CrosshairHpModule.e[0xC1EF ^ 0xC0B9] = 0x8AC2 ^ 0xC0B9;
        CrosshairHpModule.e[0x7B1F ^ 0x7A97] = 0x7A96 ^ 0x7A97;
        CrosshairHpModule.e[0x89B0 ^ 0x8973] = 0x50A9 ^ 0x8973;
        CrosshairHpModule.e[0xD58E ^ 0xD555] = 0xBC30 ^ 0xD555;
        CrosshairHpModule.e[0xF05F ^ 0xF0B0] = 0x3336 ^ 0xF0B0;
        CrosshairHpModule.e[0x107A9 ^ 0x106B1] = 0x12DD2 ^ 0x106B1;
        CrosshairHpModule.e[0x9683 ^ 0x96D9] = 0x19A1 ^ 0x96D9;
        CrosshairHpModule.e[0xADC1 ^ 0xACB8] = 0xACDF ^ 0xACB8;
        CrosshairHpModule.e[0x4A72 ^ 0x4A39] = 0x4A39 ^ 0x4A39;
        CrosshairHpModule.e[0x5CF ^ 0x49F] = 0xFA5B ^ 0x49F;
        CrosshairHpModule.e[0x18CB ^ 0x185D] = 0x184B ^ 0x185D;
        CrosshairHpModule.e[0x9D73 ^ 0x9C4C] = 0xCA8E ^ 0x9C4C;
        CrosshairHpModule.e[0xE7AC ^ 0xE6C7] = 0x8361 ^ 0xE6C7;
        CrosshairHpModule.e[0xBD08 ^ 0xBD4A] = 0xFFFF42D0 ^ 0xBD4A;
        CrosshairHpModule.e[0xA936 ^ 0xA955] = 0xFFFF56AC ^ 0xA955;
        CrosshairHpModule.e[0x4170 ^ 0x4171] = 0xFFFFBEF9 ^ 0x4171;
        CrosshairHpModule.e[0xADB0 ^ 0xACC4] = 0xD99B ^ 0xACC4;
        CrosshairHpModule.e[0xCD41 ^ 0xCD43] = 0xFFFF32B3 ^ 0xCD43;
        CrosshairHpModule.e[0xCD76 ^ 0xCC4D] = 0x4C16 ^ 0xCC4D;
        CrosshairHpModule.e[0xBA74 ^ 0xBA54] = 0xFFFF459F ^ 0xBA54;
        CrosshairHpModule.e[0x8341 ^ 0x8230] = 0x150A ^ 0x8230;
        CrosshairHpModule.e[0x8856 ^ 0x8830] = 0x8838 ^ 0x8830;
        CrosshairHpModule.e[0x63F0 ^ 0x6334] = 0x1D5 ^ 0x6334;
        CrosshairHpModule.e[0x512E ^ 0x5020] = 0x15C96 ^ 0x5020;
        CrosshairHpModule.e[0x8531 ^ 0x8504] = 0xFFFF7AC7 ^ 0x8504;
        CrosshairHpModule.e[0xC764 ^ 0xC60C] = 0xC61E ^ 0xC60C;
        CrosshairHpModule.e[0x5B ^ 0xF1] = 0xFFFF9A73 ^ 0xF1;
        CrosshairHpModule.e[0xA63C ^ 0xA65D] = 0xA652 ^ 0xA65D;
        CrosshairHpModule.e[0xD0F ^ 0xD48] = 0xFFFFF2FE ^ 0xD48;
        CrosshairHpModule.e[0x101B4 ^ 0x10088] = 0x180C2 ^ 0x10088;
        CrosshairHpModule.e[0x9EC6 ^ 0x9EFC] = 0xFFFF6112 ^ 0x9EFC;
        CrosshairHpModule.e[0xB7A4 ^ 0xB6DA] = 0xB6DA ^ 0xB6DA;
        CrosshairHpModule.e[0xB6A7 ^ 0xB7F8] = 0x1B9BD ^ 0xB7F8;
        CrosshairHpModule.e[0x243B ^ 0x252D] = 0x8FF7 ^ 0x252D;
        CrosshairHpModule.e[0x91AA ^ 0x90C0] = 0x78A6 ^ 0x90C0;
        CrosshairHpModule.e[0x9A17 ^ 0x9A3F] = 0xFFFF6591 ^ 0x9A3F;
        CrosshairHpModule.e[0xB0BF ^ 0xB0A2] = 0xB096 ^ 0xB0A2;
        CrosshairHpModule.e[0x2052 ^ 0x2080] = 0x88AA ^ 0x2080;
        CrosshairHpModule.e[0xEA0B ^ 0xEA1C] = 0xFFFF15CD ^ 0xEA1C;
        CrosshairHpModule.e[0xB35 ^ 0xBA6] = 0xBB3 ^ 0xBA6;
        CrosshairHpModule.e[0x4DFC ^ 0x4D5F] = 0xF40 ^ 0x4D5F;
        CrosshairHpModule.e[0x5D0F ^ 0x5C69] = 0x5C68 ^ 0x5C69;
        CrosshairHpModule.e[0xA808 ^ 0xA8C1] = 0x2356 ^ 0xA8C1;
        CrosshairHpModule.e[0x5B2A ^ 0x5BB3] = 0x5BB1 ^ 0x5BB3;
        CrosshairHpModule.e[0x2E16 ^ 0x2E47] = 0xCF84 ^ 0x2E47;
        CrosshairHpModule.e[0xF0D7 ^ 0xF0B5] = 0xF080 ^ 0xF0B5;
        CrosshairHpModule.e[0x6C01 ^ 0x6D8C] = 0x6DE0 ^ 0x6D8C;
        CrosshairHpModule.e[0x3E94 ^ 0x3FE7] = 0x1C3A ^ 0x3FE7;
        CrosshairHpModule.e[0x3E62 ^ 0x3F17] = 0x6848 ^ 0x3F17;
        CrosshairHpModule.e[0xE03C ^ 0xE1BC] = 0xE1B7 ^ 0xE1BC;
        CrosshairHpModule.e[0xD161 ^ 0xD0E4] = 0xFFFF2F42 ^ 0xD0E4;
        CrosshairHpModule.e[0x681B ^ 0x68FC] = 0x65A1 ^ 0x68FC;
        CrosshairHpModule.e[0xEDC2 ^ 0xEC46] = 0xEC4B ^ 0xEC46;
        CrosshairHpModule.e[0x106BA ^ 0x10625] = 0x1C844 ^ 0x10625;
        CrosshairHpModule.e[0x2B7 ^ 0x3EE] = 0x9881 ^ 0x3EE;
        CrosshairHpModule.e[0xFB51 ^ 0xFA5E] = 0x40A0 ^ 0xFA5E;
        CrosshairHpModule.e[0x8158 ^ 0x81A5] = 0x1C3A ^ 0x81A5;
        CrosshairHpModule.e[0x10921 ^ 0x10991] = 0x1C9AA ^ 0x10991;
        CrosshairHpModule.e[0x5C0B ^ 0x5CE1] = 0x51A8 ^ 0x5CE1;
        CrosshairHpModule.e[0x10644 ^ 0x10631] = 0xFFFEF98A ^ 0x10631;
        CrosshairHpModule.e[0xC5A7 ^ 0xC522] = 0xC537 ^ 0xC522;
        CrosshairHpModule.e[0x2839 ^ 0x296D] = 0x6316 ^ 0x296D;
        CrosshairHpModule.e[0x10665 ^ 0x10751] = 0x16E53 ^ 0x10751;
        CrosshairHpModule.e[0xF3DB ^ 0xF2D1] = 0x5C49 ^ 0xF2D1;
        CrosshairHpModule.e[0xA14E ^ 0xA1FA] = 0x42B5 ^ 0xA1FA;
        CrosshairHpModule.e[0xC847 ^ 0xC86B] = 0xFFFF37BF ^ 0xC86B;
        CrosshairHpModule.e[0xFC85 ^ 0xFC2A] = 0xB048 ^ 0xFC2A;
        CrosshairHpModule.e[0x8E88 ^ 0x8E91] = 0x8E95 ^ 0x8E91;
        CrosshairHpModule.e[0x3C63 ^ 0x3CE3] = 0xFFFFC336 ^ 0x3CE3;
        CrosshairHpModule.e[0xD6F0 ^ 0xD68E] = 0xD6BE ^ 0xD68E;
        CrosshairHpModule.e[0x2F0A ^ 0x2F11] = 0x2F84 ^ 0x2F11;
        CrosshairHpModule.e[0x67B4 ^ 0x6720] = 0x672F ^ 0x6720;
        CrosshairHpModule.e[0xD2E6 ^ 0xD2EF] = 0xD281 ^ 0xD2EF;
        CrosshairHpModule.e[0x9506 ^ 0x952F] = 0xFFFF6AC5 ^ 0x952F;
        CrosshairHpModule.e[0x5FF4 ^ 0x5F64] = 0xFFFFA0EA ^ 0x5F64;
        CrosshairHpModule.e[0x953A ^ 0x9440] = 0x9446 ^ 0x9440;
        CrosshairHpModule.e[0x6470 ^ 0x6578] = 0xCBE0 ^ 0x6578;
        CrosshairHpModule.e[0x10741 ^ 0x1076B] = 0x107FC ^ 0x1076B;
        CrosshairHpModule.e[0x9C74 ^ 0x9D26] = 0x63E2 ^ 0x9D26;
        CrosshairHpModule.e[0xCE56 ^ 0xCE0B] = 0x5C54 ^ 0xCE0B;
        CrosshairHpModule.e[0x8B3 ^ 0x8C7] = 0x8CA ^ 0x8C7;
        CrosshairHpModule.e[0x9E75 ^ 0x9ECE] = 0x676B ^ 0x9ECE;
        CrosshairHpModule.e[0xAB44 ^ 0xAB3E] = 0xAB55 ^ 0xAB3E;
        CrosshairHpModule.e[0x848D ^ 0x8504] = 0x854C ^ 0x8504;
        CrosshairHpModule.e[0x67EE ^ 0x674C] = 0xFFFFDAF5 ^ 0x674C;
        CrosshairHpModule.e[0xB606 ^ 0xB6D9] = 0x15F0 ^ 0xB6D9;
        CrosshairHpModule.e[0xFF9B ^ 0xFEB2] = 0xFFFFE20E ^ 0xFEB2;
        CrosshairHpModule.e[0x2982 ^ 0x2974] = 0x6610 ^ 0x2974;
        CrosshairHpModule.e[0xAC21 ^ 0xAD60] = 0xFFFF0424 ^ 0xAD60;
        CrosshairHpModule.e[0xCE1D ^ 0xCF58] = 0xEFD3 ^ 0xCF58;
        CrosshairHpModule.e[0x5B95 ^ 0x5AA6] = 0x33AF ^ 0x5AA6;
        CrosshairHpModule.e[0x84E9 ^ 0x844E] = 0x12FB ^ 0x844E;
        CrosshairHpModule.e[0x960 ^ 0x966] = 0x964 ^ 0x966;
        CrosshairHpModule.e[0xD458 ^ 0xD4E1] = 0x2D44 ^ 0xD4E1;
        CrosshairHpModule.e[0x62B2 ^ 0x6242] = 0xA1DE ^ 0x6242;
        CrosshairHpModule.e[0x3DCC ^ 0x3D79] = 0xDE3D ^ 0x3D79;
        CrosshairHpModule.e[0xBBB9 ^ 0xBB7C] = 0xD99A ^ 0xBB7C;
        CrosshairHpModule.e[0x4E01 ^ 0x4E6F] = 0x4EC4 ^ 0x4E6F;
        CrosshairHpModule.e[0x9A9F ^ 0x9BE9] = 0x9BE8 ^ 0x9BE9;
        CrosshairHpModule.e[0xD23B ^ 0xD256] = 0xFFFF2D85 ^ 0xD256;
        CrosshairHpModule.e[0xED98 ^ 0xED8B] = 0xFFFF123C ^ 0xED8B;
        CrosshairHpModule.e[0x52E2 ^ 0x5266] = 0x5226 ^ 0x5266;
        CrosshairHpModule.e[0x6BE6 ^ 0x6AAE] = 0xC03E ^ 0x6AAE;
        CrosshairHpModule.e[0x3FA ^ 0x371] = 0x33D ^ 0x371;
        CrosshairHpModule.e[0xA798 ^ 0xA7E4] = 0xFFFF580E ^ 0xA7E4;
        CrosshairHpModule.e[0x2077 ^ 0x20B7] = 0xF96B ^ 0x20B7;
        CrosshairHpModule.e[0x7ACA ^ 0x7A85] = 0x7A1D ^ 0x7A85;
        CrosshairHpModule.e[0xA885 ^ 0xA8EC] = 0xFFFF5739 ^ 0xA8EC;
        CrosshairHpModule.e[0x5A8A ^ 0x5B8B] = 0xFFFF0D61 ^ 0x5B8B;
        CrosshairHpModule.e[0xD3D1 ^ 0xD3A0] = 0xD377 ^ 0xD3A0;
        CrosshairHpModule.e[0x6A3 ^ 0x68D] = 0x689 ^ 0x68D;
        CrosshairHpModule.e[0x100FC ^ 0x101FF] = 0x1CD1F ^ 0x101FF;
        CrosshairHpModule.e[0x31DA ^ 0x30E3] = 0x1B99 ^ 0x30E3;
        CrosshairHpModule.e[0x163C ^ 0x166B] = 0xE57A ^ 0x166B;
        CrosshairHpModule.e[0xD100 ^ 0xD160] = 0xFFFF2EA6 ^ 0xD160;
        CrosshairHpModule.e[0x9BEE ^ 0x9B6C] = 0xFFFF649A ^ 0x9B6C;
        CrosshairHpModule.e[0x2506 ^ 0x2438] = 0xA472 ^ 0x2438;
        CrosshairHpModule.e[0xBE30 ^ 0xBE82] = 0xFFFF8120 ^ 0xBE82;
        CrosshairHpModule.e[0x963A ^ 0x973A] = 0x3E40 ^ 0x973A;
        CrosshairHpModule.e[0x3187 ^ 0x30B2] = 0xFFFFA67E ^ 0x30B2;
        CrosshairHpModule.e[0xC227 ^ 0xC302] = 0x63BA ^ 0xC302;
        CrosshairHpModule.e[0x432E ^ 0x423C] = 0xF8D2 ^ 0x423C;
        CrosshairHpModule.e[0xE111 ^ 0xE01D] = 0x1ECAB ^ 0xE01D;
        CrosshairHpModule.e[0xCBD4 ^ 0xCAB1] = 0xCAB1 ^ 0xCAB1;
        CrosshairHpModule.e[0xE2B8 ^ 0xE2AA] = 0xE2E5 ^ 0xE2AA;
        CrosshairHpModule.e[0xAD3B ^ 0xAC2C] = 0x8750 ^ 0xAC2C;
        CrosshairHpModule.e[0x4E4B ^ 0x4F7B] = 0x6E6C ^ 0x4F7B;
        CrosshairHpModule.e[0x3109 ^ 0x3179] = 0xFFFFCEFA ^ 0x3179;
        CrosshairHpModule.e[0x7331 ^ 0x7382] = 0xB3B7 ^ 0x7382;
        CrosshairHpModule.e[0x7401 ^ 0x740C] = 0x7437 ^ 0x740C;
        CrosshairHpModule.e[0x2E83 ^ 0x2E0E] = 0x2E0B ^ 0x2E0E;
        CrosshairHpModule.e[0xD9C8 ^ 0xD8CD] = 0xFFFFEBB0 ^ 0xD8CD;
        CrosshairHpModule.e[0x155 ^ 0x15D] = 0xFFFFFED8 ^ 0x15D;
        CrosshairHpModule.e[0x3F5C ^ 0x3F7D] = 0x3F4B ^ 0x3F7D;
        CrosshairHpModule.e[0xC2E6 ^ 0xC2A2] = 0xFFFF3D3A ^ 0xC2A2;
        CrosshairHpModule.e[0x8720 ^ 0x8730] = 0x8754 ^ 0x8730;
        CrosshairHpModule.e[0x5CC9 ^ 0x5C32] = 0xC1DE ^ 0x5C32;
        CrosshairHpModule.e[0xC112 ^ 0xC19B] = 0xC10B ^ 0xC19B;
        CrosshairHpModule.e[0x6BE6 ^ 0x6BEC] = 0xFFFF9444 ^ 0x6BEC;
        CrosshairHpModule.e[0xA270 ^ 0xA2AC] = 0x186 ^ 0xA2AC;
        CrosshairHpModule.e[0xF071 ^ 0xF15E] = 0xD047 ^ 0xF15E;
        CrosshairHpModule.e[0x867C ^ 0x864F] = 0xFFFF7930 ^ 0x864F;
        CrosshairHpModule.e[0xA9C6 ^ 0xA951] = 0xFFFF56F3 ^ 0xA951;
        CrosshairHpModule.e[0xBE8C ^ 0xBE82] = 0xBE9C ^ 0xBE82;
        CrosshairHpModule.e[0xAFEF ^ 0xAEC7] = 0x4DE2 ^ 0xAEC7;
        CrosshairHpModule.e[0x2241 ^ 0x22BF] = 0xBF52 ^ 0x22BF;
        CrosshairHpModule.e[0x3D9B ^ 0x3D3F] = 0xAB86 ^ 0x3D3F;
        CrosshairHpModule.e[0x9804 ^ 0x994E] = 0x33DE ^ 0x994E;
        CrosshairHpModule.e[0xF521 ^ 0xF517] = 0x1F56B ^ 0xF517;
        CrosshairHpModule.e[0x4C6B ^ 0x4C37] = 0x290A ^ 0x4C37;
    }
}

