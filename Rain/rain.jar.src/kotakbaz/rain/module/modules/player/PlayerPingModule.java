/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.player;

import com.mojang.blaze3d.opengl.GlStateManager;
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
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.mixin.EntityRenderStateAccessor;
import kotakbaz.rain.mixin.EntityRendererAccessor;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.player.A;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import org.joml.Quaternionfc;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u00019B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u001d\u0010\u0010J\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b\u001f\u0010 J/\u0010#\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b#\u0010$JO\u0010/\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b8\u00102\u00a8\u0006:"}, d2={"Lkotakbaz/rain/module/modules/player/PlayerPingModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "Lkotakbaz/rain/event/events/Render3DEvent;", "event", "", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "Lnet/minecraft/class_1657;", "player", "localPlayer", "", "shouldRenderFor", "(Lnet/minecraft/class_1657;Lnet/minecraft/class_1657;)Z", "isSneakingLikeVanilla", "(Lnet/minecraft/class_1657;)Z", "", "partialTicks", "", "distanceSquared", "Lkotakbaz/rain/module/modules/player/PlayerPingModule$PingLabelInfo;", "getPingLabelInfo", "(Lnet/minecraft/class_1657;FD)Lkotakbaz/rain/module/modules/player/PlayerPingModule$PingLabelInfo;", "Lkotakbaz/rain/mixin/EntityRenderStateAccessor;", "stateAccessor", "", "getLinesAbovePlayer", "(Lnet/minecraft/class_1657;Lkotakbaz/rain/mixin/EntityRenderStateAccessor;D)I", "hasBelowNameScoreboard", "linesAbovePlayer", "getPingTextYOffset", "(I)F", "ping", "sneaking", "getDisplayColor", "(Lnet/minecraft/class_1657;Lnet/minecraft/class_1657;IZ)I", "", "text", "x", "y", "color", "Lorg/joml/Matrix4f;", "matrix", "Lnet/minecraft/class_4597$class_4598;", "consumers", "light", "drawPingText", "(Ljava/lang/String;FFIZLorg/joml/Matrix4f;Lnet/minecraft/class_4597$class_4598;I)V", "getPingColorFromDisplayColor", "(I)I", "alpha", "withAlpha", "(II)I", "getPing", "(Lnet/minecraft/class_1657;)I", "getPingColor", "PingLabelInfo", "rain-visuals"})
public final class PlayerPingModule
extends Module {
    @NotNull
    public static final PlayerPingModule INSTANCE;
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    private PlayerPingModule() {
        int n2 = C[0];
        n2 ^= C[1];
        int n3 = C[3];
        n3 ^= C[4];
        int n4 = C[6];
        n4 ^= C[7];
        super((String)a[n2 -= C[2]], a_0.getPLAYER(), (String)a[n3 += C[5]] + (String)a[n4 -= C[8]]);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Commando
    public final void onRender3D(@NotNull Render3DEvent event) {
        long l2 = 2390895686819360045L;
        long l3 = -7848885301012590448L;
        long l4 = 6589930930400680265L;
        long l5 = 49500664970998602L;
        long l6 = 9038411372270829503L;
        int n2 = C[9];
        n2 -= C[10];
        Intrinsics.checkNotNullParameter(event, (String)a[n2 += C[11]]);
        if (!this.isEnabled()) {
            return;
        }
        ClientWorld clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
        if (clientWorld == null) {
            return;
        }
        ClientWorld clientWorld2 = clientWorld;
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        if (kotakbaz.rain.client.extensions.b.getMc().getNetworkHandler() == null) {
            return;
        }
        Vec3d vec3d = kotakbaz.rain.client.extensions.b.getMc().gameRenderer.getCamera().getPos();
        GlStateManager._enableBlend();
        int n3 = C[12];
        n3 -= C[13];
        n3 -= C[14];
        int n4 = C[15];
        n4 ^= C[16];
        int n5 = C[18];
        n5 ^= C[19];
        int n6 = C[21];
        n6 += C[22];
        GlStateManager._blendFuncSeparate((int)n3, (int)(n4 -= C[17]), (int)(n5 -= C[20]), (int)(n6 -= C[23]));
        int n7 = C[24];
        n7 ^= C[25];
        AutoCloseable autoCloseable = (AutoCloseable)new BufferAllocator(n7 += C[26]);
        Throwable throwable = null;
        try {
            Object object = (BufferAllocator)autoCloseable;
            long l7 = l2;
            int n8 = C[27];
            n8 += C[28];
            l2 = l7 ^ (0L ^ l7) & -1L << (n8 -= C[29]);
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate((BufferAllocator)object);
            for (AbstractClientPlayerEntity abstractClientPlayerEntity : clientWorld2.getPlayers()) {
                double d2;
                Intrinsics.checkNotNull(abstractClientPlayerEntity);
                if (!INSTANCE.shouldRenderFor((PlayerEntity)abstractClientPlayerEntity, (PlayerEntity)clientPlayerEntity2) || (d2 = kotakbaz.rain.client.extensions.b.getMc().getEntityRenderDispatcher().getSquaredDistanceToCamera((Entity)abstractClientPlayerEntity)) >= Double.longBitsToDouble(0xB44747818197456L ^ 0x4BF4747818197456L)) continue;
                int n9 = C[30];
                n9 ^= C[31];
                long l8 = l5;
                int n10 = C[33];
                n10 -= C[34];
                l5 = l8 ^ ((long)INSTANCE.getPing((PlayerEntity)abstractClientPlayerEntity) << (n9 -= C[32]) ^ l8) & -1L << (n10 += C[35]);
                int n11 = C[36];
                n11 -= C[37];
                if ((int)(l5 >>> (n11 -= C[38])) < 0) continue;
                int n12 = C[39];
                n12 -= C[40];
                n12 ^= C[41];
                int n13 = C[42];
                n13 ^= C[43];
                long l9 = l4;
                int n14 = C[45];
                n14 ^= C[46];
                l4 = l9 ^ ((long)((int)(l5 >>> n12)) << (n13 += C[44]) ^ l9) & -1L << (n14 += C[47]);
                int n15 = C[48];
                n15 -= C[49];
                int n16 = C[51];
                n16 += C[52];
                String string = (int)(l4 >>> (n15 -= C[50])) + (String)a[n16 ^= C[53]];
                float f2 = kotakbaz.rain.client.extensions.b.getMc().textRenderer.getWidth(string);
                A a2 = INSTANCE.getPingLabelInfo((PlayerEntity)abstractClientPlayerEntity, event.getPartialTicks(), d2);
                int n17 = C[54];
                n17 ^= C[55];
                n17 += C[56];
                int n18 = C[57];
                n18 -= C[58];
                long l10 = l6;
                int n19 = C[60];
                n19 -= C[61];
                l6 = l10 ^ ((long)INSTANCE.getDisplayColor((PlayerEntity)abstractClientPlayerEntity, (PlayerEntity)clientPlayerEntity2, (int)(l5 >>> n17), a2.getSneaking()) << (n18 ^= C[59]) ^ l10) & -1L << (n19 ^= C[62]);
                float f3 = 0.02f;
                event.getMatrices().push();
                event.getMatrices().translate(a2.getAnchorX() - vec3d.x, a2.getAnchorY() - vec3d.y, a2.getAnchorZ() - vec3d.z);
                event.getMatrices().multiply((Quaternionfc)kotakbaz.rain.client.extensions.b.getMc().gameRenderer.getCamera().getRotation());
                event.getMatrices().scale(f3, -f3, f3);
                Matrix4f matrix4f = event.getMatrices().peek().getPositionMatrix();
                float f4 = -f2 / 2.0f;
                float f5 = a2.getTextY();
                int n20 = C[63];
                n20 += C[64];
                int n21 = (int)(l6 >>> (n20 += C[65]));
                boolean bl = a2.getSneaking();
                Intrinsics.checkNotNull(matrix4f);
                Intrinsics.checkNotNull(immediate);
                int n22 = C[66];
                n22 ^= C[67];
                INSTANCE.drawPingText(string, f4, f5, n21, bl, matrix4f, immediate, n22 += C[68]);
                event.getMatrices().pop();
            }
            immediate.draw();
            object = Unit.INSTANCE;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            AutoCloseableKt.closeFinally(autoCloseable, throwable);
        }
        GlStateManager._disableBlend();
    }

    private final boolean shouldRenderFor(PlayerEntity player, PlayerEntity localPlayer) {
        if (Intrinsics.areEqual(player, localPlayer)) {
            boolean bl = C[69];
            bl ^= C[70];
            return bl += C[71];
        }
        if (player.isSpectator()) {
            boolean bl = C[72];
            bl -= C[73];
            return bl ^= C[74];
        }
        if (player.isInvisible() || player.isInvisibleTo(localPlayer)) {
            boolean bl = C[75];
            bl -= C[76];
            return bl -= C[77];
        }
        boolean bl = C[78];
        bl += C[79];
        return bl ^= C[80];
    }

    private final boolean isSneakingLikeVanilla(PlayerEntity player) {
        int n2;
        if (player.isSneaking() || player.isInSneakingPose()) {
            int n3 = C[81];
            n3 -= C[82];
            n2 = n3 += C[83];
        } else {
            int n4 = C[84];
            n4 ^= C[85];
            n2 = n4 += C[86];
        }
        return n2 != 0;
    }

    private final A getPingLabelInfo(PlayerEntity player, float partialTicks, double distanceSquared) {
        Vec3d vec3d;
        EntityRenderStateAccessor entityRenderStateAccessor;
        long l2 = 1471246194065373881L;
        long l3 = -8345134916839853451L;
        Vec3d vec3d2 = player.getLerpedPos(partialTicks);
        int n2 = C[87];
        n2 -= C[88];
        long l4 = l2;
        int n3 = C[90];
        n3 ^= C[91];
        l2 = l4 ^ ((long)this.isSneakingLikeVanilla(player) << (n2 -= C[89]) ^ l4) & -1L << (n3 -= C[92]);
        EntityRenderer entityRenderer = kotakbaz.rain.client.extensions.b.getMc().getEntityRenderDispatcher().getRenderer((Entity)player);
        EntityRendererAccessor entityRendererAccessor = entityRenderer instanceof EntityRendererAccessor ? (EntityRendererAccessor)entityRenderer : null;
        EntityRenderState entityRenderState = entityRendererAccessor != null ? entityRendererAccessor.rain$invokeGetAndUpdateRenderState((Entity)player, partialTicks) : null;
        EntityRenderStateAccessor entityRenderStateAccessor2 = entityRenderStateAccessor = entityRenderState instanceof EntityRenderStateAccessor ? (EntityRenderStateAccessor)entityRenderState : null;
        Object object = vec3d = entityRenderStateAccessor2 != null ? entityRenderStateAccessor2.rain$getNameLabelPos() : null;
        if (vec3d == null) {
            int n4 = C[93];
            n4 += C[94];
            return new A(vec3d2.x, vec3d2.y + (double)player.getHeight() + Double.longBitsToDouble(0x10E7A558F501DAE6L ^ 0x2F0FA558F501DAE6L), vec3d2.z, 0.0f, (boolean)(l2 >>> (n4 -= C[95])));
        }
        int n5 = C[96];
        n5 -= C[97];
        long l5 = l3;
        int n6 = C[99];
        n6 ^= C[100];
        l3 = l5 ^ ((long)this.getLinesAbovePlayer(player, entityRenderStateAccessor, distanceSquared) << (n5 ^= C[98]) ^ l5) & -1L << (n6 += C[101]);
        int n7 = C[102];
        n7 -= C[103];
        return new A(vec3d2.x + vec3d.x, vec3d2.y + vec3d.y + Double.longBitsToDouble(0xE8220D8A01622C21L ^ 0xD7C20D8A01622C21L), vec3d2.z + vec3d.z, this.getPingTextYOffset((int)(l3 >>> (n7 -= C[104]))), entityRenderStateAccessor.rain$isSneaking());
    }

    private final int getLinesAbovePlayer(PlayerEntity player, EntityRenderStateAccessor stateAccessor, double distanceSquared) {
        int n2;
        long l2 = -5495558533745359177L;
        long l3 = -3617008647322411502L;
        if (stateAccessor.rain$getDisplayName() != null) {
            int n3 = C[105];
            n3 -= C[106];
            n2 = n3 -= C[107];
        } else {
            int n4 = C[108];
            n4 -= C[109];
            n2 = n4 ^= C[110];
        }
        int n5 = C[111];
        n5 ^= C[112];
        long l4 = l3;
        int n6 = C[114];
        n6 += C[115];
        l3 = l4 ^ ((long)n2 << (n5 += C[113]) ^ l4) & -1L << (n6 += C[116]);
        int n7 = C[117];
        n7 ^= C[118];
        if ((int)(l3 >>> (n7 += C[119])) > 0 && distanceSquared < Double.longBitsToDouble(0x1D63FEBED725D6BL ^ 0x418F3FEBED725D6BL) && this.hasBelowNameScoreboard(player)) {
            l3 += 0x100000000L;
        }
        int n8 = C[120];
        n8 -= C[121];
        return (int)(l3 >>> (n8 -= C[122]));
    }

    private final boolean hasBelowNameScoreboard(PlayerEntity player) {
        boolean bl;
        if (player.getScoreboard().getObjectiveForSlot(ScoreboardDisplaySlot.BELOW_NAME) != null) {
            boolean bl2 = C[123];
            bl2 ^= C[124];
            bl = bl2 -= C[125];
        } else {
            boolean bl3 = C[126];
            bl3 ^= C[127];
            bl = bl3 ^= C[128];
        }
        return bl;
    }

    private final float getPingTextYOffset(int linesAbovePlayer) {
        return (float)(-kotakbaz.rain.client.extensions.b.getMc().textRenderer.fontHeight) * 1.15f * (float)linesAbovePlayer;
    }

    private final int getDisplayColor(PlayerEntity player, PlayerEntity localPlayer, int ping, boolean sneaking) {
        int n2;
        long l2 = 713868614453241875L;
        long l3 = 6040865465894661808L;
        int n3 = C[129];
        n3 += C[130];
        long l4 = l3;
        int n4 = C[132];
        n4 -= C[133];
        l3 = l4 ^ ((long)this.getPingColor(ping) << (n3 += C[131]) ^ l4) & -1L << (n4 += C[134]);
        if (sneaking) {
            int n5 = C[135];
            n5 -= C[136];
            int n6 = C[138];
            n6 ^= C[139];
            return this.withAlpha((int)(l3 >>> (n5 ^= C[137])), n6 -= C[140]);
        }
        if (localPlayer.canSee((Entity)player)) {
            int n7 = C[141];
            n7 -= C[142];
            n2 = (int)(l3 >>> (n7 += C[143]));
        } else {
            int n8 = C[144];
            n8 -= C[145];
            int n9 = C[147];
            n9 ^= C[148];
            n2 = this.withAlpha((int)(l3 >>> (n8 ^= C[146])), n9 ^= C[149]);
        }
        return n2;
    }

    private final void drawPingText(String text, float x2, float y, int color, boolean sneaking, Matrix4f matrix, VertexConsumerProvider.Immediate consumers, int light) {
        long l2 = 4915727991647811168L;
        TextRenderer textRenderer = kotakbaz.rain.client.extensions.b.getMc().textRenderer;
        int n2 = C[150];
        n2 ^= C[151];
        n2 ^= C[152];
        int n3 = C[153];
        n3 -= C[154];
        long l3 = l2;
        int n4 = C[156];
        n4 ^= C[157];
        l2 = l3 ^ ((long)((int)(MinecraftClient.getInstance().options.getTextBackgroundOpacity(0.25f) * 255.0f) << n2) << (n3 -= C[155]) ^ l3) & -1L << (n4 += C[158]);
        TextRenderer.TextLayerType textLayerType = sneaking ? TextRenderer.TextLayerType.NORMAL : TextRenderer.TextLayerType.SEE_THROUGH;
        boolean bl = C[159];
        bl ^= C[160];
        int n5 = C[162];
        n5 -= C[163];
        textRenderer.draw(text, x2, y, color, bl += C[161], matrix, (VertexConsumerProvider)consumers, textLayerType, (int)(l2 >>> (n5 += C[164])), light);
        if (!sneaking) {
            boolean bl2 = C[165];
            bl2 ^= C[166];
            int n6 = C[168];
            n6 += C[169];
            int n7 = C[171];
            n7 -= C[172];
            textRenderer.draw(text, x2, y, this.getPingColorFromDisplayColor(color), bl2 ^= C[167], matrix, (VertexConsumerProvider)consumers, TextRenderer.TextLayerType.NORMAL, n6 += C[170], LightmapTextureManager.applyEmission((int)light, (int)(n7 -= C[173])));
        }
    }

    private final int getPingColorFromDisplayColor(int color) {
        int n2;
        int n3 = C[174];
        n3 -= C[175];
        if (color >>> (n3 += C[176]) == 0) {
            int n4 = C[177];
            n4 ^= C[178];
            n2 = color | (n4 -= C[179]);
        } else {
            int n5 = C[180];
            n5 += C[181];
            n2 = color | (n5 ^= C[182]);
        }
        return n2;
    }

    private final int withAlpha(int color, int alpha2) {
        int n2 = C[183];
        n2 -= C[184];
        int n3 = C[186];
        n3 ^= C[187];
        return color & (n2 -= C[185]) | alpha2 << (n3 -= C[188]);
    }

    private final int getPing(PlayerEntity player) {
        int n2;
        PlayerListEntry playerListEntry;
        ClientPlayNetworkHandler clientPlayNetworkHandler = kotakbaz.rain.client.extensions.b.getMc().getNetworkHandler();
        PlayerListEntry playerListEntry2 = playerListEntry = clientPlayNetworkHandler != null ? clientPlayNetworkHandler.getPlayerListEntry(player.getUuid()) : null;
        if (playerListEntry2 != null) {
            n2 = playerListEntry2.getLatency();
        } else {
            int n3 = C[189];
            n3 ^= C[190];
            n2 = n3 += C[191];
        }
        return n2;
    }

    private final int getPingColor(int ping) {
        int n2;
        int n3 = C[192];
        n3 -= C[193];
        if (ping < (n3 += C[194])) {
            int n4 = C[195];
            n4 += C[196];
            n2 = n4 += C[197];
        } else {
            int n5 = C[198];
            n5 ^= C[199];
            if (ping < (n5 -= C[200])) {
                int n6 = C[201];
                n6 -= C[202];
                n2 = n6 += C[203];
            } else {
                int n7 = C[204];
                n7 += C[205];
                if (ping < (n7 ^= C[206])) {
                    int n8 = C[207];
                    n8 ^= C[208];
                    n2 = n8 ^= C[209];
                } else {
                    int n9 = C[210];
                    n9 ^= C[211];
                    n2 = n9 -= C[212];
                }
            }
        }
        return n2;
    }

    static {
        PlayerPingModule.b();
        long l2 = -3823696819727709233L;
        long l3 = 2742193290620366602L;
        long l4 = 458480266605371277L;
        long l5 = 5330161423250665897L;
        long l6 = 2278233195980823827L;
        long l7 = 6607869382681505177L;
        long l8 = 8230796122292075090L;
        long l9 = -749897183722826550L;
        long l10 = -7671804674074029841L;
        long l11 = 7515277786249078740L;
        long l12 = -7289998859256374661L;
        long l13 = 588964688419057485L;
        long l14 = -1631103473515742233L;
        long l15 = -8737924582366661026L;
        int n2 = C[213];
        n2 += C[214];
        a = new Object[n2 -= C[215]];
        long l16 = l15;
        int n3 = C[216];
        n3 -= C[217];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += C[218]);
        Object[] objectArray = new Object[C[219]];
        objectArray[PlayerPingModule.C[220]] = A;
        objectArray[PlayerPingModule.C[221]] = C[222];
        int n4 = C[223];
        Object object = PlayerPingModule.A()[C[224]];
        if (object == null) {
            char[] cArray = "\u44b2\u42c5\u44b4\u42f8\u44ba\u450b\u42d2\u4218\u450c\u42d4\u44ba\u421a\u4561\u451d\u4501\u42fc\u456a\u4511\u42d1\u4508\u44be\u41fa\u451d\u455b\u42c5\u4512\u42d4\u4561\u4513\u4575\u44b4\u44b2\u421b\u42c7\u42e3\u421a\u44b1\u4501\u4501\u44b2\u4568\u44ff\u450c\u4525\u42c9\u42e6\u4576\u44b4\u42e5\u451d\u44ff\u42d1\u4526\u42cf\u4516\u42c6\u44b1\u451d\u4513\u42fb\u455f\u42e6\u421c\u4512\u42e6\u455c\u450f\u44be\u456a\u44b1\u456b\u421a\u44ba\u4573\u4516\u42de\u42d4\u42de\u4218\u42c5\u42c6\u421b\u42fb\u42cf\u4523\u4568\u44b0\u4567\u44be\u4508\u4561\u41fa\u4575\u44bd\u42e6\u456b\u42e3\u4516\u421b\u4561\u42f8\u44b2\u4567\u451d\u4526\u4512\u42de\u42dd\u4575\u42d2\u4525\u450f\u4558\u455b\u4561\u42c5\u4513\u455c\u43a9\u451d\u4569\u455f\u42ca\u42d4\u455f\u42cf\u42c9\u44b4\u450b\u450c\u4508\u44af\u4512\u455c\u42cf\u4511\u44b4\u42e3\u4567\u42c3\u4575\u44ff\u450b\u42cf\u4501\u455b\u44ff\u455c\u455c\u44af\u4515\u42e5\u421a\u44b1\u42c7\u4526\u450f\u42fb\u456b\u42d4\u456a\u44ff\u44af\u42c9\u42c9\u4567\u450c\u44b1\u451d\u41fa\u42d1\u41f7".toCharArray();
            for (int i2 = C[225]; i2 < C[226]; ++i2) {
                int n5 = cArray[i2];
                n5 -= C[227];
                n5 -= C[228];
                n5 += C[229];
                n5 ^= C[230];
                n5 += C[231];
                n5 ^= C[232];
                n5 ^= C[233];
                n5 -= C[234];
                n5 ^= C[235];
                n5 += C[236];
                n5 ^= C[237];
                n5 -= C[238];
                n5 -= C[239];
                n5 -= C[240];
                n5 += C[241];
                n5 += C[242];
                cArray[i2] = (char)(n5 ^= C[243]);
            }
            object = PlayerPingModule.A()[PlayerPingModule.C[244]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)PlayerPingModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = C[245];
        n6 -= C[246];
        l6 = l17 ^ (0x4300000000L ^ l17) & -1L << (n6 ^= C[247]);
        long l18 = l13;
        int n7 = C[248];
        n7 += C[249];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= C[250]);
        while (true) {
            int n8 = C[251];
            n8 -= C[252];
            if ((int)l13 >= (int)(l6 >>> (n8 += C[253]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = C[254];
            n10 += C[255];
            int n11 = C[257];
            n11 ^= C[258];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= C[256])) & -1L >>> (n11 += C[259]);
            long l20 = l9;
            int n12 = C[260];
            n12 ^= C[261];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= C[262]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = C[263];
            n14 += C[264];
            int n15 = C[266];
            n15 += C[267];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 += C[265])) & -1L >>> (n15 ^= C[268]);
            int n16 = C[269];
            n16 ^= C[270];
            long l22 = l10;
            int n17 = C[272];
            n17 ^= C[273];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= C[271]) ^ l22) & -1L << (n17 -= C[274]);
            int n18 = C[275];
            n18 ^= C[276];
            n18 += C[277];
            int n19 = C[278];
            n19 -= C[279];
            long l23 = l12;
            int n20 = C[281];
            n20 -= C[282];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= C[280]))) ^ l23) & -1L >>> (n20 -= C[283]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = C[284];
            n21 += C[285];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= C[286]);
            while (true) {
                int n22 = C[287];
                n22 -= C[288];
                if ((int)(l14 >>> (n22 += C[289])) >= (int)l12) break;
                int n23 = C[290];
                n23 ^= C[291];
                int n24 = C[293];
                n24 ^= C[294];
                cArray2[(int)(l14 >>> (n23 ^= PlayerPingModule.C[292]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += C[295]))];
                l14 += 0x100000000L;
            }
            int n25 = C[296];
            n25 ^= C[297];
            int n26 = (int)(l15 >>> (n25 += C[298]));
            l15 += 0x100000000L;
            PlayerPingModule.a[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = C[299];
            n27 ^= C[300];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= C[301]);
        }
        INSTANCE = new PlayerPingModule();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[C[302]];
        String string = (String)object[C[303]];
        object = object[C[304]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[305]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[306]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[308] ^ C[309]];
                byArray[PlayerPingModule.C[310] ^ PlayerPingModule.C[311]] = C[312] ^ C[313];
                byArray[PlayerPingModule.C[314] ^ PlayerPingModule.C[315]] = C[316] ^ C[317];
                byArray[PlayerPingModule.C[318] ^ PlayerPingModule.C[319]] = C[320] ^ C[321];
                byArray[PlayerPingModule.C[322] ^ PlayerPingModule.C[323]] = C[324] ^ C[325];
                byArray[PlayerPingModule.C[326] ^ PlayerPingModule.C[327]] = C[328] ^ C[329];
                byArray[PlayerPingModule.C[330] ^ PlayerPingModule.C[331]] = C[332] ^ C[333];
                byArray[PlayerPingModule.C[334] ^ PlayerPingModule.C[335]] = C[336] ^ C[337];
                byArray[PlayerPingModule.C[338] ^ PlayerPingModule.C[339]] = C[340] ^ C[341];
                byArray[PlayerPingModule.C[342] ^ PlayerPingModule.C[343]] = C[344] ^ C[345];
                byArray[PlayerPingModule.C[346] ^ PlayerPingModule.C[347]] = C[348] ^ C[349];
                byArray[PlayerPingModule.C[350] ^ PlayerPingModule.C[351]] = C[352] ^ C[353];
                byArray[PlayerPingModule.C[354] ^ PlayerPingModule.C[355]] = C[356] ^ C[357];
                byArray[PlayerPingModule.C[358] ^ PlayerPingModule.C[359]] = C[360] ^ C[361];
                byArray[PlayerPingModule.C[362] ^ PlayerPingModule.C[363]] = C[364] ^ C[365];
                byArray[PlayerPingModule.C[366] ^ PlayerPingModule.C[367]] = C[368] ^ C[369];
                byArray[PlayerPingModule.C[370] ^ PlayerPingModule.C[371]] = C[372] ^ C[373];
                objectArray2[PlayerPingModule.C[307]] = byArray;
            }
            byte[] byArray = (byte[])object3[C[374]];
            if (b == null) {
                byte[] byArray2 = new byte[C[375] ^ C[376]];
                byArray2[PlayerPingModule.C[377] ^ PlayerPingModule.C[378]] = C[379] ^ C[380];
                byArray2[PlayerPingModule.C[381] ^ PlayerPingModule.C[382]] = C[383] ^ C[384];
                byArray2[PlayerPingModule.C[385] ^ PlayerPingModule.C[386]] = C[387] ^ C[388];
                byArray2[PlayerPingModule.C[389] ^ PlayerPingModule.C[390]] = C[391] ^ C[392];
                byArray2[PlayerPingModule.C[393] ^ PlayerPingModule.C[394]] = C[395] ^ C[396];
                byArray2[PlayerPingModule.C[397] ^ PlayerPingModule.C[398]] = C[399] ^ 0xE0;
                byArray2[0x5DD6 ^ 0x5DCA] = 0x5D96 ^ 0x5DCA;
                byArray2[0xB2CD ^ 0xB2DC] = 0xB2BB ^ 0xB2DC;
                byArray2[0x2689 ^ 0x268E] = 0xFFFFD90E ^ 0x268E;
                byArray2[0xD7D ^ 0xD60] = 0xFFFFF2DC ^ 0xD60;
                byArray2[0xF3F7 ^ 0xF3E3] = 0xFFFF0C4F ^ 0xF3E3;
                byArray2[0x9373 ^ 0x936A] = 0xFFFF6CDD ^ 0x936A;
                byArray2[0xA2E9 ^ 0xA2E0] = 0xA2B3 ^ 0xA2E0;
                byArray2[0x564B ^ 0x5650] = 0x5611 ^ 0x5650;
                byArray2[0x6571 ^ 0x6573] = 0xFFFF9ACD ^ 0x6573;
                byArray2[0x5B94 ^ 0x5B9A] = 0xFFFFA426 ^ 0x5B9A;
                byArray2[0x10529 ^ 0x10533] = 0xFFFEFACB ^ 0x10533;
                byArray2[0xA25D ^ 0xA252] = 0xA205 ^ 0xA252;
                byArray2[0xDE9D ^ 0xDE85] = 0xFFFF2164 ^ 0xDE85;
                byArray2[0x3A89 ^ 0x3A8A] = 0xFFFFC562 ^ 0x3A8A;
                byArray2[0x65C5 ^ 0x65D5] = 0x65AA ^ 0x65D5;
                byArray2[0xBC68 ^ 0xBC7E] = 0xBC21 ^ 0xBC7E;
                byArray2[0x7071 ^ 0x7070] = 0xFFFF8FD5 ^ 0x7070;
                byArray2[0x2002 ^ 0x200F] = 0x2062 ^ 0x200F;
                byArray2[0x58E8 ^ 0x58F7] = 0x58DC ^ 0x58F7;
                byArray2[0x72FC ^ 0x72EB] = 0x72A7 ^ 0x72EB;
                byArray2[0x89CA ^ 0x89C0] = 0x899A ^ 0x89C0;
                byArray2[0x112 ^ 0x100] = 0xFFFFFED3 ^ 0x100;
                byArray2[0xA930 ^ 0xA92E] = 0xFFFF5687 ^ 0xA92E;
                byArray2[0xB3D8 ^ 0xB3CD] = 0xFFFF4C18 ^ 0xB3CD;
                byArray2[0xFDD4 ^ 0xFDD4] = 0xFDD4 ^ 0xFDD4;
                byArray2[0x74A0 ^ 0x74A8] = 0xFFFF8B7F ^ 0x74A8;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = PlayerPingModule.A()[1];
                if (object4 == null) {
                    char[] cArray = "\ue756\ue768\ue753\ue76a\ue75c\ue778\ue77f\ue631\ue63a\ue62e\ue74e\ue765\ue649\ue64b\ue75b\ue74e\ue769\ue779".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 += 16096;
                        n3 += 34081;
                        n3 -= 62115;
                        n3 += 1748;
                        n3 ^= 0x6896;
                        n3 += 53430;
                        n3 ^= 0x3FE7;
                        n3 += 50009;
                        n3 -= 31517;
                        cArray[i2] = (char)(n3 -= 57375);
                    }
                    object4 = PlayerPingModule.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[7] = -94;
                byArray4[2] = 20;
                byArray4[5] = -116;
                byArray4[3] = -35;
                byArray4[13] = 27;
                byArray4[8] = -117;
                byArray4[1] = -15;
                byArray4[6] = -97;
                byArray4[11] = 9;
                byArray4[12] = 70;
                byArray4[15] = 19;
                byArray4[9] = -87;
                byArray4[14] = -69;
                byArray4[0] = -110;
                byArray4[4] = 26;
                byArray4[10] = 56;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 16, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = PlayerPingModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u6183\u61bf\u6091".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 ^= 0xEBE3;
                        n4 -= 11716;
                        n4 ^= 0x948;
                        n4 += 17801;
                        n4 += 22027;
                        n4 -= 2923;
                        n4 ^= 0xA8B;
                        n4 += 58030;
                        n4 -= 45041;
                        n4 -= 38995;
                        n4 -= 61048;
                        n4 += 17177;
                        n4 -= 39162;
                        n4 ^= 0xF63B;
                        cArray[i3] = (char)(n4 ^= 0xB3FD);
                    }
                    object5 = PlayerPingModule.A()[2] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = PlayerPingModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\ucee9\ucee5\uced7\ucefb\ucee7\ucee6\ucee7\ucefb\uced8\ucedf\ucee7\uced7\ucef5\uced8\ucec9\ucec4\ucec4\ucf41\ucf3a\ucf43".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 += 28291;
                    n5 += 55305;
                    n5 ^= 0x370F;
                    n5 -= 16;
                    n5 ^= 0x9731;
                    n5 -= 32498;
                    n5 += 7027;
                    n5 -= 55284;
                    n5 -= 19317;
                    n5 -= 790;
                    n5 -= 55703;
                    n5 += 46811;
                    n5 += 63419;
                    cArray[i4] = (char)(n5 -= 27);
                }
                object6 = PlayerPingModule.A()[3] = new String(cArray);
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
        C = new int[0x138F ^ 0x121F];
        PlayerPingModule.C[0xF759 ^ 0xF767] = 0xF77A ^ 0xF767;
        PlayerPingModule.C[0x67D8 ^ 0x67D9] = 0xFFFF980E ^ 0x67D9;
        PlayerPingModule.C[0xA818 ^ 0xA913] = 0xFFFF56EA ^ 0xA913;
        PlayerPingModule.C[0x5830 ^ 0x5875] = 0xFFFFA7A6 ^ 0x5875;
        PlayerPingModule.C[0x3F8A ^ 0x3FBE] = 0x3FCB ^ 0x3FBE;
        PlayerPingModule.C[0x8CE5 ^ 0x8DDA] = 0x9890 ^ 0x8DDA;
        PlayerPingModule.C[0x1039B ^ 0x103DC] = 0x103C7 ^ 0x103DC;
        PlayerPingModule.C[0x9DE5 ^ 0x9C60] = 0x1FCF ^ 0x9C60;
        PlayerPingModule.C[0xB21A ^ 0xB32F] = 0x3E7E ^ 0xB32F;
        PlayerPingModule.C[0x8FA8 ^ 0x8F92] = 0x8FDB ^ 0x8F92;
        PlayerPingModule.C[0x9477 ^ 0x9570] = 0xFFFF6A91 ^ 0x9570;
        PlayerPingModule.C[0xF00B ^ 0xF101] = 0xF15C ^ 0xF101;
        PlayerPingModule.C[0x4D48 ^ 0x4C5E] = 0xFFFFB3EC ^ 0x4C5E;
        PlayerPingModule.C[0x40FC ^ 0x40E4] = 0x3BF67 ^ 0x40E4;
        PlayerPingModule.C[0xC32E ^ 0xC3A4] = 0xC355 ^ 0xC3A4;
        PlayerPingModule.C[0x4424 ^ 0x44C0] = 0x73C4 ^ 0x44C0;
        PlayerPingModule.C[0x36A7 ^ 0x36D6] = 0xFFFFC900 ^ 0x36D6;
        PlayerPingModule.C[0x299F ^ 0x292D] = 0x2958 ^ 0x292D;
        PlayerPingModule.C[0x4304 ^ 0x4285] = 0xA1EA ^ 0x4285;
        PlayerPingModule.C[0xAC25 ^ 0xAC93] = 0xFFFF5369 ^ 0xAC93;
        PlayerPingModule.C[0x1010C ^ 0x1010C] = 0xFFFEFEFB ^ 0x1010C;
        PlayerPingModule.C[0xD788 ^ 0xD7EF] = 0xFFFF2837 ^ 0xD7EF;
        PlayerPingModule.C[0xE654 ^ 0xE777] = 0xFFFF18FE ^ 0xE777;
        PlayerPingModule.C[0x8AE0 ^ 0x8A0F] = 0x1139 ^ 0x8A0F;
        PlayerPingModule.C[0x2A15 ^ 0x2A8F] = 0x2ADA ^ 0x2A8F;
        PlayerPingModule.C[0x7CD3 ^ 0x7D8F] = 0xBB5A ^ 0x7D8F;
        PlayerPingModule.C[0xF73F ^ 0xF649] = 0xF649 ^ 0xF649;
        PlayerPingModule.C[0x37FB ^ 0x37B8] = 0x37E4 ^ 0x37B8;
        PlayerPingModule.C[0xDC3F ^ 0xDCF5] = 0xDCA1 ^ 0xDCF5;
        PlayerPingModule.C[0xA960 ^ 0xA86F] = 0xA829 ^ 0xA86F;
        PlayerPingModule.C[0x6CD1 ^ 0x6CBF] = 0xFFFF9308 ^ 0x6CBF;
        PlayerPingModule.C[0x82BA ^ 0x8389] = 0x8389 ^ 0x8389;
        PlayerPingModule.C[0x6A45 ^ 0x6B58] = 0xFFFF94F2 ^ 0x6B58;
        PlayerPingModule.C[0xC4F4 ^ 0xC437] = 0xFF003A9F ^ 0xC437;
        PlayerPingModule.C[0x1F32 ^ 0x1FE0] = 0xFFFEE064 ^ 0x1FE0;
        PlayerPingModule.C[0x6755 ^ 0x67A8] = 0x6787 ^ 0x67A8;
        PlayerPingModule.C[0x10543 ^ 0x1045D] = 0x1045B ^ 0x1045D;
        PlayerPingModule.C[0xEF52 ^ 0xEFEE] = 0xEFC5 ^ 0xEFEE;
        PlayerPingModule.C[0x35A9 ^ 0x35E5] = 0xFFFFCA3D ^ 0x35E5;
        PlayerPingModule.C[0xC3D7 ^ 0xC2D2] = 0xFFFF3D7D ^ 0xC2D2;
        PlayerPingModule.C[0x300B ^ 0x3164] = 0xC802 ^ 0x3164;
        PlayerPingModule.C[0xE083 ^ 0xE10B] = 0x62A1 ^ 0xE10B;
        PlayerPingModule.C[0x88CD ^ 0x89A9] = 0xFFFFF6D8 ^ 0x89A9;
        PlayerPingModule.C[0xB0CB ^ 0xB1F0] = 0x175C ^ 0xB1F0;
        PlayerPingModule.C[0xB807 ^ 0xB940] = 0x3DD2 ^ 0xB940;
        PlayerPingModule.C[0x6879 ^ 0x68A0] = 0x68D5 ^ 0x68A0;
        PlayerPingModule.C[0xBDBD ^ 0xBD9D] = 0xBDD7 ^ 0xBD9D;
        PlayerPingModule.C[0xEF87 ^ 0xEFA6] = 0xEF42 ^ 0xEFA6;
        PlayerPingModule.C[0xB47E ^ 0xB41B] = 0xFFFF4B9D ^ 0xB41B;
        PlayerPingModule.C[0x6402 ^ 0x656E] = 0xFFFF8183 ^ 0x656E;
        PlayerPingModule.C[0xFA ^ 0x1C2] = 0xFFFF75B9 ^ 0x1C2;
        PlayerPingModule.C[0xCF21 ^ 0xCF6E] = 0xFFFF3096 ^ 0xCF6E;
        PlayerPingModule.C[0x8AB3 ^ 0x8A48] = 0x8A18 ^ 0x8A48;
        PlayerPingModule.C[0x6CFA ^ 0x6C29] = 0x6C1F ^ 0x6C29;
        PlayerPingModule.C[0xD456 ^ 0xD4A9] = 0xD4CC ^ 0xD4A9;
        PlayerPingModule.C[0x120B ^ 0x12C2] = 0xFFFFED87 ^ 0x12C2;
        PlayerPingModule.C[0x5FB8 ^ 0x5EDB] = 0xDE46 ^ 0x5EDB;
        PlayerPingModule.C[0x6F86 ^ 0x6EED] = 0x75B6 ^ 0x6EED;
        PlayerPingModule.C[0x2C87 ^ 0x2DF2] = 0xB2D6 ^ 0x2DF2;
        PlayerPingModule.C[0x79B7 ^ 0x793F] = 0xFFFF86F6 ^ 0x793F;
        PlayerPingModule.C[0x734F ^ 0x7374] = 0x736D ^ 0x7374;
        PlayerPingModule.C[0x4877 ^ 0x4924] = 0x11B9 ^ 0x4924;
        PlayerPingModule.C[0x46EE ^ 0x4604] = 0xE0ED ^ 0x4604;
        PlayerPingModule.C[0x9FBD ^ 0x9EBE] = 0x9ED5 ^ 0x9EBE;
        PlayerPingModule.C[0x8738 ^ 0x873E] = 0xFFFF78C0 ^ 0x873E;
        PlayerPingModule.C[0x517E ^ 0x50FD] = 0xFFFF4C73 ^ 0x50FD;
        PlayerPingModule.C[0xD86C ^ 0xD8EE] = 0xD8F7 ^ 0xD8EE;
        PlayerPingModule.C[0x6BE6 ^ 0x6ADC] = 0xCC74 ^ 0x6ADC;
        PlayerPingModule.C[0x66B3 ^ 0x6678] = 0x6677 ^ 0x6678;
        PlayerPingModule.C[0x46F5 ^ 0x47A4] = 0x7376 ^ 0x47A4;
        PlayerPingModule.C[0x912A ^ 0x9052] = 0x427C ^ 0x9052;
        PlayerPingModule.C[0xA6E5 ^ 0xA64C] = 0xA63D ^ 0xA64C;
        PlayerPingModule.C[0x10544 ^ 0x10416] = 0x15C87 ^ 0x10416;
        PlayerPingModule.C[0xBB80 ^ 0xBB30] = 0xFFFF44C3 ^ 0xBB30;
        PlayerPingModule.C[0x1EA3 ^ 0x1E36] = 0x1E2E ^ 0x1E36;
        PlayerPingModule.C[0x1229 ^ 0x135A] = 0x8C7E ^ 0x135A;
        PlayerPingModule.C[0x10579 ^ 0x10531] = 0x10521 ^ 0x10531;
        PlayerPingModule.C[0x402 ^ 0x421] = 0xFFFFFBB0 ^ 0x421;
        PlayerPingModule.C[0xF2D4 ^ 0xF3F1] = 0xFFFF0C81 ^ 0xF3F1;
        PlayerPingModule.C[0x942E ^ 0x95AC] = 0x76CF ^ 0x95AC;
        PlayerPingModule.C[0xB64A ^ 0xB616] = 0xFFFF49DE ^ 0xB616;
        PlayerPingModule.C[0x147E ^ 0x1543] = 0xB3EF ^ 0x1543;
        PlayerPingModule.C[0x9642 ^ 0x9641] = 0xFFFF699D ^ 0x9641;
        PlayerPingModule.C[0x10DAB ^ 0x10DA0] = 0x10D94 ^ 0x10DA0;
        PlayerPingModule.C[0x377C ^ 0x361C] = 0xFFFF5950 ^ 0x361C;
        PlayerPingModule.C[0x304 ^ 0x369] = 0x36B ^ 0x369;
        PlayerPingModule.C[0x1E91 ^ 0x1FE5] = 0x80CA ^ 0x1FE5;
        PlayerPingModule.C[0x8B76 ^ 0x8A62] = 0xFFFF75FD ^ 0x8A62;
        PlayerPingModule.C[0xA626 ^ 0xA6D0] = 0xFFFF594E ^ 0xA6D0;
        PlayerPingModule.C[0xBE31 ^ 0xBE7A] = 0xFFFF41C7 ^ 0xBE7A;
        PlayerPingModule.C[0xEC1E ^ 0xECBC] = 0xEC92 ^ 0xECBC;
        PlayerPingModule.C[0x220D ^ 0x221A] = 0x2240 ^ 0x221A;
        PlayerPingModule.C[0xBA92 ^ 0xBA13] = 0xFFFF458B ^ 0xBA13;
        PlayerPingModule.C[0x6864 ^ 0x680B] = 0xFFFF978F ^ 0x680B;
        PlayerPingModule.C[0x44FC ^ 0x44B6] = 0x44B8 ^ 0x44B6;
        PlayerPingModule.C[0xB68C ^ 0xB79E] = 0xFFFF4835 ^ 0xB79E;
        PlayerPingModule.C[0x39F7 ^ 0x38D3] = 0xFFFFC71B ^ 0x38D3;
        PlayerPingModule.C[0x1060 ^ 0x107E] = 0xFFFFEFFB ^ 0x107E;
        PlayerPingModule.C[0xD955 ^ 0xD9F2] = 0xFFFF2641 ^ 0xD9F2;
        PlayerPingModule.C[0x105AA ^ 0x104EB] = 0x111A1 ^ 0x104EB;
        PlayerPingModule.C[0x3EE1 ^ 0x3FF1] = 0x3FC4 ^ 0x3FF1;
        PlayerPingModule.C[0x4A74 ^ 0x4A1C] = 0x4A33 ^ 0x4A1C;
        PlayerPingModule.C[0x2CCF ^ 0x2C7E] = 0xFEFFD3D2 ^ 0x2C7E;
        PlayerPingModule.C[0x139B ^ 0x1362] = 0xFFFFECCB ^ 0x1362;
        PlayerPingModule.C[0xA344 ^ 0xA21B] = 0x32E8 ^ 0xA21B;
        PlayerPingModule.C[0xC74A ^ 0xC778] = 0xFFFF38B9 ^ 0xC778;
        PlayerPingModule.C[0x2BC3 ^ 0x2B78] = 0xFFFFD4F7 ^ 0x2B78;
        PlayerPingModule.C[0xE077 ^ 0xE11F] = 0xFFFFB2AA ^ 0xE11F;
        PlayerPingModule.C[0x10765 ^ 0x1063F] = 0x1C0D5 ^ 0x1063F;
        PlayerPingModule.C[0xA353 ^ 0xA396] = 0xA3E8 ^ 0xA396;
        PlayerPingModule.C[0x426A ^ 0x4286] = 0xC3AB ^ 0x4286;
        PlayerPingModule.C[0xC4A6 ^ 0xC5DF] = 0x26A4 ^ 0xC5DF;
        PlayerPingModule.C[0xA3CC ^ 0xA2EB] = 0xFFFF5D6F ^ 0xA2EB;
        PlayerPingModule.C[0x6168 ^ 0x61A7] = 0xFFFFC4DD ^ 0x61A7;
        PlayerPingModule.C[0xF648 ^ 0xF66E] = 0xFFFF09D9 ^ 0xF66E;
        PlayerPingModule.C[0xD02E ^ 0xD148] = 0x7D16 ^ 0xD148;
        PlayerPingModule.C[0xA6D4 ^ 0xA694] = 0xA6DE ^ 0xA694;
        PlayerPingModule.C[0xA4F5 ^ 0xA44B] = 0xA408 ^ 0xA44B;
        PlayerPingModule.C[0x20F2 ^ 0x21EA] = 0x21DD ^ 0x21EA;
        PlayerPingModule.C[0x9AF1 ^ 0x9AAF] = 0x9AFE ^ 0x9AAF;
        PlayerPingModule.C[0x220A ^ 0x224C] = 0x227A ^ 0x224C;
        PlayerPingModule.C[0x767E ^ 0x76F7] = 0xFFFF8950 ^ 0x76F7;
        PlayerPingModule.C[0xFB6C ^ 0xFB51] = 0xFB58 ^ 0xFB51;
        PlayerPingModule.C[0xCBDD ^ 0xCBFA] = 0xFFFF3447 ^ 0xCBFA;
        PlayerPingModule.C[0x1BD0 ^ 0x1AD4] = 0xFFFFE50A ^ 0x1AD4;
        PlayerPingModule.C[0x3DDB ^ 0x3DCD] = 0x3D99 ^ 0x3DCD;
        PlayerPingModule.C[0xAC35 ^ 0xACA4] = 0xFFFF5353 ^ 0xACA4;
        PlayerPingModule.C[0x209C ^ 0x21D0] = 0xFFFF13AA ^ 0x21D0;
        PlayerPingModule.C[0x8778 ^ 0x87D0] = 0xFFFF7856 ^ 0x87D0;
        PlayerPingModule.C[0x29F2 ^ 0x2988] = 0x29CF ^ 0x2988;
        PlayerPingModule.C[0x107B1 ^ 0x107E9] = 0x107D9 ^ 0x107E9;
        PlayerPingModule.C[0x1E8C ^ 0x1E62] = 0x2B33 ^ 0x1E62;
        PlayerPingModule.C[0xB29A ^ 0xB3A8] = 0xB3A9 ^ 0xB3A8;
        PlayerPingModule.C[0x795D ^ 0x7991] = 0x7951 ^ 0x7991;
        PlayerPingModule.C[0x257F ^ 0x243B] = 0x2B69 ^ 0x243B;
        PlayerPingModule.C[0x2335 ^ 0x2302] = 0xFFFFDCD8 ^ 0x2302;
        PlayerPingModule.C[0x8B80 ^ 0x8B37] = 0x1008B49 ^ 0x8B37;
        PlayerPingModule.C[0xEEB3 ^ 0xEFFE] = 0x2227 ^ 0xEFFE;
        PlayerPingModule.C[0x9B79 ^ 0x9B5D] = 0x9B62 ^ 0x9B5D;
        PlayerPingModule.C[0x429 ^ 0x440] = 0xFFFFFB83 ^ 0x440;
        PlayerPingModule.C[0x3EC1 ^ 0x3E06] = 0x3E44 ^ 0x3E06;
        PlayerPingModule.C[0xBF05 ^ 0xBE4B] = 0x8A9A ^ 0xBE4B;
        PlayerPingModule.C[0xC22D ^ 0xC3A3] = 0xC343 ^ 0xC3A3;
        PlayerPingModule.C[0xFAA1 ^ 0xFB95] = 0x76D4 ^ 0xFB95;
        PlayerPingModule.C[0x6A7C ^ 0x6BFB] = 0xFFFF17CE ^ 0x6BFB;
        PlayerPingModule.C[0x71DD ^ 0x719C] = 0x7183 ^ 0x719C;
        PlayerPingModule.C[0x7C77 ^ 0x7C78] = 0xFFFF80E2 ^ 0x7C78;
        PlayerPingModule.C[0x6CBD ^ 0x6CB0] = 0x6CFB ^ 0x6CB0;
        PlayerPingModule.C[0x4C34 ^ 0x4D08] = 0xEB8B ^ 0x4D08;
        PlayerPingModule.C[0x2369 ^ 0x23F1] = 0xFFFFDC2B ^ 0x23F1;
        PlayerPingModule.C[0x76CD ^ 0x77CB] = 0x779A ^ 0x77CB;
        PlayerPingModule.C[0xDB84 ^ 0xDB42] = 0xDB9B ^ 0xDB42;
        PlayerPingModule.C[0x161A ^ 0x1778] = 0x97E3 ^ 0x1778;
        PlayerPingModule.C[0xF323 ^ 0xF348] = 0xFFFF0C8B ^ 0xF348;
        PlayerPingModule.C[0x75FE ^ 0x74A5] = 0xB24A ^ 0x74A5;
        PlayerPingModule.C[0xC190 ^ 0xC01D] = 0xC0EE ^ 0xC01D;
        PlayerPingModule.C[0x8DE5 ^ 0x8D9B] = 0xFFFF7222 ^ 0x8D9B;
        PlayerPingModule.C[0x56 ^ 0xD0] = 0xDF ^ 0xD0;
        PlayerPingModule.C[0x9824 ^ 0x98C9] = 0x9098 ^ 0x98C9;
        PlayerPingModule.C[0xF2EB ^ 0xF20B] = 0xF20B ^ 0xF20B;
        PlayerPingModule.C[0x9A61 ^ 0x9B27] = 0x1FBB ^ 0x9B27;
        PlayerPingModule.C[0xF90 ^ 0xF17] = 0xFFFFF047 ^ 0xF17;
        PlayerPingModule.C[0x28CC ^ 0x2948] = 0xCA2B ^ 0x2948;
        PlayerPingModule.C[0x8E49 ^ 0x8F27] = 0x764A ^ 0x8F27;
        PlayerPingModule.C[0x5F06 ^ 0x5E50] = 0x257B ^ 0x5E50;
        PlayerPingModule.C[0x5DFC ^ 0x5DA7] = 0xFFFFA26D ^ 0x5DA7;
        PlayerPingModule.C[0x71F9 ^ 0x71BD] = 0xFFFF8E7E ^ 0x71BD;
        PlayerPingModule.C[0xC95C ^ 0xC983] = 0xC981 ^ 0xC983;
        PlayerPingModule.C[0xA48F ^ 0xA44B] = 0xFFFF5B91 ^ 0xA44B;
        PlayerPingModule.C[0xD7D7 ^ 0xD777] = 0xD71B ^ 0xD777;
        PlayerPingModule.C[0x1385 ^ 0x13D3] = 0xFFFFEC33 ^ 0x13D3;
        PlayerPingModule.C[0xAA26 ^ 0xAA56] = 0xFFFF5598 ^ 0xAA56;
        PlayerPingModule.C[0x1891 ^ 0x1861] = 0x285B ^ 0x1861;
        PlayerPingModule.C[0xB2BB ^ 0xB210] = 0xFFFF4D41 ^ 0xB210;
        PlayerPingModule.C[0x42F2 ^ 0x43DA] = 0xFFFFBC4B ^ 0x43DA;
        PlayerPingModule.C[0xA8CE ^ 0xA9B5] = 0xFFFFB50F ^ 0xA9B5;
        PlayerPingModule.C[0xCE53 ^ 0xCEF2] = 0xFFFF3110 ^ 0xCEF2;
        PlayerPingModule.C[0xD16B ^ 0xD118] = 0xFFFF2EC7 ^ 0xD118;
        PlayerPingModule.C[0x287E ^ 0x2872] = 0x2BF8 ^ 0x2872;
        PlayerPingModule.C[0x7ADE ^ 0x7A8A] = 0x7AAE ^ 0x7A8A;
        PlayerPingModule.C[0xEE72 ^ 0xEF37] = 0xE01B ^ 0xEF37;
        PlayerPingModule.C[0x85A ^ 0x8C7] = 0xFFFFF733 ^ 0x8C7;
        PlayerPingModule.C[0x4BCA ^ 0x4BA8] = 0x4BF2 ^ 0x4BA8;
        PlayerPingModule.C[0x10EE9 ^ 0x10E8A] = 0x10E42 ^ 0x10E8A;
        PlayerPingModule.C[0x2A2E ^ 0x2AD2] = 0x2A8D ^ 0x2AD2;
        PlayerPingModule.C[0x8358 ^ 0x8251] = 0x823D ^ 0x8251;
        PlayerPingModule.C[0xA128 ^ 0xA114] = 0xA152 ^ 0xA114;
        PlayerPingModule.C[0x739F ^ 0x73B3] = 0x73AD ^ 0x73B3;
        PlayerPingModule.C[0xA370 ^ 0xA3F0] = 0xFFFF5C39 ^ 0xA3F0;
        PlayerPingModule.C[0x880C ^ 0x897C] = 0xFFFF8F96 ^ 0x897C;
        PlayerPingModule.C[0x61EF ^ 0x6139] = 0x617C ^ 0x6139;
        PlayerPingModule.C[0x10D34 ^ 0x10DB8] = 0x10DD1 ^ 0x10DB8;
        PlayerPingModule.C[0x38E5 ^ 0x3825] = 0x3803 ^ 0x3825;
        PlayerPingModule.C[0xA2F2 ^ 0xA3EE] = 0xA392 ^ 0xA3EE;
        PlayerPingModule.C[0x5430 ^ 0x5447] = 0x5460 ^ 0x5447;
        PlayerPingModule.C[0x6E22 ^ 0x6EAC] = 0x6EFF ^ 0x6EAC;
        PlayerPingModule.C[0x76BC ^ 0x7669] = 0xFFFF89E0 ^ 0x7669;
        PlayerPingModule.C[0xCBA0 ^ 0xCAE0] = 0xDF9F ^ 0xCAE0;
        PlayerPingModule.C[0x663E ^ 0x6652] = 0xFFFF99EB ^ 0x6652;
        PlayerPingModule.C[0xC69E ^ 0xC6AE] = 0xFFFF3918 ^ 0xC6AE;
        PlayerPingModule.C[0xD46F ^ 0xD440] = 0xD425 ^ 0xD440;
        PlayerPingModule.C[0x1F15 ^ 0x1F8B] = 0x1FA4 ^ 0x1F8B;
        PlayerPingModule.C[0x3D0B ^ 0x3DF3] = 0xFFFFC20F ^ 0x3DF3;
        PlayerPingModule.C[0x72B8 ^ 0x7233] = 0x722B ^ 0x7233;
        PlayerPingModule.C[0xF7C4 ^ 0xF7CD] = 0xFFFF08A1 ^ 0xF7CD;
        PlayerPingModule.C[0xDFA1 ^ 0xDFF4] = 0xDFF0 ^ 0xDFF4;
        PlayerPingModule.C[0x8075 ^ 0x80A8] = 0x80A9 ^ 0x80A8;
        PlayerPingModule.C[0x10677 ^ 0x1071E] = 0x1AB40 ^ 0x1071E;
        PlayerPingModule.C[0xFEAC ^ 0xFE35] = 0xFE6C ^ 0xFE35;
        PlayerPingModule.C[0x628B ^ 0x62DA] = 0xFFFF9D78 ^ 0x62DA;
        PlayerPingModule.C[0xF95F ^ 0xF9FC] = 0xF9D5 ^ 0xF9FC;
        PlayerPingModule.C[0xD639 ^ 0xD747] = 0x1D31A ^ 0xD747;
        PlayerPingModule.C[0xF705 ^ 0xF61F] = 0xF678 ^ 0xF61F;
        PlayerPingModule.C[0x6C11 ^ 0x6CB5] = 0x6CAE ^ 0x6CB5;
        PlayerPingModule.C[0xEC35 ^ 0xECB8] = 0xEC62 ^ 0xECB8;
        PlayerPingModule.C[0x6F54 ^ 0x6E72] = 0xFFFF919E ^ 0x6E72;
        PlayerPingModule.C[0x1121 ^ 0x1011] = 0x1011 ^ 0x1011;
        PlayerPingModule.C[0x44AF ^ 0x4526] = 0x600A ^ 0x4526;
        PlayerPingModule.C[0xC2C1 ^ 0xC216] = 0xFFFF3DDF ^ 0xC216;
        PlayerPingModule.C[0x10703 ^ 0x1072D] = 0x10739 ^ 0x1072D;
        PlayerPingModule.C[0x52D6 ^ 0x527A] = 0xFFFFADD1 ^ 0x527A;
        PlayerPingModule.C[0x102E8 ^ 0x102DB] = 0xFFFEFDD6 ^ 0x102DB;
        PlayerPingModule.C[0xB190 ^ 0xB1E5] = 0xFFFF4E3C ^ 0xB1E5;
        PlayerPingModule.C[0xAC2E ^ 0xACBD] = 0xAC01 ^ 0xACBD;
        PlayerPingModule.C[0xDCAC ^ 0xDC84] = 0xDCB9 ^ 0xDC84;
        PlayerPingModule.C[0x6342 ^ 0x6380] = 0xFFFF9C67 ^ 0x6380;
        PlayerPingModule.C[0xC935 ^ 0xC998] = 0xFFFF363C ^ 0xC998;
        PlayerPingModule.C[0x4170 ^ 0x410F] = 0x417F ^ 0x410F;
        PlayerPingModule.C[0x138F ^ 0x1342] = 0x1356 ^ 0x1342;
        PlayerPingModule.C[0x357D ^ 0x35BC] = 0xFFFFCA67 ^ 0x35BC;
        PlayerPingModule.C[0x64CD ^ 0x65E0] = 0x658E ^ 0x65E0;
        PlayerPingModule.C[0x8311 ^ 0x8333] = 0x8366 ^ 0x8333;
        PlayerPingModule.C[0xAA94 ^ 0xAA21] = 0xFFFF559C ^ 0xAA21;
        PlayerPingModule.C[0x8C90 ^ 0x8CC3] = 0x8CC8 ^ 0x8CC3;
        PlayerPingModule.C[0x428B ^ 0x427F] = 0x427F ^ 0x427F;
        PlayerPingModule.C[0x670B ^ 0x67F1] = 0xFFFF9874 ^ 0x67F1;
        PlayerPingModule.C[0x34D2 ^ 0x34D8] = 0xFFFFCB45 ^ 0x34D8;
        PlayerPingModule.C[0x10AD1 ^ 0x10A86] = 0x10ACE ^ 0x10A86;
        PlayerPingModule.C[0x75A1 ^ 0x75C1] = 0x75E9 ^ 0x75C1;
        PlayerPingModule.C[0xD12D ^ 0xD025] = 0xFFFF2F91 ^ 0xD025;
        PlayerPingModule.C[0xD941 ^ 0xD91E] = 0xD942 ^ 0xD91E;
        PlayerPingModule.C[0x9F11 ^ 0x9FF4] = 0x2EF1 ^ 0x9FF4;
        PlayerPingModule.C[0x6EB9 ^ 0x6E62] = 0x6E61 ^ 0x6E62;
        PlayerPingModule.C[0x74D2 ^ 0x743A] = 0xF593 ^ 0x743A;
        PlayerPingModule.C[0x9047 ^ 0x9071] = 0xFFFF6FC0 ^ 0x9071;
        PlayerPingModule.C[0x10F75 ^ 0x10E2D] = 0x17564 ^ 0x10E2D;
        PlayerPingModule.C[0x71EA ^ 0x70EA] = 0xFFFF8F08 ^ 0x70EA;
        PlayerPingModule.C[0x4878 ^ 0x48EA] = 0xFFFFB77A ^ 0x48EA;
        PlayerPingModule.C[0x14ED ^ 0x14E3] = 0x14DE ^ 0x14E3;
        PlayerPingModule.C[0x6C3C ^ 0x6CE0] = 0x6CE0 ^ 0x6CE0;
        PlayerPingModule.C[0x10ACE ^ 0x10A3D] = 0x1C663 ^ 0x10A3D;
        PlayerPingModule.C[0x5A5D ^ 0x5B1F] = 0x5439 ^ 0x5B1F;
        PlayerPingModule.C[0xE15B ^ 0xE04E] = 0xE014 ^ 0xE04E;
        PlayerPingModule.C[0xDAB6 ^ 0xDBD7] = 0x4B24 ^ 0xDBD7;
        PlayerPingModule.C[0xEAEB ^ 0xEA1E] = 0xFFFF159B ^ 0xEA1E;
        PlayerPingModule.C[0x340A ^ 0x3417] = 0xFFFFCBB6 ^ 0x3417;
        PlayerPingModule.C[0x103BC ^ 0x1034D] = 0x19336 ^ 0x1034D;
        PlayerPingModule.C[0x1DA7 ^ 0x1C8E] = 0x1CB8 ^ 0x1C8E;
        PlayerPingModule.C[0xFD01 ^ 0xFDA4] = 0xFDED ^ 0xFDA4;
        PlayerPingModule.C[0xBF18 ^ 0xBE67] = 0xFFFE459D ^ 0xBE67;
        PlayerPingModule.C[0x48AE ^ 0x481A] = 0x1004827 ^ 0x481A;
        PlayerPingModule.C[0x7EE4 ^ 0x7E74] = 0xFFFF81D3 ^ 0x7E74;
        PlayerPingModule.C[0x963B ^ 0x9679] = 0xF09708 ^ 0x9679;
        PlayerPingModule.C[0x4699 ^ 0x4716] = 0x47E5 ^ 0x4716;
        PlayerPingModule.C[0x2390 ^ 0x229C] = 0x22EA ^ 0x229C;
        PlayerPingModule.C[0x1876 ^ 0x1958] = 0x1959 ^ 0x1958;
        PlayerPingModule.C[0x74AC ^ 0x75D6] = 0x96AB ^ 0x75D6;
        PlayerPingModule.C[0x2782 ^ 0x27B3] = 0xFFFFD866 ^ 0x27B3;
        PlayerPingModule.C[0xCC82 ^ 0xCCFA] = 0xCCE9 ^ 0xCCFA;
        PlayerPingModule.C[0x5A40 ^ 0x5B51] = 0xFFFFA4AF ^ 0x5B51;
        PlayerPingModule.C[0x6DDD ^ 0x6DA1] = 0xFFFF927D ^ 0x6DA1;
        PlayerPingModule.C[0x103FC ^ 0x10302] = 0xFFFEFC7C ^ 0x10302;
        PlayerPingModule.C[0xCA10 ^ 0xCB9A] = 0xEEBD ^ 0xCB9A;
        PlayerPingModule.C[0x122D ^ 0x123F] = 0xFFFFEDB2 ^ 0x123F;
        PlayerPingModule.C[0xF6C9 ^ 0xF620] = 0xBB69 ^ 0xF620;
        PlayerPingModule.C[0x9D3C ^ 0x9D5D] = 0xFFFF62F3 ^ 0x9D5D;
        PlayerPingModule.C[0xD263 ^ 0xD205] = 0xD222 ^ 0xD205;
        PlayerPingModule.C[0xC07F ^ 0xC06A] = 0xC06C ^ 0xC06A;
        PlayerPingModule.C[0x10B1B ^ 0x10B87] = 0x10B82 ^ 0x10B87;
        PlayerPingModule.C[0xCAFE ^ 0xCBA9] = 0xB085 ^ 0xCBA9;
        PlayerPingModule.C[0xAED7 ^ 0xAFA5] = 0x308E ^ 0xAFA5;
        PlayerPingModule.C[0xCDCC ^ 0xCC8F] = 0xC3A3 ^ 0xCC8F;
        PlayerPingModule.C[0x480D ^ 0x4960] = 0x523B ^ 0x4960;
        PlayerPingModule.C[0xED22 ^ 0xEC5E] = 0xF23 ^ 0xEC5E;
        PlayerPingModule.C[0x6365 ^ 0x6212] = 0xB01C ^ 0x6212;
        PlayerPingModule.C[0x1AC4 ^ 0x1AFB] = 0xFFFFE54C ^ 0x1AFB;
        PlayerPingModule.C[0x750 ^ 0x729] = 0xFFFFF885 ^ 0x729;
        PlayerPingModule.C[0x37B5 ^ 0x3684] = 0x3685 ^ 0x3684;
        PlayerPingModule.C[0x808 ^ 0x862] = 0xFFFFF79D ^ 0x862;
        PlayerPingModule.C[0xB4BB ^ 0xB403] = 0xB425 ^ 0xB403;
        PlayerPingModule.C[0xEA5C ^ 0xEABB] = 0x3F7D ^ 0xEABB;
        PlayerPingModule.C[0xD2E3 ^ 0xD202] = 0xD202 ^ 0xD202;
        PlayerPingModule.C[0x881C ^ 0x8855] = 0x8857 ^ 0x8855;
        PlayerPingModule.C[0xB901 ^ 0xB92B] = 0xB972 ^ 0xB92B;
        PlayerPingModule.C[0xDCCF ^ 0xDCCD] = 0xDCD3 ^ 0xDCCD;
        PlayerPingModule.C[0x2243 ^ 0x221E] = 0x2235 ^ 0x221E;
        PlayerPingModule.C[0x10017 ^ 0x1002F] = 0xFFFEFF9A ^ 0x1002F;
        PlayerPingModule.C[0x1C62 ^ 0x1C73] = 0x1C1E ^ 0x1C73;
        PlayerPingModule.C[0xF3B ^ 0xF75] = 0xFF1 ^ 0xF75;
        PlayerPingModule.C[0x28C1 ^ 0x28D8] = 0x28C9 ^ 0x28D8;
        PlayerPingModule.C[0x10C55 ^ 0x10D7F] = 0x10D06 ^ 0x10D7F;
        PlayerPingModule.C[0x98F2 ^ 0x983A] = 0x980D ^ 0x983A;
        PlayerPingModule.C[0x9DF5 ^ 0x9C90] = 0x1C0D ^ 0x9C90;
        PlayerPingModule.C[0x424 ^ 0x4B2] = 0x4CF ^ 0x4B2;
        PlayerPingModule.C[0x61B3 ^ 0x6085] = 0xEB0B ^ 0x6085;
        PlayerPingModule.C[0x1A64 ^ 0x1AD9] = 0xFFFFE56F ^ 0x1AD9;
        PlayerPingModule.C[0x1460 ^ 0x1416] = 0x1436 ^ 0x1416;
        PlayerPingModule.C[0x109CC ^ 0x1093E] = 0x1EEC3 ^ 0x1093E;
        PlayerPingModule.C[0xDC70 ^ 0xDC6B] = 0xFFFF23C1 ^ 0xDC6B;
        PlayerPingModule.C[0x7410 ^ 0x740C] = 0x741B ^ 0x740C;
        PlayerPingModule.C[0xD2E3 ^ 0xD3A8] = 0x1E71 ^ 0xD3A8;
        PlayerPingModule.C[0x1C2F ^ 0x1C76] = 0xFFFFE38E ^ 0x1C76;
        PlayerPingModule.C[0xAF26 ^ 0xAF21] = 0xFFFF50AA ^ 0xAF21;
        PlayerPingModule.C[0x15AA ^ 0x14F7] = 0xD218 ^ 0x14F7;
        PlayerPingModule.C[0x5DC0 ^ 0x5CBD] = 0x158E4 ^ 0x5CBD;
        PlayerPingModule.C[0x181D ^ 0x1936] = 0x19F3 ^ 0x1936;
        PlayerPingModule.C[0x52B8 ^ 0x538F] = 0xD80C ^ 0x538F;
        PlayerPingModule.C[0x10A36 ^ 0x10A52] = 0x10A00 ^ 0x10A52;
        PlayerPingModule.C[0xE0AA ^ 0xE010] = 0xFFFF1FDC ^ 0xE010;
        PlayerPingModule.C[0xF9D4 ^ 0xF854] = 0x1FC09 ^ 0xF854;
        PlayerPingModule.C[0x8664 ^ 0x8703] = 0x2B5D ^ 0x8703;
        PlayerPingModule.C[0x41BB ^ 0x403D] = 0xC397 ^ 0x403D;
        PlayerPingModule.C[0xED82 ^ 0xED2D] = 0xFFFF12CB ^ 0xED2D;
        PlayerPingModule.C[0x71AE ^ 0x71B4] = 0x71DA ^ 0x71B4;
        PlayerPingModule.C[0xC04F ^ 0xC0D4] = 0xFFFF3F30 ^ 0xC0D4;
        PlayerPingModule.C[0x90F6 ^ 0x91D9] = 0x91DB ^ 0x91D9;
        PlayerPingModule.C[0xE364 ^ 0xE370] = 0xE37F ^ 0xE370;
        PlayerPingModule.C[0x503A ^ 0x5137] = 0x5114 ^ 0x5137;
        PlayerPingModule.C[0x60DF ^ 0x6079] = 0xFFFF9F83 ^ 0x6079;
        PlayerPingModule.C[0x108DE ^ 0x10851] = 0xFFFEF7C8 ^ 0x10851;
        PlayerPingModule.C[0x92E ^ 0x95A] = 0x959 ^ 0x95A;
        PlayerPingModule.C[0x9D8D ^ 0x9D32] = 0x9D38 ^ 0x9D32;
        PlayerPingModule.C[0x1DF6 ^ 0x1D26] = 0x1D11 ^ 0x1D26;
        PlayerPingModule.C[0xEA69 ^ 0xEA40] = 0xFFFF15E0 ^ 0xEA40;
        PlayerPingModule.C[0xBBF2 ^ 0xBBF6] = 0xBBA0 ^ 0xBBF6;
        PlayerPingModule.C[0x548C ^ 0x543F] = 0xFFFFABE6 ^ 0x543F;
        PlayerPingModule.C[0x250C ^ 0x2535] = 0x25B7 ^ 0x2535;
        PlayerPingModule.C[0xD681 ^ 0xD62B] = 0xD622 ^ 0xD62B;
        PlayerPingModule.C[0x4E72 ^ 0x4FF9] = 0x6ACA ^ 0x4FF9;
        PlayerPingModule.C[0x5558 ^ 0x5406] = 0xC4FC ^ 0x5406;
        PlayerPingModule.C[0x63D4 ^ 0x62CD] = 0x626C ^ 0x62CD;
        PlayerPingModule.C[0x5D44 ^ 0x5DEA] = 0x5DE1 ^ 0x5DEA;
        PlayerPingModule.C[0xB844 ^ 0xB85B] = 0xFFFF47B4 ^ 0xB85B;
        PlayerPingModule.C[0x960E ^ 0x96D4] = 0xFFFF6947 ^ 0x96D4;
        PlayerPingModule.C[0xD370 ^ 0xD238] = 0xFFFFA967 ^ 0xD238;
        PlayerPingModule.C[0x3317 ^ 0x336A] = 0xFFFFCC9A ^ 0x336A;
        PlayerPingModule.C[0xEE98 ^ 0xEFD7] = 0xDB05 ^ 0xEFD7;
        PlayerPingModule.C[0x10551 ^ 0x10450] = 0x1047A ^ 0x10450;
        PlayerPingModule.C[0x521F ^ 0x528B] = 0x52AF ^ 0x528B;
        PlayerPingModule.C[0x8D9F ^ 0x8D97] = 0x8DE2 ^ 0x8D97;
        PlayerPingModule.C[0x108E1 ^ 0x10803] = 0x108AF ^ 0x10803;
        PlayerPingModule.C[0xDC32 ^ 0xDD2D] = 0xDD6C ^ 0xDD2D;
        PlayerPingModule.C[0xF7C5 ^ 0xF740] = 0xF737 ^ 0xF740;
        PlayerPingModule.C[0x7DCC ^ 0x7D9C] = 0x7DE1 ^ 0x7D9C;
        PlayerPingModule.C[0x548 ^ 0x586] = 0x59A ^ 0x586;
        PlayerPingModule.C[0x10E5 ^ 0x10F5] = 0xFFFFEF1F ^ 0x10F5;
        PlayerPingModule.C[0xBDCB ^ 0xBC47] = 0x9960 ^ 0xBC47;
        PlayerPingModule.C[0x86C1 ^ 0x8622] = 0x1BA2 ^ 0x8622;
        PlayerPingModule.C[0x7C52 ^ 0x7CB4] = 0x42D2 ^ 0x7CB4;
        PlayerPingModule.C[0xA1EE ^ 0xA0B7] = 0xDB9B ^ 0xA0B7;
        PlayerPingModule.C[0x210F ^ 0x202D] = 0x204C ^ 0x202D;
        PlayerPingModule.C[0x22C7 ^ 0x229D] = 0x22BF ^ 0x229D;
        PlayerPingModule.C[0x7017 ^ 0x7143] = 0xFFFFD66A ^ 0x7143;
        PlayerPingModule.C[0x2950 ^ 0x2943] = 0xFFFFD6DE ^ 0x2943;
        PlayerPingModule.C[0xA01C ^ 0xA130] = 0xA17B ^ 0xA130;
        PlayerPingModule.C[0xDEB8 ^ 0xDE27] = 0xDE55 ^ 0xDE27;
        PlayerPingModule.C[0x487E ^ 0x48A0] = 0x48A0 ^ 0x48A0;
        PlayerPingModule.C[0x1867 ^ 0x184C] = 0x1817 ^ 0x184C;
        PlayerPingModule.C[0x71EB ^ 0x70BE] = 0x2823 ^ 0x70BE;
        PlayerPingModule.C[0xA7A6 ^ 0xA6A4] = 0xFFFF593B ^ 0xA6A4;
        PlayerPingModule.C[0xBDD2 ^ 0xBC9B] = 0x3809 ^ 0xBC9B;
        PlayerPingModule.C[0x9BB4 ^ 0x9ADE] = 0x8184 ^ 0x9ADE;
        PlayerPingModule.C[0xAD33 ^ 0xADB7] = 0xAD3F ^ 0xADB7;
        PlayerPingModule.C[0x68AA ^ 0x68D8] = 0x68E6 ^ 0x68D8;
        PlayerPingModule.C[0x5F78 ^ 0x5F93] = 0x1658 ^ 0x5F93;
        PlayerPingModule.C[0xCB8D ^ 0xCBA8] = 0xCBC0 ^ 0xCBA8;
        PlayerPingModule.C[0xC56B ^ 0xC44B] = 0xFFFF3B80 ^ 0xC44B;
        PlayerPingModule.C[0x46ED ^ 0x463C] = 0x4671 ^ 0x463C;
        PlayerPingModule.C[0x62BD ^ 0x62F0] = 0xFFFF9D15 ^ 0x62F0;
        PlayerPingModule.C[0x96A2 ^ 0x979B] = 0x1C18 ^ 0x979B;
        PlayerPingModule.C[0x426E ^ 0x434F] = 0xFFFFBCE5 ^ 0x434F;
        PlayerPingModule.C[0xEED1 ^ 0xEED4] = 0xEEAE ^ 0xEED4;
        PlayerPingModule.C[0x87DC ^ 0x87F1] = 0xFFFF785E ^ 0x87F1;
        PlayerPingModule.C[0x2C25 ^ 0x2C5E] = 0x2C73 ^ 0x2C5E;
        PlayerPingModule.C[0x8752 ^ 0x8786] = 0xFFFF7834 ^ 0x8786;
        PlayerPingModule.C[0x5620 ^ 0x5672] = 0xFFFFA9DE ^ 0x5672;
        PlayerPingModule.C[0x72CE ^ 0x7259] = 0xFFFF8DE6 ^ 0x7259;
        PlayerPingModule.C[0x5FE4 ^ 0x5EDA] = 0x4B98 ^ 0x5EDA;
        PlayerPingModule.C[0x20B8 ^ 0x21C9] = 0xD8AF ^ 0x21C9;
        PlayerPingModule.C[0x8BAA ^ 0x8B29] = 0x8B46 ^ 0x8B29;
        PlayerPingModule.C[0x7534 ^ 0x75C3] = 0xFFFF8A04 ^ 0x75C3;
        PlayerPingModule.C[0xBB4D ^ 0xBBF4] = 0xBBAD ^ 0xBBF4;
        PlayerPingModule.C[0x5099 ^ 0x518E] = 0xFFFFAE15 ^ 0x518E;
        PlayerPingModule.C[0x75A ^ 0x76F] = 0xFFFFF8EC ^ 0x76F;
        PlayerPingModule.C[0x12F5 ^ 0x13EE] = 0x13F4 ^ 0x13EE;
        PlayerPingModule.C[0xF92D ^ 0xF9F5] = 0xF8F7 ^ 0xF9F5;
        PlayerPingModule.C[0xBEA4 ^ 0xBFF4] = 0x8B02 ^ 0xBFF4;
        PlayerPingModule.C[0xB9CC ^ 0xB886] = 0x755D ^ 0xB886;
        PlayerPingModule.C[0x3B00 ^ 0x3A0E] = 0x3A4B ^ 0x3A0E;
        PlayerPingModule.C[0x921C ^ 0x930F] = 0x9326 ^ 0x930F;
    }
}

