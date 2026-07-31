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
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.mixin.ClientPlayerInteractionManagerInvoker;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.restrict.FuntimeRestrict;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import org.jetbrains.annotations.NotNull;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0003J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u001f\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b \u0010\u0012J\u000f\u0010!\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b!\u0010\u0003R\u0016\u0010\"\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010'\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b'\u0010#\u00a8\u0006("}, d2={"Lkotakbaz/rain/module/modules/player/AutoEatModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lnet/minecraft/class_746;", "player", "maintainEating", "(Lnet/minecraft/class_746;)V", "", "slot", "startEating", "(Lnet/minecraft/class_746;I)V", "stopEating", "findFoodSlot", "(Lnet/minecraft/class_746;)Ljava/lang/Integer;", "Lnet/minecraft/class_1799;", "stack", "", "canEat", "(Lnet/minecraft/class_746;Lnet/minecraft/class_1799;)Z", "shouldEat", "(Lnet/minecraft/class_746;)Z", "isActiveEating", "()Z", "shouldAbort", "selectSlot", "resetState", "isEating", "Z", "previousSlot", "I", "eatingSlot", "previousUsePressed", "rain-visuals"})
public final class AutoEatModule
extends Module {
    @NotNull
    public static final AutoEatModule INSTANCE;
    private static boolean a;
    private static int A;
    private static int b;
    private static boolean B;
    private static Object[] c;
    private static Object d;
    private static Object[] D;
    private static Object[] C;
    private static Object[] e;
    public static int[] E;

    private AutoEatModule() {
        int n2 = E[0];
        n2 -= E[1];
        int n3 = E[3];
        n3 += E[4];
        int n4 = E[6];
        n4 += E[7];
        super((String)c[n2 += E[2]], a_0.getPLAYER(), (String)c[n3 ^= E[5]] + (String)c[n4 += E[8]]);
    }

    @Override
    public void onEnable() {
        this.resetState();
    }

    @Override
    public void onDisable() {
        this.stopEating();
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        long l2 = 144766728314892645L;
        long l3 = -6715819760048718120L;
        int n2 = E[9];
        n2 -= E[10];
        Intrinsics.checkNotNullParameter(event, (String)c[n2 -= E[11]]);
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            AutoEatModule autoEatModule = this;
            long l4 = l2;
            int n3 = E[12];
            n3 -= E[13];
            l2 = l4 ^ (0L ^ l4) & -1L << (n3 ^= E[14]);
            autoEatModule.resetState();
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        if (kotakbaz.rain.client.extensions.b.getMc().world == null || kotakbaz.rain.client.extensions.b.getMc().interactionManager == null) {
            this.stopEating();
            return;
        }
        if (this.shouldAbort(clientPlayerEntity2)) {
            this.stopEating();
            return;
        }
        if (a) {
            this.maintainEating(clientPlayerEntity2);
            return;
        }
        if (!this.shouldEat(clientPlayerEntity2)) {
            return;
        }
        if (clientPlayerEntity2.isUsingItem()) {
            return;
        }
        Integer n4 = this.findFoodSlot(clientPlayerEntity2);
        if (n4 == null) {
            return;
        }
        int n5 = E[15];
        n5 -= E[16];
        long l5 = l3;
        int n6 = E[18];
        n6 ^= E[19];
        l3 = l5 ^ ((long)n4.intValue() << (n5 -= E[17]) ^ l5) & -1L << (n6 ^= E[20]);
        int n7 = E[21];
        n7 -= E[22];
        this.startEating(clientPlayerEntity2, (int)(l3 >>> (n7 ^= E[23])));
    }

    /*
     * Unable to fully structure code
     */
    private final void maintainEating(ClientPlayerEntity player) {
        block10: {
            var4_2 = 4074743699404631861L;
            var6_3 = -112328148297044764L;
            if (!this.shouldEat(player) && !player.isUsingItem()) {
                this.stopEating();
                return;
            }
            var9_4 = AutoEatModule.E[24];
            var9_4 -= AutoEatModule.E[25];
            v0 = var6_3;
            var11_5 = AutoEatModule.E[27];
            var11_5 += AutoEatModule.E[28];
            var6_3 = v0 ^ ((long)AutoEatModule.b << (var9_4 -= AutoEatModule.E[26]) ^ v0) & -1L << (var11_5 -= AutoEatModule.E[29]);
            var13_6 = AutoEatModule.E[30];
            var13_6 -= AutoEatModule.E[31];
            var15_7 = AutoEatModule.E[33];
            var15_7 -= AutoEatModule.E[34];
            if ((var13_6 ^= AutoEatModule.E[32]) <= (int)(var6_3 >>> (var15_7 += AutoEatModule.E[35]))) {
                var17_8 = AutoEatModule.E[36];
                var17_8 ^= AutoEatModule.E[37];
                var19_9 = AutoEatModule.E[39];
                var19_9 ^= AutoEatModule.E[40];
                if ((int)(var6_3 >>> (var17_8 ^= AutoEatModule.E[38])) < (var19_9 += AutoEatModule.E[41])) {
                    var21_10 = AutoEatModule.E[42];
                    var21_10 -= AutoEatModule.E[43];
                    v1 = var21_10 -= AutoEatModule.E[44];
                } else {
                    var23_11 = AutoEatModule.E[45];
                    var23_11 ^= AutoEatModule.E[46];
                    v1 = var23_11 ^= AutoEatModule.E[47];
                }
            } else {
                var25_12 = AutoEatModule.E[48];
                var25_12 ^= AutoEatModule.E[49];
                v1 = var25_12 -= AutoEatModule.E[50];
            }
            if (v1 == 0) ** GOTO lbl-1000
            v2 = player.getInventory().getStack(AutoEatModule.b);
            var27_13 = AutoEatModule.E[51];
            var27_13 ^= AutoEatModule.E[52];
            Intrinsics.checkNotNullExpressionValue(v2, (String)AutoEatModule.c[var27_13 ^= AutoEatModule.E[53]]);
            if (this.canEat(player, v2)) {
                v3 = AutoEatModule.b;
            } else lbl-1000:
            // 2 sources

            {
                v3 = var2_14 = this.findFoodSlot(player);
            }
            if (var2_14 == null) {
                if (!player.isUsingItem()) {
                    this.stopEating();
                }
                return;
            }
            AutoEatModule.b = var2_14;
            this.selectSlot(player, var2_14);
            var29_15 = AutoEatModule.E[54];
            var29_15 += AutoEatModule.E[55];
            kotakbaz.rain.client.extensions.b.getMc().options.useKey.setPressed(var29_15 += AutoEatModule.E[56]);
            if (player.isUsingItem()) break block10;
            v4 = kotakbaz.rain.client.extensions.b.getMc().interactionManager;
            if (v4 != null) {
                v4.interactItem((PlayerEntity)player, Hand.MAIN_HAND);
            }
        }
    }

    private final void startEating(ClientPlayerEntity player, int slot) {
        block0: {
            A = player.getInventory().getSelectedSlot();
            B = kotakbaz.rain.client.extensions.b.getMc().options.useKey.isPressed();
            b = slot;
            int n2 = E[57];
            n2 ^= E[58];
            a = n2 -= E[59];
            this.selectSlot(player, slot);
            boolean bl = E[60];
            bl += E[61];
            kotakbaz.rain.client.extensions.b.getMc().options.useKey.setPressed(bl ^= E[62]);
            ClientPlayerInteractionManager clientPlayerInteractionManager = kotakbaz.rain.client.extensions.b.getMc().interactionManager;
            if (clientPlayerInteractionManager == null) break block0;
            clientPlayerInteractionManager.interactItem((PlayerEntity)player, Hand.MAIN_HAND);
        }
    }

    private final void stopEating() {
        long l2 = -442132012817521901L;
        long l3 = -2364344653460861882L;
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (a) {
            kotakbaz.rain.client.extensions.b.getMc().options.useKey.setPressed(B);
            if (clientPlayerEntity != null) {
                int n2;
                int n3 = E[63];
                n3 += E[64];
                long l4 = l3;
                int n4 = E[66];
                n4 ^= E[67];
                l3 = l4 ^ ((long)A << (n3 += E[65]) ^ l4) & -1L << (n4 ^= E[68]);
                int n5 = E[69];
                n5 ^= E[70];
                int n6 = E[72];
                n6 += E[73];
                if ((n5 -= E[71]) <= (int)(l3 >>> (n6 ^= E[74]))) {
                    int n7 = E[75];
                    n7 += E[76];
                    int n8 = E[78];
                    n8 += E[79];
                    if ((int)(l3 >>> (n7 -= E[77])) < (n8 += E[80])) {
                        int n9 = E[81];
                        n9 -= E[82];
                        n2 = n9 += E[83];
                    } else {
                        int n10 = E[84];
                        n10 ^= E[85];
                        n2 = n10 -= E[86];
                    }
                } else {
                    int n11 = E[87];
                    n11 += E[88];
                    n2 = n11 += E[89];
                }
                if (n2 != 0) {
                    this.selectSlot(clientPlayerEntity, A);
                }
            }
        }
        this.resetState();
    }

    private final Integer findFoodSlot(ClientPlayerEntity player) {
        long l2 = -983922923725951629L;
        long l3 = -6601274241407308730L;
        long l4 = -9121734096982006202L;
        long l5 = -4612009775669504032L;
        int n2 = E[90];
        n2 += E[91];
        long l6 = l3;
        int n3 = E[93];
        n3 ^= E[94];
        l3 = l6 ^ ((long)player.getInventory().getSelectedSlot() << (n2 += E[92]) ^ l6) & -1L << (n3 -= E[95]);
        int n4 = E[96];
        n4 ^= E[97];
        ItemStack itemStack = player.getInventory().getStack((int)(l3 >>> (n4 -= E[98])));
        int n5 = E[99];
        n5 += E[100];
        Intrinsics.checkNotNullExpressionValue(itemStack, (String)c[n5 += E[101]]);
        if (this.canEat(player, itemStack)) {
            int n6 = E[102];
            n6 -= E[103];
            return (int)(l3 >>> (n6 ^= E[104]));
        }
        long l7 = l5;
        int n7 = E[105];
        l5 = l7 ^ (0L ^ l7) & -1L << (n7 ^= E[106]);
        while (true) {
            int n8 = E[107];
            n8 += E[108];
            int n9 = E[110];
            n9 += E[111];
            if ((int)(l5 >>> (n8 += E[109])) >= (n9 -= E[112])) break;
            int n10 = E[113];
            n10 += E[114];
            ItemStack itemStack2 = player.getInventory().getStack((int)(l5 >>> (n10 ^= E[115])));
            int n11 = E[116];
            n11 -= E[117];
            Intrinsics.checkNotNullExpressionValue(itemStack2, (String)c[n11 ^= E[118]]);
            if (this.canEat(player, itemStack2)) {
                int n12 = E[119];
                n12 -= E[120];
                return (int)(l5 >>> (n12 ^= E[121]));
            }
            l5 += 0x100000000L;
        }
        return null;
    }

    private final boolean canEat(ClientPlayerEntity player, ItemStack stack) {
        if (stack.isEmpty()) {
            boolean bl = E[122];
            bl ^= E[123];
            return bl -= E[124];
        }
        FoodComponent foodComponent = (FoodComponent)stack.get(DataComponentTypes.FOOD);
        if (foodComponent == null) {
            boolean bl = E[125];
            bl -= E[126];
            return bl ^= E[127];
        }
        FoodComponent foodComponent2 = foodComponent;
        return player.canConsume(foodComponent2.canAlwaysEat());
    }

    private final boolean shouldEat(ClientPlayerEntity player) {
        boolean bl;
        int n2 = E[128];
        n2 ^= E[129];
        if (player.getHungerManager().getFoodLevel() < (n2 ^= E[130])) {
            boolean bl2 = E[131];
            bl2 ^= E[132];
            bl = bl2 ^= E[133];
        } else {
            boolean bl3 = E[134];
            bl3 -= E[135];
            bl = bl3 -= E[136];
        }
        return bl;
    }

    public final boolean isActiveEating() {
        int n2;
        if (this.isEnabled() && a) {
            int n3 = E[137];
            n3 ^= E[138];
            n2 = n3 += E[139];
        } else {
            int n4 = E[140];
            n4 -= E[141];
            n2 = n4 -= E[142];
        }
        return n2 != 0;
    }

    private final boolean shouldAbort(ClientPlayerEntity player) {
        if (kotakbaz.rain.client.extensions.b.getMc().currentScreen != null) {
            boolean bl = E[143];
            bl -= E[144];
            return bl ^= E[145];
        }
        if (!player.isAlive()) {
            boolean bl = E[146];
            bl += E[147];
            return bl += E[148];
        }
        return player.isSpectator();
    }

    private final void selectSlot(ClientPlayerEntity player, int slot) {
        block6: {
            int n2;
            int n3 = E[149];
            n3 -= E[150];
            if ((n3 += E[151]) <= slot) {
                int n4 = E[152];
                n4 += E[153];
                if (slot < (n4 += E[154])) {
                    int n5 = E[155];
                    n5 ^= E[156];
                    n2 = n5 -= E[157];
                } else {
                    int n6 = E[158];
                    n6 ^= E[159];
                    n2 = n6 -= E[160];
                }
            } else {
                int n7 = E[161];
                n7 += E[162];
                n2 = n7 += E[163];
            }
            if (n2 == 0) {
                return;
            }
            if (player.getInventory().getSelectedSlot() == slot) {
                return;
            }
            player.getInventory().setSelectedSlot(slot);
            ClientPlayerInteractionManager clientPlayerInteractionManager = kotakbaz.rain.client.extensions.b.getMc().interactionManager;
            ClientPlayerInteractionManagerInvoker clientPlayerInteractionManagerInvoker = clientPlayerInteractionManager instanceof ClientPlayerInteractionManagerInvoker ? (ClientPlayerInteractionManagerInvoker)clientPlayerInteractionManager : null;
            if (clientPlayerInteractionManagerInvoker == null) break block6;
            clientPlayerInteractionManagerInvoker.rain$syncSelectedSlot();
        }
    }

    private final void resetState() {
        int n2 = E[164];
        n2 += E[165];
        a = n2 += E[166];
        int n3 = E[167];
        n3 -= E[168];
        A = n3 -= E[169];
        int n4 = E[170];
        n4 += E[171];
        b = n4 ^= E[172];
        int n5 = E[173];
        n5 ^= E[174];
        B = n5 ^= E[175];
    }

    static {
        AutoEatModule.b();
        long l2 = -667902648206242381L;
        long l3 = -56535434619512943L;
        long l4 = -1025755815118826490L;
        long l5 = -7308753558961685391L;
        long l6 = -828482331801146136L;
        long l7 = 9012051412953794694L;
        long l8 = -8955538285814128176L;
        long l9 = 3948566533382015062L;
        long l10 = 4785751687229396921L;
        long l11 = 1697203747737301437L;
        long l12 = 8060983791192701973L;
        long l13 = 1166379718787374081L;
        long l14 = -5781051267368071935L;
        long l15 = 8050860063628682531L;
        int n2 = E[176];
        n2 ^= E[177];
        c = new Object[n2 += E[178]];
        long l16 = l15;
        int n3 = E[179];
        n3 ^= E[180];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= E[181]);
        Object[] objectArray = new Object[E[182]];
        objectArray[AutoEatModule.E[183]] = C;
        objectArray[AutoEatModule.E[184]] = E[185];
        int n4 = E[186];
        Object object = AutoEatModule.A()[E[187]];
        if (object == null) {
            char[] cArray = "\u5c52\u5c71\u5c41\u5c39\u5c42\u5c23\u5c58\u5c23\u5c56\u5c2f\u5c40\u5c59\u5c2d\u5c31\u5c54\u5c31\u5c58\u5c50\u5c43\u5c6c\u5c6c\u5c38\u5c6c\u5c2e\u5c71\u5c55\u5c4b\u5c2b\u5c45\u5c09\u5c21\u5c6b\u5c30\u5c2b\u5c58\u5c2d\u5c39\u5c50\u5c30\u5c2a\u5c2d\u5c5a\u5c4e\u5c71\u5fdf\u5c44\u5c6f\u5c6f\u5c44\u5c54\u5c4e\u5c03\u5c42\u5c46\u5c32\u5c4e\u5c71\u5c3a\u5c0a\u5c7f\u5c72\u5c45\u5c35\u5c25\u5c6b\u5c59\u5c7f\u5c33\u5c4f\u5c4b\u5c57\u5c33\u5c30\u5c4b\u5c40\u5c06\u5c03\u5c53\u5c05\u5c03\u5c4b\u5c05\u5c72\u5c2f\u5c33\u5c53\u5c06\u5c3a\u5c40\u5c2e\u5c6b\u5c78\u5c06\u5c03\u5c4e\u5c31\u5c57\u5c2e\u5c21\u5c4e\u5c2b\u5c35\u5c20\u5c33\u5c4b\u5c42\u5c6c\u5c53\u5c31\u5c36\u5c2c\u5c50\u5c4a\u5c2d\u5c39\u5c56\u5c43\u5c7f\u5c41\u5c44\u5c44\u5c37\u5c04\u5c5a\u5c71\u5c40\u5c26\u5c71\u5c30\u5c70\u5c71\u5c55\u5c22\u5c0a\u5c70\u5c32\u5c4f\u5c51\u5c2f\u5c6c\u5c38\u5c04\u5c21\u5c26\u5c4f\u5c09\u5c2a\u5c44\u5c57\u5c0a\u5c37\u5c3a\u5c4c\u5fdf\u5c58\u5c50\u5c72\u5c24\u5c24\u5c37\u5c44\u5c51\u5c2c\u5c4e\u5c45\u5c2b\u5c35\u5c46\u5c29\u5c70\u5c2b\u5c23\u5c7f\u5c06\u5c29\u5c32\u5c4e\u5c2a\u5c4c\u5c2e\u5c25\u5c03\u5c32\u5c2e\u5c03\u5c4f\u5c2e\u5c39\u5c55\u5c6f\u5c4d\u5c21".toCharArray();
            for (int i2 = E[188]; i2 < E[189]; ++i2) {
                int n5 = cArray[i2];
                n5 ^= E[190];
                n5 -= E[191];
                n5 -= E[192];
                n5 -= E[193];
                n5 -= E[194];
                n5 += E[195];
                n5 -= E[196];
                n5 += E[197];
                n5 ^= E[198];
                cArray[i2] = (char)(n5 -= E[199]);
            }
            object = AutoEatModule.A()[AutoEatModule.E[200]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)AutoEatModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = E[201];
        n6 -= E[202];
        l6 = l17 ^ (0x6100000000L ^ l17) & -1L << (n6 ^= E[203]);
        long l18 = l13;
        int n7 = E[204];
        n7 ^= E[205];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= E[206]);
        while (true) {
            int n8 = E[207];
            n8 ^= E[208];
            if ((int)l13 >= (int)(l6 >>> (n8 += E[209]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = E[210];
            n10 ^= E[211];
            int n11 = E[213];
            n11 += E[214];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= E[212])) & -1L >>> (n11 ^= E[215]);
            long l20 = l9;
            int n12 = E[216];
            n12 += E[217];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= E[218]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = E[219];
            n14 += E[220];
            int n15 = E[222];
            n15 ^= E[223];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 += E[221])) & -1L >>> (n15 ^= E[224]);
            int n16 = E[225];
            n16 ^= E[226];
            long l22 = l10;
            int n17 = E[228];
            n17 += E[229];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= E[227]) ^ l22) & -1L << (n17 ^= E[230]);
            int n18 = E[231];
            n18 += E[232];
            n18 ^= E[233];
            int n19 = E[234];
            n19 += E[235];
            long l23 = l12;
            int n20 = E[237];
            n20 ^= E[238];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= E[236]))) ^ l23) & -1L >>> (n20 -= E[239]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = E[240];
            n21 ^= E[241];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= E[242]);
            while (true) {
                int n22 = E[243];
                n22 -= E[244];
                if ((int)(l14 >>> (n22 += E[245])) >= (int)l12) break;
                int n23 = E[246];
                n23 -= E[247];
                int n24 = E[249];
                n24 -= E[250];
                cArray2[(int)(l14 >>> (n23 += AutoEatModule.E[248]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= E[251]))];
                l14 += 0x100000000L;
            }
            int n25 = E[252];
            n25 ^= E[253];
            int n26 = (int)(l15 >>> (n25 ^= E[254]));
            l15 += 0x100000000L;
            AutoEatModule.c[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = E[255];
            n27 += E[256];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= E[257]);
        }
        INSTANCE = new AutoEatModule();
        int n28 = E[258];
        n28 += E[259];
        A = n28 -= E[260];
        int n29 = E[261];
        n29 += E[262];
        b = n29 += E[263];
        int n30 = E[264];
        FuntimeRestrict.moduleOnFuntime$default(FuntimeRestrict.INSTANCE, INSTANCE, null, n30 += E[265], null);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[E[266]];
        String string = (String)object[E[267]];
        object = object[E[268]];
        Object[] objectArray = D;
        if (D == null) {
            objectArray = D = new Object[E[269]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[E[270]];
                C = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[E[272] ^ E[273]];
                byArray[AutoEatModule.E[274] ^ AutoEatModule.E[275]] = E[276] ^ E[277];
                byArray[AutoEatModule.E[278] ^ AutoEatModule.E[279]] = E[280] ^ E[281];
                byArray[AutoEatModule.E[282] ^ AutoEatModule.E[283]] = E[284] ^ E[285];
                byArray[AutoEatModule.E[286] ^ AutoEatModule.E[287]] = E[288] ^ E[289];
                byArray[AutoEatModule.E[290] ^ AutoEatModule.E[291]] = E[292] ^ E[293];
                byArray[AutoEatModule.E[294] ^ AutoEatModule.E[295]] = E[296] ^ E[297];
                byArray[AutoEatModule.E[298] ^ AutoEatModule.E[299]] = E[300] ^ E[301];
                byArray[AutoEatModule.E[302] ^ AutoEatModule.E[303]] = E[304] ^ E[305];
                byArray[AutoEatModule.E[306] ^ AutoEatModule.E[307]] = E[308] ^ E[309];
                byArray[AutoEatModule.E[310] ^ AutoEatModule.E[311]] = E[312] ^ E[313];
                byArray[AutoEatModule.E[314] ^ AutoEatModule.E[315]] = E[316] ^ E[317];
                byArray[AutoEatModule.E[318] ^ AutoEatModule.E[319]] = E[320] ^ E[321];
                byArray[AutoEatModule.E[322] ^ AutoEatModule.E[323]] = E[324] ^ E[325];
                byArray[AutoEatModule.E[326] ^ AutoEatModule.E[327]] = E[328] ^ E[329];
                byArray[AutoEatModule.E[330] ^ AutoEatModule.E[331]] = E[332] ^ E[333];
                byArray[AutoEatModule.E[334] ^ AutoEatModule.E[335]] = E[336] ^ E[337];
                objectArray2[AutoEatModule.E[271]] = byArray;
            }
            byte[] byArray = (byte[])object3[E[338]];
            if (d == null) {
                byte[] byArray2 = new byte[E[339] ^ E[340]];
                byArray2[AutoEatModule.E[341] ^ AutoEatModule.E[342]] = E[343] ^ E[344];
                byArray2[AutoEatModule.E[345] ^ AutoEatModule.E[346]] = E[347] ^ E[348];
                byArray2[AutoEatModule.E[349] ^ AutoEatModule.E[350]] = E[351] ^ E[352];
                byArray2[AutoEatModule.E[353] ^ AutoEatModule.E[354]] = E[355] ^ E[356];
                byArray2[AutoEatModule.E[357] ^ AutoEatModule.E[358]] = E[359] ^ E[360];
                byArray2[AutoEatModule.E[361] ^ AutoEatModule.E[362]] = E[363] ^ E[364];
                byArray2[AutoEatModule.E[365] ^ AutoEatModule.E[366]] = E[367] ^ E[368];
                byArray2[AutoEatModule.E[369] ^ AutoEatModule.E[370]] = E[371] ^ E[372];
                byArray2[AutoEatModule.E[373] ^ AutoEatModule.E[374]] = E[375] ^ E[376];
                byArray2[AutoEatModule.E[377] ^ AutoEatModule.E[378]] = E[379] ^ E[380];
                byArray2[AutoEatModule.E[381] ^ AutoEatModule.E[382]] = E[383] ^ E[384];
                byArray2[AutoEatModule.E[385] ^ AutoEatModule.E[386]] = E[387] ^ E[388];
                byArray2[AutoEatModule.E[389] ^ AutoEatModule.E[390]] = E[391] ^ E[392];
                byArray2[AutoEatModule.E[393] ^ AutoEatModule.E[394]] = E[395] ^ E[396];
                byArray2[AutoEatModule.E[397] ^ AutoEatModule.E[398]] = E[399] ^ 0x66CF;
                byArray2[0xF7C2 ^ 0xF7C0] = 0xF7BB ^ 0xF7C0;
                byArray2[0x8C54 ^ 0x8C59] = 0xFFFF73FA ^ 0x8C59;
                byArray2[0xB55E ^ 0xB559] = 0xB522 ^ 0xB559;
                byArray2[0x9D8C ^ 0x9D86] = 0x9D94 ^ 0x9D86;
                byArray2[0x20A4 ^ 0x20BE] = 0x20EE ^ 0x20BE;
                byArray2[0x7813 ^ 0x7812] = 0x785D ^ 0x7812;
                byArray2[0x69D2 ^ 0x69DB] = 0xFFFF965F ^ 0x69DB;
                byArray2[0xC3F8 ^ 0xC3EA] = 0xC381 ^ 0xC3EA;
                byArray2[0xED68 ^ 0xED7B] = 0xFFFF12A2 ^ 0xED7B;
                byArray2[0x17F0 ^ 0x17F0] = 0x1784 ^ 0x17F0;
                byArray2[0x806E ^ 0x8061] = 0x8076 ^ 0x8061;
                byArray2[0x15F1 ^ 0x15E4] = 0x159B ^ 0x15E4;
                byArray2[0x4767 ^ 0x4770] = 0x471B ^ 0x4770;
                byArray2[0x4678 ^ 0x4666] = 0x4609 ^ 0x4666;
                byArray2[0x293F ^ 0x2927] = 0xFFFFD6B2 ^ 0x2927;
                byArray2[0x348B ^ 0x3490] = 0xFFFFCB57 ^ 0x3490;
                byArray2[0xFDDC ^ 0xFDD4] = 0xFFFF0215 ^ 0xFDD4;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = AutoEatModule.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u7fc0\u7f66\u7fbb\u7f64\u7f6a\u7f56\u7fb7\u7f9d\u7f94\u7fc8\u7f68\u7fa1\u7fc5\u7fc3\u7fb3\u7f68\u7f65\u7f55".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 -= 9826;
                        n3 -= 29605;
                        n3 += 40456;
                        n3 += 17864;
                        n3 -= 16076;
                        n3 += 7150;
                        n3 -= 20817;
                        n3 += 8851;
                        n3 ^= 0x6855;
                        n3 -= 57494;
                        n3 -= 19160;
                        n3 += 27484;
                        n3 -= 63740;
                        n3 -= 17789;
                        n3 -= 7550;
                        cArray[i2] = (char)(n3 ^= 0x3FF);
                    }
                    object4 = AutoEatModule.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[0] = -116;
                byArray4[12] = -88;
                byArray4[3] = -17;
                byArray4[4] = -125;
                byArray4[9] = -97;
                byArray4[15] = 59;
                byArray4[5] = 64;
                byArray4[7] = 90;
                byArray4[1] = 6;
                byArray4[14] = 36;
                byArray4[13] = 116;
                byArray4[2] = 58;
                byArray4[8] = 73;
                byArray4[6] = 110;
                byArray4[11] = -9;
                byArray4[10] = -107;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 19, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = AutoEatModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u170c\u16f0\u16fe".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 53952;
                        n4 ^= 0xABF1;
                        n4 += 28785;
                        n4 += 45188;
                        n4 += 41253;
                        n4 -= 15095;
                        n4 -= 29912;
                        n4 += 12569;
                        n4 -= 24107;
                        n4 += 57244;
                        cArray[i3] = (char)(n4 += 19375);
                    }
                    object5 = AutoEatModule.A()[2] = new String(cArray);
                }
                d = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = AutoEatModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\uabab\uac87\uac49\uac5d\uac79\uac7a\uac79\uac5d\uac7c\uac51\uac79\uac49\uabb7\uac7c\uac4b\uac28\uac28\uac23\uac1e\uac25".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 57108;
                    n5 += 49797;
                    n5 -= 31733;
                    n5 -= 48389;
                    n5 ^= 0x8D56;
                    n5 -= 58711;
                    n5 += 61129;
                    n5 ^= 0x6819;
                    n5 -= 36569;
                    n5 += 33370;
                    cArray[i4] = (char)(n5 -= 32831);
                }
                object6 = AutoEatModule.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)d), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = e;
        if (e == null) {
            e = new Object[4];
            objectArray = e;
        }
        return objectArray;
    }

    public static void b() {
        E = new int[0x80DF ^ 0x814F];
        AutoEatModule.E[0x4438 ^ 0x4463] = 0xFFFFBBDF ^ 0x4463;
        AutoEatModule.E[0xD238 ^ 0xD30C] = 0xFFFFA438 ^ 0xD30C;
        AutoEatModule.E[0xA9DE ^ 0xA984] = 0xA95D ^ 0xA984;
        AutoEatModule.E[0x620 ^ 0x677] = 0xFFFFF9FE ^ 0x677;
        AutoEatModule.E[0x7B3E ^ 0x7BA8] = 0xFFFF8422 ^ 0x7BA8;
        AutoEatModule.E[0x8FCA ^ 0x8FA3] = 0xFFFF7046 ^ 0x8FA3;
        AutoEatModule.E[0xDCF1 ^ 0xDC65] = 0xFFFF23D7 ^ 0xDC65;
        AutoEatModule.E[0xB549 ^ 0xB541] = 0xFFFF4AC0 ^ 0xB541;
        AutoEatModule.E[0x102AD ^ 0x1021C] = 0x1026C ^ 0x1021C;
        AutoEatModule.E[0xE96F ^ 0xE913] = 0xE94E ^ 0xE913;
        AutoEatModule.E[0x1118 ^ 0x118B] = 0xFFFFEE7E ^ 0x118B;
        AutoEatModule.E[0x930B ^ 0x924E] = 0x7710 ^ 0x924E;
        AutoEatModule.E[0x1747 ^ 0x175E] = 0x177F ^ 0x175E;
        AutoEatModule.E[0xE5FB ^ 0xE498] = 0x355C ^ 0xE498;
        AutoEatModule.E[0x3333 ^ 0x3215] = 0x3F17 ^ 0x3215;
        AutoEatModule.E[0xA0E9 ^ 0xA0E7] = 0xA0AC ^ 0xA0E7;
        AutoEatModule.E[0x5E9F ^ 0x5E5C] = 0x74B ^ 0x5E5C;
        AutoEatModule.E[0x1006D ^ 0x10168] = 0xFFFEFE87 ^ 0x10168;
        AutoEatModule.E[0x5BED ^ 0x5B4E] = 0x5B57 ^ 0x5B4E;
        AutoEatModule.E[0x7051 ^ 0x7067] = 0x706E ^ 0x7067;
        AutoEatModule.E[0xE210 ^ 0xE271] = 0xFFFF1DBC ^ 0xE271;
        AutoEatModule.E[0xB04B ^ 0xB085] = 0xFFFF4F61 ^ 0xB085;
        AutoEatModule.E[0xE5DB ^ 0xE5E7] = 0xFFFF1A23 ^ 0xE5E7;
        AutoEatModule.E[0xD61E ^ 0xD641] = 0xFFFF299B ^ 0xD641;
        AutoEatModule.E[0x5754 ^ 0x5609] = 0xA174 ^ 0x5609;
        AutoEatModule.E[0x86E8 ^ 0x8623] = 0x866C ^ 0x8623;
        AutoEatModule.E[0x4A1F ^ 0x4B74] = 0xFFFF8A2C ^ 0x4B74;
        AutoEatModule.E[0xA49E ^ 0xA4C7] = 0xA4A8 ^ 0xA4C7;
        AutoEatModule.E[0x833D ^ 0x8245] = 0x285F ^ 0x8245;
        AutoEatModule.E[0x10853 ^ 0x10855] = 0x1088C ^ 0x10855;
        AutoEatModule.E[0x1052 ^ 0x112E] = 0x2710 ^ 0x112E;
        AutoEatModule.E[0x876 ^ 0x966] = 0x108EE ^ 0x966;
        AutoEatModule.E[0xEA4B ^ 0xEB0D] = 0x1E26A ^ 0xEB0D;
        AutoEatModule.E[0x39C0 ^ 0x3888] = 0x131EF ^ 0x3888;
        AutoEatModule.E[0x4759 ^ 0x467A] = 0xA24A ^ 0x467A;
        AutoEatModule.E[0xD1A0 ^ 0xD0FA] = 0xF60D ^ 0xD0FA;
        AutoEatModule.E[0x6845 ^ 0x6936] = 0xFFFF6F14 ^ 0x6936;
        AutoEatModule.E[0xFC3E ^ 0xFD33] = 0xFD32 ^ 0xFD33;
        AutoEatModule.E[0x13A4 ^ 0x12B7] = 0xCBAC ^ 0x12B7;
        AutoEatModule.E[0x6D20 ^ 0x6D3B] = 0xFFFF92E7 ^ 0x6D3B;
        AutoEatModule.E[0x814B ^ 0x8040] = 0x8042 ^ 0x8040;
        AutoEatModule.E[0x4ACF ^ 0x4A3E] = 0x4A7F ^ 0x4A3E;
        AutoEatModule.E[0xFBD1 ^ 0xFA86] = 0xD827 ^ 0xFA86;
        AutoEatModule.E[0xDE42 ^ 0xDF0F] = 0x51F6 ^ 0xDF0F;
        AutoEatModule.E[0x2D10 ^ 0x2C10] = 0x2C57 ^ 0x2C10;
        AutoEatModule.E[0x72D7 ^ 0x72F7] = 0x72BF ^ 0x72F7;
        AutoEatModule.E[0xFA16 ^ 0xFAFE] = 0xFFFF0503 ^ 0xFAFE;
        AutoEatModule.E[0x4C65 ^ 0x4CE8] = 0xFFFFB347 ^ 0x4CE8;
        AutoEatModule.E[0xDFC3 ^ 0xDE4F] = 0xDA17 ^ 0xDE4F;
        AutoEatModule.E[0x590B ^ 0x59D3] = 0x59DE ^ 0x59D3;
        AutoEatModule.E[0x1975 ^ 0x18F4] = 0x8A55 ^ 0x18F4;
        AutoEatModule.E[0x8B82 ^ 0x8BB3] = 0xFFFF743C ^ 0x8BB3;
        AutoEatModule.E[0xB931 ^ 0xB83D] = 0xB83D ^ 0xB83D;
        AutoEatModule.E[0x7431 ^ 0x75B8] = 0x71F6 ^ 0x75B8;
        AutoEatModule.E[0x1D1C ^ 0x1C69] = 0xB675 ^ 0x1C69;
        AutoEatModule.E[0xFAC5 ^ 0xFAF0] = 0xFFFF0504 ^ 0xFAF0;
        AutoEatModule.E[0xFE49 ^ 0xFF3B] = 0x6C1 ^ 0xFF3B;
        AutoEatModule.E[0x81DE ^ 0x8120] = 0xFFFF7E92 ^ 0x8120;
        AutoEatModule.E[0x6116 ^ 0x6057] = 0x61ED ^ 0x6057;
        AutoEatModule.E[0x42 ^ 0x15F] = 0xE388 ^ 0x15F;
        AutoEatModule.E[0xB2F1 ^ 0xB2B1] = 0xB2C9 ^ 0xB2B1;
        AutoEatModule.E[0x1071 ^ 0x111D] = 0x2FAD ^ 0x111D;
        AutoEatModule.E[0x36DC ^ 0x3756] = 0x330E ^ 0x3756;
        AutoEatModule.E[0x4454 ^ 0x4419] = 0xFFFFBBA9 ^ 0x4419;
        AutoEatModule.E[0xAE00 ^ 0xAEF7] = 0xFFFF5151 ^ 0xAEF7;
        AutoEatModule.E[0x3798 ^ 0x36F2] = 0x842 ^ 0x36F2;
        AutoEatModule.E[0x2F94 ^ 0x2F97] = 0x2FB8 ^ 0x2F97;
        AutoEatModule.E[0xCF88 ^ 0xCEB4] = 0xFFFF2A6C ^ 0xCEB4;
        AutoEatModule.E[0x661 ^ 0x6A7] = 0x196C ^ 0x6A7;
        AutoEatModule.E[0x2357 ^ 0x23F0] = 0x23E3 ^ 0x23F0;
        AutoEatModule.E[0x5990 ^ 0x59EF] = 0xFFFFA618 ^ 0x59EF;
        AutoEatModule.E[0x2C86 ^ 0x2C84] = 0x2CCA ^ 0x2C84;
        AutoEatModule.E[0xE9AD ^ 0xE91D] = 0xFFFF16F9 ^ 0xE91D;
        AutoEatModule.E[0x4B40 ^ 0x4A15] = 0x6897 ^ 0x4A15;
        AutoEatModule.E[0x9B26 ^ 0x9B03] = 0xFFFF649E ^ 0x9B03;
        AutoEatModule.E[0x7FE4 ^ 0x7F8B] = 0xFFFF8014 ^ 0x7F8B;
        AutoEatModule.E[0x10EBB ^ 0x10E58] = 0xFFFEF1A0 ^ 0x10E58;
        AutoEatModule.E[0x5108 ^ 0x51E1] = 0xFFFFAE63 ^ 0x51E1;
        AutoEatModule.E[0x7C09 ^ 0x7D5D] = 0x572E ^ 0x7D5D;
        AutoEatModule.E[0x136B ^ 0x123D] = 0x30A0 ^ 0x123D;
        AutoEatModule.E[0x1333 ^ 0x13EA] = 0xFFFFEC53 ^ 0x13EA;
        AutoEatModule.E[0xB3FF ^ 0xB398] = 0xB3FB ^ 0xB398;
        AutoEatModule.E[0xDC91 ^ 0xDCE9] = 0xDCAC ^ 0xDCE9;
        AutoEatModule.E[0x3562 ^ 0x354C] = 0xFFFFCAE3 ^ 0x354C;
        AutoEatModule.E[0xD437 ^ 0xD414] = 0xD435 ^ 0xD414;
        AutoEatModule.E[0x7815 ^ 0x78C5] = 0x78B4 ^ 0x78C5;
        AutoEatModule.E[0x53DD ^ 0x52DF] = 0xFFFFAD2B ^ 0x52DF;
        AutoEatModule.E[0x2C38 ^ 0x2CCA] = 0x2CB0 ^ 0x2CCA;
        AutoEatModule.E[0xCAAB ^ 0xCBB4] = 0xBAF5 ^ 0xCBB4;
        AutoEatModule.E[0xA6C3 ^ 0xA7AA] = 0x990A ^ 0xA7AA;
        AutoEatModule.E[0xE84B ^ 0xE8E0] = 0xE8EA ^ 0xE8E0;
        AutoEatModule.E[0x397A ^ 0x3868] = 0xE175 ^ 0x3868;
        AutoEatModule.E[0xEB4 ^ 0xE79] = 0xFFFFF1F2 ^ 0xE79;
        AutoEatModule.E[0xB726 ^ 0xB63A] = 0x54C4 ^ 0xB63A;
        AutoEatModule.E[0x4C03 ^ 0x4CE8] = 0xFFFFB327 ^ 0x4CE8;
        AutoEatModule.E[0x228B ^ 0x23D8] = 0x98B ^ 0x23D8;
        AutoEatModule.E[0x2DA5 ^ 0x2D8E] = 0xFFFFD205 ^ 0x2D8E;
        AutoEatModule.E[0x88CF ^ 0x8940] = 0xFFFF101D ^ 0x8940;
        AutoEatModule.E[0xFF27 ^ 0xFE2D] = 0xFE2C ^ 0xFE2D;
        AutoEatModule.E[0x1C10 ^ 0x1C6B] = 0xFFFFE3EC ^ 0x1C6B;
        AutoEatModule.E[0xF727 ^ 0xF7A2] = 0xF789 ^ 0xF7A2;
        AutoEatModule.E[0x8097 ^ 0x80AA] = 0x809B ^ 0x80AA;
        AutoEatModule.E[0xA43C ^ 0xA5B8] = 0x370D ^ 0xA5B8;
        AutoEatModule.E[0x3F70 ^ 0x3F86] = 0x3FB0 ^ 0x3F86;
        AutoEatModule.E[0x97E6 ^ 0x96F3] = 0x4FE8 ^ 0x96F3;
        AutoEatModule.E[0x8F8B ^ 0x8ECB] = 0xFFFF70F8 ^ 0x8ECB;
        AutoEatModule.E[0x9ECE ^ 0x9F8C] = 0x7AD1 ^ 0x9F8C;
        AutoEatModule.E[0xC1C3 ^ 0xC1CA] = 0xFFFF3E3D ^ 0xC1CA;
        AutoEatModule.E[0xE26D ^ 0xE200] = 0xE24C ^ 0xE200;
        AutoEatModule.E[0x1DEA ^ 0x1D80] = 0xFFFFE245 ^ 0x1D80;
        AutoEatModule.E[0x202D ^ 0x2129] = 0x2123 ^ 0x2129;
        AutoEatModule.E[0x10BFC ^ 0x10B58] = 0x10B6F ^ 0x10B58;
        AutoEatModule.E[0xAB8 ^ 0xBA1] = 0x74DC ^ 0xBA1;
        AutoEatModule.E[0x3160 ^ 0x31E9] = 0xFFFFCE66 ^ 0x31E9;
        AutoEatModule.E[0x327B ^ 0x32B2] = 0x32DA ^ 0x32B2;
        AutoEatModule.E[0xF8C ^ 0xFF1] = 0xF9B ^ 0xFF1;
        AutoEatModule.E[0xD951 ^ 0xD9BE] = 0xFFFF2666 ^ 0xD9BE;
        AutoEatModule.E[0xE936 ^ 0xE970] = 0xE953 ^ 0xE970;
        AutoEatModule.E[0x84DD ^ 0x85CA] = 0xFAB7 ^ 0x85CA;
        AutoEatModule.E[0x4277 ^ 0x42DB] = 0x42F0 ^ 0x42DB;
        AutoEatModule.E[0x58DF ^ 0x59ED] = 0xD147 ^ 0x59ED;
        AutoEatModule.E[0x4387 ^ 0x431D] = 0x4374 ^ 0x431D;
        AutoEatModule.E[0x8B80 ^ 0x8B08] = 0xFFFF74B0 ^ 0x8B08;
        AutoEatModule.E[0x5E83 ^ 0x5E6D] = 0x5E5C ^ 0x5E6D;
        AutoEatModule.E[0xC5AF ^ 0xC4D1] = 0x3805 ^ 0xC4D1;
        AutoEatModule.E[0xB22B ^ 0xB2F9] = 0xFFFF4D51 ^ 0xB2F9;
        AutoEatModule.E[0x4A53 ^ 0x4A67] = 0x4A30 ^ 0x4A67;
        AutoEatModule.E[0x54D7 ^ 0x546D] = 0x546F ^ 0x546D;
        AutoEatModule.E[0x26FB ^ 0x26F0] = 0x26F8 ^ 0x26F0;
        AutoEatModule.E[0xD61B ^ 0xD79D] = 0x1D2E7 ^ 0xD79D;
        AutoEatModule.E[0xFEC ^ 0xE8B] = 0xFFFF1F2F ^ 0xE8B;
        AutoEatModule.E[0x1855 ^ 0x18E7] = 0x1894 ^ 0x18E7;
        AutoEatModule.E[0xCB4 ^ 0xC56] = 0xFFFFF3FC ^ 0xC56;
        AutoEatModule.E[0xBF97 ^ 0xBEEA] = 0x423A ^ 0xBEEA;
        AutoEatModule.E[0x52D9 ^ 0x53C7] = 0x228F ^ 0x53C7;
        AutoEatModule.E[0xCE33 ^ 0xCE1F] = 0xCE19 ^ 0xCE1F;
        AutoEatModule.E[0x1003B ^ 0x1003A] = 0x10026 ^ 0x1003A;
        AutoEatModule.E[0xBC5D ^ 0xBD26] = 0x8B47 ^ 0xBD26;
        AutoEatModule.E[0x4594 ^ 0x453A] = 0xFFFFBAD5 ^ 0x453A;
        AutoEatModule.E[0x558A ^ 0x556E] = 0xFFFFAA13 ^ 0x556E;
        AutoEatModule.E[0x10BA6 ^ 0x10B10] = 0x10B13 ^ 0x10B10;
        AutoEatModule.E[0x4EC8 ^ 0x4EB1] = 0x4EA6 ^ 0x4EB1;
        AutoEatModule.E[0x47C0 ^ 0x46ED] = 0xA73C ^ 0x46ED;
        AutoEatModule.E[0x2C50 ^ 0x2C5C] = 0x2C30 ^ 0x2C5C;
        AutoEatModule.E[0x380B ^ 0x3985] = 0x5F4A ^ 0x3985;
        AutoEatModule.E[0x1639 ^ 0x168C] = 0x1680 ^ 0x168C;
        AutoEatModule.E[0x3F2C ^ 0x3F4F] = 0xFFFFC0E6 ^ 0x3F4F;
        AutoEatModule.E[0x9FCE ^ 0x9EBF] = 0x674E ^ 0x9EBF;
        AutoEatModule.E[0x1FA3 ^ 0x1FE2] = 0xFFFFE030 ^ 0x1FE2;
        AutoEatModule.E[0xDD2A ^ 0xDD14] = 0xFFFF22E0 ^ 0xDD14;
        AutoEatModule.E[0x138F ^ 0x12DD] = 0x12DD ^ 0x12DD;
        AutoEatModule.E[0x513F ^ 0x5187] = 0x5186 ^ 0x5187;
        AutoEatModule.E[0xF369 ^ 0xF3C9] = 0xF3BE ^ 0xF3C9;
        AutoEatModule.E[0xF087 ^ 0xF097] = 0xFFFF0F52 ^ 0xF097;
        AutoEatModule.E[0xA328 ^ 0xA389] = 0xA3A1 ^ 0xA389;
        AutoEatModule.E[0x474B ^ 0x462B] = 0xB153 ^ 0x462B;
        AutoEatModule.E[0x4CAE ^ 0x4DD4] = 0x7BEA ^ 0x4DD4;
        AutoEatModule.E[0xD76D ^ 0xD792] = 0xFFFF28CF ^ 0xD792;
        AutoEatModule.E[0x3639 ^ 0x3716] = 0x8254 ^ 0x3716;
        AutoEatModule.E[0x7A77 ^ 0x7AEB] = 0xFFFF8520 ^ 0x7AEB;
        AutoEatModule.E[0x3396 ^ 0x33EC] = 0xFFFFCC36 ^ 0x33EC;
        AutoEatModule.E[0xAF4 ^ 0xBF5] = 0xFFFFF471 ^ 0xBF5;
        AutoEatModule.E[0x77EB ^ 0x76B2] = 0x5054 ^ 0x76B2;
        AutoEatModule.E[0x44F5 ^ 0x4426] = 0x447C ^ 0x4426;
        AutoEatModule.E[0x31E7 ^ 0x31AC] = 0x31B9 ^ 0x31AC;
        AutoEatModule.E[0x2D4 ^ 0x3E5] = 0xB6A7 ^ 0x3E5;
        AutoEatModule.E[0x71F2 ^ 0x7187] = 0xFFFF8E6B ^ 0x7187;
        AutoEatModule.E[0x23E3 ^ 0x22C3] = 0xFFFFAC43 ^ 0x22C3;
        AutoEatModule.E[0x6AA4 ^ 0x6AE8] = 0xFFFF9553 ^ 0x6AE8;
        AutoEatModule.E[0x2AE5 ^ 0x2AAB] = 0x2A30 ^ 0x2AAB;
        AutoEatModule.E[0x26AC ^ 0x278D] = 0x56CC ^ 0x278D;
        AutoEatModule.E[0xA653 ^ 0xA661] = 0xFFFF599F ^ 0xA661;
        AutoEatModule.E[0xAFB0 ^ 0xAEBF] = 0xAEBF ^ 0xAEBF;
        AutoEatModule.E[0xCC03 ^ 0xCD15] = 0xB26D ^ 0xCD15;
        AutoEatModule.E[0xFCE5 ^ 0xFC64] = 0xFFFF03DB ^ 0xFC64;
        AutoEatModule.E[0x86A ^ 0x8B7] = 0xFFFFF764 ^ 0x8B7;
        AutoEatModule.E[0x101CE ^ 0x100DF] = 0x147 ^ 0x100DF;
        AutoEatModule.E[0x229D ^ 0x220C] = 0x2223 ^ 0x220C;
        AutoEatModule.E[0xC343 ^ 0xC20C] = 0xBE77 ^ 0xC20C;
        AutoEatModule.E[0xB99F ^ 0xB981] = 0xB90F ^ 0xB981;
        AutoEatModule.E[0x98F9 ^ 0x9850] = 0x9835 ^ 0x9850;
        AutoEatModule.E[0x6537 ^ 0x6537] = 0xFFFF9AE5 ^ 0x6537;
        AutoEatModule.E[0x4DC2 ^ 0x4DED] = 0xFFFFB251 ^ 0x4DED;
        AutoEatModule.E[0x2C4F ^ 0x2D6D] = 0xC957 ^ 0x2D6D;
        AutoEatModule.E[0x8A37 ^ 0x8B51] = 0x6543 ^ 0x8B51;
        AutoEatModule.E[0xF586 ^ 0xF5E2] = 0xF584 ^ 0xF5E2;
        AutoEatModule.E[0x36D5 ^ 0x36BB] = 0x36DA ^ 0x36BB;
        AutoEatModule.E[0x4596 ^ 0x44AF] = 0xFA04 ^ 0x44AF;
        AutoEatModule.E[0xE9DE ^ 0xE886] = 0xCA1B ^ 0xE886;
        AutoEatModule.E[0x45DF ^ 0x4510] = 0x4515 ^ 0x4510;
        AutoEatModule.E[0xBAF ^ 0xA92] = 0x11C7 ^ 0xA92;
        AutoEatModule.E[0x8C98 ^ 0x8CFD] = 0xFFFF730B ^ 0x8CFD;
        AutoEatModule.E[0xDE55 ^ 0xDEDF] = 0xDEE6 ^ 0xDEDF;
        AutoEatModule.E[0x3F9E ^ 0x3FF2] = 0x3FE3 ^ 0x3FF2;
        AutoEatModule.E[0x676F ^ 0x674E] = 0xFFFF98C0 ^ 0x674E;
        AutoEatModule.E[0x786F ^ 0x7947] = 0xFFFF8BE6 ^ 0x7947;
        AutoEatModule.E[0x6B7E ^ 0x6BC9] = 0x6BC9 ^ 0x6BC9;
        AutoEatModule.E[0xB3A9 ^ 0xB299] = 0xFFFFF86E ^ 0xB299;
        AutoEatModule.E[0xF2B3 ^ 0xF2EB] = 0xF2E3 ^ 0xF2EB;
        AutoEatModule.E[0x6126 ^ 0x61A1] = 0x6197 ^ 0x61A1;
        AutoEatModule.E[0xE1F5 ^ 0xE1E7] = 0xFFFF1E24 ^ 0xE1E7;
        AutoEatModule.E[0xCE6F ^ 0xCE31] = 0xFFFF31EA ^ 0xCE31;
        AutoEatModule.E[0x60B9 ^ 0x6016] = 0xFFFF9FD6 ^ 0x6016;
        AutoEatModule.E[0x2710 ^ 0x279E] = 0xFFFFD836 ^ 0x279E;
        AutoEatModule.E[0xC920 ^ 0xC9BF] = 0xFFFF3611 ^ 0xC9BF;
        AutoEatModule.E[0xD2AB ^ 0xD2A4] = 0xFFFF2D5B ^ 0xD2A4;
        AutoEatModule.E[0x45A5 ^ 0x45A8] = 0x45A9 ^ 0x45A8;
        AutoEatModule.E[0x58AF ^ 0x5897] = 0x58AB ^ 0x5897;
        AutoEatModule.E[0x8C1 ^ 0x8B7] = 0xFFFFF726 ^ 0x8B7;
        AutoEatModule.E[0x1004B ^ 0x100DB] = 0xFFFEFF16 ^ 0x100DB;
        AutoEatModule.E[0x2075 ^ 0x201D] = 0x2035 ^ 0x201D;
        AutoEatModule.E[0x86D6 ^ 0x865A] = 0xFFFF790D ^ 0x865A;
        AutoEatModule.E[0xE837 ^ 0xE830] = 0xFFFF1799 ^ 0xE830;
        AutoEatModule.E[0x8465 ^ 0x84F2] = 0xFFFF7B0A ^ 0x84F2;
        AutoEatModule.E[0xF694 ^ 0xF660] = 0xFFFF09CB ^ 0xF660;
        AutoEatModule.E[0x7F3A ^ 0x7E02] = 0xC0AD ^ 0x7E02;
        AutoEatModule.E[0x5DB3 ^ 0x5D53] = 0x5D2D ^ 0x5D53;
        AutoEatModule.E[0x105AE ^ 0x1053B] = 0xFFFEFAA9 ^ 0x1053B;
        AutoEatModule.E[0xA462 ^ 0xA42D] = 0xFFFF5BE7 ^ 0xA42D;
        AutoEatModule.E[0xDD10 ^ 0xDC78] = 0x326A ^ 0xDC78;
        AutoEatModule.E[0xABF1 ^ 0xABA1] = 0xFFFF5405 ^ 0xABA1;
        AutoEatModule.E[0xD8E6 ^ 0xD9AD] = 0x5754 ^ 0xD9AD;
        AutoEatModule.E[0x349C ^ 0x3447] = 0x3428 ^ 0x3447;
        AutoEatModule.E[0xAFB9 ^ 0xAED4] = 0xE158 ^ 0xAED4;
        AutoEatModule.E[0xB4AF ^ 0xB490] = 0xFFFF4B46 ^ 0xB490;
        AutoEatModule.E[0x74EC ^ 0x75DA] = 0xCB71 ^ 0x75DA;
        AutoEatModule.E[0x5E3 ^ 0x5CA] = 0x590 ^ 0x5CA;
        AutoEatModule.E[0xE90A ^ 0xE91E] = 0xFFFF168E ^ 0xE91E;
        AutoEatModule.E[0x2192 ^ 0x212D] = 0xDB5C ^ 0x212D;
        AutoEatModule.E[0x3946 ^ 0x39AB] = 0xFFFFC662 ^ 0x39AB;
        AutoEatModule.E[0xD303 ^ 0xD34A] = 0xD352 ^ 0xD34A;
        AutoEatModule.E[0x57E3 ^ 0x57FF] = 0xFFFFA818 ^ 0x57FF;
        AutoEatModule.E[0x891D ^ 0x89B7] = 0xFFFF767D ^ 0x89B7;
        AutoEatModule.E[0x783 ^ 0x6B6] = 0x8E14 ^ 0x6B6;
        AutoEatModule.E[0x18EE ^ 0x19DD] = 0x917F ^ 0x19DD;
        AutoEatModule.E[0x10A1F ^ 0x10AA4] = 0x10AA4 ^ 0x10AA4;
        AutoEatModule.E[0x4358 ^ 0x42DA] = 0xD06F ^ 0x42DA;
        AutoEatModule.E[0xB8C7 ^ 0xB859] = 0xFFFF4780 ^ 0xB859;
        AutoEatModule.E[0x1A2B ^ 0x1A55] = 0x1A26 ^ 0x1A55;
        AutoEatModule.E[0x788D ^ 0x7908] = 0x17C6E ^ 0x7908;
        AutoEatModule.E[0xF47B ^ 0xF4FD] = 0xFFFF0B13 ^ 0xF4FD;
        AutoEatModule.E[0x57D4 ^ 0x571C] = 0x571C ^ 0x571C;
        AutoEatModule.E[0x89E6 ^ 0x8890] = 0x228A ^ 0x8890;
        AutoEatModule.E[0x2C0C ^ 0x2CD9] = 0xFFFFD3AD ^ 0x2CD9;
        AutoEatModule.E[0x73AF ^ 0x732C] = 0x733E ^ 0x732C;
        AutoEatModule.E[0xB936 ^ 0xB9AB] = 0xFFFF4632 ^ 0xB9AB;
        AutoEatModule.E[0x31AF ^ 0x318B] = 0x3185 ^ 0x318B;
        AutoEatModule.E[0xA857 ^ 0xA8D5] = 0xFFFF577C ^ 0xA8D5;
        AutoEatModule.E[0x8EC1 ^ 0x8ED2] = 0x8EA1 ^ 0x8ED2;
        AutoEatModule.E[0x58E4 ^ 0x598A] = 0x1605 ^ 0x598A;
        AutoEatModule.E[0xBDE8 ^ 0xBCAB] = 0x59F5 ^ 0xBCAB;
        AutoEatModule.E[0x8CDE ^ 0x8D5D] = 0xFFFFE01F ^ 0x8D5D;
        AutoEatModule.E[0x721E ^ 0x7393] = 0x1552 ^ 0x7393;
        AutoEatModule.E[0xCEBF ^ 0xCE8C] = 0xFFFF312F ^ 0xCE8C;
        AutoEatModule.E[0x3CF0 ^ 0x3D94] = 0xEC42 ^ 0x3D94;
        AutoEatModule.E[0xD255 ^ 0xD216] = 0xFFFF2DA8 ^ 0xD216;
        AutoEatModule.E[0xA23 ^ 0xB19] = 0x1040 ^ 0xB19;
        AutoEatModule.E[0xF755 ^ 0xF64E] = 0x1499 ^ 0xF64E;
        AutoEatModule.E[0xA529 ^ 0xA5EB] = 0xDA8C ^ 0xA5EB;
        AutoEatModule.E[0xE9FF ^ 0xE878] = 0x1ED79 ^ 0xE878;
        AutoEatModule.E[0x10AD1 ^ 0x10AA0] = 0xFFFEF539 ^ 0x10AA0;
        AutoEatModule.E[0x7175 ^ 0x7017] = 0xA1C1 ^ 0x7017;
        AutoEatModule.E[0x9FBA ^ 0x9FA0] = 0xFFFF6047 ^ 0x9FA0;
        AutoEatModule.E[0x57A5 ^ 0x56E1] = 0xB381 ^ 0x56E1;
        AutoEatModule.E[0xB73A ^ 0xB722] = 0xB70A ^ 0xB722;
        AutoEatModule.E[0x698B ^ 0x6893] = 0xFFFFE825 ^ 0x6893;
        AutoEatModule.E[0xCC63 ^ 0xCC2B] = 0xFFFF33A7 ^ 0xCC2B;
        AutoEatModule.E[0x1147 ^ 0x117E] = 0x115F ^ 0x117E;
        AutoEatModule.E[0x7056 ^ 0x70EF] = 0x70EF ^ 0x70EF;
        AutoEatModule.E[0x6FBA ^ 0x6F56] = 0xFFFF90EA ^ 0x6F56;
        AutoEatModule.E[0x19F9 ^ 0x18FA] = 0x18EF ^ 0x18FA;
        AutoEatModule.E[0xF785 ^ 0xF7C2] = 0xF7A8 ^ 0xF7C2;
        AutoEatModule.E[0xD20 ^ 0xC07] = 0x10A ^ 0xC07;
        AutoEatModule.E[0x384A ^ 0x386C] = 0xFFFFC7DF ^ 0x386C;
        AutoEatModule.E[0x8D3F ^ 0x8DA6] = 0x8DA3 ^ 0x8DA6;
        AutoEatModule.E[0x2ABF ^ 0x2BEF] = 0x57C8 ^ 0x2BEF;
        AutoEatModule.E[0x1023F ^ 0x10376] = 0xA10 ^ 0x10376;
        AutoEatModule.E[0x85C8 ^ 0x8530] = 0xFFFF7AA0 ^ 0x8530;
        AutoEatModule.E[0xD469 ^ 0xD459] = 0xD428 ^ 0xD459;
        AutoEatModule.E[0xF321 ^ 0xF31B] = 0xFFFF0C8C ^ 0xF31B;
        AutoEatModule.E[0xD1A9 ^ 0xD08D] = 0x34B6 ^ 0xD08D;
        AutoEatModule.E[0x54A3 ^ 0x559C] = 0x5426 ^ 0x559C;
        AutoEatModule.E[0x7085 ^ 0x71DA] = 0x8684 ^ 0x71DA;
        AutoEatModule.E[0xEA32 ^ 0xEB75] = 0x1E213 ^ 0xEB75;
        AutoEatModule.E[0x1664 ^ 0x1753] = 0xA9F8 ^ 0x1753;
        AutoEatModule.E[0x6C9D ^ 0x6C4B] = 0x6C79 ^ 0x6C4B;
        AutoEatModule.E[0x106C5 ^ 0x10619] = 0xFFFEF9A6 ^ 0x10619;
        AutoEatModule.E[0x7DF3 ^ 0x7D27] = 0xFFFF82D6 ^ 0x7D27;
        AutoEatModule.E[0x7E20 ^ 0x7F59] = 0x497E ^ 0x7F59;
        AutoEatModule.E[0xCDBF ^ 0xCD27] = 0xFFFF32BC ^ 0xCD27;
        AutoEatModule.E[0x636C ^ 0x62E7] = 0xFFFF9964 ^ 0x62E7;
        AutoEatModule.E[0x77A3 ^ 0x77B2] = 0x77A8 ^ 0x77B2;
        AutoEatModule.E[0x62E6 ^ 0x63E8] = 0x63E9 ^ 0x63E8;
        AutoEatModule.E[0xA14E ^ 0xA12E] = 0xA109 ^ 0xA12E;
        AutoEatModule.E[0x77CC ^ 0x7731] = 0x776B ^ 0x7731;
        AutoEatModule.E[0x1092A ^ 0x10866] = 0x186F6 ^ 0x10866;
        AutoEatModule.E[0xCBA ^ 0xC9D] = 0xFFFFF316 ^ 0xC9D;
        AutoEatModule.E[0x3A7C ^ 0x3A0F] = 0xFFFFC586 ^ 0x3A0F;
        AutoEatModule.E[0x923 ^ 0x9A7] = 0x99F ^ 0x9A7;
        AutoEatModule.E[0x1C82 ^ 0x1CF2] = 0xFFFFE305 ^ 0x1CF2;
        AutoEatModule.E[0x327D ^ 0x3337] = 0xBDC3 ^ 0x3337;
        AutoEatModule.E[0x893 ^ 0x82E] = 0x8EE ^ 0x82E;
        AutoEatModule.E[0xF45A ^ 0xF480] = 0xFFFF0B26 ^ 0xF480;
        AutoEatModule.E[0xA564 ^ 0xA561] = 0xA57D ^ 0xA561;
        AutoEatModule.E[0x974B ^ 0x964C] = 0x9654 ^ 0x964C;
        AutoEatModule.E[0xE272 ^ 0xE2F9] = 0xE2B2 ^ 0xE2F9;
        AutoEatModule.E[0x10029 ^ 0x10120] = 0xFFFEFEA8 ^ 0x10120;
        AutoEatModule.E[0x10DF0 ^ 0x10CDB] = 0x1ED0A ^ 0x10CDB;
        AutoEatModule.E[0x40E7 ^ 0x401B] = 0xFFFFBFD3 ^ 0x401B;
        AutoEatModule.E[0x846A ^ 0x8408] = 0xFFFF7BC2 ^ 0x8408;
        AutoEatModule.E[0x4399 ^ 0x43C5] = 0xFFFFBC4E ^ 0x43C5;
        AutoEatModule.E[0xEF08 ^ 0xEFF2] = 0xEFB7 ^ 0xEFF2;
        AutoEatModule.E[0xCF9E ^ 0xCFCC] = 0xCFA0 ^ 0xCFCC;
        AutoEatModule.E[0x5303 ^ 0x53E2] = 0x5390 ^ 0x53E2;
        AutoEatModule.E[0xB3EE ^ 0xB343] = 0xB36C ^ 0xB343;
        AutoEatModule.E[0xD34B ^ 0xD369] = 0xFFFF2CE6 ^ 0xD369;
        AutoEatModule.E[0x4EDB ^ 0x4E0A] = 0xFFFFB1A6 ^ 0x4E0A;
        AutoEatModule.E[0xF931 ^ 0xF9DB] = 0xF9D6 ^ 0xF9DB;
        AutoEatModule.E[0x4F39 ^ 0x4F6A] = 0x4F57 ^ 0x4F6A;
        AutoEatModule.E[0x9307 ^ 0x9201] = 0xFFFF6DF9 ^ 0x9201;
        AutoEatModule.E[0x4A26 ^ 0x4A40] = 0x4A2B ^ 0x4A40;
        AutoEatModule.E[0xCEF ^ 0xDFB] = 0xD4B7 ^ 0xDFB;
        AutoEatModule.E[0xB738 ^ 0xB7F8] = 0x94D ^ 0xB7F8;
        AutoEatModule.E[0xD2F6 ^ 0xD37E] = 0x1D604 ^ 0xD37E;
        AutoEatModule.E[0xAC3F ^ 0xACF8] = 0x1F53 ^ 0xACF8;
        AutoEatModule.E[0xC9C0 ^ 0xC97E] = 0x775E ^ 0xC97E;
        AutoEatModule.E[0xDF58 ^ 0xDF2A] = 0xDF3A ^ 0xDF2A;
        AutoEatModule.E[0x673C ^ 0x6619] = 0x8229 ^ 0x6619;
        AutoEatModule.E[0x1079A ^ 0x107DE] = 0xFFFEF823 ^ 0x107DE;
        AutoEatModule.E[0x8A59 ^ 0x8A1C] = 0x8A55 ^ 0x8A1C;
        AutoEatModule.E[0xD4A ^ 0xD5F] = 0xFFFFF260 ^ 0xD5F;
        AutoEatModule.E[0xC6D9 ^ 0xC69B] = 0xC6F8 ^ 0xC69B;
        AutoEatModule.E[0xDBC6 ^ 0xDB63] = 0xDB7B ^ 0xDB63;
        AutoEatModule.E[0x625A ^ 0x6261] = 0xFFFF9DD4 ^ 0x6261;
        AutoEatModule.E[0xB2EE ^ 0xB2EA] = 0xFFFF4D04 ^ 0xB2EA;
        AutoEatModule.E[0x3D5 ^ 0x2FF] = 0xE32C ^ 0x2FF;
        AutoEatModule.E[0xA2CA ^ 0xA20E] = 0xB925 ^ 0xA20E;
        AutoEatModule.E[0x9197 ^ 0x90E7] = 0xDF68 ^ 0x90E7;
        AutoEatModule.E[0x573E ^ 0x565B] = 0xB845 ^ 0x565B;
        AutoEatModule.E[0x145 ^ 0x1A0] = 0x195 ^ 0x1A0;
        AutoEatModule.E[0x101DC ^ 0x1012F] = 0xFFFEFE61 ^ 0x1012F;
        AutoEatModule.E[0x1200 ^ 0x1277] = 0x120B ^ 0x1277;
        AutoEatModule.E[0x2EE9 ^ 0x2E9D] = 0xFFFFD1E2 ^ 0x2E9D;
        AutoEatModule.E[0xF015 ^ 0xF048] = 0xF069 ^ 0xF048;
        AutoEatModule.E[0x5555 ^ 0x542A] = 0xFFFF5755 ^ 0x542A;
        AutoEatModule.E[0x339B ^ 0x3328] = 0x3361 ^ 0x3328;
        AutoEatModule.E[0x5079 ^ 0x5116] = 0xFFFFE11D ^ 0x5116;
        AutoEatModule.E[0x9D1E ^ 0x9DF9] = 0xFFFF626C ^ 0x9DF9;
        AutoEatModule.E[0x267C ^ 0x2755] = 0x2A58 ^ 0x2755;
        AutoEatModule.E[0x20AA ^ 0x2066] = 0xFFFFDFE9 ^ 0x2066;
        AutoEatModule.E[0xB1E1 ^ 0xB0BA] = 0xFFFF69B4 ^ 0xB0BA;
        AutoEatModule.E[0xCD51 ^ 0xCC1F] = 0xB06A ^ 0xCC1F;
        AutoEatModule.E[0x13BE ^ 0x12C9] = 0xFFFF4712 ^ 0x12C9;
        AutoEatModule.E[0x48EC ^ 0x4832] = 0x484C ^ 0x4832;
        AutoEatModule.E[0x5980 ^ 0x590F] = 0xFFFFA6F4 ^ 0x590F;
        AutoEatModule.E[0x9E1F ^ 0x9E84] = 0x9ED5 ^ 0x9E84;
        AutoEatModule.E[0x6C2C ^ 0x6CD9] = 0x6CA4 ^ 0x6CD9;
        AutoEatModule.E[0x559E ^ 0x5567] = 0xFFFFAA91 ^ 0x5567;
        AutoEatModule.E[0x82EC ^ 0x827E] = 0x8224 ^ 0x827E;
        AutoEatModule.E[0x7916 ^ 0x7838] = 0xCD71 ^ 0x7838;
        AutoEatModule.E[0x90B8 ^ 0x9079] = 0x727C ^ 0x9079;
        AutoEatModule.E[0x10D66 ^ 0x10DB1] = 0xFFFEF237 ^ 0x10DB1;
        AutoEatModule.E[0x5236 ^ 0x5262] = 0xFFFFAD9F ^ 0x5262;
        AutoEatModule.E[0x5EAA ^ 0x5E51] = 0xFFFFA1C0 ^ 0x5E51;
        AutoEatModule.E[0xC253 ^ 0xC327] = 0x3ADD ^ 0xC327;
        AutoEatModule.E[0x1DFB ^ 0x1DB1] = 0xFFFFE235 ^ 0x1DB1;
        AutoEatModule.E[0xBB05 ^ 0xBBE3] = 0xFFFF4471 ^ 0xBBE3;
        AutoEatModule.E[0xBD87 ^ 0xBCB9] = 0xBD04 ^ 0xBCB9;
        AutoEatModule.E[0xC943 ^ 0xC96E] = 0xC97D ^ 0xC96E;
        AutoEatModule.E[0x100C2 ^ 0x10060] = 0xFFFEFFDF ^ 0x10060;
        AutoEatModule.E[0x1013B ^ 0x10150] = 0xFFFEFE93 ^ 0x10150;
        AutoEatModule.E[0x59F1 ^ 0x59E6] = 0xFFFFA642 ^ 0x59E6;
        AutoEatModule.E[0x8BB1 ^ 0x8B7B] = 0xFFFF7482 ^ 0x8B7B;
        AutoEatModule.E[0xB215 ^ 0xB20A] = 0xB24C ^ 0xB20A;
        AutoEatModule.E[0x917B ^ 0x9025] = 0x675D ^ 0x9025;
        AutoEatModule.E[0x9FFD ^ 0x9FAC] = 0x9F9C ^ 0x9FAC;
        AutoEatModule.E[0xA118 ^ 0xA130] = 0xA114 ^ 0xA130;
        AutoEatModule.E[0x660A ^ 0x66CF] = 0xC0A4 ^ 0x66CF;
        AutoEatModule.E[0x3071 ^ 0x30D7] = 0xFFFFCF66 ^ 0x30D7;
        AutoEatModule.E[0xFDA3 ^ 0xFDBE] = 0xFFFF021D ^ 0xFDBE;
        AutoEatModule.E[0x3F43 ^ 0x3F9C] = 0x3FBC ^ 0x3F9C;
        AutoEatModule.E[0xF34D ^ 0xF261] = 0xFFFFEC38 ^ 0xF261;
        AutoEatModule.E[0xC3A2 ^ 0xC30A] = 0xFFFF3CA5 ^ 0xC30A;
        AutoEatModule.E[0x74C8 ^ 0x75A9] = 0xA462 ^ 0x75A9;
        AutoEatModule.E[0x8C2C ^ 0x8D70] = 0xAB87 ^ 0x8D70;
        AutoEatModule.E[0x36D7 ^ 0x3757] = 0xCB83 ^ 0x3757;
        AutoEatModule.E[0x956 ^ 0x9A6] = 0x97D ^ 0x9A6;
        AutoEatModule.E[0xCAFB ^ 0xCACC] = 0xFFFF3570 ^ 0xCACC;
        AutoEatModule.E[0xDEA6 ^ 0xDE26] = 0xDE24 ^ 0xDE26;
        AutoEatModule.E[0x530B ^ 0x5230] = 0x4965 ^ 0x5230;
        AutoEatModule.E[0xD48 ^ 0xD1E] = 0xFFFFF2BB ^ 0xD1E;
        AutoEatModule.E[0x332 ^ 0x338] = 0xFFFFFCD1 ^ 0x338;
        AutoEatModule.E[0x64C0 ^ 0x64EA] = 0xFFFF9B78 ^ 0x64EA;
        AutoEatModule.E[0xAB2D ^ 0xAA7C] = 0xD607 ^ 0xAA7C;
        AutoEatModule.E[0x53C4 ^ 0x5378] = 0x5378 ^ 0x5378;
        AutoEatModule.E[0x616E ^ 0x613B] = 0x6163 ^ 0x613B;
        AutoEatModule.E[0x9527 ^ 0x9531] = 0xFFFF6A8A ^ 0x9531;
        AutoEatModule.E[0x10468 ^ 0x104DC] = 0x104B9 ^ 0x104DC;
        AutoEatModule.E[0xF7C4 ^ 0xF6DE] = 0x140D ^ 0xF6DE;
        AutoEatModule.E[0xE8DD ^ 0xE9D5] = 0xE9AF ^ 0xE9D5;
    }
}

