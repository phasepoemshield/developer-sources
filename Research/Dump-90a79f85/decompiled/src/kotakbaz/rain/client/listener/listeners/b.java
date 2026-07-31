/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_408
 */
package kotakbaz.rain.client.listener.listeners;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.Rain;
import kotakbaz.rain.client.a_0;
import kotakbaz.rain.client.draggable.D;
import kotakbaz.rain.client.draggable.c_0;
import kotakbaz.rain.client.extensions.b_0;
import kotakbaz.rain.client.listener.A;
import kotakbaz.rain.event.a;
import kotakbaz.rain.event.events.G;
import kotakbaz.rain.module.modules.hud.H;
import kotakbaz.rain.ui.menu.MenuScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.minecraft.class_408;
import org.jetbrains.annotations.NotNull;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\b\r\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2={"Lkotakbaz/rain/client/listener/listeners/InputListener;", "Lkotakbaz/rain/client/listener/Listener;", "<init>", "()V", "", "init", "Lkotakbaz/rain/event/events/KeyEvent;", "event", "onKey", "(Lkotakbaz/rain/event/events/KeyEvent;)V", "", "mouseX", "()I", "mouseY", "", "Lkotakbaz/rain/client/interfaces/IBindable;", "binds", "Ljava/util/List;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nInputListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputListener.kt\nkotakbaz/rain/client/listener/listeners/InputListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n1915#2,2:95\n1915#2,2:97\n*S KotlinDebug\n*F\n+ 1 InputListener.kt\nkotakbaz/rain/client/listener/listeners/InputListener\n*L\n46#1:95,2\n54#1:97,2\n*E\n"})
public final class b
extends A {
    @NotNull
    public static final b INSTANCE;
    @NotNull
    private static final List<kotakbaz.rain.client.interfaces.b_0> a;
    private static Object[] A;
    private static Object B;
    private static Object[] c;
    private static Object[] b;
    private static Object[] C;
    public static int[] d;

    private b() {
        super();
    }

    @Override
    public void init() {
        kotakbaz.rain.event.a.INSTANCE.register(this);
        a.clear();
        a.addAll((Collection<kotakbaz.rain.client.interfaces.b_0>)kotakbaz.rain.module.A.INSTANCE.getModules());
    }

    /*
     * Unable to fully structure code
     */
    @Commando
    public final void onKey(@NotNull G var1_1) {
        block25: {
            var32_2 = 1265320963392703297L;
            var34_3 = -6163129524100382238L;
            var36_4 = -608315497734350838L;
            var38_5 = 1766266047054913486L;
            var40_6 = -1916584925320230056L;
            var42_7 = -7081392912422583873L;
            var44_8 = -840410486448663937L;
            var46_9 = -1098672260110275418L;
            var48_10 = -6049873032140662286L;
            var18_11 = 3900169210437069673L;
            var50_12 = 4013917542584734781L;
            var20_13 = 3850618332290314487L;
            var52_14 = 7640281450847157304L;
            var22_15 = -4148462910801442917L;
            var54_16 = -5679044864252246407L;
            var24_17 = -4971805235374890603L;
            var56_18 = -12611641000675830L;
            var26_19 = 840004213774229222L;
            var58_20 = -3053022559050889125L;
            var28_21 = -495856682001343381L;
            var60_22 = 5244808555628096633L;
            var30_23 = -7316522904461959123L;
            var62_24 = 5643020804436113792L;
            var65_25 = kotakbaz.rain.client.listener.listeners.b.d[0];
            var65_25 ^= kotakbaz.rain.client.listener.listeners.b.d[1];
            Intrinsics.checkNotNullParameter(var1_1, (String)kotakbaz.rain.client.listener.listeners.b.A[var65_25 ^= kotakbaz.rain.client.listener.listeners.b.d[2]]);
            v0 = var1_1.get(G.a.getBUTTON());
            if (v0 == null) {
                return;
            }
            v1 = var62_24;
            var67_26 = kotakbaz.rain.client.listener.listeners.b.d[3];
            var67_26 += kotakbaz.rain.client.listener.listeners.b.d[4];
            var62_24 = v1 ^ ((long)v0.intValue() ^ v1) & -1L >>> (var67_26 += kotakbaz.rain.client.listener.listeners.b.d[5]);
            var3_27 = var1_1.get(G.a.getRELEASE());
            var4_28 = var1_1.get(G.a.getMOUSE());
            var69_29 = kotakbaz.rain.client.listener.listeners.b.d[6];
            var69_29 += kotakbaz.rain.client.listener.listeners.b.d[7];
            var69_29 -= kotakbaz.rain.client.listener.listeners.b.d[8];
            var71_30 = kotakbaz.rain.client.listener.listeners.b.d[9];
            var71_30 ^= kotakbaz.rain.client.listener.listeners.b.d[10];
            v2 = var62_24;
            var73_31 = kotakbaz.rain.client.listener.listeners.b.d[12];
            var73_31 += kotakbaz.rain.client.listener.listeners.b.d[13];
            var62_24 = v2 ^ ((long)Intrinsics.areEqual(var3_27, var69_29) << (var71_30 -= kotakbaz.rain.client.listener.listeners.b.d[11]) ^ v2) & -1L << (var73_31 -= kotakbaz.rain.client.listener.listeners.b.d[14]);
            var75_32 = kotakbaz.rain.client.listener.listeners.b.d[15];
            var75_32 += kotakbaz.rain.client.listener.listeners.b.d[16];
            v3 = var60_22;
            var77_33 = kotakbaz.rain.client.listener.listeners.b.d[18];
            var77_33 += kotakbaz.rain.client.listener.listeners.b.d[19];
            var60_22 = v3 ^ ((long)Intrinsics.areEqual(var4_28, var75_32 ^= kotakbaz.rain.client.listener.listeners.b.d[17]) ^ v3) & -1L >>> (var77_33 -= kotakbaz.rain.client.listener.listeners.b.d[20]);
            var79_34 = kotakbaz.rain.client.listener.listeners.b.d[21];
            var79_34 ^= kotakbaz.rain.client.listener.listeners.b.d[22];
            v4 = var58_20;
            var81_35 = kotakbaz.rain.client.listener.listeners.b.d[24];
            var81_35 ^= kotakbaz.rain.client.listener.listeners.b.d[25];
            var58_20 = v4 ^ ((long)this.mouseX() << (var79_34 -= kotakbaz.rain.client.listener.listeners.b.d[23]) ^ v4) & -1L << (var81_35 -= kotakbaz.rain.client.listener.listeners.b.d[26]);
            var83_36 = kotakbaz.rain.client.listener.listeners.b.d[27];
            var83_36 += kotakbaz.rain.client.listener.listeners.b.d[28];
            v5 = var28_21;
            var85_37 = kotakbaz.rain.client.listener.listeners.b.d[30];
            var85_37 += kotakbaz.rain.client.listener.listeners.b.d[31];
            var28_21 = v5 ^ ((long)this.mouseY() << (var83_36 -= kotakbaz.rain.client.listener.listeners.b.d[29]) ^ v5) & -1L << (var85_37 -= kotakbaz.rain.client.listener.listeners.b.d[32]);
            if (Rain.INSTANCE.getCustomScreen() == null && b_0.getMc().field_1755 instanceof class_408) {
                var87_38 = kotakbaz.rain.client.listener.listeners.b.d[33];
                var87_38 += kotakbaz.rain.client.listener.listeners.b.d[34];
                v6 = var87_38 ^= kotakbaz.rain.client.listener.listeners.b.d[35];
            } else {
                var89_39 = kotakbaz.rain.client.listener.listeners.b.d[36];
                var89_39 += kotakbaz.rain.client.listener.listeners.b.d[37];
                v6 = var89_39 ^= kotakbaz.rain.client.listener.listeners.b.d[38];
            }
            v7 = var24_17;
            var91_40 = kotakbaz.rain.client.listener.listeners.b.d[39];
            var91_40 ^= kotakbaz.rain.client.listener.listeners.b.d[40];
            var24_17 = v7 ^ ((long)v6 ^ v7) & -1L >>> (var91_40 -= kotakbaz.rain.client.listener.listeners.b.d[41]);
            if ((int)var60_22 != 0 && (int)var24_17 != 0) {
                var93_41 = kotakbaz.rain.client.listener.listeners.b.d[42];
                var93_41 -= kotakbaz.rain.client.listener.listeners.b.d[43];
                if ((int)(var62_24 >>> (var93_41 ^= kotakbaz.rain.client.listener.listeners.b.d[44])) == 0) {
                    var95_42 = kotakbaz.rain.client.listener.listeners.b.d[45];
                    var95_42 ^= kotakbaz.rain.client.listener.listeners.b.d[46];
                    var97_43 = kotakbaz.rain.client.listener.listeners.b.d[48];
                    var97_43 -= kotakbaz.rain.client.listener.listeners.b.d[49];
                    if (H.INSTANCE.onChatClick((int)(var58_20 >>> (var95_42 ^= kotakbaz.rain.client.listener.listeners.b.d[47])), (int)(var28_21 >>> (var97_43 -= kotakbaz.rain.client.listener.listeners.b.d[50])), (int)var62_24)) {
                        return;
                    }
                }
                var99_44 = kotakbaz.rain.client.listener.listeners.b.d[51];
                var99_44 -= kotakbaz.rain.client.listener.listeners.b.d[52];
                if ((int)(var62_24 >>> (var99_44 += kotakbaz.rain.client.listener.listeners.b.d[53])) != 0) {
                    var101_45 = kotakbaz.rain.client.listener.listeners.b.d[54];
                    var101_45 ^= kotakbaz.rain.client.listener.listeners.b.d[55];
                    v8 = var101_45 += kotakbaz.rain.client.listener.listeners.b.d[56];
                } else {
                    var103_46 = kotakbaz.rain.client.listener.listeners.b.d[57];
                    var103_46 += kotakbaz.rain.client.listener.listeners.b.d[58];
                    v8 = var103_46 ^= kotakbaz.rain.client.listener.listeners.b.d[59];
                }
                v9 = var30_23;
                var105_47 = kotakbaz.rain.client.listener.listeners.b.d[60];
                var105_47 += kotakbaz.rain.client.listener.listeners.b.d[61];
                var30_23 = v9 ^ ((long)v8 ^ v9) & -1L >>> (var105_47 ^= kotakbaz.rain.client.listener.listeners.b.d[62]);
                v10 = D.INSTANCE.getDraggables().values();
                var107_48 = kotakbaz.rain.client.listener.listeners.b.d[63];
                var107_48 -= kotakbaz.rain.client.listener.listeners.b.d[64];
                var109_49 = kotakbaz.rain.client.listener.listeners.b.d[66];
                var109_49 -= kotakbaz.rain.client.listener.listeners.b.d[67];
                Intrinsics.checkNotNullExpressionValue(v10, (String)kotakbaz.rain.client.listener.listeners.b.A[var107_48 -= kotakbaz.rain.client.listener.listeners.b.d[65]] + (String)kotakbaz.rain.client.listener.listeners.b.A[var109_49 ^= kotakbaz.rain.client.listener.listeners.b.d[68]]);
                var11_50 = v10;
                v11 = var32_2;
                var111_51 = kotakbaz.rain.client.listener.listeners.b.d[69];
                var111_51 -= kotakbaz.rain.client.listener.listeners.b.d[70];
                var32_2 = v11 ^ (0L ^ v11) & -1L << (var111_51 ^= kotakbaz.rain.client.listener.listeners.b.d[71]);
                for (kotakbaz.rain.client.interfaces.b_0 var14_53 : var11_50) {
                    var15_54 = (c_0)var14_53;
                    v12 = var42_7;
                    var113_55 = kotakbaz.rain.client.listener.listeners.b.d[72];
                    var113_55 ^= kotakbaz.rain.client.listener.listeners.b.d[73];
                    var42_7 = v12 ^ (0L ^ v12) & -1L >>> (var113_55 ^= kotakbaz.rain.client.listener.listeners.b.d[74]);
                    if (!var15_54.getModule().isEnabled()) continue;
                    var15_54.onClick((int)var62_24, (int)var30_23);
                }
            }
            var115_56 = kotakbaz.rain.client.listener.listeners.b.d[75];
            var115_56 ^= kotakbaz.rain.client.listener.listeners.b.d[76];
            if ((int)(var62_24 >>> (var115_56 += kotakbaz.rain.client.listener.listeners.b.d[77])) != 0) break block25;
            var10_57 = kotakbaz.rain.client.listener.listeners.b.a;
            v13 = var36_4;
            var117_58 = kotakbaz.rain.client.listener.listeners.b.d[78];
            var117_58 += kotakbaz.rain.client.listener.listeners.b.d[79];
            var36_4 = v13 ^ (0L ^ v13) & -1L >>> (var117_58 ^= kotakbaz.rain.client.listener.listeners.b.d[80]);
            for (Object var13_52 : var10_57) {
                var14_53 = (kotakbaz.rain.client.interfaces.b_0)var13_52;
                v14 = var38_5;
                var119_65 = kotakbaz.rain.client.listener.listeners.b.d[81];
                var119_65 ^= kotakbaz.rain.client.listener.listeners.b.d[82];
                var38_5 = v14 ^ (0L ^ v14) & -1L << (var119_65 -= kotakbaz.rain.client.listener.listeners.b.d[83]);
                if (Rain.INSTANCE.getCustomScreen() == null && b_0.getMc().field_1755 == null && b_0.getMc().field_1724 != null && b_0.getMc().field_1687 != null) {
                    var121_66 = kotakbaz.rain.client.listener.listeners.b.d[84];
                    var121_66 += kotakbaz.rain.client.listener.listeners.b.d[85];
                    v15 = var121_66 -= kotakbaz.rain.client.listener.listeners.b.d[86];
                } else {
                    var123_67 = kotakbaz.rain.client.listener.listeners.b.d[87];
                    var123_67 -= kotakbaz.rain.client.listener.listeners.b.d[88];
                    v15 = var123_67 += kotakbaz.rain.client.listener.listeners.b.d[89];
                }
                v16 = var42_7;
                var125_68 = kotakbaz.rain.client.listener.listeners.b.d[90];
                var125_68 ^= kotakbaz.rain.client.listener.listeners.b.d[91];
                var42_7 = v16 ^ ((long)v15 ^ v16) & -1L >>> (var125_68 += kotakbaz.rain.client.listener.listeners.b.d[92]);
                if ((int)var62_24 != var14_53.getKey()) ** GOTO lbl-1000
                var127_69 = kotakbaz.rain.client.listener.listeners.b.d[93];
                var127_69 -= kotakbaz.rain.client.listener.listeners.b.d[94];
                if (var14_53.getKey() != (var127_69 ^= kotakbaz.rain.client.listener.listeners.b.d[95])) {
                    var129_60 = kotakbaz.rain.client.listener.listeners.b.d[96];
                    var129_60 ^= kotakbaz.rain.client.listener.listeners.b.d[97];
                    v17 = var129_60 += kotakbaz.rain.client.listener.listeners.b.d[98];
                } else lbl-1000:
                // 2 sources

                {
                    var131_61 = kotakbaz.rain.client.listener.listeners.b.d[99];
                    var131_61 -= kotakbaz.rain.client.listener.listeners.b.d[100];
                    v17 = var131_61 ^= kotakbaz.rain.client.listener.listeners.b.d[101];
                }
                var133_62 = kotakbaz.rain.client.listener.listeners.b.d[102];
                var133_62 -= kotakbaz.rain.client.listener.listeners.b.d[103];
                v18 = var42_7;
                var135_63 = kotakbaz.rain.client.listener.listeners.b.d[105];
                var135_63 -= kotakbaz.rain.client.listener.listeners.b.d[106];
                var42_7 = v18 ^ ((long)v17 << (var133_62 += kotakbaz.rain.client.listener.listeners.b.d[104]) ^ v18) & -1L << (var135_63 ^= kotakbaz.rain.client.listener.listeners.b.d[107]);
                var137_64 = kotakbaz.rain.client.listener.listeners.b.d[108];
                var137_64 += kotakbaz.rain.client.listener.listeners.b.d[109];
                if ((int)(var42_7 >>> (var137_64 += kotakbaz.rain.client.listener.listeners.b.d[110])) == 0 || (int)var42_7 == 0) continue;
                var14_53.onKey();
            }
        }
        v19 = Rain.INSTANCE.getCustomScreen();
        if (v19 != null) {
            var12_59 = v19;
            v20 = var44_8;
            var139_70 = kotakbaz.rain.client.listener.listeners.b.d[111];
            var139_70 += kotakbaz.rain.client.listener.listeners.b.d[112];
            var44_8 = v20 ^ (0L ^ v20) & -1L << (var139_70 += kotakbaz.rain.client.listener.listeners.b.d[113]);
            if ((int)var60_22 == 0) {
                var141_71 = kotakbaz.rain.client.listener.listeners.b.d[114];
                var141_71 -= kotakbaz.rain.client.listener.listeners.b.d[115];
                if ((int)(var62_24 >>> (var141_71 += kotakbaz.rain.client.listener.listeners.b.d[116])) == 0) {
                    var143_72 = kotakbaz.rain.client.listener.listeners.b.d[117];
                    var143_72 += kotakbaz.rain.client.listener.listeners.b.d[118];
                    if ((int)var62_24 == (var143_72 -= kotakbaz.rain.client.listener.listeners.b.d[119])) {
                        var12_59.close();
                        return;
                    }
                }
            }
            if ((int)var60_22 == 0) {
                var145_73 = kotakbaz.rain.client.listener.listeners.b.d[120];
                var145_73 += kotakbaz.rain.client.listener.listeners.b.d[121];
                if ((int)(var62_24 >>> (var145_73 -= kotakbaz.rain.client.listener.listeners.b.d[122])) == 0) {
                    var147_74 = kotakbaz.rain.client.listener.listeners.b.d[123];
                    var147_74 ^= kotakbaz.rain.client.listener.listeners.b.d[124];
                    var149_75 = kotakbaz.rain.client.listener.listeners.b.d[126];
                    var149_75 -= kotakbaz.rain.client.listener.listeners.b.d[127];
                    var12_59.onKeyPress((int)(var58_20 >>> (var147_74 -= kotakbaz.rain.client.listener.listeners.b.d[125])), (int)(var28_21 >>> (var149_75 += kotakbaz.rain.client.listener.listeners.b.d[128])), (int)var62_24);
                }
            }
            if ((int)var60_22 != 0) {
                var151_76 = kotakbaz.rain.client.listener.listeners.b.d[129];
                var151_76 += kotakbaz.rain.client.listener.listeners.b.d[130];
                if ((int)(var62_24 >>> (var151_76 ^= kotakbaz.rain.client.listener.listeners.b.d[131])) != 0) {
                    var153_77 = kotakbaz.rain.client.listener.listeners.b.d[132];
                    var153_77 -= kotakbaz.rain.client.listener.listeners.b.d[133];
                    var155_78 = kotakbaz.rain.client.listener.listeners.b.d[135];
                    var155_78 ^= kotakbaz.rain.client.listener.listeners.b.d[136];
                    var12_59.onMouseRelease((int)(var58_20 >>> (var153_77 -= kotakbaz.rain.client.listener.listeners.b.d[134])), (int)(var28_21 >>> (var155_78 -= kotakbaz.rain.client.listener.listeners.b.d[137])), (int)var62_24);
                } else {
                    var157_79 = kotakbaz.rain.client.listener.listeners.b.d[138];
                    var157_79 -= kotakbaz.rain.client.listener.listeners.b.d[139];
                    var159_80 = kotakbaz.rain.client.listener.listeners.b.d[141];
                    var159_80 ^= kotakbaz.rain.client.listener.listeners.b.d[142];
                    var12_59.onMouseClick((int)(var58_20 >>> (var157_79 ^= kotakbaz.rain.client.listener.listeners.b.d[140])), (int)(var28_21 >>> (var159_80 ^= kotakbaz.rain.client.listener.listeners.b.d[143])), (int)var62_24);
                }
            }
        }
        if ((int)var60_22 == 0) {
            var161_81 = kotakbaz.rain.client.listener.listeners.b.d[144];
            var161_81 ^= kotakbaz.rain.client.listener.listeners.b.d[145];
            if ((int)(var62_24 >>> (var161_81 ^= kotakbaz.rain.client.listener.listeners.b.d[146])) == 0 && Rain.INSTANCE.getCustomScreen() == null && b_0.getMc().field_1755 == null && (int)var62_24 == a_0.INSTANCE.getOpenKey()) {
                Rain.INSTANCE.setCustomScreen(MenuScreen.INSTANCE);
            }
        }
    }

    public final int mouseX() {
        return (int)(b_0.getMc().field_1729.method_1603() / (double)b_0.getMc().method_22683().method_4495());
    }

    public final int mouseY() {
        return (int)(b_0.getMc().field_1729.method_1604() / (double)b_0.getMc().method_22683().method_4495());
    }

    static {
        kotakbaz.rain.client.listener.listeners.b.b();
        long l = -5124431276772313353L;
        long l2 = -7352738625358112690L;
        long l3 = 6611891932777076520L;
        long l4 = -6685635626969574279L;
        long l5 = 6273646856085740745L;
        long l6 = -8325848077868398462L;
        long l7 = 415134173004804833L;
        long l8 = 8604732633857022282L;
        long l9 = -601694841281364472L;
        long l10 = -1766095291395230524L;
        long l11 = 4670702578512583737L;
        long l12 = 1925642068170360811L;
        long l13 = -5891591261993873940L;
        long l14 = 3345380325554855926L;
        int n = d[147];
        n += d[148];
        A = new Object[n -= d[149]];
        long l15 = l14;
        int n2 = d[150];
        n2 ^= d[151];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 ^= d[152]);
        Object[] objectArray = new Object[d[153]];
        objectArray[kotakbaz.rain.client.listener.listeners.b.d[154]] = b;
        objectArray[kotakbaz.rain.client.listener.listeners.b.d[155]] = d[156];
        int n3 = d[157];
        Object object = kotakbaz.rain.client.listener.listeners.b.A()[d[158]];
        if (object == null) {
            char[] cArray = "\uc277\uc6d5\uc272\uc6fa\uc265\uc6c4\uc6c1\uc6d3\uc21b\uc6fe\uc6d4\uc6fe\uc271\uc265\uc270\uc3ba\uc6fe\uc6ff\uc6c1\uc3be\uc21b\uc6d1\uc3bf\uc38f\uc6d4\uc3be\uc390\uc6d7\uc3ba\uc3bf\uc6ea\uc21a\uc3be\uc391\uc265\uc21e\uc6d3\uc6fe\uc395\uc262\uc6d5\uc396\uc6e9\uc264\uc3b9\uc6d1\uc21f\uc264\uc6fa\uc393\uc26d\uc388\uc6e8\uc6c4\uc6ee\uc38c\uc275\uc390\uc396\uc390\uc6fa\uc6e9\uc271\uc262".toCharArray();
            for (int i = d[159]; i < d[160]; ++i) {
                int n4 = cArray[i];
                n4 ^= d[161];
                n4 ^= d[162];
                n4 += d[163];
                n4 ^= d[164];
                n4 -= d[165];
                n4 -= d[166];
                n4 += d[167];
                n4 ^= d[168];
                n4 -= d[169];
                n4 -= d[170];
                cArray[i] = (char)(n4 -= d[171]);
            }
            object = kotakbaz.rain.client.listener.listeners.b.A()[kotakbaz.rain.client.listener.listeners.b.d[172]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.listener.listeners.b.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = d[173];
        n5 -= d[174];
        l5 = l16 ^ (0x1C00000000L ^ l16) & -1L << (n5 -= d[175]);
        long l17 = l12;
        int n6 = d[176];
        n6 -= d[177];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 -= d[178]);
        while (true) {
            int n7 = d[179];
            n7 += d[180];
            if ((int)l12 >= (int)(l5 >>> (n7 -= d[181]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = d[182];
            n9 -= d[183];
            int n10 = d[185];
            n10 ^= d[186];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= d[184])) & -1L >>> (n10 -= d[187]);
            long l19 = l8;
            int n11 = d[188];
            n11 -= d[189];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 -= d[190]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = d[191];
            n13 ^= d[192];
            int n14 = d[194];
            n14 ^= d[195];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 -= d[193])) & -1L >>> (n14 ^= d[196]);
            int n15 = d[197];
            n15 += d[198];
            long l21 = l9;
            int n16 = d[200];
            n16 -= d[201];
            l9 = l21 ^ ((long)cArray[n12] << (n15 += d[199]) ^ l21) & -1L << (n16 ^= d[202]);
            int n17 = d[203];
            n17 ^= d[204];
            n17 ^= d[205];
            int n18 = d[206];
            n18 -= d[207];
            long l22 = l11;
            int n19 = d[209];
            n19 += d[210];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += d[208]))) ^ l22) & -1L >>> (n19 -= d[211]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = d[212];
            n20 ^= d[213];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 -= d[214]);
            while (true) {
                int n21 = d[215];
                n21 ^= d[216];
                if ((int)(l13 >>> (n21 ^= d[217])) >= (int)l11) break;
                int n22 = d[218];
                n22 -= d[219];
                int n23 = d[221];
                n23 += d[222];
                cArray2[(int)(l13 >>> (n22 += kotakbaz.rain.client.listener.listeners.b.d[220]))] = cArray[(int)l12 + (int)(l13 >>> (n23 -= d[223]))];
                l13 += 0x100000000L;
            }
            int n24 = d[224];
            n24 ^= d[225];
            int n25 = (int)(l14 >>> (n24 -= d[226]));
            l14 += 0x100000000L;
            kotakbaz.rain.client.listener.listeners.b.A[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = d[227];
            n26 ^= d[228];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 ^= d[229]);
        }
        INSTANCE = new b();
        a = new ArrayList();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[d[230]];
        String string = (String)object[d[231]];
        object = object[d[232]];
        Object[] objectArray = c;
        if (c == null) {
            objectArray = c = new Object[d[233]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[d[234]];
                b = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[d[236] ^ d[237]];
                byArray[kotakbaz.rain.client.listener.listeners.b.d[238] ^ kotakbaz.rain.client.listener.listeners.b.d[239]] = d[240] ^ d[241];
                byArray[kotakbaz.rain.client.listener.listeners.b.d[242] ^ kotakbaz.rain.client.listener.listeners.b.d[243]] = d[244] ^ d[245];
                byArray[kotakbaz.rain.client.listener.listeners.b.d[246] ^ kotakbaz.rain.client.listener.listeners.b.d[247]] = d[248] ^ d[249];
                byArray[kotakbaz.rain.client.listener.listeners.b.d[250] ^ kotakbaz.rain.client.listener.listeners.b.d[251]] = d[252] ^ d[253];
                byArray[kotakbaz.rain.client.listener.listeners.b.d[254] ^ kotakbaz.rain.client.listener.listeners.b.d[255]] = d[256] ^ d[257];
                byArray[kotakbaz.rain.client.listener.listeners.b.d[258] ^ kotakbaz.rain.client.listener.listeners.b.d[259]] = d[260] ^ d[261];
                byArray[kotakbaz.rain.client.listener.listeners.b.d[262] ^ kotakbaz.rain.client.listener.listeners.b.d[263]] = d[264] ^ d[265];
                byArray[kotakbaz.rain.client.listener.listeners.b.d[266] ^ kotakbaz.rain.client.listener.listeners.b.d[267]] = d[268] ^ d[269];
                byArray[kotakbaz.rain.client.listener.listeners.b.d[270] ^ kotakbaz.rain.client.listener.listeners.b.d[271]] = d[272] ^ d[273];
                byArray[kotakbaz.rain.client.listener.listeners.b.d[274] ^ kotakbaz.rain.client.listener.listeners.b.d[275]] = d[276] ^ d[277];
                byArray[kotakbaz.rain.client.listener.listeners.b.d[278] ^ kotakbaz.rain.client.listener.listeners.b.d[279]] = d[280] ^ d[281];
                byArray[kotakbaz.rain.client.listener.listeners.b.d[282] ^ kotakbaz.rain.client.listener.listeners.b.d[283]] = d[284] ^ d[285];
                byArray[kotakbaz.rain.client.listener.listeners.b.d[286] ^ kotakbaz.rain.client.listener.listeners.b.d[287]] = d[288] ^ d[289];
                byArray[kotakbaz.rain.client.listener.listeners.b.d[290] ^ kotakbaz.rain.client.listener.listeners.b.d[291]] = d[292] ^ d[293];
                byArray[kotakbaz.rain.client.listener.listeners.b.d[294] ^ kotakbaz.rain.client.listener.listeners.b.d[295]] = d[296] ^ d[297];
                byArray[kotakbaz.rain.client.listener.listeners.b.d[298] ^ kotakbaz.rain.client.listener.listeners.b.d[299]] = d[300] ^ d[301];
                objectArray2[kotakbaz.rain.client.listener.listeners.b.d[235]] = byArray;
            }
            byte[] byArray = (byte[])object3[d[302]];
            if (B == null) {
                byte[] byArray2 = new byte[d[303] ^ d[304]];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[305] ^ kotakbaz.rain.client.listener.listeners.b.d[306]] = d[307] ^ d[308];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[309] ^ kotakbaz.rain.client.listener.listeners.b.d[310]] = d[311] ^ d[312];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[313] ^ kotakbaz.rain.client.listener.listeners.b.d[314]] = d[315] ^ d[316];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[317] ^ kotakbaz.rain.client.listener.listeners.b.d[318]] = d[319] ^ d[320];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[321] ^ kotakbaz.rain.client.listener.listeners.b.d[322]] = d[323] ^ d[324];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[325] ^ kotakbaz.rain.client.listener.listeners.b.d[326]] = d[327] ^ d[328];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[329] ^ kotakbaz.rain.client.listener.listeners.b.d[330]] = d[331] ^ d[332];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[333] ^ kotakbaz.rain.client.listener.listeners.b.d[334]] = d[335] ^ d[336];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[337] ^ kotakbaz.rain.client.listener.listeners.b.d[338]] = d[339] ^ d[340];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[341] ^ kotakbaz.rain.client.listener.listeners.b.d[342]] = d[343] ^ d[344];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[345] ^ kotakbaz.rain.client.listener.listeners.b.d[346]] = d[347] ^ d[348];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[349] ^ kotakbaz.rain.client.listener.listeners.b.d[350]] = d[351] ^ d[352];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[353] ^ kotakbaz.rain.client.listener.listeners.b.d[354]] = d[355] ^ d[356];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[357] ^ kotakbaz.rain.client.listener.listeners.b.d[358]] = d[359] ^ d[360];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[361] ^ kotakbaz.rain.client.listener.listeners.b.d[362]] = d[363] ^ d[364];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[365] ^ kotakbaz.rain.client.listener.listeners.b.d[366]] = d[367] ^ d[368];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[369] ^ kotakbaz.rain.client.listener.listeners.b.d[370]] = d[371] ^ d[372];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[373] ^ kotakbaz.rain.client.listener.listeners.b.d[374]] = d[375] ^ d[376];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[377] ^ kotakbaz.rain.client.listener.listeners.b.d[378]] = d[379] ^ d[380];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[381] ^ kotakbaz.rain.client.listener.listeners.b.d[382]] = d[383] ^ d[384];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[385] ^ kotakbaz.rain.client.listener.listeners.b.d[386]] = d[387] ^ d[388];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[389] ^ kotakbaz.rain.client.listener.listeners.b.d[390]] = d[391] ^ d[392];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[393] ^ kotakbaz.rain.client.listener.listeners.b.d[394]] = d[395] ^ d[396];
                byArray2[kotakbaz.rain.client.listener.listeners.b.d[397] ^ kotakbaz.rain.client.listener.listeners.b.d[398]] = d[399] ^ 0x10DC0;
                byArray2[0xCAF0 ^ 0xCAEF] = 0xFFFF355C ^ 0xCAEF;
                byArray2[0x360B ^ 0x3600] = 0xFFFFC9EB ^ 0x3600;
                byArray2[0x2637 ^ 0x262C] = 0x266F ^ 0x262C;
                byArray2[0x2428 ^ 0x2428] = 0xFFFFDBC3 ^ 0x2428;
                byArray2[0x61CB ^ 0x61CD] = 0x61E2 ^ 0x61CD;
                byArray2[0x2704 ^ 0x2713] = 0x2774 ^ 0x2713;
                byArray2[0xA160 ^ 0xA176] = 0xA173 ^ 0xA176;
                byArray2[0x8221 ^ 0x822D] = 0xFFFF7DFC ^ 0x822D;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.listener.listeners.b.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u65b7\u65b5\u6724\u65bb\u65b9\u66e5\u6720\u6456\u642b\u642f\u670f\u642a\u642e\u645c\u670c\u670f\u670e\u66fe".toCharArray();
                    for (int i = 0; i < 18; ++i) {
                        int n2 = cArray[i];
                        n2 -= 27749;
                        n2 ^= 0xCCAB;
                        n2 += 4267;
                        n2 ^= 0xC0EE;
                        n2 -= 15189;
                        n2 -= 49270;
                        n2 -= 53367;
                        n2 -= 46392;
                        n2 ^= 0xE37A;
                        n2 -= 36507;
                        n2 ^= 0x6FBC;
                        n2 += 3804;
                        cArray[i] = (char)(n2 -= 17727);
                    }
                    object4 = kotakbaz.rain.client.listener.listeners.b.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[13] = 124;
                byArray4[3] = 124;
                byArray4[5] = 12;
                byArray4[8] = 109;
                byArray4[7] = -32;
                byArray4[0] = -12;
                byArray4[2] = -91;
                byArray4[15] = -68;
                byArray4[4] = -75;
                byArray4[10] = 59;
                byArray4[6] = -33;
                byArray4[12] = 15;
                byArray4[1] = -7;
                byArray4[11] = -17;
                byArray4[14] = -27;
                byArray4[9] = -10;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 2, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.listener.listeners.b.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u3cb0\u3ccc\u3cfa".toCharArray();
                    for (int i = 0; i < 3; ++i) {
                        int n3 = cArray[i];
                        n3 -= 46707;
                        n3 += 8371;
                        n3 ^= 0x72A4;
                        n3 ^= 0x5155;
                        n3 += 9142;
                        n3 ^= 0x29E9;
                        n3 += 34940;
                        n3 -= 51404;
                        n3 ^= 0xDACD;
                        cArray[i] = (char)(n3 += 25726);
                    }
                    object5 = kotakbaz.rain.client.listener.listeners.b.A()[2] = new String(cArray);
                }
                B = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.client.listener.listeners.b.A()[3];
            if (object6 == null) {
                char[] cArray = "\ub389\ub385\ub437\ub1db\ub387\ub388\ub387\ub1db\ub43a\ub39f\ub387\ub437\ub1d5\ub43a\ub369\ub366\ub366\ub361\ub39c\ub363".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 += 6448;
                    n4 += 4064;
                    n4 -= 47729;
                    n4 ^= 0xAF52;
                    n4 += 21299;
                    n4 -= 2021;
                    n4 -= 17656;
                    n4 -= 57291;
                    n4 += 25868;
                    n4 += 11037;
                    n4 ^= 0x472D;
                    cArray[i] = (char)(n4 += 64830);
                }
                object6 = kotakbaz.rain.client.listener.listeners.b.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)B), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = C;
        if (C == null) {
            C = new Object[4];
            objectArray = C;
        }
        return objectArray;
    }

    public static void b() {
        d = new int[0x9F11 ^ 0x9E81];
        kotakbaz.rain.client.listener.listeners.b.d[0x18A9 ^ 0x19AB] = 0x117EE ^ 0x19AB;
        kotakbaz.rain.client.listener.listeners.b.d[0x62B6 ^ 0x620B] = 0x625A ^ 0x620B;
        kotakbaz.rain.client.listener.listeners.b.d[0xCB8C ^ 0xCB7F] = 0x9CFD ^ 0xCB7F;
        kotakbaz.rain.client.listener.listeners.b.d[0x5E98 ^ 0x5E19] = 0xFFFFA1F1 ^ 0x5E19;
        kotakbaz.rain.client.listener.listeners.b.d[0x83C5 ^ 0x83CE] = 0x83C4 ^ 0x83CE;
        kotakbaz.rain.client.listener.listeners.b.d[0x433C ^ 0x438C] = 0xFFFFBC0A ^ 0x438C;
        kotakbaz.rain.client.listener.listeners.b.d[0x7A91 ^ 0x7A5B] = 0xFFFF85A0 ^ 0x7A5B;
        kotakbaz.rain.client.listener.listeners.b.d[0x49D5 ^ 0x48C1] = 0x1A29 ^ 0x48C1;
        kotakbaz.rain.client.listener.listeners.b.d[0x2CBE ^ 0x2CD5] = 0x2C90 ^ 0x2CD5;
        kotakbaz.rain.client.listener.listeners.b.d[0x7AE1 ^ 0x7A71] = 0xFFFF85CD ^ 0x7A71;
        kotakbaz.rain.client.listener.listeners.b.d[0x241A ^ 0x249A] = 0x24C1 ^ 0x249A;
        kotakbaz.rain.client.listener.listeners.b.d[0x3486 ^ 0x3493] = 0x34DE ^ 0x3493;
        kotakbaz.rain.client.listener.listeners.b.d[0x3CC3 ^ 0x3DC5] = 0x4CDE ^ 0x3DC5;
        kotakbaz.rain.client.listener.listeners.b.d[0x108DC ^ 0x10887] = 0x108C7 ^ 0x10887;
        kotakbaz.rain.client.listener.listeners.b.d[0xF91 ^ 0xE95] = 0x100A3 ^ 0xE95;
        kotakbaz.rain.client.listener.listeners.b.d[0xA362 ^ 0xA3B5] = 0xFFFF5C45 ^ 0xA3B5;
        kotakbaz.rain.client.listener.listeners.b.d[0xF171 ^ 0xF115] = 0xF135 ^ 0xF115;
        kotakbaz.rain.client.listener.listeners.b.d[0xC092 ^ 0xC0B7] = 0xC0E2 ^ 0xC0B7;
        kotakbaz.rain.client.listener.listeners.b.d[0x1FD5 ^ 0x1F20] = 0x48A2 ^ 0x1F20;
        kotakbaz.rain.client.listener.listeners.b.d[0x4A66 ^ 0x4A90] = 0x3199 ^ 0x4A90;
        kotakbaz.rain.client.listener.listeners.b.d[0xC754 ^ 0xC607] = 0xFFFF448A ^ 0xC607;
        kotakbaz.rain.client.listener.listeners.b.d[0x78F7 ^ 0x781E] = 0x781F ^ 0x781E;
        kotakbaz.rain.client.listener.listeners.b.d[0xC27E ^ 0xC35C] = 0x8F3D ^ 0xC35C;
        kotakbaz.rain.client.listener.listeners.b.d[0x5530 ^ 0x5592] = 0x5AF4 ^ 0x5592;
        kotakbaz.rain.client.listener.listeners.b.d[0xA412 ^ 0xA448] = 0xFFFF5BE6 ^ 0xA448;
        kotakbaz.rain.client.listener.listeners.b.d[0x88DB ^ 0x89C1] = 0xE0F ^ 0x89C1;
        kotakbaz.rain.client.listener.listeners.b.d[0x4B83 ^ 0x4ABB] = 0xFA76 ^ 0x4ABB;
        kotakbaz.rain.client.listener.listeners.b.d[0x91AE ^ 0x910D] = 0x1045 ^ 0x910D;
        kotakbaz.rain.client.listener.listeners.b.d[0x6951 ^ 0x6961] = 0x691A ^ 0x6961;
        kotakbaz.rain.client.listener.listeners.b.d[0xD82F ^ 0xD894] = 0xFFFF2700 ^ 0xD894;
        kotakbaz.rain.client.listener.listeners.b.d[0xFEF8 ^ 0xFE7C] = 0xFE37 ^ 0xFE7C;
        kotakbaz.rain.client.listener.listeners.b.d[0x61CC ^ 0x61B8] = 0x61A7 ^ 0x61B8;
        kotakbaz.rain.client.listener.listeners.b.d[0x786E ^ 0x7933] = 0x52A8 ^ 0x7933;
        kotakbaz.rain.client.listener.listeners.b.d[0x9B7C ^ 0x9A16] = 0x682C ^ 0x9A16;
        kotakbaz.rain.client.listener.listeners.b.d[0xE91E ^ 0xE918] = 0xE99D ^ 0xE918;
        kotakbaz.rain.client.listener.listeners.b.d[0xE23F ^ 0xE2A4] = 0xE2A5 ^ 0xE2A4;
        kotakbaz.rain.client.listener.listeners.b.d[0x8FE4 ^ 0x8FE3] = 0xFFFF701B ^ 0x8FE3;
        kotakbaz.rain.client.listener.listeners.b.d[0x1708 ^ 0x171B] = 0xFFFFE893 ^ 0x171B;
        kotakbaz.rain.client.listener.listeners.b.d[0xBC97 ^ 0xBD19] = 0x1B0D9 ^ 0xBD19;
        kotakbaz.rain.client.listener.listeners.b.d[0x90EC ^ 0x9197] = 0xFFFF5025 ^ 0x9197;
        kotakbaz.rain.client.listener.listeners.b.d[0xB554 ^ 0xB449] = 0x3389 ^ 0xB449;
        kotakbaz.rain.client.listener.listeners.b.d[0x76DE ^ 0x76F6] = 0xFFFF895F ^ 0x76F6;
        kotakbaz.rain.client.listener.listeners.b.d[0x1B00 ^ 0x1A13] = 0x488D ^ 0x1A13;
        kotakbaz.rain.client.listener.listeners.b.d[0x101E0 ^ 0x1013D] = 0xFFFEFE5A ^ 0x1013D;
        kotakbaz.rain.client.listener.listeners.b.d[0xD9E ^ 0xD72] = 0x126B ^ 0xD72;
        kotakbaz.rain.client.listener.listeners.b.d[0x4FB6 ^ 0x4F1F] = 0xA033 ^ 0x4F1F;
        kotakbaz.rain.client.listener.listeners.b.d[0xC9A0 ^ 0xC825] = 0x515A ^ 0xC825;
        kotakbaz.rain.client.listener.listeners.b.d[0x3775 ^ 0x37A5] = 0x37D9 ^ 0x37A5;
        kotakbaz.rain.client.listener.listeners.b.d[0x9E05 ^ 0x9E9D] = 0xFFFF613E ^ 0x9E9D;
        kotakbaz.rain.client.listener.listeners.b.d[0xFDA6 ^ 0xFC29] = 0xFFFE0E31 ^ 0xFC29;
        kotakbaz.rain.client.listener.listeners.b.d[0x108A9 ^ 0x1084E] = 0x1084C ^ 0x1084E;
        kotakbaz.rain.client.listener.listeners.b.d[0xF97D ^ 0xF990] = 0xE699 ^ 0xF990;
        kotakbaz.rain.client.listener.listeners.b.d[0xBB51 ^ 0xBA2C] = 0xF1FD ^ 0xBA2C;
        kotakbaz.rain.client.listener.listeners.b.d[0x8ECF ^ 0x8E4D] = 0x8E29 ^ 0x8E4D;
        kotakbaz.rain.client.listener.listeners.b.d[0xB1E2 ^ 0xB0B6] = 0xCDF4 ^ 0xB0B6;
        kotakbaz.rain.client.listener.listeners.b.d[0xC38E ^ 0xC2ED] = 0xD781 ^ 0xC2ED;
        kotakbaz.rain.client.listener.listeners.b.d[0x362D ^ 0x3719] = 0xA3A6 ^ 0x3719;
        kotakbaz.rain.client.listener.listeners.b.d[0x446A ^ 0x4485] = 0xFB09 ^ 0x4485;
        kotakbaz.rain.client.listener.listeners.b.d[0xC9FD ^ 0xC8DE] = 0x84B0 ^ 0xC8DE;
        kotakbaz.rain.client.listener.listeners.b.d[0xEBD3 ^ 0xEA53] = 0xA198 ^ 0xEA53;
        kotakbaz.rain.client.listener.listeners.b.d[0xF487 ^ 0xF458] = 0xFFFF0BE0 ^ 0xF458;
        kotakbaz.rain.client.listener.listeners.b.d[0x333E ^ 0x3374] = 0xFFFFCCB1 ^ 0x3374;
        kotakbaz.rain.client.listener.listeners.b.d[0xF9A2 ^ 0xF9EC] = 0xF9A9 ^ 0xF9EC;
        kotakbaz.rain.client.listener.listeners.b.d[0x662D ^ 0x6622] = 0x66B7 ^ 0x6622;
        kotakbaz.rain.client.listener.listeners.b.d[0x1054A ^ 0x1050F] = 0x10517 ^ 0x1050F;
        kotakbaz.rain.client.listener.listeners.b.d[0xA502 ^ 0xA457] = 0x1AC61 ^ 0xA457;
        kotakbaz.rain.client.listener.listeners.b.d[0xED14 ^ 0xEDC8] = 0xFFFF122B ^ 0xEDC8;
        kotakbaz.rain.client.listener.listeners.b.d[0x92EB ^ 0x9389] = 0x86F7 ^ 0x9389;
        kotakbaz.rain.client.listener.listeners.b.d[0x9248 ^ 0x92D6] = 0x92D6 ^ 0x92D6;
        kotakbaz.rain.client.listener.listeners.b.d[0x5D76 ^ 0x5C19] = 0xFFFFFDB4 ^ 0x5C19;
        kotakbaz.rain.client.listener.listeners.b.d[0x10CF9 ^ 0x10DE5] = 0x18A0A ^ 0x10DE5;
        kotakbaz.rain.client.listener.listeners.b.d[0x999B ^ 0x98B7] = 0x938E ^ 0x98B7;
        kotakbaz.rain.client.listener.listeners.b.d[0x4002 ^ 0x40F9] = 0x3426 ^ 0x40F9;
        kotakbaz.rain.client.listener.listeners.b.d[0xB934 ^ 0xB803] = 0x8E8 ^ 0xB803;
        kotakbaz.rain.client.listener.listeners.b.d[0xBB6F ^ 0xBBB1] = 0xBBC0 ^ 0xBBB1;
        kotakbaz.rain.client.listener.listeners.b.d[0xAFC5 ^ 0xAE4F] = 0x5B06 ^ 0xAE4F;
        kotakbaz.rain.client.listener.listeners.b.d[0x163C ^ 0x16F0] = 0xFFFFE93A ^ 0x16F0;
        kotakbaz.rain.client.listener.listeners.b.d[0xBEBA ^ 0xBFC3] = 0x81C6 ^ 0xBFC3;
        kotakbaz.rain.client.listener.listeners.b.d[0x4E7D ^ 0x4F19] = 0x5A67 ^ 0x4F19;
        kotakbaz.rain.client.listener.listeners.b.d[0xD60F ^ 0xD62B] = 0xFFFF2968 ^ 0xD62B;
        kotakbaz.rain.client.listener.listeners.b.d[0xED5E ^ 0xEC64] = 0xCBD9 ^ 0xEC64;
        kotakbaz.rain.client.listener.listeners.b.d[0xDD1 ^ 0xCFF] = 0xCFF ^ 0xCFF;
        kotakbaz.rain.client.listener.listeners.b.d[0xCB83 ^ 0xCBFF] = 0xFFFF3403 ^ 0xCBFF;
        kotakbaz.rain.client.listener.listeners.b.d[0x800 ^ 0x932] = 0x9D8D ^ 0x932;
        kotakbaz.rain.client.listener.listeners.b.d[0xB957 ^ 0xB9B4] = 0xB9C0 ^ 0xB9B4;
        kotakbaz.rain.client.listener.listeners.b.d[0x3FF6 ^ 0x3E96] = 0x1503 ^ 0x3E96;
        kotakbaz.rain.client.listener.listeners.b.d[0x386 ^ 0x34F] = 0x35F ^ 0x34F;
        kotakbaz.rain.client.listener.listeners.b.d[0x10C3D ^ 0x10CC3] = 0xF18 ^ 0x10CC3;
        kotakbaz.rain.client.listener.listeners.b.d[0xCCE6 ^ 0xCC4B] = 0xFFFF331A ^ 0xCC4B;
        kotakbaz.rain.client.listener.listeners.b.d[0x10AED ^ 0x10B83] = 0x155A1 ^ 0x10B83;
        kotakbaz.rain.client.listener.listeners.b.d[0x51C7 ^ 0x50B0] = 0xFFFF655C ^ 0x50B0;
        kotakbaz.rain.client.listener.listeners.b.d[0x107A7 ^ 0x106E9] = 0x13AEF ^ 0x106E9;
        kotakbaz.rain.client.listener.listeners.b.d[0xD343 ^ 0xD258] = 0x5598 ^ 0xD258;
        kotakbaz.rain.client.listener.listeners.b.d[0x1D30 ^ 0x1D47] = 0x1D2E ^ 0x1D47;
        kotakbaz.rain.client.listener.listeners.b.d[0x50C9 ^ 0x50C8] = 0xFFFFAF14 ^ 0x50C8;
        kotakbaz.rain.client.listener.listeners.b.d[0x2220 ^ 0x2217] = 0xFFFFDDB0 ^ 0x2217;
        kotakbaz.rain.client.listener.listeners.b.d[0x3300 ^ 0x3227] = 0x562C ^ 0x3227;
        kotakbaz.rain.client.listener.listeners.b.d[0xC35C ^ 0xC346] = 0xFFFF3C94 ^ 0xC346;
        kotakbaz.rain.client.listener.listeners.b.d[0x1771 ^ 0x179A] = 0x179A ^ 0x179A;
        kotakbaz.rain.client.listener.listeners.b.d[0x4E72 ^ 0x4E03] = 0xFFFFB1D2 ^ 0x4E03;
        kotakbaz.rain.client.listener.listeners.b.d[0xEC09 ^ 0xECB1] = 0xFFFF1324 ^ 0xECB1;
        kotakbaz.rain.client.listener.listeners.b.d[0x5F54 ^ 0x5E45] = 0xC6B2 ^ 0x5E45;
        kotakbaz.rain.client.listener.listeners.b.d[0xF667 ^ 0xF715] = 0xE083 ^ 0xF715;
        kotakbaz.rain.client.listener.listeners.b.d[0xA245 ^ 0xA297] = 0xA2BB ^ 0xA297;
        kotakbaz.rain.client.listener.listeners.b.d[0x6F9D ^ 0x6F45] = 0x6F27 ^ 0x6F45;
        kotakbaz.rain.client.listener.listeners.b.d[0x10C17 ^ 0x10C46] = 0x10C54 ^ 0x10C46;
        kotakbaz.rain.client.listener.listeners.b.d[0x28FF ^ 0x284C] = 0xFFFFD789 ^ 0x284C;
        kotakbaz.rain.client.listener.listeners.b.d[0x10B4F ^ 0x10B8F] = 0xFFFEF426 ^ 0x10B8F;
        kotakbaz.rain.client.listener.listeners.b.d[0x9126 ^ 0x91A8] = 0xFFFF6E34 ^ 0x91A8;
        kotakbaz.rain.client.listener.listeners.b.d[0x33F4 ^ 0x3336] = 0x335D ^ 0x3336;
        kotakbaz.rain.client.listener.listeners.b.d[0x396C ^ 0x3935] = 0x396E ^ 0x3935;
        kotakbaz.rain.client.listener.listeners.b.d[0xD8F4 ^ 0xD89C] = 0xD8DA ^ 0xD89C;
        kotakbaz.rain.client.listener.listeners.b.d[0x778 ^ 0x7F5] = 0xFFFFF805 ^ 0x7F5;
        kotakbaz.rain.client.listener.listeners.b.d[0xDF8E ^ 0xDEAF] = 0x2178 ^ 0xDEAF;
        kotakbaz.rain.client.listener.listeners.b.d[0x8F81 ^ 0x8F55] = 0xFFFF709A ^ 0x8F55;
        kotakbaz.rain.client.listener.listeners.b.d[0x4D68 ^ 0x4C01] = 0xBE2F ^ 0x4C01;
        kotakbaz.rain.client.listener.listeners.b.d[0x5E6A ^ 0x5EC1] = 0xD61C ^ 0x5EC1;
        kotakbaz.rain.client.listener.listeners.b.d[0x959A ^ 0x94BF] = 0xD8D1 ^ 0x94BF;
        kotakbaz.rain.client.listener.listeners.b.d[0x512 ^ 0x53D] = 0x548 ^ 0x53D;
        kotakbaz.rain.client.listener.listeners.b.d[0xD3C0 ^ 0xD286] = 0xF671 ^ 0xD286;
        kotakbaz.rain.client.listener.listeners.b.d[0x103C9 ^ 0x103EB] = 0xFFFEFC47 ^ 0x103EB;
        kotakbaz.rain.client.listener.listeners.b.d[0x8B32 ^ 0x8BF4] = 0x8B85 ^ 0x8BF4;
        kotakbaz.rain.client.listener.listeners.b.d[0x6D13 ^ 0x6C39] = 0x6729 ^ 0x6C39;
        kotakbaz.rain.client.listener.listeners.b.d[0x9902 ^ 0x984E] = 0x8612 ^ 0x984E;
        kotakbaz.rain.client.listener.listeners.b.d[0xF646 ^ 0xF6B9] = 0x1F569 ^ 0xF6B9;
        kotakbaz.rain.client.listener.listeners.b.d[0x4F18 ^ 0x4F1A] = 0x4F46 ^ 0x4F1A;
        kotakbaz.rain.client.listener.listeners.b.d[0xCB61 ^ 0xCA69] = 0xBB14 ^ 0xCA69;
        kotakbaz.rain.client.listener.listeners.b.d[0xED68 ^ 0xEDFA] = 0xFFFF120B ^ 0xEDFA;
        kotakbaz.rain.client.listener.listeners.b.d[0xECF6 ^ 0xEDA7] = 0x90F7 ^ 0xEDA7;
        kotakbaz.rain.client.listener.listeners.b.d[0x920E ^ 0x9248] = 0x9270 ^ 0x9248;
        kotakbaz.rain.client.listener.listeners.b.d[0x5265 ^ 0x5309] = 0xA133 ^ 0x5309;
        kotakbaz.rain.client.listener.listeners.b.d[0x1A22 ^ 0x1A84] = 0xBB9F ^ 0x1A84;
        kotakbaz.rain.client.listener.listeners.b.d[0x96B9 ^ 0x964E] = 0xED45 ^ 0x964E;
        kotakbaz.rain.client.listener.listeners.b.d[0xEB71 ^ 0xEA2E] = 0xC182 ^ 0xEA2E;
        kotakbaz.rain.client.listener.listeners.b.d[0x1F94 ^ 0x1FD6] = 0xFFFFE04D ^ 0x1FD6;
        kotakbaz.rain.client.listener.listeners.b.d[0xF482 ^ 0xF417] = 0xF44B ^ 0xF417;
        kotakbaz.rain.client.listener.listeners.b.d[0x7954 ^ 0x793B] = 0xFFFF86E3 ^ 0x793B;
        kotakbaz.rain.client.listener.listeners.b.d[0x9794 ^ 0x9760] = 0xFFFF3F43 ^ 0x9760;
        kotakbaz.rain.client.listener.listeners.b.d[0x67BC ^ 0x66B7] = 0x3D9 ^ 0x66B7;
        kotakbaz.rain.client.listener.listeners.b.d[0xD1A2 ^ 0xD165] = 0xFFFF2E91 ^ 0xD165;
        kotakbaz.rain.client.listener.listeners.b.d[0x11B8 ^ 0x1033] = 0xFFFF1AA2 ^ 0x1033;
        kotakbaz.rain.client.listener.listeners.b.d[0x10964 ^ 0x1080C] = 0x1A5CC ^ 0x1080C;
        kotakbaz.rain.client.listener.listeners.b.d[0x6B45 ^ 0x6B5D] = 0x6B5D ^ 0x6B5D;
        kotakbaz.rain.client.listener.listeners.b.d[0xABC0 ^ 0xAB28] = 0xAB28 ^ 0xAB28;
        kotakbaz.rain.client.listener.listeners.b.d[0x105F7 ^ 0x1056E] = 0x1056D ^ 0x1056E;
        kotakbaz.rain.client.listener.listeners.b.d[0xC5C0 ^ 0xC4D0] = 0xFFFFA395 ^ 0xC4D0;
        kotakbaz.rain.client.listener.listeners.b.d[0x1852 ^ 0x19D1] = 0xFFFF182B ^ 0x19D1;
        kotakbaz.rain.client.listener.listeners.b.d[0xBEE9 ^ 0xBEF4] = 0xBEBA ^ 0xBEF4;
        kotakbaz.rain.client.listener.listeners.b.d[0xCEDE ^ 0xCE3C] = 0xFFFF31FC ^ 0xCE3C;
        kotakbaz.rain.client.listener.listeners.b.d[0xF9F7 ^ 0xF8DE] = 0x9CD5 ^ 0xF8DE;
        kotakbaz.rain.client.listener.listeners.b.d[0x15D0 ^ 0x1515] = 0xFFFFEAAE ^ 0x1515;
        kotakbaz.rain.client.listener.listeners.b.d[0x5F8 ^ 0x5C0] = 0x5DB ^ 0x5C0;
        kotakbaz.rain.client.listener.listeners.b.d[0x9A84 ^ 0x9AB9] = 0x9ACB ^ 0x9AB9;
        kotakbaz.rain.client.listener.listeners.b.d[0x5AA9 ^ 0x5AC3] = 0xFFFFA56D ^ 0x5AC3;
        kotakbaz.rain.client.listener.listeners.b.d[0x3A9 ^ 0x358] = 0xBCD4 ^ 0x358;
        kotakbaz.rain.client.listener.listeners.b.d[0x106DD ^ 0x107DE] = 0x991 ^ 0x107DE;
        kotakbaz.rain.client.listener.listeners.b.d[0xC163 ^ 0xC1B8] = 0xFFFF3E51 ^ 0xC1B8;
        kotakbaz.rain.client.listener.listeners.b.d[0x303B ^ 0x310B] = 0xEB91 ^ 0x310B;
        kotakbaz.rain.client.listener.listeners.b.d[0x9974 ^ 0x992A] = 0x993E ^ 0x992A;
        kotakbaz.rain.client.listener.listeners.b.d[0x7C57 ^ 0x7D36] = 0x6842 ^ 0x7D36;
        kotakbaz.rain.client.listener.listeners.b.d[0x22B9 ^ 0x2233] = 0xFFFFDD13 ^ 0x2233;
        kotakbaz.rain.client.listener.listeners.b.d[0xCA05 ^ 0xCB7D] = 0x163 ^ 0xCB7D;
        kotakbaz.rain.client.listener.listeners.b.d[0x16CA ^ 0x16B8] = 0xFFFFE916 ^ 0x16B8;
        kotakbaz.rain.client.listener.listeners.b.d[0x2B1B ^ 0x2A45] = 0x1D0 ^ 0x2A45;
        kotakbaz.rain.client.listener.listeners.b.d[0xE560 ^ 0xE55F] = 0xE5B8 ^ 0xE55F;
        kotakbaz.rain.client.listener.listeners.b.d[0xDEB7 ^ 0xDEF7] = 0xDE9E ^ 0xDEF7;
        kotakbaz.rain.client.listener.listeners.b.d[0xC887 ^ 0xC8E1] = 0xFFFF3745 ^ 0xC8E1;
        kotakbaz.rain.client.listener.listeners.b.d[0x6B86 ^ 0x6AED] = 0x98D7 ^ 0x6AED;
        kotakbaz.rain.client.listener.listeners.b.d[0xFBF0 ^ 0xFBCE] = 0xFFFF0422 ^ 0xFBCE;
        kotakbaz.rain.client.listener.listeners.b.d[0x5099 ^ 0x50FE] = 0xFFFFAF34 ^ 0x50FE;
        kotakbaz.rain.client.listener.listeners.b.d[0xE293 ^ 0xE3C1] = 0x9E83 ^ 0xE3C1;
        kotakbaz.rain.client.listener.listeners.b.d[0x13EB ^ 0x12E5] = 0x8A1B ^ 0x12E5;
        kotakbaz.rain.client.listener.listeners.b.d[0xF2D9 ^ 0xF25A] = 0xF236 ^ 0xF25A;
        kotakbaz.rain.client.listener.listeners.b.d[0xA0CE ^ 0xA099] = 0xFFFF5F52 ^ 0xA099;
        kotakbaz.rain.client.listener.listeners.b.d[0xBD6B ^ 0xBC55] = 0x5E61 ^ 0xBC55;
        kotakbaz.rain.client.listener.listeners.b.d[0x801 ^ 0x949] = 0x2DBE ^ 0x949;
        kotakbaz.rain.client.listener.listeners.b.d[0x5645 ^ 0x574C] = 0x2652 ^ 0x574C;
        kotakbaz.rain.client.listener.listeners.b.d[0xB57D ^ 0xB42B] = 0x1BC05 ^ 0xB42B;
        kotakbaz.rain.client.listener.listeners.b.d[0x2194 ^ 0x2198] = 0x219B ^ 0x2198;
        kotakbaz.rain.client.listener.listeners.b.d[0xF922 ^ 0xF819] = 0xDFF6 ^ 0xF819;
        kotakbaz.rain.client.listener.listeners.b.d[0x9D79 ^ 0x9DBA] = 0x9D9D ^ 0x9DBA;
        kotakbaz.rain.client.listener.listeners.b.d[0x173F ^ 0x174F] = 0x1738 ^ 0x174F;
        kotakbaz.rain.client.listener.listeners.b.d[0xBE7D ^ 0xBF6B] = 0x5AC6 ^ 0xBF6B;
        kotakbaz.rain.client.listener.listeners.b.d[0x6FDD ^ 0x6E97] = 0x70CB ^ 0x6E97;
        kotakbaz.rain.client.listener.listeners.b.d[0x10CD5 ^ 0x10CBC] = 0x10CAF ^ 0x10CBC;
        kotakbaz.rain.client.listener.listeners.b.d[0x6B15 ^ 0x6BF5] = 0x6BA2 ^ 0x6BF5;
        kotakbaz.rain.client.listener.listeners.b.d[0xF0B9 ^ 0xF06A] = 0xF037 ^ 0xF06A;
        kotakbaz.rain.client.listener.listeners.b.d[0xF3BE ^ 0xF3EA] = 0xF3BF ^ 0xF3EA;
        kotakbaz.rain.client.listener.listeners.b.d[0xAD63 ^ 0xAD7A] = 0xFFFF5288 ^ 0xAD7A;
        kotakbaz.rain.client.listener.listeners.b.d[0xEA6A ^ 0xEACF] = 0xC975 ^ 0xEACF;
        kotakbaz.rain.client.listener.listeners.b.d[0x471A ^ 0x4793] = 0xFFFFB852 ^ 0x4793;
        kotakbaz.rain.client.listener.listeners.b.d[0xC519 ^ 0xC416] = 0x5CE1 ^ 0xC416;
        kotakbaz.rain.client.listener.listeners.b.d[0xEA0 ^ 0xEC3] = 0xE5A ^ 0xEC3;
        kotakbaz.rain.client.listener.listeners.b.d[0xA5F7 ^ 0xA5FA] = 0xA5BD ^ 0xA5FA;
        kotakbaz.rain.client.listener.listeners.b.d[0x7E31 ^ 0x7F36] = 0xE28 ^ 0x7F36;
        kotakbaz.rain.client.listener.listeners.b.d[0xE880 ^ 0xE98C] = 0xFFFF735F ^ 0xE98C;
        kotakbaz.rain.client.listener.listeners.b.d[0xB230 ^ 0xB33D] = 0xD653 ^ 0xB33D;
        kotakbaz.rain.client.listener.listeners.b.d[0x59E4 ^ 0x58C0] = 0x14C8 ^ 0x58C0;
        kotakbaz.rain.client.listener.listeners.b.d[0xF9D7 ^ 0xF927] = 0xFFFFB923 ^ 0xF927;
        kotakbaz.rain.client.listener.listeners.b.d[0xB8BE ^ 0xB867] = 0xFFFF47D5 ^ 0xB867;
        kotakbaz.rain.client.listener.listeners.b.d[0xC101 ^ 0xC13D] = 0xFFFF3E67 ^ 0xC13D;
        kotakbaz.rain.client.listener.listeners.b.d[0xE61F ^ 0xE6FA] = 0xE6B7 ^ 0xE6FA;
        kotakbaz.rain.client.listener.listeners.b.d[0xA174 ^ 0xA107] = 0xFFFF5EAA ^ 0xA107;
        kotakbaz.rain.client.listener.listeners.b.d[0x84F0 ^ 0x84EF] = 0xFFFF7B04 ^ 0x84EF;
        kotakbaz.rain.client.listener.listeners.b.d[0x94DC ^ 0x94F0] = 0x94E8 ^ 0x94F0;
        kotakbaz.rain.client.listener.listeners.b.d[0x6B7D ^ 0x6B36] = 0xFFFF94E3 ^ 0x6B36;
        kotakbaz.rain.client.listener.listeners.b.d[0xCA94 ^ 0xCA18] = 0xFFFF35AE ^ 0xCA18;
        kotakbaz.rain.client.listener.listeners.b.d[0x1EF9 ^ 0x1F78] = 0xE140 ^ 0x1F78;
        kotakbaz.rain.client.listener.listeners.b.d[0xC3EE ^ 0xC371] = 0xC371 ^ 0xC371;
        kotakbaz.rain.client.listener.listeners.b.d[0xAEEF ^ 0xAE75] = 0xAE75 ^ 0xAE75;
        kotakbaz.rain.client.listener.listeners.b.d[0x5A69 ^ 0x5AF8] = 0x5A95 ^ 0x5AF8;
        kotakbaz.rain.client.listener.listeners.b.d[0xC056 ^ 0xC116] = 0x2322 ^ 0xC116;
        kotakbaz.rain.client.listener.listeners.b.d[0x7072 ^ 0x7131] = 0xEF0E ^ 0x7131;
        kotakbaz.rain.client.listener.listeners.b.d[0x3A1D ^ 0x3B67] = 0x565 ^ 0x3B67;
        kotakbaz.rain.client.listener.listeners.b.d[0x5FFF ^ 0x5E76] = 0xAB30 ^ 0x5E76;
        kotakbaz.rain.client.listener.listeners.b.d[0x72F3 ^ 0x7241] = 0xFFFF8DCA ^ 0x7241;
        kotakbaz.rain.client.listener.listeners.b.d[0xE48D ^ 0xE4A4] = 0xFFFF1B20 ^ 0xE4A4;
        kotakbaz.rain.client.listener.listeners.b.d[0x9755 ^ 0x9663] = 0x26AE ^ 0x9663;
        kotakbaz.rain.client.listener.listeners.b.d[0xB843 ^ 0xB847] = 0xB812 ^ 0xB847;
        kotakbaz.rain.client.listener.listeners.b.d[0x10D3C ^ 0x10CBA] = 0x195CC ^ 0x10CBA;
        kotakbaz.rain.client.listener.listeners.b.d[0x10C5A ^ 0x10C1D] = 0xFFFEF3DD ^ 0x10C1D;
        kotakbaz.rain.client.listener.listeners.b.d[0xC38 ^ 0xD3D] = 0x10372 ^ 0xD3D;
        kotakbaz.rain.client.listener.listeners.b.d[0xF502 ^ 0xF546] = 0xF548 ^ 0xF546;
        kotakbaz.rain.client.listener.listeners.b.d[0xE4D4 ^ 0xE4C0] = 0xE4F7 ^ 0xE4C0;
        kotakbaz.rain.client.listener.listeners.b.d[0xF45A ^ 0xF46E] = 0xFFFF0BC0 ^ 0xF46E;
        kotakbaz.rain.client.listener.listeners.b.d[0x5623 ^ 0x5766] = 0x738C ^ 0x5766;
        kotakbaz.rain.client.listener.listeners.b.d[0x52CF ^ 0x53B9] = 0x99A7 ^ 0x53B9;
        kotakbaz.rain.client.listener.listeners.b.d[0x9BF0 ^ 0x9B09] = 0xE002 ^ 0x9B09;
        kotakbaz.rain.client.listener.listeners.b.d[0x10312 ^ 0x10370] = 0xFFFEFC90 ^ 0x10370;
        kotakbaz.rain.client.listener.listeners.b.d[0x10095 ^ 0x1007B] = 0x1BFF1 ^ 0x1007B;
        kotakbaz.rain.client.listener.listeners.b.d[0xDD7 ^ 0xDB6] = 0xFFFFF22E ^ 0xDB6;
        kotakbaz.rain.client.listener.listeners.b.d[0x8FDC ^ 0x8F17] = 0xFFFF70E0 ^ 0x8F17;
        kotakbaz.rain.client.listener.listeners.b.d[0x5032 ^ 0x5112] = 0xFFFF512C ^ 0x5112;
        kotakbaz.rain.client.listener.listeners.b.d[0xB712 ^ 0xB727] = 0xB733 ^ 0xB727;
        kotakbaz.rain.client.listener.listeners.b.d[0x5124 ^ 0x518A] = 0xFFFFAE2B ^ 0x518A;
        kotakbaz.rain.client.listener.listeners.b.d[0x475 ^ 0x540] = 0xB580 ^ 0x540;
        kotakbaz.rain.client.listener.listeners.b.d[0x7194 ^ 0x7133] = 0x6A88 ^ 0x7133;
        kotakbaz.rain.client.listener.listeners.b.d[0x8CFC ^ 0x8D71] = 0x180B5 ^ 0x8D71;
        kotakbaz.rain.client.listener.listeners.b.d[0x10DA1 ^ 0x10DF9] = 0x10DDF ^ 0x10DF9;
        kotakbaz.rain.client.listener.listeners.b.d[0x3A5F ^ 0x3A21] = 0xFFFFC57C ^ 0x3A21;
        kotakbaz.rain.client.listener.listeners.b.d[0x3818 ^ 0x38B4] = 0x38B4 ^ 0x38B4;
        kotakbaz.rain.client.listener.listeners.b.d[0x5CE7 ^ 0x5CCC] = 0xFFFFA304 ^ 0x5CCC;
        kotakbaz.rain.client.listener.listeners.b.d[0xBB88 ^ 0xBB88] = 0xFFFF440A ^ 0xBB88;
        kotakbaz.rain.client.listener.listeners.b.d[0xB446 ^ 0xB55F] = 0x50F5 ^ 0xB55F;
        kotakbaz.rain.client.listener.listeners.b.d[0x3A36 ^ 0x3A05] = 0xFFFFC5BF ^ 0x3A05;
        kotakbaz.rain.client.listener.listeners.b.d[0xB9D9 ^ 0xB8F6] = 0x624C ^ 0xB8F6;
        kotakbaz.rain.client.listener.listeners.b.d[0x545F ^ 0x5579] = 0x317F ^ 0x5579;
        kotakbaz.rain.client.listener.listeners.b.d[0x10A9D ^ 0x10A8D] = 0xFFFEF505 ^ 0x10A8D;
        kotakbaz.rain.client.listener.listeners.b.d[0xF11 ^ 0xF4E] = 0xF12 ^ 0xF4E;
        kotakbaz.rain.client.listener.listeners.b.d[0xB77A ^ 0xB70F] = 0xB6EC ^ 0xB70F;
        kotakbaz.rain.client.listener.listeners.b.d[0x200C ^ 0x20C2] = 0x20C6 ^ 0x20C2;
        kotakbaz.rain.client.listener.listeners.b.d[0x1866 ^ 0x18E1] = 0xFFFFE760 ^ 0x18E1;
        kotakbaz.rain.client.listener.listeners.b.d[0x5936 ^ 0x5915] = 0xFFFFA6A3 ^ 0x5915;
        kotakbaz.rain.client.listener.listeners.b.d[0x4EDB ^ 0x4E3A] = 0xFFFFB18D ^ 0x4E3A;
        kotakbaz.rain.client.listener.listeners.b.d[0x42EF ^ 0x42D4] = 0xFFFFBD14 ^ 0x42D4;
        kotakbaz.rain.client.listener.listeners.b.d[0xF8AC ^ 0xF89E] = 0xF8D6 ^ 0xF89E;
        kotakbaz.rain.client.listener.listeners.b.d[0xD490 ^ 0xD5CA] = 0x85AA ^ 0xD5CA;
        kotakbaz.rain.client.listener.listeners.b.d[0xF666 ^ 0xF6FA] = 0xF6FA ^ 0xF6FA;
        kotakbaz.rain.client.listener.listeners.b.d[0x7FE6 ^ 0x7FA9] = 0x7FA8 ^ 0x7FA9;
        kotakbaz.rain.client.listener.listeners.b.d[0x2080 ^ 0x20A7] = 0x20AA ^ 0x20A7;
        kotakbaz.rain.client.listener.listeners.b.d[0xD9B7 ^ 0xD9FB] = 0xFFFF2663 ^ 0xD9FB;
        kotakbaz.rain.client.listener.listeners.b.d[0xDB3F ^ 0xDABB] = 0x2480 ^ 0xDABB;
        kotakbaz.rain.client.listener.listeners.b.d[0x3BBA ^ 0x3B6F] = 0xFFFFC490 ^ 0x3B6F;
        kotakbaz.rain.client.listener.listeners.b.d[0x26E9 ^ 0x26D8] = 0x26CB ^ 0x26D8;
        kotakbaz.rain.client.listener.listeners.b.d[0xCE1F ^ 0xCE71] = 0xFFFF31AA ^ 0xCE71;
        kotakbaz.rain.client.listener.listeners.b.d[0x40D3 ^ 0x407C] = 0xFFFFBFEC ^ 0x407C;
        kotakbaz.rain.client.listener.listeners.b.d[0x29EF ^ 0x2917] = 0xFFFFAD92 ^ 0x2917;
        kotakbaz.rain.client.listener.listeners.b.d[0x5B29 ^ 0x5B21] = 0x5B5D ^ 0x5B21;
        kotakbaz.rain.client.listener.listeners.b.d[0x4CC2 ^ 0x4DC2] = 0x14E49 ^ 0x4DC2;
        kotakbaz.rain.client.listener.listeners.b.d[0x22AB ^ 0x221A] = 0xFFFFDDC1 ^ 0x221A;
        kotakbaz.rain.client.listener.listeners.b.d[0xF538 ^ 0xF52E] = 0xF509 ^ 0xF52E;
        kotakbaz.rain.client.listener.listeners.b.d[0xF71C ^ 0xF69E] = 0x8A5 ^ 0xF69E;
        kotakbaz.rain.client.listener.listeners.b.d[0x6943 ^ 0x696E] = 0x696B ^ 0x696E;
        kotakbaz.rain.client.listener.listeners.b.d[0x980F ^ 0x9818] = 0x9852 ^ 0x9818;
        kotakbaz.rain.client.listener.listeners.b.d[0x76E2 ^ 0x77B2] = 0x4BB4 ^ 0x77B2;
        kotakbaz.rain.client.listener.listeners.b.d[0x72F9 ^ 0x72F7] = 0x72DD ^ 0x72F7;
        kotakbaz.rain.client.listener.listeners.b.d[0xD32D ^ 0xD3FC] = 0xD3AD ^ 0xD3FC;
        kotakbaz.rain.client.listener.listeners.b.d[0x888A ^ 0x8896] = 0xFFFF774E ^ 0x8896;
        kotakbaz.rain.client.listener.listeners.b.d[0x8023 ^ 0x8029] = 0x805D ^ 0x8029;
        kotakbaz.rain.client.listener.listeners.b.d[0xB41C ^ 0xB52D] = 0x2183 ^ 0xB52D;
        kotakbaz.rain.client.listener.listeners.b.d[0x6B65 ^ 0x6B9F] = 0x1F40 ^ 0x6B9F;
        kotakbaz.rain.client.listener.listeners.b.d[0xBF6 ^ 0xB1C] = 0xB1D ^ 0xB1C;
        kotakbaz.rain.client.listener.listeners.b.d[0xD0AE ^ 0xD1EC] = 0x4F87 ^ 0xD1EC;
        kotakbaz.rain.client.listener.listeners.b.d[0x220B ^ 0x2352] = 0x7337 ^ 0x2352;
        kotakbaz.rain.client.listener.listeners.b.d[0xC2AC ^ 0xC2ED] = 0xC290 ^ 0xC2ED;
        kotakbaz.rain.client.listener.listeners.b.d[0x4B10 ^ 0x4BE2] = 0x1C63 ^ 0x4BE2;
        kotakbaz.rain.client.listener.listeners.b.d[0x4895 ^ 0x4801] = 0xFFFFB7C8 ^ 0x4801;
        kotakbaz.rain.client.listener.listeners.b.d[0x3A7C ^ 0x3B35] = 0x2561 ^ 0x3B35;
        kotakbaz.rain.client.listener.listeners.b.d[0x98B ^ 0x9AB] = 0xFFFFF64F ^ 0x9AB;
        kotakbaz.rain.client.listener.listeners.b.d[0x10BD5 ^ 0x10B80] = 0xFFFEF466 ^ 0x10B80;
        kotakbaz.rain.client.listener.listeners.b.d[0x10EE5 ^ 0x10E03] = 0x10E02 ^ 0x10E03;
        kotakbaz.rain.client.listener.listeners.b.d[0x4558 ^ 0x4426] = 0xFED ^ 0x4426;
        kotakbaz.rain.client.listener.listeners.b.d[0x210C ^ 0x211D] = 0x2101 ^ 0x211D;
        kotakbaz.rain.client.listener.listeners.b.d[0x4A05 ^ 0x4A55] = 0x4A33 ^ 0x4A55;
        kotakbaz.rain.client.listener.listeners.b.d[0x2159 ^ 0x2111] = 0xFFFFDECC ^ 0x2111;
        kotakbaz.rain.client.listener.listeners.b.d[0xBFFD ^ 0xBF55] = 0xE8E9 ^ 0xBF55;
        kotakbaz.rain.client.listener.listeners.b.d[0x4369 ^ 0x43D3] = 0xFFFFBC24 ^ 0x43D3;
        kotakbaz.rain.client.listener.listeners.b.d[0x4CA3 ^ 0x4C9A] = 0xFFFFB339 ^ 0x4C9A;
        kotakbaz.rain.client.listener.listeners.b.d[0x11D ^ 0x2E] = 0x9496 ^ 0x2E;
        kotakbaz.rain.client.listener.listeners.b.d[0xDCBA ^ 0xDC47] = 0xA898 ^ 0xDC47;
        kotakbaz.rain.client.listener.listeners.b.d[0xA2F6 ^ 0xA3B7] = 0x3DCF ^ 0xA3B7;
        kotakbaz.rain.client.listener.listeners.b.d[0x460C ^ 0x4636] = 0x4628 ^ 0x4636;
        kotakbaz.rain.client.listener.listeners.b.d[0x10BC ^ 0x1002] = 0x106E ^ 0x1002;
        kotakbaz.rain.client.listener.listeners.b.d[0x3A7B ^ 0x3B65] = 0xC4BE ^ 0x3B65;
        kotakbaz.rain.client.listener.listeners.b.d[0x91DB ^ 0x91BB] = 0xFFFF6E02 ^ 0x91BB;
        kotakbaz.rain.client.listener.listeners.b.d[0xFA0A ^ 0xFB4E] = 0x6525 ^ 0xFB4E;
        kotakbaz.rain.client.listener.listeners.b.d[0x16CF ^ 0x164A] = 0x1656 ^ 0x164A;
        kotakbaz.rain.client.listener.listeners.b.d[0xD04B ^ 0xD0F4] = 0xD0C4 ^ 0xD0F4;
        kotakbaz.rain.client.listener.listeners.b.d[0x77D1 ^ 0x7792] = 0xFFFF881F ^ 0x7792;
        kotakbaz.rain.client.listener.listeners.b.d[0xE1D0 ^ 0xE165] = 0xFFFF1EDD ^ 0xE165;
        kotakbaz.rain.client.listener.listeners.b.d[0x5A96 ^ 0x5AE9] = 0xFFFFA571 ^ 0x5AE9;
        kotakbaz.rain.client.listener.listeners.b.d[0x905B ^ 0x912A] = 0x86A0 ^ 0x912A;
        kotakbaz.rain.client.listener.listeners.b.d[0x3995 ^ 0x39F0] = 0x3989 ^ 0x39F0;
        kotakbaz.rain.client.listener.listeners.b.d[0xEDD1 ^ 0xECDB] = 0x89B1 ^ 0xECDB;
        kotakbaz.rain.client.listener.listeners.b.d[0xBB6A ^ 0xBB5C] = 0xBB1E ^ 0xBB5C;
        kotakbaz.rain.client.listener.listeners.b.d[0xCE8E ^ 0xCFB1] = 0xFFFFD229 ^ 0xCFB1;
        kotakbaz.rain.client.listener.listeners.b.d[0x5408 ^ 0x5422] = 0x5422 ^ 0x5422;
        kotakbaz.rain.client.listener.listeners.b.d[0xB976 ^ 0xB93F] = 0xB907 ^ 0xB93F;
        kotakbaz.rain.client.listener.listeners.b.d[0xC1BD ^ 0xC0C9] = 0xD75F ^ 0xC0C9;
        kotakbaz.rain.client.listener.listeners.b.d[0x68E1 ^ 0x6869] = 0x6809 ^ 0x6869;
        kotakbaz.rain.client.listener.listeners.b.d[0xF5AD ^ 0xF425] = 0x6D53 ^ 0xF425;
        kotakbaz.rain.client.listener.listeners.b.d[0xE301 ^ 0xE24C] = 0xDE54 ^ 0xE24C;
        kotakbaz.rain.client.listener.listeners.b.d[0x101F4 ^ 0x101D2] = 0xFFFEFE4A ^ 0x101D2;
        kotakbaz.rain.client.listener.listeners.b.d[0x4881 ^ 0x4817] = 0x483B ^ 0x4817;
        kotakbaz.rain.client.listener.listeners.b.d[0x6D8F ^ 0x6D18] = 0xFFFF92B7 ^ 0x6D18;
        kotakbaz.rain.client.listener.listeners.b.d[0x561C ^ 0x5779] = 0xFAA0 ^ 0x5779;
        kotakbaz.rain.client.listener.listeners.b.d[0x4C41 ^ 0x4D6C] = 0x467D ^ 0x4D6C;
        kotakbaz.rain.client.listener.listeners.b.d[0xFDA8 ^ 0xFDF5] = 0xFFFF0242 ^ 0xFDF5;
        kotakbaz.rain.client.listener.listeners.b.d[0xB79 ^ 0xA3E] = 0x2EB4 ^ 0xA3E;
        kotakbaz.rain.client.listener.listeners.b.d[0xB51 ^ 0xB90] = 0xFFFFF408 ^ 0xB90;
        kotakbaz.rain.client.listener.listeners.b.d[0x29D7 ^ 0x29DE] = 0x2980 ^ 0x29DE;
        kotakbaz.rain.client.listener.listeners.b.d[0xD65F ^ 0xD7D3] = 0x229A ^ 0xD7D3;
        kotakbaz.rain.client.listener.listeners.b.d[0x92E2 ^ 0x9264] = 0x926B ^ 0x9264;
        kotakbaz.rain.client.listener.listeners.b.d[0x4EE2 ^ 0x4E46] = 0x7F8C ^ 0x4E46;
        kotakbaz.rain.client.listener.listeners.b.d[0x2BDE ^ 0x2AE7] = 0xD58 ^ 0x2AE7;
        kotakbaz.rain.client.listener.listeners.b.d[0xD84B ^ 0xD848] = 0xFFFF27AC ^ 0xD848;
        kotakbaz.rain.client.listener.listeners.b.d[0x336E ^ 0x3252] = 0x15EF ^ 0x3252;
        kotakbaz.rain.client.listener.listeners.b.d[0x607 ^ 0x68C] = 0xFFFFF906 ^ 0x68C;
        kotakbaz.rain.client.listener.listeners.b.d[0x359B ^ 0x34C7] = 0x64A7 ^ 0x34C7;
        kotakbaz.rain.client.listener.listeners.b.d[0xD331 ^ 0xD32A] = 0xD3BC ^ 0xD32A;
        kotakbaz.rain.client.listener.listeners.b.d[0x6CEA ^ 0x6DF2] = 0x885C ^ 0x6DF2;
        kotakbaz.rain.client.listener.listeners.b.d[0x8E0E ^ 0x8E1C] = 0x8ED3 ^ 0x8E1C;
        kotakbaz.rain.client.listener.listeners.b.d[0xD1E1 ^ 0xD197] = 0xFFFF2E11 ^ 0xD197;
        kotakbaz.rain.client.listener.listeners.b.d[0xC325 ^ 0xC3B8] = 0xC3BA ^ 0xC3B8;
        kotakbaz.rain.client.listener.listeners.b.d[0x160B ^ 0x16C6] = 0x16EB ^ 0x16C6;
        kotakbaz.rain.client.listener.listeners.b.d[0x215D ^ 0x2012] = 0x1C49 ^ 0x2012;
        kotakbaz.rain.client.listener.listeners.b.d[0xD989 ^ 0xD95F] = 0xD94F ^ 0xD95F;
        kotakbaz.rain.client.listener.listeners.b.d[0xF80B ^ 0xF872] = 0xFFFF07C8 ^ 0xF872;
        kotakbaz.rain.client.listener.listeners.b.d[0x10A79 ^ 0x10AB6] = 0x10AD6 ^ 0x10AB6;
        kotakbaz.rain.client.listener.listeners.b.d[0xF125 ^ 0xF15E] = 0xFFFF0ED5 ^ 0xF15E;
        kotakbaz.rain.client.listener.listeners.b.d[0xD7B5 ^ 0xD7E6] = 0xFFFF2863 ^ 0xD7E6;
        kotakbaz.rain.client.listener.listeners.b.d[0x57E5 ^ 0x5696] = 0x4163 ^ 0x5696;
        kotakbaz.rain.client.listener.listeners.b.d[0x10AA ^ 0x11AB] = 0x1127B ^ 0x11AB;
        kotakbaz.rain.client.listener.listeners.b.d[0x886B ^ 0x8906] = 0xD725 ^ 0x8906;
        kotakbaz.rain.client.listener.listeners.b.d[0x10133 ^ 0x1015E] = 0x1013D ^ 0x1015E;
        kotakbaz.rain.client.listener.listeners.b.d[0x4A17 ^ 0x4B71] = 0xE6B1 ^ 0x4B71;
        kotakbaz.rain.client.listener.listeners.b.d[0x106C ^ 0x104D] = 0x1046 ^ 0x104D;
        kotakbaz.rain.client.listener.listeners.b.d[0xE1DD ^ 0xE0A1] = 0xDEA3 ^ 0xE0A1;
        kotakbaz.rain.client.listener.listeners.b.d[0x6EEC ^ 0x6F6B] = 0xFFFF09D8 ^ 0x6F6B;
        kotakbaz.rain.client.listener.listeners.b.d[0x378C ^ 0x3789] = 0xFFFFC86E ^ 0x3789;
        kotakbaz.rain.client.listener.listeners.b.d[0x92BE ^ 0x93AB] = 0xC135 ^ 0x93AB;
        kotakbaz.rain.client.listener.listeners.b.d[0x793B ^ 0x7813] = 0x1C51 ^ 0x7813;
        kotakbaz.rain.client.listener.listeners.b.d[0xD050 ^ 0xD094] = 0xD0F8 ^ 0xD094;
        kotakbaz.rain.client.listener.listeners.b.d[0x61C6 ^ 0x6091] = 0xFFFE9749 ^ 0x6091;
        kotakbaz.rain.client.listener.listeners.b.d[0x107B9 ^ 0x107C3] = 0xFFFEF834 ^ 0x107C3;
        kotakbaz.rain.client.listener.listeners.b.d[0xB8AA ^ 0xB856] = 0xCCF7 ^ 0xB856;
        kotakbaz.rain.client.listener.listeners.b.d[0x73FF ^ 0x736C] = 0x73FA ^ 0x736C;
        kotakbaz.rain.client.listener.listeners.b.d[0xAD8 ^ 0xAB4] = 0xFFFFF556 ^ 0xAB4;
        kotakbaz.rain.client.listener.listeners.b.d[0xA21B ^ 0xA2BB] = 0xA2FB ^ 0xA2BB;
        kotakbaz.rain.client.listener.listeners.b.d[0x8F93 ^ 0x8EB8] = 0x85A9 ^ 0x8EB8;
        kotakbaz.rain.client.listener.listeners.b.d[0x77EA ^ 0x77BC] = 0x7786 ^ 0x77BC;
        kotakbaz.rain.client.listener.listeners.b.d[0x9969 ^ 0x993B] = 0xFFFF668C ^ 0x993B;
        kotakbaz.rain.client.listener.listeners.b.d[0xC37E ^ 0xC243] = 0x2062 ^ 0xC243;
        kotakbaz.rain.client.listener.listeners.b.d[0x166B ^ 0x1720] = 0x97C ^ 0x1720;
        kotakbaz.rain.client.listener.listeners.b.d[0x891 ^ 0x826] = 0xFFFFF7D0 ^ 0x826;
        kotakbaz.rain.client.listener.listeners.b.d[0x53EE ^ 0x5361] = 0x532D ^ 0x5361;
        kotakbaz.rain.client.listener.listeners.b.d[0xC4B ^ 0xCFD] = 0xFFFFF371 ^ 0xCFD;
        kotakbaz.rain.client.listener.listeners.b.d[0x136F ^ 0x1234] = 0x4253 ^ 0x1234;
        kotakbaz.rain.client.listener.listeners.b.d[0xC358 ^ 0xC325] = 0xC372 ^ 0xC325;
        kotakbaz.rain.client.listener.listeners.b.d[0x2253 ^ 0x222B] = 0x2276 ^ 0x222B;
        kotakbaz.rain.client.listener.listeners.b.d[0xEA72 ^ 0xEA3F] = 0xFFFF15EC ^ 0xEA3F;
        kotakbaz.rain.client.listener.listeners.b.d[0xF119 ^ 0xF1AD] = 0xF1BE ^ 0xF1AD;
        kotakbaz.rain.client.listener.listeners.b.d[0x1C07 ^ 0x1D15] = 0x4F83 ^ 0x1D15;
        kotakbaz.rain.client.listener.listeners.b.d[0xEF15 ^ 0xEFA9] = 0xEF74 ^ 0xEFA9;
        kotakbaz.rain.client.listener.listeners.b.d[0x52EF ^ 0x5245] = 0x5EE8 ^ 0x5245;
        kotakbaz.rain.client.listener.listeners.b.d[0xE5BC ^ 0xE592] = 0xE5C2 ^ 0xE592;
        kotakbaz.rain.client.listener.listeners.b.d[0x3B7C ^ 0x3A6B] = 0xDFC1 ^ 0x3A6B;
        kotakbaz.rain.client.listener.listeners.b.d[0xBC16 ^ 0xBD4E] = 0x1B560 ^ 0xBD4E;
        kotakbaz.rain.client.listener.listeners.b.d[0x2878 ^ 0x28C1] = 0x2882 ^ 0x28C1;
        kotakbaz.rain.client.listener.listeners.b.d[0x2589 ^ 0x24F6] = 0x6F1B ^ 0x24F6;
        kotakbaz.rain.client.listener.listeners.b.d[0xA62D ^ 0xA633] = 0xA62A ^ 0xA633;
        kotakbaz.rain.client.listener.listeners.b.d[0x4A50 ^ 0x4B37] = 0xFFFF1937 ^ 0x4B37;
        kotakbaz.rain.client.listener.listeners.b.d[0x4553 ^ 0x459B] = 0xFFFFBA70 ^ 0x459B;
        kotakbaz.rain.client.listener.listeners.b.d[0xA78C ^ 0xA693] = 0x5944 ^ 0xA693;
        kotakbaz.rain.client.listener.listeners.b.d[0x5C84 ^ 0x5DF1] = 0x97FF ^ 0x5DF1;
        kotakbaz.rain.client.listener.listeners.b.d[0x61DF ^ 0x60AF] = 0x3E8D ^ 0x60AF;
        kotakbaz.rain.client.listener.listeners.b.d[0x350 ^ 0x3B4] = 0x3AD ^ 0x3B4;
        kotakbaz.rain.client.listener.listeners.b.d[0x24D5 ^ 0x2474] = 0x21B4 ^ 0x2474;
        kotakbaz.rain.client.listener.listeners.b.d[0x8353 ^ 0x8389] = 0x83AF ^ 0x8389;
        kotakbaz.rain.client.listener.listeners.b.d[0x3F12 ^ 0x3F4E] = 0x3F7C ^ 0x3F4E;
    }
}

