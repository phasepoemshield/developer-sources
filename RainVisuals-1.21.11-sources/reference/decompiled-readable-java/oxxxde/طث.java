/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.input.Input
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.client.option.Perspective
 *  net.minecraft.client.render.BufferBuilderStorage
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.RenderLayer
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.VertexConsumerProvider$Immediate
 *  net.minecraft.client.texture.AbstractTexture
 *  net.minecraft.client.util.math.MatrixStack$Entry
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.effect.StatusEffect
 *  net.minecraft.entity.effect.StatusEffectInstance
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.fluid.Fluid
 *  net.minecraft.fluid.FluidState
 *  net.minecraft.item.ItemStack
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.registry.tag.TagKey
 *  net.minecraft.scoreboard.AbstractTeam$VisibilityRule
 *  net.minecraft.scoreboard.Scoreboard
 *  net.minecraft.scoreboard.ScoreboardDisplaySlot
 *  net.minecraft.scoreboard.ScoreboardEntry
 *  net.minecraft.scoreboard.ScoreboardObjective
 *  net.minecraft.scoreboard.Team
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.text.MutableText
 *  net.minecraft.text.OrderedText
 *  net.minecraft.text.StringVisitable
 *  net.minecraft.text.Text
 *  net.minecraft.util.Arm
 *  net.minecraft.util.Hand
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.World
 */
package oxxxde;

import com.mojang.blaze3d.textures.GpuTextureView;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.input.Input;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.option.Perspective;
import net.minecraft.client.render.BufferBuilderStorage;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.scoreboard.AbstractTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardEntry;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.scoreboard.Team;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.MutableText;
import net.minecraft.text.OrderedText;
import net.minecraft.text.StringVisitable;
import net.minecraft.text.Text;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=2, xi=48, d1={"\u0000\u00d2\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a,\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0086\b\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a<\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086\b\u00a2\u0006\u0004\b\u000b\u0010\f\u001a,\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086\b\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0014\u001a\u00020\u0005*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0086\b\u00a2\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0019\u001a\u00020\u0018*\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0086\b\u00a2\u0006\u0004\b\u0019\u0010\u001a\u001a\"\u0010\u001e\u001a\u00020\u0012*\u00020\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0086\b\u00a2\u0006\u0004\b\u001e\u0010\u001f\u001a)\u0010\"\u001a\t\u0018\u00010 \u00a2\u0006\u0002\b!*\u00020\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0086\b\u00a2\u0006\u0004\b\"\u0010#\u001a\"\u0010$\u001a\u00020\u0012*\u00020\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0086\b\u00a2\u0006\u0004\b$\u0010\u001f\u001a\u001c\u0010)\u001a\u00020(*\u00020%2\u0006\u0010'\u001a\u00020&H\u0086\b\u00a2\u0006\u0004\b)\u0010*\u001a\u001c\u0010-\u001a\u00020\u0012*\u00020+2\u0006\u0010,\u001a\u00020\u0012H\u0086\b\u00a2\u0006\u0004\b-\u0010.\u001a\u001e\u00102\u001a\u0004\u0018\u00010\u0000*\u00020/2\u0006\u00101\u001a\u000200H\u0086\b\u00a2\u0006\u0004\b2\u00103\u001a\u0014\u00105\u001a\u00020\u0012*\u000204H\u0086\b\u00a2\u0006\u0004\b5\u00106\u001a\u001c\u0010:\u001a\u000200*\u0002072\u0006\u00109\u001a\u000208H\u0086\b\u00a2\u0006\u0004\b:\u0010;\u001a\u001c\u0010:\u001a\u000200*\u0002072\u0006\u00109\u001a\u00020<H\u0086\b\u00a2\u0006\u0004\b:\u0010=\u001a\u001c\u0010:\u001a\u000200*\u0002072\u0006\u00109\u001a\u00020>H\u0086\b\u00a2\u0006\u0004\b:\u0010?\u001a\u0014\u0010A\u001a\u00020\u0005*\u00020@H\u0086\b\u00a2\u0006\u0004\bA\u0010B\u001a\u001c\u0010A\u001a\u00020\u0005*\u00020@2\u0006\u0010D\u001a\u00020CH\u0086\b\u00a2\u0006\u0004\bA\u0010E\u001a\u001c\u0010H\u001a\u00020\u0005*\u00020F2\u0006\u0010G\u001a\u00020\u0018H\u0086\b\u00a2\u0006\u0004\bH\u0010I\u001a\u001c\u0010J\u001a\u00020\r*\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0001H\u0086\b\u00a2\u0006\u0004\bJ\u0010K\u001a,\u0010J\u001a\u00020\r*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0086\b\u00a2\u0006\u0004\bJ\u0010L\u001a,\u0010N\u001a\u00020M*\u00020M2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0086\b\u00a2\u0006\u0004\bN\u0010O\u001a\u001c\u0010N\u001a\u00020M*\u00020M2\u0006\u0010N\u001a\u00020\rH\u0086\b\u00a2\u0006\u0004\bN\u0010P\u001a\u001c\u0010Q\u001a\u00020M*\u00020M2\u0006\u0010\u0013\u001a\u00020\u0001H\u0086\b\u00a2\u0006\u0004\bQ\u0010R\u001a,\u0010Q\u001a\u00020M*\u00020M2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0086\b\u00a2\u0006\u0004\bQ\u0010O\u001a\u0014\u0010S\u001a\u00020\u0012*\u00020 H\u0086\b\u00a2\u0006\u0004\bS\u0010T\u001a\u0014\u0010U\u001a\u00020\u0012*\u00020 H\u0086\b\u00a2\u0006\u0004\bU\u0010T\u001a\"\u0010Z\u001a\u00020\u0012*\u00020V2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0WH\u0086\b\u00a2\u0006\u0004\bZ\u0010[\u001a\u001e\u0010`\u001a\u0004\u0018\u00010_*\u00020\\2\u0006\u0010^\u001a\u00020]H\u0086\b\u00a2\u0006\u0004\b`\u0010a\u001a\"\u0010e\u001a\b\u0012\u0004\u0012\u00020d0c*\u00020\\2\u0006\u0010b\u001a\u00020_H\u0086\b\u00a2\u0006\u0004\be\u0010f\u001a\u001e\u0010i\u001a\u0004\u0018\u00010h*\u00020\\2\u0006\u0010g\u001a\u000208H\u0086\b\u00a2\u0006\u0004\bi\u0010j\u001a\u001e\u0010l\u001a\u0004\u0018\u00010h*\u00020\\2\u0006\u0010k\u001a\u000208H\u0086\b\u00a2\u0006\u0004\bl\u0010j\u001a\u001c\u0010m\u001a\u00020h*\u00020\\2\u0006\u0010k\u001a\u000208H\u0086\b\u00a2\u0006\u0004\bm\u0010j\u001a\u001c\u0010o\u001a\u00020\u0005*\u00020\\2\u0006\u0010n\u001a\u00020hH\u0086\b\u00a2\u0006\u0004\bo\u0010p\u001a$\u0010r\u001a\u00020\u0012*\u00020\\2\u0006\u0010q\u001a\u0002082\u0006\u0010n\u001a\u00020hH\u0086\b\u00a2\u0006\u0004\br\u0010s\u001a\u0014\u0010k\u001a\u00020t*\u00020dH\u0086\b\u00a2\u0006\u0004\bk\u0010u\u001a\u001c\u0010v\u001a\u00020t*\u00020h2\u0006\u0010k\u001a\u00020tH\u0086\b\u00a2\u0006\u0004\bv\u0010w\u001a\u001c\u0010z\u001a\u00020\u0005*\u00020h2\u0006\u0010y\u001a\u00020xH\u0086\b\u00a2\u0006\u0004\bz\u0010{\u001a,\u0010}\u001a\u00020|*\u00020|2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0086\b\u00a2\u0006\u0004\b}\u0010~\u001a6\u0010}\u001a\u00020|*\u00020|2\u0007\u0010\u0080\u0001\u001a\u00020\u007f2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0086\b\u00a2\u0006\u0005\b}\u0010\u0081\u0001\u001a;\u0010\u0086\u0001\u001a\u00020|*\u00020|2\u0007\u0010\u0082\u0001\u001a\u0002002\u0007\u0010\u0083\u0001\u001a\u0002002\u0007\u0010\u0084\u0001\u001a\u0002002\u0007\u0010\u0085\u0001\u001a\u000200H\u0086\b\u00a2\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a \u0010\u0086\u0001\u001a\u00020|*\u00020|2\u0007\u0010\u0086\u0001\u001a\u000200H\u0086\b\u00a2\u0006\u0006\b\u0086\u0001\u0010\u0088\u0001\u001a)\u0010\u008b\u0001\u001a\u00020|*\u00020|2\u0007\u0010\u0089\u0001\u001a\u00020\b2\u0007\u0010\u008a\u0001\u001a\u00020\bH\u0086\b\u00a2\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a8\u0010\u008d\u0001\u001a\u00020|*\u00020|2\u0007\u0010\u0080\u0001\u001a\u00020\u007f2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0086\b\u00a2\u0006\u0006\b\u008d\u0001\u0010\u0081\u0001\u001a.\u0010\u008d\u0001\u001a\u00020|*\u00020|2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0086\b\u00a2\u0006\u0005\b\u008d\u0001\u0010~\u001a)\u0010\u008e\u0001\u001a\u00020|*\u00020|2\u0007\u0010\u0089\u0001\u001a\u0002002\u0007\u0010\u008a\u0001\u001a\u000200H\u0086\b\u00a2\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a)\u0010\u0090\u0001\u001a\u00020|*\u00020|2\u0007\u0010\u0089\u0001\u001a\u0002002\u0007\u0010\u008a\u0001\u001a\u000200H\u0086\b\u00a2\u0006\u0006\b\u0090\u0001\u0010\u008f\u0001\"\u001a\u0010\u0095\u0001\u001a\u00030\u0092\u0001*\u00030\u0091\u00018F\u00a2\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0019\u0010\u0098\u0001\u001a\u00020@*\u00030\u0092\u00018F\u00a2\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u001a\u0010\u009d\u0001\u001a\u00030\u009a\u0001*\u00030\u0099\u00018F\u00a2\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0019\u0010\u00a0\u0001\u001a\u00020\r*\u00030\u009a\u00018F\u00a2\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"0\u0010\u00a7\u0001\u001a\u00030\u00a2\u0001*\u00030\u00a1\u00012\u0007\u0010\u0013\u001a\u00030\u00a2\u00018F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u00a3\u0001\u0010\u00a4\u0001\"\u0006\b\u00a5\u0001\u0010\u00a6\u0001\"\u0018\u0010\u00a0\u0001\u001a\u00020\r*\u00020\u00008F\u00a2\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u00a8\u0001\"-\u0010\u00ac\u0001\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\r8F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u00a9\u0001\u0010\u00a8\u0001\"\u0006\b\u00aa\u0001\u0010\u00ab\u0001\",\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u00ad\u0001\u0010\u00ae\u0001\"\u0006\b\u00af\u0001\u0010\u00b0\u0001\",\u0010\n\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u00b1\u0001\u0010\u00ae\u0001\"\u0006\b\u00b2\u0001\u0010\u00b0\u0001\"\u0017\u0010\u00b3\u0001\u001a\u00020\b*\u00020\u00008F\u00a2\u0006\u0007\u001a\u0005\b:\u0010\u00ae\u0001\"\u0018\u0010\u00b5\u0001\u001a\u00020\b*\u00020\u00008F\u00a2\u0006\b\u001a\u0006\b\u00b4\u0001\u0010\u00ae\u0001\"\u0018\u0010\u00b8\u0001\u001a\u00020%*\u00020\u00008F\u00a2\u0006\b\u001a\u0006\b\u00b6\u0001\u0010\u00b7\u0001\"\u0018\u0010\u00bb\u0001\u001a\u00020\u0012*\u00020\u00008F\u00a2\u0006\b\u001a\u0006\b\u00b9\u0001\u0010\u00ba\u0001\"\u0018\u0010\u00bc\u0001\u001a\u00020\u0012*\u00020\u00118F\u00a2\u0006\b\u001a\u0006\b\u00bc\u0001\u0010\u00bd\u0001\"\u0018\u0010\u00c0\u0001\u001a\u00020\u0018*\u00020\u00118F\u00a2\u0006\b\u001a\u0006\b\u00be\u0001\u0010\u00bf\u0001\"\u0018\u0010\u00c2\u0001\u001a\u00020\u0018*\u00020\u00118F\u00a2\u0006\b\u001a\u0006\b\u00c1\u0001\u0010\u00bf\u0001\"\u0019\u0010\u00c6\u0001\u001a\u00030\u00c3\u0001*\u00020\u00118F\u00a2\u0006\b\u001a\u0006\b\u00c4\u0001\u0010\u00c5\u0001\"-\u0010\u00cb\u0001\u001a\u00020\b*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u00c7\u0001\u0010\u00c8\u0001\"\u0006\b\u00c9\u0001\u0010\u00ca\u0001\"-\u0010\u00ce\u0001\u001a\u00020\b*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u00cc\u0001\u0010\u00c8\u0001\"\u0006\b\u00cd\u0001\u0010\u00ca\u0001\"\u001e\u0010\u00d1\u0001\u001a\b\u0012\u0004\u0012\u00020 0c*\u00020\u00118F\u00a2\u0006\b\u001a\u0006\b\u00cf\u0001\u0010\u00d0\u0001\"\u0018\u0010\u00d4\u0001\u001a\u00020\\*\u00020%8F\u00a2\u0006\b\u001a\u0006\b\u00d2\u0001\u0010\u00d3\u0001\"\u0018\u0010\u00d7\u0001\u001a\u000200*\u00020%8F\u00a2\u0006\b\u001a\u0006\b\u00d5\u0001\u0010\u00d6\u0001\"\u0018\u0010\u00d9\u0001\u001a\u000200*\u00020%8F\u00a2\u0006\b\u001a\u0006\b\u00d8\u0001\u0010\u00d6\u0001\"\u0018\u0010\u00d4\u0001\u001a\u00020\\*\u00020+8F\u00a2\u0006\b\u001a\u0006\b\u00d2\u0001\u0010\u00da\u0001\"\u0018\u0010\u00d4\u0001\u001a\u00020\\*\u00020/8F\u00a2\u0006\b\u001a\u0006\b\u00d2\u0001\u0010\u00db\u0001\"\u0018\u0010\u00de\u0001\u001a\u000200*\u0002078F\u00a2\u0006\b\u001a\u0006\b\u00dc\u0001\u0010\u00dd\u0001\"\u0017\u0010G\u001a\u00020\u0018*\u00020F8F\u00a2\u0006\b\u001a\u0006\b\u00df\u0001\u0010\u00e0\u0001\"\u0017\u0010k\u001a\u00020t*\u00020\u00188F\u00a2\u0006\b\u001a\u0006\b\u00e1\u0001\u0010\u00e2\u0001\"\u0019\u0010\u00a0\u0001\u001a\u00020\r*\u00030\u00e3\u00018F\u00a2\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u00e4\u0001\"\u0018\u0010\u00e7\u0001\u001a\u00020\u0001*\u00020\r8F\u00a2\u0006\b\u001a\u0006\b\u00e5\u0001\u0010\u00e6\u0001\"\u0018\u0010\u00ea\u0001\u001a\u00020\u0001*\u00020M8F\u00a2\u0006\b\u001a\u0006\b\u00e8\u0001\u0010\u00e9\u0001\"\u001e\u0010\u00ed\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b*\u00020 8F\u00a2\u0006\b\u001a\u0006\b\u00eb\u0001\u0010\u00ec\u0001\"\u0018\u0010\u00f0\u0001\u001a\u000208*\u00020 8F\u00a2\u0006\b\u001a\u0006\b\u00ee\u0001\u0010\u00ef\u0001\"\u001a\u0010\u00f5\u0001\u001a\u00030\u00f2\u0001*\u00030\u00f1\u00018F\u00a2\u0006\b\u001a\u0006\b\u00f3\u0001\u0010\u00f4\u0001\"\u0018\u0010\u00f8\u0001\u001a\u00020t*\u00020h8F\u00a2\u0006\b\u001a\u0006\b\u00f6\u0001\u0010\u00f7\u0001\"\u0018\u0010\u00fa\u0001\u001a\u00020t*\u00020h8F\u00a2\u0006\b\u001a\u0006\b\u00f9\u0001\u0010\u00f7\u0001\u00a8\u0006\u00fb\u0001"}, d2={"Lnet/minecraft/class_1297;", "", "x", "y", "z", "", "updatePosition", "(Lnet/minecraft/class_1297;DDD)V", "", "yaw", "pitch", "refreshPositionAndAngles", "(Lnet/minecraft/class_1297;DDDFF)V", "Lnet/minecraft/class_243;", "position", "setLastPositionAndAngles", "(Lnet/minecraft/class_1297;Lnet/minecraft/class_243;FF)V", "Lnet/minecraft/class_1309;", "", "value", "setSneaking", "(Lnet/minecraft/class_1309;Z)V", "Lnet/minecraft/class_1268;", "hand", "Lnet/minecraft/class_1799;", "getStackInHand", "(Lnet/minecraft/class_1309;Lnet/minecraft/class_1268;)Lnet/minecraft/class_1799;", "Lnet/minecraft/class_6880;", "Lnet/minecraft/class_1291;", "effect", "hasStatusEffect", "(Lnet/minecraft/class_1309;Lnet/minecraft/class_6880;)Z", "Lnet/minecraft/class_1293;", "Lorg/jspecify/annotations/Nullable;", "getStatusEffect", "(Lnet/minecraft/class_1309;Lnet/minecraft/class_6880;)Lnet/minecraft/class_1293;", "removeStatusEffect", "Lnet/minecraft/class_1937;", "Lnet/minecraft/class_3959;", "context", "Lnet/minecraft/class_3965;", "raycast", "(Lnet/minecraft/class_1937;Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;", "Lnet/minecraft/class_1657;", "ignoreHunger", "canConsume", "(Lnet/minecraft/class_1657;Z)Z", "Lnet/minecraft/class_638;", "", "id", "getEntityById", "(Lnet/minecraft/class_638;I)Lnet/minecraft/class_1297;", "Lnet/minecraft/class_744;", "hasForwardMovement", "(Lnet/minecraft/class_744;)Z", "Lnet/minecraft/class_327;", "", "text", "getWidth", "(Lnet/minecraft/class_327;Ljava/lang/String;)I", "Lnet/minecraft/class_5348;", "(Lnet/minecraft/class_327;Lnet/minecraft/class_5348;)I", "Lnet/minecraft/class_5481;", "(Lnet/minecraft/class_327;Lnet/minecraft/class_5481;)I", "Lnet/minecraft/class_4597$class_4598;", "draw", "(Lnet/minecraft/class_4597$class_4598;)V", "Lnet/minecraft/class_1921;", "layer", "(Lnet/minecraft/class_4597$class_4598;Lnet/minecraft/class_1921;)V", "Lnet/minecraft/class_1735;", "stack", "setStack", "(Lnet/minecraft/class_1735;Lnet/minecraft/class_1799;)V", "multiply", "(Lnet/minecraft/class_243;D)Lnet/minecraft/class_243;", "(Lnet/minecraft/class_243;DDD)Lnet/minecraft/class_243;", "Lnet/minecraft/class_238;", "offset", "(Lnet/minecraft/class_238;DDD)Lnet/minecraft/class_238;", "(Lnet/minecraft/class_238;Lnet/minecraft/class_243;)Lnet/minecraft/class_238;", "expand", "(Lnet/minecraft/class_238;D)Lnet/minecraft/class_238;", "shouldShowParticles", "(Lnet/minecraft/class_1293;)Z", "shouldShowIcon", "Lnet/minecraft/class_3610;", "Lnet/minecraft/class_6862;", "Lnet/minecraft/class_3611;", "tag", "isIn", "(Lnet/minecraft/class_3610;Lnet/minecraft/class_6862;)Z", "Lnet/minecraft/class_269;", "Lnet/minecraft/class_8646;", "slot", "Lnet/minecraft/class_266;", "getObjectiveForSlot", "(Lnet/minecraft/class_269;Lnet/minecraft/class_8646;)Lnet/minecraft/class_266;", "objective", "", "Lnet/minecraft/class_9011;", "getScoreboardEntries", "(Lnet/minecraft/class_269;Lnet/minecraft/class_266;)Ljava/util/Collection;", "owner", "Lnet/minecraft/class_268;", "getScoreHolderTeam", "(Lnet/minecraft/class_269;Ljava/lang/String;)Lnet/minecraft/class_268;", "name", "getTeam", "addTeam", "team", "removeTeam", "(Lnet/minecraft/class_269;Lnet/minecraft/class_268;)V", "scoreHolder", "addScoreHolderToTeam", "(Lnet/minecraft/class_269;Ljava/lang/String;Lnet/minecraft/class_268;)Z", "Lnet/minecraft/class_2561;", "(Lnet/minecraft/class_9011;)Lnet/minecraft/class_2561;", "decorateName", "(Lnet/minecraft/class_268;Lnet/minecraft/class_2561;)Lnet/minecraft/class_2561;", "Lnet/minecraft/class_270$class_272;", "visibility", "setNameTagVisibilityRule", "(Lnet/minecraft/class_268;Lnet/minecraft/class_270$class_272;)V", "Lnet/minecraft/class_4588;", "vertex", "(Lnet/minecraft/class_4588;FFF)Lnet/minecraft/class_4588;", "Lnet/minecraft/class_4587$class_4665;", "entry", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588;", "red", "green", "blue", "alpha", "color", "(Lnet/minecraft/class_4588;IIII)Lnet/minecraft/class_4588;", "(Lnet/minecraft/class_4588;I)Lnet/minecraft/class_4588;", "u", "v", "texture", "(Lnet/minecraft/class_4588;FF)Lnet/minecraft/class_4588;", "normal", "light", "(Lnet/minecraft/class_4588;II)Lnet/minecraft/class_4588;", "overlay", "Lnet/minecraft/class_310;", "Lnet/minecraft/class_4599;", "getBufferBuilders", "(Lnet/minecraft/class_310;)Lnet/minecraft/class_4599;", "bufferBuilders", "getEntityVertexConsumers", "(Lnet/minecraft/class_4599;)Lnet/minecraft/class_4597$class_4598;", "entityVertexConsumers", "Lnet/minecraft/class_757;", "Lnet/minecraft/class_4184;", "getCamera", "(Lnet/minecraft/class_757;)Lnet/minecraft/class_4184;", "camera", "getPos", "(Lnet/minecraft/class_4184;)Lnet/minecraft/class_243;", "pos", "Lnet/minecraft/class_315;", "Lnet/minecraft/class_5498;", "getPerspective", "(Lnet/minecraft/class_315;)Lnet/minecraft/class_5498;", "setPerspective", "(Lnet/minecraft/class_315;Lnet/minecraft/class_5498;)V", "perspective", "(Lnet/minecraft/class_1297;)Lnet/minecraft/class_243;", "getVelocity", "setVelocity", "(Lnet/minecraft/class_1297;Lnet/minecraft/class_243;)V", "velocity", "getYaw", "(Lnet/minecraft/class_1297;)F", "setYaw", "(Lnet/minecraft/class_1297;F)V", "getPitch", "setPitch", "width", "getHeight", "height", "getLevelView", "(Lnet/minecraft/class_1297;)Lnet/minecraft/class_1937;", "levelView", "getHasNoGravity", "(Lnet/minecraft/class_1297;)Z", "hasNoGravity", "isClimbing", "(Lnet/minecraft/class_1309;)Z", "getMainHandStack", "(Lnet/minecraft/class_1309;)Lnet/minecraft/class_1799;", "mainHandStack", "getOffHandStack", "offHandStack", "Lnet/minecraft/class_1306;", "getMainArm", "(Lnet/minecraft/class_1309;)Lnet/minecraft/class_1306;", "mainArm", "getHeadYaw", "(Lnet/minecraft/class_1309;)F", "setHeadYaw", "(Lnet/minecraft/class_1309;F)V", "headYaw", "getBodyYaw", "setBodyYaw", "bodyYaw", "getStatusEffects", "(Lnet/minecraft/class_1309;)Ljava/util/Collection;", "statusEffects", "getScoreboard", "(Lnet/minecraft/class_1937;)Lnet/minecraft/class_269;", "scoreboard", "getBottomY", "(Lnet/minecraft/class_1937;)I", "bottomY", "getTopYInclusive", "topYInclusive", "(Lnet/minecraft/class_1657;)Lnet/minecraft/class_269;", "(Lnet/minecraft/class_638;)Lnet/minecraft/class_269;", "getFontHeight", "(Lnet/minecraft/class_327;)I", "fontHeight", "getStack", "(Lnet/minecraft/class_1735;)Lnet/minecraft/class_1799;", "getName", "(Lnet/minecraft/class_1799;)Lnet/minecraft/class_2561;", "Lnet/minecraft/class_239;", "(Lnet/minecraft/class_239;)Lnet/minecraft/class_243;", "getLengthSqr", "(Lnet/minecraft/class_243;)D", "lengthSqr", "getLengthY", "(Lnet/minecraft/class_238;)D", "lengthY", "getEffectType", "(Lnet/minecraft/class_1293;)Lnet/minecraft/class_6880;", "effectType", "getTranslationKey", "(Lnet/minecraft/class_1293;)Ljava/lang/String;", "translationKey", "Lnet/minecraft/class_1044;", "Lcom/mojang/blaze3d/textures/GpuTextureView;", "getGlTextureView", "(Lnet/minecraft/class_1044;)Lcom/mojang/blaze3d/textures/GpuTextureView;", "glTextureView", "getPrefix", "(Lnet/minecraft/class_268;)Lnet/minecraft/class_2561;", "prefix", "getSuffix", "suffix", "rain-visuals"})
public final class \u0637\u062b {
    @NotNull
    public static final VertexConsumer light(@NotNull VertexConsumer $this$light, int u, int v) {
        Intrinsics.checkNotNullParameter($this$light, "<this>");
        boolean $i$f$light = false;
        VertexConsumer vertexConsumer = $this$light.light(u, v);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer, "setUv2(...)");
        return vertexConsumer;
    }

    @NotNull
    public static final Vec3d getPos(@NotNull HitResult $this$pos) {
        Intrinsics.checkNotNullParameter($this$pos, "<this>");
        Vec3d vec3d = $this$pos.getPos();
        Intrinsics.checkNotNullExpressionValue(vec3d, "getLocation(...)");
        return vec3d;
    }

    public static final int getWidth(@NotNull TextRenderer $this$getWidth, @NotNull StringVisitable text) {
        Intrinsics.checkNotNullParameter($this$getWidth, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        boolean $i$f$getWidth = false;
        return $this$getWidth.getWidth(text);
    }

    public static final float getHeadYaw(@NotNull LivingEntity $this$headYaw) {
        Intrinsics.checkNotNullParameter($this$headYaw, "<this>");
        return $this$headYaw.getHeadYaw();
    }

    public static final void setSneaking(@NotNull LivingEntity $this$setSneaking, boolean value) {
        Intrinsics.checkNotNullParameter($this$setSneaking, "<this>");
        boolean $i$f$setSneaking = false;
        $this$setSneaking.setSneaking(value);
    }

    @NotNull
    public static final VertexConsumerProvider.Immediate getEntityVertexConsumers(@NotNull BufferBuilderStorage $this$entityVertexConsumers) {
        Intrinsics.checkNotNullParameter($this$entityVertexConsumers, "<this>");
        VertexConsumerProvider.Immediate immediate = $this$entityVertexConsumers.getEntityVertexConsumers();
        Intrinsics.checkNotNullExpressionValue(immediate, "bufferSource(...)");
        return immediate;
    }

    public static final float getWidth(@NotNull Entity $this$width) {
        Intrinsics.checkNotNullParameter($this$width, "<this>");
        return $this$width.getWidth();
    }

    @NotNull
    public static final VertexConsumer overlay(@NotNull VertexConsumer $this$overlay, int u, int v) {
        Intrinsics.checkNotNullParameter($this$overlay, "<this>");
        boolean $i$f$overlay = false;
        VertexConsumer vertexConsumer = $this$overlay.overlay(u, v);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer, "setUv1(...)");
        return vertexConsumer;
    }

    public static final void setVelocity(@NotNull Entity $this$velocity, @NotNull Vec3d value) {
        Intrinsics.checkNotNullParameter($this$velocity, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        $this$velocity.setVelocity(value);
    }

    @NotNull
    public static final GpuTextureView getGlTextureView(@NotNull AbstractTexture $this$glTextureView) {
        Intrinsics.checkNotNullParameter($this$glTextureView, "<this>");
        GpuTextureView gpuTextureView = $this$glTextureView.getGlTextureView();
        Intrinsics.checkNotNullExpressionValue(gpuTextureView, "getTextureView(...)");
        return gpuTextureView;
    }

    @NotNull
    public static final Team addTeam(@NotNull Scoreboard $this$addTeam, @NotNull String name) {
        Intrinsics.checkNotNullParameter($this$addTeam, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        boolean $i$f$addTeam = false;
        Team team = $this$addTeam.addTeam(name);
        Intrinsics.checkNotNullExpressionValue(team, "addPlayerTeam(...)");
        return team;
    }

    @NotNull
    public static final Collection<StatusEffectInstance> getStatusEffects(@NotNull LivingEntity $this$statusEffects) {
        Intrinsics.checkNotNullParameter($this$statusEffects, "<this>");
        Collection collection = $this$statusEffects.getStatusEffects();
        Intrinsics.checkNotNullExpressionValue(collection, "getActiveEffects(...)");
        return collection;
    }

    public static final int getWidth(@NotNull TextRenderer $this$getWidth, @NotNull String text) {
        Intrinsics.checkNotNullParameter($this$getWidth, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        boolean $i$f$getWidth = false;
        return $this$getWidth.getWidth(text);
    }

    public static final boolean addScoreHolderToTeam(@NotNull Scoreboard $this$addScoreHolderToTeam, @NotNull String scoreHolder, @NotNull Team team) {
        Intrinsics.checkNotNullParameter($this$addScoreHolderToTeam, "<this>");
        Intrinsics.checkNotNullParameter(scoreHolder, "scoreHolder");
        Intrinsics.checkNotNullParameter(team, "team");
        boolean $i$f$addScoreHolderToTeam = false;
        return $this$addScoreHolderToTeam.addScoreHolderToTeam(scoreHolder, team);
    }

    public static final void updatePosition(@NotNull Entity $this$updatePosition, double x, double y, double z) {
        Intrinsics.checkNotNullParameter($this$updatePosition, "<this>");
        boolean $i$f$updatePosition = false;
        $this$updatePosition.setPosition(x, y, z);
    }

    public static final void setYaw(@NotNull Entity $this$yaw, float value) {
        Intrinsics.checkNotNullParameter($this$yaw, "<this>");
        $this$yaw.setYaw(value);
    }

    @Nullable
    public static final Team getScoreHolderTeam(@NotNull Scoreboard $this$getScoreHolderTeam, @NotNull String owner) {
        Intrinsics.checkNotNullParameter($this$getScoreHolderTeam, "<this>");
        Intrinsics.checkNotNullParameter(owner, "owner");
        boolean $i$f$getScoreHolderTeam = false;
        return $this$getScoreHolderTeam.getScoreHolderTeam(owner);
    }

    @NotNull
    public static final VertexConsumer color(@NotNull VertexConsumer $this$color, int color) {
        Intrinsics.checkNotNullParameter($this$color, "<this>");
        boolean $i$f$color = false;
        VertexConsumer vertexConsumer = $this$color.color(color);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer, "setColor(...)");
        return vertexConsumer;
    }

    @NotNull
    public static final RegistryEntry<StatusEffect> getEffectType(@NotNull StatusEffectInstance $this$effectType) {
        Intrinsics.checkNotNullParameter($this$effectType, "<this>");
        RegistryEntry registryEntry = $this$effectType.getEffectType();
        Intrinsics.checkNotNullExpressionValue(registryEntry, "getEffect(...)");
        return registryEntry;
    }

    @NotNull
    public static final Vec3d getPos(@NotNull Camera $this$pos) {
        Intrinsics.checkNotNullParameter($this$pos, "<this>");
        Vec3d vec3d = $this$pos.getCameraPos();
        Intrinsics.checkNotNullExpressionValue(vec3d, "position(...)");
        return vec3d;
    }

    @NotNull
    public static final ItemStack getMainHandStack(@NotNull LivingEntity $this$mainHandStack) {
        Intrinsics.checkNotNullParameter($this$mainHandStack, "<this>");
        ItemStack itemStack = $this$mainHandStack.getMainHandStack();
        Intrinsics.checkNotNullExpressionValue(itemStack, "getMainHandItem(...)");
        return itemStack;
    }

    public static final boolean hasForwardMovement(@NotNull Input $this$hasForwardMovement) {
        Intrinsics.checkNotNullParameter($this$hasForwardMovement, "<this>");
        boolean $i$f$hasForwardMovement = false;
        return $this$hasForwardMovement.hasForwardMovement();
    }

    @NotNull
    public static final Perspective getPerspective(@NotNull GameOptions $this$perspective) {
        Intrinsics.checkNotNullParameter($this$perspective, "<this>");
        Perspective perspective = $this$perspective.getPerspective();
        Intrinsics.checkNotNullExpressionValue(perspective, "getCameraType(...)");
        return perspective;
    }

    public static final void setLastPositionAndAngles(@NotNull Entity $this$setLastPositionAndAngles, @NotNull Vec3d position, float yaw, float pitch) {
        Intrinsics.checkNotNullParameter($this$setLastPositionAndAngles, "<this>");
        Intrinsics.checkNotNullParameter(position, "position");
        boolean $i$f$setLastPositionAndAngles = false;
        $this$setLastPositionAndAngles.setLastPositionAndAngles(position, yaw, pitch);
    }

    @NotNull
    public static final Text getName(@NotNull ItemStack $this$name) {
        Intrinsics.checkNotNullParameter($this$name, "<this>");
        Text text = $this$name.getName();
        Intrinsics.checkNotNullExpressionValue(text, "getHoverName(...)");
        return text;
    }

    @NotNull
    public static final Scoreboard getScoreboard(@NotNull ClientWorld $this$scoreboard) {
        Intrinsics.checkNotNullParameter($this$scoreboard, "<this>");
        Scoreboard scoreboard = $this$scoreboard.getScoreboard();
        Intrinsics.checkNotNullExpressionValue(scoreboard, "getScoreboard(...)");
        return scoreboard;
    }

    @Nullable
    public static final ScoreboardObjective getObjectiveForSlot(@NotNull Scoreboard $this$getObjectiveForSlot, @NotNull ScoreboardDisplaySlot slot) {
        Intrinsics.checkNotNullParameter($this$getObjectiveForSlot, "<this>");
        Intrinsics.checkNotNullParameter(slot, "slot");
        boolean $i$f$getObjectiveForSlot = false;
        return $this$getObjectiveForSlot.getObjectiveForSlot(slot);
    }

    public static final float getYaw(@NotNull Entity $this$yaw) {
        Intrinsics.checkNotNullParameter($this$yaw, "<this>");
        return $this$yaw.getYaw();
    }

    @NotNull
    public static final Box expand(@NotNull Box $this$expand, double x, double y, double z) {
        Intrinsics.checkNotNullParameter($this$expand, "<this>");
        boolean $i$f$expand = false;
        Box box = $this$expand.expand(x, y, z);
        Intrinsics.checkNotNullExpressionValue(box, "inflate(...)");
        return box;
    }

    @NotNull
    public static final Arm getMainArm(@NotNull LivingEntity $this$mainArm) {
        Intrinsics.checkNotNullParameter($this$mainArm, "<this>");
        Arm arm = $this$mainArm.getMainArm();
        Intrinsics.checkNotNullExpressionValue(arm, "getMainArm(...)");
        return arm;
    }

    @Nullable
    public static final Entity getEntityById(@NotNull ClientWorld $this$getEntityById, int id) {
        Intrinsics.checkNotNullParameter($this$getEntityById, "<this>");
        boolean $i$f$getEntityById = false;
        return $this$getEntityById.getEntityById(id);
    }

    @NotNull
    public static final Box offset(@NotNull Box $this$offset, @NotNull Vec3d offset) {
        Intrinsics.checkNotNullParameter($this$offset, "<this>");
        Intrinsics.checkNotNullParameter(offset, "offset");
        boolean $i$f$offset = false;
        Box box = $this$offset.offset(offset);
        Intrinsics.checkNotNullExpressionValue(box, "move(...)");
        return box;
    }

    public static final boolean getHasNoGravity(@NotNull Entity $this$hasNoGravity) {
        Intrinsics.checkNotNullParameter($this$hasNoGravity, "<this>");
        return $this$hasNoGravity.hasNoGravity();
    }

    public static final boolean removeStatusEffect(@NotNull LivingEntity $this$removeStatusEffect, @NotNull RegistryEntry<StatusEffect> effect) {
        Intrinsics.checkNotNullParameter($this$removeStatusEffect, "<this>");
        Intrinsics.checkNotNullParameter(effect, "effect");
        boolean $i$f$removeStatusEffect = false;
        return $this$removeStatusEffect.removeStatusEffect(effect);
    }

    @NotNull
    public static final ItemStack getStack(@NotNull Slot $this$stack) {
        Intrinsics.checkNotNullParameter($this$stack, "<this>");
        ItemStack itemStack = $this$stack.getStack();
        Intrinsics.checkNotNullExpressionValue(itemStack, "getItem(...)");
        return itemStack;
    }

    @NotNull
    public static final Text getSuffix(@NotNull Team $this$suffix) {
        Intrinsics.checkNotNullParameter($this$suffix, "<this>");
        Text text = $this$suffix.getSuffix();
        Intrinsics.checkNotNullExpressionValue(text, "getPlayerSuffix(...)");
        return text;
    }

    @NotNull
    public static final String getTranslationKey(@NotNull StatusEffectInstance $this$translationKey) {
        Intrinsics.checkNotNullParameter($this$translationKey, "<this>");
        String string = $this$translationKey.getTranslationKey();
        Intrinsics.checkNotNullExpressionValue(string, "getDescriptionId(...)");
        return string;
    }

    @NotNull
    public static final Vec3d getVelocity(@NotNull Entity $this$velocity) {
        Intrinsics.checkNotNullParameter($this$velocity, "<this>");
        Vec3d vec3d = $this$velocity.getVelocity();
        Intrinsics.checkNotNullExpressionValue(vec3d, "getDeltaMovement(...)");
        return vec3d;
    }

    public static final int getFontHeight(@NotNull TextRenderer $this$fontHeight) {
        Intrinsics.checkNotNullParameter($this$fontHeight, "<this>");
        return $this$fontHeight.fontHeight;
    }

    public static final void setHeadYaw(@NotNull LivingEntity $this$headYaw, float value) {
        Intrinsics.checkNotNullParameter($this$headYaw, "<this>");
        $this$headYaw.setHeadYaw(value);
    }

    public static final boolean isIn(@NotNull FluidState $this$isIn, @NotNull TagKey<Fluid> tag) {
        Intrinsics.checkNotNullParameter($this$isIn, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        boolean $i$f$isIn = false;
        return $this$isIn.isIn(tag);
    }

    @NotNull
    public static final BufferBuilderStorage getBufferBuilders(@NotNull MinecraftClient $this$bufferBuilders) {
        Intrinsics.checkNotNullParameter($this$bufferBuilders, "<this>");
        BufferBuilderStorage bufferBuilderStorage = $this$bufferBuilders.getBufferBuilders();
        Intrinsics.checkNotNullExpressionValue(bufferBuilderStorage, "renderBuffers(...)");
        return bufferBuilderStorage;
    }

    public static final void setStack(@NotNull Slot $this$setStack, @NotNull ItemStack stack) {
        Intrinsics.checkNotNullParameter($this$setStack, "<this>");
        Intrinsics.checkNotNullParameter(stack, "stack");
        boolean $i$f$setStack = false;
        $this$setStack.setStackNoCallbacks(stack);
    }

    public static final void setPitch(@NotNull Entity $this$pitch, float value) {
        Intrinsics.checkNotNullParameter($this$pitch, "<this>");
        $this$pitch.setPitch(value);
    }

    public static final boolean shouldShowParticles(@NotNull StatusEffectInstance $this$shouldShowParticles) {
        Intrinsics.checkNotNullParameter($this$shouldShowParticles, "<this>");
        boolean $i$f$shouldShowParticles = false;
        return $this$shouldShowParticles.shouldShowParticles();
    }

    public static final double getLengthY(@NotNull Box $this$lengthY) {
        Intrinsics.checkNotNullParameter($this$lengthY, "<this>");
        return $this$lengthY.getLengthY();
    }

    @NotNull
    public static final Scoreboard getScoreboard(@NotNull PlayerEntity $this$scoreboard) {
        Intrinsics.checkNotNullParameter($this$scoreboard, "<this>");
        Scoreboard scoreboard = $this$scoreboard.getEntityWorld().getScoreboard();
        Intrinsics.checkNotNullExpressionValue(scoreboard, "getScoreboard(...)");
        return scoreboard;
    }

    @NotNull
    public static final World getLevelView(@NotNull Entity $this$levelView) {
        Intrinsics.checkNotNullParameter($this$levelView, "<this>");
        World world = $this$levelView.getEntityWorld();
        Intrinsics.checkNotNullExpressionValue(world, "level(...)");
        return world;
    }

    @NotNull
    public static final Vec3d multiply(@NotNull Vec3d $this$multiply, double value) {
        Intrinsics.checkNotNullParameter($this$multiply, "<this>");
        boolean $i$f$multiply = false;
        Vec3d vec3d = $this$multiply.multiply(value);
        Intrinsics.checkNotNullExpressionValue(vec3d, "scale(...)");
        return vec3d;
    }

    @NotNull
    public static final ItemStack getStackInHand(@NotNull LivingEntity $this$getStackInHand, @NotNull Hand hand) {
        Intrinsics.checkNotNullParameter($this$getStackInHand, "<this>");
        Intrinsics.checkNotNullParameter(hand, "hand");
        boolean $i$f$getStackInHand = false;
        ItemStack itemStack = $this$getStackInHand.getStackInHand(hand);
        Intrinsics.checkNotNullExpressionValue(itemStack, "getItemInHand(...)");
        return itemStack;
    }

    @NotNull
    public static final Box offset(@NotNull Box $this$offset, double x, double y, double z) {
        Intrinsics.checkNotNullParameter($this$offset, "<this>");
        boolean $i$f$offset = false;
        Box box = $this$offset.offset(x, y, z);
        Intrinsics.checkNotNullExpressionValue(box, "move(...)");
        return box;
    }

    public static final boolean shouldShowIcon(@NotNull StatusEffectInstance $this$shouldShowIcon) {
        Intrinsics.checkNotNullParameter($this$shouldShowIcon, "<this>");
        boolean $i$f$shouldShowIcon = false;
        return $this$shouldShowIcon.shouldShowIcon();
    }

    public static final int getTopYInclusive(@NotNull World $this$topYInclusive) {
        Intrinsics.checkNotNullParameter($this$topYInclusive, "<this>");
        return $this$topYInclusive.getTopYInclusive() - 1;
    }

    public static final void draw(@NotNull VertexConsumerProvider.Immediate $this$draw) {
        Intrinsics.checkNotNullParameter($this$draw, "<this>");
        boolean $i$f$draw = false;
        $this$draw.draw();
    }

    public static final void setBodyYaw(@NotNull LivingEntity $this$bodyYaw, float value) {
        Intrinsics.checkNotNullParameter($this$bodyYaw, "<this>");
        $this$bodyYaw.setBodyYaw(value);
    }

    @NotNull
    public static final Camera getCamera(@NotNull GameRenderer $this$camera) {
        Intrinsics.checkNotNullParameter($this$camera, "<this>");
        Camera camera = $this$camera.getCamera();
        Intrinsics.checkNotNullExpressionValue(camera, "getMainCamera(...)");
        return camera;
    }

    @NotNull
    public static final Vec3d getPos(@NotNull Entity $this$pos) {
        Intrinsics.checkNotNullParameter($this$pos, "<this>");
        Vec3d vec3d = $this$pos.getEntityPos();
        Intrinsics.checkNotNullExpressionValue(vec3d, "position(...)");
        return vec3d;
    }

    @NotNull
    public static final VertexConsumer vertex(@NotNull VertexConsumer $this$vertex, @NotNull MatrixStack.Entry entry, float x, float y, float z) {
        Intrinsics.checkNotNullParameter($this$vertex, "<this>");
        Intrinsics.checkNotNullParameter(entry, "entry");
        boolean $i$f$vertex = false;
        VertexConsumer vertexConsumer = $this$vertex.vertex(entry, x, y, z);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer, "addVertex(...)");
        return vertexConsumer;
    }

    public static final int getWidth(@NotNull TextRenderer $this$getWidth, @NotNull OrderedText text) {
        Intrinsics.checkNotNullParameter($this$getWidth, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        boolean $i$f$getWidth = false;
        return $this$getWidth.getWidth(text);
    }

    @NotNull
    public static final ItemStack getOffHandStack(@NotNull LivingEntity $this$offHandStack) {
        Intrinsics.checkNotNullParameter($this$offHandStack, "<this>");
        ItemStack itemStack = $this$offHandStack.getOffHandStack();
        Intrinsics.checkNotNullExpressionValue(itemStack, "getOffhandItem(...)");
        return itemStack;
    }

    @NotNull
    public static final BlockHitResult raycast(@NotNull World $this$raycast, @NotNull RaycastContext context) {
        Intrinsics.checkNotNullParameter($this$raycast, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        boolean $i$f$raycast = false;
        BlockHitResult blockHitResult = $this$raycast.raycast(context);
        Intrinsics.checkNotNullExpressionValue(blockHitResult, "clip(...)");
        return blockHitResult;
    }

    @NotNull
    public static final Text name(@NotNull ScoreboardEntry $this$name) {
        Intrinsics.checkNotNullParameter($this$name, "<this>");
        boolean $i$f$name = false;
        Text text = $this$name.name();
        Intrinsics.checkNotNullExpressionValue(text, "ownerName(...)");
        return text;
    }

    @NotNull
    public static final VertexConsumer normal(@NotNull VertexConsumer $this$normal, float x, float y, float z) {
        Intrinsics.checkNotNullParameter($this$normal, "<this>");
        boolean $i$f$normal = false;
        VertexConsumer vertexConsumer = $this$normal.normal(x, y, z);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer, "setNormal(...)");
        return vertexConsumer;
    }

    public static final float getBodyYaw(@NotNull LivingEntity $this$bodyYaw) {
        Intrinsics.checkNotNullParameter($this$bodyYaw, "<this>");
        return $this$bodyYaw.bodyYaw;
    }

    public static final float getPitch(@NotNull Entity $this$pitch) {
        Intrinsics.checkNotNullParameter($this$pitch, "<this>");
        return $this$pitch.getPitch();
    }

    public static final boolean hasStatusEffect(@NotNull LivingEntity $this$hasStatusEffect, @NotNull RegistryEntry<StatusEffect> effect) {
        Intrinsics.checkNotNullParameter($this$hasStatusEffect, "<this>");
        Intrinsics.checkNotNullParameter(effect, "effect");
        boolean $i$f$hasStatusEffect = false;
        return $this$hasStatusEffect.hasStatusEffect(effect);
    }

    @NotNull
    public static final Scoreboard getScoreboard(@NotNull World $this$scoreboard) {
        Intrinsics.checkNotNullParameter($this$scoreboard, "<this>");
        Scoreboard scoreboard = $this$scoreboard.getScoreboard();
        Intrinsics.checkNotNullExpressionValue(scoreboard, "getScoreboard(...)");
        return scoreboard;
    }

    @NotNull
    public static final VertexConsumer vertex(@NotNull VertexConsumer $this$vertex, float x, float y, float z) {
        Intrinsics.checkNotNullParameter($this$vertex, "<this>");
        boolean $i$f$vertex = false;
        VertexConsumer vertexConsumer = $this$vertex.vertex(x, y, z);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer, "addVertex(...)");
        return vertexConsumer;
    }

    public static final void refreshPositionAndAngles(@NotNull Entity $this$refreshPositionAndAngles, double x, double y, double z, float yaw, float pitch) {
        Intrinsics.checkNotNullParameter($this$refreshPositionAndAngles, "<this>");
        boolean $i$f$refreshPositionAndAngles = false;
        $this$refreshPositionAndAngles.refreshPositionAndAngles(x, y, z, yaw, pitch);
    }

    @Nullable
    public static final Team getTeam(@NotNull Scoreboard $this$getTeam, @NotNull String name) {
        Intrinsics.checkNotNullParameter($this$getTeam, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        boolean $i$f$getTeam = false;
        return $this$getTeam.getTeam(name);
    }

    public static final boolean isClimbing(@NotNull LivingEntity $this$isClimbing) {
        Intrinsics.checkNotNullParameter($this$isClimbing, "<this>");
        return $this$isClimbing.isClimbing();
    }

    public static final void removeTeam(@NotNull Scoreboard $this$removeTeam, @NotNull Team team) {
        Intrinsics.checkNotNullParameter($this$removeTeam, "<this>");
        Intrinsics.checkNotNullParameter(team, "team");
        boolean $i$f$removeTeam = false;
        $this$removeTeam.removeTeam(team);
    }

    public static final float getHeight(@NotNull Entity $this$height) {
        Intrinsics.checkNotNullParameter($this$height, "<this>");
        return $this$height.getHeight();
    }

    public static final int getBottomY(@NotNull World $this$bottomY) {
        Intrinsics.checkNotNullParameter($this$bottomY, "<this>");
        return $this$bottomY.getBottomY();
    }

    @NotNull
    public static final VertexConsumer normal(@NotNull VertexConsumer $this$normal, @NotNull MatrixStack.Entry entry, float x, float y, float z) {
        Intrinsics.checkNotNullParameter($this$normal, "<this>");
        Intrinsics.checkNotNullParameter(entry, "entry");
        boolean $i$f$normal = false;
        VertexConsumer vertexConsumer = $this$normal.normal(entry, x, y, z);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer, "setNormal(...)");
        return vertexConsumer;
    }

    public static final void setPerspective(@NotNull GameOptions $this$perspective, @NotNull Perspective value) {
        Intrinsics.checkNotNullParameter($this$perspective, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        $this$perspective.setPerspective(value);
    }

    @NotNull
    public static final Text getPrefix(@NotNull Team $this$prefix) {
        Intrinsics.checkNotNullParameter($this$prefix, "<this>");
        Text text = $this$prefix.getPrefix();
        Intrinsics.checkNotNullExpressionValue(text, "getPlayerPrefix(...)");
        return text;
    }

    @NotNull
    public static final VertexConsumer texture(@NotNull VertexConsumer $this$texture, float u, float v) {
        Intrinsics.checkNotNullParameter($this$texture, "<this>");
        boolean $i$f$texture = false;
        VertexConsumer vertexConsumer = $this$texture.texture(u, v);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer, "setUv(...)");
        return vertexConsumer;
    }

    public static final void draw(@NotNull VertexConsumerProvider.Immediate $this$draw, @NotNull RenderLayer layer) {
        Intrinsics.checkNotNullParameter($this$draw, "<this>");
        Intrinsics.checkNotNullParameter(layer, "layer");
        boolean $i$f$draw = false;
        $this$draw.draw(layer);
    }

    public static final boolean canConsume(@NotNull PlayerEntity $this$canConsume, boolean ignoreHunger) {
        Intrinsics.checkNotNullParameter($this$canConsume, "<this>");
        boolean $i$f$canConsume = false;
        return $this$canConsume.canConsume(ignoreHunger);
    }

    @NotNull
    public static final Box expand(@NotNull Box $this$expand, double value) {
        Intrinsics.checkNotNullParameter($this$expand, "<this>");
        boolean $i$f$expand = false;
        Box box = $this$expand.expand(value);
        Intrinsics.checkNotNullExpressionValue(box, "inflate(...)");
        return box;
    }

    @NotNull
    public static final Collection<ScoreboardEntry> getScoreboardEntries(@NotNull Scoreboard $this$getScoreboardEntries, @NotNull ScoreboardObjective objective) {
        Intrinsics.checkNotNullParameter($this$getScoreboardEntries, "<this>");
        Intrinsics.checkNotNullParameter(objective, "objective");
        boolean $i$f$getScoreboardEntries = false;
        Collection collection = $this$getScoreboardEntries.getScoreboardEntries(objective);
        Intrinsics.checkNotNullExpressionValue(collection, "listPlayerScores(...)");
        return collection;
    }

    @NotNull
    public static final VertexConsumer color(@NotNull VertexConsumer $this$color, int red, int green, int blue, int alpha) {
        Intrinsics.checkNotNullParameter($this$color, "<this>");
        boolean $i$f$color = false;
        VertexConsumer vertexConsumer = $this$color.color(red, green, blue, alpha);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer, "setColor(...)");
        return vertexConsumer;
    }

    @NotNull
    public static final Vec3d multiply(@NotNull Vec3d $this$multiply, double x, double y, double z) {
        Intrinsics.checkNotNullParameter($this$multiply, "<this>");
        boolean $i$f$multiply = false;
        Vec3d vec3d = $this$multiply.multiply(new Vec3d(x, y, z));
        Intrinsics.checkNotNullExpressionValue(vec3d, "multiply(...)");
        return vec3d;
    }

    public static final void setNameTagVisibilityRule(@NotNull Team $this$setNameTagVisibilityRule, @NotNull AbstractTeam.VisibilityRule visibility) {
        Intrinsics.checkNotNullParameter($this$setNameTagVisibilityRule, "<this>");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        boolean $i$f$setNameTagVisibilityRule = false;
        $this$setNameTagVisibilityRule.setNameTagVisibilityRule(visibility);
    }

    @NotNull
    public static final Text decorateName(@NotNull Team $this$decorateName, @NotNull Text name) {
        Intrinsics.checkNotNullParameter($this$decorateName, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        boolean $i$f$decorateName = false;
        MutableText mutableText = $this$decorateName.decorateName(name);
        Intrinsics.checkNotNullExpressionValue(mutableText, "getFormattedName(...)");
        return (Text)mutableText;
    }

    public static final double getLengthSqr(@NotNull Vec3d $this$lengthSqr) {
        Intrinsics.checkNotNullParameter($this$lengthSqr, "<this>");
        return $this$lengthSqr.lengthSquared();
    }

    @Nullable
    public static final StatusEffectInstance getStatusEffect(@NotNull LivingEntity $this$getStatusEffect, @NotNull RegistryEntry<StatusEffect> effect) {
        Intrinsics.checkNotNullParameter($this$getStatusEffect, "<this>");
        Intrinsics.checkNotNullParameter(effect, "effect");
        boolean $i$f$getStatusEffect = false;
        return $this$getStatusEffect.getStatusEffect(effect);
    }
}

