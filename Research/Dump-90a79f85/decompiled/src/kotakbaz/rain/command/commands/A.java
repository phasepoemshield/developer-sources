/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  net.minecraft.class_156
 *  net.minecraft.class_637
 */
package kotakbaz.rain.command.commands;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.command.b;
import kotakbaz.rain.config.a_0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.minecraft.class_156;
import net.minecraft.class_637;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016\u00a2\u0006\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2={"Lkotakbaz/rain/command/commands/ConfigCommand;", "Lkotakbaz/rain/command/Command;", "<init>", "()V", "Lcom/mojang/brigadier/builder/LiteralArgumentBuilder;", "Lnet/minecraft/class_637;", "builder", "", "execute", "(Lcom/mojang/brigadier/builder/LiteralArgumentBuilder;)V", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nConfigCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigCommand.kt\nkotakbaz/rain/command/commands/ConfigCommand\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n1915#2,2:97\n1915#2,2:99\n*S KotlinDebug\n*F\n+ 1 ConfigCommand.kt\nkotakbaz/rain/command/commands/ConfigCommand\n*L\n50#1:97,2\n71#1:99,2\n*E\n"})
public final class A
extends b {
    @NotNull
    public static final A INSTANCE;
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    private A() {
        int n = C[0];
        n += C[1];
        super((String)a[n ^= C[2]]);
    }

    @Override
    public void execute(@NotNull LiteralArgumentBuilder<class_637> literalArgumentBuilder) {
        int n = C[3];
        n -= C[4];
        Intrinsics.checkNotNullParameter(literalArgumentBuilder, (String)a[n += C[5]]);
        literalArgumentBuilder.executes(A::execute$lambda$0);
        int n2 = C[6];
        n2 += C[7];
        literalArgumentBuilder.then(kotakbaz.rain.command.b.N.literal((String)a[n2 -= C[8]]).executes(A::execute$lambda$1));
        int n3 = C[9];
        n3 ^= C[10];
        LiteralArgumentBuilder literalArgumentBuilder2 = kotakbaz.rain.command.b.N.literal((String)a[n3 -= C[11]]);
        int n4 = C[12];
        n4 += C[13];
        String string = (String)a[n4 -= C[14]];
        StringArgumentType stringArgumentType = StringArgumentType.word();
        int n5 = C[15];
        n5 ^= C[16];
        Intrinsics.checkNotNullExpressionValue(stringArgumentType, (String)a[n5 -= C[17]]);
        literalArgumentBuilder.then(literalArgumentBuilder2.then(kotakbaz.rain.command.b.N.argument(string, (ArgumentType)stringArgumentType).executes(A::execute$lambda$2)));
        int n6 = C[18];
        n6 -= C[19];
        LiteralArgumentBuilder literalArgumentBuilder3 = kotakbaz.rain.command.b.N.literal((String)a[n6 ^= C[20]]);
        int n7 = C[21];
        n7 += C[22];
        String string2 = (String)a[n7 += C[23]];
        StringArgumentType stringArgumentType2 = StringArgumentType.word();
        int n8 = C[24];
        n8 -= C[25];
        Intrinsics.checkNotNullExpressionValue(stringArgumentType2, (String)a[n8 += C[26]]);
        literalArgumentBuilder.then(literalArgumentBuilder3.then(kotakbaz.rain.command.b.N.argument(string2, (ArgumentType)stringArgumentType2).suggests(A::execute$lambda$3).executes(A::execute$lambda$4)));
        int n9 = C[27];
        n9 -= C[28];
        LiteralArgumentBuilder literalArgumentBuilder4 = kotakbaz.rain.command.b.N.literal((String)a[n9 -= C[29]]);
        int n10 = C[30];
        n10 ^= C[31];
        String string3 = (String)a[n10 ^= C[32]];
        StringArgumentType stringArgumentType3 = StringArgumentType.word();
        int n11 = C[33];
        n11 -= C[34];
        Intrinsics.checkNotNullExpressionValue(stringArgumentType3, (String)a[n11 += C[35]]);
        literalArgumentBuilder.then(literalArgumentBuilder4.then(kotakbaz.rain.command.b.N.argument(string3, (ArgumentType)stringArgumentType3).suggests(A::execute$lambda$5).executes(A::execute$lambda$6)));
        int n12 = C[36];
        n12 += C[37];
        literalArgumentBuilder.then(kotakbaz.rain.command.b.N.literal((String)a[n12 += C[38]]).executes(A::execute$lambda$7));
    }

    private static final int execute$lambda$0(CommandContext commandContext) {
        int n = C[39];
        n -= C[40];
        int n2 = C[42];
        n2 ^= C[43];
        kotakbaz.rain.command.A.INSTANCE.sendClientMessage((String)a[n -= C[41]] + (String)a[n2 ^= C[44]]);
        return INSTANCE.getSingleSuccess();
    }

    private static final int execute$lambda$1(CommandContext commandContext) {
        String string;
        List<String> list = a_0.INSTANCE.getConfigNames();
        if (list.isEmpty()) {
            int n = C[45];
            n -= C[46];
            int n2 = C[48];
            n2 += C[49];
            int n3 = C[51];
            n3 ^= C[52];
            string = (String)a[n -= C[47]] + (String)a[n2 += C[50]] + (String)a[n3 ^= C[53]];
        } else {
            int n = C[54];
            n -= C[55];
            int n4 = C[57];
            n4 -= C[58];
            int n5 = C[60];
            n5 += C[61];
            String string2 = CollectionsKt.joinToString$default(list, (String)a[n ^= C[56]], null, null, n4 ^= C[59], null, null, n5 += C[62], null);
            int n6 = C[63];
            n6 -= C[64];
            string = (String)a[n6 += C[65]] + string2;
        }
        kotakbaz.rain.command.A.INSTANCE.sendClientMessage(string);
        return INSTANCE.getSingleSuccess();
    }

    private static final int execute$lambda$2(CommandContext commandContext) {
        int n = C[66];
        n ^= C[67];
        String string = StringArgumentType.getString((CommandContext)commandContext, (String)((String)a[n += C[68]]));
        Intrinsics.checkNotNull(string);
        if (!a_0.INSTANCE.isValidName(string)) {
            int n2 = C[69];
            n2 -= C[70];
            int n3 = C[72];
            n3 -= C[73];
            kotakbaz.rain.command.A.INSTANCE.sendClientMessage((String)a[n2 ^= C[71]] + (String)a[n3 += C[74]]);
        } else if (!a_0.INSTANCE.save(string)) {
            String string2 = string;
            int n4 = C[75];
            n4 ^= C[76];
            int n5 = C[78];
            n5 -= C[79];
            kotakbaz.rain.command.A.INSTANCE.sendClientMessage((String)a[n4 += C[77]] + (String)a[n5 ^= C[80]] + string2);
        }
        return INSTANCE.getSingleSuccess();
    }

    private static final CompletableFuture execute$lambda$3(CommandContext commandContext, SuggestionsBuilder suggestionsBuilder) {
        long l = 4464222026337407432L;
        Iterable iterable = a_0.INSTANCE.getConfigNames();
        Intrinsics.checkNotNull(suggestionsBuilder);
        SuggestionsBuilder suggestionsBuilder2 = suggestionsBuilder;
        long l2 = l;
        int n = C[81];
        n ^= C[82];
        l = l2 ^ (0L ^ l2) & -1L << (n ^= C[83]);
        for (Object t2 : iterable) {
            String string = (String)t2;
            long l3 = l;
            int n2 = C[84];
            n2 += C[85];
            l = l3 ^ (0L ^ l3) & -1L >>> (n2 += C[86]);
            suggestionsBuilder2.suggest(string);
        }
        return suggestionsBuilder.buildFuture();
    }

    private static final int execute$lambda$4(CommandContext commandContext) {
        int n = C[87];
        n += C[88];
        String string = StringArgumentType.getString((CommandContext)commandContext, (String)((String)a[n -= C[89]]));
        Intrinsics.checkNotNull(string);
        if (!a_0.INSTANCE.isValidName(string)) {
            int n2 = C[90];
            n2 ^= C[91];
            int n3 = C[93];
            n3 -= C[94];
            kotakbaz.rain.command.A.INSTANCE.sendClientMessage((String)a[n2 ^= C[92]] + (String)a[n3 += C[95]]);
        } else if (!a_0.INSTANCE.load(string)) {
            String string2 = string;
            int n4 = C[96];
            n4 -= C[97];
            int n5 = C[99];
            n5 ^= C[100];
            kotakbaz.rain.command.A.INSTANCE.sendClientMessage((String)a[n4 ^= C[98]] + (String)a[n5 -= C[101]] + string2);
        }
        return INSTANCE.getSingleSuccess();
    }

    private static final CompletableFuture execute$lambda$5(CommandContext commandContext, SuggestionsBuilder suggestionsBuilder) {
        long l = -3124078559033886946L;
        Iterable iterable = a_0.INSTANCE.getConfigNames();
        Intrinsics.checkNotNull(suggestionsBuilder);
        SuggestionsBuilder suggestionsBuilder2 = suggestionsBuilder;
        long l2 = l;
        int n = C[102];
        n ^= C[103];
        l = l2 ^ (0L ^ l2) & -1L << (n -= C[104]);
        for (Object t2 : iterable) {
            String string = (String)t2;
            long l3 = l;
            int n2 = C[105];
            n2 -= C[106];
            l = l3 ^ (0L ^ l3) & -1L >>> (n2 += C[107]);
            suggestionsBuilder2.suggest(string);
        }
        return suggestionsBuilder.buildFuture();
    }

    private static final int execute$lambda$6(CommandContext commandContext) {
        int n = C[108];
        n ^= C[109];
        String string = StringArgumentType.getString((CommandContext)commandContext, (String)((String)a[n -= C[110]]));
        Intrinsics.checkNotNull(string);
        if (!a_0.INSTANCE.isValidName(string)) {
            int n2 = C[111];
            n2 ^= C[112];
            int n3 = C[114];
            n3 ^= C[115];
            kotakbaz.rain.command.A.INSTANCE.sendClientMessage((String)a[n2 += C[113]] + (String)a[n3 -= C[116]]);
        } else if (!a_0.INSTANCE.remove(string)) {
            String string2 = string;
            int n4 = C[117];
            n4 += C[118];
            int n5 = C[120];
            n5 += C[121];
            kotakbaz.rain.command.A.INSTANCE.sendClientMessage((String)a[n4 ^= C[119]] + (String)a[n5 -= C[122]] + string2);
        }
        return INSTANCE.getSingleSuccess();
    }

    private static final int execute$lambda$7(CommandContext commandContext) {
        class_156.method_668().method_672(a_0.INSTANCE.getConfigPath().toFile());
        return INSTANCE.getSingleSuccess();
    }

    static {
        kotakbaz.rain.command.commands.A.b();
        long l = 5135187758025268486L;
        long l2 = 1887602507377092128L;
        long l3 = -3732550150373634272L;
        long l4 = -6994544662531924074L;
        long l5 = -1697149111862573532L;
        long l6 = 9090526001518113570L;
        long l7 = 8726288389191880689L;
        long l8 = -3269714384413077873L;
        long l9 = 1809222124361665582L;
        long l10 = -1021159809249922339L;
        long l11 = -8059281286802949762L;
        long l12 = 4334160965590640285L;
        long l13 = -8065143352507850255L;
        long l14 = -4416114401913587329L;
        int n = C[123];
        n += C[124];
        a = new Object[n += C[125]];
        long l15 = l14;
        int n2 = C[126];
        n2 -= C[127];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 ^= C[128]);
        Object[] objectArray = new Object[C[129]];
        objectArray[kotakbaz.rain.command.commands.A.C[130]] = A;
        objectArray[kotakbaz.rain.command.commands.A.C[131]] = C[132];
        int n3 = C[133];
        Object object = kotakbaz.rain.command.commands.A.A()[C[134]];
        if (object == null) {
            char[] cArray = "\u623c\u68a0\u68a7\u624e\u6272\u6235\u68a0\u623a\u623c\u6898\u6268\u623e\u68a0\u6253\u689c\u624d\u6238\u624f\u6236\u6247\u6252\u689d\u68b2\u6242\u6243\u6272\u68b0\u68b1\u6253\u68a1\u6235\u68a0\u6252\u626d\u6268\u689a\u624f\u6235\u6273\u68a1\u6271\u68a1\u6242\u6250\u626e\u6236\u6268\u68b1\u6239\u6252\u6234\u6234\u6237\u623f\u6248\u6270\u6240\u623d\u6247\u6875\u6899\u6243\u6253\u68a3\u6877\u6248\u623c\u68a7\u6243\u623a\u68b3\u68b1\u6876\u6252\u623d\u6234\u68b2\u6270\u6895\u689d\u626c\u6270\u623b\u6877\u623d\u68ae\u626f\u623d\u689b\u6273\u6243\u623e\u68a3\u626c\u6270\u6898\u6235\u624c\u689b\u624f\u626d\u6897\u626f\u68a2\u6273\u624c\u623f\u626e\u6895\u68ae\u68a2\u6879\u6876\u626c\u624d\u6876\u68ae\u68a2\u689f\u68b3\u68ad\u6240\u68ac\u68ac\u624f\u68ad\u6243\u6247\u623d\u689f\u6240\u624d\u623c\u6268\u6242\u6895\u68a2\u6252\u6248\u623c\u6273\u623f\u68b3\u6273\u6877\u6239\u6268\u68b1\u6236\u68a0\u6234\u6876\u68af\u68ae\u6270\u6248\u6239\u68a1\u689b\u6895\u624d\u626c\u6239\u68ae\u68b2\u6237\u6248\u68a1\u6879\u623c\u6242\u6239\u689d\u6237\u6273\u6251\u68a7\u6897\u6897\u623a\u6895\u6241\u6894\u68ac\u689b\u689f\u68a1\u623d\u689b\u6271\u626c\u68a2\u689d\u6248\u68b0\u626d\u689e\u623e\u623f\u68a1\u6879\u6876\u626c\u6248\u6236\u6876\u68a1\u6272\u68b2\u6235\u6271\u689d\u6273\u6240\u68ac\u624f\u623c\u626e\u68af\u6895\u624d\u6895\u6270\u623d\u68b1\u689a\u6896\u624e\u68a7\u6875\u623f\u626d\u6897\u6240\u68b0\u68ae\u623e\u6243\u6239\u6899\u68a7\u68b3\u623c\u6237\u626e\u6241\u623b\u6239\u626f\u6251\u6270\u689d\u6271\u6879\u68b2\u6876\u6268\u623b\u6875\u6273\u6898\u624e\u626c\u6239\u6253\u689e\u68a1\u624c\u6251\u623a\u6271\u689c\u68a0\u6239\u68b0\u623a\u6239\u6248\u6895\u6879\u689a\u6271\u68ac\u623f\u6247\u6877\u6268\u6270\u6250\u6895\u6896\u6236\u68a3\u6247\u6237\u6875\u689c\u6270\u68af\u626e\u623f\u689e\u6238\u6234\u689f\u689c\u6877\u6895\u6899\u68ac\u623c\u68a1\u689d\u6235\u6894\u6272\u689d\u6242\u6899\u6239\u6895\u68a0\u623a\u626e\u6877\u6240\u626d\u6251\u689b\u68a1\u6236\u6247\u6240\u626f\u68a1\u68a2\u623a\u68b0\u6237\u6250\u6250\u6234\u6253\u6239\u6239\u6879\u624c\u68b1\u68b1\u6241\u6896\u626c\u626d\u6270\u626f\u626d\u68a1\u6896\u626c\u6253\u6250\u68ae\u6899\u623d\u6239\u689b\u6270\u623b\u68ad\u626c\u6238\u68ad\u626d\u6895\u624f\u689f\u68ae\u6895\u68b0\u68ad\u6875\u623b\u626c\u623c\u6251\u626c\u689f\u68b1\u6898\u623b\u689e\u6899\u68ac\u68ac\u624e\u6239\u68b2\u6877\u6875\u626f\u623a\u689a\u68ac\u624e\u6238\u623e\u6898\u689d\u6251\u6241\u68ad\u6272\u6236\u68ad\u68a1\u6895\u6253\u68af\u6234\u6253\u623f\u626e\u6271\u6240\u623b\u624f\u6247\u6241\u6875\u68ad\u6235\u623b\u6270\u626d\u6876\u6240\u623f\u68a3\u626c\u689a\u6899\u6253\u6250\u623d\u6234\u6239\u624e\u6894\u623c\u68a1\u6875\u68ae\u623b\u689c\u68ac\u6268\u624d\u6876\u623e\u624f\u6272\u68b0\u68a0\u6894\u623d\u6875\u623d\u6248\u68a3\u6253\u623f\u689d\u68b3\u6271\u6236\u623c\u626d\u6875\u623a\u624e\u68ae\u689a\u689c\u6253\u6238\u624c\u6252\u624d\u68a2\u6270\u68b0\u6268\u689b\u6253\u626d\u6875\u6899\u68ae\u624f\u6250\u6237\u6898\u624d\u624d\u68ad\u6896\u6237\u6234\u626e\u6250\u626d\u689d".toCharArray();
            for (int i = C[135]; i < C[136]; ++i) {
                int n4 = cArray[i];
                n4 -= C[137];
                n4 ^= C[138];
                n4 ^= C[139];
                n4 -= C[140];
                n4 += C[141];
                n4 += C[142];
                n4 -= C[143];
                n4 ^= C[144];
                n4 ^= C[145];
                n4 ^= C[146];
                cArray[i] = (char)(n4 -= C[147]);
            }
            object = kotakbaz.rain.command.commands.A.A()[kotakbaz.rain.command.commands.A.C[148]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.command.commands.A.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = C[149];
        n5 ^= C[150];
        l5 = l16 ^ (0x16900000000L ^ l16) & -1L << (n5 -= C[151]);
        long l17 = l12;
        int n6 = C[152];
        n6 += C[153];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 -= C[154]);
        while (true) {
            int n7 = C[155];
            n7 ^= C[156];
            if ((int)l12 >= (int)(l5 >>> (n7 ^= C[157]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = C[158];
            n9 -= C[159];
            int n10 = C[161];
            n10 += C[162];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 ^= C[160])) & -1L >>> (n10 += C[163]);
            long l19 = l8;
            int n11 = C[164];
            n11 ^= C[165];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 ^= C[166]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = C[167];
            n13 ^= C[168];
            int n14 = C[170];
            n14 -= C[171];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 += C[169])) & -1L >>> (n14 ^= C[172]);
            int n15 = C[173];
            n15 ^= C[174];
            long l21 = l9;
            int n16 = C[176];
            n16 -= C[177];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= C[175]) ^ l21) & -1L << (n16 += C[178]);
            int n17 = C[179];
            n17 += C[180];
            n17 -= C[181];
            int n18 = C[182];
            n18 ^= C[183];
            long l22 = l11;
            int n19 = C[185];
            n19 ^= C[186];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 -= C[184]))) ^ l22) & -1L >>> (n19 ^= C[187]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = C[188];
            n20 += C[189];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 += C[190]);
            while (true) {
                int n21 = C[191];
                n21 -= C[192];
                if ((int)(l13 >>> (n21 ^= C[193])) >= (int)l11) break;
                int n22 = C[194];
                n22 -= C[195];
                int n23 = C[197];
                n23 -= C[198];
                cArray2[(int)(l13 >>> (n22 += kotakbaz.rain.command.commands.A.C[196]))] = cArray[(int)l12 + (int)(l13 >>> (n23 += C[199]))];
                l13 += 0x100000000L;
            }
            int n24 = C[200];
            n24 ^= C[201];
            int n25 = (int)(l14 >>> (n24 -= C[202]));
            l14 += 0x100000000L;
            kotakbaz.rain.command.commands.A.a[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = C[203];
            n26 += C[204];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 ^= C[205]);
        }
        INSTANCE = new A();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[C[206]];
        String string = (String)object[C[207]];
        object = object[C[208]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[209]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[210]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[212] ^ C[213]];
                byArray[kotakbaz.rain.command.commands.A.C[214] ^ kotakbaz.rain.command.commands.A.C[215]] = C[216] ^ C[217];
                byArray[kotakbaz.rain.command.commands.A.C[218] ^ kotakbaz.rain.command.commands.A.C[219]] = C[220] ^ C[221];
                byArray[kotakbaz.rain.command.commands.A.C[222] ^ kotakbaz.rain.command.commands.A.C[223]] = C[224] ^ C[225];
                byArray[kotakbaz.rain.command.commands.A.C[226] ^ kotakbaz.rain.command.commands.A.C[227]] = C[228] ^ C[229];
                byArray[kotakbaz.rain.command.commands.A.C[230] ^ kotakbaz.rain.command.commands.A.C[231]] = C[232] ^ C[233];
                byArray[kotakbaz.rain.command.commands.A.C[234] ^ kotakbaz.rain.command.commands.A.C[235]] = C[236] ^ C[237];
                byArray[kotakbaz.rain.command.commands.A.C[238] ^ kotakbaz.rain.command.commands.A.C[239]] = C[240] ^ C[241];
                byArray[kotakbaz.rain.command.commands.A.C[242] ^ kotakbaz.rain.command.commands.A.C[243]] = C[244] ^ C[245];
                byArray[kotakbaz.rain.command.commands.A.C[246] ^ kotakbaz.rain.command.commands.A.C[247]] = C[248] ^ C[249];
                byArray[kotakbaz.rain.command.commands.A.C[250] ^ kotakbaz.rain.command.commands.A.C[251]] = C[252] ^ C[253];
                byArray[kotakbaz.rain.command.commands.A.C[254] ^ kotakbaz.rain.command.commands.A.C[255]] = C[256] ^ C[257];
                byArray[kotakbaz.rain.command.commands.A.C[258] ^ kotakbaz.rain.command.commands.A.C[259]] = C[260] ^ C[261];
                byArray[kotakbaz.rain.command.commands.A.C[262] ^ kotakbaz.rain.command.commands.A.C[263]] = C[264] ^ C[265];
                byArray[kotakbaz.rain.command.commands.A.C[266] ^ kotakbaz.rain.command.commands.A.C[267]] = C[268] ^ C[269];
                byArray[kotakbaz.rain.command.commands.A.C[270] ^ kotakbaz.rain.command.commands.A.C[271]] = C[272] ^ C[273];
                byArray[kotakbaz.rain.command.commands.A.C[274] ^ kotakbaz.rain.command.commands.A.C[275]] = C[276] ^ C[277];
                objectArray2[kotakbaz.rain.command.commands.A.C[211]] = byArray;
            }
            byte[] byArray = (byte[])object3[C[278]];
            if (b == null) {
                byte[] byArray2 = new byte[C[279] ^ C[280]];
                byArray2[kotakbaz.rain.command.commands.A.C[281] ^ kotakbaz.rain.command.commands.A.C[282]] = C[283] ^ C[284];
                byArray2[kotakbaz.rain.command.commands.A.C[285] ^ kotakbaz.rain.command.commands.A.C[286]] = C[287] ^ C[288];
                byArray2[kotakbaz.rain.command.commands.A.C[289] ^ kotakbaz.rain.command.commands.A.C[290]] = C[291] ^ C[292];
                byArray2[kotakbaz.rain.command.commands.A.C[293] ^ kotakbaz.rain.command.commands.A.C[294]] = C[295] ^ C[296];
                byArray2[kotakbaz.rain.command.commands.A.C[297] ^ kotakbaz.rain.command.commands.A.C[298]] = C[299] ^ C[300];
                byArray2[kotakbaz.rain.command.commands.A.C[301] ^ kotakbaz.rain.command.commands.A.C[302]] = C[303] ^ C[304];
                byArray2[kotakbaz.rain.command.commands.A.C[305] ^ kotakbaz.rain.command.commands.A.C[306]] = C[307] ^ C[308];
                byArray2[kotakbaz.rain.command.commands.A.C[309] ^ kotakbaz.rain.command.commands.A.C[310]] = C[311] ^ C[312];
                byArray2[kotakbaz.rain.command.commands.A.C[313] ^ kotakbaz.rain.command.commands.A.C[314]] = C[315] ^ C[316];
                byArray2[kotakbaz.rain.command.commands.A.C[317] ^ kotakbaz.rain.command.commands.A.C[318]] = C[319] ^ C[320];
                byArray2[kotakbaz.rain.command.commands.A.C[321] ^ kotakbaz.rain.command.commands.A.C[322]] = C[323] ^ C[324];
                byArray2[kotakbaz.rain.command.commands.A.C[325] ^ kotakbaz.rain.command.commands.A.C[326]] = C[327] ^ C[328];
                byArray2[kotakbaz.rain.command.commands.A.C[329] ^ kotakbaz.rain.command.commands.A.C[330]] = C[331] ^ C[332];
                byArray2[kotakbaz.rain.command.commands.A.C[333] ^ kotakbaz.rain.command.commands.A.C[334]] = C[335] ^ C[336];
                byArray2[kotakbaz.rain.command.commands.A.C[337] ^ kotakbaz.rain.command.commands.A.C[338]] = C[339] ^ C[340];
                byArray2[kotakbaz.rain.command.commands.A.C[341] ^ kotakbaz.rain.command.commands.A.C[342]] = C[343] ^ C[344];
                byArray2[kotakbaz.rain.command.commands.A.C[345] ^ kotakbaz.rain.command.commands.A.C[346]] = C[347] ^ C[348];
                byArray2[kotakbaz.rain.command.commands.A.C[349] ^ kotakbaz.rain.command.commands.A.C[350]] = C[351] ^ C[352];
                byArray2[kotakbaz.rain.command.commands.A.C[353] ^ kotakbaz.rain.command.commands.A.C[354]] = C[355] ^ C[356];
                byArray2[kotakbaz.rain.command.commands.A.C[357] ^ kotakbaz.rain.command.commands.A.C[358]] = C[359] ^ C[360];
                byArray2[kotakbaz.rain.command.commands.A.C[361] ^ kotakbaz.rain.command.commands.A.C[362]] = C[363] ^ C[364];
                byArray2[kotakbaz.rain.command.commands.A.C[365] ^ kotakbaz.rain.command.commands.A.C[366]] = C[367] ^ C[368];
                byArray2[kotakbaz.rain.command.commands.A.C[369] ^ kotakbaz.rain.command.commands.A.C[370]] = C[371] ^ C[372];
                byArray2[kotakbaz.rain.command.commands.A.C[373] ^ kotakbaz.rain.command.commands.A.C[374]] = C[375] ^ C[376];
                byArray2[kotakbaz.rain.command.commands.A.C[377] ^ kotakbaz.rain.command.commands.A.C[378]] = C[379] ^ C[380];
                byArray2[kotakbaz.rain.command.commands.A.C[381] ^ kotakbaz.rain.command.commands.A.C[382]] = C[383] ^ C[384];
                byArray2[kotakbaz.rain.command.commands.A.C[385] ^ kotakbaz.rain.command.commands.A.C[386]] = C[387] ^ C[388];
                byArray2[kotakbaz.rain.command.commands.A.C[389] ^ kotakbaz.rain.command.commands.A.C[390]] = C[391] ^ C[392];
                byArray2[kotakbaz.rain.command.commands.A.C[393] ^ kotakbaz.rain.command.commands.A.C[394]] = C[395] ^ C[396];
                byArray2[kotakbaz.rain.command.commands.A.C[397] ^ kotakbaz.rain.command.commands.A.C[398]] = C[399] ^ 0x4A68;
                byArray2[0x99B8 ^ 0x99A7] = 0x99A0 ^ 0x99A7;
                byArray2[0x5BE0 ^ 0x5BFA] = 0xFFFFA413 ^ 0x5BFA;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.command.commands.A.A()[1];
                if (object4 == null) {
                    char[] cArray = "\uf1b6\uf1b8\uf1b3\uf1ba\uf1bc\uf148\uf1af\uf191\uf18a\uf19e\uf1be\uf195\uf199\uf19b\uf1ab\uf1be\uf1b9\uf149".toCharArray();
                    for (int i = 0; i < 18; ++i) {
                        int n2 = cArray[i];
                        n2 ^= 0xF542;
                        n2 ^= 0x89A4;
                        n2 += 17509;
                        n2 += 35525;
                        n2 += 62343;
                        n2 += 57944;
                        n2 -= 50681;
                        n2 += 35914;
                        n2 -= 1211;
                        n2 -= 36684;
                        n2 += 34540;
                        cArray[i] = (char)(n2 ^= 0xEBDF);
                    }
                    object4 = kotakbaz.rain.command.commands.A.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[3] = -43;
                byArray4[10] = 76;
                byArray4[9] = 67;
                byArray4[15] = 3;
                byArray4[0] = -43;
                byArray4[12] = -19;
                byArray4[4] = 96;
                byArray4[11] = -45;
                byArray4[1] = -18;
                byArray4[5] = 3;
                byArray4[13] = -105;
                byArray4[2] = 16;
                byArray4[14] = 97;
                byArray4[8] = 81;
                byArray4[7] = -47;
                byArray4[6] = 81;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 25, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.command.commands.A.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u504c\u5050\u506a".toCharArray();
                    for (int i = 0; i < 3; ++i) {
                        int n3 = cArray[i];
                        n3 += 42564;
                        n3 += 36393;
                        n3 ^= 0x308B;
                        n3 -= 28267;
                        n3 ^= 0x282D;
                        n3 ^= 0x13CE;
                        n3 ^= 0x1F55;
                        n3 ^= 0x57D5;
                        n3 ^= 0x6BF6;
                        n3 -= 24472;
                        n3 ^= 0xE979;
                        n3 += 23193;
                        cArray[i] = (char)(n3 ^= 0x6F1D);
                    }
                    object5 = kotakbaz.rain.command.commands.A.A()[2] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.command.commands.A.A()[3];
            if (object6 == null) {
                char[] cArray = "\u96ac\u96b0\uac8a\u9696\u96ba\u96ab\u96ba\u9696\uacb5\u96e2\u96ba\uac8a\u96a0\uacb5\u96cc\u96d9\u96d9\u96d4\u96a7\u96ce".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 -= 17504;
                    n4 += 37761;
                    n4 -= 63617;
                    n4 -= 27267;
                    n4 ^= 0xEDE5;
                    n4 -= 40358;
                    n4 -= 12489;
                    n4 += 28906;
                    n4 ^= 0x7EAB;
                    n4 ^= 0x706F;
                    n4 += 7055;
                    n4 ^= 0x12F1;
                    n4 -= 46963;
                    n4 ^= 0x8B53;
                    n4 += 23002;
                    cArray[i] = (char)(n4 -= 21852);
                }
                object6 = kotakbaz.rain.command.commands.A.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)b), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = c;
        if (c == null) {
            c = new Object[4];
            objectArray = c;
        }
        return objectArray;
    }

    public static void b() {
        C = new int[0x23E9 ^ 0x2279];
        kotakbaz.rain.command.commands.A.C[0x9178 ^ 0x910A] = 0x914B ^ 0x910A;
        kotakbaz.rain.command.commands.A.C[0xCBD4 ^ 0xCA96] = 0x19F2 ^ 0xCA96;
        kotakbaz.rain.command.commands.A.C[0x2BA2 ^ 0x2A81] = 0xFFFEDCE6 ^ 0x2A81;
        kotakbaz.rain.command.commands.A.C[0xDAD8 ^ 0xDAE4] = 0xDAEA ^ 0xDAE4;
        kotakbaz.rain.command.commands.A.C[0x72D4 ^ 0x7230] = 0xFFFF32C0 ^ 0x7230;
        kotakbaz.rain.command.commands.A.C[0x17EA ^ 0x177B] = 0x1B76 ^ 0x177B;
        kotakbaz.rain.command.commands.A.C[0xE541 ^ 0xE419] = 0x1EC2F ^ 0xE419;
        kotakbaz.rain.command.commands.A.C[0xE216 ^ 0xE2E5] = 0x43FF ^ 0xE2E5;
        kotakbaz.rain.command.commands.A.C[0x11E6 ^ 0x11F8] = 0x1187 ^ 0x11F8;
        kotakbaz.rain.command.commands.A.C[0xEA6 ^ 0xFC3] = 0x53BD ^ 0xFC3;
        kotakbaz.rain.command.commands.A.C[0xD4D6 ^ 0xD479] = 0xFFFF2BE2 ^ 0xD479;
        kotakbaz.rain.command.commands.A.C[0xCD06 ^ 0xCD27] = 0xFFFF32D9 ^ 0xCD27;
        kotakbaz.rain.command.commands.A.C[0x1DCE ^ 0x1C44] = 0xE051 ^ 0x1C44;
        kotakbaz.rain.command.commands.A.C[0x6DE1 ^ 0x6C95] = 0x1073 ^ 0x6C95;
        kotakbaz.rain.command.commands.A.C[0xE5C9 ^ 0xE522] = 0x2C35 ^ 0xE522;
        kotakbaz.rain.command.commands.A.C[0xE376 ^ 0xE22D] = 0xF201 ^ 0xE22D;
        kotakbaz.rain.command.commands.A.C[0xDEA8 ^ 0xDE23] = 0x19A6 ^ 0xDE23;
        kotakbaz.rain.command.commands.A.C[0xA295 ^ 0xA3D0] = 0x4436 ^ 0xA3D0;
        kotakbaz.rain.command.commands.A.C[0x8AA2 ^ 0x8BC3] = 0x8563 ^ 0x8BC3;
        kotakbaz.rain.command.commands.A.C[0x57E1 ^ 0x5699] = 0xC048 ^ 0x5699;
        kotakbaz.rain.command.commands.A.C[0x2393 ^ 0x237F] = 0xFFFF15ED ^ 0x237F;
        kotakbaz.rain.command.commands.A.C[0x3FF ^ 0x2E5] = 0x7890 ^ 0x2E5;
        kotakbaz.rain.command.commands.A.C[0xC0A3 ^ 0xC069] = 0xFFFF3F8F ^ 0xC069;
        kotakbaz.rain.command.commands.A.C[0x3E9B ^ 0x3E8B] = 0xFFFFC13E ^ 0x3E8B;
        kotakbaz.rain.command.commands.A.C[0xC770 ^ 0xC771] = 0xFFFF38BF ^ 0xC771;
        kotakbaz.rain.command.commands.A.C[0xB6A5 ^ 0xB670] = 0x96A6 ^ 0xB670;
        kotakbaz.rain.command.commands.A.C[0x1C46 ^ 0x1C10] = 0xFFFFE3D8 ^ 0x1C10;
        kotakbaz.rain.command.commands.A.C[0xBC73 ^ 0xBD15] = 0xE17A ^ 0xBD15;
        kotakbaz.rain.command.commands.A.C[0xE970 ^ 0xE830] = 0x8BAC ^ 0xE830;
        kotakbaz.rain.command.commands.A.C[0x8109 ^ 0x8157] = 0x8133 ^ 0x8157;
        kotakbaz.rain.command.commands.A.C[0xC3A3 ^ 0xC327] = 0xC327 ^ 0xC327;
        kotakbaz.rain.command.commands.A.C[0x10435 ^ 0x104C2] = 0x18EEA ^ 0x104C2;
        kotakbaz.rain.command.commands.A.C[0x2D0D ^ 0x2C5D] = 0xE033 ^ 0x2C5D;
        kotakbaz.rain.command.commands.A.C[0x8805 ^ 0x8901] = 0xB487 ^ 0x8901;
        kotakbaz.rain.command.commands.A.C[0x1278 ^ 0x12A9] = 0x12A8 ^ 0x12A9;
        kotakbaz.rain.command.commands.A.C[0x30B1 ^ 0x3021] = 0x4E5C ^ 0x3021;
        kotakbaz.rain.command.commands.A.C[0x8D1A ^ 0x8D93] = 0x3D57 ^ 0x8D93;
        kotakbaz.rain.command.commands.A.C[0x35E5 ^ 0x35B5] = 0xFFFFCA6D ^ 0x35B5;
        kotakbaz.rain.command.commands.A.C[0x6305 ^ 0x6216] = 0x1909 ^ 0x6216;
        kotakbaz.rain.command.commands.A.C[0x801E ^ 0x8066] = 0x80C9 ^ 0x8066;
        kotakbaz.rain.command.commands.A.C[0x73AC ^ 0x73D3] = 0xFFFF8C75 ^ 0x73D3;
        kotakbaz.rain.command.commands.A.C[0xF053 ^ 0xF050] = 0xFFFF0F95 ^ 0xF050;
        kotakbaz.rain.command.commands.A.C[0x5895 ^ 0x598E] = 0xFFFFDC61 ^ 0x598E;
        kotakbaz.rain.command.commands.A.C[0x9773 ^ 0x96F8] = 0x6A8C ^ 0x96F8;
        kotakbaz.rain.command.commands.A.C[0xD909 ^ 0xD838] = 0x1475 ^ 0xD838;
        kotakbaz.rain.command.commands.A.C[0xEB04 ^ 0xEA4F] = 0x4326 ^ 0xEA4F;
        kotakbaz.rain.command.commands.A.C[0xE540 ^ 0xE448] = 0xFFFFA6AB ^ 0xE448;
        kotakbaz.rain.command.commands.A.C[0x9838 ^ 0x989D] = 0xFFFF6767 ^ 0x989D;
        kotakbaz.rain.command.commands.A.C[0xD992 ^ 0xD9CD] = 0xD9B7 ^ 0xD9CD;
        kotakbaz.rain.command.commands.A.C[0x1447 ^ 0x15CA] = 0x5FA1 ^ 0x15CA;
        kotakbaz.rain.command.commands.A.C[0xC466 ^ 0xC43C] = 0xFFFF3B88 ^ 0xC43C;
        kotakbaz.rain.command.commands.A.C[0x45B1 ^ 0x45F1] = 0xFFFFBA4D ^ 0x45F1;
        kotakbaz.rain.command.commands.A.C[0x3E17 ^ 0x3F99] = 0x75F1 ^ 0x3F99;
        kotakbaz.rain.command.commands.A.C[0xCDB4 ^ 0xCD7A] = 0xCD7B ^ 0xCD7A;
        kotakbaz.rain.command.commands.A.C[0x3459 ^ 0x3483] = 0xBD6A ^ 0x3483;
        kotakbaz.rain.command.commands.A.C[0x31AB ^ 0x30E7] = 0x99A5 ^ 0x30E7;
        kotakbaz.rain.command.commands.A.C[0x4E4E ^ 0x4F49] = 0xF222 ^ 0x4F49;
        kotakbaz.rain.command.commands.A.C[0x6FC3 ^ 0x6EDB] = 0xA9C1 ^ 0x6EDB;
        kotakbaz.rain.command.commands.A.C[0xECC6 ^ 0xEC10] = 0x9195 ^ 0xEC10;
        kotakbaz.rain.command.commands.A.C[0xB04 ^ 0xA84] = 0xE4DE ^ 0xA84;
        kotakbaz.rain.command.commands.A.C[0xCA98 ^ 0xCABE] = 0xFFFF350C ^ 0xCABE;
        kotakbaz.rain.command.commands.A.C[0xE0CB ^ 0xE098] = 0xFFFF1F79 ^ 0xE098;
        kotakbaz.rain.command.commands.A.C[0x5CEA ^ 0x5C62] = 0x5E62 ^ 0x5C62;
        kotakbaz.rain.command.commands.A.C[0x3E49 ^ 0x3E71] = 0xFFFFC1F4 ^ 0x3E71;
        kotakbaz.rain.command.commands.A.C[0x28FD ^ 0x298B] = 0xBF5A ^ 0x298B;
        kotakbaz.rain.command.commands.A.C[0x1E41 ^ 0x1F06] = 0xF8F3 ^ 0x1F06;
        kotakbaz.rain.command.commands.A.C[0xBF10 ^ 0xBFDB] = 0xFFFF403A ^ 0xBFDB;
        kotakbaz.rain.command.commands.A.C[0xF692 ^ 0xF7E5] = 0x617E ^ 0xF7E5;
        kotakbaz.rain.command.commands.A.C[0xA393 ^ 0xA315] = 0xA315 ^ 0xA315;
        kotakbaz.rain.command.commands.A.C[0xC46A ^ 0xC4A7] = 0xC4AE ^ 0xC4A7;
        kotakbaz.rain.command.commands.A.C[0x58A3 ^ 0x59D3] = 0x6867 ^ 0x59D3;
        kotakbaz.rain.command.commands.A.C[0xF249 ^ 0xF35B] = 0x884D ^ 0xF35B;
        kotakbaz.rain.command.commands.A.C[0x6E11 ^ 0x6E08] = 0x6E51 ^ 0x6E08;
        kotakbaz.rain.command.commands.A.C[0x6F10 ^ 0x6FF9] = 0xEACA ^ 0x6FF9;
        kotakbaz.rain.command.commands.A.C[0x104D6 ^ 0x105DB] = 0x130F5 ^ 0x105DB;
        kotakbaz.rain.command.commands.A.C[0x19BD ^ 0x19CC] = 0xFFFFE643 ^ 0x19CC;
        kotakbaz.rain.command.commands.A.C[0x1B4E ^ 0x1BD1] = 0xFFFFE428 ^ 0x1BD1;
        kotakbaz.rain.command.commands.A.C[0x5ECD ^ 0x5EE4] = 0x5E93 ^ 0x5EE4;
        kotakbaz.rain.command.commands.A.C[0x6260 ^ 0x6202] = 0x6276 ^ 0x6202;
        kotakbaz.rain.command.commands.A.C[0xA462 ^ 0xA492] = 0xFFFF6871 ^ 0xA492;
        kotakbaz.rain.command.commands.A.C[0xDCBF ^ 0xDCB6] = 0xDCFC ^ 0xDCB6;
        kotakbaz.rain.command.commands.A.C[0x2265 ^ 0x225F] = 0xFFFFDDD2 ^ 0x225F;
        kotakbaz.rain.command.commands.A.C[0x7206 ^ 0x7339] = 0x10DF ^ 0x7339;
        kotakbaz.rain.command.commands.A.C[0xF654 ^ 0xF76E] = 0x4E72 ^ 0xF76E;
        kotakbaz.rain.command.commands.A.C[0xFAA9 ^ 0xFBA9] = 0xBE6D ^ 0xFBA9;
        kotakbaz.rain.command.commands.A.C[0x106EB ^ 0x10619] = 0x1A705 ^ 0x10619;
        kotakbaz.rain.command.commands.A.C[0x30F8 ^ 0x30B1] = 0x30FB ^ 0x30B1;
        kotakbaz.rain.command.commands.A.C[0x41B9 ^ 0x41DF] = 0xFFFFBE6D ^ 0x41DF;
        kotakbaz.rain.command.commands.A.C[0x10BE2 ^ 0x10B3A] = 0x176DE ^ 0x10B3A;
        kotakbaz.rain.command.commands.A.C[0xC539 ^ 0xC420] = 0xBE5E ^ 0xC420;
        kotakbaz.rain.command.commands.A.C[0x9ED3 ^ 0x9E26] = 0x3F3C ^ 0x9E26;
        kotakbaz.rain.command.commands.A.C[0x8DB9 ^ 0x8DB5] = 0xFFFF7278 ^ 0x8DB5;
        kotakbaz.rain.command.commands.A.C[0xE408 ^ 0xE40F] = 0xE47E ^ 0xE40F;
        kotakbaz.rain.command.commands.A.C[0x9B7C ^ 0x9A68] = 0xE157 ^ 0x9A68;
        kotakbaz.rain.command.commands.A.C[0x97AB ^ 0x97EA] = 0xFFFF6813 ^ 0x97EA;
        kotakbaz.rain.command.commands.A.C[0x3530 ^ 0x345E] = 0x5EA ^ 0x345E;
        kotakbaz.rain.command.commands.A.C[0x8F33 ^ 0x8F8F] = 0x8E8A ^ 0x8F8F;
        kotakbaz.rain.command.commands.A.C[0x78C3 ^ 0x78DE] = 0x78A6 ^ 0x78DE;
        kotakbaz.rain.command.commands.A.C[0xACC9 ^ 0xAD8A] = 0xFFFF8136 ^ 0xAD8A;
        kotakbaz.rain.command.commands.A.C[0x60A3 ^ 0x6045] = 0xE576 ^ 0x6045;
        kotakbaz.rain.command.commands.A.C[0xAB69 ^ 0xAB2D] = 0xAB36 ^ 0xAB2D;
        kotakbaz.rain.command.commands.A.C[0x9F2A ^ 0x9F50] = 0x9F39 ^ 0x9F50;
        kotakbaz.rain.command.commands.A.C[0xCAB ^ 0xC29] = 0xC29 ^ 0xC29;
        kotakbaz.rain.command.commands.A.C[0x9533 ^ 0x95F3] = 0x95F9 ^ 0x95F3;
        kotakbaz.rain.command.commands.A.C[0xCC65 ^ 0xCC4F] = 0xFFFF339F ^ 0xCC4F;
        kotakbaz.rain.command.commands.A.C[0x80 ^ 0xAE] = 0xFFFFFF10 ^ 0xAE;
        kotakbaz.rain.command.commands.A.C[0x25B2 ^ 0x2584] = 0xFFFFDA37 ^ 0x2584;
        kotakbaz.rain.command.commands.A.C[0x7F8C ^ 0x7F97] = 0x7E91 ^ 0x7F97;
        kotakbaz.rain.command.commands.A.C[0x557C ^ 0x545A] = 0x1972 ^ 0x545A;
        kotakbaz.rain.command.commands.A.C[0xEE0C ^ 0xEED1] = 0x6739 ^ 0xEED1;
        kotakbaz.rain.command.commands.A.C[0x7BE9 ^ 0x7B50] = 0x7B6A ^ 0x7B50;
        kotakbaz.rain.command.commands.A.C[0x1F9E ^ 0x1F7E] = 0xFFFEE663 ^ 0x1F7E;
        kotakbaz.rain.command.commands.A.C[0x1080D ^ 0x10961] = 0x1BC8F ^ 0x10961;
        kotakbaz.rain.command.commands.A.C[0xB170 ^ 0xB021] = 0x1B12D ^ 0xB021;
        kotakbaz.rain.command.commands.A.C[0x9EAD ^ 0x9E82] = 0xFFFF6126 ^ 0x9E82;
        kotakbaz.rain.command.commands.A.C[0x9B74 ^ 0x9A7E] = 0xAF55 ^ 0x9A7E;
        kotakbaz.rain.command.commands.A.C[0xE267 ^ 0xE2ED] = 0x8569 ^ 0xE2ED;
        kotakbaz.rain.command.commands.A.C[0x2F98 ^ 0x2FDD] = 0xFFFFD040 ^ 0x2FDD;
        kotakbaz.rain.command.commands.A.C[0x1952 ^ 0x1869] = 0xFFFF5EB5 ^ 0x1869;
        kotakbaz.rain.command.commands.A.C[0xC9B ^ 0xC6F] = 0xAD6D ^ 0xC6F;
        kotakbaz.rain.command.commands.A.C[0x18C2 ^ 0x19A8] = 0xAC46 ^ 0x19A8;
        kotakbaz.rain.command.commands.A.C[0x2DC2 ^ 0x2C44] = 0x12517 ^ 0x2C44;
        kotakbaz.rain.command.commands.A.C[0x101D9 ^ 0x101AF] = 0x101EA ^ 0x101AF;
        kotakbaz.rain.command.commands.A.C[0x349 ^ 0x2C0] = 0xFED8 ^ 0x2C0;
        kotakbaz.rain.command.commands.A.C[0x140C ^ 0x14BD] = 0x14E5 ^ 0x14BD;
        kotakbaz.rain.command.commands.A.C[0x383F ^ 0x3954] = 0x8C8F ^ 0x3954;
        kotakbaz.rain.command.commands.A.C[0x9F16 ^ 0x9E22] = 0x5276 ^ 0x9E22;
        kotakbaz.rain.command.commands.A.C[0xFB1D ^ 0xFA34] = 0x1FD38 ^ 0xFA34;
        kotakbaz.rain.command.commands.A.C[0x41C ^ 0x55A] = 0xE2AE ^ 0x55A;
        kotakbaz.rain.command.commands.A.C[0x4056 ^ 0x4091] = 0x4094 ^ 0x4091;
        kotakbaz.rain.command.commands.A.C[0xE7DB ^ 0xE7FB] = 0xFFFF182F ^ 0xE7FB;
        kotakbaz.rain.command.commands.A.C[0x7437 ^ 0x7532] = 0x48BA ^ 0x7532;
        kotakbaz.rain.command.commands.A.C[0xA116 ^ 0xA017] = 0xE59B ^ 0xA017;
        kotakbaz.rain.command.commands.A.C[0xACAD ^ 0xACEB] = 0xFFFF5312 ^ 0xACEB;
        kotakbaz.rain.command.commands.A.C[0x558F ^ 0x54E0] = 0xFFFF9AAF ^ 0x54E0;
        kotakbaz.rain.command.commands.A.C[0xDD15 ^ 0xDD95] = 0xFFFF2210 ^ 0xDD95;
        kotakbaz.rain.command.commands.A.C[0x5B70 ^ 0x5B93] = 0xE480 ^ 0x5B93;
        kotakbaz.rain.command.commands.A.C[0xD0E6 ^ 0xD0BE] = 0xD0BC ^ 0xD0BE;
        kotakbaz.rain.command.commands.A.C[0x3073 ^ 0x307E] = 0x306D ^ 0x307E;
        kotakbaz.rain.command.commands.A.C[0x5839 ^ 0x58BC] = 0x58BE ^ 0x58BC;
        kotakbaz.rain.command.commands.A.C[0x88AD ^ 0x8857] = 0xB88 ^ 0x8857;
        kotakbaz.rain.command.commands.A.C[0x821E ^ 0x82AE] = 0x82C0 ^ 0x82AE;
        kotakbaz.rain.command.commands.A.C[0x10CE3 ^ 0x10DC9] = 0xADB ^ 0x10DC9;
        kotakbaz.rain.command.commands.A.C[0xD695 ^ 0xD7B9] = 0x1D0AB ^ 0xD7B9;
        kotakbaz.rain.command.commands.A.C[0x4BAA ^ 0x4B55] = 0xED9 ^ 0x4B55;
        kotakbaz.rain.command.commands.A.C[0xC1EC ^ 0xC1DC] = 0xFFFF3E27 ^ 0xC1DC;
        kotakbaz.rain.command.commands.A.C[0x100B8 ^ 0x101E2] = 0x111BF ^ 0x101E2;
        kotakbaz.rain.command.commands.A.C[0xAEC4 ^ 0xAF92] = 0x1A7A4 ^ 0xAF92;
        kotakbaz.rain.command.commands.A.C[0x5D5B ^ 0x5DCE] = 0x5DB7 ^ 0x5DCE;
        kotakbaz.rain.command.commands.A.C[0xAE47 ^ 0xAE4F] = 0xFFFF51AE ^ 0xAE4F;
        kotakbaz.rain.command.commands.A.C[0x8BF6 ^ 0x8A88] = 0x64D2 ^ 0x8A88;
        kotakbaz.rain.command.commands.A.C[0x1B86 ^ 0x1AFF] = 0x7E4F ^ 0x1AFF;
        kotakbaz.rain.command.commands.A.C[0x18F3 ^ 0x18B8] = 0x18FC ^ 0x18B8;
        kotakbaz.rain.command.commands.A.C[0x7274 ^ 0x7243] = 0x726A ^ 0x7243;
        kotakbaz.rain.command.commands.A.C[0x89AC ^ 0x8997] = 0x89F3 ^ 0x8997;
        kotakbaz.rain.command.commands.A.C[0xADED ^ 0xADB4] = 0xFFFF5208 ^ 0xADB4;
        kotakbaz.rain.command.commands.A.C[0x507B ^ 0x5008] = 0xFFFFAFDC ^ 0x5008;
        kotakbaz.rain.command.commands.A.C[0xE338 ^ 0xE314] = 0xFFFF1CD2 ^ 0xE314;
        kotakbaz.rain.command.commands.A.C[0x92DF ^ 0x92A8] = 0x92C7 ^ 0x92A8;
        kotakbaz.rain.command.commands.A.C[0x6C42 ^ 0x6CDE] = 0xFFFF9345 ^ 0x6CDE;
        kotakbaz.rain.command.commands.A.C[0xF83D ^ 0xF8E3] = 0x1FE00 ^ 0xF8E3;
        kotakbaz.rain.command.commands.A.C[0x10411 ^ 0x1041E] = 0xFFFEFBA8 ^ 0x1041E;
        kotakbaz.rain.command.commands.A.C[0x2C1B ^ 0x2D04] = 0xFFFF5051 ^ 0x2D04;
        kotakbaz.rain.command.commands.A.C[0x805 ^ 0x921] = 0x100D1 ^ 0x921;
        kotakbaz.rain.command.commands.A.C[0x7157 ^ 0x707C] = 0xFFFE88B5 ^ 0x707C;
        kotakbaz.rain.command.commands.A.C[0xB079 ^ 0xB0FA] = 0xB0FB ^ 0xB0FA;
        kotakbaz.rain.command.commands.A.C[0x7F67 ^ 0x7E59] = 0x1DC5 ^ 0x7E59;
        kotakbaz.rain.command.commands.A.C[0xCEC7 ^ 0xCE9C] = 0xFFFF3131 ^ 0xCE9C;
        kotakbaz.rain.command.commands.A.C[0x1FDC ^ 0x1F08] = 0x3FCE ^ 0x1F08;
        kotakbaz.rain.command.commands.A.C[0xF131 ^ 0xF18E] = 0xFFFF0E14 ^ 0xF18E;
        kotakbaz.rain.command.commands.A.C[0xB942 ^ 0xB9F1] = 0xB944 ^ 0xB9F1;
        kotakbaz.rain.command.commands.A.C[0xB1CE ^ 0xB0C5] = 0x85EB ^ 0xB0C5;
        kotakbaz.rain.command.commands.A.C[0x2BEC ^ 0x2B3C] = 0x2B3C ^ 0x2B3C;
        kotakbaz.rain.command.commands.A.C[0x4917 ^ 0x4890] = 0xFFFEBE37 ^ 0x4890;
        kotakbaz.rain.command.commands.A.C[0x2117 ^ 0x2000] = 0xE73A ^ 0x2000;
        kotakbaz.rain.command.commands.A.C[0xC2A7 ^ 0xC2A2] = 0xC2DA ^ 0xC2A2;
        kotakbaz.rain.command.commands.A.C[0x10952 ^ 0x109F2] = 0x109A9 ^ 0x109F2;
        kotakbaz.rain.command.commands.A.C[0xAA45 ^ 0xAB27] = 0xA59F ^ 0xAB27;
        kotakbaz.rain.command.commands.A.C[0xFAB ^ 0xEA4] = 0xF20E ^ 0xEA4;
        kotakbaz.rain.command.commands.A.C[0x1DF3 ^ 0x1D16] = 0xA205 ^ 0x1D16;
        kotakbaz.rain.command.commands.A.C[0x9040 ^ 0x9008] = 0x9011 ^ 0x9008;
        kotakbaz.rain.command.commands.A.C[0xAB21 ^ 0xAB89] = 0xFFFF5416 ^ 0xAB89;
        kotakbaz.rain.command.commands.A.C[0x10D2D ^ 0x10D96] = 0x10DCE ^ 0x10D96;
        kotakbaz.rain.command.commands.A.C[0x6743 ^ 0x662A] = 0xD3D4 ^ 0x662A;
        kotakbaz.rain.command.commands.A.C[0x1B8A ^ 0x1B72] = 0xFFFF6E97 ^ 0x1B72;
        kotakbaz.rain.command.commands.A.C[0xE548 ^ 0xE534] = 0xE53E ^ 0xE534;
        kotakbaz.rain.command.commands.A.C[0x76B2 ^ 0x7683] = 0x76C2 ^ 0x7683;
        kotakbaz.rain.command.commands.A.C[0xCBE4 ^ 0xCB03] = 0x4E30 ^ 0xCB03;
        kotakbaz.rain.command.commands.A.C[0x723E ^ 0x721D] = 0x7217 ^ 0x721D;
        kotakbaz.rain.command.commands.A.C[0x79E5 ^ 0x7962] = 0x7962 ^ 0x7962;
        kotakbaz.rain.command.commands.A.C[0x151A ^ 0x147E] = 0x1AC6 ^ 0x147E;
        kotakbaz.rain.command.commands.A.C[0x6F7C ^ 0x6E41] = 0xDDC ^ 0x6E41;
        kotakbaz.rain.command.commands.A.C[0xB677 ^ 0xB613] = 0xFFFF49C4 ^ 0xB613;
        kotakbaz.rain.command.commands.A.C[0xDA59 ^ 0xDBDB] = 0x4D68 ^ 0xDBDB;
        kotakbaz.rain.command.commands.A.C[0x5531 ^ 0x55DB] = 0x9CC2 ^ 0x55DB;
        kotakbaz.rain.command.commands.A.C[0x67A5 ^ 0x66D7] = 0x1A31 ^ 0x66D7;
        kotakbaz.rain.command.commands.A.C[0x1ECB ^ 0x1FD7] = 0x65A2 ^ 0x1FD7;
        kotakbaz.rain.command.commands.A.C[0xFAA3 ^ 0xFA17] = 0xFFFF0582 ^ 0xFA17;
        kotakbaz.rain.command.commands.A.C[0xE6B2 ^ 0xE6FF] = 0xE694 ^ 0xE6FF;
        kotakbaz.rain.command.commands.A.C[0xDDEF ^ 0xDCC1] = 0x590E ^ 0xDCC1;
        kotakbaz.rain.command.commands.A.C[0x62AE ^ 0x63AD] = 0x5E25 ^ 0x63AD;
        kotakbaz.rain.command.commands.A.C[0x6D83 ^ 0x6CA6] = 0x2180 ^ 0x6CA6;
        kotakbaz.rain.command.commands.A.C[0x10F28 ^ 0x10F22] = 0xFFFEF0DD ^ 0x10F22;
        kotakbaz.rain.command.commands.A.C[0x4A5B ^ 0x4B55] = 0xB7F4 ^ 0x4B55;
        kotakbaz.rain.command.commands.A.C[0x393C ^ 0x3840] = 0x5CF5 ^ 0x3840;
        kotakbaz.rain.command.commands.A.C[0xDEB6 ^ 0xDE9E] = 0xFFFF2134 ^ 0xDE9E;
        kotakbaz.rain.command.commands.A.C[0xFA13 ^ 0xFADC] = 0xFADE ^ 0xFADC;
        kotakbaz.rain.command.commands.A.C[0x5949 ^ 0x583C] = 0xCEEF ^ 0x583C;
        kotakbaz.rain.command.commands.A.C[0x3A2D ^ 0x3B64] = 0x9221 ^ 0x3B64;
        kotakbaz.rain.command.commands.A.C[0x56B ^ 0x5AF] = 0x5C7 ^ 0x5AF;
        kotakbaz.rain.command.commands.A.C[0x4DD4 ^ 0x4CAF] = 0x2874 ^ 0x4CAF;
        kotakbaz.rain.command.commands.A.C[0x9DA8 ^ 0x9D4A] = 0x2254 ^ 0x9D4A;
        kotakbaz.rain.command.commands.A.C[0xBA7E ^ 0xBB16] = 0xE779 ^ 0xBB16;
        kotakbaz.rain.command.commands.A.C[0xA78E ^ 0xA738] = 0xA728 ^ 0xA738;
        kotakbaz.rain.command.commands.A.C[0xF9B2 ^ 0xF8C1] = 0x846E ^ 0xF8C1;
        kotakbaz.rain.command.commands.A.C[0xCF41 ^ 0xCF1D] = 0xCF07 ^ 0xCF1D;
        kotakbaz.rain.command.commands.A.C[0xD71D ^ 0xD648] = 0x1DE63 ^ 0xD648;
        kotakbaz.rain.command.commands.A.C[0x15D7 ^ 0x14AA] = 0xFAE3 ^ 0x14AA;
        kotakbaz.rain.command.commands.A.C[0x4A6B ^ 0x4AB8] = 0x4AB8 ^ 0x4AB8;
        kotakbaz.rain.command.commands.A.C[0x6A0F ^ 0x6A52] = 0xFFFF95BD ^ 0x6A52;
        kotakbaz.rain.command.commands.A.C[0x60B0 ^ 0x61F4] = 0xB290 ^ 0x61F4;
        kotakbaz.rain.command.commands.A.C[0x98F2 ^ 0x9856] = 0xFFFF67B3 ^ 0x9856;
        kotakbaz.rain.command.commands.A.C[0x10CB5 ^ 0x10C8B] = 0x10CA7 ^ 0x10C8B;
        kotakbaz.rain.command.commands.A.C[0x48CB ^ 0x4999] = 0x14883 ^ 0x4999;
        kotakbaz.rain.command.commands.A.C[0x6F9E ^ 0x6F57] = 0x6F42 ^ 0x6F57;
        kotakbaz.rain.command.commands.A.C[0xF419 ^ 0xF44C] = 0xF40A ^ 0xF44C;
        kotakbaz.rain.command.commands.A.C[0x27B5 ^ 0x27F9] = 0xFFFFD815 ^ 0x27F9;
        kotakbaz.rain.command.commands.A.C[0xFE83 ^ 0xFEB6] = 0xFEC8 ^ 0xFEB6;
        kotakbaz.rain.command.commands.A.C[0x397E ^ 0x3907] = 0xFFFFC6DB ^ 0x3907;
        kotakbaz.rain.command.commands.A.C[0x6169 ^ 0x612E] = 0xFFFF9E88 ^ 0x612E;
        kotakbaz.rain.command.commands.A.C[0x10E79 ^ 0x10E09] = 0xFFFEF1F6 ^ 0x10E09;
        kotakbaz.rain.command.commands.A.C[0xF41D ^ 0xF472] = 0xFFFF0BF2 ^ 0xF472;
        kotakbaz.rain.command.commands.A.C[0xE1E1 ^ 0xE15F] = 0xFFFF1ED3 ^ 0xE15F;
        kotakbaz.rain.command.commands.A.C[0x92E6 ^ 0x9244] = 0x9274 ^ 0x9244;
        kotakbaz.rain.command.commands.A.C[0x4070 ^ 0x401B] = 0xFFFFBFD8 ^ 0x401B;
        kotakbaz.rain.command.commands.A.C[0x7BF5 ^ 0x7AE5] = 0xFFFF79D3 ^ 0x7AE5;
        kotakbaz.rain.command.commands.A.C[0x4AEB ^ 0x4A03] = 0xFFFF30F1 ^ 0x4A03;
        kotakbaz.rain.command.commands.A.C[0x70D2 ^ 0x71B1] = 0x7F70 ^ 0x71B1;
        kotakbaz.rain.command.commands.A.C[0x3641 ^ 0x3673] = 0xFFFFC9B7 ^ 0x3673;
        kotakbaz.rain.command.commands.A.C[0x3D1A ^ 0x3D8E] = 0x3D8E ^ 0x3D8E;
        kotakbaz.rain.command.commands.A.C[0xC4BB ^ 0xC4D8] = 0xC4A6 ^ 0xC4D8;
        kotakbaz.rain.command.commands.A.C[0x7144 ^ 0x713A] = 0xFFFF8E71 ^ 0x713A;
        kotakbaz.rain.command.commands.A.C[0xF2C7 ^ 0xF3B6] = 0x8F4B ^ 0xF3B6;
        kotakbaz.rain.command.commands.A.C[0xC696 ^ 0xC618] = 0x7EB3 ^ 0xC618;
        kotakbaz.rain.command.commands.A.C[0xE263 ^ 0xE241] = 0xFFFF1DAD ^ 0xE241;
        kotakbaz.rain.command.commands.A.C[0x5D6 ^ 0x510] = 0xFFFFFA9F ^ 0x510;
        kotakbaz.rain.command.commands.A.C[0x91D6 ^ 0x909C] = 0x39DE ^ 0x909C;
        kotakbaz.rain.command.commands.A.C[0x8E7A ^ 0x8F5B] = 0x186A3 ^ 0x8F5B;
        kotakbaz.rain.command.commands.A.C[0x8D19 ^ 0x8C15] = 0xB91C ^ 0x8C15;
        kotakbaz.rain.command.commands.A.C[0x9603 ^ 0x963A] = 0xFFFF69CB ^ 0x963A;
        kotakbaz.rain.command.commands.A.C[0xF8B4 ^ 0xF8E0] = 0xF8F2 ^ 0xF8E0;
        kotakbaz.rain.command.commands.A.C[0x7FC2 ^ 0x7EDF] = 0xFC65 ^ 0x7EDF;
        kotakbaz.rain.command.commands.A.C[0xF9F3 ^ 0xF931] = 0xFFFF06A6 ^ 0xF931;
        kotakbaz.rain.command.commands.A.C[0x2606 ^ 0x2673] = 0x265A ^ 0x2673;
        kotakbaz.rain.command.commands.A.C[0xACB7 ^ 0xAC2C] = 0xAC40 ^ 0xAC2C;
        kotakbaz.rain.command.commands.A.C[0x8101 ^ 0x8038] = 0x3930 ^ 0x8038;
        kotakbaz.rain.command.commands.A.C[0x6DB7 ^ 0x6CE4] = 0x16DB1 ^ 0x6CE4;
        kotakbaz.rain.command.commands.A.C[0xD6C4 ^ 0xD68E] = 0xD6B2 ^ 0xD68E;
        kotakbaz.rain.command.commands.A.C[0x2E7C ^ 0x2F7E] = 0x12FA ^ 0x2F7E;
        kotakbaz.rain.command.commands.A.C[0x78B1 ^ 0x798D] = 0xC091 ^ 0x798D;
        kotakbaz.rain.command.commands.A.C[0x4F2F ^ 0x4FBC] = 0x9C12 ^ 0x4FBC;
        kotakbaz.rain.command.commands.A.C[0x1746 ^ 0x1658] = 0x94EB ^ 0x1658;
        kotakbaz.rain.command.commands.A.C[0x1848 ^ 0x18F0] = 0x18C4 ^ 0x18F0;
        kotakbaz.rain.command.commands.A.C[0x4E8B ^ 0x4F0E] = 0x14657 ^ 0x4F0E;
        kotakbaz.rain.command.commands.A.C[0x886A ^ 0x8893] = 0x2BB ^ 0x8893;
        kotakbaz.rain.command.commands.A.C[0x9F67 ^ 0x9F89] = 0xACB5 ^ 0x9F89;
        kotakbaz.rain.command.commands.A.C[0x2E18 ^ 0x2E0A] = 0xFFFFD1A1 ^ 0x2E0A;
        kotakbaz.rain.command.commands.A.C[0x423B ^ 0x42D6] = 0x8BC1 ^ 0x42D6;
        kotakbaz.rain.command.commands.A.C[0x55DE ^ 0x55C8] = 0x55FC ^ 0x55C8;
        kotakbaz.rain.command.commands.A.C[0xDE9B ^ 0xDEF5] = 0xDEEA ^ 0xDEF5;
        kotakbaz.rain.command.commands.A.C[0xA18D ^ 0xA1E0] = 0xFFFF5E61 ^ 0xA1E0;
        kotakbaz.rain.command.commands.A.C[0xFB1B ^ 0xFB59] = 0xFB53 ^ 0xFB59;
        kotakbaz.rain.command.commands.A.C[0x84A2 ^ 0x84F0] = 0xFFFF7B6A ^ 0x84F0;
        kotakbaz.rain.command.commands.A.C[0xACB1 ^ 0xAC1C] = 0xAC2C ^ 0xAC1C;
        kotakbaz.rain.command.commands.A.C[0xF3AD ^ 0xF22E] = 0xFFFF9B5F ^ 0xF22E;
        kotakbaz.rain.command.commands.A.C[0x4941 ^ 0x4920] = 0x4914 ^ 0x4920;
        kotakbaz.rain.command.commands.A.C[0x11A ^ 0x14B] = 0x110 ^ 0x14B;
        kotakbaz.rain.command.commands.A.C[0xD5D5 ^ 0xD49A] = 0xFFFFE774 ^ 0xD49A;
        kotakbaz.rain.command.commands.A.C[0x2AD4 ^ 0x2A59] = 0xB5A0 ^ 0x2A59;
        kotakbaz.rain.command.commands.A.C[0x8164 ^ 0x8029] = 0x4C43 ^ 0x8029;
        kotakbaz.rain.command.commands.A.C[0x1A6B ^ 0x1B14] = 0xFFFF0A9D ^ 0x1B14;
        kotakbaz.rain.command.commands.A.C[0x6254 ^ 0x6288] = 0xFFFF14CC ^ 0x6288;
        kotakbaz.rain.command.commands.A.C[0xA779 ^ 0xA784] = 0x2458 ^ 0xA784;
        kotakbaz.rain.command.commands.A.C[0xA9D ^ 0xB11] = 0xF704 ^ 0xB11;
        kotakbaz.rain.command.commands.A.C[0x7939 ^ 0x7959] = 0x79FA ^ 0x7959;
        kotakbaz.rain.command.commands.A.C[0x2658 ^ 0x2667] = 0xFFFFD983 ^ 0x2667;
        kotakbaz.rain.command.commands.A.C[0x10BB3 ^ 0x10B64] = 0x176EE ^ 0x10B64;
        kotakbaz.rain.command.commands.A.C[0x30D6 ^ 0x318B] = 0x352A ^ 0x318B;
        kotakbaz.rain.command.commands.A.C[0x176 ^ 0x121] = 0xFFFFFEE0 ^ 0x121;
        kotakbaz.rain.command.commands.A.C[0x17A9 ^ 0x1784] = 0xFFFFE8EA ^ 0x1784;
        kotakbaz.rain.command.commands.A.C[0x9413 ^ 0x948A] = 0xFFFF6B47 ^ 0x948A;
        kotakbaz.rain.command.commands.A.C[0x5248 ^ 0x532F] = 0xFFFFF0AE ^ 0x532F;
        kotakbaz.rain.command.commands.A.C[0x9D0E ^ 0x9DE1] = 0xAEDA ^ 0x9DE1;
        kotakbaz.rain.command.commands.A.C[0xB4C8 ^ 0xB59F] = 0x1BDA0 ^ 0xB59F;
        kotakbaz.rain.command.commands.A.C[0xB53 ^ 0xBCD] = 0xB9E ^ 0xBCD;
        kotakbaz.rain.command.commands.A.C[0x4786 ^ 0x47A3] = 0x478A ^ 0x47A3;
        kotakbaz.rain.command.commands.A.C[0x4349 ^ 0x4388] = 0xFFFFBC38 ^ 0x4388;
        kotakbaz.rain.command.commands.A.C[0xC451 ^ 0xC4C3] = 0x8A6E ^ 0xC4C3;
        kotakbaz.rain.command.commands.A.C[0xD54B ^ 0xD551] = 0xFFFF2AC5 ^ 0xD551;
        kotakbaz.rain.command.commands.A.C[0x4290 ^ 0x4311] = 0xD5AD ^ 0x4311;
        kotakbaz.rain.command.commands.A.C[0xCC23 ^ 0xCD77] = 0x1CC6D ^ 0xCD77;
        kotakbaz.rain.command.commands.A.C[0x20C ^ 0x210] = 0x265 ^ 0x210;
        kotakbaz.rain.command.commands.A.C[0x4D14 ^ 0x4DCB] = 0x14B20 ^ 0x4DCB;
        kotakbaz.rain.command.commands.A.C[0x3EB5 ^ 0x3EC1] = 0xFFFFC145 ^ 0x3EC1;
        kotakbaz.rain.command.commands.A.C[0x80EB ^ 0x807C] = 0xFFFF7F8E ^ 0x807C;
        kotakbaz.rain.command.commands.A.C[0xCAB0 ^ 0xCA0A] = 0xCA48 ^ 0xCA0A;
        kotakbaz.rain.command.commands.A.C[0xF6EE ^ 0xF661] = 0xFD ^ 0xF661;
        kotakbaz.rain.command.commands.A.C[0x5FCB ^ 0x5F6C] = 0x5F07 ^ 0x5F6C;
        kotakbaz.rain.command.commands.A.C[0x7B8F ^ 0x7B8D] = 0x7B87 ^ 0x7B8D;
        kotakbaz.rain.command.commands.A.C[0x5DE0 ^ 0x5D4E] = 0xFFFFA2C5 ^ 0x5D4E;
        kotakbaz.rain.command.commands.A.C[0x40A6 ^ 0x40B1] = 0x40E4 ^ 0x40B1;
        kotakbaz.rain.command.commands.A.C[0xAAC7 ^ 0xAACC] = 0xFFFF5561 ^ 0xAACC;
        kotakbaz.rain.command.commands.A.C[0x109F8 ^ 0x10979] = 0x1097A ^ 0x10979;
        kotakbaz.rain.command.commands.A.C[0xF57F ^ 0xF56E] = 0xFFFF0A8D ^ 0xF56E;
        kotakbaz.rain.command.commands.A.C[0xDAF3 ^ 0xDAE6] = 0xFFFF256D ^ 0xDAE6;
        kotakbaz.rain.command.commands.A.C[0x558C ^ 0x5485] = 0xE9EE ^ 0x5485;
        kotakbaz.rain.command.commands.A.C[0xE3CD ^ 0xE350] = 0xFFFF1C87 ^ 0xE350;
        kotakbaz.rain.command.commands.A.C[0x4C98 ^ 0x4C66] = 0x9E8 ^ 0x4C66;
        kotakbaz.rain.command.commands.A.C[0xF193 ^ 0xF0DB] = 0x172F ^ 0xF0DB;
        kotakbaz.rain.command.commands.A.C[0xD2D7 ^ 0xD3E0] = 0x733F ^ 0xD3E0;
        kotakbaz.rain.command.commands.A.C[0x5622 ^ 0x56EA] = 0x56F9 ^ 0x56EA;
        kotakbaz.rain.command.commands.A.C[0xCFE7 ^ 0xCF4D] = 0xFFFF3081 ^ 0xCF4D;
        kotakbaz.rain.command.commands.A.C[0xC6C ^ 0xCA0] = 0xCE8 ^ 0xCA0;
        kotakbaz.rain.command.commands.A.C[0x5569 ^ 0x557A] = 0xFFFFAAE3 ^ 0x557A;
        kotakbaz.rain.command.commands.A.C[0x35AA ^ 0x3501] = 0xFFFFCA9C ^ 0x3501;
        kotakbaz.rain.command.commands.A.C[0x5D18 ^ 0x5C0E] = 0x5C0E ^ 0x5C0E;
        kotakbaz.rain.command.commands.A.C[0x4B00 ^ 0x4A60] = 0x4ED4 ^ 0x4A60;
        kotakbaz.rain.command.commands.A.C[0x98F0 ^ 0x999D] = 0xA825 ^ 0x999D;
        kotakbaz.rain.command.commands.A.C[0x8E30 ^ 0x8FB4] = 0x1907 ^ 0x8FB4;
        kotakbaz.rain.command.commands.A.C[0xA36B ^ 0xA3FD] = 0xA396 ^ 0xA3FD;
        kotakbaz.rain.command.commands.A.C[0xE5C7 ^ 0xE566] = 0xE504 ^ 0xE566;
        kotakbaz.rain.command.commands.A.C[0x3E6B ^ 0x3F58] = 0xF36B ^ 0x3F58;
        kotakbaz.rain.command.commands.A.C[0xC23B ^ 0xC253] = 0xC21B ^ 0xC253;
        kotakbaz.rain.command.commands.A.C[0x6E9B ^ 0x6E7A] = 0x16891 ^ 0x6E7A;
        kotakbaz.rain.command.commands.A.C[0x564B ^ 0x5692] = 0x2B18 ^ 0x5692;
        kotakbaz.rain.command.commands.A.C[0x3DD1 ^ 0x3D6C] = 0xFFFFC2E3 ^ 0x3D6C;
        kotakbaz.rain.command.commands.A.C[0x4D96 ^ 0x4D4D] = 0xC4A5 ^ 0x4D4D;
        kotakbaz.rain.command.commands.A.C[0xCC51 ^ 0xCD64] = 0x6DBE ^ 0xCD64;
        kotakbaz.rain.command.commands.A.C[0x5E1F ^ 0x5EEE] = 0x6DD5 ^ 0x5EEE;
        kotakbaz.rain.command.commands.A.C[0x6356 ^ 0x636B] = 0x636F ^ 0x636B;
        kotakbaz.rain.command.commands.A.C[0x80C8 ^ 0x81F0] = 0x212C ^ 0x81F0;
        kotakbaz.rain.command.commands.A.C[0x2912 ^ 0x2978] = 0xFFFFD6B3 ^ 0x2978;
        kotakbaz.rain.command.commands.A.C[0xA074 ^ 0xA08F] = 0x2353 ^ 0xA08F;
        kotakbaz.rain.command.commands.A.C[0x43DA ^ 0x42F8] = 0x14B08 ^ 0x42F8;
        kotakbaz.rain.command.commands.A.C[0x7075 ^ 0x707B] = 0xFFFF8FAC ^ 0x707B;
        kotakbaz.rain.command.commands.A.C[0xDE59 ^ 0xDF74] = 0x5AAC ^ 0xDF74;
        kotakbaz.rain.command.commands.A.C[0xA6B ^ 0xADC] = 0xA98 ^ 0xADC;
        kotakbaz.rain.command.commands.A.C[0x31CC ^ 0x30FC] = 0xB533 ^ 0x30FC;
        kotakbaz.rain.command.commands.A.C[0x5EC2 ^ 0x5EE9] = 0x5EE8 ^ 0x5EE9;
        kotakbaz.rain.command.commands.A.C[0xFA7B ^ 0xFA17] = 0xFFFF05A3 ^ 0xFA17;
        kotakbaz.rain.command.commands.A.C[0xE6E6 ^ 0xE6F2] = 0xE6E4 ^ 0xE6F2;
        kotakbaz.rain.command.commands.A.C[0x2C32 ^ 0x2D23] = 0xD189 ^ 0x2D23;
        kotakbaz.rain.command.commands.A.C[0xA663 ^ 0xA73C] = 0xA3C8 ^ 0xA73C;
        kotakbaz.rain.command.commands.A.C[0xE8FF ^ 0xE9DF] = 0x6B6C ^ 0xE9DF;
        kotakbaz.rain.command.commands.A.C[0x3601 ^ 0x367A] = 0x36EC ^ 0x367A;
        kotakbaz.rain.command.commands.A.C[0x684C ^ 0x680F] = 0xFFFF97F0 ^ 0x680F;
        kotakbaz.rain.command.commands.A.C[0x1F7F ^ 0x1F7F] = 0x1F2E ^ 0x1F7F;
        kotakbaz.rain.command.commands.A.C[0x62FF ^ 0x6282] = 0xFFFF9D01 ^ 0x6282;
        kotakbaz.rain.command.commands.A.C[0x7CE2 ^ 0x7CE6] = 0x7CC5 ^ 0x7CE6;
        kotakbaz.rain.command.commands.A.C[0x5A51 ^ 0x5BD9] = 0x1528A ^ 0x5BD9;
        kotakbaz.rain.command.commands.A.C[0x424C ^ 0x4289] = 0xFFFFBD23 ^ 0x4289;
        kotakbaz.rain.command.commands.A.C[0x832E ^ 0x8277] = 0x9236 ^ 0x8277;
        kotakbaz.rain.command.commands.A.C[0x1962 ^ 0x19FA] = 0x1973 ^ 0x19FA;
        kotakbaz.rain.command.commands.A.C[0x698E ^ 0x69E9] = 0xFFFF9633 ^ 0x69E9;
        kotakbaz.rain.command.commands.A.C[0x10817 ^ 0x10921] = 0x1A9FD ^ 0x10921;
        kotakbaz.rain.command.commands.A.C[0x9E71 ^ 0x9ED7] = 0x9EE8 ^ 0x9ED7;
        kotakbaz.rain.command.commands.A.C[0xF91 ^ 0xECF] = 0xA7B ^ 0xECF;
        kotakbaz.rain.command.commands.A.C[0x2B78 ^ 0x2A02] = 0x4EB7 ^ 0x2A02;
        kotakbaz.rain.command.commands.A.C[0xEA5E ^ 0xEA79] = 0xEA39 ^ 0xEA79;
        kotakbaz.rain.command.commands.A.C[0xA322 ^ 0xA381] = 0xFFFF5C0F ^ 0xA381;
        kotakbaz.rain.command.commands.A.C[0x57BF ^ 0x57F1] = 0xFFFFA86E ^ 0x57F1;
        kotakbaz.rain.command.commands.A.C[0x3871 ^ 0x386E] = 0xFFFFC7C8 ^ 0x386E;
        kotakbaz.rain.command.commands.A.C[0xE79F ^ 0xE769] = 0x6D4B ^ 0xE769;
        kotakbaz.rain.command.commands.A.C[0xF34 ^ 0xFAE] = 0xF98 ^ 0xFAE;
        kotakbaz.rain.command.commands.A.C[0x56B8 ^ 0x560A] = 0x5600 ^ 0x560A;
        kotakbaz.rain.command.commands.A.C[0x8031 ^ 0x8084] = 0x80BE ^ 0x8084;
        kotakbaz.rain.command.commands.A.C[0x9598 ^ 0x949E] = 0x29F1 ^ 0x949E;
        kotakbaz.rain.command.commands.A.C[0xFC85 ^ 0xFC9D] = 0xFC40 ^ 0xFC9D;
        kotakbaz.rain.command.commands.A.C[0xF6BD ^ 0xF795] = 0xBABD ^ 0xF795;
        kotakbaz.rain.command.commands.A.C[0xB3C5 ^ 0xB317] = 0xB316 ^ 0xB317;
        kotakbaz.rain.command.commands.A.C[0xB869 ^ 0xB895] = 0x3B5C ^ 0xB895;
        kotakbaz.rain.command.commands.A.C[0x7A5B ^ 0x7A32] = 0x7A1A ^ 0x7A32;
        kotakbaz.rain.command.commands.A.C[0xF5AF ^ 0xF4BA] = 0x8FA5 ^ 0xF4BA;
        kotakbaz.rain.command.commands.A.C[0x2C5F ^ 0x2D1E] = 0xFE7A ^ 0x2D1E;
        kotakbaz.rain.command.commands.A.C[0xC6AA ^ 0xC7F6] = 0xD7AB ^ 0xC7F6;
        kotakbaz.rain.command.commands.A.C[0xA4A1 ^ 0xA4EE] = 0xFFFF5B34 ^ 0xA4EE;
        kotakbaz.rain.command.commands.A.C[0x2AA7 ^ 0x2A0E] = 0x2A03 ^ 0x2A0E;
        kotakbaz.rain.command.commands.A.C[0xEF7C ^ 0xEF58] = 0xEF6F ^ 0xEF58;
        kotakbaz.rain.command.commands.A.C[0x5EC7 ^ 0x5FE8] = 0xDA32 ^ 0x5FE8;
        kotakbaz.rain.command.commands.A.C[0x5F04 ^ 0x5F02] = 0xFFFFA08C ^ 0x5F02;
        kotakbaz.rain.command.commands.A.C[0x32E4 ^ 0x33C3] = 0x7E9F ^ 0x33C3;
        kotakbaz.rain.command.commands.A.C[0x4265 ^ 0x4357] = 0x8F03 ^ 0x4357;
        kotakbaz.rain.command.commands.A.C[0xD9B1 ^ 0xD91D] = 0xD912 ^ 0xD91D;
        kotakbaz.rain.command.commands.A.C[0x433 ^ 0x4F0] = 0xFFFFFB2F ^ 0x4F0;
        kotakbaz.rain.command.commands.A.C[0x1031 ^ 0x117F] = 0xDD11 ^ 0x117F;
        kotakbaz.rain.command.commands.A.C[0xDAC0 ^ 0xDA4C] = 0x50F4 ^ 0xDA4C;
        kotakbaz.rain.command.commands.A.C[0x5F46 ^ 0x5F23] = 0xFFFFA080 ^ 0x5F23;
        kotakbaz.rain.command.commands.A.C[0x50AE ^ 0x509D] = 0x508A ^ 0x509D;
        kotakbaz.rain.command.commands.A.C[0x3EF6 ^ 0x3F79] = 0x7553 ^ 0x3F79;
        kotakbaz.rain.command.commands.A.C[0x6857 ^ 0x6863] = 0x6800 ^ 0x6863;
    }
}

