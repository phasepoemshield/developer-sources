/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.Suggestions
 *  net.minecraft.class_2561
 *  net.minecraft.class_2583
 *  net.minecraft.class_329
 *  net.minecraft.class_5250
 *  net.minecraft.class_5251
 *  net.minecraft.class_634
 *  net.minecraft.class_637
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
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
import kotakbaz.rain.client.extensions.b_0;
import kotakbaz.rain.client.interfaces.d;
import kotakbaz.rain.command.commands.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_329;
import net.minecraft.class_5250;
import net.minecraft.class_5251;
import net.minecraft.class_634;
import net.minecraft.class_637;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J!\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u001f\u001a&\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d \u001e*\u0012\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d\u0018\u00010\u001c0\u001c2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070#\u00a2\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\b&\u0010'J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020(\u00a2\u0006\u0004\b&\u0010)J\u000f\u0010+\u001a\u00020*H\u0002\u00a2\u0006\u0004\b+\u0010,R&\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u001a0-0#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b/\u00100R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u0016018\u0006\u00a2\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u0007068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b7\u00100\u00a8\u00068"}, d2={"Lkotakbaz/rain/command/CommandManager;", "Lkotakbaz/rain/client/interfaces/ILoadable;", "<init>", "()V", "", "load", "", "Lkotakbaz/rain/command/Command;", "commands", "registerCommands", "([Lkotakbaz/rain/command/Command;)V", "", "getPrefix", "()Ljava/lang/String;", "message", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;", "ci", "createCommands", "(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V", "Lcom/mojang/brigadier/StringReader;", "reader", "Lcom/mojang/brigadier/ParseResults;", "Lnet/minecraft/class_637;", "parse", "(Lcom/mojang/brigadier/StringReader;)Lcom/mojang/brigadier/ParseResults;", "parseResults", "", "cursor", "Ljava/util/concurrent/CompletableFuture;", "Lcom/mojang/brigadier/suggestion/Suggestions;", "kotlin.jvm.PlatformType", "suggest", "(Lcom/mojang/brigadier/ParseResults;I)Ljava/util/concurrent/CompletableFuture;", "source", "()Lnet/minecraft/class_637;", "", "getCommands", "()Ljava/util/List;", "sendClientMessage", "(Ljava/lang/String;)V", "Lnet/minecraft/class_2561;", "(Lnet/minecraft/class_2561;)V", "Lnet/minecraft/class_5250;", "buildPrefix", "()Lnet/minecraft/class_5250;", "Lkotlin/Pair;", "", "prefixSegments", "Ljava/util/List;", "Lcom/mojang/brigadier/CommandDispatcher;", "dispatcher", "Lcom/mojang/brigadier/CommandDispatcher;", "getDispatcher", "()Lcom/mojang/brigadier/CommandDispatcher;", "", "commandList", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nCommandManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandManager.kt\nkotakbaz/rain/command/CommandManager\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n14060#2,2:100\n1915#3,2:102\n*S KotlinDebug\n*F\n+ 1 CommandManager.kt\nkotakbaz/rain/command/CommandManager\n*L\n40#1:100,2\n87#1:102,2\n*E\n"})
public final class A
implements d {
    @NotNull
    public static final A INSTANCE;
    @NotNull
    private static final List<Pair<Character, Integer>> a;
    @NotNull
    private static final CommandDispatcher<class_637> A;
    @NotNull
    private static final List<kotakbaz.rain.command.b> b;
    private static Object[] B;
    private static Object C;
    private static Object[] d;
    private static Object[] c;
    private static Object[] D;
    public static int[] e;

    private A() {
        super();
    }

    @NotNull
    public final CommandDispatcher<class_637> getDispatcher() {
        return A;
    }

    @Override
    public void load() {
        int n = e[0];
        n -= e[1];
        kotakbaz.rain.command.b[] bArray = new kotakbaz.rain.command.b[n ^= e[2]];
        int n2 = e[3];
        n2 -= e[4];
        bArray[n2 += kotakbaz.rain.command.A.e[5]] = kotakbaz.rain.command.commands.A.INSTANCE;
        int n3 = e[6];
        n3 ^= e[7];
        bArray[n3 += kotakbaz.rain.command.A.e[8]] = kotakbaz.rain.command.commands.b.INSTANCE;
        this.registerCommands(bArray);
    }

    public final void registerCommands(kotakbaz.rain.command.b ... bArray) {
        long l = 5689581167614110696L;
        long l2 = -8530843076012256050L;
        long l3 = 5300932483287829515L;
        long l4 = -9208574722253803902L;
        int n = e[9];
        n ^= e[10];
        Intrinsics.checkNotNullParameter(bArray, (String)B[n ^= e[11]]);
        kotakbaz.rain.command.b[] bArray2 = bArray;
        long l5 = l;
        int n2 = e[12];
        n2 -= e[13];
        l = l5 ^ (0L ^ l5) & -1L << (n2 -= e[14]);
        long l6 = l4;
        int n3 = e[15];
        n3 ^= e[16];
        l4 = l6 ^ (0L ^ l6) & -1L >>> (n3 -= e[17]);
        int n4 = e[18];
        n4 += e[19];
        long l7 = l3;
        int n5 = e[21];
        n5 ^= e[22];
        l3 = l7 ^ ((long)bArray2.length << (n4 ^= e[20]) ^ l7) & -1L << (n5 ^= e[23]);
        while (true) {
            kotakbaz.rain.command.b b2;
            int n6 = e[24];
            n6 += e[25];
            if ((int)l4 >= (int)(l3 >>> (n6 += e[26]))) break;
            kotakbaz.rain.command.b b3 = b2 = bArray2[(int)l4];
            long l8 = l4;
            int n7 = e[27];
            n7 -= e[28];
            l4 = l8 ^ (0L ^ l8) & -1L << (n7 ^= e[29]);
            b3.register(A);
            b.add(b3);
            long l9 = l4;
            int n8 = e[30];
            n8 += e[31];
            int n9 = e[33];
            n9 ^= e[34];
            l4 = l9 ^ (l9 ^ l9 + (long)(n8 -= e[32])) & -1L >>> (n9 ^= e[35]);
        }
    }

    @NotNull
    public final String getPrefix() {
        int n = e[36];
        n ^= e[37];
        return (String)B[n ^= e[38]];
    }

    public final void createCommands(@NotNull String string, @NotNull CallbackInfo callbackInfo) {
        int n = e[39];
        n += e[40];
        Intrinsics.checkNotNullParameter(string, (String)B[n ^= e[41]]);
        int n2 = e[42];
        n2 ^= e[43];
        Intrinsics.checkNotNullParameter(callbackInfo, (String)B[n2 -= e[44]]);
        boolean bl = e[45];
        bl -= e[46];
        int n3 = e[48];
        n3 -= e[49];
        if (StringsKt.startsWith$default(string, this.getPrefix(), bl -= e[47], n3 -= e[50], null)) {
            try {
                String string2 = string.substring(this.getPrefix().length());
                int n4 = e[51];
                n4 -= e[52];
                Intrinsics.checkNotNullExpressionValue(string2, (String)B[n4 ^= e[53]]);
                A.execute(string2, (Object)this.source());
            }
            catch (CommandSyntaxException commandSyntaxException) {
                // empty catch block
            }
            callbackInfo.cancel();
        }
    }

    @Nullable
    public final ParseResults<class_637> parse(@NotNull StringReader stringReader) {
        int n = e[54];
        n -= e[55];
        Intrinsics.checkNotNullParameter(stringReader, (String)B[n += e[56]]);
        class_637 class_6372 = this.source();
        if (class_6372 == null) {
            return null;
        }
        class_637 class_6373 = class_6372;
        return A.parse(stringReader, (Object)class_6373);
    }

    public final CompletableFuture<Suggestions> suggest(@NotNull ParseResults<?> parseResults, int n) {
        int n2 = e[57];
        n2 += e[58];
        Intrinsics.checkNotNullParameter(parseResults, (String)B[n2 += e[59]]);
        return A.getCompletionSuggestions(parseResults, n);
    }

    @Nullable
    public final class_637 source() {
        class_634 class_6342 = b_0.getMc().method_1562();
        return class_6342 != null ? class_6342.method_2875() : null;
    }

    @NotNull
    public final List<kotakbaz.rain.command.b> getCommands() {
        return CollectionsKt.toList((Iterable)b);
    }

    public final void sendClientMessage(@NotNull String string) {
        int n = e[60];
        n -= e[61];
        Intrinsics.checkNotNullParameter(string, (String)B[n -= e[62]]);
        class_5250 class_52502 = class_2561.method_43470((String)string);
        int n2 = e[63];
        n2 ^= e[64];
        Intrinsics.checkNotNullExpressionValue(class_52502, (String)B[n2 ^= e[65]]);
        this.sendClientMessage((class_2561)class_52502);
    }

    public final void sendClientMessage(@NotNull class_2561 class_25612) {
        int n = e[66];
        n += e[67];
        Intrinsics.checkNotNullParameter(class_25612, (String)B[n += e[68]]);
        class_329 class_3292 = b_0.getMc().field_1705;
        if (class_3292 == null) {
            return;
        }
        class_329 class_3293 = class_3292;
        int n2 = e[69];
        n2 ^= e[70];
        class_3293.method_1743().method_1812((class_2561)this.buildPrefix().method_10852((class_2561)class_2561.method_43470((String)((String)B[n2 ^= e[71]]))).method_10852(class_25612));
    }

    private final class_5250 buildPrefix() {
        long l = -7664636704821420513L;
        long l2 = 6895591440661014939L;
        long l3 = 830852544547540890L;
        class_5250 class_52502 = class_2561.method_43473();
        Iterable iterable = a;
        long l4 = l;
        int n = e[72];
        n ^= e[73];
        l = l4 ^ (0L ^ l4) & -1L << (n += e[74]);
        for (Object t2 : iterable) {
            Pair pair = (Pair)t2;
            long l5 = l;
            int n2 = e[75];
            n2 += e[76];
            l = l5 ^ (0L ^ l5) & -1L >>> (n2 += e[77]);
            int n3 = e[78];
            n3 += e[79];
            long l6 = l3;
            int n4 = e[81];
            n4 ^= e[82];
            long l7 = l3 = l6 ^ ((long)((Character)pair.component1()).charValue() << (n3 -= e[80]) ^ l6) & -1L << (n4 ^= e[83]);
            int n5 = e[84];
            n5 += e[85];
            l3 = l7 ^ ((long)((Number)pair.component2()).intValue() ^ l7) & -1L >>> (n5 -= e[86]);
            int n6 = e[87];
            n6 += e[88];
            boolean bl = e[90];
            bl += e[91];
            class_52502.method_10852((class_2561)class_2561.method_43470((String)String.valueOf((char)(l3 >>> (n6 += e[89])))).method_10862(class_2583.field_24360.method_27703(class_5251.method_27717((int)((int)l3))).method_10982(Boolean.valueOf(bl += e[92]))));
        }
        Intrinsics.checkNotNull(class_52502);
        return class_52502;
    }

    static {
        kotakbaz.rain.command.A.b();
        long l = -6678676748290356835L;
        long l2 = -2734320745208630622L;
        long l3 = 27139509924755052L;
        long l4 = -2271036689785417280L;
        long l5 = -7585232878999742174L;
        long l6 = -3328815823118349612L;
        long l7 = -5637394700952833502L;
        long l8 = 4856611421268944200L;
        long l9 = 441469431577427053L;
        long l10 = 6549556477410580360L;
        long l11 = 4506760283982230068L;
        long l12 = -5105934757506748495L;
        long l13 = 4225580658853627565L;
        long l14 = -8071215126282841208L;
        int n = e[93];
        n -= e[94];
        B = new Object[n ^= e[95]];
        long l15 = l14;
        int n2 = e[96];
        n2 ^= e[97];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 += e[98]);
        Object[] objectArray = new Object[e[99]];
        objectArray[kotakbaz.rain.command.A.e[100]] = c;
        objectArray[kotakbaz.rain.command.A.e[101]] = e[102];
        int n3 = e[103];
        Object object = kotakbaz.rain.command.A.A()[e[104]];
        if (object == null) {
            char[] cArray = "\ud55c\ud55d\ud55b\ud52d\ud531\ud48f\ud560\ud555\ud48f\ud533\ud53d\ud53f\ud52d\ud540\ud562\ud48d\ud54d\ud53b\ud536\ud54d\ud530\ud536\ud54a\ud556\ud560\ud531\ud555\ud52a\ud55a\ud538\ud492\ud550\ud538\ud504\ud563\ud54b\ud4fb\ud556\ud4fc\ud54c\ud53b\ud54c\ud552\ud530\ud555\ud55d\ud52d\ud544\ud4fc\ud4fa\ud53e\ud550\ud542\ud564\ud54d\ud54e\ud493\ud530\ud492\ud538\ud531\ud551\ud536\ud538\ud539\ud556\ud54e\ud530\ud539\ud54c\ud555\ud504\ud556\ud540\ud531\ud536\ud558\ud504\ud556\ud54e\ud54f\ud537\ud53e\ud492\ud542\ud4fc\ud52f\ud54e\ud4fa\ud544\ud55f\ud53f\ud563\ud4f8\ud54b\ud53b\ud539\ud53b\ud55f\ud537\ud535\ud560\ud53c\ud54f\ud530\ud564\ud535\ud55e\ud54c\ud53d\ud4f8\ud55d\ud52d\ud4fa\ud537\ud538\ud531\ud55a\ud54b\ud551\ud4fb\ud53d\ud551\ud54f\ud4fc\ud556\ud52e\ud54d\ud52e\ud54a\ud48e\ud544\ud540\ud541\ud560\ud53a\ud52b\ud530\ud552\ud564\ud557\ud54f\ud564\ud54c\ud492\ud504\ud54a\ud543\ud53d\ud537\ud53e\ud4f8\ud559\ud544\ud550\ud4fc\ud551\ud52b\ud504\ud492\ud53c\ud493\ud4fa\ud493\ud4fa\ud4fc\ud564\ud492\ud54f\ud535\ud544\ud546".toCharArray();
            for (int i = e[105]; i < e[106]; ++i) {
                int n4 = cArray[i];
                n4 -= e[107];
                n4 -= e[108];
                n4 -= e[109];
                n4 += e[110];
                n4 += e[111];
                n4 ^= e[112];
                n4 -= e[113];
                n4 += e[114];
                n4 -= e[115];
                n4 += e[116];
                cArray[i] = (char)(n4 -= e[117]);
            }
            object = kotakbaz.rain.command.A.A()[kotakbaz.rain.command.A.e[118]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.command.A.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = e[119];
        n5 ^= e[120];
        l5 = l16 ^ (0x6300000000L ^ l16) & -1L << (n5 -= e[121]);
        long l17 = l12;
        int n6 = e[122];
        n6 ^= e[123];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 += e[124]);
        while (true) {
            int n7 = e[125];
            n7 += e[126];
            if ((int)l12 >= (int)(l5 >>> (n7 -= e[127]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = e[128];
            n9 += e[129];
            int n10 = e[131];
            n10 ^= e[132];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 += e[130])) & -1L >>> (n10 ^= e[133]);
            long l19 = l8;
            int n11 = e[134];
            n11 += e[135];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 += e[136]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = e[137];
            n13 += e[138];
            int n14 = e[140];
            n14 += e[141];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 += e[139])) & -1L >>> (n14 ^= e[142]);
            int n15 = e[143];
            n15 -= e[144];
            long l21 = l9;
            int n16 = e[146];
            n16 ^= e[147];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= e[145]) ^ l21) & -1L << (n16 += e[148]);
            int n17 = e[149];
            n17 += e[150];
            n17 += e[151];
            int n18 = e[152];
            n18 -= e[153];
            long l22 = l11;
            int n19 = e[155];
            n19 += e[156];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 ^= e[154]))) ^ l22) & -1L >>> (n19 += e[157]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = e[158];
            n20 ^= e[159];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 -= e[160]);
            while (true) {
                int n21 = e[161];
                n21 += e[162];
                if ((int)(l13 >>> (n21 ^= e[163])) >= (int)l11) break;
                int n22 = e[164];
                n22 += e[165];
                int n23 = e[167];
                n23 += e[168];
                cArray2[(int)(l13 >>> (n22 -= kotakbaz.rain.command.A.e[166]))] = cArray[(int)l12 + (int)(l13 >>> (n23 ^= e[169]))];
                l13 += 0x100000000L;
            }
            int n24 = e[170];
            n24 -= e[171];
            int n25 = (int)(l14 >>> (n24 += e[172]));
            l14 += 0x100000000L;
            kotakbaz.rain.command.A.B[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = e[173];
            n26 += e[174];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 -= e[175]);
        }
        INSTANCE = new A();
        int n27 = e[176];
        n27 += e[177];
        Pair[] pairArray = new Pair[n27 -= e[178]];
        int n28 = e[179];
        n28 += e[180];
        char c2 = e[182];
        c2 ^= e[183];
        int n29 = e[185];
        n29 -= e[186];
        pairArray[n28 ^= kotakbaz.rain.command.A.e[181]] = TuplesKt.to(Character.valueOf(c2 -= e[184]), n29 += e[187]);
        int n30 = e[188];
        n30 ^= e[189];
        char c3 = e[191];
        c3 += e[192];
        int n31 = e[194];
        n31 -= e[195];
        pairArray[n30 ^= kotakbaz.rain.command.A.e[190]] = TuplesKt.to(Character.valueOf(c3 -= e[193]), n31 ^= e[196]);
        int n32 = e[197];
        n32 -= e[198];
        char c4 = e[200];
        c4 ^= e[201];
        int n33 = e[203];
        n33 -= e[204];
        pairArray[n32 += kotakbaz.rain.command.A.e[199]] = TuplesKt.to(Character.valueOf(c4 ^= e[202]), n33 ^= e[205]);
        int n34 = e[206];
        n34 ^= e[207];
        char c5 = e[209];
        c5 ^= e[210];
        int n35 = e[212];
        n35 += e[213];
        pairArray[n34 -= kotakbaz.rain.command.A.e[208]] = TuplesKt.to(Character.valueOf(c5 += e[211]), n35 -= e[214]);
        int n36 = e[215];
        n36 -= e[216];
        char c6 = e[218];
        c6 += e[219];
        int n37 = e[221];
        n37 += e[222];
        pairArray[n36 += kotakbaz.rain.command.A.e[217]] = TuplesKt.to(Character.valueOf(c6 += e[220]), n37 ^= e[223]);
        int n38 = e[224];
        n38 += e[225];
        char c7 = e[227];
        c7 ^= e[228];
        int n39 = e[230];
        n39 ^= e[231];
        pairArray[n38 ^= kotakbaz.rain.command.A.e[226]] = TuplesKt.to(Character.valueOf(c7 -= e[229]), n39 ^= e[232]);
        int n40 = e[233];
        n40 += e[234];
        char c8 = e[236];
        c8 ^= e[237];
        int n41 = e[239];
        n41 -= e[240];
        pairArray[n40 += kotakbaz.rain.command.A.e[235]] = TuplesKt.to(Character.valueOf(c8 += e[238]), n41 += e[241]);
        a = CollectionsKt.listOf(pairArray);
        A = new CommandDispatcher();
        b = new ArrayList();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[e[242]];
        String string = (String)object[e[243]];
        object = object[e[244]];
        Object[] objectArray = d;
        if (d == null) {
            objectArray = d = new Object[e[245]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[e[246]];
                c = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[e[248] ^ e[249]];
                byArray[kotakbaz.rain.command.A.e[250] ^ kotakbaz.rain.command.A.e[251]] = e[252] ^ e[253];
                byArray[kotakbaz.rain.command.A.e[254] ^ kotakbaz.rain.command.A.e[255]] = e[256] ^ e[257];
                byArray[kotakbaz.rain.command.A.e[258] ^ kotakbaz.rain.command.A.e[259]] = e[260] ^ e[261];
                byArray[kotakbaz.rain.command.A.e[262] ^ kotakbaz.rain.command.A.e[263]] = e[264] ^ e[265];
                byArray[kotakbaz.rain.command.A.e[266] ^ kotakbaz.rain.command.A.e[267]] = e[268] ^ e[269];
                byArray[kotakbaz.rain.command.A.e[270] ^ kotakbaz.rain.command.A.e[271]] = e[272] ^ e[273];
                byArray[kotakbaz.rain.command.A.e[274] ^ kotakbaz.rain.command.A.e[275]] = e[276] ^ e[277];
                byArray[kotakbaz.rain.command.A.e[278] ^ kotakbaz.rain.command.A.e[279]] = e[280] ^ e[281];
                byArray[kotakbaz.rain.command.A.e[282] ^ kotakbaz.rain.command.A.e[283]] = e[284] ^ e[285];
                byArray[kotakbaz.rain.command.A.e[286] ^ kotakbaz.rain.command.A.e[287]] = e[288] ^ e[289];
                byArray[kotakbaz.rain.command.A.e[290] ^ kotakbaz.rain.command.A.e[291]] = e[292] ^ e[293];
                byArray[kotakbaz.rain.command.A.e[294] ^ kotakbaz.rain.command.A.e[295]] = e[296] ^ e[297];
                byArray[kotakbaz.rain.command.A.e[298] ^ kotakbaz.rain.command.A.e[299]] = e[300] ^ e[301];
                byArray[kotakbaz.rain.command.A.e[302] ^ kotakbaz.rain.command.A.e[303]] = e[304] ^ e[305];
                byArray[kotakbaz.rain.command.A.e[306] ^ kotakbaz.rain.command.A.e[307]] = e[308] ^ e[309];
                byArray[kotakbaz.rain.command.A.e[310] ^ kotakbaz.rain.command.A.e[311]] = e[312] ^ e[313];
                objectArray2[kotakbaz.rain.command.A.e[247]] = byArray;
            }
            byte[] byArray = (byte[])object3[e[314]];
            if (C == null) {
                byte[] byArray2 = new byte[e[315] ^ e[316]];
                byArray2[kotakbaz.rain.command.A.e[317] ^ kotakbaz.rain.command.A.e[318]] = e[319] ^ e[320];
                byArray2[kotakbaz.rain.command.A.e[321] ^ kotakbaz.rain.command.A.e[322]] = e[323] ^ e[324];
                byArray2[kotakbaz.rain.command.A.e[325] ^ kotakbaz.rain.command.A.e[326]] = e[327] ^ e[328];
                byArray2[kotakbaz.rain.command.A.e[329] ^ kotakbaz.rain.command.A.e[330]] = e[331] ^ e[332];
                byArray2[kotakbaz.rain.command.A.e[333] ^ kotakbaz.rain.command.A.e[334]] = e[335] ^ e[336];
                byArray2[kotakbaz.rain.command.A.e[337] ^ kotakbaz.rain.command.A.e[338]] = e[339] ^ e[340];
                byArray2[kotakbaz.rain.command.A.e[341] ^ kotakbaz.rain.command.A.e[342]] = e[343] ^ e[344];
                byArray2[kotakbaz.rain.command.A.e[345] ^ kotakbaz.rain.command.A.e[346]] = e[347] ^ e[348];
                byArray2[kotakbaz.rain.command.A.e[349] ^ kotakbaz.rain.command.A.e[350]] = e[351] ^ e[352];
                byArray2[kotakbaz.rain.command.A.e[353] ^ kotakbaz.rain.command.A.e[354]] = e[355] ^ e[356];
                byArray2[kotakbaz.rain.command.A.e[357] ^ kotakbaz.rain.command.A.e[358]] = e[359] ^ e[360];
                byArray2[kotakbaz.rain.command.A.e[361] ^ kotakbaz.rain.command.A.e[362]] = e[363] ^ e[364];
                byArray2[kotakbaz.rain.command.A.e[365] ^ kotakbaz.rain.command.A.e[366]] = e[367] ^ e[368];
                byArray2[kotakbaz.rain.command.A.e[369] ^ kotakbaz.rain.command.A.e[370]] = e[371] ^ e[372];
                byArray2[kotakbaz.rain.command.A.e[373] ^ kotakbaz.rain.command.A.e[374]] = e[375] ^ e[376];
                byArray2[kotakbaz.rain.command.A.e[377] ^ kotakbaz.rain.command.A.e[378]] = e[379] ^ e[380];
                byArray2[kotakbaz.rain.command.A.e[381] ^ kotakbaz.rain.command.A.e[382]] = e[383] ^ e[384];
                byArray2[kotakbaz.rain.command.A.e[385] ^ kotakbaz.rain.command.A.e[386]] = e[387] ^ e[388];
                byArray2[kotakbaz.rain.command.A.e[389] ^ kotakbaz.rain.command.A.e[390]] = e[391] ^ e[392];
                byArray2[kotakbaz.rain.command.A.e[393] ^ kotakbaz.rain.command.A.e[394]] = e[395] ^ e[396];
                byArray2[kotakbaz.rain.command.A.e[397] ^ kotakbaz.rain.command.A.e[398]] = e[399] ^ 0x3BEF;
                byArray2[0x49C2 ^ 0x49D8] = 0xFFFFB67A ^ 0x49D8;
                byArray2[0x51AD ^ 0x51AA] = 0xFFFFAE3B ^ 0x51AA;
                byArray2[0x10DB8 ^ 0x10DA7] = 0xFFFEF244 ^ 0x10DA7;
                byArray2[0x88EB ^ 0x88F6] = 0xFFFF7766 ^ 0x88F6;
                byArray2[0x3DA5 ^ 0x3DB1] = 0xFFFFC247 ^ 0x3DB1;
                byArray2[0xA6CB ^ 0xA6D8] = 0xFFFF5905 ^ 0xA6D8;
                byArray2[0xCFA5 ^ 0xCFB3] = 0xFFFF3042 ^ 0xCFB3;
                byArray2[0xF9BA ^ 0xF9B8] = 0xF9B2 ^ 0xF9B8;
                byArray2[0x2F64 ^ 0x2F7A] = 0xFFFFD0A3 ^ 0x2F7A;
                byArray2[0xD032 ^ 0xD02E] = 0xD04B ^ 0xD02E;
                byArray2[0x98C2 ^ 0x98C2] = 0xFFFF6743 ^ 0x98C2;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.command.A.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u2ece\u2ec0\u2ecb\u2ec2\u2ec4\u2eb0\u2e97\u2ea9\u2ef2\u2ea6\u2ec6\u2ead\u2ea1\u2ea3\u2e93\u2ec6\u2ec1\u2eb1".toCharArray();
                    for (int i = 0; i < 18; ++i) {
                        int n2 = cArray[i];
                        n2 -= 19728;
                        n2 ^= 0x1221;
                        n2 -= 53650;
                        n2 += 18131;
                        n2 -= 56740;
                        n2 += 47077;
                        n2 -= 59959;
                        n2 -= 40813;
                        n2 -= 1839;
                        n2 -= 15935;
                        cArray[i] = (char)(n2 -= 29631);
                    }
                    object4 = kotakbaz.rain.command.A.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[9] = -110;
                byArray4[15] = -51;
                byArray4[8] = -62;
                byArray4[3] = 67;
                byArray4[12] = -23;
                byArray4[7] = 125;
                byArray4[14] = 118;
                byArray4[4] = 8;
                byArray4[0] = 112;
                byArray4[6] = -37;
                byArray4[10] = -79;
                byArray4[1] = -22;
                byArray4[11] = -107;
                byArray4[13] = 28;
                byArray4[5] = -125;
                byArray4[2] = 71;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 11, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.command.A.A()[2];
                if (object5 == null) {
                    char[] cArray = "\uba8b\uba8f\uba99".toCharArray();
                    for (int i = 0; i < 3; ++i) {
                        int n3 = cArray[i];
                        n3 += 57808;
                        n3 += 38576;
                        n3 ^= 0xBC63;
                        n3 -= 4773;
                        n3 ^= 0x6A17;
                        n3 -= 59498;
                        n3 -= 6908;
                        n3 ^= 0x2BBE;
                        n3 += 52350;
                        n3 -= 33118;
                        cArray[i] = (char)(n3 -= 33711);
                    }
                    object5 = kotakbaz.rain.command.A.A()[2] = new String(cArray);
                }
                C = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.command.A.A()[3];
            if (object6 == null) {
                char[] cArray = "\u9eba\u9eb6\u9ea8\u9e8c\u9eb8\u9eb9\u9eb8\u9e8c\u9eab\u9eb0\u9eb8\u9ea8\u9e86\u9eab\u9eda\u9ed7\u9ed7\u9ed2\u9ecd\u9ed4".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 -= 28817;
                    n4 += 8945;
                    n4 += 32324;
                    n4 -= 56933;
                    n4 += 9669;
                    n4 -= 63496;
                    n4 += 1244;
                    n4 += 65437;
                    n4 += 5807;
                    cArray[i] = (char)(n4 ^= 0x399F);
                }
                object6 = kotakbaz.rain.command.A.A()[3] = new String(cArray);
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
        e = new int[0xB697 ^ 0xB707];
        kotakbaz.rain.command.A.e[0x3837 ^ 0x392B] = 0xFFFFE302 ^ 0x392B;
        kotakbaz.rain.command.A.e[0x9BBE ^ 0x9BCD] = 0x1311 ^ 0x9BCD;
        kotakbaz.rain.command.A.e[0x331D ^ 0x3365] = 0xFFFFCCB0 ^ 0x3365;
        kotakbaz.rain.command.A.e[0x3240 ^ 0x3296] = 0xFFFFCD44 ^ 0x3296;
        kotakbaz.rain.command.A.e[0xECE2 ^ 0xEDF7] = 0x1E9AB ^ 0xEDF7;
        kotakbaz.rain.command.A.e[0xBE48 ^ 0xBEA6] = 0xFFFF4175 ^ 0xBEA6;
        kotakbaz.rain.command.A.e[0x10347 ^ 0x103E5] = 0x103B2 ^ 0x103E5;
        kotakbaz.rain.command.A.e[0x6291 ^ 0x6203] = 0xFFFF9D94 ^ 0x6203;
        kotakbaz.rain.command.A.e[0xF921 ^ 0xF86C] = 0x4B17 ^ 0xF86C;
        kotakbaz.rain.command.A.e[0x4279 ^ 0x42CB] = 0x42F0 ^ 0x42CB;
        kotakbaz.rain.command.A.e[0x10E99 ^ 0x10ED3] = 0xFFFEF14B ^ 0x10ED3;
        kotakbaz.rain.command.A.e[0xAE3C ^ 0xAF03] = 0x2150 ^ 0xAF03;
        kotakbaz.rain.command.A.e[0x203A ^ 0x202F] = 0xFFFFDFAC ^ 0x202F;
        kotakbaz.rain.command.A.e[0x54FF ^ 0x5419] = 0xD084CD ^ 0x5419;
        kotakbaz.rain.command.A.e[0x52D0 ^ 0x5273] = 0xFFFFADA6 ^ 0x5273;
        kotakbaz.rain.command.A.e[0x30D9 ^ 0x3039] = 0xFFFFCFCD ^ 0x3039;
        kotakbaz.rain.command.A.e[0x10707 ^ 0x1060B] = 0x1CDB6 ^ 0x1060B;
        kotakbaz.rain.command.A.e[0x834D ^ 0x820B] = 0x2C1 ^ 0x820B;
        kotakbaz.rain.command.A.e[0x460B ^ 0x46F8] = 0x46FA ^ 0x46F8;
        kotakbaz.rain.command.A.e[0x10C57 ^ 0x10C36] = 0x10C7C ^ 0x10C36;
        kotakbaz.rain.command.A.e[0x204F ^ 0x214D] = 0xFAF7 ^ 0x214D;
        kotakbaz.rain.command.A.e[0xECF ^ 0xEC9] = 0xFFFFF161 ^ 0xEC9;
        kotakbaz.rain.command.A.e[0x7D4C ^ 0x7C72] = 0xF24D ^ 0x7C72;
        kotakbaz.rain.command.A.e[0x2E1F ^ 0x2F3C] = 0xDEB9 ^ 0x2F3C;
        kotakbaz.rain.command.A.e[0x86D3 ^ 0x87E4] = 0x8539 ^ 0x87E4;
        kotakbaz.rain.command.A.e[0xDE14 ^ 0xDE2A] = 0xFFFF21DA ^ 0xDE2A;
        kotakbaz.rain.command.A.e[0xF92B ^ 0xF928] = 0xF920 ^ 0xF928;
        kotakbaz.rain.command.A.e[0xF606 ^ 0xF624] = 0xFFFF09EE ^ 0xF624;
        kotakbaz.rain.command.A.e[0xE59F ^ 0xE5ED] = 0x9A87 ^ 0xE5ED;
        kotakbaz.rain.command.A.e[0xB0CC ^ 0xB0D3] = 0xFFFF4F1E ^ 0xB0D3;
        kotakbaz.rain.command.A.e[0xAA0B ^ 0xAABB] = 0xAA81 ^ 0xAABB;
        kotakbaz.rain.command.A.e[0x559B ^ 0x5526] = 0xFFFFAAFE ^ 0x5526;
        kotakbaz.rain.command.A.e[0x7DF2 ^ 0x7DC7] = 0x7D9B ^ 0x7DC7;
        kotakbaz.rain.command.A.e[0x8A3F ^ 0x8B0D] = 0x1D9D ^ 0x8B0D;
        kotakbaz.rain.command.A.e[0x326F ^ 0x32DE] = 0x32D6 ^ 0x32DE;
        kotakbaz.rain.command.A.e[0xDB1F ^ 0xDB75] = 0xDBD9 ^ 0xDB75;
        kotakbaz.rain.command.A.e[0xE96D ^ 0xE857] = 0xE857 ^ 0xE857;
        kotakbaz.rain.command.A.e[0x35B ^ 0x319] = 0xFFFFFCF2 ^ 0x319;
        kotakbaz.rain.command.A.e[0x167E ^ 0x17FB] = 0xD1B3 ^ 0x17FB;
        kotakbaz.rain.command.A.e[0x7297 ^ 0x721F] = 0x7270 ^ 0x721F;
        kotakbaz.rain.command.A.e[0xC2F7 ^ 0xC271] = 0xFFFF3DCC ^ 0xC271;
        kotakbaz.rain.command.A.e[0xEB20 ^ 0xEBCF] = 0xEF1BD1 ^ 0xEBCF;
        kotakbaz.rain.command.A.e[0x8BF ^ 0x898] = 0x839 ^ 0x898;
        kotakbaz.rain.command.A.e[0xF392 ^ 0xF384] = 0xFFFF0C4C ^ 0xF384;
        kotakbaz.rain.command.A.e[0xFB0E ^ 0xFA25] = 0xC162 ^ 0xFA25;
        kotakbaz.rain.command.A.e[0xC1A ^ 0xD98] = 0x1B45 ^ 0xD98;
        kotakbaz.rain.command.A.e[0xBA48 ^ 0xBA56] = 0xBA0D ^ 0xBA56;
        kotakbaz.rain.command.A.e[0x3748 ^ 0x361B] = 0x30F1 ^ 0x361B;
        kotakbaz.rain.command.A.e[0x9602 ^ 0x9713] = 0x129 ^ 0x9713;
        kotakbaz.rain.command.A.e[0xE89F ^ 0xE87B] = 0xFFFF17E6 ^ 0xE87B;
        kotakbaz.rain.command.A.e[0x1BEC ^ 0x1A8B] = 0xFFFFB35A ^ 0x1A8B;
        kotakbaz.rain.command.A.e[0x862B ^ 0x861A] = 0xFFFF79E2 ^ 0x861A;
        kotakbaz.rain.command.A.e[0xE162 ^ 0xE052] = 0xCB95 ^ 0xE052;
        kotakbaz.rain.command.A.e[0x8208 ^ 0x8252] = 0xFFFF7D6D ^ 0x8252;
        kotakbaz.rain.command.A.e[0xA3CB ^ 0xA2A8] = 0xFFFFF62E ^ 0xA2A8;
        kotakbaz.rain.command.A.e[0x468E ^ 0x47CA] = 0xE8F2 ^ 0x47CA;
        kotakbaz.rain.command.A.e[0x3E37 ^ 0x3EF4] = 0xFFFFC17D ^ 0x3EF4;
        kotakbaz.rain.command.A.e[0x220C ^ 0x2378] = 0x591D ^ 0x2378;
        kotakbaz.rain.command.A.e[0x1B01 ^ 0x1B47] = 0xFFFFE4AA ^ 0x1B47;
        kotakbaz.rain.command.A.e[0x46C4 ^ 0x46C6] = 0x46A8 ^ 0x46C6;
        kotakbaz.rain.command.A.e[0xF68 ^ 0xF13] = 0xF63 ^ 0xF13;
        kotakbaz.rain.command.A.e[0x69EF ^ 0x69C0] = 0xFFFF9648 ^ 0x69C0;
        kotakbaz.rain.command.A.e[0x1012A ^ 0x10024] = 0x19617 ^ 0x10024;
        kotakbaz.rain.command.A.e[0xAACE ^ 0xAB84] = 0x605 ^ 0xAB84;
        kotakbaz.rain.command.A.e[0xD02D ^ 0xD069] = 0xD070 ^ 0xD069;
        kotakbaz.rain.command.A.e[0xECA3 ^ 0xEC3A] = 0xEC13 ^ 0xEC3A;
        kotakbaz.rain.command.A.e[0xE651 ^ 0xE6CD] = 0xFFFF1916 ^ 0xE6CD;
        kotakbaz.rain.command.A.e[0x2DB6 ^ 0x2C8D] = 0x254A ^ 0x2C8D;
        kotakbaz.rain.command.A.e[0xEFE4 ^ 0xEF93] = 0xFFFF107D ^ 0xEF93;
        kotakbaz.rain.command.A.e[0x210E ^ 0x204D] = 0xFFFF70DE ^ 0x204D;
        kotakbaz.rain.command.A.e[0x8282 ^ 0x82E7] = 0x82E6 ^ 0x82E7;
        kotakbaz.rain.command.A.e[0x10356 ^ 0x103C5] = 0xFFFEFC58 ^ 0x103C5;
        kotakbaz.rain.command.A.e[0xBCE ^ 0xB91] = 0xBEA ^ 0xB91;
        kotakbaz.rain.command.A.e[0x6742 ^ 0x67B6] = 0x67B6 ^ 0x67B6;
        kotakbaz.rain.command.A.e[0x26C9 ^ 0x26C2] = 0xFFFFD972 ^ 0x26C2;
        kotakbaz.rain.command.A.e[0xFE4B ^ 0xFE7F] = 0xFFFF01DA ^ 0xFE7F;
        kotakbaz.rain.command.A.e[0x4DC8 ^ 0x4DE2] = 0x4D98 ^ 0x4DE2;
        kotakbaz.rain.command.A.e[0x2F2A ^ 0x2FC0] = 0x2F81 ^ 0x2FC0;
        kotakbaz.rain.command.A.e[0xA3C8 ^ 0xA3F1] = 0xFFFF5C91 ^ 0xA3F1;
        kotakbaz.rain.command.A.e[0x2062 ^ 0x2119] = 0xD858 ^ 0x2119;
        kotakbaz.rain.command.A.e[0x2A9D ^ 0x2AB4] = 0x2A92 ^ 0x2AB4;
        kotakbaz.rain.command.A.e[0xC57E ^ 0xC4FF] = 0xD23A ^ 0xC4FF;
        kotakbaz.rain.command.A.e[0xF45E ^ 0xF43E] = 0xFFFF0B85 ^ 0xF43E;
        kotakbaz.rain.command.A.e[0xF2C ^ 0xFA9] = 0xFFFFF05E ^ 0xFA9;
        kotakbaz.rain.command.A.e[0x722D ^ 0x737B] = 0x46F9 ^ 0x737B;
        kotakbaz.rain.command.A.e[0x9BFE ^ 0x9AE8] = 0xE51E ^ 0x9AE8;
        kotakbaz.rain.command.A.e[0xA70B ^ 0xA651] = 0xE616 ^ 0xA651;
        kotakbaz.rain.command.A.e[0x1ECF ^ 0x1EC1] = 0xFFFFE116 ^ 0x1EC1;
        kotakbaz.rain.command.A.e[0x4817 ^ 0x48E0] = 0x48E0 ^ 0x48E0;
        kotakbaz.rain.command.A.e[0x54A3 ^ 0x5441] = 0xFFFFABD6 ^ 0x5441;
        kotakbaz.rain.command.A.e[0x4D70 ^ 0x4D89] = 0x37E9 ^ 0x4D89;
        kotakbaz.rain.command.A.e[0xC2D7 ^ 0xC2EC] = 0xC29F ^ 0xC2EC;
        kotakbaz.rain.command.A.e[0x43C ^ 0x556] = 0x3E19 ^ 0x556;
        kotakbaz.rain.command.A.e[0x99C9 ^ 0x99E9] = 0x99CE ^ 0x99E9;
        kotakbaz.rain.command.A.e[0xE658 ^ 0xE7D3] = 0x1E0A ^ 0xE7D3;
        kotakbaz.rain.command.A.e[0x495A ^ 0x48D6] = 0xB16C ^ 0x48D6;
        kotakbaz.rain.command.A.e[0x6174 ^ 0x61F6] = 0xFFFF9E55 ^ 0x61F6;
        kotakbaz.rain.command.A.e[0xE96A ^ 0xE952] = 0xE967 ^ 0xE952;
        kotakbaz.rain.command.A.e[0x7C11 ^ 0x7C1C] = 0xFFFF83F6 ^ 0x7C1C;
        kotakbaz.rain.command.A.e[0xE814 ^ 0xE849] = 0xE89A ^ 0xE849;
        kotakbaz.rain.command.A.e[0xF333 ^ 0xF3F2] = 0xFFFF0C79 ^ 0xF3F2;
        kotakbaz.rain.command.A.e[0x6CD2 ^ 0x6D86] = 0x6B1C ^ 0x6D86;
        kotakbaz.rain.command.A.e[0xC7FA ^ 0xC729] = 0xC770 ^ 0xC729;
        kotakbaz.rain.command.A.e[0x856D ^ 0x8442] = 0xAFD9 ^ 0x8442;
        kotakbaz.rain.command.A.e[0x3F58 ^ 0x3E5F] = 0xD768 ^ 0x3E5F;
        kotakbaz.rain.command.A.e[0xB648 ^ 0xB715] = 0x7DC8 ^ 0xB715;
        kotakbaz.rain.command.A.e[0x101A3 ^ 0x101EB] = 0xFFFEFEDF ^ 0x101EB;
        kotakbaz.rain.command.A.e[0x18C0 ^ 0x1807] = 0xFFFFE7E7 ^ 0x1807;
        kotakbaz.rain.command.A.e[0x2E43 ^ 0x2E8B] = 0x2EBD ^ 0x2E8B;
        kotakbaz.rain.command.A.e[0xCA07 ^ 0xCA1F] = 0xFFFF35AE ^ 0xCA1F;
        kotakbaz.rain.command.A.e[0x1383 ^ 0x12A6] = 0xE323 ^ 0x12A6;
        kotakbaz.rain.command.A.e[0x1C0D ^ 0x1D2C] = 0x33F2 ^ 0x1D2C;
        kotakbaz.rain.command.A.e[0x3CA0 ^ 0x3D88] = 0xFFFF50BC ^ 0x3D88;
        kotakbaz.rain.command.A.e[0xE4DB ^ 0xE4DF] = 0xFFFF1B66 ^ 0xE4DF;
        kotakbaz.rain.command.A.e[0xD72 ^ 0xC6C] = 0x22B7 ^ 0xC6C;
        kotakbaz.rain.command.A.e[0xDD9E ^ 0xDD33] = 0xDDCB ^ 0xDD33;
        kotakbaz.rain.command.A.e[0x15C6 ^ 0x15D4] = 0xFFFFEA02 ^ 0x15D4;
        kotakbaz.rain.command.A.e[0xC452 ^ 0xC4AD] = 0xF798 ^ 0xC4AD;
        kotakbaz.rain.command.A.e[0x1A1 ^ 0x106] = 0xFFFFFEF8 ^ 0x106;
        kotakbaz.rain.command.A.e[0xE50D ^ 0xE53E] = 0xFFFF1AC4 ^ 0xE53E;
        kotakbaz.rain.command.A.e[0xC005 ^ 0xC0D9] = 0xFFFF3F68 ^ 0xC0D9;
        kotakbaz.rain.command.A.e[0x508 ^ 0x5C2] = 0xFFFFFA29 ^ 0x5C2;
        kotakbaz.rain.command.A.e[0xBCC4 ^ 0xBC85] = 0xBCBB ^ 0xBC85;
        kotakbaz.rain.command.A.e[0x23AD ^ 0x23A5] = 0xFFFFDC44 ^ 0x23A5;
        kotakbaz.rain.command.A.e[0x4151 ^ 0x4148] = 0x4136 ^ 0x4148;
        kotakbaz.rain.command.A.e[0xB50F ^ 0xB432] = 0x3A0E ^ 0xB432;
        kotakbaz.rain.command.A.e[0xC49E ^ 0xC415] = 0xC43B ^ 0xC415;
        kotakbaz.rain.command.A.e[0xDBAB ^ 0xDA2D] = 0x1C6A ^ 0xDA2D;
        kotakbaz.rain.command.A.e[0x6615 ^ 0x6680] = 0x6688 ^ 0x6680;
        kotakbaz.rain.command.A.e[0x4BD0 ^ 0x4A5E] = 0x71B1 ^ 0x4A5E;
        kotakbaz.rain.command.A.e[0xFE53 ^ 0xFF3B] = 0xA950 ^ 0xFF3B;
        kotakbaz.rain.command.A.e[0xBA2A ^ 0xBAF4] = 0xFFFF4559 ^ 0xBAF4;
        kotakbaz.rain.command.A.e[0x9CB6 ^ 0x9C2E] = 0x9C1A ^ 0x9C2E;
        kotakbaz.rain.command.A.e[0x53D0 ^ 0x5390] = 0xFFFFAC5C ^ 0x5390;
        kotakbaz.rain.command.A.e[0x50FF ^ 0x5192] = 0xD95B ^ 0x5192;
        kotakbaz.rain.command.A.e[0x170A ^ 0x1618] = 0x11246 ^ 0x1618;
        kotakbaz.rain.command.A.e[0xA45 ^ 0xA02] = 0xFFFFF5E2 ^ 0xA02;
        kotakbaz.rain.command.A.e[0xF657 ^ 0xF709] = 0x3DDD ^ 0xF709;
        kotakbaz.rain.command.A.e[0x1018B ^ 0x100F3] = 0x109C6 ^ 0x100F3;
        kotakbaz.rain.command.A.e[0xCEC6 ^ 0xCFEC] = 0xF4AC ^ 0xCFEC;
        kotakbaz.rain.command.A.e[0x55C0 ^ 0x55BE] = 0xFFFFAA01 ^ 0x55BE;
        kotakbaz.rain.command.A.e[0xDCC1 ^ 0xDDBF] = 0x6543 ^ 0xDDBF;
        kotakbaz.rain.command.A.e[0x5085 ^ 0x5098] = 0xFFFFAF12 ^ 0x5098;
        kotakbaz.rain.command.A.e[0x59CE ^ 0x591A] = 0x92CB6A ^ 0x591A;
        kotakbaz.rain.command.A.e[0xB688 ^ 0xB60B] = 0xB652 ^ 0xB60B;
        kotakbaz.rain.command.A.e[0x1064C ^ 0x10717] = 0xFFFEB8EB ^ 0x10717;
        kotakbaz.rain.command.A.e[0xBF1A ^ 0xBFDE] = 0xBFD1 ^ 0xBFDE;
        kotakbaz.rain.command.A.e[0xE55B ^ 0xE5E7] = 0xE5C8 ^ 0xE5E7;
        kotakbaz.rain.command.A.e[0xB674 ^ 0xB6C3] = 0xB6E3 ^ 0xB6C3;
        kotakbaz.rain.command.A.e[0xA4EC ^ 0xA4B9] = 0xFFFF5B44 ^ 0xA4B9;
        kotakbaz.rain.command.A.e[0xBE6F ^ 0xBE5F] = 0xFFFF41D2 ^ 0xBE5F;
        kotakbaz.rain.command.A.e[0x105E3 ^ 0x105B7] = 0x105E8 ^ 0x105B7;
        kotakbaz.rain.command.A.e[0xDDF1 ^ 0xDDF4] = 0xFFFF2245 ^ 0xDDF4;
        kotakbaz.rain.command.A.e[0x6CDC ^ 0x6CB1] = 0xEA93 ^ 0x6CB1;
        kotakbaz.rain.command.A.e[0x49DA ^ 0x49B3] = 0x49B3 ^ 0x49B3;
        kotakbaz.rain.command.A.e[0x8F5F ^ 0x8E29] = 0x871C ^ 0x8E29;
        kotakbaz.rain.command.A.e[0x3F93 ^ 0x3ECB] = 0xB49 ^ 0x3ECB;
        kotakbaz.rain.command.A.e[0x8CBB ^ 0x8C0F] = 0x8C57 ^ 0x8C0F;
        kotakbaz.rain.command.A.e[0x60A1 ^ 0x60DB] = 0xFFFF9F7C ^ 0x60DB;
        kotakbaz.rain.command.A.e[0xD895 ^ 0xD834] = 0xFFFF27AA ^ 0xD834;
        kotakbaz.rain.command.A.e[0x551B ^ 0x553E] = 0xFFFFAAD9 ^ 0x553E;
        kotakbaz.rain.command.A.e[0x4C39 ^ 0x4C8F] = 0x4CF4 ^ 0x4C8F;
        kotakbaz.rain.command.A.e[0x64BB ^ 0x643C] = 0xFFFF9BC8 ^ 0x643C;
        kotakbaz.rain.command.A.e[0xFAA ^ 0xE93] = 0xC4E ^ 0xE93;
        kotakbaz.rain.command.A.e[0x4138 ^ 0x4035] = 0x8BD1 ^ 0x4035;
        kotakbaz.rain.command.A.e[0x6C94 ^ 0x6CBA] = 0x6C99 ^ 0x6CBA;
        kotakbaz.rain.command.A.e[0x2D87 ^ 0x2CFD] = 0xD5E0 ^ 0x2CFD;
        kotakbaz.rain.command.A.e[0x153A ^ 0x15F5] = 0x15FF ^ 0x15F5;
        kotakbaz.rain.command.A.e[0xD6D7 ^ 0xD782] = 0xE211 ^ 0xD782;
        kotakbaz.rain.command.A.e[0x373E ^ 0x3636] = 0xDF09 ^ 0x3636;
        kotakbaz.rain.command.A.e[0x3220 ^ 0x3286] = 0x32F3 ^ 0x3286;
        kotakbaz.rain.command.A.e[0x7F9F ^ 0x7F8F] = 0xFFFF802A ^ 0x7F8F;
        kotakbaz.rain.command.A.e[0x89B ^ 0x811] = 0xFFFFF7AA ^ 0x811;
        kotakbaz.rain.command.A.e[0x4B3A ^ 0x4A14] = 0x618E ^ 0x4A14;
        kotakbaz.rain.command.A.e[0xF55F ^ 0xF45A] = 0x2FE3 ^ 0xF45A;
        kotakbaz.rain.command.A.e[0x7379 ^ 0x727D] = 0xFFFF5604 ^ 0x727D;
        kotakbaz.rain.command.A.e[0x19B3 ^ 0x18C0] = 0x62B2 ^ 0x18C0;
        kotakbaz.rain.command.A.e[0xF4A ^ 0xF90] = 0xF54 ^ 0xF90;
        kotakbaz.rain.command.A.e[0x4202 ^ 0x4293] = 0xFFFFBD33 ^ 0x4293;
        kotakbaz.rain.command.A.e[0xC2E6 ^ 0xC213] = 0xC212 ^ 0xC213;
        kotakbaz.rain.command.A.e[0xF8F0 ^ 0xF9D0] = 0xFFFF28FD ^ 0xF9D0;
        kotakbaz.rain.command.A.e[0x10BAB ^ 0x10BB1] = 0xFFFEF440 ^ 0x10BB1;
        kotakbaz.rain.command.A.e[0x5FCE ^ 0x5FC9] = 0xFFFFA041 ^ 0x5FC9;
        kotakbaz.rain.command.A.e[0x313E ^ 0x3026] = 0xFFFFB034 ^ 0x3026;
        kotakbaz.rain.command.A.e[0x2D6B ^ 0x2DFC] = 0x2DB0 ^ 0x2DFC;
        kotakbaz.rain.command.A.e[0x540E ^ 0x5447] = 0xFFFFABFB ^ 0x5447;
        kotakbaz.rain.command.A.e[0x8798 ^ 0x861B] = 0xFFFF6F4D ^ 0x861B;
        kotakbaz.rain.command.A.e[0x9AF ^ 0x8D8] = 0xFFFFFE0A ^ 0x8D8;
        kotakbaz.rain.command.A.e[0x10208 ^ 0x10388] = 0x1BB74 ^ 0x10388;
        kotakbaz.rain.command.A.e[0xEC62 ^ 0xEDEA] = 0x2BAD ^ 0xEDEA;
        kotakbaz.rain.command.A.e[0x6656 ^ 0x66ED] = 0x66D7 ^ 0x66ED;
        kotakbaz.rain.command.A.e[0xBB5 ^ 0xBC3] = 0xBC3 ^ 0xBC3;
        kotakbaz.rain.command.A.e[0xA995 ^ 0xA8F1] = 0x386 ^ 0xA8F1;
        kotakbaz.rain.command.A.e[0x5B44 ^ 0x5A69] = 0x612E ^ 0x5A69;
        kotakbaz.rain.command.A.e[0xB68B ^ 0xB6D7] = 0xB69A ^ 0xB6D7;
        kotakbaz.rain.command.A.e[0x1D87 ^ 0x1D32] = 0xFFFFE2E3 ^ 0x1D32;
        kotakbaz.rain.command.A.e[0xE2B1 ^ 0xE2CC] = 0xE27A ^ 0xE2CC;
        kotakbaz.rain.command.A.e[0x18F3 ^ 0x185D] = 0xFFFFE7C0 ^ 0x185D;
        kotakbaz.rain.command.A.e[0xF552 ^ 0xF5F9] = 0xF5F1 ^ 0xF5F9;
        kotakbaz.rain.command.A.e[0x90C8 ^ 0x90D3] = 0xFFFF6F38 ^ 0x90D3;
        kotakbaz.rain.command.A.e[0xA2A4 ^ 0xA3B0] = 0xFFFE581B ^ 0xA3B0;
        kotakbaz.rain.command.A.e[0x87FB ^ 0x8730] = 0x73F43A ^ 0x8730;
        kotakbaz.rain.command.A.e[0x8BE ^ 0x9F7] = 0xA47D ^ 0x9F7;
        kotakbaz.rain.command.A.e[0x10530 ^ 0x105AF] = 0x105C7 ^ 0x105AF;
        kotakbaz.rain.command.A.e[0xB4EB ^ 0xB4BC] = 0xFFFF4B13 ^ 0xB4BC;
        kotakbaz.rain.command.A.e[0x28EA ^ 0x2996] = 0xD08B ^ 0x2996;
        kotakbaz.rain.command.A.e[0xDEC ^ 0xDFD] = 0xDC3 ^ 0xDFD;
        kotakbaz.rain.command.A.e[0x8C79 ^ 0x8C1A] = 0x8C19 ^ 0x8C1A;
        kotakbaz.rain.command.A.e[0xC5C6 ^ 0xC481] = 0x441F ^ 0xC481;
        kotakbaz.rain.command.A.e[0x348D ^ 0x34E1] = 0x5D93 ^ 0x34E1;
        kotakbaz.rain.command.A.e[0x3A71 ^ 0x3B53] = 0xCADA ^ 0x3B53;
        kotakbaz.rain.command.A.e[0x5273 ^ 0x528D] = 0x61B3 ^ 0x528D;
        kotakbaz.rain.command.A.e[0x1388 ^ 0x136F] = 0xFFFFEC9A ^ 0x136F;
        kotakbaz.rain.command.A.e[0x594E ^ 0x59D3] = 0xFFFFA65B ^ 0x59D3;
        kotakbaz.rain.command.A.e[0x33C9 ^ 0x3281] = 0xB24B ^ 0x3281;
        kotakbaz.rain.command.A.e[0x1238 ^ 0x1367] = 0xFFFF2603 ^ 0x1367;
        kotakbaz.rain.command.A.e[0x718B ^ 0x70AC] = 0xE26B ^ 0x70AC;
        kotakbaz.rain.command.A.e[0xFBEC ^ 0xFAF5] = 0x850D ^ 0xFAF5;
        kotakbaz.rain.command.A.e[0xB49F ^ 0xB59E] = 0x86AB ^ 0xB59E;
        kotakbaz.rain.command.A.e[0x25E3 ^ 0x24E5] = 0xCDD4 ^ 0x24E5;
        kotakbaz.rain.command.A.e[0xF063 ^ 0xF030] = 0xF04E ^ 0xF030;
        kotakbaz.rain.command.A.e[0x10317 ^ 0x10233] = 0xFFFE0C72 ^ 0x10233;
        kotakbaz.rain.command.A.e[0xA9F6 ^ 0xA933] = 0xA9BD ^ 0xA933;
        kotakbaz.rain.command.A.e[0x9D7E ^ 0x9D18] = 0x9D18 ^ 0x9D18;
        kotakbaz.rain.command.A.e[0x84EC ^ 0x85E6] = 0x4E0F ^ 0x85E6;
        kotakbaz.rain.command.A.e[0x9437 ^ 0x9555] = 0x3E22 ^ 0x9555;
        kotakbaz.rain.command.A.e[0x12B6 ^ 0x1240] = 0x1241 ^ 0x1240;
        kotakbaz.rain.command.A.e[0x10E26 ^ 0x10E3A] = 0x10E7B ^ 0x10E3A;
        kotakbaz.rain.command.A.e[0xC543 ^ 0xC557] = 0xFFFF3AA2 ^ 0xC557;
        kotakbaz.rain.command.A.e[0xC366 ^ 0xC216] = 0x4AC8 ^ 0xC216;
        kotakbaz.rain.command.A.e[0xFA6 ^ 0xF6F] = 0xFFFFF0D3 ^ 0xF6F;
        kotakbaz.rain.command.A.e[0x555D ^ 0x5422] = 0xFFFF1320 ^ 0x5422;
        kotakbaz.rain.command.A.e[0x768B ^ 0x76CE] = 0x76C5 ^ 0x76CE;
        kotakbaz.rain.command.A.e[0x8C79 ^ 0x8CE2] = 0x8C5F ^ 0x8CE2;
        kotakbaz.rain.command.A.e[0x82DF ^ 0x8249] = 0xFFFF7DF5 ^ 0x8249;
        kotakbaz.rain.command.A.e[0xCE32 ^ 0xCF47] = 0xC669 ^ 0xCF47;
        kotakbaz.rain.command.A.e[0xA761 ^ 0xA60F] = 0x2ED1 ^ 0xA60F;
        kotakbaz.rain.command.A.e[0x6A1A ^ 0x6B54] = 0xD823 ^ 0x6B54;
        kotakbaz.rain.command.A.e[0x7FCA ^ 0x7F72] = 0x7F72 ^ 0x7F72;
        kotakbaz.rain.command.A.e[0xA99F ^ 0xA9BB] = 0xFFFF560B ^ 0xA9BB;
        kotakbaz.rain.command.A.e[0x23F7 ^ 0x2395] = 0x23BA ^ 0x2395;
        kotakbaz.rain.command.A.e[0x10DAF ^ 0x10CDE] = 0x176BE ^ 0x10CDE;
        kotakbaz.rain.command.A.e[0x4566 ^ 0x440D] = 0x7F57 ^ 0x440D;
        kotakbaz.rain.command.A.e[0xB2DC ^ 0xB2DD] = 0xB2C4 ^ 0xB2DD;
        kotakbaz.rain.command.A.e[0x26A ^ 0x289] = 0xFFFFFDB6 ^ 0x289;
        kotakbaz.rain.command.A.e[0x76A1 ^ 0x76A8] = 0x76EB ^ 0x76A8;
        kotakbaz.rain.command.A.e[0xBCED ^ 0xBDB4] = 0xFDFE ^ 0xBDB4;
        kotakbaz.rain.command.A.e[0xAE4B ^ 0xAE07] = 0xFFFF51D8 ^ 0xAE07;
        kotakbaz.rain.command.A.e[0x10D00 ^ 0x10C34] = 0xFFFE651F ^ 0x10C34;
        kotakbaz.rain.command.A.e[0x9156 ^ 0x90DB] = 0xAB3A ^ 0x90DB;
        kotakbaz.rain.command.A.e[0x2A2F ^ 0x2A56] = 0x2A4D ^ 0x2A56;
        kotakbaz.rain.command.A.e[0x7AF1 ^ 0x7A9F] = 0xD398 ^ 0x7A9F;
        kotakbaz.rain.command.A.e[0x24BC ^ 0x24BC] = 0x2439 ^ 0x24BC;
        kotakbaz.rain.command.A.e[0x1D29 ^ 0x1D89] = 0x1DD3 ^ 0x1D89;
        kotakbaz.rain.command.A.e[0xDEC7 ^ 0xDFAB] = 0xE4E4 ^ 0xDFAB;
        kotakbaz.rain.command.A.e[0x8B5C ^ 0x8A2E] = 0xF04B ^ 0x8A2E;
        kotakbaz.rain.command.A.e[0x869 ^ 0x848] = 0x840 ^ 0x848;
        kotakbaz.rain.command.A.e[0xB08B ^ 0xB087] = 0xFFFF4F66 ^ 0xB087;
        kotakbaz.rain.command.A.e[0xB49E ^ 0xB58E] = 0xFFFFDC68 ^ 0xB58E;
        kotakbaz.rain.command.A.e[0xEAEB ^ 0xEA27] = 0xEA23 ^ 0xEA27;
        kotakbaz.rain.command.A.e[0x618D ^ 0x60EC] = 0xCB89 ^ 0x60EC;
        kotakbaz.rain.command.A.e[0x31AE ^ 0x31F7] = 0x31BB ^ 0x31F7;
        kotakbaz.rain.command.A.e[0x5264 ^ 0x52E4] = 0xFFFFAD00 ^ 0x52E4;
        kotakbaz.rain.command.A.e[0x3E74 ^ 0x3EE0] = 0x3EF6 ^ 0x3EE0;
        kotakbaz.rain.command.A.e[0xB60F ^ 0xB618] = 0xB673 ^ 0xB618;
        kotakbaz.rain.command.A.e[0xA413 ^ 0xA47C] = 0xEE74 ^ 0xA47C;
        kotakbaz.rain.command.A.e[0x10E7B ^ 0x10F06] = 0x1B7F0 ^ 0x10F06;
        kotakbaz.rain.command.A.e[0x3B46 ^ 0x3BF5] = 0xFFFFC48C ^ 0x3BF5;
        kotakbaz.rain.command.A.e[0xAE6B ^ 0xAE1F] = 0xFDC0 ^ 0xAE1F;
        kotakbaz.rain.command.A.e[0xBC0E ^ 0xBC38] = 0xFFFF43F1 ^ 0xBC38;
        kotakbaz.rain.command.A.e[0xF1DB ^ 0xF1C8] = 0xFFFF0E37 ^ 0xF1C8;
        kotakbaz.rain.command.A.e[0x18AE ^ 0x19C8] = 0x4FA3 ^ 0x19C8;
        kotakbaz.rain.command.A.e[0xDAC ^ 0xDFA] = 0xDC6 ^ 0xDFA;
        kotakbaz.rain.command.A.e[0x62C4 ^ 0x62EC] = 0xFFFF9D67 ^ 0x62EC;
        kotakbaz.rain.command.A.e[0xF29C ^ 0xF38B] = 0x8C73 ^ 0xF38B;
        kotakbaz.rain.command.A.e[0xFC65 ^ 0xFCB5] = 0xFFFF0356 ^ 0xFCB5;
        kotakbaz.rain.command.A.e[0x2BDB ^ 0x2AF7] = 0xFFFFEE7C ^ 0x2AF7;
        kotakbaz.rain.command.A.e[0x9A5B ^ 0x9A84] = 0x9ADC ^ 0x9A84;
        kotakbaz.rain.command.A.e[0x5D2D ^ 0x5C36] = 0x79F6 ^ 0x5C36;
        kotakbaz.rain.command.A.e[0x81C3 ^ 0x8132] = 0x810F ^ 0x8132;
        kotakbaz.rain.command.A.e[0x1324 ^ 0x13D8] = 0x7D67 ^ 0x13D8;
        kotakbaz.rain.command.A.e[0x6884 ^ 0x68E0] = 0x68E0 ^ 0x68E0;
        kotakbaz.rain.command.A.e[0x9F04 ^ 0x9E80] = 0x885D ^ 0x9E80;
        kotakbaz.rain.command.A.e[0xA0B6 ^ 0xA090] = 0xA0CF ^ 0xA090;
        kotakbaz.rain.command.A.e[0x8872 ^ 0x88B2] = 0x88E3 ^ 0x88B2;
        kotakbaz.rain.command.A.e[0xC72E ^ 0xC7E8] = 0xC784 ^ 0xC7E8;
        kotakbaz.rain.command.A.e[0x27D6 ^ 0x27FA] = 0x27CF ^ 0x27FA;
        kotakbaz.rain.command.A.e[0x1CC5 ^ 0x1C4C] = 0x1C54 ^ 0x1C4C;
        kotakbaz.rain.command.A.e[0x60BE ^ 0x618B] = 0xF71F ^ 0x618B;
        kotakbaz.rain.command.A.e[0x5B5B ^ 0x5B51] = 0xFFFFA4A5 ^ 0x5B51;
        kotakbaz.rain.command.A.e[0x10CB1 ^ 0x10CDA] = 0x10C3A ^ 0x10CDA;
        kotakbaz.rain.command.A.e[0x5EC0 ^ 0x5E4F] = 0xFFFFA12B ^ 0x5E4F;
        kotakbaz.rain.command.A.e[0x4141 ^ 0x4190] = 0x41A5 ^ 0x4190;
        kotakbaz.rain.command.A.e[0x89D5 ^ 0x8984] = 0xFFFF7658 ^ 0x8984;
        kotakbaz.rain.command.A.e[0x2868 ^ 0x2843] = 0x2803 ^ 0x2843;
        kotakbaz.rain.command.A.e[0x82C1 ^ 0x82FD] = 0xFFFF7D1A ^ 0x82FD;
        kotakbaz.rain.command.A.e[0x575F ^ 0x570D] = 0xFFFFA88F ^ 0x570D;
        kotakbaz.rain.command.A.e[0xCE9D ^ 0xCF87] = 0xEA48 ^ 0xCF87;
        kotakbaz.rain.command.A.e[0xA056 ^ 0xA1D9] = 0x9A18 ^ 0xA1D9;
        kotakbaz.rain.command.A.e[0xDC99 ^ 0xDC71] = 0xFFFF2380 ^ 0xDC71;
        kotakbaz.rain.command.A.e[0xC7A0 ^ 0xC7FE] = 0xC79D ^ 0xC7FE;
        kotakbaz.rain.command.A.e[0x4C60 ^ 0x4D05] = 0x1B6F ^ 0x4D05;
        kotakbaz.rain.command.A.e[0x8B43 ^ 0x8A2C] = 0x282 ^ 0x8A2C;
        kotakbaz.rain.command.A.e[0x63C9 ^ 0x628C] = 0xE242 ^ 0x628C;
        kotakbaz.rain.command.A.e[0x5C4D ^ 0x5D1C] = 0x5B9F ^ 0x5D1C;
        kotakbaz.rain.command.A.e[0xD867 ^ 0xD844] = 0xFFFF27A6 ^ 0xD844;
        kotakbaz.rain.command.A.e[0xD774 ^ 0xD7CA] = 0xFFFF283C ^ 0xD7CA;
        kotakbaz.rain.command.A.e[0xB786 ^ 0xB699] = 0x9847 ^ 0xB699;
        kotakbaz.rain.command.A.e[0x8E34 ^ 0x8EB0] = 0xFFFF713E ^ 0x8EB0;
        kotakbaz.rain.command.A.e[0xDDC7 ^ 0xDC85] = 0x73BD ^ 0xDC85;
        kotakbaz.rain.command.A.e[0x10BCB ^ 0x10B33] = 0x17143 ^ 0x10B33;
        kotakbaz.rain.command.A.e[0x3228 ^ 0x32E6] = 0xFFFFCD0A ^ 0x32E6;
        kotakbaz.rain.command.A.e[0xB81 ^ 0xB53] = 0xB76 ^ 0xB53;
        kotakbaz.rain.command.A.e[0x6661 ^ 0x6631] = 0xFFFF99C0 ^ 0x6631;
        kotakbaz.rain.command.A.e[0x87A4 ^ 0x8708] = 0x8767 ^ 0x8708;
        kotakbaz.rain.command.A.e[0x434 ^ 0x444] = 0x2CEC ^ 0x444;
        kotakbaz.rain.command.A.e[0xE226 ^ 0xE282] = 0xE22B ^ 0xE282;
        kotakbaz.rain.command.A.e[0x6923 ^ 0x687F] = 0x2838 ^ 0x687F;
        kotakbaz.rain.command.A.e[0x7934 ^ 0x79BA] = 0xFFFF860B ^ 0x79BA;
        kotakbaz.rain.command.A.e[0x76D6 ^ 0x766C] = 0xFFFF89BB ^ 0x766C;
        kotakbaz.rain.command.A.e[0x20B6 ^ 0x201E] = 0xFFFFDFD4 ^ 0x201E;
        kotakbaz.rain.command.A.e[0x310B ^ 0x3145] = 0xFFFFCE86 ^ 0x3145;
        kotakbaz.rain.command.A.e[0x5DE ^ 0x4E6] = 0x666 ^ 0x4E6;
        kotakbaz.rain.command.A.e[0xB00 ^ 0xBCD] = 0xBB8 ^ 0xBCD;
        kotakbaz.rain.command.A.e[0x100D6 ^ 0x101D6] = 0xFFFECD08 ^ 0x101D6;
        kotakbaz.rain.command.A.e[0x3663 ^ 0x3734] = 0x2C8 ^ 0x3734;
        kotakbaz.rain.command.A.e[0x1E8E ^ 0x1E24] = 0xFFFFE19D ^ 0x1E24;
        kotakbaz.rain.command.A.e[0xA562 ^ 0xA451] = 0x32C5 ^ 0xA451;
        kotakbaz.rain.command.A.e[0x103DF ^ 0x102E9] = 0x1003C ^ 0x102E9;
        kotakbaz.rain.command.A.e[0xCAF6 ^ 0xCB96] = 0x142 ^ 0xCB96;
        kotakbaz.rain.command.A.e[0x68F5 ^ 0x6865] = 0xFFFF9781 ^ 0x6865;
        kotakbaz.rain.command.A.e[0xFA05 ^ 0xFB2C] = 0x69EB ^ 0xFB2C;
        kotakbaz.rain.command.A.e[0x930D ^ 0x925F] = 0x94C5 ^ 0x925F;
        kotakbaz.rain.command.A.e[0xC5A ^ 0xC15] = 0xC5B ^ 0xC15;
        kotakbaz.rain.command.A.e[0x11B9 ^ 0x1106] = 0xFFFFEE8A ^ 0x1106;
        kotakbaz.rain.command.A.e[0x34D4 ^ 0x340F] = 0xFFFFCBF6 ^ 0x340F;
        kotakbaz.rain.command.A.e[0xB321 ^ 0xB3E3] = 0x73C0E6 ^ 0xB3E3;
        kotakbaz.rain.command.A.e[0xE21 ^ 0xEC0] = 0xFFFFF15E ^ 0xEC0;
        kotakbaz.rain.command.A.e[0x956F ^ 0x9524] = 0x9551 ^ 0x9524;
        kotakbaz.rain.command.A.e[0xC063 ^ 0xC133] = 0x7244 ^ 0xC133;
        kotakbaz.rain.command.A.e[0xD60E ^ 0xD70D] = 0xCB4 ^ 0xD70D;
        kotakbaz.rain.command.A.e[0xA4BD ^ 0xA412] = 0xA467 ^ 0xA412;
        kotakbaz.rain.command.A.e[0xF464 ^ 0xF496] = 0xF497 ^ 0xF496;
        kotakbaz.rain.command.A.e[0x8A85 ^ 0x8B8E] = 0x406A ^ 0x8B8E;
        kotakbaz.rain.command.A.e[0x38A4 ^ 0x3893] = 0xFFFFC76F ^ 0x3893;
        kotakbaz.rain.command.A.e[0x109B ^ 0x10FC] = 0x10FE ^ 0x10FC;
        kotakbaz.rain.command.A.e[0x2CB7 ^ 0x2C36] = 0x2C4C ^ 0x2C36;
        kotakbaz.rain.command.A.e[0x673E ^ 0x6765] = 0x6710 ^ 0x6765;
        kotakbaz.rain.command.A.e[0x10361 ^ 0x1022D] = 0x1AFAC ^ 0x1022D;
        kotakbaz.rain.command.A.e[0x7E4 ^ 0x739] = 0xB1B505 ^ 0x739;
        kotakbaz.rain.command.A.e[0x6828 ^ 0x69A1] = 0x900B ^ 0x69A1;
        kotakbaz.rain.command.A.e[0xA534 ^ 0xA5E1] = 0xFFFF5A15 ^ 0xA5E1;
        kotakbaz.rain.command.A.e[0x856E ^ 0x8593] = 0xEB41 ^ 0x8593;
        kotakbaz.rain.command.A.e[0x86B8 ^ 0x8601] = 0x73F511 ^ 0x8601;
        kotakbaz.rain.command.A.e[0xF4B3 ^ 0xF4DB] = 0xF4DB ^ 0xF4DB;
        kotakbaz.rain.command.A.e[0x8A ^ 0x6F] = 0x2A ^ 0x6F;
        kotakbaz.rain.command.A.e[0x8FFE ^ 0x8F81] = 0x8FD4 ^ 0x8F81;
        kotakbaz.rain.command.A.e[0xF10F ^ 0xF1D8] = 0xFFFF0E5D ^ 0xF1D8;
        kotakbaz.rain.command.A.e[0xB8CE ^ 0xB9D3] = 0x9C13 ^ 0xB9D3;
        kotakbaz.rain.command.A.e[0xC5C7 ^ 0xC5C8] = 0xFFFF3A33 ^ 0xC5C8;
        kotakbaz.rain.command.A.e[0xA5D0 ^ 0xA579] = 0xFFFF5A91 ^ 0xA579;
        kotakbaz.rain.command.A.e[0xC6D0 ^ 0xC69D] = 0xFFFF3951 ^ 0xC69D;
        kotakbaz.rain.command.A.e[0x9A5D ^ 0x9AC7] = 0x9AEC ^ 0x9AC7;
        kotakbaz.rain.command.A.e[0x93A5 ^ 0x9222] = 0xFFFFABB4 ^ 0x9222;
        kotakbaz.rain.command.A.e[0xF83D ^ 0xF934] = 0x1003 ^ 0xF934;
        kotakbaz.rain.command.A.e[0x1EE0 ^ 0x1FF3] = 0x11BAF ^ 0x1FF3;
        kotakbaz.rain.command.A.e[0x82C2 ^ 0x83AB] = 0xB8F1 ^ 0x83AB;
        kotakbaz.rain.command.A.e[0x4EF6 ^ 0x4EDB] = 0xFFFFB170 ^ 0x4EDB;
        kotakbaz.rain.command.A.e[0xCD7A ^ 0xCDF7] = 0xCD8D ^ 0xCDF7;
        kotakbaz.rain.command.A.e[0xCF2C ^ 0xCFD7] = 0xA105 ^ 0xCFD7;
        kotakbaz.rain.command.A.e[0xF312 ^ 0xF320] = 0xFFFF0CB3 ^ 0xF320;
        kotakbaz.rain.command.A.e[0x10B5C ^ 0x10A53] = 0x19C69 ^ 0x10A53;
        kotakbaz.rain.command.A.e[0xD1F5 ^ 0xD119] = 0xD10A ^ 0xD119;
        kotakbaz.rain.command.A.e[0xA696 ^ 0xA7D6] = 0x29E9 ^ 0xA7D6;
        kotakbaz.rain.command.A.e[0xAE1B ^ 0xAF62] = 0x5679 ^ 0xAF62;
        kotakbaz.rain.command.A.e[0x1370 ^ 0x1231] = 0xBD01 ^ 0x1231;
        kotakbaz.rain.command.A.e[0x88FC ^ 0x89B7] = 0xFFFFDB94 ^ 0x89B7;
        kotakbaz.rain.command.A.e[0xFA7A ^ 0xFAF6] = 0xFFFF05E1 ^ 0xFAF6;
        kotakbaz.rain.command.A.e[0x471F ^ 0x47E5] = 0x293D ^ 0x47E5;
        kotakbaz.rain.command.A.e[0x9CC3 ^ 0x9C28] = 0xFFFF63C5 ^ 0x9C28;
        kotakbaz.rain.command.A.e[0x10C07 ^ 0x10C76] = 0x18A3C ^ 0x10C76;
        kotakbaz.rain.command.A.e[0x5DFB ^ 0x5DC6] = 0xFFFFA231 ^ 0x5DC6;
        kotakbaz.rain.command.A.e[0x9CEE ^ 0x9DDF] = 0xB644 ^ 0x9DDF;
        kotakbaz.rain.command.A.e[0xEABA ^ 0xEA24] = 0xEA36 ^ 0xEA24;
        kotakbaz.rain.command.A.e[0x3A82 ^ 0x3A5B] = 0x3A46 ^ 0x3A5B;
        kotakbaz.rain.command.A.e[0xED58 ^ 0xED00] = 0xED25 ^ 0xED00;
        kotakbaz.rain.command.A.e[0x9163 ^ 0x9159] = 0x9169 ^ 0x9159;
        kotakbaz.rain.command.A.e[0x625C ^ 0x6229] = 0xA106 ^ 0x6229;
        kotakbaz.rain.command.A.e[0xB754 ^ 0xB6DE] = 0x4F64 ^ 0xB6DE;
        kotakbaz.rain.command.A.e[0x48C1 ^ 0x4831] = 0x485D ^ 0x4831;
        kotakbaz.rain.command.A.e[0x3F24 ^ 0x3FFC] = 0xFFFFC062 ^ 0x3FFC;
        kotakbaz.rain.command.A.e[0xAF87 ^ 0xAF22] = 0xFFFF50CE ^ 0xAF22;
        kotakbaz.rain.command.A.e[0x43D4 ^ 0x4397] = 0x4397 ^ 0x4397;
        kotakbaz.rain.command.A.e[0xFC3E ^ 0xFCD3] = 0xFCA7 ^ 0xFCD3;
        kotakbaz.rain.command.A.e[0x77DE ^ 0x77E1] = 0xFFFF8812 ^ 0x77E1;
        kotakbaz.rain.command.A.e[0xDCD8 ^ 0xDDE4] = 0xD403 ^ 0xDDE4;
        kotakbaz.rain.command.A.e[0x30F8 ^ 0x3011] = 0xFFFFCFC9 ^ 0x3011;
        kotakbaz.rain.command.A.e[0x75AD ^ 0x748B] = 0xE64C ^ 0x748B;
        kotakbaz.rain.command.A.e[0x28C6 ^ 0x2989] = 0x9AE3 ^ 0x2989;
        kotakbaz.rain.command.A.e[0x88EB ^ 0x8897] = 0x88DE ^ 0x8897;
    }
}

