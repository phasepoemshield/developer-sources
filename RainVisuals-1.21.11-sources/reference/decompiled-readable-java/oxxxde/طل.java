/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTexture
 *  net.minecraft.client.texture.AbstractTexture
 *  net.minecraft.client.texture.GlTexture
 *  net.minecraft.util.Identifier
 *  org.lwjgl.glfw.GLFW
 */
package oxxxde;

import com.mojang.blaze3d.textures.GpuTexture;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.other.ScrollUtil;
import kotakbaz.rain.client.util.render.display.TextureRectRenderer;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.friend.FriendManager;
import kotakbaz.rain.ui.api.PipelinedRender;
import kotakbaz.rain.ui.menu.FriendsCategoryComponent;
import kotakbaz.rain.ui.menu.misc.AnimatedListTracker;
import kotakbaz.rain.ui.menu.misc.AnimatedTextTransition;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;
import oxxxde.\u0627\u0638;
import oxxxde.\u0628\u062d;
import oxxxde.\u0628\u0641;
import oxxxde.\u062b\u0651;
import oxxxde.\u062b\u0652;
import oxxxde.\u062c\u062a;
import oxxxde.\u062c\u0650;
import oxxxde.\u062d\u062a;
import oxxxde.\u062f\u0647;
import oxxxde.\u062f\u064e;
import oxxxde.\u0630\u0631;
import oxxxde.\u0631\u064e;
import oxxxde.\u0632\u0627;
import oxxxde.\u0633\u0624;
import oxxxde.\u0634\u063a;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0637\u0636;
import oxxxde.\u064b;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bm\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u00bb\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u001f\u0010\u001aJ'\u0010 \u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\b \u0010\u001dJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0003\u00a2\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020$\u00a2\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0003\u00a2\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0003\u00a2\u0006\u0004\b*\u0010)J\r\u0010+\u001a\u00020\u0003\u00a2\u0006\u0004\b+\u0010)JC\u00103\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020,2\u0012\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0.2\u0006\u00102\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b3\u00104JG\u0010:\u001a\u00020\u000f2\u0006\u00105\u001a\u0002002\u0006\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b:\u0010;J'\u0010<\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b<\u0010=J7\u0010C\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020,2\u0006\u0010?\u001a\u00020\r2\u0006\u0010@\u001a\u00020\r2\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020$H\u0002\u00a2\u0006\u0004\bC\u0010DJ'\u0010E\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020,2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\bE\u0010=J\u001f\u0010F\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020,2\u0006\u0010#\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\bH\u0010\u0013J\u000f\u0010I\u001a\u00020$H\u0002\u00a2\u0006\u0004\bI\u0010JJ\u0015\u0010K\u001a\b\u0012\u0004\u0012\u0002000.H\u0002\u00a2\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\rH\u0002\u00a2\u0006\u0004\bP\u0010\u0011J\u000f\u0010Q\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\bQ\u0010\u0013J\u0019\u0010R\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001b\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020$H\u0002\u00a2\u0006\u0004\bT\u0010JJ\u000f\u0010U\u001a\u00020$H\u0002\u00a2\u0006\u0004\bU\u0010JJ\u0017\u0010W\u001a\u00020$2\u0006\u0010V\u001a\u00020\rH\u0002\u00a2\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020$2\u0006\u0010Y\u001a\u00020\rH\u0002\u00a2\u0006\u0004\bZ\u0010XJ'\u0010]\u001a\u00020\r2\u0006\u0010[\u001a\u00020\r2\u0006\u0010\\\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b]\u0010^J7\u0010`\u001a\u00020\u000f2\u0006\u00105\u001a\u0002002\u0006\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u00032\u0006\u0010_\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b`\u0010aJ_\u0010h\u001a\u00020\u000f2\u0006\u0010b\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u00032\u0006\u0010c\u001a\u00020\u00032\u0006\u0010d\u001a\u00020\u00032\u0006\u0010e\u001a\u00020\u00032\u0006\u0010f\u001a\u00020\u00032\u0006\u0010g\u001a\u00020\u00032\u0006\u0010_\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bh\u0010iJ'\u0010k\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0006\u0010j\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bk\u0010lJ'\u0010n\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0006\u0010m\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bn\u0010oJ7\u0010s\u001a\u00020$2\u0006\u0010p\u001a\u00020\u00032\u0006\u0010q\u001a\u00020\u00032\u0006\u0010r\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bs\u0010tJ\u001f\u0010u\u001a\u00020\u00032\u0006\u0010p\u001a\u00020\u00032\u0006\u0010r\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bu\u0010vJ'\u0010x\u001a\u00020\u00032\u0006\u0010p\u001a\u00020\u00032\u0006\u0010r\u001a\u00020\u00032\u0006\u0010w\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bx\u0010yJ\u0017\u0010z\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0002\u00a2\u0006\u0004\bz\u0010{J\u0017\u0010|\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0002\u00a2\u0006\u0004\b|\u0010{J\u0017\u0010}\u001a\u00020\u00032\u0006\u0010-\u001a\u00020,H\u0002\u00a2\u0006\u0004\b}\u0010~J\u0010\u0010\u007f\u001a\u00020,H\u0002\u00a2\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0019\u0010\u0081\u0001\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0002\u00a2\u0006\u0005\b\u0081\u0001\u0010{J#\u0010\u0083\u0001\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0007\u0010\u0082\u0001\u001a\u00020,H\u0002\u00a2\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J*\u0010\u0085\u0001\u001a\u00020$2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0002\u00a2\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J*\u0010\u0087\u0001\u001a\u00020$2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0002\u00a2\u0006\u0006\b\u0087\u0001\u0010\u0086\u0001J*\u0010\u0088\u0001\u001a\u00020$2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0002\u00a2\u0006\u0006\b\u0088\u0001\u0010\u0086\u0001JC\u0010\u0088\u0001\u001a\u00020$2\u0006\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0007\u0010\u0089\u0001\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0002\u00a2\u0006\u0006\b\u0088\u0001\u0010\u008a\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\b\u0004\u0010\u008b\u0001R\u0015\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\b\u0005\u0010\u008b\u0001R\u0017\u0010\u008c\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u008c\u0001\u0010\u008b\u0001R\u0017\u0010\u008d\u0001\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008d\u0001\u0010\u008b\u0001R\u0017\u0010\u008e\u0001\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008e\u0001\u0010\u008b\u0001R\u0017\u0010\u008f\u0001\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008f\u0001\u0010\u008b\u0001R\u0017\u0010\u0090\u0001\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0090\u0001\u0010\u008b\u0001R\u0017\u0010\u0091\u0001\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0091\u0001\u0010\u008b\u0001R\u0017\u0010\u0092\u0001\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0092\u0001\u0010\u008b\u0001R\u0017\u0010\u0093\u0001\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0093\u0001\u0010\u008b\u0001R\u0017\u0010\u0094\u0001\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0094\u0001\u0010\u008b\u0001R\u0017\u0010\u0095\u0001\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0095\u0001\u0010\u008b\u0001R\u0017\u0010\u0096\u0001\u001a\u00020\u00158\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0017\u0010\u0098\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u0098\u0001\u0010\u008b\u0001R\u0017\u0010\u0099\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u0099\u0001\u0010\u008b\u0001R\u0017\u0010\u009a\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u009a\u0001\u0010\u008b\u0001R\u0017\u0010\u009b\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u009b\u0001\u0010\u008b\u0001R\u0017\u0010\u009c\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u009c\u0001\u0010\u008b\u0001R\u0017\u0010\u009d\u0001\u001a\u00020\u00158\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u009d\u0001\u0010\u0097\u0001R7\u0010\u00a1\u0001\u001a\"\u0012\u0004\u0012\u00020\r\u0012\u0005\u0012\u00030\u009f\u00010\u009e\u0001j\u0010\u0012\u0004\u0012\u00020\r\u0012\u0005\u0012\u00030\u009f\u0001`\u00a0\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00a1\u0001\u0010\u00a2\u0001R7\u0010\u00a3\u0001\u001a\"\u0012\u0004\u0012\u00020\r\u0012\u0005\u0012\u00030\u009f\u00010\u009e\u0001j\u0010\u0012\u0004\u0012\u00020\r\u0012\u0005\u0012\u00030\u009f\u0001`\u00a0\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00a3\u0001\u0010\u00a2\u0001R$\u0010\u00a5\u0001\u001a\u000f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002000\u00a4\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00a5\u0001\u0010\u00a6\u0001R\u0018\u0010\u00a7\u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00a7\u0001\u0010\u00a8\u0001R\u0018\u0010\u00a9\u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00a9\u0001\u0010\u00a8\u0001R\u0018\u0010\u00aa\u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00aa\u0001\u0010\u00a8\u0001R\u0018\u0010\u00ab\u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00ab\u0001\u0010\u00a8\u0001R\u0018\u0010\u00ad\u0001\u001a\u00030\u00ac\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00ad\u0001\u0010\u00ae\u0001R%\u0010\u00af\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00af\u0001\u0010\u00b0\u0001R\u001a\u0010\u00b2\u0001\u001a\u00030\u00b1\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00b2\u0001\u0010\u00b3\u0001R\u0019\u0010\u00b4\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00b4\u0001\u0010\u00b5\u0001R\u0019\u0010\u00b6\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00b6\u0001\u0010\u00b5\u0001R\u0019\u0010\u00b7\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00b7\u0001\u0010\u00b8\u0001R\u0019\u0010\u00b9\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00b9\u0001\u0010\u008b\u0001R\u0019\u0010\u00ba\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00ba\u0001\u0010\u008b\u0001\u00a8\u0006\u00bc\u0001"}, d2={"Loxxxde/\u0637\u0644;", "Loxxxde/\u0627\u0638;", "Loxxxde/\u0627\u0633;", "", "panelWidth", "contentTopOffset", "<init>", "(FF)V", "Loxxxde/\u0635\u0624;", "rectPipeline", "()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "textPipeline", "iconsPipeline", "", "query", "", "setSearchQuery", "(Ljava/lang/String;)V", "resetScroll", "()V", "clearInputFocus", "", "mouseX", "mouseY", "partialTicks", "render", "(IIF)V", "button", "onMouseClick", "(III)V", "vertical", "onMouseScroll", "onKeyPress", "scrollWheel", "(F)V", "progress", "", "instant", "setScrollProgress", "(FZ)V", "scrollOffsetValue", "()F", "scrollContentHeight", "scrollViewHeight", "Loxxxde/\u062b\u062d;", "area", "", "Loxxxde/\u062c\u0629;", "Loxxxde/\u0630\u0648;", "visibleFriends", "scrollOffset", "renderList", "(Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;Ljava/util/List;FII)V", "friend", "x", "y", "width", "presence", "renderRow", "(Lkotakbaz/rain/friend/FriendManager$FriendEntry;FFFIIF)V", "renderFooter", "(Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;II)V", "bounds", "value", "placeholder", "icon", "focused", "renderInputBox", "(Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "renderCreateButton", "renderEmptyState", "(Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;F)V", "createFriend", "canAddFriend", "()Z", "filteredFriends", "()Ljava/util/List;", "size", "contentHeight", "(I)F", "appendFriendName", "pasteFriendName", "resolveTypedKey", "(I)Ljava/lang/String;", "isShiftDown", "isControlDown", "keyName", "isAllowedFriendNameKey", "(Ljava/lang/String;)Z", "name", "isValidFriendName", "text", "maxWidth", "trimToWidth", "(Ljava/lang/String;FF)Ljava/lang/String;", "faceAlpha", "renderFriendFace", "(Lkotakbaz/rain/friend/FriendManager$FriendEntry;FFFF)V", "textureId", "round", "u1", "v1", "u2", "v2", "drawSkinHeadPart", "(IFFFFFFFFF)V", "position", "friendCardBounds", "(Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;FF)Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;", "index", "friendCardBoundsAtIndex", "(Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;IF)Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;", "cardX", "cardY", "cardWidth", "isInsideDelete", "(FFFFF)Z", "deleteAreaX", "(FF)F", "iconSize", "deleteIconX", "(FFF)F", "inputBounds", "(Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;)Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;", "createButtonBounds", "inputRowTop", "(Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;)F", "contentArea", "()Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;", "footerArea", "footer", "listArea", "(Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;)Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;", "insideInputBox", "(Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;FF)Z", "insideCreateButton", "inside", "height", "(FFFFFF)Z", "F", "skinTextureSize", "skinUvScale", "headU1", "headV1", "headU2", "headV2", "headOverlayU1", "headOverlayV1", "headOverlayU2", "headOverlayV2", "columns", "I", "rowHeight", "badgeSize", "inputHeight", "footerReservedHeight", "createButtonWidth", "nameFieldMaxLength", "Ljava/util/HashMap;", "Loxxxde/\u0631\u064a;", "Lkotlin/collections/HashMap;", "deleteHoverAnimations", "Ljava/util/HashMap;", "cardHoverAnimations", "Loxxxde/\u062b\u0651;", "listAnimations", "Loxxxde/\u062b\u0651;", "inputFocusAnimation", "Loxxxde/\u0631\u064a;", "createButtonAnimation", "createButtonHoverAnimation", "emptyStateAnimation", "Loxxxde/\u062d\u062a;", "emptyTextTransition", "Loxxxde/\u062d\u062a;", "renderedFriends", "Ljava/util/List;", "Loxxxde/\u0632\u0639;", "scroll", "Loxxxde/\u0632\u0639;", "normalizedSearch", "Ljava/lang/String;", "friendNameText", "inputFocused", "Z", "cachedTotalHeight", "cachedViewHeight", "PanelArea", "rain-visuals"})
public final class \u0637\u0644
extends \u0627\u0638
implements PipelinedRender {
    private final float headOverlayU2;
    private final float rowHeight;
    private final float panelWidth;
    @NotNull
    private String normalizedSearch;
    private boolean inputFocused;
    private float cachedTotalHeight;
    @NotNull
    private final HashMap<String, AnimationUtil> cardHoverAnimations;
    @NotNull
    private final AnimationUtil inputFocusAnimation;
    private final int columns;
    @NotNull
    private List<AnimatedListTracker.Item<FriendManager.FriendEntry>> renderedFriends;
    private float cachedViewHeight;
    private final float footerReservedHeight;
    @NotNull
    private ScrollUtil scroll;
    private final float skinUvScale;
    private final float headV2;
    @NotNull
    private final \u062d\u062a emptyTextTransition;
    private final float headU1;
    @NotNull
    private final AnimationUtil createButtonAnimation;
    private final float headU2;
    private final float badgeSize;
    private final int nameFieldMaxLength;
    private final float inputHeight;
    private final float headV1;
    @NotNull
    private final \u062b\u0651<String, FriendManager.FriendEntry> listAnimations;
    @NotNull
    private final AnimationUtil emptyStateAnimation;
    private final float contentTopOffset;
    @NotNull
    private String friendNameText;
    private final float skinTextureSize;
    private final float headOverlayU1;
    @NotNull
    private final HashMap<String, AnimationUtil> deleteHoverAnimations;
    private final float headOverlayV1;
    @NotNull
    private final AnimationUtil createButtonHoverAnimation;
    private final float createButtonWidth;
    private final float headOverlayV2;

    private final FriendsCategoryComponent.PanelArea friendCardBounds(FriendsCategoryComponent.PanelArea area, float position, float scrollOffset) {
        int lowerIndex = RangesKt.coerceAtLeast((int)Math.floor(position), 0);
        int upperIndex = RangesKt.coerceAtLeast(lowerIndex + 1, lowerIndex);
        float fraction = RangesKt.coerceIn(position - (float)lowerIndex, 0.0f, 1.0f);
        FriendsCategoryComponent.PanelArea lower = this.friendCardBoundsAtIndex(area, lowerIndex, scrollOffset);
        FriendsCategoryComponent.PanelArea upper = this.friendCardBoundsAtIndex(area, upperIndex, scrollOffset);
        return new FriendsCategoryComponent.PanelArea(lower.getLeft() + (upper.getLeft() - lower.getLeft()) * fraction, lower.getTop() + (upper.getTop() - lower.getTop()) * fraction, lower.getWidth() + (upper.getWidth() - lower.getWidth()) * fraction, this.rowHeight);
    }

    private final FriendsCategoryComponent.PanelArea footerArea(FriendsCategoryComponent.PanelArea area) {
        float footerHeight = RangesKt.coerceAtMost(this.footerReservedHeight, area.getHeight());
        return new FriendsCategoryComponent.PanelArea(area.getLeft(), area.getTop() + area.getHeight() - footerHeight, area.getWidth(), footerHeight);
    }

    public final float scrollOffsetValue() {
        return this.scroll.value();
    }

    private final void renderList(FriendsCategoryComponent.PanelArea area, List<AnimatedListTracker.Item<FriendManager.FriendEntry>> visibleFriends, float scrollOffset, int mouseX, int mouseY) {
        block4: {
            block3: {
                if (area.getWidth() <= 0.0f) break block3;
                if (!(area.getHeight() <= 0.0f)) break block4;
            }
            return;
        }
        \u062c\u0650.INSTANCE.start(area.getLeft(), area.getTop(), area.getWidth(), area.getHeight());
        Iterable $this$forEach$iv = visibleFriends;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            AnimatedListTracker.Item animatedFriend = (AnimatedListTracker.Item)element$iv;
            boolean bl = false;
            FriendsCategoryComponent.PanelArea cardBounds = this.friendCardBounds(area, animatedFriend.getPosition(), scrollOffset);
            if (cardBounds.getTop() + this.rowHeight < area.getTop() || cardBounds.getTop() > area.getTop() + area.getHeight()) continue;
            this.renderRow((FriendManager.FriendEntry)animatedFriend.getValue(), cardBounds.getLeft(), cardBounds.getTop() + (1.0f - animatedFriend.getPresence()) * 4.0f, cardBounds.getWidth(), mouseX, mouseY, animatedFriend.getPresence());
        }
        \u062c\u0650.INSTANCE.end();
    }

    private final FriendsCategoryComponent.PanelArea contentArea() {
        float left = this.getX() + this.panelWidth + this.getPadding();
        float right = this.getX() + this.getWidth() - this.panelWidth / 3.0f;
        float top = this.getY() + this.contentTopOffset;
        float areaWidth = RangesKt.coerceAtLeast(right - left, 0.0f);
        float areaHeight = RangesKt.coerceAtLeast(this.getY() + this.getHeight() - top - this.getPadding(), 0.0f);
        return new FriendsCategoryComponent.PanelArea(left, top, areaWidth, areaHeight);
    }

    private final float deleteAreaX(float cardX, float cardWidth) {
        float iconSize = 8.0f;
        float areaSize = 14.0f;
        float iconX = this.deleteIconX(cardX, cardWidth, iconSize);
        return iconX - (areaSize - Font.getWidth$default(this.getIconFont(), "i", iconSize, 0.0f, 4, null)) * 0.5f;
    }

    private final float deleteIconX(float cardX, float cardWidth, float iconSize) {
        return cardX + cardWidth - this.getPadding() * 1.6f - Font.getWidth$default(this.getIconFont(), "i", iconSize, 0.0f, 4, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isShiftDown() {
        long handle = \u0636\u0643.getMc().getWindow().getHandle();
        if (GLFW.glfwGetKey((long)handle, (int)340) == 1) return true;
        if (GLFW.glfwGetKey((long)handle, (int)344) != 1) return false;
        return true;
    }

    private final boolean insideCreateButton(FriendsCategoryComponent.PanelArea area, float mouseX, float mouseY) {
        FriendsCategoryComponent.PanelArea bounds = this.createButtonBounds(area);
        return this.inside(bounds, mouseX, mouseY);
    }

    /*
     * WARNING - void declaration
     */
    private final void renderRow(FriendManager.FriendEntry friend, float x, float y, float width, int mouseX, int mouseY, float presence) {
        void var21_29;
        void var31_39;
        void var33_41;
        void var32_40;
        Object object;
        Object object2;
        void $this$getOrPut$iv;
        String friendName = friend.getName();
        boolean hovered = this.inside(x, y, width, this.rowHeight, mouseX, mouseY);
        boolean deleteHovered = hovered && this.isInsideDelete(x, y, width, mouseX, mouseY);
        Map map = this.deleteHoverAnimations;
        String key$iv = friendName;
        boolean $i$f$getOrPut = false;
        Object value$iv = $this$getOrPut$iv.get(key$iv);
        if (value$iv == null) {
            boolean bl = false;
            AnimationUtil answer$iv = new AnimationUtil(0.0f, 1, null);
            $this$getOrPut$iv.put(key$iv, answer$iv);
            object2 = answer$iv;
        } else {
            object2 = value$iv;
        }
        AnimationUtil deleteHoverAnimation = (AnimationUtil)object2;
        Map $this$getOrPut$iv2 = this.cardHoverAnimations;
        Object key$iv2 = friendName;
        boolean $i$f$getOrPut22 = false;
        Object value$iv2 = $this$getOrPut$iv2.get(key$iv2);
        if (value$iv2 == null) {
            boolean bl = false;
            AnimationUtil answer$iv = new AnimationUtil(0.0f, 1, null);
            $this$getOrPut$iv2.put(key$iv2, answer$iv);
            object = answer$iv;
        } else {
            object = value$iv2;
        }
        AnimationUtil cardHoverAnimation = (AnimationUtil)object;
        key$iv2 = \u0628\u0641.INSTANCE;
        float deleteHover = deleteHoverAnimation.animate(deleteHovered ? 1.0f : 0.0f, 180.0f, new \u062f\u064e((\u0628\u0641)key$iv2));
        \u0628\u0641 $i$f$getOrPut22 = \u0628\u0641.INSTANCE;
        float cardHover = RangesKt.coerceIn(cardHoverAnimation.animate(hovered ? 1.0f : 0.0f, 180.0f, new \u062c\u062a($i$f$getOrPut22)), 0.0f, 1.0f);
        float rowAlpha = this.getAlpha() * presence;
        Color backgroundColor = \u062b\u0652.INSTANCE.surface(rowAlpha * (0.03f + 0.02f * cardHover));
        Color borderColor = \u062b\u0652.INSTANCE.title(rowAlpha * (0.06f + 0.06f * cardHover));
        Color badgeColor = \u062b\u0652.INSTANCE.surface(rowAlpha * (0.08f + 0.025f * cardHover));
        Color titleColor = \u062b\u0652.INSTANCE.title(rowAlpha * 0.84f);
        Color metaColor = \u062b\u0652.INSTANCE.value(rowAlpha * 0.5f);
        Color deleteColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.icon(rowAlpha * (0.28f + 0.18f * deleteHover)), \u062b\u0652.INSTANCE.title(rowAlpha * (0.35f + 0.35f * deleteHover)), deleteHover);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(backgroundColor).round(4.0f).mix(0.95f).border(1.0f, borderColor).draw(x, y, width, this.rowHeight);
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(\u062b\u0652.INSTANCE.title(rowAlpha * 0.72f)).round(0.3f).draw(x + width - this.getPadding() * 1.5f, y + this.getPadding(), 2.5f, 2.5f);
        float badgeX = x + this.getPadding() * 1.3f;
        float badgeY = y + (this.rowHeight - this.badgeSize) * 0.5f;
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(badgeColor).round(4.0f).draw(badgeX, badgeY, this.badgeSize, this.badgeSize);
        this.renderFriendFace(friend, badgeX, badgeY, this.badgeSize, rowAlpha);
        float textX = badgeX + this.badgeSize + this.getPadding() * 1.15f;
        float availableWidth = RangesKt.coerceAtLeast(this.deleteAreaX(x, width) - this.getPadding() * 0.6f - textX, 0.0f);
        float nameSize = 8.0f;
        float metaSize = 5.6f;
        float nameY = y + this.getPadding() * 1.5f;
        float metaY = nameY + this.getDefaultFont().getHeight(nameSize) + this.getPadding() / 1.5f;
        String friendAddedAtText = "\u0414\u043e\u0431\u0430\u0432\u043b\u0435\u043d: " + friend.getAddedAt();
        Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), this.trimToWidth(friendName, availableWidth, nameSize), textX, nameY, nameSize, titleColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), this.trimToWidth(friendAddedAtText, availableWidth, metaSize), textX, metaY, metaSize, metaColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        float deleteIconSize = 6.2f;
        float deleteX = this.deleteIconX(x, width, deleteIconSize);
        float deleteY = y + (this.rowHeight - this.getIconFont().getHeight(deleteIconSize)) * 0.5f - 0.2f;
        Font.drawText$default(this.getIconFont().priority(this.iconsPipeline()), "i", (float)var32_40, (float)var33_41, (float)var31_39, (Color)var21_29, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
    }

    private final boolean isAllowedFriendNameKey(String keyName) {
        boolean bl;
        block1: {
            CharSequence $this$all$iv = keyName;
            boolean $i$f$all = false;
            for (int i = 0; i < $this$all$iv.length(); ++i) {
                char element$iv;
                char it = element$iv = $this$all$iv.charAt(i);
                boolean bl2 = false;
                if (Character.isLetterOrDigit(it) || it == '_') continue;
                bl = false;
                break block1;
            }
            bl = true;
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private final String trimToWidth(String text, float maxWidth, float size) {
        void var4_4;
        if (maxWidth <= 0.0f) {
            return "";
        }
        if (Font.getWidth$default(this.getDefaultFont(), text, size, 0.0f, 4, null) <= maxWidth) {
            return text;
        }
        String candidate = text;
        while (true) {
            boolean bl = ((CharSequence)candidate).length() > 0;
            if (!bl) break;
            if (!(Font.getWidth$default(this.getDefaultFont(), candidate + "...", size, 0.0f, 4, null) > maxWidth)) break;
            candidate = StringsKt.dropLast(candidate, 1);
        }
        return ((CharSequence)candidate).length() == 0 ? "" : (String)var4_4 + "...";
    }

    private final float contentHeight(int size) {
        if (size <= 0) {
            return 0.0f;
        }
        int rows = (size + this.columns - 1) / this.columns;
        return (float)rows * this.rowHeight + (float)(rows + -1) * this.getPadding();
    }

    private final void renderFooter(FriendsCategoryComponent.PanelArea area, int mouseX, int mouseY) {
        block3: {
            block2: {
                if (area.getWidth() <= 0.0f) break block2;
                if (!(area.getHeight() <= 0.0f)) break block3;
            }
            return;
        }
        FriendsCategoryComponent.PanelArea inputBounds = this.inputBounds(area);
        FriendsCategoryComponent.PanelArea createBounds = this.createButtonBounds(area);
        this.renderInputBox(inputBounds, this.friendNameText, "\u041d\u0438\u043a\u043d\u0435\u0439\u043c", "c", this.inputFocused);
        this.renderCreateButton(createBounds, mouseX, mouseY);
    }

    /*
     * WARNING - void declaration
     */
    private final List<FriendManager.FriendEntry> filteredFriends() {
        void var5_5;
        void $this$filterTo$iv$iv;
        List<FriendManager.FriendEntry> friends = \u0634\u063a.INSTANCE.getFriendEntries();
        if (StringsKt.isBlank(this.normalizedSearch)) {
            return friends;
        }
        Iterable $this$filter$iv = friends;
        boolean $i$f$filter = false;
        Iterable iterable = $this$filter$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$filterTo = false;
        for (Object element$iv$iv : $this$filterTo$iv$iv) {
            FriendManager.FriendEntry friend = (FriendManager.FriendEntry)element$iv$iv;
            boolean bl = false;
            String string = friend.getName().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
            if (!StringsKt.contains$default((CharSequence)string, this.normalizedSearch, false, 2, null)) continue;
            destination$iv$iv.add(element$iv$iv);
        }
        return (List)var5_5;
    }

    public final void scrollWheel(float vertical) {
        this.scroll.scroll(vertical * 2.5f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isControlDown() {
        long handle = \u0636\u0643.getMc().getWindow().getHandle();
        if (GLFW.glfwGetKey((long)handle, (int)341) == 1) return true;
        if (GLFW.glfwGetKey((long)handle, (int)345) != 1) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isValidFriendName(String name) {
        if (StringsKt.isBlank(name)) return false;
        boolean bl = true;
        if (!bl) return false;
        if (name.length() > this.nameFieldMaxLength) return false;
        CharSequence $this$all$iv = name;
        boolean $i$f$all = false;
        int n = 0;
        while (n < $this$all$iv.length()) {
            char element$iv;
            char it = element$iv = $this$all$iv.charAt(n);
            boolean bl2 = false;
            if (!Character.isLetterOrDigit(it)) {
                if (it != '_') return false;
            }
            boolean bl3 = true;
            if (!bl3) {
                return false;
            }
            ++n;
        }
        return true;
    }

    private final float inputRowTop(FriendsCategoryComponent.PanelArea area) {
        return area.getTop() + (area.getHeight() - this.inputHeight) * 0.5f;
    }

    private final FriendsCategoryComponent.PanelArea createButtonBounds(FriendsCategoryComponent.PanelArea area) {
        return new FriendsCategoryComponent.PanelArea(area.getLeft() + area.getWidth() - this.createButtonWidth, this.inputRowTop(area), this.createButtonWidth, this.inputHeight);
    }

    private final void renderFriendFace(FriendManager.FriendEntry friend, float x, float y, float size, float faceAlpha) {
        Identifier skinTexture = \u0633\u0624.INSTANCE.resolveTexture(friend);
        AbstractTexture abstractTexture = \u0636\u0643.getMc().getTextureManager().getTexture(skinTexture);
        Intrinsics.checkNotNullExpressionValue(abstractTexture, "getTexture(...)");
        GpuTexture gpuTexture = \u0637\u062b.getGlTextureView(abstractTexture).texture();
        GlTexture glTexture = gpuTexture instanceof GlTexture ? (GlTexture)gpuTexture : null;
        if (glTexture == null) {
            return;
        }
        int textureId = glTexture.getGlId();
        float round = size * 0.22f;
        this.drawSkinHeadPart(textureId, x, y, size, round, this.headU1, this.headV1, this.headU2, this.headV2, faceAlpha);
        this.drawSkinHeadPart(textureId, x, y, size, round, this.headOverlayU1, this.headOverlayV1, this.headOverlayU2, this.headOverlayV2, faceAlpha);
    }

    public final void resetScroll() {
        this.scroll = new ScrollUtil(0.0f, 1, null);
    }

    private final FriendsCategoryComponent.PanelArea friendCardBoundsAtIndex(FriendsCategoryComponent.PanelArea area, int index, float scrollOffset) {
        int rowIndex = index / this.columns;
        int columnIndex = index % this.columns;
        float columnGap = this.getPadding();
        float width = RangesKt.coerceAtLeast((area.getWidth() - columnGap * (float)(this.columns - 1)) / (float)this.columns, 0.0f);
        float x = area.getLeft() + (float)columnIndex * (width + columnGap);
        float y = area.getTop() - scrollOffset + (float)rowIndex * (this.rowHeight + this.getPadding());
        return new FriendsCategoryComponent.PanelArea(x, y, width, this.rowHeight);
    }

    @Override
    public void onKeyPress(int mouseX, int mouseY, int button) {
        super.onKeyPress(mouseX, mouseY, button);
        if (!this.inputFocused) {
            return;
        }
        if (button == 86 && this.isControlDown()) {
            this.pasteFriendName();
            return;
        }
        switch (button) {
            case 257: 
            case 335: {
                this.createFriend();
                return;
            }
            case 259: {
                this.friendNameText = StringsKt.dropLast(this.friendNameText, 1);
                return;
            }
            case 261: {
                this.friendNameText = "";
                return;
            }
        }
        String string = this.resolveTypedKey(button);
        if (string == null) {
            return;
        }
        String keyName = string;
        if (!this.isAllowedFriendNameKey(keyName)) {
            return;
        }
        this.appendFriendName(keyName);
    }

    private final FriendsCategoryComponent.PanelArea listArea(FriendsCategoryComponent.PanelArea area, FriendsCategoryComponent.PanelArea footer) {
        float height = RangesKt.coerceAtLeast(footer.getTop() - area.getTop() - this.getPadding(), 0.0f);
        return new FriendsCategoryComponent.PanelArea(area.getLeft(), area.getTop(), area.getWidth(), height);
    }

    private final void drawSkinHeadPart(int textureId, float x, float y, float size, float round, float u1, float v1, float u2, float v2, float faceAlpha) {
        TextureRectRenderer textureRectRenderer = \u0630\u0631.INSTANCE.getTEXTURE_RECT().priority(this.iconsPipeline()).texture(textureId).pixelated(this.skinTextureSize);
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        textureRectRenderer.draw(x, y, size, size, color, round, 0.0f, u1, v2, u2 - u1, v1 - v2, faceAlpha);
    }

    @Override
    public void onMouseScroll(int mouseX, int mouseY, float vertical) {
        super.onMouseScroll(mouseX, mouseY, vertical);
        FriendsCategoryComponent.PanelArea area = this.contentArea();
        FriendsCategoryComponent.PanelArea footerArea = this.footerArea(area);
        FriendsCategoryComponent.PanelArea listArea = this.listArea(area, footerArea);
        if (!this.inside(listArea, mouseX, mouseY)) {
            return;
        }
        this.scrollWheel(vertical);
    }

    public final void setScrollProgress(float progress, boolean instant) {
        float max = this.scroll.max();
        if (max <= 0.0f) {
            this.scroll.setValue(0.0f).setTargetValue(0.0f);
            return;
        }
        float target = -max * RangesKt.coerceIn(progress, 0.0f, 1.0f);
        this.scroll.setTargetValue(target);
        if (instant) {
            this.scroll.setValue(target);
        }
    }

    public final void clearInputFocus() {
        this.inputFocused = false;
    }

    private final boolean insideInputBox(FriendsCategoryComponent.PanelArea area, float mouseX, float mouseY) {
        FriendsCategoryComponent.PanelArea bounds = this.inputBounds(area);
        return this.inside(bounds, mouseX, mouseY);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void renderInputBox(FriendsCategoryComponent.PanelArea bounds, String value, String placeholder, String icon, boolean focused) {
        void var12_12;
        void var17_17;
        void var24_24;
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        float focus = RangesKt.coerceIn(this.inputFocusAnimation.animate(focused ? 1.0f : 0.0f, 190.0f, new \u0632\u0627(\u0628\u06412)), 0.0f, 1.0f);
        Color backgroundColor = \u062b\u0652.INSTANCE.surface((0.01f + 0.03f * focus) * this.getAlpha());
        Color borderColor = \u062b\u0652.INSTANCE.title((0.07f + 0.04f * focus) * this.getAlpha());
        boolean hasValue = !StringsKt.isBlank(value);
        Color textColor = hasValue ? \u062b\u0652.INSTANCE.title(0.76f * this.getAlpha()) : \u062b\u0652.INSTANCE.value(0.45f * this.getAlpha());
        Color iconColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.icon(0.55f * this.getAlpha()), \u062b\u0652.INSTANCE.title(0.72f * this.getAlpha()), Math.max(focus, hasValue ? 1.0f : 0.0f));
        float textSize = this.inputHeight * 0.27f;
        float iconSize = this.inputHeight * 0.31f;
        float iconX = bounds.getLeft() + this.getPadding() * 1.15f;
        float iconY = bounds.getTop() + (bounds.getHeight() - iconSize) * 0.5f;
        float textX = iconX + Font.getWidth$default(this.getIconFont(), icon, iconSize, 0.0f, 4, null) + 4.0f;
        float textY = bounds.getTop() + (bounds.getHeight() - textSize) * 0.46f;
        String displayText = hasValue ? value : (focused ? " " : placeholder);
        float availableTextWidth = RangesKt.coerceAtLeast(bounds.getWidth() - (textX - bounds.getLeft()) - this.getPadding() * 1.2f, 0.0f);
        String renderedText = this.trimToWidth(displayText, availableTextWidth, textSize);
        Font font = \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.textPipeline());
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(backgroundColor).round(4.0f).border(1.0f, borderColor).draw(bounds.getLeft(), bounds.getTop(), bounds.getWidth(), bounds.getHeight());
        Font.drawText$default(this.getIconFont().priority(this.iconsPipeline()), icon, iconX, iconY, iconSize, iconColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        Font.drawText$default(font, renderedText, textX, textY, textSize, textColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        if (!focused) return;
        if (System.currentTimeMillis() / 450L % 2L != 0L) return;
        boolean bl = true;
        boolean showCaret = bl;
        if (!showCaret) {
            return;
        }
        String caretBase = hasValue ? renderedText : "";
        float caretX = textX + Font.getWidth$default(font, caretBase, textSize, 0.0f, 4, null) + 1.0f;
        Font.drawText$default(font, "|", (float)var24_24, (float)var17_17, (float)var12_12, \u062b\u0652.INSTANCE.title(0.86f * this.getAlpha()), 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
    }

    private final void appendFriendName(String value) {
        boolean bl = ((CharSequence)value).length() == 0;
        if (bl) {
            return;
        }
        if (this.friendNameText.length() >= this.nameFieldMaxLength) {
            return;
        }
        this.friendNameText = StringsKt.take(this.friendNameText + value, this.nameFieldMaxLength);
    }

    @Override
    @NotNull
    public ClientRenderPipeline rectPipeline() {
        return ClientRenderPipeline.GUI_RECT;
    }

    @Override
    @NotNull
    public ClientRenderPipeline iconsPipeline() {
        return ClientRenderPipeline.GUI_SPECIAL;
    }

    /*
     * WARNING - void declaration
     */
    private final void pasteFriendName() {
        void var6_5;
        void $this$filterTo$iv$iv;
        String clipboard;
        String string = GLFW.glfwGetClipboardString((long)\u0636\u0643.getMc().getWindow().getHandle());
        if (string == null) {
            return;
        }
        String $this$filter$iv = clipboard = string;
        boolean $i$f$filter = false;
        CharSequence charSequence = $this$filter$iv;
        Appendable destination$iv$iv = new StringBuilder();
        boolean $i$f$filterTo = false;
        int index$iv$iv = 0;
        int n = $this$filterTo$iv$iv.length();
        while (index$iv$iv < n) {
            void var8_7;
            char element$iv$iv;
            char it = element$iv$iv = $this$filterTo$iv$iv.charAt(index$iv$iv);
            boolean bl = false;
            boolean bl2 = Character.isLetterOrDigit(it) || it == '_';
            if (bl2) {
                destination$iv$iv.append(element$iv$iv);
            }
            ++var8_7;
        }
        String string2 = ((StringBuilder)var6_5).toString();
        this.appendFriendName(string2);
    }

    /*
     * WARNING - void declaration
     */
    private final String resolveTypedKey(int button) {
        String string;
        boolean bl;
        String keyName;
        block6: {
            String string2 = GLFW.glfwGetKeyName((int)button, (int)0);
            if (string2 == null) {
                return null;
            }
            keyName = string2;
            if (!this.isShiftDown()) {
                return keyName;
            }
            if (Intrinsics.areEqual(keyName, "-")) {
                return "_";
            }
            CharSequence $this$all$iv = keyName;
            boolean $i$f$all = false;
            for (int i = 0; i < $this$all$iv.length(); ++i) {
                void var7_7;
                char element$iv;
                char p0 = element$iv = $this$all$iv.charAt(i);
                boolean bl2 = false;
                if (Character.isLetter((char)var7_7)) continue;
                bl = false;
                break block6;
            }
            bl = true;
        }
        if (bl) {
            String string3 = keyName.toUpperCase(Locale.ROOT);
            string = string3;
            Intrinsics.checkNotNullExpressionValue(string3, "toUpperCase(...)");
        } else {
            void var2_2;
            string = var2_2;
        }
        return string;
    }

    private final boolean isInsideDelete(float cardX, float cardY, float cardWidth, float mouseX, float mouseY) {
        float areaSize = 14.0f;
        float areaX = this.deleteAreaX(cardX, cardWidth);
        float areaY = cardY + (this.rowHeight - areaSize) * 0.5f;
        return mouseX >= areaX && mouseX <= areaX + areaSize && mouseY >= areaY && mouseY <= areaY + areaSize;
    }

    private final void createFriend() {
        if (!this.canAddFriend()) {
            return;
        }
        if (\u0634\u063a.INSTANCE.add(((Object)StringsKt.trim((CharSequence)this.friendNameText)).toString()) != FriendManager.AddResult.ADDED) {
            return;
        }
        this.friendNameText = "";
        this.scroll = new ScrollUtil(0.0f, 1, null);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void onMouseClick(int mouseX, int mouseY, int button) {
        super.onMouseClick(mouseX, mouseY, button);
        if (button != 0) {
            return;
        }
        FriendsCategoryComponent.PanelArea area = this.contentArea();
        if (!this.inside(area, mouseX, mouseY)) {
            this.clearInputFocus();
            return;
        }
        FriendsCategoryComponent.PanelArea footerArea = this.footerArea(area);
        if (this.insideInputBox(footerArea, mouseX, mouseY)) {
            this.inputFocused = true;
            return;
        }
        if (this.insideCreateButton(footerArea, mouseX, mouseY)) {
            this.inputFocused = true;
            this.createFriend();
            return;
        }
        FriendsCategoryComponent.PanelArea listArea = this.listArea(area, footerArea);
        if (this.inside(listArea, mouseX, mouseY)) {
            void $this$filterTo$iv$iv;
            Iterable $this$filter$iv = this.renderedFriends;
            boolean $i$f$filter = false;
            Iterable iterable = $this$filter$iv;
            Collection destination$iv$iv = new ArrayList();
            boolean $i$f$filterTo = false;
            for (Object element$iv$iv : $this$filterTo$iv$iv) {
                AnimatedListTracker.Item it = (AnimatedListTracker.Item)element$iv$iv;
                boolean bl = false;
                if (!it.getPresent()) continue;
                destination$iv$iv.add(element$iv$iv);
            }
            Iterable $this$forEach$iv = (List)destination$iv$iv;
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                AnimatedListTracker.Item animatedFriend = (AnimatedListTracker.Item)element$iv;
                boolean bl = false;
                FriendManager.FriendEntry friend = (FriendManager.FriendEntry)animatedFriend.getValue();
                FriendsCategoryComponent.PanelArea cardBounds = this.friendCardBounds(listArea, animatedFriend.getPosition(), this.scroll.value());
                if (!this.inside(cardBounds, mouseX, mouseY)) continue;
                if (!this.isInsideDelete(cardBounds.getLeft(), cardBounds.getTop(), cardBounds.getWidth(), mouseX, mouseY)) continue;
                if (\u0634\u063a.INSTANCE.remove(friend.getName()) == FriendManager.RemoveResult.REMOVED) {
                    void var13_15;
                    this.deleteHoverAnimations.remove(friend.getName());
                    this.cardHoverAnimations.remove(var13_15.getName());
                }
                this.clearInputFocus();
                return;
            }
        }
        this.clearInputFocus();
    }

    public final void setSearchQuery(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        String string = ((Object)StringsKt.trim((CharSequence)query)).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
        String normalized = string;
        if (Intrinsics.areEqual(normalized, this.normalizedSearch)) {
            return;
        }
        this.normalizedSearch = normalized;
        this.scroll = new ScrollUtil(0.0f, 1, null);
    }

    @Override
    @NotNull
    public ClientRenderPipeline textPipeline() {
        return ClientRenderPipeline.GUI_TEXT;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        void var2_2;
        void var1_1;
        super.render(mouseX, mouseY, partialTicks);
        FriendsCategoryComponent.PanelArea area = this.contentArea();
        FriendsCategoryComponent.PanelArea footerArea = this.footerArea(area);
        FriendsCategoryComponent.PanelArea listArea = this.listArea(area, footerArea);
        List<FriendManager.FriendEntry> visibleFriends = this.filteredFriends();
        this.renderedFriends = this.listAnimations.update(visibleFriends, \u0637\u0644::render$lambda$0);
        this.cachedTotalHeight = this.contentHeight(visibleFriends.size());
        this.cachedViewHeight = listArea.getHeight();
        this.scroll.setMax(RangesKt.coerceAtLeast(this.cachedTotalHeight - this.cachedViewHeight, 0.0f));
        this.scroll.update();
        this.renderList(listArea, this.renderedFriends, this.scroll.value(), mouseX, mouseY);
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        float emptyProgress = RangesKt.coerceIn(this.emptyStateAnimation.animate(visibleFriends.isEmpty() ? 1.0f : 0.0f, 190.0f, new \u064b(\u0628\u06412)), 0.0f, 1.0f);
        if (emptyProgress > 0.001f) {
            this.renderEmptyState(listArea, emptyProgress);
        }
        this.renderFooter(footerArea, (int)var1_1, (int)var2_2);
    }

    private static final String render$lambda$0(FriendManager.FriendEntry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String string = it.getName().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
        return string;
    }

    private final boolean canAddFriend() {
        String name = ((Object)StringsKt.trim((CharSequence)this.friendNameText)).toString();
        return this.isValidFriendName(name) && !\u0634\u063a.INSTANCE.isFriend(name);
    }

    private final boolean inside(float x, float y, float width, float height, float mouseX, float mouseY) {
        return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
    }

    /*
     * WARNING - void declaration
     */
    private final void renderCreateButton(FriendsCategoryComponent.PanelArea bounds, int mouseX, int mouseY) {
        void var11_13;
        void var13_15;
        void var16_18;
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        boolean enabled = this.canAddFriend();
        float enabledProgress = RangesKt.coerceIn(this.createButtonAnimation.animate(enabled ? 1.0f : 0.0f, 220.0f, new \u062f\u0647(\u0628\u06412)), 0.0f, 1.0f);
        \u0628\u0641 \u0628\u06413 = \u0628\u0641.INSTANCE;
        float hoverProgress = RangesKt.coerceIn(this.createButtonHoverAnimation.animate(this.inside(bounds, mouseX, mouseY) ? 1.0f : 0.0f, 170.0f, new \u0637\u0636(\u0628\u06413)), 0.0f, 1.0f);
        int uiAlpha = RangesKt.coerceIn((int)(this.getAlpha() * 255.0f), 0, 255);
        int whiteLevel = RangesKt.coerceIn((int)(255.0f - 10.0f * hoverProgress), 0, 255);
        Color backgroundColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.surface((0.01f + 0.025f * hoverProgress) * this.getAlpha()), new Color(whiteLevel, whiteLevel, whiteLevel, uiAlpha), enabledProgress);
        Color borderColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.surface((0.07f + 0.05f * hoverProgress) * this.getAlpha()), new Color(whiteLevel, whiteLevel, whiteLevel, uiAlpha), enabledProgress);
        Color contentColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.value(0.48f * this.getAlpha()), new Color(0, 0, 0, uiAlpha), enabledProgress);
        String text = "\u0414\u043e\u0431\u0430\u0432\u0438\u0442\u044c";
        float textSize = this.inputHeight * 0.27f;
        float textWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), text, textSize, 0.0f, 4, null);
        float textX = bounds.getLeft() + (bounds.getWidth() - textWidth) * 0.5f;
        float textY = bounds.getTop() + (bounds.getHeight() - textSize) * 0.46f;
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(backgroundColor).round(4.0f).border(1.0f, borderColor).draw(bounds.getLeft(), bounds.getTop(), bounds.getWidth(), bounds.getHeight());
        Font.drawText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()), text, textX, (float)var16_18, (float)var13_15, (Color)var11_13, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
    }

    public \u0637\u0644(float panelWidth, float contentTopOffset) {
        this.panelWidth = panelWidth;
        this.contentTopOffset = contentTopOffset;
        this.skinTextureSize = 64.0f;
        this.skinUvScale = 0.015625f;
        this.headU1 = 8.0f * this.skinUvScale;
        this.headV1 = 8.0f * this.skinUvScale;
        this.headU2 = 16.0f * this.skinUvScale;
        this.headV2 = 16.0f * this.skinUvScale;
        this.headOverlayU1 = 40.0f * this.skinUvScale;
        this.headOverlayV1 = 8.0f * this.skinUvScale;
        this.headOverlayU2 = 48.0f * this.skinUvScale;
        this.headOverlayV2 = 16.0f * this.skinUvScale;
        this.columns = 2;
        this.rowHeight = 33.0f;
        this.badgeSize = 18.0f;
        this.inputHeight = 22.0f;
        this.footerReservedHeight = 30.0f;
        this.createButtonWidth = 86.0f;
        this.nameFieldMaxLength = 16;
        this.deleteHoverAnimations = new HashMap();
        this.cardHoverAnimations = new HashMap();
        this.listAnimations = new \u062b\u0651(0.0f, 0.0f, 3, null);
        this.inputFocusAnimation = new AnimationUtil(0.0f, 1, null);
        this.createButtonAnimation = new AnimationUtil(0.0f, 1, null);
        this.createButtonHoverAnimation = new AnimationUtil(0.0f, 1, null);
        this.emptyStateAnimation = new AnimationUtil(0.0f, 1, null);
        this.emptyTextTransition = new \u062d\u062a(0.0f, 0.0f, 3, null);
        this.renderedFriends = CollectionsKt.emptyList();
        this.scroll = new ScrollUtil(0.0f, 1, null);
        this.normalizedSearch = "";
        this.friendNameText = "";
    }

    private final void renderEmptyState(FriendsCategoryComponent.PanelArea area, float progress) {
        String text = StringsKt.isBlank(this.normalizedSearch) ? "\u0421\u043f\u0438\u0441\u043e\u043a \u0434\u0440\u0443\u0437\u0435\u0439 \u043f\u0443\u0441\u0442 >_<" : "\u041d\u0438\u0447\u0435\u0433\u043e \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u043e.";
        float textSize = 11.0f;
        Iterable $this$forEach$iv = this.emptyTextTransition.update(text);
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            AnimatedTextTransition.Layer layer = (AnimatedTextTransition.Layer)element$iv;
            boolean bl = false;
            Font.drawCenteredText$default(this.getDefaultFont().priority(this.textPipeline()), layer.getText(), area.getLeft() + area.getWidth() * 0.5f, area.getTop() + (area.getHeight() - textSize) * 0.46f + layer.getOffsetY(), textSize, \u062b\u0652.INSTANCE.value(this.getAlpha() * 0.5f * progress * layer.getAlpha()), 0.0f, 32, null);
        }
    }

    private final boolean inside(FriendsCategoryComponent.PanelArea area, float mouseX, float mouseY) {
        return this.inside(area.getLeft(), area.getTop(), area.getWidth(), area.getHeight(), mouseX, mouseY);
    }

    private final FriendsCategoryComponent.PanelArea inputBounds(FriendsCategoryComponent.PanelArea area) {
        return new FriendsCategoryComponent.PanelArea(area.getLeft(), this.inputRowTop(area), RangesKt.coerceAtLeast(area.getWidth() - this.createButtonWidth - this.getPadding(), 0.0f), this.inputHeight);
    }

    public final float scrollViewHeight() {
        return this.cachedViewHeight;
    }

    public final float scrollContentHeight() {
        return this.cachedTotalHeight;
    }

    public static /* synthetic */ void setScrollProgress$default(\u0637\u0644 \u0637\u06442, float f, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        \u0637\u06442.setScrollProgress(f, bl);
    }
}

