/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.RenderLayer
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.render.VertexConsumerProvider$Immediate
 *  net.minecraft.client.util.BufferAllocator
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.util.math.MatrixStack$Entry
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.math.RotationAxis
 *  net.minecraft.util.math.Vec3d
 *  org.joml.Quaternionfc
 *  org.lwjgl.opengl.GL11
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.awt.Color;
import kotakbaz.rain.client.draggable.animation.AnimationUtil;
import kotakbaz.rain.client.draggable.animation.Easing;
import kotakbaz.rain.event.events.AttackEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.TargetEspModule;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RainRenderLayers;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Quaternionfc;
import org.lwjgl.opengl.GL11;
import oxxxde.\u0628\u062d;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u062b;
import oxxxde.\u0638\u0646;
import oxxxde.\u0638\u064b;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0004\u00ad\u0001\u00ae\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\fH\u0007\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0003J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0014J/\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002\u00a2\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0002\u00a2\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020#H\u0002\u00a2\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020#H\u0002\u00a2\u0006\u0004\b.\u0010-J\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020)012\u0006\u00100\u001a\u00020/H\u0002\u00a2\u0006\u0004\b2\u00103J'\u00108\u001a\u0002072\u0006\u00104\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00106\u001a\u000205H\u0002\u00a2\u0006\u0004\b8\u00109J\u001f\u0010>\u001a\u00020=2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u000205H\u0002\u00a2\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u0002052\u0006\u0010@\u001a\u000205H\u0002\u00a2\u0006\u0004\bA\u0010BJ\u009f\u0001\u0010W\u001a\u00020\u00062\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020\u001b2\u0006\u0010J\u001a\u00020)2\u0006\u0010K\u001a\u00020\u001b2\u0006\u0010L\u001a\u00020\u001b2\u0006\u0010M\u001a\u00020\u001b2\u0006\u0010N\u001a\u00020)2\u0006\u0010O\u001a\u00020\u001b2\u0006\u0010P\u001a\u00020\u001b2\u0006\u0010Q\u001a\u00020\u001b2\u0006\u0010R\u001a\u00020)2\u0006\u0010S\u001a\u00020\u001b2\u0006\u0010T\u001a\u00020\u001b2\u0006\u0010U\u001a\u00020\u001b2\u0006\u0010V\u001a\u00020)H\u0002\u00a2\u0006\u0004\bW\u0010XJ7\u0010]\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020C2\u0006\u0010F\u001a\u00020E2\u0006\u0010Z\u001a\u00020\u001b2\u0006\u0010[\u001a\u00020)2\u0006\u0010\\\u001a\u00020/H\u0002\u00a2\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b_\u0010\u0003J\u000f\u0010`\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\bb\u0010cJ'\u0010g\u001a\u00020)2\u0006\u0010d\u001a\u00020)2\u0006\u0010e\u001a\u00020)2\u0006\u0010f\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020#H\u0002\u00a2\u0006\u0004\bi\u0010-R\u0014\u0010j\u001a\u00020/8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010l\u001a\u00020:8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020:8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bn\u0010mR\u0014\u0010o\u001a\u00020/8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bo\u0010kR\u0014\u0010p\u001a\u00020/8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bp\u0010kR\u0014\u0010q\u001a\u00020/8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bq\u0010kR\u0014\u0010r\u001a\u00020/8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\br\u0010kR\u0014\u0010s\u001a\u00020/8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bs\u0010kR\u0014\u0010t\u001a\u00020/8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bt\u0010kR\u0014\u0010u\u001a\u00020\u001b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010w\u001a\u0002058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010y\u001a\u00020\u001b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\by\u0010vR\u0014\u0010z\u001a\u00020\u001b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bz\u0010vR\u0014\u0010{\u001a\u00020\u001b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b{\u0010vR\u0014\u0010|\u001a\u0002058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b|\u0010xR\u0014\u0010}\u001a\u00020:8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b}\u0010mR\u0014\u0010~\u001a\u00020:8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b~\u0010mR\u0014\u0010\u007f\u001a\u00020\u001b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u007f\u0010vR\u0016\u0010\u0080\u0001\u001a\u00020\u001b8\u0002X\u0082T\u00a2\u0006\u0007\n\u0005\b\u0080\u0001\u0010vR\u0018\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008d\u0001\u0010\u0083\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008e\u0001\u0010\u008c\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008f\u0001\u0010\u008c\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0090\u0001\u0010\u008c\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0091\u0001\u0010\u008c\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0092\u0001\u0010\u008c\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0093\u0001\u0010\u008c\u0001R\u0018\u0010\u0094\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0094\u0001\u0010\u008c\u0001R\u0017\u0010\u0095\u0001\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0017\u0010\u0097\u0001\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0097\u0001\u0010\u0096\u0001R\u0017\u0010\u0098\u0001\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0098\u0001\u0010\u0096\u0001R\u0017\u0010\u0099\u0001\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0099\u0001\u0010\u0096\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001b\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0019\u0010\u009f\u0001\u001a\u0002078\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u009f\u0001\u0010\u00a0\u0001R\u0018\u0010\u00a1\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u00a1\u0001\u0010vR\u0018\u0010\u00a2\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u00a2\u0001\u0010vR\u0018\u0010\u00a3\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u00a3\u0001\u0010vR\u0018\u0010\u00a4\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u00a4\u0001\u0010vR\u0018\u0010\u00a5\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u00a5\u0001\u0010vR\u0019\u0010\u00a6\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00a6\u0001\u0010\u00a7\u0001R\u0018\u0010\u00a8\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u00a8\u0001\u0010vR\u0018\u0010\u00a9\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u00a9\u0001\u0010vR\u0018\u0010\u00aa\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u00aa\u0001\u0010mR\u0017\u0010\u00ab\u0001\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00ab\u0001\u0010\u00ac\u0001\u00a8\u0006\u00af\u0001"}, d2={"Loxxxde/\u0638\u0624;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u0633\u062d;", "event", "", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Loxxxde/\u0630\u0645;", "onAttack", "(Lkotakbaz/rain/event/events/AttackEvent;)V", "Loxxxde/\u0634\u062b;", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "onDisable", "updateLegacyAnimation", "Lnet/minecraft/class_4597$class_4598;", "consumers", "renderMarker", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4597$class_4598;)V", "renderGhosts", "Lnet/minecraft/class_1921;", "fillLayer", "outlineLayer", "renderRing", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4597$class_4598;Lnet/minecraft/class_1921;Lnet/minecraft/class_1921;)V", "", "partialTicks", "updateTrackedPosition", "(F)V", "Lnet/minecraft/class_1657;", "resolveLiveTarget", "()Lnet/minecraft/class_1657;", "player", "", "isUsableTarget", "(Lnet/minecraft/class_1657;)Z", "Lnet/minecraft/class_2960;", "selectedTexture", "()Lnet/minecraft/class_2960;", "Ljava/awt/Color;", "selectedEspColor", "()Ljava/awt/Color;", "isRingStyle", "()Z", "isGhostsStyle", "", "maxSegments", "", "resolveRingColors", "(I)[Ljava/awt/Color;", "segment", "", "radius", "Lnet/minecraft/class_243;", "ringPoint", "(IID)Lnet/minecraft/class_243;", "", "frameTime", "targetHeight", "Loxxxde/\u0634\u0641;", "resolveRingSweep", "(JD)Lkotakbaz/rain/module/modules/render/TargetEspModule$RingSweepState;", "value", "easeInOutQuad", "(D)D", "Lnet/minecraft/class_4588;", "quadBuffer", "Lnet/minecraft/class_4587$class_4665;", "entry", "x1", "y1", "z1", "color1", "x2", "y2", "z2", "color2", "x3", "y3", "z3", "color3", "x4", "y4", "z4", "color4", "drawColoredQuad", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;FFFLjava/awt/Color;FFFLjava/awt/Color;FFFLjava/awt/Color;FFFLjava/awt/Color;)V", "buffer", "half", "color", "alpha", "emitSprite", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;FLjava/awt/Color;I)V", "resetAnimations", "markerHitPulse", "()F", "smoothStep", "(F)F", "from", "to", "factor", "blendColor", "(Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;", "isMarkerStyle", "BUFFER_SIZE", "I", "LEGACY_ANIMATION_MILLIS", "J", "RING_ANIMATION_MILLIS", "STYLE_CIRCLE", "STYLE_DIAMOND", "STYLE_RING", "STYLE_MODERN", "STYLE_GHOSTS", "RING_SEGMENTS", "RING_RADIUS_MULTIPLIER", "F", "RING_SWEEP_DURATION_MILLIS", "D", "RING_BRIGHT_ALPHA", "RING_FADE_ALPHA", "RING_OUTLINE_ALPHA", "RING_OUTLINE_WIDTH", "MARKER_HIT_ANIMATION_MILLIS", "MARKER_HIT_SHRINK_IN_MILLIS", "MARKER_HIT_SHRINK", "MARKER_HIT_RED_BLEND", "Loxxxde/\u062e\u0630;", "useClientColor", "Loxxxde/\u062e\u0630;", "Loxxxde/\u0631\u062a;", "espColor", "Loxxxde/\u0631\u062a;", "Loxxxde/\u0638\u064a;", "style", "Loxxxde/\u0638\u064a;", "Loxxxde/\u0637\u064f;", "markerSize", "Loxxxde/\u0637\u064f;", "hitAnimation", "speedMod", "ghostsCount", "ghostsSize", "ghostsLength", "ghostsSpeed", "ghostsRadius", "ghostsAlpha", "circleTexture", "Lnet/minecraft/class_2960;", "diamondTexture", "modernTexture", "ghostsTexture", "Loxxxde/\u0633\u0637;", "showAnimation", "Loxxxde/\u0633\u0637;", "displayTarget", "Lnet/minecraft/class_1657;", "lastTargetPos", "Lnet/minecraft/class_243;", "lastTargetHeight", "lastTargetWidth", "rotation", "prevRotation", "rotationSpeed", "flip", "Z", "circleStep", "prevCircleStep", "markerHitStartedAt", "DAMAGE_RED", "Ljava/awt/Color;", "RingSweepState", "QuadVertices", "rain-visuals"})
@RecompileFormat
public final class \u0638\u0624
extends Module {
    @NotNull
    private static final SliderSetting ghostsSpeed;
    @NotNull
    private static final SliderSetting ghostsAlpha;
    @NotNull
    private static final Color DAMAGE_RED;
    private static float circleStep;
    private static final float RING_BRIGHT_ALPHA = 0.88f;
    private static float lastTargetWidth;
    @NotNull
    private static Vec3d lastTargetPos;
    @NotNull
    private static final SliderSetting markerSize;
    @NotNull
    private static final Identifier ghostsTexture;
    private static final int STYLE_DIAMOND = 1;
    private static final float RING_RADIUS_MULTIPLIER = 0.8f;
    private static float rotation;
    private static final double RING_OUTLINE_WIDTH = 1.5;
    private static final int STYLE_RING = 2;
    @Nullable
    private static PlayerEntity displayTarget;
    @NotNull
    private static final SliderSetting speedMod;
    private static final float MARKER_HIT_RED_BLEND = 0.85f;
    private static float lastTargetHeight;
    @NotNull
    private static final Identifier diamondTexture;
    private static long markerHitStartedAt;
    private static final int RING_SEGMENTS = 360;
    @NotNull
    private static final Identifier circleTexture;
    @NotNull
    private static final ModeSetting style;
    @NotNull
    private static final BooleanSetting useClientColor;
    @NotNull
    private static final SliderSetting ghostsCount;
    private static final int STYLE_CIRCLE = 0;
    private static final long MARKER_HIT_ANIMATION_MILLIS = 520L;
    private static final float RING_OUTLINE_ALPHA = 0.16f;
    private static final long RING_ANIMATION_MILLIS = 500L;
    private static final int BUFFER_SIZE = 262144;
    @NotNull
    private static final Identifier modernTexture;
    @NotNull
    private static final SliderSetting ghostsSize;
    private static final float RING_FADE_ALPHA = 0.01f;
    private static boolean flip;
    private static float rotationSpeed;
    private static final int STYLE_GHOSTS = 4;
    private static float prevCircleStep;
    @NotNull
    private static final SliderSetting ghostsLength;
    @NotNull
    private static final AnimationUtil showAnimation;
    private static float prevRotation;
    private static final double RING_SWEEP_DURATION_MILLIS = 2000.0;
    @NotNull
    private static final BooleanSetting hitAnimation;
    private static final long LEGACY_ANIMATION_MILLIS = 120L;
    @NotNull
    private static final SliderSetting ghostsRadius;
    private static final long MARKER_HIT_SHRINK_IN_MILLIS = 70L;
    private static final float MARKER_HIT_SHRINK = 0.28f;
    @NotNull
    public static final \u0638\u0624 INSTANCE;
    private static final int STYLE_MODERN = 3;
    @NotNull
    private static final ColorSetting espColor;

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        block9: {
            block8: {
                Intrinsics.checkNotNullParameter(event, "event");
                \u0638\u064b.INSTANCE.update();
                PlayerEntity liveTarget = this.resolveLiveTarget();
                if (liveTarget != null) {
                    displayTarget = liveTarget;
                }
                prevRotation = rotation;
                prevCircleStep = circleStep;
                boolean show = liveTarget != null;
                showAnimation.run(show ? 1.0 : 0.0, this.isRingStyle() ? 500L : 120L, Easing.SINE_OUT, true);
                if (!show) {
                    if (showAnimation.get() <= 0.0f) {
                        displayTarget = null;
                        this.resetAnimations();
                        return;
                    }
                }
                if (displayTarget == null) break block8;
                if (!(showAnimation.get() <= 0.0f)) break block9;
            }
            return;
        }
        if (this.isRingStyle()) {
            circleStep += 0.15f * ((Number)speedMod.getValue()).floatValue();
        } else {
            this.updateLegacyAnimation();
        }
    }

    /*
     * WARNING - void declaration
     */
    private final void renderGhosts(Render3DEvent event, VertexConsumerProvider.Immediate consumers) {
        float progress = RangesKt.coerceIn(showAnimation.get(), 0.0f, 1.0f);
        if (progress <= 0.0f) {
            return;
        }
        Color color = this.selectedEspColor();
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
        Vec3d cameraPos = \u0637\u062b.getPos(\u0637\u062b.getCamera(gameRenderer));
        VertexConsumer vertexConsumer = consumers.getBuffer(RainRenderLayers.getTrailSprite(ghostsTexture));
        Intrinsics.checkNotNullExpressionValue(vertexConsumer, "getBuffer(...)");
        VertexConsumer buffer = vertexConsumer;
        double time = (double)System.currentTimeMillis() * 0.0016 * ((Number)ghostsSpeed.getValue()).doubleValue();
        int streamCount = RangesKt.coerceIn((int)((Number)ghostsCount.getValue()).floatValue(), 1, 12);
        int trailPoints = RangesKt.coerceIn((int)((Number)ghostsLength.getValue()).floatValue(), 1, 128);
        float sizeScale = ((Number)ghostsSize.getValue()).floatValue() / 0.13f;
        Float f = Float.valueOf(lastTargetWidth);
        float it = ((Number)f).floatValue();
        boolean bl = false;
        Float f2 = it > 0.0f ? f : null;
        float width = (f2 != null ? f2.floatValue() : 0.6f) * 1.5f;
        float radiusAnimation = Math.max(0.5f, 1.2f - 0.5f * progress);
        float radiusScale = ((Number)ghostsRadius.getValue()).floatValue() / 0.6f;
        double radius = width * radiusAnimation * radiusScale;
        double heightScale = 1.0;
        float alphaMultiplier = RangesKt.coerceIn(((Number)ghostsAlpha.getValue()).floatValue(), 0.0f, 100.0f) / 100.0f;
        double streamSpacing = Math.PI * 2 / (double)streamCount;
        double pointStep = Math.toRadians(2.0);
        int stream = 0;
        while (stream < streamCount) {
            void var24_22;
            double streamPhase = (double)stream * streamSpacing;
            int i = 0;
            while (i < trailPoints) {
                void var27_24;
                float trailTick = (float)i * 2.0f;
                double angle = time + streamPhase + (double)i * pointStep;
                double targetHeight = lastTargetHeight;
                double waveY = targetHeight / 1.5 + targetHeight / 3.0 * Math.sin((double)i * pointStep * 0.5 + time * 0.2 + streamPhase * 0.5);
                double yOffset = targetHeight * 0.5 + (waveY - targetHeight * 0.5) * heightScale;
                float coreSize = (0.13f + 0.005f * trailTick) * sizeScale;
                float glowSize = (0.7f + 0.005f * trailTick) * sizeScale;
                int alpha = RangesKt.coerceIn((int)((float)color.getAlpha() * progress * alphaMultiplier), 0, 255);
                int glowAlpha = RangesKt.coerceIn((int)((float)alpha * 0.05f), 0, 255);
                if (alpha > 0) {
                    void var1_1;
                    void var39_32;
                    event.getMatrices().push();
                    event.getMatrices().translate(\u0638\u0624.lastTargetPos.x - cameraPos.x + Math.sin(angle) * radius, \u0638\u0624.lastTargetPos.y - cameraPos.y + yOffset, \u0638\u0624.lastTargetPos.z - cameraPos.z - Math.cos(angle) * radius);
                    MatrixStack matrixStack = event.getMatrices();
                    GameRenderer gameRenderer2 = \u0636\u0643.getMc().gameRenderer;
                    Intrinsics.checkNotNullExpressionValue(gameRenderer2, "gameRenderer");
                    matrixStack.multiply((Quaternionfc)\u0637\u062b.getCamera(gameRenderer2).getRotation());
                    event.getMatrices().multiply((Quaternionfc)RotationAxis.POSITIVE_Z.rotationDegrees((float)i * 17.0f));
                    if (glowAlpha > 0) {
                        MatrixStack.Entry entry = event.getMatrices().peek();
                        Intrinsics.checkNotNullExpressionValue(entry, "last(...)");
                        this.emitSprite(buffer, entry, glowSize * 0.5f, color, glowAlpha);
                    }
                    MatrixStack.Entry entry = event.getMatrices().peek();
                    Intrinsics.checkNotNullExpressionValue(entry, "last(...)");
                    this.emitSprite(buffer, entry, coreSize * 0.5f, color, (int)var39_32);
                    var1_1.getMatrices().pop();
                }
                ++var27_24;
            }
            ++var24_22;
        }
    }

    /*
     * WARNING - void declaration
     */
    private final void renderMarker(Render3DEvent event, VertexConsumerProvider.Immediate consumers) {
        void var1_1;
        void var5_5;
        float progress = RangesKt.coerceIn(showAnimation.get(), 0.0f, 1.0f);
        if (progress <= 0.0f) {
            return;
        }
        Color selectedColor = this.selectedEspColor();
        int alpha = RangesKt.coerceIn((int)((float)selectedColor.getAlpha() * progress), 0, 255);
        if (alpha <= 0) {
            return;
        }
        float hitPulse = this.markerHitPulse();
        Color markerColor = this.blendColor(selectedColor, DAMAGE_RED, hitPulse * 0.85f);
        float spin = prevRotation + (rotation - prevRotation) * event.getPartialTicks();
        float hitScale = 1.0f - 0.28f * hitPulse;
        float animatedSize = ((Number)markerSize.getValue()).floatValue() * (1.0f + 0.5f * (1.0f - progress)) * hitScale;
        float half = animatedSize * 0.5f;
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
        Vec3d cameraPos = \u0637\u062b.getPos(\u0637\u062b.getCamera(gameRenderer));
        RenderLayer layer = RainRenderLayers.getTargetEsp(this.selectedTexture());
        event.getMatrices().push();
        event.getMatrices().translate(\u0638\u0624.lastTargetPos.x - cameraPos.x, \u0638\u0624.lastTargetPos.y - cameraPos.y + (double)(lastTargetHeight * 0.5f), \u0638\u0624.lastTargetPos.z - cameraPos.z);
        MatrixStack matrixStack = event.getMatrices();
        GameRenderer gameRenderer2 = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer2, "gameRenderer");
        matrixStack.multiply((Quaternionfc)\u0637\u062b.getCamera(gameRenderer2).getRotation());
        event.getMatrices().multiply((Quaternionfc)RotationAxis.POSITIVE_Z.rotationDegrees(spin));
        event.getMatrices().translate(-((double)half), -((double)half), 0.0);
        MatrixStack.Entry entry = event.getMatrices().peek();
        Intrinsics.checkNotNullExpressionValue(entry, "last(...)");
        MatrixStack.Entry entry2 = entry;
        VertexConsumer vertexConsumer = consumers.getBuffer(layer);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer, "getBuffer(...)");
        VertexConsumer buffer = vertexConsumer;
        buffer.vertex(entry2, 0.0f, 0.0f, 0.0f).color(markerColor.getRed(), markerColor.getGreen(), markerColor.getBlue(), alpha).texture(0.0f, 1.0f);
        buffer.vertex(entry2, animatedSize, 0.0f, 0.0f).color(markerColor.getRed(), markerColor.getGreen(), markerColor.getBlue(), alpha).texture(1.0f, 1.0f);
        buffer.vertex(entry2, animatedSize, animatedSize, 0.0f).color(markerColor.getRed(), markerColor.getGreen(), markerColor.getBlue(), alpha).texture(1.0f, 0.0f);
        buffer.vertex(entry2, 0.0f, animatedSize, 0.0f).color(markerColor.getRed(), markerColor.getGreen(), markerColor.getBlue(), (int)var5_5).texture(0.0f, 0.0f);
        var1_1.getMatrices().pop();
    }

    private final Color[] resolveRingColors(int maxSegments) {
        Color color = this.selectedEspColor();
        int n = 0;
        int n2 = maxSegments + 1;
        Color[] colorArray = new Color[n2];
        while (n < n2) {
            int n3 = n++;
            colorArray[n3] = color;
        }
        return colorArray;
    }

    private final Color selectedEspColor() {
        return (Boolean)useClientColor.getValue() != false && \u0638\u062b.INSTANCE.isEnabled() ? \u0638\u062b.INSTANCE.getClientColor() : (Color)espColor.getValue();
    }

    private static final boolean markerSize$lambda$0() {
        return !INSTANCE.isRingStyle() && !INSTANCE.isGhostsStyle();
    }

    private final void resetAnimations() {
        rotation = 1.0f;
        prevRotation = 0.0f;
        rotationSpeed = 1.0f;
        flip = false;
        circleStep = 0.0f;
        prevCircleStep = 0.0f;
        markerHitStartedAt = 0L;
    }

    private static final boolean ghostsRadius$lambda$0() {
        return INSTANCE.isGhostsStyle();
    }

    private final float markerHitPulse() {
        if (!((Boolean)hitAnimation.getValue()).booleanValue()) {
            markerHitStartedAt = 0L;
            return 0.0f;
        }
        if (markerHitStartedAt <= 0L) {
            return 0.0f;
        }
        long elapsed = System.currentTimeMillis() - markerHitStartedAt;
        if (elapsed >= 520L) {
            markerHitStartedAt = 0L;
            return 0.0f;
        }
        if (elapsed <= 70L) {
            float shrinkProgress = (float)elapsed / (float)70L;
            return this.smoothStep(RangesKt.coerceIn(shrinkProgress, 0.0f, 1.0f));
        }
        long recoverMillis = 450L;
        float recoverProgress = (float)(elapsed - 70L) / (float)recoverMillis;
        return 1.0f - this.smoothStep(RangesKt.coerceIn(recoverProgress, 0.0f, 1.0f));
    }

    /*
     * WARNING - void declaration
     */
    private final Color blendColor(Color from, Color to, float factor) {
        void var1_1;
        float t = RangesKt.coerceIn(factor, 0.0f, 1.0f);
        float inverse = 1.0f - t;
        return new Color(RangesKt.coerceIn((int)((float)from.getRed() * inverse + (float)to.getRed() * t), 0, 255), RangesKt.coerceIn((int)((float)from.getGreen() * inverse + (float)to.getGreen() * t), 0, 255), RangesKt.coerceIn((int)((float)from.getBlue() * inverse + (float)to.getBlue() * t), 0, 255), var1_1.getAlpha());
    }

    private static final boolean espColor$lambda$0() {
        return !((Boolean)useClientColor.getValue()).booleanValue() || !\u0638\u062b.INSTANCE.isEnabled();
    }

    private final Vec3d ringPoint(int segment, int maxSegments, double radius) {
        int clampedSegment = Math.min(segment, maxSegments);
        double angle = (double)clampedSegment * (Math.PI * 2) / (double)maxSegments;
        return new Vec3d(Math.cos(angle) * radius, 0.0, -Math.sin(angle) * radius);
    }

    @Commando
    public final void onAttack(@NotNull AttackEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.isEnabled()) {
            return;
        }
        Entity entity = event.getEntity();
        PlayerEntity playerEntity = entity instanceof PlayerEntity ? (PlayerEntity)entity : null;
        if (playerEntity == null) {
            return;
        }
        PlayerEntity attackedPlayer = playerEntity;
        if (!this.isUsableTarget(attackedPlayer)) {
            return;
        }
        \u0638\u064b.INSTANCE.track(attackedPlayer);
        if (this.isMarkerStyle() && ((Boolean)hitAnimation.getValue()).booleanValue()) {
            markerHitStartedAt = System.currentTimeMillis();
        }
    }

    private final void emitSprite(VertexConsumer buffer, MatrixStack.Entry entry, float half, Color color, int alpha) {
        buffer.vertex(entry, -half, half, 0.0f).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(0.0f, 0.0f);
        buffer.vertex(entry, half, half, 0.0f).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(1.0f, 0.0f);
        buffer.vertex(entry, half, -half, 0.0f).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(1.0f, 1.0f);
        buffer.vertex(entry, -half, -half, 0.0f).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(0.0f, 1.0f);
    }

    private final void updateTrackedPosition(float partialTicks) {
        PlayerEntity playerEntity = displayTarget;
        if (playerEntity == null) {
            return;
        }
        PlayerEntity target = playerEntity;
        if (!this.isUsableTarget(target)) {
            return;
        }
        Vec3d vec3d = target.getLerpedPos(partialTicks);
        Intrinsics.checkNotNullExpressionValue(vec3d, "getPosition(...)");
        lastTargetPos = vec3d;
        lastTargetHeight = \u0637\u062b.getHeight((Entity)target);
        lastTargetWidth = \u0637\u062b.getWidth((Entity)target);
    }

    private final float smoothStep(float value) {
        return value * value * (3.0f - 2.0f * value);
    }

    private final double easeInOutQuad(double value) {
        return value < 0.5 ? 2.0 * value * value : 1.0 - Math.pow(-2.0 * value + 2.0, 2.0) * 0.5;
    }

    private final Identifier selectedTexture() {
        return switch (style.getSelectedIndex()) {
            case 1 -> diamondTexture;
            case 3 -> modernTexture;
            case 0 -> circleTexture;
            default -> circleTexture;
        };
    }

    private static final boolean ghostsSpeed$lambda$0() {
        return INSTANCE.isGhostsStyle();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @Commando
    public final void onRender3D(@NotNull Render3DEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.isEnabled()) {
            return;
        }
        showAnimation.update();
        if (showAnimation.get() <= 0.0f) {
            return;
        }
        this.updateTrackedPosition(event.getPartialTicks());
        AutoCloseable autoCloseable = (AutoCloseable)new BufferAllocator(262144);
        Throwable throwable = null;
        try {
            BufferAllocator allocator = (BufferAllocator)autoCloseable;
            boolean bl = false;
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate((BufferAllocator)allocator);
            Intrinsics.checkNotNullExpressionValue(immediate, "immediate(...)");
            VertexConsumerProvider.Immediate consumers = immediate;
            if (INSTANCE.isRingStyle()) {
                RenderLayer fillLayer = RainRenderLayers.getHitBoxQuad(true);
                RenderLayer outlineLayer = RainRenderLayers.getHitBoxLine(1.5);
                GlStateManager._enableBlend();
                GlStateManager._blendFuncSeparate((int)770, (int)1, (int)1, (int)0);
                GlStateManager._enableDepthTest();
                GlStateManager._disableCull();
                GL11.glEnable((int)2848);
                GL11.glHint((int)3154, (int)4354);
                try {
                    Intrinsics.checkNotNull(fillLayer);
                    Intrinsics.checkNotNull(outlineLayer);
                    INSTANCE.renderRing(event, consumers, fillLayer, outlineLayer);
                }
                finally {
                    GL11.glDisable((int)2848);
                    GlStateManager._enableCull();
                    GlStateManager._enableDepthTest();
                    GlStateManager._disableBlend();
                }
            } else {
                void var7_10;
                if (style.getSelectedIndex() == 4) {
                    INSTANCE.renderGhosts(event, consumers);
                } else {
                    INSTANCE.renderMarker(event, consumers);
                }
                VertexConsumerProvider.Immediate $this$draw$iv = consumers;
                boolean bl2 = false;
                var7_10.draw();
            }
            Unit unit = Unit.INSTANCE;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            AutoCloseableKt.closeFinally(autoCloseable, throwable);
        }
    }

    private static final boolean hitAnimation$lambda$0() {
        return INSTANCE.isMarkerStyle();
    }

    private static final boolean ghostsAlpha$lambda$0() {
        return INSTANCE.isGhostsStyle();
    }

    /*
     * WARNING - void declaration
     */
    private final PlayerEntity resolveLiveTarget() {
        void var1_1;
        PlayerEntity playerEntity = \u0638\u064b.INSTANCE.currentTarget();
        if (playerEntity == null) {
            return null;
        }
        PlayerEntity rawTarget = playerEntity;
        if (!this.isUsableTarget(rawTarget)) {
            return null;
        }
        return var1_1;
    }

    private static final boolean useClientColor$lambda$0() {
        return \u0638\u062b.INSTANCE.isEnabled();
    }

    /*
     * WARNING - void declaration
     */
    private final TargetEspModule.RingSweepState resolveRingSweep(long frameTime, double targetHeight) {
        void var14_8;
        double halfDuration;
        double duration = RangesKt.coerceAtLeast(2000.0 / (double)((Number)speedMod.getValue()).floatValue(), 350.0);
        double elapsed = frameTime % (long)duration;
        boolean reverse = elapsed > (halfDuration = duration * 0.5);
        double progress = elapsed / halfDuration;
        progress = reverse ? progress - 1.0 : 1.0 - progress;
        progress = this.easeInOutQuad(RangesKt.coerceIn(progress, 0.0, 1.0));
        double trailOffset = targetHeight / 1.2 * (progress > 0.5 ? 1.0 - progress : progress) * (reverse ? -1.0 : 1.0);
        return new TargetEspModule.RingSweepState(targetHeight * progress, (double)var14_8);
    }

    private final boolean isRingStyle() {
        return style.getSelectedIndex() == 2;
    }

    @Override
    public void onDisable() {
        displayTarget = null;
        Vec3d vec3d = Vec3d.ZERO;
        Intrinsics.checkNotNullExpressionValue(vec3d, "ZERO");
        lastTargetPos = vec3d;
        lastTargetHeight = 0.0f;
        lastTargetWidth = 0.0f;
        this.resetAnimations();
        showAnimation.snap(0.0);
    }

    private static final boolean ghostsSize$lambda$0() {
        return INSTANCE.isGhostsStyle();
    }

    private final boolean isGhostsStyle() {
        return style.getSelectedIndex() == 4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isMarkerStyle() {
        if (style.getSelectedIndex() == 0) return true;
        if (style.getSelectedIndex() == 1) return true;
        if (style.getSelectedIndex() != 3) return false;
        return true;
    }

    private static final boolean speedMod$lambda$0() {
        return INSTANCE.isRingStyle();
    }

    /*
     * WARNING - void declaration
     */
    private final void renderRing(Render3DEvent event, VertexConsumerProvider.Immediate consumers, RenderLayer fillLayer, RenderLayer outlineLayer) {
        void var4_4;
        void var2_2;
        PlayerEntity playerEntity = displayTarget;
        if (playerEntity == null) {
            return;
        }
        PlayerEntity target = playerEntity;
        if (!this.isUsableTarget(target)) {
            return;
        }
        float progress = RangesKt.coerceIn(showAnimation.get(), 0.0f, 1.0f);
        if (progress <= 0.0f) {
            return;
        }
        float radius = \u0637\u062b.getWidth((Entity)target) * 0.8f;
        long frameTime = System.currentTimeMillis();
        TargetEspModule.RingSweepState sweepState = this.resolveRingSweep(frameTime, lastTargetHeight);
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
        Vec3d cameraPos = \u0637\u062b.getPos(\u0637\u062b.getCamera(gameRenderer));
        double centerX = \u0638\u0624.lastTargetPos.x - cameraPos.x;
        double centerY = \u0638\u0624.lastTargetPos.y - cameraPos.y;
        double centerZ = \u0638\u0624.lastTargetPos.z - cameraPos.z;
        MatrixStack.Entry entry = event.getMatrices().peek();
        Intrinsics.checkNotNullExpressionValue(entry, "last(...)");
        MatrixStack.Entry entry2 = entry;
        Color[] ringColors = this.resolveRingColors(360);
        VertexConsumer vertexConsumer = consumers.getBuffer(fillLayer);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer, "getBuffer(...)");
        VertexConsumer quadBuffer = vertexConsumer;
        float brightY = (float)(centerY + sweepState.getLeadingEdgeY());
        float fadeY = (float)((double)brightY + sweepState.getTrailOffset());
        for (int segment = 0; segment < 360; ++segment) {
            Vec3d currentPoint = this.ringPoint(segment, 360, radius);
            Vec3d nextPoint = this.ringPoint(segment + 1, 360, radius);
            Color currentColor = ringColors[segment];
            Color nextColor = ringColors[segment + 1];
            this.drawColoredQuad(quadBuffer, entry2, (float)(centerX + currentPoint.x), brightY, (float)(centerZ + currentPoint.z), \u0628\u062d.INSTANCE.setAlpha(currentColor, 0.88f * progress), (float)(centerX + currentPoint.x), fadeY, (float)(centerZ + currentPoint.z), \u0628\u062d.INSTANCE.setAlpha(currentColor, 0.01f * progress), (float)(centerX + nextPoint.x), fadeY, (float)(centerZ + nextPoint.z), \u0628\u062d.INSTANCE.setAlpha(nextColor, 0.01f * progress), (float)(centerX + nextPoint.x), brightY, (float)(centerZ + nextPoint.z), \u0628\u062d.INSTANCE.setAlpha(nextColor, 0.88f * progress));
        }
        VertexConsumerProvider.Immediate $this$draw$iv = consumers;
        RenderLayer layer$iv = fillLayer;
        boolean $i$f$draw = false;
        $this$draw$iv.draw(layer$iv);
        VertexConsumer vertexConsumer2 = consumers.getBuffer(outlineLayer);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer2, "getBuffer(...)");
        VertexConsumer outlineBuffer = vertexConsumer2;
        int segment = 0;
        while (segment < 361) {
            void $this$draw$iv2;
            void var31_34;
            void var30_33;
            VertexConsumer $this$normal$iv;
            Vec3d point = this.ringPoint(segment, 360, radius);
            Color color = \u0628\u062d.INSTANCE.setAlpha(ringColors[segment], 0.16f * progress);
            Intrinsics.checkNotNullExpressionValue(outlineBuffer.vertex(entry2, (float)(centerX + point.x), brightY, (float)(centerZ + point.z)).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()), "setColor(...)");
            MatrixStack.Entry entry$iv = entry2;
            float x$iv = 0.0f;
            float y$iv = 1.0f;
            float z$iv = 0.0f;
            boolean $i$f$normal = false;
            VertexConsumer vertexConsumer3 = $this$normal$iv.normal(entry$iv, x$iv, (float)var30_33, (float)var31_34);
            Intrinsics.checkNotNullExpressionValue(vertexConsumer3, "setNormal(...)");
            vertexConsumer3.lineWidth(1.5f);
            ++$this$draw$iv2;
        }
        void var24_23 = var2_2;
        void var25_27 = var4_4;
        boolean bl = false;
        var24_23.draw((RenderLayer)var25_27);
    }

    private \u0638\u0624() {
        super("TargetESP", \u0638\u0646.getRENDER(), "\u041c\u0435\u0442\u043a\u0430 \u043d\u0430 \u0432\u0430\u0448\u0435\u0439 \u0446\u0435\u043b\u0438");
    }

    private final void drawColoredQuad(VertexConsumer quadBuffer, MatrixStack.Entry entry, float x1, float y1, float z1, Color color1, float x2, float y2, float z2, Color color2, float x3, float y3, float z3, Color color3, float x4, float y4, float z4, Color color4) {
        quadBuffer.vertex(entry, x1, y1, z1).color(color1.getRed(), color1.getGreen(), color1.getBlue(), color1.getAlpha());
        quadBuffer.vertex(entry, x2, y2, z2).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
        quadBuffer.vertex(entry, x3, y3, z3).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
        quadBuffer.vertex(entry, x4, y4, z4).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
    }

    private static final boolean ghostsLength$lambda$0() {
        return INSTANCE.isGhostsStyle();
    }

    static {
        INSTANCE = new \u0638\u0624();
        useClientColor = Module.boolean$default(INSTANCE, "\u0426\u0432\u0435\u0442 \u043a\u043b\u0438\u0435\u043d\u0442\u0430", false, null, 4, null).setVisible(\u0638\u0624::useClientColor$lambda$0);
        espColor = Module.color$default(INSTANCE, "\u0426\u0432\u0435\u0442", new Color(255, 255, 255, 255), null, 4, null).setVisible(\u0638\u0624::espColor$lambda$0);
        String[] stringArray = new String[5];
        stringArray[0] = "\u041a\u0440\u0443\u0433\u043b\u044f\u0448\u043e\u043a";
        stringArray[1] = "\u041a\u0432\u0430\u0434\u0440\u0430\u0442";
        stringArray[2] = "\u041a\u043e\u043b\u044c\u0446\u043e";
        stringArray[3] = "\u0421\u043e\u0432\u0440\u0435\u043c\u0435\u043d\u043d\u044b\u0439";
        stringArray[4] = "\u041f\u0440\u0438\u0437\u0440\u0430\u043a\u0438";
        style = Module.mode$default(INSTANCE, "\u0421\u0442\u0438\u043b\u044c", CollectionsKt.listOf(stringArray), 0, null, 12, null);
        markerSize = INSTANCE.slider("\u0420\u0430\u0437\u043c\u0435\u0440", 0.9f, 0.5f, 1.0f, 0.05f, "markerSize").setVisible(\u0638\u0624::markerSize$lambda$0);
        hitAnimation = Module.boolean$default(INSTANCE, "\u0410\u043d\u0438\u043c\u0430\u0446\u0438\u044f \u0443\u0434\u0430\u0440\u0430", false, null, 4, null).setVisible(\u0638\u0624::hitAnimation$lambda$0);
        speedMod = INSTANCE.slider("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", 1.5f, 0.5f, 2.0f, 0.05f, "ringSpeed").setVisible(\u0638\u0624::speedMod$lambda$0);
        ghostsCount = Module.slider$default(INSTANCE, "\u041a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e", 2.0f, 1.0f, 2.0f, 1.0f, null, 32, null).setVisible(\u0638\u0624::ghostsCount$lambda$0);
        ghostsSize = INSTANCE.slider("\u0420\u0430\u0437\u043c\u0435\u0440", 0.08f, 0.05f, 0.1f, 0.01f, "ghostSize").setVisible(\u0638\u0624::ghostsSize$lambda$0);
        ghostsLength = Module.slider$default(INSTANCE, "\u0414\u043b\u0438\u043d\u0430", 40.0f, 16.0f, 45.0f, 1.0f, null, 32, null).setVisible(\u0638\u0624::ghostsLength$lambda$0);
        ghostsSpeed = INSTANCE.slider("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", 5.0f, 0.2f, 5.0f, 0.05f, "ghostSpeed").setVisible(\u0638\u0624::ghostsSpeed$lambda$0);
        ghostsRadius = Module.slider$default(INSTANCE, "\u0420\u0430\u0434\u0438\u0443\u0441", 0.8f, 0.6f, 1.0f, 0.01f, null, 32, null).setVisible(\u0638\u0624::ghostsRadius$lambda$0);
        ghostsAlpha = Module.slider$default(INSTANCE, "\u041f\u0440\u043e\u0437\u0440\u0430\u0447\u043d\u043e\u0441\u0442\u044c", 60.0f, 5.0f, 80.0f, 1.0f, null, 32, null).setVisible(\u0638\u0624::ghostsAlpha$lambda$0);
        Identifier identifier = Identifier.of((String)"rain", (String)"textures/world/target/marker.png");
        Intrinsics.checkNotNullExpressionValue(identifier, "fromNamespaceAndPath(...)");
        circleTexture = identifier;
        Identifier identifier2 = Identifier.of((String)"rain", (String)"textures/world/target/target.png");
        Intrinsics.checkNotNullExpressionValue(identifier2, "fromNamespaceAndPath(...)");
        diamondTexture = identifier2;
        Identifier identifier3 = Identifier.of((String)"rain", (String)"textures/world/target/modern.png");
        Intrinsics.checkNotNullExpressionValue(identifier3, "fromNamespaceAndPath(...)");
        modernTexture = identifier3;
        Identifier identifier4 = Identifier.of((String)"rain", (String)"textures/world/target/glow.png");
        Intrinsics.checkNotNullExpressionValue(identifier4, "fromNamespaceAndPath(...)");
        ghostsTexture = identifier4;
        showAnimation = new AnimationUtil();
        Vec3d vec3d = Vec3d.ZERO;
        Intrinsics.checkNotNullExpressionValue(vec3d, "ZERO");
        lastTargetPos = vec3d;
        rotation = 1.0f;
        rotationSpeed = 1.0f;
        DAMAGE_RED = new Color(255, 35, 35, 255);
    }

    private final boolean isUsableTarget(PlayerEntity player) {
        return !player.isRemoved() && player.isAlive() && !player.isInvisible();
    }

    private final void updateLegacyAnimation() {
        if (showAnimation.get() > 0.8f) {
            if ((rotation += rotationSpeed) >= 360.0f) {
                rotation -= 360.0f;
                prevRotation -= 360.0f;
            } else if (rotation <= -360.0f) {
                rotation += 360.0f;
                prevRotation += 360.0f;
            }
            if (rotationSpeed > 25.0f) {
                flip = true;
            }
            if (rotationSpeed < -25.0f) {
                flip = false;
            }
        }
        rotationSpeed = (flip ? rotationSpeed - 0.5f : rotationSpeed + 0.5f) * showAnimation.get();
    }

    private static final boolean ghostsCount$lambda$0() {
        return INSTANCE.isGhostsStyle();
    }
}

