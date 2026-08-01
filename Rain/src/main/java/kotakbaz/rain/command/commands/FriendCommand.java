/*
 * Decompiled with CFR 0.152.
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
import kotakbaz.rain.command.Command;
import kotakbaz.rain.command.b;
import kotakbaz.rain.command.commands.a;
import kotakbaz.rain.friend.FriendManager;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.minecraft.client.network.ClientCommandSource;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016\u00a2\u0006\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2={"Lkotakbaz/rain/command/commands/FriendCommand;", "Lkotakbaz/rain/command/Command;", "<init>", "()V", "Lcom/mojang/brigadier/builder/LiteralArgumentBuilder;", "Lnet/minecraft/class_637;", "builder", "", "execute", "(Lcom/mojang/brigadier/builder/LiteralArgumentBuilder;)V", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nFriendCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendCommand.kt\nkotakbaz/rain/command/commands/FriendCommand\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n1915#2,2:90\n*S KotlinDebug\n*F\n+ 1 FriendCommand.kt\nkotakbaz/rain/command/commands/FriendCommand\n*L\n65#1:90,2\n*E\n"})
public final class FriendCommand
extends b {
    @NotNull
    public static final FriendCommand INSTANCE;
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    private FriendCommand() {
        int n2 = C[0];
        n2 -= C[1];
        super((String)a[n2 += C[2]]);
    }

    @Override
    public void execute(@NotNull LiteralArgumentBuilder<ClientCommandSource> builder) {
        int n2 = C[3];
        n2 ^= C[4];
        Intrinsics.checkNotNullParameter(builder, (String)a[n2 -= C[5]]);
        builder.executes(FriendCommand::execute$lambda$0);
        int n3 = C[6];
        n3 ^= C[7];
        builder.then(kotakbaz.rain.command.b.N.literal((String)a[n3 ^= C[8]]).executes(FriendCommand::execute$lambda$1));
        int n4 = C[9];
        n4 -= C[10];
        builder.then(kotakbaz.rain.command.b.N.literal((String)a[n4 ^= C[11]]).executes(FriendCommand::execute$lambda$2));
        int n5 = C[12];
        n5 ^= C[13];
        LiteralArgumentBuilder<ClientCommandSource> literalArgumentBuilder = kotakbaz.rain.command.b.N.literal((String)a[n5 -= C[14]]);
        int n6 = C[15];
        n6 ^= C[16];
        String string = (String)a[n6 += C[17]];
        StringArgumentType stringArgumentType = StringArgumentType.word();
        int n7 = C[18];
        n7 += C[19];
        Intrinsics.checkNotNullExpressionValue(stringArgumentType, (String)a[n7 ^= C[20]]);
        builder.then(literalArgumentBuilder.then(kotakbaz.rain.command.b.N.argument(string, (ArgumentType)stringArgumentType).executes(FriendCommand::execute$lambda$3)));
        int n8 = C[21];
        n8 ^= C[22];
        LiteralArgumentBuilder<ClientCommandSource> literalArgumentBuilder2 = kotakbaz.rain.command.b.N.literal((String)a[n8 += C[23]]);
        int n9 = C[24];
        n9 += C[25];
        String string2 = (String)a[n9 -= C[26]];
        StringArgumentType stringArgumentType2 = StringArgumentType.word();
        int n10 = C[27];
        n10 -= C[28];
        Intrinsics.checkNotNullExpressionValue(stringArgumentType2, (String)a[n10 += C[29]]);
        builder.then(literalArgumentBuilder2.then(kotakbaz.rain.command.b.N.argument(string2, (ArgumentType)stringArgumentType2).suggests(FriendCommand::execute$lambda$4).executes(FriendCommand::execute$lambda$5)));
    }

    private static final int execute$lambda$0(CommandContext it) {
        int n2 = C[30];
        n2 -= C[31];
        int n3 = C[33];
        n3 -= C[34];
        Command.INSTANCE.sendClientMessage((String)a[n2 ^= C[32]] + (String)a[n3 -= C[35]]);
        return INSTANCE.getSingleSuccess();
    }

    private static final int execute$lambda$1(CommandContext it) {
        String string;
        List<String> list = FriendManager.INSTANCE.getFriends();
        if (list.isEmpty()) {
            int n2 = C[36];
            n2 ^= C[37];
            int n3 = C[39];
            n3 ^= C[40];
            int n4 = C[42];
            n4 += C[43];
            string = (String)a[n2 -= C[38]] + (String)a[n3 += C[41]] + (String)a[n4 += C[44]];
        } else {
            int n5 = C[45];
            n5 += C[46];
            int n6 = C[48];
            n6 -= C[49];
            int n7 = C[51];
            n7 += C[52];
            String string2 = CollectionsKt.joinToString$default(list, (String)a[n5 -= C[47]], null, null, n6 += C[50], null, null, n7 ^= C[53], null);
            int n8 = C[54];
            n8 -= C[55];
            string = (String)a[n8 ^= C[56]] + string2;
        }
        Command.INSTANCE.sendClientMessage(string);
        return INSTANCE.getSingleSuccess();
    }

    private static final int execute$lambda$2(CommandContext it) {
        String string;
        if (FriendManager.INSTANCE.clear()) {
            int n2 = C[57];
            n2 += C[58];
            int n3 = C[60];
            n3 += C[61];
            string = (String)a[n2 -= C[59]] + (String)a[n3 += C[62]];
        } else {
            int n4 = C[63];
            n4 += C[64];
            int n5 = C[66];
            n5 ^= C[67];
            string = (String)a[n4 -= C[65]] + (String)a[n5 -= C[68]];
        }
        Command.INSTANCE.sendClientMessage(string);
        return INSTANCE.getSingleSuccess();
    }

    private static final int execute$lambda$3(CommandContext it) {
        int n2 = C[69];
        n2 ^= C[70];
        String string = StringArgumentType.getString((CommandContext)it, (String)((String)a[n2 += C[71]]));
        Intrinsics.checkNotNull(string);
        switch (kotakbaz.rain.command.commands.a.a[FriendManager.INSTANCE.add(string).ordinal()]) {
            case 1: {
                String string2 = string;
                int n3 = C[72];
                n3 ^= C[73];
                Command.INSTANCE.sendClientMessage((String)a[n3 ^= C[74]] + string2);
                break;
            }
            case 2: {
                String string3 = string;
                int n4 = C[75];
                n4 += C[76];
                int n5 = C[78];
                n5 += C[79];
                Command.INSTANCE.sendClientMessage((String)a[n4 ^= C[77]] + (String)a[n5 ^= C[80]] + string3);
                break;
            }
            case 3: {
                int n6 = C[81];
                n6 ^= C[82];
                int n7 = C[84];
                n7 ^= C[85];
                Command.INSTANCE.sendClientMessage((String)a[n6 -= C[83]] + (String)a[n7 ^= C[86]]);
                break;
            }
            case 4: {
                int n8 = C[87];
                n8 -= C[88];
                int n9 = C[90];
                n9 += C[91];
                Command.INSTANCE.sendClientMessage((String)a[n8 -= C[89]] + (String)a[n9 -= C[92]]);
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return INSTANCE.getSingleSuccess();
    }

    private static final CompletableFuture execute$lambda$4(CommandContext commandContext, SuggestionsBuilder suggestionsBuilder) {
        long l2 = -366392979885779958L;
        Iterable iterable = FriendManager.INSTANCE.getFriends();
        Intrinsics.checkNotNull(suggestionsBuilder);
        SuggestionsBuilder suggestionsBuilder2 = suggestionsBuilder;
        long l3 = l2;
        int n2 = C[93];
        n2 ^= C[94];
        l2 = l3 ^ (0L ^ l3) & -1L << (n2 += C[95]);
        for (Object t2 : iterable) {
            String string = (String)t2;
            long l4 = l2;
            int n3 = C[96];
            n3 ^= C[97];
            l2 = l4 ^ (0L ^ l4) & -1L >>> (n3 -= C[98]);
            suggestionsBuilder2.suggest(string);
        }
        return suggestionsBuilder.buildFuture();
    }

    private static final int execute$lambda$5(CommandContext it) {
        int n2 = C[99];
        n2 ^= C[100];
        String string = StringArgumentType.getString((CommandContext)it, (String)((String)a[n2 -= C[101]]));
        Intrinsics.checkNotNull(string);
        switch (kotakbaz.rain.command.commands.a.A[FriendManager.INSTANCE.remove(string).ordinal()]) {
            case 1: {
                String string2 = string;
                int n3 = C[102];
                n3 += C[103];
                Command.INSTANCE.sendClientMessage((String)a[n3 ^= C[104]] + string2);
                break;
            }
            case 2: {
                String string3 = string;
                int n4 = C[105];
                n4 ^= C[106];
                int n5 = C[108];
                n5 += C[109];
                Command.INSTANCE.sendClientMessage((String)a[n4 -= C[107]] + (String)a[n5 -= C[110]] + string3);
                break;
            }
            case 3: {
                int n6 = C[111];
                n6 ^= C[112];
                int n7 = C[114];
                n7 ^= C[115];
                Command.INSTANCE.sendClientMessage((String)a[n6 += C[113]] + (String)a[n7 -= C[116]]);
                break;
            }
            case 4: {
                int n8 = C[117];
                n8 ^= C[118];
                int n9 = C[120];
                n9 ^= C[121];
                Command.INSTANCE.sendClientMessage((String)a[n8 += C[119]] + (String)a[n9 -= C[122]]);
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return INSTANCE.getSingleSuccess();
    }

    static {
        FriendCommand.b();
        long l2 = 4767093958621592417L;
        long l3 = -2746369101261626250L;
        long l4 = 9222979771521871974L;
        long l5 = 3488960892090810182L;
        long l6 = -820211197058220337L;
        long l7 = -7780511157496537650L;
        long l8 = -4339444102589938076L;
        long l9 = -6508984508524501935L;
        long l10 = 9036143536434115052L;
        long l11 = 8069247236266925423L;
        long l12 = -3020566161706409538L;
        long l13 = -9095001644277352230L;
        long l14 = 1194871206211939223L;
        long l15 = -8458590581917564592L;
        int n2 = C[123];
        n2 -= C[124];
        a = new Object[n2 += C[125]];
        long l16 = l15;
        int n3 = C[126];
        n3 -= C[127];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += C[128]);
        Object[] objectArray = new Object[C[129]];
        objectArray[FriendCommand.C[130]] = A;
        objectArray[FriendCommand.C[131]] = C[132];
        int n4 = C[133];
        Object object = FriendCommand.A()[C[134]];
        if (object == null) {
            char[] cArray = "\ud4a2\ud4be\ud4ae\ud4ae\ud347\ud3e5\ud4a1\ud4a2\ud377\ud3cf\ud3e6\ud4b2\ud681\ud3db\ud3dc\ud49c\ud3e1\ud4b3\ud4a1\ud4b9\ud3ce\ud346\ud4a3\ud36e\ud4a3\ud3eb\ud3e5\ud4ba\ud4ae\ud4ad\ud683\ud3cd\ud3e7\ud682\ud4b7\ud345\ud378\ud37a\ud4b1\ud4a2\ud3e0\ud3e5\ud3d9\ud3e8\ud3ce\ud4ae\ud4a0\ud49c\ud36e\ud3e6\ud306\ud378\ud68b\ud3db\ud4b1\ud3eb\ud306\ud4ac\ud49c\ud3d9\ud4ba\ud3dc\ud683\ud3e3\ud4ac\ud681\ud3d8\ud3d9\ud306\ud683\ud3e8\ud3cc\ud3e7\ud3e1\ud4b3\ud3e6\ud680\ud682\ud3e8\ud681\ud682\ud3e1\ud4b9\ud3d3\ud348\ud36e\ud6d5\ud4a1\ud4b2\ud4b5\ud348\ud375\ud4b5\ud4af\ud3da\ud3e5\ud3de\ud3e1\ud3d8\ud683\ud3d4\ud3d2\ud377\ud4b9\ud3e5\ud4b9\ud4a2\ud378\ud3e1\ud3d3\ud680\ud3d4\ud3d3\ud4b8\ud3e3\ud4b2\ud4b3\ud36e\ud3e2\ud4b7\ud3dc\ud346\ud4b0\ud3e2\ud3e5\ud3db\ud3cc\ud3e8\ud3e1\ud3d8\ud4ae\ud6d5\ud3db\ud3d3\ud680\ud36e\ud3e5\ud4b9\ud683\ud3cc\ud4bb\ud3e0\ud3d4\ud3e0\ud4b5\ud3e3\ud4b5\ud3e1\ud4bb\ud3cf\ud4b5\ud680\ud4a2\ud3e7\ud4be\ud3de\ud37a\ud347\ud3e1\ud4b7\ud68b\ud49c\ud4bb\ud4ae\ud6d5\ud3d8\ud3ce\ud3e2\ud4ad\ud3e0\ud345\ud3e1\ud3d2\ud4a1\ud3da\ud6d5\ud49c\ud3d2\ud3e0\ud3de\ud3e5\ud36e\ud4ad\ud4a1\ud4ac\ud3db\ud682\ud3db\ud377\ud4af\ud36d\ud3cc\ud6fc\ud3d1\ud3e1\ud3ce\ud3d4\ud4af\ud4bb\ud681\ud3e6\ud3e0\ud377\ud4b7\ud306\ud37a\ud36d\ud683\ud4b3\ud4b3\ud6d5\ud4ad\ud3cc\ud4af\ud3e0\ud3d8\ud68b\ud346\ud4a1\ud3cd\ud4ad\ud3ce\ud36e\ud3e6\ud4b8\ud3e6\ud4ac\ud3de\ud682\ud3de\ud6d5\ud4b3\ud3e7\ud3e7\ud347\ud681\ud6d5\ud4af\ud4af\ud4b4\ud4be\ud3d9\ud3cd\ud3e5\ud3e7\ud36d\ud347\ud3e0\ud4ac\ud378\ud3d1\ud4ad\ud3cc\ud681\ud683\ud4b4\ud3e0\ud36d\ud3e5\ud4af\ud4b5\ud4b9\ud4b8\ud3e1\ud348\ud4a1\ud4a0\ud3e8\ud3d8\ud3d1\ud37a\ud3d4\ud3cc\ud375\ud3e0\ud4be\ud4b8\ud3cc\ud36d\ud4bb\ud68b\ud3eb\ud6fc\ud3da\ud4b3\ud3e7\ud3e7\ud4b4\ud3e8\ud3e1\ud375\ud4a0\ud4b2\ud375\ud375\ud4b7\ud4b5\ud4ac\ud3e7\ud4ae\ud4bb\ud346\ud4bb\ud4b9\ud4b5\ud4a0\ud3e3\ud681\ud3d3\ud4a0\ud4ac\ud3e2\ud375\ud3d2\ud4a0\ud4b9\ud3d4\ud4b7\ud3e5\ud4ac\ud4b2\ud4be\ud3e5\ud377\ud3e3\ud681\ud4a2\ud4a3\ud3eb\ud4b1\ud36d\ud4b2\ud6fc\ud6d5\ud68b\ud3e2\ud37a\ud375\ud3cc\ud4ac\ud6fc\ud4b0\ud4ba\ud4a2\ud68b\ud3e7\ud49c\ud347\ud3cc\ud6d7\ud3cd\ud4a2\ud3de\ud4b5\ud3e0\ud6d5\ud3e6\ud4b1\ud6d7\ud348\ud680\ud3ce\ud3e3\ud3db\ud3ce\ud3d8\ud4ba\ud3e8\ud4b2\ud3eb\ud3e1\ud3eb\ud3d9\ud4b8\ud375\ud6fc\ud4be\ud4af\ud4ad\ud348\ud6d7\ud3e7\ud3cd\ud3d0\ud4a0\ud680\ud3e1\ud4ae\ud375\ud3db\ud3e5\ud4a1\ud4ba\ud4a1\ud3e3\ud68b\ud3da\ud3da\ud3d0\ud4bb\ud378\ud68b\ud3d0\ud3e1\ud3e0\ud3e2\ud3e1\ud4a3\ud682\ud4b0\ud4b2\ud3da\ud4b0\ud4b0\ud4b4\ud6fc\ud347\ud3eb\ud49c\ud4b9\ud6fc\ud3d2\ud3cc\ud4b0\ud49c\ud3e6\ud348\ud681\ud3cd\ud36e\ud4b5\ud49c\ud3e1\ud3e2\ud680\ud3e6\ud3d8\ud3e1\ud345\ud3e6\ud4a1\ud4a0\ud4b5\ud4b8\ud3d0\ud3d9\ud4af\ud3d2\ud4ad\ud306\ud680\ud683\ud680\ud3e5\ud4b7\ud4b0\ud4ad\ud6d7\ud36e\ud4af\ud36d\ud3d8\ud4a2\ud68b\ud3d3\ud4b7\ud3cd\ud3da\ud346\ud36e\ud4ba\ud3d8\ud3de\ud3d4\ud378\ud4b0\ud4ae\ud3cf\ud4ac\ud36e\ud3e2\ud3d1\ud4a1\ud3cc\ud4b3\ud3e6\ud3cf\ud3e0\ud306\ud3e5\ud3d1\ud36d\ud4b5\ud3d0\ud3de\ud3e0\ud4b7\ud3d1\ud3db\ud3e1\ud4a0\ud4a0\ud683\ud378\ud680\ud4a1\ud4be\ud3e8\ud3eb\ud346\ud68b\ud4bb\ud3e7\ud4ad\ud4b3\ud3e2\ud3da\ud3cc\ud4b4\ud681\ud4ad\ud3cd\ud3d9\ud3de\ud3e3\ud3ce\ud3e0\ud4af\ud4ad\ud4b0\ud375\ud375\ud68b\ud37a\ud3d4\ud4b8\ud3db\ud3cf\ud37a\ud3d9\ud3d2\ud4b2\ud3cd\ud36e\ud3d3\ud3de\ud682\ud4b4\ud4ac\ud3e0\ud3e3\ud6d5\ud37a\ud681\ud4b2\ud6d5\ud4a0\ud346\ud681\ud4b3\ud345\ud3eb\ud3cf\ud4b2\ud4ac\ud3e5\ud36d\ud3de\ud347\ud37a\ud4b7\ud4a1\ud3eb\ud3e0\ud37a\ud378\ud4b5\ud3eb\ud3e1\ud68b\ud4b0\ud377\ud4a3\ud3e6\ud4ae\ud4ad\ud4b1\ud681\ud3e7\ud3cc\ud3d9\ud4a2\ud377\ud3d8\ud683\ud4b4\ud3e7\ud377\ud4b0\ud3d4\ud3e7\ud4ba\ud3d9\ud4b5\ud4a2\ud378\ud3e5\ud36d\ud49c\ud347\ud4b9\ud4a3\ud682\ud3e0\ud3cd\ud345\ud3e5\ud3d2\ud3dc\ud3e3\ud37a\ud306\ud3cc\ud4ac\ud3e6\ud3d3\ud377\ud3d3\ud347\ud4a1\ud346\ud4b8\ud4b7\ud49c\ud3cd\ud346\ud3d8\ud4b1\ud3d0\ud3e5\ud683\ud6fc\ud306\ud683\ud3eb\ud375\ud3eb\ud681\ud4b1\ud3dc\ud4ac\ud3d4\ud4b0\ud345\ud682\ud4ae\ud4b0\ud345\ud4af\ud345\ud4ad\ud4bb\ud346\ud3eb\ud3e3\ud306\ud4bb\ud3dc\ud345\ud36e\ud682\ud6d5\ud3d3\ud4ad\ud68b\ud4a3\ud4b5\ud4a0\ud4b0\ud3d9\ud3cf\ud37a\ud346\ud3d3\ud3d4\ud3e7\ud4af\ud681\ud4ba\ud375\ud3e2\ud3eb\ud4ba\ud3d9\ud3e6\ud3ce\ud3d0\ud36d\ud345\ud4b0\ud4b1\ud4ae\ud3e5\ud49c\ud3cf\ud6d5\ud3d2\ud4ac\ud4a3\ud3db\ud3ce\ud4b3\ud3d9\ud3e8\ud4b3\ud4b1\ud3d9\ud4a3\ud4a3\ud6d5\ud4b9\ud680\ud682\ud683\ud4b5\ud4bb\ud4b2\ud3d3\ud6d5\ud4b2\ud345\ud4a3\ud49c\ud4b0\ud3cf\ud49c\ud36e\ud3eb\ud3e0\ud3d0\ud375\ud683\ud3e8\ud3da\ud4bb\ud3da\ud377\ud680\ud3e7\ud681\ud4b8\ud4ad\ud36e\ud3d4\ud4a3\ud6d7\ud378\ud3d4\ud3e1\ud3eb\ud3db\ud3e6\ud680\ud4b0\ud683\ud3e2\ud3e8\ud37a\ud3e7\ud3ce\ud3e5\ud3dc\ud3da\ud3d3\ud4b8\ud3d3\ud4b8\ud3d3\ud348\ud3d9\ud3d4\ud3da\ud3cc\ud3e0\ud3d3\ud345\ud4b8\ud3d2\ud4b3\ud6d5\ud3da\ud348\ud4bb\ud4b0\ud680\ud680\ud3e7\ud6d5\ud4b9\ud6d5\ud680\ud3d3\ud4a3\ud4ac\ud682\ud3d0\ud4b9\ud346\ud6d7\ud4b8\ud3e7\ud4ac\ud3da\ud36e\ud3d9\ud4b8\ud377\ud347\ud4ac\ud3de\ud4b8\ud4b1\ud3e2\ud4bb\ud3d0\ud4ba\ud3e0\ud36e\ud3e7\ud4bb\ud3cd\ud3e5\ud3de\ud4be\ud347\ud3e7\ud377\ud4b8\ud378\ud378\ud4af\ud4b9\ud3d0\ud4be\ud3e3\ud4b5\ud4ba\ud4ae\ud4ba\ud4b0\ud4bb\ud3cc\ud4b5\ud37a\ud4b4\ud4a1\ud4a0\ud4a2\ud3e3\ud3ce\ud3da\ud3d9\ud3d8\ud6d7\ud681\ud681\ud3e0\ud4b9\ud36e\ud4be\ud377\ud4b5\ud4b5\ud4b5\ud683\ud4bb\ud4ba\ud3dc\ud4b0\ud681\ud683\ud345\ud4b8\ud681\ud375\ud3e5\ud3de\ud49c\ud4b8\ud681\ud4b8\ud4b5\ud346\ud682\ud6d5\ud3e0\ud4b0\ud4a2\ud347\ud348\ud6fc\ud347\ud6d7\ud4af\ud4a0\ud3d3\ud6d7\ud4a0\ud3d0\ud4b4\ud4ac\ud3da\ud4b4\ud377\ud306\ud36d\ud345\ud348\ud4af\ud3dc\ud4a2\ud3dc\ud3d3\ud3d2\ud377\ud3d8\ud306\ud3d9\ud3e0\ud3d8\ud3d3\ud4b9\ud3cf\ud3d4\ud346\ud346\ud4a3\ud4bb\ud3d4\ud4a4".toCharArray();
            for (int i2 = C[135]; i2 < C[136]; ++i2) {
                int n5 = cArray[i2];
                n5 ^= C[137];
                n5 += C[138];
                n5 -= C[139];
                n5 += C[140];
                n5 ^= C[141];
                n5 += C[142];
                n5 += C[143];
                n5 -= C[144];
                n5 ^= C[145];
                n5 += C[146];
                cArray[i2] = (char)(n5 ^= C[147]);
            }
            object = FriendCommand.A()[FriendCommand.C[148]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)FriendCommand.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = C[149];
        n6 -= C[150];
        l6 = l17 ^ (0x1C100000000L ^ l17) & -1L << (n6 ^= C[151]);
        long l18 = l13;
        int n7 = C[152];
        n7 ^= C[153];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= C[154]);
        while (true) {
            int n8 = C[155];
            n8 -= C[156];
            if ((int)l13 >= (int)(l6 >>> (n8 += C[157]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = C[158];
            n10 += C[159];
            int n11 = C[161];
            n11 -= C[162];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += C[160])) & -1L >>> (n11 ^= C[163]);
            long l20 = l9;
            int n12 = C[164];
            n12 += C[165];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= C[166]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = C[167];
            n14 -= C[168];
            int n15 = C[170];
            n15 += C[171];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= C[169])) & -1L >>> (n15 -= C[172]);
            int n16 = C[173];
            n16 += C[174];
            long l22 = l10;
            int n17 = C[176];
            n17 += C[177];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= C[175]) ^ l22) & -1L << (n17 += C[178]);
            int n18 = C[179];
            n18 ^= C[180];
            n18 -= C[181];
            int n19 = C[182];
            n19 += C[183];
            long l23 = l12;
            int n20 = C[185];
            n20 -= C[186];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= C[184]))) ^ l23) & -1L >>> (n20 += C[187]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = C[188];
            n21 -= C[189];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 += C[190]);
            while (true) {
                int n22 = C[191];
                n22 -= C[192];
                if ((int)(l14 >>> (n22 ^= C[193])) >= (int)l12) break;
                int n23 = C[194];
                n23 ^= C[195];
                int n24 = C[197];
                n24 ^= C[198];
                cArray2[(int)(l14 >>> (n23 ^= FriendCommand.C[196]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= C[199]))];
                l14 += 0x100000000L;
            }
            int n25 = C[200];
            n25 += C[201];
            int n26 = (int)(l15 >>> (n25 -= C[202]));
            l15 += 0x100000000L;
            FriendCommand.a[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = C[203];
            n27 -= C[204];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += C[205]);
        }
        INSTANCE = new FriendCommand();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[C[206]];
        String string = (String)object[C[207]];
        object = object[C[208]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[209]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[210]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[212] ^ C[213]];
                byArray[FriendCommand.C[214] ^ FriendCommand.C[215]] = C[216] ^ C[217];
                byArray[FriendCommand.C[218] ^ FriendCommand.C[219]] = C[220] ^ C[221];
                byArray[FriendCommand.C[222] ^ FriendCommand.C[223]] = C[224] ^ C[225];
                byArray[FriendCommand.C[226] ^ FriendCommand.C[227]] = C[228] ^ C[229];
                byArray[FriendCommand.C[230] ^ FriendCommand.C[231]] = C[232] ^ C[233];
                byArray[FriendCommand.C[234] ^ FriendCommand.C[235]] = C[236] ^ C[237];
                byArray[FriendCommand.C[238] ^ FriendCommand.C[239]] = C[240] ^ C[241];
                byArray[FriendCommand.C[242] ^ FriendCommand.C[243]] = C[244] ^ C[245];
                byArray[FriendCommand.C[246] ^ FriendCommand.C[247]] = C[248] ^ C[249];
                byArray[FriendCommand.C[250] ^ FriendCommand.C[251]] = C[252] ^ C[253];
                byArray[FriendCommand.C[254] ^ FriendCommand.C[255]] = C[256] ^ C[257];
                byArray[FriendCommand.C[258] ^ FriendCommand.C[259]] = C[260] ^ C[261];
                byArray[FriendCommand.C[262] ^ FriendCommand.C[263]] = C[264] ^ C[265];
                byArray[FriendCommand.C[266] ^ FriendCommand.C[267]] = C[268] ^ C[269];
                byArray[FriendCommand.C[270] ^ FriendCommand.C[271]] = C[272] ^ C[273];
                byArray[FriendCommand.C[274] ^ FriendCommand.C[275]] = C[276] ^ C[277];
                objectArray2[FriendCommand.C[211]] = byArray;
            }
            byte[] byArray = (byte[])object3[C[278]];
            if (b == null) {
                byte[] byArray2 = new byte[C[279] ^ C[280]];
                byArray2[FriendCommand.C[281] ^ FriendCommand.C[282]] = C[283] ^ C[284];
                byArray2[FriendCommand.C[285] ^ FriendCommand.C[286]] = C[287] ^ C[288];
                byArray2[FriendCommand.C[289] ^ FriendCommand.C[290]] = C[291] ^ C[292];
                byArray2[FriendCommand.C[293] ^ FriendCommand.C[294]] = C[295] ^ C[296];
                byArray2[FriendCommand.C[297] ^ FriendCommand.C[298]] = C[299] ^ C[300];
                byArray2[FriendCommand.C[301] ^ FriendCommand.C[302]] = C[303] ^ C[304];
                byArray2[FriendCommand.C[305] ^ FriendCommand.C[306]] = C[307] ^ C[308];
                byArray2[FriendCommand.C[309] ^ FriendCommand.C[310]] = C[311] ^ C[312];
                byArray2[FriendCommand.C[313] ^ FriendCommand.C[314]] = C[315] ^ C[316];
                byArray2[FriendCommand.C[317] ^ FriendCommand.C[318]] = C[319] ^ C[320];
                byArray2[FriendCommand.C[321] ^ FriendCommand.C[322]] = C[323] ^ C[324];
                byArray2[FriendCommand.C[325] ^ FriendCommand.C[326]] = C[327] ^ C[328];
                byArray2[FriendCommand.C[329] ^ FriendCommand.C[330]] = C[331] ^ C[332];
                byArray2[FriendCommand.C[333] ^ FriendCommand.C[334]] = C[335] ^ C[336];
                byArray2[FriendCommand.C[337] ^ FriendCommand.C[338]] = C[339] ^ C[340];
                byArray2[FriendCommand.C[341] ^ FriendCommand.C[342]] = C[343] ^ C[344];
                byArray2[FriendCommand.C[345] ^ FriendCommand.C[346]] = C[347] ^ C[348];
                byArray2[FriendCommand.C[349] ^ FriendCommand.C[350]] = C[351] ^ C[352];
                byArray2[FriendCommand.C[353] ^ FriendCommand.C[354]] = C[355] ^ C[356];
                byArray2[FriendCommand.C[357] ^ FriendCommand.C[358]] = C[359] ^ C[360];
                byArray2[FriendCommand.C[361] ^ FriendCommand.C[362]] = C[363] ^ C[364];
                byArray2[FriendCommand.C[365] ^ FriendCommand.C[366]] = C[367] ^ C[368];
                byArray2[FriendCommand.C[369] ^ FriendCommand.C[370]] = C[371] ^ C[372];
                byArray2[FriendCommand.C[373] ^ FriendCommand.C[374]] = C[375] ^ C[376];
                byArray2[FriendCommand.C[377] ^ FriendCommand.C[378]] = C[379] ^ C[380];
                byArray2[FriendCommand.C[381] ^ FriendCommand.C[382]] = C[383] ^ C[384];
                byArray2[FriendCommand.C[385] ^ FriendCommand.C[386]] = C[387] ^ C[388];
                byArray2[FriendCommand.C[389] ^ FriendCommand.C[390]] = C[391] ^ C[392];
                byArray2[FriendCommand.C[393] ^ FriendCommand.C[394]] = C[395] ^ C[396];
                byArray2[FriendCommand.C[397] ^ FriendCommand.C[398]] = C[399] ^ 0xE947;
                byArray2[0xBF7F ^ 0xBF68] = 0xFFFF4091 ^ 0xBF68;
                byArray2[0x9329 ^ 0x9328] = 0x9312 ^ 0x9328;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = FriendCommand.A()[1];
                if (object4 == null) {
                    char[] cArray = "\uecca\ueb84\uecb1\ueb7e\ueb88\uec74\ueccd\uecdf\uecae\ueb92\uecb2\ueb93\ueb87\ueb99\uecc9\uecb2\ueca7\uec57".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= 0xF800;
                        n3 -= 34593;
                        n3 ^= 0xFE83;
                        n3 -= 37316;
                        n3 += 13287;
                        n3 ^= 0x4B50;
                        n3 ^= 0xBDF3;
                        n3 -= 45299;
                        n3 -= 49171;
                        n3 -= 27155;
                        n3 += 3348;
                        n3 ^= 0xE5D6;
                        n3 += 61304;
                        n3 += 15321;
                        n3 += 63614;
                        cArray[i2] = (char)(n3 ^= 0x145E);
                    }
                    object4 = FriendCommand.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[13] = 103;
                byArray4[12] = -114;
                byArray4[2] = 123;
                byArray4[15] = -28;
                byArray4[9] = 126;
                byArray4[0] = 124;
                byArray4[5] = 13;
                byArray4[10] = 71;
                byArray4[8] = 76;
                byArray4[1] = -67;
                byArray4[11] = 56;
                byArray4[3] = -86;
                byArray4[4] = 6;
                byArray4[6] = -21;
                byArray4[7] = 67;
                byArray4[14] = 68;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 2, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = FriendCommand.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u34e0\u34d4\u34ce".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 += 6338;
                        n4 -= 10982;
                        n4 -= 47334;
                        n4 ^= 0xC449;
                        n4 ^= 0x90C;
                        n4 += 60236;
                        n4 -= 3539;
                        n4 += 27923;
                        n4 += 50709;
                        n4 ^= 0x3C76;
                        n4 -= 62166;
                        n4 += 37399;
                        n4 += 31743;
                        cArray[i3] = (char)(n4 += 23487);
                    }
                    object5 = FriendCommand.A()[2] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = FriendCommand.A()[3];
            if (object6 == null) {
                char[] cArray = "\u893e\u8ee2\u8974\u8ef0\u8ee4\u8ee5\u8ee4\u8ef0\u890f\u890c\u8ee4\u8974\u8ed2\u890f\u8ede\u8903\u8903\u8906\u8831\u8908".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= 0x8AC0;
                    n5 -= 9714;
                    n5 ^= 0x27E3;
                    n5 ^= 0xFC34;
                    n5 -= 26324;
                    n5 -= 23236;
                    n5 ^= 0xF894;
                    n5 -= 23238;
                    n5 += 21560;
                    n5 -= 3257;
                    cArray[i4] = (char)(n5 -= 43343);
                }
                object6 = FriendCommand.A()[3] = new String(cArray);
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
        C = new int[0x94CD ^ 0x955D];
        FriendCommand.C[0xFC4D ^ 0xFD35] = 0x1FF07 ^ 0xFD35;
        FriendCommand.C[0x786A ^ 0x78E2] = 0x7B4E ^ 0x78E2;
        FriendCommand.C[0x6356 ^ 0x63C1] = 0xFFFF9C11 ^ 0x63C1;
        FriendCommand.C[0x5E21 ^ 0x5EE5] = 0x5E90 ^ 0x5EE5;
        FriendCommand.C[0x10F74 ^ 0x10F20] = 0x10F4D ^ 0x10F20;
        FriendCommand.C[0x10D87 ^ 0x10CFD] = 0x1E326 ^ 0x10CFD;
        FriendCommand.C[0x873C ^ 0x8726] = 0xFFFF78E2 ^ 0x8726;
        FriendCommand.C[0x638 ^ 0x668] = 0x66E ^ 0x668;
        FriendCommand.C[0xD532 ^ 0xD5AE] = 0xFFFF2A32 ^ 0xD5AE;
        FriendCommand.C[0x754 ^ 0x714] = 0xFFFFF892 ^ 0x714;
        FriendCommand.C[0xBEAD ^ 0xBFC6] = 0xFFFFF865 ^ 0xBFC6;
        FriendCommand.C[0x10992 ^ 0x10895] = 0x12ECB ^ 0x10895;
        FriendCommand.C[0xB803 ^ 0xB8EF] = 0x2317 ^ 0xB8EF;
        FriendCommand.C[0xE959 ^ 0xE985] = 0x9E97 ^ 0xE985;
        FriendCommand.C[0xE534 ^ 0xE46B] = 0xC1FC ^ 0xE46B;
        FriendCommand.C[0x2352 ^ 0x235A] = 0xFFFFDCDE ^ 0x235A;
        FriendCommand.C[0xF147 ^ 0xF01E] = 0xEA5E ^ 0xF01E;
        FriendCommand.C[0x1050F ^ 0x10569] = 0xFFFEFA84 ^ 0x10569;
        FriendCommand.C[0x521A ^ 0x52F1] = 0xC961 ^ 0x52F1;
        FriendCommand.C[0x5606 ^ 0x5659] = 0xFFFFA991 ^ 0x5659;
        FriendCommand.C[0xCADF ^ 0xCA2D] = 0x8188 ^ 0xCA2D;
        FriendCommand.C[0x10EF8 ^ 0x10E05] = 0x16125 ^ 0x10E05;
        FriendCommand.C[0x4EF9 ^ 0x4FD2] = 0x7378 ^ 0x4FD2;
        FriendCommand.C[0x69AF ^ 0x6942] = 0xF2D2 ^ 0x6942;
        FriendCommand.C[0x7EBC ^ 0x7ECF] = 0xFFFF8171 ^ 0x7ECF;
        FriendCommand.C[0x7466 ^ 0x752C] = 0xD205 ^ 0x752C;
        FriendCommand.C[0x3772 ^ 0x3633] = 0x13193 ^ 0x3633;
        FriendCommand.C[0x20D ^ 0x381] = 0x6F73 ^ 0x381;
        FriendCommand.C[0xA429 ^ 0xA4C8] = 0x10A1 ^ 0xA4C8;
        FriendCommand.C[0x377C ^ 0x36F7] = 0x5A5A ^ 0x36F7;
        FriendCommand.C[0x41CB ^ 0x41F7] = 0xFFFFBE91 ^ 0x41F7;
        FriendCommand.C[0x6F00 ^ 0x6E1B] = 0xFFFFAE53 ^ 0x6E1B;
        FriendCommand.C[0x5CC1 ^ 0x5C52] = 0x210C ^ 0x5C52;
        FriendCommand.C[0xB6D3 ^ 0xB6A7] = 0xFFFF491E ^ 0xB6A7;
        FriendCommand.C[0xC0F6 ^ 0xC023] = 0x5D4B ^ 0xC023;
        FriendCommand.C[0x96A6 ^ 0x97D8] = 0xEB1C ^ 0x97D8;
        FriendCommand.C[0x7262 ^ 0x7261] = 0x720E ^ 0x7261;
        FriendCommand.C[0xFE8 ^ 0xFEA] = 0xFA3 ^ 0xFEA;
        FriendCommand.C[0xCA77 ^ 0xCAA0] = 0xF4F3 ^ 0xCAA0;
        FriendCommand.C[0xBD55 ^ 0xBD62] = 0xBD41 ^ 0xBD62;
        FriendCommand.C[0x36CE ^ 0x36B1] = 0x36B4 ^ 0x36B1;
        FriendCommand.C[0x1D74 ^ 0x1DE9] = 0x1DFE ^ 0x1DE9;
        FriendCommand.C[0x94B ^ 0x992] = 0x37C1 ^ 0x992;
        FriendCommand.C[0x44AB ^ 0x45FB] = 0xBD03 ^ 0x45FB;
        FriendCommand.C[0xC33F ^ 0xC3B3] = 0xA4E6 ^ 0xC3B3;
        FriendCommand.C[0xCA0C ^ 0xCA51] = 0xCA49 ^ 0xCA51;
        FriendCommand.C[0x9463 ^ 0x940D] = 0xFFFF6BBE ^ 0x940D;
        FriendCommand.C[0xAA26 ^ 0xAA38] = 0xFFFF558F ^ 0xAA38;
        FriendCommand.C[0xCDD3 ^ 0xCC8F] = 0xD6CA ^ 0xCC8F;
        FriendCommand.C[0x6D04 ^ 0x6C5C] = 0xA772 ^ 0x6C5C;
        FriendCommand.C[0x192A ^ 0x1815] = 0xFFFF1B66 ^ 0x1815;
        FriendCommand.C[0x102F7 ^ 0x10380] = 0xFFFFFE64 ^ 0x10380;
        FriendCommand.C[0x334E ^ 0x3373] = 0x3320 ^ 0x3373;
        FriendCommand.C[0x598B ^ 0x599C] = 0xFFFFA60A ^ 0x599C;
        FriendCommand.C[0x56E4 ^ 0x5655] = 0xFFFFA9BB ^ 0x5655;
        FriendCommand.C[0x3555 ^ 0x35BA] = 0x19BD ^ 0x35BA;
        FriendCommand.C[0x72FD ^ 0x73BB] = 0x2E27 ^ 0x73BB;
        FriendCommand.C[0xD782 ^ 0xD6A6] = 0xF225 ^ 0xD6A6;
        FriendCommand.C[0x1F23 ^ 0x1F93] = 0x1F0F ^ 0x1F93;
        FriendCommand.C[0x2143 ^ 0x206C] = 0xFFFED313 ^ 0x206C;
        FriendCommand.C[0x83ED ^ 0x8340] = 0xFFFF7C92 ^ 0x8340;
        FriendCommand.C[0x24C1 ^ 0x248B] = 0xFFFFDB23 ^ 0x248B;
        FriendCommand.C[0xF151 ^ 0xF035] = 0x3BC0 ^ 0xF035;
        FriendCommand.C[0x15DA ^ 0x14F2] = 0x43B9 ^ 0x14F2;
        FriendCommand.C[0xAAFA ^ 0xAA8A] = 0xAAF3 ^ 0xAA8A;
        FriendCommand.C[0x4280 ^ 0x42A9] = 0xFFFFBD4F ^ 0x42A9;
        FriendCommand.C[0x9BD0 ^ 0x9B0A] = 0xEC0F ^ 0x9B0A;
        FriendCommand.C[0x9823 ^ 0x993B] = 0xD3F4 ^ 0x993B;
        FriendCommand.C[0x3CE5 ^ 0x3DA0] = 0x602D ^ 0x3DA0;
        FriendCommand.C[0x7A57 ^ 0x7A4A] = 0x7A48 ^ 0x7A4A;
        FriendCommand.C[0x65F5 ^ 0x653E] = 0xFFFF9AD4 ^ 0x653E;
        FriendCommand.C[0xAE6 ^ 0xB61] = 0xAAE5 ^ 0xB61;
        FriendCommand.C[0x1D46 ^ 0x1C2B] = 0xAC40 ^ 0x1C2B;
        FriendCommand.C[0xB399 ^ 0xB3B7] = 0xFFFF4C0A ^ 0xB3B7;
        FriendCommand.C[0x896C ^ 0x89A6] = 0xFFFF764C ^ 0x89A6;
        FriendCommand.C[0x6625 ^ 0x6654] = 0xFFFF99E0 ^ 0x6654;
        FriendCommand.C[0xCD49 ^ 0xCDBE] = 0x1CE51 ^ 0xCDBE;
        FriendCommand.C[0xE865 ^ 0xE823] = 0xE825 ^ 0xE823;
        FriendCommand.C[0x6979 ^ 0x6828] = 0x8589 ^ 0x6828;
        FriendCommand.C[0x68F5 ^ 0x68C7] = 0xFFFF9724 ^ 0x68C7;
        FriendCommand.C[0xB96 ^ 0xB0E] = 0xB3D ^ 0xB0E;
        FriendCommand.C[0x563C ^ 0x5734] = 0xFFFF8EF0 ^ 0x5734;
        FriendCommand.C[0x1BDB ^ 0x1B45] = 0xFFFFE4E6 ^ 0x1B45;
        FriendCommand.C[0x720B ^ 0x7292] = 0xFFFF8D75 ^ 0x7292;
        FriendCommand.C[0x78 ^ 0x144] = 0x9E4F ^ 0x144;
        FriendCommand.C[0xAFB4 ^ 0xAE3E] = 0xC2CC ^ 0xAE3E;
        FriendCommand.C[0x3C89 ^ 0x3C9D] = 0xFFFFC348 ^ 0x3C9D;
        FriendCommand.C[0x9D7C ^ 0x9DCA] = 0xFFFF621D ^ 0x9DCA;
        FriendCommand.C[0x882A ^ 0x89AF] = 0x2844 ^ 0x89AF;
        FriendCommand.C[0x785A ^ 0x78BC] = 0x5A23 ^ 0x78BC;
        FriendCommand.C[0x5E17 ^ 0x5F1E] = 0x7940 ^ 0x5F1E;
        FriendCommand.C[0xD53 ^ 0xD71] = 0xFFFFF2C8 ^ 0xD71;
        FriendCommand.C[0x1E76 ^ 0x1E0A] = 0x1E24 ^ 0x1E0A;
        FriendCommand.C[0xF254 ^ 0xF244] = 0xFFFF0DDB ^ 0xF244;
        FriendCommand.C[0x6D14 ^ 0x6C60] = 0x35D ^ 0x6C60;
        FriendCommand.C[0x6CE9 ^ 0x6C28] = 0xFFFF9398 ^ 0x6C28;
        FriendCommand.C[0xA7C1 ^ 0xA6B7] = 0x1A485 ^ 0xA6B7;
        FriendCommand.C[0xFBAF ^ 0xFB0B] = 0xFFFF04DA ^ 0xFB0B;
        FriendCommand.C[0xBE08 ^ 0xBE5A] = 0xFFFF419C ^ 0xBE5A;
        FriendCommand.C[0xAE8E ^ 0xAE28] = 0xAE36 ^ 0xAE28;
        FriendCommand.C[0xABBE ^ 0xAB1B] = 0xAB76 ^ 0xAB1B;
        FriendCommand.C[0x7874 ^ 0x7887] = 0x3325 ^ 0x7887;
        FriendCommand.C[0x4441 ^ 0x449F] = 0xF0F9 ^ 0x449F;
        FriendCommand.C[0xB54E ^ 0xB586] = 0xB596 ^ 0xB586;
        FriendCommand.C[0x5ABE ^ 0x5BFE] = 0xA77C ^ 0x5BFE;
        FriendCommand.C[0x89C5 ^ 0x897C] = 0x89AC ^ 0x897C;
        FriendCommand.C[0xD040 ^ 0xD080] = 0xD0B8 ^ 0xD080;
        FriendCommand.C[0xBF20 ^ 0xBFC0] = 0xFFFFF43F ^ 0xBFC0;
        FriendCommand.C[0x7C8B ^ 0x7C7A] = 0x507D ^ 0x7C7A;
        FriendCommand.C[0xA5C5 ^ 0xA5BB] = 0xA5E8 ^ 0xA5BB;
        FriendCommand.C[0xBDC7 ^ 0xBD3F] = 0xFFFE4138 ^ 0xBD3F;
        FriendCommand.C[0x77D5 ^ 0x769B] = 0x8E63 ^ 0x769B;
        FriendCommand.C[0x494F ^ 0x499B] = 0xD4E3 ^ 0x499B;
        FriendCommand.C[0x2465 ^ 0x24E0] = 0x24E2 ^ 0x24E0;
        FriendCommand.C[0xCA7C ^ 0xCB5D] = 0xEFDA ^ 0xCB5D;
        FriendCommand.C[0x5FBE ^ 0x5EA1] = 0xB40 ^ 0x5EA1;
        FriendCommand.C[0x10689 ^ 0x1066C] = 0xBD ^ 0x1066C;
        FriendCommand.C[0x6FEE ^ 0x6ED9] = 0xFFFF381C ^ 0x6ED9;
        FriendCommand.C[0xDDC4 ^ 0xDDB1] = 0xDDF6 ^ 0xDDB1;
        FriendCommand.C[0xE46F ^ 0xE559] = 0x4C00 ^ 0xE559;
        FriendCommand.C[0x10B22 ^ 0x10A33] = 0x112BF ^ 0x10A33;
        FriendCommand.C[0x5CF3 ^ 0x5C3F] = 0x5C37 ^ 0x5C3F;
        FriendCommand.C[0xBD91 ^ 0xBCD5] = 0x1BB69 ^ 0xBCD5;
        FriendCommand.C[0xB6A1 ^ 0xB691] = 0xB6F7 ^ 0xB691;
        FriendCommand.C[0x39CD ^ 0x38E4] = 0x46B ^ 0x38E4;
        FriendCommand.C[0x16B ^ 0x14D] = 0x14A ^ 0x14D;
        FriendCommand.C[0x6D9 ^ 0x754] = 0xEE01 ^ 0x754;
        FriendCommand.C[0xCBB9 ^ 0xCBF5] = 0xFFFF343B ^ 0xCBF5;
        FriendCommand.C[0xBE04 ^ 0xBE9B] = 0xBEAF ^ 0xBE9B;
        FriendCommand.C[0xF898 ^ 0xF896] = 0xFFFF074D ^ 0xF896;
        FriendCommand.C[0x642E ^ 0x6510] = 0x9992 ^ 0x6510;
        FriendCommand.C[0xF152 ^ 0xF124] = 0xF173 ^ 0xF124;
        FriendCommand.C[0x3238 ^ 0x3373] = 0x945C ^ 0x3373;
        FriendCommand.C[0x7DB8 ^ 0x7CEB] = 0xFFFF6EE3 ^ 0x7CEB;
        FriendCommand.C[0x3192 ^ 0x30EF] = 0x4C29 ^ 0x30EF;
        FriendCommand.C[0xA2CD ^ 0xA3CE] = 0x2714 ^ 0xA3CE;
        FriendCommand.C[0x3249 ^ 0x3240] = 0x3206 ^ 0x3240;
        FriendCommand.C[0xCD6E ^ 0xCD68] = 0xCD6B ^ 0xCD68;
        FriendCommand.C[0x10184 ^ 0x1017A] = 0x1CFD2 ^ 0x1017A;
        FriendCommand.C[0x46A6 ^ 0x4670] = 0x7820 ^ 0x4670;
        FriendCommand.C[0xE985 ^ 0xE804] = 0x70F2 ^ 0xE804;
        FriendCommand.C[0xD214 ^ 0xD27F] = 0xFFFF2DE8 ^ 0xD27F;
        FriendCommand.C[0x7A83 ^ 0x7AE6] = 0x7ACE ^ 0x7AE6;
        FriendCommand.C[0x2C79 ^ 0x2D2B] = 0xC09F ^ 0x2D2B;
        FriendCommand.C[0xE312 ^ 0xE3FA] = 0xFFFF3ECD ^ 0xE3FA;
        FriendCommand.C[0x10AF0 ^ 0x10BD2] = 0x12F51 ^ 0x10BD2;
        FriendCommand.C[0x2631 ^ 0x262A] = 0x2659 ^ 0x262A;
        FriendCommand.C[0xABBD ^ 0xAB4D] = 0xFFFF78ED ^ 0xAB4D;
        FriendCommand.C[0x10D86 ^ 0x10D28] = 0x10D53 ^ 0x10D28;
        FriendCommand.C[0x45CC ^ 0x454F] = 0x454E ^ 0x454F;
        FriendCommand.C[0x4D1E ^ 0x4C5D] = 0x14BD9 ^ 0x4C5D;
        FriendCommand.C[0xA8CD ^ 0xA8A5] = 0xFFFF5774 ^ 0xA8A5;
        FriendCommand.C[0xC00D ^ 0xC048] = 0xC067 ^ 0xC048;
        FriendCommand.C[0x25F1 ^ 0x25DB] = 0x25EB ^ 0x25DB;
        FriendCommand.C[0xEEBF ^ 0xEED2] = 0xFFFF1124 ^ 0xEED2;
        FriendCommand.C[0x1008D ^ 0x10105] = 0x1A0E3 ^ 0x10105;
        FriendCommand.C[0x6CB1 ^ 0x6C56] = 0x4EC5 ^ 0x6C56;
        FriendCommand.C[0xBAAE ^ 0xBA0F] = 0xFFFF45D8 ^ 0xBA0F;
        FriendCommand.C[0x668A ^ 0x66B1] = 0x66A8 ^ 0x66B1;
        FriendCommand.C[0x2D74 ^ 0x2C53] = 0xFFFF84AC ^ 0x2C53;
        FriendCommand.C[0xF2A9 ^ 0xF2BC] = 0xF2BA ^ 0xF2BC;
        FriendCommand.C[0x5369 ^ 0x5309] = 0xFFFFACAF ^ 0x5309;
        FriendCommand.C[0x2BBE ^ 0x2AE3] = 0xF03 ^ 0x2AE3;
        FriendCommand.C[0x8B5B ^ 0x8A46] = 0xDFD8 ^ 0x8A46;
        FriendCommand.C[0xF757 ^ 0xF7F4] = 0xFFFF083F ^ 0xF7F4;
        FriendCommand.C[0x35D7 ^ 0x34C0] = 0x7E2F ^ 0x34C0;
        FriendCommand.C[0x6FEB ^ 0x6F02] = 0x4D91 ^ 0x6F02;
        FriendCommand.C[0x2F62 ^ 0x2FE5] = 0x2FE5 ^ 0x2FE5;
        FriendCommand.C[0x2CBB ^ 0x2D9B] = 0x781F ^ 0x2D9B;
        FriendCommand.C[0x12F1 ^ 0x1295] = 0xFFFFED1C ^ 0x1295;
        FriendCommand.C[0xD4E1 ^ 0xD4E0] = 0xFFFF2B3F ^ 0xD4E0;
        FriendCommand.C[0xB46A ^ 0xB4D0] = 0xB4B6 ^ 0xB4D0;
        FriendCommand.C[0x9AC3 ^ 0x9A69] = 0xFFFF65DF ^ 0x9A69;
        FriendCommand.C[0x10C5A ^ 0x10C04] = 0x10C44 ^ 0x10C04;
        FriendCommand.C[0x1FD0 ^ 0x1F70] = 0x1F5A ^ 0x1F70;
        FriendCommand.C[0x4A56 ^ 0x4B50] = 0x6D06 ^ 0x4B50;
        FriendCommand.C[0x1B1 ^ 0x15F] = 0x2D5C ^ 0x15F;
        FriendCommand.C[0x2181 ^ 0x21A5] = 0xFFFFDE6E ^ 0x21A5;
        FriendCommand.C[0xF20D ^ 0xF339] = 0xE8DD ^ 0xF339;
        FriendCommand.C[0xCC39 ^ 0xCD15] = 0xF187 ^ 0xCD15;
        FriendCommand.C[0xE072 ^ 0xE149] = 0x7E1E ^ 0xE149;
        FriendCommand.C[0x4E9B ^ 0x4EBC] = 0x4EE8 ^ 0x4EBC;
        FriendCommand.C[0x42B6 ^ 0x42D5] = 0xFFFFBD71 ^ 0x42D5;
        FriendCommand.C[0x8DBF ^ 0x8D31] = 0x9554 ^ 0x8D31;
        FriendCommand.C[0x1F27 ^ 0x1EA8] = 0xF7A3 ^ 0x1EA8;
        FriendCommand.C[0x2992 ^ 0x29DD] = 0x29DF ^ 0x29DD;
        FriendCommand.C[0xB8F9 ^ 0xB9D3] = 0x8541 ^ 0xB9D3;
        FriendCommand.C[0x1159 ^ 0x1011] = 0x4D8D ^ 0x1011;
        FriendCommand.C[0x8257 ^ 0x821E] = 0xFFFF7DA4 ^ 0x821E;
        FriendCommand.C[0xD9A8 ^ 0xD9A2] = 0xD9E6 ^ 0xD9A2;
        FriendCommand.C[0xDE5D ^ 0xDE7C] = 0xFFFF21A9 ^ 0xDE7C;
        FriendCommand.C[0x1699 ^ 0x17E0] = 0xF831 ^ 0x17E0;
        FriendCommand.C[0x92C0 ^ 0x927B] = 0xFFFF6DCD ^ 0x927B;
        FriendCommand.C[0xBC21 ^ 0xBC10] = 0xBC59 ^ 0xBC10;
        FriendCommand.C[0xA43A ^ 0xA482] = 0xFFFF5B34 ^ 0xA482;
        FriendCommand.C[0x74F4 ^ 0x74B3] = 0xFFFF8B64 ^ 0x74B3;
        FriendCommand.C[0x5824 ^ 0x588D] = 0x58D8 ^ 0x588D;
        FriendCommand.C[0x9D8 ^ 0x9CA] = 0x9FA ^ 0x9CA;
        FriendCommand.C[0x141D ^ 0x144C] = 0xFFFFEBFE ^ 0x144C;
        FriendCommand.C[0xD1B3 ^ 0xD149] = 0xBE67 ^ 0xD149;
        FriendCommand.C[0xC31E ^ 0xC353] = 0xC365 ^ 0xC353;
        FriendCommand.C[0xD871 ^ 0xD92A] = 0xFFFF3CBE ^ 0xD92A;
        FriendCommand.C[0x6738 ^ 0x6626] = 0x33A2 ^ 0x6626;
        FriendCommand.C[0x6178 ^ 0x614C] = 0xFFFF9EF2 ^ 0x614C;
        FriendCommand.C[0x134B ^ 0x1389] = 0x13DE ^ 0x1389;
        FriendCommand.C[0x66DB ^ 0x660A] = 0x660B ^ 0x660A;
        FriendCommand.C[0x2B71 ^ 0x2A63] = 0xB953 ^ 0x2A63;
        FriendCommand.C[0xC487 ^ 0xC42B] = 0xFFFF3B93 ^ 0xC42B;
        FriendCommand.C[0x7326 ^ 0x7230] = 0x7230 ^ 0x7230;
        FriendCommand.C[0x3718 ^ 0x3612] = 0x3E80 ^ 0x3612;
        FriendCommand.C[0x1319 ^ 0x139F] = 0x139F ^ 0x139F;
        FriendCommand.C[0x38FD ^ 0x39C7] = 0xA6CC ^ 0x39C7;
        FriendCommand.C[0xA7ED ^ 0xA720] = 0xA71E ^ 0xA720;
        FriendCommand.C[0xB6B5 ^ 0xB78C] = 0x288E ^ 0xB78C;
        FriendCommand.C[0xDFC1 ^ 0xDF6A] = 0xDF48 ^ 0xDF6A;
        FriendCommand.C[0x713B ^ 0x7074] = 0xFFFF7706 ^ 0x7074;
        FriendCommand.C[0x19D5 ^ 0x195F] = 0xA6BC ^ 0x195F;
        FriendCommand.C[0x3FBE ^ 0x3FDF] = 0xFFFFC069 ^ 0x3FDF;
        FriendCommand.C[0x1A8 ^ 0x1E3] = 0x1B1 ^ 0x1E3;
        FriendCommand.C[0xA595 ^ 0xA485] = 0xBC3B ^ 0xA485;
        FriendCommand.C[0xC549 ^ 0xC432] = 0xFFFFD402 ^ 0xC432;
        FriendCommand.C[0xC25B ^ 0xC32B] = 0x734F ^ 0xC32B;
        FriendCommand.C[0xC738 ^ 0xC60A] = 0xDDEE ^ 0xC60A;
        FriendCommand.C[0x1835 ^ 0x192C] = 0x26B7 ^ 0x192C;
        FriendCommand.C[0x8397 ^ 0x8375] = 0x185AE ^ 0x8375;
        FriendCommand.C[0xC444 ^ 0xC45C] = 0xFFFF3BBF ^ 0xC45C;
        FriendCommand.C[0x10C11 ^ 0x10C1C] = 0xFFFEF382 ^ 0x10C1C;
        FriendCommand.C[0x561B ^ 0x561E] = 0x560B ^ 0x561E;
        FriendCommand.C[0x38F1 ^ 0x3815] = 0xFFFEC155 ^ 0x3815;
        FriendCommand.C[0x17F1 ^ 0x1672] = 0x8E98 ^ 0x1672;
        FriendCommand.C[0xC528 ^ 0xC5E1] = 0xFFFF3A1B ^ 0xC5E1;
        FriendCommand.C[0x228D ^ 0x22B2] = 0x22E2 ^ 0x22B2;
        FriendCommand.C[0x8CAE ^ 0x8DAE] = 0x4356 ^ 0x8DAE;
        FriendCommand.C[0xED07 ^ 0xED5F] = 0xFFFF12BB ^ 0xED5F;
        FriendCommand.C[0x8F52 ^ 0x8F3E] = 0xFFFF7080 ^ 0x8F3E;
        FriendCommand.C[0x7EE2 ^ 0x7E55] = 0xFFFF81AA ^ 0x7E55;
        FriendCommand.C[0x7EA6 ^ 0x7FCA] = 0xC798 ^ 0x7FCA;
        FriendCommand.C[0x2E95 ^ 0x2E45] = 0x2E45 ^ 0x2E45;
        FriendCommand.C[0x658F ^ 0x64C6] = 0xC3F0 ^ 0x64C6;
        FriendCommand.C[0xCBD7 ^ 0xCAE2] = 0x63AF ^ 0xCAE2;
        FriendCommand.C[0x20A4 ^ 0x21B0] = 0xB2A8 ^ 0x21B0;
        FriendCommand.C[0x227F ^ 0x2280] = 0xEC23 ^ 0x2280;
        FriendCommand.C[0xA54C ^ 0xA441] = 0xACD5 ^ 0xA441;
        FriendCommand.C[0x7FD0 ^ 0x7EE8] = 0xD7B1 ^ 0x7EE8;
        FriendCommand.C[0x1095E ^ 0x10830] = 0x1B854 ^ 0x10830;
        FriendCommand.C[0xFBBD ^ 0xFADE] = 0xFFFFCE96 ^ 0xFADE;
        FriendCommand.C[0x4111 ^ 0x4146] = 0xFFFFBE8A ^ 0x4146;
        FriendCommand.C[0xDE93 ^ 0xDFEF] = 0x3034 ^ 0xDFEF;
        FriendCommand.C[0x5229 ^ 0x52D2] = 0x3DF2 ^ 0x52D2;
        FriendCommand.C[0x457E ^ 0x4555] = 0x4566 ^ 0x4555;
        FriendCommand.C[0x1736 ^ 0x1663] = 0xDD4D ^ 0x1663;
        FriendCommand.C[0x82DB ^ 0x82D7] = 0x82AD ^ 0x82D7;
        FriendCommand.C[0x3FA3 ^ 0x3F9B] = 0xFFFFC00F ^ 0x3F9B;
        FriendCommand.C[0x58DC ^ 0x59D8] = 0xDD14 ^ 0x59D8;
        FriendCommand.C[0x4CE8 ^ 0x4DCE] = 0x1A85 ^ 0x4DCE;
        FriendCommand.C[0x10580 ^ 0x104E1] = 0x1CF0A ^ 0x104E1;
        FriendCommand.C[0x10E8B ^ 0x10EBD] = 0xFFFEF112 ^ 0x10EBD;
        FriendCommand.C[0x706B ^ 0x7019] = 0x7074 ^ 0x7019;
        FriendCommand.C[0xC7EB ^ 0xC77E] = 0xC760 ^ 0xC77E;
        FriendCommand.C[0xC104 ^ 0xC017] = 0x5326 ^ 0xC017;
        FriendCommand.C[0xB16F ^ 0xB1F9] = 0xB1D7 ^ 0xB1F9;
        FriendCommand.C[0xB2B0 ^ 0xB2D9] = 0xFFFF4D64 ^ 0xB2D9;
        FriendCommand.C[0x1E82 ^ 0x1ED8] = 0xFFFFE18D ^ 0x1ED8;
        FriendCommand.C[0x9381 ^ 0x9333] = 0xFFFF6CA5 ^ 0x9333;
        FriendCommand.C[0xBF04 ^ 0xBE27] = 0xFFFF6565 ^ 0xBE27;
        FriendCommand.C[0x8500 ^ 0x85C6] = 0x85C1 ^ 0x85C6;
        FriendCommand.C[0x91B5 ^ 0x91C8] = 0xFFFF6E58 ^ 0x91C8;
        FriendCommand.C[0x684A ^ 0x6856] = 0x6807 ^ 0x6856;
        FriendCommand.C[0x8757 ^ 0x8615] = 0x181A9 ^ 0x8615;
        FriendCommand.C[0x41C4 ^ 0x4155] = 0xCC2C ^ 0x4155;
        FriendCommand.C[0x9AAB ^ 0x9A6E] = 0x9A64 ^ 0x9A6E;
        FriendCommand.C[0x8E08 ^ 0x8E3B] = 0x8E76 ^ 0x8E3B;
        FriendCommand.C[0x7CCA ^ 0x7CC5] = 0xFFFF83CB ^ 0x7CC5;
        FriendCommand.C[0x922 ^ 0x926] = 0x965 ^ 0x926;
        FriendCommand.C[0x44C1 ^ 0x459F] = 0x606C ^ 0x459F;
        FriendCommand.C[0x6D25 ^ 0x6C57] = 0x36A ^ 0x6C57;
        FriendCommand.C[0x5643 ^ 0x5723] = 0x72D0 ^ 0x5723;
        FriendCommand.C[0x126 ^ 0x10A] = 0xFFFFFEB3 ^ 0x10A;
        FriendCommand.C[0xC8C8 ^ 0xC8B1] = 0xFFFF3706 ^ 0xC8B1;
        FriendCommand.C[0xFE0 ^ 0xF38] = 0x3131 ^ 0xF38;
        FriendCommand.C[0x298E ^ 0x2894] = 0x1703 ^ 0x2894;
        FriendCommand.C[0xBD8F ^ 0xBD0B] = 0xBD0B ^ 0xBD0B;
        FriendCommand.C[0x104AC ^ 0x1052A] = 0x1A4CC ^ 0x1052A;
        FriendCommand.C[0x4E1B ^ 0x4EC0] = 0x39C5 ^ 0x4EC0;
        FriendCommand.C[0xDC2F ^ 0xDCBD] = 0x84B0 ^ 0xDCBD;
        FriendCommand.C[0x2B2 ^ 0x39F] = 0x10F19 ^ 0x39F;
        FriendCommand.C[0x76E9 ^ 0x7679] = 0xFA50 ^ 0x7679;
        FriendCommand.C[0x4BED ^ 0x4A6F] = 0xD291 ^ 0x4A6F;
        FriendCommand.C[0x1988 ^ 0x18E7] = 0xA8DC ^ 0x18E7;
        FriendCommand.C[0x10079 ^ 0x100A6] = 0x1B4CF ^ 0x100A6;
        FriendCommand.C[0xC39B ^ 0xC2D6] = 0x3A29 ^ 0xC2D6;
        FriendCommand.C[0x66F2 ^ 0x669D] = 0x66B9 ^ 0x669D;
        FriendCommand.C[0x4B02 ^ 0x4B14] = 0x4B64 ^ 0x4B14;
        FriendCommand.C[0xCAF7 ^ 0xCABF] = 0xCAB9 ^ 0xCABF;
        FriendCommand.C[0x3476 ^ 0x342F] = 0xFFFFCBCD ^ 0x342F;
        FriendCommand.C[0x9D03 ^ 0x9D2B] = 0x9D48 ^ 0x9D2B;
        FriendCommand.C[0x823B ^ 0x8335] = 0x9BBC ^ 0x8335;
        FriendCommand.C[0xD012 ^ 0xD0DD] = 0xD0DF ^ 0xD0DD;
        FriendCommand.C[0xF0F7 ^ 0xF043] = 0xFFFF0FA9 ^ 0xF043;
        FriendCommand.C[0x7619 ^ 0x7771] = 0x1F13 ^ 0x7771;
        FriendCommand.C[0xCDD0 ^ 0xCD63] = 0xCD40 ^ 0xCD63;
        FriendCommand.C[0x690F ^ 0x6813] = 0x5784 ^ 0x6813;
        FriendCommand.C[0xC8D7 ^ 0xC9B2] = 0xA1DB ^ 0xC9B2;
        FriendCommand.C[0x337 ^ 0x31A] = 0x318 ^ 0x31A;
        FriendCommand.C[0x7A55 ^ 0x7A52] = 0xFFFF85CA ^ 0x7A52;
        FriendCommand.C[0x48CC ^ 0x4998] = 0xA42C ^ 0x4998;
        FriendCommand.C[0x6C63 ^ 0x6D35] = 0xA61B ^ 0x6D35;
        FriendCommand.C[0x7A88 ^ 0x7BB9] = 0x604D ^ 0x7BB9;
        FriendCommand.C[0xFC6F ^ 0xFCF5] = 0xFFFF0341 ^ 0xFCF5;
        FriendCommand.C[0x458D ^ 0x4404] = 0x28EE ^ 0x4404;
        FriendCommand.C[0x3A15 ^ 0x3A7F] = 0x3A7B ^ 0x3A7F;
        FriendCommand.C[0x6B4A ^ 0x6BD1] = 0xFFFF9474 ^ 0x6BD1;
        FriendCommand.C[0x5B14 ^ 0x5B3B] = 0xFFFFA49F ^ 0x5B3B;
        FriendCommand.C[0x95C4 ^ 0x9519] = 0xE21C ^ 0x9519;
        FriendCommand.C[0x64CE ^ 0x64B9] = 0xFFFF9B4D ^ 0x64B9;
        FriendCommand.C[0x4E1C ^ 0x4E26] = 0x4E00 ^ 0x4E26;
        FriendCommand.C[0xDBC8 ^ 0xDAC4] = 0xD23B ^ 0xDAC4;
        FriendCommand.C[0x8D10 ^ 0x8C61] = 0xE347 ^ 0x8C61;
        FriendCommand.C[0x520B ^ 0x532E] = 0x473 ^ 0x532E;
        FriendCommand.C[0xEB13 ^ 0xEB13] = 0xFFFF148D ^ 0xEB13;
        FriendCommand.C[0x5DAC ^ 0x5CA9] = 0xD873 ^ 0x5CA9;
        FriendCommand.C[0x7780 ^ 0x770B] = 0x730F ^ 0x770B;
        FriendCommand.C[0xC7D8 ^ 0xC658] = 0xBA9C ^ 0xC658;
        FriendCommand.C[0x109F ^ 0x1030] = 0x105D ^ 0x1030;
        FriendCommand.C[0x3597 ^ 0x3503] = 0x3503 ^ 0x3503;
        FriendCommand.C[0x9ED6 ^ 0x9E15] = 0x9E17 ^ 0x9E15;
        FriendCommand.C[0xF08 ^ 0xF03] = 0xF06 ^ 0xF03;
        FriendCommand.C[0xDDEC ^ 0xDD15] = 0x1DEFA ^ 0xDD15;
        FriendCommand.C[0x77A4 ^ 0x77C3] = 0x77C7 ^ 0x77C3;
        FriendCommand.C[0xC45B ^ 0xC419] = 0xC403 ^ 0xC419;
        FriendCommand.C[0xE13D ^ 0xE03F] = 0x64E7 ^ 0xE03F;
        FriendCommand.C[0xF867 ^ 0xF954] = 0xFFFF1D63 ^ 0xF954;
        FriendCommand.C[0x1012C ^ 0x101D8] = 0x14A28 ^ 0x101D8;
        FriendCommand.C[0x10DEC ^ 0x10CE3] = 0x1146F ^ 0x10CE3;
        FriendCommand.C[0xDD23 ^ 0xDC44] = 0xB44B ^ 0xDC44;
        FriendCommand.C[0x4CAF ^ 0x4DF8] = 0xFFFF793F ^ 0x4DF8;
        FriendCommand.C[0x6248 ^ 0x6233] = 0x62F0 ^ 0x6233;
        FriendCommand.C[0x4BE5 ^ 0x4B37] = 0x4B36 ^ 0x4B37;
        FriendCommand.C[0x106F9 ^ 0x107F2] = 0x10F66 ^ 0x107F2;
        FriendCommand.C[0x68E5 ^ 0x68B9] = 0xFFFF971C ^ 0x68B9;
        FriendCommand.C[0x7FC4 ^ 0x7F66] = 0xFFFF808A ^ 0x7F66;
        FriendCommand.C[0xD170 ^ 0xD1BE] = 0xD1BF ^ 0xD1BE;
        FriendCommand.C[0x9555 ^ 0x94DB] = 0x7D9C ^ 0x94DB;
        FriendCommand.C[0xCAE2 ^ 0xCB97] = 0x1C9BC ^ 0xCB97;
        FriendCommand.C[0xAAFF ^ 0xABB8] = 0xF63A ^ 0xABB8;
        FriendCommand.C[0x106D5 ^ 0x10655] = 0xFFFEF987 ^ 0x10655;
        FriendCommand.C[0xFFF2 ^ 0xFE76] = 0x6688 ^ 0xFE76;
        FriendCommand.C[0x3F7B ^ 0x3E08] = 0x5168 ^ 0x3E08;
        FriendCommand.C[0x3DBB ^ 0x3CD9] = 0xF72C ^ 0x3CD9;
        FriendCommand.C[0x59B5 ^ 0x58B4] = 0x9617 ^ 0x58B4;
        FriendCommand.C[0x7ED5 ^ 0x7FBF] = 0xC7ED ^ 0x7FBF;
        FriendCommand.C[0xFC4F ^ 0xFCC6] = 0xAB87 ^ 0xFCC6;
        FriendCommand.C[0x6B82 ^ 0x6BC3] = 0xFFFF9410 ^ 0x6BC3;
        FriendCommand.C[0x112A ^ 0x1169] = 0x1139 ^ 0x1169;
        FriendCommand.C[0x8AF ^ 0x84C] = 0x10E9D ^ 0x84C;
        FriendCommand.C[0xF683 ^ 0xF6D6] = 0xFFFF095B ^ 0xF6D6;
        FriendCommand.C[0x4E3A ^ 0x4ED0] = 0xD54D ^ 0x4ED0;
        FriendCommand.C[0x7D17 ^ 0x7DAA] = 0x7D89 ^ 0x7DAA;
        FriendCommand.C[0x4CBB ^ 0x4CAA] = 0xFFFFB328 ^ 0x4CAA;
        FriendCommand.C[0x4E73 ^ 0x4E3D] = 0x4E20 ^ 0x4E3D;
        FriendCommand.C[0xEB91 ^ 0xEBA4] = 0xEB91 ^ 0xEBA4;
        FriendCommand.C[0x6B28 ^ 0x6B8F] = 0x6B80 ^ 0x6B8F;
        FriendCommand.C[0xCA0D ^ 0xCADE] = 0xCADE ^ 0xCADE;
        FriendCommand.C[0x7A57 ^ 0x7B0D] = 0x6148 ^ 0x7B0D;
        FriendCommand.C[0xD249 ^ 0xD35C] = 0x406D ^ 0xD35C;
        FriendCommand.C[0x58E ^ 0x503] = 0x1756 ^ 0x503;
        FriendCommand.C[0x8B9E ^ 0x8AF7] = 0x32A3 ^ 0x8AF7;
        FriendCommand.C[0xF622 ^ 0xF666] = 0xF65C ^ 0xF666;
        FriendCommand.C[0x7F14 ^ 0x7F96] = 0x7F96 ^ 0x7F96;
        FriendCommand.C[0x36F3 ^ 0x36D6] = 0xFFFFC90F ^ 0x36D6;
        FriendCommand.C[0x699B ^ 0x6967] = 0xFFFFF9CD ^ 0x6967;
        FriendCommand.C[0xC5C ^ 0xC43] = 0xFFFFF3EF ^ 0xC43;
        FriendCommand.C[0x1C7B ^ 0x1D4B] = 0x111CE ^ 0x1D4B;
        FriendCommand.C[0x8F3B ^ 0x8F41] = 0x8F4B ^ 0x8F41;
        FriendCommand.C[0xF737 ^ 0xF76C] = 0xF71F ^ 0xF76C;
        FriendCommand.C[0x102A8 ^ 0x10296] = 0x102C2 ^ 0x10296;
        FriendCommand.C[0xA727 ^ 0xA7E0] = 0xA7CD ^ 0xA7E0;
        FriendCommand.C[0x75BA ^ 0x75D8] = 0xFFFF8A28 ^ 0x75D8;
        FriendCommand.C[0x65FB ^ 0x650E] = 0x2EAC ^ 0x650E;
        FriendCommand.C[0x3A99 ^ 0x3A25] = 0x3A19 ^ 0x3A25;
        FriendCommand.C[0x3E9C ^ 0x3E8F] = 0xFFFFC114 ^ 0x3E8F;
        FriendCommand.C[0xE1A9 ^ 0xE1FF] = 0xFFFF1E0D ^ 0xE1FF;
        FriendCommand.C[0x53FC ^ 0x529A] = 0x3AF8 ^ 0x529A;
        FriendCommand.C[0x9621 ^ 0x9638] = 0x963A ^ 0x9638;
        FriendCommand.C[0xBA9F ^ 0xBAA6] = 0xFFFF4553 ^ 0xBAA6;
        FriendCommand.C[0x886E ^ 0x8953] = 0x75DF ^ 0x8953;
        FriendCommand.C[0x4B5E ^ 0x4BF6] = 0xFFFFB44D ^ 0x4BF6;
        FriendCommand.C[0xA422 ^ 0xA49C] = 0xA49B ^ 0xA49C;
        FriendCommand.C[0x726C ^ 0x7342] = 0x17FC7 ^ 0x7342;
        FriendCommand.C[0x8A15 ^ 0x8A6D] = 0xFFFF75C2 ^ 0x8A6D;
        FriendCommand.C[0x296A ^ 0x2949] = 0x2944 ^ 0x2949;
        FriendCommand.C[0xEE4D ^ 0xEF01] = 0x4828 ^ 0xEF01;
        FriendCommand.C[0x969A ^ 0x961B] = 0x9618 ^ 0x961B;
        FriendCommand.C[0x52DD ^ 0x53A2] = 0x2F27 ^ 0x53A2;
        FriendCommand.C[0x1FA7 ^ 0x1F87] = 0x1F99 ^ 0x1F87;
        FriendCommand.C[0xDACD ^ 0xDA72] = 0xFFFF25BA ^ 0xDA72;
        FriendCommand.C[0x21D2 ^ 0x2167] = 0xFFFFDEDE ^ 0x2167;
        FriendCommand.C[0x20FD ^ 0x20AE] = 0x20C4 ^ 0x20AE;
        FriendCommand.C[0xA419 ^ 0xA496] = 0xC231 ^ 0xA496;
        FriendCommand.C[0x68BE ^ 0x6848] = 0x16BAE ^ 0x6848;
    }
}

