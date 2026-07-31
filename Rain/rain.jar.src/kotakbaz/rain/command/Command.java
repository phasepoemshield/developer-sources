/*
 * Decompiled with CFR 0.152.
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
import kotakbaz.rain.client.interfaces.ILoadable;
import kotakbaz.rain.command.b;
import kotakbaz.rain.command.commands.ConfigCommand;
import kotakbaz.rain.command.commands.FriendCommand;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.network.ClientCommandSource;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J!\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u001f\u001a&\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d \u001e*\u0012\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d\u0018\u00010\u001c0\u001c2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070#\u00a2\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\b&\u0010'J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020(\u00a2\u0006\u0004\b&\u0010)J\u000f\u0010+\u001a\u00020*H\u0002\u00a2\u0006\u0004\b+\u0010,R&\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u001a0-0#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b/\u00100R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u0016018\u0006\u00a2\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u0007068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b7\u00100\u00a8\u00068"}, d2={"Lkotakbaz/rain/command/CommandManager;", "Lkotakbaz/rain/client/interfaces/ILoadable;", "<init>", "()V", "", "load", "", "Lkotakbaz/rain/command/Command;", "commands", "registerCommands", "([Lkotakbaz/rain/command/Command;)V", "", "getPrefix", "()Ljava/lang/String;", "message", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;", "ci", "createCommands", "(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V", "Lcom/mojang/brigadier/StringReader;", "reader", "Lcom/mojang/brigadier/ParseResults;", "Lnet/minecraft/class_637;", "parse", "(Lcom/mojang/brigadier/StringReader;)Lcom/mojang/brigadier/ParseResults;", "parseResults", "", "cursor", "Ljava/util/concurrent/CompletableFuture;", "Lcom/mojang/brigadier/suggestion/Suggestions;", "kotlin.jvm.PlatformType", "suggest", "(Lcom/mojang/brigadier/ParseResults;I)Ljava/util/concurrent/CompletableFuture;", "source", "()Lnet/minecraft/class_637;", "", "getCommands", "()Ljava/util/List;", "sendClientMessage", "(Ljava/lang/String;)V", "Lnet/minecraft/class_2561;", "(Lnet/minecraft/class_2561;)V", "Lnet/minecraft/class_5250;", "buildPrefix", "()Lnet/minecraft/class_5250;", "Lkotlin/Pair;", "", "prefixSegments", "Ljava/util/List;", "Lcom/mojang/brigadier/CommandDispatcher;", "dispatcher", "Lcom/mojang/brigadier/CommandDispatcher;", "getDispatcher", "()Lcom/mojang/brigadier/CommandDispatcher;", "", "commandList", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nCommandManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandManager.kt\nkotakbaz/rain/command/CommandManager\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n14060#2,2:100\n1915#3,2:102\n*S KotlinDebug\n*F\n+ 1 CommandManager.kt\nkotakbaz/rain/command/CommandManager\n*L\n40#1:100,2\n87#1:102,2\n*E\n"})
public final class Command
implements ILoadable {
    @NotNull
    public static final Command INSTANCE;
    @NotNull
    private static final List<Pair<Character, Integer>> a;
    @NotNull
    private static final CommandDispatcher<ClientCommandSource> A;
    @NotNull
    private static final List<b> b;
    private static Object[] B;
    private static Object C;
    private static Object[] d;
    private static Object[] c;
    private static Object[] D;
    public static int[] e;

    private Command() {
    }

    @NotNull
    public final CommandDispatcher<ClientCommandSource> getDispatcher() {
        return A;
    }

    @Override
    public void load() {
        int n2 = e[0];
        n2 -= e[1];
        b[] bArray = new b[n2 ^= e[2]];
        int n3 = e[3];
        n3 -= e[4];
        bArray[n3 += Command.e[5]] = ConfigCommand.INSTANCE;
        int n4 = e[6];
        n4 ^= e[7];
        bArray[n4 += Command.e[8]] = FriendCommand.INSTANCE;
        this.registerCommands(bArray);
    }

    public final void registerCommands(b ... commands) {
        long l2 = 5689581167614110696L;
        long l3 = -8530843076012256050L;
        long l4 = 5300932483287829515L;
        long l5 = -9208574722253803902L;
        int n2 = e[9];
        n2 ^= e[10];
        Intrinsics.checkNotNullParameter(commands, (String)B[n2 ^= e[11]]);
        b[] bArray = commands;
        long l6 = l2;
        int n3 = e[12];
        n3 -= e[13];
        l2 = l6 ^ (0L ^ l6) & -1L << (n3 -= e[14]);
        long l7 = l5;
        int n4 = e[15];
        n4 ^= e[16];
        l5 = l7 ^ (0L ^ l7) & -1L >>> (n4 -= e[17]);
        int n5 = e[18];
        n5 += e[19];
        long l8 = l4;
        int n6 = e[21];
        n6 ^= e[22];
        l4 = l8 ^ ((long)bArray.length << (n5 ^= e[20]) ^ l8) & -1L << (n6 ^= e[23]);
        while (true) {
            b b2;
            int n7 = e[24];
            n7 += e[25];
            if ((int)l5 >= (int)(l4 >>> (n7 += e[26]))) break;
            b b3 = b2 = bArray[(int)l5];
            long l9 = l5;
            int n8 = e[27];
            n8 -= e[28];
            l5 = l9 ^ (0L ^ l9) & -1L << (n8 ^= e[29]);
            b3.register(A);
            b.add(b3);
            long l10 = l5;
            int n9 = e[30];
            n9 += e[31];
            int n10 = e[33];
            n10 ^= e[34];
            l5 = l10 ^ (l10 ^ l10 + (long)(n9 -= e[32])) & -1L >>> (n10 ^= e[35]);
        }
    }

    @NotNull
    public final String getPrefix() {
        int n2 = e[36];
        n2 ^= e[37];
        return (String)B[n2 ^= e[38]];
    }

    public final void createCommands(@NotNull String message, @NotNull CallbackInfo ci) {
        int n2 = e[39];
        n2 += e[40];
        Intrinsics.checkNotNullParameter(message, (String)B[n2 ^= e[41]]);
        int n3 = e[42];
        n3 ^= e[43];
        Intrinsics.checkNotNullParameter(ci, (String)B[n3 -= e[44]]);
        boolean bl = e[45];
        bl -= e[46];
        int n4 = e[48];
        n4 -= e[49];
        if (StringsKt.startsWith$default(message, this.getPrefix(), bl -= e[47], n4 -= e[50], null)) {
            try {
                String string = message.substring(this.getPrefix().length());
                int n5 = e[51];
                n5 -= e[52];
                Intrinsics.checkNotNullExpressionValue(string, (String)B[n5 ^= e[53]]);
                A.execute(string, (Object)this.source());
            }
            catch (CommandSyntaxException commandSyntaxException) {
                // empty catch block
            }
            ci.cancel();
        }
    }

    @Nullable
    public final ParseResults<ClientCommandSource> parse(@NotNull StringReader reader) {
        int n2 = e[54];
        n2 -= e[55];
        Intrinsics.checkNotNullParameter(reader, (String)B[n2 += e[56]]);
        ClientCommandSource clientCommandSource = this.source();
        if (clientCommandSource == null) {
            return null;
        }
        ClientCommandSource clientCommandSource2 = clientCommandSource;
        return A.parse(reader, (Object)clientCommandSource2);
    }

    public final CompletableFuture<Suggestions> suggest(@NotNull ParseResults<?> parseResults, int cursor) {
        int n2 = e[57];
        n2 += e[58];
        Intrinsics.checkNotNullParameter(parseResults, (String)B[n2 += e[59]]);
        return A.getCompletionSuggestions(parseResults, cursor);
    }

    @Nullable
    public final ClientCommandSource source() {
        ClientPlayNetworkHandler clientPlayNetworkHandler = kotakbaz.rain.client.extensions.b.getMc().getNetworkHandler();
        return clientPlayNetworkHandler != null ? clientPlayNetworkHandler.getCommandSource() : null;
    }

    @NotNull
    public final List<b> getCommands() {
        return CollectionsKt.toList((Iterable)b);
    }

    public final void sendClientMessage(@NotNull String message) {
        int n2 = e[60];
        n2 -= e[61];
        Intrinsics.checkNotNullParameter(message, (String)B[n2 -= e[62]]);
        MutableText mutableText = Text.literal((String)message);
        int n3 = e[63];
        n3 ^= e[64];
        Intrinsics.checkNotNullExpressionValue(mutableText, (String)B[n3 ^= e[65]]);
        this.sendClientMessage((Text)mutableText);
    }

    public final void sendClientMessage(@NotNull Text message) {
        int n2 = e[66];
        n2 += e[67];
        Intrinsics.checkNotNullParameter(message, (String)B[n2 += e[68]]);
        InGameHud inGameHud = kotakbaz.rain.client.extensions.b.getMc().inGameHud;
        if (inGameHud == null) {
            return;
        }
        InGameHud inGameHud2 = inGameHud;
        int n3 = e[69];
        n3 ^= e[70];
        inGameHud2.getChatHud().addMessage((Text)this.buildPrefix().append((Text)Text.literal((String)((String)B[n3 ^= e[71]]))).append(message));
    }

    private final MutableText buildPrefix() {
        long l2 = -7664636704821420513L;
        long l3 = 6895591440661014939L;
        long l4 = 830852544547540890L;
        MutableText mutableText = Text.empty();
        Iterable iterable = a;
        long l5 = l2;
        int n2 = e[72];
        n2 ^= e[73];
        l2 = l5 ^ (0L ^ l5) & -1L << (n2 += e[74]);
        for (Object t2 : iterable) {
            Pair pair = (Pair)t2;
            long l6 = l2;
            int n3 = e[75];
            n3 += e[76];
            l2 = l6 ^ (0L ^ l6) & -1L >>> (n3 += e[77]);
            int n4 = e[78];
            n4 += e[79];
            long l7 = l4;
            int n5 = e[81];
            n5 ^= e[82];
            long l8 = l4 = l7 ^ ((long)((Character)pair.component1()).charValue() << (n4 -= e[80]) ^ l7) & -1L << (n5 ^= e[83]);
            int n6 = e[84];
            n6 += e[85];
            l4 = l8 ^ ((long)((Number)pair.component2()).intValue() ^ l8) & -1L >>> (n6 -= e[86]);
            int n7 = e[87];
            n7 += e[88];
            boolean bl = e[90];
            bl += e[91];
            mutableText.append((Text)Text.literal((String)String.valueOf((char)(l4 >>> (n7 += e[89])))).setStyle(Style.EMPTY.withColor(TextColor.fromRgb((int)((int)l4))).withBold(Boolean.valueOf(bl += e[92]))));
        }
        Intrinsics.checkNotNull(mutableText);
        return mutableText;
    }

    static {
        Command.b();
        long l2 = -6678676748290356835L;
        long l3 = -2734320745208630622L;
        long l4 = 27139509924755052L;
        long l5 = -2271036689785417280L;
        long l6 = -7585232878999742174L;
        long l7 = -3328815823118349612L;
        long l8 = -5637394700952833502L;
        long l9 = 4856611421268944200L;
        long l10 = 441469431577427053L;
        long l11 = 6549556477410580360L;
        long l12 = 4506760283982230068L;
        long l13 = -5105934757506748495L;
        long l14 = 4225580658853627565L;
        long l15 = -8071215126282841208L;
        int n2 = e[93];
        n2 -= e[94];
        B = new Object[n2 ^= e[95]];
        long l16 = l15;
        int n3 = e[96];
        n3 ^= e[97];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += e[98]);
        Object[] objectArray = new Object[e[99]];
        objectArray[Command.e[100]] = c;
        objectArray[Command.e[101]] = e[102];
        int n4 = e[103];
        Object object = Command.A()[e[104]];
        if (object == null) {
            char[] cArray = "\ud55c\ud55d\ud55b\ud52d\ud531\ud48f\ud560\ud555\ud48f\ud533\ud53d\ud53f\ud52d\ud540\ud562\ud48d\ud54d\ud53b\ud536\ud54d\ud530\ud536\ud54a\ud556\ud560\ud531\ud555\ud52a\ud55a\ud538\ud492\ud550\ud538\ud504\ud563\ud54b\ud4fb\ud556\ud4fc\ud54c\ud53b\ud54c\ud552\ud530\ud555\ud55d\ud52d\ud544\ud4fc\ud4fa\ud53e\ud550\ud542\ud564\ud54d\ud54e\ud493\ud530\ud492\ud538\ud531\ud551\ud536\ud538\ud539\ud556\ud54e\ud530\ud539\ud54c\ud555\ud504\ud556\ud540\ud531\ud536\ud558\ud504\ud556\ud54e\ud54f\ud537\ud53e\ud492\ud542\ud4fc\ud52f\ud54e\ud4fa\ud544\ud55f\ud53f\ud563\ud4f8\ud54b\ud53b\ud539\ud53b\ud55f\ud537\ud535\ud560\ud53c\ud54f\ud530\ud564\ud535\ud55e\ud54c\ud53d\ud4f8\ud55d\ud52d\ud4fa\ud537\ud538\ud531\ud55a\ud54b\ud551\ud4fb\ud53d\ud551\ud54f\ud4fc\ud556\ud52e\ud54d\ud52e\ud54a\ud48e\ud544\ud540\ud541\ud560\ud53a\ud52b\ud530\ud552\ud564\ud557\ud54f\ud564\ud54c\ud492\ud504\ud54a\ud543\ud53d\ud537\ud53e\ud4f8\ud559\ud544\ud550\ud4fc\ud551\ud52b\ud504\ud492\ud53c\ud493\ud4fa\ud493\ud4fa\ud4fc\ud564\ud492\ud54f\ud535\ud544\ud546".toCharArray();
            for (int i2 = e[105]; i2 < e[106]; ++i2) {
                int n5 = cArray[i2];
                n5 -= e[107];
                n5 -= e[108];
                n5 -= e[109];
                n5 += e[110];
                n5 += e[111];
                n5 ^= e[112];
                n5 -= e[113];
                n5 += e[114];
                n5 -= e[115];
                n5 += e[116];
                cArray[i2] = (char)(n5 -= e[117]);
            }
            object = Command.A()[Command.e[118]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)Command.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = e[119];
        n6 ^= e[120];
        l6 = l17 ^ (0x6300000000L ^ l17) & -1L << (n6 -= e[121]);
        long l18 = l13;
        int n7 = e[122];
        n7 ^= e[123];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += e[124]);
        while (true) {
            int n8 = e[125];
            n8 += e[126];
            if ((int)l13 >= (int)(l6 >>> (n8 -= e[127]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = e[128];
            n10 += e[129];
            int n11 = e[131];
            n11 ^= e[132];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += e[130])) & -1L >>> (n11 ^= e[133]);
            long l20 = l9;
            int n12 = e[134];
            n12 += e[135];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += e[136]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = e[137];
            n14 += e[138];
            int n15 = e[140];
            n15 += e[141];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 += e[139])) & -1L >>> (n15 ^= e[142]);
            int n16 = e[143];
            n16 -= e[144];
            long l22 = l10;
            int n17 = e[146];
            n17 ^= e[147];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= e[145]) ^ l22) & -1L << (n17 += e[148]);
            int n18 = e[149];
            n18 += e[150];
            n18 += e[151];
            int n19 = e[152];
            n19 -= e[153];
            long l23 = l12;
            int n20 = e[155];
            n20 += e[156];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= e[154]))) ^ l23) & -1L >>> (n20 += e[157]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = e[158];
            n21 ^= e[159];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= e[160]);
            while (true) {
                int n22 = e[161];
                n22 += e[162];
                if ((int)(l14 >>> (n22 ^= e[163])) >= (int)l12) break;
                int n23 = e[164];
                n23 += e[165];
                int n24 = e[167];
                n24 += e[168];
                cArray2[(int)(l14 >>> (n23 -= Command.e[166]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= e[169]))];
                l14 += 0x100000000L;
            }
            int n25 = e[170];
            n25 -= e[171];
            int n26 = (int)(l15 >>> (n25 += e[172]));
            l15 += 0x100000000L;
            Command.B[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = e[173];
            n27 += e[174];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= e[175]);
        }
        INSTANCE = new Command();
        int n28 = e[176];
        n28 += e[177];
        Pair[] pairArray = new Pair[n28 -= e[178]];
        int n29 = e[179];
        n29 += e[180];
        char c2 = e[182];
        c2 ^= e[183];
        int n30 = e[185];
        n30 -= e[186];
        pairArray[n29 ^= Command.e[181]] = TuplesKt.to(Character.valueOf(c2 -= e[184]), n30 += e[187]);
        int n31 = e[188];
        n31 ^= e[189];
        char c3 = e[191];
        c3 += e[192];
        int n32 = e[194];
        n32 -= e[195];
        pairArray[n31 ^= Command.e[190]] = TuplesKt.to(Character.valueOf(c3 -= e[193]), n32 ^= e[196]);
        int n33 = e[197];
        n33 -= e[198];
        char c4 = e[200];
        c4 ^= e[201];
        int n34 = e[203];
        n34 -= e[204];
        pairArray[n33 += Command.e[199]] = TuplesKt.to(Character.valueOf(c4 ^= e[202]), n34 ^= e[205]);
        int n35 = e[206];
        n35 ^= e[207];
        char c5 = e[209];
        c5 ^= e[210];
        int n36 = e[212];
        n36 += e[213];
        pairArray[n35 -= Command.e[208]] = TuplesKt.to(Character.valueOf(c5 += e[211]), n36 -= e[214]);
        int n37 = e[215];
        n37 -= e[216];
        char c6 = e[218];
        c6 += e[219];
        int n38 = e[221];
        n38 += e[222];
        pairArray[n37 += Command.e[217]] = TuplesKt.to(Character.valueOf(c6 += e[220]), n38 ^= e[223]);
        int n39 = e[224];
        n39 += e[225];
        char c7 = e[227];
        c7 ^= e[228];
        int n40 = e[230];
        n40 ^= e[231];
        pairArray[n39 ^= Command.e[226]] = TuplesKt.to(Character.valueOf(c7 -= e[229]), n40 ^= e[232]);
        int n41 = e[233];
        n41 += e[234];
        char c8 = e[236];
        c8 ^= e[237];
        int n42 = e[239];
        n42 -= e[240];
        pairArray[n41 += Command.e[235]] = TuplesKt.to(Character.valueOf(c8 += e[238]), n42 += e[241]);
        a = CollectionsKt.listOf(pairArray);
        A = new CommandDispatcher();
        b = new ArrayList();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[e[242]];
        String string = (String)object[e[243]];
        object = object[e[244]];
        Object[] objectArray = d;
        if (d == null) {
            objectArray = d = new Object[e[245]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[e[246]];
                c = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[e[248] ^ e[249]];
                byArray[Command.e[250] ^ Command.e[251]] = e[252] ^ e[253];
                byArray[Command.e[254] ^ Command.e[255]] = e[256] ^ e[257];
                byArray[Command.e[258] ^ Command.e[259]] = e[260] ^ e[261];
                byArray[Command.e[262] ^ Command.e[263]] = e[264] ^ e[265];
                byArray[Command.e[266] ^ Command.e[267]] = e[268] ^ e[269];
                byArray[Command.e[270] ^ Command.e[271]] = e[272] ^ e[273];
                byArray[Command.e[274] ^ Command.e[275]] = e[276] ^ e[277];
                byArray[Command.e[278] ^ Command.e[279]] = e[280] ^ e[281];
                byArray[Command.e[282] ^ Command.e[283]] = e[284] ^ e[285];
                byArray[Command.e[286] ^ Command.e[287]] = e[288] ^ e[289];
                byArray[Command.e[290] ^ Command.e[291]] = e[292] ^ e[293];
                byArray[Command.e[294] ^ Command.e[295]] = e[296] ^ e[297];
                byArray[Command.e[298] ^ Command.e[299]] = e[300] ^ e[301];
                byArray[Command.e[302] ^ Command.e[303]] = e[304] ^ e[305];
                byArray[Command.e[306] ^ Command.e[307]] = e[308] ^ e[309];
                byArray[Command.e[310] ^ Command.e[311]] = e[312] ^ e[313];
                objectArray2[Command.e[247]] = byArray;
            }
            byte[] byArray = (byte[])object3[e[314]];
            if (C == null) {
                byte[] byArray2 = new byte[e[315] ^ e[316]];
                byArray2[Command.e[317] ^ Command.e[318]] = e[319] ^ e[320];
                byArray2[Command.e[321] ^ Command.e[322]] = e[323] ^ e[324];
                byArray2[Command.e[325] ^ Command.e[326]] = e[327] ^ e[328];
                byArray2[Command.e[329] ^ Command.e[330]] = e[331] ^ e[332];
                byArray2[Command.e[333] ^ Command.e[334]] = e[335] ^ e[336];
                byArray2[Command.e[337] ^ Command.e[338]] = e[339] ^ e[340];
                byArray2[Command.e[341] ^ Command.e[342]] = e[343] ^ e[344];
                byArray2[Command.e[345] ^ Command.e[346]] = e[347] ^ e[348];
                byArray2[Command.e[349] ^ Command.e[350]] = e[351] ^ e[352];
                byArray2[Command.e[353] ^ Command.e[354]] = e[355] ^ e[356];
                byArray2[Command.e[357] ^ Command.e[358]] = e[359] ^ e[360];
                byArray2[Command.e[361] ^ Command.e[362]] = e[363] ^ e[364];
                byArray2[Command.e[365] ^ Command.e[366]] = e[367] ^ e[368];
                byArray2[Command.e[369] ^ Command.e[370]] = e[371] ^ e[372];
                byArray2[Command.e[373] ^ Command.e[374]] = e[375] ^ e[376];
                byArray2[Command.e[377] ^ Command.e[378]] = e[379] ^ e[380];
                byArray2[Command.e[381] ^ Command.e[382]] = e[383] ^ e[384];
                byArray2[Command.e[385] ^ Command.e[386]] = e[387] ^ e[388];
                byArray2[Command.e[389] ^ Command.e[390]] = e[391] ^ e[392];
                byArray2[Command.e[393] ^ Command.e[394]] = e[395] ^ e[396];
                byArray2[Command.e[397] ^ Command.e[398]] = e[399] ^ 0x3BEF;
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
                Object object4 = Command.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u2ece\u2ec0\u2ecb\u2ec2\u2ec4\u2eb0\u2e97\u2ea9\u2ef2\u2ea6\u2ec6\u2ead\u2ea1\u2ea3\u2e93\u2ec6\u2ec1\u2eb1".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 -= 19728;
                        n3 ^= 0x1221;
                        n3 -= 53650;
                        n3 += 18131;
                        n3 -= 56740;
                        n3 += 47077;
                        n3 -= 59959;
                        n3 -= 40813;
                        n3 -= 1839;
                        n3 -= 15935;
                        cArray[i2] = (char)(n3 -= 29631);
                    }
                    object4 = Command.A()[1] = new String(cArray);
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
                Object object5 = Command.A()[2];
                if (object5 == null) {
                    char[] cArray = "\uba8b\uba8f\uba99".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 += 57808;
                        n4 += 38576;
                        n4 ^= 0xBC63;
                        n4 -= 4773;
                        n4 ^= 0x6A17;
                        n4 -= 59498;
                        n4 -= 6908;
                        n4 ^= 0x2BBE;
                        n4 += 52350;
                        n4 -= 33118;
                        cArray[i3] = (char)(n4 -= 33711);
                    }
                    object5 = Command.A()[2] = new String(cArray);
                }
                C = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = Command.A()[3];
            if (object6 == null) {
                char[] cArray = "\u9eba\u9eb6\u9ea8\u9e8c\u9eb8\u9eb9\u9eb8\u9e8c\u9eab\u9eb0\u9eb8\u9ea8\u9e86\u9eab\u9eda\u9ed7\u9ed7\u9ed2\u9ecd\u9ed4".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 28817;
                    n5 += 8945;
                    n5 += 32324;
                    n5 -= 56933;
                    n5 += 9669;
                    n5 -= 63496;
                    n5 += 1244;
                    n5 += 65437;
                    n5 += 5807;
                    cArray[i4] = (char)(n5 ^= 0x399F);
                }
                object6 = Command.A()[3] = new String(cArray);
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
        Command.e[0x3837 ^ 0x392B] = 0xFFFFE302 ^ 0x392B;
        Command.e[0x9BBE ^ 0x9BCD] = 0x1311 ^ 0x9BCD;
        Command.e[0x331D ^ 0x3365] = 0xFFFFCCB0 ^ 0x3365;
        Command.e[0x3240 ^ 0x3296] = 0xFFFFCD44 ^ 0x3296;
        Command.e[0xECE2 ^ 0xEDF7] = 0x1E9AB ^ 0xEDF7;
        Command.e[0xBE48 ^ 0xBEA6] = 0xFFFF4175 ^ 0xBEA6;
        Command.e[0x10347 ^ 0x103E5] = 0x103B2 ^ 0x103E5;
        Command.e[0x6291 ^ 0x6203] = 0xFFFF9D94 ^ 0x6203;
        Command.e[0xF921 ^ 0xF86C] = 0x4B17 ^ 0xF86C;
        Command.e[0x4279 ^ 0x42CB] = 0x42F0 ^ 0x42CB;
        Command.e[0x10E99 ^ 0x10ED3] = 0xFFFEF14B ^ 0x10ED3;
        Command.e[0xAE3C ^ 0xAF03] = 0x2150 ^ 0xAF03;
        Command.e[0x203A ^ 0x202F] = 0xFFFFDFAC ^ 0x202F;
        Command.e[0x54FF ^ 0x5419] = 0xD084CD ^ 0x5419;
        Command.e[0x52D0 ^ 0x5273] = 0xFFFFADA6 ^ 0x5273;
        Command.e[0x30D9 ^ 0x3039] = 0xFFFFCFCD ^ 0x3039;
        Command.e[0x10707 ^ 0x1060B] = 0x1CDB6 ^ 0x1060B;
        Command.e[0x834D ^ 0x820B] = 0x2C1 ^ 0x820B;
        Command.e[0x460B ^ 0x46F8] = 0x46FA ^ 0x46F8;
        Command.e[0x10C57 ^ 0x10C36] = 0x10C7C ^ 0x10C36;
        Command.e[0x204F ^ 0x214D] = 0xFAF7 ^ 0x214D;
        Command.e[0xECF ^ 0xEC9] = 0xFFFFF161 ^ 0xEC9;
        Command.e[0x7D4C ^ 0x7C72] = 0xF24D ^ 0x7C72;
        Command.e[0x2E1F ^ 0x2F3C] = 0xDEB9 ^ 0x2F3C;
        Command.e[0x86D3 ^ 0x87E4] = 0x8539 ^ 0x87E4;
        Command.e[0xDE14 ^ 0xDE2A] = 0xFFFF21DA ^ 0xDE2A;
        Command.e[0xF92B ^ 0xF928] = 0xF920 ^ 0xF928;
        Command.e[0xF606 ^ 0xF624] = 0xFFFF09EE ^ 0xF624;
        Command.e[0xE59F ^ 0xE5ED] = 0x9A87 ^ 0xE5ED;
        Command.e[0xB0CC ^ 0xB0D3] = 0xFFFF4F1E ^ 0xB0D3;
        Command.e[0xAA0B ^ 0xAABB] = 0xAA81 ^ 0xAABB;
        Command.e[0x559B ^ 0x5526] = 0xFFFFAAFE ^ 0x5526;
        Command.e[0x7DF2 ^ 0x7DC7] = 0x7D9B ^ 0x7DC7;
        Command.e[0x8A3F ^ 0x8B0D] = 0x1D9D ^ 0x8B0D;
        Command.e[0x326F ^ 0x32DE] = 0x32D6 ^ 0x32DE;
        Command.e[0xDB1F ^ 0xDB75] = 0xDBD9 ^ 0xDB75;
        Command.e[0xE96D ^ 0xE857] = 0xE857 ^ 0xE857;
        Command.e[0x35B ^ 0x319] = 0xFFFFFCF2 ^ 0x319;
        Command.e[0x167E ^ 0x17FB] = 0xD1B3 ^ 0x17FB;
        Command.e[0x7297 ^ 0x721F] = 0x7270 ^ 0x721F;
        Command.e[0xC2F7 ^ 0xC271] = 0xFFFF3DCC ^ 0xC271;
        Command.e[0xEB20 ^ 0xEBCF] = 0xEF1BD1 ^ 0xEBCF;
        Command.e[0x8BF ^ 0x898] = 0x839 ^ 0x898;
        Command.e[0xF392 ^ 0xF384] = 0xFFFF0C4C ^ 0xF384;
        Command.e[0xFB0E ^ 0xFA25] = 0xC162 ^ 0xFA25;
        Command.e[0xC1A ^ 0xD98] = 0x1B45 ^ 0xD98;
        Command.e[0xBA48 ^ 0xBA56] = 0xBA0D ^ 0xBA56;
        Command.e[0x3748 ^ 0x361B] = 0x30F1 ^ 0x361B;
        Command.e[0x9602 ^ 0x9713] = 0x129 ^ 0x9713;
        Command.e[0xE89F ^ 0xE87B] = 0xFFFF17E6 ^ 0xE87B;
        Command.e[0x1BEC ^ 0x1A8B] = 0xFFFFB35A ^ 0x1A8B;
        Command.e[0x862B ^ 0x861A] = 0xFFFF79E2 ^ 0x861A;
        Command.e[0xE162 ^ 0xE052] = 0xCB95 ^ 0xE052;
        Command.e[0x8208 ^ 0x8252] = 0xFFFF7D6D ^ 0x8252;
        Command.e[0xA3CB ^ 0xA2A8] = 0xFFFFF62E ^ 0xA2A8;
        Command.e[0x468E ^ 0x47CA] = 0xE8F2 ^ 0x47CA;
        Command.e[0x3E37 ^ 0x3EF4] = 0xFFFFC17D ^ 0x3EF4;
        Command.e[0x220C ^ 0x2378] = 0x591D ^ 0x2378;
        Command.e[0x1B01 ^ 0x1B47] = 0xFFFFE4AA ^ 0x1B47;
        Command.e[0x46C4 ^ 0x46C6] = 0x46A8 ^ 0x46C6;
        Command.e[0xF68 ^ 0xF13] = 0xF63 ^ 0xF13;
        Command.e[0x69EF ^ 0x69C0] = 0xFFFF9648 ^ 0x69C0;
        Command.e[0x1012A ^ 0x10024] = 0x19617 ^ 0x10024;
        Command.e[0xAACE ^ 0xAB84] = 0x605 ^ 0xAB84;
        Command.e[0xD02D ^ 0xD069] = 0xD070 ^ 0xD069;
        Command.e[0xECA3 ^ 0xEC3A] = 0xEC13 ^ 0xEC3A;
        Command.e[0xE651 ^ 0xE6CD] = 0xFFFF1916 ^ 0xE6CD;
        Command.e[0x2DB6 ^ 0x2C8D] = 0x254A ^ 0x2C8D;
        Command.e[0xEFE4 ^ 0xEF93] = 0xFFFF107D ^ 0xEF93;
        Command.e[0x210E ^ 0x204D] = 0xFFFF70DE ^ 0x204D;
        Command.e[0x8282 ^ 0x82E7] = 0x82E6 ^ 0x82E7;
        Command.e[0x10356 ^ 0x103C5] = 0xFFFEFC58 ^ 0x103C5;
        Command.e[0xBCE ^ 0xB91] = 0xBEA ^ 0xB91;
        Command.e[0x6742 ^ 0x67B6] = 0x67B6 ^ 0x67B6;
        Command.e[0x26C9 ^ 0x26C2] = 0xFFFFD972 ^ 0x26C2;
        Command.e[0xFE4B ^ 0xFE7F] = 0xFFFF01DA ^ 0xFE7F;
        Command.e[0x4DC8 ^ 0x4DE2] = 0x4D98 ^ 0x4DE2;
        Command.e[0x2F2A ^ 0x2FC0] = 0x2F81 ^ 0x2FC0;
        Command.e[0xA3C8 ^ 0xA3F1] = 0xFFFF5C91 ^ 0xA3F1;
        Command.e[0x2062 ^ 0x2119] = 0xD858 ^ 0x2119;
        Command.e[0x2A9D ^ 0x2AB4] = 0x2A92 ^ 0x2AB4;
        Command.e[0xC57E ^ 0xC4FF] = 0xD23A ^ 0xC4FF;
        Command.e[0xF45E ^ 0xF43E] = 0xFFFF0B85 ^ 0xF43E;
        Command.e[0xF2C ^ 0xFA9] = 0xFFFFF05E ^ 0xFA9;
        Command.e[0x722D ^ 0x737B] = 0x46F9 ^ 0x737B;
        Command.e[0x9BFE ^ 0x9AE8] = 0xE51E ^ 0x9AE8;
        Command.e[0xA70B ^ 0xA651] = 0xE616 ^ 0xA651;
        Command.e[0x1ECF ^ 0x1EC1] = 0xFFFFE116 ^ 0x1EC1;
        Command.e[0x4817 ^ 0x48E0] = 0x48E0 ^ 0x48E0;
        Command.e[0x54A3 ^ 0x5441] = 0xFFFFABD6 ^ 0x5441;
        Command.e[0x4D70 ^ 0x4D89] = 0x37E9 ^ 0x4D89;
        Command.e[0xC2D7 ^ 0xC2EC] = 0xC29F ^ 0xC2EC;
        Command.e[0x43C ^ 0x556] = 0x3E19 ^ 0x556;
        Command.e[0x99C9 ^ 0x99E9] = 0x99CE ^ 0x99E9;
        Command.e[0xE658 ^ 0xE7D3] = 0x1E0A ^ 0xE7D3;
        Command.e[0x495A ^ 0x48D6] = 0xB16C ^ 0x48D6;
        Command.e[0x6174 ^ 0x61F6] = 0xFFFF9E55 ^ 0x61F6;
        Command.e[0xE96A ^ 0xE952] = 0xE967 ^ 0xE952;
        Command.e[0x7C11 ^ 0x7C1C] = 0xFFFF83F6 ^ 0x7C1C;
        Command.e[0xE814 ^ 0xE849] = 0xE89A ^ 0xE849;
        Command.e[0xF333 ^ 0xF3F2] = 0xFFFF0C79 ^ 0xF3F2;
        Command.e[0x6CD2 ^ 0x6D86] = 0x6B1C ^ 0x6D86;
        Command.e[0xC7FA ^ 0xC729] = 0xC770 ^ 0xC729;
        Command.e[0x856D ^ 0x8442] = 0xAFD9 ^ 0x8442;
        Command.e[0x3F58 ^ 0x3E5F] = 0xD768 ^ 0x3E5F;
        Command.e[0xB648 ^ 0xB715] = 0x7DC8 ^ 0xB715;
        Command.e[0x101A3 ^ 0x101EB] = 0xFFFEFEDF ^ 0x101EB;
        Command.e[0x18C0 ^ 0x1807] = 0xFFFFE7E7 ^ 0x1807;
        Command.e[0x2E43 ^ 0x2E8B] = 0x2EBD ^ 0x2E8B;
        Command.e[0xCA07 ^ 0xCA1F] = 0xFFFF35AE ^ 0xCA1F;
        Command.e[0x1383 ^ 0x12A6] = 0xE323 ^ 0x12A6;
        Command.e[0x1C0D ^ 0x1D2C] = 0x33F2 ^ 0x1D2C;
        Command.e[0x3CA0 ^ 0x3D88] = 0xFFFF50BC ^ 0x3D88;
        Command.e[0xE4DB ^ 0xE4DF] = 0xFFFF1B66 ^ 0xE4DF;
        Command.e[0xD72 ^ 0xC6C] = 0x22B7 ^ 0xC6C;
        Command.e[0xDD9E ^ 0xDD33] = 0xDDCB ^ 0xDD33;
        Command.e[0x15C6 ^ 0x15D4] = 0xFFFFEA02 ^ 0x15D4;
        Command.e[0xC452 ^ 0xC4AD] = 0xF798 ^ 0xC4AD;
        Command.e[0x1A1 ^ 0x106] = 0xFFFFFEF8 ^ 0x106;
        Command.e[0xE50D ^ 0xE53E] = 0xFFFF1AC4 ^ 0xE53E;
        Command.e[0xC005 ^ 0xC0D9] = 0xFFFF3F68 ^ 0xC0D9;
        Command.e[0x508 ^ 0x5C2] = 0xFFFFFA29 ^ 0x5C2;
        Command.e[0xBCC4 ^ 0xBC85] = 0xBCBB ^ 0xBC85;
        Command.e[0x23AD ^ 0x23A5] = 0xFFFFDC44 ^ 0x23A5;
        Command.e[0x4151 ^ 0x4148] = 0x4136 ^ 0x4148;
        Command.e[0xB50F ^ 0xB432] = 0x3A0E ^ 0xB432;
        Command.e[0xC49E ^ 0xC415] = 0xC43B ^ 0xC415;
        Command.e[0xDBAB ^ 0xDA2D] = 0x1C6A ^ 0xDA2D;
        Command.e[0x6615 ^ 0x6680] = 0x6688 ^ 0x6680;
        Command.e[0x4BD0 ^ 0x4A5E] = 0x71B1 ^ 0x4A5E;
        Command.e[0xFE53 ^ 0xFF3B] = 0xA950 ^ 0xFF3B;
        Command.e[0xBA2A ^ 0xBAF4] = 0xFFFF4559 ^ 0xBAF4;
        Command.e[0x9CB6 ^ 0x9C2E] = 0x9C1A ^ 0x9C2E;
        Command.e[0x53D0 ^ 0x5390] = 0xFFFFAC5C ^ 0x5390;
        Command.e[0x50FF ^ 0x5192] = 0xD95B ^ 0x5192;
        Command.e[0x170A ^ 0x1618] = 0x11246 ^ 0x1618;
        Command.e[0xA45 ^ 0xA02] = 0xFFFFF5E2 ^ 0xA02;
        Command.e[0xF657 ^ 0xF709] = 0x3DDD ^ 0xF709;
        Command.e[0x1018B ^ 0x100F3] = 0x109C6 ^ 0x100F3;
        Command.e[0xCEC6 ^ 0xCFEC] = 0xF4AC ^ 0xCFEC;
        Command.e[0x55C0 ^ 0x55BE] = 0xFFFFAA01 ^ 0x55BE;
        Command.e[0xDCC1 ^ 0xDDBF] = 0x6543 ^ 0xDDBF;
        Command.e[0x5085 ^ 0x5098] = 0xFFFFAF12 ^ 0x5098;
        Command.e[0x59CE ^ 0x591A] = 0x92CB6A ^ 0x591A;
        Command.e[0xB688 ^ 0xB60B] = 0xB652 ^ 0xB60B;
        Command.e[0x1064C ^ 0x10717] = 0xFFFEB8EB ^ 0x10717;
        Command.e[0xBF1A ^ 0xBFDE] = 0xBFD1 ^ 0xBFDE;
        Command.e[0xE55B ^ 0xE5E7] = 0xE5C8 ^ 0xE5E7;
        Command.e[0xB674 ^ 0xB6C3] = 0xB6E3 ^ 0xB6C3;
        Command.e[0xA4EC ^ 0xA4B9] = 0xFFFF5B44 ^ 0xA4B9;
        Command.e[0xBE6F ^ 0xBE5F] = 0xFFFF41D2 ^ 0xBE5F;
        Command.e[0x105E3 ^ 0x105B7] = 0x105E8 ^ 0x105B7;
        Command.e[0xDDF1 ^ 0xDDF4] = 0xFFFF2245 ^ 0xDDF4;
        Command.e[0x6CDC ^ 0x6CB1] = 0xEA93 ^ 0x6CB1;
        Command.e[0x49DA ^ 0x49B3] = 0x49B3 ^ 0x49B3;
        Command.e[0x8F5F ^ 0x8E29] = 0x871C ^ 0x8E29;
        Command.e[0x3F93 ^ 0x3ECB] = 0xB49 ^ 0x3ECB;
        Command.e[0x8CBB ^ 0x8C0F] = 0x8C57 ^ 0x8C0F;
        Command.e[0x60A1 ^ 0x60DB] = 0xFFFF9F7C ^ 0x60DB;
        Command.e[0xD895 ^ 0xD834] = 0xFFFF27AA ^ 0xD834;
        Command.e[0x551B ^ 0x553E] = 0xFFFFAAD9 ^ 0x553E;
        Command.e[0x4C39 ^ 0x4C8F] = 0x4CF4 ^ 0x4C8F;
        Command.e[0x64BB ^ 0x643C] = 0xFFFF9BC8 ^ 0x643C;
        Command.e[0xFAA ^ 0xE93] = 0xC4E ^ 0xE93;
        Command.e[0x4138 ^ 0x4035] = 0x8BD1 ^ 0x4035;
        Command.e[0x6C94 ^ 0x6CBA] = 0x6C99 ^ 0x6CBA;
        Command.e[0x2D87 ^ 0x2CFD] = 0xD5E0 ^ 0x2CFD;
        Command.e[0x153A ^ 0x15F5] = 0x15FF ^ 0x15F5;
        Command.e[0xD6D7 ^ 0xD782] = 0xE211 ^ 0xD782;
        Command.e[0x373E ^ 0x3636] = 0xDF09 ^ 0x3636;
        Command.e[0x3220 ^ 0x3286] = 0x32F3 ^ 0x3286;
        Command.e[0x7F9F ^ 0x7F8F] = 0xFFFF802A ^ 0x7F8F;
        Command.e[0x89B ^ 0x811] = 0xFFFFF7AA ^ 0x811;
        Command.e[0x4B3A ^ 0x4A14] = 0x618E ^ 0x4A14;
        Command.e[0xF55F ^ 0xF45A] = 0x2FE3 ^ 0xF45A;
        Command.e[0x7379 ^ 0x727D] = 0xFFFF5604 ^ 0x727D;
        Command.e[0x19B3 ^ 0x18C0] = 0x62B2 ^ 0x18C0;
        Command.e[0xF4A ^ 0xF90] = 0xF54 ^ 0xF90;
        Command.e[0x4202 ^ 0x4293] = 0xFFFFBD33 ^ 0x4293;
        Command.e[0xC2E6 ^ 0xC213] = 0xC212 ^ 0xC213;
        Command.e[0xF8F0 ^ 0xF9D0] = 0xFFFF28FD ^ 0xF9D0;
        Command.e[0x10BAB ^ 0x10BB1] = 0xFFFEF440 ^ 0x10BB1;
        Command.e[0x5FCE ^ 0x5FC9] = 0xFFFFA041 ^ 0x5FC9;
        Command.e[0x313E ^ 0x3026] = 0xFFFFB034 ^ 0x3026;
        Command.e[0x2D6B ^ 0x2DFC] = 0x2DB0 ^ 0x2DFC;
        Command.e[0x540E ^ 0x5447] = 0xFFFFABFB ^ 0x5447;
        Command.e[0x8798 ^ 0x861B] = 0xFFFF6F4D ^ 0x861B;
        Command.e[0x9AF ^ 0x8D8] = 0xFFFFFE0A ^ 0x8D8;
        Command.e[0x10208 ^ 0x10388] = 0x1BB74 ^ 0x10388;
        Command.e[0xEC62 ^ 0xEDEA] = 0x2BAD ^ 0xEDEA;
        Command.e[0x6656 ^ 0x66ED] = 0x66D7 ^ 0x66ED;
        Command.e[0xBB5 ^ 0xBC3] = 0xBC3 ^ 0xBC3;
        Command.e[0xA995 ^ 0xA8F1] = 0x386 ^ 0xA8F1;
        Command.e[0x5B44 ^ 0x5A69] = 0x612E ^ 0x5A69;
        Command.e[0xB68B ^ 0xB6D7] = 0xB69A ^ 0xB6D7;
        Command.e[0x1D87 ^ 0x1D32] = 0xFFFFE2E3 ^ 0x1D32;
        Command.e[0xE2B1 ^ 0xE2CC] = 0xE27A ^ 0xE2CC;
        Command.e[0x18F3 ^ 0x185D] = 0xFFFFE7C0 ^ 0x185D;
        Command.e[0xF552 ^ 0xF5F9] = 0xF5F1 ^ 0xF5F9;
        Command.e[0x90C8 ^ 0x90D3] = 0xFFFF6F38 ^ 0x90D3;
        Command.e[0xA2A4 ^ 0xA3B0] = 0xFFFE581B ^ 0xA3B0;
        Command.e[0x87FB ^ 0x8730] = 0x73F43A ^ 0x8730;
        Command.e[0x8BE ^ 0x9F7] = 0xA47D ^ 0x9F7;
        Command.e[0x10530 ^ 0x105AF] = 0x105C7 ^ 0x105AF;
        Command.e[0xB4EB ^ 0xB4BC] = 0xFFFF4B13 ^ 0xB4BC;
        Command.e[0x28EA ^ 0x2996] = 0xD08B ^ 0x2996;
        Command.e[0xDEC ^ 0xDFD] = 0xDC3 ^ 0xDFD;
        Command.e[0x8C79 ^ 0x8C1A] = 0x8C19 ^ 0x8C1A;
        Command.e[0xC5C6 ^ 0xC481] = 0x441F ^ 0xC481;
        Command.e[0x348D ^ 0x34E1] = 0x5D93 ^ 0x34E1;
        Command.e[0x3A71 ^ 0x3B53] = 0xCADA ^ 0x3B53;
        Command.e[0x5273 ^ 0x528D] = 0x61B3 ^ 0x528D;
        Command.e[0x1388 ^ 0x136F] = 0xFFFFEC9A ^ 0x136F;
        Command.e[0x594E ^ 0x59D3] = 0xFFFFA65B ^ 0x59D3;
        Command.e[0x33C9 ^ 0x3281] = 0xB24B ^ 0x3281;
        Command.e[0x1238 ^ 0x1367] = 0xFFFF2603 ^ 0x1367;
        Command.e[0x718B ^ 0x70AC] = 0xE26B ^ 0x70AC;
        Command.e[0xFBEC ^ 0xFAF5] = 0x850D ^ 0xFAF5;
        Command.e[0xB49F ^ 0xB59E] = 0x86AB ^ 0xB59E;
        Command.e[0x25E3 ^ 0x24E5] = 0xCDD4 ^ 0x24E5;
        Command.e[0xF063 ^ 0xF030] = 0xF04E ^ 0xF030;
        Command.e[0x10317 ^ 0x10233] = 0xFFFE0C72 ^ 0x10233;
        Command.e[0xA9F6 ^ 0xA933] = 0xA9BD ^ 0xA933;
        Command.e[0x9D7E ^ 0x9D18] = 0x9D18 ^ 0x9D18;
        Command.e[0x84EC ^ 0x85E6] = 0x4E0F ^ 0x85E6;
        Command.e[0x9437 ^ 0x9555] = 0x3E22 ^ 0x9555;
        Command.e[0x12B6 ^ 0x1240] = 0x1241 ^ 0x1240;
        Command.e[0x10E26 ^ 0x10E3A] = 0x10E7B ^ 0x10E3A;
        Command.e[0xC543 ^ 0xC557] = 0xFFFF3AA2 ^ 0xC557;
        Command.e[0xC366 ^ 0xC216] = 0x4AC8 ^ 0xC216;
        Command.e[0xFA6 ^ 0xF6F] = 0xFFFFF0D3 ^ 0xF6F;
        Command.e[0x555D ^ 0x5422] = 0xFFFF1320 ^ 0x5422;
        Command.e[0x768B ^ 0x76CE] = 0x76C5 ^ 0x76CE;
        Command.e[0x8C79 ^ 0x8CE2] = 0x8C5F ^ 0x8CE2;
        Command.e[0x82DF ^ 0x8249] = 0xFFFF7DF5 ^ 0x8249;
        Command.e[0xCE32 ^ 0xCF47] = 0xC669 ^ 0xCF47;
        Command.e[0xA761 ^ 0xA60F] = 0x2ED1 ^ 0xA60F;
        Command.e[0x6A1A ^ 0x6B54] = 0xD823 ^ 0x6B54;
        Command.e[0x7FCA ^ 0x7F72] = 0x7F72 ^ 0x7F72;
        Command.e[0xA99F ^ 0xA9BB] = 0xFFFF560B ^ 0xA9BB;
        Command.e[0x23F7 ^ 0x2395] = 0x23BA ^ 0x2395;
        Command.e[0x10DAF ^ 0x10CDE] = 0x176BE ^ 0x10CDE;
        Command.e[0x4566 ^ 0x440D] = 0x7F57 ^ 0x440D;
        Command.e[0xB2DC ^ 0xB2DD] = 0xB2C4 ^ 0xB2DD;
        Command.e[0x26A ^ 0x289] = 0xFFFFFDB6 ^ 0x289;
        Command.e[0x76A1 ^ 0x76A8] = 0x76EB ^ 0x76A8;
        Command.e[0xBCED ^ 0xBDB4] = 0xFDFE ^ 0xBDB4;
        Command.e[0xAE4B ^ 0xAE07] = 0xFFFF51D8 ^ 0xAE07;
        Command.e[0x10D00 ^ 0x10C34] = 0xFFFE651F ^ 0x10C34;
        Command.e[0x9156 ^ 0x90DB] = 0xAB3A ^ 0x90DB;
        Command.e[0x2A2F ^ 0x2A56] = 0x2A4D ^ 0x2A56;
        Command.e[0x7AF1 ^ 0x7A9F] = 0xD398 ^ 0x7A9F;
        Command.e[0x24BC ^ 0x24BC] = 0x2439 ^ 0x24BC;
        Command.e[0x1D29 ^ 0x1D89] = 0x1DD3 ^ 0x1D89;
        Command.e[0xDEC7 ^ 0xDFAB] = 0xE4E4 ^ 0xDFAB;
        Command.e[0x8B5C ^ 0x8A2E] = 0xF04B ^ 0x8A2E;
        Command.e[0x869 ^ 0x848] = 0x840 ^ 0x848;
        Command.e[0xB08B ^ 0xB087] = 0xFFFF4F66 ^ 0xB087;
        Command.e[0xB49E ^ 0xB58E] = 0xFFFFDC68 ^ 0xB58E;
        Command.e[0xEAEB ^ 0xEA27] = 0xEA23 ^ 0xEA27;
        Command.e[0x618D ^ 0x60EC] = 0xCB89 ^ 0x60EC;
        Command.e[0x31AE ^ 0x31F7] = 0x31BB ^ 0x31F7;
        Command.e[0x5264 ^ 0x52E4] = 0xFFFFAD00 ^ 0x52E4;
        Command.e[0x3E74 ^ 0x3EE0] = 0x3EF6 ^ 0x3EE0;
        Command.e[0xB60F ^ 0xB618] = 0xB673 ^ 0xB618;
        Command.e[0xA413 ^ 0xA47C] = 0xEE74 ^ 0xA47C;
        Command.e[0x10E7B ^ 0x10F06] = 0x1B7F0 ^ 0x10F06;
        Command.e[0x3B46 ^ 0x3BF5] = 0xFFFFC48C ^ 0x3BF5;
        Command.e[0xAE6B ^ 0xAE1F] = 0xFDC0 ^ 0xAE1F;
        Command.e[0xBC0E ^ 0xBC38] = 0xFFFF43F1 ^ 0xBC38;
        Command.e[0xF1DB ^ 0xF1C8] = 0xFFFF0E37 ^ 0xF1C8;
        Command.e[0x18AE ^ 0x19C8] = 0x4FA3 ^ 0x19C8;
        Command.e[0xDAC ^ 0xDFA] = 0xDC6 ^ 0xDFA;
        Command.e[0x62C4 ^ 0x62EC] = 0xFFFF9D67 ^ 0x62EC;
        Command.e[0xF29C ^ 0xF38B] = 0x8C73 ^ 0xF38B;
        Command.e[0xFC65 ^ 0xFCB5] = 0xFFFF0356 ^ 0xFCB5;
        Command.e[0x2BDB ^ 0x2AF7] = 0xFFFFEE7C ^ 0x2AF7;
        Command.e[0x9A5B ^ 0x9A84] = 0x9ADC ^ 0x9A84;
        Command.e[0x5D2D ^ 0x5C36] = 0x79F6 ^ 0x5C36;
        Command.e[0x81C3 ^ 0x8132] = 0x810F ^ 0x8132;
        Command.e[0x1324 ^ 0x13D8] = 0x7D67 ^ 0x13D8;
        Command.e[0x6884 ^ 0x68E0] = 0x68E0 ^ 0x68E0;
        Command.e[0x9F04 ^ 0x9E80] = 0x885D ^ 0x9E80;
        Command.e[0xA0B6 ^ 0xA090] = 0xA0CF ^ 0xA090;
        Command.e[0x8872 ^ 0x88B2] = 0x88E3 ^ 0x88B2;
        Command.e[0xC72E ^ 0xC7E8] = 0xC784 ^ 0xC7E8;
        Command.e[0x27D6 ^ 0x27FA] = 0x27CF ^ 0x27FA;
        Command.e[0x1CC5 ^ 0x1C4C] = 0x1C54 ^ 0x1C4C;
        Command.e[0x60BE ^ 0x618B] = 0xF71F ^ 0x618B;
        Command.e[0x5B5B ^ 0x5B51] = 0xFFFFA4A5 ^ 0x5B51;
        Command.e[0x10CB1 ^ 0x10CDA] = 0x10C3A ^ 0x10CDA;
        Command.e[0x5EC0 ^ 0x5E4F] = 0xFFFFA12B ^ 0x5E4F;
        Command.e[0x4141 ^ 0x4190] = 0x41A5 ^ 0x4190;
        Command.e[0x89D5 ^ 0x8984] = 0xFFFF7658 ^ 0x8984;
        Command.e[0x2868 ^ 0x2843] = 0x2803 ^ 0x2843;
        Command.e[0x82C1 ^ 0x82FD] = 0xFFFF7D1A ^ 0x82FD;
        Command.e[0x575F ^ 0x570D] = 0xFFFFA88F ^ 0x570D;
        Command.e[0xCE9D ^ 0xCF87] = 0xEA48 ^ 0xCF87;
        Command.e[0xA056 ^ 0xA1D9] = 0x9A18 ^ 0xA1D9;
        Command.e[0xDC99 ^ 0xDC71] = 0xFFFF2380 ^ 0xDC71;
        Command.e[0xC7A0 ^ 0xC7FE] = 0xC79D ^ 0xC7FE;
        Command.e[0x4C60 ^ 0x4D05] = 0x1B6F ^ 0x4D05;
        Command.e[0x8B43 ^ 0x8A2C] = 0x282 ^ 0x8A2C;
        Command.e[0x63C9 ^ 0x628C] = 0xE242 ^ 0x628C;
        Command.e[0x5C4D ^ 0x5D1C] = 0x5B9F ^ 0x5D1C;
        Command.e[0xD867 ^ 0xD844] = 0xFFFF27A6 ^ 0xD844;
        Command.e[0xD774 ^ 0xD7CA] = 0xFFFF283C ^ 0xD7CA;
        Command.e[0xB786 ^ 0xB699] = 0x9847 ^ 0xB699;
        Command.e[0x8E34 ^ 0x8EB0] = 0xFFFF713E ^ 0x8EB0;
        Command.e[0xDDC7 ^ 0xDC85] = 0x73BD ^ 0xDC85;
        Command.e[0x10BCB ^ 0x10B33] = 0x17143 ^ 0x10B33;
        Command.e[0x3228 ^ 0x32E6] = 0xFFFFCD0A ^ 0x32E6;
        Command.e[0xB81 ^ 0xB53] = 0xB76 ^ 0xB53;
        Command.e[0x6661 ^ 0x6631] = 0xFFFF99C0 ^ 0x6631;
        Command.e[0x87A4 ^ 0x8708] = 0x8767 ^ 0x8708;
        Command.e[0x434 ^ 0x444] = 0x2CEC ^ 0x444;
        Command.e[0xE226 ^ 0xE282] = 0xE22B ^ 0xE282;
        Command.e[0x6923 ^ 0x687F] = 0x2838 ^ 0x687F;
        Command.e[0x7934 ^ 0x79BA] = 0xFFFF860B ^ 0x79BA;
        Command.e[0x76D6 ^ 0x766C] = 0xFFFF89BB ^ 0x766C;
        Command.e[0x20B6 ^ 0x201E] = 0xFFFFDFD4 ^ 0x201E;
        Command.e[0x310B ^ 0x3145] = 0xFFFFCE86 ^ 0x3145;
        Command.e[0x5DE ^ 0x4E6] = 0x666 ^ 0x4E6;
        Command.e[0xB00 ^ 0xBCD] = 0xBB8 ^ 0xBCD;
        Command.e[0x100D6 ^ 0x101D6] = 0xFFFECD08 ^ 0x101D6;
        Command.e[0x3663 ^ 0x3734] = 0x2C8 ^ 0x3734;
        Command.e[0x1E8E ^ 0x1E24] = 0xFFFFE19D ^ 0x1E24;
        Command.e[0xA562 ^ 0xA451] = 0x32C5 ^ 0xA451;
        Command.e[0x103DF ^ 0x102E9] = 0x1003C ^ 0x102E9;
        Command.e[0xCAF6 ^ 0xCB96] = 0x142 ^ 0xCB96;
        Command.e[0x68F5 ^ 0x6865] = 0xFFFF9781 ^ 0x6865;
        Command.e[0xFA05 ^ 0xFB2C] = 0x69EB ^ 0xFB2C;
        Command.e[0x930D ^ 0x925F] = 0x94C5 ^ 0x925F;
        Command.e[0xC5A ^ 0xC15] = 0xC5B ^ 0xC15;
        Command.e[0x11B9 ^ 0x1106] = 0xFFFFEE8A ^ 0x1106;
        Command.e[0x34D4 ^ 0x340F] = 0xFFFFCBF6 ^ 0x340F;
        Command.e[0xB321 ^ 0xB3E3] = 0x73C0E6 ^ 0xB3E3;
        Command.e[0xE21 ^ 0xEC0] = 0xFFFFF15E ^ 0xEC0;
        Command.e[0x956F ^ 0x9524] = 0x9551 ^ 0x9524;
        Command.e[0xC063 ^ 0xC133] = 0x7244 ^ 0xC133;
        Command.e[0xD60E ^ 0xD70D] = 0xCB4 ^ 0xD70D;
        Command.e[0xA4BD ^ 0xA412] = 0xA467 ^ 0xA412;
        Command.e[0xF464 ^ 0xF496] = 0xF497 ^ 0xF496;
        Command.e[0x8A85 ^ 0x8B8E] = 0x406A ^ 0x8B8E;
        Command.e[0x38A4 ^ 0x3893] = 0xFFFFC76F ^ 0x3893;
        Command.e[0x109B ^ 0x10FC] = 0x10FE ^ 0x10FC;
        Command.e[0x2CB7 ^ 0x2C36] = 0x2C4C ^ 0x2C36;
        Command.e[0x673E ^ 0x6765] = 0x6710 ^ 0x6765;
        Command.e[0x10361 ^ 0x1022D] = 0x1AFAC ^ 0x1022D;
        Command.e[0x7E4 ^ 0x739] = 0xB1B505 ^ 0x739;
        Command.e[0x6828 ^ 0x69A1] = 0x900B ^ 0x69A1;
        Command.e[0xA534 ^ 0xA5E1] = 0xFFFF5A15 ^ 0xA5E1;
        Command.e[0x856E ^ 0x8593] = 0xEB41 ^ 0x8593;
        Command.e[0x86B8 ^ 0x8601] = 0x73F511 ^ 0x8601;
        Command.e[0xF4B3 ^ 0xF4DB] = 0xF4DB ^ 0xF4DB;
        Command.e[0x8A ^ 0x6F] = 0x2A ^ 0x6F;
        Command.e[0x8FFE ^ 0x8F81] = 0x8FD4 ^ 0x8F81;
        Command.e[0xF10F ^ 0xF1D8] = 0xFFFF0E5D ^ 0xF1D8;
        Command.e[0xB8CE ^ 0xB9D3] = 0x9C13 ^ 0xB9D3;
        Command.e[0xC5C7 ^ 0xC5C8] = 0xFFFF3A33 ^ 0xC5C8;
        Command.e[0xA5D0 ^ 0xA579] = 0xFFFF5A91 ^ 0xA579;
        Command.e[0xC6D0 ^ 0xC69D] = 0xFFFF3951 ^ 0xC69D;
        Command.e[0x9A5D ^ 0x9AC7] = 0x9AEC ^ 0x9AC7;
        Command.e[0x93A5 ^ 0x9222] = 0xFFFFABB4 ^ 0x9222;
        Command.e[0xF83D ^ 0xF934] = 0x1003 ^ 0xF934;
        Command.e[0x1EE0 ^ 0x1FF3] = 0x11BAF ^ 0x1FF3;
        Command.e[0x82C2 ^ 0x83AB] = 0xB8F1 ^ 0x83AB;
        Command.e[0x4EF6 ^ 0x4EDB] = 0xFFFFB170 ^ 0x4EDB;
        Command.e[0xCD7A ^ 0xCDF7] = 0xCD8D ^ 0xCDF7;
        Command.e[0xCF2C ^ 0xCFD7] = 0xA105 ^ 0xCFD7;
        Command.e[0xF312 ^ 0xF320] = 0xFFFF0CB3 ^ 0xF320;
        Command.e[0x10B5C ^ 0x10A53] = 0x19C69 ^ 0x10A53;
        Command.e[0xD1F5 ^ 0xD119] = 0xD10A ^ 0xD119;
        Command.e[0xA696 ^ 0xA7D6] = 0x29E9 ^ 0xA7D6;
        Command.e[0xAE1B ^ 0xAF62] = 0x5679 ^ 0xAF62;
        Command.e[0x1370 ^ 0x1231] = 0xBD01 ^ 0x1231;
        Command.e[0x88FC ^ 0x89B7] = 0xFFFFDB94 ^ 0x89B7;
        Command.e[0xFA7A ^ 0xFAF6] = 0xFFFF05E1 ^ 0xFAF6;
        Command.e[0x471F ^ 0x47E5] = 0x293D ^ 0x47E5;
        Command.e[0x9CC3 ^ 0x9C28] = 0xFFFF63C5 ^ 0x9C28;
        Command.e[0x10C07 ^ 0x10C76] = 0x18A3C ^ 0x10C76;
        Command.e[0x5DFB ^ 0x5DC6] = 0xFFFFA231 ^ 0x5DC6;
        Command.e[0x9CEE ^ 0x9DDF] = 0xB644 ^ 0x9DDF;
        Command.e[0xEABA ^ 0xEA24] = 0xEA36 ^ 0xEA24;
        Command.e[0x3A82 ^ 0x3A5B] = 0x3A46 ^ 0x3A5B;
        Command.e[0xED58 ^ 0xED00] = 0xED25 ^ 0xED00;
        Command.e[0x9163 ^ 0x9159] = 0x9169 ^ 0x9159;
        Command.e[0x625C ^ 0x6229] = 0xA106 ^ 0x6229;
        Command.e[0xB754 ^ 0xB6DE] = 0x4F64 ^ 0xB6DE;
        Command.e[0x48C1 ^ 0x4831] = 0x485D ^ 0x4831;
        Command.e[0x3F24 ^ 0x3FFC] = 0xFFFFC062 ^ 0x3FFC;
        Command.e[0xAF87 ^ 0xAF22] = 0xFFFF50CE ^ 0xAF22;
        Command.e[0x43D4 ^ 0x4397] = 0x4397 ^ 0x4397;
        Command.e[0xFC3E ^ 0xFCD3] = 0xFCA7 ^ 0xFCD3;
        Command.e[0x77DE ^ 0x77E1] = 0xFFFF8812 ^ 0x77E1;
        Command.e[0xDCD8 ^ 0xDDE4] = 0xD403 ^ 0xDDE4;
        Command.e[0x30F8 ^ 0x3011] = 0xFFFFCFC9 ^ 0x3011;
        Command.e[0x75AD ^ 0x748B] = 0xE64C ^ 0x748B;
        Command.e[0x28C6 ^ 0x2989] = 0x9AE3 ^ 0x2989;
        Command.e[0x88EB ^ 0x8897] = 0x88DE ^ 0x8897;
    }
}

