/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.menu;

import java.awt.Color;
import java.lang.invoke.LambdaMetafactory;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.ClickGuiSettings;
import kotakbaz.rain.client.extensions.Category;
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.client.render.texture.texture.a;
import kotakbaz.rain.client.sound.RainSoundEvents;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.animations.Easings;
import kotakbaz.rain.client.util.color.ColorUtil;
import kotakbaz.rain.client.util.other.CustomScreen;
import kotakbaz.rain.client.util.render.RenderUtils;
import kotakbaz.rain.client.util.render.TextureLoader;
import kotakbaz.rain.client.util.render.display.BlurredRectRenderer;
import kotakbaz.rain.client.util.render.display.TextureRectRenderer;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.engine.controls.MatrixControl;
import kotakbaz.rain.client.util.render.font.E;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.config.ConfigManager;
import kotakbaz.rain.module.modules.hud.container.HudStyle;
import kotakbaz.rain.ui.api.PipelinedRender;
import kotakbaz.rain.ui.api.UIComponent;
import kotakbaz.rain.ui.menu.CategoryComponent;
import kotakbaz.rain.ui.menu.ConfigsCategoryComponent;
import kotakbaz.rain.ui.menu.EventsCategoryComponent;
import kotakbaz.rain.ui.menu.FriendsCategoryComponent;
import kotakbaz.rain.ui.menu.MenuScreen;
import kotakbaz.rain.ui.menu.MenuStyle;
import kotakbaz.rain.ui.menu.PointsCategoryComponent;
import kotakbaz.rain.ui.menu.SelectCategoryComponent;
import kotakbaz.rain.ui.menu.layout.MenuLayout;
import kotakbaz.rain.ui.menu.misc.TransitionManager;
import kotakbaz.rain.ui.menu.render.MenuBackgroundRenderer;
import kotakbaz.rain.ui.menu.render.MenuScrollBarRenderer;
import kotakbaz.rain.ui.menu.render.MenuTopBarRenderer;
import kotakbaz.rain.ui.menu.settings.BooleanToggleRenderer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector4f;
import org.lwjgl.glfw.GLFW;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00dc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0006\u00ff\u0001\u0080\u0002\u0081\u0002B\t\b\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0010J'\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0013J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b \u0010\u001fJ\u000f\u0010\"\u001a\u00020!H\u0016\u00a2\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020!H\u0016\u00a2\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020!H\u0016\u00a2\u0006\u0004\b%\u0010#J1\u0010(\u001a\u00020\u000e2\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0&2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b+\u0010,J7\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b/\u00100J7\u00107\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b7\u00108JG\u00109\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b9\u0010:JG\u0010;\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b;\u0010:J7\u0010<\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b<\u00108J7\u0010=\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b=\u00108J7\u0010@\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\f2\u0006\u0010>\u001a\u00020\f2\u0006\u0010?\u001a\u00020\f2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b@\u00108J7\u0010C\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\f2\u0006\u0010A\u001a\u00020\f2\u0006\u0010B\u001a\u00020\f2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\fH\u0002\u00a2\u0006\u0004\bC\u00108J/\u0010F\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020D2\u0006\u00105\u001a\u0002042\u0006\u0010\n\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u00a2\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\f2\u0006\u0010H\u001a\u00020DH\u0002\u00a2\u0006\u0004\bI\u0010JJ\u001b\u0010K\u001a\u00020\u000e2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\fH\u0002\u00a2\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\f2\u0006\u0010H\u001a\u00020DH\u0002\u00a2\u0006\u0004\bM\u0010NJ'\u0010Q\u001a\u00020D2\u0006\u0010O\u001a\u00020D2\u0006\u00105\u001a\u0002042\u0006\u0010P\u001a\u00020\tH\u0002\u00a2\u0006\u0004\bQ\u0010RJ\u001f\u0010T\u001a\u00020D2\u0006\u0010S\u001a\u00020D2\u0006\u00105\u001a\u000204H\u0002\u00a2\u0006\u0004\bT\u0010UJ\u001f\u0010V\u001a\u00020D2\u0006\u0010S\u001a\u00020D2\u0006\u00105\u001a\u000204H\u0002\u00a2\u0006\u0004\bV\u0010UJ\u000f\u0010W\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\bW\u0010\bJ/\u0010X\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020D2\u0006\u00105\u001a\u0002042\u0006\u0010\n\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u00a2\u0006\u0004\bX\u0010GJ\u001f\u0010Y\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\f2\u0006\u0010H\u001a\u00020DH\u0002\u00a2\u0006\u0004\bY\u0010JJ\u001b\u0010Z\u001a\u00020\u000e2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\fH\u0002\u00a2\u0006\u0004\bZ\u0010LJ\u001f\u0010[\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\f2\u0006\u0010H\u001a\u00020DH\u0002\u00a2\u0006\u0004\b[\u0010NJ\u001f\u0010\\\u001a\u00020D2\u0006\u0010S\u001a\u00020D2\u0006\u00105\u001a\u000204H\u0002\u00a2\u0006\u0004\b\\\u0010UJ\u001f\u0010]\u001a\u00020D2\u0006\u0010S\u001a\u00020D2\u0006\u00105\u001a\u000204H\u0002\u00a2\u0006\u0004\b]\u0010UJ\u000f\u0010^\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b^\u0010\bJ\u001f\u0010_\u001a\u00020D2\u0006\u0010O\u001a\u00020D2\u0006\u00105\u001a\u000204H\u0002\u00a2\u0006\u0004\b_\u0010UJ\u001f\u0010`\u001a\u00020D2\u0006\u0010O\u001a\u00020D2\u0006\u00105\u001a\u000204H\u0002\u00a2\u0006\u0004\b`\u0010UJ\u0017\u0010a\u001a\u00020\f2\u0006\u00105\u001a\u000204H\u0002\u00a2\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u00020\f2\u0006\u00105\u001a\u000204H\u0002\u00a2\u0006\u0004\bc\u0010bJ\u000f\u0010d\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\bd\u0010\u001cJ)\u0010e\u001a\u00020D2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\f2\b\b\u0002\u00105\u001a\u000204H\u0002\u00a2\u0006\u0004\be\u0010fJ\u001f\u0010g\u001a\u00020D2\u0006\u0010O\u001a\u00020D2\u0006\u00105\u001a\u000204H\u0002\u00a2\u0006\u0004\bg\u0010UJ\u0017\u0010h\u001a\u00020D2\u0006\u0010.\u001a\u00020-H\u0002\u00a2\u0006\u0004\bh\u0010iJ\u0017\u0010j\u001a\u0002042\u0006\u0010\u001d\u001a\u00020\fH\u0002\u00a2\u0006\u0004\bj\u0010kJ\u0015\u0010n\u001a\b\u0012\u0004\u0012\u00020m0lH\u0002\u00a2\u0006\u0004\bn\u0010oJ\u001f\u0010s\u001a\u00020p2\u0006\u0010q\u001a\u00020p2\u0006\u0010r\u001a\u00020\fH\u0002\u00a2\u0006\u0004\bs\u0010tJ\u000f\u0010*\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b*\u0010uJ\u0019\u0010v\u001a\u00020\f2\b\b\u0002\u0010*\u001a\u00020\fH\u0002\u00a2\u0006\u0004\bv\u0010wJ\u0017\u0010x\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0002\u00a2\u0006\u0004\bx\u0010yJ\u0017\u0010z\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0002\u00a2\u0006\u0004\bz\u0010yJ\u0017\u0010{\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b{\u0010yJ\u0017\u0010}\u001a\u00020\u000e2\u0006\u0010|\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b}\u0010~J\u0017\u0010\u007f\u001a\u00020\u000e2\u0006\u0010|\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u007f\u0010~J\u0019\u0010\u0080\u0001\u001a\u00020\u000e2\u0006\u0010|\u001a\u00020\u0005H\u0002\u00a2\u0006\u0005\b\u0080\u0001\u0010~J\u0019\u0010\u0081\u0001\u001a\u00020\u000e2\u0006\u0010|\u001a\u00020\u0005H\u0002\u00a2\u0006\u0005\b\u0081\u0001\u0010~J\u0019\u0010\u0082\u0001\u001a\u00020\u000e2\u0006\u0010|\u001a\u00020\u0005H\u0002\u00a2\u0006\u0005\b\u0082\u0001\u0010~J\u0019\u0010\u0083\u0001\u001a\u00020\u000e2\u0006\u0010|\u001a\u00020\u0005H\u0002\u00a2\u0006\u0005\b\u0083\u0001\u0010~J\u0011\u0010\u0084\u0001\u001a\u00020\u000eH\u0002\u00a2\u0006\u0005\b\u0084\u0001\u0010\u0004J\u0011\u0010\u0085\u0001\u001a\u00020\u000eH\u0002\u00a2\u0006\u0005\b\u0085\u0001\u0010\u0004J\u0011\u0010\u0086\u0001\u001a\u00020\u000eH\u0002\u00a2\u0006\u0005\b\u0086\u0001\u0010\u0004J!\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0087\u00012\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u0001H\u0002\u00a2\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001e\u0010\u008b\u0001\u001a\u00020\u00052\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u0001H\u0002\u00a2\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0019\u0010\u008d\u0001\u001a\u00020\u000e2\u0006\u0010|\u001a\u00020\u0005H\u0002\u00a2\u0006\u0005\b\u008d\u0001\u0010~J\u0011\u0010\u008e\u0001\u001a\u00020\u001aH\u0002\u00a2\u0006\u0005\b\u008e\u0001\u0010\u001cJ\u0011\u0010\u008f\u0001\u001a\u00020\u000eH\u0002\u00a2\u0006\u0005\b\u008f\u0001\u0010\u0004J\u0011\u0010\u0090\u0001\u001a\u00020\u001aH\u0002\u00a2\u0006\u0005\b\u0090\u0001\u0010\u001cJ\u001e\u0010\u0091\u0001\u001a\u00020\u001a2\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u0001H\u0002\u00a2\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u001e\u0010\u0093\u0001\u001a\u00020\u001a2\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u0001H\u0002\u00a2\u0006\u0006\b\u0093\u0001\u0010\u0092\u0001J\u001e\u0010\u0094\u0001\u001a\u00020\u001a2\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u0001H\u0002\u00a2\u0006\u0006\b\u0094\u0001\u0010\u0092\u0001J\u001e\u0010\u0095\u0001\u001a\u00020\u001a2\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u0001H\u0002\u00a2\u0006\u0006\b\u0095\u0001\u0010\u0092\u0001R\u0017\u0010\u0096\u0001\u001a\u00020\f8\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0017\u0010\u0098\u0001\u001a\u00020\f8\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u0098\u0001\u0010\u0097\u0001R\u0017\u0010\u0099\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0017\u0010\u009b\u0001\u001a\u00020\f8\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u009b\u0001\u0010\u0097\u0001R\u0017\u0010\u009c\u0001\u001a\u00020\f8\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u009c\u0001\u0010\u0097\u0001R\u0017\u0010\u009d\u0001\u001a\u00020\f8\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u009d\u0001\u0010\u0097\u0001R\u0017\u0010\u009e\u0001\u001a\u00020\t8\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0017\u0010\u00a0\u0001\u001a\u00020\f8\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00a0\u0001\u0010\u0097\u0001R\u0017\u0010\u00a1\u0001\u001a\u00020\f8\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00a1\u0001\u0010\u0097\u0001R\u0017\u0010\u00a2\u0001\u001a\u00020\t8\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00a2\u0001\u0010\u009f\u0001R\u0017\u0010\u00a3\u0001\u001a\u00020\t8\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00a3\u0001\u0010\u009f\u0001R\u0017\u0010\u00a4\u0001\u001a\u00020\t8\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00a4\u0001\u0010\u009f\u0001R\u0017\u0010\u00a5\u0001\u001a\u00020\t8\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00a5\u0001\u0010\u009f\u0001R\u0017\u0010\u00a6\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00a6\u0001\u0010\u009a\u0001R\u0017\u0010\u00a7\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00a7\u0001\u0010\u009a\u0001R\u0017\u0010\u00a8\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00a8\u0001\u0010\u009a\u0001R\u0017\u0010\u00a9\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00a9\u0001\u0010\u009a\u0001R\u0017\u0010\u00aa\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00aa\u0001\u0010\u009a\u0001R\u0017\u0010\u00ab\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00ab\u0001\u0010\u009a\u0001R\u0017\u0010\u00ac\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00ac\u0001\u0010\u009a\u0001R\u0017\u0010\u00ad\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00ad\u0001\u0010\u009a\u0001R\u0017\u0010\u00ae\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00ae\u0001\u0010\u009a\u0001R\u0017\u0010\u00af\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00af\u0001\u0010\u009a\u0001R\u0017\u0010\u00b0\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00b0\u0001\u0010\u009a\u0001R\u0017\u0010\u00b1\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00b1\u0001\u0010\u009a\u0001R\u0017\u0010\u00b2\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00b2\u0001\u0010\u009a\u0001R\u0017\u0010\u00b3\u0001\u001a\u00020\f8\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u00b3\u0001\u0010\u0097\u0001R\u0017\u0010\u00b4\u0001\u001a\u00020\f8\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u00b4\u0001\u0010\u0097\u0001R\u0017\u0010\u00b5\u0001\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u00b5\u0001\u0010\u009f\u0001R\u0017\u0010\u00b6\u0001\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u00b6\u0001\u0010\u009f\u0001R\u001e\u0010\u00b7\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010l8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00b7\u0001\u0010\u00b8\u0001R\u0016\u0010\u00ba\u0001\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\b\u00b9\u0001\u0010uR\u001f\u0010\u00bc\u0001\u001a\n\u0012\u0005\u0012\u00030\u0087\u00010\u00bb\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00bc\u0001\u0010\u00bd\u0001R\u0019\u0010\u00be\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00be\u0001\u0010\u0097\u0001R\u0017\u0010\u00bf\u0001\u001a\u00020\f8\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u00bf\u0001\u0010\u0097\u0001R\u001e\u0010\u00c1\u0001\u001a\t\u0012\u0005\u0012\u00030\u00c0\u00010l8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00c1\u0001\u0010\u00b8\u0001R&\u0010\u00c4\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u0087\u0001\u0012\u0005\u0012\u00030\u00c3\u00010\u00c2\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00c4\u0001\u0010\u00c5\u0001R\u0018\u0010\u00c7\u0001\u001a\u00030\u00c6\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00c7\u0001\u0010\u00c8\u0001R\u0018\u0010\u00ca\u0001\u001a\u00030\u00c9\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00ca\u0001\u0010\u00cb\u0001R\u0018\u0010\u00cd\u0001\u001a\u00030\u00cc\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00cd\u0001\u0010\u00ce\u0001R\u0018\u0010\u00d0\u0001\u001a\u00030\u00cf\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00d0\u0001\u0010\u00d1\u0001R\u0018\u0010\u00d2\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00d2\u0001\u0010\u00d3\u0001R\u0018\u0010\u00d5\u0001\u001a\u00030\u00d4\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00d5\u0001\u0010\u00d6\u0001R\u0018\u0010\u00d8\u0001\u001a\u00030\u00d7\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00d8\u0001\u0010\u00d9\u0001R\u0018\u0010\u00db\u0001\u001a\u00030\u00da\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00db\u0001\u0010\u00dc\u0001R\u0018\u0010\u00de\u0001\u001a\u00030\u00dd\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00de\u0001\u0010\u00df\u0001R\u0018\u0010\u00e0\u0001\u001a\u00030\u00dd\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00e0\u0001\u0010\u00df\u0001R\u0018\u0010\u00e1\u0001\u001a\u00030\u00dd\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00e1\u0001\u0010\u00df\u0001R\u0018\u0010\u00e2\u0001\u001a\u00030\u00dd\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00e2\u0001\u0010\u00df\u0001R\u0018\u0010\u00e3\u0001\u001a\u00030\u00dd\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00e3\u0001\u0010\u00df\u0001R\u0018\u0010\u00e4\u0001\u001a\u00030\u00dd\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00e4\u0001\u0010\u00df\u0001R\u0018\u0010\u00e5\u0001\u001a\u00030\u00dd\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00e5\u0001\u0010\u00df\u0001R\u0019\u0010\u00e6\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00e6\u0001\u0010\u00e7\u0001R\u0019\u0010\u00e8\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00e8\u0001\u0010\u00e7\u0001R\u0019\u0010\u00e9\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00e9\u0001\u0010\u00e7\u0001R\u001b\u0010\u00ea\u0001\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00ea\u0001\u0010\u00eb\u0001R\u0019\u0010\u00ec\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00ec\u0001\u0010\u00e7\u0001R\u001b\u0010\u00ed\u0001\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00ed\u0001\u0010\u00eb\u0001R\u0019\u0010\u00ee\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00ee\u0001\u0010\u00e7\u0001R\u0019\u0010\u00ef\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00ef\u0001\u0010\u009a\u0001R\u0019\u0010\u00f0\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00f0\u0001\u0010\u009a\u0001R\u0019\u0010\u00f1\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00f1\u0001\u0010\u00e7\u0001R\u0019\u0010\u00f2\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00f2\u0001\u0010\u00e7\u0001R\u001c\u0010\u00f4\u0001\u001a\u0005\u0018\u00010\u00f3\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00f4\u0001\u0010\u00f5\u0001R\u0019\u0010\u00f6\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00f6\u0001\u0010\u00e7\u0001R\u0019\u0010\u00f7\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00f7\u0001\u0010\u0097\u0001R\u0012\u00103\u001a\u00020\f8F\u00a2\u0006\u0007\u001a\u0005\b\u00f8\u0001\u0010uR\u0013\u0010\u00fa\u0001\u001a\u00020\f8F\u00a2\u0006\u0007\u001a\u0005\b\u00f9\u0001\u0010uR\u0013\u0010\u00fc\u0001\u001a\u00020\f8F\u00a2\u0006\u0007\u001a\u0005\b\u00fb\u0001\u0010uR\u0012\u00101\u001a\u00020\f8F\u00a2\u0006\u0007\u001a\u0005\b\u00fd\u0001\u0010uR\u0012\u00102\u001a\u00020\f8F\u00a2\u0006\u0007\u001a\u0005\b\u00fe\u0001\u0010u\u00a8\u0006\u0082\u0002"}, d2={"Lkotakbaz/rain/ui/menu/MenuScreen;", "Lkotakbaz/rain/client/util/other/CustomScreen;", "Lkotakbaz/rain/ui/api/PipelinedRender;", "<init>", "()V", "", "kotlin.jvm.PlatformType", "avatarPopupTitle", "()Ljava/lang/String;", "", "mouseX", "mouseY", "", "partialTicks", "", "render", "(IIF)V", "button", "onMouseClick", "(III)V", "vertical", "onMouseScroll", "onMouseRelease", "onKeyPress", "init", "close", "", "shouldRemove", "()Z", "scale", "unscaleMouseX", "(IF)I", "unscaleMouseY", "Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "rectPipeline", "()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "textPipeline", "iconsPipeline", "Lkotlin/Function2;", "setScrollProgress", "applyScrollBarDrag", "(Lkotlin/jvm/functions/Function2;F)V", "openProgress", "renderBackdrop", "(F)V", "Lkotakbaz/rain/ui/menu/layout/MenuLayout;", "layout", "renderAvatarPopup", "(Lkotakbaz/rain/ui/menu/layout/MenuLayout;FFII)V", "x", "y", "width", "Lkotakbaz/rain/ui/menu/MenuScreen$AvatarPopupMetrics;", "metrics", "alpha", "renderAvatarPopupSettingBackground", "(FFFLkotakbaz/rain/ui/menu/MenuScreen$AvatarPopupMetrics;F)V", "renderAvatarPopupGuiScaleSetting", "(FFFLkotakbaz/rain/ui/menu/MenuScreen$AvatarPopupMetrics;FII)V", "renderAvatarPopupHudScaleSetting", "renderAvatarPopupGuiBackgroundSetting", "renderAvatarPopupInfoSetting", "endX", "startY", "renderAvatarPopupRows", "rowY", "rowHeight", "renderAvatarPopupDivider", "Lkotakbaz/rain/ui/menu/MenuScreen$PopupRect;", "popupBounds", "tryStartAvatarPopupGuiScaleDrag", "(Lkotakbaz/rain/ui/menu/MenuScreen$PopupRect;Lkotakbaz/rain/ui/menu/MenuScreen$AvatarPopupMetrics;FF)Z", "sliderBounds", "updateAvatarPopupGuiScalePreview", "(FLkotakbaz/rain/ui/menu/MenuScreen$PopupRect;)V", "commitAvatarPopupGuiScaleDrag", "(Ljava/lang/Float;)V", "avatarPopupGuiScaleProgress", "(FLkotakbaz/rain/ui/menu/MenuScreen$PopupRect;)F", "bounds", "index", "avatarPopupSettingBounds", "(Lkotakbaz/rain/ui/menu/MenuScreen$PopupRect;Lkotakbaz/rain/ui/menu/MenuScreen$AvatarPopupMetrics;I)Lkotakbaz/rain/ui/menu/MenuScreen$PopupRect;", "cardBounds", "avatarPopupGuiScaleSliderBounds", "(Lkotakbaz/rain/ui/menu/MenuScreen$PopupRect;Lkotakbaz/rain/ui/menu/MenuScreen$AvatarPopupMetrics;)Lkotakbaz/rain/ui/menu/MenuScreen$PopupRect;", "avatarPopupGuiScaleSliderHitBounds", "avatarPopupGuiScaleValueText", "tryStartAvatarPopupHudScaleDrag", "updateAvatarPopupHudScalePreview", "commitAvatarPopupHudScaleDrag", "avatarPopupHudScaleProgress", "avatarPopupHudScaleSliderBounds", "avatarPopupHudScaleSliderHitBounds", "avatarPopupHudScaleValueText", "avatarPopupGuiBackgroundBounds", "avatarPopupInfoActionBounds", "avatarPopupSettingTextYOffset", "(Lkotakbaz/rain/ui/menu/MenuScreen$AvatarPopupMetrics;)F", "avatarPopupContentInset", "isLeftMousePressed", "avatarPopupBounds", "(Lkotakbaz/rain/ui/menu/layout/MenuLayout;FLkotakbaz/rain/ui/menu/MenuScreen$AvatarPopupMetrics;)Lkotakbaz/rain/ui/menu/MenuScreen$PopupRect;", "avatarPopupCloseBounds", "avatarBounds", "(Lkotakbaz/rain/ui/menu/layout/MenuLayout;)Lkotakbaz/rain/ui/menu/MenuScreen$PopupRect;", "avatarPopupMetrics", "(F)Lkotakbaz/rain/ui/menu/MenuScreen$AvatarPopupMetrics;", "", "Lkotakbaz/rain/ui/menu/MenuScreen$AvatarPopupRow;", "avatarPopupRows", "()Ljava/util/List;", "Ljava/awt/Color;", "color", "factor", "hudAlpha", "(Ljava/awt/Color;F)Ljava/awt/Color;", "()F", "currentScale", "(F)F", "handleSearchInput", "(I)V", "handleModuleSearchInput", "handleConfigInput", "value", "appendModuleSearch", "(Ljava/lang/String;)V", "appendConfigName", "commitModuleSearch", "commitConfigName", "updateModuleSearchText", "updateConfigNameText", "createConfigFromInput", "openConfigFolder", "openRainVisualsSite", "Lkotakbaz/rain/client/extensions/Category;", "category", "currentTopBarCategory", "(Lkotakbaz/rain/client/extensions/Category;)Lkotakbaz/rain/client/extensions/Category;", "currentTopBarText", "(Lkotakbaz/rain/client/extensions/Category;)Ljava/lang/String;", "selectTopBarText", "isCtrlDown", "clearCategoryInputFocus", "canCreateConfig", "isConfigCategory", "(Lkotakbaz/rain/client/extensions/Category;)Z", "isEventsCategory", "isPointsCategory", "isFriendsCategory", "OPEN_ANIMATION_DURATION", "F", "OPEN_START_SCALE", "AVATAR_POPUP_CLOSE_ICON", "Ljava/lang/String;", "AVATAR_POPUP_MARGIN", "AVATAR_POPUP_HEADER_TEXT_SIZE", "AVATAR_POPUP_ROW_TEXT_SIZE", "AVATAR_POPUP_SETTING_COUNT", "I", "AVATAR_POPUP_SETTING_HEIGHT", "AVATAR_POPUP_BOOLEAN_HEIGHT", "AVATAR_POPUP_GUI_SCALE_INDEX", "AVATAR_POPUP_HUD_SCALE_INDEX", "AVATAR_POPUP_GUI_BACKGROUND_INDEX", "AVATAR_POPUP_INFO_INDEX", "AVATAR_POPUP_GUI_SCALE_ICON", "AVATAR_POPUP_GUI_SCALE_LABEL", "AVATAR_POPUP_GUI_SCALE_MAX_VALUE_TEXT", "AVATAR_POPUP_HUD_SCALE_ICON", "AVATAR_POPUP_HUD_SCALE_LABEL", "AVATAR_POPUP_HUD_SCALE_MAX_VALUE_TEXT", "AVATAR_POPUP_GUI_BACKGROUND_ICON", "AVATAR_POPUP_GUI_BACKGROUND_LABEL", "AVATAR_POPUP_INFO_ICON", "AVATAR_POPUP_INFO_LABEL", "AVATAR_POPUP_INFO_VALUE", "AVATAR_POPUP_INFO_ACTION_ICON", "AVATAR_POPUP_INFO_URL", "uiPadding", "topBarHeight", "maxModuleSearchLength", "maxConfigNameLength", "menuCategories", "Ljava/util/List;", "getModuleStartOffset", "moduleStartOffset", "Lkotakbaz/rain/ui/menu/misc/TransitionManager;", "categoryTransition", "Lkotakbaz/rain/ui/menu/misc/TransitionManager;", "categoryContentAlpha", "categoryShiftDistance", "Lkotakbaz/rain/ui/menu/SelectCategoryComponent;", "components", "", "Lkotakbaz/rain/ui/menu/CategoryComponent;", "categoryComponents", "Ljava/util/Map;", "Lkotakbaz/rain/ui/menu/ConfigsCategoryComponent;", "configsCategoryComponent", "Lkotakbaz/rain/ui/menu/ConfigsCategoryComponent;", "Lkotakbaz/rain/ui/menu/EventsCategoryComponent;", "eventsCategoryComponent", "Lkotakbaz/rain/ui/menu/EventsCategoryComponent;", "Lkotakbaz/rain/ui/menu/PointsCategoryComponent;", "pointsCategoryComponent", "Lkotakbaz/rain/ui/menu/PointsCategoryComponent;", "Lkotakbaz/rain/ui/menu/FriendsCategoryComponent;", "friendsCategoryComponent", "Lkotakbaz/rain/ui/menu/FriendsCategoryComponent;", "pointsSettingsCategory", "Lkotakbaz/rain/client/extensions/Category;", "Lkotakbaz/rain/ui/menu/render/MenuBackgroundRenderer;", "backgroundRenderer", "Lkotakbaz/rain/ui/menu/render/MenuBackgroundRenderer;", "Lkotakbaz/rain/ui/menu/render/MenuTopBarRenderer;", "topBarRenderer", "Lkotakbaz/rain/ui/menu/render/MenuTopBarRenderer;", "Lkotakbaz/rain/ui/menu/render/MenuScrollBarRenderer;", "scrollBarRenderer", "Lkotakbaz/rain/ui/menu/render/MenuScrollBarRenderer;", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "categoryIndicatorYAnim", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "openAnimation", "avatarPopupAnimation", "avatarPopupCloseHoverAnimation", "avatarPopupGuiScaleAnimation", "avatarPopupHudScaleAnimation", "avatarPopupGuiBackgroundAnimation", "categoryIndicatorInitialized", "Z", "avatarPopupOpen", "draggingAvatarPopupGuiScale", "avatarPopupGuiScaleDragProgress", "Ljava/lang/Float;", "draggingAvatarPopupHudScale", "avatarPopupHudScaleDragProgress", "closing", "moduleSearchText", "configNameText", "searchFocused", "topBarTextSelected", "Lkotakbaz/rain/ui/menu/render/MenuScrollBarRenderer$State;", "scrollBarState", "Lkotakbaz/rain/ui/menu/render/MenuScrollBarRenderer$State;", "draggingScrollBar", "scrollBarGrabOffset", "getWidth", "getHeight", "height", "getPanelWidth", "panelWidth", "getX", "getY", "AvatarPopupRow", "AvatarPopupMetrics", "PopupRect", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nMenuScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuScreen.kt\nkotakbaz/rain/ui/menu/MenuScreen\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1751:1\n1#2:1752\n363#3,7:1753\n1924#3,3:1760\n1915#3,2:1763\n1915#3,2:1765\n777#3:1767\n873#3,2:1768\n1586#3:1770\n1661#3,3:1771\n777#3:1774\n873#3,2:1775\n1300#3,2:1777\n1315#3,4:1779\n*S KotlinDebug\n*F\n+ 1 MenuScreen.kt\nkotakbaz/rain/ui/menu/MenuScreen\n*L\n154#1:1753,7\n181#1:1760,3\n435#1:1763,2\n1642#1:1765,2\n74#1:1767\n74#1:1768,2\n82#1:1770\n82#1:1771,3\n86#1:1774\n86#1:1775,2\n87#1:1777,2\n87#1:1779,4\n*E\n"})
public final class MenuScreen
extends CustomScreen
implements PipelinedRender {
    @NotNull
    public static final MenuScreen INSTANCE;
    private static final float OPEN_ANIMATION_DURATION = 220.0f;
    private static final float OPEN_START_SCALE = 0.92f;
    @NotNull
    private static final String AVATAR_POPUP_CLOSE_ICON = "i";
    private static final float AVATAR_POPUP_MARGIN = 6.0f;
    private static final float AVATAR_POPUP_HEADER_TEXT_SIZE = 9.0f;
    private static final float AVATAR_POPUP_ROW_TEXT_SIZE = 7.0f;
    private static final int AVATAR_POPUP_SETTING_COUNT = 4;
    private static final float AVATAR_POPUP_SETTING_HEIGHT = 18.0f;
    private static final float AVATAR_POPUP_BOOLEAN_HEIGHT = 15.0f;
    private static final int AVATAR_POPUP_GUI_SCALE_INDEX = 0;
    private static final int AVATAR_POPUP_HUD_SCALE_INDEX = 1;
    private static final int AVATAR_POPUP_GUI_BACKGROUND_INDEX = 2;
    private static final int AVATAR_POPUP_INFO_INDEX = 3;
    @NotNull
    private static final String AVATAR_POPUP_GUI_SCALE_ICON = "F";
    @NotNull
    private static final String AVATAR_POPUP_GUI_SCALE_LABEL = "\u0420\u0430\u0437\u043c\u0435\u0440 \u0433\u0443\u0438";
    @NotNull
    private static final String AVATAR_POPUP_GUI_SCALE_MAX_VALUE_TEXT = "150%";
    @NotNull
    private static final String AVATAR_POPUP_HUD_SCALE_ICON = "G";
    @NotNull
    private static final String AVATAR_POPUP_HUD_SCALE_LABEL = "\u0420\u0430\u0437\u043c\u0435\u0440 \u0445\u0443\u0434\u0430";
    @NotNull
    private static final String AVATAR_POPUP_HUD_SCALE_MAX_VALUE_TEXT = "200%";
    @NotNull
    private static final String AVATAR_POPUP_GUI_BACKGROUND_ICON = "f";
    @NotNull
    private static final String AVATAR_POPUP_GUI_BACKGROUND_LABEL = "\u0424\u043e\u043d \u0433\u0443\u0438";
    @NotNull
    private static final String AVATAR_POPUP_INFO_ICON = "S";
    @NotNull
    private static final String AVATAR_POPUP_INFO_LABEL = "\u0418\u043d\u0444\u043e";
    @NotNull
    private static final String AVATAR_POPUP_INFO_VALUE = "\u041e\u0442\u043a\u0440\u044b\u0442\u044c";
    @NotNull
    private static final String AVATAR_POPUP_INFO_ACTION_ICON = "Z";
    @NotNull
    private static final String AVATAR_POPUP_INFO_URL = "https://rainvisuals.pro";
    private static final float uiPadding;
    private static final float topBarHeight;
    private static final int maxModuleSearchLength;
    private static final int maxConfigNameLength;
    @NotNull
    private static final List<Category> menuCategories;
    @NotNull
    private static final TransitionManager<Category> categoryTransition;
    private static float categoryContentAlpha;
    private static final float categoryShiftDistance;
    @NotNull
    private static final List<SelectCategoryComponent> components;
    @NotNull
    private static final Map<Category, CategoryComponent> categoryComponents;
    @NotNull
    private static final ConfigsCategoryComponent configsCategoryComponent;
    @NotNull
    private static final EventsCategoryComponent eventsCategoryComponent;
    @NotNull
    private static final PointsCategoryComponent pointsCategoryComponent;
    @NotNull
    private static final FriendsCategoryComponent friendsCategoryComponent;
    @NotNull
    private static final Category pointsSettingsCategory;
    @NotNull
    private static final MenuBackgroundRenderer backgroundRenderer;
    @NotNull
    private static final MenuTopBarRenderer topBarRenderer;
    @NotNull
    private static final MenuScrollBarRenderer scrollBarRenderer;
    @NotNull
    private static final AnimationUtil categoryIndicatorYAnim;
    @NotNull
    private static final AnimationUtil openAnimation;
    @NotNull
    private static final AnimationUtil avatarPopupAnimation;
    @NotNull
    private static final AnimationUtil avatarPopupCloseHoverAnimation;
    @NotNull
    private static final AnimationUtil avatarPopupGuiScaleAnimation;
    @NotNull
    private static final AnimationUtil avatarPopupHudScaleAnimation;
    @NotNull
    private static final AnimationUtil avatarPopupGuiBackgroundAnimation;
    private static boolean categoryIndicatorInitialized;
    private static boolean avatarPopupOpen;
    private static boolean draggingAvatarPopupGuiScale;
    @Nullable
    private static Float avatarPopupGuiScaleDragProgress;
    private static boolean draggingAvatarPopupHudScale;
    @Nullable
    private static Float avatarPopupHudScaleDragProgress;
    private static boolean closing;
    @NotNull
    private static String moduleSearchText;
    @NotNull
    private static String configNameText;
    private static boolean searchFocused;
    private static boolean topBarTextSelected;
    @Nullable
    private static MenuScrollBarRenderer.State scrollBarState;
    private static boolean draggingScrollBar;
    private static float scrollBarGrabOffset;
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    private MenuScreen() {
    }

    private final String avatarPopupTitle() {
        CharSequence charSequence;
        long l2 = 762920767983459040L;
        CharSequence charSequence2 = kotakbaz.rain.guard.a_0.username();
        if (StringsKt.isBlank(charSequence2)) {
            long l3 = l2;
            int n2 = C[0];
            n2 ^= C[1];
            l2 = l3 ^ (0L ^ l3) & -1L << (n2 ^= C[2]);
            int n3 = C[3];
            n3 -= C[4];
            charSequence = (String)a[n3 += C[5]];
        } else {
            charSequence = charSequence2;
        }
        return (String)charSequence;
    }

    private final float getModuleStartOffset() {
        return this.getPanelWidth() / 5.0f + topBarHeight + uiPadding;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        block27: {
            var65_4 = 6378076470641293085L;
            var67_5 = -326124697921938021L;
            var69_6 = -8909649484677781418L;
            var71_7 = 5652137303935433554L;
            var73_8 = -3228590481523967593L;
            var75_9 = 7777538487971494556L;
            var77_10 = -1772617438617140810L;
            var79_11 = -2127804547323713466L;
            var81_12 = 4786610853344103605L;
            var83_13 = 8351826911773440906L;
            var85_14 = 2808069437623614739L;
            var27_15 = 7271098074290276736L;
            var29_16 = -1764576888523772322L;
            var31_17 = -4999452234092610605L;
            var33_18 = 53478266598255884L;
            var35_19 = 8973660907441897144L;
            var37_20 = -5603986700155136117L;
            var39_21 = -5324075950594254308L;
            var41_22 = -6062765851126203241L;
            var43_23 = -8581160321013093860L;
            var45_24 = 5337294792509442762L;
            var47_25 = -2500175370746320198L;
            var49_26 = -3462997562126883463L;
            var51_27 = 2405997768360020684L;
            var53_28 = 822645741080900285L;
            var55_29 = -8372749068820563401L;
            var57_30 = -1234527899464042802L;
            var59_31 = -4115507457553160355L;
            var61_32 = 7706631629159665816L;
            var63_33 = 619190769731674067L;
            super.render(mouseX, mouseY, partialTicks);
            var4_34 = this.openProgress();
            var5_35 = this.currentScale(var4_34);
            v0 = var61_32;
            var88_36 = MenuScreen.C[6];
            var88_36 += MenuScreen.C[7];
            var61_32 = v0 ^ ((long)this.unscaleMouseX(mouseX, var5_35) ^ v0) & -1L >>> (var88_36 ^= MenuScreen.C[8]);
            var90_37 = MenuScreen.C[9];
            var90_37 ^= MenuScreen.C[10];
            v1 = var63_33;
            var92_38 = MenuScreen.C[12];
            var92_38 ^= MenuScreen.C[13];
            var63_33 = v1 ^ ((long)this.unscaleMouseY(mouseY, var5_35) << (var90_37 += MenuScreen.C[11]) ^ v1) & -1L << (var92_38 += MenuScreen.C[14]);
            var8_39 = MenuScreen.categoryTransition.getCurrent();
            v2 = var59_31;
            var94_40 = MenuScreen.C[15];
            var94_40 -= MenuScreen.C[16];
            var59_31 = v2 ^ ((long)this.isConfigCategory(var8_39) ^ v2) & -1L >>> (var94_40 += MenuScreen.C[17]);
            v3 = var29_16;
            var96_41 = MenuScreen.C[18];
            var96_41 -= MenuScreen.C[19];
            var29_16 = v3 ^ ((long)this.isEventsCategory(var8_39) ^ v3) & -1L >>> (var96_41 += MenuScreen.C[20]);
            v4 = var33_18;
            var98_42 = MenuScreen.C[21];
            var98_42 += MenuScreen.C[22];
            var33_18 = v4 ^ ((long)this.isPointsCategory(var8_39) ^ v4) & -1L >>> (var98_42 -= MenuScreen.C[23]);
            v5 = var31_17;
            var100_43 = MenuScreen.C[24];
            var100_43 ^= MenuScreen.C[25];
            var31_17 = v5 ^ ((long)this.isFriendsCategory(var8_39) ^ v5) & -1L >>> (var100_43 ^= MenuScreen.C[26]);
            v6 = CollectionsKt.firstOrNull(MenuScreen.components);
            var13_44 = v6 != null ? v6.getPadding() : MenuScreen.uiPadding;
            var14_45 = new MenuLayout(this.getX(), this.getY(), this.getWidth(), this.getHeight(), this.getPanelWidth(), MenuScreen.uiPadding, MenuScreen.topBarHeight, var13_44, MenuScreen.components.size(), (boolean)var59_31, (boolean)var33_18);
            MenuScreen.categoryContentAlpha = MenuScreen.categoryTransition.updateAndGetAlpha();
            if (MenuScreen.categoryContentAlpha <= 0.5f) {
                var102_46 = MenuScreen.C[27];
                var102_46 += MenuScreen.C[28];
                MenuScreen.draggingScrollBar = var102_46 ^= MenuScreen.C[29];
                MenuScreen.scrollBarGrabOffset = 0.0f;
            }
            var15_47 = (1.0f - MenuScreen.categoryContentAlpha) * MenuScreen.categoryShiftDistance;
            MatrixControl.INSTANCE.pushMatrix();
            this.renderBackdrop(var4_34);
            MatrixControl.INSTANCE.startScale(this.getX() + this.getWidth() * 0.5f, this.getY() + this.getHeight() * 0.5f, var5_35);
            MenuScreen.backgroundRenderer.render(var14_45, var4_34);
            var17_48 = MenuScreen.components;
            v7 = var63_33;
            var104_49 = MenuScreen.C[30];
            var104_49 -= MenuScreen.C[31];
            var63_33 = v7 ^ (0L ^ v7) & -1L >>> (var104_49 += MenuScreen.C[32]);
            v8 = var57_30;
            var106_50 = MenuScreen.C[33];
            var106_50 -= MenuScreen.C[34];
            var57_30 = v8 ^ (0L ^ v8) & -1L << (var106_50 ^= MenuScreen.C[35]);
            var20_51 = var17_48.iterator();
            while (var20_51.hasNext()) {
                var22_55 = var21_53 = var20_51.next();
                v9 = var59_31;
                var108_57 = MenuScreen.C[36];
                var108_57 -= MenuScreen.C[37];
                var59_31 = v9 ^ (0L ^ v9) & -1L << (var108_57 += MenuScreen.C[38]);
                if (Intrinsics.areEqual(var22_55.getCategory(), var8_39)) {
                    var110_58 = MenuScreen.C[39];
                    var110_58 -= MenuScreen.C[40];
                    v10 = (int)(var57_30 >>> (var110_58 += MenuScreen.C[41]));
                    break block27;
                }
                var57_30 += 0x100000000L;
            }
            var112_59 = MenuScreen.C[42];
            var112_59 ^= MenuScreen.C[43];
            v10 = var112_59 += MenuScreen.C[44];
        }
        var114_60 = MenuScreen.C[45];
        var114_60 -= MenuScreen.C[46];
        v11 = var43_23;
        var116_61 = MenuScreen.C[48];
        var116_61 += MenuScreen.C[49];
        var43_23 = v11 ^ ((long)v10 << (var114_60 -= MenuScreen.C[47]) ^ v11) & -1L << (var116_61 += MenuScreen.C[50]);
        var118_62 = MenuScreen.C[51];
        var118_62 ^= MenuScreen.C[52];
        if ((int)(var43_23 >>> (var118_62 += MenuScreen.C[53])) >= 0) {
            var120_63 = MenuScreen.C[54];
            var120_63 += MenuScreen.C[55];
            var17_48 = MenuScreen.components.get((int)(var43_23 >>> (var120_63 ^= MenuScreen.C[56])));
            var122_64 = MenuScreen.C[57];
            var122_64 -= MenuScreen.C[58];
            var18_65 = var14_45.categorySlot((int)(var43_23 >>> (var122_64 -= MenuScreen.C[59])), var17_48.getPadding());
            if (!MenuScreen.categoryIndicatorInitialized) {
                var124_66 = MenuScreen.C[60];
                var124_66 += MenuScreen.C[61];
                MenuScreen.categoryIndicatorInitialized = var124_66 ^= MenuScreen.C[62];
                var126_67 = MenuScreen.C[63];
                var126_67 ^= MenuScreen.C[64];
                v12 = AnimationUtil.animate$default(MenuScreen.categoryIndicatorYAnim, var18_65.getY(), 0.0f, null, var126_67 += MenuScreen.C[65], null);
            } else {
                v12 = MenuScreen.categoryIndicatorYAnim.animate(var18_65.getY(), 250.0f, (Function1<? super Float, Float>)new Function1<Float, Float>((Object)Easings.INSTANCE){
                    private static Object[] a;
                    private static Object b;
                    private static Object[] B;
                    private static Object[] A;
                    private static Object[] c;
                    public static int[] C;
                    {
                        int n2 = C[0];
                        n2 -= C[1];
                        n2 -= C[2];
                        int n3 = C[3];
                        n3 += C[4];
                        n3 ^= C[5];
                        int n4 = C[6];
                        n4 ^= C[7];
                        n4 += C[8];
                        int n5 = C[9];
                        n5 -= C[10];
                        int n6 = C[12];
                        n6 -= C[13];
                        int n7 = C[15];
                        n7 ^= C[16];
                        super(n2, receiver, Easings.class, (String)a[n3] + (String)a[n4], (String)a[n5 ^= C[11]] + (String)a[n6 ^= C[14]], n7 += C[17]);
                    }

                    public final Float invoke(float p0) {
                        return Float.valueOf(((Easings)this.receiver).emphasizedDecelerate(p0));
                    }

                    static {
                        render.indicatorY._1.b();
                        long l2 = -4766055823461460366L;
                        long l3 = -3471779449254040469L;
                        long l4 = -6669732262250986655L;
                        long l5 = -2956893137388428758L;
                        long l6 = -273613598400176387L;
                        long l7 = 7142601796879674769L;
                        long l8 = -4275087060120461021L;
                        long l9 = -7482677648683423387L;
                        long l10 = 6647997163656182950L;
                        long l11 = -8359892723580084558L;
                        long l12 = -5326571272786848962L;
                        long l13 = 6475782713786506202L;
                        long l14 = 1666663804022781119L;
                        long l15 = 3682252362887129328L;
                        int n2 = C[18];
                        n2 -= C[19];
                        a = new Object[n2 -= C[20]];
                        long l16 = l15;
                        int n3 = C[21];
                        n3 += C[22];
                        l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= C[23]);
                        Object[] objectArray = new Object[C[24]];
                        objectArray[render.indicatorY._1.C[25]] = A;
                        objectArray[render.indicatorY._1.C[26]] = C[27];
                        int n4 = C[28];
                        Object object = render.indicatorY._1.A()[C[29]];
                        if (object == null) {
                            char[] cArray = "\u0de9\u0da1\u0e46\u0db5\u0e4c\u0e5c\u0d22\u0dfe\u0e55\u0deb\u0de6\u0dec\u0e52\u0d3e\u0e48\u0de6\u0e55\u0e5f\u0dfc\u0db4\u0dfd\u0def\u0e4f\u0e45\u0dff\u0de2\u0db4\u0e45\u0e54\u0db2\u0e54\u0d01\u0e5d\u0e53\u0dc1\u0deb\u0db4\u0e4d\u0e53\u0e50\u0d3e\u0e49\u0e42\u0d01\u0de4\u0d26\u0d22\u0e50\u0de3\u0de9\u0db2\u0dfe\u0ded\u0d27\u0e44\u0e4f\u0dec\u0d3f\u0e45\u0e52\u0da1\u0e47\u0e44\u0e4d\u0dec\u0d22\u0def\u0d24\u0dfc\u0e43\u0e55\u0de5\u0d26\u0de3\u0dc1\u0de5\u0e48\u0e49\u0e4c\u0e46\u0def\u0e45\u0deb\u0e45\u0e55\u0da0\u0dfd\u0de3\u0e55\u0db4\u0df0\u0de3\u0e45\u0db3\u0db4\u0e45\u0dc1\u0e50\u0da0\u0e5e\u0e48\u0e55\u0e45\u0de4\u0e5e\u0def\u0db4\u0d38".toCharArray();
                            for (int i2 = C[30]; i2 < C[31]; ++i2) {
                                int n5 = cArray[i2];
                                n5 ^= C[32];
                                n5 += C[33];
                                n5 -= C[34];
                                n5 ^= C[35];
                                n5 ^= C[36];
                                n5 ^= C[37];
                                n5 -= C[38];
                                n5 += C[39];
                                n5 -= C[40];
                                n5 -= C[41];
                                n5 -= C[42];
                                n5 ^= C[43];
                                cArray[i2] = (char)(n5 += C[44]);
                            }
                            object = render.indicatorY._1.A()[render.indicatorY._1.C[45]] = new String(cArray);
                        }
                        objectArray[n4] = (String)object;
                        char[] cArray = ((String)render.indicatorY._1.a(objectArray)).toCharArray();
                        long l17 = l6;
                        int n6 = C[46];
                        n6 += C[47];
                        l6 = l17 ^ (0x3400000000L ^ l17) & -1L << (n6 -= C[48]);
                        long l18 = l13;
                        int n7 = C[49];
                        n7 += C[50];
                        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += C[51]);
                        while (true) {
                            int n8 = C[52];
                            n8 -= C[53];
                            if ((int)l13 >= (int)(l6 >>> (n8 -= C[54]))) break;
                            int n9 = (int)l13;
                            long l19 = l13;
                            int n10 = C[55];
                            n10 ^= C[56];
                            int n11 = C[58];
                            n11 -= C[59];
                            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= C[57])) & -1L >>> (n11 -= C[60]);
                            long l20 = l9;
                            int n12 = C[61];
                            n12 += C[62];
                            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= C[63]);
                            int n13 = (int)l13;
                            long l21 = l13;
                            int n14 = C[64];
                            n14 ^= C[65];
                            int n15 = C[67];
                            n15 ^= C[68];
                            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= C[66])) & -1L >>> (n15 += C[69]);
                            int n16 = C[70];
                            n16 += C[71];
                            long l22 = l10;
                            int n17 = C[73];
                            n17 += C[74];
                            l10 = l22 ^ ((long)cArray[n13] << (n16 -= C[72]) ^ l22) & -1L << (n17 -= C[75]);
                            int n18 = C[76];
                            n18 -= C[77];
                            n18 ^= C[78];
                            int n19 = C[79];
                            n19 ^= C[80];
                            long l23 = l12;
                            int n20 = C[82];
                            n20 -= C[83];
                            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= C[81]))) ^ l23) & -1L >>> (n20 += C[84]);
                            char[] cArray2 = new char[(int)l12];
                            long l24 = l14;
                            int n21 = C[85];
                            n21 -= C[86];
                            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= C[87]);
                            while (true) {
                                int n22 = C[88];
                                n22 -= C[89];
                                if ((int)(l14 >>> (n22 -= C[90])) >= (int)l12) break;
                                int n23 = C[91];
                                n23 ^= C[92];
                                int n24 = C[94];
                                n24 ^= C[95];
                                cArray2[(int)(l14 >>> (n23 -= render.indicatorY._1.C[93]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += C[96]))];
                                l14 += 0x100000000L;
                            }
                            int n25 = C[97];
                            n25 += C[98];
                            int n26 = (int)(l15 >>> (n25 += C[99]));
                            l15 += 0x100000000L;
                            render.indicatorY._1.a[n26] = new String(cArray2);
                            long l25 = l13;
                            int n27 = C[100];
                            n27 -= C[101];
                            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= C[102]);
                        }
                    }

                    public static Object a(Object[] object) {
                        Object object2;
                        int n2 = (Integer)object[C[103]];
                        String string = (String)object[C[104]];
                        object = object[C[105]];
                        Object[] objectArray = B;
                        if (B == null) {
                            objectArray = B = new Object[C[106]];
                        }
                        if ((object2 = objectArray[n2]) == null) {
                            Object object3 = object;
                            if (object == null) {
                                Object[] objectArray2 = new Object[C[107]];
                                A = objectArray2;
                                object3 = objectArray2;
                                byte[] byArray = new byte[C[109] ^ C[110]];
                                byArray[render.indicatorY._1.C[111] ^ render.indicatorY._1.C[112]] = C[113] ^ C[114];
                                byArray[render.indicatorY._1.C[115] ^ render.indicatorY._1.C[116]] = C[117] ^ C[118];
                                byArray[render.indicatorY._1.C[119] ^ render.indicatorY._1.C[120]] = C[121] ^ C[122];
                                byArray[render.indicatorY._1.C[123] ^ render.indicatorY._1.C[124]] = C[125] ^ C[126];
                                byArray[render.indicatorY._1.C[127] ^ render.indicatorY._1.C[128]] = C[129] ^ C[130];
                                byArray[render.indicatorY._1.C[131] ^ render.indicatorY._1.C[132]] = C[133] ^ C[134];
                                byArray[render.indicatorY._1.C[135] ^ render.indicatorY._1.C[136]] = C[137] ^ C[138];
                                byArray[render.indicatorY._1.C[139] ^ render.indicatorY._1.C[140]] = C[141] ^ C[142];
                                byArray[render.indicatorY._1.C[143] ^ render.indicatorY._1.C[144]] = C[145] ^ C[146];
                                byArray[render.indicatorY._1.C[147] ^ render.indicatorY._1.C[148]] = C[149] ^ C[150];
                                byArray[render.indicatorY._1.C[151] ^ render.indicatorY._1.C[152]] = C[153] ^ C[154];
                                byArray[render.indicatorY._1.C[155] ^ render.indicatorY._1.C[156]] = C[157] ^ C[158];
                                byArray[render.indicatorY._1.C[159] ^ render.indicatorY._1.C[160]] = C[161] ^ C[162];
                                byArray[render.indicatorY._1.C[163] ^ render.indicatorY._1.C[164]] = C[165] ^ C[166];
                                byArray[render.indicatorY._1.C[167] ^ render.indicatorY._1.C[168]] = C[169] ^ C[170];
                                byArray[render.indicatorY._1.C[171] ^ render.indicatorY._1.C[172]] = C[173] ^ C[174];
                                objectArray2[render.indicatorY._1.C[108]] = byArray;
                            }
                            byte[] byArray = (byte[])object3[C[175]];
                            if (b == null) {
                                byte[] byArray2 = new byte[C[176] ^ C[177]];
                                byArray2[render.indicatorY._1.C[178] ^ render.indicatorY._1.C[179]] = C[180] ^ C[181];
                                byArray2[render.indicatorY._1.C[182] ^ render.indicatorY._1.C[183]] = C[184] ^ C[185];
                                byArray2[render.indicatorY._1.C[186] ^ render.indicatorY._1.C[187]] = C[188] ^ C[189];
                                byArray2[render.indicatorY._1.C[190] ^ render.indicatorY._1.C[191]] = C[192] ^ C[193];
                                byArray2[render.indicatorY._1.C[194] ^ render.indicatorY._1.C[195]] = C[196] ^ C[197];
                                byArray2[render.indicatorY._1.C[198] ^ render.indicatorY._1.C[199]] = C[200] ^ C[201];
                                byArray2[render.indicatorY._1.C[202] ^ render.indicatorY._1.C[203]] = C[204] ^ C[205];
                                byArray2[render.indicatorY._1.C[206] ^ render.indicatorY._1.C[207]] = C[208] ^ C[209];
                                byArray2[render.indicatorY._1.C[210] ^ render.indicatorY._1.C[211]] = C[212] ^ C[213];
                                byArray2[render.indicatorY._1.C[214] ^ render.indicatorY._1.C[215]] = C[216] ^ C[217];
                                byArray2[render.indicatorY._1.C[218] ^ render.indicatorY._1.C[219]] = C[220] ^ C[221];
                                byArray2[render.indicatorY._1.C[222] ^ render.indicatorY._1.C[223]] = C[224] ^ C[225];
                                byArray2[render.indicatorY._1.C[226] ^ render.indicatorY._1.C[227]] = C[228] ^ C[229];
                                byArray2[render.indicatorY._1.C[230] ^ render.indicatorY._1.C[231]] = C[232] ^ C[233];
                                byArray2[render.indicatorY._1.C[234] ^ render.indicatorY._1.C[235]] = C[236] ^ C[237];
                                byArray2[render.indicatorY._1.C[238] ^ render.indicatorY._1.C[239]] = C[240] ^ C[241];
                                byArray2[render.indicatorY._1.C[242] ^ render.indicatorY._1.C[243]] = C[244] ^ C[245];
                                byArray2[render.indicatorY._1.C[246] ^ render.indicatorY._1.C[247]] = C[248] ^ C[249];
                                byArray2[render.indicatorY._1.C[250] ^ render.indicatorY._1.C[251]] = C[252] ^ C[253];
                                byArray2[render.indicatorY._1.C[254] ^ render.indicatorY._1.C[255]] = C[256] ^ C[257];
                                byArray2[render.indicatorY._1.C[258] ^ render.indicatorY._1.C[259]] = C[260] ^ C[261];
                                byArray2[render.indicatorY._1.C[262] ^ render.indicatorY._1.C[263]] = C[264] ^ C[265];
                                byArray2[render.indicatorY._1.C[266] ^ render.indicatorY._1.C[267]] = C[268] ^ C[269];
                                byArray2[render.indicatorY._1.C[270] ^ render.indicatorY._1.C[271]] = C[272] ^ C[273];
                                byArray2[render.indicatorY._1.C[274] ^ render.indicatorY._1.C[275]] = C[276] ^ C[277];
                                byArray2[render.indicatorY._1.C[278] ^ render.indicatorY._1.C[279]] = C[280] ^ C[281];
                                byArray2[render.indicatorY._1.C[282] ^ render.indicatorY._1.C[283]] = C[284] ^ C[285];
                                byArray2[render.indicatorY._1.C[286] ^ render.indicatorY._1.C[287]] = C[288] ^ C[289];
                                byArray2[render.indicatorY._1.C[290] ^ render.indicatorY._1.C[291]] = C[292] ^ C[293];
                                byArray2[render.indicatorY._1.C[294] ^ render.indicatorY._1.C[295]] = C[296] ^ C[297];
                                byArray2[render.indicatorY._1.C[298] ^ render.indicatorY._1.C[299]] = C[300] ^ C[301];
                                byArray2[render.indicatorY._1.C[302] ^ render.indicatorY._1.C[303]] = C[304] ^ C[305];
                                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                                System.arraycopy(byArray, C[306], byArray3, C[307], byArray.length);
                                System.arraycopy(byArray2, C[308], byArray3, byArray.length, byArray2.length);
                                Object object4 = render.indicatorY._1.A()[C[309]];
                                if (object4 == null) {
                                    char[] cArray = "\u68f8\u68ca\u68cd\u68cc\u68ce\u68da\u68f9\u6993\u699c\u6990\u68f0\u6997\u696b\u6965\u68f5\u68f0\u68cb\u68db".toCharArray();
                                    for (int i2 = C[310]; i2 < C[311]; ++i2) {
                                        int n3 = cArray[i2];
                                        n3 += C[312];
                                        n3 += C[313];
                                        n3 -= C[314];
                                        n3 -= C[315];
                                        n3 += C[316];
                                        n3 -= C[317];
                                        n3 += C[318];
                                        n3 ^= C[319];
                                        n3 -= C[320];
                                        n3 ^= C[321];
                                        n3 ^= C[322];
                                        n3 += C[323];
                                        n3 -= C[324];
                                        n3 += C[325];
                                        cArray[i2] = (char)(n3 -= C[326]);
                                    }
                                    object4 = render.indicatorY._1.A()[render.indicatorY._1.C[327]] = new String(cArray);
                                }
                                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                                byte[] byArray4 = new byte[C[328]];
                                byArray4[render.indicatorY._1.C[329]] = C[330];
                                byArray4[render.indicatorY._1.C[331]] = C[332];
                                byArray4[render.indicatorY._1.C[333]] = C[334];
                                byArray4[render.indicatorY._1.C[335]] = C[336];
                                byArray4[render.indicatorY._1.C[337]] = C[338];
                                byArray4[render.indicatorY._1.C[339]] = C[340];
                                byArray4[render.indicatorY._1.C[341]] = C[342];
                                byArray4[render.indicatorY._1.C[343]] = C[344];
                                byArray4[render.indicatorY._1.C[345]] = C[346];
                                byArray4[render.indicatorY._1.C[347]] = C[348];
                                byArray4[render.indicatorY._1.C[349]] = C[350];
                                byArray4[render.indicatorY._1.C[351]] = C[352];
                                byArray4[render.indicatorY._1.C[353]] = C[354];
                                byArray4[render.indicatorY._1.C[355]] = C[356];
                                byArray4[render.indicatorY._1.C[357]] = C[358];
                                byArray4[render.indicatorY._1.C[359]] = C[360];
                                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, C[361], C[362]);
                                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                                Object object5 = render.indicatorY._1.A()[C[363]];
                                if (object5 == null) {
                                    char[] cArray = "\u4e74\u4e70\u4bca".toCharArray();
                                    for (int i3 = C[364]; i3 < C[365]; ++i3) {
                                        int n4 = cArray[i3];
                                        n4 -= C[366];
                                        n4 += C[367];
                                        n4 ^= C[368];
                                        n4 += C[369];
                                        n4 -= C[370];
                                        n4 -= C[371];
                                        n4 += C[372];
                                        n4 -= C[373];
                                        n4 += C[374];
                                        n4 ^= C[375];
                                        cArray[i3] = (char)(n4 -= C[376]);
                                    }
                                    object5 = render.indicatorY._1.A()[render.indicatorY._1.C[377]] = new String(cArray);
                                }
                                b = new SecretKeySpec(byArray5, (String)object5);
                            }
                            byte[] byArray6 = Base64.getDecoder().decode(string);
                            byte[] byArray7 = Arrays.copyOfRange(byArray6, C[378], C[379]);
                            byte[] byArray8 = Arrays.copyOfRange(byArray6, C[380], byArray6.length);
                            Object object6 = render.indicatorY._1.A()[C[381]];
                            if (object6 == null) {
                                char[] cArray = "\ub4f9\ub4fd\ub4cb\ub4e7\ub4fb\ub4fa\ub4fb\ub4e7\ub4c8\ub4c3\ub4fb\ub4cb\ub4ed\ub4c8\ub4d9\ub4dc\ub4dc\ub421\ub426\ub4df".toCharArray();
                                for (int i4 = C[382]; i4 < C[383]; ++i4) {
                                    int n5 = cArray[i4];
                                    n5 ^= C[384];
                                    n5 -= C[385];
                                    n5 += C[386];
                                    n5 -= C[387];
                                    n5 -= C[388];
                                    n5 -= C[389];
                                    n5 -= C[390];
                                    n5 += C[391];
                                    n5 -= C[392];
                                    n5 -= C[393];
                                    n5 -= C[394];
                                    cArray[i4] = (char)(n5 += C[395]);
                                }
                                object6 = render.indicatorY._1.A()[render.indicatorY._1.C[396]] = new String(cArray);
                            }
                            Cipher cipher = Cipher.getInstance((String)object6);
                            cipher.init(C[397], (Key)((SecretKey)b), new IvParameterSpec(byArray7));
                            byte[] byArray9 = cipher.doFinal(byArray8);
                            object2 = new String(byArray9, StandardCharsets.UTF_8);
                        }
                        return object2;
                    }

                    private static Object[] A() {
                        Object[] objectArray = c;
                        if (c == null) {
                            c = new Object[C[398]];
                            objectArray = c;
                        }
                        return objectArray;
                    }

                    public static void b() {
                        C = new int[0xFD6F ^ 0xFCE0];
                        render.indicatorY._1.C[0x10370 ^ 0x10254] = 0x12F38 ^ 0x10254;
                        render.indicatorY._1.C[0x381C ^ 0x38B0] = 0xDEF6 ^ 0x38B0;
                        render.indicatorY._1.C[0x2C36 ^ 0x2C7C] = 0x2C3C ^ 0x2C7C;
                        render.indicatorY._1.C[0x3772 ^ 0x37F3] = 0xFFFFD370 ^ 0x37F3;
                        render.indicatorY._1.C[0x95B2 ^ 0x9565] = 0x5CDE ^ 0x9565;
                        render.indicatorY._1.C[0x10CF4 ^ 0x10CCB] = 0x10CBE ^ 0x10CCB;
                        render.indicatorY._1.C[0x8DAB ^ 0x8DD8] = 0x5D7C ^ 0x8DD8;
                        render.indicatorY._1.C[0x295F ^ 0x2904] = 0x2917 ^ 0x2904;
                        render.indicatorY._1.C[0x30D1 ^ 0x30A4] = 0xE04E ^ 0x30A4;
                        render.indicatorY._1.C[0x3002 ^ 0x3144] = 0x65FB ^ 0x3144;
                        render.indicatorY._1.C[0x1037E ^ 0x10245] = 0x17B4B ^ 0x10245;
                        render.indicatorY._1.C[0x3A98 ^ 0x3AF5] = 0xCA64 ^ 0x3AF5;
                        render.indicatorY._1.C[0x459C ^ 0x4517] = 0xCBA0 ^ 0x4517;
                        render.indicatorY._1.C[0x9741 ^ 0x964E] = 0x7610 ^ 0x964E;
                        render.indicatorY._1.C[0x53CF ^ 0x5308] = 0x71C2 ^ 0x5308;
                        render.indicatorY._1.C[0x720A ^ 0x733C] = 0x733C ^ 0x733C;
                        render.indicatorY._1.C[0xDCA9 ^ 0xDCCA] = 0xFFFF235A ^ 0xDCCA;
                        render.indicatorY._1.C[0x319C ^ 0x31B0] = 0x264F ^ 0x31B0;
                        render.indicatorY._1.C[0x572F ^ 0x5630] = 0x2AF7 ^ 0x5630;
                        render.indicatorY._1.C[0x108F1 ^ 0x10812] = 0x1CBEF ^ 0x10812;
                        render.indicatorY._1.C[0x5C97 ^ 0x5CA5] = 0xFFFFA308 ^ 0x5CA5;
                        render.indicatorY._1.C[0x9D31 ^ 0x9D12] = 0x4042 ^ 0x9D12;
                        render.indicatorY._1.C[0xB5E5 ^ 0xB4EF] = 0x6AF0 ^ 0xB4EF;
                        render.indicatorY._1.C[0xB184 ^ 0xB16D] = 0x1B326 ^ 0xB16D;
                        render.indicatorY._1.C[0xC4A8 ^ 0xC5E9] = 0xBE3C ^ 0xC5E9;
                        render.indicatorY._1.C[0xC7E4 ^ 0xC75E] = 0x556D ^ 0xC75E;
                        render.indicatorY._1.C[0xF88D ^ 0xF850] = 0x121B ^ 0xF850;
                        render.indicatorY._1.C[0x5C7D ^ 0x5C6B] = 0x5C1B ^ 0x5C6B;
                        render.indicatorY._1.C[0x2D4F ^ 0x2C68] = 0x8828 ^ 0x2C68;
                        render.indicatorY._1.C[0x9486 ^ 0x95E6] = 0x95F7 ^ 0x95E6;
                        render.indicatorY._1.C[0x1E1B ^ 0x1EA2] = 0x1156C ^ 0x1EA2;
                        render.indicatorY._1.C[0x6010 ^ 0x601E] = 0x6001 ^ 0x601E;
                        render.indicatorY._1.C[0x3DE9 ^ 0x3C80] = 0x3C93 ^ 0x3C80;
                        render.indicatorY._1.C[0xE6EC ^ 0xE7D0] = 0x6721 ^ 0xE7D0;
                        render.indicatorY._1.C[0xA512 ^ 0xA5F5] = 0x1A7BE ^ 0xA5F5;
                        render.indicatorY._1.C[0x4B96 ^ 0x4BD3] = 0xFFFFB414 ^ 0x4BD3;
                        render.indicatorY._1.C[0x10B3A ^ 0x10BF2] = 0xFFFED6BE ^ 0x10BF2;
                        render.indicatorY._1.C[0x39EB ^ 0x39B5] = 0xFFFFC621 ^ 0x39B5;
                        render.indicatorY._1.C[0x9109 ^ 0x907C] = 0x871A ^ 0x907C;
                        render.indicatorY._1.C[0x348C ^ 0x35FE] = 0x34DC ^ 0x35FE;
                        render.indicatorY._1.C[0xA9D6 ^ 0xA933] = 0x6ACE ^ 0xA933;
                        render.indicatorY._1.C[0x11B9 ^ 0x10D5] = 0x10D5 ^ 0x10D5;
                        render.indicatorY._1.C[0xD624 ^ 0xD6F8] = 0x3CF4 ^ 0xD6F8;
                        render.indicatorY._1.C[0xD1A5 ^ 0xD0DC] = 0xD0DE ^ 0xD0DC;
                        render.indicatorY._1.C[0x2C3E ^ 0x2C78] = 0xFFFFD3F7 ^ 0x2C78;
                        render.indicatorY._1.C[0x2FC9 ^ 0x2F56] = 0xC119 ^ 0x2F56;
                        render.indicatorY._1.C[0xADC7 ^ 0xADCF] = 0xFFFF5241 ^ 0xADCF;
                        render.indicatorY._1.C[0x5C6E ^ 0x5C3B] = 0xFFFFA37B ^ 0x5C3B;
                        render.indicatorY._1.C[0x7DB7 ^ 0x7CD9] = 0x7009 ^ 0x7CD9;
                        render.indicatorY._1.C[0xD0BA ^ 0xD196] = 0xFFFFD29D ^ 0xD196;
                        render.indicatorY._1.C[0xC840 ^ 0xC892] = 0x4F14 ^ 0xC892;
                        render.indicatorY._1.C[0x5787 ^ 0x57D5] = 0xFFFFA816 ^ 0x57D5;
                        render.indicatorY._1.C[0x664E ^ 0x675D] = 0x1C83 ^ 0x675D;
                        render.indicatorY._1.C[0x8F8A ^ 0x8F46] = 0xFFFF5EC3 ^ 0x8F46;
                        render.indicatorY._1.C[0x7DEE ^ 0x7C9F] = 0x97DD ^ 0x7C9F;
                        render.indicatorY._1.C[0xD670 ^ 0xD72B] = 0xD722 ^ 0xD72B;
                        render.indicatorY._1.C[0x4966 ^ 0x4823] = 0x2FF8 ^ 0x4823;
                        render.indicatorY._1.C[0x7B4F ^ 0x7B8D] = 0x63F7 ^ 0x7B8D;
                        render.indicatorY._1.C[0xB80 ^ 0xBD8] = 0xFFFFF41E ^ 0xBD8;
                        render.indicatorY._1.C[0x38B9 ^ 0x3861] = 0xFFFF0E56 ^ 0x3861;
                        render.indicatorY._1.C[0x5EF5 ^ 0x5E3C] = 0x7CF6 ^ 0x5E3C;
                        render.indicatorY._1.C[0x7502 ^ 0x7519] = 0x7519 ^ 0x7519;
                        render.indicatorY._1.C[0x10B4 ^ 0x10C5] = 0xFFFF4BB8 ^ 0x10C5;
                        render.indicatorY._1.C[0x8CAC ^ 0x8C23] = 0x4F9B ^ 0x8C23;
                        render.indicatorY._1.C[0x7316 ^ 0x732B] = 0xFFFF8CD9 ^ 0x732B;
                        render.indicatorY._1.C[0xA9 ^ 0x21] = 0x485E ^ 0x21;
                        render.indicatorY._1.C[0x1564 ^ 0x1503] = 0x1502 ^ 0x1503;
                        render.indicatorY._1.C[0xF38C ^ 0xF2DC] = 0xF290 ^ 0xF2DC;
                        render.indicatorY._1.C[0x4F06 ^ 0x4E16] = 0xAE34 ^ 0x4E16;
                        render.indicatorY._1.C[0x10E3B ^ 0x10F0A] = 0x13945 ^ 0x10F0A;
                        render.indicatorY._1.C[0x28E1 ^ 0x28DB] = 0x28DE ^ 0x28DB;
                        render.indicatorY._1.C[0x8734 ^ 0x87BD] = 0xCFAF ^ 0x87BD;
                        render.indicatorY._1.C[0x7347 ^ 0x725C] = 0x315D ^ 0x725C;
                        render.indicatorY._1.C[0x2A30 ^ 0x2B22] = 0x50EA ^ 0x2B22;
                        render.indicatorY._1.C[0x92AA ^ 0x92C0] = 0x92C1 ^ 0x92C0;
                        render.indicatorY._1.C[0xFFB7 ^ 0xFECC] = 0xFEDC ^ 0xFECC;
                        render.indicatorY._1.C[0xF2BB ^ 0xF2F6] = 0xFFFF0D55 ^ 0xF2F6;
                        render.indicatorY._1.C[0x1ECB ^ 0x1FC2] = 0x547C ^ 0x1FC2;
                        render.indicatorY._1.C[0x89CC ^ 0x8984] = 0xFFFF7640 ^ 0x8984;
                        render.indicatorY._1.C[0x9731 ^ 0x96BD] = 0x96BE ^ 0x96BD;
                        render.indicatorY._1.C[0xABC2 ^ 0xAB86] = 0xABEE ^ 0xAB86;
                        render.indicatorY._1.C[0x2FAD ^ 0x2F41] = 0xFFFFA236 ^ 0x2F41;
                        render.indicatorY._1.C[0x516F ^ 0x5199] = 0x80CE ^ 0x5199;
                        render.indicatorY._1.C[0x8447 ^ 0x851E] = 0x8515 ^ 0x851E;
                        render.indicatorY._1.C[0x7828 ^ 0x7871] = 0xFFFF87AE ^ 0x7871;
                        render.indicatorY._1.C[0xE362 ^ 0xE2E8] = 0x13D6 ^ 0xE2E8;
                        render.indicatorY._1.C[0xCDC2 ^ 0xCD64] = 0x2223 ^ 0xCD64;
                        render.indicatorY._1.C[0xC7C2 ^ 0xC768] = 0xDD6B ^ 0xC768;
                        render.indicatorY._1.C[0x6C79 ^ 0x6C65] = 0x6C67 ^ 0x6C65;
                        render.indicatorY._1.C[0x84D5 ^ 0x85AA] = 0x85BE ^ 0x85AA;
                        render.indicatorY._1.C[0x19B5 ^ 0x18B1] = 0xFFFFB3A2 ^ 0x18B1;
                        render.indicatorY._1.C[0x7E2B ^ 0x7E5F] = 0xAEF7 ^ 0x7E5F;
                        render.indicatorY._1.C[0xE034 ^ 0xE010] = 0x6821 ^ 0xE010;
                        render.indicatorY._1.C[0x15E6 ^ 0x1537] = 0xEEED ^ 0x1537;
                        render.indicatorY._1.C[0xA44F ^ 0xA46D] = 0x5DC2 ^ 0xA46D;
                        render.indicatorY._1.C[0x402C ^ 0x4070] = 0x4066 ^ 0x4070;
                        render.indicatorY._1.C[0x860D ^ 0x8752] = 0x8756 ^ 0x8752;
                        render.indicatorY._1.C[0x30F1 ^ 0x306F] = 0xA00 ^ 0x306F;
                        render.indicatorY._1.C[0x182C ^ 0x184C] = 0x1844 ^ 0x184C;
                        render.indicatorY._1.C[0xCE17 ^ 0xCE46] = 0xFFFF31D4 ^ 0xCE46;
                        render.indicatorY._1.C[0xA173 ^ 0xA104] = 0xB805 ^ 0xA104;
                        render.indicatorY._1.C[0x3060 ^ 0x30A3] = 0x28CA ^ 0x30A3;
                        render.indicatorY._1.C[0xF6CA ^ 0xF65A] = 0x35E7 ^ 0xF65A;
                        render.indicatorY._1.C[0xF83A ^ 0xF87D] = 0xF828 ^ 0xF87D;
                        render.indicatorY._1.C[0x8D93 ^ 0x8CCB] = 0xFFFF7303 ^ 0x8CCB;
                        render.indicatorY._1.C[0x7A95 ^ 0x7ADE] = 0x7AFB ^ 0x7ADE;
                        render.indicatorY._1.C[0xAC5F ^ 0xAC78] = 0xF54C ^ 0xAC78;
                        render.indicatorY._1.C[0x9F91 ^ 0x9F17] = 0x7F59 ^ 0x9F17;
                        render.indicatorY._1.C[0x5EC ^ 0x57A] = 0x55E ^ 0x57A;
                        render.indicatorY._1.C[0xC690 ^ 0xC7F4] = 0xFFFF384E ^ 0xC7F4;
                        render.indicatorY._1.C[0x10CB0 ^ 0x10C42] = 0x1A79C ^ 0x10C42;
                        render.indicatorY._1.C[0xCBDB ^ 0xCBC9] = 0xCBF9 ^ 0xCBC9;
                        render.indicatorY._1.C[0x10B32 ^ 0x10B9D] = 0x10B9D ^ 0x10B9D;
                        render.indicatorY._1.C[0x7601 ^ 0x767E] = 0x6D04 ^ 0x767E;
                        render.indicatorY._1.C[0x8711 ^ 0x8727] = 0xFFFF78B0 ^ 0x8727;
                        render.indicatorY._1.C[0xD602 ^ 0xD705] = 0x9CBB ^ 0xD705;
                        render.indicatorY._1.C[0x4D0 ^ 0x449] = 0xFFFF322B ^ 0x449;
                        render.indicatorY._1.C[0x51B2 ^ 0x5080] = 0x5080 ^ 0x5080;
                        render.indicatorY._1.C[0x837F ^ 0x83C2] = 0x11F7 ^ 0x83C2;
                        render.indicatorY._1.C[0x4B97 ^ 0x4AC5] = 0xFFFFB55F ^ 0x4AC5;
                        render.indicatorY._1.C[0x696A ^ 0x6959] = 0x6963 ^ 0x6959;
                        render.indicatorY._1.C[0xDEA8 ^ 0xDE1F] = 0x1D5D1 ^ 0xDE1F;
                        render.indicatorY._1.C[Short.MAX_VALUE ^ 0x7F01] = 0xEC06 ^ 0x7F01;
                        render.indicatorY._1.C[0x7C75 ^ 0x7CD4] = 0x9296 ^ 0x7CD4;
                        render.indicatorY._1.C[0xE961 ^ 0xE98A] = 0x9B31 ^ 0xE98A;
                        render.indicatorY._1.C[0xE381 ^ 0xE3E9] = 0xE3EB ^ 0xE3E9;
                        render.indicatorY._1.C[0x36F3 ^ 0x37B1] = 0xFEA7 ^ 0x37B1;
                        render.indicatorY._1.C[0x10D78 ^ 0x10D8B] = 0x1A65F ^ 0x10D8B;
                        render.indicatorY._1.C[0x10677 ^ 0x10726] = 0x10729 ^ 0x10726;
                        render.indicatorY._1.C[0x4A3E ^ 0x4AC5] = 0x452E ^ 0x4AC5;
                        render.indicatorY._1.C[0x109BF ^ 0x109C5] = 0x110CC ^ 0x109C5;
                        render.indicatorY._1.C[0x40A8 ^ 0x40D4] = 0x338B ^ 0x40D4;
                        render.indicatorY._1.C[0xFF77 ^ 0xFFF7] = 0xE48E ^ 0xFFF7;
                        render.indicatorY._1.C[0x10893 ^ 0x1087C] = 0x1A64A ^ 0x1087C;
                        render.indicatorY._1.C[0xEA47 ^ 0xEAA1] = 0x1E8F8 ^ 0xEAA1;
                        render.indicatorY._1.C[0xBC36 ^ 0xBD42] = 0x4684 ^ 0xBD42;
                        render.indicatorY._1.C[0x21F3 ^ 0x208F] = 0x209F ^ 0x208F;
                        render.indicatorY._1.C[0xFA4E ^ 0xFBC3] = 0xFBC1 ^ 0xFBC3;
                        render.indicatorY._1.C[0xA2C5 ^ 0xA2F1] = 0xA2D9 ^ 0xA2F1;
                        render.indicatorY._1.C[0xA90 ^ 0xB9D] = 0xD597 ^ 0xB9D;
                        render.indicatorY._1.C[0xFAD3 ^ 0xFA70] = 0x1536 ^ 0xFA70;
                        render.indicatorY._1.C[0x7727 ^ 0x77DE] = 0xA686 ^ 0x77DE;
                        render.indicatorY._1.C[0x6E9D ^ 0x6F8C] = 0x8FD2 ^ 0x6F8C;
                        render.indicatorY._1.C[0xF225 ^ 0xF2D1] = 0x5923 ^ 0xF2D1;
                        render.indicatorY._1.C[0x4A04 ^ 0x4B8A] = 0x4B8E ^ 0x4B8A;
                        render.indicatorY._1.C[0x2A7E ^ 0x2A2E] = 0x2A5D ^ 0x2A2E;
                        render.indicatorY._1.C[0x2B27 ^ 0x2B73] = 0xFFFFD499 ^ 0x2B73;
                        render.indicatorY._1.C[0x1E3A ^ 0x1E9F] = 0xF1C9 ^ 0x1E9F;
                        render.indicatorY._1.C[0xFF56 ^ 0xFF26] = 0x5BEC ^ 0xFF26;
                        render.indicatorY._1.C[0x9660 ^ 0x9765] = 0xC3D0 ^ 0x9765;
                        render.indicatorY._1.C[0x79FC ^ 0x7904] = 0xA820 ^ 0x7904;
                        render.indicatorY._1.C[0x1A70 ^ 0x1AB5] = 0x2DC ^ 0x1AB5;
                        render.indicatorY._1.C[0x4EB6 ^ 0x4FA1] = 0x9AA ^ 0x4FA1;
                        render.indicatorY._1.C[0x4E12 ^ 0x4F0F] = 0xC0E ^ 0x4F0F;
                        render.indicatorY._1.C[0xEC00 ^ 0xED66] = 0xED58 ^ 0xED66;
                        render.indicatorY._1.C[0x2C1B ^ 0x2D30] = 0xD192 ^ 0x2D30;
                        render.indicatorY._1.C[0x5CC7 ^ 0x5C6F] = 0x466C ^ 0x5C6F;
                        render.indicatorY._1.C[0x7A7C ^ 0x7A81] = 0x756A ^ 0x7A81;
                        render.indicatorY._1.C[0x1E0 ^ 0xD5] = 0xD4 ^ 0xD5;
                        render.indicatorY._1.C[0x1072 ^ 0x1148] = 0xDA80 ^ 0x1148;
                        render.indicatorY._1.C[0x6FB2 ^ 0x6F98] = 0x1504 ^ 0x6F98;
                        render.indicatorY._1.C[0x4C6F ^ 0x4C64] = 0x4C4B ^ 0x4C64;
                        render.indicatorY._1.C[0x10BE4 ^ 0x10B76] = 0x1C8CB ^ 0x10B76;
                        render.indicatorY._1.C[0xE97B ^ 0xE9B0] = 0xC7C2 ^ 0xE9B0;
                        render.indicatorY._1.C[0x906C ^ 0x914D] = 0xED8A ^ 0x914D;
                        render.indicatorY._1.C[0x3FA0 ^ 0x3F60] = 0xFFFF0B5A ^ 0x3F60;
                        render.indicatorY._1.C[0xEEE2 ^ 0xEF6A] = 0x7617 ^ 0xEF6A;
                        render.indicatorY._1.C[0x326A ^ 0x32E0] = 0x7A9F ^ 0x32E0;
                        render.indicatorY._1.C[0xD820 ^ 0xD917] = 0xD905 ^ 0xD917;
                        render.indicatorY._1.C[0xE57A ^ 0xE444] = 0xF3D6 ^ 0xE444;
                        render.indicatorY._1.C[0x82DF ^ 0x83C1] = 0xFF03 ^ 0x83C1;
                        render.indicatorY._1.C[0x91E9 ^ 0x90A1] = 0x90B1 ^ 0x90A1;
                        render.indicatorY._1.C[0xE784 ^ 0xE6FE] = 0xE6FE ^ 0xE6FE;
                        render.indicatorY._1.C[0xECED ^ 0xED64] = 0x6349 ^ 0xED64;
                        render.indicatorY._1.C[0xB467 ^ 0xB43D] = 0xFFFF4BFA ^ 0xB43D;
                        render.indicatorY._1.C[0x2FCF ^ 0x2FD6] = 0x2FD6 ^ 0x2FD6;
                        render.indicatorY._1.C[0xF33E ^ 0xF351] = 0x5796 ^ 0xF351;
                        render.indicatorY._1.C[0xA882 ^ 0xA8E4] = 0xA881 ^ 0xA8E4;
                        render.indicatorY._1.C[0x6293 ^ 0x625C] = 0x9986 ^ 0x625C;
                        render.indicatorY._1.C[0x35CD ^ 0x34BD] = 0x81DF ^ 0x34BD;
                        render.indicatorY._1.C[0x9DCB ^ 0x9DC1] = 0x9DAD ^ 0x9DC1;
                        render.indicatorY._1.C[0x29CA ^ 0x28E0] = 0xD452 ^ 0x28E0;
                        render.indicatorY._1.C[0x106F6 ^ 0x106CE] = 0xFFFEF967 ^ 0x106CE;
                        render.indicatorY._1.C[0xDB63 ^ 0xDA00] = 0xDA05 ^ 0xDA00;
                        render.indicatorY._1.C[0x9EC6 ^ 0x9E39] = 0xD29 ^ 0x9E39;
                        render.indicatorY._1.C[0xA077 ^ 0xA005] = 0x4CF ^ 0xA005;
                        render.indicatorY._1.C[0xA31D ^ 0xA37C] = 0xA338 ^ 0xA37C;
                        render.indicatorY._1.C[0xA7C0 ^ 0xA6C6] = 0xED7B ^ 0xA6C6;
                        render.indicatorY._1.C[0xECA7 ^ 0xEDAB] = 0x33FC ^ 0xEDAB;
                        render.indicatorY._1.C[0xFB23 ^ 0xFB46] = 0xFFFF04AC ^ 0xFB46;
                        render.indicatorY._1.C[0x52F1 ^ 0x52FC] = 0x52EB ^ 0x52FC;
                        render.indicatorY._1.C[0xFA71 ^ 0xFB6D] = 0xB85F ^ 0xFB6D;
                        render.indicatorY._1.C[0xFF1A ^ 0xFFF4] = 0x51C0 ^ 0xFFF4;
                        render.indicatorY._1.C[0x8976 ^ 0x8875] = 0xDCC0 ^ 0x8875;
                        render.indicatorY._1.C[0x42E ^ 0x4CA] = 0xFFFF38F2 ^ 0x4CA;
                        render.indicatorY._1.C[0x1F3D ^ 0x1E40] = 0x1E43 ^ 0x1E40;
                        render.indicatorY._1.C[0x7265 ^ 0x733F] = 0x736A ^ 0x733F;
                        render.indicatorY._1.C[0x8A06 ^ 0x8ADF] = 0x4364 ^ 0x8ADF;
                        render.indicatorY._1.C[0x100A1 ^ 0x10010] = 0x1DB4E ^ 0x10010;
                        render.indicatorY._1.C[0x1DC6 ^ 0x1D74] = 0x5F42 ^ 0x1D74;
                        render.indicatorY._1.C[0xA6F1 ^ 0xA624] = 0x21AB ^ 0xA624;
                        render.indicatorY._1.C[0xD612 ^ 0xD707] = 0xACD9 ^ 0xD707;
                        render.indicatorY._1.C[0x2B5F ^ 0x2B21] = 0x587E ^ 0x2B21;
                        render.indicatorY._1.C[0xA92B ^ 0xA97C] = 0xFFFF56DE ^ 0xA97C;
                        render.indicatorY._1.C[0x70FE ^ 0x7088] = 0xA020 ^ 0x7088;
                        render.indicatorY._1.C[0x40BE ^ 0x40AE] = 0x40FE ^ 0x40AE;
                        render.indicatorY._1.C[0x10908 ^ 0x10985] = 0x18756 ^ 0x10985;
                        render.indicatorY._1.C[0xE33 ^ 0xEAE] = 0xFFFFCB64 ^ 0xEAE;
                        render.indicatorY._1.C[0xB2B8 ^ 0xB3F1] = 0xB3FD ^ 0xB3F1;
                        render.indicatorY._1.C[0x9B02 ^ 0x9BE2] = 0x93CE ^ 0x9BE2;
                        render.indicatorY._1.C[0xD353 ^ 0xD2D2] = 0x4392 ^ 0xD2D2;
                        render.indicatorY._1.C[0xD5AC ^ 0xD4A4] = 0xFFFF60D4 ^ 0xD4A4;
                        render.indicatorY._1.C[0xB559 ^ 0xB583] = 0x5FC4 ^ 0xB583;
                        render.indicatorY._1.C[0x4E9F ^ 0x4FA6] = 0x78C2 ^ 0x4FA6;
                        render.indicatorY._1.C[0xF85C ^ 0xF924] = 0x314B ^ 0xF924;
                        render.indicatorY._1.C[0x63FF ^ 0x63A0] = 0xFFFF9C2C ^ 0x63A0;
                        render.indicatorY._1.C[0x10C4E ^ 0x10DC5] = 0x16C6B ^ 0x10DC5;
                        render.indicatorY._1.C[0xF720 ^ 0xF7D5] = 0x5C01 ^ 0xF7D5;
                        render.indicatorY._1.C[0x6D9A ^ 0x6CC4] = 0xFFFF9376 ^ 0x6CC4;
                        render.indicatorY._1.C[0x51AD ^ 0x516C] = 0x9AE9 ^ 0x516C;
                        render.indicatorY._1.C[0x7283 ^ 0x7210] = 0x7236 ^ 0x7210;
                        render.indicatorY._1.C[0xFF09 ^ 0xFFD9] = 0x459 ^ 0xFFD9;
                        render.indicatorY._1.C[0x4BA7 ^ 0x4BA1] = 0x4B83 ^ 0x4BA1;
                        render.indicatorY._1.C[0x435D ^ 0x42D8] = 0x89AF ^ 0x42D8;
                        render.indicatorY._1.C[0x174E ^ 0x16CE] = 0x3E6E ^ 0x16CE;
                        render.indicatorY._1.C[0x1876 ^ 0x185E] = 0x444B ^ 0x185E;
                        render.indicatorY._1.C[0x8A0C ^ 0x8A29] = 0xBC98 ^ 0x8A29;
                        render.indicatorY._1.C[0x9DD2 ^ 0x9CBD] = 0xE91D ^ 0x9CBD;
                        render.indicatorY._1.C[0x5F9 ^ 0x5F5] = 0x5C0 ^ 0x5F5;
                        render.indicatorY._1.C[0xD04 ^ 0xD34] = 0xFFFFF2AE ^ 0xD34;
                        render.indicatorY._1.C[0x828F ^ 0x822F] = 0x6C6B ^ 0x822F;
                        render.indicatorY._1.C[0xA026 ^ 0xA0BA] = 0x9AD5 ^ 0xA0BA;
                        render.indicatorY._1.C[0x4F85 ^ 0x4FA5] = 0xA804 ^ 0x4FA5;
                        render.indicatorY._1.C[0x38BA ^ 0x39A0] = 0x7ABE ^ 0x39A0;
                        render.indicatorY._1.C[0x142B ^ 0x143E] = 0xFFFFEB28 ^ 0x143E;
                        render.indicatorY._1.C[0x101F2 ^ 0x1014E] = 0x19379 ^ 0x1014E;
                        render.indicatorY._1.C[0x7F55 ^ 0x7E00] = 0x7E0A ^ 0x7E00;
                        render.indicatorY._1.C[0xE7FB ^ 0xE72F] = 0xFFFF9F49 ^ 0xE72F;
                        render.indicatorY._1.C[0xD729 ^ 0xD73E] = 0xFFFF2898 ^ 0xD73E;
                        render.indicatorY._1.C[0xB3CC ^ 0xB372] = 0x78FF ^ 0xB372;
                        render.indicatorY._1.C[0xACB6 ^ 0xAC57] = 0xA40E ^ 0xAC57;
                        render.indicatorY._1.C[0xF6F ^ 0xE6E] = 0x9D7E ^ 0xE6E;
                        render.indicatorY._1.C[0xDA3F ^ 0xDA16] = 0x8420 ^ 0xDA16;
                        render.indicatorY._1.C[0x66F8 ^ 0x67D5] = 0x9B77 ^ 0x67D5;
                        render.indicatorY._1.C[0x15F0 ^ 0x14BF] = 0x14B1 ^ 0x14BF;
                        render.indicatorY._1.C[0x627B ^ 0x62B5] = 0x9972 ^ 0x62B5;
                        render.indicatorY._1.C[0xE54E ^ 0xE55A] = 0xFFFF1A9B ^ 0xE55A;
                        render.indicatorY._1.C[0x5184 ^ 0x50CE] = 0xFFFFAF23 ^ 0x50CE;
                        render.indicatorY._1.C[0xFAE3 ^ 0xFBC0] = 0xD6AC ^ 0xFBC0;
                        render.indicatorY._1.C[0xF846 ^ 0xF8B7] = 0x5681 ^ 0xF8B7;
                        render.indicatorY._1.C[0x75F6 ^ 0x74D9] = 0x4296 ^ 0x74D9;
                        render.indicatorY._1.C[0xFB68 ^ 0xFA24] = 0xFA19 ^ 0xFA24;
                        render.indicatorY._1.C[0xB5F7 ^ 0xB547] = 0x6E39 ^ 0xB547;
                        render.indicatorY._1.C[0x10E5F ^ 0x10E31] = 0x1FEB0 ^ 0x10E31;
                        render.indicatorY._1.C[0xB158 ^ 0xB015] = 0xB012 ^ 0xB015;
                        render.indicatorY._1.C[0xCED ^ 0xC77] = 0xC5D7 ^ 0xC77;
                        render.indicatorY._1.C[0x65B5 ^ 0x6503] = 0x16ED5 ^ 0x6503;
                        render.indicatorY._1.C[0x5C1 ^ 0x5C5] = 0xFFFFFA60 ^ 0x5C5;
                        render.indicatorY._1.C[0x31A5 ^ 0x319E] = 0xFFFFCE44 ^ 0x319E;
                        render.indicatorY._1.C[0x77DB ^ 0x77B2] = 0x77B2 ^ 0x77B2;
                        render.indicatorY._1.C[0xA0 ^ 0x7B] = 0xEA30 ^ 0x7B;
                        render.indicatorY._1.C[0x5FF2 ^ 0x5ECD] = 0x2F5F ^ 0x5ECD;
                        render.indicatorY._1.C[0x4DFB ^ 0x4D99] = 0x4DD5 ^ 0x4D99;
                        render.indicatorY._1.C[0x696D ^ 0x69D5] = 0x16203 ^ 0x69D5;
                        render.indicatorY._1.C[0x105CC ^ 0x1054B] = 0x14D3D ^ 0x1054B;
                        render.indicatorY._1.C[0xCCD ^ 0xC8F] = 0xCF2 ^ 0xC8F;
                        render.indicatorY._1.C[0x3FF2 ^ 0x3F02] = 0x911A ^ 0x3F02;
                        render.indicatorY._1.C[0x794C ^ 0x79EE] = 0x97AA ^ 0x79EE;
                        render.indicatorY._1.C[0x23BE ^ 0x22F5] = 0x22F3 ^ 0x22F5;
                        render.indicatorY._1.C[0xC47 ^ 0xCF3] = 0x4E9D ^ 0xCF3;
                        render.indicatorY._1.C[0x4785 ^ 0x46D9] = 0xFFFFB94A ^ 0x46D9;
                        render.indicatorY._1.C[0xE295 ^ 0xE2A4] = 0xE29D ^ 0xE2A4;
                        render.indicatorY._1.C[0xAF7 ^ 0xBD5] = 0x26A3 ^ 0xBD5;
                        render.indicatorY._1.C[0x790F ^ 0x7889] = 0xA022 ^ 0x7889;
                        render.indicatorY._1.C[0x9295 ^ 0x93BD] = 0x379F ^ 0x93BD;
                        render.indicatorY._1.C[0x1105 ^ 0x1072] = 0xF71E ^ 0x1072;
                        render.indicatorY._1.C[0xAC59 ^ 0xACF7] = 0x4AB1 ^ 0xACF7;
                        render.indicatorY._1.C[0xE219 ^ 0xE29C] = 0x2A5 ^ 0xE29C;
                        render.indicatorY._1.C[0x2FAF ^ 0x2EC8] = 0x2EC9 ^ 0x2EC8;
                        render.indicatorY._1.C[0x5B3E ^ 0x5A27] = 0x1C2C ^ 0x5A27;
                        render.indicatorY._1.C[0x7079 ^ 0x704C] = 0x703D ^ 0x704C;
                        render.indicatorY._1.C[0x1076A ^ 0x107C7] = 0x1E193 ^ 0x107C7;
                        render.indicatorY._1.C[0x3E18 ^ 0x3E60] = 0x2769 ^ 0x3E60;
                        render.indicatorY._1.C[0x40CD ^ 0x4083] = 0x408D ^ 0x4083;
                        render.indicatorY._1.C[0x9BC9 ^ 0x9B17] = 0x934A ^ 0x9B17;
                        render.indicatorY._1.C[0x424D ^ 0x4263] = 0xFFFFBDE5 ^ 0x4263;
                        render.indicatorY._1.C[0x41B1 ^ 0x4091] = 0xFFFFC3EE ^ 0x4091;
                        render.indicatorY._1.C[0x416E ^ 0x4039] = 0x403B ^ 0x4039;
                        render.indicatorY._1.C[0xD1CA ^ 0xD14E] = 0x3100 ^ 0xD14E;
                        render.indicatorY._1.C[0x1460 ^ 0x151E] = 0x151E ^ 0x151E;
                        render.indicatorY._1.C[0xD133 ^ 0xD1FE] = 0xFF8C ^ 0xD1FE;
                        render.indicatorY._1.C[0xDBEC ^ 0xDB3A] = 0x129D ^ 0xDB3A;
                        render.indicatorY._1.C[0x25A9 ^ 0x25D4] = 0x56E7 ^ 0x25D4;
                        render.indicatorY._1.C[0x7884 ^ 0x7820] = 0x9767 ^ 0x7820;
                        render.indicatorY._1.C[0x2052 ^ 0x2065] = 0x2014 ^ 0x2065;
                        render.indicatorY._1.C[0x66E0 ^ 0x67E2] = 0x334E ^ 0x67E2;
                        render.indicatorY._1.C[0xC7FD ^ 0xC701] = 0xC899 ^ 0xC701;
                        render.indicatorY._1.C[0x1007 ^ 0x116A] = 0x1169 ^ 0x116A;
                        render.indicatorY._1.C[0x2BB2 ^ 0x2A97] = 0x7FB ^ 0x2A97;
                        render.indicatorY._1.C[0x10A9E ^ 0x10A39] = 0x11034 ^ 0x10A39;
                        render.indicatorY._1.C[0x10A1B ^ 0x10AC4] = 0x1029D ^ 0x10AC4;
                        render.indicatorY._1.C[0x59A8 ^ 0x59B7] = 0x59DB ^ 0x59B7;
                        render.indicatorY._1.C[0xD334 ^ 0xD381] = 0x91B6 ^ 0xD381;
                        render.indicatorY._1.C[0x2E6B ^ 0x2F5F] = 0x2F5F ^ 0x2F5F;
                        render.indicatorY._1.C[0x84CF ^ 0x859B] = 0x85F8 ^ 0x859B;
                        render.indicatorY._1.C[0xDD28 ^ 0xDD9B] = 0x9FAC ^ 0xDD9B;
                        render.indicatorY._1.C[0x1016F ^ 0x101BC] = 0x18633 ^ 0x101BC;
                        render.indicatorY._1.C[0x79A1 ^ 0x7891] = 0x4EBF ^ 0x7891;
                        render.indicatorY._1.C[0xEBF0 ^ 0xEBF3] = 0xEB6B ^ 0xEBF3;
                        render.indicatorY._1.C[0x9151 ^ 0x9151] = 0x91D9 ^ 0x9151;
                        render.indicatorY._1.C[0x37DF ^ 0x3760] = 0xFCE5 ^ 0x3760;
                        render.indicatorY._1.C[0x4199 ^ 0x41D0] = 0x41D5 ^ 0x41D0;
                        render.indicatorY._1.C[0x1AEF ^ 0x1AAE] = 0x1ACA ^ 0x1AAE;
                        render.indicatorY._1.C[0x7E79 ^ 0x7F3E] = 0x7F3F ^ 0x7F3E;
                        render.indicatorY._1.C[0x10DF ^ 0x10F2] = 0x10F2 ^ 0x10F2;
                        render.indicatorY._1.C[0xFFCA ^ 0xFFE5] = 0xFFD1 ^ 0xFFE5;
                        render.indicatorY._1.C[0x2338 ^ 0x226B] = 0x2268 ^ 0x226B;
                        render.indicatorY._1.C[0x7E0A ^ 0x7F62] = 0xFFFF80DF ^ 0x7F62;
                        render.indicatorY._1.C[0xCA82 ^ 0xCA75] = 0x1B2D ^ 0xCA75;
                        render.indicatorY._1.C[0xB824 ^ 0xB93C] = 0xFFFF00A4 ^ 0xB93C;
                        render.indicatorY._1.C[0xCD6D ^ 0xCDE3] = 0x435B ^ 0xCDE3;
                        render.indicatorY._1.C[0x3533 ^ 0x3451] = 0xFFFFCBFC ^ 0x3451;
                        render.indicatorY._1.C[0x3AB0 ^ 0x3A52] = 0xF9B4 ^ 0x3A52;
                        render.indicatorY._1.C[0xB449 ^ 0xB4A1] = 0xFFFE4909 ^ 0xB4A1;
                        render.indicatorY._1.C[0x2925 ^ 0x29A9] = 0xA711 ^ 0x29A9;
                        render.indicatorY._1.C[0x33F2 ^ 0x32AF] = 0x32A2 ^ 0x32AF;
                        render.indicatorY._1.C[0xAAEE ^ 0xAA28] = 0x88F3 ^ 0xAA28;
                        render.indicatorY._1.C[0x2C0F ^ 0x2D4B] = 0x14D3 ^ 0x2D4B;
                        render.indicatorY._1.C[0x104F5 ^ 0x104CB] = 0x104A8 ^ 0x104CB;
                        render.indicatorY._1.C[0x4E72 ^ 0x4ED9] = 0xA89B ^ 0x4ED9;
                        render.indicatorY._1.C[0x740 ^ 0x716] = 0xFFFFF8A8 ^ 0x716;
                        render.indicatorY._1.C[0x14E0 ^ 0x145B] = 0x866E ^ 0x145B;
                        render.indicatorY._1.C[0xB416 ^ 0xB47D] = 0xB47C ^ 0xB47D;
                        render.indicatorY._1.C[0x8F7F ^ 0x8F65] = 0x8F64 ^ 0x8F65;
                        render.indicatorY._1.C[0x4D04 ^ 0x4C80] = 0xE6F7 ^ 0x4C80;
                        render.indicatorY._1.C[0x82C0 ^ 0x83AB] = 0x83A9 ^ 0x83AB;
                        render.indicatorY._1.C[0x4423 ^ 0x441A] = 0xFFFFBBCD ^ 0x441A;
                        render.indicatorY._1.C[0x7EB8 ^ 0x7FD2] = 0x7ED2 ^ 0x7FD2;
                        render.indicatorY._1.C[0xB600 ^ 0xB643] = 0xB672 ^ 0xB643;
                        render.indicatorY._1.C[0xE55B ^ 0xE45B] = 0x7759 ^ 0xE45B;
                        render.indicatorY._1.C[0x9EB8 ^ 0x9FB3] = 0x41B9 ^ 0x9FB3;
                        render.indicatorY._1.C[0x6E88 ^ 0x6E81] = 0x6E19 ^ 0x6E81;
                        render.indicatorY._1.C[0xCFDC ^ 0xCF26] = 0xC0C0 ^ 0xCF26;
                        render.indicatorY._1.C[0x51DE ^ 0x511A] = 0xFFFFB6EE ^ 0x511A;
                        render.indicatorY._1.C[0x3733 ^ 0x3615] = 0x924B ^ 0x3615;
                        render.indicatorY._1.C[0xA128 ^ 0xA103] = 0xF6BC ^ 0xA103;
                        render.indicatorY._1.C[0x10800 ^ 0x10813] = 0x10878 ^ 0x10813;
                        render.indicatorY._1.C[0x379E ^ 0x36DE] = 0xE40D ^ 0x36DE;
                        render.indicatorY._1.C[0xDA62 ^ 0xDA1B] = 0xFFFF3CA6 ^ 0xDA1B;
                        render.indicatorY._1.C[0x101EC ^ 0x101F2] = 0x101F2 ^ 0x101F2;
                        render.indicatorY._1.C[0x9A6D ^ 0x9AEF] = 0x8196 ^ 0x9AEF;
                        render.indicatorY._1.C[0x10D29 ^ 0x10D31] = 0x10D32 ^ 0x10D31;
                        render.indicatorY._1.C[0x6DE1 ^ 0x6CAF] = 0x6CD5 ^ 0x6CAF;
                        render.indicatorY._1.C[0x108E9 ^ 0x1087E] = 0x1C1D8 ^ 0x1087E;
                        render.indicatorY._1.C[0xBE37 ^ 0xBEFD] = 0x909B ^ 0xBEFD;
                        render.indicatorY._1.C[0x2D58 ^ 0x2D5A] = 0x2D27 ^ 0x2D5A;
                        render.indicatorY._1.C[0x52D8 ^ 0x535F] = 0xE63 ^ 0x535F;
                        render.indicatorY._1.C[0x3C46 ^ 0x3CD2] = 0x3CF6 ^ 0x3CD2;
                        render.indicatorY._1.C[0x107C4 ^ 0x10747] = 0x1E703 ^ 0x10747;
                        render.indicatorY._1.C[0xB3D2 ^ 0xB39E] = 0xFFFF4C5F ^ 0xB39E;
                        render.indicatorY._1.C[0x51C6 ^ 0x5157] = 0x92AD ^ 0x5157;
                        render.indicatorY._1.C[0xF56C ^ 0xF57D] = 0xF53A ^ 0xF57D;
                        render.indicatorY._1.C[0xED3 ^ 0xF85] = 0xFFE ^ 0xF85;
                        render.indicatorY._1.C[0xA720 ^ 0xA7CD] = 0xD576 ^ 0xA7CD;
                        render.indicatorY._1.C[0xCC2C ^ 0xCC10] = 0xCC1B ^ 0xCC10;
                        render.indicatorY._1.C[0x70B0 ^ 0x7133] = 0xC847 ^ 0x7133;
                        render.indicatorY._1.C[0xA6C8 ^ 0xA7A9] = 0xA7A1 ^ 0xA7A9;
                        render.indicatorY._1.C[0x8D8E ^ 0x8D89] = 0x8DD9 ^ 0x8D89;
                        render.indicatorY._1.C[0x10FFC ^ 0x10EBF] = 0x17D27 ^ 0x10EBF;
                        render.indicatorY._1.C[0x812D ^ 0x8162] = 0xFFFF7EA3 ^ 0x8162;
                        render.indicatorY._1.C[0xB384 ^ 0xB206] = 0xE535 ^ 0xB206;
                        render.indicatorY._1.C[0x3B53 ^ 0x3B52] = 0x3B58 ^ 0x3B52;
                        render.indicatorY._1.C[0x103E4 ^ 0x103E1] = 0x103DE ^ 0x103E1;
                        render.indicatorY._1.C[0x2C48 ^ 0x2D46] = 0xCD18 ^ 0x2D46;
                        render.indicatorY._1.C[0x2D25 ^ 0x2C0C] = 0x884C ^ 0x2C0C;
                        render.indicatorY._1.C[0x107C3 ^ 0x107AF] = 0x107AF ^ 0x107AF;
                        render.indicatorY._1.C[0xD9A6 ^ 0xD93D] = 0xE355 ^ 0xD93D;
                        render.indicatorY._1.C[0x7B5D ^ 0x7B1D] = 0x7B05 ^ 0x7B1D;
                        render.indicatorY._1.C[0xFDC5 ^ 0xFD5D] = 0x34FD ^ 0xFD5D;
                        render.indicatorY._1.C[0x1130 ^ 0x1046] = 0x71AF ^ 0x1046;
                        render.indicatorY._1.C[0x7258 ^ 0x734E] = 0x3542 ^ 0x734E;
                        render.indicatorY._1.C[0x2AEB ^ 0x2AB6] = 0xFFFFD553 ^ 0x2AB6;
                        render.indicatorY._1.C[0x947 ^ 0x9AD] = 0x7B18 ^ 0x9AD;
                        render.indicatorY._1.C[0x2209 ^ 0x2331] = 0x3FF1 ^ 0x2331;
                        render.indicatorY._1.C[0xBDE5 ^ 0xBD4C] = 0xA757 ^ 0xBD4C;
                        render.indicatorY._1.C[0x2F64 ^ 0x2E59] = 0x4528 ^ 0x2E59;
                        render.indicatorY._1.C[0x52ED ^ 0x53DE] = 0x53DE ^ 0x53DE;
                        render.indicatorY._1.C[0x2DE5 ^ 0x2D81] = 0x2DAE ^ 0x2D81;
                        render.indicatorY._1.C[0x5EB4 ^ 0x5E21] = 0x5E6C ^ 0x5E21;
                        render.indicatorY._1.C[0x82A3 ^ 0x838D] = 0xB5C9 ^ 0x838D;
                        render.indicatorY._1.C[0xC741 ^ 0xC767] = 0xB254 ^ 0xC767;
                        render.indicatorY._1.C[0x736A ^ 0x7311] = 0x4E ^ 0x7311;
                        render.indicatorY._1.C[0xB584 ^ 0xB490] = 0xFFFF30C0 ^ 0xB490;
                        render.indicatorY._1.C[0xC48E ^ 0xC481] = 0xFFFF3B68 ^ 0xC481;
                        render.indicatorY._1.C[0xB6BA ^ 0xB6E9] = 0xFFFF4964 ^ 0xB6E9;
                        render.indicatorY._1.C[0xE059 ^ 0xE13C] = 0xE13C ^ 0xE13C;
                        render.indicatorY._1.C[0x3D72 ^ 0x3C01] = 0x3EB2 ^ 0x3C01;
                        render.indicatorY._1.C[0xEBF ^ 0xE9E] = 0x8C53 ^ 0xE9E;
                        render.indicatorY._1.C[0x45DA ^ 0x45C7] = 0x45C7 ^ 0x45C7;
                    }
                });
            }
            var19_68 = v12;
            var20_52 = var18_65.getSize() * 0.84f;
            var21_54 = (var18_65.getSize() - var20_52) * 0.5f;
            var22_56 = var20_52 * 0.25f;
            RenderUtils.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).round(var22_56).draw(var18_65.getX() + 0.75f + var21_54, var19_68 + var21_54, var20_52, var20_52, var22_56, MenuStyle.INSTANCE.surface(var4_34));
        }
        var17_48 = MenuScreen.components;
        v13 = var63_33;
        var128_69 = MenuScreen.C[66];
        var128_69 ^= MenuScreen.C[67];
        var63_33 = v13 ^ (0L ^ v13) & -1L >>> (var128_69 ^= MenuScreen.C[68]);
        v14 = var57_30;
        var130_70 = MenuScreen.C[69];
        var130_70 -= MenuScreen.C[70];
        var57_30 = v14 ^ (0L ^ v14) & -1L << (var130_70 ^= MenuScreen.C[71]);
        var20_51 = var17_48.iterator();
        while (var20_51.hasNext()) {
            var21_53 = var20_51.next();
            var132_71 = MenuScreen.C[72];
            var132_71 ^= MenuScreen.C[73];
            v15 = (int)(var57_30 >>> (var132_71 += MenuScreen.C[74]));
            var57_30 += 0x100000000L;
            var134_72 = MenuScreen.C[75];
            var134_72 += MenuScreen.C[76];
            v16 = var49_26;
            var136_73 = MenuScreen.C[78];
            var136_73 += MenuScreen.C[79];
            var49_26 = v16 ^ ((long)v15 << (var134_72 += MenuScreen.C[77]) ^ v16) & -1L << (var136_73 -= MenuScreen.C[80]);
            var138_74 = MenuScreen.C[81];
            var138_74 -= MenuScreen.C[82];
            if ((int)(var49_26 >>> (var138_74 -= MenuScreen.C[83])) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            var140_75 = MenuScreen.C[84];
            var140_75 -= MenuScreen.C[85];
            var140_75 ^= MenuScreen.C[86];
            var23_81 = (SelectCategoryComponent)var21_53;
            var142_76 = MenuScreen.C[87];
            var142_76 += MenuScreen.C[88];
            v17 = var53_28;
            var144_77 = MenuScreen.C[90];
            var144_77 += MenuScreen.C[91];
            var53_28 = v17 ^ ((long)((int)(var49_26 >>> var140_75)) << (var142_76 += MenuScreen.C[89]) ^ v17) & -1L << (var144_77 -= MenuScreen.C[92]);
            v18 = var51_27;
            var146_78 = MenuScreen.C[93];
            var146_78 -= MenuScreen.C[94];
            var51_27 = v18 ^ (0L ^ v18) & -1L >>> (var146_78 ^= MenuScreen.C[95]);
            var148_79 = MenuScreen.C[96];
            var148_79 ^= MenuScreen.C[97];
            var26_82 = var14_45.categorySlot((int)(var53_28 >>> (var148_79 ^= MenuScreen.C[98])), var23_81.getPadding());
            var23_81.setAlpha(var4_34);
            var23_81.setX(var26_82.getX());
            var23_81.setY(var26_82.getY());
            var23_81.setWidth(var26_82.getSize());
            var23_81.setHeight(var26_82.getSize());
            var150_80 = MenuScreen.C[99];
            var150_80 -= MenuScreen.C[100];
            var23_81.render((int)var61_32, (int)(var63_33 >>> (var150_80 -= MenuScreen.C[101])), partialTicks);
        }
        var17_48 = null;
        v19 = var63_33;
        var152_83 = MenuScreen.C[102];
        var152_83 += MenuScreen.C[103];
        var63_33 = v19 ^ (0L ^ v19) & -1L >>> (var152_83 -= MenuScreen.C[104]);
        v20 = var57_30;
        var154_84 = MenuScreen.C[105];
        var154_84 -= MenuScreen.C[106];
        v21 = var57_30 = v20 ^ (0L ^ v20) & -1L << (var154_84 ^= MenuScreen.C[107]);
        var156_85 = MenuScreen.C[108];
        var156_85 ^= MenuScreen.C[109];
        var57_30 = v21 ^ (0L ^ v21) & -1L >>> (var156_85 += MenuScreen.C[110]);
        v22 = var8_39;
        if (v22 != null) {
            var22_55 = v22;
            v23 = var59_31;
            var158_86 = MenuScreen.C[111];
            var158_86 ^= MenuScreen.C[112];
            var59_31 = v23 ^ (0L ^ v23) & -1L << (var158_86 += MenuScreen.C[113]);
            if ((int)var59_31 != 0) {
                if (MenuScreen.draggingScrollBar && MenuScreen.categoryContentAlpha > 0.5f) {
                    var160_87 = MenuScreen.C[114];
                    var160_87 ^= MenuScreen.C[115];
                    MenuScreen.INSTANCE.applyScrollBarDrag((Function2<Float, Boolean, Unit>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, render$lambda$2$0(float boolean ), (Ljava/lang/Float;Ljava/lang/Boolean;)Lkotlin/Unit;)(), (int)(var63_33 >>> (var160_87 -= MenuScreen.C[116])));
                }
                MenuScreen.configsCategoryComponent.setAlpha(MenuScreen.categoryContentAlpha * var4_34);
                MenuScreen.configsCategoryComponent.setX(MenuScreen.INSTANCE.getX());
                MenuScreen.configsCategoryComponent.setY(MenuScreen.INSTANCE.getY() + var15_47);
                MenuScreen.configsCategoryComponent.setWidth(MenuScreen.INSTANCE.getWidth());
                MenuScreen.configsCategoryComponent.setHeight(MenuScreen.INSTANCE.getHeight());
                var162_88 = MenuScreen.C[117];
                var162_88 ^= MenuScreen.C[118];
                MenuScreen.configsCategoryComponent.render((int)var61_32, (int)(var63_33 >>> (var162_88 += MenuScreen.C[119])), partialTicks);
                v24 = var63_33;
                var164_89 = MenuScreen.C[120];
                var164_89 -= MenuScreen.C[121];
                var63_33 = v24 ^ (1L ^ v24) & -1L >>> (var164_89 -= MenuScreen.C[122]);
            } else if ((int)var29_16 != 0) {
                if (MenuScreen.draggingScrollBar && MenuScreen.categoryContentAlpha > 0.5f) {
                    var166_90 = MenuScreen.C[123];
                    var166_90 ^= MenuScreen.C[124];
                    MenuScreen.INSTANCE.applyScrollBarDrag((Function2<Float, Boolean, Unit>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, render$lambda$2$1(float boolean ), (Ljava/lang/Float;Ljava/lang/Boolean;)Lkotlin/Unit;)(), (int)(var63_33 >>> (var166_90 += MenuScreen.C[125])));
                }
                MenuScreen.eventsCategoryComponent.setAlpha(MenuScreen.categoryContentAlpha * var4_34);
                MenuScreen.eventsCategoryComponent.setX(MenuScreen.INSTANCE.getX());
                MenuScreen.eventsCategoryComponent.setY(MenuScreen.INSTANCE.getY() + var15_47);
                MenuScreen.eventsCategoryComponent.setWidth(MenuScreen.INSTANCE.getWidth());
                MenuScreen.eventsCategoryComponent.setHeight(MenuScreen.INSTANCE.getHeight());
                var168_91 = MenuScreen.C[126];
                var168_91 ^= MenuScreen.C[127];
                MenuScreen.eventsCategoryComponent.render((int)var61_32, (int)(var63_33 >>> (var168_91 ^= MenuScreen.C[128])), partialTicks);
            } else if ((int)var33_18 != 0) {
                if (MenuScreen.draggingScrollBar && MenuScreen.categoryContentAlpha > 0.5f) {
                    var170_92 = MenuScreen.C[129];
                    var170_92 ^= MenuScreen.C[130];
                    MenuScreen.INSTANCE.applyScrollBarDrag((Function2<Float, Boolean, Unit>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, render$lambda$2$2(float boolean ), (Ljava/lang/Float;Ljava/lang/Boolean;)Lkotlin/Unit;)(), (int)(var63_33 >>> (var170_92 ^= MenuScreen.C[131])));
                }
                MenuScreen.pointsCategoryComponent.setAlpha(MenuScreen.categoryContentAlpha * var4_34);
                MenuScreen.pointsCategoryComponent.setX(MenuScreen.INSTANCE.getX());
                MenuScreen.pointsCategoryComponent.setY(MenuScreen.INSTANCE.getY() + var15_47);
                MenuScreen.pointsCategoryComponent.setWidth(MenuScreen.INSTANCE.getWidth());
                MenuScreen.pointsCategoryComponent.setHeight(MenuScreen.INSTANCE.getHeight());
                var172_93 = MenuScreen.C[132];
                var172_93 -= MenuScreen.C[133];
                MenuScreen.pointsCategoryComponent.render((int)var61_32, (int)(var63_33 >>> (var172_93 -= MenuScreen.C[134])), partialTicks);
                v25 = var57_30;
                var174_94 = MenuScreen.C[135];
                var174_94 ^= MenuScreen.C[136];
                var57_30 = v25 ^ (0x100000000L ^ v25) & -1L << (var174_94 += MenuScreen.C[137]);
            } else if ((int)var31_17 != 0) {
                if (MenuScreen.draggingScrollBar && MenuScreen.categoryContentAlpha > 0.5f) {
                    var176_95 = MenuScreen.C[138];
                    var176_95 += MenuScreen.C[139];
                    MenuScreen.INSTANCE.applyScrollBarDrag((Function2<Float, Boolean, Unit>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, render$lambda$2$3(float boolean ), (Ljava/lang/Float;Ljava/lang/Boolean;)Lkotlin/Unit;)(), (int)(var63_33 >>> (var176_95 ^= MenuScreen.C[140])));
                }
                MenuScreen.friendsCategoryComponent.setAlpha(MenuScreen.categoryContentAlpha * var4_34);
                MenuScreen.friendsCategoryComponent.setX(MenuScreen.INSTANCE.getX());
                MenuScreen.friendsCategoryComponent.setY(MenuScreen.INSTANCE.getY() + var15_47);
                MenuScreen.friendsCategoryComponent.setWidth(MenuScreen.INSTANCE.getWidth());
                MenuScreen.friendsCategoryComponent.setHeight(MenuScreen.INSTANCE.getHeight());
                var178_96 = MenuScreen.C[141];
                var178_96 -= MenuScreen.C[142];
                MenuScreen.friendsCategoryComponent.render((int)var61_32, (int)(var63_33 >>> (var178_96 += MenuScreen.C[143])), partialTicks);
                v26 = var57_30;
                var180_97 = MenuScreen.C[144];
                var180_97 ^= MenuScreen.C[145];
                var57_30 = v26 ^ (1L ^ v26) & -1L >>> (var180_97 += MenuScreen.C[146]);
            } else {
                v27 = MenuScreen.categoryComponents.get(var22_55);
                if (v27 != null) {
                    var24_98 = v27;
                    if (MenuScreen.draggingScrollBar && MenuScreen.categoryContentAlpha > 0.5f) {
                        var182_99 = MenuScreen.C[147];
                        var182_99 += MenuScreen.C[148];
                        MenuScreen.INSTANCE.applyScrollBarDrag((Function2<Float, Boolean, Unit>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, render$lambda$2$4(kotakbaz.rain.ui.menu.CategoryComponent float boolean ), (Ljava/lang/Float;Ljava/lang/Boolean;)Lkotlin/Unit;)((CategoryComponent)var24_98), (int)(var63_33 >>> (var182_99 ^= MenuScreen.C[149])));
                    }
                    var24_98.setAlpha(MenuScreen.categoryContentAlpha * var4_34);
                    var24_98.setX(MenuScreen.INSTANCE.getX());
                    var24_98.setY(MenuScreen.INSTANCE.getY() + var15_47);
                    var24_98.setWidth(MenuScreen.INSTANCE.getWidth());
                    var24_98.setHeight(MenuScreen.INSTANCE.getHeight());
                    var184_100 = MenuScreen.C[150];
                    var184_100 -= MenuScreen.C[151];
                    var24_98.render((int)var61_32, (int)(var63_33 >>> (var184_100 += MenuScreen.C[152])), partialTicks);
                    var17_48 = var24_98;
                }
            }
        }
        var21_53 = this.currentTopBarCategory(var8_39);
        v28 = this.currentTopBarText(var8_39);
        if (!MenuScreen.topBarTextSelected) ** GOTO lbl-1000
        if (((CharSequence)this.currentTopBarText(var8_39)).length() > 0) {
            var186_101 = MenuScreen.C[153];
            var186_101 -= MenuScreen.C[154];
            v29 = var186_101 += MenuScreen.C[155];
        } else {
            var188_102 = MenuScreen.C[156];
            var188_102 -= MenuScreen.C[157];
            v29 = var188_102 ^= MenuScreen.C[158];
        }
        if (v29 != 0) {
            var190_103 = MenuScreen.C[159];
            var190_103 ^= MenuScreen.C[160];
            v30 = var190_103 -= MenuScreen.C[161];
        } else lbl-1000:
        // 2 sources

        {
            var192_104 = MenuScreen.C[162];
            var192_104 ^= MenuScreen.C[163];
            v30 = var192_104 += MenuScreen.C[164];
        }
        MenuScreen.topBarRenderer.render(var14_45, (Category)var21_53, v28, MenuScreen.searchFocused, (boolean)v30, var5_35, (boolean)var59_31, this.canCreateConfig(), var4_34);
        var194_105 = MenuScreen.C[165];
        var194_105 ^= MenuScreen.C[166];
        MenuScreen.scrollBarState = (int)(var57_30 >>> (var194_105 -= MenuScreen.C[167])) != 0 ? MenuScreen.scrollBarRenderer.render(var14_45, MenuScreen.pointsCategoryComponent.scrollContentHeight(), MenuScreen.pointsCategoryComponent.scrollViewHeight(), MenuScreen.pointsCategoryComponent.scrollOffsetValue(), MenuScreen.categoryContentAlpha * var4_34) : ((int)var57_30 != 0 ? MenuScreen.scrollBarRenderer.render(var14_45, MenuScreen.friendsCategoryComponent.scrollContentHeight(), MenuScreen.friendsCategoryComponent.scrollViewHeight(), MenuScreen.friendsCategoryComponent.scrollOffsetValue(), MenuScreen.categoryContentAlpha * var4_34) : ((int)var63_33 != 0 ? MenuScreen.scrollBarRenderer.render(var14_45, MenuScreen.configsCategoryComponent.scrollContentHeight(), MenuScreen.configsCategoryComponent.scrollViewHeight(), MenuScreen.configsCategoryComponent.scrollOffsetValue(), MenuScreen.categoryContentAlpha * var4_34) : ((int)var29_16 != 0 ? MenuScreen.scrollBarRenderer.render(var14_45, MenuScreen.eventsCategoryComponent.scrollContentHeight(), MenuScreen.eventsCategoryComponent.scrollViewHeight(), MenuScreen.eventsCategoryComponent.scrollOffsetValue(), MenuScreen.categoryContentAlpha * var4_34) : (var17_48 != null ? MenuScreen.scrollBarRenderer.render(var14_45, var17_48.scrollContentHeight(), var17_48.scrollViewHeight(), var17_48.scrollOffsetValue(), MenuScreen.categoryContentAlpha * var4_34) : MenuScreen.scrollBarRenderer.render(var14_45, 0.0f, 0.0f, 0.0f, MenuScreen.categoryContentAlpha * var4_34)))));
        MatrixControl.INSTANCE.popMatrix();
        this.renderAvatarPopup(var14_45, var4_34, var5_35, mouseX, mouseY);
    }

    @Override
    public void onMouseClick(int mouseX, int mouseY, int button) {
        block49: {
            Object object;
            Category category;
            long l2;
            long l3;
            long l4;
            block52: {
                long l5;
                block51: {
                    block50: {
                        block48: {
                            Object object2;
                            Object object3;
                            Object object4;
                            int n2;
                            int n3;
                            long l6 = 6183297217341303687L;
                            long l7 = -531747370765350825L;
                            long l8 = 8631783488605387429L;
                            long l9 = 8127827188565385216L;
                            long l10 = 1444899609973543143L;
                            l4 = -1135203757824015689L;
                            long l11 = 223892884630186691L;
                            long l12 = 6932624584900763365L;
                            long l13 = -1691478734022066938L;
                            long l14 = -6480134043655286162L;
                            long l15 = 5350186154536574179L;
                            long l16 = 1249615897732326109L;
                            long l17 = -7983925624336722610L;
                            long l18 = 7084784351202755807L;
                            long l19 = -2406506968958435958L;
                            long l20 = 6274089922521360117L;
                            long l21 = 7615464032094561537L;
                            long l22 = 911194172157064037L;
                            long l23 = -1388681027510491053L;
                            long l24 = 4771622077929176433L;
                            l3 = -3408580717333265488L;
                            l5 = -6969006683396321845L;
                            l2 = -972845955471608214L;
                            super.onMouseClick(mouseX, mouseY, button);
                            if (closing) {
                                return;
                            }
                            int n4 = C[168];
                            n4 += C[169];
                            float f2 = MenuScreen.currentScale$default(this, 0.0f, n4 -= C[170], null);
                            long l25 = l3;
                            int n5 = C[171];
                            n5 += C[172];
                            l3 = l25 ^ ((long)this.unscaleMouseX(mouseX, f2) ^ l25) & -1L >>> (n5 ^= C[173]);
                            int n6 = C[174];
                            n6 += C[175];
                            long l26 = l2;
                            int n7 = C[177];
                            n7 += C[178];
                            l2 = l26 ^ ((long)this.unscaleMouseY(mouseY, f2) << (n6 ^= C[176]) ^ l26) & -1L << (n7 += C[179]);
                            SelectCategoryComponent selectCategoryComponent = CollectionsKt.firstOrNull(components);
                            float f3 = selectCategoryComponent != null ? selectCategoryComponent.getPadding() : uiPadding;
                            category = categoryTransition.getCurrent();
                            int n8 = C[180];
                            n8 += C[181];
                            long l27 = l24;
                            int n9 = C[183];
                            n9 += C[184];
                            l24 = l27 ^ ((long)this.isConfigCategory(category) << (n8 += C[182]) ^ l27) & -1L << (n9 ^= C[185]);
                            int n10 = C[186];
                            n10 -= C[187];
                            long l28 = l3;
                            int n11 = C[189];
                            n11 -= C[190];
                            l3 = l28 ^ ((long)this.isEventsCategory(category) << (n10 ^= C[188]) ^ l28) & -1L << (n11 -= C[191]);
                            long l29 = l2;
                            int n12 = C[192];
                            n12 -= C[193];
                            l2 = l29 ^ ((long)this.isPointsCategory(category) ^ l29) & -1L >>> (n12 -= C[194]);
                            long l30 = l5;
                            int n13 = C[195];
                            n13 ^= C[196];
                            l5 = l30 ^ ((long)this.isFriendsCategory(category) ^ l30) & -1L >>> (n13 -= C[197]);
                            int n14 = C[198];
                            n14 -= C[199];
                            MenuLayout menuLayout = new MenuLayout(this.getX(), this.getY(), this.getWidth(), this.getHeight(), this.getPanelWidth(), uiPadding, topBarHeight, f3, components.size(), (boolean)(l24 >>> (n14 += C[200])), (boolean)l2);
                            float f4 = (int)l3;
                            int n15 = C[201];
                            n15 -= C[202];
                            float f5 = (int)(l2 >>> (n15 ^= C[203]));
                            int n16 = C[204];
                            n16 ^= C[205];
                            n16 -= C[206];
                            int n17 = C[207];
                            n17 -= C[208];
                            long l31 = l15;
                            int n18 = C[210];
                            n18 ^= C[211];
                            l15 = l31 ^ ((long)menuLayout.isInsideTopBarSearchInput(f4, f5, (boolean)(l24 >>> n16)) << (n17 ^= C[209]) ^ l31) & -1L << (n18 += C[212]);
                            int n19 = C[213];
                            n19 ^= C[214];
                            if ((int)(l24 >>> (n19 ^= C[215])) != 0 && menuLayout.isInsideTopBarSearchAction(f4, f5)) {
                                int n20 = C[216];
                                n20 ^= C[217];
                                n3 = n20 ^= C[218];
                            } else {
                                int n21 = C[219];
                                n21 += C[220];
                                n3 = n21 ^= C[221];
                            }
                            long l32 = l14;
                            int n22 = C[222];
                            n22 += C[223];
                            l14 = l32 ^ ((long)n3 ^ l32) & -1L >>> (n22 += C[224]);
                            int n23 = C[225];
                            n23 -= C[226];
                            if ((int)(l24 >>> (n23 += C[227])) != 0 && menuLayout.isInsideTopBarFolderAction(f4, f5)) {
                                int n24 = C[228];
                                n24 -= C[229];
                                n2 = n24 += C[230];
                            } else {
                                int n25 = C[231];
                                n25 -= C[232];
                                n2 = n25 ^= C[233];
                            }
                            int n26 = C[234];
                            n26 -= C[235];
                            long l33 = l14;
                            int n27 = C[237];
                            n27 -= C[238];
                            l14 = l33 ^ ((long)n2 << (n26 -= C[236]) ^ l33) & -1L << (n27 += C[239]);
                            if (button == 0) {
                                if (this.avatarBounds(menuLayout).contains(f4, f5)) {
                                    int n28;
                                    if (!avatarPopupOpen) {
                                        int n29 = C[240];
                                        n29 += C[241];
                                        n28 = n29 -= C[242];
                                    } else {
                                        int n30 = C[243];
                                        n30 -= C[244];
                                        n28 = n30 -= C[245];
                                    }
                                    avatarPopupOpen = n28;
                                    int n31 = C[246];
                                    n31 ^= C[247];
                                    searchFocused = n31 -= C[248];
                                    int n32 = C[249];
                                    n32 ^= C[250];
                                    topBarTextSelected = n32 += C[251];
                                    this.clearCategoryInputFocus();
                                    return;
                                }
                                if (avatarPopupOpen) {
                                    object4 = this.avatarPopupMetrics(f2);
                                    object = this.avatarPopupBounds(menuLayout, f2, (AvatarPopupMetrics)object4);
                                    if (this.avatarPopupCloseBounds((PopupRect)object, (AvatarPopupMetrics)object4).contains(mouseX, mouseY)) {
                                        int n33 = C[252];
                                        n33 ^= C[253];
                                        avatarPopupOpen = n33 -= C[254];
                                        int n34 = C[255];
                                        n34 += C[256];
                                        draggingAvatarPopupGuiScale = n34 += C[257];
                                        avatarPopupGuiScaleDragProgress = null;
                                        int n35 = C[258];
                                        n35 ^= C[259];
                                        draggingAvatarPopupHudScale = n35 += C[260];
                                        avatarPopupHudScaleDragProgress = null;
                                        return;
                                    }
                                    if (this.tryStartAvatarPopupGuiScaleDrag((PopupRect)object, (AvatarPopupMetrics)object4, mouseX, mouseY)) {
                                        return;
                                    }
                                    if (this.tryStartAvatarPopupHudScaleDrag((PopupRect)object, (AvatarPopupMetrics)object4, mouseX, mouseY)) {
                                        return;
                                    }
                                    if (this.avatarPopupGuiBackgroundBounds((PopupRect)object, (AvatarPopupMetrics)object4).contains(mouseX, mouseY)) {
                                        ClickGuiSettings.INSTANCE.toggleGuiBackground();
                                        return;
                                    }
                                    if (this.avatarPopupInfoActionBounds((PopupRect)object, (AvatarPopupMetrics)object4).contains(mouseX, mouseY)) {
                                        this.openRainVisualsSite();
                                        return;
                                    }
                                    if (((PopupRect)object).contains(mouseX, mouseY)) {
                                        return;
                                    }
                                    int n36 = C[261];
                                    n36 -= C[262];
                                    draggingAvatarPopupGuiScale = n36 += C[263];
                                    avatarPopupGuiScaleDragProgress = null;
                                    int n37 = C[264];
                                    n37 -= C[265];
                                    draggingAvatarPopupHudScale = n37 -= C[266];
                                    avatarPopupHudScaleDragProgress = null;
                                    int n38 = C[267];
                                    n38 += C[268];
                                    avatarPopupOpen = n38 += C[269];
                                }
                                int n39 = C[270];
                                n39 += C[271];
                                if ((int)(l14 >>> (n39 -= C[272])) != 0) {
                                    int n40 = C[273];
                                    n40 += C[274];
                                    searchFocused = n40 ^= C[275];
                                    int n41 = C[276];
                                    n41 -= C[277];
                                    topBarTextSelected = n41 ^= C[278];
                                    this.clearCategoryInputFocus();
                                    this.openConfigFolder();
                                    return;
                                }
                                if ((int)l14 != 0) {
                                    int n42 = C[279];
                                    n42 ^= C[280];
                                    searchFocused = n42 -= C[281];
                                    int n43 = C[282];
                                    n43 -= C[283];
                                    topBarTextSelected = n43 += C[284];
                                    this.clearCategoryInputFocus();
                                    this.createConfigFromInput();
                                    return;
                                }
                                int n44 = C[285];
                                n44 ^= C[286];
                                searchFocused = (int)(l15 >>> (n44 += C[287]));
                                int n45 = C[288];
                                n45 ^= C[289];
                                topBarTextSelected = n45 -= C[290];
                                int n46 = C[291];
                                n46 -= C[292];
                                if ((int)(l15 >>> (n46 ^= C[293])) != 0) {
                                    this.clearCategoryInputFocus();
                                    return;
                                }
                            }
                            object4 = components;
                            long l34 = l16;
                            int n47 = C[294];
                            n47 -= C[295];
                            l16 = l34 ^ (0L ^ l34) & -1L << (n47 += C[296]);
                            Object object5 = object4.iterator();
                            while (object5.hasNext()) {
                                object3 = object5.next();
                                object2 = (SelectCategoryComponent)object3;
                                long l35 = l19;
                                int n48 = C[297];
                                n48 += C[298];
                                l19 = l35 ^ (0L ^ l35) & -1L << (n48 += C[299]);
                                if (!((float)((int)l3) >= ((UIComponent)object2).getX()) || !((float)((int)l3) <= ((UIComponent)object2).getX() + ((UIComponent)object2).getWidth())) continue;
                                int n49 = C[300];
                                n49 -= C[301];
                                if (!((float)((int)(l2 >>> (n49 += C[302]))) >= ((UIComponent)object2).getY())) continue;
                                int n50 = C[303];
                                n50 -= C[304];
                                if (!((float)((int)(l2 >>> (n50 -= C[305]))) <= ((UIComponent)object2).getY() + ((UIComponent)object2).getHeight())) continue;
                                if (categoryTransition.select(((SelectCategoryComponent)object2).getCategory())) {
                                    if (INSTANCE.isConfigCategory(((SelectCategoryComponent)object2).getCategory())) {
                                        configsCategoryComponent.resetScroll();
                                    } else if (INSTANCE.isEventsCategory(((SelectCategoryComponent)object2).getCategory())) {
                                        eventsCategoryComponent.resetScroll();
                                    } else if (INSTANCE.isPointsCategory(((SelectCategoryComponent)object2).getCategory())) {
                                        pointsCategoryComponent.resetScroll();
                                    } else if (INSTANCE.isFriendsCategory(((SelectCategoryComponent)object2).getCategory())) {
                                        friendsCategoryComponent.resetScroll();
                                    } else {
                                        CategoryComponent categoryComponent = categoryComponents.get(((SelectCategoryComponent)object2).getCategory());
                                        if (categoryComponent != null) {
                                            categoryComponent.resetScroll();
                                        }
                                    }
                                    INSTANCE.clearCategoryInputFocus();
                                    int n51 = C[306];
                                    n51 += C[307];
                                    draggingScrollBar = n51 ^= C[308];
                                    scrollBarGrabOffset = 0.0f;
                                }
                                return;
                            }
                            if (button == 0 && categoryContentAlpha > 0.5f) {
                                FriendsCategoryComponent friendsCategoryComponent;
                                CategoryComponent categoryComponent;
                                object4 = scrollBarState;
                                Category category2 = category;
                                if (category2 != null) {
                                    object5 = category2;
                                    object3 = categoryComponents;
                                    object2 = object5;
                                    long l36 = l19;
                                    int n52 = C[309];
                                    n52 ^= C[310];
                                    l19 = l36 ^ (0L ^ l36) & -1L << (n52 -= C[311]);
                                    categoryComponent = (CategoryComponent)object3.get(object2);
                                } else {
                                    categoryComponent = null;
                                }
                                object = categoryComponent;
                                int n53 = C[312];
                                n53 ^= C[313];
                                object5 = (int)(l24 >>> (n53 += C[314])) != 0 ? configsCategoryComponent : null;
                                int n54 = C[315];
                                n54 += C[316];
                                object3 = (int)(l3 >>> (n54 -= C[317])) != 0 ? eventsCategoryComponent : null;
                                object2 = (int)l2 != 0 ? pointsCategoryComponent : null;
                                FriendsCategoryComponent friendsCategoryComponent2 = friendsCategoryComponent = (int)l5 != 0 ? MenuScreen.friendsCategoryComponent : null;
                                if (object4 != null && (object != null || object5 != null || object3 != null || object2 != null || friendsCategoryComponent != null) && ((MenuScrollBarRenderer.State)object4).contains(f4, f5)) {
                                    float f6;
                                    if (((MenuScrollBarRenderer.State)object4).getCanScroll() && (f6 = RangesKt.coerceAtLeast(((MenuScrollBarRenderer.State)object4).getTrackHeight() - ((MenuScrollBarRenderer.State)object4).getThumbHeight(), 0.0f)) > 0.0f) {
                                        if (((MenuScrollBarRenderer.State)object4).thumbContains(f4, f5)) {
                                            int n55 = C[318];
                                            n55 += C[319];
                                            draggingScrollBar = n55 ^= C[320];
                                            scrollBarGrabOffset = RangesKt.coerceIn(f5 - ((MenuScrollBarRenderer.State)object4).getThumbY(), 0.0f, ((MenuScrollBarRenderer.State)object4).getThumbHeight());
                                        } else {
                                            float f7 = RangesKt.coerceIn(f5 - ((MenuScrollBarRenderer.State)object4).getTrackY() - ((MenuScrollBarRenderer.State)object4).getThumbHeight() * 0.5f, 0.0f, f6);
                                            Object object6 = object5;
                                            if (object6 != null) {
                                                boolean bl = C[321];
                                                bl += C[322];
                                                ((ConfigsCategoryComponent)object6).setScrollProgress(f7 / f6, bl ^= C[323]);
                                            } else {
                                                Object object7 = object3;
                                                if (object7 != null) {
                                                    boolean bl = C[324];
                                                    bl += C[325];
                                                    ((EventsCategoryComponent)object7).setScrollProgress(f7 / f6, bl ^= C[326]);
                                                } else {
                                                    Object object8 = object2;
                                                    if (object8 != null) {
                                                        boolean bl = C[327];
                                                        bl ^= C[328];
                                                        ((PointsCategoryComponent)object8).setScrollProgress(f7 / f6, bl ^= C[329]);
                                                    } else {
                                                        FriendsCategoryComponent friendsCategoryComponent3 = friendsCategoryComponent;
                                                        if (friendsCategoryComponent3 != null) {
                                                            boolean bl = C[330];
                                                            bl ^= C[331];
                                                            friendsCategoryComponent3.setScrollProgress(f7 / f6, bl -= C[332]);
                                                        } else {
                                                            Object object9 = object;
                                                            if (object9 != null) {
                                                                boolean bl = C[333];
                                                                bl -= C[334];
                                                                ((CategoryComponent)object9).setScrollProgress(f7 / f6, bl += C[335]);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            int n56 = C[336];
                                            n56 -= C[337];
                                            draggingScrollBar = n56 -= C[338];
                                            scrollBarGrabOffset = ((MenuScrollBarRenderer.State)object4).getThumbHeight() * 0.5f;
                                        }
                                    }
                                    return;
                                }
                            }
                            if (categoryContentAlpha <= 0.5f) {
                                return;
                            }
                            int n57 = C[339];
                            n57 ^= C[340];
                            if ((int)(l24 >>> (n57 -= C[341])) == 0) break block48;
                            int n58 = C[342];
                            n58 += C[343];
                            configsCategoryComponent.onMouseClick((int)l3, (int)(l2 >>> (n58 += C[344])), button);
                            break block49;
                        }
                        int n59 = C[345];
                        n59 ^= C[346];
                        if ((int)(l3 >>> (n59 -= C[347])) == 0) break block50;
                        int n60 = C[348];
                        n60 ^= C[349];
                        eventsCategoryComponent.onMouseClick((int)l3, (int)(l2 >>> (n60 ^= C[350])), button);
                        break block49;
                    }
                    if ((int)l2 == 0) break block51;
                    int n61 = C[351];
                    n61 ^= C[352];
                    pointsCategoryComponent.onMouseClick((int)l3, (int)(l2 >>> (n61 ^= C[353])), button);
                    break block49;
                }
                if ((int)l5 == 0) break block52;
                int n62 = C[354];
                n62 += C[355];
                friendsCategoryComponent.onMouseClick((int)l3, (int)(l2 >>> (n62 ^= C[356])), button);
                break block49;
            }
            Category category3 = category;
            if (category3 == null) break block49;
            object = category3;
            long l37 = l4;
            int n63 = C[357];
            n63 ^= C[358];
            l4 = l37 ^ (0L ^ l37) & -1L >>> (n63 ^= C[359]);
            CategoryComponent categoryComponent = categoryComponents.get(object);
            if (categoryComponent != null) {
                int n64 = C[360];
                n64 ^= C[361];
                categoryComponent.onMouseClick((int)l3, (int)(l2 >>> (n64 ^= C[362])), button);
            }
        }
    }

    @Override
    public void onMouseScroll(int mouseX, int mouseY, float vertical) {
        block14: {
            float f2;
            float f3;
            MenuScrollBarRenderer.State state2;
            Category category;
            long l2;
            long l3;
            block17: {
                long l4;
                block16: {
                    block15: {
                        long l5;
                        block13: {
                            long l6 = 9053072620099174983L;
                            long l7 = 6792077863917030341L;
                            long l8 = -6943843729732995886L;
                            long l9 = 7658203825316879633L;
                            long l10 = 7752309029350333858L;
                            l4 = -8157702395566579461L;
                            l3 = 4763734882952012974L;
                            long l11 = -1197950619355522017L;
                            long l12 = -2916687776090057120L;
                            long l13 = 2985073596151219936L;
                            l5 = -1474100506205327479L;
                            l2 = -1852923198914675589L;
                            super.onMouseScroll(mouseX, mouseY, vertical);
                            if (closing) {
                                return;
                            }
                            int n2 = C[363];
                            n2 ^= C[364];
                            float f4 = MenuScreen.currentScale$default(this, 0.0f, n2 += C[365], null);
                            int n3 = C[366];
                            n3 += C[367];
                            long l14 = l2;
                            int n4 = C[369];
                            n4 += C[370];
                            long l15 = l2 = l14 ^ ((long)this.unscaleMouseX(mouseX, f4) << (n3 ^= C[368]) ^ l14) & -1L << (n4 += C[371]);
                            int n5 = C[372];
                            n5 ^= C[373];
                            l2 = l15 ^ ((long)this.unscaleMouseY(mouseY, f4) ^ l15) & -1L >>> (n5 ^= C[374]);
                            if (categoryContentAlpha <= 0.5f) {
                                return;
                            }
                            category = categoryTransition.getCurrent();
                            int n6 = C[375];
                            n6 += C[376];
                            long l16 = l13;
                            int n7 = C[378];
                            n7 += C[379];
                            l13 = l16 ^ ((long)this.isConfigCategory(category) << (n6 += C[377]) ^ l16) & -1L << (n7 += C[380]);
                            long l17 = l5;
                            int n8 = C[381];
                            n8 ^= C[382];
                            l5 = l17 ^ ((long)this.isEventsCategory(category) ^ l17) & -1L >>> (n8 ^= C[383]);
                            int n9 = C[384];
                            n9 -= C[385];
                            long l18 = l4;
                            int n10 = C[387];
                            n10 -= C[388];
                            long l19 = l4 = l18 ^ ((long)this.isPointsCategory(category) << (n9 += C[386]) ^ l18) & -1L << (n10 ^= C[389]);
                            int n11 = C[390];
                            n11 += C[391];
                            l4 = l19 ^ ((long)this.isFriendsCategory(category) ^ l19) & -1L >>> (n11 ^= C[392]);
                            state2 = scrollBarState;
                            int n12 = C[393];
                            n12 += C[394];
                            f3 = (int)(l2 >>> (n12 -= C[395]));
                            f2 = (int)l2;
                            int n13 = C[396];
                            n13 += C[397];
                            if ((int)(l13 >>> (n13 -= C[398])) == 0) break block13;
                            if (state2 != null && state2.contains(f3, f2)) {
                                configsCategoryComponent.scrollWheel(vertical);
                            } else {
                                int n14 = C[399];
                                n14 += -70;
                                configsCategoryComponent.onMouseScroll((int)(l2 >>> (n14 += -63)), (int)l2, vertical);
                            }
                            break block14;
                        }
                        if ((int)l5 == 0) break block15;
                        if (state2 != null && state2.contains(f3, f2)) {
                            eventsCategoryComponent.scrollWheel(vertical);
                        } else {
                            int n15 = -141;
                            n15 += 110;
                            eventsCategoryComponent.onMouseScroll((int)(l2 >>> (n15 -= -63)), (int)l2, vertical);
                        }
                        break block14;
                    }
                    int n16 = -79;
                    n16 ^= 0x12;
                    if ((int)(l4 >>> (n16 -= -125)) == 0) break block16;
                    if (state2 != null && state2.contains(f3, f2)) {
                        pointsCategoryComponent.scrollWheel(vertical);
                    } else {
                        int n17 = 74;
                        n17 += -37;
                        pointsCategoryComponent.onMouseScroll((int)(l2 >>> (n17 ^= 5)), (int)l2, vertical);
                    }
                    break block14;
                }
                if ((int)l4 == 0) break block17;
                if (state2 != null && state2.contains(f3, f2)) {
                    friendsCategoryComponent.scrollWheel(vertical);
                } else {
                    int n18 = 149;
                    n18 += -11;
                    friendsCategoryComponent.onMouseScroll((int)(l2 >>> (n18 -= 106)), (int)l2, vertical);
                }
                break block14;
            }
            Category category2 = category;
            if (category2 == null) break block14;
            Category category3 = category2;
            long l20 = l3;
            int n19 = 30;
            n19 ^= 0xFFFFFF98;
            l3 = l20 ^ (0L ^ l20) & -1L << (n19 ^= 0xFFFFFFA6);
            CategoryComponent categoryComponent = categoryComponents.get(category3);
            if (categoryComponent != null) {
                CategoryComponent categoryComponent2 = categoryComponent;
                if (state2 != null && state2.contains(f3, f2)) {
                    categoryComponent2.scrollWheel(vertical);
                } else {
                    int n20 = 25;
                    n20 ^= 0x35;
                    categoryComponent2.onMouseScroll((int)(l2 >>> (n20 -= 12)), (int)l2, vertical);
                }
            }
        }
    }

    @Override
    public void onMouseRelease(int mouseX, int mouseY, int button) {
        block6: {
            Category category;
            long l2;
            long l3;
            block9: {
                block8: {
                    block7: {
                        block5: {
                            long l4 = -6947015062420966251L;
                            long l5 = 5927231549287925594L;
                            l3 = 1623406785282705407L;
                            long l6 = -4503984485754659162L;
                            long l7 = 1252039494217823238L;
                            long l8 = -1490872422058940129L;
                            l2 = 4571277859458702241L;
                            super.onMouseRelease(mouseX, mouseY, button);
                            if (closing) {
                                return;
                            }
                            if (button == 0 && draggingAvatarPopupGuiScale) {
                                this.commitAvatarPopupGuiScaleDrag(Float.valueOf(mouseX));
                                return;
                            }
                            if (button == 0 && draggingAvatarPopupHudScale) {
                                this.commitAvatarPopupHudScaleDrag(Float.valueOf(mouseX));
                                return;
                            }
                            if (button == 0 && draggingScrollBar) {
                                int n2 = 109;
                                n2 ^= 0x21;
                                draggingScrollBar = n2 += -76;
                                scrollBarGrabOffset = 0.0f;
                                return;
                            }
                            int n3 = -80;
                            n3 ^= 0x56;
                            float f2 = MenuScreen.currentScale$default(this, 0.0f, n3 += 27, null);
                            int n4 = 161;
                            n4 -= 23;
                            long l9 = l2;
                            int n5 = 61;
                            n5 += -104;
                            long l10 = l2 = l9 ^ ((long)this.unscaleMouseX(mouseX, f2) << (n4 -= 106) ^ l9) & -1L << (n5 += 75);
                            int n6 = 114;
                            n6 += 2;
                            l2 = l10 ^ ((long)this.unscaleMouseY(mouseY, f2) ^ l10) & -1L >>> (n6 ^= 0x54);
                            category = categoryTransition.getCurrent();
                            if (!this.isConfigCategory(category)) break block5;
                            int n7 = -111;
                            n7 -= -37;
                            configsCategoryComponent.onMouseRelease((int)(l2 >>> (n7 += 106)), (int)l2, button);
                            break block6;
                        }
                        if (!this.isEventsCategory(category)) break block7;
                        int n8 = 77;
                        n8 ^= 0x27;
                        eventsCategoryComponent.onMouseRelease((int)(l2 >>> (n8 ^= 0x4A)), (int)l2, button);
                        break block6;
                    }
                    if (!this.isPointsCategory(category)) break block8;
                    int n9 = 2;
                    n9 ^= 0xFFFFFFD2;
                    pointsCategoryComponent.onMouseRelease((int)(l2 >>> (n9 -= -80)), (int)l2, button);
                    break block6;
                }
                if (!this.isFriendsCategory(category)) break block9;
                int n10 = 61;
                n10 += -4;
                friendsCategoryComponent.onMouseRelease((int)(l2 >>> (n10 ^= 0x19)), (int)l2, button);
                break block6;
            }
            Category category2 = category;
            if (category2 == null) break block6;
            Category category3 = category2;
            long l11 = l3;
            int n11 = 86;
            n11 ^= 1;
            l3 = l11 ^ (0L ^ l11) & -1L << (n11 -= 55);
            CategoryComponent categoryComponent = categoryComponents.get(category3);
            if (categoryComponent != null) {
                int n12 = -13;
                n12 -= -77;
                categoryComponent.onMouseRelease((int)(l2 >>> (n12 += -32)), (int)l2, button);
            }
        }
    }

    @Override
    public void onKeyPress(int mouseX, int mouseY, int button) {
        block5: {
            Category category;
            long l2;
            long l3;
            block7: {
                block6: {
                    block4: {
                        long l4 = -7938867574973671121L;
                        l3 = -3042823985721833809L;
                        long l5 = -6812577017210669509L;
                        long l6 = 6775170265575374194L;
                        long l7 = -5792718767623887044L;
                        l2 = 3459882327753860926L;
                        super.onKeyPress(mouseX, mouseY, button);
                        if (closing) {
                            return;
                        }
                        category = categoryTransition.getCurrent();
                        if (searchFocused) {
                            this.handleSearchInput(button);
                            return;
                        }
                        int n2 = -108;
                        n2 ^= 0x42;
                        float f2 = MenuScreen.currentScale$default(this, 0.0f, n2 -= -43, null);
                        int n3 = -1;
                        n3 -= -122;
                        long l8 = l2;
                        int n4 = -80;
                        n4 -= -67;
                        long l9 = l2 = l8 ^ ((long)this.unscaleMouseX(mouseX, f2) << (n3 ^= 0x59) ^ l8) & -1L << (n4 += 45);
                        int n5 = -92;
                        n5 ^= 0x23;
                        l2 = l9 ^ ((long)this.unscaleMouseY(mouseY, f2) ^ l9) & -1L >>> (n5 ^= 0xFFFFFFA7);
                        if (this.isConfigCategory(category)) {
                            return;
                        }
                        if (!this.isEventsCategory(category)) break block4;
                        int n6 = -150;
                        n6 ^= 0xFFFFFFED;
                        eventsCategoryComponent.onKeyPress((int)(l2 >>> (n6 += -103)), (int)l2, button);
                        break block5;
                    }
                    if (!this.isPointsCategory(category)) break block6;
                    int n7 = -95;
                    n7 += 63;
                    pointsCategoryComponent.onKeyPress((int)(l2 >>> (n7 ^= 0xFFFFFFC0)), (int)l2, button);
                    break block5;
                }
                if (!this.isFriendsCategory(category)) break block7;
                int n8 = -76;
                n8 ^= 0x41;
                friendsCategoryComponent.onKeyPress((int)(l2 >>> (n8 += 43)), (int)l2, button);
                break block5;
            }
            Category category2 = category;
            if (category2 == null) break block5;
            Category category3 = category2;
            long l10 = l3;
            int n9 = 183;
            n9 -= 115;
            l3 = l10 ^ (0L ^ l10) & -1L << (n9 ^= 0x64);
            CategoryComponent categoryComponent = categoryComponents.get(category3);
            if (categoryComponent != null) {
                int n10 = 76;
                n10 -= 124;
                categoryComponent.onKeyPress((int)(l2 >>> (n10 ^= 0xFFFFFFF0)), (int)l2, button);
            }
        }
    }

    @Override
    public void init() {
        int n2 = 3;
        n2 += 35;
        closing = n2 ^= 0x26;
        int n3 = -3;
        n3 ^= 0xFFFFFF9F;
        avatarPopupOpen = n3 -= 98;
        int n4 = 20;
        n4 -= -58;
        draggingAvatarPopupGuiScale = n4 ^= 0x4E;
        avatarPopupGuiScaleDragProgress = null;
        int n5 = 171;
        n5 -= 124;
        draggingAvatarPopupHudScale = n5 ^= 0x2F;
        avatarPopupHudScaleDragProgress = null;
        int n6 = 40;
        n6 += -119;
        AnimationUtil.animate$default(openAnimation, 0.0f, 0.0f, null, n6 ^= 0xFFFFFFB5, null);
        int n7 = 45;
        n7 -= 82;
        AnimationUtil.animate$default(avatarPopupAnimation, 0.0f, 0.0f, null, n7 += 41, null);
        int n8 = -118;
        n8 += 98;
        AnimationUtil.animate$default(avatarPopupCloseHoverAnimation, 0.0f, 0.0f, null, n8 ^= 0xFFFFFFE8, null);
    }

    @Override
    public void close() {
        if (closing) {
            return;
        }
        int n2 = 59;
        n2 += 32;
        closing = n2 += -90;
        int n3 = 69;
        n3 ^= 0xFFFFFF9F;
        avatarPopupOpen = n3 ^= 0xFFFFFFDA;
        int n4 = 47;
        n4 ^= 0;
        draggingAvatarPopupGuiScale = n4 += -47;
        avatarPopupGuiScaleDragProgress = null;
        int n5 = -108;
        n5 += 53;
        draggingAvatarPopupHudScale = n5 ^= 0xFFFFFFC9;
        avatarPopupHudScaleDragProgress = null;
        int n6 = -24;
        n6 += -56;
        searchFocused = n6 ^= 0xFFFFFFB0;
        int n7 = 25;
        n7 += -10;
        topBarTextSelected = n7 -= 15;
        int n8 = -48;
        n8 += 70;
        draggingScrollBar = n8 ^= 0x16;
        scrollBarGrabOffset = 0.0f;
        this.clearCategoryInputFocus();
    }

    @Override
    public boolean shouldRemove() {
        int n2;
        if (closing && this.openProgress() <= 0.02f) {
            int n3 = 173;
            n3 += -125;
            n2 = n3 += -47;
        } else {
            int n4 = 3;
            n4 ^= 0x28;
            n2 = n4 ^= 0x2B;
        }
        return n2 != 0;
    }

    public final float getWidth() {
        return 365.0f;
    }

    public final float getHeight() {
        return 250.0f;
    }

    public final float getPanelWidth() {
        return 40.0f;
    }

    public final float getX() {
        return (float)kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledWidth() * 0.5f - this.getWidth() * 0.5f;
    }

    public final float getY() {
        return (float)kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledHeight() * 0.5f - this.getHeight() * 0.5f;
    }

    private final int unscaleMouseX(int mouseX, float scale) {
        float f2 = this.getX() + this.getWidth() * 0.5f;
        return (int)(((float)mouseX - f2) / scale + f2);
    }

    private final int unscaleMouseY(int mouseY, float scale) {
        float f2 = this.getY() + this.getHeight() * 0.5f;
        return (int)(((float)mouseY - f2) / scale + f2);
    }

    @Override
    @NotNull
    public ClientRenderPipeline rectPipeline() {
        return ClientRenderPipeline.GUI_RECT;
    }

    @Override
    @NotNull
    public ClientRenderPipeline textPipeline() {
        return ClientRenderPipeline.GUI_TEXT;
    }

    @Override
    @NotNull
    public ClientRenderPipeline iconsPipeline() {
        return ClientRenderPipeline.GUI_SPECIAL;
    }

    private final void applyScrollBarDrag(Function2<? super Float, ? super Boolean, Unit> setScrollProgress, float mouseY) {
        MenuScrollBarRenderer.State state2 = scrollBarState;
        if (state2 == null) {
            return;
        }
        MenuScrollBarRenderer.State state3 = state2;
        if (!state3.getCanScroll()) {
            return;
        }
        float f2 = RangesKt.coerceAtLeast(state3.getTrackHeight() - state3.getThumbHeight(), 0.0f);
        if (f2 <= 0.0f) {
            int n2 = -116;
            n2 = n2 ^ 0x5A;
            boolean bl2 = n2 - -43;
            setScrollProgress.invoke(Float.valueOf(0.0f), (Boolean)bl2);
            return;
        }
        float f3 = RangesKt.coerceIn(mouseY - state3.getTrackY() - scrollBarGrabOffset, 0.0f, f2);
        int n4 = 22;
        n4 = n4 + 32;
        boolean bl = n4 ^ 0x37;
        setScrollProgress.invoke(Float.valueOf(f3 / f2), (Boolean)bl);
    }

    private final void renderBackdrop(float openProgress2) {
        if (!ClickGuiSettings.INSTANCE.renderGuiBackground()) {
            return;
        }
        float f2 = RangesKt.coerceIn(0.38f * openProgress2, 0.0f, 1.0f);
        if (f2 <= 0.0f) {
            return;
        }
        float f3 = 32.0f;
        int n2 = -92;
        n2 += 53;
        n2 += 39;
        int n3 = -50;
        n3 ^= 0x40;
        n3 -= -114;
        int n4 = 138;
        n4 -= 99;
        int n5 = -7;
        n5 ^= 0xFFFFFF9F;
        int n6 = 110;
        n6 -= -114;
        RenderUtils.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(new Color(n2, n3, n4 -= 39, RangesKt.coerceIn((int)(f2 * 255.0f), n5 ^= 0x66, n6 -= -31))).round(0.0f).draw(-f3, -f3, (float)kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledWidth() + f3 * 2.0f, (float)kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledHeight() + f3 * 2.0f);
    }

    private final void renderAvatarPopup(MenuLayout layout, float openProgress2, float scale, int mouseX, int mouseY) {
        long l2 = -4280487398291287410L;
        long l3 = -6930101676713779091L;
        long l4 = -1140489885996701945L;
        long l5 = 302456272235199381L;
        long l6 = -3115374983251418549L;
        long l7 = -8443611512109768196L;
        long l8 = 677850639085971551L;
        float f2 = RangesKt.coerceIn(avatarPopupAnimation.animate(avatarPopupOpen ? 1.0f : 0.0f, 220.0f, (Function1<? super Float, Float>)new Function1<Float, Float>((Object)Easings.INSTANCE){
            private static Object[] a;
            private static Object b;
            private static Object[] B;
            private static Object[] A;
            private static Object[] c;
            public static int[] C;
            {
                int n2 = C[0];
                n2 += C[1];
                n2 -= C[2];
                int n3 = C[3];
                n3 += C[4];
                n3 -= C[5];
                int n4 = C[6];
                n4 ^= C[7];
                n4 += C[8];
                int n5 = C[9];
                n5 += C[10];
                int n6 = C[12];
                n6 ^= C[13];
                int n7 = C[15];
                n7 ^= C[16];
                super(n2, receiver, Easings.class, (String)a[n3] + (String)a[n4], (String)a[n5 += C[11]] + (String)a[n6 ^= C[14]], n7 += C[17]);
            }

            public final Float invoke(float p0) {
                return Float.valueOf(((Easings)this.receiver).standardDecelerate(p0));
            }

            static {
                renderAvatarPopup.popupProgress._1.b();
                long l2 = -2040812472576563457L;
                long l3 = -3451820801975980921L;
                long l4 = 7213475222636555224L;
                long l5 = -2527817334744886144L;
                long l6 = -8793981870460082929L;
                long l7 = -915932184859371003L;
                long l8 = 2117899767466995795L;
                long l9 = 2552092494922367482L;
                long l10 = 2114846599892548242L;
                long l11 = -2685091535014180170L;
                long l12 = -879306961725018961L;
                long l13 = -8894065021920392749L;
                long l14 = -5347061824539988111L;
                long l15 = 7060049818430247749L;
                int n2 = C[18];
                n2 ^= C[19];
                a = new Object[n2 -= C[20]];
                long l16 = l15;
                int n3 = C[21];
                n3 += C[22];
                l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= C[23]);
                Object[] objectArray = new Object[C[24]];
                objectArray[renderAvatarPopup.popupProgress._1.C[25]] = A;
                objectArray[renderAvatarPopup.popupProgress._1.C[26]] = C[27];
                int n4 = C[28];
                Object object = renderAvatarPopup.popupProgress._1.A()[C[29]];
                if (object == null) {
                    char[] cArray = "\u3d1c\u3d81\u3d6f\u3d2e\u3d1c\u3d7f\u3d28\u3d67\u3d63\u3d6d\u3d7d\u3d32\u3d2e\u3d25\u3d5f\u3d24\u3d6e\u3d7e\u3d8b\u3d30\u3d69\u3d2d\u3d71\u3d54\u3d74\u3d6e\u3d32\u3d5f\u3d6b\u3d68\u3d24\u3d76\u3d83\u3d62\u3d2f\u3d56\u3d83\u3d83\u3d2e\u3d67\u3d53\u3d6f\u3d5d\u3d63\u3d7e\u3d82\u3d2f\u3d6f\u3d68\u3d81\u3d76\u3d8d\u3d62\u3d71\u3d2d\u3d90\u3d65\u3d28\u3d85\u3d32\u3d71\u3d31\u3d25\u3d54\u3d32\u3d69\u3d6a\u3d74\u3d6b\u3d88\u3d2e\u3d64\u3d87\u3d90\u3d72\u3d2f\u3d24\u3d8f\u3d56\u3d88\u3d70\u3d7c\u3d83\u3d26\u3d84\u3d65\u3d53\u3d88\u3d86\u3d80\u3d6f\u3d23\u3d66\u3d2f\u3d32\u3d73\u3d6b\u3d2e\u3d8f\u3d25\u3d31\u3d7b\u3d6e\u3d83\u3d81\u3d6a\u3d54\u3d7a".toCharArray();
                    for (int i2 = C[30]; i2 < C[31]; ++i2) {
                        int n5 = cArray[i2];
                        n5 -= C[32];
                        n5 += C[33];
                        n5 -= C[34];
                        n5 ^= C[35];
                        n5 += C[36];
                        n5 += C[37];
                        n5 += C[38];
                        n5 += C[39];
                        n5 -= C[40];
                        cArray[i2] = (char)(n5 -= C[41]);
                    }
                    object = renderAvatarPopup.popupProgress._1.A()[renderAvatarPopup.popupProgress._1.C[42]] = new String(cArray);
                }
                objectArray[n4] = (String)object;
                char[] cArray = ((String)renderAvatarPopup.popupProgress._1.a(objectArray)).toCharArray();
                long l17 = l6;
                int n6 = C[43];
                n6 -= C[44];
                l6 = l17 ^ (0x3000000000L ^ l17) & -1L << (n6 -= C[45]);
                long l18 = l13;
                int n7 = C[46];
                n7 -= C[47];
                l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= C[48]);
                while (true) {
                    int n8 = C[49];
                    n8 ^= C[50];
                    if ((int)l13 >= (int)(l6 >>> (n8 += C[51]))) break;
                    int n9 = (int)l13;
                    long l19 = l13;
                    int n10 = C[52];
                    n10 += C[53];
                    int n11 = C[55];
                    n11 += C[56];
                    l13 = l19 ^ (l19 ^ l19 + (long)(n10 += C[54])) & -1L >>> (n11 -= C[57]);
                    long l20 = l9;
                    int n12 = C[58];
                    n12 -= C[59];
                    l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= C[60]);
                    int n13 = (int)l13;
                    long l21 = l13;
                    int n14 = C[61];
                    n14 += C[62];
                    int n15 = C[64];
                    n15 ^= C[65];
                    l13 = l21 ^ (l21 ^ l21 + (long)(n14 += C[63])) & -1L >>> (n15 ^= C[66]);
                    int n16 = C[67];
                    n16 += C[68];
                    long l22 = l10;
                    int n17 = C[70];
                    n17 += C[71];
                    l10 = l22 ^ ((long)cArray[n13] << (n16 -= C[69]) ^ l22) & -1L << (n17 += C[72]);
                    int n18 = C[73];
                    n18 ^= C[74];
                    n18 += C[75];
                    int n19 = C[76];
                    n19 ^= C[77];
                    long l23 = l12;
                    int n20 = C[79];
                    n20 -= C[80];
                    l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= C[78]))) ^ l23) & -1L >>> (n20 += C[81]);
                    char[] cArray2 = new char[(int)l12];
                    long l24 = l14;
                    int n21 = C[82];
                    n21 -= C[83];
                    l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= C[84]);
                    while (true) {
                        int n22 = C[85];
                        n22 ^= C[86];
                        if ((int)(l14 >>> (n22 -= C[87])) >= (int)l12) break;
                        int n23 = C[88];
                        n23 ^= C[89];
                        int n24 = C[91];
                        n24 ^= C[92];
                        cArray2[(int)(l14 >>> (n23 -= renderAvatarPopup.popupProgress._1.C[90]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += C[93]))];
                        l14 += 0x100000000L;
                    }
                    int n25 = C[94];
                    n25 += C[95];
                    int n26 = (int)(l15 >>> (n25 -= C[96]));
                    l15 += 0x100000000L;
                    renderAvatarPopup.popupProgress._1.a[n26] = new String(cArray2);
                    long l25 = l13;
                    int n27 = C[97];
                    n27 += C[98];
                    l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= C[99]);
                }
            }

            public static Object a(Object[] object) {
                Object object2;
                int n2 = (Integer)object[C[100]];
                String string = (String)object[C[101]];
                object = object[C[102]];
                Object[] objectArray = B;
                if (B == null) {
                    objectArray = B = new Object[C[103]];
                }
                if ((object2 = objectArray[n2]) == null) {
                    Object object3 = object;
                    if (object == null) {
                        Object[] objectArray2 = new Object[C[104]];
                        A = objectArray2;
                        object3 = objectArray2;
                        byte[] byArray = new byte[C[106] ^ C[107]];
                        byArray[renderAvatarPopup.popupProgress._1.C[108] ^ renderAvatarPopup.popupProgress._1.C[109]] = C[110] ^ C[111];
                        byArray[renderAvatarPopup.popupProgress._1.C[112] ^ renderAvatarPopup.popupProgress._1.C[113]] = C[114] ^ C[115];
                        byArray[renderAvatarPopup.popupProgress._1.C[116] ^ renderAvatarPopup.popupProgress._1.C[117]] = C[118] ^ C[119];
                        byArray[renderAvatarPopup.popupProgress._1.C[120] ^ renderAvatarPopup.popupProgress._1.C[121]] = C[122] ^ C[123];
                        byArray[renderAvatarPopup.popupProgress._1.C[124] ^ renderAvatarPopup.popupProgress._1.C[125]] = C[126] ^ C[127];
                        byArray[renderAvatarPopup.popupProgress._1.C[128] ^ renderAvatarPopup.popupProgress._1.C[129]] = C[130] ^ C[131];
                        byArray[renderAvatarPopup.popupProgress._1.C[132] ^ renderAvatarPopup.popupProgress._1.C[133]] = C[134] ^ C[135];
                        byArray[renderAvatarPopup.popupProgress._1.C[136] ^ renderAvatarPopup.popupProgress._1.C[137]] = C[138] ^ C[139];
                        byArray[renderAvatarPopup.popupProgress._1.C[140] ^ renderAvatarPopup.popupProgress._1.C[141]] = C[142] ^ C[143];
                        byArray[renderAvatarPopup.popupProgress._1.C[144] ^ renderAvatarPopup.popupProgress._1.C[145]] = C[146] ^ C[147];
                        byArray[renderAvatarPopup.popupProgress._1.C[148] ^ renderAvatarPopup.popupProgress._1.C[149]] = C[150] ^ C[151];
                        byArray[renderAvatarPopup.popupProgress._1.C[152] ^ renderAvatarPopup.popupProgress._1.C[153]] = C[154] ^ C[155];
                        byArray[renderAvatarPopup.popupProgress._1.C[156] ^ renderAvatarPopup.popupProgress._1.C[157]] = C[158] ^ C[159];
                        byArray[renderAvatarPopup.popupProgress._1.C[160] ^ renderAvatarPopup.popupProgress._1.C[161]] = C[162] ^ C[163];
                        byArray[renderAvatarPopup.popupProgress._1.C[164] ^ renderAvatarPopup.popupProgress._1.C[165]] = C[166] ^ C[167];
                        byArray[renderAvatarPopup.popupProgress._1.C[168] ^ renderAvatarPopup.popupProgress._1.C[169]] = C[170] ^ C[171];
                        objectArray2[renderAvatarPopup.popupProgress._1.C[105]] = byArray;
                    }
                    byte[] byArray = (byte[])object3[C[172]];
                    if (b == null) {
                        byte[] byArray2 = new byte[C[173] ^ C[174]];
                        byArray2[renderAvatarPopup.popupProgress._1.C[175] ^ renderAvatarPopup.popupProgress._1.C[176]] = C[177] ^ C[178];
                        byArray2[renderAvatarPopup.popupProgress._1.C[179] ^ renderAvatarPopup.popupProgress._1.C[180]] = C[181] ^ C[182];
                        byArray2[renderAvatarPopup.popupProgress._1.C[183] ^ renderAvatarPopup.popupProgress._1.C[184]] = C[185] ^ C[186];
                        byArray2[renderAvatarPopup.popupProgress._1.C[187] ^ renderAvatarPopup.popupProgress._1.C[188]] = C[189] ^ C[190];
                        byArray2[renderAvatarPopup.popupProgress._1.C[191] ^ renderAvatarPopup.popupProgress._1.C[192]] = C[193] ^ C[194];
                        byArray2[renderAvatarPopup.popupProgress._1.C[195] ^ renderAvatarPopup.popupProgress._1.C[196]] = C[197] ^ C[198];
                        byArray2[renderAvatarPopup.popupProgress._1.C[199] ^ renderAvatarPopup.popupProgress._1.C[200]] = C[201] ^ C[202];
                        byArray2[renderAvatarPopup.popupProgress._1.C[203] ^ renderAvatarPopup.popupProgress._1.C[204]] = C[205] ^ C[206];
                        byArray2[renderAvatarPopup.popupProgress._1.C[207] ^ renderAvatarPopup.popupProgress._1.C[208]] = C[209] ^ C[210];
                        byArray2[renderAvatarPopup.popupProgress._1.C[211] ^ renderAvatarPopup.popupProgress._1.C[212]] = C[213] ^ C[214];
                        byArray2[renderAvatarPopup.popupProgress._1.C[215] ^ renderAvatarPopup.popupProgress._1.C[216]] = C[217] ^ C[218];
                        byArray2[renderAvatarPopup.popupProgress._1.C[219] ^ renderAvatarPopup.popupProgress._1.C[220]] = C[221] ^ C[222];
                        byArray2[renderAvatarPopup.popupProgress._1.C[223] ^ renderAvatarPopup.popupProgress._1.C[224]] = C[225] ^ C[226];
                        byArray2[renderAvatarPopup.popupProgress._1.C[227] ^ renderAvatarPopup.popupProgress._1.C[228]] = C[229] ^ C[230];
                        byArray2[renderAvatarPopup.popupProgress._1.C[231] ^ renderAvatarPopup.popupProgress._1.C[232]] = C[233] ^ C[234];
                        byArray2[renderAvatarPopup.popupProgress._1.C[235] ^ renderAvatarPopup.popupProgress._1.C[236]] = C[237] ^ C[238];
                        byArray2[renderAvatarPopup.popupProgress._1.C[239] ^ renderAvatarPopup.popupProgress._1.C[240]] = C[241] ^ C[242];
                        byArray2[renderAvatarPopup.popupProgress._1.C[243] ^ renderAvatarPopup.popupProgress._1.C[244]] = C[245] ^ C[246];
                        byArray2[renderAvatarPopup.popupProgress._1.C[247] ^ renderAvatarPopup.popupProgress._1.C[248]] = C[249] ^ C[250];
                        byArray2[renderAvatarPopup.popupProgress._1.C[251] ^ renderAvatarPopup.popupProgress._1.C[252]] = C[253] ^ C[254];
                        byArray2[renderAvatarPopup.popupProgress._1.C[255] ^ renderAvatarPopup.popupProgress._1.C[256]] = C[257] ^ C[258];
                        byArray2[renderAvatarPopup.popupProgress._1.C[259] ^ renderAvatarPopup.popupProgress._1.C[260]] = C[261] ^ C[262];
                        byArray2[renderAvatarPopup.popupProgress._1.C[263] ^ renderAvatarPopup.popupProgress._1.C[264]] = C[265] ^ C[266];
                        byArray2[renderAvatarPopup.popupProgress._1.C[267] ^ renderAvatarPopup.popupProgress._1.C[268]] = C[269] ^ C[270];
                        byArray2[renderAvatarPopup.popupProgress._1.C[271] ^ renderAvatarPopup.popupProgress._1.C[272]] = C[273] ^ C[274];
                        byArray2[renderAvatarPopup.popupProgress._1.C[275] ^ renderAvatarPopup.popupProgress._1.C[276]] = C[277] ^ C[278];
                        byArray2[renderAvatarPopup.popupProgress._1.C[279] ^ renderAvatarPopup.popupProgress._1.C[280]] = C[281] ^ C[282];
                        byArray2[renderAvatarPopup.popupProgress._1.C[283] ^ renderAvatarPopup.popupProgress._1.C[284]] = C[285] ^ C[286];
                        byArray2[renderAvatarPopup.popupProgress._1.C[287] ^ renderAvatarPopup.popupProgress._1.C[288]] = C[289] ^ C[290];
                        byArray2[renderAvatarPopup.popupProgress._1.C[291] ^ renderAvatarPopup.popupProgress._1.C[292]] = C[293] ^ C[294];
                        byArray2[renderAvatarPopup.popupProgress._1.C[295] ^ renderAvatarPopup.popupProgress._1.C[296]] = C[297] ^ C[298];
                        byArray2[renderAvatarPopup.popupProgress._1.C[299] ^ renderAvatarPopup.popupProgress._1.C[300]] = C[301] ^ C[302];
                        byte[] byArray3 = new byte[byArray.length + byArray2.length];
                        System.arraycopy(byArray, C[303], byArray3, C[304], byArray.length);
                        System.arraycopy(byArray2, C[305], byArray3, byArray.length, byArray2.length);
                        Object object4 = renderAvatarPopup.popupProgress._1.A()[C[306]];
                        if (object4 == null) {
                            char[] cArray = "\ub333\ub2b5\ub2ae\ub2b7\ub2b9\ub2a5\ub24a\ub25c\ub267\ub25b\ub2bb\ub250\ub244\ub256\ub246\ub2bb\ub2a4\ub294".toCharArray();
                            for (int i2 = C[307]; i2 < C[308]; ++i2) {
                                int n3 = cArray[i2];
                                n3 -= C[309];
                                n3 ^= C[310];
                                n3 += C[311];
                                n3 -= C[312];
                                n3 -= C[313];
                                n3 ^= C[314];
                                n3 ^= C[315];
                                n3 -= C[316];
                                n3 -= C[317];
                                n3 += C[318];
                                cArray[i2] = (char)(n3 ^= C[319]);
                            }
                            object4 = renderAvatarPopup.popupProgress._1.A()[renderAvatarPopup.popupProgress._1.C[320]] = new String(cArray);
                        }
                        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                        byte[] byArray4 = new byte[C[321]];
                        byArray4[renderAvatarPopup.popupProgress._1.C[322]] = C[323];
                        byArray4[renderAvatarPopup.popupProgress._1.C[324]] = C[325];
                        byArray4[renderAvatarPopup.popupProgress._1.C[326]] = C[327];
                        byArray4[renderAvatarPopup.popupProgress._1.C[328]] = C[329];
                        byArray4[renderAvatarPopup.popupProgress._1.C[330]] = C[331];
                        byArray4[renderAvatarPopup.popupProgress._1.C[332]] = C[333];
                        byArray4[renderAvatarPopup.popupProgress._1.C[334]] = C[335];
                        byArray4[renderAvatarPopup.popupProgress._1.C[336]] = C[337];
                        byArray4[renderAvatarPopup.popupProgress._1.C[338]] = C[339];
                        byArray4[renderAvatarPopup.popupProgress._1.C[340]] = C[341];
                        byArray4[renderAvatarPopup.popupProgress._1.C[342]] = C[343];
                        byArray4[renderAvatarPopup.popupProgress._1.C[344]] = C[345];
                        byArray4[renderAvatarPopup.popupProgress._1.C[346]] = C[347];
                        byArray4[renderAvatarPopup.popupProgress._1.C[348]] = C[349];
                        byArray4[renderAvatarPopup.popupProgress._1.C[350]] = C[351];
                        byArray4[renderAvatarPopup.popupProgress._1.C[352]] = C[353];
                        PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, C[354], C[355]);
                        byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                        Object object5 = renderAvatarPopup.popupProgress._1.A()[C[356]];
                        if (object5 == null) {
                            char[] cArray = "\ud57d\ud589\ud58b".toCharArray();
                            for (int i3 = C[357]; i3 < C[358]; ++i3) {
                                int n4 = cArray[i3];
                                n4 -= C[359];
                                n4 += C[360];
                                n4 += C[361];
                                n4 += C[362];
                                n4 += C[363];
                                n4 -= C[364];
                                n4 ^= C[365];
                                n4 ^= C[366];
                                n4 ^= C[367];
                                n4 ^= C[368];
                                n4 += C[369];
                                n4 ^= C[370];
                                cArray[i3] = (char)(n4 ^= C[371]);
                            }
                            object5 = renderAvatarPopup.popupProgress._1.A()[renderAvatarPopup.popupProgress._1.C[372]] = new String(cArray);
                        }
                        b = new SecretKeySpec(byArray5, (String)object5);
                    }
                    byte[] byArray6 = Base64.getDecoder().decode(string);
                    byte[] byArray7 = Arrays.copyOfRange(byArray6, C[373], C[374]);
                    byte[] byArray8 = Arrays.copyOfRange(byArray6, C[375], byArray6.length);
                    Object object6 = renderAvatarPopup.popupProgress._1.A()[C[376]];
                    if (object6 == null) {
                        char[] cArray = "\u938e\u93f2\u9390\u93dc\u93e0\u938d\u93e0\u93dc\u93fb\u9398\u93e0\u9390\u9802\u93fb\u93ae\u937f\u937f\u9446\u93a9\u9444".toCharArray();
                        for (int i4 = C[377]; i4 < C[378]; ++i4) {
                            int n5 = cArray[i4];
                            n5 -= C[379];
                            n5 += C[380];
                            n5 ^= C[381];
                            n5 ^= C[382];
                            n5 -= C[383];
                            n5 ^= C[384];
                            n5 += C[385];
                            n5 ^= C[386];
                            n5 -= C[387];
                            n5 ^= C[388];
                            n5 += C[389];
                            n5 ^= C[390];
                            n5 ^= C[391];
                            n5 ^= C[392];
                            n5 -= C[393];
                            cArray[i4] = (char)(n5 -= C[394]);
                        }
                        object6 = renderAvatarPopup.popupProgress._1.A()[renderAvatarPopup.popupProgress._1.C[395]] = new String(cArray);
                    }
                    Cipher cipher = Cipher.getInstance((String)object6);
                    cipher.init(C[396], (Key)((SecretKey)b), new IvParameterSpec(byArray7));
                    byte[] byArray9 = cipher.doFinal(byArray8);
                    object2 = new String(byArray9, StandardCharsets.UTF_8);
                }
                return object2;
            }

            private static Object[] A() {
                Object[] objectArray = c;
                if (c == null) {
                    c = new Object[C[397]];
                    objectArray = c;
                }
                return objectArray;
            }

            public static void b() {
                C = new int[0x18A ^ 4];
                renderAvatarPopup.popupProgress._1.C[0xF766 ^ 0xF7BB] = 0x7F85 ^ 0xF7BB;
                renderAvatarPopup.popupProgress._1.C[0xAB9B ^ 0xAA1B] = 0x6213 ^ 0xAA1B;
                renderAvatarPopup.popupProgress._1.C[0x10702 ^ 0x10669] = 0x127DF ^ 0x10669;
                renderAvatarPopup.popupProgress._1.C[0x106C7 ^ 0x1067D] = 0x1E3F0 ^ 0x1067D;
                renderAvatarPopup.popupProgress._1.C[0xE80 ^ 0xF8C] = 0xBBCE ^ 0xF8C;
                renderAvatarPopup.popupProgress._1.C[0x1B33 ^ 0x1B0F] = 0xFFFFE4FE ^ 0x1B0F;
                renderAvatarPopup.popupProgress._1.C[0x9E9A ^ 0x9F9E] = 0x179D ^ 0x9F9E;
                renderAvatarPopup.popupProgress._1.C[0x2094 ^ 0x2090] = 0xFFFFDF3D ^ 0x2090;
                renderAvatarPopup.popupProgress._1.C[0x10706 ^ 0x1078D] = 0x1701F ^ 0x1078D;
                renderAvatarPopup.popupProgress._1.C[0xFC95 ^ 0xFDC9] = 0xFDCF ^ 0xFDC9;
                renderAvatarPopup.popupProgress._1.C[0x10C2F ^ 0x10D32] = 0x1D1B5 ^ 0x10D32;
                renderAvatarPopup.popupProgress._1.C[0xA857 ^ 0xA8C2] = 0x59AA ^ 0xA8C2;
                renderAvatarPopup.popupProgress._1.C[0xBC04 ^ 0xBC69] = 0x67A7 ^ 0xBC69;
                renderAvatarPopup.popupProgress._1.C[0xEAA2 ^ 0xEA21] = 0x398D ^ 0xEA21;
                renderAvatarPopup.popupProgress._1.C[0x383B ^ 0x392F] = 0x78BF ^ 0x392F;
                renderAvatarPopup.popupProgress._1.C[0x4100 ^ 0x41D8] = 0x887A ^ 0x41D8;
                renderAvatarPopup.popupProgress._1.C[0xE493 ^ 0xE43E] = 0xF463 ^ 0xE43E;
                renderAvatarPopup.popupProgress._1.C[0xB85C ^ 0xB879] = 0xD683 ^ 0xB879;
                renderAvatarPopup.popupProgress._1.C[0x10DC6 ^ 0x10DB4] = 0x17088 ^ 0x10DB4;
                renderAvatarPopup.popupProgress._1.C[0x4FD3 ^ 0x4EB4] = 0xE610 ^ 0x4EB4;
                renderAvatarPopup.popupProgress._1.C[0x6902 ^ 0x6877] = 0x6877 ^ 0x6877;
                renderAvatarPopup.popupProgress._1.C[0x6EF7 ^ 0x6F9E] = 0x90D2 ^ 0x6F9E;
                renderAvatarPopup.popupProgress._1.C[0x5A4B ^ 0x5A1C] = 0x5A02 ^ 0x5A1C;
                renderAvatarPopup.popupProgress._1.C[0xC449 ^ 0xC56D] = 0x1CD0B ^ 0xC56D;
                renderAvatarPopup.popupProgress._1.C[0x4DFF ^ 0x4DA9] = 0x4DCF ^ 0x4DA9;
                renderAvatarPopup.popupProgress._1.C[0xDA6F ^ 0xDAFB] = 0x2B98 ^ 0xDAFB;
                renderAvatarPopup.popupProgress._1.C[0xA181 ^ 0xA0B3] = 0xA0B2 ^ 0xA0B3;
                renderAvatarPopup.popupProgress._1.C[0x8FCE ^ 0x8F3C] = 0xC71A ^ 0x8F3C;
                renderAvatarPopup.popupProgress._1.C[0xB36B ^ 0xB3D6] = 0xFFFF3DD2 ^ 0xB3D6;
                renderAvatarPopup.popupProgress._1.C[0x704F ^ 0x715C] = 0x30D0 ^ 0x715C;
                renderAvatarPopup.popupProgress._1.C[0xEE47 ^ 0xEE5D] = 0xEE5C ^ 0xEE5D;
                renderAvatarPopup.popupProgress._1.C[0x88EA ^ 0x8807] = 0x4118 ^ 0x8807;
                renderAvatarPopup.popupProgress._1.C[0xD307 ^ 0xD334] = 0xFFFF2CF7 ^ 0xD334;
                renderAvatarPopup.popupProgress._1.C[0x128E ^ 0x1273] = 0xCFF8 ^ 0x1273;
                renderAvatarPopup.popupProgress._1.C[0x723D ^ 0x7296] = 0x50F1 ^ 0x7296;
                renderAvatarPopup.popupProgress._1.C[0xC702 ^ 0xC773] = 0xBA7C ^ 0xC773;
                renderAvatarPopup.popupProgress._1.C[0xAEF5 ^ 0xAEB5] = 0xAEB6 ^ 0xAEB5;
                renderAvatarPopup.popupProgress._1.C[0xAF36 ^ 0xAFBE] = 0xD829 ^ 0xAFBE;
                renderAvatarPopup.popupProgress._1.C[0xA557 ^ 0xA59F] = 0x6F76 ^ 0xA59F;
                renderAvatarPopup.popupProgress._1.C[0xC139 ^ 0xC00F] = 0xE67E ^ 0xC00F;
                renderAvatarPopup.popupProgress._1.C[0x62EC ^ 0x6248] = 0x4DD0 ^ 0x6248;
                renderAvatarPopup.popupProgress._1.C[0x988B ^ 0x984A] = 0x5893 ^ 0x984A;
                renderAvatarPopup.popupProgress._1.C[0xD5DA ^ 0xD585] = 0xD58C ^ 0xD585;
                renderAvatarPopup.popupProgress._1.C[0xA41 ^ 0xAED] = 0xAED ^ 0xAED;
                renderAvatarPopup.popupProgress._1.C[0x541B ^ 0x5422] = 0xFFFFABA6 ^ 0x5422;
                renderAvatarPopup.popupProgress._1.C[0x26E4 ^ 0x269B] = 0x12CA2 ^ 0x269B;
                renderAvatarPopup.popupProgress._1.C[0x372C ^ 0x3714] = 0xFFFFC88D ^ 0x3714;
                renderAvatarPopup.popupProgress._1.C[0x4B8C ^ 0x4B73] = 0x9513 ^ 0x4B73;
                renderAvatarPopup.popupProgress._1.C[0x55C4 ^ 0x544D] = 0x5876 ^ 0x544D;
                renderAvatarPopup.popupProgress._1.C[0xD160 ^ 0xD199] = 0xCFC0 ^ 0xD199;
                renderAvatarPopup.popupProgress._1.C[0x6439 ^ 0x6547] = 0x5E83 ^ 0x6547;
                renderAvatarPopup.popupProgress._1.C[0x7A0C ^ 0x7A4F] = 0xFFFF85BE ^ 0x7A4F;
                renderAvatarPopup.popupProgress._1.C[0x83A8 ^ 0x8300] = 0xA16B ^ 0x8300;
                renderAvatarPopup.popupProgress._1.C[0xF1BE ^ 0xF12C] = 0xFFFF0FB8 ^ 0xF12C;
                renderAvatarPopup.popupProgress._1.C[0x63C1 ^ 0x62C1] = 0xBCA8 ^ 0x62C1;
                renderAvatarPopup.popupProgress._1.C[0x103D ^ 0x1178] = 0xFFFFEEBC ^ 0x1178;
                renderAvatarPopup.popupProgress._1.C[0xC406 ^ 0xC468] = 0xFFFFE03E ^ 0xC468;
                renderAvatarPopup.popupProgress._1.C[0x747D ^ 0x7435] = 0x7450 ^ 0x7435;
                renderAvatarPopup.popupProgress._1.C[0x9CE4 ^ 0x9C20] = 0x609D ^ 0x9C20;
                renderAvatarPopup.popupProgress._1.C[0x88AF ^ 0x8882] = 0xFFFF775A ^ 0x8882;
                renderAvatarPopup.popupProgress._1.C[0x67E5 ^ 0x67DA] = 0x67B4 ^ 0x67DA;
                renderAvatarPopup.popupProgress._1.C[0x10119 ^ 0x10071] = 0x14DF8 ^ 0x10071;
                renderAvatarPopup.popupProgress._1.C[0x23E1 ^ 0x2263] = 0x4028 ^ 0x2263;
                renderAvatarPopup.popupProgress._1.C[0xF3B ^ 0xE06] = 0xCD5A ^ 0xE06;
                renderAvatarPopup.popupProgress._1.C[0xF4E7 ^ 0xF4BF] = 0xFFFF0B14 ^ 0xF4BF;
                renderAvatarPopup.popupProgress._1.C[0x24C1 ^ 0x24F4] = 0xFFFFDB0A ^ 0x24F4;
                renderAvatarPopup.popupProgress._1.C[0xF299 ^ 0xF255] = 0xAF75 ^ 0xF255;
                renderAvatarPopup.popupProgress._1.C[0x279F ^ 0x276C] = 0xCC14 ^ 0x276C;
                renderAvatarPopup.popupProgress._1.C[0xB063 ^ 0xB120] = 0xFFFF4EAC ^ 0xB120;
                renderAvatarPopup.popupProgress._1.C[0x7BC2 ^ 0x7B29] = 0xB264 ^ 0x7B29;
                renderAvatarPopup.popupProgress._1.C[0x2964 ^ 0x29E1] = 0xC17E ^ 0x29E1;
                renderAvatarPopup.popupProgress._1.C[0xB22C ^ 0xB25B] = 0x3E55 ^ 0xB25B;
                renderAvatarPopup.popupProgress._1.C[0xF111 ^ 0xF05D] = 0xF059 ^ 0xF05D;
                renderAvatarPopup.popupProgress._1.C[0xD469 ^ 0xD463] = 0xFFFF2BDE ^ 0xD463;
                renderAvatarPopup.popupProgress._1.C[0xB01F ^ 0xB0B0] = 0x391F ^ 0xB0B0;
                renderAvatarPopup.popupProgress._1.C[0x5947 ^ 0x593B] = 0x15306 ^ 0x593B;
                renderAvatarPopup.popupProgress._1.C[0x10737 ^ 0x107AB] = 0x1932F ^ 0x107AB;
                renderAvatarPopup.popupProgress._1.C[0x123C ^ 0x12C2] = 0xCF06 ^ 0x12C2;
                renderAvatarPopup.popupProgress._1.C[0xDFA6 ^ 0xDFFC] = 0xFFFF205E ^ 0xDFFC;
                renderAvatarPopup.popupProgress._1.C[0xDFF5 ^ 0xDF15] = 0x211F ^ 0xDF15;
                renderAvatarPopup.popupProgress._1.C[0xCE4A ^ 0xCE99] = 0xCDA ^ 0xCE99;
                renderAvatarPopup.popupProgress._1.C[0xCF08 ^ 0xCF35] = 0xFFFF3047 ^ 0xCF35;
                renderAvatarPopup.popupProgress._1.C[0xF23 ^ 0xF2B] = 0xF63 ^ 0xF2B;
                renderAvatarPopup.popupProgress._1.C[0x24B1 ^ 0x25D7] = 0x25D4 ^ 0x25D7;
                renderAvatarPopup.popupProgress._1.C[0x8415 ^ 0x8596] = 0x421A ^ 0x8596;
                renderAvatarPopup.popupProgress._1.C[0x1BE0 ^ 0x1B27] = 0xD1C8 ^ 0x1B27;
                renderAvatarPopup.popupProgress._1.C[0x3808 ^ 0x3816] = 0x3816 ^ 0x3816;
                renderAvatarPopup.popupProgress._1.C[0xAB73 ^ 0xAA4A] = 0x2719 ^ 0xAA4A;
                renderAvatarPopup.popupProgress._1.C[0x6C30 ^ 0x6C33] = 0x6C0B ^ 0x6C33;
                renderAvatarPopup.popupProgress._1.C[0xFF6C ^ 0xFFD8] = 0xD9A9 ^ 0xFFD8;
                renderAvatarPopup.popupProgress._1.C[0x7B5A ^ 0x7B7E] = 0xB6E9 ^ 0x7B7E;
                renderAvatarPopup.popupProgress._1.C[0x3C20 ^ 0x3D03] = 0x13578 ^ 0x3D03;
                renderAvatarPopup.popupProgress._1.C[0x27 ^ 0x12F] = 0x76A1 ^ 0x12F;
                renderAvatarPopup.popupProgress._1.C[0x41F7 ^ 0x4166] = 0x405B ^ 0x4166;
                renderAvatarPopup.popupProgress._1.C[0xC0B4 ^ 0xC1A3] = 0x598E ^ 0xC1A3;
                renderAvatarPopup.popupProgress._1.C[0xE7FF ^ 0xE7B3] = 0xE7AA ^ 0xE7B3;
                renderAvatarPopup.popupProgress._1.C[0x38D2 ^ 0x39D0] = 0xE7B9 ^ 0x39D0;
                renderAvatarPopup.popupProgress._1.C[0xBE1F ^ 0xBE34] = 0xFFFF41A1 ^ 0xBE34;
                renderAvatarPopup.popupProgress._1.C[0x76AE ^ 0x762A] = 0x9EBC ^ 0x762A;
                renderAvatarPopup.popupProgress._1.C[0x7CEF ^ 0x7D93] = 0x8D71 ^ 0x7D93;
                renderAvatarPopup.popupProgress._1.C[0x860A ^ 0x86DD] = 0x4F6B ^ 0x86DD;
                renderAvatarPopup.popupProgress._1.C[0x31E9 ^ 0x319F] = 0xFFFF426F ^ 0x319F;
                renderAvatarPopup.popupProgress._1.C[0x93FF ^ 0x9369] = 0xFFFF9DE3 ^ 0x9369;
                renderAvatarPopup.popupProgress._1.C[0xFF96 ^ 0xFFBE] = 0xA1E0 ^ 0xFFBE;
                renderAvatarPopup.popupProgress._1.C[0x11FD ^ 0x11D1] = 0xFFFFEE4C ^ 0x11D1;
                renderAvatarPopup.popupProgress._1.C[0x6102 ^ 0x6017] = 0xFFFFDE5D ^ 0x6017;
                renderAvatarPopup.popupProgress._1.C[0x78BE ^ 0x7844] = 0x660E ^ 0x7844;
                renderAvatarPopup.popupProgress._1.C[0x8A77 ^ 0x8A39] = 0x8A40 ^ 0x8A39;
                renderAvatarPopup.popupProgress._1.C[0xE0A8 ^ 0xE036] = 0x74FB ^ 0xE036;
                renderAvatarPopup.popupProgress._1.C[0x2F2A ^ 0x2E6C] = 0x2E67 ^ 0x2E6C;
                renderAvatarPopup.popupProgress._1.C[0x37CF ^ 0x3705] = 0xFDEC ^ 0x3705;
                renderAvatarPopup.popupProgress._1.C[0x6510 ^ 0x65F9] = 0xFFFF2203 ^ 0x65F9;
                renderAvatarPopup.popupProgress._1.C[0x9473 ^ 0x955B] = 0x2EB1 ^ 0x955B;
                renderAvatarPopup.popupProgress._1.C[0x741C ^ 0x7561] = 0x34E3 ^ 0x7561;
                renderAvatarPopup.popupProgress._1.C[0x42BD ^ 0x42F7] = 0xFFFFBD74 ^ 0x42F7;
                renderAvatarPopup.popupProgress._1.C[0x9D8F ^ 0x9DD6] = 0x9DBF ^ 0x9DD6;
                renderAvatarPopup.popupProgress._1.C[0xD56E ^ 0xD501] = 0xECF ^ 0xD501;
                renderAvatarPopup.popupProgress._1.C[0x891F ^ 0x8930] = 0xFFFF769C ^ 0x8930;
                renderAvatarPopup.popupProgress._1.C[0xCF07 ^ 0xCE1E] = 0x567A ^ 0xCE1E;
                renderAvatarPopup.popupProgress._1.C[0xECF8 ^ 0xEDB3] = 0xED86 ^ 0xEDB3;
                renderAvatarPopup.popupProgress._1.C[0x7A2C ^ 0x7A2C] = 0x7A71 ^ 0x7A2C;
                renderAvatarPopup.popupProgress._1.C[0x3D93 ^ 0x3CA8] = 0x5CB4 ^ 0x3CA8;
                renderAvatarPopup.popupProgress._1.C[0xF3E1 ^ 0xF39B] = 0x6FD ^ 0xF39B;
                renderAvatarPopup.popupProgress._1.C[0x104FA ^ 0x104DB] = 0x11F1A ^ 0x104DB;
                renderAvatarPopup.popupProgress._1.C[0x5DAB ^ 0x5CA2] = 0xFFFFD4BA ^ 0x5CA2;
                renderAvatarPopup.popupProgress._1.C[0x1015D ^ 0x10072] = 0x10072 ^ 0x10072;
                renderAvatarPopup.popupProgress._1.C[0x9271 ^ 0x92AA] = 0x1ABF ^ 0x92AA;
                renderAvatarPopup.popupProgress._1.C[0xD69 ^ 0xD87] = 0xC4DC ^ 0xD87;
                renderAvatarPopup.popupProgress._1.C[0xA866 ^ 0xA8DD] = 0xD92F ^ 0xA8DD;
                renderAvatarPopup.popupProgress._1.C[0x45A1 ^ 0x44F0] = 0xFFFFBB29 ^ 0x44F0;
                renderAvatarPopup.popupProgress._1.C[0x53F8 ^ 0x5270] = 0x572B ^ 0x5270;
                renderAvatarPopup.popupProgress._1.C[0xED5D ^ 0xEDC7] = 0x921C ^ 0xEDC7;
                renderAvatarPopup.popupProgress._1.C[0x9B48 ^ 0x9A6E] = 0x19208 ^ 0x9A6E;
                renderAvatarPopup.popupProgress._1.C[0x1029A ^ 0x10286] = 0x10284 ^ 0x10286;
                renderAvatarPopup.popupProgress._1.C[0xC052 ^ 0xC17B] = 0xFFFF8579 ^ 0xC17B;
                renderAvatarPopup.popupProgress._1.C[0x7ED7 ^ 0x7FAE] = 0x7FAE ^ 0x7FAE;
                renderAvatarPopup.popupProgress._1.C[0x6D0 ^ 0x751] = 0xB65B ^ 0x751;
                renderAvatarPopup.popupProgress._1.C[0x3F04 ^ 0x3F08] = 0x3F45 ^ 0x3F08;
                renderAvatarPopup.popupProgress._1.C[0x1BC6 ^ 0x1BB3] = 0x97BD ^ 0x1BB3;
                renderAvatarPopup.popupProgress._1.C[0xB60C ^ 0xB6D0] = 0x3ECF ^ 0xB6D0;
                renderAvatarPopup.popupProgress._1.C[0x25E6 ^ 0x25FF] = 0x25FF ^ 0x25FF;
                renderAvatarPopup.popupProgress._1.C[0x59 ^ 0x8C] = 0xFFFF3D46 ^ 0x8C;
                renderAvatarPopup.popupProgress._1.C[0x1987 ^ 0x1802] = 0x472F ^ 0x1802;
                renderAvatarPopup.popupProgress._1.C[0xF06F ^ 0xF143] = 0x51D6 ^ 0xF143;
                renderAvatarPopup.popupProgress._1.C[0x2711 ^ 0x27DE] = 0x273D ^ 0x27DE;
                renderAvatarPopup.popupProgress._1.C[0xDB9A ^ 0xDAB0] = 0x615A ^ 0xDAB0;
                renderAvatarPopup.popupProgress._1.C[0x2E4E ^ 0x2E97] = 0xE73C ^ 0x2E97;
                renderAvatarPopup.popupProgress._1.C[0x1946 ^ 0x19B7] = 0x51B9 ^ 0x19B7;
                renderAvatarPopup.popupProgress._1.C[0xCD9 ^ 0xC60] = 0xFFFF1629 ^ 0xC60;
                renderAvatarPopup.popupProgress._1.C[0x9DE8 ^ 0x9CDF] = 0xD3AD ^ 0x9CDF;
                renderAvatarPopup.popupProgress._1.C[0xBFAB ^ 0xBEEA] = 0xBEFA ^ 0xBEEA;
                renderAvatarPopup.popupProgress._1.C[0x6145 ^ 0x612F] = 0x8652 ^ 0x612F;
                renderAvatarPopup.popupProgress._1.C[0x10C58 ^ 0x10C4B] = 0x10C29 ^ 0x10C4B;
                renderAvatarPopup.popupProgress._1.C[0x1B96 ^ 0x1B6E] = 0x524 ^ 0x1B6E;
                renderAvatarPopup.popupProgress._1.C[0xFAC3 ^ 0xFB95] = 0xFB9C ^ 0xFB95;
                renderAvatarPopup.popupProgress._1.C[0x7AF0 ^ 0x7AEB] = 0x7AEB ^ 0x7AEB;
                renderAvatarPopup.popupProgress._1.C[0xB689 ^ 0xB659] = 0xB6A5 ^ 0xB659;
                renderAvatarPopup.popupProgress._1.C[0x77B6 ^ 0x768A] = 0xA576 ^ 0x768A;
                renderAvatarPopup.popupProgress._1.C[0xEC81 ^ 0xECB3] = 0xECA2 ^ 0xECB3;
                renderAvatarPopup.popupProgress._1.C[0x46AC ^ 0x47AF] = 0xCFAE ^ 0x47AF;
                renderAvatarPopup.popupProgress._1.C[0x9CDC ^ 0x9DE4] = 0xB5C7 ^ 0x9DE4;
                renderAvatarPopup.popupProgress._1.C[0x5FA4 ^ 0x5F01] = 0x7093 ^ 0x5F01;
                renderAvatarPopup.popupProgress._1.C[0xBB25 ^ 0xBB86] = 0x19ED ^ 0xBB86;
                renderAvatarPopup.popupProgress._1.C[0xD646 ^ 0xD7CA] = 0xD7C8 ^ 0xD7CA;
                renderAvatarPopup.popupProgress._1.C[0x68A3 ^ 0x6885] = 0x45EF ^ 0x6885;
                renderAvatarPopup.popupProgress._1.C[0x2AE7 ^ 0x2BEC] = 0x9FAB ^ 0x2BEC;
                renderAvatarPopup.popupProgress._1.C[0x10E08 ^ 0x10E10] = 0x10E13 ^ 0x10E10;
                renderAvatarPopup.popupProgress._1.C[0xE0E3 ^ 0xE081] = 0xFFFF1F2D ^ 0xE081;
                renderAvatarPopup.popupProgress._1.C[0x34CD ^ 0x342F] = 0xCA25 ^ 0x342F;
                renderAvatarPopup.popupProgress._1.C[0xF06B ^ 0xF171] = 0x6944 ^ 0xF171;
                renderAvatarPopup.popupProgress._1.C[0x32BF ^ 0x3339] = 0xE569 ^ 0x3339;
                renderAvatarPopup.popupProgress._1.C[0x6B2E ^ 0x6A5F] = 0x65A2 ^ 0x6A5F;
                renderAvatarPopup.popupProgress._1.C[0xA32B ^ 0xA343] = 0xA342 ^ 0xA343;
                renderAvatarPopup.popupProgress._1.C[0xC6D4 ^ 0xC624] = 0x8E02 ^ 0xC624;
                renderAvatarPopup.popupProgress._1.C[0x689C ^ 0x68D3] = 0xFFFF972F ^ 0x68D3;
                renderAvatarPopup.popupProgress._1.C[0x103F3 ^ 0x1032C] = 0x1FD34 ^ 0x1032C;
                renderAvatarPopup.popupProgress._1.C[0x6ADD ^ 0x6A5D] = 0xB9F2 ^ 0x6A5D;
                renderAvatarPopup.popupProgress._1.C[0xAF09 ^ 0xAE2C] = 0x1A60D ^ 0xAE2C;
                renderAvatarPopup.popupProgress._1.C[0xFAD9 ^ 0xFBD6] = 0x3F81 ^ 0xFBD6;
                renderAvatarPopup.popupProgress._1.C[0xDEE ^ 0xD5D] = 0x2B3D ^ 0xD5D;
                renderAvatarPopup.popupProgress._1.C[0xCC70 ^ 0xCCB5] = 0xFFFFCFE2 ^ 0xCCB5;
                renderAvatarPopup.popupProgress._1.C[0x10E66 ^ 0x10E12] = 0x18212 ^ 0x10E12;
                renderAvatarPopup.popupProgress._1.C[0x855D ^ 0x8536] = 0x625B ^ 0x8536;
                renderAvatarPopup.popupProgress._1.C[0xFBAB ^ 0xFB24] = 0xA96D ^ 0xFB24;
                renderAvatarPopup.popupProgress._1.C[0x3236 ^ 0x3281] = 0xD716 ^ 0x3281;
                renderAvatarPopup.popupProgress._1.C[0xD490 ^ 0xD441] = 0xFFFF2B65 ^ 0xD441;
                renderAvatarPopup.popupProgress._1.C[0xEEC4 ^ 0xEF8E] = 0xEF86 ^ 0xEF8E;
                renderAvatarPopup.popupProgress._1.C[0x10640 ^ 0x10615] = 0x1064D ^ 0x10615;
                renderAvatarPopup.popupProgress._1.C[0xFFF ^ 0xE93] = 0xFDE4 ^ 0xE93;
                renderAvatarPopup.popupProgress._1.C[0xBE84 ^ 0xBF9B] = 0x832C ^ 0xBF9B;
                renderAvatarPopup.popupProgress._1.C[0x195F ^ 0x18D5] = 0xD04A ^ 0x18D5;
                renderAvatarPopup.popupProgress._1.C[0x5294 ^ 0x522C] = 0xB7A1 ^ 0x522C;
                renderAvatarPopup.popupProgress._1.C[0x6189 ^ 0x61EF] = 0x61EF ^ 0x61EF;
                renderAvatarPopup.popupProgress._1.C[0xA929 ^ 0xA86E] = 0xA816 ^ 0xA86E;
                renderAvatarPopup.popupProgress._1.C[0xEA41 ^ 0xEA6F] = 0xEA45 ^ 0xEA6F;
                renderAvatarPopup.popupProgress._1.C[0x4554 ^ 0x4594] = 0x8529 ^ 0x4594;
                renderAvatarPopup.popupProgress._1.C[0x9A41 ^ 0x9A77] = 0xFFFF65DD ^ 0x9A77;
                renderAvatarPopup.popupProgress._1.C[0x28B3 ^ 0x28E1] = 0x2898 ^ 0x28E1;
                renderAvatarPopup.popupProgress._1.C[0x79EB ^ 0x79B5] = 0xFFFF8669 ^ 0x79B5;
                renderAvatarPopup.popupProgress._1.C[0x1A45 ^ 0x1B16] = 0xFFFFE4DD ^ 0x1B16;
                renderAvatarPopup.popupProgress._1.C[0x1F98 ^ 0x1FD5] = 0x1F95 ^ 0x1FD5;
                renderAvatarPopup.popupProgress._1.C[0x3838 ^ 0x38B6] = 0x6AC9 ^ 0x38B6;
                renderAvatarPopup.popupProgress._1.C[0x9B60 ^ 0x9B43] = 0xBCE5 ^ 0x9B43;
                renderAvatarPopup.popupProgress._1.C[0x87D3 ^ 0x8657] = 0x8B7B ^ 0x8657;
                renderAvatarPopup.popupProgress._1.C[0xBBAB ^ 0xBAEF] = 0xBAE8 ^ 0xBAEF;
                renderAvatarPopup.popupProgress._1.C[0x24B0 ^ 0x2592] = 0x1921 ^ 0x2592;
                renderAvatarPopup.popupProgress._1.C[0x67A9 ^ 0x6723] = 0x10CA ^ 0x6723;
                renderAvatarPopup.popupProgress._1.C[0xC30D ^ 0xC373] = 0xFFFE36B6 ^ 0xC373;
                renderAvatarPopup.popupProgress._1.C[0x6999 ^ 0x6975] = 0xA02E ^ 0x6975;
                renderAvatarPopup.popupProgress._1.C[0xF1AE ^ 0xF19F] = 0xF1D3 ^ 0xF19F;
                renderAvatarPopup.popupProgress._1.C[0x25B5 ^ 0x258B] = 0x25AA ^ 0x258B;
                renderAvatarPopup.popupProgress._1.C[0xA23A ^ 0xA358] = 0xA349 ^ 0xA358;
                renderAvatarPopup.popupProgress._1.C[0xDF92 ^ 0xDF73] = 0xFFFFDEC9 ^ 0xDF73;
                renderAvatarPopup.popupProgress._1.C[0x4616 ^ 0x4764] = 0x1B39 ^ 0x4764;
                renderAvatarPopup.popupProgress._1.C[0x7557 ^ 0x7524] = 0x82B ^ 0x7524;
                renderAvatarPopup.popupProgress._1.C[0x2544 ^ 0x25AB] = 0x6D93 ^ 0x25AB;
                renderAvatarPopup.popupProgress._1.C[0x8232 ^ 0x824F] = 0x18876 ^ 0x824F;
                renderAvatarPopup.popupProgress._1.C[0x2317 ^ 0x2335] = 0x8421 ^ 0x2335;
                renderAvatarPopup.popupProgress._1.C[0xFCBB ^ 0xFC72] = 0x3698 ^ 0xFC72;
                renderAvatarPopup.popupProgress._1.C[0x10280 ^ 0x103DA] = 0x103DB ^ 0x103DA;
                renderAvatarPopup.popupProgress._1.C[0x645E ^ 0x6564] = 0x37CF ^ 0x6564;
                renderAvatarPopup.popupProgress._1.C[0xC872 ^ 0xC8E5] = 0x398D ^ 0xC8E5;
                renderAvatarPopup.popupProgress._1.C[0x37E3 ^ 0x36D6] = 0x6697 ^ 0x36D6;
                renderAvatarPopup.popupProgress._1.C[0xF854 ^ 0xF92E] = 0xF93A ^ 0xF92E;
                renderAvatarPopup.popupProgress._1.C[0x716D ^ 0x7019] = 0x701B ^ 0x7019;
                renderAvatarPopup.popupProgress._1.C[0x327D ^ 0x330A] = 0x331A ^ 0x330A;
                renderAvatarPopup.popupProgress._1.C[0x248C ^ 0x2589] = 0xADF8 ^ 0x2589;
                renderAvatarPopup.popupProgress._1.C[0x4295 ^ 0x43F8] = 0x2D00 ^ 0x43F8;
                renderAvatarPopup.popupProgress._1.C[0x10092 ^ 0x101EA] = 0x101E9 ^ 0x101EA;
                renderAvatarPopup.popupProgress._1.C[0xFBE9 ^ 0xFB0A] = 0x734B ^ 0xFB0A;
                renderAvatarPopup.popupProgress._1.C[0x96BA ^ 0x96DB] = 0x96D3 ^ 0x96DB;
                renderAvatarPopup.popupProgress._1.C[0x3E43 ^ 0x3E38] = 0xCB4B ^ 0x3E38;
                renderAvatarPopup.popupProgress._1.C[0xF350 ^ 0xF24E] = 0x2EA1 ^ 0xF24E;
                renderAvatarPopup.popupProgress._1.C[0x4A43 ^ 0x4AAB] = 0xF2CD ^ 0x4AAB;
                renderAvatarPopup.popupProgress._1.C[0x108E1 ^ 0x10805] = 0x18049 ^ 0x10805;
                renderAvatarPopup.popupProgress._1.C[0x641B ^ 0x64E0] = 0xB92A ^ 0x64E0;
                renderAvatarPopup.popupProgress._1.C[0xA92D ^ 0xA9F3] = 0x21EC ^ 0xA9F3;
                renderAvatarPopup.popupProgress._1.C[0x5337 ^ 0x53C0] = 0x4D9A ^ 0x53C0;
                renderAvatarPopup.popupProgress._1.C[0x72DC ^ 0x7387] = 0xFFFF8C3E ^ 0x7387;
                renderAvatarPopup.popupProgress._1.C[0x296A ^ 0x286B] = 0xFFFF098D ^ 0x286B;
                renderAvatarPopup.popupProgress._1.C[0x2751 ^ 0x26D6] = 0xFCAD ^ 0x26D6;
                renderAvatarPopup.popupProgress._1.C[0xB51A ^ 0xB5B4] = 0xA5C9 ^ 0xB5B4;
                renderAvatarPopup.popupProgress._1.C[0x3979 ^ 0x3862] = 0xE481 ^ 0x3862;
                renderAvatarPopup.popupProgress._1.C[0xF4F3 ^ 0xF4EE] = 0xF4EE ^ 0xF4EE;
                renderAvatarPopup.popupProgress._1.C[0xC0C6 ^ 0xC189] = 0xFFFF3E74 ^ 0xC189;
                renderAvatarPopup.popupProgress._1.C[0x10361 ^ 0x10250] = 0x10250 ^ 0x10250;
                renderAvatarPopup.popupProgress._1.C[0x83DC ^ 0x82AA] = 0x82BA ^ 0x82AA;
                renderAvatarPopup.popupProgress._1.C[0xE77D ^ 0xE7C1] = 0x9620 ^ 0xE7C1;
                renderAvatarPopup.popupProgress._1.C[0x8BAF ^ 0x8BFC] = 0x8B90 ^ 0x8BFC;
                renderAvatarPopup.popupProgress._1.C[0x355E ^ 0x341E] = 0x341F ^ 0x341E;
                renderAvatarPopup.popupProgress._1.C[0xDFB2 ^ 0xDF70] = 0x1FCD ^ 0xDF70;
                renderAvatarPopup.popupProgress._1.C[0xD8E5 ^ 0xD867] = 0xBEB ^ 0xD867;
                renderAvatarPopup.popupProgress._1.C[0x56A6 ^ 0x5643] = 0xDE4F ^ 0x5643;
                renderAvatarPopup.popupProgress._1.C[0xB8D7 ^ 0xB99F] = 0xB991 ^ 0xB99F;
                renderAvatarPopup.popupProgress._1.C[0xCB01 ^ 0xCA3F] = 0x2BD1 ^ 0xCA3F;
                renderAvatarPopup.popupProgress._1.C[0xD9BB ^ 0xD947] = 0x483 ^ 0xD947;
                renderAvatarPopup.popupProgress._1.C[0xECCB ^ 0xEC00] = 0xB13B ^ 0xEC00;
                renderAvatarPopup.popupProgress._1.C[0x6CF9 ^ 0x6DB7] = 0x6DB4 ^ 0x6DB7;
                renderAvatarPopup.popupProgress._1.C[0x240A ^ 0x250C] = 0xAD0F ^ 0x250C;
                renderAvatarPopup.popupProgress._1.C[0x38A0 ^ 0x38E6] = 0x38E8 ^ 0x38E6;
                renderAvatarPopup.popupProgress._1.C[0x288 ^ 0x217] = 0x9693 ^ 0x217;
                renderAvatarPopup.popupProgress._1.C[0x4F7B ^ 0x4E6B] = 0x8A2B ^ 0x4E6B;
                renderAvatarPopup.popupProgress._1.C[0xEBF3 ^ 0xEA80] = 0x5E9F ^ 0xEA80;
                renderAvatarPopup.popupProgress._1.C[0x720A ^ 0x72D8] = 0x7224 ^ 0x72D8;
                renderAvatarPopup.popupProgress._1.C[0xD2E0 ^ 0xD2F6] = 0xD2B2 ^ 0xD2F6;
                renderAvatarPopup.popupProgress._1.C[0x6B91 ^ 0x6B65] = 0x8016 ^ 0x6B65;
                renderAvatarPopup.popupProgress._1.C[0x5D29 ^ 0x5C35] = 0x80DA ^ 0x5C35;
                renderAvatarPopup.popupProgress._1.C[0x10317 ^ 0x10305] = 0x1035F ^ 0x10305;
                renderAvatarPopup.popupProgress._1.C[0x90F8 ^ 0x90E9] = 0x90C5 ^ 0x90E9;
                renderAvatarPopup.popupProgress._1.C[0x5A4A ^ 0x5A16] = 0x5A45 ^ 0x5A16;
                renderAvatarPopup.popupProgress._1.C[0x109E ^ 0x11F1] = 0xE0A ^ 0x11F1;
                renderAvatarPopup.popupProgress._1.C[0x6909 ^ 0x6969] = 0xFFFF96AC ^ 0x6969;
                renderAvatarPopup.popupProgress._1.C[0x836A ^ 0x835E] = 0x8307 ^ 0x835E;
                renderAvatarPopup.popupProgress._1.C[0x3E85 ^ 0x3F8B] = 0x8BC9 ^ 0x3F8B;
                renderAvatarPopup.popupProgress._1.C[0x9C5E ^ 0x9CB9] = 0x24DC ^ 0x9CB9;
                renderAvatarPopup.popupProgress._1.C[0xC8BC ^ 0xC88B] = 0xC880 ^ 0xC88B;
                renderAvatarPopup.popupProgress._1.C[0x265A ^ 0x2713] = 0x2734 ^ 0x2713;
                renderAvatarPopup.popupProgress._1.C[0x6723 ^ 0x672C] = 0x676D ^ 0x672C;
                renderAvatarPopup.popupProgress._1.C[0x6AFE ^ 0x6A78] = 0x82FE ^ 0x6A78;
                renderAvatarPopup.popupProgress._1.C[0xDE09 ^ 0xDF5D] = 0xDF51 ^ 0xDF5D;
                renderAvatarPopup.popupProgress._1.C[0xB7E ^ 0xBE3] = 0x9F67 ^ 0xBE3;
                renderAvatarPopup.popupProgress._1.C[0x1037B ^ 0x10341] = 0xFFFEFCE5 ^ 0x10341;
                renderAvatarPopup.popupProgress._1.C[0x9E9E ^ 0x9EFA] = 0x9EFB ^ 0x9EFA;
                renderAvatarPopup.popupProgress._1.C[0xEBA9 ^ 0xEB99] = 0xEBC7 ^ 0xEB99;
                renderAvatarPopup.popupProgress._1.C[0xFCB3 ^ 0xFCCA] = 0x9B9 ^ 0xFCCA;
                renderAvatarPopup.popupProgress._1.C[0xD35D ^ 0xD3FD] = 0x7191 ^ 0xD3FD;
                renderAvatarPopup.popupProgress._1.C[0xCD4E ^ 0xCC6E] = 0xF0DD ^ 0xCC6E;
                renderAvatarPopup.popupProgress._1.C[0xF6D0 ^ 0xF6F7] = 0x7BA ^ 0xF6F7;
                renderAvatarPopup.popupProgress._1.C[0x4EE9 ^ 0x4FF8] = 0xFFFF7441 ^ 0x4FF8;
                renderAvatarPopup.popupProgress._1.C[0x2792 ^ 0x279C] = 0xFFFFD849 ^ 0x279C;
                renderAvatarPopup.popupProgress._1.C[0xDF98 ^ 0xDF31] = 0xFD56 ^ 0xDF31;
                renderAvatarPopup.popupProgress._1.C[0x9E06 ^ 0x9EF0] = 0x7583 ^ 0x9EF0;
                renderAvatarPopup.popupProgress._1.C[0xCCEF ^ 0xCD8E] = 0xCDE3 ^ 0xCD8E;
                renderAvatarPopup.popupProgress._1.C[0x7DA4 ^ 0x7CF6] = 0x7CF3 ^ 0x7CF6;
                renderAvatarPopup.popupProgress._1.C[0x8BCF ^ 0x8B92] = 0xFFFF7431 ^ 0x8B92;
                renderAvatarPopup.popupProgress._1.C[0x3DD5 ^ 0x3DC2] = 0xFFFFC239 ^ 0x3DC2;
                renderAvatarPopup.popupProgress._1.C[0xB9BC ^ 0xB90C] = 0x30A2 ^ 0xB90C;
                renderAvatarPopup.popupProgress._1.C[0xCF78 ^ 0xCEF5] = 0xCEF1 ^ 0xCEF5;
                renderAvatarPopup.popupProgress._1.C[0x69B7 ^ 0x6911] = 0xFFFFB931 ^ 0x6911;
                renderAvatarPopup.popupProgress._1.C[0x9CD9 ^ 0x9C6B] = 0x15C5 ^ 0x9C6B;
                renderAvatarPopup.popupProgress._1.C[0xBE4A ^ 0xBEE0] = 0xFFFF6374 ^ 0xBEE0;
                renderAvatarPopup.popupProgress._1.C[0x40EA ^ 0x4000] = 0xF866 ^ 0x4000;
                renderAvatarPopup.popupProgress._1.C[0x8935 ^ 0x886B] = 0x8869 ^ 0x886B;
                renderAvatarPopup.popupProgress._1.C[0x599 ^ 0x528] = 0x8CAE ^ 0x528;
                renderAvatarPopup.popupProgress._1.C[0x10D75 ^ 0x10C2A] = 0xFFFEF3AF ^ 0x10C2A;
                renderAvatarPopup.popupProgress._1.C[0x240E ^ 0x2483] = 0x76CA ^ 0x2483;
                renderAvatarPopup.popupProgress._1.C[0x9714 ^ 0x969F] = 0x969C ^ 0x969F;
                renderAvatarPopup.popupProgress._1.C[0x27CD ^ 0x26A8] = 0x26A8 ^ 0x26A8;
                renderAvatarPopup.popupProgress._1.C[0x595E ^ 0x591F] = 0x595F ^ 0x591F;
                renderAvatarPopup.popupProgress._1.C[0x2052 ^ 0x2050] = 0x2048 ^ 0x2050;
                renderAvatarPopup.popupProgress._1.C[0x6C75 ^ 0x6C72] = 0xFFFF93FD ^ 0x6C72;
                renderAvatarPopup.popupProgress._1.C[0x7411 ^ 0x7454] = 0x7442 ^ 0x7454;
                renderAvatarPopup.popupProgress._1.C[0xF5E8 ^ 0xF5B8] = 0xF59F ^ 0xF5B8;
                renderAvatarPopup.popupProgress._1.C[0xBC96 ^ 0xBDA5] = 0xBDA5 ^ 0xBDA5;
                renderAvatarPopup.popupProgress._1.C[0xECF3 ^ 0xEC68] = 0x93A6 ^ 0xEC68;
                renderAvatarPopup.popupProgress._1.C[0x1C40 ^ 0x1D58] = 0x856D ^ 0x1D58;
                renderAvatarPopup.popupProgress._1.C[0x3D85 ^ 0x3CBA] = 0xBB4 ^ 0x3CBA;
                renderAvatarPopup.popupProgress._1.C[0xD49A ^ 0xD5C2] = 0xD5CF ^ 0xD5C2;
                renderAvatarPopup.popupProgress._1.C[0x289 ^ 0x2E0] = 0x2E0 ^ 0x2E0;
                renderAvatarPopup.popupProgress._1.C[0xF797 ^ 0xF7F4] = 0xFFFF0860 ^ 0xF7F4;
                renderAvatarPopup.popupProgress._1.C[0x4D04 ^ 0x4D50] = 0x4D7D ^ 0x4D50;
                renderAvatarPopup.popupProgress._1.C[0x6153 ^ 0x61F1] = 0xFFFF3C4F ^ 0x61F1;
                renderAvatarPopup.popupProgress._1.C[0xBE50 ^ 0xBF71] = 0x83E3 ^ 0xBF71;
                renderAvatarPopup.popupProgress._1.C[0xD9AE ^ 0xD91B] = 0xFFFF00E3 ^ 0xD91B;
                renderAvatarPopup.popupProgress._1.C[0xFEC0 ^ 0xFFA4] = 0xFFA6 ^ 0xFFA4;
                renderAvatarPopup.popupProgress._1.C[0x6411 ^ 0x6498] = 0x130A ^ 0x6498;
                renderAvatarPopup.popupProgress._1.C[0xE395 ^ 0xE2B8] = 0x4201 ^ 0xE2B8;
                renderAvatarPopup.popupProgress._1.C[0xC1E1 ^ 0xC127] = 0x3D9A ^ 0xC127;
                renderAvatarPopup.popupProgress._1.C[0x6963 ^ 0x69C4] = 0x4656 ^ 0x69C4;
                renderAvatarPopup.popupProgress._1.C[0xCFFC ^ 0xCF7D] = 0x1CD1 ^ 0xCF7D;
                renderAvatarPopup.popupProgress._1.C[0x2A1A ^ 0x2AA5] = 0xEA1F ^ 0x2AA5;
                renderAvatarPopup.popupProgress._1.C[0x8431 ^ 0x8438] = 0x8472 ^ 0x8438;
                renderAvatarPopup.popupProgress._1.C[0x43B8 ^ 0x43B5] = 0xFFFFBC2E ^ 0x43B5;
                renderAvatarPopup.popupProgress._1.C[0xC194 ^ 0xC0A0] = 0xC0B2 ^ 0xC0A0;
                renderAvatarPopup.popupProgress._1.C[0x5E6 ^ 0x4C8] = 0xA45D ^ 0x4C8;
                renderAvatarPopup.popupProgress._1.C[0xA02E ^ 0xA15E] = 0x54E3 ^ 0xA15E;
                renderAvatarPopup.popupProgress._1.C[0xB5B0 ^ 0xB5C0] = 0xC8C9 ^ 0xB5C0;
                renderAvatarPopup.popupProgress._1.C[0x23ED ^ 0x2339] = 0xE172 ^ 0x2339;
                renderAvatarPopup.popupProgress._1.C[0x905A ^ 0x904A] = 0xFFFF6FDF ^ 0x904A;
                renderAvatarPopup.popupProgress._1.C[0xCF6D ^ 0xCE2F] = 0xCE25 ^ 0xCE2F;
                renderAvatarPopup.popupProgress._1.C[0x10AD1 ^ 0x10BB1] = 0x10BB1 ^ 0x10BB1;
                renderAvatarPopup.popupProgress._1.C[0x31C ^ 0x358] = 0x31D ^ 0x358;
                renderAvatarPopup.popupProgress._1.C[0xFA90 ^ 0xFB97] = 0x8C00 ^ 0xFB97;
                renderAvatarPopup.popupProgress._1.C[0xD047 ^ 0xD11E] = 0xD153 ^ 0xD11E;
                renderAvatarPopup.popupProgress._1.C[0xB98D ^ 0xB915] = 0xC6D9 ^ 0xB915;
                renderAvatarPopup.popupProgress._1.C[0x7B32 ^ 0x7B57] = 0x7B55 ^ 0x7B57;
                renderAvatarPopup.popupProgress._1.C[0x1C35 ^ 0x1D60] = 0x1D08 ^ 0x1D60;
                renderAvatarPopup.popupProgress._1.C[0x5645 ^ 0x56FB] = 0x271A ^ 0x56FB;
                renderAvatarPopup.popupProgress._1.C[0x4B6A ^ 0x4BB0] = 0x8212 ^ 0x4BB0;
                renderAvatarPopup.popupProgress._1.C[0xBA83 ^ 0xBBFC] = 0xE47A ^ 0xBBFC;
                renderAvatarPopup.popupProgress._1.C[0x97B3 ^ 0x96E4] = 0xFFFF694B ^ 0x96E4;
                renderAvatarPopup.popupProgress._1.C[0xCD36 ^ 0xCD6D] = 0xCD43 ^ 0xCD6D;
                renderAvatarPopup.popupProgress._1.C[0xD8D2 ^ 0xD8E9] = 0xFFFF273A ^ 0xD8E9;
                renderAvatarPopup.popupProgress._1.C[0x955C ^ 0x9517] = 0xFFFF6AF7 ^ 0x9517;
                renderAvatarPopup.popupProgress._1.C[0xF966 ^ 0xF86B] = 0xFFFFB3BA ^ 0xF86B;
                renderAvatarPopup.popupProgress._1.C[0xBE1A ^ 0xBF70] = 0x37E5 ^ 0xBF70;
                renderAvatarPopup.popupProgress._1.C[0x370F ^ 0x3605] = 0x418B ^ 0x3605;
                renderAvatarPopup.popupProgress._1.C[0x10F72 ^ 0x10F0A] = 0x1FA76 ^ 0x10F0A;
                renderAvatarPopup.popupProgress._1.C[0x34EB ^ 0x345D] = 0x122C ^ 0x345D;
                renderAvatarPopup.popupProgress._1.C[0xD2DC ^ 0xD2D9] = 0xFFFF2D3C ^ 0xD2D9;
                renderAvatarPopup.popupProgress._1.C[0x2337 ^ 0x2207] = 0x2207 ^ 0x2207;
                renderAvatarPopup.popupProgress._1.C[0xE574 ^ 0xE453] = 0x5FB6 ^ 0xE453;
                renderAvatarPopup.popupProgress._1.C[0x5B10 ^ 0x5BE5] = 0xB0A6 ^ 0x5BE5;
                renderAvatarPopup.popupProgress._1.C[0x5091 ^ 0x505F] = 0xD7F ^ 0x505F;
                renderAvatarPopup.popupProgress._1.C[0xF486 ^ 0xF480] = 0xF4B5 ^ 0xF480;
                renderAvatarPopup.popupProgress._1.C[0x5AFF ^ 0x5A19] = 0xD255 ^ 0x5A19;
                renderAvatarPopup.popupProgress._1.C[0xFF61 ^ 0xFF30] = 0xFF7B ^ 0xFF30;
                renderAvatarPopup.popupProgress._1.C[0xF042 ^ 0xF121] = 0xF021 ^ 0xF121;
                renderAvatarPopup.popupProgress._1.C[0x767C ^ 0x761B] = 0x761A ^ 0x761B;
                renderAvatarPopup.popupProgress._1.C[0xB2E9 ^ 0xB224] = 0xFFFF10A8 ^ 0xB224;
                renderAvatarPopup.popupProgress._1.C[0xE723 ^ 0xE608] = 0x4688 ^ 0xE608;
                renderAvatarPopup.popupProgress._1.C[0xFD46 ^ 0xFC3D] = 0x325C ^ 0xFC3D;
                renderAvatarPopup.popupProgress._1.C[0x46E3 ^ 0x4620] = 0xBA9D ^ 0x4620;
                renderAvatarPopup.popupProgress._1.C[0xF797 ^ 0xF79C] = 0xFFFF0866 ^ 0xF79C;
                renderAvatarPopup.popupProgress._1.C[0xBAD4 ^ 0xBAC0] = 0xBAF4 ^ 0xBAC0;
                renderAvatarPopup.popupProgress._1.C[0xFA48 ^ 0xFA9E] = 0x38D5 ^ 0xFA9E;
                renderAvatarPopup.popupProgress._1.C[0x10AE0 ^ 0x10A6C] = 0x1582D ^ 0x10A6C;
                renderAvatarPopup.popupProgress._1.C[0x9679 ^ 0x9615] = 0x4DD6 ^ 0x9615;
                renderAvatarPopup.popupProgress._1.C[0x5B5D ^ 0x5BCE] = 0x5AF3 ^ 0x5BCE;
                renderAvatarPopup.popupProgress._1.C[0x9480 ^ 0x95DD] = 0xFFFF6A5A ^ 0x95DD;
                renderAvatarPopup.popupProgress._1.C[0x2EA0 ^ 0x2E39] = 0x51F7 ^ 0x2E39;
                renderAvatarPopup.popupProgress._1.C[0x9818 ^ 0x990A] = 0x5D4A ^ 0x990A;
                renderAvatarPopup.popupProgress._1.C[0xCC51 ^ 0xCCF0] = 0x6E9B ^ 0xCCF0;
                renderAvatarPopup.popupProgress._1.C[0xEDFB ^ 0xEDD2] = 0xAEBC ^ 0xEDD2;
                renderAvatarPopup.popupProgress._1.C[0x1651 ^ 0x1613] = 0x1670 ^ 0x1613;
                renderAvatarPopup.popupProgress._1.C[0xB851 ^ 0xB8D6] = 0x5049 ^ 0xB8D6;
                renderAvatarPopup.popupProgress._1.C[0x5143 ^ 0x5013] = 0x501C ^ 0x5013;
                renderAvatarPopup.popupProgress._1.C[0xED1E ^ 0xED0B] = 0xFFFF12DC ^ 0xED0B;
                renderAvatarPopup.popupProgress._1.C[0xA347 ^ 0xA251] = 0xE3C1 ^ 0xA251;
                renderAvatarPopup.popupProgress._1.C[0x10CE7 ^ 0x10CC7] = 0x15C07 ^ 0x10CC7;
                renderAvatarPopup.popupProgress._1.C[0x6C ^ 0x73] = 0x1F ^ 0x73;
                renderAvatarPopup.popupProgress._1.C[0x108E ^ 0x11E0] = 0x7DDA ^ 0x11E0;
                renderAvatarPopup.popupProgress._1.C[0x48DE ^ 0x4899] = 0xFFFFB734 ^ 0x4899;
                renderAvatarPopup.popupProgress._1.C[0x5BF9 ^ 0x5BF8] = 0xFFFFA444 ^ 0x5BF8;
                renderAvatarPopup.popupProgress._1.C[0xE5D9 ^ 0xE590] = 0xFFFF1A23 ^ 0xE590;
                renderAvatarPopup.popupProgress._1.C[0x10BD ^ 0x11F0] = 0xFFFFEE5D ^ 0x11F0;
                renderAvatarPopup.popupProgress._1.C[0xF3CD ^ 0xF35D] = 0xF261 ^ 0xF35D;
                renderAvatarPopup.popupProgress._1.C[0x1377 ^ 0x135D] = 0x135D ^ 0x135D;
            }
        }), 0.0f, 1.0f);
        float f3 = RangesKt.coerceIn(f2 * openProgress2, 0.0f, 1.0f);
        if (f3 <= 0.01f) {
            return;
        }
        AvatarPopupMetrics avatarPopupMetrics = this.avatarPopupMetrics(scale);
        PopupRect popupRect = this.avatarPopupBounds(layout, scale, avatarPopupMetrics);
        float f4 = popupRect.getX();
        float f5 = popupRect.getY() + (1.0f - f2) * avatarPopupMetrics.scaled(4.0f);
        PopupRect popupRect2 = new PopupRect(f4, f5, avatarPopupMetrics.getWidth(), avatarPopupMetrics.getHeight());
        Color color = this.hudAlpha(HudStyle.INSTANCE.getPANEL_COLOR(), f3);
        Color color2 = this.hudAlpha(HudStyle.INSTANCE.getHEADER_COLOR(), f3);
        Color color3 = this.hudAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), f3);
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(color).mix(0.9f).round(avatarPopupMetrics.getCornerRadius()).draw(f4, f5, avatarPopupMetrics.getWidth(), avatarPopupMetrics.getHeight());
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(color2).mix(0.9f).round(new Vector4f(avatarPopupMetrics.getHeaderCornerRadius(), avatarPopupMetrics.getHeaderCornerRadius(), 0.0f, 0.0f)).draw(f4, f5, avatarPopupMetrics.getWidth(), avatarPopupMetrics.getHeaderHeight());
        float f6 = avatarPopupMetrics.getHeaderTextSize() - avatarPopupMetrics.scaled(1.5f);
        float f7 = f5 + (avatarPopupMetrics.getHeaderHeight() - f6) / 2.0f;
        float f8 = this.avatarPopupContentInset(avatarPopupMetrics);
        PopupRect popupRect3 = this.avatarPopupCloseBounds(popupRect2, avatarPopupMetrics);
        int n2 = -122;
        n2 ^= 0x74;
        long l9 = l4;
        int n3 = -9;
        n3 ^= 0xFFFFFFF4;
        l4 = l9 ^ ((long)popupRect3.contains(mouseX, mouseY) << (n2 += 46) ^ l9) & -1L << (n3 += 29);
        int n4 = -127;
        n4 += 103;
        float f9 = RangesKt.coerceIn(avatarPopupCloseHoverAnimation.animate((int)(l4 >>> (n4 += 56)) != 0 ? 1.0f : 0.0f, 180.0f, (Function1<? super Float, Float>)new Function1<Float, Float>((Object)Easings.INSTANCE){
            private static Object[] a;
            private static Object b;
            private static Object[] B;
            private static Object[] A;
            private static Object[] c;
            public static int[] C;
            {
                int n2 = C[0];
                n2 ^= C[1];
                n2 -= C[2];
                int n3 = C[3];
                n3 -= C[4];
                n3 -= C[5];
                int n4 = C[6];
                n4 -= C[7];
                n4 -= C[8];
                int n5 = C[9];
                n5 -= C[10];
                int n6 = C[12];
                n6 += C[13];
                int n7 = C[15];
                n7 ^= C[16];
                super(n2, receiver, Easings.class, (String)a[n3] + (String)a[n4], (String)a[n5 += C[11]] + (String)a[n6 ^= C[14]], n7 ^= C[17]);
            }

            public final Float invoke(float p0) {
                return Float.valueOf(((Easings)this.receiver).standardDecelerate(p0));
            }

            static {
                renderAvatarPopup.closeHover._1.b();
                long l2 = -654942587818296562L;
                long l3 = 1051909813716055108L;
                long l4 = -4674753401283195136L;
                long l5 = -1443009414467600038L;
                long l6 = 7210767841084397550L;
                long l7 = -30076982960125235L;
                long l8 = 5180556928033652647L;
                long l9 = -726200933680502615L;
                long l10 = 1107412071956139750L;
                long l11 = 8761424770434885712L;
                long l12 = 3793422581409082494L;
                long l13 = 3620252151041556693L;
                long l14 = -792108081209304109L;
                long l15 = 8605437585611192458L;
                int n2 = C[18];
                n2 ^= C[19];
                a = new Object[n2 ^= C[20]];
                long l16 = l15;
                int n3 = C[21];
                n3 -= C[22];
                l15 = l16 ^ (0L ^ l16) & -1L << (n3 += C[23]);
                Object[] objectArray = new Object[C[24]];
                objectArray[renderAvatarPopup.closeHover._1.C[25]] = A;
                objectArray[renderAvatarPopup.closeHover._1.C[26]] = C[27];
                int n4 = C[28];
                Object object = renderAvatarPopup.closeHover._1.A()[C[29]];
                if (object == null) {
                    char[] cArray = "\u1097\u1092\u1091\u10c8\u0acc\u0acf\u0a23\u0ad7\u10c5\u10c6\u10ef\u0ad2\u0a08\u0acf\u0a08\u0ad2\u0a2c\u10cb\u0a27\u0a2d\u10c7\u0a29\u0ad7\u10c0\u10f0\u0a22\u10c8\u0a29\u108e\u1091\u10ca\u1094\u10ec\u10f0\u1095\u1090\u1093\u1090\u10ca\u0ad1\u0afd\u0a26\u10ec\u1092\u10f0\u10f4\u1092\u0a21\u10fa\u0ada\u0a27\u0a2d\u1091\u1091\u0a2c\u0afd\u0a2a\u10c7\u10ee\u10ca\u10ef\u10ca\u0a29\u0ad0\u10c3\u0a22\u0ad3\u0acf\u0a2f\u0a2f\u0a08\u108e\u10f0\u0a2c\u0a20\u0ad1\u10c6\u0a29\u10c3\u0acf\u0a2c\u1092\u0a23\u10c1\u10fa\u0ad2\u0a2f\u10ed\u0ace\u10f5\u10c1\u10c1\u0acf\u10c3\u0ada\u0a08\u0acf\u0acc\u0ad1\u0a26\u0a0a\u0acc\u0a24\u10c3\u1091\u10c6\u10ec\u0ad6".toCharArray();
                    for (int i2 = C[30]; i2 < C[31]; ++i2) {
                        int n5 = cArray[i2];
                        n5 ^= C[32];
                        n5 += C[33];
                        n5 += C[34];
                        n5 ^= C[35];
                        n5 ^= C[36];
                        n5 ^= C[37];
                        n5 -= C[38];
                        n5 ^= C[39];
                        n5 -= C[40];
                        n5 -= C[41];
                        cArray[i2] = (char)(n5 -= C[42]);
                    }
                    object = renderAvatarPopup.closeHover._1.A()[renderAvatarPopup.closeHover._1.C[43]] = new String(cArray);
                }
                objectArray[n4] = (String)object;
                char[] cArray = ((String)renderAvatarPopup.closeHover._1.a(objectArray)).toCharArray();
                long l17 = l6;
                int n6 = C[44];
                n6 -= C[45];
                l6 = l17 ^ (0x3000000000L ^ l17) & -1L << (n6 ^= C[46]);
                long l18 = l13;
                int n7 = C[47];
                n7 -= C[48];
                l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += C[49]);
                while (true) {
                    int n8 = C[50];
                    n8 += C[51];
                    if ((int)l13 >= (int)(l6 >>> (n8 ^= C[52]))) break;
                    int n9 = (int)l13;
                    long l19 = l13;
                    int n10 = C[53];
                    n10 += C[54];
                    int n11 = C[56];
                    n11 -= C[57];
                    l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= C[55])) & -1L >>> (n11 ^= C[58]);
                    long l20 = l9;
                    int n12 = C[59];
                    n12 -= C[60];
                    l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= C[61]);
                    int n13 = (int)l13;
                    long l21 = l13;
                    int n14 = C[62];
                    n14 += C[63];
                    int n15 = C[65];
                    n15 += C[66];
                    l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= C[64])) & -1L >>> (n15 ^= C[67]);
                    int n16 = C[68];
                    n16 += C[69];
                    long l22 = l10;
                    int n17 = C[71];
                    n17 += C[72];
                    l10 = l22 ^ ((long)cArray[n13] << (n16 ^= C[70]) ^ l22) & -1L << (n17 -= C[73]);
                    int n18 = C[74];
                    n18 ^= C[75];
                    n18 ^= C[76];
                    int n19 = C[77];
                    n19 -= C[78];
                    long l23 = l12;
                    int n20 = C[80];
                    n20 -= C[81];
                    l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= C[79]))) ^ l23) & -1L >>> (n20 += C[82]);
                    char[] cArray2 = new char[(int)l12];
                    long l24 = l14;
                    int n21 = C[83];
                    n21 -= C[84];
                    l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= C[85]);
                    while (true) {
                        int n22 = C[86];
                        n22 -= C[87];
                        if ((int)(l14 >>> (n22 += C[88])) >= (int)l12) break;
                        int n23 = C[89];
                        n23 -= C[90];
                        int n24 = C[92];
                        n24 -= C[93];
                        cArray2[(int)(l14 >>> (n23 += renderAvatarPopup.closeHover._1.C[91]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= C[94]))];
                        l14 += 0x100000000L;
                    }
                    int n25 = C[95];
                    n25 -= C[96];
                    int n26 = (int)(l15 >>> (n25 ^= C[97]));
                    l15 += 0x100000000L;
                    renderAvatarPopup.closeHover._1.a[n26] = new String(cArray2);
                    long l25 = l13;
                    int n27 = C[98];
                    n27 += C[99];
                    l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= C[100]);
                }
            }

            public static Object a(Object[] object) {
                Object object2;
                int n2 = (Integer)object[C[101]];
                String string = (String)object[C[102]];
                object = object[C[103]];
                Object[] objectArray = B;
                if (B == null) {
                    objectArray = B = new Object[C[104]];
                }
                if ((object2 = objectArray[n2]) == null) {
                    Object object3 = object;
                    if (object == null) {
                        Object[] objectArray2 = new Object[C[105]];
                        A = objectArray2;
                        object3 = objectArray2;
                        byte[] byArray = new byte[C[107] ^ C[108]];
                        byArray[renderAvatarPopup.closeHover._1.C[109] ^ renderAvatarPopup.closeHover._1.C[110]] = C[111] ^ C[112];
                        byArray[renderAvatarPopup.closeHover._1.C[113] ^ renderAvatarPopup.closeHover._1.C[114]] = C[115] ^ C[116];
                        byArray[renderAvatarPopup.closeHover._1.C[117] ^ renderAvatarPopup.closeHover._1.C[118]] = C[119] ^ C[120];
                        byArray[renderAvatarPopup.closeHover._1.C[121] ^ renderAvatarPopup.closeHover._1.C[122]] = C[123] ^ C[124];
                        byArray[renderAvatarPopup.closeHover._1.C[125] ^ renderAvatarPopup.closeHover._1.C[126]] = C[127] ^ C[128];
                        byArray[renderAvatarPopup.closeHover._1.C[129] ^ renderAvatarPopup.closeHover._1.C[130]] = C[131] ^ C[132];
                        byArray[renderAvatarPopup.closeHover._1.C[133] ^ renderAvatarPopup.closeHover._1.C[134]] = C[135] ^ C[136];
                        byArray[renderAvatarPopup.closeHover._1.C[137] ^ renderAvatarPopup.closeHover._1.C[138]] = C[139] ^ C[140];
                        byArray[renderAvatarPopup.closeHover._1.C[141] ^ renderAvatarPopup.closeHover._1.C[142]] = C[143] ^ C[144];
                        byArray[renderAvatarPopup.closeHover._1.C[145] ^ renderAvatarPopup.closeHover._1.C[146]] = C[147] ^ C[148];
                        byArray[renderAvatarPopup.closeHover._1.C[149] ^ renderAvatarPopup.closeHover._1.C[150]] = C[151] ^ C[152];
                        byArray[renderAvatarPopup.closeHover._1.C[153] ^ renderAvatarPopup.closeHover._1.C[154]] = C[155] ^ C[156];
                        byArray[renderAvatarPopup.closeHover._1.C[157] ^ renderAvatarPopup.closeHover._1.C[158]] = C[159] ^ C[160];
                        byArray[renderAvatarPopup.closeHover._1.C[161] ^ renderAvatarPopup.closeHover._1.C[162]] = C[163] ^ C[164];
                        byArray[renderAvatarPopup.closeHover._1.C[165] ^ renderAvatarPopup.closeHover._1.C[166]] = C[167] ^ C[168];
                        byArray[renderAvatarPopup.closeHover._1.C[169] ^ renderAvatarPopup.closeHover._1.C[170]] = C[171] ^ C[172];
                        objectArray2[renderAvatarPopup.closeHover._1.C[106]] = byArray;
                    }
                    byte[] byArray = (byte[])object3[C[173]];
                    if (b == null) {
                        byte[] byArray2 = new byte[C[174] ^ C[175]];
                        byArray2[renderAvatarPopup.closeHover._1.C[176] ^ renderAvatarPopup.closeHover._1.C[177]] = C[178] ^ C[179];
                        byArray2[renderAvatarPopup.closeHover._1.C[180] ^ renderAvatarPopup.closeHover._1.C[181]] = C[182] ^ C[183];
                        byArray2[renderAvatarPopup.closeHover._1.C[184] ^ renderAvatarPopup.closeHover._1.C[185]] = C[186] ^ C[187];
                        byArray2[renderAvatarPopup.closeHover._1.C[188] ^ renderAvatarPopup.closeHover._1.C[189]] = C[190] ^ C[191];
                        byArray2[renderAvatarPopup.closeHover._1.C[192] ^ renderAvatarPopup.closeHover._1.C[193]] = C[194] ^ C[195];
                        byArray2[renderAvatarPopup.closeHover._1.C[196] ^ renderAvatarPopup.closeHover._1.C[197]] = C[198] ^ C[199];
                        byArray2[renderAvatarPopup.closeHover._1.C[200] ^ renderAvatarPopup.closeHover._1.C[201]] = C[202] ^ C[203];
                        byArray2[renderAvatarPopup.closeHover._1.C[204] ^ renderAvatarPopup.closeHover._1.C[205]] = C[206] ^ C[207];
                        byArray2[renderAvatarPopup.closeHover._1.C[208] ^ renderAvatarPopup.closeHover._1.C[209]] = C[210] ^ C[211];
                        byArray2[renderAvatarPopup.closeHover._1.C[212] ^ renderAvatarPopup.closeHover._1.C[213]] = C[214] ^ C[215];
                        byArray2[renderAvatarPopup.closeHover._1.C[216] ^ renderAvatarPopup.closeHover._1.C[217]] = C[218] ^ C[219];
                        byArray2[renderAvatarPopup.closeHover._1.C[220] ^ renderAvatarPopup.closeHover._1.C[221]] = C[222] ^ C[223];
                        byArray2[renderAvatarPopup.closeHover._1.C[224] ^ renderAvatarPopup.closeHover._1.C[225]] = C[226] ^ C[227];
                        byArray2[renderAvatarPopup.closeHover._1.C[228] ^ renderAvatarPopup.closeHover._1.C[229]] = C[230] ^ C[231];
                        byArray2[renderAvatarPopup.closeHover._1.C[232] ^ renderAvatarPopup.closeHover._1.C[233]] = C[234] ^ C[235];
                        byArray2[renderAvatarPopup.closeHover._1.C[236] ^ renderAvatarPopup.closeHover._1.C[237]] = C[238] ^ C[239];
                        byArray2[renderAvatarPopup.closeHover._1.C[240] ^ renderAvatarPopup.closeHover._1.C[241]] = C[242] ^ C[243];
                        byArray2[renderAvatarPopup.closeHover._1.C[244] ^ renderAvatarPopup.closeHover._1.C[245]] = C[246] ^ C[247];
                        byArray2[renderAvatarPopup.closeHover._1.C[248] ^ renderAvatarPopup.closeHover._1.C[249]] = C[250] ^ C[251];
                        byArray2[renderAvatarPopup.closeHover._1.C[252] ^ renderAvatarPopup.closeHover._1.C[253]] = C[254] ^ C[255];
                        byArray2[renderAvatarPopup.closeHover._1.C[256] ^ renderAvatarPopup.closeHover._1.C[257]] = C[258] ^ C[259];
                        byArray2[renderAvatarPopup.closeHover._1.C[260] ^ renderAvatarPopup.closeHover._1.C[261]] = C[262] ^ C[263];
                        byArray2[renderAvatarPopup.closeHover._1.C[264] ^ renderAvatarPopup.closeHover._1.C[265]] = C[266] ^ C[267];
                        byArray2[renderAvatarPopup.closeHover._1.C[268] ^ renderAvatarPopup.closeHover._1.C[269]] = C[270] ^ C[271];
                        byArray2[renderAvatarPopup.closeHover._1.C[272] ^ renderAvatarPopup.closeHover._1.C[273]] = C[274] ^ C[275];
                        byArray2[renderAvatarPopup.closeHover._1.C[276] ^ renderAvatarPopup.closeHover._1.C[277]] = C[278] ^ C[279];
                        byArray2[renderAvatarPopup.closeHover._1.C[280] ^ renderAvatarPopup.closeHover._1.C[281]] = C[282] ^ C[283];
                        byArray2[renderAvatarPopup.closeHover._1.C[284] ^ renderAvatarPopup.closeHover._1.C[285]] = C[286] ^ C[287];
                        byArray2[renderAvatarPopup.closeHover._1.C[288] ^ renderAvatarPopup.closeHover._1.C[289]] = C[290] ^ C[291];
                        byArray2[renderAvatarPopup.closeHover._1.C[292] ^ renderAvatarPopup.closeHover._1.C[293]] = C[294] ^ C[295];
                        byArray2[renderAvatarPopup.closeHover._1.C[296] ^ renderAvatarPopup.closeHover._1.C[297]] = C[298] ^ C[299];
                        byArray2[renderAvatarPopup.closeHover._1.C[300] ^ renderAvatarPopup.closeHover._1.C[301]] = C[302] ^ C[303];
                        byte[] byArray3 = new byte[byArray.length + byArray2.length];
                        System.arraycopy(byArray, C[304], byArray3, C[305], byArray.length);
                        System.arraycopy(byArray2, C[306], byArray3, byArray.length, byArray2.length);
                        Object object4 = renderAvatarPopup.closeHover._1.A()[C[307]];
                        if (object4 == null) {
                            char[] cArray = "\u95e9\u95f7\u95ee\u95f5\u95f3\u95e7\u9602\u9610\u9625\u9611\u95f1\u960c\u95f8\u9616\u9606\u95f1\u95d8\u95c8".toCharArray();
                            for (int i2 = C[308]; i2 < C[309]; ++i2) {
                                int n3 = cArray[i2];
                                n3 += C[310];
                                n3 -= C[311];
                                n3 -= C[312];
                                n3 -= C[313];
                                n3 += C[314];
                                n3 ^= C[315];
                                n3 ^= C[316];
                                n3 += C[317];
                                n3 -= C[318];
                                cArray[i2] = (char)(n3 ^= C[319]);
                            }
                            object4 = renderAvatarPopup.closeHover._1.A()[renderAvatarPopup.closeHover._1.C[320]] = new String(cArray);
                        }
                        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                        byte[] byArray4 = new byte[C[321]];
                        byArray4[renderAvatarPopup.closeHover._1.C[322]] = C[323];
                        byArray4[renderAvatarPopup.closeHover._1.C[324]] = C[325];
                        byArray4[renderAvatarPopup.closeHover._1.C[326]] = C[327];
                        byArray4[renderAvatarPopup.closeHover._1.C[328]] = C[329];
                        byArray4[renderAvatarPopup.closeHover._1.C[330]] = C[331];
                        byArray4[renderAvatarPopup.closeHover._1.C[332]] = C[333];
                        byArray4[renderAvatarPopup.closeHover._1.C[334]] = C[335];
                        byArray4[renderAvatarPopup.closeHover._1.C[336]] = C[337];
                        byArray4[renderAvatarPopup.closeHover._1.C[338]] = C[339];
                        byArray4[renderAvatarPopup.closeHover._1.C[340]] = C[341];
                        byArray4[renderAvatarPopup.closeHover._1.C[342]] = C[343];
                        byArray4[renderAvatarPopup.closeHover._1.C[344]] = C[345];
                        byArray4[renderAvatarPopup.closeHover._1.C[346]] = C[347];
                        byArray4[renderAvatarPopup.closeHover._1.C[348]] = C[349];
                        byArray4[renderAvatarPopup.closeHover._1.C[350]] = C[351];
                        byArray4[renderAvatarPopup.closeHover._1.C[352]] = C[353];
                        PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, C[354], C[355]);
                        byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                        Object object5 = renderAvatarPopup.closeHover._1.A()[C[356]];
                        if (object5 == null) {
                            char[] cArray = "\ucb3a\ucb36\ucb24".toCharArray();
                            for (int i3 = C[357]; i3 < C[358]; ++i3) {
                                int n4 = cArray[i3];
                                n4 += C[359];
                                n4 ^= C[360];
                                n4 -= C[361];
                                n4 -= C[362];
                                n4 ^= C[363];
                                n4 -= C[364];
                                n4 -= C[365];
                                n4 -= C[366];
                                n4 -= C[367];
                                n4 += C[368];
                                cArray[i3] = (char)(n4 += C[369]);
                            }
                            object5 = renderAvatarPopup.closeHover._1.A()[renderAvatarPopup.closeHover._1.C[370]] = new String(cArray);
                        }
                        b = new SecretKeySpec(byArray5, (String)object5);
                    }
                    byte[] byArray6 = Base64.getDecoder().decode(string);
                    byte[] byArray7 = Arrays.copyOfRange(byArray6, C[371], C[372]);
                    byte[] byArray8 = Arrays.copyOfRange(byArray6, C[373], byArray6.length);
                    Object object6 = renderAvatarPopup.closeHover._1.A()[C[374]];
                    if (object6 == null) {
                        char[] cArray = "\u9627\u9633\u99a1\u9635\u9631\u9626\u9631\u9635\u99d4\u99d9\u9631\u99a1\u9603\u99d4\u99c7\u99d0\u99d0\u99cf\u99fa\u99cd".toCharArray();
                        for (int i4 = C[375]; i4 < C[376]; ++i4) {
                            int n5 = cArray[i4];
                            n5 ^= C[377];
                            n5 += C[378];
                            n5 -= C[379];
                            n5 += C[380];
                            n5 -= C[381];
                            n5 ^= C[382];
                            n5 += C[383];
                            n5 -= C[384];
                            n5 -= C[385];
                            n5 -= C[386];
                            n5 -= C[387];
                            n5 += C[388];
                            n5 += C[389];
                            cArray[i4] = (char)(n5 ^= C[390]);
                        }
                        object6 = renderAvatarPopup.closeHover._1.A()[renderAvatarPopup.closeHover._1.C[391]] = new String(cArray);
                    }
                    Cipher cipher = Cipher.getInstance((String)object6);
                    cipher.init(C[392], (Key)((SecretKey)b), new IvParameterSpec(byArray7));
                    byte[] byArray9 = cipher.doFinal(byArray8);
                    object2 = new String(byArray9, StandardCharsets.UTF_8);
                }
                return object2;
            }

            private static Object[] A() {
                Object[] objectArray = c;
                if (c == null) {
                    c = new Object[C[393]];
                    objectArray = c;
                }
                return objectArray;
            }

            public static void b() {
                C = new int[0xDF90 ^ 0xDE1A];
                renderAvatarPopup.closeHover._1.C[0x283A ^ 0x289D] = 0xFFFF0217 ^ 0x289D;
                renderAvatarPopup.closeHover._1.C[0xB056 ^ 0xB02F] = 0xA554 ^ 0xB02F;
                renderAvatarPopup.closeHover._1.C[0xBE4E ^ 0xBF6F] = 0xF42 ^ 0xBF6F;
                renderAvatarPopup.closeHover._1.C[0x5B23 ^ 0x5B9F] = 0x9B03 ^ 0x5B9F;
                renderAvatarPopup.closeHover._1.C[0xF02 ^ 0xF6F] = 0x10943 ^ 0xF6F;
                renderAvatarPopup.closeHover._1.C[0x99E3 ^ 0x98D4] = 0x5192 ^ 0x98D4;
                renderAvatarPopup.closeHover._1.C[0x92EC ^ 0x93D0] = 0xDB6B ^ 0x93D0;
                renderAvatarPopup.closeHover._1.C[0x861C ^ 0x8749] = 0x8718 ^ 0x8749;
                renderAvatarPopup.closeHover._1.C[0x7CF5 ^ 0x7C53] = 0xA973 ^ 0x7C53;
                renderAvatarPopup.closeHover._1.C[0x8F98 ^ 0x8ED5] = 0xFFFF7100 ^ 0x8ED5;
                renderAvatarPopup.closeHover._1.C[0xD7F2 ^ 0xD7F9] = 0xFFFF2814 ^ 0xD7F9;
                renderAvatarPopup.closeHover._1.C[0xFD26 ^ 0xFD57] = 0xED94 ^ 0xFD57;
                renderAvatarPopup.closeHover._1.C[0xF5C5 ^ 0xF520] = 0xE044 ^ 0xF520;
                renderAvatarPopup.closeHover._1.C[0xAF5E ^ 0xAF2E] = 0x1A90A ^ 0xAF2E;
                renderAvatarPopup.closeHover._1.C[0x3C50 ^ 0x3D61] = 0x3D61 ^ 0x3D61;
                renderAvatarPopup.closeHover._1.C[0xC637 ^ 0xC609] = 0xFFFF39D4 ^ 0xC609;
                renderAvatarPopup.closeHover._1.C[0x2E83 ^ 0x2FE4] = 0xA244 ^ 0x2FE4;
                renderAvatarPopup.closeHover._1.C[0x999D ^ 0x98CF] = 0x98C6 ^ 0x98CF;
                renderAvatarPopup.closeHover._1.C[0x10688 ^ 0x107F1] = 0x1C611 ^ 0x107F1;
                renderAvatarPopup.closeHover._1.C[0xEFB1 ^ 0xEEF1] = 0xEEF0 ^ 0xEEF1;
                renderAvatarPopup.closeHover._1.C[0xD6B4 ^ 0xD7A7] = 0xCBF ^ 0xD7A7;
                renderAvatarPopup.closeHover._1.C[0x2886 ^ 0x2997] = 0xF28F ^ 0x2997;
                renderAvatarPopup.closeHover._1.C[0x97C8 ^ 0x9737] = 0xF457 ^ 0x9737;
                renderAvatarPopup.closeHover._1.C[0x57D8 ^ 0x5770] = 0x8250 ^ 0x5770;
                renderAvatarPopup.closeHover._1.C[0x3DFE ^ 0x3DFC] = 0xFFFFC25D ^ 0x3DFC;
                renderAvatarPopup.closeHover._1.C[0x6D7E ^ 0x6DE6] = 0x91BF ^ 0x6DE6;
                renderAvatarPopup.closeHover._1.C[0x9630 ^ 0x96B5] = 0x3C08 ^ 0x96B5;
                renderAvatarPopup.closeHover._1.C[0xFB9B ^ 0xFB1C] = 0xFFFFAE28 ^ 0xFB1C;
                renderAvatarPopup.closeHover._1.C[0x206D ^ 0x2176] = 0x625B ^ 0x2176;
                renderAvatarPopup.closeHover._1.C[0x10875 ^ 0x108AC] = 0x11856 ^ 0x108AC;
                renderAvatarPopup.closeHover._1.C[0x38D0 ^ 0x3880] = 0xFFFFC764 ^ 0x3880;
                renderAvatarPopup.closeHover._1.C[0x95E2 ^ 0x94C7] = 0xBF33 ^ 0x94C7;
                renderAvatarPopup.closeHover._1.C[0xD02A ^ 0xD0C6] = 0xF441 ^ 0xD0C6;
                renderAvatarPopup.closeHover._1.C[0x27DB ^ 0x2771] = 0x4056 ^ 0x2771;
                renderAvatarPopup.closeHover._1.C[0xCD94 ^ 0xCDAD] = 0xCDBE ^ 0xCDAD;
                renderAvatarPopup.closeHover._1.C[0x8EDB ^ 0x8FDD] = 0xA44A ^ 0x8FDD;
                renderAvatarPopup.closeHover._1.C[0x63E6 ^ 0x63EE] = 0x63A8 ^ 0x63EE;
                renderAvatarPopup.closeHover._1.C[0xF733 ^ 0xF760] = 0xF731 ^ 0xF760;
                renderAvatarPopup.closeHover._1.C[0x50C6 ^ 0x500D] = 0xD545 ^ 0x500D;
                renderAvatarPopup.closeHover._1.C[0x6AA8 ^ 0x6A5F] = 0xA2F ^ 0x6A5F;
                renderAvatarPopup.closeHover._1.C[0x737 ^ 0x629] = 0x3A39 ^ 0x629;
                renderAvatarPopup.closeHover._1.C[0xC28D ^ 0xC2D1] = 0xC2D5 ^ 0xC2D1;
                renderAvatarPopup.closeHover._1.C[0xEEF8 ^ 0xEEC0] = 0xFFFF1115 ^ 0xEEC0;
                renderAvatarPopup.closeHover._1.C[0xE2AC ^ 0xE3CF] = 0xE2CF ^ 0xE3CF;
                renderAvatarPopup.closeHover._1.C[0x4AB4 ^ 0x4B90] = 0x607E ^ 0x4B90;
                renderAvatarPopup.closeHover._1.C[0x9D56 ^ 0x9D22] = 0x8DEB ^ 0x9D22;
                renderAvatarPopup.closeHover._1.C[0xFB3 ^ 0xF10] = 0xFFFF61CB ^ 0xF10;
                renderAvatarPopup.closeHover._1.C[0x93F1 ^ 0x92A9] = 0x92A2 ^ 0x92A9;
                renderAvatarPopup.closeHover._1.C[0x6BD7 ^ 0x6BCC] = 0x6BCC ^ 0x6BCC;
                renderAvatarPopup.closeHover._1.C[0x40D6 ^ 0x40D0] = 0x4077 ^ 0x40D0;
                renderAvatarPopup.closeHover._1.C[0x1428 ^ 0x1468] = 0x1477 ^ 0x1468;
                renderAvatarPopup.closeHover._1.C[0x965E ^ 0x97DF] = 0xAD4C ^ 0x97DF;
                renderAvatarPopup.closeHover._1.C[0xFDB1 ^ 0xFCDE] = 0x4684 ^ 0xFCDE;
                renderAvatarPopup.closeHover._1.C[0x4A88 ^ 0x4AD0] = 0x4AE8 ^ 0x4AD0;
                renderAvatarPopup.closeHover._1.C[0x988B ^ 0x9841] = 0xFFFFE298 ^ 0x9841;
                renderAvatarPopup.closeHover._1.C[0x6918 ^ 0x692E] = 0xFFFF96C3 ^ 0x692E;
                renderAvatarPopup.closeHover._1.C[0x6E39 ^ 0x6F77] = 0x6F79 ^ 0x6F77;
                renderAvatarPopup.closeHover._1.C[0xAA75 ^ 0xAAEE] = 0xFFFFB4CF ^ 0xAAEE;
                renderAvatarPopup.closeHover._1.C[0x3F8A ^ 0x3F80] = 0x3F90 ^ 0x3F80;
                renderAvatarPopup.closeHover._1.C[0x7D30 ^ 0x7DF6] = 0x9A13 ^ 0x7DF6;
                renderAvatarPopup.closeHover._1.C[0x10709 ^ 0x1076A] = 0xFFFEF8F1 ^ 0x1076A;
                renderAvatarPopup.closeHover._1.C[0x1437 ^ 0x14AA] = 0x12AA ^ 0x14AA;
                renderAvatarPopup.closeHover._1.C[0xA419 ^ 0xA4FD] = 0xB198 ^ 0xA4FD;
                renderAvatarPopup.closeHover._1.C[0xA8B0 ^ 0xA9A6] = 0x2C37 ^ 0xA9A6;
                renderAvatarPopup.closeHover._1.C[0xB13 ^ 0xA63] = 0x9C3E ^ 0xA63;
                renderAvatarPopup.closeHover._1.C[0x1E26 ^ 0x1E55] = 0xFFFFF153 ^ 0x1E55;
                renderAvatarPopup.closeHover._1.C[0x479A ^ 0x46FE] = 0x46FC ^ 0x46FE;
                renderAvatarPopup.closeHover._1.C[0x1099F ^ 0x108D3] = 0x108D7 ^ 0x108D3;
                renderAvatarPopup.closeHover._1.C[0xD9DE ^ 0xD933] = 0xFDA6 ^ 0xD933;
                renderAvatarPopup.closeHover._1.C[0xA27F ^ 0xA34A] = 0xA358 ^ 0xA34A;
                renderAvatarPopup.closeHover._1.C[0xE7F2 ^ 0xE6FC] = 0xFFFFE0EE ^ 0xE6FC;
                renderAvatarPopup.closeHover._1.C[0x642F ^ 0x646E] = 0x6434 ^ 0x646E;
                renderAvatarPopup.closeHover._1.C[0xE2C2 ^ 0xE28E] = 0xE2D3 ^ 0xE28E;
                renderAvatarPopup.closeHover._1.C[0x9257 ^ 0x93D2] = 0xFD29 ^ 0x93D2;
                renderAvatarPopup.closeHover._1.C[0x3B02 ^ 0x3A4B] = 0xFFFFC5E8 ^ 0x3A4B;
                renderAvatarPopup.closeHover._1.C[0xD50A ^ 0xD537] = 0xFFFF2ACB ^ 0xD537;
                renderAvatarPopup.closeHover._1.C[0x736F ^ 0x7266] = 0x85C ^ 0x7266;
                renderAvatarPopup.closeHover._1.C[0x6D ^ 0x131] = 0x13E ^ 0x131;
                renderAvatarPopup.closeHover._1.C[0x4960 ^ 0x4848] = 0x3450 ^ 0x4848;
                renderAvatarPopup.closeHover._1.C[0x8F9F ^ 0x8FDB] = 0xFFFF7027 ^ 0x8FDB;
                renderAvatarPopup.closeHover._1.C[0x7557 ^ 0x75C4] = 0x9C50 ^ 0x75C4;
                renderAvatarPopup.closeHover._1.C[0x8D7F ^ 0x8D04] = 0xFFFF6799 ^ 0x8D04;
                renderAvatarPopup.closeHover._1.C[0x10DE0 ^ 0x10DD5] = 0xFFFEF27D ^ 0x10DD5;
                renderAvatarPopup.closeHover._1.C[0x8CE5 ^ 0x8CDA] = 0x8C9B ^ 0x8CDA;
                renderAvatarPopup.closeHover._1.C[0x635E ^ 0x63D1] = 0xFFFF4D6B ^ 0x63D1;
                renderAvatarPopup.closeHover._1.C[0x60EE ^ 0x61BE] = 0x61BC ^ 0x61BE;
                renderAvatarPopup.closeHover._1.C[0x833A ^ 0x837D] = 0x8361 ^ 0x837D;
                renderAvatarPopup.closeHover._1.C[0xDE48 ^ 0xDE60] = 0x6DEF ^ 0xDE60;
                renderAvatarPopup.closeHover._1.C[0xB6BB ^ 0xB6AE] = 0xB675 ^ 0xB6AE;
                renderAvatarPopup.closeHover._1.C[0x567D ^ 0x56BA] = 0xB148 ^ 0x56BA;
                renderAvatarPopup.closeHover._1.C[0x10225 ^ 0x1035D] = 0x10349 ^ 0x1035D;
                renderAvatarPopup.closeHover._1.C[0xDAEC ^ 0xDADE] = 0xDA13 ^ 0xDADE;
                renderAvatarPopup.closeHover._1.C[0x36A9 ^ 0x3720] = 0x3724 ^ 0x3720;
                renderAvatarPopup.closeHover._1.C[0x9BF1 ^ 0x9B4E] = 0x5BD5 ^ 0x9B4E;
                renderAvatarPopup.closeHover._1.C[0x5CB ^ 0x5AD] = 0x5AF ^ 0x5AD;
                renderAvatarPopup.closeHover._1.C[0x8452 ^ 0x8466] = 0x8410 ^ 0x8466;
                renderAvatarPopup.closeHover._1.C[0xF2AE ^ 0xF3C0] = 0xEF58 ^ 0xF3C0;
                renderAvatarPopup.closeHover._1.C[0xBA60 ^ 0xBB5F] = 0xCAA0 ^ 0xBB5F;
                renderAvatarPopup.closeHover._1.C[0x40FE ^ 0x41B6] = 0x41BB ^ 0x41B6;
                renderAvatarPopup.closeHover._1.C[0xD043 ^ 0xD101] = 0xD104 ^ 0xD101;
                renderAvatarPopup.closeHover._1.C[0xB31D ^ 0xB384] = 0x5265 ^ 0xB384;
                renderAvatarPopup.closeHover._1.C[0xB24D ^ 0xB31C] = 0xFFFF4CAA ^ 0xB31C;
                renderAvatarPopup.closeHover._1.C[0x3250 ^ 0x323C] = 0xE812 ^ 0x323C;
                renderAvatarPopup.closeHover._1.C[0xFA3A ^ 0xFA71] = 0xFA12 ^ 0xFA71;
                renderAvatarPopup.closeHover._1.C[0x6037 ^ 0x6089] = 0xFFFF5FDF ^ 0x6089;
                renderAvatarPopup.closeHover._1.C[0xF499 ^ 0xF41F] = 0x5EAD ^ 0xF41F;
                renderAvatarPopup.closeHover._1.C[0xBFAB ^ 0xBF67] = 0x928D ^ 0xBF67;
                renderAvatarPopup.closeHover._1.C[0x44F ^ 0x562] = 0xF707 ^ 0x562;
                renderAvatarPopup.closeHover._1.C[0xDFF8 ^ 0xDFD2] = 0xE28D ^ 0xDFD2;
                renderAvatarPopup.closeHover._1.C[0xE11F ^ 0xE031] = 0xFFFFEDA3 ^ 0xE031;
                renderAvatarPopup.closeHover._1.C[0x4F7D ^ 0x4E3E] = 0x4E02 ^ 0x4E3E;
                renderAvatarPopup.closeHover._1.C[0x8E8D ^ 0x8E5E] = 0x4227 ^ 0x8E5E;
                renderAvatarPopup.closeHover._1.C[0xE42F ^ 0xE4E6] = 0x61AE ^ 0xE4E6;
                renderAvatarPopup.closeHover._1.C[0x6694 ^ 0x663A] = 0x1E96 ^ 0x663A;
                renderAvatarPopup.closeHover._1.C[0x51FF ^ 0x5082] = 0x4F2A ^ 0x5082;
                renderAvatarPopup.closeHover._1.C[0x7AC1 ^ 0x7A1A] = 0x6AE0 ^ 0x7A1A;
                renderAvatarPopup.closeHover._1.C[0xF56C ^ 0xF502] = 0x1F326 ^ 0xF502;
                renderAvatarPopup.closeHover._1.C[0x6BF ^ 0x636] = 0x993E ^ 0x636;
                renderAvatarPopup.closeHover._1.C[0x90CE ^ 0x90CE] = 0xFFFF6F4C ^ 0x90CE;
                renderAvatarPopup.closeHover._1.C[0xFE04 ^ 0xFE7C] = 0x5076 ^ 0xFE7C;
                renderAvatarPopup.closeHover._1.C[0xBADE ^ 0xBA93] = 0xBAFC ^ 0xBA93;
                renderAvatarPopup.closeHover._1.C[0xFFBE ^ 0xFE98] = 0xD542 ^ 0xFE98;
                renderAvatarPopup.closeHover._1.C[0x8B0 ^ 0x9E9] = 0xFFFFF634 ^ 0x9E9;
                renderAvatarPopup.closeHover._1.C[0xBC8F ^ 0xBC35] = 0xFFFFBB0F ^ 0xBC35;
                renderAvatarPopup.closeHover._1.C[0x43DD ^ 0x433D] = 0xC201 ^ 0x433D;
                renderAvatarPopup.closeHover._1.C[0x5B97 ^ 0x5B69] = 0xFFFFC7BE ^ 0x5B69;
                renderAvatarPopup.closeHover._1.C[0xDD87 ^ 0xDD43] = 0x3AB1 ^ 0xDD43;
                renderAvatarPopup.closeHover._1.C[0x60A1 ^ 0x603F] = 0x6639 ^ 0x603F;
                renderAvatarPopup.closeHover._1.C[0x237 ^ 0x286] = 0xB3AF ^ 0x286;
                renderAvatarPopup.closeHover._1.C[0x7BF5 ^ 0x7BA2] = 0x7BB4 ^ 0x7BA2;
                renderAvatarPopup.closeHover._1.C[0x11F3 ^ 0x10C3] = 0x10C3 ^ 0x10C3;
                renderAvatarPopup.closeHover._1.C[0x40E7 ^ 0x41B1] = 0x41B0 ^ 0x41B1;
                renderAvatarPopup.closeHover._1.C[0x504E ^ 0x5008] = 0xFFFFAF8D ^ 0x5008;
                renderAvatarPopup.closeHover._1.C[0x981 ^ 0x950] = 0xC529 ^ 0x950;
                renderAvatarPopup.closeHover._1.C[0xEFF0 ^ 0xEFE2] = 0xFFFF1078 ^ 0xEFE2;
                renderAvatarPopup.closeHover._1.C[0x3942 ^ 0x39A0] = 0xB8D8 ^ 0x39A0;
                renderAvatarPopup.closeHover._1.C[0x107A3 ^ 0x107B5] = 0x107E0 ^ 0x107B5;
                renderAvatarPopup.closeHover._1.C[0xE033 ^ 0xE07B] = 0xFFFF1FF3 ^ 0xE07B;
                renderAvatarPopup.closeHover._1.C[0x4AE4 ^ 0x4A85] = 0xFFFFB537 ^ 0x4A85;
                renderAvatarPopup.closeHover._1.C[0x8889 ^ 0x8989] = 0xF16A ^ 0x8989;
                renderAvatarPopup.closeHover._1.C[0x594D ^ 0x598D] = 0x9738 ^ 0x598D;
                renderAvatarPopup.closeHover._1.C[0x2D92 ^ 0x2DFD] = 0x12B98 ^ 0x2DFD;
                renderAvatarPopup.closeHover._1.C[0xBD8C ^ 0xBCFB] = 0xBCFB ^ 0xBCFB;
                renderAvatarPopup.closeHover._1.C[0x4DC3 ^ 0x4C97] = 0x4C9F ^ 0x4C97;
                renderAvatarPopup.closeHover._1.C[0x5AE0 ^ 0x5A9C] = 0x4FEE ^ 0x5A9C;
                renderAvatarPopup.closeHover._1.C[0x82E3 ^ 0x83D8] = 0xFF13 ^ 0x83D8;
                renderAvatarPopup.closeHover._1.C[0x6C9A ^ 0x6C1B] = 0x3154 ^ 0x6C1B;
                renderAvatarPopup.closeHover._1.C[0xACAC ^ 0xAC51] = 0xCF31 ^ 0xAC51;
                renderAvatarPopup.closeHover._1.C[0xFB8E ^ 0xFB75] = 0x7C61 ^ 0xFB75;
                renderAvatarPopup.closeHover._1.C[0xA993 ^ 0xA901] = 0x40CD ^ 0xA901;
                renderAvatarPopup.closeHover._1.C[0xC440 ^ 0xC54B] = 0xBF71 ^ 0xC54B;
                renderAvatarPopup.closeHover._1.C[0x9867 ^ 0x9902] = 0x9902 ^ 0x9902;
                renderAvatarPopup.closeHover._1.C[0x32A1 ^ 0x33AC] = 0xCA2F ^ 0x33AC;
                renderAvatarPopup.closeHover._1.C[0x409B ^ 0x4098] = 0xFFFFBF5C ^ 0x4098;
                renderAvatarPopup.closeHover._1.C[0xEC75 ^ 0xEC61] = 0xFFFF13B9 ^ 0xEC61;
                renderAvatarPopup.closeHover._1.C[0xC0C9 ^ 0xC05C] = 0x3C07 ^ 0xC05C;
                renderAvatarPopup.closeHover._1.C[0x72BA ^ 0x72DF] = 0x72DE ^ 0x72DF;
                renderAvatarPopup.closeHover._1.C[0x10B79 ^ 0x10B11] = 0x10B10 ^ 0x10B11;
                renderAvatarPopup.closeHover._1.C[0x10F8D ^ 0x10F03] = 0x1DE42 ^ 0x10F03;
                renderAvatarPopup.closeHover._1.C[0x785B ^ 0x78E9] = 0xFFFF360D ^ 0x78E9;
                renderAvatarPopup.closeHover._1.C[0xEA4 ^ 0xE32] = 0xF26B ^ 0xE32;
                renderAvatarPopup.closeHover._1.C[0xD24B ^ 0xD26D] = 0x3D0 ^ 0xD26D;
                renderAvatarPopup.closeHover._1.C[0xF638 ^ 0xF661] = 0xFFFF09EC ^ 0xF661;
                renderAvatarPopup.closeHover._1.C[0xC7EC ^ 0xC71C] = 0x28B3 ^ 0xC71C;
                renderAvatarPopup.closeHover._1.C[0xEEFE ^ 0xEEE0] = 0xEEE0 ^ 0xEEE0;
                renderAvatarPopup.closeHover._1.C[0x1A4F ^ 0x1B00] = 0x1B73 ^ 0x1B00;
                renderAvatarPopup.closeHover._1.C[0x3193 ^ 0x3166] = 0x5116 ^ 0x3166;
                renderAvatarPopup.closeHover._1.C[0x9EB8 ^ 0x9E67] = 0x80C8 ^ 0x9E67;
                renderAvatarPopup.closeHover._1.C[0x4F31 ^ 0x4F6A] = 0x4F36 ^ 0x4F6A;
                renderAvatarPopup.closeHover._1.C[0x3A77 ^ 0x3A05] = 0x2ACC ^ 0x3A05;
                renderAvatarPopup.closeHover._1.C[0xA51C ^ 0xA5FF] = 0x24CC ^ 0xA5FF;
                renderAvatarPopup.closeHover._1.C[0x1395 ^ 0x12F4] = 0x12C6 ^ 0x12F4;
                renderAvatarPopup.closeHover._1.C[0xD3FB ^ 0xD3E1] = 0xD3E0 ^ 0xD3E1;
                renderAvatarPopup.closeHover._1.C[0x89F6 ^ 0x894E] = 0x7193 ^ 0x894E;
                renderAvatarPopup.closeHover._1.C[0x1030E ^ 0x103D0] = 0xFFFEE2A4 ^ 0x103D0;
                renderAvatarPopup.closeHover._1.C[0x55E6 ^ 0x54EC] = 0x2EF7 ^ 0x54EC;
                renderAvatarPopup.closeHover._1.C[0xE601 ^ 0xE632] = 0xFFFF19BB ^ 0xE632;
                renderAvatarPopup.closeHover._1.C[0x8A00 ^ 0x8B69] = 0xB738 ^ 0x8B69;
                renderAvatarPopup.closeHover._1.C[0xD8F8 ^ 0xD898] = 0xFFFF2777 ^ 0xD898;
                renderAvatarPopup.closeHover._1.C[0x1060C ^ 0x106F5] = 0x181E1 ^ 0x106F5;
                renderAvatarPopup.closeHover._1.C[0x42BF ^ 0x43E1] = 0x43E6 ^ 0x43E1;
                renderAvatarPopup.closeHover._1.C[0x3034 ^ 0x30B0] = 0x6DFC ^ 0x30B0;
                renderAvatarPopup.closeHover._1.C[0x79C6 ^ 0x78D9] = 0x4493 ^ 0x78D9;
                renderAvatarPopup.closeHover._1.C[0x2E29 ^ 0x2E12] = 0xFFFFD1DA ^ 0x2E12;
                renderAvatarPopup.closeHover._1.C[0xF8FC ^ 0xF9C1] = 0x651A ^ 0xF9C1;
                renderAvatarPopup.closeHover._1.C[0xFC54 ^ 0xFD38] = 0x9DFD ^ 0xFD38;
                renderAvatarPopup.closeHover._1.C[0xA3F9 ^ 0xA38C] = 0xD88 ^ 0xA38C;
                renderAvatarPopup.closeHover._1.C[0x119E ^ 0x11BB] = 0x67E7 ^ 0x11BB;
                renderAvatarPopup.closeHover._1.C[0xDB5F ^ 0xDAD8] = 0xDADB ^ 0xDAD8;
                renderAvatarPopup.closeHover._1.C[0x3FB5 ^ 0x3FEB] = 0x3FE6 ^ 0x3FEB;
                renderAvatarPopup.closeHover._1.C[0x953C ^ 0x95FE] = 0x5B08 ^ 0x95FE;
                renderAvatarPopup.closeHover._1.C[0xC260 ^ 0xC34A] = 0xBF5C ^ 0xC34A;
                renderAvatarPopup.closeHover._1.C[0x114A ^ 0x11EE] = 0x8088 ^ 0x11EE;
                renderAvatarPopup.closeHover._1.C[0x9D7B ^ 0x9CF3] = 0x9CF1 ^ 0x9CF3;
                renderAvatarPopup.closeHover._1.C[0xBFBF ^ 0xBF34] = 0xFFFFDFC9 ^ 0xBF34;
                renderAvatarPopup.closeHover._1.C[0x102DA ^ 0x1024B] = 0x1EB82 ^ 0x1024B;
                renderAvatarPopup.closeHover._1.C[0x28BA ^ 0x28AD] = 0xFFFFD737 ^ 0x28AD;
                renderAvatarPopup.closeHover._1.C[0x787B ^ 0x7801] = 0x6D73 ^ 0x7801;
                renderAvatarPopup.closeHover._1.C[0xEB5B ^ 0xEA4B] = 0x315F ^ 0xEA4B;
                renderAvatarPopup.closeHover._1.C[0x6B7D ^ 0x6BFF] = 0x36B3 ^ 0x6BFF;
                renderAvatarPopup.closeHover._1.C[0x6037 ^ 0x6018] = 0x6018 ^ 0x6018;
                renderAvatarPopup.closeHover._1.C[0x1208 ^ 0x12FE] = 0x72BB ^ 0x12FE;
                renderAvatarPopup.closeHover._1.C[0xBD24 ^ 0xBC31] = 0x39C7 ^ 0xBC31;
                renderAvatarPopup.closeHover._1.C[0x22C3 ^ 0x22BE] = 0x7F9E ^ 0x22BE;
                renderAvatarPopup.closeHover._1.C[0xD130 ^ 0xD12D] = 0xD12D ^ 0xD12D;
                renderAvatarPopup.closeHover._1.C[0x10DFD ^ 0x10D33] = 0x120C8 ^ 0x10D33;
                renderAvatarPopup.closeHover._1.C[0x4265 ^ 0x42F1] = 0xAB3D ^ 0x42F1;
                renderAvatarPopup.closeHover._1.C[0xF57D ^ 0xF437] = 0xF431 ^ 0xF437;
                renderAvatarPopup.closeHover._1.C[0xBC36 ^ 0xBC16] = 0x6BB6 ^ 0xBC16;
                renderAvatarPopup.closeHover._1.C[0xB0BB ^ 0xB010] = 0xFFFF2883 ^ 0xB010;
                renderAvatarPopup.closeHover._1.C[0xDFA6 ^ 0xDF5A] = 0xBC25 ^ 0xDF5A;
                renderAvatarPopup.closeHover._1.C[0x47E6 ^ 0x475F] = 0xBF80 ^ 0x475F;
                renderAvatarPopup.closeHover._1.C[0x8321 ^ 0x825E] = 0x3950 ^ 0x825E;
                renderAvatarPopup.closeHover._1.C[0xCB89 ^ 0xCAFC] = 0xCAEC ^ 0xCAFC;
                renderAvatarPopup.closeHover._1.C[0x70DB ^ 0x7030] = 0xBF95 ^ 0x7030;
                renderAvatarPopup.closeHover._1.C[0x91E6 ^ 0x90FC] = 0xD3BB ^ 0x90FC;
                renderAvatarPopup.closeHover._1.C[0x7856 ^ 0x7815] = 0x784B ^ 0x7815;
                renderAvatarPopup.closeHover._1.C[0x6A25 ^ 0x6A84] = 0xFBE9 ^ 0x6A84;
                renderAvatarPopup.closeHover._1.C[0x7F33 ^ 0x7EB0] = 0x8605 ^ 0x7EB0;
                renderAvatarPopup.closeHover._1.C[0x64DD ^ 0x65FD] = 0xD5DB ^ 0x65FD;
                renderAvatarPopup.closeHover._1.C[0x105BA ^ 0x10586] = 0xFFFEFA2A ^ 0x10586;
                renderAvatarPopup.closeHover._1.C[0xF7C ^ 0xF29] = 0xF62 ^ 0xF29;
                renderAvatarPopup.closeHover._1.C[0xCA79 ^ 0xCA98] = 0x4BAB ^ 0xCA98;
                renderAvatarPopup.closeHover._1.C[0x10655 ^ 0x1065B] = 0x1064C ^ 0x1065B;
                renderAvatarPopup.closeHover._1.C[0x6C9F ^ 0x6C8F] = 0xFFFF9364 ^ 0x6C8F;
                renderAvatarPopup.closeHover._1.C[0x5DA2 ^ 0x5D28] = 0xC22D ^ 0x5D28;
                renderAvatarPopup.closeHover._1.C[0xE9FF ^ 0xE8D8] = 0xC32C ^ 0xE8D8;
                renderAvatarPopup.closeHover._1.C[0xAB40 ^ 0xAA36] = 0xAA35 ^ 0xAA36;
                renderAvatarPopup.closeHover._1.C[0x6D76 ^ 0x6C0A] = 0x898D ^ 0x6C0A;
                renderAvatarPopup.closeHover._1.C[0x8E16 ^ 0x8E89] = 0xFFFF7776 ^ 0x8E89;
                renderAvatarPopup.closeHover._1.C[0x5E9B ^ 0x5F89] = 0xFFFF7B4F ^ 0x5F89;
                renderAvatarPopup.closeHover._1.C[0x1D13 ^ 0x1C54] = 0x1C55 ^ 0x1C54;
                renderAvatarPopup.closeHover._1.C[0x2203 ^ 0x232F] = 0xD159 ^ 0x232F;
                renderAvatarPopup.closeHover._1.C[0x6711 ^ 0x6721] = 0xFFFF98B2 ^ 0x6721;
                renderAvatarPopup.closeHover._1.C[0xD961 ^ 0xD825] = 0xD826 ^ 0xD825;
                renderAvatarPopup.closeHover._1.C[0x4E07 ^ 0x4EDD] = 0xFFFFA1AF ^ 0x4EDD;
                renderAvatarPopup.closeHover._1.C[0xCBAB ^ 0xCB58] = 0x24FA ^ 0xCB58;
                renderAvatarPopup.closeHover._1.C[0x3066 ^ 0x3023] = 0xFFFFCF8A ^ 0x3023;
                renderAvatarPopup.closeHover._1.C[0x829B ^ 0x820C] = 0xFFFF81C4 ^ 0x820C;
                renderAvatarPopup.closeHover._1.C[0xA0E8 ^ 0xA0D9] = 0xFFFF5F6A ^ 0xA0D9;
                renderAvatarPopup.closeHover._1.C[0x6561 ^ 0x6537] = 0xFFFF9AC9 ^ 0x6537;
                renderAvatarPopup.closeHover._1.C[0x10FD9 ^ 0x10EE3] = 0x1CACA ^ 0x10EE3;
                renderAvatarPopup.closeHover._1.C[0x7BBF ^ 0x7B2F] = 0xAA6E ^ 0x7B2F;
                renderAvatarPopup.closeHover._1.C[0x25D0 ^ 0x2507] = 0x121AB ^ 0x2507;
                renderAvatarPopup.closeHover._1.C[0x73A1 ^ 0x7329] = 0xD99B ^ 0x7329;
                renderAvatarPopup.closeHover._1.C[0xA014 ^ 0xA0C6] = 0x6CD2 ^ 0xA0C6;
                renderAvatarPopup.closeHover._1.C[0xDB0E ^ 0xDB94] = 0x3A71 ^ 0xDB94;
                renderAvatarPopup.closeHover._1.C[0x2B89 ^ 0x2BA8] = 0xA569 ^ 0x2BA8;
                renderAvatarPopup.closeHover._1.C[0xBE8F ^ 0xBFA0] = 0x4DC5 ^ 0xBFA0;
                renderAvatarPopup.closeHover._1.C[0xB03C ^ 0xB068] = 0xFFFF4F8E ^ 0xB068;
                renderAvatarPopup.closeHover._1.C[0x7656 ^ 0x7775] = 0xC758 ^ 0x7775;
                renderAvatarPopup.closeHover._1.C[0xD60 ^ 0xC78] = 0x4F4C ^ 0xC78;
                renderAvatarPopup.closeHover._1.C[0x4315 ^ 0x43B0] = 0x9690 ^ 0x43B0;
                renderAvatarPopup.closeHover._1.C[0x4B8F ^ 0x4AFC] = 0x4AFC ^ 0x4AFC;
                renderAvatarPopup.closeHover._1.C[0x785 ^ 0x681] = 0x2D35 ^ 0x681;
                renderAvatarPopup.closeHover._1.C[0xA869 ^ 0xA9ED] = 0xF9FA ^ 0xA9ED;
                renderAvatarPopup.closeHover._1.C[0xD0C5 ^ 0xD0E2] = 0x7C0F ^ 0xD0E2;
                renderAvatarPopup.closeHover._1.C[0x5140 ^ 0x51E9] = 0x36CF ^ 0x51E9;
                renderAvatarPopup.closeHover._1.C[0x9463 ^ 0x94C1] = 0x5A7 ^ 0x94C1;
                renderAvatarPopup.closeHover._1.C[0x11C0 ^ 0x119A] = 0xFFFFEE53 ^ 0x119A;
                renderAvatarPopup.closeHover._1.C[0x60DB ^ 0x6077] = 0x750 ^ 0x6077;
                renderAvatarPopup.closeHover._1.C[0x55AD ^ 0x5493] = 0x3DCE ^ 0x5493;
                renderAvatarPopup.closeHover._1.C[0x7E1C ^ 0x7F24] = 0x5263 ^ 0x7F24;
                renderAvatarPopup.closeHover._1.C[0xD433 ^ 0xD457] = 0xD42A ^ 0xD457;
                renderAvatarPopup.closeHover._1.C[0xD5C1 ^ 0xD5D2] = 0xD594 ^ 0xD5D2;
                renderAvatarPopup.closeHover._1.C[0x2277 ^ 0x2341] = 0xB2D5 ^ 0x2341;
                renderAvatarPopup.closeHover._1.C[0x1FA2 ^ 0x1F3E] = 0xFEDB ^ 0x1F3E;
                renderAvatarPopup.closeHover._1.C[0x65A7 ^ 0x6427] = 0x4EE8 ^ 0x6427;
                renderAvatarPopup.closeHover._1.C[0xB97A ^ 0xB858] = 0x81E ^ 0xB858;
                renderAvatarPopup.closeHover._1.C[0xA86E ^ 0xA876] = 0xA875 ^ 0xA876;
                renderAvatarPopup.closeHover._1.C[0x691D ^ 0x699E] = 0x34F5 ^ 0x699E;
                renderAvatarPopup.closeHover._1.C[0x294D ^ 0x284E] = 0x50B3 ^ 0x284E;
                renderAvatarPopup.closeHover._1.C[0xB16 ^ 0xA50] = 0xA5A ^ 0xA50;
                renderAvatarPopup.closeHover._1.C[0xBF2E ^ 0xBE5A] = 0xBE4A ^ 0xBE5A;
                renderAvatarPopup.closeHover._1.C[0x414A ^ 0x4053] = 0x37E ^ 0x4053;
                renderAvatarPopup.closeHover._1.C[0x603 ^ 0x6B3] = 0xB79F ^ 0x6B3;
                renderAvatarPopup.closeHover._1.C[0x3DF5 ^ 0x3D46] = 0x8C6F ^ 0x3D46;
                renderAvatarPopup.closeHover._1.C[0x6F3D ^ 0x6E31] = 0x97B4 ^ 0x6E31;
                renderAvatarPopup.closeHover._1.C[0x7793 ^ 0x774F] = 0x69F0 ^ 0x774F;
                renderAvatarPopup.closeHover._1.C[0x2DE0 ^ 0x2D57] = 0xDB8A ^ 0x2D57;
                renderAvatarPopup.closeHover._1.C[0xC29C ^ 0xC259] = 0x25AB ^ 0xC259;
                renderAvatarPopup.closeHover._1.C[0xA92B ^ 0xA837] = 0x946A ^ 0xA837;
                renderAvatarPopup.closeHover._1.C[0x88F3 ^ 0x8993] = 0x8993 ^ 0x8993;
                renderAvatarPopup.closeHover._1.C[0x10E3B ^ 0x10E36] = 0x10E54 ^ 0x10E36;
                renderAvatarPopup.closeHover._1.C[0xB932 ^ 0xB923] = 0xFFFF46B1 ^ 0xB923;
                renderAvatarPopup.closeHover._1.C[0xBDD5 ^ 0xBD2F] = 0xFFFFC5A1 ^ 0xBD2F;
                renderAvatarPopup.closeHover._1.C[0x10853 ^ 0x10878] = 0x10878 ^ 0x10878;
                renderAvatarPopup.closeHover._1.C[0x44BF ^ 0x4539] = 0x3646 ^ 0x4539;
                renderAvatarPopup.closeHover._1.C[0x3327 ^ 0x330B] = 0x332D ^ 0x330B;
                renderAvatarPopup.closeHover._1.C[0x206E ^ 0x20D3] = 0xE048 ^ 0x20D3;
                renderAvatarPopup.closeHover._1.C[0x2563 ^ 0x25AC] = 0x842 ^ 0x25AC;
                renderAvatarPopup.closeHover._1.C[0x1FC0 ^ 0x1EBA] = 0x8A3B ^ 0x1EBA;
                renderAvatarPopup.closeHover._1.C[0x7991 ^ 0x79A6] = 0xFFFF8632 ^ 0x79A6;
                renderAvatarPopup.closeHover._1.C[0xCC50 ^ 0xCCA2] = 0x237C ^ 0xCCA2;
                renderAvatarPopup.closeHover._1.C[0xE730 ^ 0xE772] = 0xE756 ^ 0xE772;
                renderAvatarPopup.closeHover._1.C[0xE02B ^ 0xE064] = 0xFFFF1FB8 ^ 0xE064;
                renderAvatarPopup.closeHover._1.C[0x8435 ^ 0x8498] = 0x8498 ^ 0x8498;
                renderAvatarPopup.closeHover._1.C[0x6C6A ^ 0x6C01] = 0xB63F ^ 0x6C01;
                renderAvatarPopup.closeHover._1.C[0x3573 ^ 0x352E] = 0xFFFFCAF9 ^ 0x352E;
                renderAvatarPopup.closeHover._1.C[0x1A5 ^ 0xEE] = 0x9D ^ 0xEE;
                renderAvatarPopup.closeHover._1.C[0x164 ^ 2] = 1 ^ 2;
                renderAvatarPopup.closeHover._1.C[0x904 ^ 0x9D9] = 0x1776 ^ 0x9D9;
                renderAvatarPopup.closeHover._1.C[0xA388 ^ 0xA3C2] = 0xA3EC ^ 0xA3C2;
                renderAvatarPopup.closeHover._1.C[0xBB21 ^ 0xBA20] = 0xC2DD ^ 0xBA20;
                renderAvatarPopup.closeHover._1.C[0x188F ^ 0x1987] = 0x63B4 ^ 0x1987;
                renderAvatarPopup.closeHover._1.C[0x1BF3 ^ 0x1B3B] = 0x9E67 ^ 0x1B3B;
                renderAvatarPopup.closeHover._1.C[0xB593 ^ 0xB5A9] = 0xFFFF4A4B ^ 0xB5A9;
                renderAvatarPopup.closeHover._1.C[0xD47C ^ 0xD463] = 0xD40F ^ 0xD463;
                renderAvatarPopup.closeHover._1.C[0x885C ^ 0x8855] = 0x8876 ^ 0x8855;
                renderAvatarPopup.closeHover._1.C[0x85EA ^ 0x858D] = 0x858D ^ 0x858D;
                renderAvatarPopup.closeHover._1.C[0xBCA6 ^ 0xBD24] = 0xB430 ^ 0xBD24;
                renderAvatarPopup.closeHover._1.C[0x82EF ^ 0x82C1] = 0x82CE ^ 0x82C1;
                renderAvatarPopup.closeHover._1.C[0x147A ^ 0x149D] = 0x1F9 ^ 0x149D;
                renderAvatarPopup.closeHover._1.C[0x2399 ^ 0x22E8] = 0x1E07 ^ 0x22E8;
                renderAvatarPopup.closeHover._1.C[0x6C2 ^ 0x62B] = 0xC98E ^ 0x62B;
                renderAvatarPopup.closeHover._1.C[0x616D ^ 0x607A] = 0xE58C ^ 0x607A;
                renderAvatarPopup.closeHover._1.C[0x5FB3 ^ 0x5FAF] = 0x5FAD ^ 0x5FAF;
                renderAvatarPopup.closeHover._1.C[0xDACF ^ 0xDA25] = 0x159D ^ 0xDA25;
                renderAvatarPopup.closeHover._1.C[0x47CC ^ 0x47CD] = 0x47ED ^ 0x47CD;
                renderAvatarPopup.closeHover._1.C[0xB000 ^ 0xB05F] = 0xFFFF4FDE ^ 0xB05F;
                renderAvatarPopup.closeHover._1.C[0xC515 ^ 0xC5A1] = 0x336A ^ 0xC5A1;
                renderAvatarPopup.closeHover._1.C[0x13C2 ^ 0x1374] = 0xE58E ^ 0x1374;
                renderAvatarPopup.closeHover._1.C[0xC11A ^ 0xC040] = 0xC04C ^ 0xC040;
                renderAvatarPopup.closeHover._1.C[0x4239 ^ 0x4353] = 0xDC01 ^ 0x4353;
                renderAvatarPopup.closeHover._1.C[0x9442 ^ 0x946F] = 0xFFFF6B98 ^ 0x946F;
                renderAvatarPopup.closeHover._1.C[0x7705 ^ 0x7677] = 0x7675 ^ 0x7677;
                renderAvatarPopup.closeHover._1.C[0xCF5 ^ 0xC8B] = 0x51AC ^ 0xC8B;
                renderAvatarPopup.closeHover._1.C[0x337 ^ 0x25A] = 0xDCC ^ 0x25A;
                renderAvatarPopup.closeHover._1.C[0xC052 ^ 0xC0DF] = 0x1192 ^ 0xC0DF;
                renderAvatarPopup.closeHover._1.C[0x2B86 ^ 0x2B45] = 0xE5FE ^ 0x2B45;
                renderAvatarPopup.closeHover._1.C[0x9E6D ^ 0x9EED] = 0xC3CA ^ 0x9EED;
                renderAvatarPopup.closeHover._1.C[0xB318 ^ 0xB37A] = 0xB278 ^ 0xB37A;
                renderAvatarPopup.closeHover._1.C[0x69BD ^ 0x69B8] = 0xFFFF9679 ^ 0x69B8;
                renderAvatarPopup.closeHover._1.C[0xBAE9 ^ 0xBA80] = 0xBA81 ^ 0xBA80;
                renderAvatarPopup.closeHover._1.C[0x6CE3 ^ 0x6CB1] = 0x6CA6 ^ 0x6CB1;
                renderAvatarPopup.closeHover._1.C[0x444E ^ 0x4439] = 0xEA2C ^ 0x4439;
                renderAvatarPopup.closeHover._1.C[0x60E1 ^ 0x60C2] = 0xADA ^ 0x60C2;
                renderAvatarPopup.closeHover._1.C[0xBA30 ^ 0xBAD8] = 0x757E ^ 0xBAD8;
                renderAvatarPopup.closeHover._1.C[0x4F7A ^ 0x4FD5] = 0x3759 ^ 0x4FD5;
                renderAvatarPopup.closeHover._1.C[0x1D49 ^ 0x1D9C] = 0x11930 ^ 0x1D9C;
                renderAvatarPopup.closeHover._1.C[0x3995 ^ 0x389A] = 0xC119 ^ 0x389A;
                renderAvatarPopup.closeHover._1.C[0x8904 ^ 0x8801] = 0xA3BD ^ 0x8801;
                renderAvatarPopup.closeHover._1.C[0xE6A ^ 0xF7E] = 0x8A9D ^ 0xF7E;
                renderAvatarPopup.closeHover._1.C[0xF86F ^ 0xF8A2] = 0xD54C ^ 0xF8A2;
                renderAvatarPopup.closeHover._1.C[0x8BC6 ^ 0x8AB8] = 0xE472 ^ 0x8AB8;
                renderAvatarPopup.closeHover._1.C[0xA68B ^ 0xA664] = 0x82F1 ^ 0xA664;
                renderAvatarPopup.closeHover._1.C[0x8763 ^ 0x8785] = 0xFFFF6D63 ^ 0x8785;
                renderAvatarPopup.closeHover._1.C[0x2907 ^ 0x2850] = 0xFFFFD782 ^ 0x2850;
                renderAvatarPopup.closeHover._1.C[0x3A8F ^ 0x3B8D] = 0x4376 ^ 0x3B8D;
                renderAvatarPopup.closeHover._1.C[0x3B69 ^ 0x3BDC] = 0xCD01 ^ 0x3BDC;
                renderAvatarPopup.closeHover._1.C[0x5591 ^ 0x55EE] = 0x8AF ^ 0x55EE;
                renderAvatarPopup.closeHover._1.C[0x4ACF ^ 0x4BFC] = 0x4BFD ^ 0x4BFC;
                renderAvatarPopup.closeHover._1.C[0xEC1 ^ 0xFC6] = 0x247A ^ 0xFC6;
                renderAvatarPopup.closeHover._1.C[0xCB54 ^ 0xCA0B] = 0xFFFF35C7 ^ 0xCA0B;
                renderAvatarPopup.closeHover._1.C[0xF9B1 ^ 0xF969] = 0xE98E ^ 0xF969;
                renderAvatarPopup.closeHover._1.C[0xDBEE ^ 0xDB16] = 0x5C1A ^ 0xDB16;
                renderAvatarPopup.closeHover._1.C[0xF4CF ^ 0xF5E4] = 0x89ED ^ 0xF5E4;
                renderAvatarPopup.closeHover._1.C[0xF3CA ^ 0xF39B] = 0xFFFF0C40 ^ 0xF39B;
                renderAvatarPopup.closeHover._1.C[0xA2A3 ^ 0xA39A] = 0x4942 ^ 0xA39A;
                renderAvatarPopup.closeHover._1.C[0xCB63 ^ 0xCA30] = 0xFFFF35BB ^ 0xCA30;
                renderAvatarPopup.closeHover._1.C[0xAAF0 ^ 0xAB8B] = 0x82F ^ 0xAB8B;
                renderAvatarPopup.closeHover._1.C[0xC91F ^ 0xC910] = 0xC969 ^ 0xC910;
                renderAvatarPopup.closeHover._1.C[0x2B34 ^ 0x2A1D] = 0x5614 ^ 0x2A1D;
                renderAvatarPopup.closeHover._1.C[0xF550 ^ 0xF464] = 0xF464 ^ 0xF464;
                renderAvatarPopup.closeHover._1.C[0xAC70 ^ 0xACFC] = 0x33F9 ^ 0xACFC;
                renderAvatarPopup.closeHover._1.C[0x3B3F ^ 0x3BEB] = 0x13F5B ^ 0x3BEB;
                renderAvatarPopup.closeHover._1.C[0xCDA9 ^ 0xCCC2] = 0x1057 ^ 0xCCC2;
                renderAvatarPopup.closeHover._1.C[0x7062 ^ 0x7066] = 0x7067 ^ 0x7066;
                renderAvatarPopup.closeHover._1.C[0x4BB4 ^ 0x4AEF] = 0x4AC2 ^ 0x4AEF;
                renderAvatarPopup.closeHover._1.C[0x5421 ^ 0x544B] = 0x544B ^ 0x544B;
                renderAvatarPopup.closeHover._1.C[0xFCE7 ^ 0xFCAE] = 0xFFFF032A ^ 0xFCAE;
                renderAvatarPopup.closeHover._1.C[0xD43 ^ 0xD5A] = 0xD5A ^ 0xD5A;
                renderAvatarPopup.closeHover._1.C[0xE0C ^ 0xF64] = 0xD3C4 ^ 0xF64;
                renderAvatarPopup.closeHover._1.C[0x671C ^ 0x67ED] = 0x884F ^ 0x67ED;
                renderAvatarPopup.closeHover._1.C[0x9B1B ^ 0x9BEF] = 0xFB95 ^ 0x9BEF;
                renderAvatarPopup.closeHover._1.C[0xD876 ^ 0xD8A0] = 0xFFFE23E7 ^ 0xD8A0;
                renderAvatarPopup.closeHover._1.C[0xDABD ^ 0xDA7C] = 0x14C7 ^ 0xDA7C;
                renderAvatarPopup.closeHover._1.C[0xB480 ^ 0xB420] = 0xB226 ^ 0xB420;
                renderAvatarPopup.closeHover._1.C[0xD41 ^ 0xD63] = 0x8270 ^ 0xD63;
                renderAvatarPopup.closeHover._1.C[0xE5AD ^ 0xE4B0] = 0xD8FA ^ 0xE4B0;
                renderAvatarPopup.closeHover._1.C[0xE5E9 ^ 0xE4AC] = 0xE4DA ^ 0xE4AC;
                renderAvatarPopup.closeHover._1.C[0x8B8 ^ 0x891] = 0x882E ^ 0x891;
                renderAvatarPopup.closeHover._1.C[0x8123 ^ 0x8155] = 0x2F5F ^ 0x8155;
                renderAvatarPopup.closeHover._1.C[0xFAE2 ^ 0xFA32] = 0x3650 ^ 0xFA32;
                renderAvatarPopup.closeHover._1.C[0xE01E ^ 0xE0F0] = 0xFFFF3BEF ^ 0xE0F0;
                renderAvatarPopup.closeHover._1.C[0xD489 ^ 0xD5EB] = 0xD5EF ^ 0xD5EB;
                renderAvatarPopup.closeHover._1.C[0xB1F7 ^ 0xB0C5] = 0xB0C5 ^ 0xB0C5;
                renderAvatarPopup.closeHover._1.C[0xD0F3 ^ 0xD1AE] = 0xD1F4 ^ 0xD1AE;
                renderAvatarPopup.closeHover._1.C[2 ^ 0x143] = 0x153 ^ 0x143;
                renderAvatarPopup.closeHover._1.C[0x2C39 ^ 0x2C82] = 0xD45D ^ 0x2C82;
                renderAvatarPopup.closeHover._1.C[0xBD70 ^ 0xBD77] = 0xBD17 ^ 0xBD77;
                renderAvatarPopup.closeHover._1.C[0x1D85 ^ 0x1DCB] = 0x1DB8 ^ 0x1DCB;
                renderAvatarPopup.closeHover._1.C[0xD658 ^ 0xD654] = 0xFFFF29E6 ^ 0xD654;
                renderAvatarPopup.closeHover._1.C[0xEB23 ^ 0xEB07] = 0xA2CD ^ 0xEB07;
            }
        }), 0.0f, 1.0f);
        float f10 = avatarPopupMetrics.scaled(6.2f);
        Color color4 = ColorUtil.INSTANCE.interpolateColor(MenuStyle.INSTANCE.icon(f3 * (0.28f + 0.18f * f9)), MenuStyle.INSTANCE.title(f3 * (0.35f + 0.35f * f9)), f9);
        float f11 = avatarPopupMetrics.scaled(13.0f);
        float f12 = RangesKt.coerceAtLeast((avatarPopupMetrics.getHeaderHeight() - f11) * 0.5f, avatarPopupMetrics.getMargin() * 0.75f);
        float f13 = f4 + f12;
        float f14 = f5 + f12;
        int n5 = -103;
        n5 ^= 0x33;
        int n6 = 53;
        n6 += -97;
        float f15 = popupRect3.getX() + (popupRect3.getWidth() - E.getWidth$default(Font.INSTANCE.getICON(), (String)a[n5 -= -112], f10, 0.0f, n6 -= -48, null)) * 0.5f;
        float f16 = popupRect3.getY() + (popupRect3.getHeight() - Font.INSTANCE.getICON().getHeight(f10)) * 0.5f - avatarPopupMetrics.scaled(0.2f);
        int n7 = -79;
        n7 -= -120;
        Font.INSTANCE.getICON().priority(this.iconsPipeline()).size(f10).color(color4).drawText((String)a[n7 -= 23], f15, f16);
        int n8 = -34;
        n8 -= 80;
        int n9 = -20;
        n9 ^= 9;
        a a2 = TextureLoader.INSTANCE.get((String)a[n8 ^= 0xFFFFFF81] + (String)a[n9 += 58]);
        if (a2 != null) {
            a a3 = a2;
            long l10 = l8;
            int n10 = -112;
            n10 -= -100;
            l8 = l10 ^ (0L ^ l10) & -1L << (n10 += 44);
            TextureRectRenderer textureRectRenderer = RenderUtils.INSTANCE.getTEXTURE_RECT().priority(INSTANCE.iconsPipeline()).texture(a3.getTexId());
            Color color5 = Color.WHITE;
            int n11 = 49;
            n11 ^= 0xFFFFFFFF;
            Intrinsics.checkNotNullExpressionValue(color5, (String)a[n11 += 79]);
            textureRectRenderer.draw(f13, f14, f11, f11, color5, f11 * 0.5f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, f3);
        }
        E e2 = Font.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()).size(f6).color(color3);
        String string = this.avatarPopupTitle();
        int n12 = 4;
        n12 ^= 0xFFFFFFCB;
        int n13 = -64;
        n13 += 17;
        int n14 = 21;
        n14 ^= 0xFFFFFF95;
        Intrinsics.checkNotNullExpressionValue(string, (String)a[n12 ^= 0xFFFFFFD8] + (String)a[n13 ^= 0xFFFFFFF1] + (String)a[n14 ^= 0xFFFFFF93]);
        e2.drawText(string, f13 + f11 + avatarPopupMetrics.scaled(3.0f), f7 - avatarPopupMetrics.getMargin() / 6.0f);
        float f17 = f5 + avatarPopupMetrics.getHeaderHeight() + avatarPopupMetrics.getMargin() * 0.75f;
        long l11 = l7;
        int n15 = 81;
        n15 += 4;
        long l12 = l7 = l11 ^ (0x400000000L ^ l11) & -1L << (n15 += -53);
        int n16 = 32;
        n16 ^= 0xFFFFFFCA;
        l7 = l12 ^ (0L ^ l12) & -1L >>> (n16 += 54);
        while (true) {
            int n17 = -210;
            n17 ^= 0xFFFFFFAD;
            if ((int)l7 >= (int)(l7 >>> (n17 -= 99))) break;
            int n18 = 160;
            n18 += -34;
            long l13 = l8;
            int n19 = -83;
            n19 -= -99;
            long l14 = l8 = l13 ^ ((long)((int)l7) << (n18 -= 94) ^ l13) & -1L << (n19 -= -16);
            int n20 = 214;
            n20 -= 82;
            l8 = l14 ^ (0L ^ l14) & -1L >>> (n20 -= 100);
            float f18 = f4 + f8;
            int n21 = 135;
            n21 -= 9;
            float f19 = f17 + (float)((int)(l8 >>> (n21 += -94))) * (avatarPopupMetrics.getSettingHeight() + avatarPopupMetrics.getSettingGap());
            float f20 = avatarPopupMetrics.getWidth() - f8 * 2.0f;
            INSTANCE.renderAvatarPopupSettingBackground(f18, f19, f20, avatarPopupMetrics, f3);
            int n22 = 76;
            n22 -= 89;
            switch ((int)(l8 >>> (n22 -= -45))) {
                case 0: {
                    INSTANCE.renderAvatarPopupGuiScaleSetting(f18, f19, f20, avatarPopupMetrics, f3, mouseX, mouseY);
                    break;
                }
                case 1: {
                    INSTANCE.renderAvatarPopupHudScaleSetting(f18, f19, f20, avatarPopupMetrics, f3, mouseX, mouseY);
                    break;
                }
                case 2: {
                    INSTANCE.renderAvatarPopupGuiBackgroundSetting(f18, f19, f20, avatarPopupMetrics, f3);
                    break;
                }
                case 3: {
                    INSTANCE.renderAvatarPopupInfoSetting(f18, f19, f20, avatarPopupMetrics, f3);
                }
            }
            long l15 = l7;
            int n23 = 187;
            n23 -= 81;
            int n24 = 75;
            n24 += -117;
            l7 = l15 ^ (l15 ^ l15 + (long)(n23 += -105)) & -1L >>> (n24 -= -74);
        }
        this.renderAvatarPopupRows(f4 + f8, f4 + avatarPopupMetrics.getWidth() - f8, f17 + avatarPopupMetrics.settingsBlockHeight() + avatarPopupMetrics.getMargin() * 0.4f, avatarPopupMetrics, f3);
    }

    private final void renderAvatarPopupSettingBackground(float x2, float y, float width2, AvatarPopupMetrics metrics, float alpha2) {
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(MenuStyle.INSTANCE.surface(0.035f * alpha2)).mix(0.95f).round(metrics.scaled(3.0f)).border(metrics.scaled(1.0f), MenuStyle.INSTANCE.title(0.06f * alpha2)).draw(x2, y, RangesKt.coerceAtLeast(width2, 0.0f), metrics.getSettingHeight());
    }

    /*
     * Unable to fully structure code
     */
    private final void renderAvatarPopupGuiScaleSetting(float x, float y, float width, AvatarPopupMetrics metrics, float alpha, int mouseX, int mouseY) {
        var32_8 = -7937412681428711604L;
        var30_9 = -9220021956809588613L;
        var8_10 = new PopupRect(x, y, width, metrics.getSettingHeight());
        var9_11 = this.avatarPopupGuiScaleSliderBounds(var8_10, metrics);
        if (MenuScreen.draggingAvatarPopupGuiScale) {
            this.updateAvatarPopupGuiScalePreview(mouseX, var9_11);
            if (!this.isLeftMousePressed()) {
                var35_12 = 9;
                var35_12 += -39;
                MenuScreen.commitAvatarPopupGuiScaleDrag$default(this, null, var35_12 ^= -29, null);
            }
        }
        var10_13 = RangesKt.coerceIn(alpha, 0.0f, 1.0f);
        var11_14 = metrics.scaled(6.0f);
        var12_15 = metrics.scaled(7.8f);
        var13_16 = metrics.scaled(6.7f);
        var14_17 = metrics.scaled(6.2f);
        var15_18 = this.avatarPopupSettingTextYOffset(metrics);
        var16_19 = x + var11_14;
        var17_20 = y + (metrics.getSettingHeight() - Font.INSTANCE.getICON().getHeight(var12_15)) * 0.5f;
        var18_21 = var16_19 + var12_15 + metrics.scaled(4.6f);
        var19_22 = y + (metrics.getSettingHeight() - Font.INSTANCE.getGS_MEDIUM().getHeight(var13_16)) * 0.5f - var15_18;
        var20_23 = this.avatarPopupGuiScaleValueText();
        var21_24 = var9_11.getX() + var9_11.getWidth() + metrics.scaled(5.0f);
        var22_25 = y + (metrics.getSettingHeight() - Font.INSTANCE.getGS_MEDIUM().getHeight(var14_17)) * 0.5f - var15_18;
        v0 = MenuScreen.avatarPopupGuiScaleDragProgress;
        var23_26 = v0 != null ? v0.floatValue() : ClickGuiSettings.INSTANCE.scaleProgress();
        var24_27 = RangesKt.coerceIn(MenuScreen.avatarPopupGuiScaleAnimation.animate(var23_26, 120.0f, (Function1<? super Float, Float>)new Function1<Float, Float>((Object)Easings.INSTANCE){
            private static Object[] a;
            private static Object b;
            private static Object[] B;
            private static Object[] A;
            private static Object[] c;
            public static int[] C;
            {
                int n2 = C[0];
                n2 ^= C[1];
                n2 -= C[2];
                int n3 = C[3];
                n3 ^= C[4];
                n3 ^= C[5];
                int n4 = C[6];
                n4 -= C[7];
                n4 += C[8];
                int n5 = C[9];
                n5 ^= C[10];
                int n6 = C[12];
                n6 += C[13];
                int n7 = C[15];
                n7 ^= C[16];
                super(n2, receiver, Easings.class, (String)a[n3] + (String)a[n4], (String)a[n5 ^= C[11]] + (String)a[n6 += C[14]], n7 -= C[17]);
            }

            public final Float invoke(float p0) {
                return Float.valueOf(((Easings)this.receiver).standardDecelerate(p0));
            }

            static {
                renderAvatarPopupGuiScaleSetting.progress._1.b();
                long l2 = -782861248668057354L;
                long l3 = -3788809087101423861L;
                long l4 = 7415984807945793500L;
                long l5 = -5018332935373651050L;
                long l6 = 7399976535944878478L;
                long l7 = 1435153526528810196L;
                long l8 = 318023982244387793L;
                long l9 = -6528325710294239514L;
                long l10 = 1538564639328105833L;
                long l11 = -8608123059725802117L;
                long l12 = 8013320308825166470L;
                long l13 = 2898728029278205796L;
                long l14 = -6661781711314834306L;
                long l15 = -4204654020103176345L;
                int n2 = C[18];
                n2 -= C[19];
                a = new Object[n2 ^= C[20]];
                long l16 = l15;
                int n3 = C[21];
                n3 -= C[22];
                l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= C[23]);
                Object[] objectArray = new Object[C[24]];
                objectArray[renderAvatarPopupGuiScaleSetting.progress._1.C[25]] = A;
                objectArray[renderAvatarPopupGuiScaleSetting.progress._1.C[26]] = C[27];
                int n4 = C[28];
                Object object = renderAvatarPopupGuiScaleSetting.progress._1.A()[C[29]];
                if (object == null) {
                    char[] cArray = "\ub319\ub33f\ub32e\ub312\ub313\ub31c\ub327\ub3ca\ub3c6\ub38c\ub313\ub33e\ub3ca\ub314\ub339\ub31c\ub33f\ub321\ub3cb\ub33c\ub385\ub3c0\ub3c0\ub32b\ub3c1\ub32d\ub31b\ub339\ub321\ub314\ub31a\ub321\ub3c8\ub339\ub334\ub3c7\ub38b\ub321\ub391\ub2fd\ub339\ub31b\ub3c6\ub315\ub319\ub3c6\ub334\ub32c\ub33f\ub33b\ub332\ub32d\ub3ca\ub31d\ub313\ub2fd\ub356\ub325\ub358\ub313\ub357\ub353\ub356\ub3c0\ub3cb\ub331\ub333\ub318\ub3c6\ub319\ub325\ub31c\ub335\ub337\ub337\ub38a\ub391\ub31a\ub328\ub33f\ub313\ub2fd\ub33b\ub3ca\ub318\ub353\ub3cc\ub353\ub328\ub332\ub320\ub316\ub385\ub32c\ub316\ub356\ub32d\ub333\ub313\ub312\ub2fd\ub3d1\ub354\ub38e\ub3c8\ub337\ub353\ub3c2".toCharArray();
                    for (int i2 = C[30]; i2 < C[31]; ++i2) {
                        int n5 = cArray[i2];
                        n5 ^= C[32];
                        n5 ^= C[33];
                        n5 += C[34];
                        n5 += C[35];
                        n5 ^= C[36];
                        n5 += C[37];
                        n5 -= C[38];
                        n5 ^= C[39];
                        n5 -= C[40];
                        n5 += C[41];
                        n5 -= C[42];
                        n5 -= C[43];
                        n5 -= C[44];
                        cArray[i2] = (char)(n5 += C[45]);
                    }
                    object = renderAvatarPopupGuiScaleSetting.progress._1.A()[renderAvatarPopupGuiScaleSetting.progress._1.C[46]] = new String(cArray);
                }
                objectArray[n4] = (String)object;
                char[] cArray = ((String)renderAvatarPopupGuiScaleSetting.progress._1.a(objectArray)).toCharArray();
                long l17 = l6;
                int n6 = C[47];
                n6 += C[48];
                l6 = l17 ^ (0x3000000000L ^ l17) & -1L << (n6 -= C[49]);
                long l18 = l13;
                int n7 = C[50];
                n7 ^= C[51];
                l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= C[52]);
                while (true) {
                    int n8 = C[53];
                    n8 += C[54];
                    if ((int)l13 >= (int)(l6 >>> (n8 ^= C[55]))) break;
                    int n9 = (int)l13;
                    long l19 = l13;
                    int n10 = C[56];
                    n10 -= C[57];
                    int n11 = C[59];
                    n11 ^= C[60];
                    l13 = l19 ^ (l19 ^ l19 + (long)(n10 += C[58])) & -1L >>> (n11 += C[61]);
                    long l20 = l9;
                    int n12 = C[62];
                    n12 ^= C[63];
                    l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += C[64]);
                    int n13 = (int)l13;
                    long l21 = l13;
                    int n14 = C[65];
                    n14 ^= C[66];
                    int n15 = C[68];
                    n15 += C[69];
                    l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= C[67])) & -1L >>> (n15 ^= C[70]);
                    int n16 = C[71];
                    n16 ^= C[72];
                    long l22 = l10;
                    int n17 = C[74];
                    n17 += C[75];
                    l10 = l22 ^ ((long)cArray[n13] << (n16 ^= C[73]) ^ l22) & -1L << (n17 ^= C[76]);
                    int n18 = C[77];
                    n18 ^= C[78];
                    n18 ^= C[79];
                    int n19 = C[80];
                    n19 ^= C[81];
                    long l23 = l12;
                    int n20 = C[83];
                    n20 += C[84];
                    l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= C[82]))) ^ l23) & -1L >>> (n20 -= C[85]);
                    char[] cArray2 = new char[(int)l12];
                    long l24 = l14;
                    int n21 = C[86];
                    n21 -= C[87];
                    l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= C[88]);
                    while (true) {
                        int n22 = C[89];
                        n22 -= C[90];
                        if ((int)(l14 >>> (n22 += C[91])) >= (int)l12) break;
                        int n23 = C[92];
                        n23 ^= C[93];
                        int n24 = C[95];
                        n24 -= C[96];
                        cArray2[(int)(l14 >>> (n23 -= renderAvatarPopupGuiScaleSetting.progress._1.C[94]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += C[97]))];
                        l14 += 0x100000000L;
                    }
                    int n25 = C[98];
                    n25 -= C[99];
                    int n26 = (int)(l15 >>> (n25 += C[100]));
                    l15 += 0x100000000L;
                    renderAvatarPopupGuiScaleSetting.progress._1.a[n26] = new String(cArray2);
                    long l25 = l13;
                    int n27 = C[101];
                    n27 -= C[102];
                    l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= C[103]);
                }
            }

            public static Object a(Object[] object) {
                Object object2;
                int n2 = (Integer)object[C[104]];
                String string = (String)object[C[105]];
                object = object[C[106]];
                Object[] objectArray = B;
                if (B == null) {
                    objectArray = B = new Object[C[107]];
                }
                if ((object2 = objectArray[n2]) == null) {
                    Object object3 = object;
                    if (object == null) {
                        Object[] objectArray2 = new Object[C[108]];
                        A = objectArray2;
                        object3 = objectArray2;
                        byte[] byArray = new byte[C[110] ^ C[111]];
                        byArray[renderAvatarPopupGuiScaleSetting.progress._1.C[112] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[113]] = C[114] ^ C[115];
                        byArray[renderAvatarPopupGuiScaleSetting.progress._1.C[116] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[117]] = C[118] ^ C[119];
                        byArray[renderAvatarPopupGuiScaleSetting.progress._1.C[120] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[121]] = C[122] ^ C[123];
                        byArray[renderAvatarPopupGuiScaleSetting.progress._1.C[124] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[125]] = C[126] ^ C[127];
                        byArray[renderAvatarPopupGuiScaleSetting.progress._1.C[128] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[129]] = C[130] ^ C[131];
                        byArray[renderAvatarPopupGuiScaleSetting.progress._1.C[132] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[133]] = C[134] ^ C[135];
                        byArray[renderAvatarPopupGuiScaleSetting.progress._1.C[136] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[137]] = C[138] ^ C[139];
                        byArray[renderAvatarPopupGuiScaleSetting.progress._1.C[140] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[141]] = C[142] ^ C[143];
                        byArray[renderAvatarPopupGuiScaleSetting.progress._1.C[144] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[145]] = C[146] ^ C[147];
                        byArray[renderAvatarPopupGuiScaleSetting.progress._1.C[148] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[149]] = C[150] ^ C[151];
                        byArray[renderAvatarPopupGuiScaleSetting.progress._1.C[152] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[153]] = C[154] ^ C[155];
                        byArray[renderAvatarPopupGuiScaleSetting.progress._1.C[156] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[157]] = C[158] ^ C[159];
                        byArray[renderAvatarPopupGuiScaleSetting.progress._1.C[160] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[161]] = C[162] ^ C[163];
                        byArray[renderAvatarPopupGuiScaleSetting.progress._1.C[164] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[165]] = C[166] ^ C[167];
                        byArray[renderAvatarPopupGuiScaleSetting.progress._1.C[168] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[169]] = C[170] ^ C[171];
                        byArray[renderAvatarPopupGuiScaleSetting.progress._1.C[172] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[173]] = C[174] ^ C[175];
                        objectArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[109]] = byArray;
                    }
                    byte[] byArray = (byte[])object3[C[176]];
                    if (b == null) {
                        byte[] byArray2 = new byte[C[177] ^ C[178]];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[179] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[180]] = C[181] ^ C[182];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[183] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[184]] = C[185] ^ C[186];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[187] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[188]] = C[189] ^ C[190];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[191] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[192]] = C[193] ^ C[194];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[195] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[196]] = C[197] ^ C[198];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[199] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[200]] = C[201] ^ C[202];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[203] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[204]] = C[205] ^ C[206];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[207] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[208]] = C[209] ^ C[210];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[211] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[212]] = C[213] ^ C[214];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[215] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[216]] = C[217] ^ C[218];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[219] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[220]] = C[221] ^ C[222];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[223] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[224]] = C[225] ^ C[226];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[227] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[228]] = C[229] ^ C[230];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[231] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[232]] = C[233] ^ C[234];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[235] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[236]] = C[237] ^ C[238];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[239] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[240]] = C[241] ^ C[242];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[243] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[244]] = C[245] ^ C[246];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[247] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[248]] = C[249] ^ C[250];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[251] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[252]] = C[253] ^ C[254];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[255] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[256]] = C[257] ^ C[258];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[259] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[260]] = C[261] ^ C[262];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[263] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[264]] = C[265] ^ C[266];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[267] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[268]] = C[269] ^ C[270];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[271] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[272]] = C[273] ^ C[274];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[275] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[276]] = C[277] ^ C[278];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[279] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[280]] = C[281] ^ C[282];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[283] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[284]] = C[285] ^ C[286];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[287] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[288]] = C[289] ^ C[290];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[291] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[292]] = C[293] ^ C[294];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[295] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[296]] = C[297] ^ C[298];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[299] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[300]] = C[301] ^ C[302];
                        byArray2[renderAvatarPopupGuiScaleSetting.progress._1.C[303] ^ renderAvatarPopupGuiScaleSetting.progress._1.C[304]] = C[305] ^ C[306];
                        byte[] byArray3 = new byte[byArray.length + byArray2.length];
                        System.arraycopy(byArray, C[307], byArray3, C[308], byArray.length);
                        System.arraycopy(byArray2, C[309], byArray3, byArray.length, byArray2.length);
                        Object object4 = renderAvatarPopupGuiScaleSetting.progress._1.A()[C[310]];
                        if (object4 == null) {
                            char[] cArray = "\u6951\u6957\u696a\u6955\u696b\u9647\u9646\u680c\u6805\u6819\u6979\u6810\u6974\u6972\u6962\u6979\u6954\u9644".toCharArray();
                            for (int i2 = C[311]; i2 < C[312]; ++i2) {
                                int n3 = cArray[i2];
                                n3 ^= C[313];
                                n3 ^= C[314];
                                n3 -= C[315];
                                n3 -= C[316];
                                n3 ^= C[317];
                                n3 += C[318];
                                n3 += C[319];
                                n3 += C[320];
                                n3 -= C[321];
                                n3 -= C[322];
                                n3 += C[323];
                                n3 ^= C[324];
                                n3 -= C[325];
                                n3 ^= C[326];
                                cArray[i2] = (char)(n3 -= C[327]);
                            }
                            object4 = renderAvatarPopupGuiScaleSetting.progress._1.A()[renderAvatarPopupGuiScaleSetting.progress._1.C[328]] = new String(cArray);
                        }
                        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                        byte[] byArray4 = new byte[C[329]];
                        byArray4[renderAvatarPopupGuiScaleSetting.progress._1.C[330]] = C[331];
                        byArray4[renderAvatarPopupGuiScaleSetting.progress._1.C[332]] = C[333];
                        byArray4[renderAvatarPopupGuiScaleSetting.progress._1.C[334]] = C[335];
                        byArray4[renderAvatarPopupGuiScaleSetting.progress._1.C[336]] = C[337];
                        byArray4[renderAvatarPopupGuiScaleSetting.progress._1.C[338]] = C[339];
                        byArray4[renderAvatarPopupGuiScaleSetting.progress._1.C[340]] = C[341];
                        byArray4[renderAvatarPopupGuiScaleSetting.progress._1.C[342]] = C[343];
                        byArray4[renderAvatarPopupGuiScaleSetting.progress._1.C[344]] = C[345];
                        byArray4[renderAvatarPopupGuiScaleSetting.progress._1.C[346]] = C[347];
                        byArray4[renderAvatarPopupGuiScaleSetting.progress._1.C[348]] = C[349];
                        byArray4[renderAvatarPopupGuiScaleSetting.progress._1.C[350]] = C[351];
                        byArray4[renderAvatarPopupGuiScaleSetting.progress._1.C[352]] = C[353];
                        byArray4[renderAvatarPopupGuiScaleSetting.progress._1.C[354]] = C[355];
                        byArray4[renderAvatarPopupGuiScaleSetting.progress._1.C[356]] = C[357];
                        byArray4[renderAvatarPopupGuiScaleSetting.progress._1.C[358]] = C[359];
                        byArray4[renderAvatarPopupGuiScaleSetting.progress._1.C[360]] = C[361];
                        PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, C[362], C[363]);
                        byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                        Object object5 = renderAvatarPopupGuiScaleSetting.progress._1.A()[C[364]];
                        if (object5 == null) {
                            char[] cArray = "\uf8c6\uf8ca\uf91c".toCharArray();
                            for (int i3 = C[365]; i3 < C[366]; ++i3) {
                                int n4 = cArray[i3];
                                n4 += C[367];
                                n4 -= C[368];
                                n4 -= C[369];
                                n4 -= C[370];
                                n4 ^= C[371];
                                n4 ^= C[372];
                                n4 += C[373];
                                n4 ^= C[374];
                                n4 += C[375];
                                cArray[i3] = (char)(n4 -= C[376]);
                            }
                            object5 = renderAvatarPopupGuiScaleSetting.progress._1.A()[renderAvatarPopupGuiScaleSetting.progress._1.C[377]] = new String(cArray);
                        }
                        b = new SecretKeySpec(byArray5, (String)object5);
                    }
                    byte[] byArray6 = Base64.getDecoder().decode(string);
                    byte[] byArray7 = Arrays.copyOfRange(byArray6, C[378], C[379]);
                    byte[] byArray8 = Arrays.copyOfRange(byArray6, C[380], byArray6.length);
                    Object object6 = renderAvatarPopupGuiScaleSetting.progress._1.A()[C[381]];
                    if (object6 == null) {
                        char[] cArray = "\u80c6\u813a\u73d8\u80b4\u80c8\u80c9\u80c8\u80b4\u73d7\u7340\u80c8\u73d8\u80aa\u73d7\u7366\u734b\u734b\u735e\u7365\u735c".toCharArray();
                        for (int i4 = C[382]; i4 < C[383]; ++i4) {
                            int n5 = cArray[i4];
                            n5 += C[384];
                            n5 += C[385];
                            n5 ^= C[386];
                            n5 -= C[387];
                            n5 -= C[388];
                            n5 ^= C[389];
                            n5 += C[390];
                            n5 ^= C[391];
                            n5 += C[392];
                            n5 ^= C[393];
                            n5 -= C[394];
                            n5 -= C[395];
                            n5 -= C[396];
                            cArray[i4] = (char)(n5 ^= C[397]);
                        }
                        object6 = renderAvatarPopupGuiScaleSetting.progress._1.A()[renderAvatarPopupGuiScaleSetting.progress._1.C[398]] = new String(cArray);
                    }
                    Cipher cipher = Cipher.getInstance((String)object6);
                    cipher.init(C[399], (Key)((SecretKey)b), new IvParameterSpec(byArray7));
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
                C = new int[0x6760 ^ 0x66F0];
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xFF27 ^ 0xFFDF] = 0x1F731 ^ 0xFFDF;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x9FB7 ^ 0x9F73] = 0x6916 ^ 0x9F73;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x5B14 ^ 0x5B71] = 0x5BCF ^ 0x5B71;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1831 ^ 0x18DA] = 0x9A04 ^ 0x18DA;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x3CF7 ^ 0x3C25] = 0x8BE2 ^ 0x3C25;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xE800 ^ 0xE925] = 0xA3E0 ^ 0xE925;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xDBA4 ^ 0xDBBE] = 0xDBBF ^ 0xDBBE;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x3060 ^ 0x305C] = 0xFFFFCFD2 ^ 0x305C;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x8191 ^ 0x8195] = 0x81D5 ^ 0x8195;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x5CF7 ^ 0x5C11] = 0x44D9 ^ 0x5C11;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x32B5 ^ 0x325A] = 0x8BDD ^ 0x325A;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xFA55 ^ 0xFADD] = 0x2C8A ^ 0xFADD;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x3463 ^ 0x3577] = 0x1399D ^ 0x3577;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x10AEA ^ 0x10AAB] = 0xFFFEF51F ^ 0x10AAB;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x10C71 ^ 0x10C0E] = 0x17C82 ^ 0x10C0E;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x33C3 ^ 0x32A2] = 0xFFFFCD5B ^ 0x32A2;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x751E ^ 0x758B] = 0xCEA9 ^ 0x758B;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x194C ^ 0x194E] = 0xFFFFE6B2 ^ 0x194E;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xA04D ^ 0xA039] = 0x44D1 ^ 0xA039;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x7DCD ^ 0x7D94] = 0x7D4C ^ 0x7D94;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xB6FE ^ 0xB670] = 0xEE9F ^ 0xB670;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x68FA ^ 0x689D] = 0x68D3 ^ 0x689D;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xC288 ^ 0xC2A2] = 0x767B ^ 0xC2A2;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x10A3C ^ 0x10A5F] = 0xFFFEF5B2 ^ 0x10A5F;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xF154 ^ 0xF1BD] = 0x9122 ^ 0xF1BD;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xD920 ^ 0xD9CA] = 0xB937 ^ 0xD9CA;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x3E25 ^ 0x3F66] = 0x7255 ^ 0x3F66;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x65C0 ^ 0x6503] = 0x936A ^ 0x6503;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x100FB ^ 0x1009D] = 0x100CD ^ 0x1009D;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xA0E3 ^ 0xA1A8] = 0xFFFF5E50 ^ 0xA1A8;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1376 ^ 0x13E2] = 0xA8C1 ^ 0x13E2;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xA1C2 ^ 0xA100] = 0xEC7C ^ 0xA100;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x5B8C ^ 0x5ADE] = 0x5AD5 ^ 0x5ADE;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xDF7F ^ 0xDF9F] = 0x92D2 ^ 0xDF9F;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xD2F ^ 0xC75] = 0xC77 ^ 0xC75;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x9CC7 ^ 0x9DBD] = 0x9DBD ^ 0x9DBD;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xDD9A ^ 0xDCF5] = 0xCCC4 ^ 0xDCF5;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x53C0 ^ 0x52FA] = 0x93B ^ 0x52FA;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x237A ^ 0x23FD] = 0x789 ^ 0x23FD;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x829C ^ 0x831D] = 0x4878 ^ 0x831D;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x3C74 ^ 0x3D11] = 0x3D4E ^ 0x3D11;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xF8B7 ^ 0xF9DB] = 0xF9D9 ^ 0xF9DB;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xD272 ^ 0xD33E] = 0xD33A ^ 0xD33E;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x954B ^ 0x9545] = 0x9538 ^ 0x9545;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xF900 ^ 0xF845] = 0xA1F2 ^ 0xF845;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x8ABA ^ 0x8A63] = 0xFFFFC735 ^ 0x8A63;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xED32 ^ 0xEC4F] = 0xEC4C ^ 0xEC4F;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x896F ^ 0x898C] = 0x9152 ^ 0x898C;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x671B ^ 0x664F] = 0x6642 ^ 0x664F;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xA8AE ^ 0xA9C9] = 0xA9AF ^ 0xA9C9;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x5FF9 ^ 0x5EE3] = 0x676 ^ 0x5EE3;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x7AE3 ^ 0x7A41] = 0xFFFF5FF5 ^ 0x7A41;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x135F ^ 0x13E7] = 0x40F6 ^ 0x13E7;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xEE39 ^ 0xEFBB] = 0x487C ^ 0xEFBB;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x103C6 ^ 0x102E6] = 0x169B6 ^ 0x102E6;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x13DB ^ 0x12FD] = 0x584A ^ 0x12FD;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x95BB ^ 0x9500] = 0x34A7 ^ 0x9500;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xFF4A ^ 0xFF67] = 0x1659 ^ 0xFF67;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x67B0 ^ 0x66A2] = 0x2E4D ^ 0x66A2;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x3A14 ^ 0x3B17] = 0x68A6 ^ 0x3B17;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xDEA4 ^ 0xDFCA] = 0xDFC9 ^ 0xDFCA;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xF21E ^ 0xF2C1] = 0xBF91 ^ 0xF2C1;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x4F92 ^ 0x4F2E] = 0xEE90 ^ 0x4F2E;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x4311 ^ 0x43D7] = 0xB5B2 ^ 0x43D7;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xBF3D ^ 0xBF36] = 0xBF48 ^ 0xBF36;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xBBA7 ^ 0xBBDF] = 0x9643 ^ 0xBBDF;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xF8E7 ^ 0xF96A] = 0x8035 ^ 0xF96A;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x92AA ^ 0x9294] = 0x92E9 ^ 0x9294;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x7897 ^ 0x78C3] = 0x78D8 ^ 0x78C3;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x5900 ^ 0x5868] = 0x5866 ^ 0x5868;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x8639 ^ 0x86BF] = 0xFFFF5D0D ^ 0x86BF;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1723 ^ 0x17A8] = 0xC1FC ^ 0x17A8;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x80FB ^ 0x80C1] = 0xFFFF7F7B ^ 0x80C1;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x962 ^ 0x98C] = 0x8B5D ^ 0x98C;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x171 ^ 0x156] = 0x10C4 ^ 0x156;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x8AB ^ 0x826] = 0x50C8 ^ 0x826;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xCF9E ^ 0xCF63] = 0xFFFFE6E1 ^ 0xCF63;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x99A ^ 0x93F] = 0x2CF1 ^ 0x93F;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xDB7 ^ 0xCF8] = 0xCAE ^ 0xCF8;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x10164 ^ 0x10062] = 0x153C6 ^ 0x10062;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xE478 ^ 0xE46E] = 0xE44B ^ 0xE46E;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xFAE9 ^ 0xFBE6] = 0xB307 ^ 0xFBE6;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x10522 ^ 0x10598] = 0x15689 ^ 0x10598;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xFD18 ^ 0xFC27] = 0x6AE ^ 0xFC27;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xC9BB ^ 0xC8C4] = 0xC8D0 ^ 0xC8C4;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xFAA6 ^ 0xFA95] = 0xFAD6 ^ 0xFA95;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xF107 ^ 0xF10B] = 0xFFFF0EB1 ^ 0xF10B;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x6CC8 ^ 0x6C78] = 0x6C78 ^ 0x6C78;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x5521 ^ 0x5476] = 0xFFFFABF6 ^ 0x5476;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x85CA ^ 0x84FA] = 0xDD12 ^ 0x84FA;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x2188 ^ 0x2164] = 0xA3B5 ^ 0x2164;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x8C19 ^ 0x8D10] = 0xFFFFA6F6 ^ 0x8D10;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1073A ^ 0x10644] = 0x10644 ^ 0x10644;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x95FD ^ 0x95D8] = 0xA8D7 ^ 0x95D8;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xF1F8 ^ 0xF198] = 0xF1A9 ^ 0xF198;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xE4DC ^ 0xE426] = 0x1ECC8 ^ 0xE426;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x62C2 ^ 0x6384] = 0x5413 ^ 0x6384;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xA463 ^ 0xA4A4] = 0x6FC5 ^ 0xA4A4;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x4A42 ^ 0x4A79] = 0xFFFFB58A ^ 0x4A79;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x107B5 ^ 0x10735] = 0x10E6D ^ 0x10735;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x3E34 ^ 0x3E76] = 0xFFFFC1EF ^ 0x3E76;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xCDB1 ^ 0xCD1C] = 0x72A1 ^ 0xCD1C;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x6D6B ^ 0x6C4F] = 0x26F8 ^ 0x6C4F;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xA44B ^ 0xA520] = 0xA420 ^ 0xA520;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x61E7 ^ 0x61BD] = 0x6184 ^ 0x61BD;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x778C ^ 0x769B] = 0x2E0B ^ 0x769B;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x4BCD ^ 0x4BA0] = 0x4BA0 ^ 0x4BA0;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xE5CF ^ 0xE48E] = 0xF580 ^ 0xE48E;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x203 ^ 0x23A] = 0x20B ^ 0x23A;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x109E0 ^ 0x10865] = 0x16AAC ^ 0x10865;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x2F20 ^ 0x2E01] = 0x457D ^ 0x2E01;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x223E ^ 0x2215] = 0x12AC ^ 0x2215;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x10BC3 ^ 0x10B93] = 0xFFFEF47A ^ 0x10B93;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x327 ^ 0x37C] = 0xFFFFFCFD ^ 0x37C;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xC61E ^ 0xC71E] = 0x7929 ^ 0xC71E;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x90AE ^ 0x91B3] = 0xFFFFF51F ^ 0x91B3;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xC55E ^ 0xC400] = 0xC40C ^ 0xC400;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xBFAF ^ 0xBF77] = 0xDAE ^ 0xBF77;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x931E ^ 0x9229] = 0x9229 ^ 0x9229;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x10C42 ^ 0x10C5C] = 0x10C5C ^ 0x10C5C;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xBF71 ^ 0xBF88] = 0xFFFE488B ^ 0xBF88;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x6C11 ^ 0x6C4C] = 0x6C6C ^ 0x6C4C;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x42FA ^ 0x4252] = 0xB803 ^ 0x4252;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x5B4E ^ 0x5A0E] = 0x28E2 ^ 0x5A0E;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x3DB5 ^ 0x3D93] = 0x2F83 ^ 0x3D93;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xA5F4 ^ 0xA520] = 0x7771 ^ 0xA520;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x53B7 ^ 0x53C2] = 0xB727 ^ 0x53C2;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xDA11 ^ 0xDAC7] = 0x896 ^ 0xDAC7;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x6552 ^ 0x644A] = 0x3CDF ^ 0x644A;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x4E8E ^ 0x4E87] = 0xFFFFB164 ^ 0x4E87;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x399B ^ 0x39D0] = 0xFFFFC655 ^ 0x39D0;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xDA9F ^ 0xDBAD] = 0x8245 ^ 0xDBAD;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x357C ^ 0x3500] = 0x4587 ^ 0x3500;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x72A9 ^ 0x73F5] = 0x73FF ^ 0x73F5;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x10B21 ^ 0x10B97] = 0x1235E ^ 0x10B97;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1B60 ^ 0x1B3C] = 0xFFFFE4E3 ^ 0x1B3C;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xFBDF ^ 0xFB8C] = 0xFB9E ^ 0xFB8C;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x6C22 ^ 0x6D71] = 0x6D61 ^ 0x6D71;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x5D7C ^ 0x5C3B] = 0x5F21 ^ 0x5C3B;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x10A14 ^ 0x10AB5] = 0x1D08F ^ 0x10AB5;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x86F ^ 0x970] = 0x623A ^ 0x970;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1822 ^ 0x183A] = 0x1839 ^ 0x183A;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x62B3 ^ 0x63B2] = 0xFFFF2246 ^ 0x63B2;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x886E ^ 0x889C] = 0x3113 ^ 0x889C;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x7B49 ^ 0x7BD9] = 0xA657 ^ 0x7BD9;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xA08 ^ 0xA02] = 0xFFFFF59F ^ 0xA02;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x3634 ^ 0x370F] = 0x364C ^ 0x370F;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x540C ^ 0x54C9] = 0xFFFF5D56 ^ 0x54C9;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x6482 ^ 0x6451] = 0xB618 ^ 0x6451;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x454B ^ 0x4438] = 0xBACF ^ 0x4438;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x91FB ^ 0x9160] = 0x5F6D ^ 0x9160;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xD3F8 ^ 0xD383] = 0xFE1F ^ 0xD383;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xD028 ^ 0xD058] = 0x1D21B ^ 0xD058;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1C46 ^ 0x1DC0] = 0x5B0B ^ 0x1DC0;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x2FBA ^ 0x2FCD] = 0xCB28 ^ 0x2FCD;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xE32D ^ 0xE3DD] = 0x5A52 ^ 0xE3DD;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xA509 ^ 0xA57F] = 0xFFFFBE48 ^ 0xA57F;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x10C17 ^ 0x10C0C] = 0x10C0C ^ 0x10C0C;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xBE19 ^ 0xBE4E] = 0xFFFF4195 ^ 0xBE4E;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xB8AE ^ 0xB865] = 0x399C ^ 0xB865;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x438B ^ 0x42A6] = 0xFFFF51FA ^ 0x42A6;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x42AA ^ 0x4230] = 0xFFFF73DB ^ 0x4230;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x358B ^ 0x35DA] = 0x35B0 ^ 0x35DA;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x42A3 ^ 0x4272] = 0xFFFF0A06 ^ 0x4272;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x87F2 ^ 0x869F] = 0x869F ^ 0x869F;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xB8BF ^ 0xB83B] = 0x9C48 ^ 0xB83B;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xEEDA ^ 0xEE10] = 0x2575 ^ 0xEE10;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xD36B ^ 0xD209] = 0xD20F ^ 0xD209;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xAF1D ^ 0xAF54] = 0xFFFF50E0 ^ 0xAF54;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1CB9 ^ 0x1CFA] = 0x1CD6 ^ 0x1CFA;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x7046 ^ 0x7028] = 0x5461 ^ 0x7028;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x737D ^ 0x7322] = 0x733C ^ 0x7322;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xADC0 ^ 0xAC8E] = 0xAC8E ^ 0xAC8E;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xFCA8 ^ 0xFC35] = 0xD6FA ^ 0xFC35;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x4813 ^ 0x492D] = 0x3864 ^ 0x492D;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x9A87 ^ 0x9BA5] = 0xF0F5 ^ 0x9BA5;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x2283 ^ 0x23BA] = 0xEE3A ^ 0x23BA;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x2341 ^ 0x2354] = 0x23CF ^ 0x2354;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xEEB ^ 0xE8F] = 0xFFFFF117 ^ 0xE8F;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xAC3F ^ 0xAC2F] = 0xAC0D ^ 0xAC2F;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xC2A0 ^ 0xC3AC] = 0x81B7 ^ 0xC3AC;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1097C ^ 0x10807] = 0x10817 ^ 0x10807;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x4155 ^ 0x410B] = 0xFFFFBED4 ^ 0x410B;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xABFC ^ 0xAA8A] = 0xE5F6 ^ 0xAA8A;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x6D02 ^ 0x6D4C] = 0xFFFF92F3 ^ 0x6D4C;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x4D95 ^ 0x4D2B] = 0xEC95 ^ 0x4D2B;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1480 ^ 0x159E] = 0x8EC9 ^ 0x159E;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x14D6 ^ 0x1445] = 0xC9C7 ^ 0x1445;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1072F ^ 0x1070B] = 0x1A5A1 ^ 0x1070B;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1464 ^ 0x1445] = 0xC104 ^ 0x1445;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x5452 ^ 0x54A6] = 0xF469 ^ 0x54A6;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xC72A ^ 0xC63F] = 0xFFFE3572 ^ 0xC63F;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1357 ^ 0x139B] = 0x9275 ^ 0x139B;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xA190 ^ 0xA1D6] = 0xA1E9 ^ 0xA1D6;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xD862 ^ 0xD94D] = 0x80AC ^ 0xD94D;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xA0D2 ^ 0xA01A] = 0x6B7F ^ 0xA01A;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xF82E ^ 0xF8CA] = 0xE002 ^ 0xF8CA;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xFFDC ^ 0xFF5E] = 0xFFFF09B3 ^ 0xFF5E;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1674 ^ 0x175C] = 0xE4EE ^ 0x175C;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x614C ^ 0x6060] = 0x8CBD ^ 0x6060;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1D53 ^ 0x1D84] = 0xAF56 ^ 0x1D84;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x4C8D ^ 0x4DFF] = 0x3E6A ^ 0x4DFF;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x87B0 ^ 0x87A9] = 0x87A9 ^ 0x87A9;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x88CC ^ 0x8946] = 0x367D ^ 0x8946;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x423D ^ 0x4229] = 0xFFFFBDFD ^ 0x4229;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x89D8 ^ 0x89F4] = 0x25CE ^ 0x89F4;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x7811 ^ 0x780C] = 0x780C ^ 0x780C;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xCC99 ^ 0xCC65] = 0x1A3B ^ 0xCC65;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x8D20 ^ 0x8C0B] = 0x60D7 ^ 0x8C0B;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xA55D ^ 0xA5FB] = 0x8018 ^ 0xA5FB;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xD056 ^ 0xD0FF] = 0x2AA7 ^ 0xD0FF;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x23D3 ^ 0x23CF] = 0x23CD ^ 0x23CF;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xA955 ^ 0xA82D] = 0xBA32 ^ 0xA82D;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x13A7 ^ 0x12FC] = 0xFFFFED0B ^ 0x12FC;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x9F6C ^ 0x9F2B] = 0x9F75 ^ 0x9F2B;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x41B5 ^ 0x40AC] = 0xFFFFE7FE ^ 0x40AC;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x935D ^ 0x927E] = 0xD8DD ^ 0x927E;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xAC19 ^ 0xACA0] = 0xFFFF0018 ^ 0xACA0;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xDCDE ^ 0xDDD9] = 0x9C9 ^ 0xDDD9;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x3A05 ^ 0x3AE8] = 0xB877 ^ 0x3AE8;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xA0A1 ^ 0xA097] = 0xFFFF5F78 ^ 0xA097;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xDAEB ^ 0xDBDA] = 0x824B ^ 0xDBDA;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xD19F ^ 0xD13F] = 0xB00 ^ 0xD13F;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x10868 ^ 0x10919] = 0x1259D ^ 0x10919;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x10182 ^ 0x100BA] = 0x100A8 ^ 0x100BA;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x82AB ^ 0x82E1] = 0x82FD ^ 0x82E1;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x5973 ^ 0x59A3] = 0xEE64 ^ 0x59A3;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x438C ^ 0x4303] = 0x1BED ^ 0x4303;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xE9A4 ^ 0xE9D6] = 0x1EBED ^ 0xE9D6;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x16A0 ^ 0x17A5] = 0xFFFFBBA4 ^ 0x17A5;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xF930 ^ 0xF94A] = 0xFFFF2B6B ^ 0xF94A;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xAA14 ^ 0xAB3D] = 0xFFFFA718 ^ 0xAB3D;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xE1EE ^ 0xE1DF] = 0xE1A5 ^ 0xE1DF;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xC852 ^ 0xC942] = 0x81AD ^ 0xC942;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x133D ^ 0x1244] = 0x1246 ^ 0x1244;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xCA3C ^ 0xCA78] = 0xFFFF359A ^ 0xCA78;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x285F ^ 0x28F5] = 0xFFFF2D19 ^ 0x28F5;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xDD29 ^ 0xDCA2] = 0x50BC ^ 0xDCA2;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xB16B ^ 0xB15F] = 0xB161 ^ 0xB15F;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xCAF9 ^ 0xCB99] = 0xCB91 ^ 0xCB99;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x106AD ^ 0x107D1] = 0x107C1 ^ 0x107D1;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x10716 ^ 0x10672] = 0x1067D ^ 0x10672;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x5094 ^ 0x50B7] = 0x511F ^ 0x50B7;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x7A45 ^ 0x7AC9] = 0x2229 ^ 0x7AC9;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x6040 ^ 0x60F7] = 0x33F9 ^ 0x60F7;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xF1AD ^ 0xF112] = 0xBC63 ^ 0xF112;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x83BB ^ 0x83CA] = 0x18186 ^ 0x83CA;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xB819 ^ 0xB8EF] = 0x1820 ^ 0xB8EF;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x9F6 ^ 0x8AE] = 0x8AF ^ 0x8AE;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x2B2 ^ 0x3D8] = 0x3DF ^ 0x3D8;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xCEF3 ^ 0xCE04] = 0x1C6E0 ^ 0xCE04;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x10199 ^ 0x100B3] = 0x1F301 ^ 0x100B3;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x59E8 ^ 0x5935] = 0xA957 ^ 0x5935;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x10A05 ^ 0x10A6E] = 0x10A6F ^ 0x10A6E;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1E82 ^ 0x1E57] = 0xCC53 ^ 0x1E57;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xA51D ^ 0xA5D4] = 0x6E90 ^ 0xA5D4;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x4BED ^ 0x4B7F] = 0xFFFF694E ^ 0x4B7F;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xE3F8 ^ 0xE399] = 0xE3AA ^ 0xE399;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xD0ED ^ 0xD0DF] = 0xD082 ^ 0xD0DF;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x96EA ^ 0x9765] = 0x9767 ^ 0x9765;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x61E6 ^ 0x6171] = 0xDA53 ^ 0x6171;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x179F ^ 0x161F] = 0x357F ^ 0x161F;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x7D9 ^ 0x78B] = 0xFFFFF828 ^ 0x78B;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x4F7C ^ 0x4E78] = 0x1DDC ^ 0x4E78;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xEE14 ^ 0xEE36] = 0x3E70 ^ 0xEE36;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x5197 ^ 0x5019] = 0x501A ^ 0x5019;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xB755 ^ 0xB7C9] = 0x9D0E ^ 0xB7C9;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1079A ^ 0x10785] = 0x107E9 ^ 0x10785;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xABAE ^ 0xAB5B] = 0xBF5 ^ 0xAB5B;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xB65 ^ 0xA7E] = 0x9135 ^ 0xA7E;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x105E7 ^ 0x10566] = 0x10C34 ^ 0x10566;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xFB3A ^ 0xFB13] = 0xF405 ^ 0xFB13;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x611D ^ 0x6059] = 0x9F4C ^ 0x6059;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x610D ^ 0x6142] = 0x6140 ^ 0x6142;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x44EE ^ 0x44E9] = 0xFFFFBB00 ^ 0x44E9;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x7D7A ^ 0x7DD9] = 0xA7E3 ^ 0x7DD9;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xDAFA ^ 0xDBC6] = 0xC100 ^ 0xDBC6;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x73AF ^ 0x73C5] = 0x73C5 ^ 0x73C5;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x6957 ^ 0x680A] = 0xFFFF97BA ^ 0x680A;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x9014 ^ 0x9116] = 0x2F21 ^ 0x9116;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xF5BB ^ 0xF4AD] = 0x1F847 ^ 0xF4AD;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x36BB ^ 0x3653] = 0x56AE ^ 0x3653;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x395 ^ 0x303] = 0xFFFF47B5 ^ 0x303;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xE269 ^ 0xE214] = 0x9298 ^ 0xE214;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x427A ^ 0x4254] = 0x4254 ^ 0x4254;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xB47E ^ 0xB54B] = 0xB54B ^ 0xB54B;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x547D ^ 0x54C9] = 0x7C00 ^ 0x54C9;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xF0B8 ^ 0xF1E7] = 0xFFFF0E25 ^ 0xF1E7;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x5686 ^ 0x570A] = 0xD374 ^ 0x570A;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x7576 ^ 0x7559] = 0x7570 ^ 0x7559;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x44D8 ^ 0x44F0] = 0x8063 ^ 0x44F0;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xA7E6 ^ 0xA765] = 0xAE37 ^ 0xA765;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xE2F9 ^ 0xE2F9] = 0xE28A ^ 0xE2F9;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x5BC6 ^ 0x5B6A] = 0xE4D3 ^ 0x5B6A;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x8303 ^ 0x820E] = 0xFFFF3FB0 ^ 0x820E;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x854A ^ 0x843D] = 0xBB70 ^ 0x843D;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xCB69 ^ 0xCB92] = 0x1DCE ^ 0xCB92;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xEEC7 ^ 0xEE20] = 0x8ECF ^ 0xEE20;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x7F4C ^ 0x7F25] = 0x7F27 ^ 0x7F25;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x9076 ^ 0x912F] = 0xFFFF6E93 ^ 0x912F;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x41FD ^ 0x41F0] = 0xFFFFBE3B ^ 0x41F0;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x7430 ^ 0x7465] = 0x7468 ^ 0x7465;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xEA3C ^ 0xEA74] = 0xFFFF15BE ^ 0xEA74;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xC29E ^ 0xC250] = 0x43BE ^ 0xC250;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x7155 ^ 0x718E] = 0x81C4 ^ 0x718E;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x826F ^ 0x8250] = 0xFFFF7DCF ^ 0x8250;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x19CE ^ 0x188C] = 0xA55D ^ 0x188C;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xD5DC ^ 0xD4CD] = 0xFFFF63F1 ^ 0xD4CD;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x276D ^ 0x26EA] = 0xF8A5 ^ 0x26EA;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x88DA ^ 0x88B6] = 0x88B7 ^ 0x88B6;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x21C ^ 0x20D] = 0x222 ^ 0x20D;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x8AC5 ^ 0x8AA7] = 0x8AD2 ^ 0x8AA7;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xE4D4 ^ 0xE45E] = 0xFFFFCDE2 ^ 0xE45E;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x8709 ^ 0x8751] = 0xFFFF78D7 ^ 0x8751;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x335B ^ 0x331E] = 0x3323 ^ 0x331E;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xC51E ^ 0xC50D] = 0xC57E ^ 0xC50D;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x575D ^ 0x574F] = 0x570C ^ 0x574F;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x3231 ^ 0x3259] = 0x3258 ^ 0x3259;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x5973 ^ 0x58F7] = 0x4DE ^ 0x58F7;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x9829 ^ 0x9898] = 0xE783 ^ 0x9898;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x925E ^ 0x92F0] = 0x2D21 ^ 0x92F0;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x7961 ^ 0x7918] = 0x5484 ^ 0x7918;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xC221 ^ 0xC3A9] = 0x3B99 ^ 0xC3A9;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1128 ^ 0x1168] = 0x1156 ^ 0x1168;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x7D70 ^ 0x7D73] = 0xFFFF82C3 ^ 0x7D73;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xF079 ^ 0xF0B4] = 0x7169 ^ 0xF0B4;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xD2A6 ^ 0xD2EB] = 0xFFFF2D46 ^ 0xD2EB;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x4CDA ^ 0x4C25] = 0xF203 ^ 0x4C25;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xA87B ^ 0xA84E] = 0xFFFF578F ^ 0xA84E;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x4518 ^ 0x45BF] = 0x6071 ^ 0x45BF;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xBC3C ^ 0xBC0C] = 0xBC7D ^ 0xBC0C;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x7030 ^ 0x70D2] = 0x3D9F ^ 0x70D2;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xD086 ^ 0xD0F8] = 0xFFFF5FE0 ^ 0xD0F8;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x5530 ^ 0x5508] = 0x5570 ^ 0x5508;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x7625 ^ 0x776C] = 0x777C ^ 0x776C;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1B32 ^ 0x1B33] = 0xFFFFE4BD ^ 0x1B33;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xC156 ^ 0xC125] = 0x1C369 ^ 0xC125;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xF835 ^ 0xF830] = 0xFFFF07C3 ^ 0xF830;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xB52A ^ 0xB599] = 0x9D4E ^ 0xB599;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x11E1 ^ 0x1168] = 0xC73C ^ 0x1168;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x8169 ^ 0x8067] = 0xC27C ^ 0x8067;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xC5CF ^ 0xC4FB] = 0xC4FB ^ 0xC4FB;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x7F06 ^ 0x7FAD] = 0x85F5 ^ 0x7FAD;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xC992 ^ 0xC90C] = 0xE397 ^ 0xC90C;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x742D ^ 0x75A4] = 0x6A73 ^ 0x75A4;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x10347 ^ 0x10399] = 0x1F3C8 ^ 0x10399;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xB915 ^ 0xB826] = 0xB826 ^ 0xB826;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x3CD2 ^ 0x3CEF] = 0xFFFFC34C ^ 0x3CEF;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xDAB5 ^ 0xDAA2] = 0xDAF4 ^ 0xDAA2;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xF804 ^ 0xF8CB] = 0x4F0A ^ 0xF8CB;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x4BF9 ^ 0x4A8D] = 0x81A4 ^ 0x4A8D;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xF948 ^ 0xF9AD] = 0xE130 ^ 0xF9AD;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x7DC5 ^ 0x7D78] = 0xFFFF235A ^ 0x7D78;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x78C5 ^ 0x79CD] = 0xADDA ^ 0x79CD;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xC4C ^ 0xCDD] = 0xD15F ^ 0xCDD;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xA518 ^ 0xA47E] = 0xA47D ^ 0xA47E;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x41D1 ^ 0x40EC] = 0xB764 ^ 0x40EC;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1009F ^ 0x100A8] = 0xFFFEFF38 ^ 0x100A8;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x13C7 ^ 0x1296] = 0x12F5 ^ 0x1296;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x10182 ^ 0x10126] = 0x124EE ^ 0x10126;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x5E9A ^ 0x5FCF] = 0x5FA3 ^ 0x5FCF;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x37CB ^ 0x36BE] = 0xF125 ^ 0x36BE;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xCF16 ^ 0xCF10] = 0xCF5A ^ 0xCF10;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x4A3E ^ 0x4B76] = 0x4B77 ^ 0x4B76;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xCDC4 ^ 0xCCD8] = 0x578F ^ 0xCCD8;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x5B9F ^ 0x5B97] = 0xFFFFA437 ^ 0x5B97;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x6369 ^ 0x62EA] = 0x7202 ^ 0x62EA;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xDA8E ^ 0xDB84] = 0xF93 ^ 0xDB84;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xD45C ^ 0xD47C] = 0x67C ^ 0xD47C;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1F0C ^ 0x1F5A] = 0xFFFFE0DB ^ 0x1F5A;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x16B5 ^ 0x1669] = 0xE638 ^ 0x1669;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x4406 ^ 0x4515] = 0x149EC ^ 0x4515;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xAA4E ^ 0xAACB] = 0x8EBF ^ 0xAACB;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x9CF ^ 0x885] = 0x88C ^ 0x885;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xC339 ^ 0xC232] = 0x802A ^ 0xC232;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xCF2E ^ 0xCF41] = 0xEB18 ^ 0xCF41;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x1FF4 ^ 0x1EA2] = 0x1EA5 ^ 0x1EA2;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xB990 ^ 0xB908] = 0x7707 ^ 0xB908;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xB543 ^ 0xB5DC] = 0x9F13 ^ 0xB5DC;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x9DE4 ^ 0x9D25] = 0xFFFF2FE9 ^ 0x9D25;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x10F2E ^ 0x10F21] = 0x10F2C ^ 0x10F21;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x4E80 ^ 0x4ECC] = 0xFFFFB14D ^ 0x4ECC;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x5F42 ^ 0x5E21] = 0x5E15 ^ 0x5E21;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x156F ^ 0x1448] = 0xE7EA ^ 0x1448;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xAD02 ^ 0xAC4F] = 0xFFFF53CB ^ 0xAC4F;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xD37A ^ 0xD384] = 0x5DA ^ 0xD384;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xB36B ^ 0xB3F2] = 0x7DFF ^ 0xB3F2;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x4FBB ^ 0x4ECB] = 0xC91F ^ 0x4ECB;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x6F6A ^ 0x6F99] = 0xCF56 ^ 0x6F99;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xC2A9 ^ 0xC206] = 0x7DBB ^ 0xC206;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x368F ^ 0x37A1] = 0xDB7C ^ 0x37A1;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xB0B5 ^ 0xB054] = 0xFD6B ^ 0xB054;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x6FD6 ^ 0x6F0C] = 0xDDD5 ^ 0x6F0C;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x7FEC ^ 0x7F1D] = 0xFFFF3934 ^ 0x7F1D;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x690C ^ 0x6865] = 0xFFFF97EC ^ 0x6865;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x31B4 ^ 0x3101] = 0xFFFFE644 ^ 0x3101;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x3D1 ^ 0x311] = 0x4E6D ^ 0x311;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xFB4F ^ 0xFA79] = 0xFA78 ^ 0xFA79;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0xF59E ^ 0xF4CE] = 0xF4CB ^ 0xF4CE;
                renderAvatarPopupGuiScaleSetting.progress._1.C[0x4886 ^ 0x4834] = 0x370F ^ 0x4834;
            }
        }), 0.0f, 1.0f);
        var25_28 = var9_11.getWidth() * var24_27;
        var37_29 = -12;
        var37_29 -= 51;
        v1 = var30_9;
        var39_30 = 126;
        var39_30 += -54;
        var30_9 = v1 ^ ((long)this.avatarPopupGuiScaleSliderHitBounds(var8_10, metrics).contains(mouseX, mouseY) << (var37_29 ^= -31) ^ v1) & -1L << (var39_30 += -40);
        if (MenuScreen.draggingAvatarPopupGuiScale) ** GOTO lbl-1000
        var41_31 = -166;
        var41_31 -= -105;
        if ((int)(var30_9 >>> (var41_31 ^= -29)) != 0) lbl-1000:
        // 2 sources

        {
            v2 = 5.3f;
        } else {
            v2 = 4.7f;
        }
        var27_32 = metrics.scaled(v2);
        var28_33 = RangesKt.coerceIn(var9_11.getX() + var25_28 - var27_32 * 0.5f, var9_11.getX() - var27_32 * 0.5f, var9_11.getX() + var9_11.getWidth() - var27_32 * 0.5f);
        var29_34 = var9_11.getY() + var9_11.getHeight() * 0.5f - var27_32 * 0.5f;
        var43_35 = 22;
        var43_35 += 65;
        Font.INSTANCE.getICON().priority(this.iconsPipeline()).size(var12_15).color(ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), var10_13 * 0.92f)).drawText((String)MenuScreen.a[var43_35 -= 71], var16_19, var17_20);
        var45_36 = -61;
        var45_36 += 114;
        Font.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()).size(var13_16).color(ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), var10_13 * 0.94f)).drawText((String)MenuScreen.a[var45_36 ^= 52], var18_21, var19_22);
        RenderUtils.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(MenuStyle.INSTANCE.value(0.08f * var10_13)).round(metrics.scaled(0.8f)).draw(var9_11.getX(), var9_11.getY(), var9_11.getWidth(), var9_11.getHeight());
        RenderUtils.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(MenuStyle.INSTANCE.title((0.28f + (MenuScreen.draggingAvatarPopupGuiScale != false ? 0.12f : 0.0f)) * var10_13)).round(metrics.scaled(0.8f)).draw(var9_11.getX(), var9_11.getY(), var25_28, var9_11.getHeight());
        v3 = RenderUtils.INSTANCE.getBASIC_RECT().priority(this.rectPipeline());
        if (MenuScreen.draggingAvatarPopupGuiScale) ** GOTO lbl-1000
        var47_37 = 131;
        var47_37 -= 70;
        if ((int)(var30_9 >>> (var47_37 += -29)) != 0) lbl-1000:
        // 2 sources

        {
            v4 = 0.18f;
        } else {
            v4 = 0.0f;
        }
        v3.color(MenuStyle.INSTANCE.title((0.72f + v4) * var10_13)).round(var27_32 / 3.0f).draw(var28_33, var29_34, var27_32, var27_32);
        Font.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()).size(var14_17).color(ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), var10_13 * 0.82f)).drawText(var20_23, var21_24, var22_25);
    }

    /*
     * Unable to fully structure code
     */
    private final void renderAvatarPopupHudScaleSetting(float x, float y, float width, AvatarPopupMetrics metrics, float alpha, int mouseX, int mouseY) {
        var32_8 = 7783317389577004162L;
        var30_9 = 8894175053121080099L;
        var8_10 = new PopupRect(x, y, width, metrics.getSettingHeight());
        var9_11 = this.avatarPopupHudScaleSliderBounds(var8_10, metrics);
        if (MenuScreen.draggingAvatarPopupHudScale) {
            this.updateAvatarPopupHudScalePreview(mouseX, var9_11);
            if (!this.isLeftMousePressed()) {
                var35_12 = 84;
                var35_12 ^= 115;
                MenuScreen.commitAvatarPopupHudScaleDrag$default(this, null, var35_12 += -38, null);
            }
        }
        var10_13 = RangesKt.coerceIn(alpha, 0.0f, 1.0f);
        var11_14 = metrics.scaled(6.0f);
        var12_15 = metrics.scaled(7.8f);
        var13_16 = metrics.scaled(6.7f);
        var14_17 = metrics.scaled(6.2f);
        var15_18 = this.avatarPopupSettingTextYOffset(metrics);
        var16_19 = x + var11_14;
        var17_20 = y + (metrics.getSettingHeight() - Font.INSTANCE.getICON().getHeight(var12_15)) * 0.5f;
        var18_21 = var16_19 + var12_15 + metrics.scaled(4.6f);
        var19_22 = y + (metrics.getSettingHeight() - Font.INSTANCE.getGS_MEDIUM().getHeight(var13_16)) * 0.5f - var15_18;
        var20_23 = this.avatarPopupHudScaleValueText();
        var21_24 = var9_11.getX() + var9_11.getWidth() + metrics.scaled(5.0f);
        var22_25 = y + (metrics.getSettingHeight() - Font.INSTANCE.getGS_MEDIUM().getHeight(var14_17)) * 0.5f - var15_18;
        v0 = MenuScreen.avatarPopupHudScaleDragProgress;
        var23_26 = v0 != null ? v0.floatValue() : ClickGuiSettings.INSTANCE.hudScaleProgress();
        var24_27 = RangesKt.coerceIn(MenuScreen.avatarPopupHudScaleAnimation.animate(var23_26, 120.0f, (Function1<? super Float, Float>)new Function1<Float, Float>((Object)Easings.INSTANCE){
            private static Object[] a;
            private static Object b;
            private static Object[] B;
            private static Object[] A;
            private static Object[] c;
            public static int[] C;
            {
                int n2 = C[0];
                n2 -= C[1];
                n2 += C[2];
                int n3 = C[3];
                n3 ^= C[4];
                n3 ^= C[5];
                int n4 = C[6];
                n4 ^= C[7];
                n4 -= C[8];
                int n5 = C[9];
                n5 ^= C[10];
                int n6 = C[12];
                n6 ^= C[13];
                int n7 = C[15];
                n7 -= C[16];
                super(n2, receiver, Easings.class, (String)a[n3] + (String)a[n4], (String)a[n5 += C[11]] + (String)a[n6 += C[14]], n7 ^= C[17]);
            }

            public final Float invoke(float p0) {
                return Float.valueOf(((Easings)this.receiver).standardDecelerate(p0));
            }

            static {
                renderAvatarPopupHudScaleSetting.progress._1.b();
                long l2 = -9093758285970990628L;
                long l3 = -5323654605410943795L;
                long l4 = 3374899606653928024L;
                long l5 = 1357417089645154033L;
                long l6 = 7630192065631266040L;
                long l7 = 5314623409715601990L;
                long l8 = 1034099929742781427L;
                long l9 = 352041054922121179L;
                long l10 = -1460443317653781851L;
                long l11 = -73035761391160743L;
                long l12 = -5226131394294040377L;
                long l13 = -2974294770910822828L;
                long l14 = -8299274951819221792L;
                long l15 = -7178343896177144860L;
                int n2 = C[18];
                n2 ^= C[19];
                a = new Object[n2 ^= C[20]];
                long l16 = l15;
                int n3 = C[21];
                n3 += C[22];
                l15 = l16 ^ (0L ^ l16) & -1L << (n3 += C[23]);
                Object[] objectArray = new Object[C[24]];
                objectArray[renderAvatarPopupHudScaleSetting.progress._1.C[25]] = A;
                objectArray[renderAvatarPopupHudScaleSetting.progress._1.C[26]] = C[27];
                int n4 = C[28];
                Object object = renderAvatarPopupHudScaleSetting.progress._1.A()[C[29]];
                if (object == null) {
                    char[] cArray = "\u71b3\u718c\u6941\u718b\u7180\u71ab\u6975\u719b\u7197\u6963\u718f\u6943\u719c\u71b3\u7189\u718c\u696a\u697c\u6963\u6976\u7194\u696a\u6969\u697d\u695e\u696d\u71a8\u719a\u697e\u6943\u71b3\u697e\u696c\u6963\u6962\u718b\u6979\u71a8\u71b2\u7197\u697a\u6942\u719f\u696c\u6974\u7181\u6960\u7183\u697c\u71b2\u695d\u719d\u6913\u719c\u6913\u7198\u718c\u7198\u7189\u7197\u695c\u719d\u71b2\u696e\u71b2\u6963\u7195\u6978\u695f\u719d\u71aa\u718e\u71a9\u697c\u696d\u6943\u718f\u6942\u7180\u7196\u695e\u6913\u71aa\u7181\u7195\u719c\u7188\u697a\u719d\u6975\u7198\u6912\u7180\u6941\u7183\u6954\u719c\u696e\u6913\u696c\u71b3\u6961\u697d\u6975\u719c\u6961\u6912\u6966".toCharArray();
                    for (int i2 = C[30]; i2 < C[31]; ++i2) {
                        int n5 = cArray[i2];
                        n5 ^= C[32];
                        n5 -= C[33];
                        n5 ^= C[34];
                        n5 ^= C[35];
                        n5 -= C[36];
                        n5 ^= C[37];
                        n5 += C[38];
                        n5 += C[39];
                        n5 += C[40];
                        n5 += C[41];
                        cArray[i2] = (char)(n5 -= C[42]);
                    }
                    object = renderAvatarPopupHudScaleSetting.progress._1.A()[renderAvatarPopupHudScaleSetting.progress._1.C[43]] = new String(cArray);
                }
                objectArray[n4] = (String)object;
                char[] cArray = ((String)renderAvatarPopupHudScaleSetting.progress._1.a(objectArray)).toCharArray();
                long l17 = l6;
                int n6 = C[44];
                n6 -= C[45];
                l6 = l17 ^ (0x3000000000L ^ l17) & -1L << (n6 ^= C[46]);
                long l18 = l13;
                int n7 = C[47];
                n7 ^= C[48];
                l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += C[49]);
                while (true) {
                    int n8 = C[50];
                    n8 -= C[51];
                    if ((int)l13 >= (int)(l6 >>> (n8 ^= C[52]))) break;
                    int n9 = (int)l13;
                    long l19 = l13;
                    int n10 = C[53];
                    n10 -= C[54];
                    int n11 = C[56];
                    n11 += C[57];
                    l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= C[55])) & -1L >>> (n11 += C[58]);
                    long l20 = l9;
                    int n12 = C[59];
                    n12 += C[60];
                    l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += C[61]);
                    int n13 = (int)l13;
                    long l21 = l13;
                    int n14 = C[62];
                    n14 += C[63];
                    int n15 = C[65];
                    n15 ^= C[66];
                    l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= C[64])) & -1L >>> (n15 -= C[67]);
                    int n16 = C[68];
                    n16 ^= C[69];
                    long l22 = l10;
                    int n17 = C[71];
                    n17 += C[72];
                    l10 = l22 ^ ((long)cArray[n13] << (n16 ^= C[70]) ^ l22) & -1L << (n17 ^= C[73]);
                    int n18 = C[74];
                    n18 += C[75];
                    n18 -= C[76];
                    int n19 = C[77];
                    n19 ^= C[78];
                    long l23 = l12;
                    int n20 = C[80];
                    n20 ^= C[81];
                    l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= C[79]))) ^ l23) & -1L >>> (n20 += C[82]);
                    char[] cArray2 = new char[(int)l12];
                    long l24 = l14;
                    int n21 = C[83];
                    n21 ^= C[84];
                    l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= C[85]);
                    while (true) {
                        int n22 = C[86];
                        n22 += C[87];
                        if ((int)(l14 >>> (n22 -= C[88])) >= (int)l12) break;
                        int n23 = C[89];
                        n23 ^= C[90];
                        int n24 = C[92];
                        n24 += C[93];
                        cArray2[(int)(l14 >>> (n23 -= renderAvatarPopupHudScaleSetting.progress._1.C[91]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= C[94]))];
                        l14 += 0x100000000L;
                    }
                    int n25 = C[95];
                    n25 += C[96];
                    int n26 = (int)(l15 >>> (n25 -= C[97]));
                    l15 += 0x100000000L;
                    renderAvatarPopupHudScaleSetting.progress._1.a[n26] = new String(cArray2);
                    long l25 = l13;
                    int n27 = C[98];
                    n27 ^= C[99];
                    l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += C[100]);
                }
            }

            public static Object a(Object[] object) {
                Object object2;
                int n2 = (Integer)object[C[101]];
                String string = (String)object[C[102]];
                object = object[C[103]];
                Object[] objectArray = B;
                if (B == null) {
                    objectArray = B = new Object[C[104]];
                }
                if ((object2 = objectArray[n2]) == null) {
                    Object object3 = object;
                    if (object == null) {
                        Object[] objectArray2 = new Object[C[105]];
                        A = objectArray2;
                        object3 = objectArray2;
                        byte[] byArray = new byte[C[107] ^ C[108]];
                        byArray[renderAvatarPopupHudScaleSetting.progress._1.C[109] ^ renderAvatarPopupHudScaleSetting.progress._1.C[110]] = C[111] ^ C[112];
                        byArray[renderAvatarPopupHudScaleSetting.progress._1.C[113] ^ renderAvatarPopupHudScaleSetting.progress._1.C[114]] = C[115] ^ C[116];
                        byArray[renderAvatarPopupHudScaleSetting.progress._1.C[117] ^ renderAvatarPopupHudScaleSetting.progress._1.C[118]] = C[119] ^ C[120];
                        byArray[renderAvatarPopupHudScaleSetting.progress._1.C[121] ^ renderAvatarPopupHudScaleSetting.progress._1.C[122]] = C[123] ^ C[124];
                        byArray[renderAvatarPopupHudScaleSetting.progress._1.C[125] ^ renderAvatarPopupHudScaleSetting.progress._1.C[126]] = C[127] ^ C[128];
                        byArray[renderAvatarPopupHudScaleSetting.progress._1.C[129] ^ renderAvatarPopupHudScaleSetting.progress._1.C[130]] = C[131] ^ C[132];
                        byArray[renderAvatarPopupHudScaleSetting.progress._1.C[133] ^ renderAvatarPopupHudScaleSetting.progress._1.C[134]] = C[135] ^ C[136];
                        byArray[renderAvatarPopupHudScaleSetting.progress._1.C[137] ^ renderAvatarPopupHudScaleSetting.progress._1.C[138]] = C[139] ^ C[140];
                        byArray[renderAvatarPopupHudScaleSetting.progress._1.C[141] ^ renderAvatarPopupHudScaleSetting.progress._1.C[142]] = C[143] ^ C[144];
                        byArray[renderAvatarPopupHudScaleSetting.progress._1.C[145] ^ renderAvatarPopupHudScaleSetting.progress._1.C[146]] = C[147] ^ C[148];
                        byArray[renderAvatarPopupHudScaleSetting.progress._1.C[149] ^ renderAvatarPopupHudScaleSetting.progress._1.C[150]] = C[151] ^ C[152];
                        byArray[renderAvatarPopupHudScaleSetting.progress._1.C[153] ^ renderAvatarPopupHudScaleSetting.progress._1.C[154]] = C[155] ^ C[156];
                        byArray[renderAvatarPopupHudScaleSetting.progress._1.C[157] ^ renderAvatarPopupHudScaleSetting.progress._1.C[158]] = C[159] ^ C[160];
                        byArray[renderAvatarPopupHudScaleSetting.progress._1.C[161] ^ renderAvatarPopupHudScaleSetting.progress._1.C[162]] = C[163] ^ C[164];
                        byArray[renderAvatarPopupHudScaleSetting.progress._1.C[165] ^ renderAvatarPopupHudScaleSetting.progress._1.C[166]] = C[167] ^ C[168];
                        byArray[renderAvatarPopupHudScaleSetting.progress._1.C[169] ^ renderAvatarPopupHudScaleSetting.progress._1.C[170]] = C[171] ^ C[172];
                        objectArray2[renderAvatarPopupHudScaleSetting.progress._1.C[106]] = byArray;
                    }
                    byte[] byArray = (byte[])object3[C[173]];
                    if (b == null) {
                        byte[] byArray2 = new byte[C[174] ^ C[175]];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[176] ^ renderAvatarPopupHudScaleSetting.progress._1.C[177]] = C[178] ^ C[179];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[180] ^ renderAvatarPopupHudScaleSetting.progress._1.C[181]] = C[182] ^ C[183];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[184] ^ renderAvatarPopupHudScaleSetting.progress._1.C[185]] = C[186] ^ C[187];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[188] ^ renderAvatarPopupHudScaleSetting.progress._1.C[189]] = C[190] ^ C[191];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[192] ^ renderAvatarPopupHudScaleSetting.progress._1.C[193]] = C[194] ^ C[195];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[196] ^ renderAvatarPopupHudScaleSetting.progress._1.C[197]] = C[198] ^ C[199];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[200] ^ renderAvatarPopupHudScaleSetting.progress._1.C[201]] = C[202] ^ C[203];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[204] ^ renderAvatarPopupHudScaleSetting.progress._1.C[205]] = C[206] ^ C[207];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[208] ^ renderAvatarPopupHudScaleSetting.progress._1.C[209]] = C[210] ^ C[211];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[212] ^ renderAvatarPopupHudScaleSetting.progress._1.C[213]] = C[214] ^ C[215];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[216] ^ renderAvatarPopupHudScaleSetting.progress._1.C[217]] = C[218] ^ C[219];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[220] ^ renderAvatarPopupHudScaleSetting.progress._1.C[221]] = C[222] ^ C[223];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[224] ^ renderAvatarPopupHudScaleSetting.progress._1.C[225]] = C[226] ^ C[227];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[228] ^ renderAvatarPopupHudScaleSetting.progress._1.C[229]] = C[230] ^ C[231];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[232] ^ renderAvatarPopupHudScaleSetting.progress._1.C[233]] = C[234] ^ C[235];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[236] ^ renderAvatarPopupHudScaleSetting.progress._1.C[237]] = C[238] ^ C[239];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[240] ^ renderAvatarPopupHudScaleSetting.progress._1.C[241]] = C[242] ^ C[243];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[244] ^ renderAvatarPopupHudScaleSetting.progress._1.C[245]] = C[246] ^ C[247];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[248] ^ renderAvatarPopupHudScaleSetting.progress._1.C[249]] = C[250] ^ C[251];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[252] ^ renderAvatarPopupHudScaleSetting.progress._1.C[253]] = C[254] ^ C[255];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[256] ^ renderAvatarPopupHudScaleSetting.progress._1.C[257]] = C[258] ^ C[259];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[260] ^ renderAvatarPopupHudScaleSetting.progress._1.C[261]] = C[262] ^ C[263];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[264] ^ renderAvatarPopupHudScaleSetting.progress._1.C[265]] = C[266] ^ C[267];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[268] ^ renderAvatarPopupHudScaleSetting.progress._1.C[269]] = C[270] ^ C[271];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[272] ^ renderAvatarPopupHudScaleSetting.progress._1.C[273]] = C[274] ^ C[275];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[276] ^ renderAvatarPopupHudScaleSetting.progress._1.C[277]] = C[278] ^ C[279];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[280] ^ renderAvatarPopupHudScaleSetting.progress._1.C[281]] = C[282] ^ C[283];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[284] ^ renderAvatarPopupHudScaleSetting.progress._1.C[285]] = C[286] ^ C[287];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[288] ^ renderAvatarPopupHudScaleSetting.progress._1.C[289]] = C[290] ^ C[291];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[292] ^ renderAvatarPopupHudScaleSetting.progress._1.C[293]] = C[294] ^ C[295];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[296] ^ renderAvatarPopupHudScaleSetting.progress._1.C[297]] = C[298] ^ C[299];
                        byArray2[renderAvatarPopupHudScaleSetting.progress._1.C[300] ^ renderAvatarPopupHudScaleSetting.progress._1.C[301]] = C[302] ^ C[303];
                        byte[] byArray3 = new byte[byArray.length + byArray2.length];
                        System.arraycopy(byArray, C[304], byArray3, C[305], byArray.length);
                        System.arraycopy(byArray2, C[306], byArray3, byArray.length, byArray2.length);
                        Object object4 = renderAvatarPopupHudScaleSetting.progress._1.A()[C[307]];
                        if (object4 == null) {
                            char[] cArray = "\u9bc6\u9b58\u9bcf\u9b5a\u9bcc\u9ba8\u9bbb\u9b6d\u9b6a\u9b6e\u9bce\u9b71\u9b75\u9b77\u9bc7\u9bce\u9b55\u9ba5".toCharArray();
                            for (int i2 = C[308]; i2 < C[309]; ++i2) {
                                int n3 = cArray[i2];
                                n3 -= C[310];
                                n3 += C[311];
                                n3 -= C[312];
                                n3 += C[313];
                                n3 -= C[314];
                                n3 ^= C[315];
                                n3 -= C[316];
                                n3 += C[317];
                                n3 += C[318];
                                n3 ^= C[319];
                                n3 ^= C[320];
                                cArray[i2] = (char)(n3 ^= C[321]);
                            }
                            object4 = renderAvatarPopupHudScaleSetting.progress._1.A()[renderAvatarPopupHudScaleSetting.progress._1.C[322]] = new String(cArray);
                        }
                        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                        byte[] byArray4 = new byte[C[323]];
                        byArray4[renderAvatarPopupHudScaleSetting.progress._1.C[324]] = C[325];
                        byArray4[renderAvatarPopupHudScaleSetting.progress._1.C[326]] = C[327];
                        byArray4[renderAvatarPopupHudScaleSetting.progress._1.C[328]] = C[329];
                        byArray4[renderAvatarPopupHudScaleSetting.progress._1.C[330]] = C[331];
                        byArray4[renderAvatarPopupHudScaleSetting.progress._1.C[332]] = C[333];
                        byArray4[renderAvatarPopupHudScaleSetting.progress._1.C[334]] = C[335];
                        byArray4[renderAvatarPopupHudScaleSetting.progress._1.C[336]] = C[337];
                        byArray4[renderAvatarPopupHudScaleSetting.progress._1.C[338]] = C[339];
                        byArray4[renderAvatarPopupHudScaleSetting.progress._1.C[340]] = C[341];
                        byArray4[renderAvatarPopupHudScaleSetting.progress._1.C[342]] = C[343];
                        byArray4[renderAvatarPopupHudScaleSetting.progress._1.C[344]] = C[345];
                        byArray4[renderAvatarPopupHudScaleSetting.progress._1.C[346]] = C[347];
                        byArray4[renderAvatarPopupHudScaleSetting.progress._1.C[348]] = C[349];
                        byArray4[renderAvatarPopupHudScaleSetting.progress._1.C[350]] = C[351];
                        byArray4[renderAvatarPopupHudScaleSetting.progress._1.C[352]] = C[353];
                        byArray4[renderAvatarPopupHudScaleSetting.progress._1.C[354]] = C[355];
                        PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, C[356], C[357]);
                        byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                        Object object5 = renderAvatarPopupHudScaleSetting.progress._1.A()[C[358]];
                        if (object5 == null) {
                            char[] cArray = "\ud3c5\ud3c9\ud3b7".toCharArray();
                            for (int i3 = C[359]; i3 < C[360]; ++i3) {
                                int n4 = cArray[i3];
                                n4 -= C[361];
                                n4 -= C[362];
                                n4 -= C[363];
                                n4 -= C[364];
                                n4 ^= C[365];
                                n4 ^= C[366];
                                n4 += C[367];
                                n4 ^= C[368];
                                n4 -= C[369];
                                n4 -= C[370];
                                n4 -= C[371];
                                n4 += C[372];
                                n4 -= C[373];
                                n4 -= C[374];
                                n4 += C[375];
                                n4 += C[376];
                                cArray[i3] = (char)(n4 += C[377]);
                            }
                            object5 = renderAvatarPopupHudScaleSetting.progress._1.A()[renderAvatarPopupHudScaleSetting.progress._1.C[378]] = new String(cArray);
                        }
                        b = new SecretKeySpec(byArray5, (String)object5);
                    }
                    byte[] byArray6 = Base64.getDecoder().decode(string);
                    byte[] byArray7 = Arrays.copyOfRange(byArray6, C[379], C[380]);
                    byte[] byArray8 = Arrays.copyOfRange(byArray6, C[381], byArray6.length);
                    Object object6 = renderAvatarPopupHudScaleSetting.progress._1.A()[C[382]];
                    if (object6 == null) {
                        char[] cArray = "\ua292\ua2fe\ua2a0\ua204\ua290\ua2ff\ua290\ua204\ua2a1\ua2d8\ua290\ua2a0\ua22e\ua2a1\ua2b2\ua2bd\ua2bd\ua2fa\ua2b3\ua2bc".toCharArray();
                        for (int i4 = C[383]; i4 < C[384]; ++i4) {
                            int n5 = cArray[i4];
                            n5 ^= C[385];
                            n5 ^= C[386];
                            n5 ^= C[387];
                            n5 += C[388];
                            n5 += C[389];
                            n5 += C[390];
                            n5 += C[391];
                            n5 -= C[392];
                            n5 ^= C[393];
                            n5 += C[394];
                            n5 ^= C[395];
                            n5 -= C[396];
                            n5 -= C[397];
                            n5 -= C[398];
                            n5 += C[399];
                            cArray[i4] = (char)(n5 ^= 0x7719);
                        }
                        object6 = renderAvatarPopupHudScaleSetting.progress._1.A()[3] = new String(cArray);
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
                C = new int[0x318D ^ 0x301D];
                renderAvatarPopupHudScaleSetting.progress._1.C[0xA5A8 ^ 0xA4B9] = 0x5F1A ^ 0xA4B9;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x82C3 ^ 0x8278] = 0x3A89 ^ 0x8278;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x56F4 ^ 0x56B7] = 0x569D ^ 0x56B7;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xFC36 ^ 0xFCFF] = 0x5410 ^ 0xFCFF;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x11A9 ^ 0x11EE] = 0x1120 ^ 0x11EE;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1504 ^ 0x1412] = 0xDCA8 ^ 0x1412;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xF905 ^ 0xF977] = 0x7DDC ^ 0xF977;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1FE4 ^ 0x1EA3] = 0xFFFFE114 ^ 0x1EA3;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x5314 ^ 0x53D0] = 0x207 ^ 0x53D0;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x8CA2 ^ 0x8DCC] = 0xED47 ^ 0x8DCC;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1609 ^ 0x1786] = 0x39F1 ^ 0x1786;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x5177 ^ 0x5062] = 0x98C8 ^ 0x5062;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x7C0D ^ 0x7C5A] = 0xFFFF83E1 ^ 0x7C5A;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xEC11 ^ 0xED21] = 0xED21 ^ 0xED21;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x23FB ^ 0x22F9] = 0xFFFF5E25 ^ 0x22F9;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xEC01 ^ 0xED04] = 0x2F2C ^ 0xED04;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x8338 ^ 0x8343] = 0x81E4 ^ 0x8343;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xEF05 ^ 0xEF27] = 0x45A5 ^ 0xEF27;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xD010 ^ 0xD16E] = 0xD16D ^ 0xD16E;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x3ED0 ^ 0x3FDD] = 0x13805 ^ 0x3FDD;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x57B ^ 0x561] = 0x560 ^ 0x561;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x10DA2 ^ 0x10CCF] = 0x1B304 ^ 0x10CCF;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x70C ^ 0x735] = 0xFFFFF8BA ^ 0x735;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x8155 ^ 0x81D2] = 0x7769 ^ 0x81D2;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x683C ^ 0x687E] = 0x6818 ^ 0x687E;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x147C ^ 0x1495] = 0xAFDF ^ 0x1495;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x8C8A ^ 0x8C51] = 0x18C71 ^ 0x8C51;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xB775 ^ 0xB7EF] = 0x6B05 ^ 0xB7EF;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x49E0 ^ 0x490C] = 0xFC91 ^ 0x490C;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x71C3 ^ 0x71EA] = 0x9536 ^ 0x71EA;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x433A ^ 0x425B] = 0x4216 ^ 0x425B;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xCE0A ^ 0xCF48] = 0xCF49 ^ 0xCF48;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x143F ^ 0x146B] = 0xFFFFEBC2 ^ 0x146B;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x30DC ^ 0x30E4] = 0x3036 ^ 0x30E4;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xC1E1 ^ 0xC1A9] = 0xFFFF3E33 ^ 0xC1A9;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xB300 ^ 0xB285] = 0x2923 ^ 0xB285;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xA6F1 ^ 0xA7FD] = 0x1A021 ^ 0xA7FD;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x5529 ^ 0x55C1] = 0xEE9F ^ 0x55C1;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xB679 ^ 0xB628] = 0xB67B ^ 0xB628;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x787F ^ 0x7937] = 0x7933 ^ 0x7937;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x4D57 ^ 0x4D02] = 0x4D29 ^ 0x4D02;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x5616 ^ 0x5743] = 0xFFFFA8BE ^ 0x5743;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x492A ^ 0x484A] = 0x4845 ^ 0x484A;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x5998 ^ 0x59B8] = 0xA288 ^ 0x59B8;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x9E3A ^ 0x9E90] = 0xE33D ^ 0x9E90;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x3DD2 ^ 0x3DE9] = 0xFFFFC256 ^ 0x3DE9;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x9993 ^ 0x98DF] = 0x98DC ^ 0x98DF;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x8F5F ^ 0x8E01] = 0x8E03 ^ 0x8E01;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x9C5C ^ 0x9D64] = 0x7126 ^ 0x9D64;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x3259 ^ 0x32E1] = 0x8A00 ^ 0x32E1;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x9F2C ^ 0x9F8B] = 0xCEE2 ^ 0x9F8B;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x56EA ^ 0x57A9] = 0x57B9 ^ 0x57A9;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x714B ^ 0x719F] = 0x3AE6 ^ 0x719F;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xD827 ^ 0xD87C] = 0xFFFF27AA ^ 0xD87C;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x7188 ^ 0x7128] = 0xB65C ^ 0x7128;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xF54F ^ 0xF447] = 0x722E ^ 0xF447;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xDFAD ^ 0xDEFB] = 0xDEFD ^ 0xDEFB;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x7643 ^ 0x769B] = 0x176B7 ^ 0x769B;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xF962 ^ 0xF92E] = 0xF90E ^ 0xF92E;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x69B0 ^ 0x68DA] = 0xEB72 ^ 0x68DA;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x7F83 ^ 0x7F2E] = 0x7F2E ^ 0x7F2E;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x4950 ^ 0x49A8] = 0xF9C1 ^ 0x49A8;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x3D93 ^ 0x3DE5] = 0xFF75 ^ 0x3DE5;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x18B5 ^ 0x18E7] = 0xFFFFE760 ^ 0x18E7;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x10C1F ^ 0x10C62] = 0x1F35D ^ 0x10C62;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x7A97 ^ 0x7A28] = 0xA516 ^ 0x7A28;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x4C93 ^ 0x4CA6] = 0xFFFFB369 ^ 0x4CA6;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x87D8 ^ 0x87DB] = 0x87CB ^ 0x87DB;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xABDA ^ 0xAB9C] = 0xABD6 ^ 0xAB9C;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x6419 ^ 0x6553] = 0x6552 ^ 0x6553;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x49E2 ^ 0x49B1] = 0xFFFFB613 ^ 0x49B1;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x7BC2 ^ 0x7B74] = 0x87D3 ^ 0x7B74;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x370B ^ 0x37AD] = 0x66D8 ^ 0x37AD;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xA26E ^ 0xA317] = 0x5DAB ^ 0xA317;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x4192 ^ 0x41F4] = 0x41F6 ^ 0x41F4;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x10C0A ^ 0x10CA6] = 0x1710B ^ 0x10CA6;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x4DF4 ^ 0x4DFE] = 0xFFFFB224 ^ 0x4DFE;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x10F3 ^ 0x11D0] = 0xF4AF ^ 0x11D0;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x25D6 ^ 0x2498] = 0x2490 ^ 0x2498;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x108E7 ^ 0x10800] = 0x13935 ^ 0x10800;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x8BBE ^ 0x8A8A] = 0x8A8A ^ 0x8A8A;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x80F3 ^ 0x81C6] = 0x81D4 ^ 0x81C6;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x6E12 ^ 0x6E13] = 0xFFFF9185 ^ 0x6E13;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x8BD4 ^ 0x8A54] = 0x8A40 ^ 0x8A54;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x5C1C ^ 0x5D7B] = 0x5D7B ^ 0x5D7B;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xAEF0 ^ 0xAF96] = 0xAF94 ^ 0xAF96;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xA838 ^ 0xA885] = 0x77BB ^ 0xA885;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x81FF ^ 0x8162] = 0x461D ^ 0x8162;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xCD20 ^ 0xCD7C] = 0xCD31 ^ 0xCD7C;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x5BA9 ^ 0x5AAA] = 0xD9F6 ^ 0x5AAA;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x5196 ^ 0x5115] = 0x15FF ^ 0x5115;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x28F6 ^ 0x28CA] = 0x28BA ^ 0x28CA;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x4FCA ^ 0x4E44] = 0xD192 ^ 0x4E44;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xA174 ^ 0xA1FF] = 0xAF3E ^ 0xA1FF;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x102D5 ^ 0x10227] = 0x13C59 ^ 0x10227;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x5A00 ^ 0x5A93] = 0xFFFF37A1 ^ 0x5A93;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xA317 ^ 0xA3CA] = 0xC25B ^ 0xA3CA;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1A56 ^ 0x1A7A] = 0xFFFFE534 ^ 0x1A7A;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x7708 ^ 0x77C8] = 0xACE4 ^ 0x77C8;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xACC6 ^ 0xAC6D] = 0xFFFF2E60 ^ 0xAC6D;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x8A6D ^ 0x8B17] = 0x8B15 ^ 0x8B17;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x2234 ^ 0x2244] = 0xB772 ^ 0x2244;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xFB8B ^ 0xFB76] = 0x5386 ^ 0xFB76;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x881E ^ 0x8900] = 0xB7CF ^ 0x8900;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x3052 ^ 0x3126] = 0x15DC ^ 0x3126;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x5332 ^ 0x5217] = 0xEDAB ^ 0x5217;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x255D ^ 0x2426] = 0x2426 ^ 0x2426;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x4B2A ^ 0x4A43] = 0x1546 ^ 0x4A43;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x10297 ^ 0x10205] = 0x190D7 ^ 0x10205;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xC925 ^ 0xC923] = 0xFFFF36A4 ^ 0xC923;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xB0DF ^ 0xB003] = 0xD199 ^ 0xB003;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x5AD6 ^ 0x5AE2] = 0x5AB7 ^ 0x5AE2;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x5B0 ^ 0x504] = 0xF9D2 ^ 0x504;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x4BA9 ^ 0x4AA7] = 0x14D6A ^ 0x4AA7;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xEF03 ^ 0xEE34] = 0x8714 ^ 0xEE34;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xB156 ^ 0xB06A] = 0x2E1C ^ 0xB06A;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xC464 ^ 0xC552] = 0xF542 ^ 0xC552;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x3EFA ^ 0x3E6C] = 0x11 ^ 0x3E6C;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x247F ^ 0x2540] = 0x7C7A ^ 0x2540;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xB900 ^ 0xB9B2] = 0x436C ^ 0xB9B2;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xD452 ^ 0xD41F] = 0xFFFF2BF2 ^ 0xD41F;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xF6DA ^ 0xF6B1] = 0x921A ^ 0xF6B1;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x96E3 ^ 0x96FE] = 0x96FE ^ 0x96FE;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x3323 ^ 0x3309] = 0xF4D5 ^ 0x3309;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xB7CE ^ 0xB705] = 0x1FEA ^ 0xB705;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x103EE ^ 0x1031E] = 0x13D63 ^ 0x1031E;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x2D24 ^ 0x2C19] = 0x843E ^ 0x2C19;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x8576 ^ 0x8456] = 0x6129 ^ 0x8456;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xFB50 ^ 0xFA3B] = 0xA4F2 ^ 0xFA3B;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x8D4F ^ 0x8C17] = 0x8C10 ^ 0x8C17;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x2A43 ^ 0x2B50] = 0xD0F3 ^ 0x2B50;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x5627 ^ 0x5757] = 0x91C7 ^ 0x5757;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x7FA0 ^ 0x7F42] = 0xFFFFCFBE ^ 0x7F42;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xFCA9 ^ 0xFCAC] = 0xFFFF035C ^ 0xFCAC;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xD218 ^ 0xD289] = 0x405F ^ 0xD289;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x128B ^ 0x1202] = 0x1CC8 ^ 0x1202;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x9C8D ^ 0x9CF7] = 0x9E67 ^ 0x9CF7;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x5FAE ^ 0x5F07] = 0x22AA ^ 0x5F07;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x9F03 ^ 0x9F82] = 0xDB00 ^ 0x9F82;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x8C04 ^ 0x8C8A] = 0xBD51 ^ 0x8C8A;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x8E9 ^ 0x802] = 0xB348 ^ 0x802;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xF288 ^ 0xF211] = 0x2EFA ^ 0xF211;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x8E8A ^ 0x8FA7] = 0x9D3 ^ 0x8FA7;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xF5EB ^ 0xF586] = 0x60B8 ^ 0xF586;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x80B8 ^ 0x81B3] = 0x7D4 ^ 0x81B3;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x66F3 ^ 0x66A9] = 0xFFFF9915 ^ 0x66A9;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xA6F1 ^ 0xA6C6] = 0xFFFF5944 ^ 0xA6C6;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x10413 ^ 0x104F9] = 0xFFFE4069 ^ 0x104F9;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x10C7C ^ 0x10C8B] = 0x1D8F4 ^ 0x10C8B;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x6806 ^ 0x689E] = 0x56E3 ^ 0x689E;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xC0DA ^ 0xC0AB] = 0x4406 ^ 0xC0AB;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x10077 ^ 0x10132] = 0x10165 ^ 0x10132;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x11B6 ^ 0x1149] = 0xB9B9 ^ 0x1149;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x9785 ^ 0x9756] = 0xB11B ^ 0x9756;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x4FE7 ^ 0x4FF3] = 0xFFFFB047 ^ 0x4FF3;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xDA06 ^ 0xDB5D] = 0xDB62 ^ 0xDB5D;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x4ECA ^ 0x4EF5] = 0xFFFFB16B ^ 0x4EF5;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xB530 ^ 0xB515] = 0x26C1 ^ 0xB515;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xE0E6 ^ 0xE086] = 0xE086 ^ 0xE086;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xB26B ^ 0xB233] = 0xFFFF4DEA ^ 0xB233;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xCAC0 ^ 0xCA0E] = 0x447F ^ 0xCA0E;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x3103 ^ 0x317B] = 0xF3EB ^ 0x317B;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xF3A0 ^ 0xF29A] = 0x94EE ^ 0xF29A;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xDE37 ^ 0xDEF8] = 0x50C8 ^ 0xDEF8;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xDD18 ^ 0xDDE1] = 0x6D96 ^ 0xDDE1;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1660 ^ 0x1641] = 0xDFA0 ^ 0x1641;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xA378 ^ 0xA31F] = 0xA31F ^ 0xA31F;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xE4ED ^ 0xE5C1] = 0x63A2 ^ 0xE5C1;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xBC30 ^ 0xBC89] = 0x478 ^ 0xBC89;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x200F ^ 0x2059] = 0x2067 ^ 0x2059;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x4498 ^ 0x44BC] = 0xF4DF ^ 0x44BC;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x7D9D ^ 0x7CCE] = 0x7CCA ^ 0x7CCE;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x7D6A ^ 0x7D6A] = 0xFFFF8289 ^ 0x7D6A;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xD6E0 ^ 0xD655] = 0x2A9B ^ 0xD655;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x3D9F ^ 0x3D72] = 0x88E8 ^ 0x3D72;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x9738 ^ 0x9733] = 0x976C ^ 0x9733;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xF9FE ^ 0xF98D] = 0xFFFF82BC ^ 0xF98D;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x9489 ^ 0x949F] = 0x948C ^ 0x949F;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x50EE ^ 0x51B3] = 0xFFFFAE10 ^ 0x51B3;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xD4C9 ^ 0xD4AC] = 0xD4AD ^ 0xD4AC;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xFCE1 ^ 0xFDCF] = 0xFFFF8473 ^ 0xFDCF;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1B77 ^ 0x1BE0] = 0x2596 ^ 0x1BE0;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xF4BE ^ 0xF533] = 0xDB66 ^ 0xF533;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x11AC ^ 0x10DF] = 0xE709 ^ 0x10DF;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x5668 ^ 0x5777] = 0x6993 ^ 0x5777;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x2EEA ^ 0x2EC1] = 0x2EC1 ^ 0x2EC1;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x5211 ^ 0x5308] = 0xEBBA ^ 0x5308;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x3B56 ^ 0x3A4B] = 0x4AF ^ 0x3A4B;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x32A7 ^ 0x32B2] = 0xFFFFCD16 ^ 0x32B2;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x56DF ^ 0x5619] = 0xFFFFF87B ^ 0x5619;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x3247 ^ 0x3256] = 0xFFFFCDC0 ^ 0x3256;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x63AF ^ 0x6331] = 0xA445 ^ 0x6331;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x7C59 ^ 0x7C33] = 0x7C33 ^ 0x7C33;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xDDAF ^ 0xDD22] = 0xECFA ^ 0xDD22;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xC4D6 ^ 0xC432] = 0xF50F ^ 0xC432;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xA7C5 ^ 0xA79B] = 0xFFFF584E ^ 0xA79B;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x7B21 ^ 0x7A0B] = 0xFFFF019F ^ 0x7A0B;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1319 ^ 0x1202] = 0xAAB0 ^ 0x1202;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xB3B3 ^ 0xB323] = 0x82F8 ^ 0xB323;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xE0A0 ^ 0xE0A2] = 0xFFFF1F16 ^ 0xE0A2;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x4BF6 ^ 0x4A7F] = 0x2D1 ^ 0x4A7F;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xD9F9 ^ 0xD90D] = 0xD60 ^ 0xD90D;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xD2F2 ^ 0xD235] = 0x83E3 ^ 0xD235;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xEA66 ^ 0xEB62] = 0x2959 ^ 0xEB62;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xFD5C ^ 0xFD4C] = 0xFD6E ^ 0xFD4C;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xB3DE ^ 0xB39B] = 0xFFFF4C30 ^ 0xB39B;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x6147 ^ 0x6024] = 0xFFFF9FB9 ^ 0x6024;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x7352 ^ 0x73AC] = 0xFFFF24C7 ^ 0x73AC;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xE618 ^ 0xE661] = 0xE4FD ^ 0xE661;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x10970 ^ 0x109B1] = 0x1D297 ^ 0x109B1;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xFBCA ^ 0xFB48] = 0xBFC7 ^ 0xFB48;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xD82B ^ 0xD964] = 0xFFFF26E3 ^ 0xD964;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1084F ^ 0x10890] = 0x16901 ^ 0x10890;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1029A ^ 0x10224] = 0xFFFE22CE ^ 0x10224;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x59A2 ^ 0x5936] = 0xCBE4 ^ 0x5936;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xE9CE ^ 0xE9C6] = 0xFFFF1626 ^ 0xE9C6;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xBAB0 ^ 0xBADC] = 0xDE67 ^ 0xBADC;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x2338 ^ 0x220B] = 0x220A ^ 0x220B;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xB3AC ^ 0xB3C4] = 0xB3C5 ^ 0xB3C4;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xE526 ^ 0xE479] = 0xFFFF1BF5 ^ 0xE479;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x7DCF ^ 0x7C82] = 0x7CA7 ^ 0x7C82;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xD8A4 ^ 0xD817] = 0x22E5 ^ 0xD817;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xBDDE ^ 0xBD07] = 0x1BD27 ^ 0xBD07;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x9CC8 ^ 0x9DDC] = 0x5579 ^ 0x9DDC;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xDF18 ^ 0xDE7D] = 0xDF7D ^ 0xDE7D;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xF015 ^ 0xF055] = 0xFFFF0FB7 ^ 0xF055;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xFF0C ^ 0xFF03] = 0xFFFF00BB ^ 0xFF03;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x9B17 ^ 0x9BDD] = 0x337C ^ 0x9BDD;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1007E ^ 0x100AF] = 0x126E2 ^ 0x100AF;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1019D ^ 0x101AB] = 0x101E7 ^ 0x101AB;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x88AB ^ 0x88E0] = 0xFFFF772F ^ 0x88E0;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x576A ^ 0x5796] = 0xFF7A ^ 0x5796;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xFFD8 ^ 0xFF7B] = 0x22D4 ^ 0xFF7B;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xEDA1 ^ 0xEC87] = 0xFFFFACFB ^ 0xEC87;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x58CA ^ 0x58FA] = 0x58FB ^ 0x58FA;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x69C4 ^ 0x6951] = 0x5725 ^ 0x6951;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x4784 ^ 0x479C] = 0x479F ^ 0x479C;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xF251 ^ 0xF2D7] = 0x469 ^ 0xF2D7;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xA820 ^ 0xA8A8] = 0x5E16 ^ 0xA8A8;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1E96 ^ 0x1FCF] = 0x1FF7 ^ 0x1FCF;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xD840 ^ 0xD8B3] = 0xE6C8 ^ 0xD8B3;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xC963 ^ 0xC871] = 0x33EA ^ 0xC871;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xE7A8 ^ 0xE620] = 0x710C ^ 0xE620;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1510 ^ 0x15F1] = 0x5AD9 ^ 0x15F1;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xA98F ^ 0xA9A1] = 0xFFFF5600 ^ 0xA9A1;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x3C46 ^ 0x3C28] = 0xA91E ^ 0x3C28;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x5AB1 ^ 0x5BE3] = 0x5BED ^ 0x5BE3;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xD3D9 ^ 0xD283] = 0xD28E ^ 0xD283;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x794 ^ 0x7C4] = 0x70E ^ 0x7C4;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xCD2A ^ 0xCDFA] = 0xEBB2 ^ 0xCDFA;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x10103 ^ 0x1006F] = 0x176C4 ^ 0x1006F;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1A11 ^ 0x1AFE] = 0xAF64 ^ 0x1AFE;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1E06 ^ 0x1E11] = 0x1E78 ^ 0x1E11;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x109C1 ^ 0x1099C] = 0xFFFEF634 ^ 0x1099C;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x2E26 ^ 0x2F50] = 0x2BCA ^ 0x2F50;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x23A9 ^ 0x2397] = 0x23D2 ^ 0x2397;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x244F ^ 0x2441] = 0xFFFFDBE0 ^ 0x2441;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xF6BC ^ 0xF6D8] = 0xF695 ^ 0xF6D8;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x240C ^ 0x253D] = 0x253D ^ 0x253D;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x2CE3 ^ 0x2D8B] = 0x2D88 ^ 0x2D8B;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x546E ^ 0x5501] = 0x5111 ^ 0x5501;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x20FB ^ 0x21BF] = 0x21B5 ^ 0x21BF;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xDA89 ^ 0xDA26] = 0x5C7C ^ 0xDA26;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x5591 ^ 0x555D] = 0xDB74 ^ 0x555D;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x3FBF ^ 0x3FB3] = 0x3FD8 ^ 0x3FB3;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x6E96 ^ 0x6E73] = 0x5F46 ^ 0x6E73;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x7A3D ^ 0x7AB7] = 0x7478 ^ 0x7AB7;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xC72B ^ 0xC600] = 0x4239 ^ 0xC600;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xB5C2 ^ 0xB586] = 0xFFFF4A47 ^ 0xB586;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xDD9B ^ 0xDD89] = 0xDDAD ^ 0xDD89;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x4A50 ^ 0x4A8A] = 0xFFFEB519 ^ 0x4A8A;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xC73E ^ 0xC60C] = 0xC60C ^ 0xC60C;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x442E ^ 0x4406] = 0x227D ^ 0x4406;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xE80C ^ 0xE916] = 0xFFFFAE2F ^ 0xE916;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xD439 ^ 0xD45A] = 0xFFFF2B9F ^ 0xD45A;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x14EA ^ 0x1444] = 0x923E ^ 0x1444;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x239B ^ 0x23E7] = 0x2177 ^ 0x23E7;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x5362 ^ 0x5240] = 0xFFFF48AD ^ 0x5240;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xA698 ^ 0xA629] = 0x5CDB ^ 0xA629;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x6719 ^ 0x6666] = 0x6666 ^ 0x6666;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x2361 ^ 0x2390] = 0x1DEB ^ 0x2390;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x134A ^ 0x125A] = 0xE9E8 ^ 0x125A;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x8231 ^ 0x8331] = 0x64 ^ 0x8331;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x4380 ^ 0x4324] = 0x9E9A ^ 0x4324;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xB4CD ^ 0xB4AF] = 0xB4B9 ^ 0xB4AF;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x10D57 ^ 0x10D74] = 0x1EB16 ^ 0x10D74;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x3D4 ^ 0x39A] = 0xFFFFFC2D ^ 0x39A;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xC9E4 ^ 0xC89C] = 0x9C60 ^ 0xC89C;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xA8FE ^ 0xA82C] = 0xFFFF71B4 ^ 0xA82C;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x6E7A ^ 0x6F66] = 0x5198 ^ 0x6F66;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xE10C ^ 0xE1BC] = 0x1B4D ^ 0xE1BC;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x40F1 ^ 0x40EE] = 0x4082 ^ 0x40EE;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x2998 ^ 0x281F] = 0xBED4 ^ 0x281F;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xC563 ^ 0xC52A] = 0xC562 ^ 0xC52A;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x95A2 ^ 0x949B] = 0xBD48 ^ 0x949B;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xF63A ^ 0xF76B] = 0xF717 ^ 0xF76B;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xFC98 ^ 0xFC46] = 0x9D9F ^ 0xFC46;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x771C ^ 0x77DF] = 0xACF9 ^ 0x77DF;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xA2DF ^ 0xA3D9] = 0x61A5 ^ 0xA3D9;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xDCD0 ^ 0xDDB4] = 0xDDA6 ^ 0xDDB4;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xE280 ^ 0xE287] = 0xE2E3 ^ 0xE287;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xCB4E ^ 0xCACF] = 0xB5CF ^ 0xCACF;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x36FB ^ 0x36F6] = 0x36FC ^ 0x36F6;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x3D9D ^ 0x3CCA] = 0x3CC8 ^ 0x3CCA;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xEE8 ^ 0xE0B] = 0x4123 ^ 0xE0B;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x4634 ^ 0x47B6] = 0x24F7 ^ 0x47B6;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xD8F3 ^ 0xD8F7] = 0xFFFF2716 ^ 0xD8F7;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x967F ^ 0x96BA] = 0xC76C ^ 0x96BA;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x3E8D ^ 0x3FA5] = 0xBB89 ^ 0x3FA5;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x8F32 ^ 0x8E3D] = 0x189E5 ^ 0x8E3D;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xEA7F ^ 0xEB78] = 0x2950 ^ 0xEB78;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xCDEF ^ 0xCC6B] = 0x23CD ^ 0xCC6B;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xCBF2 ^ 0xCBD4] = 0xE721 ^ 0xCBD4;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x63B6 ^ 0x62FF] = 0x62BA ^ 0x62FF;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x46F1 ^ 0x4686] = 0x8414 ^ 0x4686;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xF0B6 ^ 0xF192] = 0x4E33 ^ 0xF192;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x8C74 ^ 0x8C9A] = 0x395C ^ 0x8C9A;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xDD87 ^ 0xDD22] = 0x8C55 ^ 0xDD22;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x568D ^ 0x57FF] = 0x2BAA ^ 0x57FF;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xE7C9 ^ 0xE7A8] = 0xE7ED ^ 0xE7A8;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x6FA2 ^ 0x6EAB] = 0xE8CC ^ 0x6EAB;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xB770 ^ 0xB64E] = 0xFE27 ^ 0xB64E;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xB9EF ^ 0xB865] = 0xF6D7 ^ 0xB865;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xF9CB ^ 0xF9A4] = 0xFFFF935A ^ 0xF9A4;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x4B9F ^ 0x4ACF] = 0x4AC4 ^ 0x4ACF;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xD4E8 ^ 0xD496] = 0x2BAE ^ 0xD496;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xA273 ^ 0xA241] = 0xA272 ^ 0xA241;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xCD45 ^ 0xCC6C] = 0x4855 ^ 0xCC6C;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1006F ^ 0x100CE] = 0x1DD7F ^ 0x100CE;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xCD19 ^ 0xCD6D] = 0x49C6 ^ 0xCD6D;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xD0D9 ^ 0xD0F6] = 0xFFFF2F00 ^ 0xD0F6;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x62DF ^ 0x6224] = 0xD253 ^ 0x6224;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xC26B ^ 0xC2DC] = 0x3E12 ^ 0xC2DC;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x92A5 ^ 0x920D] = 0xC378 ^ 0x920D;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xDAB7 ^ 0xDA7A] = 0x544A ^ 0xDA7A;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1006C ^ 0x1012A] = 0x10123 ^ 0x1012A;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x539E ^ 0x5364] = 0xFFFF1CCF ^ 0x5364;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x25E ^ 0x30A] = 0x30F ^ 0x30A;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x605C ^ 0x60C0] = 0xBC2A ^ 0x60C0;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1064C ^ 0x10625] = 0x10624 ^ 0x10625;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xAB82 ^ 0xAA0E] = 0xA15B ^ 0xAA0E;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x6C36 ^ 0x6D37] = 0xEE6B ^ 0x6D37;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x4379 ^ 0x4258] = 0xA727 ^ 0x4258;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x3DE2 ^ 0x3DD1] = 0xFFFFC26F ^ 0x3DD1;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xD35 ^ 0xC69] = 0xC69 ^ 0xC69;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1709 ^ 0x1756] = 0x1733 ^ 0x1756;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x6982 ^ 0x6957] = 0x2238 ^ 0x6957;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1E29 ^ 0x1F5C] = 0xBD06 ^ 0x1F5C;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x3212 ^ 0x328D] = 0xFFFF0A01 ^ 0x328D;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x5AEB ^ 0x5AF7] = 0x5AF5 ^ 0x5AF7;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x3325 ^ 0x333C] = 0x333C ^ 0x333C;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x73E2 ^ 0x72F5] = 0xBA5F ^ 0x72F5;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xC84D ^ 0xC931] = 0xC921 ^ 0xC931;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x671 ^ 0x6D3] = 0xDB6D ^ 0x6D3;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xF388 ^ 0xF2F9] = 0x4E08 ^ 0xF2F9;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x88BF ^ 0x8849] = 0xFFFFA3D9 ^ 0x8849;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x7F6E ^ 0x7FE2] = 0x712D ^ 0x7FE2;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x8A95 ^ 0x8BDE] = 0x8BD8 ^ 0x8BDE;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x991C ^ 0x9804] = 0x20A9 ^ 0x9804;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x9067 ^ 0x905D] = 0xFFFF6FE2 ^ 0x905D;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xFA7F ^ 0xFAE4] = 0x2601 ^ 0xFAE4;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x7DE ^ 0x7EF] = 0x7C6 ^ 0x7EF;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x6422 ^ 0x6563] = 0xD8C ^ 0x6563;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x8328 ^ 0x8362] = 0x8303 ^ 0x8362;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xED9F ^ 0xED6A] = 0x3915 ^ 0xED6A;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xAD3D ^ 0xAD7C] = 0xAD50 ^ 0xAD7C;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xEEC6 ^ 0xEEDD] = 0xEEDD ^ 0xEEDD;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xA9FE ^ 0xA9ED] = 0xFFFF5679 ^ 0xA9ED;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xD2C3 ^ 0xD2E4] = 0xD503 ^ 0xD2E4;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xF39A ^ 0xF320] = 0xFFFFB40F ^ 0xF320;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1C47 ^ 0x1CC3] = 0x584C ^ 0x1CC3;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xDD9A ^ 0xDC19] = 0x3FBD ^ 0xDC19;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x152E ^ 0x146E] = 0x9124 ^ 0x146E;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x2555 ^ 0x2582] = 0x6EED ^ 0x2582;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x7B6A ^ 0x7B8A] = 0x34A0 ^ 0x7B8A;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x385F ^ 0x39D4] = 0x7BC0 ^ 0x39D4;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x980F ^ 0x9840] = 0x987A ^ 0x9840;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x6BB2 ^ 0x6AB8] = 0xFFFF1364 ^ 0x6AB8;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x9A7A ^ 0x9A23] = 0x9A69 ^ 0x9A23;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x56E0 ^ 0x5695] = 0x940B ^ 0x5695;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xFDEC ^ 0xFC8E] = 0xFC82 ^ 0xFC8E;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x8239 ^ 0x8285] = 0x5DB6 ^ 0x8285;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x339A ^ 0x3358] = 0xFFFF17C6 ^ 0x3358;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x33D6 ^ 0x33DF] = 0x33A4 ^ 0x33DF;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x1410 ^ 0x142D] = 0xFFFFEBDC ^ 0x142D;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xB8FB ^ 0xB9D4] = 0x3FA0 ^ 0xB9D4;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x259D ^ 0x254B] = 0xFFFF91FE ^ 0x254B;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x7939 ^ 0x7802] = 0xB144 ^ 0x7802;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x7193 ^ 0x71BE] = 0xFFFF8E73 ^ 0x71BE;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xCA22 ^ 0xCBA4] = 0xBAAF ^ 0xCBA4;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x402F ^ 0x4108] = 0xFEB4 ^ 0x4108;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x402A ^ 0x40AA] = 0xBF92 ^ 0x40AA;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x10741 ^ 0x1073E] = 0xFFFE07AE ^ 0x1073E;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x6F27 ^ 0x6FA8] = 0x5E1A ^ 0x6FA8;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x5CA0 ^ 0x5C46] = 0xFFFF92CB ^ 0x5C46;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xA072 ^ 0xA06C] = 0xA06C ^ 0xA06C;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xC70A ^ 0xC67D] = 0x9746 ^ 0xC67D;
                renderAvatarPopupHudScaleSetting.progress._1.C[0x4E27 ^ 0x4EEF] = 0xE61B ^ 0x4EEF;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xB97D ^ 0xB800] = 0xB810 ^ 0xB800;
                renderAvatarPopupHudScaleSetting.progress._1.C[0xBA90 ^ 0xBA15] = 0x4CA1 ^ 0xBA15;
            }
        }), 0.0f, 1.0f);
        var25_28 = var9_11.getWidth() * var24_27;
        var37_29 = 63;
        var37_29 += -111;
        v1 = var30_9;
        var39_30 = 72;
        var39_30 ^= -8;
        var30_9 = v1 ^ ((long)this.avatarPopupHudScaleSliderHitBounds(var8_10, metrics).contains(mouseX, mouseY) << (var37_29 -= -80) ^ v1) & -1L << (var39_30 -= -112);
        if (MenuScreen.draggingAvatarPopupHudScale) ** GOTO lbl-1000
        var41_31 = 91;
        var41_31 -= 37;
        if ((int)(var30_9 >>> (var41_31 += -22)) != 0) lbl-1000:
        // 2 sources

        {
            v2 = 5.3f;
        } else {
            v2 = 4.7f;
        }
        var27_32 = metrics.scaled(v2);
        var28_33 = RangesKt.coerceIn(var9_11.getX() + var25_28 - var27_32 * 0.5f, var9_11.getX() - var27_32 * 0.5f, var9_11.getX() + var9_11.getWidth() - var27_32 * 0.5f);
        var29_34 = var9_11.getY() + var9_11.getHeight() * 0.5f - var27_32 * 0.5f;
        var43_35 = -63;
        var43_35 += 41;
        Font.INSTANCE.getICON().priority(this.iconsPipeline()).size(var12_15).color(ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), var10_13 * 0.92f)).drawText((String)MenuScreen.a[var43_35 ^= -28], var16_19, var17_20);
        var45_36 = -50;
        var45_36 += 36;
        Font.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()).size(var13_16).color(ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), var10_13 * 0.94f)).drawText((String)MenuScreen.a[var45_36 ^= -25], var18_21, var19_22);
        RenderUtils.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(MenuStyle.INSTANCE.value(0.08f * var10_13)).round(metrics.scaled(0.8f)).draw(var9_11.getX(), var9_11.getY(), var9_11.getWidth(), var9_11.getHeight());
        RenderUtils.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(MenuStyle.INSTANCE.title((0.28f + (MenuScreen.draggingAvatarPopupHudScale != false ? 0.12f : 0.0f)) * var10_13)).round(metrics.scaled(0.8f)).draw(var9_11.getX(), var9_11.getY(), var25_28, var9_11.getHeight());
        v3 = RenderUtils.INSTANCE.getBASIC_RECT().priority(this.rectPipeline());
        if (MenuScreen.draggingAvatarPopupHudScale) ** GOTO lbl-1000
        var47_37 = 6;
        var47_37 += 102;
        if ((int)(var30_9 >>> (var47_37 += -76)) != 0) lbl-1000:
        // 2 sources

        {
            v4 = 0.18f;
        } else {
            v4 = 0.0f;
        }
        v3.color(MenuStyle.INSTANCE.title((0.72f + v4) * var10_13)).round(var27_32 / 3.0f).draw(var28_33, var29_34, var27_32, var27_32);
        Font.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()).size(var14_17).color(ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), var10_13 * 0.82f)).drawText(var20_23, var21_24, var22_25);
    }

    private final void renderAvatarPopupGuiBackgroundSetting(float x2, float y, float width2, AvatarPopupMetrics metrics, float alpha2) {
        float f2 = RangesKt.coerceIn(alpha2, 0.0f, 1.0f);
        float f3 = metrics.scaled(6.0f);
        float f4 = metrics.scaled(7.8f);
        float f5 = metrics.scaled(6.7f);
        float f6 = this.avatarPopupSettingTextYOffset(metrics);
        float f7 = x2 + f3;
        float f8 = y + (metrics.getSettingHeight() - Font.INSTANCE.getICON().getHeight(f4)) * 0.5f;
        float f9 = f7 + f4 + metrics.scaled(4.6f);
        float f10 = y + (metrics.getSettingHeight() - Font.INSTANCE.getGS_MEDIUM().getHeight(f5)) * 0.5f - f6;
        float f11 = RangesKt.coerceIn(avatarPopupGuiBackgroundAnimation.animate(ClickGuiSettings.INSTANCE.renderGuiBackground() ? 1.0f : 0.0f, 180.0f, (Function1<? super Float, Float>)new Function1<Float, Float>((Object)Easings.INSTANCE){
            private static Object[] a;
            private static Object b;
            private static Object[] B;
            private static Object[] A;
            private static Object[] c;
            public static int[] C;
            {
                int n2 = C[0];
                n2 -= C[1];
                n2 += C[2];
                int n3 = C[3];
                n3 -= C[4];
                n3 -= C[5];
                int n4 = C[6];
                n4 ^= C[7];
                n4 -= C[8];
                int n5 = C[9];
                n5 += C[10];
                int n6 = C[12];
                n6 -= C[13];
                int n7 = C[15];
                n7 += C[16];
                super(n2, receiver, Easings.class, (String)a[n3] + (String)a[n4], (String)a[n5 ^= C[11]] + (String)a[n6 ^= C[14]], n7 ^= C[17]);
            }

            public final Float invoke(float p0) {
                return Float.valueOf(((Easings)this.receiver).emphasizedDecelerate(p0));
            }

            static {
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.b();
                long l2 = -4713462896378982079L;
                long l3 = -8140906035928266542L;
                long l4 = -7148226046093501292L;
                long l5 = 3005045800997804088L;
                long l6 = -6269862139682719793L;
                long l7 = 8861576716811400262L;
                long l8 = 7820113957217639116L;
                long l9 = -4780103879676817888L;
                long l10 = 126628969265871897L;
                long l11 = -2188654191353704725L;
                long l12 = 6912904591498428651L;
                long l13 = -8588143350031496472L;
                long l14 = -5895820335485323181L;
                long l15 = 4676048145099362757L;
                int n2 = C[18];
                n2 ^= C[19];
                a = new Object[n2 -= C[20]];
                long l16 = l15;
                int n3 = C[21];
                n3 ^= C[22];
                l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= C[23]);
                Object[] objectArray = new Object[C[24]];
                objectArray[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[25]] = A;
                objectArray[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[26]] = C[27];
                int n4 = C[28];
                Object object = renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.A()[C[29]];
                if (object == null) {
                    char[] cArray = "\u733a\u7346\u7342\u730e\u7367\u7369\u731a\u7344\u730e\u7338\u7374\u7360\u7390\u7312\u7365\u7330\u732c\u7307\u7372\u736c\u733a\u7338\u7362\u730c\u7342\u733a\u737d\u7376\u7371\u7314\u7315\u7367\u7318\u7390\u736e\u736f\u7314\u7344\u7307\u7304\u7377\u7361\u7344\u7302\u736f\u737d\u7316\u7306\u734f\u7300\u7309\u7361\u737a\u732c\u732c\u7371\u7317\u7341\u7375\u7338\u7378\u7315\u7363\u7317\u733a\u736e\u730d\u736b\u7304\u7317\u7345\u731d\u7373\u7390\u731a\u7317\u7375\u731a\u736e\u7312\u7317\u7374\u7378\u7330\u7378\u7316\u7338\u7369\u736c\u7330\u736a\u730e\u736e\u730b\u7377\u7316\u7346\u731d\u736b\u730f\u7369\u7361\u7390\u733a\u7330\u736d\u7307\u733e".toCharArray();
                    for (int i2 = C[30]; i2 < C[31]; ++i2) {
                        int n5 = cArray[i2];
                        n5 ^= C[32];
                        n5 ^= C[33];
                        n5 -= C[34];
                        n5 ^= C[35];
                        n5 ^= C[36];
                        n5 -= C[37];
                        n5 -= C[38];
                        n5 ^= C[39];
                        n5 -= C[40];
                        n5 += C[41];
                        cArray[i2] = (char)(n5 ^= C[42]);
                    }
                    object = renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.A()[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[43]] = new String(cArray);
                }
                objectArray[n4] = (String)object;
                char[] cArray = ((String)renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.a(objectArray)).toCharArray();
                long l17 = l6;
                int n6 = C[44];
                n6 -= C[45];
                l6 = l17 ^ (0x3400000000L ^ l17) & -1L << (n6 -= C[46]);
                long l18 = l13;
                int n7 = C[47];
                n7 += C[48];
                l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += C[49]);
                while (true) {
                    int n8 = C[50];
                    n8 += C[51];
                    if ((int)l13 >= (int)(l6 >>> (n8 -= C[52]))) break;
                    int n9 = (int)l13;
                    long l19 = l13;
                    int n10 = C[53];
                    n10 += C[54];
                    int n11 = C[56];
                    n11 ^= C[57];
                    l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= C[55])) & -1L >>> (n11 += C[58]);
                    long l20 = l9;
                    int n12 = C[59];
                    n12 ^= C[60];
                    l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= C[61]);
                    int n13 = (int)l13;
                    long l21 = l13;
                    int n14 = C[62];
                    n14 ^= C[63];
                    int n15 = C[65];
                    n15 ^= C[66];
                    l13 = l21 ^ (l21 ^ l21 + (long)(n14 += C[64])) & -1L >>> (n15 -= C[67]);
                    int n16 = C[68];
                    n16 ^= C[69];
                    long l22 = l10;
                    int n17 = C[71];
                    n17 += C[72];
                    l10 = l22 ^ ((long)cArray[n13] << (n16 += C[70]) ^ l22) & -1L << (n17 -= C[73]);
                    int n18 = C[74];
                    n18 += C[75];
                    n18 ^= C[76];
                    int n19 = C[77];
                    n19 ^= C[78];
                    long l23 = l12;
                    int n20 = C[80];
                    n20 -= C[81];
                    l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= C[79]))) ^ l23) & -1L >>> (n20 -= C[82]);
                    char[] cArray2 = new char[(int)l12];
                    long l24 = l14;
                    int n21 = C[83];
                    n21 += C[84];
                    l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= C[85]);
                    while (true) {
                        int n22 = C[86];
                        n22 -= C[87];
                        if ((int)(l14 >>> (n22 += C[88])) >= (int)l12) break;
                        int n23 = C[89];
                        n23 -= C[90];
                        int n24 = C[92];
                        n24 ^= C[93];
                        cArray2[(int)(l14 >>> (n23 ^= renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[91]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= C[94]))];
                        l14 += 0x100000000L;
                    }
                    int n25 = C[95];
                    n25 += C[96];
                    int n26 = (int)(l15 >>> (n25 ^= C[97]));
                    l15 += 0x100000000L;
                    renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.a[n26] = new String(cArray2);
                    long l25 = l13;
                    int n27 = C[98];
                    n27 ^= C[99];
                    l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= C[100]);
                }
            }

            public static Object a(Object[] object) {
                Object object2;
                int n2 = (Integer)object[C[101]];
                String string = (String)object[C[102]];
                object = object[C[103]];
                Object[] objectArray = B;
                if (B == null) {
                    objectArray = B = new Object[C[104]];
                }
                if ((object2 = objectArray[n2]) == null) {
                    Object object3 = object;
                    if (object == null) {
                        Object[] objectArray2 = new Object[C[105]];
                        A = objectArray2;
                        object3 = objectArray2;
                        byte[] byArray = new byte[C[107] ^ C[108]];
                        byArray[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[109] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[110]] = C[111] ^ C[112];
                        byArray[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[113] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[114]] = C[115] ^ C[116];
                        byArray[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[117] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[118]] = C[119] ^ C[120];
                        byArray[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[121] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[122]] = C[123] ^ C[124];
                        byArray[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[125] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[126]] = C[127] ^ C[128];
                        byArray[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[129] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[130]] = C[131] ^ C[132];
                        byArray[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[133] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[134]] = C[135] ^ C[136];
                        byArray[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[137] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[138]] = C[139] ^ C[140];
                        byArray[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[141] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[142]] = C[143] ^ C[144];
                        byArray[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[145] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[146]] = C[147] ^ C[148];
                        byArray[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[149] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[150]] = C[151] ^ C[152];
                        byArray[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[153] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[154]] = C[155] ^ C[156];
                        byArray[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[157] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[158]] = C[159] ^ C[160];
                        byArray[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[161] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[162]] = C[163] ^ C[164];
                        byArray[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[165] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[166]] = C[167] ^ C[168];
                        byArray[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[169] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[170]] = C[171] ^ C[172];
                        objectArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[106]] = byArray;
                    }
                    byte[] byArray = (byte[])object3[C[173]];
                    if (b == null) {
                        byte[] byArray2 = new byte[C[174] ^ C[175]];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[176] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[177]] = C[178] ^ C[179];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[180] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[181]] = C[182] ^ C[183];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[184] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[185]] = C[186] ^ C[187];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[188] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[189]] = C[190] ^ C[191];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[192] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[193]] = C[194] ^ C[195];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[196] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[197]] = C[198] ^ C[199];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[200] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[201]] = C[202] ^ C[203];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[204] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[205]] = C[206] ^ C[207];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[208] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[209]] = C[210] ^ C[211];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[212] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[213]] = C[214] ^ C[215];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[216] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[217]] = C[218] ^ C[219];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[220] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[221]] = C[222] ^ C[223];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[224] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[225]] = C[226] ^ C[227];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[228] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[229]] = C[230] ^ C[231];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[232] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[233]] = C[234] ^ C[235];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[236] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[237]] = C[238] ^ C[239];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[240] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[241]] = C[242] ^ C[243];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[244] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[245]] = C[246] ^ C[247];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[248] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[249]] = C[250] ^ C[251];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[252] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[253]] = C[254] ^ C[255];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[256] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[257]] = C[258] ^ C[259];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[260] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[261]] = C[262] ^ C[263];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[264] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[265]] = C[266] ^ C[267];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[268] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[269]] = C[270] ^ C[271];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[272] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[273]] = C[274] ^ C[275];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[276] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[277]] = C[278] ^ C[279];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[280] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[281]] = C[282] ^ C[283];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[284] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[285]] = C[286] ^ C[287];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[288] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[289]] = C[290] ^ C[291];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[292] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[293]] = C[294] ^ C[295];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[296] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[297]] = C[298] ^ C[299];
                        byArray2[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[300] ^ renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[301]] = C[302] ^ C[303];
                        byte[] byArray3 = new byte[byArray.length + byArray2.length];
                        System.arraycopy(byArray, C[304], byArray3, C[305], byArray.length);
                        System.arraycopy(byArray2, C[306], byArray3, byArray.length, byArray2.length);
                        Object object4 = renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.A()[C[307]];
                        if (object4 == null) {
                            char[] cArray = "\u5e03\u5e55\u5e66\u5e57\u5e59\u5e65\u5e52\u5e7c\u5fa7\u5e7b\u5e5b\u5e00\u5e74\u5e7e\u5e0e\u5e5b\u5e54\u5e64".toCharArray();
                            for (int i2 = C[308]; i2 < C[309]; ++i2) {
                                int n3 = cArray[i2];
                                n3 ^= C[310];
                                n3 += C[311];
                                n3 ^= C[312];
                                n3 += C[313];
                                n3 += C[314];
                                n3 += C[315];
                                n3 ^= C[316];
                                n3 ^= C[317];
                                n3 ^= C[318];
                                n3 ^= C[319];
                                n3 += C[320];
                                cArray[i2] = (char)(n3 -= C[321]);
                            }
                            object4 = renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.A()[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[322]] = new String(cArray);
                        }
                        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                        byte[] byArray4 = new byte[C[323]];
                        byArray4[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[324]] = C[325];
                        byArray4[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[326]] = C[327];
                        byArray4[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[328]] = C[329];
                        byArray4[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[330]] = C[331];
                        byArray4[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[332]] = C[333];
                        byArray4[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[334]] = C[335];
                        byArray4[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[336]] = C[337];
                        byArray4[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[338]] = C[339];
                        byArray4[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[340]] = C[341];
                        byArray4[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[342]] = C[343];
                        byArray4[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[344]] = C[345];
                        byArray4[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[346]] = C[347];
                        byArray4[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[348]] = C[349];
                        byArray4[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[350]] = C[351];
                        byArray4[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[352]] = C[353];
                        byArray4[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[354]] = C[355];
                        PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, C[356], C[357]);
                        byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                        Object object5 = renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.A()[C[358]];
                        if (object5 == null) {
                            char[] cArray = "\u6e02\u6e7e\u6e90".toCharArray();
                            for (int i3 = C[359]; i3 < C[360]; ++i3) {
                                int n4 = cArray[i3];
                                n4 ^= C[361];
                                n4 += C[362];
                                n4 += C[363];
                                n4 += C[364];
                                n4 ^= C[365];
                                n4 += C[366];
                                n4 -= C[367];
                                n4 += C[368];
                                n4 += C[369];
                                n4 += C[370];
                                n4 -= C[371];
                                n4 -= C[372];
                                n4 ^= C[373];
                                cArray[i3] = (char)(n4 ^= C[374]);
                            }
                            object5 = renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.A()[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[375]] = new String(cArray);
                        }
                        b = new SecretKeySpec(byArray5, (String)object5);
                    }
                    byte[] byArray6 = Base64.getDecoder().decode(string);
                    byte[] byArray7 = Arrays.copyOfRange(byArray6, C[376], C[377]);
                    byte[] byArray8 = Arrays.copyOfRange(byArray6, C[378], byArray6.length);
                    Object object6 = renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.A()[C[379]];
                    if (object6 == null) {
                        char[] cArray = "\ub8a7\ub993\ubae1\ub9b5\ubab1\ubac2\ubab1\ub9b5\ubad0\ubac9\ubab1\ubae1\ub9a3\ubad0\ubac7\uba3c\uba3c\uba3f\uba76\uba3d".toCharArray();
                        for (int i4 = C[380]; i4 < C[381]; ++i4) {
                            int n5 = cArray[i4];
                            n5 -= C[382];
                            n5 ^= C[383];
                            n5 ^= C[384];
                            n5 += C[385];
                            n5 -= C[386];
                            n5 -= C[387];
                            n5 -= C[388];
                            n5 ^= C[389];
                            n5 -= C[390];
                            n5 ^= C[391];
                            n5 -= C[392];
                            n5 += C[393];
                            n5 -= C[394];
                            n5 ^= C[395];
                            n5 -= C[396];
                            cArray[i4] = (char)(n5 += C[397]);
                        }
                        object6 = renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.A()[renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[398]] = new String(cArray);
                    }
                    Cipher cipher = Cipher.getInstance((String)object6);
                    cipher.init(C[399], (Key)((SecretKey)b), new IvParameterSpec(byArray7));
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
                C = new int[0x10658 ^ 0x107C8];
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xF25D ^ 0xF356] = 0xEC3A ^ 0xF356;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x9204 ^ 0x9326] = 0xFFFF97D0 ^ 0x9326;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x10536 ^ 0x10534] = 0x10578 ^ 0x10534;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xA7A1 ^ 0xA7DB] = 0xBBD5 ^ 0xA7DB;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x102F5 ^ 0x1024F] = 0xFFFE032A ^ 0x1024F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x385 ^ 0x3AE] = 0x3AE ^ 0x3AE;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x6615 ^ 0x666D] = 0x6F1E ^ 0x666D;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x10FED ^ 0x10F01] = 0x1A678 ^ 0x10F01;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x6A91 ^ 0x6ABD] = 0xFFFF953B ^ 0x6ABD;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x80D3 ^ 0x80BE] = 0x1986 ^ 0x80BE;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x21FB ^ 0x21AB] = 0x21E3 ^ 0x21AB;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x3CB4 ^ 0x3CA8] = 0x3CAA ^ 0x3CA8;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x91FF ^ 0x917A] = 0x3244 ^ 0x917A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x6C23 ^ 0x6C6D] = 0x6C7D ^ 0x6C6D;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x4647 ^ 0x46C0] = 0xFFFF1A10 ^ 0x46C0;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xFFFC ^ 0xFFBF] = 0xFFE2 ^ 0xFFBF;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x99D2 ^ 0x9966] = 0x269D ^ 0x9966;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x9FFE ^ 0x9F85] = 0xFFFF7C76 ^ 0x9F85;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x3111 ^ 0x31F0] = 0xD251 ^ 0x31F0;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xC992 ^ 0xC8D4] = 0xC8DE ^ 0xC8D4;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xF222 ^ 0xF349] = 0x1EAE ^ 0xF349;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x22EB ^ 0x23B7] = 0x23B1 ^ 0x23B7;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1167 ^ 0x111A] = 0x3AC4 ^ 0x111A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x7BC4 ^ 0x7BD0] = 0xFFFF8463 ^ 0x7BD0;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE01B ^ 0xE004] = 0xE068 ^ 0xE004;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x3DD9 ^ 0x3D74] = 0x3D74 ^ 0x3D74;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x10E4B ^ 0x10ED0] = 0xFFFEC1E7 ^ 0x10ED0;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xDDFD ^ 0xDD15] = 0x43D0 ^ 0xDD15;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE3 ^ 0x17] = 0x2A4B ^ 0x17;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xBFF4 ^ 0xBECA] = 0xD8F4 ^ 0xBECA;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x543C ^ 0x556E] = 0x556C ^ 0x556E;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x16A9 ^ 0x160A] = 0xFFFF8D5A ^ 0x160A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x762C ^ 0x7694] = 0x8843 ^ 0x7694;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x3E52 ^ 0x3F6B] = 0x4AB8 ^ 0x3F6B;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x66D ^ 0x61A] = 0xFFFFF0FB ^ 0x61A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x4521 ^ 0x45AA] = 0x3644 ^ 0x45AA;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xCE0 ^ 0xC82] = 0xCF6 ^ 0xC82;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xFA76 ^ 0xFAD1] = 0xE7EF ^ 0xFAD1;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x38B0 ^ 0x3845] = 0x1210 ^ 0x3845;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE74B ^ 0xE64D] = 0xFFFF28DF ^ 0xE64D;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xBB58 ^ 0xBB9C] = 0x480B ^ 0xBB9C;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1C8D ^ 0x1C33] = 0xFFFF19ED ^ 0x1C33;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x8BBC ^ 0x8B9A] = 0x3ABC ^ 0x8B9A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x4C91 ^ 0x4C39] = 0x5100 ^ 0x4C39;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x4059 ^ 0x410C] = 0xFFFFBE8F ^ 0x410C;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x94D ^ 0x9DC] = 0xE549 ^ 0x9DC;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1072 ^ 0x1136] = 0x113B ^ 0x1136;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x10565 ^ 0x10545] = 0x134A4 ^ 0x10545;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xDF8 ^ 0xDFF] = 0xDAC ^ 0xDFF;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x5111 ^ 0x5177] = 0x5175 ^ 0x5177;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xF247 ^ 0xF2FA] = 0x88D ^ 0xF2FA;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xA8D7 ^ 0xA87B] = 0xD89C ^ 0xA87B;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xCE41 ^ 0xCF73] = 0xCF73 ^ 0xCF73;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xF870 ^ 0xF8BC] = 0x85B8 ^ 0xF8BC;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xFA4E ^ 0xFA8D] = 0x6CAD ^ 0xFA8D;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE232 ^ 0xE34E] = 0xE34E ^ 0xE34E;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE286 ^ 0xE2ED] = 0x5A63 ^ 0xE2ED;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x459A ^ 0x456B] = 0xCB83 ^ 0x456B;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xD09D ^ 0xD0A2] = 0xFFFF2F55 ^ 0xD0A2;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x82EC ^ 0x8265] = 0xF1E0 ^ 0x8265;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x6770 ^ 0x666C] = 0x8B4F ^ 0x666C;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x4003 ^ 0x4091] = 0xAC0F ^ 0x4091;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x909D ^ 0x90A0] = 0xFFFF6F52 ^ 0x90A0;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x186A ^ 0x1843] = 0xD9BB ^ 0x1843;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xF67 ^ 0xE3F] = 0xE38 ^ 0xE3F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE073 ^ 0xE138] = 0xFFFF1EC3 ^ 0xE138;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xD60B ^ 0xD773] = 0xD773 ^ 0xD773;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x55B2 ^ 0x54DD] = 0x600B ^ 0x54DD;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x9410 ^ 0x9501] = 0xEB0D ^ 0x9501;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xC4C2 ^ 0xC5FF] = 0xED5 ^ 0xC5FF;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x752E ^ 0x75C7] = 0xEB04 ^ 0x75C7;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x613F ^ 0x6184] = 0x9F52 ^ 0x6184;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x465D ^ 0x4615] = 0x4615 ^ 0x4615;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1C5C ^ 0x1C18] = 0xFFFFE3AB ^ 0x1C18;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x59E8 ^ 0x59C5] = 0xFFFFA608 ^ 0x59C5;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xC767 ^ 0xC7BE] = 0xD328 ^ 0xC7BE;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x80A2 ^ 0x81C4] = 0x81C6 ^ 0x81C4;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xA03C ^ 0xA139] = 0x9050 ^ 0xA139;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x912B ^ 0x9112] = 0xFFFF6EC6 ^ 0x9112;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xBD3 ^ 0xBBB] = 0xBBA ^ 0xBBB;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xEE66 ^ 0xEE45] = 0x9A7 ^ 0xEE45;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x8AC7 ^ 0x8A54] = 0xFFFF9974 ^ 0x8A54;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xFF3A ^ 0xFE7F] = 0xFFFF01CA ^ 0xFE7F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x7DE ^ 0x720] = 0xFFFEF85B ^ 0x720;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x931F ^ 0x9347] = 0xFFFF6CA5 ^ 0x9347;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xEC4D ^ 0xEC84] = 0x17C7 ^ 0xEC84;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xD58E ^ 0xD497] = 0x9919 ^ 0xD497;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x8E44 ^ 0x8E83] = 0x7D07 ^ 0x8E83;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x80B5 ^ 0x81AB] = 0x6CEA ^ 0x81AB;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xD099 ^ 0xD1BD] = 0xF552 ^ 0xD1BD;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xA4A8 ^ 0xA527] = 0xA525 ^ 0xA527;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x5C94 ^ 0x5DB2] = 0xFFFF8682 ^ 0x5DB2;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xEEE8 ^ 0xEFDE] = 0x911E ^ 0xEFDE;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1014F ^ 0x100C9] = 0x10347 ^ 0x100C9;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1569 ^ 0x151F] = 0x1C6C ^ 0x151F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xB70C ^ 0xB7C2] = 0xFFFF3560 ^ 0xB7C2;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x48A1 ^ 0x48E1] = 0xFFFFB765 ^ 0x48E1;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xDEF5 ^ 0xDE60] = 0x36 ^ 0xDE60;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xB412 ^ 0xB4C0] = 0x375C ^ 0xB4C0;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x107D0 ^ 0x107DA] = 0xFFFEF815 ^ 0x107DA;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x577C ^ 0x5664] = 0x1BE2 ^ 0x5664;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1039F ^ 0x10334] = 0x173B4 ^ 0x10334;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x96C4 ^ 0x97B3] = 0x97B1 ^ 0x97B3;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x8010 ^ 0x817A] = 0xEB3E ^ 0x817A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1D42 ^ 0x1CC2] = 0x1C87 ^ 0x1CC2;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xAFF7 ^ 0xAE7D] = 0xD7AA ^ 0xAE7D;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x6597 ^ 0x64FE] = 0x3D3D ^ 0x64FE;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x771C ^ 0x77AB] = 0xC844 ^ 0x77AB;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xBC9D ^ 0xBC95] = 0xFFFF4300 ^ 0xBC95;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x874F ^ 0x86C8] = 0x5747 ^ 0x86C8;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE9BD ^ 0xE8ED] = 0xE8EE ^ 0xE8ED;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE5AE ^ 0xE4CC] = 0xE4C9 ^ 0xE4CC;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xF871 ^ 0xF8F0] = 0x6798 ^ 0xF8F0;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x9C51 ^ 0x9C7E] = 0x9C2C ^ 0x9C7E;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x87FD ^ 0x8683] = 0x6023 ^ 0x8683;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x10D1B ^ 0x10C08] = 0x17204 ^ 0x10C08;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x6815 ^ 0x695A] = 0x6956 ^ 0x695A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x10D5F ^ 0x10DD2] = 0x173A3 ^ 0x10DD2;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE0E ^ 0xE0E] = 0xFFFFF185 ^ 0xE0E;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x588F ^ 0x5844] = 0xA307 ^ 0x5844;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x10D3C ^ 0x10D0A] = 0xFFFEF292 ^ 0x10D0A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x96E3 ^ 0x96AC] = 0x96BA ^ 0x96AC;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xA422 ^ 0xA460] = 0xFFFF5B8A ^ 0xA460;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xDED3 ^ 0xDE43] = 0xA031 ^ 0xDE43;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x59D2 ^ 0x59C8] = 0x59C9 ^ 0x59C8;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xB723 ^ 0xB735] = 0xFFFF48CE ^ 0xB735;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x58EA ^ 0x58F1] = 0x58F1 ^ 0x58F1;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x35C8 ^ 0x35C3] = 0x35CC ^ 0x35C3;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xDD24 ^ 0xDDBC] = 0x3E4 ^ 0xDDBC;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xD3A9 ^ 0xD35E] = 0xF90B ^ 0xD35E;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1334 ^ 0x1348] = 0xF46 ^ 0x1348;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x9EEA ^ 0x9E4F] = 0x8376 ^ 0x9E4F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xB581 ^ 0xB598] = 0xB598 ^ 0xB598;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xF321 ^ 0xF376] = 0xF316 ^ 0xF376;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x2EA2 ^ 0x2E67] = 0xDDE3 ^ 0x2E67;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[8 ^ 0x101] = 0x1E6D ^ 0x101;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xD652 ^ 0xD663] = 0xFFFF29D3 ^ 0xD663;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x7A6 ^ 0x6E5] = 0x6F5 ^ 0x6E5;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x5C9A ^ 0x5DBD] = 0x7945 ^ 0x5DBD;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x7782 ^ 0x76BE] = 0xE6E7 ^ 0x76BE;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xFD02 ^ 0xFDFE] = 0x1FD1D ^ 0xFDFE;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xD2B3 ^ 0xD392] = 0x28B8 ^ 0xD392;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x6ACA ^ 0x6A93] = 0x6A16 ^ 0x6A93;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1301 ^ 0x1275] = 0xA4E8 ^ 0x1275;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xF36E ^ 0xF327] = 0xF32C ^ 0xF327;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x559C ^ 0x548C] = 0x2A82 ^ 0x548C;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE200 ^ 0xE351] = 0xE329 ^ 0xE351;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xB39F ^ 0xB301] = 0x5E42 ^ 0xB301;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1077B ^ 0x107AD] = 0x163E4 ^ 0x107AD;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x768F ^ 0x76C8] = 0x76E3 ^ 0x76C8;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xFF36 ^ 0xFFEE] = 0xEB73 ^ 0xFFEE;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x25B9 ^ 0x24C4] = 0x24D0 ^ 0x24C4;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x36C9 ^ 0x367A] = 0x3454 ^ 0x367A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE22E ^ 0xE230] = 0xE230 ^ 0xE230;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xA9DE ^ 0xA97A] = 0xCDFB ^ 0xA97A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x5192 ^ 0x5185] = 0x51A9 ^ 0x5185;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x919C ^ 0x90D4] = 0x90D0 ^ 0x90D4;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE86 ^ 0xE61] = 0x9224 ^ 0xE61;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x8980 ^ 0x8881] = 0x5324 ^ 0x8881;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x84FC ^ 0x85B2] = 0x85B9 ^ 0x85B2;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x2CFD ^ 0x2DC8] = 0x2DDA ^ 0x2DC8;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x664E ^ 0x66AE] = 0x850F ^ 0x66AE;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x4458 ^ 0x443F] = 0x443F ^ 0x443F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x9FF1 ^ 0x9EAC] = 0x9EA7 ^ 0x9EAC;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x10C33 ^ 0x10D09] = 0x1DEBA ^ 0x10D09;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x85DC ^ 0x8531] = 0x2C59 ^ 0x8531;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x10D40 ^ 0x10D35] = 0x1044F ^ 0x10D35;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x613F ^ 0x6038] = 0x5151 ^ 0x6038;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x6A8D ^ 0x6AE9] = 0x6ABC ^ 0x6AE9;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xB8EE ^ 0xB804] = 0x2696 ^ 0xB804;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xCB33 ^ 0xCB2B] = 0xCB28 ^ 0xCB2B;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE9A1 ^ 0xE944] = 0x7501 ^ 0xE944;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE60B ^ 0xE678] = 0x47DB ^ 0xE678;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xBE7D ^ 0xBEF3] = 0xC081 ^ 0xBEF3;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x48ED ^ 0x4981] = 0xEE8F ^ 0x4981;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x2437 ^ 0x247C] = 0xFFFFDB94 ^ 0x247C;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x7827 ^ 0x794F] = 0x794C ^ 0x794F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x466A ^ 0x46C4] = 0xDE8A ^ 0x46C4;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xB3EB ^ 0xB2C7] = 0x9CE5 ^ 0xB2C7;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xCDBB ^ 0xCD09] = 0xCF68 ^ 0xCD09;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1395 ^ 0x12F4] = 0x12F5 ^ 0x12F4;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x6BDB ^ 0x6BBB] = 0x6BEB ^ 0x6BBB;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xC760 ^ 0xC7F6] = 0x19AE ^ 0xC7F6;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x2CB1 ^ 0x2C9F] = 0xFFFFD306 ^ 0x2C9F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xDC7 ^ 0xDE0] = 0xD417 ^ 0xDE0;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xF4AE ^ 0xF492] = 0xFFFF0B67 ^ 0xF492;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1125 ^ 0x11C6] = 0xF267 ^ 0x11C6;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x2F64 ^ 0x2E3A] = 0x2E33 ^ 0x2E3A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE570 ^ 0xE42A] = 0xE426 ^ 0xE42A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x5C58 ^ 0x5CDA] = 0xC3BA ^ 0x5CDA;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x10088 ^ 0x101E8] = 0x101E6 ^ 0x101E8;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x4766 ^ 0x47B2] = 0x23C8 ^ 0x47B2;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x87BD ^ 0x87B9] = 0x87BB ^ 0x87B9;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x6A5 ^ 0x62D] = 0xA516 ^ 0x62D;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x91D6 ^ 0x91E4] = 0xFFFF6E9D ^ 0x91E4;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x2DBF ^ 0x2DB6] = 0x2DF6 ^ 0x2DB6;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xF950 ^ 0xF87A] = 0xFFFF2534 ^ 0xF87A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x5B3E ^ 0x5ABD] = 0x8094 ^ 0x5ABD;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x485A ^ 0x492B] = 0x7190 ^ 0x492B;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x5C95 ^ 0x5C2C] = 0xA2FA ^ 0x5C2C;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xF187 ^ 0xF152] = 0x952C ^ 0xF152;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x10415 ^ 0x1041A] = 0x10447 ^ 0x1041A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x869B ^ 0x87DB] = 0x82B5 ^ 0x87DB;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x106CB ^ 0x1067D] = 0xFFFE460C ^ 0x1067D;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xB6B1 ^ 0xB7B5] = 0x86DF ^ 0xB7B5;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x3D4 ^ 0x2DA] = 0xFFFFCF94 ^ 0x2DA;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x5EFA ^ 0x5FD4] = 0xFFFF8E03 ^ 0x5FD4;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xAA7A ^ 0xAA27] = 0xFFFF55BA ^ 0xAA27;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x6309 ^ 0x626A] = 0x6229 ^ 0x626A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x5506 ^ 0x55DC] = 0x4107 ^ 0x55DC;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xA647 ^ 0xA681] = 0xFFFFAA87 ^ 0xA681;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xC71A ^ 0xC75C] = 0xFFFF38A9 ^ 0xC75C;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE4A1 ^ 0xE485] = 0xAC51 ^ 0xE485;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xD99D ^ 0xD9CF] = 0xFFFF267E ^ 0xD9CF;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1197 ^ 0x1157] = 0x876F ^ 0x1157;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x28A9 ^ 0x28FC] = 0xFFFFD726 ^ 0x28FC;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xFF83 ^ 0xFEC1] = 0xFEC0 ^ 0xFEC1;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x5FBD ^ 0x5FF0] = 0x5FD6 ^ 0x5FF0;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x8B06 ^ 0x8B3C] = 0xFFFF748F ^ 0x8B3C;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x41DA ^ 0x4058] = 0xFB5F ^ 0x4058;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x2F59 ^ 0x2FD5] = 0x5C5F ^ 0x2FD5;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xABE1 ^ 0xAB11] = 0x25F6 ^ 0xAB11;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x732C ^ 0x725C] = 0xCECB ^ 0x725C;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1134 ^ 0x11C2] = 0xFFFFC401 ^ 0x11C2;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE35C ^ 0xE3DF] = 0x7CA2 ^ 0xE3DF;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xCF3B ^ 0xCF4F] = 0x6EE4 ^ 0xCF4F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xA7C8 ^ 0xA796] = 0xFFFF5873 ^ 0xA796;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x9F8 ^ 0x91A] = 0xEAEF ^ 0x91A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x5206 ^ 0x52DB] = 0xA2A9 ^ 0x52DB;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xB633 ^ 0xB739] = 0xFFFF57B6 ^ 0xB739;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xF51 ^ 0xE61] = 0xE61 ^ 0xE61;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x3DE8 ^ 0x3CFF] = 0x7515 ^ 0x3CFF;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xBFAA ^ 0xBF9F] = 0xBF81 ^ 0xBF9F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xCCF2 ^ 0xCCEF] = 0xCCEF ^ 0xCCEF;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x7E6C ^ 0x7FE9] = 0xD107 ^ 0x7FE9;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE223 ^ 0xE22F] = 0xE25E ^ 0xE22F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x8E19 ^ 0x8EC9] = 0xD2F ^ 0x8EC9;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE253 ^ 0xE272] = 0xF883 ^ 0xE272;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x7F96 ^ 0x7EBB] = 0x5095 ^ 0x7EBB;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xA4A5 ^ 0xA4DA] = 0xFFFF70F9 ^ 0xA4DA;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x4DA2 ^ 0x4DC8] = 0x4DC8 ^ 0x4DC8;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x2A30 ^ 0x2B5E] = 0x880F ^ 0x2B5E;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x663F ^ 0x66A0] = 0x8B87 ^ 0x66A0;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x227 ^ 0x302] = 0x27FA ^ 0x302;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xB678 ^ 0xB767] = 0x5A56 ^ 0xB767;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x9EC7 ^ 0x9FCB] = 0xAD7A ^ 0x9FCB;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x21AB ^ 0x2145] = 0x8850 ^ 0x2145;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x8F77 ^ 0x8F36] = 0xFFFF70A1 ^ 0x8F36;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1C4E ^ 0x1CFF] = 0x1ED1 ^ 0x1CFF;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE42C ^ 0xE469] = 0xFFFF1BF1 ^ 0xE469;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xB8B1 ^ 0xB9AC] = 0x549D ^ 0xB9AC;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x9478 ^ 0x94A3] = 0x8035 ^ 0x94A3;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x3C82 ^ 0x3D96] = 0x7469 ^ 0x3D96;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x5A2F ^ 0x5AA5] = 0x292F ^ 0x5AA5;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x9D93 ^ 0x9D33] = 0x7070 ^ 0x9D33;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x3BDA ^ 0x3BA8] = 0x9A03 ^ 0x3BA8;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x909C ^ 0x906E] = 0xFFFFE17D ^ 0x906E;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE88E ^ 0xE865] = 0x76A6 ^ 0xE865;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xC3A8 ^ 0xC22C] = 0x6BE7 ^ 0xC22C;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xBB42 ^ 0xBB57] = 0xFFFF44A0 ^ 0xBB57;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x5FFC ^ 0x5F2D] = 0xDCCE ^ 0x5F2D;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xF163 ^ 0xF019] = 0xF009 ^ 0xF019;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xD8B7 ^ 0xD869] = 0xFFFFD7FD ^ 0xD869;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x55B2 ^ 0x55E8] = 0x55BA ^ 0x55E8;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x88EB ^ 0x8857] = 0x723F ^ 0x8857;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xD176 ^ 0xD10F] = 0xCD05 ^ 0xD10F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x83F4 ^ 0x82BD] = 0xFFFF7D47 ^ 0x82BD;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE72D ^ 0xE7A9] = 0x78C9 ^ 0xE7A9;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x10A7A ^ 0x10B4B] = 0x10B4B ^ 0x10B4B;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1312 ^ 0x1300] = 0x135B ^ 0x1300;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xD4B4 ^ 0xD44B] = 0x1D4AF ^ 0xD44B;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xD28C ^ 0xD26A] = 0xFFFFB1A6 ^ 0xD26A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x4F0A ^ 0x4F22] = 0x2BBA ^ 0x4F22;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xF8E4 ^ 0xF81C] = 0xF0B1 ^ 0xF81C;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x63F7 ^ 0x636B] = 0x53E1 ^ 0x636B;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xD43A ^ 0xD55F] = 0xD45F ^ 0xD55F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x10A7D ^ 0x10B75] = 0x11402 ^ 0x10B75;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x65ED ^ 0x65EC] = 0xFFFF9A3A ^ 0x65EC;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE215 ^ 0xE30F] = 0xFFFF5113 ^ 0xE30F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x9675 ^ 0x96CA] = 0x6CBD ^ 0x96CA;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x180E ^ 0x1901] = 0x2BA9 ^ 0x1901;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x5AD9 ^ 0x5BF1] = 0x7918 ^ 0x5BF1;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xD47F ^ 0xD52C] = 0xD554 ^ 0xD52C;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x7335 ^ 0x7317] = 0x7116 ^ 0x7317;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xF168 ^ 0xF03F] = 0xF03F ^ 0xF03F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xA9D9 ^ 0xA88D] = 0xA88D ^ 0xA88D;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xD2A9 ^ 0xD2F8] = 0xD28F ^ 0xD2F8;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x540D ^ 0x5552] = 0x550B ^ 0x5552;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x2244 ^ 0x22EE] = 0x5209 ^ 0x22EE;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xA67D ^ 0xA686] = 0xAE37 ^ 0xA686;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xC518 ^ 0xC438] = 0x3F1F ^ 0xC438;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x15B8 ^ 0x1541] = 0x1DF0 ^ 0x1541;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x7A38 ^ 0x7ADC] = 0xE687 ^ 0x7ADC;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x9EA9 ^ 0x9E54] = 0x19EB0 ^ 0x9E54;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x3982 ^ 0x3984] = 0xFFFFC641 ^ 0x3984;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x72F3 ^ 0x738A] = 0x739A ^ 0x738A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x10291 ^ 0x1027E] = 0x1AB16 ^ 0x1027E;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x105EE ^ 0x1054F] = 0x161C4 ^ 0x1054F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1BE2 ^ 0x1BD2] = 0x1BCC ^ 0x1BD2;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x7C2A ^ 0x7C54] = 0x5787 ^ 0x7C54;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xB3FD ^ 0xB2B1] = 0xB2BE ^ 0xB2B1;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xD73 ^ 0xC58] = 0x2EAB ^ 0xC58;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xCA28 ^ 0xCB4F] = 0xCB4F ^ 0xCB4F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x53AB ^ 0x5324] = 0xFFFFD28E ^ 0x5324;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1931 ^ 0x1934] = 0xFFFFE68C ^ 0x1934;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xFC33 ^ 0xFC7F] = 0xFFFF03A8 ^ 0xFC7F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x8D0D ^ 0x8C0F] = 0xFFFFA811 ^ 0x8C0F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xC544 ^ 0xC535] = 0x6492 ^ 0xC535;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x8ED2 ^ 0x8E18] = 0x7562 ^ 0x8E18;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x20E1 ^ 0x21AB] = 0x21AA ^ 0x21AB;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xC365 ^ 0xC3CA] = 0x5BA4 ^ 0xC3CA;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x40CA ^ 0x41CA] = 0x9A7F ^ 0x41CA;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x495A ^ 0x49DA] = 0x6209 ^ 0x49DA;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x11D5 ^ 0x11F0] = 0x9915 ^ 0x11F0;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xFA98 ^ 0xFA6B] = 0x7483 ^ 0xFA6B;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xC1D ^ 0xD96] = 0xB0AE ^ 0xD96;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x97A0 ^ 0x97CC] = 0x2F52 ^ 0x97CC;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xA7D8 ^ 0xA6AE] = 0x9FD1 ^ 0xA6AE;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x8B6F ^ 0x8A1A] = 0x3347 ^ 0x8A1A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xD80B ^ 0xD83F] = 0xFFFF279C ^ 0xD83F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xA9F1 ^ 0xA9E1] = 0xFFFF5658 ^ 0xA9E1;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x36BB ^ 0x361D] = 0x2B24 ^ 0x361D;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x7F2F ^ 0x7F40] = 0xE645 ^ 0x7F40;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x10FB6 ^ 0x10E8D] = 0x1D838 ^ 0x10E8D;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xF777 ^ 0xF77A] = 0xF729 ^ 0xF77A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x4615 ^ 0x4665] = 0xDF5F ^ 0x4665;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE8F4 ^ 0xE86D] = 0xD8E6 ^ 0xE86D;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x6621 ^ 0x666B] = 0xFFFF99B4 ^ 0x666B;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x9190 ^ 0x90EF] = 0x772E ^ 0x90EF;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xF76C ^ 0xF677] = 0xBBF9 ^ 0xF677;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xCF9D ^ 0xCFFC] = 0xCFE2 ^ 0xCFFC;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x940E ^ 0x953D] = 0x953C ^ 0x953D;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xFBA ^ 0xEF7] = 0xEB6 ^ 0xEF7;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1B8A ^ 0x1B84] = 0x1B98 ^ 0x1B84;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x4757 ^ 0x4645] = 0x3817 ^ 0x4645;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x103E8 ^ 0x103B3] = 0x103A0 ^ 0x103B3;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x4438 ^ 0x45B4] = 0x408 ^ 0x45B4;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x4453 ^ 0x4492] = 0xD2B2 ^ 0x4492;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE27C ^ 0xE2EB] = 0x3CE7 ^ 0xE2EB;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1683 ^ 0x1680] = 0xFFFFE93D ^ 0x1680;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x65B4 ^ 0x64F5] = 0x764A ^ 0x64F5;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x9D51 ^ 0x9D9E] = 0xE08C ^ 0x9D9E;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE374 ^ 0xE328] = 0xE370 ^ 0xE328;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x59AF ^ 0x589B] = 0x589B ^ 0x589B;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x482C ^ 0x48AA] = 0xEB91 ^ 0x48AA;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xBECD ^ 0xBE64] = 0xCE85 ^ 0xBE64;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xF04C ^ 0xF16F] = 0xA45 ^ 0xF16F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x158A ^ 0x159B] = 0x158D ^ 0x159B;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x5253 ^ 0x52C7] = 0xBE59 ^ 0x52C7;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xA860 ^ 0xA836] = 0xA8A8 ^ 0xA836;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xEE69 ^ 0xEE07] = 0x773D ^ 0xEE07;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xAF3D ^ 0xAF0E] = 0xAF44 ^ 0xAF0E;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xBE0C ^ 0xBED3] = 0x4EA1 ^ 0xBED3;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x61D5 ^ 0x60C3] = 0x2938 ^ 0x60C3;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xEC04 ^ 0xED5D] = 0xFFFF12FD ^ 0xED5D;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x9F05 ^ 0x9F5A] = 0xFFFF60B4 ^ 0x9F5A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x74C6 ^ 0x74EC] = 0xB096 ^ 0x74EC;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xC687 ^ 0xC70F] = 0xF13C ^ 0xC70F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x3C01 ^ 0x3C3A] = 0xFFFFC3DD ^ 0x3C3A;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x8749 ^ 0x867E] = 0x950F ^ 0x867E;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xC778 ^ 0xC72B] = 0xFFFF38C3 ^ 0xC72B;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xE2C2 ^ 0xE2FC] = 0xFFFF1D76 ^ 0xE2FC;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xFB86 ^ 0xFB33] = 0x44DC ^ 0xFB33;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xC987 ^ 0xC9EE] = 0xC9EF ^ 0xC9EE;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x10599 ^ 0x1054E] = 0x16130 ^ 0x1054E;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x9DD0 ^ 0x9D03] = 0x1EE0 ^ 0x9D03;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x79D ^ 0x6DA] = 0x693 ^ 0x6DA;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x35A4 ^ 0x353E] = 0x5B4 ^ 0x353E;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x14B9 ^ 0x1534] = 0xB7AB ^ 0x1534;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xB084 ^ 0xB1FF] = 0xB1FC ^ 0xB1FF;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xFF3A ^ 0xFE05] = 0xD3B ^ 0xFE05;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xC5E8 ^ 0xC5BC] = 0xC5AE ^ 0xC5BC;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x4AAC ^ 0x4B2D] = 0x1C4B ^ 0x4B2D;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x876B ^ 0x87C9] = 0xE348 ^ 0x87C9;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x73B6 ^ 0x72B5] = 0xA910 ^ 0x72B5;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x5CD7 ^ 0x5C1F] = 0xA756 ^ 0x5C1F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x10FD1 ^ 0x10E5F] = 0x10E5C ^ 0x10E5F;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xC023 ^ 0xC0FF] = 0x3083 ^ 0xC0FF;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xDB34 ^ 0xDBF9] = 0xA6EB ^ 0xDBF9;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xEDA2 ^ 0xECCF] = 0x781 ^ 0xECCF;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xFD19 ^ 0xFD84] = 0x10C0 ^ 0xFD84;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x45A1 ^ 0x44AC] = 0x7604 ^ 0x44AC;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x77FA ^ 0x769E] = 0x769B ^ 0x769E;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x109B5 ^ 0x1089C] = 0x12A6F ^ 0x1089C;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x27B3 ^ 0x26C1] = 0x113D ^ 0x26C1;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x470C ^ 0x47BC] = 0x458F ^ 0x47BC;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1C0A ^ 0x1C32] = 0xFFFFE38B ^ 0x1C32;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x58BF ^ 0x5936] = 0x9A45 ^ 0x5936;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x7A63 ^ 0x7A70] = 0xFFFF859C ^ 0x7A70;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x2EC1 ^ 0x2FEE] = 0x1C0 ^ 0x2FEE;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xED9D ^ 0xEC88] = 0xA562 ^ 0xEC88;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x3DA3 ^ 0x3CF5] = 0x3CFD ^ 0x3CF5;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x3597 ^ 0x35F4] = 0x35F5 ^ 0x35F4;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x1B30 ^ 0x1BCA] = 0x130F ^ 0x1BCA;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x430E ^ 0x43CC] = 0xD5D3 ^ 0x43CC;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x7242 ^ 0x7319] = 0x7371 ^ 0x7319;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x382D ^ 0x3915] = 0xAEB6 ^ 0x3915;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0xA3C4 ^ 0xA3A1] = 0xA3A0 ^ 0xA3A1;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x286 ^ 0x3F5] = 0x4188 ^ 0x3F5;
                renderAvatarPopupGuiBackgroundSetting.enabledProgress._1.C[0x5A5F ^ 0x5A68] = 0xFFFFA5DD ^ 0x5A68;
            }
        }), 0.0f, 1.0f);
        int n2 = 88;
        n2 += -68;
        Font.INSTANCE.getICON().priority(this.iconsPipeline()).size(f4).color(ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), f2 * 0.92f)).drawText((String)a[n2 ^= 0x19], f7, f8);
        int n3 = -104;
        n3 ^= 0x71;
        Font.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()).size(f5).color(ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), f2 * 0.94f)).drawText((String)a[n3 -= -32], f9, f10);
        float f12 = metrics.scaled(15.0f);
        BooleanToggleRenderer.INSTANCE.render(x2, y + (metrics.getSettingHeight() - f12) * 0.5f, width2, f12, metrics.scaled(5.0f), f11, f2, 1.0f, this.rectPipeline());
    }

    private final void renderAvatarPopupInfoSetting(float x2, float y, float width2, AvatarPopupMetrics metrics, float alpha2) {
        float f2 = RangesKt.coerceIn(alpha2, 0.0f, 1.0f);
        float f3 = metrics.scaled(6.0f);
        float f4 = metrics.scaled(7.8f);
        float f5 = metrics.scaled(6.7f);
        float f6 = metrics.scaled(6.2f);
        float f7 = metrics.scaled(6.2f);
        float f8 = this.avatarPopupSettingTextYOffset(metrics);
        float f9 = x2 + f3;
        float f10 = y + (metrics.getSettingHeight() - Font.INSTANCE.getICON().getHeight(f4)) * 0.5f;
        float f11 = f9 + f4 + metrics.scaled(4.6f);
        float f12 = y + (metrics.getSettingHeight() - Font.INSTANCE.getGS_MEDIUM().getHeight(f5)) * 0.5f - f8;
        int n2 = -127;
        n2 ^= 0x21;
        int n3 = -12;
        n3 -= 107;
        float f13 = E.getWidth$default(Font.INSTANCE.getGS_MEDIUM(), (String)a[n2 ^= 0xFFFFFFB6], f6, 0.0f, n3 += 123, null);
        float f14 = metrics.scaled(3.0f);
        int n4 = -7;
        n4 ^= 0x51;
        int n5 = -65;
        n5 += 8;
        float f15 = E.getWidth$default(Font.INSTANCE.getICON(), (String)a[n4 -= -118], f7, 0.0f, n5 -= -61, null);
        float f16 = f13 + f14 + f15;
        float f17 = x2 + width2 - f3 - f16;
        float f18 = y + (metrics.getSettingHeight() - Font.INSTANCE.getGS_MEDIUM().getHeight(f6)) * 0.5f - f8;
        float f19 = y + (metrics.getSettingHeight() - Font.INSTANCE.getICON().getHeight(f7)) * 0.5f;
        int n6 = 23;
        n6 -= -103;
        Font.INSTANCE.getICON().priority(this.iconsPipeline()).size(f4).color(ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), f2 * 0.92f)).drawText((String)a[n6 -= 92], f9, f10);
        int n7 = 126;
        n7 ^= 0xFFFFFFDC;
        Font.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()).size(f5).color(ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), f2 * 0.94f)).drawText((String)a[n7 += 104], f11, f12);
        int n8 = -220;
        n8 ^= 0xFFFFFFB6;
        Font.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()).size(f6).color(ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), f2 * 0.82f)).drawText((String)a[n8 -= 122], f17, f18);
        int n9 = 123;
        n9 -= -19;
        Font.INSTANCE.getICON().priority(this.iconsPipeline()).size(f7).color(ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), f2 * 0.72f)).drawText((String)a[n9 += -109], f17 + f13 + f14, f19);
    }

    private final void renderAvatarPopupRows(float x2, float endX, float startY, AvatarPopupMetrics metrics, float alpha2) {
        List<AvatarPopupRow> list = this.avatarPopupRows();
        float f2 = metrics.rowLeadingSize();
        float f3 = metrics.rowLeadingGap();
        float f4 = metrics.scaled(1.0f);
        float f5 = metrics.scaled(3.0f);
        float f6 = metrics.scaled(3.0f);
        float f7 = metrics.scaled(1.0f);
        float f8 = startY;
        for (AvatarPopupRow avatarPopupRow : list) {
            float f9 = f8 + (metrics.getRowHeight() - metrics.getRowTextSize()) / 2.0f;
            float f10 = RangesKt.coerceIn(alpha2, 0.0f, 1.0f);
            int n2 = -118;
            n2 += 7;
            float f11 = E.getWidth$default(Font.INSTANCE.getICON(), avatarPopupRow.getIcon(), f2, 0.0f, n2 ^= 0xFFFFFF95, null);
            float f12 = x2 + f11 + f3;
            float f13 = f8 + f4 + (metrics.getRowHeight() - f2) / 2.0f;
            Font.INSTANCE.getICON().priority(this.iconsPipeline()).size(f2).color(ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), f10)).drawText(avatarPopupRow.getIcon(), x2, f13);
            this.renderAvatarPopupDivider(x2 + f11 + (f3 - metrics.scaled(0.5f) - metrics.rowDividerWidth()) / 2.0f, f8 + f4, metrics.getRowHeight(), metrics, f10);
            Font.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()).size(metrics.getRowTextSize()).color(ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), f10)).drawText(avatarPopupRow.getText(), f12, f9);
            int n3 = 118;
            n3 -= -2;
            float f14 = E.getWidth$default(Font.INSTANCE.getGS_MEDIUM(), avatarPopupRow.getValue(), metrics.getRowTextSize(), 0.0f, n3 += -116, null);
            float f15 = RangesKt.coerceAtLeast(f14 + f5 * 2.0f, f14 + f5 * 2.5f);
            float f16 = metrics.getRowTextSize() + f5 * 2.0f;
            float f17 = endX - f14 - f5 * 2.0f;
            float f18 = f9 - f5 / 1.5f;
            RenderUtils.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).drawWithBorder(f17, f18, f15, f16, f6, ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getHEADER_COLOR(), f10 * 0.2f), 0.9f, f7, ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getHEADER_COLOR(), f10 * 0.1f));
            Font.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()).size(metrics.getRowTextSize()).color(ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), f10)).drawText(avatarPopupRow.getValue(), f17 + f15 / 2.0f - f14 / 2.0f, f9);
            f8 += metrics.getRowHeight();
        }
    }

    private final void renderAvatarPopupDivider(float x2, float rowY, float rowHeight, AvatarPopupMetrics metrics, float alpha2) {
        float f2 = rowHeight / 2.5f;
        BlurredRectRenderer blurredRectRenderer = RenderUtils.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline());
        Color color = Color.WHITE;
        int n2 = 68;
        n2 -= 32;
        Intrinsics.checkNotNullExpressionValue(color, (String)a[n2 += -29]);
        blurredRectRenderer.color(ColorUtil.INSTANCE.setAlpha(color, 0.39f * alpha2)).mix(0.9f).round(0.0f).draw(x2, rowY + rowHeight / 2.0f - f2 / 2.0f, metrics.rowDividerWidth(), f2);
    }

    private final boolean tryStartAvatarPopupGuiScaleDrag(PopupRect popupBounds, AvatarPopupMetrics metrics, float mouseX, float mouseY) {
        int n2 = 24;
        n2 -= 0;
        PopupRect popupRect = this.avatarPopupSettingBounds(popupBounds, metrics, n2 += -24);
        if (!this.avatarPopupGuiScaleSliderHitBounds(popupRect, metrics).contains(mouseX, mouseY)) {
            int n3 = 43;
            n3 = n3 - 75;
            boolean bl2 = n3 - -32;
            return bl2;
        }
        int n4 = -124;
        n4 += 50;
        draggingAvatarPopupGuiScale = n4 += 75;
        this.updateAvatarPopupGuiScalePreview(mouseX, this.avatarPopupGuiScaleSliderBounds(popupRect, metrics));
        int n6 = -61;
        n6 = n6 ^ 0xFFFFFFD3;
        boolean bl = n6 - 15;
        return bl;
    }

    private final void updateAvatarPopupGuiScalePreview(float mouseX, PopupRect sliderBounds) {
        if (sliderBounds.getWidth() <= 0.0f) {
            return;
        }
        avatarPopupGuiScaleDragProgress = Float.valueOf(this.avatarPopupGuiScaleProgress(mouseX, sliderBounds));
    }

    private final void commitAvatarPopupGuiScaleDrag(Float mouseX) {
        int n2;
        float f2;
        long l2 = 1108468224305720876L;
        long l3 = -6383289325386939016L;
        if (mouseX != null && avatarPopupOpen) {
            int n3 = -74;
            n3 -= -2;
            f2 = MenuScreen.currentScale$default(this, 0.0f, n3 ^= 0xFFFFFFB9, null);
            Category category = categoryTransition.getCurrent();
            SelectCategoryComponent selectCategoryComponent = CollectionsKt.firstOrNull(components);
            float f3 = selectCategoryComponent != null ? selectCategoryComponent.getPadding() : uiPadding;
            int n4 = -182;
            n4 += 114;
            long l4 = l3;
            int n5 = -63;
            n5 ^= 0xFFFFFFFA;
            long l5 = l3 = l4 ^ ((long)this.isConfigCategory(category) << (n4 += 100) ^ l4) & -1L << (n5 += -27);
            int n6 = 105;
            n6 ^= 0x68;
            l3 = l5 ^ ((long)this.isPointsCategory(category) ^ l5) & -1L >>> (n6 += 31);
            int n7 = -14;
            n7 -= -117;
            MenuLayout menuLayout = new MenuLayout(this.getX(), this.getY(), this.getWidth(), this.getHeight(), this.getPanelWidth(), uiPadding, topBarHeight, f3, components.size(), (boolean)(l3 >>> (n7 -= 71)), (boolean)l3);
            AvatarPopupMetrics avatarPopupMetrics = this.avatarPopupMetrics(f2);
            PopupRect popupRect = this.avatarPopupBounds(menuLayout, f2, avatarPopupMetrics);
            int n8 = 128;
            n8 -= 5;
            PopupRect popupRect2 = this.avatarPopupSettingBounds(popupRect, avatarPopupMetrics, n8 -= 123);
            this.updateAvatarPopupGuiScalePreview(mouseX.floatValue(), this.avatarPopupGuiScaleSliderBounds(popupRect2, avatarPopupMetrics));
        }
        Float f4 = avatarPopupGuiScaleDragProgress;
        f2 = f4 != null ? f4.floatValue() : ClickGuiSettings.INSTANCE.scaleProgress();
        float f5 = ClickGuiSettings.INSTANCE.scalePercent();
        ClickGuiSettings.INSTANCE.setScaleProgress(f2);
        if (ClickGuiSettings.INSTANCE.scalePercent() == f5) {
            int n9 = 37;
            n9 -= 16;
            n2 = n9 ^= 0x14;
        } else {
            int n10 = -172;
            n10 -= -118;
            n2 = n10 -= -54;
        }
        if (n2 == 0) {
            kotakbaz.rain.client.extensions.b.getMc().getSoundManager().play((SoundInstance)PositionedSoundInstance.master((SoundEvent)RainSoundEvents.INSTANCE.getSLIDER(), (float)1.0f, (float)1.0f));
        }
        int n11 = 55;
        n11 ^= 0x52;
        draggingAvatarPopupGuiScale = n11 -= 101;
        avatarPopupGuiScaleDragProgress = null;
    }

    static /* synthetic */ void commitAvatarPopupGuiScaleDrag$default(MenuScreen menuScreen, Float f2, int n2, Object object) {
        int n3 = -57;
        n3 += 68;
        if ((n2 & (n3 -= 10)) != 0) {
            f2 = null;
        }
        menuScreen.commitAvatarPopupGuiScaleDrag(f2);
    }

    private final float avatarPopupGuiScaleProgress(float mouseX, PopupRect sliderBounds) {
        if (sliderBounds.getWidth() <= 0.0f) {
            return ClickGuiSettings.INSTANCE.scaleProgress();
        }
        return RangesKt.coerceIn((mouseX - sliderBounds.getX()) / sliderBounds.getWidth(), 0.0f, 1.0f);
    }

    private final PopupRect avatarPopupSettingBounds(PopupRect bounds, AvatarPopupMetrics metrics, int index) {
        float f2 = this.avatarPopupContentInset(metrics);
        float f3 = bounds.getY() + metrics.getHeaderHeight() + metrics.getMargin() * 0.75f;
        return new PopupRect(bounds.getX() + f2, f3 + (float)index * (metrics.getSettingHeight() + metrics.getSettingGap()), metrics.getWidth() - f2 * 2.0f, metrics.getSettingHeight());
    }

    private final PopupRect avatarPopupGuiScaleSliderBounds(PopupRect cardBounds, AvatarPopupMetrics metrics) {
        float f2 = metrics.scaled(6.0f);
        float f3 = metrics.scaled(6.2f);
        int n2 = 61;
        n2 -= 80;
        int n3 = 87;
        n3 -= -40;
        float f4 = E.getWidth$default(Font.INSTANCE.getGS_MEDIUM(), (String)a[n2 ^= 0xFFFFFFE8], f3, 0.0f, n3 ^= 0x7B, null);
        float f5 = metrics.scaled(4.0f);
        float f6 = metrics.scaled(30.0f);
        float f7 = metrics.scaled(2.7f);
        float f8 = cardBounds.getX() + cardBounds.getWidth() - f2 - f4 - f5 - f6;
        float f9 = cardBounds.getY() + (cardBounds.getHeight() - f7) * 0.5f;
        return new PopupRect(f8, f9, RangesKt.coerceAtLeast(f6, 0.0f), f7);
    }

    private final PopupRect avatarPopupGuiScaleSliderHitBounds(PopupRect cardBounds, AvatarPopupMetrics metrics) {
        PopupRect popupRect = this.avatarPopupGuiScaleSliderBounds(cardBounds, metrics);
        float f2 = metrics.scaled(5.0f);
        return new PopupRect(popupRect.getX() - f2, popupRect.getY() - f2, popupRect.getWidth() + f2 * 2.0f, popupRect.getHeight() + f2 * 2.0f);
    }

    private final String avatarPopupGuiScaleValueText() {
        long l2 = -439193768768013869L;
        Float f2 = avatarPopupGuiScaleDragProgress;
        float f3 = f2 != null ? ClickGuiSettings.INSTANCE.scalePercentForProgress(f2.floatValue()) : ClickGuiSettings.INSTANCE.scalePercent();
        int n2 = -110;
        n2 ^= 0xFFFFFF86;
        long l3 = l2;
        int n3 = 113;
        n3 ^= 0xFFFFFFBD;
        l2 = l3 ^ ((long)MathKt.roundToInt(f3) << (n2 -= -12) ^ l3) & -1L << (n3 ^= 0xFFFFFFEC);
        int n4 = 61;
        n4 += -119;
        int n5 = -118;
        n5 += 25;
        return (int)(l2 >>> (n4 += 90)) + (String)a[n5 += 110];
    }

    private final boolean tryStartAvatarPopupHudScaleDrag(PopupRect popupBounds, AvatarPopupMetrics metrics, float mouseX, float mouseY) {
        int n2 = 83;
        n2 ^= 0x60;
        PopupRect popupRect = this.avatarPopupSettingBounds(popupBounds, metrics, n2 ^= 0x32);
        if (!this.avatarPopupHudScaleSliderHitBounds(popupRect, metrics).contains(mouseX, mouseY)) {
            int n3 = -22;
            n3 = n3 + -4;
            boolean bl2 = n3 - -26;
            return bl2;
        }
        int n4 = 72;
        n4 ^= 0x35;
        draggingAvatarPopupHudScale = n4 -= 124;
        this.updateAvatarPopupHudScalePreview(mouseX, this.avatarPopupHudScaleSliderBounds(popupRect, metrics));
        int n6 = -82;
        n6 = n6 + 38;
        boolean bl = n6 + 45;
        return bl;
    }

    private final void updateAvatarPopupHudScalePreview(float mouseX, PopupRect sliderBounds) {
        int n2;
        if (sliderBounds.getWidth() <= 0.0f) {
            return;
        }
        float f2 = this.avatarPopupHudScaleProgress(mouseX, sliderBounds);
        float f3 = ClickGuiSettings.INSTANCE.hudScalePercent();
        avatarPopupHudScaleDragProgress = Float.valueOf(f2);
        ClickGuiSettings.INSTANCE.setHudScaleProgress(f2);
        if (ClickGuiSettings.INSTANCE.hudScalePercent() == f3) {
            int n3 = 39;
            n3 += -114;
            n2 = n3 ^= 0xFFFFFFB4;
        } else {
            int n4 = 24;
            n4 += -113;
            n2 = n4 -= -89;
        }
        if (n2 == 0) {
            kotakbaz.rain.client.extensions.b.getMc().getSoundManager().play((SoundInstance)PositionedSoundInstance.master((SoundEvent)RainSoundEvents.INSTANCE.getSLIDER(), (float)1.0f, (float)1.0f));
        }
    }

    private final void commitAvatarPopupHudScaleDrag(Float mouseX) {
        int n2;
        float f2;
        long l2 = -7595381982600041013L;
        long l3 = 6595300087478601397L;
        if (mouseX != null && avatarPopupOpen) {
            int n3 = -17;
            n3 ^= 0x23;
            f2 = MenuScreen.currentScale$default(this, 0.0f, n3 += 53, null);
            Category category = categoryTransition.getCurrent();
            SelectCategoryComponent selectCategoryComponent = CollectionsKt.firstOrNull(components);
            float f3 = selectCategoryComponent != null ? selectCategoryComponent.getPadding() : uiPadding;
            int n4 = 125;
            n4 -= 50;
            long l4 = l3;
            int n5 = 17;
            n5 -= -94;
            long l5 = l3 = l4 ^ ((long)this.isConfigCategory(category) << (n4 ^= 0x6B) ^ l4) & -1L << (n5 += -79);
            int n6 = -5;
            n6 ^= 0xFFFFFF8C;
            l3 = l5 ^ ((long)this.isPointsCategory(category) ^ l5) & -1L >>> (n6 -= 87);
            int n7 = 29;
            n7 += -56;
            MenuLayout menuLayout = new MenuLayout(this.getX(), this.getY(), this.getWidth(), this.getHeight(), this.getPanelWidth(), uiPadding, topBarHeight, f3, components.size(), (boolean)(l3 >>> (n7 -= -59)), (boolean)l3);
            AvatarPopupMetrics avatarPopupMetrics = this.avatarPopupMetrics(f2);
            PopupRect popupRect = this.avatarPopupBounds(menuLayout, f2, avatarPopupMetrics);
            int n8 = -18;
            n8 += 17;
            PopupRect popupRect2 = this.avatarPopupSettingBounds(popupRect, avatarPopupMetrics, n8 ^= 0xFFFFFFFE);
            this.updateAvatarPopupHudScalePreview(mouseX.floatValue(), this.avatarPopupHudScaleSliderBounds(popupRect2, avatarPopupMetrics));
        }
        Float f4 = avatarPopupHudScaleDragProgress;
        f2 = f4 != null ? f4.floatValue() : ClickGuiSettings.INSTANCE.hudScaleProgress();
        float f5 = ClickGuiSettings.INSTANCE.hudScalePercent();
        ClickGuiSettings.INSTANCE.setHudScaleProgress(f2);
        if (ClickGuiSettings.INSTANCE.hudScalePercent() == f5) {
            int n9 = 209;
            n9 += -87;
            n2 = n9 -= 121;
        } else {
            int n10 = -28;
            n10 -= -54;
            n2 = n10 += -26;
        }
        if (n2 == 0) {
            kotakbaz.rain.client.extensions.b.getMc().getSoundManager().play((SoundInstance)PositionedSoundInstance.master((SoundEvent)RainSoundEvents.INSTANCE.getSLIDER(), (float)1.0f, (float)1.0f));
        }
        int n11 = 99;
        n11 ^= 0xFFFFFFC7;
        draggingAvatarPopupHudScale = n11 += 92;
        avatarPopupHudScaleDragProgress = null;
    }

    static /* synthetic */ void commitAvatarPopupHudScaleDrag$default(MenuScreen menuScreen, Float f2, int n2, Object object) {
        int n3 = 62;
        n3 ^= 2;
        if ((n2 & (n3 ^= 0x3D)) != 0) {
            f2 = null;
        }
        menuScreen.commitAvatarPopupHudScaleDrag(f2);
    }

    private final float avatarPopupHudScaleProgress(float mouseX, PopupRect sliderBounds) {
        if (sliderBounds.getWidth() <= 0.0f) {
            return ClickGuiSettings.INSTANCE.hudScaleProgress();
        }
        return RangesKt.coerceIn((mouseX - sliderBounds.getX()) / sliderBounds.getWidth(), 0.0f, 1.0f);
    }

    private final PopupRect avatarPopupHudScaleSliderBounds(PopupRect cardBounds, AvatarPopupMetrics metrics) {
        float f2 = metrics.scaled(6.0f);
        float f3 = metrics.scaled(6.2f);
        int n2 = 253;
        n2 ^= 0x61;
        int n3 = -19;
        n3 += -33;
        float f4 = E.getWidth$default(Font.INSTANCE.getGS_MEDIUM(), (String)a[n2 -= 121], f3, 0.0f, n3 += 56, null);
        float f5 = metrics.scaled(4.0f);
        float f6 = metrics.scaled(30.0f);
        float f7 = metrics.scaled(2.7f);
        float f8 = cardBounds.getX() + cardBounds.getWidth() - f2 - f4 - f5 - f6;
        float f9 = cardBounds.getY() + (cardBounds.getHeight() - f7) * 0.5f;
        return new PopupRect(f8, f9, RangesKt.coerceAtLeast(f6, 0.0f), f7);
    }

    private final PopupRect avatarPopupHudScaleSliderHitBounds(PopupRect cardBounds, AvatarPopupMetrics metrics) {
        PopupRect popupRect = this.avatarPopupHudScaleSliderBounds(cardBounds, metrics);
        float f2 = metrics.scaled(5.0f);
        return new PopupRect(popupRect.getX() - f2, popupRect.getY() - f2, popupRect.getWidth() + f2 * 2.0f, popupRect.getHeight() + f2 * 2.0f);
    }

    private final String avatarPopupHudScaleValueText() {
        long l2 = -2096889046020006542L;
        Float f2 = avatarPopupHudScaleDragProgress;
        float f3 = f2 != null ? ClickGuiSettings.INSTANCE.hudScalePercentForProgress(f2.floatValue()) : ClickGuiSettings.INSTANCE.hudScalePercent();
        int n2 = 23;
        n2 += 84;
        long l3 = l2;
        int n3 = 59;
        n3 -= 121;
        l2 = l3 ^ ((long)MathKt.roundToInt(f3) << (n2 ^= 0x4B) ^ l3) & -1L << (n3 ^= 0xFFFFFFE2);
        int n4 = -95;
        n4 += 119;
        int n5 = -78;
        n5 ^= 0xE;
        return (int)(l2 >>> (n4 ^= 0x38)) + (String)a[n5 += 79];
    }

    private final PopupRect avatarPopupGuiBackgroundBounds(PopupRect bounds, AvatarPopupMetrics metrics) {
        int n2 = 118;
        n2 += -7;
        return this.avatarPopupSettingBounds(bounds, metrics, n2 -= 109);
    }

    private final PopupRect avatarPopupInfoActionBounds(PopupRect bounds, AvatarPopupMetrics metrics) {
        int n2 = 16;
        n2 -= 52;
        PopupRect popupRect = this.avatarPopupSettingBounds(bounds, metrics, n2 -= -39);
        float f2 = metrics.scaled(6.0f);
        float f3 = metrics.scaled(6.2f);
        float f4 = metrics.scaled(6.2f);
        int n3 = -79;
        n3 ^= 0xFFFFFFE9;
        int n4 = 70;
        n4 += -3;
        float f5 = E.getWidth$default(Font.INSTANCE.getGS_MEDIUM(), (String)a[n3 += -60], f3, 0.0f, n4 -= 63, null);
        float f6 = metrics.scaled(3.0f);
        int n5 = -68;
        n5 ^= 0xFFFFFF9E;
        int n6 = 10;
        n6 ^= 1;
        float f7 = E.getWidth$default(Font.INSTANCE.getICON(), (String)a[n5 -= 14], f4, 0.0f, n6 ^= 0xF, null);
        float f8 = f5 + f6 + f7;
        float f9 = metrics.scaled(5.0f);
        return new PopupRect(popupRect.getX() + popupRect.getWidth() - f2 - f8 - f9, popupRect.getY(), f8 + f9 * 2.0f, popupRect.getHeight());
    }

    private final float avatarPopupSettingTextYOffset(AvatarPopupMetrics metrics) {
        return metrics.scaled(0.65f);
    }

    private final float avatarPopupContentInset(AvatarPopupMetrics metrics) {
        return metrics.getMargin() * 1.2f;
    }

    private final boolean isLeftMousePressed() {
        boolean bl;
        int n2 = -20;
        n2 -= 74;
        int n3 = -22;
        n3 ^= 0xFFFFFFCF;
        if (GLFW.glfwGetMouseButton((long)kotakbaz.rain.client.extensions.b.getMc().getWindow().getHandle(), (int)(n2 -= -94)) == (n3 += -36)) {
            boolean bl2;
            int n4 = -82;
            n4 = n4 - -67;
            bl = bl2 = n4 ^ 0xFFFFFFF0;
        } else {
            boolean bl3;
            int n6 = 75;
            n6 = n6 + -114;
            bl = bl3 = n6 + 39;
        }
        return bl;
    }

    private final PopupRect avatarPopupBounds(MenuLayout layout, float scale, AvatarPopupMetrics metrics) {
        PopupRect popupRect = this.avatarBounds(layout);
        float f2 = this.getX() + this.getWidth() * 0.5f;
        float f3 = this.getY() + this.getHeight() * 0.5f;
        float f4 = f2 + (popupRect.getX() - f2) * scale;
        float f5 = f3 + (popupRect.getY() - f3) * scale;
        float f6 = popupRect.getWidth() * scale;
        float f7 = metrics.scaled(6.0f);
        float f8 = metrics.scaled(5.0f);
        float f9 = RangesKt.coerceAtLeast((float)kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledWidth() - metrics.getWidth() - f7, f7);
        float f10 = RangesKt.coerceAtLeast((float)kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledHeight() - metrics.getHeight() - f7, f7);
        float f11 = RangesKt.coerceIn(f4 - metrics.getWidth() - f7 - f8, f7, f9);
        float f12 = RangesKt.coerceIn(f5 + f6 - metrics.getHeight(), f7, f10);
        return new PopupRect(f11, f12, metrics.getWidth(), metrics.getHeight());
    }

    static /* synthetic */ PopupRect avatarPopupBounds$default(MenuScreen menuScreen, MenuLayout menuLayout, float f2, AvatarPopupMetrics avatarPopupMetrics, int n2, Object object) {
        int n3 = 62;
        n3 ^= 0;
        if ((n2 & (n3 ^= 0x3A)) != 0) {
            avatarPopupMetrics = menuScreen.avatarPopupMetrics(f2);
        }
        return menuScreen.avatarPopupBounds(menuLayout, f2, avatarPopupMetrics);
    }

    private final PopupRect avatarPopupCloseBounds(PopupRect bounds, AvatarPopupMetrics metrics) {
        float f2 = metrics.scaled(14.0f);
        return new PopupRect(bounds.getX() + bounds.getWidth() - f2 - metrics.getMargin() * 0.75f, bounds.getY() + (metrics.getHeaderHeight() - f2) * 0.5f, f2, f2);
    }

    private final PopupRect avatarBounds(MenuLayout layout) {
        if (layout.getAvatarSize() <= 0.0f) {
            return new PopupRect(layout.getAvatarX(), layout.getAvatarY(), 0.0f, 0.0f);
        }
        int n2 = -14;
        n2 ^= 0xFFFFFFCE;
        float f2 = RangesKt.coerceAtLeast(MathKt.roundToInt(layout.getAvatarSize()), n2 -= 59);
        float f3 = layout.getAvatarX() + layout.getAvatarSize() * 0.5f;
        float f4 = layout.getAvatarY() + layout.getAvatarSize() * 0.5f;
        float f5 = MathKt.roundToInt(f3 - f2 * 0.5f);
        float f6 = MathKt.roundToInt(f4 - f2 * 0.5f);
        return new PopupRect(f5, f6, f2, f2);
    }

    private final AvatarPopupMetrics avatarPopupMetrics(float scale) {
        float f2;
        float f3;
        Float f4;
        long l2 = 6847704635082481079L;
        float f5 = RangesKt.coerceAtLeast(scale, 0.01f);
        float f6 = 6.0f * f5;
        float f7 = 9.0f * f5;
        float f8 = 7.0f * f5;
        float f9 = f8 + f6 * 1.2f;
        float f10 = f7 + f6 * 2.2f;
        float f11 = 18.0f * f5;
        float f12 = 4.0f * f5;
        float f13 = f6 * 3.0f;
        float f14 = f8 + f5;
        float f15 = 6.0f * f5;
        List<AvatarPopupRow> list = this.avatarPopupRows();
        Iterator iterator2 = ((Iterable)list).iterator();
        if (!iterator2.hasNext()) {
            f4 = null;
        } else {
            AvatarPopupRow avatarPopupRow = (AvatarPopupRow)iterator2.next();
            long l3 = l2;
            int n2 = 52;
            n2 ^= 0xFFFFFF86;
            l2 = l3 ^ (0L ^ l3) & -1L << (n2 -= -110);
            int n3 = 67;
            n3 += 6;
            n3 ^= 0x4D;
            int n4 = 86;
            n4 ^= 0x69;
            int n5 = -180;
            n5 += 58;
            f3 = E.getWidth$default(Font.INSTANCE.getICON(), avatarPopupRow.getIcon(), f14, 0.0f, n3, null) + f15 + E.getWidth$default(Font.INSTANCE.getGS_MEDIUM(), avatarPopupRow.getText(), f8, 0.0f, n4 += -59, null) + f13 + E.getWidth$default(Font.INSTANCE.getGS_MEDIUM(), avatarPopupRow.getValue(), f8, 0.0f, n5 ^= 0xFFFFFF82, null);
            while (iterator2.hasNext()) {
                AvatarPopupRow avatarPopupRow2 = (AvatarPopupRow)iterator2.next();
                long l4 = l2;
                int n6 = 55;
                n6 ^= 0xFFFFFFEC;
                l2 = l4 ^ (0L ^ l4) & -1L >>> (n6 += 69);
                int n7 = -74;
                n7 += 35;
                n7 += 43;
                int n8 = -7;
                n8 += -20;
                int n9 = 98;
                n9 += -10;
                f2 = E.getWidth$default(Font.INSTANCE.getICON(), avatarPopupRow2.getIcon(), f14, 0.0f, n7, null) + f15 + E.getWidth$default(Font.INSTANCE.getGS_MEDIUM(), avatarPopupRow2.getText(), f8, 0.0f, n8 += 31, null) + f13 + E.getWidth$default(Font.INSTANCE.getGS_MEDIUM(), avatarPopupRow2.getValue(), f8, 0.0f, n9 ^= 0x5C, null);
                f3 = Math.max(f3, f2);
            }
            f4 = Float.valueOf(f3);
        }
        float f16 = f4 != null ? f4.floatValue() : 0.0f;
        int n10 = -1;
        n10 -= 32;
        int n11 = -1;
        n11 += 96;
        int n12 = 95;
        n12 += -15;
        float f17 = f11 * (float)(n10 += 37) + f12 * (float)RangesKt.coerceAtLeast(n11 ^= 0x5C, n12 += -80);
        float f18 = f17 + f6 * 1.5f;
        float f19 = list.isEmpty() ? 0.0f : (float)list.size() * f9 + f6 * 0.4f;
        f3 = f18 + f19;
        f2 = f7 * 11.0f;
        float f20 = 140.0f * f5;
        return new AvatarPopupMetrics(f5, Math.max(f2, Math.max(f16 + f6, f20)), f10 + f3, f10, f9, f6, f7, f8, f11, f12, 6.0f * f5, 5.5f * f5);
    }

    private final List<AvatarPopupRow> avatarPopupRows() {
        return CollectionsKt.emptyList();
    }

    private final Color hudAlpha(Color color, float factor) {
        return ColorUtil.INSTANCE.setAlpha(color, (float)color.getAlpha() / 255.0f * factor);
    }

    private final float openProgress() {
        float f2 = closing ? 0.0f : 1.0f;
        return RangesKt.coerceIn(openAnimation.animate(f2, 220.0f, (Function1<? super Float, Float>)new Function1<Float, Float>((Object)Easings.INSTANCE){
            private static Object[] a;
            private static Object b;
            private static Object[] B;
            private static Object[] A;
            private static Object[] c;
            public static int[] C;
            {
                int n2 = C[0];
                n2 += C[1];
                n2 -= C[2];
                int n3 = C[3];
                n3 ^= C[4];
                n3 -= C[5];
                int n4 = C[6];
                n4 -= C[7];
                n4 ^= C[8];
                int n5 = C[9];
                n5 ^= C[10];
                int n6 = C[12];
                n6 ^= C[13];
                int n7 = C[15];
                n7 -= C[16];
                super(n2, receiver, Easings.class, (String)a[n3] + (String)a[n4], (String)a[n5 ^= C[11]] + (String)a[n6 ^= C[14]], n7 -= C[17]);
            }

            public final Float invoke(float p0) {
                return Float.valueOf(((Easings)this.receiver).emphasizedDecelerate(p0));
            }

            static {
                openProgress._1.b();
                long l2 = -5742872090871808782L;
                long l3 = -7395769693796941827L;
                long l4 = 4931500710719753637L;
                long l5 = 5882616765347314222L;
                long l6 = -5257261318742414116L;
                long l7 = 2811388167312870000L;
                long l8 = 8944364073363025763L;
                long l9 = -5756468175593050794L;
                long l10 = -4859220441217204595L;
                long l11 = 3340936970005156719L;
                long l12 = -955701876374351512L;
                long l13 = 8151902061823942551L;
                long l14 = -7703238987938872015L;
                long l15 = -5369709266622204280L;
                int n2 = C[18];
                n2 ^= C[19];
                a = new Object[n2 -= C[20]];
                long l16 = l15;
                int n3 = C[21];
                n3 -= C[22];
                l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= C[23]);
                Object[] objectArray = new Object[C[24]];
                objectArray[openProgress._1.C[25]] = A;
                objectArray[openProgress._1.C[26]] = C[27];
                int n4 = C[28];
                Object object = openProgress._1.A()[C[29]];
                if (object == null) {
                    char[] cArray = "\ubb59\ub86d\ubba6\ub871\ubba7\ub86e\ub876\ub862\ubba6\ubbb3\ubb4a\ubb49\ubb49\ubb59\ubba5\ubba5\ubb4c\ub843\ub864\ubba5\ubb54\ub874\ub86c\ubbb1\ub877\ubb4f\ubb55\ubb55\ubba6\ubba6\ubbb1\ubb53\ub874\ub86e\ub840\ubb52\ubba3\ubbab\ubba0\ubba2\ub876\ubba7\ub87b\ubbae\ub86a\ub83e\ubb44\ubb4e\ubb4a\ub867\ubb47\ub870\ubb50\ub872\ub86a\ubbab\ub843\ubb4c\ub870\ub864\ub878\ubb45\ub872\ubb4d\ub865\ubb4a\ub864\ubb4e\ub872\ub86d\ubb59\ub866\ubb9e\ub86e\ubbb0\ub876\ubb4d\ubb4a\ub876\ub875\ub874\ubb4d\ubb53\ub874\ub874\ubb56\ubb9e\ubb51\ubb49\ubb4f\ubbb1\ub874\ub862\ub86c\ubb54\ub86e\ubb4c\ubb52\ubbb1\ubb46\ubba3\ubbab\ubb42\ub875\ub878\ubb47\ubb4c\ub85a".toCharArray();
                    for (int i2 = C[30]; i2 < C[31]; ++i2) {
                        int n5 = cArray[i2];
                        n5 ^= C[32];
                        n5 += C[33];
                        n5 += C[34];
                        n5 ^= C[35];
                        n5 ^= C[36];
                        n5 += C[37];
                        n5 += C[38];
                        n5 ^= C[39];
                        n5 -= C[40];
                        n5 += C[41];
                        n5 -= C[42];
                        n5 -= C[43];
                        n5 += C[44];
                        cArray[i2] = (char)(n5 -= C[45]);
                    }
                    object = openProgress._1.A()[openProgress._1.C[46]] = new String(cArray);
                }
                objectArray[n4] = (String)object;
                char[] cArray = ((String)openProgress._1.a(objectArray)).toCharArray();
                long l17 = l6;
                int n6 = C[47];
                n6 -= C[48];
                l6 = l17 ^ (0x3400000000L ^ l17) & -1L << (n6 -= C[49]);
                long l18 = l13;
                int n7 = C[50];
                n7 += C[51];
                l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += C[52]);
                while (true) {
                    int n8 = C[53];
                    n8 -= C[54];
                    if ((int)l13 >= (int)(l6 >>> (n8 -= C[55]))) break;
                    int n9 = (int)l13;
                    long l19 = l13;
                    int n10 = C[56];
                    n10 += C[57];
                    int n11 = C[59];
                    n11 += C[60];
                    l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= C[58])) & -1L >>> (n11 -= C[61]);
                    long l20 = l9;
                    int n12 = C[62];
                    n12 -= C[63];
                    l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= C[64]);
                    int n13 = (int)l13;
                    long l21 = l13;
                    int n14 = C[65];
                    n14 ^= C[66];
                    int n15 = C[68];
                    n15 += C[69];
                    l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= C[67])) & -1L >>> (n15 -= C[70]);
                    int n16 = C[71];
                    n16 ^= C[72];
                    long l22 = l10;
                    int n17 = C[74];
                    n17 ^= C[75];
                    l10 = l22 ^ ((long)cArray[n13] << (n16 -= C[73]) ^ l22) & -1L << (n17 += C[76]);
                    int n18 = C[77];
                    n18 -= C[78];
                    n18 ^= C[79];
                    int n19 = C[80];
                    n19 += C[81];
                    long l23 = l12;
                    int n20 = C[83];
                    n20 += C[84];
                    l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 += C[82]))) ^ l23) & -1L >>> (n20 ^= C[85]);
                    char[] cArray2 = new char[(int)l12];
                    long l24 = l14;
                    int n21 = C[86];
                    n21 -= C[87];
                    l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= C[88]);
                    while (true) {
                        int n22 = C[89];
                        n22 -= C[90];
                        if ((int)(l14 >>> (n22 -= C[91])) >= (int)l12) break;
                        int n23 = C[92];
                        n23 += C[93];
                        int n24 = C[95];
                        n24 -= C[96];
                        cArray2[(int)(l14 >>> (n23 ^= openProgress._1.C[94]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= C[97]))];
                        l14 += 0x100000000L;
                    }
                    int n25 = C[98];
                    n25 += C[99];
                    int n26 = (int)(l15 >>> (n25 ^= C[100]));
                    l15 += 0x100000000L;
                    openProgress._1.a[n26] = new String(cArray2);
                    long l25 = l13;
                    int n27 = C[101];
                    n27 ^= C[102];
                    l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= C[103]);
                }
            }

            public static Object a(Object[] object) {
                Object object2;
                int n2 = (Integer)object[C[104]];
                String string = (String)object[C[105]];
                object = object[C[106]];
                Object[] objectArray = B;
                if (B == null) {
                    objectArray = B = new Object[C[107]];
                }
                if ((object2 = objectArray[n2]) == null) {
                    Object object3 = object;
                    if (object == null) {
                        Object[] objectArray2 = new Object[C[108]];
                        A = objectArray2;
                        object3 = objectArray2;
                        byte[] byArray = new byte[C[110] ^ C[111]];
                        byArray[openProgress._1.C[112] ^ openProgress._1.C[113]] = C[114] ^ C[115];
                        byArray[openProgress._1.C[116] ^ openProgress._1.C[117]] = C[118] ^ C[119];
                        byArray[openProgress._1.C[120] ^ openProgress._1.C[121]] = C[122] ^ C[123];
                        byArray[openProgress._1.C[124] ^ openProgress._1.C[125]] = C[126] ^ C[127];
                        byArray[openProgress._1.C[128] ^ openProgress._1.C[129]] = C[130] ^ C[131];
                        byArray[openProgress._1.C[132] ^ openProgress._1.C[133]] = C[134] ^ C[135];
                        byArray[openProgress._1.C[136] ^ openProgress._1.C[137]] = C[138] ^ C[139];
                        byArray[openProgress._1.C[140] ^ openProgress._1.C[141]] = C[142] ^ C[143];
                        byArray[openProgress._1.C[144] ^ openProgress._1.C[145]] = C[146] ^ C[147];
                        byArray[openProgress._1.C[148] ^ openProgress._1.C[149]] = C[150] ^ C[151];
                        byArray[openProgress._1.C[152] ^ openProgress._1.C[153]] = C[154] ^ C[155];
                        byArray[openProgress._1.C[156] ^ openProgress._1.C[157]] = C[158] ^ C[159];
                        byArray[openProgress._1.C[160] ^ openProgress._1.C[161]] = C[162] ^ C[163];
                        byArray[openProgress._1.C[164] ^ openProgress._1.C[165]] = C[166] ^ C[167];
                        byArray[openProgress._1.C[168] ^ openProgress._1.C[169]] = C[170] ^ C[171];
                        byArray[openProgress._1.C[172] ^ openProgress._1.C[173]] = C[174] ^ C[175];
                        objectArray2[openProgress._1.C[109]] = byArray;
                    }
                    byte[] byArray = (byte[])object3[C[176]];
                    if (b == null) {
                        byte[] byArray2 = new byte[C[177] ^ C[178]];
                        byArray2[openProgress._1.C[179] ^ openProgress._1.C[180]] = C[181] ^ C[182];
                        byArray2[openProgress._1.C[183] ^ openProgress._1.C[184]] = C[185] ^ C[186];
                        byArray2[openProgress._1.C[187] ^ openProgress._1.C[188]] = C[189] ^ C[190];
                        byArray2[openProgress._1.C[191] ^ openProgress._1.C[192]] = C[193] ^ C[194];
                        byArray2[openProgress._1.C[195] ^ openProgress._1.C[196]] = C[197] ^ C[198];
                        byArray2[openProgress._1.C[199] ^ openProgress._1.C[200]] = C[201] ^ C[202];
                        byArray2[openProgress._1.C[203] ^ openProgress._1.C[204]] = C[205] ^ C[206];
                        byArray2[openProgress._1.C[207] ^ openProgress._1.C[208]] = C[209] ^ C[210];
                        byArray2[openProgress._1.C[211] ^ openProgress._1.C[212]] = C[213] ^ C[214];
                        byArray2[openProgress._1.C[215] ^ openProgress._1.C[216]] = C[217] ^ C[218];
                        byArray2[openProgress._1.C[219] ^ openProgress._1.C[220]] = C[221] ^ C[222];
                        byArray2[openProgress._1.C[223] ^ openProgress._1.C[224]] = C[225] ^ C[226];
                        byArray2[openProgress._1.C[227] ^ openProgress._1.C[228]] = C[229] ^ C[230];
                        byArray2[openProgress._1.C[231] ^ openProgress._1.C[232]] = C[233] ^ C[234];
                        byArray2[openProgress._1.C[235] ^ openProgress._1.C[236]] = C[237] ^ C[238];
                        byArray2[openProgress._1.C[239] ^ openProgress._1.C[240]] = C[241] ^ C[242];
                        byArray2[openProgress._1.C[243] ^ openProgress._1.C[244]] = C[245] ^ C[246];
                        byArray2[openProgress._1.C[247] ^ openProgress._1.C[248]] = C[249] ^ C[250];
                        byArray2[openProgress._1.C[251] ^ openProgress._1.C[252]] = C[253] ^ C[254];
                        byArray2[openProgress._1.C[255] ^ openProgress._1.C[256]] = C[257] ^ C[258];
                        byArray2[openProgress._1.C[259] ^ openProgress._1.C[260]] = C[261] ^ C[262];
                        byArray2[openProgress._1.C[263] ^ openProgress._1.C[264]] = C[265] ^ C[266];
                        byArray2[openProgress._1.C[267] ^ openProgress._1.C[268]] = C[269] ^ C[270];
                        byArray2[openProgress._1.C[271] ^ openProgress._1.C[272]] = C[273] ^ C[274];
                        byArray2[openProgress._1.C[275] ^ openProgress._1.C[276]] = C[277] ^ C[278];
                        byArray2[openProgress._1.C[279] ^ openProgress._1.C[280]] = C[281] ^ C[282];
                        byArray2[openProgress._1.C[283] ^ openProgress._1.C[284]] = C[285] ^ C[286];
                        byArray2[openProgress._1.C[287] ^ openProgress._1.C[288]] = C[289] ^ C[290];
                        byArray2[openProgress._1.C[291] ^ openProgress._1.C[292]] = C[293] ^ C[294];
                        byArray2[openProgress._1.C[295] ^ openProgress._1.C[296]] = C[297] ^ C[298];
                        byArray2[openProgress._1.C[299] ^ openProgress._1.C[300]] = C[301] ^ C[302];
                        byArray2[openProgress._1.C[303] ^ openProgress._1.C[304]] = C[305] ^ C[306];
                        byte[] byArray3 = new byte[byArray.length + byArray2.length];
                        System.arraycopy(byArray, C[307], byArray3, C[308], byArray.length);
                        System.arraycopy(byArray2, C[309], byArray3, byArray.length, byArray2.length);
                        Object object4 = openProgress._1.A()[C[310]];
                        if (object4 == null) {
                            char[] cArray = "\u4ea2\u56a8\u4e95\u4e96\u4e9c\u4eb8\u4f51\u56ef\u56a6\u56fa\u4e9a\u56e3\u5687\u56ad\u4e7d\u4e9a\u56a7\u4eb7".toCharArray();
                            for (int i2 = C[311]; i2 < C[312]; ++i2) {
                                int n3 = cArray[i2];
                                n3 -= C[313];
                                n3 += C[314];
                                n3 -= C[315];
                                n3 -= C[316];
                                n3 ^= C[317];
                                n3 -= C[318];
                                n3 -= C[319];
                                n3 -= C[320];
                                n3 -= C[321];
                                n3 ^= C[322];
                                n3 -= C[323];
                                n3 += C[324];
                                n3 -= C[325];
                                n3 ^= C[326];
                                n3 += C[327];
                                n3 ^= C[328];
                                n3 ^= C[329];
                                cArray[i2] = (char)(n3 ^= C[330]);
                            }
                            object4 = openProgress._1.A()[openProgress._1.C[331]] = new String(cArray);
                        }
                        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                        byte[] byArray4 = new byte[C[332]];
                        byArray4[openProgress._1.C[333]] = C[334];
                        byArray4[openProgress._1.C[335]] = C[336];
                        byArray4[openProgress._1.C[337]] = C[338];
                        byArray4[openProgress._1.C[339]] = C[340];
                        byArray4[openProgress._1.C[341]] = C[342];
                        byArray4[openProgress._1.C[343]] = C[344];
                        byArray4[openProgress._1.C[345]] = C[346];
                        byArray4[openProgress._1.C[347]] = C[348];
                        byArray4[openProgress._1.C[349]] = C[350];
                        byArray4[openProgress._1.C[351]] = C[352];
                        byArray4[openProgress._1.C[353]] = C[354];
                        byArray4[openProgress._1.C[355]] = C[356];
                        byArray4[openProgress._1.C[357]] = C[358];
                        byArray4[openProgress._1.C[359]] = C[360];
                        byArray4[openProgress._1.C[361]] = C[362];
                        byArray4[openProgress._1.C[363]] = C[364];
                        PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, C[365], C[366]);
                        byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                        Object object5 = openProgress._1.A()[C[367]];
                        if (object5 == null) {
                            char[] cArray = "\u8121\u811d\u810f".toCharArray();
                            for (int i3 = C[368]; i3 < C[369]; ++i3) {
                                int n4 = cArray[i3];
                                n4 += C[370];
                                n4 += C[371];
                                n4 += C[372];
                                n4 += C[373];
                                n4 -= C[374];
                                n4 += C[375];
                                n4 += C[376];
                                n4 -= C[377];
                                n4 += C[378];
                                n4 += C[379];
                                n4 -= C[380];
                                cArray[i3] = (char)(n4 ^= C[381]);
                            }
                            object5 = openProgress._1.A()[openProgress._1.C[382]] = new String(cArray);
                        }
                        b = new SecretKeySpec(byArray5, (String)object5);
                    }
                    byte[] byArray6 = Base64.getDecoder().decode(string);
                    byte[] byArray7 = Arrays.copyOfRange(byArray6, C[383], C[384]);
                    byte[] byArray8 = Arrays.copyOfRange(byArray6, C[385], byArray6.length);
                    Object object6 = openProgress._1.A()[C[386]];
                    if (object6 == null) {
                        char[] cArray = "\ue23b\ue237\ue205\ue3e9\ue235\ue238\ue235\ue3e9\ue206\ue20d\ue235\ue205\ue3e7\ue206\ue25b\uf5d2\uf5d2\uf5d3\uf5ac\uf5d1".toCharArray();
                        for (int i4 = C[387]; i4 < C[388]; ++i4) {
                            int n5 = cArray[i4];
                            n5 ^= C[389];
                            n5 -= C[390];
                            n5 ^= C[391];
                            n5 += C[392];
                            n5 += C[393];
                            n5 -= C[394];
                            n5 += C[395];
                            n5 ^= C[396];
                            n5 -= C[397];
                            n5 ^= C[398];
                            n5 ^= C[399];
                            cArray[i4] = (char)(n5 -= 1949);
                        }
                        object6 = openProgress._1.A()[3] = new String(cArray);
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
                C = new int[0xCB6A ^ 0xCAFA];
                openProgress._1.C[0x2A4C ^ 0x2B2B] = 0x2B27 ^ 0x2B2B;
                openProgress._1.C[0x5F18 ^ 0x5F6B] = 0x5CAF ^ 0x5F6B;
                openProgress._1.C[0xDA5F ^ 0xDA5B] = 0xDA6A ^ 0xDA5B;
                openProgress._1.C[0x471C ^ 0x4642] = 0x4672 ^ 0x4642;
                openProgress._1.C[0xD87D ^ 0xD958] = 0xFFFFF39F ^ 0xD958;
                openProgress._1.C[0x10729 ^ 0x107D3] = 0x19C1B ^ 0x107D3;
                openProgress._1.C[0x8C59 ^ 0x8CC2] = 0x3728 ^ 0x8CC2;
                openProgress._1.C[0xE97 ^ 0xFBB] = 0x87E3 ^ 0xFBB;
                openProgress._1.C[0x10CB0 ^ 0x10C1E] = 0x1FA92 ^ 0x10C1E;
                openProgress._1.C[0x5D4E ^ 0x5CCC] = 0x5CCF ^ 0x5CCC;
                openProgress._1.C[0xA1FA ^ 0xA1AC] = 0xFFFF5E6F ^ 0xA1AC;
                openProgress._1.C[0xEAE1 ^ 0xEA94] = 0x5721 ^ 0xEA94;
                openProgress._1.C[0xAC07 ^ 0xAD21] = 0x7857 ^ 0xAD21;
                openProgress._1.C[0xA9F7 ^ 0xA969] = 0x89E ^ 0xA969;
                openProgress._1.C[0xB81B ^ 0xB959] = 0xC2CA ^ 0xB959;
                openProgress._1.C[0xCEA3 ^ 0xCEA9] = 0xFFFF312F ^ 0xCEA9;
                openProgress._1.C[0xB56F ^ 0xB432] = 0xB436 ^ 0xB432;
                openProgress._1.C[0xF1AA ^ 0xF092] = 0xF080 ^ 0xF092;
                openProgress._1.C[0xF900 ^ 0xF881] = 0xF891 ^ 0xF881;
                openProgress._1.C[0x907B ^ 0x914C] = 0x914C ^ 0x914C;
                openProgress._1.C[0xF76A ^ 0xF735] = 0xF764 ^ 0xF735;
                openProgress._1.C[0x8A8F ^ 0x8A08] = 0x18D77 ^ 0x8A08;
                openProgress._1.C[0x9E3F ^ 0x9EC6] = 0x52F ^ 0x9EC6;
                openProgress._1.C[0x72F4 ^ 0x723F] = 0x45AD ^ 0x723F;
                openProgress._1.C[0xE8A4 ^ 0xE9FC] = 0xFFFF161E ^ 0xE9FC;
                openProgress._1.C[0xEF66 ^ 0xEF18] = 0x404E ^ 0xEF18;
                openProgress._1.C[0x2EF ^ 0x2C2] = 0xD17C ^ 0x2C2;
                openProgress._1.C[0x24FB ^ 0x2596] = 0x2581 ^ 0x2596;
                openProgress._1.C[0x2770 ^ 0x2644] = 0x2644 ^ 0x2644;
                openProgress._1.C[0x7BBA ^ 0x7B72] = 0x8FDF ^ 0x7B72;
                openProgress._1.C[0x3EEF ^ 0x3FFB] = 0xDC63 ^ 0x3FFB;
                openProgress._1.C[0x7E80 ^ 0x7ECB] = 0x7E88 ^ 0x7ECB;
                openProgress._1.C[0xF5CE ^ 0xF50A] = 0x77A7 ^ 0xF50A;
                openProgress._1.C[0x423B ^ 0x4277] = 0x425C ^ 0x4277;
                openProgress._1.C[0xFF38 ^ 0xFE5E] = 0xFE47 ^ 0xFE5E;
                openProgress._1.C[0xD9E5 ^ 0xD90E] = 0xFF86 ^ 0xD90E;
                openProgress._1.C[0x2E12 ^ 0x2E1E] = 0x2E2D ^ 0x2E1E;
                openProgress._1.C[0xE6AB ^ 0xE7CE] = 0xE7C9 ^ 0xE7CE;
                openProgress._1.C[0x4F46 ^ 0x4FFD] = 0x6636 ^ 0x4FFD;
                openProgress._1.C[0x10AE9 ^ 0x10ADA] = 0xFFFEF510 ^ 0x10ADA;
                openProgress._1.C[0xDDB0 ^ 0xDD4D] = 0xFFFF8097 ^ 0xDD4D;
                openProgress._1.C[0xEAAD ^ 0xEBD5] = 0x5750 ^ 0xEBD5;
                openProgress._1.C[0x67C ^ 0x62F] = 0x6F5 ^ 0x62F;
                openProgress._1.C[0xFC57 ^ 0xFC69] = 0xFFFF039C ^ 0xFC69;
                openProgress._1.C[0x10419 ^ 0x1045F] = 0x10442 ^ 0x1045F;
                openProgress._1.C[0x55CC ^ 0x554E] = 0xFFFF4185 ^ 0x554E;
                openProgress._1.C[0xA46B ^ 0xA4E2] = 0x92BD ^ 0xA4E2;
                openProgress._1.C[0x329F ^ 0x3285] = 0x3284 ^ 0x3285;
                openProgress._1.C[0xD417 ^ 0xD510] = 0xC743 ^ 0xD510;
                openProgress._1.C[0x4F52 ^ 0x4F97] = 0xFFFF3295 ^ 0x4F97;
                openProgress._1.C[0x5D17 ^ 0x5D94] = 0xB6BD ^ 0x5D94;
                openProgress._1.C[0xB2D1 ^ 0xB3CB] = 0x1876 ^ 0xB3CB;
                openProgress._1.C[0xB774 ^ 0xB606] = 0xC0A6 ^ 0xB606;
                openProgress._1.C[0xD913 ^ 0xD995] = 0x1DE80 ^ 0xD995;
                openProgress._1.C[0x6789 ^ 0x67E7] = 0x16F33 ^ 0x67E7;
                openProgress._1.C[0x90F6 ^ 0x9080] = 0x2D4E ^ 0x9080;
                openProgress._1.C[0x223F ^ 0x223D] = 0x2223 ^ 0x223D;
                openProgress._1.C[0x82 ^ 0x8B] = 0xBB ^ 0x8B;
                openProgress._1.C[0xB65E ^ 0xB65F] = 0xFFFF49F4 ^ 0xB65F;
                openProgress._1.C[0xC2D1 ^ 0xC2E8] = 0xFFFF3D17 ^ 0xC2E8;
                openProgress._1.C[0xF23F ^ 0xF348] = 0xFBDD ^ 0xF348;
                openProgress._1.C[0xE62 ^ 0xEC1] = 0xDCF0 ^ 0xEC1;
                openProgress._1.C[0x9854 ^ 0x98B3] = 0x2F52 ^ 0x98B3;
                openProgress._1.C[0x83 ^ 0x84] = 0xC2 ^ 0x84;
                openProgress._1.C[0xF628 ^ 0xF688] = 0x24B5 ^ 0xF688;
                openProgress._1.C[0x3FC0 ^ 0x3FC0] = 0x3FB4 ^ 0x3FC0;
                openProgress._1.C[0x2C0E ^ 0x2CE1] = 0xF4E2 ^ 0x2CE1;
                openProgress._1.C[0x10C66 ^ 0x10D20] = 0x126FA ^ 0x10D20;
                openProgress._1.C[0xC971 ^ 0xC9D9] = 0xB781 ^ 0xC9D9;
                openProgress._1.C[0x5C47 ^ 0x5CDB] = 0xFD49 ^ 0x5CDB;
                openProgress._1.C[0x9AA0 ^ 0x9BB9] = 0xFFFFCFF5 ^ 0x9BB9;
                openProgress._1.C[0x713D ^ 0x71E8] = 0x7DCE ^ 0x71E8;
                openProgress._1.C[0x1437 ^ 0x14E4] = 0x18E1 ^ 0x14E4;
                openProgress._1.C[0x4E22 ^ 0x4FAB] = 0xB3F3 ^ 0x4FAB;
                openProgress._1.C[0x313 ^ 0x37C] = 0x10BB8 ^ 0x37C;
                openProgress._1.C[0xBC79 ^ 0xBC18] = 0xBC6F ^ 0xBC18;
                openProgress._1.C[0x549E ^ 0x55EE] = 0x55EE ^ 0x55EE;
                openProgress._1.C[0x10623 ^ 0x10685] = 0xFFFEAC85 ^ 0x10685;
                openProgress._1.C[0x2BCF ^ 0x2B8D] = 0x2BCB ^ 0x2B8D;
                openProgress._1.C[0x10339 ^ 0x103A0] = 0x1B84A ^ 0x103A0;
                openProgress._1.C[0x9870 ^ 0x98CE] = 0xB10A ^ 0x98CE;
                openProgress._1.C[0x28F ^ 0x3A2] = 0xFFFF746D ^ 0x3A2;
                openProgress._1.C[0x8049 ^ 0x81CF] = 0x77CC ^ 0x81CF;
                openProgress._1.C[0x3357 ^ 0x326B] = 0xF02F ^ 0x326B;
                openProgress._1.C[0xA1C7 ^ 0xA080] = 0x2DC ^ 0xA080;
                openProgress._1.C[0xCA60 ^ 0xCA6D] = 0xCA65 ^ 0xCA6D;
                openProgress._1.C[0x4333 ^ 0x4318] = 0x7785 ^ 0x4318;
                openProgress._1.C[0xCDE6 ^ 0xCDA6] = 0xCD98 ^ 0xCDA6;
                openProgress._1.C[0x6116 ^ 0x617F] = 0x617D ^ 0x617F;
                openProgress._1.C[0xD2D1 ^ 0xD3DE] = 0xB515 ^ 0xD3DE;
                openProgress._1.C[0x1DB2 ^ 0x1D95] = 0xEF1A ^ 0x1D95;
                openProgress._1.C[0xC269 ^ 0xC35C] = 0xC35C ^ 0xC35C;
                openProgress._1.C[0x101CF ^ 0x1016D] = 0xFFFE2CFD ^ 0x1016D;
                openProgress._1.C[0xF5B ^ 0xF69] = 0xFAF ^ 0xF69;
                openProgress._1.C[0x10970 ^ 0x109AB] = 0x1992C ^ 0x109AB;
                openProgress._1.C[0x9670 ^ 0x9733] = 0xBD27 ^ 0x9733;
                openProgress._1.C[0x7D1D ^ 0x7D92] = 0x17438 ^ 0x7D92;
                openProgress._1.C[0xD03D ^ 0xD1B8] = 0x5729 ^ 0xD1B8;
                openProgress._1.C[0x1056C ^ 0x1045D] = 0x131B7 ^ 0x1045D;
                openProgress._1.C[0xCAB1 ^ 0xCAA2] = 0xFFFF351B ^ 0xCAA2;
                openProgress._1.C[0x8C94 ^ 0x8C25] = 0xD4B6 ^ 0x8C25;
                openProgress._1.C[0x629E ^ 0x63D6] = 0xB808 ^ 0x63D6;
                openProgress._1.C[0x114B ^ 0x1186] = 0x2601 ^ 0x1186;
                openProgress._1.C[0xA1DC ^ 0xA1B0] = 0xA1B1 ^ 0xA1B0;
                openProgress._1.C[0xA32B ^ 0xA27A] = 0xA275 ^ 0xA27A;
                openProgress._1.C[0xEB3 ^ 0xFDD] = 0xEDD ^ 0xFDD;
                openProgress._1.C[0xD1CF ^ 0xD0C5] = 0xC294 ^ 0xD0C5;
                openProgress._1.C[0x248A ^ 0x24AB] = 0x5B49 ^ 0x24AB;
                openProgress._1.C[0x540C ^ 0x5493] = 0xF50C ^ 0x5493;
                openProgress._1.C[0x8D08 ^ 0x8D2B] = 0x1168 ^ 0x8D2B;
                openProgress._1.C[0xD18F ^ 0xD093] = 0x194 ^ 0xD093;
                openProgress._1.C[0xAC0D ^ 0xAC8D] = 0x47A7 ^ 0xAC8D;
                openProgress._1.C[0x58E5 ^ 0x58D9] = 0xFFFFA756 ^ 0x58D9;
                openProgress._1.C[0xD5E1 ^ 0xD49B] = 0xABA2 ^ 0xD49B;
                openProgress._1.C[0x75EB ^ 0x7588] = 0x75D3 ^ 0x7588;
                openProgress._1.C[0x9745 ^ 0x967F] = 0x6F7E ^ 0x967F;
                openProgress._1.C[0xE469 ^ 0xE411] = 0x6CAC ^ 0xE411;
                openProgress._1.C[0xBDB2 ^ 0xBD0F] = 0x94DD ^ 0xBD0F;
                openProgress._1.C[0x4117 ^ 0x405C] = 0x405D ^ 0x405C;
                openProgress._1.C[0x860 ^ 0x92E] = 0xFFFFF6E1 ^ 0x92E;
                openProgress._1.C[0x78C1 ^ 0x789F] = 0x78D1 ^ 0x789F;
                openProgress._1.C[0xFC9A ^ 0xFC92] = 0xFFFF0377 ^ 0xFC92;
                openProgress._1.C[0x747D ^ 0x7511] = 0xFFFF8ADF ^ 0x7511;
                openProgress._1.C[0x2B51 ^ 0x2A43] = 0x4C93 ^ 0x2A43;
                openProgress._1.C[0x93A1 ^ 0x939B] = 0x93F4 ^ 0x939B;
                openProgress._1.C[0x227B ^ 0x22A7] = 0xB239 ^ 0x22A7;
                openProgress._1.C[0x85E ^ 0x925] = 0xE3AE ^ 0x925;
                openProgress._1.C[0x5B23 ^ 0x5B84] = 0xE09 ^ 0x5B84;
                openProgress._1.C[0x2F5B ^ 0x2FB1] = 0x984D ^ 0x2FB1;
                openProgress._1.C[0x56AE ^ 0x5652] = 0xF434 ^ 0x5652;
                openProgress._1.C[0x8422 ^ 0x84BA] = 0x3F54 ^ 0x84BA;
                openProgress._1.C[0x10E01 ^ 0x10EBD] = 0x12779 ^ 0x10EBD;
                openProgress._1.C[0xE96F ^ 0xE8E1] = 0xDABD ^ 0xE8E1;
                openProgress._1.C[0x243B ^ 0x24C5] = 0x86A3 ^ 0x24C5;
                openProgress._1.C[0x948B ^ 0x950F] = 0x951B ^ 0x950F;
                openProgress._1.C[0xFFA7 ^ 0xFF10] = 0x1F2DF ^ 0xFF10;
                openProgress._1.C[0x2817 ^ 0x280C] = 0x280C ^ 0x280C;
                openProgress._1.C[0xD86E ^ 0xD953] = 0xFE36 ^ 0xD953;
                openProgress._1.C[0x8D74 ^ 0x8C17] = 0x8C11 ^ 0x8C17;
                openProgress._1.C[0xC13 ^ 0xC46] = 0xC38 ^ 0xC46;
                openProgress._1.C[0x1C11 ^ 0x1CDB] = 0xE876 ^ 0x1CDB;
                openProgress._1.C[0x181D ^ 0x1846] = 0xFFFFE786 ^ 0x1846;
                openProgress._1.C[0x537A ^ 0x5379] = 0xFFFFACF8 ^ 0x5379;
                openProgress._1.C[0x9608 ^ 0x962A] = 0xF349 ^ 0x962A;
                openProgress._1.C[0xA9F8 ^ 0xA9D4] = 0x444A ^ 0xA9D4;
                openProgress._1.C[0x194E ^ 0x1900] = 0xFFFFE6CA ^ 0x1900;
                openProgress._1.C[0x119 ^ 0x17E] = 0x153 ^ 0x17E;
                openProgress._1.C[0x10AE5 ^ 0x10AD1] = 0xFFFEF541 ^ 0x10AD1;
                openProgress._1.C[0xC640 ^ 0xC6DA] = 0x7D46 ^ 0xC6DA;
                openProgress._1.C[0x4E0E ^ 0x4E38] = 0x4E4D ^ 0x4E38;
                openProgress._1.C[0x101E5 ^ 0x10149] = 0x1F7C2 ^ 0x10149;
                openProgress._1.C[0xF981 ^ 0xF9C2] = 0xF9D4 ^ 0xF9C2;
                openProgress._1.C[0x8309 ^ 0x836F] = 0xFFFF7CFC ^ 0x836F;
                openProgress._1.C[0x4706 ^ 0x4739] = 0xFFFFB8AE ^ 0x4739;
                openProgress._1.C[0x58C4 ^ 0x5834] = 0x8029 ^ 0x5834;
                openProgress._1.C[0xDA44 ^ 0xDB74] = 0xEE8C ^ 0xDB74;
                openProgress._1.C[0x65E9 ^ 0x6531] = 0x1A01 ^ 0x6531;
                openProgress._1.C[0x8053 ^ 0x80D7] = 0x187AF ^ 0x80D7;
                openProgress._1.C[0xAB68 ^ 0xAA66] = 0x954C ^ 0xAA66;
                openProgress._1.C[0xED49 ^ 0xEDF1] = 0x1E032 ^ 0xEDF1;
                openProgress._1.C[0x10713 ^ 0x1065A] = 0x1E264 ^ 0x1065A;
                openProgress._1.C[0xC7C6 ^ 0xC7C3] = 0xFFFF386E ^ 0xC7C3;
                openProgress._1.C[0xE590 ^ 0xE573] = 0x1E6A1 ^ 0xE573;
                openProgress._1.C[0xBC2F ^ 0xBD46] = 0xBD4B ^ 0xBD46;
                openProgress._1.C[0xD6B2 ^ 0xD79A] = 0x4C60 ^ 0xD79A;
                openProgress._1.C[0x51F5 ^ 0x5185] = 0x5247 ^ 0x5185;
                openProgress._1.C[0xCF0 ^ 0xC90] = 0xFFFFF32A ^ 0xC90;
                openProgress._1.C[0x10335 ^ 0x10255] = 0x10274 ^ 0x10255;
                openProgress._1.C[0x96E9 ^ 0x97F2] = 0x46F2 ^ 0x97F2;
                openProgress._1.C[0xEFEC ^ 0xEF0C] = 0x577E ^ 0xEF0C;
                openProgress._1.C[0xADEE ^ 0xAD3E] = 0x1761 ^ 0xAD3E;
                openProgress._1.C[0xC789 ^ 0xC73C] = 0xFFFFA4CB ^ 0xC73C;
                openProgress._1.C[0xAF84 ^ 0xAEA3] = 0x354F ^ 0xAEA3;
                openProgress._1.C[0xFE6 ^ 0xEF1] = 0xA54C ^ 0xEF1;
                openProgress._1.C[0x84F4 ^ 0x840B] = 0x1CB4 ^ 0x840B;
                openProgress._1.C[0x8F3E ^ 0x8E40] = 0x8E42 ^ 0x8E40;
                openProgress._1.C[0xA0A0 ^ 0xA1E4] = 0x33D3 ^ 0xA1E4;
                openProgress._1.C[0x9568 ^ 0x9538] = 0x957D ^ 0x9538;
                openProgress._1.C[0x9434 ^ 0x94FD] = 0x6058 ^ 0x94FD;
                openProgress._1.C[0x1044B ^ 0x10553] = 0x1AEEE ^ 0x10553;
                openProgress._1.C[0x9E02 ^ 0x9F26] = 0x4A50 ^ 0x9F26;
                openProgress._1.C[0xF6E8 ^ 0xF62A] = 0xE7A2 ^ 0xF62A;
                openProgress._1.C[0x56D ^ 0x599] = 0xB788 ^ 0x599;
                openProgress._1.C[0xEF41 ^ 0xEFFB] = 0x1E238 ^ 0xEFFB;
                openProgress._1.C[0xF865 ^ 0xF8F8] = 0x5967 ^ 0xF8F8;
                openProgress._1.C[0x104BF ^ 0x104A6] = 0x104A6 ^ 0x104A6;
                openProgress._1.C[0xA129 ^ 0xA1F8] = 0xFFFFE464 ^ 0xA1F8;
                openProgress._1.C[0x93E1 ^ 0x92C0] = 0xFFFFC763 ^ 0x92C0;
                openProgress._1.C[0x10B46 ^ 0x10B12] = 0xFFFEF496 ^ 0x10B12;
                openProgress._1.C[0x286F ^ 0x290B] = 0xFFFFD6A2 ^ 0x290B;
                openProgress._1.C[0xA7F ^ 0xA70] = 0xFFFFF5FC ^ 0xA70;
                openProgress._1.C[0xCE43 ^ 0xCEEE] = 0x386F ^ 0xCEEE;
                openProgress._1.C[0x33C1 ^ 0x33AC] = 0x33AC ^ 0x33AC;
                openProgress._1.C[0xA633 ^ 0xA6DD] = 0x805D ^ 0xA6DD;
                openProgress._1.C[0xB8A0 ^ 0xB813] = 0x2434 ^ 0xB813;
                openProgress._1.C[0x10C28 ^ 0x10C5F] = 0x1B1EA ^ 0x10C5F;
                openProgress._1.C[0xD371 ^ 0xD30B] = 0xFFFFA41E ^ 0xD30B;
                openProgress._1.C[0x8ECF ^ 0x8E09] = 0xCA4 ^ 0x8E09;
                openProgress._1.C[0xDC00 ^ 0xDD41] = 0x6011 ^ 0xDD41;
                openProgress._1.C[0xBEF9 ^ 0xBE9C] = 0xFFFF4142 ^ 0xBE9C;
                openProgress._1.C[0x18C1 ^ 0x19AA] = 0x19A3 ^ 0x19AA;
                openProgress._1.C[0x10727 ^ 0x107AB] = 0xE08 ^ 0x107AB;
                openProgress._1.C[0x5C99 ^ 0x5DEA] = 0x72B ^ 0x5DEA;
                openProgress._1.C[0xF1E1 ^ 0xF19E] = 0x5EC6 ^ 0xF19E;
                openProgress._1.C[0x6E2A ^ 0x6EBA] = 0xC774 ^ 0x6EBA;
                openProgress._1.C[0xD8DC ^ 0xD8B4] = 0xD8B5 ^ 0xD8B4;
                openProgress._1.C[0x3E57 ^ 0x3F02] = 0x3F09 ^ 0x3F02;
                openProgress._1.C[0x65DE ^ 0x656A] = 0xF949 ^ 0x656A;
                openProgress._1.C[0x10251 ^ 0x1035C] = 0x13C67 ^ 0x1035C;
                openProgress._1.C[0x365A ^ 0x368D] = 0x49B0 ^ 0x368D;
                openProgress._1.C[0x6E24 ^ 0x6E22] = 0x6E08 ^ 0x6E22;
                openProgress._1.C[0x9C15 ^ 0x9D9D] = 0x205A ^ 0x9D9D;
                openProgress._1.C[0x7704 ^ 0x7753] = 0xFFFF88A8 ^ 0x7753;
                openProgress._1.C[0x11DF ^ 0x113B] = 0x112F8 ^ 0x113B;
                openProgress._1.C[0xADE1 ^ 0xAD0D] = 0x8B8D ^ 0xAD0D;
                openProgress._1.C[0x9751 ^ 0x9606] = 0x9605 ^ 0x9606;
                openProgress._1.C[0xBC4A ^ 0xBCB8] = 0x64A5 ^ 0xBCB8;
                openProgress._1.C[0xD5B2 ^ 0xD48B] = 0xEAEB ^ 0xD48B;
                openProgress._1.C[0xBF76 ^ 0xBE17] = 0xBE1F ^ 0xBE17;
                openProgress._1.C[0x7BD7 ^ 0x7A8E] = 0x7A8B ^ 0x7A8E;
                openProgress._1.C[0x6133 ^ 0x611A] = 0xE242 ^ 0x611A;
                openProgress._1.C[0xB37 ^ 0xA41] = 0x82B3 ^ 0xA41;
                openProgress._1.C[0x3B7E ^ 0x3B6B] = 0x3B6D ^ 0x3B6B;
                openProgress._1.C[0x1191 ^ 0x11BF] = 0x11BF ^ 0x11BF;
                openProgress._1.C[0x2C5A ^ 0x2D4C] = 0xCED4 ^ 0x2D4C;
                openProgress._1.C[0xC552 ^ 0xC42F] = 0x69B0 ^ 0xC42F;
                openProgress._1.C[0x108FC ^ 0x1098D] = 0x1098E ^ 0x1098D;
                openProgress._1.C[0x822B ^ 0x82C3] = 0x353F ^ 0x82C3;
                openProgress._1.C[0x4800 ^ 0x4820] = 0x6D21 ^ 0x4820;
                openProgress._1.C[0x5C9F ^ 0x5C51] = 0x6BD3 ^ 0x5C51;
                openProgress._1.C[0x697E ^ 0x68F9] = 0x468E ^ 0x68F9;
                openProgress._1.C[0x90D0 ^ 0x91FA] = 0xA00 ^ 0x91FA;
                openProgress._1.C[0x6FFF ^ 0x6EBA] = 0xB062 ^ 0x6EBA;
                openProgress._1.C[0x77B3 ^ 0x7756] = 0xFFFE8B19 ^ 0x7756;
                openProgress._1.C[0x6FE6 ^ 0x6F9D] = 0xE728 ^ 0x6F9D;
                openProgress._1.C[0xA019 ^ 0xA0B8] = 0x7289 ^ 0xA0B8;
                openProgress._1.C[0xC1F7 ^ 0xC15E] = 0xBF08 ^ 0xC15E;
                openProgress._1.C[0xD994 ^ 0xD8FE] = 0xD8BC ^ 0xD8FE;
                openProgress._1.C[0x6BDF ^ 0x6BE8] = 0x6BE7 ^ 0x6BE8;
                openProgress._1.C[0x341E ^ 0x34D9] = 0xC07E ^ 0x34D9;
                openProgress._1.C[0x4D9B ^ 0x4D4F] = 0x414F ^ 0x4D4F;
                openProgress._1.C[0x4A5A ^ 0x4A44] = 0x4A44 ^ 0x4A44;
                openProgress._1.C[0xC851 ^ 0xC90E] = 0xC904 ^ 0xC90E;
                openProgress._1.C[0x25BD ^ 0x254C] = 0xFD7B ^ 0x254C;
                openProgress._1.C[0x56B ^ 0x5DB] = 0x5DB ^ 0x5DB;
                openProgress._1.C[0x50E5 ^ 0x51B1] = 0xFFFFAE50 ^ 0x51B1;
                openProgress._1.C[0xE9A0 ^ 0xE9FD] = 0xE999 ^ 0xE9FD;
                openProgress._1.C[0x8642 ^ 0x8650] = 0x8670 ^ 0x8650;
                openProgress._1.C[0xF59E ^ 0xF527] = 0xFFFE0708 ^ 0xF527;
                openProgress._1.C[0xB9C1 ^ 0xB957] = 0xFFFFB2C3 ^ 0xB957;
                openProgress._1.C[0x559C ^ 0x54E5] = 0xAD5D ^ 0x54E5;
                openProgress._1.C[0x5AFA ^ 0x5A55] = 0xACD4 ^ 0x5A55;
                openProgress._1.C[0xA621 ^ 0xA6FB] = 0xD9CB ^ 0xA6FB;
                openProgress._1.C[0x42B0 ^ 0x42CD] = 0xED95 ^ 0x42CD;
                openProgress._1.C[0xD182 ^ 0xD16F] = 0xFFFF0873 ^ 0xD16F;
                openProgress._1.C[0x1C5B ^ 0x1C4A] = 0xFFFFE3C3 ^ 0x1C4A;
                openProgress._1.C[0x22F2 ^ 0x23F3] = 0xBB73 ^ 0x23F3;
                openProgress._1.C[0x10623 ^ 0x106A9] = 0x13094 ^ 0x106A9;
                openProgress._1.C[0xADD9 ^ 0xACEB] = 0x9913 ^ 0xACEB;
                openProgress._1.C[0xD01B ^ 0xD089] = 0xFFFF86A6 ^ 0xD089;
                openProgress._1.C[0xA0DD ^ 0xA1EE] = 0xA1EE ^ 0xA1EE;
                openProgress._1.C[0x69CE ^ 0x68F1] = 0x6036 ^ 0x68F1;
                openProgress._1.C[0xA1E2 ^ 0xA1D7] = 0xA173 ^ 0xA1D7;
                openProgress._1.C[0x24B5 ^ 0x2583] = 0x2582 ^ 0x2583;
                openProgress._1.C[0x71F2 ^ 0x717F] = 0x178D5 ^ 0x717F;
                openProgress._1.C[0xBAE8 ^ 0xBAE6] = 0xBADD ^ 0xBAE6;
                openProgress._1.C[0xC8FE ^ 0xC975] = 0x339E ^ 0xC975;
                openProgress._1.C[0x254F ^ 0x25C7] = 0x139D ^ 0x25C7;
                openProgress._1.C[0xFA07 ^ 0xFB07] = 0x63AF ^ 0xFB07;
                openProgress._1.C[0xF117 ^ 0xF1C1] = 0xFDC1 ^ 0xF1C1;
                openProgress._1.C[0x2182 ^ 0x2080] = 0xB828 ^ 0x2080;
                openProgress._1.C[0x343 ^ 0x30C] = 0xFFFFFCDD ^ 0x30C;
                openProgress._1.C[0x89A8 ^ 0x88F8] = 0xFFFF773D ^ 0x88F8;
                openProgress._1.C[0xFD71 ^ 0xFC58] = 0x67A1 ^ 0xFC58;
                openProgress._1.C[0xCDE9 ^ 0xCD98] = 0xCE5C ^ 0xCD98;
                openProgress._1.C[0xF3DD ^ 0xF29D] = 0x5B3 ^ 0xF29D;
                openProgress._1.C[0xAA73 ^ 0xAA3B] = 0xFFFF55B2 ^ 0xAA3B;
                openProgress._1.C[0xCC9C ^ 0xCC17] = 0xFA48 ^ 0xCC17;
                openProgress._1.C[0x106E6 ^ 0x10643] = 0x153CE ^ 0x10643;
                openProgress._1.C[0x1EFB ^ 0x1FE8] = 0xFC79 ^ 0x1FE8;
                openProgress._1.C[0x7CE6 ^ 0x7CF9] = 0x7C95 ^ 0x7CF9;
                openProgress._1.C[0x1685 ^ 0x16C2] = 0xFFFFE91C ^ 0x16C2;
                openProgress._1.C[0xB73E ^ 0xB7AB] = 0x43EC ^ 0xB7AB;
                openProgress._1.C[0x2434 ^ 0x25B9] = 0xE435 ^ 0x25B9;
                openProgress._1.C[0xC6A2 ^ 0xC684] = 0x394A ^ 0xC684;
                openProgress._1.C[0xEC71 ^ 0xEC8A] = 0x4EEF ^ 0xEC8A;
                openProgress._1.C[0x14E6 ^ 0x143B] = 0xFFFF7B11 ^ 0x143B;
                openProgress._1.C[0x10315 ^ 0x1020B] = 0x1D30C ^ 0x1020B;
                openProgress._1.C[0x41EA ^ 0x41D1] = 0x4194 ^ 0x41D1;
                openProgress._1.C[0x31DD ^ 0x30DB] = 0x3B59 ^ 0x30DB;
                openProgress._1.C[0x4540 ^ 0x4512] = 0xFFFFBAA5 ^ 0x4512;
                openProgress._1.C[0xFB7A ^ 0xFAF9] = 0xFAF9 ^ 0xFAF9;
                openProgress._1.C[0x6FBE ^ 0x6F0C] = 0x37BF ^ 0x6F0C;
                openProgress._1.C[0x4328 ^ 0x4318] = 0xFFFFBCB5 ^ 0x4318;
                openProgress._1.C[0xB698 ^ 0xB671] = 0xFFFFFE2A ^ 0xB671;
                openProgress._1.C[0xCE34 ^ 0xCF37] = 0xC4BB ^ 0xCF37;
                openProgress._1.C[0x42AD ^ 0x43E2] = 0x43EC ^ 0x43E2;
                openProgress._1.C[0xD57F ^ 0xD547] = 0xD536 ^ 0xD547;
                openProgress._1.C[0xAD6B ^ 0xAD3A] = 0xAD1E ^ 0xAD3A;
                openProgress._1.C[0x710C ^ 0x7040] = 0x7050 ^ 0x7040;
                openProgress._1.C[0xAD8F ^ 0xAD6D] = 0x151F ^ 0xAD6D;
                openProgress._1.C[0x93DA ^ 0x9255] = 0xF8C8 ^ 0x9255;
                openProgress._1.C[0x46F2 ^ 0x47B8] = 0x6246 ^ 0x47B8;
                openProgress._1.C[0x8C89 ^ 0x8C18] = 0x25DD ^ 0x8C18;
                openProgress._1.C[0x8FE1 ^ 0x8F75] = 0x7B33 ^ 0x8F75;
                openProgress._1.C[0xEEC5 ^ 0xEEB9] = 0x41E3 ^ 0xEEB9;
                openProgress._1.C[0x5197 ^ 0x50EB] = 0x2B17 ^ 0x50EB;
                openProgress._1.C[0x1230 ^ 0x1325] = 0xFFFF0F46 ^ 0x1325;
                openProgress._1.C[0x802 ^ 0x939] = 0x32FB ^ 0x939;
                openProgress._1.C[0x8A56 ^ 0x8A7E] = 0x61EC ^ 0x8A7E;
                openProgress._1.C[0xE534 ^ 0xE5C2] = 0x57D3 ^ 0xE5C2;
                openProgress._1.C[0x8C9B ^ 0x8CDA] = 0x8C8B ^ 0x8CDA;
                openProgress._1.C[0x527C ^ 0x5241] = 0xFFFFADF5 ^ 0x5241;
                openProgress._1.C[0xB5A3 ^ 0xB5FA] = 0xB5E7 ^ 0xB5FA;
                openProgress._1.C[0x7CE9 ^ 0x7CFE] = 0x7CDA ^ 0x7CFE;
                openProgress._1.C[0xF073 ^ 0xF0A1] = 0x4AFE ^ 0xF0A1;
                openProgress._1.C[0x9274 ^ 0x9300] = 0x22C2 ^ 0x9300;
                openProgress._1.C[0xFCFB ^ 0xFDFE] = 0xF67A ^ 0xFDFE;
                openProgress._1.C[0xA6F1 ^ 0xA7F5] = 0xAC77 ^ 0xA7F5;
                openProgress._1.C[0xDC27 ^ 0xDC6D] = 0xFFFF23DB ^ 0xDC6D;
                openProgress._1.C[0x6B9E ^ 0x6AC4] = 0xFFFF9505 ^ 0x6AC4;
                openProgress._1.C[0xBD60 ^ 0xBC5E] = 0x799B ^ 0xBC5E;
                openProgress._1.C[0xF1E6 ^ 0xF0C5] = 0x25A6 ^ 0xF0C5;
                openProgress._1.C[0x115D ^ 0x100E] = 0x100F ^ 0x100E;
                openProgress._1.C[0x3BE4 ^ 0x3BFC] = 0x3BFF ^ 0x3BFC;
                openProgress._1.C[0x7968 ^ 0x7932] = 0x790F ^ 0x7932;
                openProgress._1.C[0xDA60 ^ 0xDA12] = 0xFFFF265D ^ 0xDA12;
                openProgress._1.C[0x5D06 ^ 0x5C8C] = 0x16 ^ 0x5C8C;
                openProgress._1.C[0xADAF ^ 0xADF7] = 0xFFFF525F ^ 0xADF7;
                openProgress._1.C[0xCE66 ^ 0xCF6E] = 0xDD3F ^ 0xCF6E;
                openProgress._1.C[0x5DD8 ^ 0x5D73] = 0x2325 ^ 0x5D73;
                openProgress._1.C[0x11EE ^ 0x10B8] = 0x10CF ^ 0x10B8;
                openProgress._1.C[0x5A31 ^ 0x5A48] = 0xD2FD ^ 0x5A48;
                openProgress._1.C[0x81AE ^ 0x8181] = 0xFFFF7EE9 ^ 0x8181;
                openProgress._1.C[0x83D4 ^ 0x8351] = 0x1842E ^ 0x8351;
                openProgress._1.C[0xD2FB ^ 0xD27A] = 0x3953 ^ 0xD27A;
                openProgress._1.C[0xAEC0 ^ 0xAF4C] = 0x16A7 ^ 0xAF4C;
                openProgress._1.C[0x10D66 ^ 0x10C34] = 0xFFFEF3A4 ^ 0x10C34;
                openProgress._1.C[0x2039 ^ 0x2135] = 0x1E1F ^ 0x2135;
                openProgress._1.C[0x7A33 ^ 0x7A77] = 0x7A44 ^ 0x7A77;
                openProgress._1.C[0xC5C1 ^ 0xC58C] = 0xFFFF3A07 ^ 0xC58C;
                openProgress._1.C[0xFD88 ^ 0xFD44] = 0xCAC6 ^ 0xFD44;
                openProgress._1.C[0x3DC3 ^ 0x3DA1] = 0xFFFFC270 ^ 0x3DA1;
                openProgress._1.C[0x4427 ^ 0x4536] = 0xFFFFDC0C ^ 0x4536;
                openProgress._1.C[0xB230 ^ 0xB2EF] = 0xA9B ^ 0xB2EF;
                openProgress._1.C[0xFF0D ^ 0xFE6F] = 0xFE75 ^ 0xFE6F;
                openProgress._1.C[0xE3FB ^ 0xE2E4] = 0x4890 ^ 0xE2E4;
                openProgress._1.C[0xB8F3 ^ 0xB815] = 0x1BBD6 ^ 0xB815;
                openProgress._1.C[0x998B ^ 0x99E0] = 0x99E1 ^ 0x99E0;
                openProgress._1.C[0x10225 ^ 0x1020F] = 0x19136 ^ 0x1020F;
                openProgress._1.C[0x6EC9 ^ 0x6F92] = 0x6F92 ^ 0x6F92;
                openProgress._1.C[0x61CB ^ 0x60E0] = 0xE8B3 ^ 0x60E0;
                openProgress._1.C[0x31FB ^ 0x3103] = 0xAACB ^ 0x3103;
                openProgress._1.C[0x37B2 ^ 0x3773] = 0xFFFFD977 ^ 0x3773;
                openProgress._1.C[0xA66E ^ 0xA665] = 0xFFFF59D1 ^ 0xA665;
                openProgress._1.C[0x6C39 ^ 0x6D29] = 0xBF9 ^ 0x6D29;
                openProgress._1.C[0x5A85 ^ 0x5B05] = 0x5B15 ^ 0x5B05;
                openProgress._1.C[0xC2FF ^ 0xC3E2] = 0x12E8 ^ 0xC3E2;
                openProgress._1.C[0x3F14 ^ 0x3FCD] = 0x4086 ^ 0x3FCD;
                openProgress._1.C[0xB5B5 ^ 0xB542] = 0x2E92 ^ 0xB542;
                openProgress._1.C[0x26DF ^ 0x26BB] = 0x26B7 ^ 0x26BB;
                openProgress._1.C[0x81FD ^ 0x814B] = 0x1D68 ^ 0x814B;
                openProgress._1.C[0x82 ^ 0x63] = 0xB84C ^ 0x63;
                openProgress._1.C[0x29C8 ^ 0x290B] = 0xABBA ^ 0x290B;
                openProgress._1.C[0x3683 ^ 0x36C6] = 0x36CC ^ 0x36C6;
                openProgress._1.C[0x35B7 ^ 0x34C2] = 0x4DA0 ^ 0x34C2;
                openProgress._1.C[0xD85D ^ 0xD901] = 0xFFFF26E2 ^ 0xD901;
                openProgress._1.C[0x7F8A ^ 0x7F54] = 0xEFCA ^ 0x7F54;
                openProgress._1.C[0x577F ^ 0x57EC] = 0xFE29 ^ 0x57EC;
                openProgress._1.C[0x5E ^ 0x136] = 0x14F ^ 0x136;
                openProgress._1.C[0x21E8 ^ 0x211B] = 0x9310 ^ 0x211B;
                openProgress._1.C[0x7765 ^ 0x7778] = 0x7778 ^ 0x7778;
                openProgress._1.C[0x1FE1 ^ 0x1FBD] = 0x1FB7 ^ 0x1FBD;
                openProgress._1.C[0x8028 ^ 0x808C] = 0xD501 ^ 0x808C;
                openProgress._1.C[0x6C24 ^ 0x6D69] = 0x6D6B ^ 0x6D69;
                openProgress._1.C[0x19C ^ 0xE3] = 0xE3 ^ 0xE3;
                openProgress._1.C[0xC824 ^ 0xC834] = 0xC837 ^ 0xC834;
                openProgress._1.C[0x9B36 ^ 0x9BF9] = 0x21B4 ^ 0x9BF9;
                openProgress._1.C[0x551 ^ 0x5FB] = 0xFFFF8434 ^ 0x5FB;
                openProgress._1.C[0x1B24 ^ 0x1B15] = 0xFFFFE48E ^ 0x1B15;
                openProgress._1.C[0x54B3 ^ 0x559C] = 0x6070 ^ 0x559C;
                openProgress._1.C[0xB4D3 ^ 0xB4C7] = 0xFFFF4B52 ^ 0xB4C7;
                openProgress._1.C[0x36AD ^ 0x36BB] = 0x36B9 ^ 0x36BB;
                openProgress._1.C[0xE457 ^ 0xE579] = 0x6D21 ^ 0xE579;
                openProgress._1.C[0xBC13 ^ 0xBC5A] = 0xBC6D ^ 0xBC5A;
                openProgress._1.C[0x75F3 ^ 0x74F8] = 0x4BC1 ^ 0x74F8;
                openProgress._1.C[0x648 ^ 0x6F7] = 0x177E ^ 0x6F7;
                openProgress._1.C[0xE76F ^ 0xE7AF] = 0xF627 ^ 0xE7AF;
                openProgress._1.C[0x692C ^ 0x6909] = 0x6287 ^ 0x6909;
                openProgress._1.C[0xEF0C ^ 0xEE63] = 0xEE61 ^ 0xEE63;
                openProgress._1.C[0x3106 ^ 0x3024] = 0x9A4F ^ 0x3024;
                openProgress._1.C[0x1BF1 ^ 0x1B7F] = 0x11281 ^ 0x1B7F;
                openProgress._1.C[0x3FAA ^ 0x3F8E] = 0xF8EB ^ 0x3F8E;
                openProgress._1.C[0xFE93 ^ 0xFEF9] = 0xFEF9 ^ 0xFEF9;
                openProgress._1.C[0x10A8F ^ 0x10B86] = 0x119CE ^ 0x10B86;
                openProgress._1.C[0xFECC ^ 0xFEB8] = 0x4302 ^ 0xFEB8;
                openProgress._1.C[0x27DD ^ 0x2728] = 0x956E ^ 0x2728;
                openProgress._1.C[0x419E ^ 0x4182] = 0x4180 ^ 0x4182;
                openProgress._1.C[0xF225 ^ 0xF305] = 0x596E ^ 0xF305;
                openProgress._1.C[0x10367 ^ 0x103F0] = 0x1F7B7 ^ 0x103F0;
            }
        }), 0.0f, 1.0f);
    }

    private final float currentScale(float openProgress2) {
        float f2 = RangesKt.coerceAtLeast(ClickGuiSettings.INSTANCE.scale(), 0.01f);
        float f3 = 0.92f + 0.07999998f * openProgress2;
        return RangesKt.coerceAtLeast(f2 * f3, 0.01f);
    }

    static /* synthetic */ float currentScale$default(MenuScreen menuScreen, float f2, int n2, Object object) {
        int n3 = -33;
        n3 -= 26;
        if ((n2 & (n3 -= -60)) != 0) {
            f2 = menuScreen.openProgress();
        }
        return menuScreen.currentScale(f2);
    }

    private final void handleSearchInput(int button) {
        if (this.isConfigCategory(categoryTransition.getCurrent())) {
            this.handleConfigInput(button);
        } else {
            this.handleModuleSearchInput(button);
        }
    }

    private final void handleModuleSearchInput(int button) {
        if (this.isCtrlDown()) {
            int n2 = -14;
            n2 ^= 0xFFFFFF9D;
            if (button == (n2 += -46)) {
                this.selectTopBarText(moduleSearchText);
                return;
            }
        }
        switch (button) {
            case 257: 
            case 335: {
                int n3 = -1;
                n3 ^= 5;
                searchFocused = n3 ^= 0xFFFFFFFA;
                int n4 = -80;
                n4 ^= 5;
                topBarTextSelected = n4 -= -75;
                return;
            }
            case 259: {
                int n5;
                if (topBarTextSelected) {
                    this.updateModuleSearchText("");
                    return;
                }
                if (((CharSequence)moduleSearchText).length() > 0) {
                    int n6 = 41;
                    n6 -= 56;
                    n5 = n6 ^= 0xFFFFFFF0;
                } else {
                    int n7 = 35;
                    n7 ^= 0xFFFFFFA7;
                    n5 = n7 += 124;
                }
                if (n5 != 0) {
                    int n8 = 98;
                    n8 -= -20;
                    this.updateModuleSearchText(StringsKt.dropLast(moduleSearchText, n8 -= 117));
                }
                return;
            }
            case 261: {
                this.updateModuleSearchText("");
                return;
            }
            case 32: {
                int n9 = -68;
                n9 -= 52;
                this.commitModuleSearch((String)a[n9 ^= 0xFFFFFF84]);
                return;
            }
        }
        int n10 = 74;
        n10 += -4;
        String string = GLFW.glfwGetKeyName((int)button, (int)(n10 += -70));
        if (string == null) {
            return;
        }
        String string2 = string;
        int n11 = 112;
        n11 ^= 0xFFFFFFAF;
        if (string2.length() != (n11 -= -34)) {
            return;
        }
        String string3 = string2.toLowerCase(Locale.ROOT);
        int n12 = -89;
        n12 += 70;
        int n13 = -67;
        n13 ^= 0x66;
        Intrinsics.checkNotNullExpressionValue(string3, (String)a[n12 += 27] + (String)a[n13 -= -62]);
        this.commitModuleSearch(string3);
    }

    private final void handleConfigInput(int button) {
        int n2;
        if (this.isCtrlDown()) {
            int n3 = -46;
            n3 ^= 3;
            if (button == (n3 ^= 0xFFFFFF90)) {
                this.selectTopBarText(configNameText);
                return;
            }
        }
        switch (button) {
            case 257: 
            case 335: {
                this.createConfigFromInput();
                return;
            }
            case 259: {
                int n4;
                if (topBarTextSelected) {
                    this.updateConfigNameText("");
                    return;
                }
                if (((CharSequence)configNameText).length() > 0) {
                    int n5 = 57;
                    n5 -= 115;
                    n4 = n5 ^= 0xFFFFFFC7;
                } else {
                    int n6 = -39;
                    n6 ^= 0x53;
                    n4 = n6 += 118;
                }
                if (n4 != 0) {
                    int n7 = -45;
                    n7 -= 49;
                    this.updateConfigNameText(StringsKt.dropLast(configNameText, n7 += 95));
                }
                return;
            }
            case 261: {
                this.updateConfigNameText("");
                return;
            }
        }
        int n8 = -52;
        n8 += 17;
        if ((n8 += 100) <= button) {
            int n9 = -29;
            n9 += 51;
            if (button < (n9 -= -69)) {
                int n10 = -96;
                n10 -= 24;
                n2 = n10 -= -121;
            } else {
                int n11 = -64;
                n11 -= -97;
                n2 = n11 -= 33;
            }
        } else {
            int n12 = -13;
            n12 -= 0;
            n2 = n12 += 13;
        }
        if (n2 == 0) {
            return;
        }
        int n13 = 38;
        n13 += -20;
        int n14 = 35;
        n14 += 124;
        String string = String.valueOf((char)((n13 -= -79) + (button - (n14 += -94))));
        this.commitConfigName(string);
    }

    private final void appendModuleSearch(String value2) {
        int n2;
        if (((CharSequence)value2).length() == 0) {
            int n3 = 87;
            n3 -= -34;
            n2 = n3 += -120;
        } else {
            int n4 = -43;
            n4 -= -116;
            n2 = n4 ^= 0x49;
        }
        if (n2 != 0) {
            return;
        }
        if (moduleSearchText.length() >= maxModuleSearchLength) {
            return;
        }
        String string = value2;
        String string2 = moduleSearchText;
        this.updateModuleSearchText(StringsKt.take(string2 + string, maxModuleSearchLength));
    }

    private final void appendConfigName(String value2) {
        int n2;
        if (((CharSequence)value2).length() == 0) {
            int n3 = -73;
            n3 -= 48;
            n2 = n3 -= -122;
        } else {
            int n4 = 113;
            n4 += -87;
            n2 = n4 ^= 0x1A;
        }
        if (n2 != 0) {
            return;
        }
        if (configNameText.length() >= maxConfigNameLength) {
            return;
        }
        String string = value2;
        String string2 = configNameText;
        this.updateConfigNameText(StringsKt.take(string2 + string, maxConfigNameLength));
    }

    private final void commitModuleSearch(String value2) {
        int n2;
        if (((CharSequence)value2).length() == 0) {
            int n3 = -2;
            n3 += 113;
            n2 = n3 += -110;
        } else {
            int n4 = 83;
            n4 -= 80;
            n2 = n4 += -3;
        }
        if (n2 != 0) {
            return;
        }
        if (topBarTextSelected) {
            this.updateModuleSearchText(StringsKt.take(value2, maxModuleSearchLength));
            return;
        }
        this.appendModuleSearch(value2);
    }

    private final void commitConfigName(String value2) {
        int n2;
        if (((CharSequence)value2).length() == 0) {
            int n3 = -152;
            n3 += 67;
            n2 = n3 ^= 0xFFFFFFAA;
        } else {
            int n4 = -17;
            n4 ^= 0x21;
            n2 = n4 ^= 0xFFFFFFCE;
        }
        if (n2 != 0) {
            return;
        }
        if (topBarTextSelected) {
            this.updateConfigNameText(StringsKt.take(value2, maxConfigNameLength));
            return;
        }
        this.appendConfigName(value2);
    }

    private final void updateModuleSearchText(String value2) {
        long l2 = -408873774985122849L;
        if (Intrinsics.areEqual(value2, moduleSearchText)) {
            return;
        }
        moduleSearchText = value2;
        int n2 = 87;
        n2 += -50;
        topBarTextSelected = n2 -= 37;
        Iterable iterable = categoryComponents.values();
        long l3 = l2;
        int n3 = 68;
        n3 += 90;
        l2 = l3 ^ (0L ^ l3) & -1L << (n3 -= 126);
        for (Object t2 : iterable) {
            CategoryComponent categoryComponent = (CategoryComponent)t2;
            long l4 = l2;
            int n4 = -57;
            n4 -= 48;
            l2 = l4 ^ (0L ^ l4) & -1L >>> (n4 ^= 0xFFFFFFB7);
            categoryComponent.setSearchQuery(moduleSearchText);
        }
        eventsCategoryComponent.setSearchQuery(moduleSearchText);
        pointsCategoryComponent.setSearchQuery(moduleSearchText);
        friendsCategoryComponent.setSearchQuery(moduleSearchText);
    }

    private final void updateConfigNameText(String value2) {
        if (Intrinsics.areEqual(value2, configNameText)) {
            return;
        }
        configNameText = value2;
        int n2 = 166;
        n2 += -89;
        topBarTextSelected = n2 -= 77;
    }

    private final void createConfigFromInput() {
        if (!this.canCreateConfig()) {
            return;
        }
        if (!ConfigManager.INSTANCE.save(configNameText)) {
            return;
        }
        this.updateConfigNameText("");
    }

    private final void openConfigFolder() {
        Util.getOperatingSystem().open(ConfigManager.INSTANCE.getConfigPath().toFile());
    }

    private final void openRainVisualsSite() {
        int n2 = 62;
        n2 += -113;
        int n3 = 106;
        n3 += -6;
        int n4 = -10;
        n4 += 102;
        Util.getOperatingSystem().open(URI.create((String)a[n2 ^= 0xFFFFFFC9] + (String)a[n3 -= 94] + (String)a[n4 += -89]));
    }

    private final Category currentTopBarCategory(Category category) {
        if (this.isPointsCategory(category) && pointsCategoryComponent.isSettingsPageOpen()) {
            return pointsSettingsCategory;
        }
        return category;
    }

    private final String currentTopBarText(Category category) {
        return this.isConfigCategory(category) ? configNameText : moduleSearchText;
    }

    private final void selectTopBarText(String value2) {
        int n2;
        if (((CharSequence)value2).length() > 0) {
            int n3 = 55;
            n3 ^= 2;
            n2 = n3 ^= 0x34;
        } else {
            int n4 = 101;
            n4 -= -2;
            n2 = n4 ^= 0x67;
        }
        topBarTextSelected = n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final boolean isCtrlDown() {
        int n2;
        long l2 = kotakbaz.rain.client.extensions.b.getMc().getWindow().getHandle();
        int n3 = -369;
        n3 ^= 0x7A;
        int n4 = 107;
        n4 += -67;
        if (GLFW.glfwGetKey((long)l2, (int)(n3 ^= 0xFFFFFFA0)) != (n4 ^= 0x29)) {
            int n5 = 507;
            n5 ^= 0x33;
            int n6 = -51;
            n6 ^= 0xFFFFFFE2;
            if (GLFW.glfwGetKey((long)l2, (int)(n5 += -111)) != (n6 += -46)) {
                int n7 = -20;
                n7 += -103;
                n2 = n7 += 123;
                return n2 != 0;
            }
        }
        int n8 = -139;
        n8 -= -77;
        n2 = n8 += 63;
        return n2 != 0;
    }

    private final void clearCategoryInputFocus() {
        pointsCategoryComponent.clearInputFocus();
        friendsCategoryComponent.clearInputFocus();
    }

    private final boolean canCreateConfig() {
        return ConfigManager.INSTANCE.isManualConfigName(configNameText);
    }

    private final boolean isConfigCategory(Category category) {
        return Intrinsics.areEqual(category, a_0.getCONFIGS());
    }

    private final boolean isEventsCategory(Category category) {
        return Intrinsics.areEqual(category, a_0.getEVENTS());
    }

    private final boolean isPointsCategory(Category category) {
        return Intrinsics.areEqual(category, a_0.getPOINTS());
    }

    private final boolean isFriendsCategory(Category category) {
        return Intrinsics.areEqual(category, a_0.getFRIENDS());
    }

    private static final boolean components$lambda$0$0(Category $category) {
        return Intrinsics.areEqual(categoryTransition.getCurrent(), $category);
    }

    private static final Unit render$lambda$2$0(float progress2, boolean instant) {
        configsCategoryComponent.setScrollProgress(progress2, instant);
        return Unit.INSTANCE;
    }

    private static final Unit render$lambda$2$1(float progress2, boolean instant) {
        eventsCategoryComponent.setScrollProgress(progress2, instant);
        return Unit.INSTANCE;
    }

    private static final Unit render$lambda$2$2(float progress2, boolean instant) {
        pointsCategoryComponent.setScrollProgress(progress2, instant);
        return Unit.INSTANCE;
    }

    private static final Unit render$lambda$2$3(float progress2, boolean instant) {
        friendsCategoryComponent.setScrollProgress(progress2, instant);
        return Unit.INSTANCE;
    }

    private static final Unit render$lambda$2$4(CategoryComponent $categoryComponent, float progress2, boolean instant) {
        $categoryComponent.setScrollProgress(progress2, instant);
        return Unit.INSTANCE;
    }

    static {
        Object object;
        Object object2;
        Object object32;
        MenuScreen.b();
        long l2 = -3892743849737306983L;
        long l3 = -1750408531829133587L;
        long l4 = 8434213183217729643L;
        long l5 = 4007931062338432125L;
        long l6 = -6274910479532571841L;
        long l7 = 2678143367911199041L;
        long l8 = -3097261579260239585L;
        long l9 = 1737771071181619415L;
        long l10 = 9022089478662789185L;
        long l11 = -1755099202327751911L;
        long l12 = -8801288972797495176L;
        long l13 = 7570403480579396275L;
        long l14 = 1965361889901204974L;
        long l15 = 5967273962245968117L;
        long l16 = 9091237362269549328L;
        long l17 = 1128830787732710121L;
        long l18 = -5542009716252682808L;
        long l19 = -8149182152199791704L;
        long l20 = -2101652079176680463L;
        long l21 = -7306517540014434327L;
        int n2 = 174;
        n2 += -59;
        a = new Object[n2 -= 78];
        long l22 = l8;
        int n3 = 6;
        n3 -= -33;
        l8 = l22 ^ (0L ^ l22) & -1L << (n3 += -7);
        Object[] objectArray = new Object[3];
        objectArray[0] = A;
        objectArray[1] = 0;
        Object object4 = MenuScreen.A()[0];
        if (object4 == null) {
            char[] cArray = "\u9b1b\u9afd\u9b18\u9b09\u9b0e\u9adf\u9af8\u914b\u9b11\u912b\u912e\u9b15\u9126\u9b18\u9b10\u9ade\u9128\u9afc\u9afa\u9b11\u9ade\u9b18\u9124\u912d\u9b0b\u912f\u9b18\u9b1a\u9b09\u912f\u9146\u9127\u914a\u9ae0\u9b1c\u9127\u9b1a\u9b04\u9b12\u9b1e\u912c\u9126\u912a\u9b06\u9afe\u914a\u9b0b\u9130\u9b00\u9afa\u9b0b\u912b\u9b0e\u9b12\u9128\u9b12\u9b08\u9b1e\u9b1d\u9b0e\u9b1e\u9b0c\u9132\u9b1e\u9b03\u9adf\u9b09\u9aff\u9b1e\u9afd\u9b1e\u912b\u912b\u9b0d\u9b06\u9b0f\u9b01\u9b08\u9b1e\u9b0b\u9aff\u9adf\u9129\u9afd\u9b04\u9b0d\u9b18\u912d\u9afe\u9b0b\u9adc\u9b0c\u9b06\u912c\u914b\u9b04\u9b0d\u9b1f\u9130\u9b13\u9b0f\u912d\u9b15\u9afd\u912b\u9b00\u9afd\u9b18\u9b1e\u9afd\u9b1a\u9b21\u9146\u9afb\u9af5\u9b1c\u9adc\u912f\u9afe\u9b12\u9afe\u9b0b\u9133\u9b18\u9b10\u9148\u9b06\u912d\u9af5\u9129\u9b1a\u9124\u9b0f\u9149\u9148\u9b04\u9b1d\u9124\u9ade\u9148\u9b0a\u9afe\u9ade\u9b12\u9afb\u9ae1\u9b07\u914a\u912a\u9129\u9124\u912f\u9b18\u9b12\u912f\u9b1d\u9afb\u9ade\u912d\u9b1c\u9b12\u9adc\u9124\u9129\u912f\u9128\u9aff\u9b18\u912b\u9130\u9afa\u9af8\u9b21\u9b15\u912b\u9b07\u9129\u9b00\u9132\u9b15\u9af8\u9132\u9ade\u9afd\u9149\u9b1b\u9adf\u914d\u9b1a\u9146\u9133\u9aff\u9adc\u9af5\u9148\u9b1b\u9133\u9b18\u9afb\u9b1b\u9b1f\u9132\u9b0e\u9b1f\u9afe\u9ae1\u9afd\u9b0d\u9b04\u9af8\u9b07\u9b0a\u912d\u9afd\u9129\u9b21\u9131\u914d\u9131\u9afd\u9afa\u9afd\u9b11\u912f\u9148\u9b0f\u9b15\u9b1c\u9adc\u9adc\u9b1c\u9135\u914a\u9126\u9ae0\u914b\u912f\u9133\u9b0c\u9afc\u914a\u9b1e\u914b\u9adf\u914d\u9b09\u912e\u9b0f\u9130\u9afd\u9afe\u9135\u9afc\u9149\u912c\u9ae3\u912a\u9afb\u9b01\u9b10\u9146\u9b1f\u9b01\u9b0a\u9af8\u9ade\u9b1b\u9b0c\u9124\u9132\u9adc\u9b1e\u9b1a\u9afa\u9b1c\u9130\u9b10\u912b\u9ae0\u9b18\u9146\u9afb\u912d\u9b0d\u9b1c\u912e\u9adf\u9b0e\u9148\u9aff\u9afa\u9b03\u912c\u9b1a\u9130\u9148\u9b12\u9b0e\u9adf\u9128\u9b23\u912a\u9adf\u9b0c\u9131\u9b18\u9148\u9128\u9afb\u9aff\u9127\u9128\u9135\u9b10\u9b09\u9b0d\u9149\u9b1e\u9ae3\u9afe\u912c\u912e\u9b1f\u9148\u914d\u912c\u9b13\u9130\u9b21\u9b15\u9b11\u9131\u9b15\u9131\u912d\u914d\u9b0c\u912a\u9aff\u9ae1\u9b1f\u9af8\u9afd\u9b1e\u912c\u9146\u9b06\u9b23\u912d\u912d\u9b0a\u9b13\u9b0f\u9ae1\u9149\u9afd\u9b23\u9b18\u912c\u9adc\u9128\u9b21\u9b1d\u9b00\u9b08\u9b12\u9b0b\u9b21\u912e\u9af5\u9131\u9b1f\u9b11\u9adc\u9b09\u9b0c\u912b\u9129\u9b08\u9128\u9148\u9ae1\u9126\u9b23\u9ae1\u9b1a\u912b\u9afe\u9afc\u9afc\u914b\u9b1b\u9b01\u9133\u9129\u914a\u9b1b\u9afe\u9127\u9adf\u9ae1\u9135\u9b03\u9b11\u9126\u9ade\u9b23\u912c\u9b09\u9146\u9b11\u9b0d\u9afc\u9ade\u914b\u9afd\u9126\u912a\u9b10\u9126\u912d\u912a\u9b1b\u9b18\u9b1b\u9133\u9afd\u914a\u9b21\u9b23\u9ae3\u9afe\u9adf\u912c\u9afd\u912d\u9127\u9b12\u9132\u9b10\u9adf\u9b1d\u9afb\u9b11\u9126\u9124\u9afd\u9b18\u9af5\u9adf\u9b08\u9b1d\u912b\u9b09\u912d\u9b1b\u9b04\u9135\u9131\u9adf\u9b13\u912f\u914d\u9b1f\u9ae3\u914b\u9133\u9b09\u914d\u9132\u9afb\u9ade\u912e\u9adf\u9b23\u9b15\u9b15\u9b0b\u914d\u9b1e\u9b23\u9b23\u9b1c\u9b03\u912e\u912c\u9b03\u9af5\u9b03\u9afb\u9146\u9b17".toCharArray();
            for (int i2 = 0; i2 < 492; ++i2) {
                int n4 = cArray[i2];
                n4 ^= 0xC2;
                n4 ^= 0xBCC3;
                n4 += 15142;
                n4 -= 63944;
                n4 += 54856;
                n4 -= 21354;
                n4 -= 61642;
                n4 += 48746;
                n4 ^= 0x3B0F;
                n4 += 14929;
                n4 ^= 0x3293;
                n4 ^= 0x5875;
                cArray[i2] = (char)(n4 += 11157);
            }
            object4 = MenuScreen.A()[0] = new String(cArray);
        }
        objectArray[2] = (String)object4;
        char[] cArray = ((String)MenuScreen.a(objectArray)).toCharArray();
        long l23 = l12;
        int n5 = -108;
        n5 ^= 0xFFFFFFC9;
        l12 = l23 ^ (0x11500000000L ^ l23) & -1L << (n5 -= 61);
        long l24 = l21;
        int n6 = -12;
        n6 += 112;
        l21 = l24 ^ (0L ^ l24) & -1L >>> (n6 -= 68);
        while (true) {
            int n7 = 1;
            n7 -= -77;
            if ((int)l21 >= (int)(l12 >>> (n7 -= 46))) break;
            int n8 = (int)l21;
            long l25 = l21;
            int n9 = -20;
            n9 += -58;
            int n10 = -43;
            n10 ^= 0x66;
            l21 = l25 ^ (l25 ^ l25 + (long)(n9 -= -79)) & -1L >>> (n10 -= -109);
            long l26 = l17;
            int n11 = -54;
            n11 += 81;
            l17 = l26 ^ ((long)cArray[n8] ^ l26) & -1L >>> (n11 += 5);
            int n12 = (int)l21;
            long l27 = l21;
            int n13 = 155;
            n13 -= 107;
            int n14 = -128;
            n14 += 70;
            l21 = l27 ^ (l27 ^ l27 + (long)(n13 += -47)) & -1L >>> (n14 ^= 0xFFFFFFE6);
            int n15 = -95;
            n15 -= -20;
            long l28 = l18;
            int n16 = 82;
            n16 -= 41;
            l18 = l28 ^ ((long)cArray[n12] << (n15 ^= 0xFFFFFF95) ^ l28) & -1L << (n16 ^= 9);
            int n17 = 7;
            n17 -= 113;
            n17 -= -122;
            int n18 = -95;
            n18 += 68;
            long l29 = l20;
            int n19 = 75;
            n19 -= 36;
            l20 = l29 ^ ((long)((int)l17 << n17 | (int)(l18 >>> (n18 ^= 0xFFFFFFC5))) ^ l29) & -1L >>> (n19 += -7);
            object32 = new char[(int)l20];
            long l30 = l21;
            int n20 = 146;
            n20 -= 5;
            l21 = l30 ^ (0L ^ l30) & -1L << (n20 += -109);
            while (true) {
                int n21 = 28;
                n21 ^= 0x56;
                if ((int)(l21 >>> (n21 += -42)) >= (int)l20) break;
                int n22 = -142;
                n22 ^= 0xFFFFFFE8;
                int n23 = 170;
                n23 += -107;
                object32[(int)(l21 >>> (n22 -= 122))] = cArray[(int)l21 + (int)(l21 >>> (n23 ^= 0x1F))];
                l21 += 0x100000000L;
            }
            int n24 = 123;
            n24 += -83;
            int n25 = (int)(l8 >>> (n24 ^= 8));
            l8 += 0x100000000L;
            MenuScreen.a[n25] = new String((char[])object32);
            long l31 = l21;
            int n26 = -95;
            n26 ^= 0x71;
            l21 = l31 ^ ((long)((int)l21 + (int)l20) ^ l31) & -1L >>> (n26 ^= 0xFFFFFFF0);
        }
        INSTANCE = new MenuScreen();
        uiPadding = 5.0f;
        topBarHeight = 27.0f;
        int n27 = -3;
        n27 -= 49;
        maxModuleSearchLength = n27 -= -64;
        int n28 = -71;
        n28 += 16;
        maxConfigNameLength = n28 ^= 0xFFFFFFD9;
        Iterable iterable = a_0.getCategories();
        long l32 = l13;
        int n29 = -214;
        n29 += 120;
        l13 = l32 ^ (0L ^ l32) & -1L << (n29 ^= 0xFFFFFF82);
        Object object5 = iterable;
        Iterable iterable2 = new ArrayList();
        long l33 = l17;
        int n30 = 106;
        n30 += -82;
        l17 = l33 ^ (0L ^ l33) & -1L >>> (n30 -= -8);
        Iterator iterator2 = object5.iterator();
        while (iterator2.hasNext()) {
            int n31;
            object2 = iterator2.next();
            object32 = (Category)object2;
            long l34 = l21;
            int n32 = -195;
            n32 ^= 0xFFFFFFBD;
            l21 = l34 ^ (0L ^ l34) & -1L << (n32 += -96);
            if (!(Intrinsics.areEqual(object32, a_0.getPOINTS()) || Intrinsics.areEqual(object32, a_0.getEVENTS()) || Intrinsics.areEqual(object32, a_0.getFRIENDS()))) {
                int n33 = -17;
                n33 -= 4;
                n31 = n33 ^= 0xFFFFFFEA;
            } else {
                int n34 = -106;
                n34 ^= 0xFFFFFFFD;
                n31 = n34 -= 107;
            }
            if (n31 == 0) continue;
            iterable2.add(object2);
        }
        menuCategories = CollectionsKt.plus((Collection)CollectionsKt.plus((Collection)CollectionsKt.plus((Collection)CollectionsKt.plus((Collection)((List)iterable2), a_0.getCONFIGS()), a_0.getPOINTS()), a_0.getEVENTS()), a_0.getFRIENDS());
        categoryTransition = new TransitionManager<Category>(CollectionsKt.firstOrNull(menuCategories));
        categoryContentAlpha = 1.0f;
        categoryShiftDistance = 17.0f;
        iterable = menuCategories;
        long l35 = l13;
        int n35 = 43;
        l13 = l35 ^ (0L ^ l35) & -1L << (n35 += -11);
        object5 = iterable;
        int n36 = -192;
        n36 -= -115;
        iterable2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, n36 ^= 0xFFFFFFB9));
        long l36 = l17;
        int n37 = -56;
        n37 ^= 8;
        l17 = l36 ^ (0L ^ l36) & -1L >>> (n37 -= -96);
        iterator2 = object5.iterator();
        while (iterator2.hasNext()) {
            object2 = iterator2.next();
            object32 = (Category)object2;
            object = iterable2;
            long l37 = l21;
            int n38 = 80;
            n38 -= -57;
            l21 = l37 ^ (0L ^ l37) & -1L << (n38 += -105);
            object.add(new SelectCategoryComponent((Category)object32, () -> MenuScreen.components$lambda$0$0((Category)object32)));
        }
        components = (List)iterable2;
        iterable = a_0.getCategories();
        long l38 = l13;
        int n39 = 115;
        n39 -= 39;
        l13 = l38 ^ (0L ^ l38) & -1L << (n39 += -44);
        object5 = iterable;
        iterable2 = new ArrayList();
        long l39 = l17;
        int n40 = 7;
        n40 ^= 2;
        l17 = l39 ^ (0L ^ l39) & -1L >>> (n40 += 27);
        iterator2 = object5.iterator();
        while (iterator2.hasNext()) {
            int n41;
            object2 = iterator2.next();
            object32 = (Category)object2;
            long l40 = l21;
            int n42 = 123;
            n42 += -84;
            l21 = l40 ^ (0L ^ l40) & -1L << (n42 += -7);
            if (!(Intrinsics.areEqual(object32, a_0.getPOINTS()) || Intrinsics.areEqual(object32, a_0.getEVENTS()) || Intrinsics.areEqual(object32, a_0.getFRIENDS()))) {
                int n43 = -127;
                n43 += 102;
                n41 = n43 += 26;
            } else {
                int n44 = 19;
                n44 -= -84;
                n41 = n44 -= 103;
            }
            if (n41 == 0) continue;
            iterable2.add(object2);
        }
        iterable = (List)iterable2;
        long l41 = l13;
        int n45 = -34;
        n45 += 3;
        l13 = l41 ^ (0L ^ l41) & -1L << (n45 += 63);
        int n46 = -134;
        n46 -= -17;
        int n47 = 127;
        n47 -= 36;
        object5 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, n46 -= -127)), n47 += -75));
        iterable2 = iterable;
        Map map = (Map)object5;
        long l42 = l18;
        int n48 = 102;
        n48 += -115;
        l18 = l42 ^ (0L ^ l42) & -1L << (n48 ^= 0xFFFFFFD3);
        for (Object object32 : iterable2) {
            Category category = (Category)object32;
            Object object6 = object32;
            object = map;
            long l43 = l15;
            int n49 = 69;
            n49 += -97;
            l15 = l43 ^ (0L ^ l43) & -1L << (n49 += 60);
            CategoryComponent categoryComponent = new CategoryComponent(category, INSTANCE.getPanelWidth(), INSTANCE.getModuleStartOffset());
            object.put(object6, categoryComponent);
        }
        categoryComponents = map;
        configsCategoryComponent = new ConfigsCategoryComponent(INSTANCE.getPanelWidth(), INSTANCE.getModuleStartOffset());
        eventsCategoryComponent = new EventsCategoryComponent(INSTANCE.getPanelWidth(), INSTANCE.getModuleStartOffset());
        pointsCategoryComponent = new PointsCategoryComponent(INSTANCE.getPanelWidth(), INSTANCE.getModuleStartOffset());
        friendsCategoryComponent = new FriendsCategoryComponent(INSTANCE.getPanelWidth(), INSTANCE.getModuleStartOffset());
        int n50 = 38;
        n50 ^= 0xFFFFFFA6;
        int n51 = -22;
        n51 ^= 0xFFFFFFB9;
        int n52 = 42;
        n52 -= 113;
        pointsSettingsCategory = new Category((String)a[n50 ^= 0xFFFFFF82], a_0.getPOINTS().getIcon(), (String)a[n51 ^= 0x77] + (String)a[n52 += 71], a_0.getPOINTS().getSearchPlaceholder(), a_0.getPOINTS().getSearchFieldIcon());
        backgroundRenderer = new MenuBackgroundRenderer(INSTANCE);
        topBarRenderer = new MenuTopBarRenderer(INSTANCE);
        scrollBarRenderer = new MenuScrollBarRenderer(INSTANCE);
        int n53 = 205;
        n53 -= 96;
        categoryIndicatorYAnim = new AnimationUtil(0.0f, n53 -= 108, null);
        int n54 = -74;
        n54 -= -6;
        openAnimation = new AnimationUtil(0.0f, n54 += 69, null);
        int n55 = -89;
        n55 -= -121;
        avatarPopupAnimation = new AnimationUtil(0.0f, n55 -= 31, null);
        int n56 = -91;
        n56 ^= 0x41;
        avatarPopupCloseHoverAnimation = new AnimationUtil(0.0f, n56 += 29, null);
        avatarPopupGuiScaleAnimation = new AnimationUtil(ClickGuiSettings.INSTANCE.scaleProgress());
        avatarPopupHudScaleAnimation = new AnimationUtil(ClickGuiSettings.INSTANCE.hudScaleProgress());
        avatarPopupGuiBackgroundAnimation = new AnimationUtil(ClickGuiSettings.INSTANCE.renderGuiBackground() ? 1.0f : 0.0f);
        moduleSearchText = "";
        configNameText = "";
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[1];
        String string = (String)object[2];
        object = object[0];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[1];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[1];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[0x7D6E ^ 0x7D7E];
                byArray[0x7FD7 ^ 0x7FD6] = 0x7FE8 ^ 0x7FD6;
                byArray[0x719B ^ 0x7195] = 0x71A1 ^ 0x7195;
                byArray[0x8BF9 ^ 0x8BF5] = 0xFFFF743C ^ 0x8BF5;
                byArray[0x16AC ^ 0x16AF] = 0xFFFFE901 ^ 0x16AF;
                byArray[0x63FA ^ 0x63F5] = 0xFFFF9C16 ^ 0x63F5;
                byArray[0x10789 ^ 0x10784] = 0x107DA ^ 0x10784;
                byArray[0xCBCF ^ 0xCBC4] = 0xCBF0 ^ 0xCBC4;
                byArray[0x460B ^ 0x460B] = 0x4668 ^ 0x460B;
                byArray[0x956B ^ 0x9562] = 0x9566 ^ 0x9562;
                byArray[0x4395 ^ 0x4393] = 0xFFFFBC18 ^ 0x4393;
                byArray[0xF8FE ^ 0xF8F4] = 0xF8CB ^ 0xF8F4;
                byArray[0x6E1A ^ 0x6E1F] = 0x6E12 ^ 0x6E1F;
                byArray[0x7973 ^ 0x7971] = 0xFFFF86FF ^ 0x7971;
                byArray[0x2DD1 ^ 0x2DD9] = 0xFFFFD24F ^ 0x2DD9;
                byArray[0x8B7 ^ 0x8B0] = 0x8D6 ^ 0x8B0;
                byArray[0xFED6 ^ 0xFED2] = 0xFE91 ^ 0xFED2;
                objectArray2[0] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (b == null) {
                byte[] byArray2 = new byte[0x10B4 ^ 0x1094];
                byArray2[0x6306 ^ 0x631F] = 0x637D ^ 0x631F;
                byArray2[0x1A9F ^ 0x1A92] = 0xFFFFE50B ^ 0x1A92;
                byArray2[0xBC57 ^ 0xBC5B] = 0xFFFF43B8 ^ 0xBC5B;
                byArray2[0x1DF1 ^ 0x1DE1] = 0x1DCB ^ 0x1DE1;
                byArray2[0xDD74 ^ 0xDD74] = 0xFFFF2296 ^ 0xDD74;
                byArray2[0x2132 ^ 0x2134] = 0x2123 ^ 0x2134;
                byArray2[0x8526 ^ 0x852E] = 0xFFFF7AE2 ^ 0x852E;
                byArray2[0xAF24 ^ 0xAF32] = 0xAF1E ^ 0xAF32;
                byArray2[0xD8CE ^ 0xD8DD] = 0xFFFF272F ^ 0xD8DD;
                byArray2[0xE301 ^ 0xE30F] = 0xE312 ^ 0xE30F;
                byArray2[0xD75 ^ 0xD7A] = 0xFFFFF2A9 ^ 0xD7A;
                byArray2[0x6B65 ^ 0x6B7E] = 0xFFFF94D0 ^ 0x6B7E;
                byArray2[0x4A05 ^ 0x4A01] = 0x4A6A ^ 0x4A01;
                byArray2[0x14EA ^ 0x14FE] = 0xFFFFEB4C ^ 0x14FE;
                byArray2[0x94CE ^ 0x94DB] = 0xFFFF6B1D ^ 0x94DB;
                byArray2[0xCD4B ^ 0xCD57] = 0xFFFF32AA ^ 0xCD57;
                byArray2[0xDC1D ^ 0xDC00] = 0xDC18 ^ 0xDC00;
                byArray2[0x9D93 ^ 0x9D82] = 0xFFFF6243 ^ 0x9D82;
                byArray2[0x6FB9 ^ 0x6FB8] = 0xFFFF9013 ^ 0x6FB8;
                byArray2[0xE053 ^ 0xE04B] = 0xFFFF1FAB ^ 0xE04B;
                byArray2[0x91B8 ^ 0x91A7] = 0xFFFF6E6F ^ 0x91A7;
                byArray2[0xB19D ^ 0xB196] = 0xFFFF4E7B ^ 0xB196;
                byArray2[0x76A ^ 0x760] = 0x706 ^ 0x760;
                byArray2[0xC957 ^ 0xC945] = 0xC968 ^ 0xC945;
                byArray2[0xF502 ^ 0xF518] = 0xF508 ^ 0xF518;
                byArray2[0xF147 ^ 0xF144] = 0xF102 ^ 0xF144;
                byArray2[0x55D3 ^ 0x55D6] = 0xFFFFAA72 ^ 0x55D6;
                byArray2[0x3B57 ^ 0x3B49] = 0x3B0E ^ 0x3B49;
                byArray2[0x3C3 ^ 0x3CA] = 0xFFFFFC33 ^ 0x3CA;
                byArray2[0xB248 ^ 0xB24A] = 0xB21C ^ 0xB24A;
                byArray2[0x1FFB ^ 0x1FFC] = 0xFFFFE058 ^ 0x1FFC;
                byArray2[0x1082A ^ 0x1083D] = 0x10876 ^ 0x1083D;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = MenuScreen.A()[1];
                if (object4 == null) {
                    char[] cArray = "\uc2e6\uc1f8\uc2d9\uc1f2\uc1f4\uc208\ua84d\ua83f\ua842\ua83e\uc2de\ua83b\ua857\ua851\uc2e1\uc2de\uc1f7\uc207".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 -= 40322;
                        n3 -= 31012;
                        n3 += 28645;
                        n3 -= 64709;
                        n3 += 5381;
                        n3 -= 59110;
                        n3 ^= 0x4CC6;
                        n3 ^= 0x4146;
                        n3 += 31850;
                        n3 -= 15214;
                        n3 += 42962;
                        n3 ^= 0xE134;
                        n3 += 43349;
                        cArray[i2] = (char)(n3 -= 29182);
                    }
                    object4 = MenuScreen.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[5] = -128;
                byArray4[9] = 7;
                byArray4[6] = -14;
                byArray4[0] = -128;
                byArray4[4] = -51;
                byArray4[13] = -73;
                byArray4[10] = 49;
                byArray4[8] = -29;
                byArray4[2] = 0;
                byArray4[11] = 104;
                byArray4[1] = -37;
                byArray4[3] = -110;
                byArray4[15] = -48;
                byArray4[14] = 101;
                byArray4[7] = 104;
                byArray4[12] = 126;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 8, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = MenuScreen.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u7ba6\u7baa\u7bb8".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 += 6675;
                        n4 += 15443;
                        n4 -= 43956;
                        n4 -= 36967;
                        n4 += 37143;
                        n4 -= 18808;
                        n4 -= 104;
                        n4 ^= 0x4D8;
                        n4 ^= 0x58B8;
                        cArray[i3] = (char)(n4 ^= 0x8109);
                    }
                    object5 = MenuScreen.A()[2] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = MenuScreen.A()[3];
            if (object6 == null) {
                char[] cArray = "\u4edf\u4eeb\u4ed9\u4ded\u4ee9\u4ede\u4ee9\u4ded\u4f0c\u4ee1\u4ee9\u4ed9\u4e3b\u4f0c\u517f\u5188\u5188\u5177\u5182\u5175".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 8034;
                    n5 -= 63026;
                    n5 ^= 0x3A24;
                    n5 += 51764;
                    n5 += 41304;
                    n5 ^= 0xD4D8;
                    n5 ^= 0x9DBA;
                    n5 -= 56379;
                    n5 += 24155;
                    n5 ^= 0xFE5B;
                    cArray[i4] = (char)(n5 += 43103);
                }
                object6 = MenuScreen.A()[3] = new String(cArray);
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
        C = new int[0xE850 ^ 0xE9C0];
        MenuScreen.C[0x2084 ^ 0x2009] = 0xFFFFDFFD ^ 0x2009;
        MenuScreen.C[0x669A ^ 0x667B] = 0x66BB ^ 0x667B;
        MenuScreen.C[0x17C3 ^ 0x1693] = 0xFFFFE97E ^ 0x1693;
        MenuScreen.C[0xA45D ^ 0xA468] = 0xFFFF5BD8 ^ 0xA468;
        MenuScreen.C[0xFEE1 ^ 0xFF91] = 0xFFFF0038 ^ 0xFF91;
        MenuScreen.C[0x3E1C ^ 0x3F68] = 0x3F12 ^ 0x3F68;
        MenuScreen.C[0x106B3 ^ 0x106E5] = 0xFFFEF950 ^ 0x106E5;
        MenuScreen.C[0xDEBE ^ 0xDF9C] = 0xFFFF2074 ^ 0xDF9C;
        MenuScreen.C[0x9FF9 ^ 0x9EFB] = 0xFFFF617B ^ 0x9EFB;
        MenuScreen.C[0x410E ^ 0x41F0] = 0xFFFFBE00 ^ 0x41F0;
        MenuScreen.C[0xDEAA ^ 0xDE94] = 0xDEBA ^ 0xDE94;
        MenuScreen.C[0x7A48 ^ 0x7B0B] = 0x7B79 ^ 0x7B0B;
        MenuScreen.C[0xB200 ^ 0xB2AD] = 0xB2BE ^ 0xB2AD;
        MenuScreen.C[0x204D ^ 0x2147] = 0xFFFFDED6 ^ 0x2147;
        MenuScreen.C[0x9E61 ^ 0x9F62] = 0xFFFF60BB ^ 0x9F62;
        MenuScreen.C[0xB1C8 ^ 0xB0DA] = 0xB0EA ^ 0xB0DA;
        MenuScreen.C[0x8046 ^ 0x80C4] = 0xFFFF7F25 ^ 0x80C4;
        MenuScreen.C[0x5B8C ^ 0x5B3A] = 0x5B48 ^ 0x5B3A;
        MenuScreen.C[0x5850 ^ 0x58FE] = 0xFFFFA7AA ^ 0x58FE;
        MenuScreen.C[0xD63A ^ 0xD713] = 0xD708 ^ 0xD713;
        MenuScreen.C[0x35DD ^ 0x35AB] = 0xFFFFCA17 ^ 0x35AB;
        MenuScreen.C[0x84FD ^ 0x8594] = 0x8595 ^ 0x8594;
        MenuScreen.C[0x236 ^ 0x21B] = 0x21B ^ 0x21B;
        MenuScreen.C[0x5EAC ^ 0x5E9F] = 0xFFFFA138 ^ 0x5E9F;
        MenuScreen.C[0x108EA ^ 0x10886] = 0xFFFEF757 ^ 0x10886;
        MenuScreen.C[0x5F8C ^ 0x5F81] = 0x5FE1 ^ 0x5F81;
        MenuScreen.C[0x6527 ^ 0x6456] = 0xFFFF9B67 ^ 0x6456;
        MenuScreen.C[0x9F25 ^ 0x9E74] = 0x9E45 ^ 0x9E74;
        MenuScreen.C[0xF2F1 ^ 0xF267] = 0xF23F ^ 0xF267;
        MenuScreen.C[0xAE58 ^ 0xAE08] = 0xFFFF51BB ^ 0xAE08;
        MenuScreen.C[0x6D17 ^ 0x6D02] = 0xFFFF9246 ^ 0x6D02;
        MenuScreen.C[0x465F ^ 0x468F] = 0x46DD ^ 0x468F;
        MenuScreen.C[0x10B77 ^ 0x10A42] = 0x10A27 ^ 0x10A42;
        MenuScreen.C[0x8D3B ^ 0x8D0D] = 0x8D77 ^ 0x8D0D;
        MenuScreen.C[0xC5DD ^ 0xC4AF] = 0xC4DA ^ 0xC4AF;
        MenuScreen.C[0x10CED ^ 0x10C95] = 0xFFFEF3C0 ^ 0x10C95;
        MenuScreen.C[0x8F0 ^ 0x8FE] = 0x8FE ^ 0x8FE;
        MenuScreen.C[0xD765 ^ 0xD669] = 0xFFFF2987 ^ 0xD669;
        MenuScreen.C[0x6080 ^ 0x6197] = 0x618A ^ 0x6197;
        MenuScreen.C[0xFF50 ^ 0xFFF6] = 0xFF87 ^ 0xFFF6;
        MenuScreen.C[0xA6B0 ^ 0xA621] = 0xA60C ^ 0xA621;
        MenuScreen.C[0x20A3 ^ 0x20CD] = 0xFFFFDF7D ^ 0x20CD;
        MenuScreen.C[0x51E0 ^ 0x5133] = 0xFFFFAEFF ^ 0x5133;
        MenuScreen.C[0x5884 ^ 0x59DA] = 0x59C0 ^ 0x59DA;
        MenuScreen.C[0xEE70 ^ 0xEF39] = 0xFFFF10CB ^ 0xEF39;
        MenuScreen.C[0x10B79 ^ 0x10B4E] = 0xFFFEF4A2 ^ 0x10B4E;
        MenuScreen.C[0x36B2 ^ 0x3638] = 0x3639 ^ 0x3638;
        MenuScreen.C[0x3D6 ^ 0x259] = 0x2FC ^ 0x259;
        MenuScreen.C[0xC361 ^ 0xC245] = 0xFFFF3D98 ^ 0xC245;
        MenuScreen.C[0x9E0 ^ 0x9FB] = 0x9B9 ^ 0x9FB;
        MenuScreen.C[0xB1A6 ^ 0xB170] = 0xFFFF4E9A ^ 0xB170;
        MenuScreen.C[0x8254 ^ 0x821F] = 0x8312 ^ 0x821F;
        MenuScreen.C[0x937C ^ 0x93A2] = 0x93C9 ^ 0x93A2;
        MenuScreen.C[0x38A2 ^ 0x3816] = 0x3836 ^ 0x3816;
        MenuScreen.C[0xBE4 ^ 0xA99] = 0xFFFFF537 ^ 0xA99;
        MenuScreen.C[0x2274 ^ 0x230E] = 0x2370 ^ 0x230E;
        MenuScreen.C[0x3E31 ^ 0x3E0A] = 0x3E45 ^ 0x3E0A;
        MenuScreen.C[0xB76C ^ 0xB7E0] = 0xB7CF ^ 0xB7E0;
        MenuScreen.C[0x357 ^ 0x36E] = 0x3F7 ^ 0x36E;
        MenuScreen.C[0x17D6 ^ 0x16A8] = 0x16EE ^ 0x16A8;
        MenuScreen.C[0xDAB4 ^ 0xDA17] = 0xFFFF25E2 ^ 0xDA17;
        MenuScreen.C[0xC22F ^ 0xC20C] = 0xFFFF3D95 ^ 0xC20C;
        MenuScreen.C[0xB013 ^ 0xB0F1] = 0xB0D6 ^ 0xB0F1;
        MenuScreen.C[0x9F9B ^ 0x9F4F] = 0x9F10 ^ 0x9F4F;
        MenuScreen.C[0x63D8 ^ 0x636B] = 0x6325 ^ 0x636B;
        MenuScreen.C[0x4492 ^ 0x45FC] = 0xFFFFBAB9 ^ 0x45FC;
        MenuScreen.C[0xC84B ^ 0xC815] = 0xC816 ^ 0xC815;
        MenuScreen.C[0x4B16 ^ 0x4BB1] = 0x4BDE ^ 0x4BB1;
        MenuScreen.C[0xA9F8 ^ 0xA99D] = 0xA9CB ^ 0xA99D;
        MenuScreen.C[0x3895 ^ 0x39CA] = 0xFFFFC618 ^ 0x39CA;
        MenuScreen.C[0xF020 ^ 0xF168] = 0xFFFF0E91 ^ 0xF168;
        MenuScreen.C[0x8575 ^ 0x857C] = 0x8519 ^ 0x857C;
        MenuScreen.C[0x42F ^ 0x465] = 0x41E ^ 0x465;
        MenuScreen.C[0x4925 ^ 0x4914] = 0x496C ^ 0x4914;
        MenuScreen.C[0x45FA ^ 0x44D4] = 0xFFFFBB41 ^ 0x44D4;
        MenuScreen.C[0x6A00 ^ 0x6AAF] = 0x6AFE ^ 0x6AAF;
        MenuScreen.C[0x16CF ^ 0x1630] = 0xFFFFE9E6 ^ 0x1630;
        MenuScreen.C[0x9D6B ^ 0x9C44] = 0x9C0E ^ 0x9C44;
        MenuScreen.C[0x1098F ^ 0x109E2] = 0xFFFEF643 ^ 0x109E2;
        MenuScreen.C[0xE3DA ^ 0xE306] = 0xFFFF1CEA ^ 0xE306;
        MenuScreen.C[0xCEA5 ^ 0xCF23] = 0xCFD1 ^ 0xCF23;
        MenuScreen.C[0x5177 ^ 0x50F6] = 0xFFFFAF18 ^ 0x50F6;
        MenuScreen.C[0xA6E5 ^ 0xA7FB] = 0xFFFF5801 ^ 0xA7FB;
        MenuScreen.C[0x6CB7 ^ 0x6DB9] = 0xFFFF9254 ^ 0x6DB9;
        MenuScreen.C[0xD17C ^ 0xD073] = 0xFFFF2FC8 ^ 0xD073;
        MenuScreen.C[0x1BC7 ^ 0x1AF7] = 0x1AC4 ^ 0x1AF7;
        MenuScreen.C[0xB9B3 ^ 0xB99C] = 0xB985 ^ 0xB99C;
        MenuScreen.C[0x991E ^ 0x9979] = 0x9938 ^ 0x9979;
        MenuScreen.C[0x1071D ^ 0x1079A] = 0xFFFEF820 ^ 0x1079A;
        MenuScreen.C[0x90DC ^ 0x91A0] = 0xFFFF6E22 ^ 0x91A0;
        MenuScreen.C[0xD074 ^ 0xD0B8] = 0xFFFF2F61 ^ 0xD0B8;
        MenuScreen.C[0x9DB1 ^ 0x9CE6] = 0x9CD2 ^ 0x9CE6;
        MenuScreen.C[0x867C ^ 0x8684] = 0xFFFF7954 ^ 0x8684;
        MenuScreen.C[0xDF28 ^ 0xDE42] = 0xDE58 ^ 0xDE42;
        MenuScreen.C[0xEF99 ^ 0xEEFD] = 0xFFFF117E ^ 0xEEFD;
        MenuScreen.C[0x8605 ^ 0x8684] = 0xFFFF791A ^ 0x8684;
        MenuScreen.C[0xB641 ^ 0xB705] = 0xB760 ^ 0xB705;
        MenuScreen.C[0xFB2D ^ 0xFA39] = 0xFA46 ^ 0xFA39;
        MenuScreen.C[0xCA81 ^ 0xCB09] = 0xCB52 ^ 0xCB09;
        MenuScreen.C[0x69C3 ^ 0x6961] = 0x6950 ^ 0x6961;
        MenuScreen.C[0x1617 ^ 0x16DF] = 0xFFFFE932 ^ 0x16DF;
        MenuScreen.C[0x849F ^ 0x846A] = 0xFFFF7B9B ^ 0x846A;
        MenuScreen.C[0x3B97 ^ 0x3AA4] = 0xFFFFC531 ^ 0x3AA4;
        MenuScreen.C[0x10D6F ^ 0x10C58] = 0xFFFEF3F2 ^ 0x10C58;
        MenuScreen.C[0x978D ^ 0x960D] = 0xFFFF69BD ^ 0x960D;
        MenuScreen.C[0x496C ^ 0x4942] = 0xFFFFB685 ^ 0x4942;
        MenuScreen.C[0x4052 ^ 0x416E] = 0x4167 ^ 0x416E;
        MenuScreen.C[0x90F3 ^ 0x91DB] = 0x918C ^ 0x91DB;
        MenuScreen.C[0xCEC7 ^ 0xCF92] = 0xFFFF3079 ^ 0xCF92;
        MenuScreen.C[0xDC5B ^ 0xDCDE] = 0xFFFF2333 ^ 0xDCDE;
        MenuScreen.C[0xD667 ^ 0xD708] = 0xD74C ^ 0xD708;
        MenuScreen.C[0xB4AB ^ 0xB497] = 0xB41F ^ 0xB497;
        MenuScreen.C[0x134D ^ 0x1304] = 0x1324 ^ 0x1304;
        MenuScreen.C[0x21CA ^ 0x2173] = 0xFFFFDE82 ^ 0x2173;
        MenuScreen.C[0x1127 ^ 0x117F] = 0xFFFFEEAA ^ 0x117F;
        MenuScreen.C[0x91E5 ^ 0x917C] = 0x91DF ^ 0x917C;
        MenuScreen.C[0xC495 ^ 0xC468] = 0xC458 ^ 0xC468;
        MenuScreen.C[0xE927 ^ 0xE8A2] = 0xE8D9 ^ 0xE8A2;
        MenuScreen.C[0x8DD5 ^ 0x8DC6] = 0xFFFF7269 ^ 0x8DC6;
        MenuScreen.C[0x217C ^ 0x205B] = 0x204E ^ 0x205B;
        MenuScreen.C[0x4615 ^ 0x4637] = 0xFFFFB9FC ^ 0x4637;
        MenuScreen.C[0x72A ^ 0x601] = 0x667 ^ 0x601;
        MenuScreen.C[0x6E94 ^ 0x6E60] = 0x6E4D ^ 0x6E60;
        MenuScreen.C[0x3301 ^ 0x3389] = 0xFFFFCC4E ^ 0x3389;
        MenuScreen.C[0x9541 ^ 0x95D5] = 0x95A0 ^ 0x95D5;
        MenuScreen.C[0x9BCF ^ 0x9B0B] = 0xFFFF64C8 ^ 0x9B0B;
        MenuScreen.C[0xB19B ^ 0xB0DA] = 0xB089 ^ 0xB0DA;
        MenuScreen.C[0x2943 ^ 0x2985] = 0x2985 ^ 0x2985;
        MenuScreen.C[0xEFE3 ^ 0xEE94] = 0xEEBA ^ 0xEE94;
        MenuScreen.C[0x470F ^ 0x47A6] = 0xFFFFB865 ^ 0x47A6;
        MenuScreen.C[0x10CAF ^ 0x10DA8] = 0x10DFE ^ 0x10DA8;
        MenuScreen.C[0xFECB ^ 0xFFA7] = 0xFFFF0059 ^ 0xFFA7;
        MenuScreen.C[0x8FF ^ 0x8FF] = 0xFFFFF779 ^ 0x8FF;
        MenuScreen.C[0xBB17 ^ 0xBA1E] = 0xFFFF45E1 ^ 0xBA1E;
        MenuScreen.C[0x5E96 ^ 0x5EE8] = 0x5EF6 ^ 0x5EE8;
        MenuScreen.C[0x9A60 ^ 0x9A15] = 0xFFFF65BD ^ 0x9A15;
        MenuScreen.C[0xB2F2 ^ 0xB29A] = 0xFFFF4D18 ^ 0xB29A;
        MenuScreen.C[0x3960 ^ 0x3822] = 0x3802 ^ 0x3822;
        MenuScreen.C[0xC2B1 ^ 0xC2AB] = 0xC2D2 ^ 0xC2AB;
        MenuScreen.C[0xE3DC ^ 0xE383] = 0xE394 ^ 0xE383;
        MenuScreen.C[0xCE33 ^ 0xCE2C] = 0xCE7B ^ 0xCE2C;
        MenuScreen.C[0x86C1 ^ 0x86D7] = 0x86BA ^ 0x86D7;
        MenuScreen.C[0xB9EC ^ 0xB8A6] = 0xFFFF471A ^ 0xB8A6;
        MenuScreen.C[0xDAAF ^ 0xDBE3] = 0xFFFF2403 ^ 0xDBE3;
        MenuScreen.C[0xF2B2 ^ 0xF3E6] = 0xFFFF0C7A ^ 0xF3E6;
        MenuScreen.C[0x7A1 ^ 0x7F6] = 0x73F ^ 0x7F6;
        MenuScreen.C[0x5D20 ^ 0x5D27] = 0xFFFFA28A ^ 0x5D27;
        MenuScreen.C[0xAB68 ^ 0xAB42] = 0xAB46 ^ 0xAB42;
        MenuScreen.C[0xA961 ^ 0xA98D] = 0xA991 ^ 0xA98D;
        MenuScreen.C[0x132F ^ 0x136C] = 0x133C ^ 0x136C;
        MenuScreen.C[0xDECE ^ 0xDE9F] = 0xDE92 ^ 0xDE9F;
        MenuScreen.C[0x25BE ^ 0x25CD] = 0xFFFFDA37 ^ 0x25CD;
        MenuScreen.C[0xBED5 ^ 0xBEFC] = 0xBEFB ^ 0xBEFC;
        MenuScreen.C[0xF940 ^ 0xF9A3] = 0xFFFF0624 ^ 0xF9A3;
        MenuScreen.C[0x3F8F ^ 0x3F41] = 0x3F54 ^ 0x3F41;
        MenuScreen.C[0xBEC6 ^ 0xBEE1] = 0xFFFF4144 ^ 0xBEE1;
        MenuScreen.C[0x310C ^ 0x3182] = 0xFFFFCE48 ^ 0x3182;
        MenuScreen.C[0xD85E ^ 0xD811] = 0xFFFF27DD ^ 0xD811;
        MenuScreen.C[0x4DFF ^ 0x4D44] = 0x4D47 ^ 0x4D44;
        MenuScreen.C[0x6AAA ^ 0x6BE1] = 0x6BBC ^ 0x6BE1;
        MenuScreen.C[0xEFA3 ^ 0xEF07] = 0xEF3B ^ 0xEF07;
        MenuScreen.C[0xBFA5 ^ 0xBF7A] = 0xFFFF40B7 ^ 0xBF7A;
        MenuScreen.C[0x19F4 ^ 0x1893] = 0xFFFFE736 ^ 0x1893;
        MenuScreen.C[0x10AAA ^ 0x10BCA] = 0x10BC9 ^ 0x10BCA;
        MenuScreen.C[0x5908 ^ 0x596C] = 0xFFFFA683 ^ 0x596C;
        MenuScreen.C[0x31EE ^ 0x3199] = 0x3195 ^ 0x3199;
        MenuScreen.C[0x38C6 ^ 0x3856] = 0x38F4 ^ 0x3856;
        MenuScreen.C[0x5BC8 ^ 0x5AEE] = 0xFFFFA530 ^ 0x5AEE;
        MenuScreen.C[0xCC4F ^ 0xCC96] = 0xFFFF335A ^ 0xCC96;
        MenuScreen.C[0x10A68 ^ 0x10AFF] = 0xFFFEF522 ^ 0x10AFF;
        MenuScreen.C[0x8662 ^ 0x8689] = 0x86F2 ^ 0x8689;
        MenuScreen.C[0xB14B ^ 0xB149] = 0xFFFF4EA9 ^ 0xB149;
        MenuScreen.C[0x5252 ^ 0x5245] = 0xFFFFADD4 ^ 0x5245;
        MenuScreen.C[0x2858 ^ 0x28E9] = 0xFFFFD764 ^ 0x28E9;
        MenuScreen.C[0x4E35 ^ 0x4E07] = 0xFFFFB1F0 ^ 0x4E07;
        MenuScreen.C[0xD203 ^ 0xD291] = 0xFFFF2D00 ^ 0xD291;
        MenuScreen.C[0x9CC6 ^ 0x9D42] = 0xFFFF62DA ^ 0x9D42;
        MenuScreen.C[0x576E ^ 0x579C] = 0x57B3 ^ 0x579C;
        MenuScreen.C[0xDE8D ^ 0xDFA7] = 0xFFFF2038 ^ 0xDFA7;
        MenuScreen.C[0x2882 ^ 0x28E9] = 0x28EF ^ 0x28E9;
        MenuScreen.C[0xAD2F ^ 0xAD6A] = 0xAD1E ^ 0xAD6A;
        MenuScreen.C[0xAC84 ^ 0xAC56] = 0xAC5B ^ 0xAC56;
        MenuScreen.C[0x3FAC ^ 0x3FC5] = 0x3F52 ^ 0x3FC5;
        MenuScreen.C[0x5AF1 ^ 0x5A4F] = 0xFFFFA5F0 ^ 0x5A4F;
        MenuScreen.C[0xA7F3 ^ 0xA7FC] = 0xFFFF584F ^ 0xA7FC;
        MenuScreen.C[0xF7C2 ^ 0xF72F] = 0xF73E ^ 0xF72F;
        MenuScreen.C[0xE64C ^ 0xE6D6] = 0xE691 ^ 0xE6D6;
        MenuScreen.C[0x9929 ^ 0x9972] = 0xFFFF66D8 ^ 0x9972;
        MenuScreen.C[0xDEAB ^ 0xDFC3] = 0xDFF8 ^ 0xDFC3;
        MenuScreen.C[0xD18D ^ 0xD086] = 0xD0EC ^ 0xD086;
        MenuScreen.C[0x8FF7 ^ 0x8EC9] = 0x8E4D ^ 0x8EC9;
        MenuScreen.C[0x10BC3 ^ 0x10BDF] = 0xFFFEF435 ^ 0x10BDF;
        MenuScreen.C[0x9E76 ^ 0x9FFF] = 0xFFFF6062 ^ 0x9FFF;
        MenuScreen.C[0x544 ^ 0x579] = 0xFFFFFADE ^ 0x579;
        MenuScreen.C[0xFF5C ^ 0xFE58] = 0xFFFF01FF ^ 0xFE58;
        MenuScreen.C[0x1F59 ^ 0x1FAF] = 0xFFFFE05C ^ 0x1FAF;
        MenuScreen.C[0x1132 ^ 0x11D5] = 0xFFFFEE65 ^ 0x11D5;
        MenuScreen.C[0x821 ^ 0x937] = 0x91A ^ 0x937;
        MenuScreen.C[0x43A4 ^ 0x43AF] = 0x43D1 ^ 0x43AF;
        MenuScreen.C[0x4733 ^ 0x4655] = 0xFFFFB993 ^ 0x4655;
        MenuScreen.C[0x24A2 ^ 0x25B1] = 0xFFFFDA4C ^ 0x25B1;
        MenuScreen.C[0xEFD3 ^ 0xEFA8] = 0xFFFF105C ^ 0xEFA8;
        MenuScreen.C[0x8E89 ^ 0x8EAC] = 0x8EC6 ^ 0x8EAC;
        MenuScreen.C[0x901D ^ 0x9168] = 0x914F ^ 0x9168;
        MenuScreen.C[0x8015 ^ 0x80F1] = 0x80F4 ^ 0x80F1;
        MenuScreen.C[0x7A9D ^ 0x7BD8] = 0xFFFF8425 ^ 0x7BD8;
        MenuScreen.C[0x4D1C ^ 0x4C47] = 0xFFFFB387 ^ 0x4C47;
        MenuScreen.C[0xFBFE ^ 0xFB56] = 0xFBCB ^ 0xFB56;
        MenuScreen.C[0x5CF1 ^ 0x5C6F] = 0xFFFFA3CF ^ 0x5C6F;
        MenuScreen.C[0x9491 ^ 0x94D5] = 0x9496 ^ 0x94D5;
        MenuScreen.C[0x5D2E ^ 0x5C72] = 0x5C70 ^ 0x5C72;
        MenuScreen.C[0xBB75 ^ 0xBB09] = 0xBB2F ^ 0xBB09;
        MenuScreen.C[0x4A53 ^ 0x4AA9] = 0xFFFFB561 ^ 0x4AA9;
        MenuScreen.C[0x5B06 ^ 0x5A84] = 0x5ADA ^ 0x5A84;
        MenuScreen.C[0xD195 ^ 0xD090] = 0xFFFF2F7F ^ 0xD090;
        MenuScreen.C[0x68F3 ^ 0x697F] = 0x6993 ^ 0x697F;
        MenuScreen.C[0x2C0A ^ 0x2D57] = 0x2D6F ^ 0x2D57;
        MenuScreen.C[0x7008 ^ 0x70F9] = 0xFFFF8F77 ^ 0x70F9;
        MenuScreen.C[0xA1B ^ 0xA61] = 0xFFFFF5F8 ^ 0xA61;
        MenuScreen.C[0x437E ^ 0x4239] = 0x4233 ^ 0x4239;
        MenuScreen.C[0x9698 ^ 0x9676] = 0xFFFF698E ^ 0x9676;
        MenuScreen.C[0xA00E ^ 0xA16F] = 0xFFFF5E9E ^ 0xA16F;
        MenuScreen.C[0x8ABB ^ 0x8AFD] = 0x8AAC ^ 0x8AFD;
        MenuScreen.C[0x19E3 ^ 0x18AD] = 0x18B0 ^ 0x18AD;
        MenuScreen.C[0x3F38 ^ 0x3E19] = 0x3E7A ^ 0x3E19;
        MenuScreen.C[0x17C9 ^ 0x16BA] = 0x16C0 ^ 0x16BA;
        MenuScreen.C[0x5E34 ^ 0x5EFE] = 0x5E97 ^ 0x5EFE;
        MenuScreen.C[0xF2F6 ^ 0xF3CC] = 0xF3D0 ^ 0xF3CC;
        MenuScreen.C[0x10D57 ^ 0x10D02] = 0x10D27 ^ 0x10D02;
        MenuScreen.C[0x703E ^ 0x7112] = 0x7126 ^ 0x7112;
        MenuScreen.C[0x5840 ^ 0x589A] = 0xFFFFA732 ^ 0x589A;
        MenuScreen.C[0x906B ^ 0x90D9] = 0x909C ^ 0x90D9;
        MenuScreen.C[0x8441 ^ 0x8483] = 0x84C4 ^ 0x8483;
        MenuScreen.C[0x94DC ^ 0x958E] = 0xFFFF6A35 ^ 0x958E;
        MenuScreen.C[0xDDA7 ^ 0xDD02] = 0xDDFC ^ 0xDD02;
        MenuScreen.C[0xFA76 ^ 0xFA64] = 0xFFFF0580 ^ 0xFA64;
        MenuScreen.C[0x3049 ^ 0x312C] = 0x316F ^ 0x312C;
        MenuScreen.C[0xC4F6 ^ 0xC443] = 0xFFFF3BCD ^ 0xC443;
        MenuScreen.C[0x3A05 ^ 0x3AF6] = 0x3AE8 ^ 0x3AF6;
        MenuScreen.C[0x8DD8 ^ 0x8C9E] = 0x8CFD ^ 0x8C9E;
        MenuScreen.C[0x9190 ^ 0x9091] = 0xFFFF6F66 ^ 0x9091;
        MenuScreen.C[0x82D8 ^ 0x838E] = 0xFFFF7C0B ^ 0x838E;
        MenuScreen.C[0xED4D ^ 0xEC76] = 0xFFFF13DB ^ 0xEC76;
        MenuScreen.C[0x1090F ^ 0x1083E] = 0xFFFEF7C9 ^ 0x1083E;
        MenuScreen.C[0x4AA9 ^ 0x4A6C] = 0x4A61 ^ 0x4A6C;
        MenuScreen.C[0xFE3F ^ 0xFE7E] = 0xFFFF01DE ^ 0xFE7E;
        MenuScreen.C[0xB86 ^ 0xAF0] = 0xA8D ^ 0xAF0;
        MenuScreen.C[0x394E ^ 0x39CA] = 0x399B ^ 0x39CA;
        MenuScreen.C[0x8015 ^ 0x8136] = 0xFFFF7E90 ^ 0x8136;
        MenuScreen.C[0x7108 ^ 0x71F3] = 0x719D ^ 0x71F3;
        MenuScreen.C[0xB752 ^ 0xB79D] = 0xB73B ^ 0xB79D;
        MenuScreen.C[0x10837 ^ 0x10922] = 0x10970 ^ 0x10922;
        MenuScreen.C[0x5966 ^ 0x59A6] = 0x596C ^ 0x59A6;
        MenuScreen.C[0x2312 ^ 0x2328] = 0x2302 ^ 0x2328;
        MenuScreen.C[0xD541 ^ 0xD43A] = 0xD41A ^ 0xD43A;
        MenuScreen.C[0xF961 ^ 0xF969] = 0xFFFF0695 ^ 0xF969;
        MenuScreen.C[0x7EE5 ^ 0x7E03] = 0x7E4E ^ 0x7E03;
        MenuScreen.C[0xCA96 ^ 0xCA7C] = 0xCACB ^ 0xCA7C;
        MenuScreen.C[0x9336 ^ 0x938B] = 0x93D1 ^ 0x938B;
        MenuScreen.C[0xCB70 ^ 0xCA6C] = 0xCA30 ^ 0xCA6C;
        MenuScreen.C[0x7682 ^ 0x7623] = 0xFFFF8980 ^ 0x7623;
        MenuScreen.C[0xB4C7 ^ 0xB458] = 0xFFFF4B8C ^ 0xB458;
        MenuScreen.C[0xE047 ^ 0xE14F] = 0xFFFF1EDF ^ 0xE14F;
        MenuScreen.C[0x1085F ^ 0x1097A] = 0xFFFEF693 ^ 0x1097A;
        MenuScreen.C[0x6451 ^ 0x643B] = 0x644A ^ 0x643B;
        MenuScreen.C[0x13BE ^ 0x1287] = 0x12CE ^ 0x1287;
        MenuScreen.C[0x3055 ^ 0x3178] = 0xFFFFCED1 ^ 0x3178;
        MenuScreen.C[0x8FCB ^ 0x8FAD] = 0xFFFF70CC ^ 0x8FAD;
        MenuScreen.C[0xD0C9 ^ 0xD0B6] = 0xD0C2 ^ 0xD0B6;
        MenuScreen.C[0xDE4E ^ 0xDEC7] = 0xFFFF2164 ^ 0xDEC7;
        MenuScreen.C[0xCE1F ^ 0xCE8C] = 0xFFFF31C0 ^ 0xCE8C;
        MenuScreen.C[0x64CE ^ 0x6407] = 0x64EF ^ 0x6407;
        MenuScreen.C[0xDCBF ^ 0xDCC6] = 0xFFFF235A ^ 0xDCC6;
        MenuScreen.C[0xCBEB ^ 0xCB53] = 0xCB59 ^ 0xCB53;
        MenuScreen.C[0x114 ^ 0x76] = 0xFFFFFF83 ^ 0x76;
        MenuScreen.C[0x10CCB ^ 0x10D98] = 0xFFFEF20F ^ 0x10D98;
        MenuScreen.C[0x2290 ^ 0x22B0] = 0xFFFFDD08 ^ 0x22B0;
        MenuScreen.C[0xF9A6 ^ 0xF821] = 0xFFFF07A8 ^ 0xF821;
        MenuScreen.C[0xE31B ^ 0xE229] = 0xE253 ^ 0xE229;
        MenuScreen.C[0x8693 ^ 0x86C9] = 0x865B ^ 0x86C9;
        MenuScreen.C[0xF04E ^ 0xF17A] = 0xF175 ^ 0xF17A;
        MenuScreen.C[0xAEA ^ 0xACB] = 0xFFFFF54F ^ 0xACB;
        MenuScreen.C[0xDF71 ^ 0xDF86] = 0xDFA5 ^ 0xDF86;
        MenuScreen.C[0xDE7F ^ 0xDE26] = 0xFFFF21A4 ^ 0xDE26;
        MenuScreen.C[0xBFA7 ^ 0xBF6A] = 0xFFFF4086 ^ 0xBF6A;
        MenuScreen.C[0xCE92 ^ 0xCE09] = 0xFFFF31AC ^ 0xCE09;
        MenuScreen.C[0x6D9C ^ 0x6CC4] = 0x6CA3 ^ 0x6CC4;
        MenuScreen.C[0xBC37 ^ 0xBC58] = 0xBC62 ^ 0xBC58;
        MenuScreen.C[0x10E04 ^ 0x10EA4] = 0x10ED4 ^ 0x10EA4;
        MenuScreen.C[0x9473 ^ 0x9563] = 0xFFFF6AEB ^ 0x9563;
        MenuScreen.C[0x1BA3 ^ 0x1B20] = 0x1B7F ^ 0x1B20;
        MenuScreen.C[0x98C2 ^ 0x982A] = 0xFFFF67C3 ^ 0x982A;
        MenuScreen.C[0x107D8 ^ 0x10737] = 0x10730 ^ 0x10737;
        MenuScreen.C[0xDFE6 ^ 0xDF59] = 0xDF22 ^ 0xDF59;
        MenuScreen.C[0x8858 ^ 0x887C] = 0x8843 ^ 0x887C;
        MenuScreen.C[0x42F9 ^ 0x4245] = 0x425A ^ 0x4245;
        MenuScreen.C[0xD200 ^ 0xD35A] = 0xFFFF2CBC ^ 0xD35A;
        MenuScreen.C[0xC551 ^ 0xC557] = 0xC578 ^ 0xC557;
        MenuScreen.C[0xA546 ^ 0xA536] = 0xA506 ^ 0xA536;
        MenuScreen.C[0xB79E ^ 0xB786] = 0xB7AC ^ 0xB786;
        MenuScreen.C[0x5044 ^ 0x5006] = 0x5035 ^ 0x5006;
        MenuScreen.C[0xD8C6 ^ 0xD9FE] = 0xD9B3 ^ 0xD9FE;
        MenuScreen.C[0x21D3 ^ 0x21F8] = 0xFFFFDE5C ^ 0x21F8;
        MenuScreen.C[0x81AD ^ 0x80A0] = 0xFFFF7F08 ^ 0x80A0;
        MenuScreen.C[0x2E4 ^ 0x387] = 0xFFFFFC29 ^ 0x387;
        MenuScreen.C[0x3BC9 ^ 0x3BD4] = 0x3BF8 ^ 0x3BD4;
        MenuScreen.C[0x6DC6 ^ 0x6D81] = 0x6D82 ^ 0x6D81;
        MenuScreen.C[0x3CBE ^ 0x3CCA] = 0x3CB2 ^ 0x3CCA;
        MenuScreen.C[0xD0AA ^ 0xD0FE] = 0xFFFF2F44 ^ 0xD0FE;
        MenuScreen.C[0x10E0C ^ 0x10E15] = 0x10E66 ^ 0x10E15;
        MenuScreen.C[0x8EBC ^ 0x8F83] = 0xFFFF7025 ^ 0x8F83;
        MenuScreen.C[0xCDC4 ^ 0xCDFC] = 0xCDBA ^ 0xCDFC;
        MenuScreen.C[0x6B ^ 0x113] = 0x141 ^ 0x113;
        MenuScreen.C[0xCCCA ^ 0xCDB5] = 0xFFFF327D ^ 0xCDB5;
        MenuScreen.C[0xFCC5 ^ 0xFC04] = 0xFC67 ^ 0xFC04;
        MenuScreen.C[0x3C83 ^ 0x3CF1] = 0xFFFFC393 ^ 0x3CF1;
        MenuScreen.C[0x7118 ^ 0x702E] = 0xFFFF8F81 ^ 0x702E;
        MenuScreen.C[0x4F97 ^ 0x4E88] = 0x4ED4 ^ 0x4E88;
        MenuScreen.C[0x35A3 ^ 0x352C] = 0xFFFFCADA ^ 0x352C;
        MenuScreen.C[0x2FA0 ^ 0x2F77] = 0x2F70 ^ 0x2F77;
        MenuScreen.C[0xA9C0 ^ 0xA993] = 0xFFFF5657 ^ 0xA993;
        MenuScreen.C[0x2BDE ^ 0x2B42] = 0xFFFFD47F ^ 0x2B42;
        MenuScreen.C[0xEBB2 ^ 0xEAAA] = 0xEAE7 ^ 0xEAAA;
        MenuScreen.C[0xEA66 ^ 0xEBE8] = 0xEBB6 ^ 0xEBE8;
        MenuScreen.C[0xDF43 ^ 0xDEC9] = 0xDEF1 ^ 0xDEC9;
        MenuScreen.C[0xC6AE ^ 0xC7C5] = 0xC7E6 ^ 0xC7C5;
        MenuScreen.C[0x9C7 ^ 0x952] = 0xFFFFF6B3 ^ 0x952;
        MenuScreen.C[0x484A ^ 0x494A] = 0x4979 ^ 0x494A;
        MenuScreen.C[0xDB95 ^ 0xDBC7] = 0xDBEE ^ 0xDBC7;
        MenuScreen.C[0x10855 ^ 0x108A5] = 0x10807 ^ 0x108A5;
        MenuScreen.C[0xE808 ^ 0xE844] = 0xFFFF17C7 ^ 0xE844;
        MenuScreen.C[0xE7E9 ^ 0xE662] = 0xFFFF19D7 ^ 0xE662;
        MenuScreen.C[0xFDE7 ^ 0xFC8A] = 0xFCAE ^ 0xFC8A;
        MenuScreen.C[0x5761 ^ 0x5700] = 0xFFFFA8F7 ^ 0x5700;
        MenuScreen.C[0x8B81 ^ 0x8BBE] = 0x8B87 ^ 0x8BBE;
        MenuScreen.C[0xC5 ^ 0x58] = 0xFFFFFFC5 ^ 0x58;
        MenuScreen.C[0xB5F5 ^ 0xB4B8] = 0xB4C6 ^ 0xB4B8;
        MenuScreen.C[0x4B7D ^ 0x4BB6] = 0x4BE9 ^ 0x4BB6;
        MenuScreen.C[0xC652 ^ 0xC683] = 0xC6F7 ^ 0xC683;
        MenuScreen.C[0x7DF2 ^ 0x7DF6] = 0xFFFF8239 ^ 0x7DF6;
        MenuScreen.C[0x5751 ^ 0x571C] = 0xFFFFA88C ^ 0x571C;
        MenuScreen.C[0xDC2A ^ 0xDC02] = 0xFFFF238E ^ 0xDC02;
        MenuScreen.C[0xF33A ^ 0xF3C6] = 0xFFFF0C06 ^ 0xF3C6;
        MenuScreen.C[0xCAB7 ^ 0xCAF9] = 0xCAFE ^ 0xCAF9;
        MenuScreen.C[0xA72B ^ 0xA75A] = 0xA74C ^ 0xA75A;
        MenuScreen.C[0x539 ^ 0x51F] = 0x554 ^ 0x51F;
        MenuScreen.C[0xEA9A ^ 0xEAC6] = 0xEADA ^ 0xEAC6;
        MenuScreen.C[0xEDAE ^ 0xEDAF] = 0xEDE9 ^ 0xEDAF;
        MenuScreen.C[0xA6C9 ^ 0xA689] = 0xA6D4 ^ 0xA689;
        MenuScreen.C[0x696B ^ 0x6908] = 0x696D ^ 0x6908;
        MenuScreen.C[0x144B ^ 0x1488] = 0xFFFFEB66 ^ 0x1488;
        MenuScreen.C[0xA884 ^ 0xA9A4] = 0xFFFF562F ^ 0xA9A4;
        MenuScreen.C[0x5001 ^ 0x50C6] = 0xFFFFAF0B ^ 0x50C6;
        MenuScreen.C[0x1CC8 ^ 0x1D91] = 0x1D97 ^ 0x1D91;
        MenuScreen.C[0x5204 ^ 0x5215] = 0x520E ^ 0x5215;
        MenuScreen.C[0xF883 ^ 0xF829] = 0xF876 ^ 0xF829;
        MenuScreen.C[0xC095 ^ 0xC04E] = 0xC065 ^ 0xC04E;
        MenuScreen.C[0x40B7 ^ 0x40BB] = 0x40FB ^ 0x40BB;
        MenuScreen.C[0x1BC3 ^ 0x1B43] = 0x1B09 ^ 0x1B43;
        MenuScreen.C[0xEF19 ^ 0xEF51] = 0xFFFF10D4 ^ 0xEF51;
        MenuScreen.C[0xCE83 ^ 0xCE1B] = 0xFFFF31BE ^ 0xCE1B;
        MenuScreen.C[0xC138 ^ 0xC1D1] = 0xFFFF3E16 ^ 0xC1D1;
        MenuScreen.C[0x75C5 ^ 0x7518] = 0x750F ^ 0x7518;
        MenuScreen.C[0x10CCB ^ 0x10C4D] = 0x10C09 ^ 0x10C4D;
        MenuScreen.C[0x2331 ^ 0x23D1] = 0xFFFFDC39 ^ 0x23D1;
        MenuScreen.C[0x9EC6 ^ 0x9E71] = 0xFFFF61B6 ^ 0x9E71;
        MenuScreen.C[0xED8 ^ 0xEDB] = 0xFFFFF1B6 ^ 0xEDB;
        MenuScreen.C[0xF410 ^ 0xF420] = 0xFFFF0B91 ^ 0xF420;
        MenuScreen.C[0x3EC6 ^ 0x3F89] = 0xFFFFC029 ^ 0x3F89;
        MenuScreen.C[0xC734 ^ 0xC632] = 0xC677 ^ 0xC632;
        MenuScreen.C[0xA108 ^ 0xA155] = 0xA16F ^ 0xA155;
        MenuScreen.C[0x507F ^ 0x50F4] = 0x50FA ^ 0x50F4;
        MenuScreen.C[0x2982 ^ 0x28C2] = 0x28E9 ^ 0x28C2;
        MenuScreen.C[0x645C ^ 0x6547] = 0xFFFF9A8F ^ 0x6547;
        MenuScreen.C[0xC49E ^ 0xC48A] = 0xFFFF3B61 ^ 0xC48A;
        MenuScreen.C[0xBA94 ^ 0xBA6D] = 0xBA37 ^ 0xBA6D;
        MenuScreen.C[0xB7AA ^ 0xB697] = 0xFFFF4901 ^ 0xB697;
        MenuScreen.C[0x9B27 ^ 0x9B9D] = 0x9BDF ^ 0x9B9D;
        MenuScreen.C[0x9F34 ^ 0x9E2E] = 0xFFFF6142 ^ 0x9E2E;
        MenuScreen.C[0x20C8 ^ 0x2145] = 0xFFFFDED7 ^ 0x2145;
        MenuScreen.C[0x21D3 ^ 0x20AA] = 0xFFFFDF0A ^ 0x20AA;
        MenuScreen.C[0x7BF9 ^ 0x7BE7] = 0x7B58 ^ 0x7BE7;
        MenuScreen.C[0xEA7A ^ 0xEAAF] = 0xFFFF1562 ^ 0xEAAF;
        MenuScreen.C[0x7730 ^ 0x779B] = 0x7798 ^ 0x779B;
        MenuScreen.C[0x59E8 ^ 0x5944] = 0x5974 ^ 0x5944;
        MenuScreen.C[0xCBBA ^ 0xCBAA] = 0xFFFF3404 ^ 0xCBAA;
        MenuScreen.C[0x3394 ^ 0x33F6] = 0xFFFFCC63 ^ 0x33F6;
        MenuScreen.C[0xB507 ^ 0xB484] = 0xFFFF4B77 ^ 0xB484;
        MenuScreen.C[0x7AF2 ^ 0x7BEF] = 0x7BD1 ^ 0x7BEF;
        MenuScreen.C[0x602D ^ 0x6050] = 0x601E ^ 0x6050;
        MenuScreen.C[0x4FB4 ^ 0x4FBE] = 0xFFFFB079 ^ 0x4FBE;
        MenuScreen.C[0xF461 ^ 0xF401] = 0xF443 ^ 0xF401;
        MenuScreen.C[0xB010 ^ 0xB0C8] = 0xB0AD ^ 0xB0C8;
        MenuScreen.C[0x3C18 ^ 0x3C1D] = 0x3C60 ^ 0x3C1D;
        MenuScreen.C[0x992C ^ 0x99C9] = 0x9998 ^ 0x99C9;
        MenuScreen.C[0x38B2 ^ 0x39A3] = 0xFFFFC66E ^ 0x39A3;
        MenuScreen.C[0xEED ^ 0xE5D] = 0xFFFFF1D8 ^ 0xE5D;
        MenuScreen.C[0xA022 ^ 0xA016] = 0xFFFF5FC1 ^ 0xA016;
        MenuScreen.C[0x243D ^ 0x2411] = 0x244E ^ 0x2411;
        MenuScreen.C[0x5721 ^ 0x5638] = 0x5677 ^ 0x5638;
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u001f\u0010\u0015J\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b \u0010\u0015J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b!\u0010\u0015J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\"\u0010\u0015J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b#\u0010\u0015J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b$\u0010\u0015J\u0088\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b%\u0010&J\u001b\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b)\u0010*J\u0011\u0010,\u001a\u00020+H\u00d6\u0081\u0004\u00a2\u0006\u0004\b,\u0010-J\u0011\u0010/\u001a\u00020.H\u00d6\u0081\u0004\u00a2\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b5\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b6\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b7\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b8\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b9\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b:\u0010\u0015R\u0017\u0010\f\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b;\u0010\u0015R\u0017\u0010\r\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b<\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b=\u0010\u0015\u00a8\u0006>"}, d2={"Lkotakbaz/rain/ui/menu/MenuScreen$AvatarPopupMetrics;", "", "", "scale", "width", "height", "headerHeight", "rowHeight", "margin", "headerTextSize", "rowTextSize", "settingHeight", "settingGap", "cornerRadius", "headerCornerRadius", "<init>", "(FFFFFFFFFFFF)V", "value", "scaled", "(F)F", "rowLeadingSize", "()F", "rowLeadingGap", "rowDividerWidth", "settingsBlockHeight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(FFFFFFFFFFFF)Lkotakbaz/rain/ui/menu/MenuScreen$AvatarPopupMetrics;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "getScale", "getWidth", "getHeight", "getHeaderHeight", "getRowHeight", "getMargin", "getHeaderTextSize", "getRowTextSize", "getSettingHeight", "getSettingGap", "getCornerRadius", "getHeaderCornerRadius", "rain-visuals"})
    private static final class AvatarPopupMetrics {
        private final float scale;
        private final float width;
        private final float height;
        private final float headerHeight;
        private final float rowHeight;
        private final float margin;
        private final float headerTextSize;
        private final float rowTextSize;
        private final float settingHeight;
        private final float settingGap;
        private final float cornerRadius;
        private final float headerCornerRadius;
        private static Object[] a;
        private static Object b;
        private static Object[] B;
        private static Object[] A;
        private static Object[] c;
        public static int[] C;

        public AvatarPopupMetrics(float scale, float width2, float height, float headerHeight, float rowHeight, float margin, float headerTextSize, float rowTextSize, float settingHeight, float settingGap, float cornerRadius, float headerCornerRadius) {
            this.scale = scale;
            this.width = width2;
            this.height = height;
            this.headerHeight = headerHeight;
            this.rowHeight = rowHeight;
            this.margin = margin;
            this.headerTextSize = headerTextSize;
            this.rowTextSize = rowTextSize;
            this.settingHeight = settingHeight;
            this.settingGap = settingGap;
            this.cornerRadius = cornerRadius;
            this.headerCornerRadius = headerCornerRadius;
        }

        public final float getScale() {
            return this.scale;
        }

        public final float getWidth() {
            return this.width;
        }

        public final float getHeight() {
            return this.height;
        }

        public final float getHeaderHeight() {
            return this.headerHeight;
        }

        public final float getRowHeight() {
            return this.rowHeight;
        }

        public final float getMargin() {
            return this.margin;
        }

        public final float getHeaderTextSize() {
            return this.headerTextSize;
        }

        public final float getRowTextSize() {
            return this.rowTextSize;
        }

        public final float getSettingHeight() {
            return this.settingHeight;
        }

        public final float getSettingGap() {
            return this.settingGap;
        }

        public final float getCornerRadius() {
            return this.cornerRadius;
        }

        public final float getHeaderCornerRadius() {
            return this.headerCornerRadius;
        }

        public final float scaled(float value2) {
            return value2 * this.scale;
        }

        public final float rowLeadingSize() {
            return this.rowTextSize + this.scaled(1.0f);
        }

        public final float rowLeadingGap() {
            return this.scaled(6.0f);
        }

        public final float rowDividerWidth() {
            return this.scaled(1.2f);
        }

        public final float settingsBlockHeight() {
            int n2 = C[0];
            n2 -= C[1];
            int n3 = C[3];
            n3 ^= C[4];
            int n4 = C[6];
            n4 ^= C[7];
            return this.settingHeight * (float)(n2 += C[2]) + this.settingGap * (float)RangesKt.coerceAtLeast(n3 += C[5], n4 -= C[8]);
        }

        public final float component1() {
            return this.scale;
        }

        public final float component2() {
            return this.width;
        }

        public final float component3() {
            return this.height;
        }

        public final float component4() {
            return this.headerHeight;
        }

        public final float component5() {
            return this.rowHeight;
        }

        public final float component6() {
            return this.margin;
        }

        public final float component7() {
            return this.headerTextSize;
        }

        public final float component8() {
            return this.rowTextSize;
        }

        public final float component9() {
            return this.settingHeight;
        }

        public final float component10() {
            return this.settingGap;
        }

        public final float component11() {
            return this.cornerRadius;
        }

        public final float component12() {
            return this.headerCornerRadius;
        }

        @NotNull
        public final AvatarPopupMetrics copy(float scale, float width2, float height, float headerHeight, float rowHeight, float margin, float headerTextSize, float rowTextSize, float settingHeight, float settingGap, float cornerRadius, float headerCornerRadius) {
            return new AvatarPopupMetrics(scale, width2, height, headerHeight, rowHeight, margin, headerTextSize, rowTextSize, settingHeight, settingGap, cornerRadius, headerCornerRadius);
        }

        public static /* synthetic */ AvatarPopupMetrics copy$default(AvatarPopupMetrics avatarPopupMetrics, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int n2, Object object) {
            int n3 = C[9];
            n3 -= C[10];
            if ((n2 & (n3 += C[11])) != 0) {
                f2 = avatarPopupMetrics.scale;
            }
            int n4 = C[12];
            n4 += C[13];
            if ((n2 & (n4 += C[14])) != 0) {
                f3 = avatarPopupMetrics.width;
            }
            int n5 = C[15];
            n5 -= C[16];
            if ((n2 & (n5 -= C[17])) != 0) {
                f4 = avatarPopupMetrics.height;
            }
            int n6 = C[18];
            n6 -= C[19];
            if ((n2 & (n6 -= C[20])) != 0) {
                f5 = avatarPopupMetrics.headerHeight;
            }
            int n7 = C[21];
            n7 ^= C[22];
            if ((n2 & (n7 ^= C[23])) != 0) {
                f6 = avatarPopupMetrics.rowHeight;
            }
            int n8 = C[24];
            n8 -= C[25];
            if ((n2 & (n8 += C[26])) != 0) {
                f7 = avatarPopupMetrics.margin;
            }
            int n9 = C[27];
            n9 -= C[28];
            if ((n2 & (n9 ^= C[29])) != 0) {
                f8 = avatarPopupMetrics.headerTextSize;
            }
            int n10 = C[30];
            n10 ^= C[31];
            if ((n2 & (n10 += C[32])) != 0) {
                f9 = avatarPopupMetrics.rowTextSize;
            }
            int n11 = C[33];
            n11 += C[34];
            if ((n2 & (n11 -= C[35])) != 0) {
                f10 = avatarPopupMetrics.settingHeight;
            }
            int n12 = C[36];
            n12 -= C[37];
            if ((n2 & (n12 += C[38])) != 0) {
                f11 = avatarPopupMetrics.settingGap;
            }
            int n13 = C[39];
            n13 ^= C[40];
            if ((n2 & (n13 -= C[41])) != 0) {
                f12 = avatarPopupMetrics.cornerRadius;
            }
            int n14 = C[42];
            n14 -= C[43];
            if ((n2 & (n14 ^= C[44])) != 0) {
                f13 = avatarPopupMetrics.headerCornerRadius;
            }
            return avatarPopupMetrics.copy(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13);
        }

        @NotNull
        public String toString() {
            float f2 = this.headerCornerRadius;
            float f3 = this.cornerRadius;
            float f4 = this.settingGap;
            float f5 = this.settingHeight;
            float f6 = this.rowTextSize;
            float f7 = this.headerTextSize;
            float f8 = this.margin;
            float f9 = this.rowHeight;
            float f10 = this.headerHeight;
            float f11 = this.height;
            float f12 = this.width;
            float f13 = this.scale;
            int n2 = C[45];
            n2 += C[46];
            n2 += C[47];
            int n3 = C[48];
            n3 -= C[49];
            n3 += C[50];
            int n4 = C[51];
            n4 ^= C[52];
            n4 ^= C[53];
            int n5 = C[54];
            n5 ^= C[55];
            n5 ^= C[56];
            int n6 = C[57];
            n6 ^= C[58];
            n6 ^= C[59];
            int n7 = C[60];
            n7 ^= C[61];
            n7 -= C[62];
            int n8 = C[63];
            n8 -= C[64];
            n8 ^= C[65];
            int n9 = C[66];
            n9 += C[67];
            n9 += C[68];
            int n10 = C[69];
            n10 -= C[70];
            n10 -= C[71];
            int n11 = C[72];
            n11 -= C[73];
            n11 ^= C[74];
            int n12 = C[75];
            n12 -= C[76];
            n12 ^= C[77];
            int n13 = C[78];
            n13 -= C[79];
            n13 += C[80];
            int n14 = C[81];
            n14 ^= C[82];
            n14 += C[83];
            int n15 = C[84];
            n15 += C[85];
            n15 -= C[86];
            int n16 = C[87];
            n16 ^= C[88];
            int n17 = C[90];
            n17 ^= C[91];
            int n18 = C[93];
            n18 ^= C[94];
            return (String)a[n2] + (String)a[n3] + f13 + (String)a[n4] + f12 + (String)a[n5] + f11 + (String)a[n6] + f10 + (String)a[n7] + f9 + (String)a[n8] + f8 + ((String)a[n9] + (String)a[n10]) + f7 + (String)a[n11] + f6 + ((String)a[n12] + (String)a[n13]) + f5 + (String)a[n14] + f4 + (String)a[n15] + f3 + ((String)a[n16 -= C[89]] + (String)a[n17 += C[92]]) + f2 + (String)a[n18 -= C[95]];
        }

        public int hashCode() {
            long l2 = 2755620188388785318L;
            long l3 = 2951241269712357920L;
            long l4 = 9110110408847932051L;
            long l5 = -6370640230848011902L;
            long l6 = 2495914557041314247L;
            long l7 = 8743437622984887964L;
            long l8 = 1848840728000587077L;
            long l9 = 6523345935737415110L;
            long l10 = -6804948312842233712L;
            long l11 = -3766224974806435830L;
            long l12 = 2166305373187276893L;
            long l13 = 5260877934706287861L;
            int n2 = C[96];
            n2 -= C[97];
            long l14 = l13;
            int n3 = C[99];
            n3 -= C[100];
            l13 = l14 ^ ((long)Float.hashCode(this.scale) << (n2 -= C[98]) ^ l14) & -1L << (n3 += C[101]);
            int n4 = C[102];
            n4 += C[103];
            n4 ^= C[104];
            int n5 = C[105];
            n5 -= C[106];
            n5 ^= C[107];
            int n6 = C[108];
            n6 -= C[109];
            long l15 = l13;
            int n7 = C[111];
            n7 -= C[112];
            l13 = l15 ^ ((long)((int)(l13 >>> n4) * n5 + Float.hashCode(this.width)) << (n6 -= C[110]) ^ l15) & -1L << (n7 -= C[113]);
            int n8 = C[114];
            n8 += C[115];
            n8 -= C[116];
            int n9 = C[117];
            n9 -= C[118];
            n9 += C[119];
            int n10 = C[120];
            n10 ^= C[121];
            long l16 = l13;
            int n11 = C[123];
            n11 -= C[124];
            l13 = l16 ^ ((long)((int)(l13 >>> n8) * n9 + Float.hashCode(this.height)) << (n10 += C[122]) ^ l16) & -1L << (n11 += C[125]);
            int n12 = C[126];
            n12 ^= C[127];
            n12 -= C[128];
            int n13 = C[129];
            n13 ^= C[130];
            n13 += C[131];
            int n14 = C[132];
            n14 += C[133];
            long l17 = l13;
            int n15 = C[135];
            n15 ^= C[136];
            l13 = l17 ^ ((long)((int)(l13 >>> n12) * n13 + Float.hashCode(this.headerHeight)) << (n14 += C[134]) ^ l17) & -1L << (n15 -= C[137]);
            int n16 = C[138];
            n16 += C[139];
            n16 -= C[140];
            int n17 = C[141];
            n17 ^= C[142];
            n17 += C[143];
            int n18 = C[144];
            n18 += C[145];
            long l18 = l13;
            int n19 = C[147];
            n19 -= C[148];
            l13 = l18 ^ ((long)((int)(l13 >>> n16) * n17 + Float.hashCode(this.rowHeight)) << (n18 += C[146]) ^ l18) & -1L << (n19 -= C[149]);
            int n20 = C[150];
            n20 ^= C[151];
            n20 -= C[152];
            int n21 = C[153];
            n21 ^= C[154];
            n21 ^= C[155];
            int n22 = C[156];
            n22 -= C[157];
            long l19 = l13;
            int n23 = C[159];
            n23 -= C[160];
            l13 = l19 ^ ((long)((int)(l13 >>> n20) * n21 + Float.hashCode(this.margin)) << (n22 -= C[158]) ^ l19) & -1L << (n23 += C[161]);
            int n24 = C[162];
            n24 -= C[163];
            n24 += C[164];
            int n25 = C[165];
            n25 -= C[166];
            n25 += C[167];
            int n26 = C[168];
            n26 ^= C[169];
            long l20 = l13;
            int n27 = C[171];
            n27 ^= C[172];
            l13 = l20 ^ ((long)((int)(l13 >>> n24) * n25 + Float.hashCode(this.headerTextSize)) << (n26 += C[170]) ^ l20) & -1L << (n27 ^= C[173]);
            int n28 = C[174];
            n28 ^= C[175];
            n28 ^= C[176];
            int n29 = C[177];
            n29 += C[178];
            n29 ^= C[179];
            int n30 = C[180];
            n30 ^= C[181];
            long l21 = l13;
            int n31 = C[183];
            n31 ^= C[184];
            l13 = l21 ^ ((long)((int)(l13 >>> n28) * n29 + Float.hashCode(this.rowTextSize)) << (n30 += C[182]) ^ l21) & -1L << (n31 -= C[185]);
            int n32 = C[186];
            n32 ^= C[187];
            n32 += C[188];
            int n33 = C[189];
            n33 += C[190];
            n33 ^= C[191];
            int n34 = C[192];
            n34 ^= C[193];
            long l22 = l13;
            int n35 = C[195];
            n35 ^= C[196];
            l13 = l22 ^ ((long)((int)(l13 >>> n32) * n33 + Float.hashCode(this.settingHeight)) << (n34 += C[194]) ^ l22) & -1L << (n35 ^= C[197]);
            int n36 = C[198];
            n36 ^= C[199];
            n36 += C[200];
            int n37 = C[201];
            n37 ^= C[202];
            n37 += C[203];
            int n38 = C[204];
            n38 ^= C[205];
            long l23 = l13;
            int n39 = C[207];
            n39 += C[208];
            l13 = l23 ^ ((long)((int)(l13 >>> n36) * n37 + Float.hashCode(this.settingGap)) << (n38 ^= C[206]) ^ l23) & -1L << (n39 += C[209]);
            int n40 = C[210];
            n40 ^= C[211];
            n40 += C[212];
            int n41 = C[213];
            n41 -= C[214];
            n41 ^= C[215];
            int n42 = C[216];
            n42 += C[217];
            long l24 = l13;
            int n43 = C[219];
            n43 -= C[220];
            l13 = l24 ^ ((long)((int)(l13 >>> n40) * n41 + Float.hashCode(this.cornerRadius)) << (n42 ^= C[218]) ^ l24) & -1L << (n43 -= C[221]);
            int n44 = C[222];
            n44 -= C[223];
            n44 -= C[224];
            int n45 = C[225];
            n45 ^= C[226];
            n45 += C[227];
            int n46 = C[228];
            n46 ^= C[229];
            long l25 = l13;
            int n47 = C[231];
            n47 -= C[232];
            l13 = l25 ^ ((long)((int)(l13 >>> n44) * n45 + Float.hashCode(this.headerCornerRadius)) << (n46 ^= C[230]) ^ l25) & -1L << (n47 ^= C[233]);
            int n48 = C[234];
            n48 ^= C[235];
            return (int)(l13 >>> (n48 -= C[236]));
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                boolean bl = C[237];
                bl ^= C[238];
                return bl -= C[239];
            }
            if (!(other instanceof AvatarPopupMetrics)) {
                boolean bl = C[240];
                bl += C[241];
                return bl += C[242];
            }
            AvatarPopupMetrics avatarPopupMetrics = (AvatarPopupMetrics)other;
            if (Float.compare(this.scale, avatarPopupMetrics.scale) != 0) {
                boolean bl = C[243];
                bl ^= C[244];
                return bl -= C[245];
            }
            if (Float.compare(this.width, avatarPopupMetrics.width) != 0) {
                boolean bl = C[246];
                bl += C[247];
                return bl -= C[248];
            }
            if (Float.compare(this.height, avatarPopupMetrics.height) != 0) {
                boolean bl = C[249];
                bl -= C[250];
                return bl += C[251];
            }
            if (Float.compare(this.headerHeight, avatarPopupMetrics.headerHeight) != 0) {
                boolean bl = C[252];
                bl -= C[253];
                return bl -= C[254];
            }
            if (Float.compare(this.rowHeight, avatarPopupMetrics.rowHeight) != 0) {
                boolean bl = C[255];
                bl += C[256];
                return bl -= C[257];
            }
            if (Float.compare(this.margin, avatarPopupMetrics.margin) != 0) {
                boolean bl = C[258];
                bl ^= C[259];
                return bl ^= C[260];
            }
            if (Float.compare(this.headerTextSize, avatarPopupMetrics.headerTextSize) != 0) {
                boolean bl = C[261];
                bl ^= C[262];
                return bl -= C[263];
            }
            if (Float.compare(this.rowTextSize, avatarPopupMetrics.rowTextSize) != 0) {
                boolean bl = C[264];
                bl -= C[265];
                return bl -= C[266];
            }
            if (Float.compare(this.settingHeight, avatarPopupMetrics.settingHeight) != 0) {
                boolean bl = C[267];
                bl -= C[268];
                return bl -= C[269];
            }
            if (Float.compare(this.settingGap, avatarPopupMetrics.settingGap) != 0) {
                boolean bl = C[270];
                bl ^= C[271];
                return bl += C[272];
            }
            if (Float.compare(this.cornerRadius, avatarPopupMetrics.cornerRadius) != 0) {
                boolean bl = C[273];
                bl += C[274];
                return bl += C[275];
            }
            if (Float.compare(this.headerCornerRadius, avatarPopupMetrics.headerCornerRadius) != 0) {
                boolean bl = C[276];
                bl ^= C[277];
                return bl -= C[278];
            }
            boolean bl = C[279];
            bl += C[280];
            return bl += C[281];
        }

        static {
            AvatarPopupMetrics.b();
            long l2 = 2911995215289295498L;
            long l3 = 6525902405282526642L;
            long l4 = 7534375369050444110L;
            long l5 = -1595419797377821356L;
            long l6 = -4201454287148986958L;
            long l7 = -5780224478329111950L;
            long l8 = -242470216004625088L;
            long l9 = 5607076516736833016L;
            long l10 = -2210413676866763015L;
            long l11 = -3806437838664934596L;
            long l12 = 2141615912068148107L;
            long l13 = -407247405049334449L;
            long l14 = -8612399313939075901L;
            long l15 = 6408736317919788437L;
            int n2 = C[282];
            n2 -= C[283];
            a = new Object[n2 -= C[284]];
            long l16 = l15;
            int n3 = C[285];
            n3 -= C[286];
            l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= C[287]);
            Object[] objectArray = new Object[C[288]];
            objectArray[AvatarPopupMetrics.C[289]] = A;
            objectArray[AvatarPopupMetrics.C[290]] = C[291];
            int n4 = C[292];
            Object object = AvatarPopupMetrics.A()[C[293]];
            if (object == null) {
                char[] cArray = "\u36ed\u36d4\u37ac\u36d1\u36e7\u3738\u3733\u36d7\u36e0\u36d8\u37a8\u3705\u3736\u3736\u36f4\u3736\u36f4\u3734\u373d\u36e9\u36f1\u36e4\u37a7\u36e9\u370a\u3705\u36ed\u3705\u3734\u370d\u36d1\u370a\u36fe\u3708\u36e5\u3706\u3706\u36e4\u370d\u37ab\u36d2\u36de\u37a6\u37a7\u36d5\u3736\u36d1\u37ab\u3709\u36d3\u373f\u373f\u36d1\u36d7\u3731\u37a5\u36f4\u36d4\u3736\u36f2\u36d5\u36f3\u36e5\u3707\u36d5\u36d1\u3742\u36d5\u36d7\u370d\u36d5\u373c\u36d3\u3734\u36eb\u36d4\u36dd\u3731\u36f1\u3732\u36ea\u36d5\u37a7\u3709\u36df\u3740\u3744\u3707\u36dd\u37ac\u36df\u373e\u36fe\u36eb\u36d6\u370d\u3732\u3736\u3744\u370c\u3705\u36e7\u36e6\u36d8\u3735\u36e9\u36e7\u36eb\u36df\u36e1\u3734\u3707\u370b\u3744\u36dd\u3744\u3737\u3740\u36f3\u3707\u37ac\u36ec\u3737\u3742\u36e5\u36e9\u3743\u37aa\u36f4\u36f3\u36d3\u36e2\u373f\u373d\u36eb\u37a7\u36ed\u36e8\u36e8\u37a8\u36dd\u36f1\u3737\u37a5\u36e9\u37a5\u3741\u3735\u3732\u3706\u37a8\u370b\u36e7\u3706\u36df\u36d5\u36eb\u36e1\u370b\u36e2\u36fe\u3735\u3709\u3732\u3706\u3708\u37ac\u36e6\u3738\u3731\u37aa\u3736\u373c\u3706\u36d7\u3742\u3707\u36f4\u36df\u36d2\u36eb\u3737\u37ab\u36e1\u36e9\u36f4\u36fe\u3735\u3737\u370b\u36e3\u373e\u37ab\u37aa\u3733\u36df\u3738\u3740\u3741\u36e9\u36ea\u36df\u3738\u36e0\u36e5\u3734\u36de\u36fe\u36dd\u37ac\u36d4\u373f\u36d4\u36ea\u3734\u36e6\u37a8\u36e4\u36dd\u3735\u36d3\u36dc\u3708\u3707\u37aa\u3738\u3741\u3705\u36d3\u37a7\u3708\u3743\u37ab\u36d6\u36d3\u3708\u370a\u36d4\u3732\u373e\u36d8\u370d\u36e1\u36d3\u3736\u36d3\u37a8\u36e6\u3706\u3738\u370c\u3731\u36dd\u37ab\u3708\u370b\u3705\u3708\u370c\u36dc\u3741\u373c\u3741\u3741\u3708\u3736\u3706\u3705\u373d\u3708\u36e0\u370d\u36ed\u3732\u36e7\u37ab\u3744\u37aa\u36dd\u37ac\u3731\u36eb\u37a5\u36e4\u36e4\u37a7\u3742\u36ea\u3731\u36f3\u3742\u36e9\u36e7\u3732\u36d8\u36e3\u3708\u3708\u36e4\u3705\u36d3\u36d3\u36ec\u373f\u36e2\u36d6\u3705\u36e4\u3733\u3733\u36ea\u36f2\u373f\u36e4\u37a8\u37aa\u36e0\u36e6\u36f2\u36d2".toCharArray();
                for (int i2 = C[294]; i2 < C[295]; ++i2) {
                    int n5 = cArray[i2];
                    n5 -= C[296];
                    n5 ^= C[297];
                    n5 += C[298];
                    n5 -= C[299];
                    n5 += C[300];
                    n5 -= C[301];
                    n5 -= C[302];
                    n5 ^= C[303];
                    n5 -= C[304];
                    n5 += C[305];
                    n5 -= C[306];
                    cArray[i2] = (char)(n5 -= C[307]);
                }
                object = AvatarPopupMetrics.A()[AvatarPopupMetrics.C[308]] = new String(cArray);
            }
            objectArray[n4] = (String)object;
            char[] cArray = ((String)AvatarPopupMetrics.a(objectArray)).toCharArray();
            long l17 = l6;
            int n6 = C[309];
            n6 ^= C[310];
            l6 = l17 ^ (0xD100000000L ^ l17) & -1L << (n6 += C[311]);
            long l18 = l13;
            int n7 = C[312];
            n7 += C[313];
            l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= C[314]);
            while (true) {
                int n8 = C[315];
                n8 += C[316];
                if ((int)l13 >= (int)(l6 >>> (n8 -= C[317]))) break;
                int n9 = (int)l13;
                long l19 = l13;
                int n10 = C[318];
                n10 += C[319];
                int n11 = C[321];
                n11 ^= C[322];
                l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= C[320])) & -1L >>> (n11 += C[323]);
                long l20 = l9;
                int n12 = C[324];
                n12 += C[325];
                l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= C[326]);
                int n13 = (int)l13;
                long l21 = l13;
                int n14 = C[327];
                n14 -= C[328];
                int n15 = C[330];
                l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= C[329])) & -1L >>> (n15 -= C[331]);
                int n16 = C[332];
                n16 += C[333];
                long l22 = l10;
                int n17 = C[335];
                n17 -= C[336];
                l10 = l22 ^ ((long)cArray[n13] << (n16 -= C[334]) ^ l22) & -1L << (n17 += C[337]);
                int n18 = C[338];
                n18 ^= C[339];
                n18 -= C[340];
                int n19 = C[341];
                n19 += C[342];
                long l23 = l12;
                int n20 = C[344];
                n20 ^= C[345];
                l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= C[343]))) ^ l23) & -1L >>> (n20 -= C[346]);
                char[] cArray2 = new char[(int)l12];
                long l24 = l14;
                int n21 = C[347];
                n21 -= C[348];
                l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= C[349]);
                while (true) {
                    int n22 = C[350];
                    n22 += C[351];
                    if ((int)(l14 >>> (n22 -= C[352])) >= (int)l12) break;
                    int n23 = C[353];
                    n23 ^= C[354];
                    int n24 = C[356];
                    n24 += C[357];
                    cArray2[(int)(l14 >>> (n23 += AvatarPopupMetrics.C[355]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= C[358]))];
                    l14 += 0x100000000L;
                }
                int n25 = C[359];
                n25 -= C[360];
                int n26 = (int)(l15 >>> (n25 ^= C[361]));
                l15 += 0x100000000L;
                AvatarPopupMetrics.a[n26] = new String(cArray2);
                long l25 = l13;
                int n27 = C[362];
                n27 += C[363];
                l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= C[364]);
            }
        }

        public static Object a(Object[] object) {
            Object object2;
            int n2 = (Integer)object[C[365]];
            String string = (String)object[C[366]];
            object = object[C[367]];
            Object[] objectArray = B;
            if (B == null) {
                objectArray = B = new Object[C[368]];
            }
            if ((object2 = objectArray[n2]) == null) {
                Object object3 = object;
                if (object == null) {
                    Object[] objectArray2 = new Object[C[369]];
                    A = objectArray2;
                    object3 = objectArray2;
                    byte[] byArray = new byte[C[371] ^ C[372]];
                    byArray[AvatarPopupMetrics.C[373] ^ AvatarPopupMetrics.C[374]] = C[375] ^ C[376];
                    byArray[AvatarPopupMetrics.C[377] ^ AvatarPopupMetrics.C[378]] = C[379] ^ C[380];
                    byArray[AvatarPopupMetrics.C[381] ^ AvatarPopupMetrics.C[382]] = C[383] ^ C[384];
                    byArray[AvatarPopupMetrics.C[385] ^ AvatarPopupMetrics.C[386]] = C[387] ^ C[388];
                    byArray[AvatarPopupMetrics.C[389] ^ AvatarPopupMetrics.C[390]] = C[391] ^ C[392];
                    byArray[AvatarPopupMetrics.C[393] ^ AvatarPopupMetrics.C[394]] = C[395] ^ C[396];
                    byArray[AvatarPopupMetrics.C[397] ^ AvatarPopupMetrics.C[398]] = C[399] ^ 0xC0D7;
                    byArray[0x2B8C ^ 0x2B8C] = 0x2B91 ^ 0x2B8C;
                    byArray[0xA65 ^ 0xA62] = 0xA03 ^ 0xA62;
                    byArray[0x9006 ^ 0x9008] = 0x9069 ^ 0x9008;
                    byArray[0x8E ^ 0x87] = 0xFFFFFF2B ^ 0x87;
                    byArray[0xE4D9 ^ 0xE4D6] = 0xE4F1 ^ 0xE4D6;
                    byArray[0x600C ^ 0x6001] = 0x6011 ^ 0x6001;
                    byArray[0x10462 ^ 0x10460] = 0x1045B ^ 0x10460;
                    byArray[0xAFB1 ^ 0xAFBB] = 0xAF90 ^ 0xAFBB;
                    byArray[0xD2B2 ^ 0xD2BA] = 0xFFFF2D46 ^ 0xD2BA;
                    objectArray2[AvatarPopupMetrics.C[370]] = byArray;
                }
                byte[] byArray = (byte[])object3[0];
                if (b == null) {
                    byte[] byArray2 = new byte[0x871C ^ 0x873C];
                    byArray2[0xE92D ^ 0xE92E] = 0xFFFF16DE ^ 0xE92E;
                    byArray2[0x17A3 ^ 0x17AD] = 0x17BF ^ 0x17AD;
                    byArray2[0xFA7D ^ 0xFA7C] = 0xFA5C ^ 0xFA7C;
                    byArray2[0xF48E ^ 0xF497] = 0xFFFF0B4A ^ 0xF497;
                    byArray2[0xFA56 ^ 0xFA4D] = 0xFFFF05E9 ^ 0xFA4D;
                    byArray2[0x655A ^ 0x654F] = 0xFFFF9AD1 ^ 0x654F;
                    byArray2[0xB0AB ^ 0xB0AB] = 0xB08C ^ 0xB0AB;
                    byArray2[0x4879 ^ 0x4863] = 0x484A ^ 0x4863;
                    byArray2[0x29A9 ^ 0x29B7] = 0x29DC ^ 0x29B7;
                    byArray2[0xEAF1 ^ 0xEAFC] = 0xEA8D ^ 0xEAFC;
                    byArray2[0x6CDF ^ 0x6CDB] = 0x6CBE ^ 0x6CDB;
                    byArray2[0x273B ^ 0x272D] = 0xFFFFD88B ^ 0x272D;
                    byArray2[0x4E60 ^ 0x4E78] = 0x4E41 ^ 0x4E78;
                    byArray2[0x45D6 ^ 0x45DC] = 0x45AC ^ 0x45DC;
                    byArray2[0x1D6F ^ 0x1D7B] = 0x1D6C ^ 0x1D7B;
                    byArray2[0x47DE ^ 0x47CC] = 0xFFFFB810 ^ 0x47CC;
                    byArray2[0x2230 ^ 0x2223] = 0x221F ^ 0x2223;
                    byArray2[0x5F89 ^ 0x5F8E] = 0x5F95 ^ 0x5F8E;
                    byArray2[0x985D ^ 0x9842] = 0x982A ^ 0x9842;
                    byArray2[0xDB7F ^ 0xDB77] = 0xDB29 ^ 0xDB77;
                    byArray2[0xF77 ^ 0xF6B] = 0xF53 ^ 0xF6B;
                    byArray2[0x983D ^ 0x9834] = 0x985B ^ 0x9834;
                    byArray2[0xCF2A ^ 0xCF2F] = 0xCF07 ^ 0xCF2F;
                    byArray2[0xC74 ^ 0xC78] = 0xFFFFF38E ^ 0xC78;
                    byArray2[0x15BF ^ 0x15BD] = 0xFFFFEA14 ^ 0x15BD;
                    byArray2[0x69A2 ^ 0x69AD] = 0x6989 ^ 0x69AD;
                    byArray2[0x18A0 ^ 0x18B7] = 0xFFFFE71C ^ 0x18B7;
                    byArray2[0x3BED ^ 0x3BF0] = 0x3B89 ^ 0x3BF0;
                    byArray2[0x60B9 ^ 0x60B2] = 0x609E ^ 0x60B2;
                    byArray2[0xFF9 ^ 0xFE9] = 0xFFFFF003 ^ 0xFE9;
                    byArray2[0x10E40 ^ 0x10E51] = 0xFFFEF1E3 ^ 0x10E51;
                    byArray2[0x65B8 ^ 0x65BE] = 0xFFFF9A70 ^ 0x65BE;
                    byte[] byArray3 = new byte[byArray.length + byArray2.length];
                    System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                    System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                    Object object4 = AvatarPopupMetrics.A()[1];
                    if (object4 == null) {
                        char[] cArray = "\u24f9\u252b\u24fe\u24f5\u24f7\u251b\u2502\u23d4\u24e5\u24f1\u2511\u23e0\u250c\u23d6\u2506\u2511\u252c\u251c".toCharArray();
                        for (int i2 = 0; i2 < 18; ++i2) {
                            int n3 = cArray[i2];
                            n3 -= 17408;
                            n3 += 6048;
                            n3 += 22309;
                            n3 += 14597;
                            n3 += 56966;
                            n3 += 37997;
                            n3 -= 15823;
                            n3 -= 56144;
                            n3 ^= 0x370;
                            n3 += 23985;
                            n3 ^= 0x8515;
                            n3 -= 4021;
                            n3 += 42231;
                            cArray[i2] = (char)(n3 -= 20351);
                        }
                        object4 = AvatarPopupMetrics.A()[1] = new String(cArray);
                    }
                    SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                    byte[] byArray4 = new byte[16];
                    byArray4[2] = -13;
                    byArray4[6] = 97;
                    byArray4[11] = 109;
                    byArray4[1] = -20;
                    byArray4[13] = 93;
                    byArray4[10] = -72;
                    byArray4[0] = 46;
                    byArray4[15] = -15;
                    byArray4[14] = -55;
                    byArray4[4] = 13;
                    byArray4[3] = -104;
                    byArray4[8] = 31;
                    byArray4[12] = -28;
                    byArray4[7] = -59;
                    byArray4[5] = -37;
                    byArray4[9] = -58;
                    PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 23, 256);
                    byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                    Object object5 = AvatarPopupMetrics.A()[2];
                    if (object5 == null) {
                        char[] cArray = "\ua3d5\ua3e1\ua2ab".toCharArray();
                        for (int i3 = 0; i3 < 3; ++i3) {
                            int n4 = cArray[i3];
                            n4 -= 62083;
                            n4 ^= 0x2325;
                            n4 += 35943;
                            n4 += 7560;
                            n4 += 52426;
                            n4 ^= 0x954C;
                            n4 -= 43373;
                            n4 += 41845;
                            n4 ^= 0xED15;
                            n4 ^= 0x5295;
                            n4 ^= 0x78D9;
                            n4 -= 48799;
                            cArray[i3] = (char)(n4 ^= 0x937F);
                        }
                        object5 = AvatarPopupMetrics.A()[2] = new String(cArray);
                    }
                    b = new SecretKeySpec(byArray5, (String)object5);
                }
                byte[] byArray6 = Base64.getDecoder().decode(string);
                byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
                byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
                Object object6 = AvatarPopupMetrics.A()[3];
                if (object6 == null) {
                    char[] cArray = "\ua4e8\ua4ec\ua4fe\ua49a\ua4ee\ua4e7\ua4ee\ua49a\ua4f9\ua4f6\ua4ee\ua4fe\ua49c\ua4f9\ua4c8\ua4cd\ua4cd\ua4d0\ua4d3\ua4d2".toCharArray();
                    for (int i4 = 0; i4 < 20; ++i4) {
                        int n5 = cArray[i4];
                        n5 += 59492;
                        n5 += 7509;
                        n5 += 31878;
                        n5 += 231;
                        n5 += 19672;
                        n5 -= 56296;
                        n5 += 61099;
                        n5 -= 38876;
                        n5 ^= 0x69FC;
                        n5 += 53357;
                        cArray[i4] = (char)(n5 ^= 0x56DF);
                    }
                    object6 = AvatarPopupMetrics.A()[3] = new String(cArray);
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
            C = new int[0x1414 ^ 0x1584];
            AvatarPopupMetrics.C[0x796D ^ 0x7986] = 0xFFFF860B ^ 0x7986;
            AvatarPopupMetrics.C[0x57BE ^ 0x57CE] = 0xFFFFA876 ^ 0x57CE;
            AvatarPopupMetrics.C[0x10DF8 ^ 0x10D64] = 0xFFFEF2F6 ^ 0x10D64;
            AvatarPopupMetrics.C[0x7826 ^ 0x78F0] = 0x78E2 ^ 0x78F0;
            AvatarPopupMetrics.C[0x86A2 ^ 0x86A3] = 0x86B7 ^ 0x86A3;
            AvatarPopupMetrics.C[0xD3E6 ^ 0xD2F6] = 0xFFFF2D06 ^ 0xD2F6;
            AvatarPopupMetrics.C[0x72C1 ^ 0x73B7] = 0xA3CA ^ 0x73B7;
            AvatarPopupMetrics.C[0x6C1C ^ 0x6D0A] = 0x6D02 ^ 0x6D0A;
            AvatarPopupMetrics.C[0x91ED ^ 0x90D5] = 0xFFFF6F37 ^ 0x90D5;
            AvatarPopupMetrics.C[0x6442 ^ 0x64C4] = 0x649C ^ 0x64C4;
            AvatarPopupMetrics.C[0x1BEF ^ 0x1AAE] = 0x1AE0 ^ 0x1AAE;
            AvatarPopupMetrics.C[0x4FB3 ^ 0x4EA2] = 0xFFFFB17A ^ 0x4EA2;
            AvatarPopupMetrics.C[0xF03E ^ 0xF0C5] = 0xF0C9 ^ 0xF0C5;
            AvatarPopupMetrics.C[0xD2D8 ^ 0xD35A] = 0x633C ^ 0xD35A;
            AvatarPopupMetrics.C[0x64D4 ^ 0x65F7] = 0x65F7 ^ 0x65F7;
            AvatarPopupMetrics.C[0x6A9F ^ 0x6B99] = 0xFFFF9424 ^ 0x6B99;
            AvatarPopupMetrics.C[0xB529 ^ 0xB5C4] = 0xB583 ^ 0xB5C4;
            AvatarPopupMetrics.C[0x76A1 ^ 0x76DE] = 0x768F ^ 0x76DE;
            AvatarPopupMetrics.C[0x34B2 ^ 0x347B] = 0xFFFFCBA8 ^ 0x347B;
            AvatarPopupMetrics.C[0x2A44 ^ 0x2B79] = 0x2B1B ^ 0x2B79;
            AvatarPopupMetrics.C[0xE8CE ^ 0xE9B3] = 0xC726 ^ 0xE9B3;
            AvatarPopupMetrics.C[0x918F ^ 0x910D] = 0xFFFF6ECE ^ 0x910D;
            AvatarPopupMetrics.C[0xCB58 ^ 0xCB0A] = 0xFFFF34BC ^ 0xCB0A;
            AvatarPopupMetrics.C[0xCAF9 ^ 0xCBC6] = 0xFFFF342B ^ 0xCBC6;
            AvatarPopupMetrics.C[0x1B6 ^ 0x12E] = 0xFFFFFEEC ^ 0x12E;
            AvatarPopupMetrics.C[0xCE66 ^ 0xCE98] = 0xFFFF313F ^ 0xCE98;
            AvatarPopupMetrics.C[0xD75D ^ 0xD78C] = 0xD7B0 ^ 0xD78C;
            AvatarPopupMetrics.C[0x8866 ^ 0x8826] = 0x8817 ^ 0x8826;
            AvatarPopupMetrics.C[0xB6ED ^ 0xB64C] = 0xFFFF49D4 ^ 0xB64C;
            AvatarPopupMetrics.C[0x741F ^ 0x745D] = 0xFFFF8B02 ^ 0x745D;
            AvatarPopupMetrics.C[0x10DB7 ^ 0x10C33] = 0x1BC55 ^ 0x10C33;
            AvatarPopupMetrics.C[0x847C ^ 0x8406] = 0xFFFF7B84 ^ 0x8406;
            AvatarPopupMetrics.C[0xC234 ^ 0xC316] = 0xC317 ^ 0xC316;
            AvatarPopupMetrics.C[0x79EE ^ 0x78D0] = 0xFFFF8738 ^ 0x78D0;
            AvatarPopupMetrics.C[0x2E76 ^ 0x2F7F] = 0xFFFFD0C9 ^ 0x2F7F;
            AvatarPopupMetrics.C[0x2491 ^ 0x248F] = 0x24AE ^ 0x248F;
            AvatarPopupMetrics.C[0x6A0C ^ 0x6A3C] = 0x6A3B ^ 0x6A3C;
            AvatarPopupMetrics.C[0x108A9 ^ 0x108AD] = 0x108DD ^ 0x108AD;
            AvatarPopupMetrics.C[0x5DBB ^ 0x5CB6] = 0xFFFFA324 ^ 0x5CB6;
            AvatarPopupMetrics.C[0xCF5E ^ 0xCF17] = 0xFFFF3091 ^ 0xCF17;
            AvatarPopupMetrics.C[0x50CF ^ 0x5142] = 0x919E ^ 0x5142;
            AvatarPopupMetrics.C[0x89A2 ^ 0x897D] = 0xFFFF76E2 ^ 0x897D;
            AvatarPopupMetrics.C[0x4FC2 ^ 0x4F9C] = 0xFFFFB012 ^ 0x4F9C;
            AvatarPopupMetrics.C[0x9F43 ^ 0x9E0E] = 0xFFFF61C6 ^ 0x9E0E;
            AvatarPopupMetrics.C[0x2422 ^ 0x2527] = 0xFFFFDAC6 ^ 0x2527;
            AvatarPopupMetrics.C[0xDF5C ^ 0xDE7B] = 0xDF3B ^ 0xDE7B;
            AvatarPopupMetrics.C[0xE045 ^ 0xE106] = 0xFFFF1EF5 ^ 0xE106;
            AvatarPopupMetrics.C[0x6095 ^ 0x61FA] = 0x61FA ^ 0x61FA;
            AvatarPopupMetrics.C[0xBD62 ^ 0xBDB5] = 0xFFFF421D ^ 0xBDB5;
            AvatarPopupMetrics.C[0xCFB7 ^ 0xCEEB] = 0xCEE0 ^ 0xCEEB;
            AvatarPopupMetrics.C[0x8D55 ^ 0x8DC7] = 0xFFFF7262 ^ 0x8DC7;
            AvatarPopupMetrics.C[0xFFD4 ^ 0xFEE5] = 0x7BDC ^ 0xFEE5;
            AvatarPopupMetrics.C[0x2C84 ^ 0x2C8A] = 0xFFFFD306 ^ 0x2C8A;
            AvatarPopupMetrics.C[0xBAC3 ^ 0xBA9B] = 0xFFFF4570 ^ 0xBA9B;
            AvatarPopupMetrics.C[0x2932 ^ 0x286C] = 0x28C6 ^ 0x286C;
            AvatarPopupMetrics.C[0x5F1 ^ 0x4C4] = 0x4A8 ^ 0x4C4;
            AvatarPopupMetrics.C[0x460D ^ 0x4687] = 0xFFFFB957 ^ 0x4687;
            AvatarPopupMetrics.C[0x8674 ^ 0x8722] = 0xFFFF78E5 ^ 0x8722;
            AvatarPopupMetrics.C[0x4E45 ^ 0x4F03] = 0xFFFFB086 ^ 0x4F03;
            AvatarPopupMetrics.C[0xD4BC ^ 0xD4D2] = 0xD4A5 ^ 0xD4D2;
            AvatarPopupMetrics.C[0x76F9 ^ 0x760F] = 0xFFFF8931 ^ 0x760F;
            AvatarPopupMetrics.C[0x885B ^ 0x893B] = 0x8942 ^ 0x893B;
            AvatarPopupMetrics.C[0x55A3 ^ 0x5542] = 0xFFFFAAE7 ^ 0x5542;
            AvatarPopupMetrics.C[0x24F0 ^ 0x2455] = 0xFFFFDBEF ^ 0x2455;
            AvatarPopupMetrics.C[0xA2F9 ^ 0xA2B5] = 0xA2E8 ^ 0xA2B5;
            AvatarPopupMetrics.C[0x5B5 ^ 0x508] = 0x525 ^ 0x508;
            AvatarPopupMetrics.C[0x39B2 ^ 0x39A1] = 0x39C7 ^ 0x39A1;
            AvatarPopupMetrics.C[0xB4A7 ^ 0xB5EC] = 0xFFFF4A25 ^ 0xB5EC;
            AvatarPopupMetrics.C[0xFC67 ^ 0xFC9E] = 0xFCBB ^ 0xFC9E;
            AvatarPopupMetrics.C[0x97F7 ^ 0x974D] = 0x973C ^ 0x974D;
            AvatarPopupMetrics.C[0x6153 ^ 0x613A] = 0x614C ^ 0x613A;
            AvatarPopupMetrics.C[0x7195 ^ 0x71E8] = 0xFFFF8E5E ^ 0x71E8;
            AvatarPopupMetrics.C[0x10635 ^ 0x1064B] = 0xFFFEF9F7 ^ 0x1064B;
            AvatarPopupMetrics.C[0xE800 ^ 0xE8E7] = 0xE8D9 ^ 0xE8E7;
            AvatarPopupMetrics.C[0x5278 ^ 0x5311] = 0xFFFFACF4 ^ 0x5311;
            AvatarPopupMetrics.C[0x105D9 ^ 0x10486] = 0xFFFEFB69 ^ 0x10486;
            AvatarPopupMetrics.C[0x1087D ^ 0x10944] = 0x10975 ^ 0x10944;
            AvatarPopupMetrics.C[0x7EA0 ^ 0x7EA7] = 0x7EF7 ^ 0x7EA7;
            AvatarPopupMetrics.C[0x55BC ^ 0x548C] = 0x8419 ^ 0x548C;
            AvatarPopupMetrics.C[0x4146 ^ 0x400A] = 0x4078 ^ 0x400A;
            AvatarPopupMetrics.C[0xB90A ^ 0xB942] = 0xFFFF462C ^ 0xB942;
            AvatarPopupMetrics.C[0xF5BC ^ 0xF43B] = 0xA751 ^ 0xF43B;
            AvatarPopupMetrics.C[0x102 ^ 0x127] = 0x177 ^ 0x127;
            AvatarPopupMetrics.C[0xD211 ^ 0xD280] = 0xFFFF2D18 ^ 0xD280;
            AvatarPopupMetrics.C[0xB5D2 ^ 0xB45D] = 0xFFFF8B5C ^ 0xB45D;
            AvatarPopupMetrics.C[0x2F0E ^ 0x2E3C] = 0x2D36 ^ 0x2E3C;
            AvatarPopupMetrics.C[0x98B5 ^ 0x98D9] = 0x9848 ^ 0x98D9;
            AvatarPopupMetrics.C[0x5792 ^ 0x5785] = 0xFFFFA874 ^ 0x5785;
            AvatarPopupMetrics.C[0x6150 ^ 0x603B] = 0x6079 ^ 0x603B;
            AvatarPopupMetrics.C[0x9E29 ^ 0x9FA5] = 0x2ED2 ^ 0x9FA5;
            AvatarPopupMetrics.C[0xA483 ^ 0xA43D] = 0xA438 ^ 0xA43D;
            AvatarPopupMetrics.C[0xF5DB ^ 0xF542] = 0xF52C ^ 0xF542;
            AvatarPopupMetrics.C[0x1953 ^ 0x1970] = 0xFFFFE6A4 ^ 0x1970;
            AvatarPopupMetrics.C[0x9EB5 ^ 0x9EB8] = 0x9EA9 ^ 0x9EB8;
            AvatarPopupMetrics.C[0xAF00 ^ 0xAE2A] = 0xB30A ^ 0xAE2A;
            AvatarPopupMetrics.C[0xB034 ^ 0xB07A] = 0xFFFF4FB0 ^ 0xB07A;
            AvatarPopupMetrics.C[0x999C ^ 0x9996] = 0x99E6 ^ 0x9996;
            AvatarPopupMetrics.C[0x967A ^ 0x962A] = 0x9621 ^ 0x962A;
            AvatarPopupMetrics.C[0xF2F ^ 0xEA6] = 0xBFD7 ^ 0xEA6;
            AvatarPopupMetrics.C[0x87A3 ^ 0x8695] = 0xFFFF793F ^ 0x8695;
            AvatarPopupMetrics.C[0x9E82 ^ 0x9E58] = 0xFFFF61C9 ^ 0x9E58;
            AvatarPopupMetrics.C[0x3CA1 ^ 0x3DBF] = 0xFFFFC245 ^ 0x3DBF;
            AvatarPopupMetrics.C[0x31B0 ^ 0x311A] = 0xFFFFCEC8 ^ 0x311A;
            AvatarPopupMetrics.C[0x8261 ^ 0x8281] = 0x82A1 ^ 0x8281;
            AvatarPopupMetrics.C[0xBEB5 ^ 0xBEBC] = 0xBE91 ^ 0xBEBC;
            AvatarPopupMetrics.C[0xF362 ^ 0xF309] = 0xF352 ^ 0xF309;
            AvatarPopupMetrics.C[0x8966 ^ 0x89DF] = 0x8999 ^ 0x89DF;
            AvatarPopupMetrics.C[0xFA3D ^ 0xFAAD] = 0xFA4E ^ 0xFAAD;
            AvatarPopupMetrics.C[0xD880 ^ 0xD9D0] = 0xD984 ^ 0xD9D0;
            AvatarPopupMetrics.C[0x1014D ^ 0x1002B] = 0x10035 ^ 0x1002B;
            AvatarPopupMetrics.C[0x4FDF ^ 0x4E5C] = 0xFE08 ^ 0x4E5C;
            AvatarPopupMetrics.C[0x10F43 ^ 0x10E6C] = 0x1BF78 ^ 0x10E6C;
            AvatarPopupMetrics.C[0xAF1B ^ 0xAF0A] = 0xAF3F ^ 0xAF0A;
            AvatarPopupMetrics.C[0x4871 ^ 0x48A9] = 0x48BD ^ 0x48A9;
            AvatarPopupMetrics.C[0x5695 ^ 0x57F8] = 0x57F9 ^ 0x57F8;
            AvatarPopupMetrics.C[0xB8B3 ^ 0xB89D] = 0xB8BD ^ 0xB89D;
            AvatarPopupMetrics.C[0x8268 ^ 0x8364] = 0xFFFF7CC8 ^ 0x8364;
            AvatarPopupMetrics.C[0x7194 ^ 0x7134] = 0x7153 ^ 0x7134;
            AvatarPopupMetrics.C[0xBA16 ^ 0xBB09] = 0xFFFF44EE ^ 0xBB09;
            AvatarPopupMetrics.C[0xC903 ^ 0xC9CD] = 0xFFFF3654 ^ 0xC9CD;
            AvatarPopupMetrics.C[0x105F0 ^ 0x104E3] = 0x104ED ^ 0x104E3;
            AvatarPopupMetrics.C[0xB8E ^ 0xABD] = 0x4501 ^ 0xABD;
            AvatarPopupMetrics.C[0xB534 ^ 0xB5F3] = 0xB5C1 ^ 0xB5F3;
            AvatarPopupMetrics.C[0xC304 ^ 0xC316] = 0xC3A1 ^ 0xC316;
            AvatarPopupMetrics.C[0x10B16 ^ 0x10B8C] = 0x10BBA ^ 0x10B8C;
            AvatarPopupMetrics.C[0x33A0 ^ 0x33BF] = 0x339B ^ 0x33BF;
            AvatarPopupMetrics.C[0x5A4E ^ 0x5A93] = 0xFFFFA524 ^ 0x5A93;
            AvatarPopupMetrics.C[0xD718 ^ 0xD699] = 0x66FA ^ 0xD699;
            AvatarPopupMetrics.C[0x28DE ^ 0x2815] = 0xFFFFD7A2 ^ 0x2815;
            AvatarPopupMetrics.C[0x3E5D ^ 0x3E63] = 0xFFFFC1D6 ^ 0x3E63;
            AvatarPopupMetrics.C[0xD70D ^ 0xD65A] = 0xFFFF29ED ^ 0xD65A;
            AvatarPopupMetrics.C[0x32E0 ^ 0x33DA] = 0x33E9 ^ 0x33DA;
            AvatarPopupMetrics.C[0x7D25 ^ 0x7D02] = 0x7E9D ^ 0x7D02;
            AvatarPopupMetrics.C[0x54CD ^ 0x5425] = 0x5421 ^ 0x5425;
            AvatarPopupMetrics.C[0xFAC1 ^ 0xFA65] = 0xFFFF05F7 ^ 0xFA65;
            AvatarPopupMetrics.C[0xC0F3 ^ 0xC091] = 0xC09B ^ 0xC091;
            AvatarPopupMetrics.C[0xFFD8 ^ 0xFFBB] = 0xFFAA ^ 0xFFBB;
            AvatarPopupMetrics.C[0x7694 ^ 0x76A8] = 0x7686 ^ 0x76A8;
            AvatarPopupMetrics.C[0xD0B2 ^ 0xD0AB] = 0xD0B8 ^ 0xD0AB;
            AvatarPopupMetrics.C[0x1BAE ^ 0x1BB6] = 0xFFFFE40C ^ 0x1BB6;
            AvatarPopupMetrics.C[0xAE41 ^ 0xAF5B] = 0xAF33 ^ 0xAF5B;
            AvatarPopupMetrics.C[0x1C8A ^ 0x1DCD] = 0xFFFFE24F ^ 0x1DCD;
            AvatarPopupMetrics.C[0xFA1C ^ 0xFAA4] = 0xFA84 ^ 0xFAA4;
            AvatarPopupMetrics.C[0x177 ^ 0x100] = 0xFFFFFED0 ^ 0x100;
            AvatarPopupMetrics.C[0xD451 ^ 0xD57D] = 0x606F ^ 0xD57D;
            AvatarPopupMetrics.C[0xCAB5 ^ 0xCA61] = 0xFFFF35F1 ^ 0xCA61;
            AvatarPopupMetrics.C[0xE704 ^ 0xE675] = 0xE674 ^ 0xE675;
            AvatarPopupMetrics.C[0xC586 ^ 0xC4EE] = 0xC4E8 ^ 0xC4EE;
            AvatarPopupMetrics.C[0xA701 ^ 0xA643] = 0xA620 ^ 0xA643;
            AvatarPopupMetrics.C[0xDFC2 ^ 0xDF0E] = 0xFFFF20A3 ^ 0xDF0E;
            AvatarPopupMetrics.C[0x1C91 ^ 0x1D99] = 0xFFFFE20F ^ 0x1D99;
            AvatarPopupMetrics.C[0xFC87 ^ 0xFCAC] = 0xFCC6 ^ 0xFCAC;
            AvatarPopupMetrics.C[0xCDA8 ^ 0xCDC7] = 0xFFFF320D ^ 0xCDC7;
            AvatarPopupMetrics.C[0x44B0 ^ 0x44F1] = 0x44C7 ^ 0x44F1;
            AvatarPopupMetrics.C[0xF8B6 ^ 0xF8DC] = 0xF8EE ^ 0xF8DC;
            AvatarPopupMetrics.C[0xFA46 ^ 0xFB1E] = 0xFFFF042C ^ 0xFB1E;
            AvatarPopupMetrics.C[0xC250 ^ 0xC33A] = 0xFFFF3CCD ^ 0xC33A;
            AvatarPopupMetrics.C[0x28FA ^ 0x289A] = 0x28FB ^ 0x289A;
            AvatarPopupMetrics.C[0xF90 ^ 0xFE2] = 0xFFFFF015 ^ 0xFE2;
            AvatarPopupMetrics.C[0x8809 ^ 0x8954] = 0x8938 ^ 0x8954;
            AvatarPopupMetrics.C[0x49FC ^ 0x4985] = 0xFFFFB601 ^ 0x4985;
            AvatarPopupMetrics.C[0xB079 ^ 0xB002] = 0xB01B ^ 0xB002;
            AvatarPopupMetrics.C[0x7A87 ^ 0x7B0D] = 0xCA7A ^ 0x7B0D;
            AvatarPopupMetrics.C[0x3EF1 ^ 0x3ED3] = 0x3E85 ^ 0x3ED3;
            AvatarPopupMetrics.C[0xC88B ^ 0xC843] = 0xC876 ^ 0xC843;
            AvatarPopupMetrics.C[0xD5B2 ^ 0xD4FD] = 0xD41D ^ 0xD4FD;
            AvatarPopupMetrics.C[0x44E6 ^ 0x45E2] = 0x459E ^ 0x45E2;
            AvatarPopupMetrics.C[0xC806 ^ 0xC8F6] = 0xC8EA ^ 0xC8F6;
            AvatarPopupMetrics.C[0xEAD0 ^ 0xEA6F] = 0xEA42 ^ 0xEA6F;
            AvatarPopupMetrics.C[0x7973 ^ 0x7969] = 0x7910 ^ 0x7969;
            AvatarPopupMetrics.C[0xBE0B ^ 0xBF42] = 0xFFFF40C3 ^ 0xBF42;
            AvatarPopupMetrics.C[0x9B76 ^ 0x9B2A] = 0x9B16 ^ 0x9B2A;
            AvatarPopupMetrics.C[0x4B53 ^ 0x4A7A] = 0xC3DA ^ 0x4A7A;
            AvatarPopupMetrics.C[0x10911 ^ 0x1083C] = 0x100AE ^ 0x1083C;
            AvatarPopupMetrics.C[0x6CDC ^ 0x6C20] = 0xFFFF93B3 ^ 0x6C20;
            AvatarPopupMetrics.C[0x7A40 ^ 0x7A55] = 0xFFFF85B5 ^ 0x7A55;
            AvatarPopupMetrics.C[0x10B0E ^ 0x10A1A] = 0xFFFEF585 ^ 0x10A1A;
            AvatarPopupMetrics.C[0x5A91 ^ 0x5B8D] = 0xFFFFA46F ^ 0x5B8D;
            AvatarPopupMetrics.C[0x1265 ^ 0x12E6] = 0xFFFFED47 ^ 0x12E6;
            AvatarPopupMetrics.C[0xCDE5 ^ 0xCD4C] = 0xFFFF329F ^ 0xCD4C;
            AvatarPopupMetrics.C[0x4DB7 ^ 0x4CA2] = 0xFFFFB335 ^ 0x4CA2;
            AvatarPopupMetrics.C[0xBA01 ^ 0xBA97] = 0xFFFF450F ^ 0xBA97;
            AvatarPopupMetrics.C[0x102A3 ^ 0x102AF] = 0x102CA ^ 0x102AF;
            AvatarPopupMetrics.C[0x11E8 ^ 0x1102] = 0xFFFFEE94 ^ 0x1102;
            AvatarPopupMetrics.C[0xC0A4 ^ 0xC053] = 0xC005 ^ 0xC053;
            AvatarPopupMetrics.C[0xCD3B ^ 0xCC0C] = 0xCC56 ^ 0xCC0C;
            AvatarPopupMetrics.C[0x88BC ^ 0x8834] = 0xFFFF77CA ^ 0x8834;
            AvatarPopupMetrics.C[0x59F0 ^ 0x59D1] = 0x59AF ^ 0x59D1;
            AvatarPopupMetrics.C[0x9AA5 ^ 0x9AD6] = 0xFFFF653B ^ 0x9AD6;
            AvatarPopupMetrics.C[0xBA57 ^ 0xBA2F] = 0xFFFF4535 ^ 0xBA2F;
            AvatarPopupMetrics.C[0x271A ^ 0x2663] = 0x89DD ^ 0x2663;
            AvatarPopupMetrics.C[0xE659 ^ 0xE729] = 0xE728 ^ 0xE729;
            AvatarPopupMetrics.C[0xA750 ^ 0xA7B4] = 0xFFFF582D ^ 0xA7B4;
            AvatarPopupMetrics.C[0x4A24 ^ 0x4B45] = 0xFFFFB4C4 ^ 0x4B45;
            AvatarPopupMetrics.C[0xB273 ^ 0xB222] = 0xFFFF4DCA ^ 0xB222;
            AvatarPopupMetrics.C[0xC4C6 ^ 0xC43C] = 0xC40D ^ 0xC43C;
            AvatarPopupMetrics.C[0xF0EA ^ 0xF017] = 0xFFFF0FFB ^ 0xF017;
            AvatarPopupMetrics.C[0xEECB ^ 0xEFA8] = 0xFFFF106D ^ 0xEFA8;
            AvatarPopupMetrics.C[0xD5C6 ^ 0xD515] = 0xD50C ^ 0xD515;
            AvatarPopupMetrics.C[0xBA7D ^ 0xBAD5] = 0xFFFF4548 ^ 0xBAD5;
            AvatarPopupMetrics.C[0xB472 ^ 0xB4BD] = 0xFFFF4B43 ^ 0xB4BD;
            AvatarPopupMetrics.C[0x4627 ^ 0x4713] = 0x4713 ^ 0x4713;
            AvatarPopupMetrics.C[0x1D43 ^ 0x1D69] = 0xFFFFEA94 ^ 0x1D69;
            AvatarPopupMetrics.C[0x3D95 ^ 0x3D5F] = 0xFFFFC2E4 ^ 0x3D5F;
            AvatarPopupMetrics.C[0x324F ^ 0x3253] = 0xFFFFCD97 ^ 0x3253;
            AvatarPopupMetrics.C[0x105B0 ^ 0x105E6] = 0x105EB ^ 0x105E6;
            AvatarPopupMetrics.C[0x6E4E ^ 0x6EFD] = 0xFFFF915C ^ 0x6EFD;
            AvatarPopupMetrics.C[0x59C0 ^ 0x5895] = 0xFFFFA745 ^ 0x5895;
            AvatarPopupMetrics.C[0x8572 ^ 0x841E] = 0x8407 ^ 0x841E;
            AvatarPopupMetrics.C[0x16A0 ^ 0x16A5] = 0xFFFFE94D ^ 0x16A5;
            AvatarPopupMetrics.C[0x1C92 ^ 0x1D19] = 0xAC7F ^ 0x1D19;
            AvatarPopupMetrics.C[0xA171 ^ 0xA132] = 0xA16C ^ 0xA132;
            AvatarPopupMetrics.C[0xF49D ^ 0xF51D] = 0xDB8B ^ 0xF51D;
            AvatarPopupMetrics.C[0xC581 ^ 0xC53D] = 0xC519 ^ 0xC53D;
            AvatarPopupMetrics.C[0x835F ^ 0x8271] = 0x2FC5 ^ 0x8271;
            AvatarPopupMetrics.C[0x3556 ^ 0x353E] = 0xFFFFCA8A ^ 0x353E;
            AvatarPopupMetrics.C[0x8F73 ^ 0x8F27] = 0x8F11 ^ 0x8F27;
            AvatarPopupMetrics.C[0x99A ^ 0x8D2] = 0x8D0 ^ 0x8D2;
            AvatarPopupMetrics.C[0xD450 ^ 0xD4A4] = 0xD480 ^ 0xD4A4;
            AvatarPopupMetrics.C[0xBDD3 ^ 0xBD9C] = 0xFFFF4255 ^ 0xBD9C;
            AvatarPopupMetrics.C[0xF72D ^ 0xF709] = 0xF51A ^ 0xF709;
            AvatarPopupMetrics.C[0xF53F ^ 0xF44C] = 0xB7EF ^ 0xF44C;
            AvatarPopupMetrics.C[0x5B9B ^ 0x5A1D] = 0x956 ^ 0x5A1D;
            AvatarPopupMetrics.C[0x52D7 ^ 0x52CC] = 0x52ED ^ 0x52CC;
            AvatarPopupMetrics.C[0x62E9 ^ 0x6396] = 0x4D57 ^ 0x6396;
            AvatarPopupMetrics.C[0x4E9B ^ 0x4EED] = 0xFFFFB137 ^ 0x4EED;
            AvatarPopupMetrics.C[0xAA96 ^ 0xABF2] = 0xABA7 ^ 0xABF2;
            AvatarPopupMetrics.C[0x7D54 ^ 0x7DC3] = 0x7DB9 ^ 0x7DC3;
            AvatarPopupMetrics.C[0x164D ^ 0x1738] = 0xC749 ^ 0x1738;
            AvatarPopupMetrics.C[0x2731 ^ 0x26BF] = 0xE668 ^ 0x26BF;
            AvatarPopupMetrics.C[0x1267 ^ 0x1268] = 0x124E ^ 0x1268;
            AvatarPopupMetrics.C[0x52D ^ 0x456] = 0xABAA ^ 0x456;
            AvatarPopupMetrics.C[0x6392 ^ 0x62AE] = 0x628F ^ 0x62AE;
            AvatarPopupMetrics.C[0x10FC0 ^ 0x10F10] = 0xFFFEF0F6 ^ 0x10F10;
            AvatarPopupMetrics.C[0x460A ^ 0x469E] = 0xFFFFB952 ^ 0x469E;
            AvatarPopupMetrics.C[0x3961 ^ 0x39A0] = 0x39B2 ^ 0x39A0;
            AvatarPopupMetrics.C[0xDB00 ^ 0xDBB2] = 0xDBD9 ^ 0xDBB2;
            AvatarPopupMetrics.C[0xBF8 ^ 0xB38] = 0xB3B ^ 0xB38;
            AvatarPopupMetrics.C[0xCD9C ^ 0xCD31] = 0xFFFF32A2 ^ 0xCD31;
            AvatarPopupMetrics.C[0xA92B ^ 0xA9C7] = 0xFFFF563C ^ 0xA9C7;
            AvatarPopupMetrics.C[0x97B3 ^ 0x9788] = 0x9784 ^ 0x9788;
            AvatarPopupMetrics.C[0x2B0F ^ 0x2A08] = 0x2A54 ^ 0x2A08;
            AvatarPopupMetrics.C[0x9E84 ^ 0x9F8F] = 0xFFFF60B1 ^ 0x9F8F;
            AvatarPopupMetrics.C[0x21FE ^ 0x21C7] = 0x21A7 ^ 0x21C7;
            AvatarPopupMetrics.C[0x7A78 ^ 0x7B60] = 0x7B27 ^ 0x7B60;
            AvatarPopupMetrics.C[0xE5E4 ^ 0xE5BF] = 0xE5D4 ^ 0xE5BF;
            AvatarPopupMetrics.C[0x82D3 ^ 0x82FA] = 0xFFFF7D15 ^ 0x82FA;
            AvatarPopupMetrics.C[0x2B4B ^ 0x2A19] = 0x2A47 ^ 0x2A19;
            AvatarPopupMetrics.C[0x5BDD ^ 0x5A93] = 0x5A89 ^ 0x5A93;
            AvatarPopupMetrics.C[0xCCA3 ^ 0xCC61] = 0xCC6E ^ 0xCC61;
            AvatarPopupMetrics.C[0xE9A8 ^ 0xE9BE] = 0xE9BF ^ 0xE9BE;
            AvatarPopupMetrics.C[0xC1BC ^ 0xC0D2] = 0xC0D0 ^ 0xC0D2;
            AvatarPopupMetrics.C[0xF525 ^ 0xF50D] = 0xF57D ^ 0xF50D;
            AvatarPopupMetrics.C[0x656 ^ 0x676] = 0x60D ^ 0x676;
            AvatarPopupMetrics.C[0xB8F ^ 0xB6C] = 0xB36 ^ 0xB6C;
            AvatarPopupMetrics.C[0xC77F ^ 0xC601] = 0xE897 ^ 0xC601;
            AvatarPopupMetrics.C[0x7787 ^ 0x77F6] = 0xFFFF8804 ^ 0x77F6;
            AvatarPopupMetrics.C[0xE53E ^ 0xE536] = 0xFFFF1AD6 ^ 0xE536;
            AvatarPopupMetrics.C[0x1038 ^ 0x115D] = 0xFFFFEEB4 ^ 0x115D;
            AvatarPopupMetrics.C[0xCF15 ^ 0xCF72] = 0xFFFF308C ^ 0xCF72;
            AvatarPopupMetrics.C[0x5801 ^ 0x58E8] = 0x58F2 ^ 0x58E8;
            AvatarPopupMetrics.C[0x1015 ^ 0x1074] = 0x1043 ^ 0x1074;
            AvatarPopupMetrics.C[0x2792 ^ 0x2724] = 0x274B ^ 0x2724;
            AvatarPopupMetrics.C[0x11C9 ^ 0x1190] = 0xFFFFEE72 ^ 0x1190;
            AvatarPopupMetrics.C[0x45A8 ^ 0x4529] = 0xFFFFBA94 ^ 0x4529;
            AvatarPopupMetrics.C[0xD029 ^ 0xD022] = 0xD066 ^ 0xD022;
            AvatarPopupMetrics.C[0x4C40 ^ 0x4D3C] = 0xE283 ^ 0x4D3C;
            AvatarPopupMetrics.C[0x10020 ^ 0x100FB] = 0x100E6 ^ 0x100FB;
            AvatarPopupMetrics.C[0x5EBB ^ 0x5E3C] = 0x5E78 ^ 0x5E3C;
            AvatarPopupMetrics.C[0x6EF7 ^ 0x6EB0] = 0x6ECC ^ 0x6EB0;
            AvatarPopupMetrics.C[0xCA8D ^ 0xCB8D] = 0xFFFF3462 ^ 0xCB8D;
            AvatarPopupMetrics.C[0x44FE ^ 0x4406] = 0xFFFFBB92 ^ 0x4406;
            AvatarPopupMetrics.C[0x5FFD ^ 0x5FA0] = 0x5FC4 ^ 0x5FA0;
            AvatarPopupMetrics.C[0x5E44 ^ 0x5F3C] = 0x8F41 ^ 0x5F3C;
            AvatarPopupMetrics.C[0xED22 ^ 0xEDBD] = 0xED52 ^ 0xEDBD;
            AvatarPopupMetrics.C[0x8DC0 ^ 0x8DB5] = 0x8D9C ^ 0x8DB5;
            AvatarPopupMetrics.C[0xDDD ^ 0xD56] = 0xD47 ^ 0xD56;
            AvatarPopupMetrics.C[0x2F90 ^ 0x2F05] = 0x2F78 ^ 0x2F05;
            AvatarPopupMetrics.C[0x6330 ^ 0x6333] = 0x6358 ^ 0x6333;
            AvatarPopupMetrics.C[0x23D0 ^ 0x23FD] = 0xFFFFDC8F ^ 0x23FD;
            AvatarPopupMetrics.C[0xB5B6 ^ 0xB5E5] = 0xFFFF4A57 ^ 0xB5E5;
            AvatarPopupMetrics.C[0xD132 ^ 0xD045] = 0xFFFFFF9B ^ 0xD045;
            AvatarPopupMetrics.C[0xF231 ^ 0xF2C2] = 0xF2BD ^ 0xF2C2;
            AvatarPopupMetrics.C[0xA36 ^ 0xB3C] = 0xFFFFF4DC ^ 0xB3C;
            AvatarPopupMetrics.C[0x10721 ^ 0x107DE] = 0x107D5 ^ 0x107DE;
            AvatarPopupMetrics.C[0x88B5 ^ 0x89D7] = 0xFFFF760D ^ 0x89D7;
            AvatarPopupMetrics.C[0xFDB0 ^ 0xFC35] = 0xAF7A ^ 0xFC35;
            AvatarPopupMetrics.C[0xCDF3 ^ 0xCD11] = 0xCD71 ^ 0xCD11;
            AvatarPopupMetrics.C[0x103F5 ^ 0x103F3] = 0xFFFEFC43 ^ 0x103F3;
            AvatarPopupMetrics.C[0xE4BC ^ 0xE4A1] = 0xE4BC ^ 0xE4A1;
            AvatarPopupMetrics.C[0x70C1 ^ 0x706D] = 0xFFFF8FE3 ^ 0x706D;
            AvatarPopupMetrics.C[0x9DCA ^ 0x9DBE] = 0xFFFF627A ^ 0x9DBE;
            AvatarPopupMetrics.C[0x43FC ^ 0x43FC] = 0xFFFFBC52 ^ 0x43FC;
            AvatarPopupMetrics.C[0x2C5A ^ 0x2C9C] = 0xFFFFD345 ^ 0x2C9C;
            AvatarPopupMetrics.C[0xBD9 ^ 0xB44] = 0xFFFFF495 ^ 0xB44;
            AvatarPopupMetrics.C[0x25BA ^ 0x25E0] = 0xFFFFDA4D ^ 0x25E0;
            AvatarPopupMetrics.C[0xBAAE ^ 0xBA1A] = 0xBA64 ^ 0xBA1A;
            AvatarPopupMetrics.C[0x9FDA ^ 0x9F2F] = 0x9F74 ^ 0x9F2F;
            AvatarPopupMetrics.C[0xBA58 ^ 0xBB2A] = 0xBB2A ^ 0xBB2A;
            AvatarPopupMetrics.C[0x23F4 ^ 0x22A0] = 0xFFFFDD41 ^ 0x22A0;
            AvatarPopupMetrics.C[0x64CF ^ 0x64FA] = 0xFFFF9B1E ^ 0x64FA;
            AvatarPopupMetrics.C[0x1753 ^ 0x17BC] = 0x1793 ^ 0x17BC;
            AvatarPopupMetrics.C[0x5BCE ^ 0x5B1C] = 0x5B95 ^ 0x5B1C;
            AvatarPopupMetrics.C[0x217A ^ 0x21CA] = 0x2190 ^ 0x21CA;
            AvatarPopupMetrics.C[0xF293 ^ 0xF2F5] = 0xFFFF0D63 ^ 0xF2F5;
            AvatarPopupMetrics.C[0x8679 ^ 0x86F6] = 0x86BE ^ 0x86F6;
            AvatarPopupMetrics.C[0xE052 ^ 0xE0DB] = 0xFFFF1F41 ^ 0xE0DB;
            AvatarPopupMetrics.C[0x5467 ^ 0x5403] = 0xFFFFAB85 ^ 0x5403;
            AvatarPopupMetrics.C[0xBC4A ^ 0xBD45] = 0xFFFF42CF ^ 0xBD45;
            AvatarPopupMetrics.C[0x8224 ^ 0x82CA] = 0x82BD ^ 0x82CA;
            AvatarPopupMetrics.C[0x87A0 ^ 0x877E] = 0xFFFF78A1 ^ 0x877E;
            AvatarPopupMetrics.C[0x7CC6 ^ 0x7D8C] = 0xFFFF8265 ^ 0x7D8C;
            AvatarPopupMetrics.C[0xE0AA ^ 0xE09C] = 0xE085 ^ 0xE09C;
            AvatarPopupMetrics.C[0xBA37 ^ 0xBAB3] = 0xFFFF45D7 ^ 0xBAB3;
            AvatarPopupMetrics.C[0x4091 ^ 0x41BA] = 0x961B ^ 0x41BA;
            AvatarPopupMetrics.C[0xA27E ^ 0xA2FB] = 0xA29F ^ 0xA2FB;
            AvatarPopupMetrics.C[0xFF1 ^ 0xFCE] = 0xFA9 ^ 0xFCE;
            AvatarPopupMetrics.C[0x5611 ^ 0x5605] = 0x564C ^ 0x5605;
            AvatarPopupMetrics.C[0x8767 ^ 0x8753] = 0x8731 ^ 0x8753;
            AvatarPopupMetrics.C[0x10EA2 ^ 0x10E44] = 0x10E40 ^ 0x10E44;
            AvatarPopupMetrics.C[0x3A9F ^ 0x3B8D] = 0x3B97 ^ 0x3B8D;
            AvatarPopupMetrics.C[0x1A65 ^ 0x1AE8] = 0xFFFFE54F ^ 0x1AE8;
            AvatarPopupMetrics.C[0xCFD0 ^ 0xCF7F] = 0xFFFF30DA ^ 0xCF7F;
            AvatarPopupMetrics.C[0xF63E ^ 0xF65B] = 0xFFFF09CE ^ 0xF65B;
            AvatarPopupMetrics.C[0xDF04 ^ 0xDFA7] = 0xFFFF2031 ^ 0xDFA7;
            AvatarPopupMetrics.C[0x17B0 ^ 0x17F4] = 0x17BA ^ 0x17F4;
            AvatarPopupMetrics.C[0x22C8 ^ 0x229D] = 0xFFFFDD40 ^ 0x229D;
            AvatarPopupMetrics.C[0xFF9A ^ 0xFF3D] = 0xFF13 ^ 0xFF3D;
            AvatarPopupMetrics.C[0x825B ^ 0x837B] = 0x8378 ^ 0x837B;
            AvatarPopupMetrics.C[0xE14D ^ 0xE1BC] = 0xFFFF1E2A ^ 0xE1BC;
            AvatarPopupMetrics.C[0x2FAA ^ 0x2E82] = 0xFAD2 ^ 0x2E82;
            AvatarPopupMetrics.C[0xCFA6 ^ 0xCF26] = 0xFFFF30EB ^ 0xCF26;
            AvatarPopupMetrics.C[0x1B6D ^ 0x1A34] = 0xFFFFE59A ^ 0x1A34;
            AvatarPopupMetrics.C[0x10A5F ^ 0x10A73] = 0xFFFEF5E0 ^ 0x10A73;
            AvatarPopupMetrics.C[0x61EA ^ 0x60EB] = 0xFFFF9F11 ^ 0x60EB;
            AvatarPopupMetrics.C[0x25B3 ^ 0x24AE] = 0x24AF ^ 0x24AE;
            AvatarPopupMetrics.C[0xAED8 ^ 0xAEB5] = 0xFFFF514F ^ 0xAEB5;
            AvatarPopupMetrics.C[0xEABB ^ 0xEA0A] = 0xFFFF1559 ^ 0xEA0A;
            AvatarPopupMetrics.C[0x71DA ^ 0x71CA] = 0xFFFF8E27 ^ 0x71CA;
            AvatarPopupMetrics.C[0x6189 ^ 0x6090] = 0xFFFF9F37 ^ 0x6090;
            AvatarPopupMetrics.C[0x1784 ^ 0x1786] = 0x17EC ^ 0x1786;
            AvatarPopupMetrics.C[0x70D9 ^ 0x70E4] = 0xFFFF8F7C ^ 0x70E4;
            AvatarPopupMetrics.C[0xFCBD ^ 0xFC92] = 0xFCE7 ^ 0xFC92;
            AvatarPopupMetrics.C[0x1D29 ^ 0x1DF0] = 0xFFFFE26D ^ 0x1DF0;
            AvatarPopupMetrics.C[0x6743 ^ 0x6774] = 0x6743 ^ 0x6774;
            AvatarPopupMetrics.C[0x459 ^ 0x4EC] = 0xFFFFFB23 ^ 0x4EC;
            AvatarPopupMetrics.C[0x10555 ^ 0x105EE] = 0xFFFEFA63 ^ 0x105EE;
            AvatarPopupMetrics.C[0x2F64 ^ 0x2FCF] = 0x2FF2 ^ 0x2FCF;
            AvatarPopupMetrics.C[0x6C33 ^ 0x6D62] = 0xFFFF92F6 ^ 0x6D62;
            AvatarPopupMetrics.C[0xCD25 ^ 0xCCAD] = 0x9FE6 ^ 0xCCAD;
            AvatarPopupMetrics.C[0x4AE ^ 0x5DA] = 0x4669 ^ 0x5DA;
            AvatarPopupMetrics.C[0x2B2 ^ 0x280] = 0x29E ^ 0x280;
            AvatarPopupMetrics.C[0x32D4 ^ 0x3226] = 0x3268 ^ 0x3226;
            AvatarPopupMetrics.C[0x51E6 ^ 0x517D] = 0x513A ^ 0x517D;
            AvatarPopupMetrics.C[0x7380 ^ 0x7322] = 0x7306 ^ 0x7322;
            AvatarPopupMetrics.C[0x7595 ^ 0x7549] = 0x750F ^ 0x7549;
            AvatarPopupMetrics.C[0x6229 ^ 0x62CC] = 0xFFFF9D71 ^ 0x62CC;
            AvatarPopupMetrics.C[0xFF ^ 0x185] = 0xAE3A ^ 0x185;
            AvatarPopupMetrics.C[0xF29 ^ 0xFBA] = 0xFD3 ^ 0xFBA;
            AvatarPopupMetrics.C[0xF164 ^ 0xF1D3] = 0xF195 ^ 0xF1D3;
            AvatarPopupMetrics.C[0x2422 ^ 0x2519] = 0x2578 ^ 0x2519;
            AvatarPopupMetrics.C[0xD085 ^ 0xD1C0] = 0xFFFF2E25 ^ 0xD1C0;
            AvatarPopupMetrics.C[0xD6F7 ^ 0xD7B3] = 0xFFFF2873 ^ 0xD7B3;
            AvatarPopupMetrics.C[0x777F ^ 0x7732] = 0xFFFF8883 ^ 0x7732;
            AvatarPopupMetrics.C[0x3CE4 ^ 0x3CD5] = 0x3CF4 ^ 0x3CD5;
            AvatarPopupMetrics.C[0xA379 ^ 0xA3F5] = 0xFFFF5C34 ^ 0xA3F5;
            AvatarPopupMetrics.C[0x5DDF ^ 0x5C85] = 0x5CF9 ^ 0x5C85;
            AvatarPopupMetrics.C[0x8B42 ^ 0x8B86] = 0x8B86 ^ 0x8B86;
            AvatarPopupMetrics.C[0x4EFD ^ 0x4E53] = 0xFFFFB18C ^ 0x4E53;
            AvatarPopupMetrics.C[0xCE33 ^ 0xCF15] = 0xCF15 ^ 0xCF15;
            AvatarPopupMetrics.C[0x8116 ^ 0x8018] = 0xFFFF7F82 ^ 0x8018;
            AvatarPopupMetrics.C[0xC1A ^ 0xCBC] = 0xFFFFF375 ^ 0xCBC;
            AvatarPopupMetrics.C[0x10B73 ^ 0x10A57] = 0x10A55 ^ 0x10A57;
            AvatarPopupMetrics.C[0x5D62 ^ 0x5C43] = 0x5C43 ^ 0x5C43;
            AvatarPopupMetrics.C[0x3965 ^ 0x3836] = 0xFFFFC799 ^ 0x3836;
            AvatarPopupMetrics.C[0x91AE ^ 0x90AD] = 0xFFFF6F78 ^ 0x90AD;
            AvatarPopupMetrics.C[0xA7F7 ^ 0xA734] = 0xFFFF5886 ^ 0xA734;
            AvatarPopupMetrics.C[0xDA6 ^ 0xDF9] = 0xFFFFF219 ^ 0xDF9;
            AvatarPopupMetrics.C[0x7C28 ^ 0x7CFD] = 0xFFFF8334 ^ 0x7CFD;
            AvatarPopupMetrics.C[0xC6EE ^ 0xC6C8] = 0xC6F5 ^ 0xC6C8;
            AvatarPopupMetrics.C[0x5AC4 ^ 0x5A81] = 0x5A98 ^ 0x5A81;
            AvatarPopupMetrics.C[0x734 ^ 0x7AA] = 0xFFFFF80B ^ 0x7AA;
            AvatarPopupMetrics.C[0x10564 ^ 0x10466] = 0xFFFEFBCF ^ 0x10466;
            AvatarPopupMetrics.C[0x4316 ^ 0x4256] = 0xFFFFBD82 ^ 0x4256;
            AvatarPopupMetrics.C[0x10BE2 ^ 0x10AC7] = 0x10AC7 ^ 0x10AC7;
            AvatarPopupMetrics.C[0x7AB ^ 0x793] = 0x7BE ^ 0x793;
            AvatarPopupMetrics.C[0xE175 ^ 0xE13F] = 0xFFFF1EDE ^ 0xE13F;
            AvatarPopupMetrics.C[0x8CDC ^ 0x8C11] = 0x8C05 ^ 0x8C11;
            AvatarPopupMetrics.C[0x2A6A ^ 0x2A21] = 0x2A3D ^ 0x2A21;
            AvatarPopupMetrics.C[0x38DD ^ 0x389B] = 0xFFFFC703 ^ 0x389B;
            AvatarPopupMetrics.C[0xCB5E ^ 0xCB9B] = 0xFFFF3409 ^ 0xCB9B;
            AvatarPopupMetrics.C[0xA30B ^ 0xA331] = 0xA350 ^ 0xA331;
            AvatarPopupMetrics.C[0x6A78 ^ 0x6B6F] = 0x6B7C ^ 0x6B6F;
            AvatarPopupMetrics.C[0x3198 ^ 0x31CF] = 0x31CE ^ 0x31CF;
            AvatarPopupMetrics.C[0xC509 ^ 0xC452] = 0xC405 ^ 0xC452;
            AvatarPopupMetrics.C[0x10BCF ^ 0x10AD4] = 0x10AA1 ^ 0x10AD4;
            AvatarPopupMetrics.C[0x5D79 ^ 0x5C1E] = 0xFFFFA3D5 ^ 0x5C1E;
            AvatarPopupMetrics.C[0x10373 ^ 0x1030F] = 0xFFFEFCA0 ^ 0x1030F;
            AvatarPopupMetrics.C[0xD19A ^ 0xD114] = 0xD164 ^ 0xD114;
            AvatarPopupMetrics.C[0x3591 ^ 0x35A2] = 0xFFFFCA2B ^ 0x35A2;
        }
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u00020\u0012H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\u0002H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t\u00a8\u0006\u001a"}, d2={"Lkotakbaz/rain/ui/menu/MenuScreen$AvatarPopupRow;", "", "", "icon", "text", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotakbaz/rain/ui/menu/MenuScreen$AvatarPopupRow;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIcon", "getText", "getValue", "rain-visuals"})
    private static final class AvatarPopupRow {
        @NotNull
        private final String icon;
        @NotNull
        private final String text;
        @NotNull
        private final String value;
        private static Object[] a;
        private static Object b;
        private static Object[] B;
        private static Object[] A;
        private static Object[] c;
        public static int[] C;

        public AvatarPopupRow(@NotNull String icon, @NotNull String text, @NotNull String value2) {
            int n2 = C[0];
            n2 += C[1];
            Intrinsics.checkNotNullParameter(icon, (String)a[n2 += C[2]]);
            int n3 = C[3];
            n3 += C[4];
            Intrinsics.checkNotNullParameter(text, (String)a[n3 ^= C[5]]);
            int n4 = C[6];
            n4 += C[7];
            Intrinsics.checkNotNullParameter(value2, (String)a[n4 ^= C[8]]);
            this.icon = icon;
            this.text = text;
            this.value = value2;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final String component1() {
            return this.icon;
        }

        @NotNull
        public final String component2() {
            return this.text;
        }

        @NotNull
        public final String component3() {
            return this.value;
        }

        @NotNull
        public final AvatarPopupRow copy(@NotNull String icon, @NotNull String text, @NotNull String value2) {
            int n2 = C[9];
            n2 += C[10];
            Intrinsics.checkNotNullParameter(icon, (String)a[n2 += C[11]]);
            int n3 = C[12];
            n3 -= C[13];
            Intrinsics.checkNotNullParameter(text, (String)a[n3 ^= C[14]]);
            int n4 = C[15];
            n4 += C[16];
            Intrinsics.checkNotNullParameter(value2, (String)a[n4 += C[17]]);
            return new AvatarPopupRow(icon, text, value2);
        }

        public static /* synthetic */ AvatarPopupRow copy$default(AvatarPopupRow avatarPopupRow, String string, String string2, String string3, int n2, Object object) {
            int n3 = C[18];
            n3 ^= C[19];
            if ((n2 & (n3 -= C[20])) != 0) {
                string = avatarPopupRow.icon;
            }
            int n4 = C[21];
            n4 ^= C[22];
            if ((n2 & (n4 += C[23])) != 0) {
                string2 = avatarPopupRow.text;
            }
            int n5 = C[24];
            n5 -= C[25];
            if ((n2 & (n5 += C[26])) != 0) {
                string3 = avatarPopupRow.value;
            }
            return avatarPopupRow.copy(string, string2, string3);
        }

        @NotNull
        public String toString() {
            String string = this.value;
            String string2 = this.text;
            String string3 = this.icon;
            int n2 = C[27];
            n2 += C[28];
            n2 += C[29];
            int n3 = C[30];
            n3 ^= C[31];
            n3 ^= C[32];
            int n4 = C[33];
            n4 ^= C[34];
            int n5 = C[36];
            n5 += C[37];
            int n6 = C[39];
            n6 ^= C[40];
            return (String)a[n2] + (String)a[n3] + string3 + (String)a[n4 -= C[35]] + string2 + (String)a[n5 += C[38]] + string + (String)a[n6 += C[41]];
        }

        public int hashCode() {
            long l2 = -3042906892866560084L;
            long l3 = -7633082536315123124L;
            long l4 = 3884984426638890042L;
            int n2 = C[42];
            n2 += C[43];
            long l5 = l4;
            int n3 = C[45];
            n3 -= C[46];
            l4 = l5 ^ ((long)this.icon.hashCode() << (n2 -= C[44]) ^ l5) & -1L << (n3 ^= C[47]);
            int n4 = C[48];
            n4 -= C[49];
            n4 -= C[50];
            int n5 = C[51];
            n5 ^= C[52];
            n5 ^= C[53];
            int n6 = C[54];
            n6 += C[55];
            long l6 = l4;
            int n7 = C[57];
            n7 ^= C[58];
            l4 = l6 ^ ((long)((int)(l4 >>> n4) * n5 + this.text.hashCode()) << (n6 -= C[56]) ^ l6) & -1L << (n7 ^= C[59]);
            int n8 = C[60];
            n8 += C[61];
            n8 ^= C[62];
            int n9 = C[63];
            n9 -= C[64];
            n9 -= C[65];
            int n10 = C[66];
            n10 += C[67];
            long l7 = l4;
            int n11 = C[69];
            n11 += C[70];
            l4 = l7 ^ ((long)((int)(l4 >>> n8) * n9 + this.value.hashCode()) << (n10 -= C[68]) ^ l7) & -1L << (n11 -= C[71]);
            int n12 = C[72];
            n12 += C[73];
            return (int)(l4 >>> (n12 += C[74]));
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                boolean bl = C[75];
                bl ^= C[76];
                return bl += C[77];
            }
            if (!(other instanceof AvatarPopupRow)) {
                boolean bl = C[78];
                bl ^= C[79];
                return bl ^= C[80];
            }
            AvatarPopupRow avatarPopupRow = (AvatarPopupRow)other;
            if (!Intrinsics.areEqual(this.icon, avatarPopupRow.icon)) {
                boolean bl = C[81];
                bl ^= C[82];
                return bl ^= C[83];
            }
            if (!Intrinsics.areEqual(this.text, avatarPopupRow.text)) {
                boolean bl = C[84];
                bl += C[85];
                return bl -= C[86];
            }
            if (!Intrinsics.areEqual(this.value, avatarPopupRow.value)) {
                boolean bl = C[87];
                bl ^= C[88];
                return bl += C[89];
            }
            boolean bl = C[90];
            bl ^= C[91];
            return bl ^= C[92];
        }

        static {
            AvatarPopupRow.b();
            long l2 = 7112789301828059619L;
            long l3 = 8430714982623318138L;
            long l4 = -8296050550421585432L;
            long l5 = 3907249828585833164L;
            long l6 = -2927453430574928263L;
            long l7 = 1852202938145417297L;
            long l8 = -5180458257460328703L;
            long l9 = 3574325372015113558L;
            long l10 = 2606094699875354060L;
            long l11 = 2366367049141080330L;
            long l12 = -3277380224308861731L;
            long l13 = -6634355400884807561L;
            long l14 = -883943081570427905L;
            long l15 = 7607841226280557743L;
            int n2 = C[93];
            n2 += C[94];
            a = new Object[n2 += C[95]];
            long l16 = l15;
            int n3 = C[96];
            n3 -= C[97];
            l15 = l16 ^ (0L ^ l16) & -1L << (n3 += C[98]);
            Object[] objectArray = new Object[C[99]];
            objectArray[AvatarPopupRow.C[100]] = A;
            objectArray[AvatarPopupRow.C[101]] = C[102];
            int n4 = C[103];
            Object object = AvatarPopupRow.A()[C[104]];
            if (object == null) {
                char[] cArray = "\uca59\ucaa5\uca1d\uca74\uca4a\uca1a\uca81\uca79\uca75\uca5b\uca75\uca73\uca6c\uca81\ucaae\uca64\uca1a\uca1a\uca56\uca74\uca5b\uca48\uca46\uca4d\uca44\uca1c\uca66\uca80\uca6f\uca76\uca47\uca68\uca69\uca4c\uca21\uca76\uca6f\uca14\uca80\uca5f\uca6d\ucaa5\uca63\uca4c\uca1b\uca48\uca50\uca4e\uca49\ucaa5\ucaae\uca7f\uca14\uca5b\uca1f\uca69\uca4e\uca5f\uca7d\ucaa6\uca56\uca59\uca56\uca70\uca74\uca55\uca4c\uca19\uca6c\uca60\uca7a\uca6a\uca4f\uca5f\uca48\uca6e\uca44\uca1b\uca6e\uca5f\uca5c\uca5a\uca46\uca73\uca6e\uca6a\uca65\uca4e\uca79\uca13\uca79\uca7d\uca47\uca5a\uca1f\uca7d\uca6f\uca62\uca53\uca1b\uca4d\uca55\uca65\uca7f\uca75\uca76\uca6f\uca73\uca73\uca7a\uca56\uca60\uca21\uca7f\uca76\uca70\uca4c\uca66\uca80\uca5b\uca1a\uca47\uca4f\uca19\uca70\uca5f\uca6c\uca46\uca69\uca49\uca53\uca63\uca4a\uca5a\uca6d\uca21\uca54\uca21\uca6f\uca74\ucaae\uca70\uca73\uca49\uca70\uca6f\uca4f\uca67\uca69\uca6a\uca58\uca58".toCharArray();
                for (int i2 = C[105]; i2 < C[106]; ++i2) {
                    int n5 = cArray[i2];
                    n5 -= C[107];
                    n5 -= C[108];
                    n5 ^= C[109];
                    n5 ^= C[110];
                    n5 -= C[111];
                    n5 -= C[112];
                    n5 -= C[113];
                    n5 -= C[114];
                    n5 += C[115];
                    n5 ^= C[116];
                    n5 ^= C[117];
                    n5 += C[118];
                    cArray[i2] = (char)(n5 ^= C[119]);
                }
                object = AvatarPopupRow.A()[AvatarPopupRow.C[120]] = new String(cArray);
            }
            objectArray[n4] = (String)object;
            char[] cArray = ((String)AvatarPopupRow.a(objectArray)).toCharArray();
            long l17 = l6;
            int n6 = C[121];
            n6 -= C[122];
            l6 = l17 ^ (0x5400000000L ^ l17) & -1L << (n6 -= C[123]);
            long l18 = l13;
            int n7 = C[124];
            n7 ^= C[125];
            l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= C[126]);
            while (true) {
                int n8 = C[127];
                n8 ^= C[128];
                if ((int)l13 >= (int)(l6 >>> (n8 -= C[129]))) break;
                int n9 = (int)l13;
                long l19 = l13;
                int n10 = C[130];
                n10 ^= C[131];
                int n11 = C[133];
                n11 -= C[134];
                l13 = l19 ^ (l19 ^ l19 + (long)(n10 += C[132])) & -1L >>> (n11 -= C[135]);
                long l20 = l9;
                int n12 = C[136];
                n12 -= C[137];
                l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += C[138]);
                int n13 = (int)l13;
                long l21 = l13;
                int n14 = C[139];
                n14 += C[140];
                int n15 = C[142];
                n15 += C[143];
                l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= C[141])) & -1L >>> (n15 -= C[144]);
                int n16 = C[145];
                n16 ^= C[146];
                long l22 = l10;
                int n17 = C[148];
                n17 ^= C[149];
                l10 = l22 ^ ((long)cArray[n13] << (n16 += C[147]) ^ l22) & -1L << (n17 ^= C[150]);
                int n18 = C[151];
                n18 -= C[152];
                n18 ^= C[153];
                int n19 = C[154];
                n19 ^= C[155];
                long l23 = l12;
                int n20 = C[157];
                n20 -= C[158];
                l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= C[156]))) ^ l23) & -1L >>> (n20 += C[159]);
                char[] cArray2 = new char[(int)l12];
                long l24 = l14;
                int n21 = C[160];
                n21 += C[161];
                l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= C[162]);
                while (true) {
                    int n22 = C[163];
                    n22 -= C[164];
                    if ((int)(l14 >>> (n22 -= C[165])) >= (int)l12) break;
                    int n23 = C[166];
                    n23 -= C[167];
                    int n24 = C[169];
                    n24 ^= C[170];
                    cArray2[(int)(l14 >>> (n23 ^= AvatarPopupRow.C[168]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= C[171]))];
                    l14 += 0x100000000L;
                }
                int n25 = C[172];
                n25 -= C[173];
                int n26 = (int)(l15 >>> (n25 -= C[174]));
                l15 += 0x100000000L;
                AvatarPopupRow.a[n26] = new String(cArray2);
                long l25 = l13;
                int n27 = C[175];
                n27 ^= C[176];
                l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= C[177]);
            }
        }

        public static Object a(Object[] object) {
            Object object2;
            int n2 = (Integer)object[C[178]];
            String string = (String)object[C[179]];
            object = object[C[180]];
            Object[] objectArray = B;
            if (B == null) {
                objectArray = B = new Object[C[181]];
            }
            if ((object2 = objectArray[n2]) == null) {
                Object object3 = object;
                if (object == null) {
                    Object[] objectArray2 = new Object[C[182]];
                    A = objectArray2;
                    object3 = objectArray2;
                    byte[] byArray = new byte[C[184] ^ C[185]];
                    byArray[AvatarPopupRow.C[186] ^ AvatarPopupRow.C[187]] = C[188] ^ C[189];
                    byArray[AvatarPopupRow.C[190] ^ AvatarPopupRow.C[191]] = C[192] ^ C[193];
                    byArray[AvatarPopupRow.C[194] ^ AvatarPopupRow.C[195]] = C[196] ^ C[197];
                    byArray[AvatarPopupRow.C[198] ^ AvatarPopupRow.C[199]] = C[200] ^ C[201];
                    byArray[AvatarPopupRow.C[202] ^ AvatarPopupRow.C[203]] = C[204] ^ C[205];
                    byArray[AvatarPopupRow.C[206] ^ AvatarPopupRow.C[207]] = C[208] ^ C[209];
                    byArray[AvatarPopupRow.C[210] ^ AvatarPopupRow.C[211]] = C[212] ^ C[213];
                    byArray[AvatarPopupRow.C[214] ^ AvatarPopupRow.C[215]] = C[216] ^ C[217];
                    byArray[AvatarPopupRow.C[218] ^ AvatarPopupRow.C[219]] = C[220] ^ C[221];
                    byArray[AvatarPopupRow.C[222] ^ AvatarPopupRow.C[223]] = C[224] ^ C[225];
                    byArray[AvatarPopupRow.C[226] ^ AvatarPopupRow.C[227]] = C[228] ^ C[229];
                    byArray[AvatarPopupRow.C[230] ^ AvatarPopupRow.C[231]] = C[232] ^ C[233];
                    byArray[AvatarPopupRow.C[234] ^ AvatarPopupRow.C[235]] = C[236] ^ C[237];
                    byArray[AvatarPopupRow.C[238] ^ AvatarPopupRow.C[239]] = C[240] ^ C[241];
                    byArray[AvatarPopupRow.C[242] ^ AvatarPopupRow.C[243]] = C[244] ^ C[245];
                    byArray[AvatarPopupRow.C[246] ^ AvatarPopupRow.C[247]] = C[248] ^ C[249];
                    objectArray2[AvatarPopupRow.C[183]] = byArray;
                }
                byte[] byArray = (byte[])object3[C[250]];
                if (b == null) {
                    byte[] byArray2 = new byte[C[251] ^ C[252]];
                    byArray2[AvatarPopupRow.C[253] ^ AvatarPopupRow.C[254]] = C[255] ^ C[256];
                    byArray2[AvatarPopupRow.C[257] ^ AvatarPopupRow.C[258]] = C[259] ^ C[260];
                    byArray2[AvatarPopupRow.C[261] ^ AvatarPopupRow.C[262]] = C[263] ^ C[264];
                    byArray2[AvatarPopupRow.C[265] ^ AvatarPopupRow.C[266]] = C[267] ^ C[268];
                    byArray2[AvatarPopupRow.C[269] ^ AvatarPopupRow.C[270]] = C[271] ^ C[272];
                    byArray2[AvatarPopupRow.C[273] ^ AvatarPopupRow.C[274]] = C[275] ^ C[276];
                    byArray2[AvatarPopupRow.C[277] ^ AvatarPopupRow.C[278]] = C[279] ^ C[280];
                    byArray2[AvatarPopupRow.C[281] ^ AvatarPopupRow.C[282]] = C[283] ^ C[284];
                    byArray2[AvatarPopupRow.C[285] ^ AvatarPopupRow.C[286]] = C[287] ^ C[288];
                    byArray2[AvatarPopupRow.C[289] ^ AvatarPopupRow.C[290]] = C[291] ^ C[292];
                    byArray2[AvatarPopupRow.C[293] ^ AvatarPopupRow.C[294]] = C[295] ^ C[296];
                    byArray2[AvatarPopupRow.C[297] ^ AvatarPopupRow.C[298]] = C[299] ^ C[300];
                    byArray2[AvatarPopupRow.C[301] ^ AvatarPopupRow.C[302]] = C[303] ^ C[304];
                    byArray2[AvatarPopupRow.C[305] ^ AvatarPopupRow.C[306]] = C[307] ^ C[308];
                    byArray2[AvatarPopupRow.C[309] ^ AvatarPopupRow.C[310]] = C[311] ^ C[312];
                    byArray2[AvatarPopupRow.C[313] ^ AvatarPopupRow.C[314]] = C[315] ^ C[316];
                    byArray2[AvatarPopupRow.C[317] ^ AvatarPopupRow.C[318]] = C[319] ^ C[320];
                    byArray2[AvatarPopupRow.C[321] ^ AvatarPopupRow.C[322]] = C[323] ^ C[324];
                    byArray2[AvatarPopupRow.C[325] ^ AvatarPopupRow.C[326]] = C[327] ^ C[328];
                    byArray2[AvatarPopupRow.C[329] ^ AvatarPopupRow.C[330]] = C[331] ^ C[332];
                    byArray2[AvatarPopupRow.C[333] ^ AvatarPopupRow.C[334]] = C[335] ^ C[336];
                    byArray2[AvatarPopupRow.C[337] ^ AvatarPopupRow.C[338]] = C[339] ^ C[340];
                    byArray2[AvatarPopupRow.C[341] ^ AvatarPopupRow.C[342]] = C[343] ^ C[344];
                    byArray2[AvatarPopupRow.C[345] ^ AvatarPopupRow.C[346]] = C[347] ^ C[348];
                    byArray2[AvatarPopupRow.C[349] ^ AvatarPopupRow.C[350]] = C[351] ^ C[352];
                    byArray2[AvatarPopupRow.C[353] ^ AvatarPopupRow.C[354]] = C[355] ^ C[356];
                    byArray2[AvatarPopupRow.C[357] ^ AvatarPopupRow.C[358]] = C[359] ^ C[360];
                    byArray2[AvatarPopupRow.C[361] ^ AvatarPopupRow.C[362]] = C[363] ^ C[364];
                    byArray2[AvatarPopupRow.C[365] ^ AvatarPopupRow.C[366]] = C[367] ^ C[368];
                    byArray2[AvatarPopupRow.C[369] ^ AvatarPopupRow.C[370]] = C[371] ^ C[372];
                    byArray2[AvatarPopupRow.C[373] ^ AvatarPopupRow.C[374]] = C[375] ^ C[376];
                    byArray2[AvatarPopupRow.C[377] ^ AvatarPopupRow.C[378]] = C[379] ^ C[380];
                    byte[] byArray3 = new byte[byArray.length + byArray2.length];
                    System.arraycopy(byArray, C[381], byArray3, C[382], byArray.length);
                    System.arraycopy(byArray2, C[383], byArray3, byArray.length, byArray2.length);
                    Object object4 = AvatarPopupRow.A()[C[384]];
                    if (object4 == null) {
                        char[] cArray = "\u6276\u625c\u625f\u6242\u6258\u624c\u6223\u60b9\u60b2\u60be\u625e\u6255\u60a1\u60a7\u6257\u625e\u6241\u6271".toCharArray();
                        for (int i2 = C[385]; i2 < C[386]; ++i2) {
                            int n3 = cArray[i2];
                            n3 ^= C[387];
                            n3 ^= C[388];
                            n3 += C[389];
                            n3 -= C[390];
                            n3 -= C[391];
                            n3 ^= C[392];
                            n3 -= C[393];
                            n3 -= C[394];
                            n3 ^= C[395];
                            n3 += C[396];
                            cArray[i2] = (char)(n3 ^= C[397]);
                        }
                        object4 = AvatarPopupRow.A()[AvatarPopupRow.C[398]] = new String(cArray);
                    }
                    SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                    byte[] byArray4 = new byte[C[399]];
                    byArray4[14] = 80;
                    byArray4[12] = -86;
                    byArray4[10] = -7;
                    byArray4[5] = 112;
                    byArray4[2] = -51;
                    byArray4[8] = -96;
                    byArray4[0] = 74;
                    byArray4[11] = -95;
                    byArray4[9] = -11;
                    byArray4[7] = 118;
                    byArray4[15] = 14;
                    byArray4[13] = -61;
                    byArray4[1] = 30;
                    byArray4[4] = -14;
                    byArray4[6] = 7;
                    byArray4[3] = 74;
                    PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 15, 256);
                    byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                    Object object5 = AvatarPopupRow.A()[2];
                    if (object5 == null) {
                        char[] cArray = "\u78bc\u7890\u7b66".toCharArray();
                        for (int i3 = 0; i3 < 3; ++i3) {
                            int n4 = cArray[i3];
                            n4 ^= 0x7142;
                            n4 += 1732;
                            n4 -= 35908;
                            n4 -= 41733;
                            n4 ^= 0x3665;
                            n4 += 21031;
                            n4 += 28232;
                            n4 -= 24842;
                            n4 ^= 0x598A;
                            n4 += 37707;
                            n4 ^= 0xEC;
                            n4 -= 59762;
                            n4 += 18265;
                            n4 += 33150;
                            cArray[i3] = (char)(n4 -= 57822);
                        }
                        object5 = AvatarPopupRow.A()[2] = new String(cArray);
                    }
                    b = new SecretKeySpec(byArray5, (String)object5);
                }
                byte[] byArray6 = Base64.getDecoder().decode(string);
                byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
                byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
                Object object6 = AvatarPopupRow.A()[3];
                if (object6 == null) {
                    char[] cArray = "\u2be5\u2be9\u2b97\u2d03\u2be7\u2bea\u2be7\u2d03\u2b98\u2b8f\u2be7\u2b97\u2d39\u2b98\u2bc5\u2bcc\u2bcc\u2bed\u2cd6\u2bfb".toCharArray();
                    for (int i4 = 0; i4 < 20; ++i4) {
                        int n5 = cArray[i4];
                        n5 += 55537;
                        n5 -= 61604;
                        n5 -= 58677;
                        n5 -= 21077;
                        n5 ^= 0xA129;
                        n5 += 64857;
                        n5 ^= 0x7389;
                        n5 += 53498;
                        n5 -= 8910;
                        n5 -= 21486;
                        n5 ^= 0xE8DF;
                        cArray[i4] = (char)(n5 ^= 0x8B0F);
                    }
                    object6 = AvatarPopupRow.A()[3] = new String(cArray);
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
            C = new int[0x24E6 ^ 0x2576];
            AvatarPopupRow.C[0x4EA5 ^ 0x4F8F] = 0x141DC ^ 0x4F8F;
            AvatarPopupRow.C[0x5032 ^ 0x50E8] = 0x608A ^ 0x50E8;
            AvatarPopupRow.C[0x6238 ^ 0x632A] = 0x16BE8 ^ 0x632A;
            AvatarPopupRow.C[0xAAE6 ^ 0xAAD8] = 0xFFFF555A ^ 0xAAD8;
            AvatarPopupRow.C[0x7846 ^ 0x7826] = 0x781F ^ 0x7826;
            AvatarPopupRow.C[0x3929 ^ 0x3974] = 0xFFFFC6D4 ^ 0x3974;
            AvatarPopupRow.C[0x3BE9 ^ 0x3A68] = 0x3A68 ^ 0x3A68;
            AvatarPopupRow.C[0x3CAD ^ 0x3C6D] = 0xFFFFFDF6 ^ 0x3C6D;
            AvatarPopupRow.C[0xD39A ^ 0xD380] = 0xD387 ^ 0xD380;
            AvatarPopupRow.C[0xFE ^ 0xEE] = 0x99 ^ 0xEE;
            AvatarPopupRow.C[0xEC2B ^ 0xEC28] = 0xFFFF13BF ^ 0xEC28;
            AvatarPopupRow.C[0xEFCC ^ 0xEEEF] = 0xFFD2 ^ 0xEEEF;
            AvatarPopupRow.C[0x648B ^ 0x6406] = 0x640A ^ 0x6406;
            AvatarPopupRow.C[0xF073 ^ 0xF01F] = 0x4E5D ^ 0xF01F;
            AvatarPopupRow.C[0xC074 ^ 0xC0E5] = 0xC0FA ^ 0xC0E5;
            AvatarPopupRow.C[0x3E94 ^ 0x3EB4] = 0xFFFFC143 ^ 0x3EB4;
            AvatarPopupRow.C[0xAE24 ^ 0xAE77] = 0xAE42 ^ 0xAE77;
            AvatarPopupRow.C[0x4338 ^ 0x4336] = 0x431B ^ 0x4336;
            AvatarPopupRow.C[0xDF9A ^ 0xDF15] = 0xFFFF2083 ^ 0xDF15;
            AvatarPopupRow.C[0x781E ^ 0x7811] = 0x781D ^ 0x7811;
            AvatarPopupRow.C[0xE147 ^ 0xE1AC] = 0xAA17 ^ 0xE1AC;
            AvatarPopupRow.C[0x80CC ^ 0x80BF] = 0xF010 ^ 0x80BF;
            AvatarPopupRow.C[0xB751 ^ 0xB742] = 0xFFFF488F ^ 0xB742;
            AvatarPopupRow.C[0xC37B ^ 0xC268] = 0xFFFE3526 ^ 0xC268;
            AvatarPopupRow.C[0x80A6 ^ 0x8188] = 0xB27D ^ 0x8188;
            AvatarPopupRow.C[0x3E91 ^ 0x3F16] = 0xF591 ^ 0x3F16;
            AvatarPopupRow.C[0x152E ^ 0x1469] = 0xD5CF ^ 0x1469;
            AvatarPopupRow.C[0x7E5F ^ 0x7EA9] = 0x53B3 ^ 0x7EA9;
            AvatarPopupRow.C[0x9D84 ^ 0x9DEE] = 0x9D76 ^ 0x9DEE;
            AvatarPopupRow.C[0xDD8C ^ 0xDDB6] = 0xDDB5 ^ 0xDDB6;
            AvatarPopupRow.C[0xA7C7 ^ 0xA79C] = 0xFFFF5841 ^ 0xA79C;
            AvatarPopupRow.C[0x10558 ^ 0x105B8] = 0xFFFE18E5 ^ 0x105B8;
            AvatarPopupRow.C[0x8690 ^ 0x878A] = 0x5A ^ 0x878A;
            AvatarPopupRow.C[0x8E5B ^ 0x8E32] = 0x8E32 ^ 0x8E32;
            AvatarPopupRow.C[0x8D5A ^ 0x8D3C] = 0x8D3C ^ 0x8D3C;
            AvatarPopupRow.C[0xBCD0 ^ 0xBDDB] = 0x558B ^ 0xBDDB;
            AvatarPopupRow.C[0xC7F0 ^ 0xC705] = 0xC78E ^ 0xC705;
            AvatarPopupRow.C[0x39CB ^ 0x39E3] = 0x39D3 ^ 0x39E3;
            AvatarPopupRow.C[0xF43D ^ 0xF576] = 0xFFFF3900 ^ 0xF576;
            AvatarPopupRow.C[0x9AA8 ^ 0x9AB1] = 0xFFFF656E ^ 0x9AB1;
            AvatarPopupRow.C[0xDA24 ^ 0xDAB1] = 0xDA83 ^ 0xDAB1;
            AvatarPopupRow.C[0x7B4D ^ 0x7B2A] = 0x7B28 ^ 0x7B2A;
            AvatarPopupRow.C[0x9190 ^ 0x913B] = 0xFFFF6EDC ^ 0x913B;
            AvatarPopupRow.C[0xA0E7 ^ 0xA1EA] = 0x3643 ^ 0xA1EA;
            AvatarPopupRow.C[0xD17 ^ 0xC47] = 0xF9BA ^ 0xC47;
            AvatarPopupRow.C[0xC6D0 ^ 0xC69B] = 0xC6B1 ^ 0xC69B;
            AvatarPopupRow.C[0x10B6E ^ 0x10B5B] = 0x10B16 ^ 0x10B5B;
            AvatarPopupRow.C[0x9980 ^ 0x99C4] = 0xFFFF6602 ^ 0x99C4;
            AvatarPopupRow.C[0x611 ^ 0x66F] = 0x67A ^ 0x66F;
            AvatarPopupRow.C[0x552D ^ 0x54A5] = 0x686C ^ 0x54A5;
            AvatarPopupRow.C[0x79B ^ 0x693] = 0xC955 ^ 0x693;
            AvatarPopupRow.C[0xFEA8 ^ 0xFE10] = 0x592C ^ 0xFE10;
            AvatarPopupRow.C[0xF45B ^ 0xF5D4] = 0xF5C4 ^ 0xF5D4;
            AvatarPopupRow.C[0x8B20 ^ 0x8B88] = 0x8BC1 ^ 0x8B88;
            AvatarPopupRow.C[0x895F ^ 0x89E1] = 0xB7CF ^ 0x89E1;
            AvatarPopupRow.C[0x406A ^ 0x41EA] = 0x41EB ^ 0x41EA;
            AvatarPopupRow.C[0x77A2 ^ 0x7769] = 0xB7BB ^ 0x7769;
            AvatarPopupRow.C[0xF280 ^ 0xF241] = 0xCC65 ^ 0xF241;
            AvatarPopupRow.C[0x5287 ^ 0x521F] = 0xFFFFADB3 ^ 0x521F;
            AvatarPopupRow.C[0x8950 ^ 0x895A] = 0xFFFF76B5 ^ 0x895A;
            AvatarPopupRow.C[0x1C43 ^ 0x1D11] = 0x7085 ^ 0x1D11;
            AvatarPopupRow.C[0x377D ^ 0x363B] = 0xF7F3 ^ 0x363B;
            AvatarPopupRow.C[0xC427 ^ 0xC427] = 0xC485 ^ 0xC427;
            AvatarPopupRow.C[0x764B ^ 0x7715] = 0x439D ^ 0x7715;
            AvatarPopupRow.C[0x8CCD ^ 0x8C5D] = 0xFFFF73B8 ^ 0x8C5D;
            AvatarPopupRow.C[0x555C ^ 0x552A] = 0x64BC ^ 0x552A;
            AvatarPopupRow.C[0x5466 ^ 0x5407] = 0xFFFFABA9 ^ 0x5407;
            AvatarPopupRow.C[0xAF6B ^ 0xAE5C] = 0xFFFFF7E4 ^ 0xAE5C;
            AvatarPopupRow.C[0x92CE ^ 0x9399] = 0xFFFF744D ^ 0x9399;
            AvatarPopupRow.C[0x10AE1 ^ 0x10AB5] = 0x10AD9 ^ 0x10AB5;
            AvatarPopupRow.C[0x78A3 ^ 0x78BC] = 0x78AE ^ 0x78BC;
            AvatarPopupRow.C[0x5B6D ^ 0x5B6A] = 0x5B6F ^ 0x5B6A;
            AvatarPopupRow.C[0x90AA ^ 0x906D] = 0x833C ^ 0x906D;
            AvatarPopupRow.C[0xAFA7 ^ 0xAFEE] = 0xAF94 ^ 0xAFEE;
            AvatarPopupRow.C[0x3A94 ^ 0x3BED] = 0x4353 ^ 0x3BED;
            AvatarPopupRow.C[0x7787 ^ 0x777F] = 0x5A28 ^ 0x777F;
            AvatarPopupRow.C[0x837C ^ 0x8203] = 0x8203 ^ 0x8203;
            AvatarPopupRow.C[0x92BF ^ 0x93A4] = 0xFFFFEBBC ^ 0x93A4;
            AvatarPopupRow.C[0xC5C6 ^ 0xC590] = 0xC5DE ^ 0xC590;
            AvatarPopupRow.C[0x7193 ^ 0x70FE] = 0x4B36 ^ 0x70FE;
            AvatarPopupRow.C[0x715C ^ 0x703C] = 0x44B4 ^ 0x703C;
            AvatarPopupRow.C[0x2209 ^ 0x2288] = 0x22CE ^ 0x2288;
            AvatarPopupRow.C[0x22BC ^ 0x222E] = 0x224F ^ 0x222E;
            AvatarPopupRow.C[0x8BE4 ^ 0x8B5E] = 0x429C ^ 0x8B5E;
            AvatarPopupRow.C[0xEAEF ^ 0xEAC2] = 0xFFFF152B ^ 0xEAC2;
            AvatarPopupRow.C[0xAB8D ^ 0xAB20] = 0xFFFF54DD ^ 0xAB20;
            AvatarPopupRow.C[0x105CA ^ 0x1056B] = 0xFFFEFAE8 ^ 0x1056B;
            AvatarPopupRow.C[0x63A ^ 0x73C] = 0xC8FA ^ 0x73C;
            AvatarPopupRow.C[0x5B23 ^ 0x5A27] = 0xA568 ^ 0x5A27;
            AvatarPopupRow.C[0x374 ^ 0x3BB] = 0x1F02 ^ 0x3BB;
            AvatarPopupRow.C[0x6CAC ^ 0x6DFF] = 0x53 ^ 0x6DFF;
            AvatarPopupRow.C[0xD6A5 ^ 0xD7E1] = 0x5F0 ^ 0xD7E1;
            AvatarPopupRow.C[0xC87F ^ 0xC8A2] = 0xF8C5 ^ 0xC8A2;
            AvatarPopupRow.C[0xADD8 ^ 0xACDA] = 0x5395 ^ 0xACDA;
            AvatarPopupRow.C[0x106EE ^ 0x10664] = 0x1067C ^ 0x10664;
            AvatarPopupRow.C[0x676D ^ 0x6650] = 0x33F4 ^ 0x6650;
            AvatarPopupRow.C[0x1374 ^ 0x1207] = 0xED04 ^ 0x1207;
            AvatarPopupRow.C[0x2324 ^ 0x221C] = 0x8436 ^ 0x221C;
            AvatarPopupRow.C[0x2C97 ^ 0x2D94] = 0xD2D5 ^ 0x2D94;
            AvatarPopupRow.C[0x2B01 ^ 0x2A1E] = 0xFFFF9EA5 ^ 0x2A1E;
            AvatarPopupRow.C[0x20E2 ^ 0x21F4] = 0xC245 ^ 0x21F4;
            AvatarPopupRow.C[0x3A09 ^ 0x3A57] = 0x3A62 ^ 0x3A57;
            AvatarPopupRow.C[0x8694 ^ 0x86E3] = 0xAA1F ^ 0x86E3;
            AvatarPopupRow.C[0x6AEA ^ 0x6A51] = 0xA39F ^ 0x6A51;
            AvatarPopupRow.C[0x8AA9 ^ 0x8A64] = 0x4AB6 ^ 0x8A64;
            AvatarPopupRow.C[0xE1D8 ^ 0xE121] = 0xCC33 ^ 0xE121;
            AvatarPopupRow.C[0xF66F ^ 0xF671] = 0xFFFF0990 ^ 0xF671;
            AvatarPopupRow.C[0xED88 ^ 0xED83] = 0xED87 ^ 0xED83;
            AvatarPopupRow.C[0xAE92 ^ 0xAEF7] = 0xAEF6 ^ 0xAEF7;
            AvatarPopupRow.C[0x10206 ^ 0x1034C] = 0x130DC ^ 0x1034C;
            AvatarPopupRow.C[0x4BF8 ^ 0x4B0C] = 0xFFFFB407 ^ 0x4B0C;
            AvatarPopupRow.C[0xBA81 ^ 0xBAC3] = 0xFFFF452A ^ 0xBAC3;
            AvatarPopupRow.C[0xE66E ^ 0xE72B] = 0x26FF ^ 0xE72B;
            AvatarPopupRow.C[0x4F2F ^ 0x4E67] = 0x8FAF ^ 0x4E67;
            AvatarPopupRow.C[0x6A59 ^ 0x6B0D] = 0x699 ^ 0x6B0D;
            AvatarPopupRow.C[0xA326 ^ 0xA244] = 0x1AA23 ^ 0xA244;
            AvatarPopupRow.C[0xE71 ^ 0xECE] = 0x30EA ^ 0xECE;
            AvatarPopupRow.C[0xD0D2 ^ 0xD00D] = 0x32CE ^ 0xD00D;
            AvatarPopupRow.C[0x22B8 ^ 0x238D] = 0x85BF ^ 0x238D;
            AvatarPopupRow.C[0x54BB ^ 0x549A] = 0xFFFFAB68 ^ 0x549A;
            AvatarPopupRow.C[0x107A ^ 0x1134] = 0xE4C9 ^ 0x1134;
            AvatarPopupRow.C[0x1D42 ^ 0x1CC7] = 0xFE72 ^ 0x1CC7;
            AvatarPopupRow.C[0x910F ^ 0x91BB] = 0x91BB ^ 0x91BB;
            AvatarPopupRow.C[0x1F4C ^ 0x1F1C] = 0x1F3A ^ 0x1F1C;
            AvatarPopupRow.C[0x3565 ^ 0x35C3] = 0x351C ^ 0x35C3;
            AvatarPopupRow.C[0x21D1 ^ 0x2093] = 0xF282 ^ 0x2093;
            AvatarPopupRow.C[0x48B4 ^ 0x48D6] = 0xFFFFB743 ^ 0x48D6;
            AvatarPopupRow.C[0x72D ^ 0x627] = 0xEE01 ^ 0x627;
            AvatarPopupRow.C[0x580A ^ 0x5988] = 0x599A ^ 0x5988;
            AvatarPopupRow.C[0x319C ^ 0x3120] = 0xFFFF0734 ^ 0x3120;
            AvatarPopupRow.C[0x72A8 ^ 0x72C5] = 0xBBA3 ^ 0x72C5;
            AvatarPopupRow.C[0x6FB1 ^ 0x6ED7] = 0xC653 ^ 0x6ED7;
            AvatarPopupRow.C[0x6AA0 ^ 0x6AE8] = 0xFFFF9590 ^ 0x6AE8;
            AvatarPopupRow.C[0xFB88 ^ 0xFAEF] = 0xFFFFADD9 ^ 0xFAEF;
            AvatarPopupRow.C[0x43EB ^ 0x42E4] = 0xFFFF2ADD ^ 0x42E4;
            AvatarPopupRow.C[0xA2F7 ^ 0xA279] = 0xA216 ^ 0xA279;
            AvatarPopupRow.C[0xCC7F ^ 0xCDF4] = 0xD019 ^ 0xCDF4;
            AvatarPopupRow.C[0xC7A3 ^ 0xC7D2] = 0xDAFC ^ 0xC7D2;
            AvatarPopupRow.C[0x4B0B ^ 0x4B2F] = 0x4B1B ^ 0x4B2F;
            AvatarPopupRow.C[0x103E3 ^ 0x1031F] = 0x11BEE ^ 0x1031F;
            AvatarPopupRow.C[0x38B2 ^ 0x39E7] = 0x21A1 ^ 0x39E7;
            AvatarPopupRow.C[0x949C ^ 0x94A8] = 0xFFFF6B32 ^ 0x94A8;
            AvatarPopupRow.C[0x5076 ^ 0x500B] = 0x500E ^ 0x500B;
            AvatarPopupRow.C[0x9669 ^ 0x96CB] = 0x96E7 ^ 0x96CB;
            AvatarPopupRow.C[0xD56F ^ 0xD58D] = 0x8FCC ^ 0xD58D;
            AvatarPopupRow.C[0x9CC1 ^ 0x9D48] = 0x53D1 ^ 0x9D48;
            AvatarPopupRow.C[0xB77E ^ 0xB610] = 0x8DD2 ^ 0xB610;
            AvatarPopupRow.C[0x2047 ^ 0x20BD] = 0x20BD ^ 0x20BD;
            AvatarPopupRow.C[0xD6EF ^ 0xD6B3] = 0xD6B4 ^ 0xD6B3;
            AvatarPopupRow.C[0x4FBF ^ 0x4F6E] = 0x53D7 ^ 0x4F6E;
            AvatarPopupRow.C[0x1D14 ^ 0x1D4E] = 0xFFFFE295 ^ 0x1D4E;
            AvatarPopupRow.C[0xDB47 ^ 0xDACB] = 0x9A34 ^ 0xDACB;
            AvatarPopupRow.C[0x80B6 ^ 0x80BB] = 0x80B0 ^ 0x80BB;
            AvatarPopupRow.C[0xA854 ^ 0xA8D1] = 0xFFFF5726 ^ 0xA8D1;
            AvatarPopupRow.C[0xDC8A ^ 0xDDC7] = 0x2836 ^ 0xDDC7;
            AvatarPopupRow.C[0x1AA ^ 0x1AE] = 0x1DC ^ 0x1AE;
            AvatarPopupRow.C[0x3523 ^ 0x3558] = 0x3537 ^ 0x3558;
            AvatarPopupRow.C[0xBABE ^ 0xBA57] = 0xF015 ^ 0xBA57;
            AvatarPopupRow.C[0x19B5 ^ 0x19A7] = 0x19EF ^ 0x19A7;
            AvatarPopupRow.C[0xB386 ^ 0xB351] = 0x3AB8 ^ 0xB351;
            AvatarPopupRow.C[0x9A97 ^ 0x9AD0] = 0xFFFF6551 ^ 0x9AD0;
            AvatarPopupRow.C[0xC9DE ^ 0xC8C3] = 0x83F5 ^ 0xC8C3;
            AvatarPopupRow.C[0x145B ^ 0x1402] = 0xFFFFEBE1 ^ 0x1402;
            AvatarPopupRow.C[0x81B5 ^ 0x80CD] = 0x127 ^ 0x80CD;
            AvatarPopupRow.C[0x6322 ^ 0x63BB] = 0xFFFF9C78 ^ 0x63BB;
            AvatarPopupRow.C[0x3F54 ^ 0x3FD7] = 0x3F9D ^ 0x3FD7;
            AvatarPopupRow.C[0x762F ^ 0x76FD] = 0xDD06 ^ 0x76FD;
            AvatarPopupRow.C[0x3AF9 ^ 0x3A8D] = 0xE0DD ^ 0x3A8D;
            AvatarPopupRow.C[0xDCBB ^ 0xDC2F] = 0xFFFF239B ^ 0xDC2F;
            AvatarPopupRow.C[0x885D ^ 0x88AC] = 0x7A10 ^ 0x88AC;
            AvatarPopupRow.C[0xE739 ^ 0xE701] = 0xE76D ^ 0xE701;
            AvatarPopupRow.C[0xC783 ^ 0xC6EA] = 0x10CA ^ 0xC6EA;
            AvatarPopupRow.C[0x7255 ^ 0x7202] = 0xFFFF8DB6 ^ 0x7202;
            AvatarPopupRow.C[0xC90A ^ 0xC96E] = 0xC96E ^ 0xC96E;
            AvatarPopupRow.C[0xEF30 ^ 0xEF85] = 0xEF84 ^ 0xEF85;
            AvatarPopupRow.C[0xA245 ^ 0xA2D9] = 0xA2E3 ^ 0xA2D9;
            AvatarPopupRow.C[0xB623 ^ 0xB763] = 0xE2D0 ^ 0xB763;
            AvatarPopupRow.C[0xB1BE ^ 0xB082] = 0xCE4B ^ 0xB082;
            AvatarPopupRow.C[0xF86C ^ 0xF97D] = 0x1F1BF ^ 0xF97D;
            AvatarPopupRow.C[0xE72 ^ 0xF6B] = 0x88B0 ^ 0xF6B;
            AvatarPopupRow.C[0x45D8 ^ 0x44EB] = 0xDBBC ^ 0x44EB;
            AvatarPopupRow.C[0x4F8F ^ 0x4FA8] = 0xFFFFB066 ^ 0x4FA8;
            AvatarPopupRow.C[0x16A3 ^ 0x16E0] = 0xFFFFE91D ^ 0x16E0;
            AvatarPopupRow.C[0x39F1 ^ 0x39BE] = 0xFFFFC640 ^ 0x39BE;
            AvatarPopupRow.C[0xE149 ^ 0xE016] = 0xD4AC ^ 0xE016;
            AvatarPopupRow.C[0xB1ED ^ 0xB09C] = 0x4FF7 ^ 0xB09C;
            AvatarPopupRow.C[0xB17E ^ 0xB18E] = 0x434C ^ 0xB18E;
            AvatarPopupRow.C[0x64D1 ^ 0x64F8] = 0x64FD ^ 0x64F8;
            AvatarPopupRow.C[0xF658 ^ 0xF725] = 0xF725 ^ 0xF725;
            AvatarPopupRow.C[0xD3D0 ^ 0xD2B3] = 0xFFFE251E ^ 0xD2B3;
            AvatarPopupRow.C[0xC6C ^ 0xC8B] = 0x46C9 ^ 0xC8B;
            AvatarPopupRow.C[0x7690 ^ 0x7618] = 0xFFFF89CD ^ 0x7618;
            AvatarPopupRow.C[0x9EAC ^ 0x9EF9] = 0xFFFF611B ^ 0x9EF9;
            AvatarPopupRow.C[0x18E5 ^ 0x19C1] = 0x8F3 ^ 0x19C1;
            AvatarPopupRow.C[0x5B7C ^ 0x5BB5] = 0x48E4 ^ 0x5BB5;
            AvatarPopupRow.C[0xADA9 ^ 0xAD82] = 0xADA2 ^ 0xAD82;
            AvatarPopupRow.C[0xDAF2 ^ 0xDA69] = 0xDA29 ^ 0xDA69;
            AvatarPopupRow.C[0x1FE1 ^ 0x1F39] = 0xFFFF6953 ^ 0x1F39;
            AvatarPopupRow.C[0x7391 ^ 0x73F9] = 0x73F9 ^ 0x73F9;
            AvatarPopupRow.C[0xE83C ^ 0xE905] = 0x97D1 ^ 0xE905;
            AvatarPopupRow.C[0xF3E4 ^ 0xF262] = 0x26C7 ^ 0xF262;
            AvatarPopupRow.C[0xDCCB ^ 0xDDCA] = 0x2288 ^ 0xDDCA;
            AvatarPopupRow.C[0xEA7D ^ 0xEA08] = 0xFC5C ^ 0xEA08;
            AvatarPopupRow.C[0xA7CA ^ 0xA763] = 0xFFFF58EE ^ 0xA763;
            AvatarPopupRow.C[0x5120 ^ 0x5044] = 0x15823 ^ 0x5044;
            AvatarPopupRow.C[0x8EBB ^ 0x8EF6] = 0xFFFF715F ^ 0x8EF6;
            AvatarPopupRow.C[0x4083 ^ 0x40FA] = 0x4065 ^ 0x40FA;
            AvatarPopupRow.C[0x39DC ^ 0x39B2] = 0xA5F4 ^ 0x39B2;
            AvatarPopupRow.C[0xC22 ^ 0xD1C] = 0x58AF ^ 0xD1C;
            AvatarPopupRow.C[0xE10 ^ 0xF62] = 0xF016 ^ 0xF62;
            AvatarPopupRow.C[0x9106 ^ 0x914A] = 0x9138 ^ 0x914A;
            AvatarPopupRow.C[0x1BA1 ^ 0x1B77] = 0x9293 ^ 0x1B77;
            AvatarPopupRow.C[0xE070 ^ 0xE1FE] = 0xE1FF ^ 0xE1FE;
            AvatarPopupRow.C[0xAC19 ^ 0xAC66] = 0xAC12 ^ 0xAC66;
            AvatarPopupRow.C[0x7FF0 ^ 0x7EA8] = 0x66FE ^ 0x7EA8;
            AvatarPopupRow.C[0x93D8 ^ 0x92CC] = 0x19A0E ^ 0x92CC;
            AvatarPopupRow.C[0x34ED ^ 0x3441] = 0x3415 ^ 0x3441;
            AvatarPopupRow.C[0xCA83 ^ 0xCA19] = 0xCA43 ^ 0xCA19;
            AvatarPopupRow.C[0x170F ^ 0x17A5] = 0xFFFFE82F ^ 0x17A5;
            AvatarPopupRow.C[0xBFA7 ^ 0xBF81] = 0xBFBA ^ 0xBF81;
            AvatarPopupRow.C[0x10DCB ^ 0x10D23] = 0xFFFEB8AE ^ 0x10D23;
            AvatarPopupRow.C[0x4F0B ^ 0x4E27] = 0x14074 ^ 0x4E27;
            AvatarPopupRow.C[0xA832 ^ 0xA8E7] = 0x317 ^ 0xA8E7;
            AvatarPopupRow.C[0xCC ^ 0x1E4] = 0x71BB ^ 0x1E4;
            AvatarPopupRow.C[0xC8B7 ^ 0xC801] = 0xC800 ^ 0xC801;
            AvatarPopupRow.C[0x4E12 ^ 0x4F33] = 0x5E07 ^ 0x4F33;
            AvatarPopupRow.C[0x47E1 ^ 0x4793] = 0xEADC ^ 0x4793;
            AvatarPopupRow.C[0x416 ^ 0x426] = 0xFFFFFB57 ^ 0x426;
            AvatarPopupRow.C[0xD80B ^ 0xD8C9] = 0x6BD9 ^ 0xD8C9;
            AvatarPopupRow.C[0x690D ^ 0x684C] = 0xBA46 ^ 0x684C;
            AvatarPopupRow.C[0xCFD3 ^ 0xCFF6] = 0xFFFF306C ^ 0xCFF6;
            AvatarPopupRow.C[0xB64A ^ 0xB6F7] = 0x7F39 ^ 0xB6F7;
            AvatarPopupRow.C[0x58F8 ^ 0x5993] = 0x8FA4 ^ 0x5993;
            AvatarPopupRow.C[0x2904 ^ 0x29B3] = 0x29B3 ^ 0x29B3;
            AvatarPopupRow.C[0x1048D ^ 0x10423] = 0x10414 ^ 0x10423;
            AvatarPopupRow.C[0x4A3 ^ 0x599] = 0x7B50 ^ 0x599;
            AvatarPopupRow.C[0xBAF4 ^ 0xBA2F] = 0x8A48 ^ 0xBA2F;
            AvatarPopupRow.C[0xF3B ^ 0xE27] = 0x89F7 ^ 0xE27;
            AvatarPopupRow.C[0xAB70 ^ 0xAB64] = 0xFFFF54E0 ^ 0xAB64;
            AvatarPopupRow.C[0xD075 ^ 0xD073] = 0xD071 ^ 0xD073;
            AvatarPopupRow.C[0xD4F ^ 0xDAB] = 0xFFFFA84A ^ 0xDAB;
            AvatarPopupRow.C[0xAEF2 ^ 0xAFAE] = 0xEEDF ^ 0xAFAE;
            AvatarPopupRow.C[0xCC25 ^ 0xCC18] = 0xCC28 ^ 0xCC18;
            AvatarPopupRow.C[0xBEDF ^ 0xBEE6] = 0xFFFF4124 ^ 0xBEE6;
            AvatarPopupRow.C[0x370A ^ 0x371C] = 0x372B ^ 0x371C;
            AvatarPopupRow.C[0xEBFD ^ 0xEACF] = 0x75FB ^ 0xEACF;
            AvatarPopupRow.C[0x3B6B ^ 0x3BAF] = 0x88DA ^ 0x3BAF;
            AvatarPopupRow.C[0xA635 ^ 0xA732] = 0x68B9 ^ 0xA732;
            AvatarPopupRow.C[0xEA2 ^ 0xE88] = 0xFFFFF140 ^ 0xE88;
            AvatarPopupRow.C[0x2979 ^ 0x2928] = 0x2969 ^ 0x2928;
            AvatarPopupRow.C[0xBB9B ^ 0xBAFE] = 0x1274 ^ 0xBAFE;
            AvatarPopupRow.C[0x44C1 ^ 0x45AE] = 0xFFFF81EC ^ 0x45AE;
            AvatarPopupRow.C[0x574D ^ 0x57A3] = 0xA511 ^ 0x57A3;
            AvatarPopupRow.C[0xB3C8 ^ 0xB3DF] = 0xB3E2 ^ 0xB3DF;
            AvatarPopupRow.C[0x1D00 ^ 0x1D22] = 0x1D41 ^ 0x1D22;
            AvatarPopupRow.C[0x9BA1 ^ 0x9B42] = 0xC101 ^ 0x9B42;
            AvatarPopupRow.C[0xDB39 ^ 0xDBEA] = 0x701A ^ 0xDBEA;
            AvatarPopupRow.C[0x6359 ^ 0x63C4] = 0x63CA ^ 0x63C4;
            AvatarPopupRow.C[0x1E96 ^ 0x1F98] = 0x8825 ^ 0x1F98;
            AvatarPopupRow.C[0x7F56 ^ 0x7F5A] = 0x7F68 ^ 0x7F5A;
            AvatarPopupRow.C[0xC461 ^ 0xC469] = 0xC46F ^ 0xC469;
            AvatarPopupRow.C[0xB89E ^ 0xB9B3] = 0x8A47 ^ 0xB9B3;
            AvatarPopupRow.C[0xAEC1 ^ 0xAE32] = 0xAEB9 ^ 0xAE32;
            AvatarPopupRow.C[0x9FE1 ^ 0x9FDA] = 0xFFFF603B ^ 0x9FDA;
            AvatarPopupRow.C[0x6705 ^ 0x6732] = 0x677B ^ 0x6732;
            AvatarPopupRow.C[0x10B7B ^ 0x10B72] = 0x10B61 ^ 0x10B72;
            AvatarPopupRow.C[0x5E11 ^ 0x5F6F] = 0x5F6F ^ 0x5F6F;
            AvatarPopupRow.C[0xA853 ^ 0xA899] = 0x684B ^ 0xA899;
            AvatarPopupRow.C[0xAEE5 ^ 0xAE69] = 0xAE7D ^ 0xAE69;
            AvatarPopupRow.C[0x5509 ^ 0x548A] = 0x48BA ^ 0x548A;
            AvatarPopupRow.C[0x6415 ^ 0x6543] = 0x7D15 ^ 0x6543;
            AvatarPopupRow.C[0xA066 ^ 0xA14F] = 0x1AF18 ^ 0xA14F;
            AvatarPopupRow.C[0xFE11 ^ 0xFE87] = 0xFFFF0121 ^ 0xFE87;
            AvatarPopupRow.C[0xD77E ^ 0xD602] = 0xAEB5 ^ 0xD602;
            AvatarPopupRow.C[0x35B8 ^ 0x35A3] = 0xFFFFCA2B ^ 0x35A3;
            AvatarPopupRow.C[0x9771 ^ 0x9645] = 0x971 ^ 0x9645;
            AvatarPopupRow.C[0x10950 ^ 0x1091A] = 0x10934 ^ 0x1091A;
            AvatarPopupRow.C[0x8A14 ^ 0x8AD1] = 0x39C5 ^ 0x8AD1;
            AvatarPopupRow.C[0x97D1 ^ 0x965C] = 0x5EC3 ^ 0x965C;
            AvatarPopupRow.C[0x4999 ^ 0x4974] = 0x2CF ^ 0x4974;
            AvatarPopupRow.C[0x4B16 ^ 0x4BE4] = 0x4B6C ^ 0x4BE4;
            AvatarPopupRow.C[0xDE2D ^ 0xDE55] = 0xDE55 ^ 0xDE55;
            AvatarPopupRow.C[0x2C4C ^ 0x2C6F] = 0xFFFFD3E5 ^ 0x2C6F;
            AvatarPopupRow.C[0x50AA ^ 0x507A] = 0xFFFFB320 ^ 0x507A;
            AvatarPopupRow.C[0x9719 ^ 0x97F6] = 0x654A ^ 0x97F6;
            AvatarPopupRow.C[0x7FD0 ^ 0x7F2E] = 0x64BE ^ 0x7F2E;
            AvatarPopupRow.C[0x1D09 ^ 0x1D6A] = 0x1D69 ^ 0x1D6A;
            AvatarPopupRow.C[0xE863 ^ 0xE8D1] = 0xE8D0 ^ 0xE8D1;
            AvatarPopupRow.C[0xEF40 ^ 0xEF72] = 0xFFFF10C0 ^ 0xEF72;
            AvatarPopupRow.C[0xC26B ^ 0xC2EB] = 0xC2F9 ^ 0xC2EB;
            AvatarPopupRow.C[0x718A ^ 0x70D0] = 0x31A1 ^ 0x70D0;
            AvatarPopupRow.C[0xC872 ^ 0xC959] = 0x1C726 ^ 0xC959;
            AvatarPopupRow.C[0x2A24 ^ 0x2A64] = 0x2A2C ^ 0x2A64;
            AvatarPopupRow.C[0x153C ^ 0x153E] = 0xFFFFEA85 ^ 0x153E;
            AvatarPopupRow.C[0xCE04 ^ 0xCE83] = 0xFFFF3146 ^ 0xCE83;
            AvatarPopupRow.C[0x1820 ^ 0x1902] = 0x830 ^ 0x1902;
            AvatarPopupRow.C[0x3B0 ^ 0x2F9] = 0x3166 ^ 0x2F9;
            AvatarPopupRow.C[0x6589 ^ 0x652D] = 0x6505 ^ 0x652D;
            AvatarPopupRow.C[0x2B43 ^ 0x2A54] = 0xFFFF3621 ^ 0x2A54;
            AvatarPopupRow.C[0x255F ^ 0x259C] = 0x9688 ^ 0x259C;
            AvatarPopupRow.C[0x863B ^ 0x870D] = 0x2127 ^ 0x870D;
            AvatarPopupRow.C[0x10CF ^ 0x1180] = 0xFFFF1BC1 ^ 0x1180;
            AvatarPopupRow.C[0x7922 ^ 0x780D] = 0x4BFE ^ 0x780D;
            AvatarPopupRow.C[0x9FD7 ^ 0x9EEC] = 0xE034 ^ 0x9EEC;
            AvatarPopupRow.C[0xA23E ^ 0xA28F] = 0xA2B9 ^ 0xA28F;
            AvatarPopupRow.C[0x6C3A ^ 0x6CA5] = 0x6CF6 ^ 0x6CA5;
            AvatarPopupRow.C[0x1B8E ^ 0x1A9B] = 0xF93B ^ 0x1A9B;
            AvatarPopupRow.C[0xBAF9 ^ 0xBBDC] = 0xCB86 ^ 0xBBDC;
            AvatarPopupRow.C[0x5B19 ^ 0x5B41] = 0xFFFFA4E8 ^ 0x5B41;
            AvatarPopupRow.C[0xDE63 ^ 0xDEFD] = 0xDEBC ^ 0xDEFD;
            AvatarPopupRow.C[0x648B ^ 0x64FB] = 0xFF15 ^ 0x64FB;
            AvatarPopupRow.C[0xF4CF ^ 0xF5CF] = 0xEE5F ^ 0xF5CF;
            AvatarPopupRow.C[0x59B7 ^ 0x58EA] = 0x6C74 ^ 0x58EA;
            AvatarPopupRow.C[0xC64E ^ 0xC6A2] = 0xFFFF72FC ^ 0xC6A2;
            AvatarPopupRow.C[0x2D17 ^ 0x2D39] = 0x2D0D ^ 0x2D39;
            AvatarPopupRow.C[0x4FAF ^ 0x4EDB] = 0xB1AF ^ 0x4EDB;
            AvatarPopupRow.C[0x95B9 ^ 0x9588] = 0xFFFF6A17 ^ 0x9588;
            AvatarPopupRow.C[0xAE97 ^ 0xAFE7] = 0x9425 ^ 0xAFE7;
            AvatarPopupRow.C[0x4434 ^ 0x454E] = 0x3DF9 ^ 0x454E;
            AvatarPopupRow.C[0xF86 ^ 0xF79] = 0xFFFFEB0D ^ 0xF79;
            AvatarPopupRow.C[0xC9A3 ^ 0xC8D5] = 0x493F ^ 0xC8D5;
            AvatarPopupRow.C[0x3A30 ^ 0x3B5A] = 0xED69 ^ 0x3B5A;
            AvatarPopupRow.C[0x11E7 ^ 0x11E6] = 0xFFFFEE4D ^ 0x11E6;
            AvatarPopupRow.C[0xA738 ^ 0xA659] = 0x1AE2C ^ 0xA659;
            AvatarPopupRow.C[0x3EF5 ^ 0x3E55] = 0x3EDC ^ 0x3E55;
            AvatarPopupRow.C[0x6CF8 ^ 0x6C5F] = 0x6C29 ^ 0x6C5F;
            AvatarPopupRow.C[0x2D53 ^ 0x2C43] = 0xBBFE ^ 0x2C43;
            AvatarPopupRow.C[0xDA95 ^ 0xDACA] = 0xDAFC ^ 0xDACA;
            AvatarPopupRow.C[0x45CA ^ 0x444E] = 0x2C6A ^ 0x444E;
            AvatarPopupRow.C[0xC983 ^ 0xC95A] = 0x40B3 ^ 0xC95A;
            AvatarPopupRow.C[0x6517 ^ 0x6584] = 0xFFFF9A26 ^ 0x6584;
            AvatarPopupRow.C[0x312A ^ 0x3189] = 0x310D ^ 0x3189;
            AvatarPopupRow.C[0x4F5C ^ 0x4FD8] = 0x4FA6 ^ 0x4FD8;
            AvatarPopupRow.C[0xF98F ^ 0xF891] = 0xB3A0 ^ 0xF891;
            AvatarPopupRow.C[0x7630 ^ 0x762C] = 0x766D ^ 0x762C;
            AvatarPopupRow.C[0xFAEF ^ 0xFA78] = 0xFFFF0507 ^ 0xFA78;
            AvatarPopupRow.C[0xD1BA ^ 0xD176] = 0x11CA ^ 0xD176;
            AvatarPopupRow.C[0xE4C3 ^ 0xE4DB] = 0xFFFF1B07 ^ 0xE4DB;
            AvatarPopupRow.C[0x89C7 ^ 0x8884] = 0x5AE4 ^ 0x8884;
            AvatarPopupRow.C[0x4068 ^ 0x40C7] = 0x40D7 ^ 0x40C7;
            AvatarPopupRow.C[0x615 ^ 0x654] = 0xFFFFF9C3 ^ 0x654;
            AvatarPopupRow.C[0xB628 ^ 0xB6E0] = 0xA5ED ^ 0xB6E0;
            AvatarPopupRow.C[0x5D0B ^ 0x5D60] = 0xBAE1 ^ 0x5D60;
            AvatarPopupRow.C[0x730 ^ 0x617] = 0x765F ^ 0x617;
            AvatarPopupRow.C[0x3711 ^ 0x3620] = 0xA901 ^ 0x3620;
            AvatarPopupRow.C[0x22A ^ 0x32F] = 0xCCEB ^ 0x32F;
            AvatarPopupRow.C[0xDC31 ^ 0xDC94] = 0xDCA8 ^ 0xDC94;
            AvatarPopupRow.C[0x73A6 ^ 0x7368] = 0x6FD6 ^ 0x7368;
            AvatarPopupRow.C[0x2BC ^ 0x283] = 0xFFFFFD7D ^ 0x283;
            AvatarPopupRow.C[0x9A47 ^ 0x9A42] = 0x9A49 ^ 0x9A42;
            AvatarPopupRow.C[0x602A ^ 0x60D1] = 0x7800 ^ 0x60D1;
            AvatarPopupRow.C[0xA3C3 ^ 0xA3AC] = 0xE766 ^ 0xA3AC;
            AvatarPopupRow.C[0x473C ^ 0x4713] = 0xFFFFB886 ^ 0x4713;
            AvatarPopupRow.C[0xFCC ^ 0xFD1] = 0xFE6 ^ 0xFD1;
            AvatarPopupRow.C[0x7B89 ^ 0x7B00] = 0xFFFF84CD ^ 0x7B00;
            AvatarPopupRow.C[0xAC73 ^ 0xACF5] = 0xACE7 ^ 0xACF5;
            AvatarPopupRow.C[0x2B66 ^ 0x2B73] = 0xFFFFD481 ^ 0x2B73;
            AvatarPopupRow.C[0x10F2F ^ 0x10E47] = 0x1A6C3 ^ 0x10E47;
            AvatarPopupRow.C[0x3164 ^ 0x30EE] = 0xCCA2 ^ 0x30EE;
            AvatarPopupRow.C[0xAF80 ^ 0xAE89] = 0x46B6 ^ 0xAE89;
            AvatarPopupRow.C[0x836 ^ 0x8B4] = 0xFFFFF77D ^ 0x8B4;
            AvatarPopupRow.C[0xFABC ^ 0xFB8C] = 0xC879 ^ 0xFB8C;
            AvatarPopupRow.C[0x7CCE ^ 0x7CDF] = 0xFFFF835D ^ 0x7CDF;
            AvatarPopupRow.C[0x8000 ^ 0x8175] = 0x97 ^ 0x8175;
            AvatarPopupRow.C[0x190B ^ 0x194E] = 0x1940 ^ 0x194E;
            AvatarPopupRow.C[0xC655 ^ 0xC681] = 0xFFFF92E0 ^ 0xC681;
            AvatarPopupRow.C[0x53B9 ^ 0x52D5] = 0x84E6 ^ 0x52D5;
            AvatarPopupRow.C[0xE9D ^ 0xEA1] = 0xFFFFF1D3 ^ 0xEA1;
            AvatarPopupRow.C[0xB75F ^ 0xB7A2] = 0xAC2C ^ 0xB7A2;
            AvatarPopupRow.C[0x662B ^ 0x6727] = 0x8F01 ^ 0x6727;
            AvatarPopupRow.C[0x56F2 ^ 0x57A9] = 0x1692 ^ 0x57A9;
            AvatarPopupRow.C[0x10859 ^ 0x1089F] = 0x11BC8 ^ 0x1089F;
            AvatarPopupRow.C[0xC1DF ^ 0xC16C] = 0xC16E ^ 0xC16C;
            AvatarPopupRow.C[0xAACC ^ 0xABEC] = 0xE0DD ^ 0xABEC;
            AvatarPopupRow.C[0x7B3F ^ 0x7B6D] = 0x7B19 ^ 0x7B6D;
            AvatarPopupRow.C[0x8B6D ^ 0x8B8B] = 0xC1C6 ^ 0x8B8B;
            AvatarPopupRow.C[0xEEBF ^ 0xEE8C] = 0xFFFF1144 ^ 0xEE8C;
            AvatarPopupRow.C[0xDD69 ^ 0xDD5F] = 0xDD1C ^ 0xDD5F;
            AvatarPopupRow.C[0xE677 ^ 0xE76F] = 0x4DE ^ 0xE76F;
            AvatarPopupRow.C[0x90EB ^ 0x900E] = 0xCA4D ^ 0x900E;
            AvatarPopupRow.C[0x75A ^ 0x60B] = 0x6B85 ^ 0x60B;
            AvatarPopupRow.C[0xE2E5 ^ 0xE239] = 0xFFFF2DB7 ^ 0xE239;
            AvatarPopupRow.C[0xB9BD ^ 0xB89B] = 0xC8C4 ^ 0xB89B;
            AvatarPopupRow.C[0xFCA4 ^ 0xFCEA] = 0xFFFF0332 ^ 0xFCEA;
            AvatarPopupRow.C[0x10264 ^ 0x102EF] = 0xFFFEFD16 ^ 0x102EF;
            AvatarPopupRow.C[0x8B6D ^ 0x8B9A] = 0xA688 ^ 0x8B9A;
            AvatarPopupRow.C[0x69AA ^ 0x6986] = 0xFFFF964E ^ 0x6986;
            AvatarPopupRow.C[0x10517 ^ 0x10551] = 0xFFFEFAC2 ^ 0x10551;
            AvatarPopupRow.C[0x81A6 ^ 0x80D1] = 0x17F ^ 0x80D1;
            AvatarPopupRow.C[0xFEB5 ^ 0xFFCE] = 0xFFFF78C4 ^ 0xFFCE;
            AvatarPopupRow.C[0xDB2F ^ 0xDA76] = 0x9B04 ^ 0xDA76;
            AvatarPopupRow.C[0x29A2 ^ 0x29D8] = 0x29C8 ^ 0x29D8;
            AvatarPopupRow.C[0x770E ^ 0x77D0] = 0x9512 ^ 0x77D0;
            AvatarPopupRow.C[0xFCBA ^ 0xFD85] = 0xFFFF57F2 ^ 0xFD85;
            AvatarPopupRow.C[0x6E98 ^ 0x6E28] = 0x6E6E ^ 0x6E28;
            AvatarPopupRow.C[0x4784 ^ 0x4765] = 0xA5A6 ^ 0x4765;
            AvatarPopupRow.C[0xF069 ^ 0xF0D0] = 0x57FC ^ 0xF0D0;
            AvatarPopupRow.C[0xB1E7 ^ 0xB10D] = 0xFABF ^ 0xB10D;
            AvatarPopupRow.C[0xE47D ^ 0xE401] = 0xE431 ^ 0xE401;
            AvatarPopupRow.C[0x42ED ^ 0x43A1] = 0x7031 ^ 0x43A1;
        }
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0012\u0010\u000fJ8\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u00020\u0018H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001c\u001a\u00020\u001bH\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\u000f\u00a8\u0006#"}, d2={"Lkotakbaz/rain/ui/menu/MenuScreen$PopupRect;", "", "", "x", "y", "width", "height", "<init>", "(FFFF)V", "px", "py", "", "contains", "(FF)Z", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Lkotakbaz/rain/ui/menu/MenuScreen$PopupRect;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "getX", "getY", "getWidth", "getHeight", "rain-visuals"})
    private static final class PopupRect {
        private final float x;
        private final float y;
        private final float width;
        private final float height;
        private static Object[] a;
        private static Object b;
        private static Object[] B;
        private static Object[] A;
        private static Object[] c;
        public static int[] C;

        public PopupRect(float x2, float y, float width2, float height) {
            this.x = x2;
            this.y = y;
            this.width = width2;
            this.height = height;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public final float getWidth() {
            return this.width;
        }

        public final float getHeight() {
            return this.height;
        }

        public final boolean contains(float px, float py) {
            int n2;
            if (this.width > 0.0f && this.height > 0.0f && px >= this.x && px <= this.x + this.width && py >= this.y && py <= this.y + this.height) {
                int n3 = C[0];
                n3 += C[1];
                n2 = n3 ^= C[2];
            } else {
                int n4 = C[3];
                n4 += C[4];
                n2 = n4 ^= C[5];
            }
            return n2 != 0;
        }

        public final float component1() {
            return this.x;
        }

        public final float component2() {
            return this.y;
        }

        public final float component3() {
            return this.width;
        }

        public final float component4() {
            return this.height;
        }

        @NotNull
        public final PopupRect copy(float x2, float y, float width2, float height) {
            return new PopupRect(x2, y, width2, height);
        }

        public static /* synthetic */ PopupRect copy$default(PopupRect popupRect, float f2, float f3, float f4, float f5, int n2, Object object) {
            int n3 = C[6];
            n3 += C[7];
            if ((n2 & (n3 ^= C[8])) != 0) {
                f2 = popupRect.x;
            }
            int n4 = C[9];
            n4 ^= C[10];
            if ((n2 & (n4 ^= C[11])) != 0) {
                f3 = popupRect.y;
            }
            int n5 = C[12];
            n5 += C[13];
            if ((n2 & (n5 += C[14])) != 0) {
                f4 = popupRect.width;
            }
            int n6 = C[15];
            n6 -= C[16];
            if ((n2 & (n6 ^= C[17])) != 0) {
                f5 = popupRect.height;
            }
            return popupRect.copy(f2, f3, f4, f5);
        }

        @NotNull
        public String toString() {
            float f2 = this.height;
            float f3 = this.width;
            float f4 = this.y;
            float f5 = this.x;
            int n2 = C[18];
            n2 ^= C[19];
            n2 ^= C[20];
            int n3 = C[21];
            n3 -= C[22];
            n3 -= C[23];
            int n4 = C[24];
            n4 += C[25];
            int n5 = C[27];
            n5 ^= C[28];
            int n6 = C[30];
            n6 ^= C[31];
            return (String)a[n2] + f5 + (String)a[n3] + f4 + (String)a[n4 -= C[26]] + f3 + (String)a[n5 += C[29]] + f2 + (String)a[n6 -= C[32]];
        }

        public int hashCode() {
            long l2 = 5542010388568009530L;
            long l3 = 3316427054338413109L;
            long l4 = -3215304801155928961L;
            long l5 = 6642260799466893979L;
            int n2 = C[33];
            n2 -= C[34];
            long l6 = l5;
            int n3 = C[36];
            n3 += C[37];
            l5 = l6 ^ ((long)Float.hashCode(this.x) << (n2 -= C[35]) ^ l6) & -1L << (n3 += C[38]);
            int n4 = C[39];
            n4 ^= C[40];
            n4 -= C[41];
            int n5 = C[42];
            n5 -= C[43];
            n5 += C[44];
            int n6 = C[45];
            n6 ^= C[46];
            long l7 = l5;
            int n7 = C[48];
            n7 += C[49];
            l5 = l7 ^ ((long)((int)(l5 >>> n4) * n5 + Float.hashCode(this.y)) << (n6 += C[47]) ^ l7) & -1L << (n7 += C[50]);
            int n8 = C[51];
            n8 -= C[52];
            n8 ^= C[53];
            int n9 = C[54];
            n9 ^= C[55];
            n9 -= C[56];
            int n10 = C[57];
            n10 += C[58];
            long l8 = l5;
            int n11 = C[60];
            n11 += C[61];
            l5 = l8 ^ ((long)((int)(l5 >>> n8) * n9 + Float.hashCode(this.width)) << (n10 += C[59]) ^ l8) & -1L << (n11 -= C[62]);
            int n12 = C[63];
            n12 -= C[64];
            n12 += C[65];
            int n13 = C[66];
            n13 -= C[67];
            n13 -= C[68];
            int n14 = C[69];
            n14 -= C[70];
            long l9 = l5;
            int n15 = C[72];
            n15 -= C[73];
            l5 = l9 ^ ((long)((int)(l5 >>> n12) * n13 + Float.hashCode(this.height)) << (n14 += C[71]) ^ l9) & -1L << (n15 ^= C[74]);
            int n16 = C[75];
            n16 ^= C[76];
            return (int)(l5 >>> (n16 ^= C[77]));
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                boolean bl = C[78];
                bl ^= C[79];
                return bl ^= C[80];
            }
            if (!(other instanceof PopupRect)) {
                boolean bl = C[81];
                bl ^= C[82];
                return bl ^= C[83];
            }
            PopupRect popupRect = (PopupRect)other;
            if (Float.compare(this.x, popupRect.x) != 0) {
                boolean bl = C[84];
                bl -= C[85];
                return bl ^= C[86];
            }
            if (Float.compare(this.y, popupRect.y) != 0) {
                boolean bl = C[87];
                bl -= C[88];
                return bl -= C[89];
            }
            if (Float.compare(this.width, popupRect.width) != 0) {
                boolean bl = C[90];
                bl += C[91];
                return bl += C[92];
            }
            if (Float.compare(this.height, popupRect.height) != 0) {
                boolean bl = C[93];
                bl -= C[94];
                return bl += C[95];
            }
            boolean bl = C[96];
            bl ^= C[97];
            return bl -= C[98];
        }

        static {
            PopupRect.b();
            long l2 = 3578834776035249431L;
            long l3 = 6023546288594542734L;
            long l4 = 1448851930961571980L;
            long l5 = -5455426731325106081L;
            long l6 = -5724934178480438244L;
            long l7 = -3783396890679619228L;
            long l8 = -1929198348040069460L;
            long l9 = 7264390841737797903L;
            long l10 = 5267270625032776700L;
            long l11 = -6278845738139944133L;
            long l12 = -795293679339006181L;
            long l13 = -2351271939922041911L;
            long l14 = -5225371045988931555L;
            long l15 = 6236110383496570219L;
            int n2 = C[99];
            n2 -= C[100];
            a = new Object[n2 -= C[101]];
            long l16 = l15;
            int n3 = C[102];
            n3 += C[103];
            l15 = l16 ^ (0L ^ l16) & -1L << (n3 += C[104]);
            Object[] objectArray = new Object[C[105]];
            objectArray[PopupRect.C[106]] = A;
            objectArray[PopupRect.C[107]] = C[108];
            int n4 = C[109];
            Object object = PopupRect.A()[C[110]];
            if (object == null) {
                char[] cArray = "\u4231\u45ac\u459e\u45ea\u4242\u4241\u44dd\u45d2\u440c\u45e8\u4248\u440f\u443c\u45fb\u45d2\u4416\u4232\u4237\u45e7\u45d4\u45fb\u4241\u443b\u45e7\u443c\u42d9\u4232\u4235\u45d2\u45d5\u4427\u45fc\u4247\u4248\u4234\u45ea\u4409\u45c6\u4247\u45e7\u45b0\u4416\u443b\u4244\u4236\u4409\u45ea\u4416\u45e3\u4410\u4427\u4237\u45c5\u44dd\u45d6\u443b\u4426\u4410\u44de\u4243\u443c\u45c6\u45a9\u4231\u45e8\u4427\u4425\u45fd\u45b0\u45d2\u4416\u45ac\u45fd\u42d9\u4421\u4243\u4428\u45e2\u440a\u4416\u45e1\u4247\u4236\u45f9\u440c\u4234\u4400\u4400".toCharArray();
                for (int i2 = C[111]; i2 < C[112]; ++i2) {
                    int n5 = cArray[i2];
                    n5 ^= C[113];
                    n5 += C[114];
                    n5 -= C[115];
                    n5 -= C[116];
                    n5 += C[117];
                    n5 += C[118];
                    n5 += C[119];
                    n5 ^= C[120];
                    n5 += C[121];
                    n5 += C[122];
                    n5 ^= C[123];
                    n5 -= C[124];
                    n5 ^= C[125];
                    n5 ^= C[126];
                    cArray[i2] = (char)(n5 += C[127]);
                }
                object = PopupRect.A()[PopupRect.C[128]] = new String(cArray);
            }
            objectArray[n4] = (String)object;
            char[] cArray = ((String)PopupRect.a(objectArray)).toCharArray();
            long l17 = l6;
            int n6 = C[129];
            n6 ^= C[130];
            l6 = l17 ^ (0x2C00000000L ^ l17) & -1L << (n6 -= C[131]);
            long l18 = l13;
            int n7 = C[132];
            n7 += C[133];
            l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= C[134]);
            while (true) {
                int n8 = C[135];
                n8 ^= C[136];
                if ((int)l13 >= (int)(l6 >>> (n8 += C[137]))) break;
                int n9 = (int)l13;
                long l19 = l13;
                int n10 = C[138];
                n10 += C[139];
                int n11 = C[141];
                n11 -= C[142];
                l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= C[140])) & -1L >>> (n11 += C[143]);
                long l20 = l9;
                int n12 = C[144];
                n12 ^= C[145];
                l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= C[146]);
                int n13 = (int)l13;
                long l21 = l13;
                int n14 = C[147];
                n14 += C[148];
                int n15 = C[150];
                n15 ^= C[151];
                l13 = l21 ^ (l21 ^ l21 + (long)(n14 += C[149])) & -1L >>> (n15 -= C[152]);
                int n16 = C[153];
                n16 += C[154];
                long l22 = l10;
                int n17 = C[156];
                n17 ^= C[157];
                l10 = l22 ^ ((long)cArray[n13] << (n16 -= C[155]) ^ l22) & -1L << (n17 += C[158]);
                int n18 = C[159];
                n18 += C[160];
                n18 ^= C[161];
                int n19 = C[162];
                n19 ^= C[163];
                long l23 = l12;
                int n20 = C[165];
                n20 ^= C[166];
                l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 += C[164]))) ^ l23) & -1L >>> (n20 += C[167]);
                char[] cArray2 = new char[(int)l12];
                long l24 = l14;
                int n21 = C[168];
                n21 ^= C[169];
                l14 = l24 ^ (0L ^ l24) & -1L << (n21 += C[170]);
                while (true) {
                    int n22 = C[171];
                    n22 -= C[172];
                    if ((int)(l14 >>> (n22 -= C[173])) >= (int)l12) break;
                    int n23 = C[174];
                    n23 -= C[175];
                    int n24 = C[177];
                    n24 += C[178];
                    cArray2[(int)(l14 >>> (n23 -= PopupRect.C[176]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += C[179]))];
                    l14 += 0x100000000L;
                }
                int n25 = C[180];
                n25 ^= C[181];
                int n26 = (int)(l15 >>> (n25 ^= C[182]));
                l15 += 0x100000000L;
                PopupRect.a[n26] = new String(cArray2);
                long l25 = l13;
                int n27 = C[183];
                n27 ^= C[184];
                l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= C[185]);
            }
        }

        public static Object a(Object[] object) {
            Object object2;
            int n2 = (Integer)object[C[186]];
            String string = (String)object[C[187]];
            object = object[C[188]];
            Object[] objectArray = B;
            if (B == null) {
                objectArray = B = new Object[C[189]];
            }
            if ((object2 = objectArray[n2]) == null) {
                Object object3 = object;
                if (object == null) {
                    Object[] objectArray2 = new Object[C[190]];
                    A = objectArray2;
                    object3 = objectArray2;
                    byte[] byArray = new byte[C[192] ^ C[193]];
                    byArray[PopupRect.C[194] ^ PopupRect.C[195]] = C[196] ^ C[197];
                    byArray[PopupRect.C[198] ^ PopupRect.C[199]] = C[200] ^ C[201];
                    byArray[PopupRect.C[202] ^ PopupRect.C[203]] = C[204] ^ C[205];
                    byArray[PopupRect.C[206] ^ PopupRect.C[207]] = C[208] ^ C[209];
                    byArray[PopupRect.C[210] ^ PopupRect.C[211]] = C[212] ^ C[213];
                    byArray[PopupRect.C[214] ^ PopupRect.C[215]] = C[216] ^ C[217];
                    byArray[PopupRect.C[218] ^ PopupRect.C[219]] = C[220] ^ C[221];
                    byArray[PopupRect.C[222] ^ PopupRect.C[223]] = C[224] ^ C[225];
                    byArray[PopupRect.C[226] ^ PopupRect.C[227]] = C[228] ^ C[229];
                    byArray[PopupRect.C[230] ^ PopupRect.C[231]] = C[232] ^ C[233];
                    byArray[PopupRect.C[234] ^ PopupRect.C[235]] = C[236] ^ C[237];
                    byArray[PopupRect.C[238] ^ PopupRect.C[239]] = C[240] ^ C[241];
                    byArray[PopupRect.C[242] ^ PopupRect.C[243]] = C[244] ^ C[245];
                    byArray[PopupRect.C[246] ^ PopupRect.C[247]] = C[248] ^ C[249];
                    byArray[PopupRect.C[250] ^ PopupRect.C[251]] = C[252] ^ C[253];
                    byArray[PopupRect.C[254] ^ PopupRect.C[255]] = C[256] ^ C[257];
                    objectArray2[PopupRect.C[191]] = byArray;
                }
                byte[] byArray = (byte[])object3[C[258]];
                if (b == null) {
                    byte[] byArray2 = new byte[C[259] ^ C[260]];
                    byArray2[PopupRect.C[261] ^ PopupRect.C[262]] = C[263] ^ C[264];
                    byArray2[PopupRect.C[265] ^ PopupRect.C[266]] = C[267] ^ C[268];
                    byArray2[PopupRect.C[269] ^ PopupRect.C[270]] = C[271] ^ C[272];
                    byArray2[PopupRect.C[273] ^ PopupRect.C[274]] = C[275] ^ C[276];
                    byArray2[PopupRect.C[277] ^ PopupRect.C[278]] = C[279] ^ C[280];
                    byArray2[PopupRect.C[281] ^ PopupRect.C[282]] = C[283] ^ C[284];
                    byArray2[PopupRect.C[285] ^ PopupRect.C[286]] = C[287] ^ C[288];
                    byArray2[PopupRect.C[289] ^ PopupRect.C[290]] = C[291] ^ C[292];
                    byArray2[PopupRect.C[293] ^ PopupRect.C[294]] = C[295] ^ C[296];
                    byArray2[PopupRect.C[297] ^ PopupRect.C[298]] = C[299] ^ C[300];
                    byArray2[PopupRect.C[301] ^ PopupRect.C[302]] = C[303] ^ C[304];
                    byArray2[PopupRect.C[305] ^ PopupRect.C[306]] = C[307] ^ C[308];
                    byArray2[PopupRect.C[309] ^ PopupRect.C[310]] = C[311] ^ C[312];
                    byArray2[PopupRect.C[313] ^ PopupRect.C[314]] = C[315] ^ C[316];
                    byArray2[PopupRect.C[317] ^ PopupRect.C[318]] = C[319] ^ C[320];
                    byArray2[PopupRect.C[321] ^ PopupRect.C[322]] = C[323] ^ C[324];
                    byArray2[PopupRect.C[325] ^ PopupRect.C[326]] = C[327] ^ C[328];
                    byArray2[PopupRect.C[329] ^ PopupRect.C[330]] = C[331] ^ C[332];
                    byArray2[PopupRect.C[333] ^ PopupRect.C[334]] = C[335] ^ C[336];
                    byArray2[PopupRect.C[337] ^ PopupRect.C[338]] = C[339] ^ C[340];
                    byArray2[PopupRect.C[341] ^ PopupRect.C[342]] = C[343] ^ C[344];
                    byArray2[PopupRect.C[345] ^ PopupRect.C[346]] = C[347] ^ C[348];
                    byArray2[PopupRect.C[349] ^ PopupRect.C[350]] = C[351] ^ C[352];
                    byArray2[PopupRect.C[353] ^ PopupRect.C[354]] = C[355] ^ C[356];
                    byArray2[PopupRect.C[357] ^ PopupRect.C[358]] = C[359] ^ C[360];
                    byArray2[PopupRect.C[361] ^ PopupRect.C[362]] = C[363] ^ C[364];
                    byArray2[PopupRect.C[365] ^ PopupRect.C[366]] = C[367] ^ C[368];
                    byArray2[PopupRect.C[369] ^ PopupRect.C[370]] = C[371] ^ C[372];
                    byArray2[PopupRect.C[373] ^ PopupRect.C[374]] = C[375] ^ C[376];
                    byArray2[PopupRect.C[377] ^ PopupRect.C[378]] = C[379] ^ C[380];
                    byArray2[PopupRect.C[381] ^ PopupRect.C[382]] = C[383] ^ C[384];
                    byArray2[PopupRect.C[385] ^ PopupRect.C[386]] = C[387] ^ C[388];
                    byte[] byArray3 = new byte[byArray.length + byArray2.length];
                    System.arraycopy(byArray, C[389], byArray3, C[390], byArray.length);
                    System.arraycopy(byArray2, C[391], byArray3, byArray.length, byArray2.length);
                    Object object4 = PopupRect.A()[C[392]];
                    if (object4 == null) {
                        char[] cArray = "\ude6b\udeb9\ude50\ude6f\ude6d\udec9\ude5c\ude72\ude7f\ude73\ude53\ude86\ude5a\ude58\ude68\ude53\udeba\udeca".toCharArray();
                        for (int i2 = C[393]; i2 < C[394]; ++i2) {
                            int n3 = cArray[i2];
                            n3 -= C[395];
                            n3 ^= C[396];
                            n3 ^= C[397];
                            n3 -= C[398];
                            n3 ^= C[399];
                            n3 += 47928;
                            n3 -= 56425;
                            n3 += 53401;
                            n3 += 59628;
                            n3 -= 17885;
                            cArray[i2] = (char)(n3 += 42061);
                        }
                        object4 = PopupRect.A()[1] = new String(cArray);
                    }
                    SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                    byte[] byArray4 = new byte[16];
                    byArray4[8] = 28;
                    byArray4[0] = 109;
                    byArray4[9] = -3;
                    byArray4[10] = -90;
                    byArray4[7] = -119;
                    byArray4[1] = 96;
                    byArray4[4] = -65;
                    byArray4[2] = 21;
                    byArray4[15] = 38;
                    byArray4[3] = -55;
                    byArray4[12] = 56;
                    byArray4[11] = -52;
                    byArray4[13] = -2;
                    byArray4[5] = -96;
                    byArray4[14] = -101;
                    byArray4[6] = 36;
                    PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 16, 256);
                    byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                    Object object5 = PopupRect.A()[2];
                    if (object5 == null) {
                        char[] cArray = "\u15a4\u15a0\u15b6".toCharArray();
                        for (int i3 = 0; i3 < 3; ++i3) {
                            int n4 = cArray[i3];
                            n4 ^= 0x4F70;
                            n4 ^= 0xC2D0;
                            n4 += 22320;
                            n4 += 13025;
                            n4 -= 45635;
                            n4 -= 23717;
                            n4 ^= 0xEEB7;
                            n4 += 43417;
                            n4 -= 61241;
                            n4 ^= 0xD9FA;
                            cArray[i3] = (char)(n4 -= 28095);
                        }
                        object5 = PopupRect.A()[2] = new String(cArray);
                    }
                    b = new SecretKeySpec(byArray5, (String)object5);
                }
                byte[] byArray6 = Base64.getDecoder().decode(string);
                byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
                byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
                Object object6 = PopupRect.A()[3];
                if (object6 == null) {
                    char[] cArray = "\ue339\ue33d\ue327\ue363\ue337\ue338\ue337\ue363\ue302\ue33f\ue337\ue327\ue30d\ue302\ue3d9\ue3d6\ue3d6\ue321\ue324\ue3db".toCharArray();
                    for (int i4 = 0; i4 < 20; ++i4) {
                        int n5 = cArray[i4];
                        n5 += 20224;
                        n5 ^= 0x8BB2;
                        n5 ^= 0xD2C5;
                        n5 ^= 0xF8D7;
                        n5 += 35832;
                        n5 -= 39563;
                        n5 ^= 0xB9C;
                        n5 ^= 0x4D9C;
                        n5 += 21485;
                        n5 ^= 0x74ED;
                        n5 ^= 0x2B1E;
                        cArray[i4] = (char)(n5 -= 18623);
                    }
                    object6 = PopupRect.A()[3] = new String(cArray);
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
            C = new int[0xF7FE ^ 0xF66E];
            PopupRect.C[0xC54C ^ 0xC41A] = 0xC53E ^ 0xC41A;
            PopupRect.C[0xDCDE ^ 0xDCA4] = 0x7E11 ^ 0xDCA4;
            PopupRect.C[0x9568 ^ 0x9577] = 0xFFFF6AFB ^ 0x9577;
            PopupRect.C[0x6C73 ^ 0x6CCE] = 0x6CCF ^ 0x6CCE;
            PopupRect.C[0x6B2 ^ 0x605] = 0xFFFFF9AD ^ 0x605;
            PopupRect.C[0x9DD1 ^ 0x9DDC] = 0x9DCF ^ 0x9DDC;
            PopupRect.C[0xDFA ^ 0xD81] = 0xF977 ^ 0xD81;
            PopupRect.C[0xBB65 ^ 0xBA02] = 0xFFFFFB19 ^ 0xBA02;
            PopupRect.C[0xDFB6 ^ 0xDF28] = 0xDF34 ^ 0xDF28;
            PopupRect.C[0xA6A4 ^ 0xA648] = 0xFFFF5EA0 ^ 0xA648;
            PopupRect.C[0x1EF2 ^ 0x1E3A] = 0x8F49 ^ 0x1E3A;
            PopupRect.C[0xE480 ^ 0xE419] = 0xE417 ^ 0xE419;
            PopupRect.C[0xB29F ^ 0xB397] = 0x50D6 ^ 0xB397;
            PopupRect.C[0x1F64 ^ 0x1FEF] = 0xFFFFE077 ^ 0x1FEF;
            PopupRect.C[0x9858 ^ 0x991D] = 0x13DB ^ 0x991D;
            PopupRect.C[0xA681 ^ 0xA703] = 0x1AE3B ^ 0xA703;
            PopupRect.C[0x3D12 ^ 0x3C17] = 0xDF42 ^ 0x3C17;
            PopupRect.C[0xD107 ^ 0xD1D2] = 0xBD1A ^ 0xD1D2;
            PopupRect.C[0xACE9 ^ 0xACD6] = 0xACD2 ^ 0xACD6;
            PopupRect.C[0xDFC2 ^ 0xDFA3] = 0xFFFF2036 ^ 0xDFA3;
            PopupRect.C[0x9FCB ^ 0x9F66] = 0x9F5D ^ 0x9F66;
            PopupRect.C[0x942E ^ 0x952D] = 0x5964 ^ 0x952D;
            PopupRect.C[0xBDAE ^ 0xBCE0] = 0x7A3D ^ 0xBCE0;
            PopupRect.C[0xAF13 ^ 0xAE5F] = 0xF388 ^ 0xAE5F;
            PopupRect.C[0xD198 ^ 0xD1BF] = 0xFFFF2E82 ^ 0xD1BF;
            PopupRect.C[0xA965 ^ 0xA959] = 0xFFFF569A ^ 0xA959;
            PopupRect.C[0x49F5 ^ 0x48E5] = 0x21B6 ^ 0x48E5;
            PopupRect.C[0xA062 ^ 0xA020] = 0xFFFF5F7D ^ 0xA020;
            PopupRect.C[0x109E3 ^ 0x10905] = 0x128B0 ^ 0x10905;
            PopupRect.C[0x1317 ^ 0x1367] = 0x133F ^ 0x1367;
            PopupRect.C[0x7CB7 ^ 0x7DC0] = 0x80C6 ^ 0x7DC0;
            PopupRect.C[0xF9EE ^ 0xF901] = 0x160F ^ 0xF901;
            PopupRect.C[0xABD0 ^ 0xAB47] = 0xFFFF54E1 ^ 0xAB47;
            PopupRect.C[0x10812 ^ 0x10898] = 0x10890 ^ 0x10898;
            PopupRect.C[0x3590 ^ 0x35F3] = 0xFFFFCA03 ^ 0x35F3;
            PopupRect.C[0xE355 ^ 0xE278] = 0x527A ^ 0xE278;
            PopupRect.C[0xA4C6 ^ 0xA59A] = 0xF6B5 ^ 0xA59A;
            PopupRect.C[0xBF8A ^ 0xBF4A] = 0x8963 ^ 0xBF4A;
            PopupRect.C[0xAE5 ^ 0xB8A] = 0xFFFF58D2 ^ 0xB8A;
            PopupRect.C[0x13 ^ 0x17A] = 0xE8FF ^ 0x17A;
            PopupRect.C[0x919E ^ 0x9176] = 0xFFFF4F39 ^ 0x9176;
            PopupRect.C[0xE999 ^ 0xE8E0] = 0x8417 ^ 0xE8E0;
            PopupRect.C[0xCCB ^ 0xC0E] = 0x713F ^ 0xC0E;
            PopupRect.C[0x7D74 ^ 0x7C5E] = 0x1240 ^ 0x7C5E;
            PopupRect.C[0x5272 ^ 0x5306] = 0x8CD1 ^ 0x5306;
            PopupRect.C[0xC305 ^ 0xC34A] = 0xFFFF3CB7 ^ 0xC34A;
            PopupRect.C[0xFB11 ^ 0xFA99] = 0xFA98 ^ 0xFA99;
            PopupRect.C[0xBE2A ^ 0xBE67] = 0xBE79 ^ 0xBE67;
            PopupRect.C[0x91D7 ^ 0x9121] = 0xB0E3 ^ 0x9121;
            PopupRect.C[0xC88 ^ 0xCC2] = 0xCFC ^ 0xCC2;
            PopupRect.C[0x9C60 ^ 0x9CE2] = 0x9CBB ^ 0x9CE2;
            PopupRect.C[0xFC1A ^ 0xFD03] = 0x46CB ^ 0xFD03;
            PopupRect.C[0xB7C7 ^ 0xB7E2] = 0xB7BA ^ 0xB7E2;
            PopupRect.C[0x47B4 ^ 0x46A7] = 0x29B2 ^ 0x46A7;
            PopupRect.C[0x29B9 ^ 0x29F7] = 0x29AF ^ 0x29F7;
            PopupRect.C[0x4719 ^ 0x47AC] = 0x47F8 ^ 0x47AC;
            PopupRect.C[0x804B ^ 0x81CE] = 0x81CE ^ 0x81CE;
            PopupRect.C[0xEB02 ^ 0xEB67] = 0xFFFF14B3 ^ 0xEB67;
            PopupRect.C[0x5B80 ^ 0x5A9C] = 0xE159 ^ 0x5A9C;
            PopupRect.C[0x6D1F ^ 0x6C11] = 0x542 ^ 0x6C11;
            PopupRect.C[0x2855 ^ 0x2844] = 0x2868 ^ 0x2844;
            PopupRect.C[0xF371 ^ 0xF3AE] = 0xC6D0 ^ 0xF3AE;
            PopupRect.C[0x79A ^ 0x6C4] = 0xB685 ^ 0x6C4;
            PopupRect.C[0x5E4 ^ 0x540] = 0xFFFFFAB0 ^ 0x540;
            PopupRect.C[0x71E ^ 0x7FA] = 0xFFFFCE3B ^ 0x7FA;
            PopupRect.C[0xDA34 ^ 0xDB69] = 0x6B35 ^ 0xDB69;
            PopupRect.C[0x989C ^ 0x98E5] = 0x5390 ^ 0x98E5;
            PopupRect.C[0x16B ^ 0x165] = 0x113 ^ 0x165;
            PopupRect.C[0x2587 ^ 0x251A] = 0xFFFFDAFD ^ 0x251A;
            PopupRect.C[0xE5BF ^ 0xE4F7] = 0x6E3A ^ 0xE4F7;
            PopupRect.C[0xBCEE ^ 0xBDCE] = 0xC0AA ^ 0xBDCE;
            PopupRect.C[0xE275 ^ 0xE2A4] = 0x8890 ^ 0xE2A4;
            PopupRect.C[0x10957 ^ 0x109D2] = 0xFFFEF65C ^ 0x109D2;
            PopupRect.C[0xC1A4 ^ 0xC1ED] = 0xC1A7 ^ 0xC1ED;
            PopupRect.C[0x4803 ^ 0x482B] = 0xFFFFB785 ^ 0x482B;
            PopupRect.C[0x9F4F ^ 0x9F81] = 0xF5B2 ^ 0x9F81;
            PopupRect.C[0x51CB ^ 0x51A1] = 0x51A1 ^ 0x51A1;
            PopupRect.C[0xFC02 ^ 0xFCC4] = 0x6D84 ^ 0xFCC4;
            PopupRect.C[0x94D2 ^ 0x9484] = 0x94BB ^ 0x9484;
            PopupRect.C[0xBFF4 ^ 0xBF8B] = 0xEA54 ^ 0xBF8B;
            PopupRect.C[0x41F1 ^ 0x40F7] = 0xA3B6 ^ 0x40F7;
            PopupRect.C[0xD944 ^ 0xD956] = 0xD930 ^ 0xD956;
            PopupRect.C[0x4186 ^ 0x415C] = 0xBC5A ^ 0x415C;
            PopupRect.C[0xCF3C ^ 0xCE3D] = 0x8C68 ^ 0xCE3D;
            PopupRect.C[0xA27F ^ 0xA21B] = 0xA20C ^ 0xA21B;
            PopupRect.C[0xAEDA ^ 0xAFA5] = 0xFFFFD971 ^ 0xAFA5;
            PopupRect.C[0xB1EB ^ 0xB102] = 0x90BA ^ 0xB102;
            PopupRect.C[0x36BB ^ 0x3671] = 0x3C85 ^ 0x3671;
            PopupRect.C[0x4B32 ^ 0x4BFB] = 0xDAB1 ^ 0x4BFB;
            PopupRect.C[0x8FE2 ^ 0x8FA7] = 0xFFFF7049 ^ 0x8FA7;
            PopupRect.C[0x97C0 ^ 0x9719] = 0x43EA ^ 0x9719;
            PopupRect.C[0x9C13 ^ 0x9C7D] = 0x9C7D ^ 0x9C7D;
            PopupRect.C[0x5960 ^ 0x58E6] = 0x58E6 ^ 0x58E6;
            PopupRect.C[0x113 ^ 0x148] = 0xFFFFFE8D ^ 0x148;
            PopupRect.C[0xE9A5 ^ 0xE9FD] = 0xFFFF160A ^ 0xE9FD;
            PopupRect.C[0x266B ^ 0x260D] = 0x2664 ^ 0x260D;
            PopupRect.C[0x72F ^ 0x635] = 0xBDF0 ^ 0x635;
            PopupRect.C[0x4851 ^ 0x48EE] = 0x48EE ^ 0x48EE;
            PopupRect.C[0x8F12 ^ 0x8FC4] = 0x5B33 ^ 0x8FC4;
            PopupRect.C[0xFD7C ^ 0xFC09] = 0x163 ^ 0xFC09;
            PopupRect.C[0x2364 ^ 0x23CD] = 0x23E9 ^ 0x23CD;
            PopupRect.C[0x5182 ^ 0x5160] = 0x675C ^ 0x5160;
            PopupRect.C[0x8059 ^ 0x80F9] = 0x80F3 ^ 0x80F9;
            PopupRect.C[0x6F53 ^ 0x6E2B] = 0x9347 ^ 0x6E2B;
            PopupRect.C[0x1C2F ^ 0x1C36] = 0xFFFFE3F0 ^ 0x1C36;
            PopupRect.C[0x1FAB ^ 0x1FC3] = 0xFFFFE030 ^ 0x1FC3;
            PopupRect.C[0x7E47 ^ 0x7F31] = 0x825D ^ 0x7F31;
            PopupRect.C[0xECA3 ^ 0xEC77] = 0xFFFF7F25 ^ 0xEC77;
            PopupRect.C[0x91E8 ^ 0x91F0] = 0xFFFF6E21 ^ 0x91F0;
            PopupRect.C[0xAB4B ^ 0xAA76] = 0x1AAB7 ^ 0xAA76;
            PopupRect.C[0xD066 ^ 0xD124] = 0x52F1 ^ 0xD124;
            PopupRect.C[0x40A2 ^ 0x40D1] = 0x78 ^ 0x40D1;
            PopupRect.C[0xE160 ^ 0xE02A] = 0xBDFD ^ 0xE02A;
            PopupRect.C[0xCCB9 ^ 0xCC8F] = 0xFFFF3369 ^ 0xCC8F;
            PopupRect.C[0xE63C ^ 0xE69A] = 0xE6C3 ^ 0xE69A;
            PopupRect.C[0x69A6 ^ 0x6827] = 0x1610D ^ 0x6827;
            PopupRect.C[0xB2DC ^ 0xB25A] = 0xFFFF4DCC ^ 0xB25A;
            PopupRect.C[0x2BE4 ^ 0x2AF1] = 0x40F0 ^ 0x2AF1;
            PopupRect.C[0x1B29 ^ 0x1A72] = 0xFFFFB685 ^ 0x1A72;
            PopupRect.C[0x26F1 ^ 0x27D3] = 0x490A ^ 0x27D3;
            PopupRect.C[0xEEB5 ^ 0xEF36] = 0xFFFE199D ^ 0xEF36;
            PopupRect.C[0x87FA ^ 0x8797] = 0x8795 ^ 0x8797;
            PopupRect.C[0xB797 ^ 0xB7A4] = 0xB742 ^ 0xB7A4;
            PopupRect.C[0xF3F2 ^ 0xF2BF] = 0x3474 ^ 0xF2BF;
            PopupRect.C[0x7C97 ^ 0x7D83] = 0x12BC ^ 0x7D83;
            PopupRect.C[0x651C ^ 0x659F] = 0xFFFF9A7D ^ 0x659F;
            PopupRect.C[0xEF82 ^ 0xEF02] = 0xEF02 ^ 0xEF02;
            PopupRect.C[0xF9BA ^ 0xF884] = 0x1F84B ^ 0xF884;
            PopupRect.C[0x4E01 ^ 0x4ECE] = 0x24FA ^ 0x4ECE;
            PopupRect.C[0x7963 ^ 0x79EF] = 0xFFFF864E ^ 0x79EF;
            PopupRect.C[0x3B3 ^ 0x286] = 0xE1A ^ 0x286;
            PopupRect.C[0x6255 ^ 0x6216] = 0xFFFF9D9B ^ 0x6216;
            PopupRect.C[0x3DB9 ^ 0x3DBB] = 0xFFFFC209 ^ 0x3DBB;
            PopupRect.C[0xD44D ^ 0xD426] = 0xD427 ^ 0xD426;
            PopupRect.C[0x103AF ^ 0x103C3] = 0x103C3 ^ 0x103C3;
            PopupRect.C[0x3C0E ^ 0x3C9E] = 0xFFFFC300 ^ 0x3C9E;
            PopupRect.C[0xBB22 ^ 0xBA51] = 0xFFFF9A30 ^ 0xBA51;
            PopupRect.C[0xD415 ^ 0xD502] = 0xFFFF40E6 ^ 0xD502;
            PopupRect.C[0x49AA ^ 0x4927] = 0xFFFFB6C3 ^ 0x4927;
            PopupRect.C[0x2CFF ^ 0x2CFA] = 0x2CB4 ^ 0x2CFA;
            PopupRect.C[0x8CCD ^ 0x8C93] = 0x8C84 ^ 0x8C93;
            PopupRect.C[0x3484 ^ 0x34D4] = 0xFFFFCB70 ^ 0x34D4;
            PopupRect.C[0x6401 ^ 0x6417] = 0x6423 ^ 0x6417;
            PopupRect.C[0x5A6F ^ 0x5A12] = 0x8565 ^ 0x5A12;
            PopupRect.C[0xA41F ^ 0xA4DE] = 0x92E7 ^ 0xA4DE;
            PopupRect.C[0xEE41 ^ 0xEE8C] = 0xE47D ^ 0xEE8C;
            PopupRect.C[0xFC48 ^ 0xFCA3] = 0xFBB8 ^ 0xFCA3;
            PopupRect.C[0xD62F ^ 0xD76B] = 0x54BE ^ 0xD76B;
            PopupRect.C[0xAE3F ^ 0xAE1C] = 0xAE74 ^ 0xAE1C;
            PopupRect.C[0x3C96 ^ 0x3CE2] = 0x7968 ^ 0x3CE2;
            PopupRect.C[0x10DAC ^ 0x10CB7] = 0x1B737 ^ 0x10CB7;
            PopupRect.C[0x812 ^ 0x8F2] = 0x3DAF ^ 0x8F2;
            PopupRect.C[0xDA27 ^ 0xDAD3] = 0x8922 ^ 0xDAD3;
            PopupRect.C[0x4631 ^ 0x4705] = 0xA765 ^ 0x4705;
            PopupRect.C[0x7053 ^ 0x706A] = 0xFFFF8F14 ^ 0x706A;
            PopupRect.C[0x7A1 ^ 0x7AD] = 0xFFFFF8D6 ^ 0x7AD;
            PopupRect.C[0x1A06 ^ 0x1B09] = 0x727F ^ 0x1B09;
            PopupRect.C[0x88E7 ^ 0x88D5] = 0x88CB ^ 0x88D5;
            PopupRect.C[0x7843 ^ 0x7869] = 0xFFFF87A6 ^ 0x7869;
            PopupRect.C[0x9528 ^ 0x9569] = 0xFFFF6AA1 ^ 0x9569;
            PopupRect.C[0xCFF3 ^ 0xCF7C] = 0xFFFF30AB ^ 0xCF7C;
            PopupRect.C[0xE7EB ^ 0xE77D] = 0xE738 ^ 0xE77D;
            PopupRect.C[0x74B3 ^ 0x75D1] = 0x4216 ^ 0x75D1;
            PopupRect.C[0x8023 ^ 0x80D6] = 0xD30B ^ 0x80D6;
            PopupRect.C[0x21DA ^ 0x2093] = 0x7D51 ^ 0x2093;
            PopupRect.C[0x12BA ^ 0x13B1] = 0xFFFFFA9E ^ 0x13B1;
            PopupRect.C[0xDC63 ^ 0xDCB1] = 0xB072 ^ 0xDCB1;
            PopupRect.C[0xA5DE ^ 0xA4B0] = 0x846 ^ 0xA4B0;
            PopupRect.C[0x9805 ^ 0x986C] = 0x986F ^ 0x986C;
            PopupRect.C[0x9D89 ^ 0x9D28] = 0xFFFF62BB ^ 0x9D28;
            PopupRect.C[0xAA5F ^ 0xAB7E] = 0xC5BC ^ 0xAB7E;
            PopupRect.C[0x4F8F ^ 0x4F9F] = 0x4F8E ^ 0x4F9F;
            PopupRect.C[0xB7D8 ^ 0xB7DB] = 0xB774 ^ 0xB7DB;
            PopupRect.C[0x2346 ^ 0x226F] = 0x4C78 ^ 0x226F;
            PopupRect.C[0x3D3F ^ 0x3C6A] = 0x3D42 ^ 0x3C6A;
            PopupRect.C[0x7748 ^ 0x7776] = 0xFFFF8896 ^ 0x7776;
            PopupRect.C[0xCBDF ^ 0xCB85] = 0xCB95 ^ 0xCB85;
            PopupRect.C[0x9130 ^ 0x9077] = 0x1AED ^ 0x9077;
            PopupRect.C[0xD33B ^ 0xD3AF] = 0xFFFF2C75 ^ 0xD3AF;
            PopupRect.C[0x2C6F ^ 0x2C41] = 0xFFFFD396 ^ 0x2C41;
            PopupRect.C[0x6BFE ^ 0x6B01] = 0x2954 ^ 0x6B01;
            PopupRect.C[0xD838 ^ 0xD87F] = 0xD80B ^ 0xD87F;
            PopupRect.C[0xF235 ^ 0xF29A] = 0xFFFF0D34 ^ 0xF29A;
            PopupRect.C[0x89FB ^ 0x88A2] = 0xDB97 ^ 0x88A2;
            PopupRect.C[0xE89 ^ 0xE11] = 0xFFFFF1D2 ^ 0xE11;
            PopupRect.C[0xA062 ^ 0xA03F] = 0xA04E ^ 0xA03F;
            PopupRect.C[0x1044B ^ 0x10547] = 0x113FF ^ 0x10547;
            PopupRect.C[0x6116 ^ 0x606C] = 0xC85 ^ 0x606C;
            PopupRect.C[0x2E96 ^ 0x2EC7] = 0xFFFFD13A ^ 0x2EC7;
            PopupRect.C[0xF9E5 ^ 0xF9B2] = 0xFFFF0638 ^ 0xF9B2;
            PopupRect.C[0xB7DF ^ 0xB756] = 0xFFFF48B6 ^ 0xB756;
            PopupRect.C[0x1CC9 ^ 0x1C48] = 0x1C13 ^ 0x1C48;
            PopupRect.C[0x10A86 ^ 0x10ABD] = 0x10AEF ^ 0x10ABD;
            PopupRect.C[0x1B6B ^ 0x1BFA] = 0x1B9A ^ 0x1BFA;
            PopupRect.C[0xA51F ^ 0xA425] = 0x1856 ^ 0xA425;
            PopupRect.C[0x7B53 ^ 0x7BF9] = 0xFFFF845C ^ 0x7BF9;
            PopupRect.C[0xDB4 ^ 0xDB4] = 0xD99 ^ 0xDB4;
            PopupRect.C[0x2593 ^ 0x24B4] = 0xFFFF3415 ^ 0x24B4;
            PopupRect.C[0xF2B9 ^ 0xF3A4] = 0x8EC5 ^ 0xF3A4;
            PopupRect.C[0xAAD6 ^ 0xABAD] = 0xC779 ^ 0xABAD;
            PopupRect.C[0x58D4 ^ 0x5824] = 0xFFFF48B4 ^ 0x5824;
            PopupRect.C[0xD4C6 ^ 0xD585] = 0xFFFFA9A7 ^ 0xD585;
            PopupRect.C[0xD558 ^ 0xD568] = 0xD53C ^ 0xD568;
            PopupRect.C[0xB9AD ^ 0xB885] = 0x57AE ^ 0xB885;
            PopupRect.C[0xE8CD ^ 0xE9A8] = 0x5741 ^ 0xE9A8;
            PopupRect.C[0x4D52 ^ 0x4D8A] = 0x9958 ^ 0x4D8A;
            PopupRect.C[0xDAFC ^ 0xDA3F] = 0xA70E ^ 0xDA3F;
            PopupRect.C[0x186D ^ 0x18E5] = 0xFFFFE710 ^ 0x18E5;
            PopupRect.C[0xBF34 ^ 0xBF74] = 0xFFFF40D8 ^ 0xBF74;
            PopupRect.C[0x3EC9 ^ 0x3EC6] = 0x3EF3 ^ 0x3EC6;
            PopupRect.C[0x5517 ^ 0x5553] = 0xFFFFAAE2 ^ 0x5553;
            PopupRect.C[0xB160 ^ 0xB0ED] = 0x81DE ^ 0xB0ED;
            PopupRect.C[0x4ECC ^ 0x4FFF] = 0xAFF9 ^ 0x4FFF;
            PopupRect.C[0xCCA0 ^ 0xCC2E] = 0xFFFF33B5 ^ 0xCC2E;
            PopupRect.C[0xB54F ^ 0xB593] = 0x48E1 ^ 0xB593;
            PopupRect.C[0x9E9 ^ 0x8DF] = 0x453 ^ 0x8DF;
            PopupRect.C[0x86CD ^ 0x86EB] = 0xFFFF796A ^ 0x86EB;
            PopupRect.C[0xC43A ^ 0xC524] = 0xB840 ^ 0xC524;
            PopupRect.C[0x301D ^ 0x3034] = 0x3047 ^ 0x3034;
            PopupRect.C[0x1CE7 ^ 0x1D99] = 0x94F2 ^ 0x1D99;
            PopupRect.C[0x485D ^ 0x48E9] = 0x48A5 ^ 0x48E9;
            PopupRect.C[0xC6F3 ^ 0xC64D] = 0xC64C ^ 0xC64D;
            PopupRect.C[0x1002B ^ 0x1005E] = 0x10371 ^ 0x1005E;
            PopupRect.C[0x76A3 ^ 0x768F] = 0x7690 ^ 0x768F;
            PopupRect.C[0xCEB0 ^ 0xCFAF] = 0xFFFF4D78 ^ 0xCFAF;
            PopupRect.C[0x747B ^ 0x7557] = 0x1B49 ^ 0x7557;
            PopupRect.C[0x866F ^ 0x8704] = 0xFFFF9140 ^ 0x8704;
            PopupRect.C[0xB6EF ^ 0xB68F] = 0xFFFF4925 ^ 0xB68F;
            PopupRect.C[0x7591 ^ 0x756C] = 0x35FA ^ 0x756C;
            PopupRect.C[0x70AF ^ 0x71C7] = 0xCF3F ^ 0x71C7;
            PopupRect.C[0x170A ^ 0x166B] = 0x21A3 ^ 0x166B;
            PopupRect.C[0xAB43 ^ 0xABA6] = 0x9D94 ^ 0xABA6;
            PopupRect.C[0x1AB9 ^ 0x1BB9] = 0xFFFFA651 ^ 0x1BB9;
            PopupRect.C[0x481F ^ 0x48E3] = 0x83B ^ 0x48E3;
            PopupRect.C[0x2A97 ^ 0x2A9F] = 0x2AB3 ^ 0x2A9F;
            PopupRect.C[0x5ABE ^ 0x5BA6] = 0x31BF ^ 0x5BA6;
            PopupRect.C[0x9F01 ^ 0x9E22] = 0xFFFF0F6F ^ 0x9E22;
            PopupRect.C[0xD0E5 ^ 0xD161] = 0x1D859 ^ 0xD161;
            PopupRect.C[0xAFB5 ^ 0xAE85] = 0x1E90 ^ 0xAE85;
            PopupRect.C[0x2E3F ^ 0x2E3B] = 0xFFFFD1A4 ^ 0x2E3B;
            PopupRect.C[0x3AA6 ^ 0x3A92] = 0x3AE8 ^ 0x3A92;
            PopupRect.C[0x7190 ^ 0x70D6] = 0xFA1B ^ 0x70D6;
            PopupRect.C[0xC634 ^ 0xC76B] = 0xFFFF88B2 ^ 0xC76B;
            PopupRect.C[0x106EF ^ 0x106CE] = 0x1069E ^ 0x106CE;
            PopupRect.C[0x4C90 ^ 0x4C8D] = 0x4CF6 ^ 0x4C8D;
            PopupRect.C[0x943D ^ 0x9441] = 0xB616 ^ 0x9441;
            PopupRect.C[0x101DE ^ 0x101A6] = 0x155F5 ^ 0x101A6;
            PopupRect.C[0x9485 ^ 0x95A3] = 0x7A88 ^ 0x95A3;
            PopupRect.C[0x2CEB ^ 0x2CC6] = 0xFFFFD307 ^ 0x2CC6;
            PopupRect.C[0xF82E ^ 0xF912] = 0x4561 ^ 0xF912;
            PopupRect.C[0x57C5 ^ 0x578E] = 0xFFFFA802 ^ 0x578E;
            PopupRect.C[0x8AFF ^ 0x8B7F] = 0x214 ^ 0x8B7F;
            PopupRect.C[0x9B40 ^ 0x9BF0] = 0x9BB6 ^ 0x9BF0;
            PopupRect.C[0xDEA6 ^ 0xDE33] = 0xDE4B ^ 0xDE33;
            PopupRect.C[0xF8A7 ^ 0xF879] = 0xCD0E ^ 0xF879;
            PopupRect.C[0x79A2 ^ 0x7926] = 0x790E ^ 0x7926;
            PopupRect.C[0x33DA ^ 0x3389] = 0x3382 ^ 0x3389;
            PopupRect.C[0x2665 ^ 0x262D] = 0x2645 ^ 0x262D;
            PopupRect.C[0xDD84 ^ 0xDCF9] = 0x5596 ^ 0xDCF9;
            PopupRect.C[0x384D ^ 0x391A] = 0x3832 ^ 0x391A;
            PopupRect.C[0x73E5 ^ 0x7306] = 0x4534 ^ 0x7306;
            PopupRect.C[0x4E3D ^ 0x4E16] = 0xFFFFB1D9 ^ 0x4E16;
            PopupRect.C[0x9755 ^ 0x9671] = 0xF8A8 ^ 0x9671;
            PopupRect.C[0x722 ^ 0x6AB] = 0x6AB ^ 0x6AB;
            PopupRect.C[0xECF4 ^ 0xEC5A] = 0xEC4E ^ 0xEC5A;
            PopupRect.C[0xA912 ^ 0xA82A] = 0xA4A6 ^ 0xA82A;
            PopupRect.C[0x7F17 ^ 0x7E25] = 0x9E45 ^ 0x7E25;
            PopupRect.C[0x3C35 ^ 0x3D0C] = 0x8175 ^ 0x3D0C;
            PopupRect.C[0x5EB6 ^ 0x5E61] = 0x8A92 ^ 0x5E61;
            PopupRect.C[0xEF47 ^ 0xEE62] = 0x150 ^ 0xEE62;
            PopupRect.C[0x5855 ^ 0x58A4] = 0xB7AA ^ 0x58A4;
            PopupRect.C[0x9416 ^ 0x948C] = 0xFFFF6B59 ^ 0x948C;
            PopupRect.C[0xFEC4 ^ 0xFF97] = 0xFFFFE968 ^ 0xFF97;
            PopupRect.C[0xFEB8 ^ 0xFE27] = 0xFFFF015E ^ 0xFE27;
            PopupRect.C[0x4037 ^ 0x409C] = 0x4052 ^ 0x409C;
            PopupRect.C[0xE82A ^ 0xE80E] = 0xE849 ^ 0xE80E;
            PopupRect.C[0x240F ^ 0x24C3] = 0xFFFFD1AF ^ 0x24C3;
            PopupRect.C[0x6B57 ^ 0x6AD0] = 0x6AD0 ^ 0x6AD0;
            PopupRect.C[0x26BB ^ 0x2643] = 0xFFFFF838 ^ 0x2643;
            PopupRect.C[0x949 ^ 0x819] = 0xCEC4 ^ 0x819;
            PopupRect.C[0x802F ^ 0x8118] = 0xFFFF7257 ^ 0x8118;
            PopupRect.C[0xF109 ^ 0xF1F0] = 0xD030 ^ 0xF1F0;
            PopupRect.C[0x32D8 ^ 0x3380] = 0x32A4 ^ 0x3380;
            PopupRect.C[0x4EF4 ^ 0x4EF3] = 0xFFFFB130 ^ 0x4EF3;
            PopupRect.C[0xC2EE ^ 0xC214] = 0x828D ^ 0xC214;
            PopupRect.C[0xA288 ^ 0xA3B3] = 0x1FB5 ^ 0xA3B3;
            PopupRect.C[0xD6CE ^ 0xD609] = 0x4743 ^ 0xD609;
            PopupRect.C[0x9E04 ^ 0x9EB2] = 0x9E8A ^ 0x9EB2;
            PopupRect.C[0x18AA ^ 0x18BE] = 0xFFFFE77B ^ 0x18BE;
            PopupRect.C[0x2B8 ^ 0x289] = 0xFFFFFD27 ^ 0x289;
            PopupRect.C[0x8580 ^ 0x84FC] = 0xE815 ^ 0x84FC;
            PopupRect.C[0x1DE7 ^ 0x1CB6] = 0xF5F1 ^ 0x1CB6;
            PopupRect.C[0xCD7B ^ 0xCC18] = 0xFFFF0421 ^ 0xCC18;
            PopupRect.C[0xFE0D ^ 0xFE3A] = 0xFFFF01B0 ^ 0xFE3A;
            PopupRect.C[0x9949 ^ 0x981B] = 0x715B ^ 0x981B;
            PopupRect.C[0xEE88 ^ 0xEE73] = 0xAEE5 ^ 0xEE73;
            PopupRect.C[0x4AD6 ^ 0x4A7A] = 0x4A09 ^ 0x4A7A;
            PopupRect.C[0x3F3B ^ 0x3F3D] = 0x3F57 ^ 0x3F3D;
            PopupRect.C[0x7BDD ^ 0x7B91] = 0xFFFF8423 ^ 0x7B91;
            PopupRect.C[0x7BA8 ^ 0x7B0B] = 0xFFFF8484 ^ 0x7B0B;
            PopupRect.C[0xE74B ^ 0xE600] = 0xFFFF4450 ^ 0xE600;
            PopupRect.C[0x7024 ^ 0x71A8] = 0x88 ^ 0x71A8;
            PopupRect.C[0x8131 ^ 0x80BB] = 0x80A9 ^ 0x80BB;
            PopupRect.C[0xAF0C ^ 0xAFFE] = 0xFC20 ^ 0xAFFE;
            PopupRect.C[0xB119 ^ 0xB139] = 0xFFFF4EA3 ^ 0xB139;
            PopupRect.C[0x6BAB ^ 0x6B45] = 0x844A ^ 0x6B45;
            PopupRect.C[0xB263 ^ 0xB290] = 0xE14D ^ 0xB290;
            PopupRect.C[0xD007 ^ 0xD0D4] = 0xBC1C ^ 0xD0D4;
            PopupRect.C[0xF3C9 ^ 0xF3DC] = 0xFFFF0C22 ^ 0xF3DC;
            PopupRect.C[0x10731 ^ 0x107AD] = 0xFFFEF84E ^ 0x107AD;
            PopupRect.C[0xC121 ^ 0xC04C] = 0x6CB9 ^ 0xC04C;
            PopupRect.C[0x444B ^ 0x44FA] = 0x446E ^ 0x44FA;
            PopupRect.C[0xC2CD ^ 0xC2D1] = 0xC280 ^ 0xC2D1;
            PopupRect.C[0x8191 ^ 0x81B3] = 0xFFFF7E7B ^ 0x81B3;
            PopupRect.C[0x181E ^ 0x18DA] = 0x659E ^ 0x18DA;
            PopupRect.C[0x573A ^ 0x5630] = 0x4088 ^ 0x5630;
            PopupRect.C[0x4F38 ^ 0x4F2B] = 0xFFFFB08C ^ 0x4F2B;
            PopupRect.C[0xB145 ^ 0xB035] = 0x1CC3 ^ 0xB035;
            PopupRect.C[0x2FB1 ^ 0x2ED7] = 0x902F ^ 0x2ED7;
            PopupRect.C[0x98AC ^ 0x98D2] = 0x176A ^ 0x98D2;
            PopupRect.C[0xE80 ^ 0xF87] = 0xECE7 ^ 0xF87;
            PopupRect.C[0x7FB7 ^ 0x7EF6] = 0xFD21 ^ 0x7EF6;
            PopupRect.C[0x1613 ^ 0x16A9] = 0x16A8 ^ 0x16A9;
            PopupRect.C[0x8EB9 ^ 0x8E83] = 0x8ED3 ^ 0x8E83;
            PopupRect.C[0x9CB0 ^ 0x9DFF] = 0xFFFFA4A3 ^ 0x9DFF;
            PopupRect.C[0xC166 ^ 0xC077] = 0xAF54 ^ 0xC077;
            PopupRect.C[0x2A4E ^ 0x2ADD] = 0xFFFFD572 ^ 0x2ADD;
            PopupRect.C[0xEA27 ^ 0xEB35] = 0x840A ^ 0xEB35;
            PopupRect.C[0x2C84 ^ 0x2C73] = 0xDB3 ^ 0x2C73;
            PopupRect.C[0xEABB ^ 0xEAD4] = 0xEAD4 ^ 0xEAD4;
            PopupRect.C[0xD962 ^ 0xD93D] = 0xFFFF269B ^ 0xD93D;
            PopupRect.C[0x3C3B ^ 0x3D15] = 0x8D00 ^ 0x3D15;
            PopupRect.C[0xB53C ^ 0xB5D6] = 0xB2CD ^ 0xB5D6;
            PopupRect.C[0x10306 ^ 0x10340] = 0x10302 ^ 0x10340;
            PopupRect.C[0xD162 ^ 0xD1D0] = 0xD1D6 ^ 0xD1D0;
            PopupRect.C[0xFB85 ^ 0xFB39] = 0xFB39 ^ 0xFB39;
            PopupRect.C[0x5662 ^ 0x5678] = 0xFFFFA9EE ^ 0x5678;
            PopupRect.C[0x1D9F ^ 0x1DA2] = 0x1D9F ^ 0x1DA2;
            PopupRect.C[0x1CB6 ^ 0x1DD6] = 0xAD97 ^ 0x1DD6;
            PopupRect.C[0xC820 ^ 0xC874] = 0xFFFF3793 ^ 0xC874;
            PopupRect.C[0xE890 ^ 0xE87D] = 0xEF66 ^ 0xE87D;
            PopupRect.C[0xE6E8 ^ 0xE79A] = 0x384D ^ 0xE79A;
            PopupRect.C[0x5818 ^ 0x5997] = 0xBB5F ^ 0x5997;
            PopupRect.C[0x55A1 ^ 0x542A] = 0x6DBA ^ 0x542A;
            PopupRect.C[0x3C8 ^ 0x370] = 0x371 ^ 0x370;
            PopupRect.C[0x9BF2 ^ 0x9AE4] = 0xF0FD ^ 0x9AE4;
            PopupRect.C[0x57DA ^ 0x57AB] = 0xD90B ^ 0x57AB;
            PopupRect.C[0x99FB ^ 0x98F6] = 0xF1A4 ^ 0x98F6;
            PopupRect.C[0xECDA ^ 0xEC24] = 0xAE77 ^ 0xEC24;
            PopupRect.C[0xA042 ^ 0xA133] = 0x7EEC ^ 0xA133;
            PopupRect.C[0x56FD ^ 0x567A] = 0xFFFFA9CF ^ 0x567A;
            PopupRect.C[0x9877 ^ 0x9946] = 0x7935 ^ 0x9946;
            PopupRect.C[0x9DA5 ^ 0x9D3E] = 0xFFFF62FD ^ 0x9D3E;
            PopupRect.C[0x8EF ^ 0x8EE] = 0xFFFFF768 ^ 0x8EE;
            PopupRect.C[0x1F32 ^ 0x1F44] = 0x66B4 ^ 0x1F44;
            PopupRect.C[0x6573 ^ 0x65D6] = 0x65BF ^ 0x65D6;
            PopupRect.C[0xD1C0 ^ 0xD0A4] = 0xE763 ^ 0xD0A4;
            PopupRect.C[0xB7F0 ^ 0xB6B0] = 0x1B67F ^ 0xB6B0;
            PopupRect.C[0xE2E ^ 0xEFE] = 0xFFFF9B3B ^ 0xEFE;
            PopupRect.C[0xE3DC ^ 0xE3C2] = 0xE3D4 ^ 0xE3C2;
            PopupRect.C[0x7BEE ^ 0x7B2C] = 0x615 ^ 0x7B2C;
            PopupRect.C[0x8770 ^ 0x87BB] = 0x8D4A ^ 0x87BB;
            PopupRect.C[0xCE58 ^ 0xCE6D] = 0xCE21 ^ 0xCE6D;
            PopupRect.C[0xA75A ^ 0xA7E3] = 0xFFFF586A ^ 0xA7E3;
            PopupRect.C[0x9A61 ^ 0x9B63] = 0x9B63 ^ 0x9B63;
            PopupRect.C[0x73AB ^ 0x7376] = 0x8E7C ^ 0x7376;
            PopupRect.C[0x8AD2 ^ 0x8BFD] = 0xFFFFC417 ^ 0x8BFD;
            PopupRect.C[0x2E26 ^ 0x2F72] = 0xC632 ^ 0x2F72;
            PopupRect.C[0x7536 ^ 0x759E] = 0x75C1 ^ 0x759E;
            PopupRect.C[0x3DF7 ^ 0x3DFC] = 0x3D84 ^ 0x3DFC;
            PopupRect.C[0xB6EC ^ 0xB69B] = 0xEEA9 ^ 0xB69B;
            PopupRect.C[0x5CAC ^ 0x5C17] = 0x5C15 ^ 0x5C17;
            PopupRect.C[0x6293 ^ 0x62F1] = 0x62CF ^ 0x62F1;
            PopupRect.C[0xA2E4 ^ 0xA23F] = 0x5F35 ^ 0xA23F;
            PopupRect.C[0x10A44 ^ 0x10AA3] = 0x12B1B ^ 0x10AA3;
            PopupRect.C[0xEC0F ^ 0xEC53] = 0xEC78 ^ 0xEC53;
            PopupRect.C[0x762 ^ 0x779] = 0xFFFFF8AF ^ 0x779;
            PopupRect.C[0x1D91 ^ 0x1CBA] = 0x72D9 ^ 0x1CBA;
            PopupRect.C[0xFEA8 ^ 0xFEA2] = 0xFFFF015E ^ 0xFEA2;
            PopupRect.C[0xBBFD ^ 0xBB4E] = 0xFFFF44C8 ^ 0xBB4E;
            PopupRect.C[0xE249 ^ 0xE2A8] = 0xD7D6 ^ 0xE2A8;
            PopupRect.C[0x71A8 ^ 0x71DA] = 0x6233 ^ 0x71DA;
            PopupRect.C[0x700F ^ 0x7130] = 0x171E3 ^ 0x7130;
            PopupRect.C[0xAC87 ^ 0xADDD] = 0xFEF2 ^ 0xADDD;
            PopupRect.C[0xEE17 ^ 0xEF1E] = 0xF9B9 ^ 0xEF1E;
            PopupRect.C[0x412F ^ 0x4117] = 0x415A ^ 0x4117;
            PopupRect.C[0xA809 ^ 0xA85C] = 0xFFFF57F4 ^ 0xA85C;
            PopupRect.C[0x80E7 ^ 0x80BE] = 0xFFFF7F2D ^ 0x80BE;
            PopupRect.C[0x904F ^ 0x90ED] = 0xFFFF6F52 ^ 0x90ED;
            PopupRect.C[0xAB0C ^ 0xAA08] = 0x6661 ^ 0xAA08;
            PopupRect.C[0x2E1B ^ 0x2F71] = 0xC6F4 ^ 0x2F71;
            PopupRect.C[0x5FB0 ^ 0x5FE2] = 0xFFFFA014 ^ 0x5FE2;
            PopupRect.C[0x3175 ^ 0x31D2] = 0xFFFFCE22 ^ 0x31D2;
            PopupRect.C[0x10C5D ^ 0x10C4A] = 0xFFFEF38D ^ 0x10C4A;
            PopupRect.C[0x97AD ^ 0x9623] = 0x6FA7 ^ 0x9623;
            PopupRect.C[0x5C01 ^ 0x5C66] = 0xFFFFA3A2 ^ 0x5C66;
            PopupRect.C[0x97B8 ^ 0x96D4] = 0x7F51 ^ 0x96D4;
            PopupRect.C[0xEC11 ^ 0xEC18] = 0xFFFF139E ^ 0xEC18;
            PopupRect.C[0x8C8A ^ 0x8CA5] = 0x8CAF ^ 0x8CA5;
            PopupRect.C[0x1079E ^ 0x1070C] = 0xFFFEF8D2 ^ 0x1070C;
        }
    }
}

