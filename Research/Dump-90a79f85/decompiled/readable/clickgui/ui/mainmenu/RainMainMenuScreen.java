/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10799
 *  net.minecraft.class_156
 *  net.minecraft.class_2561
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_429
 *  net.minecraft.class_437
 *  net.minecraft.class_500
 *  net.minecraft.class_526
 */
package kotakbaz.rain.ui.mainmenu;

import java.awt.Color;
import java.lang.reflect.Constructor;
import java.net.URI;
import java.util.List;
import kotakbaz.rain.client.util.animations.b;
import kotakbaz.rain.client.util.render.A;
import kotakbaz.rain.client.util.render.a_0;
import kotakbaz.rain.client.util.render.display.C;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.D;
import kotakbaz.rain.client.util.render.font.E;
import kotakbaz.rain.ui.transition.ScreenTransition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.class_10799;
import net.minecraft.class_156;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_429;
import net.minecraft.class_437;
import net.minecraft.class_500;
import net.minecraft.class_526;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 j2\u00020\u0001:\u0003jklB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\b\u0005\u0010\u0003J/\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aH\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b!\u0010\u0003J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b+\u0010*J'\u0010,\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b,\u0010-JO\u00107\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u00112\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b7\u00108J?\u0010?\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020=H\u0002\u00a2\u0006\u0004\b?\u0010@J?\u0010A\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020=H\u0002\u00a2\u0006\u0004\bA\u0010@J7\u0010E\u001a\u00020\u00042\u0006\u0010C\u001a\u00020B2\u0006\u00109\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020=H\u0002\u00a2\u0006\u0004\bE\u0010FJ7\u0010G\u001a\u00020\u00042\u0006\u0010C\u001a\u00020B2\u0006\u00109\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020=H\u0002\u00a2\u0006\u0004\bG\u0010FJ7\u0010H\u001a\u00020\u00042\u0006\u0010C\u001a\u00020B2\u0006\u00109\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020=H\u0002\u00a2\u0006\u0004\bH\u0010FJ7\u0010I\u001a\u00020\u00042\u0006\u0010C\u001a\u00020B2\u0006\u00109\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020=H\u0002\u00a2\u0006\u0004\bI\u0010FJ'\u0010J\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\bJ\u0010KJ1\u0010O\u001a\u00020\b2\u0006\u0010<\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\b2\b\b\u0002\u0010N\u001a\u00020\bH\u0002\u00a2\u0006\u0004\bO\u0010PJ1\u0010Q\u001a\u00020=2\u0006\u0010<\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\b2\b\b\u0002\u0010N\u001a\u00020\bH\u0002\u00a2\u0006\u0004\bQ\u0010RJ'\u0010V\u001a\u00020=2\u0006\u0010S\u001a\u00020=2\u0006\u0010T\u001a\u00020=2\u0006\u0010U\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020=2\u0006\u0010>\u001a\u00020=H\u0002\u00a2\u0006\u0004\bX\u0010YR\u001c\u0010\\\u001a\n [*\u0004\u0018\u00010Z0Z8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\\\u0010]R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020.0^8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b_\u0010`R\u001e\u0010b\u001a\f\u0012\b\u0012\u00060aR\u00020\u00000^8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bb\u0010`R\u0016\u0010d\u001a\u00020c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bd\u0010eR\u001e\u0010f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010h\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bh\u0010i\u00a8\u0006m"}, d2={"Lkotakbaz/rain/ui/mainmenu/RainMainMenuScreen;", "Lnet/minecraft/class_437;", "<init>", "()V", "", "init", "Lnet/minecraft/class_332;", "context", "", "mouseX", "mouseY", "", "delta", "render", "(Lnet/minecraft/class_332;IIF)V", "", "button", "", "mouseClicked", "(DDI)Z", "shouldPause", "()Z", "shouldCloseOnEsc", "i", "buttonY", "(I)I", "Lkotlin/Function0;", "action", "transitionTo", "(Lkotlin/jvm/functions/Function0;)V", "screen", "openScreen", "(Lnet/minecraft/class_437;)V", "openIASScreen", "progress", "finishTransition", "(F)V", "transition", "drawBackground", "(Lnet/minecraft/class_332;F)V", "c", "drawTitle", "(Lnet/minecraft/class_332;)V", "drawUser", "drawLinks", "(Lnet/minecraft/class_332;II)V", "Lkotakbaz/rain/ui/mainmenu/RainMainMenuScreen$Link;", "link", "edgeX", "y", "textSize", "iconSize", "alignRight", "mx", "my", "drawLink", "(Lkotakbaz/rain/ui/mainmenu/RainMainMenuScreen$Link;FFFFZII)V", "x", "w", "h", "r", "Ljava/awt/Color;", "color", "card", "(FFFFFLjava/awt/Color;)V", "rect", "", "s", "size", "text", "(Ljava/lang/String;FFFLjava/awt/Color;)V", "center", "icon", "iconText", "avatar", "(FFF)V", "g", "b", "a", "argb", "(IIII)I", "rgba", "(IIII)Ljava/awt/Color;", "from", "to", "t", "mix", "(Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;", "fade", "(Ljava/awt/Color;)Ljava/awt/Color;", "Lnet/minecraft/class_2960;", "kotlin.jvm.PlatformType", "bg", "Lnet/minecraft/class_2960;", "", "links", "Ljava/util/List;", "Lkotakbaz/rain/ui/mainmenu/RainMainMenuScreen$Btn;", "buttons", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "screenTransition", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "pendingAction", "Lkotlin/jvm/functions/Function0;", "contentAlpha", "F", "Companion", "Btn", "Link", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nRainMainMenuScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RainMainMenuScreen.kt\nkotakbaz/rain/ui/mainmenu/RainMainMenuScreen\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,251:1\n1924#2,3:252\n296#2,2:255\n296#2,2:257\n1#3:259\n*S KotlinDebug\n*F\n+ 1 RainMainMenuScreen.kt\nkotakbaz/rain/ui/mainmenu/RainMainMenuScreen\n*L\n72#1:252,3\n85#1:255,2\n86#1:257,2\n*E\n"})
public final class RainMainMenuScreen
extends class_437 {
    @NotNull
    private static final Companion Companion = new Companion(null);
    private final class_2960 bg = class_2960.method_60655((String)"rain", (String)"textures/mainmenu/background.png");
    @NotNull
    private final List<Link> links;
    @NotNull
    private final List<Btn> buttons;
    @NotNull
    private b screenTransition;
    @Nullable
    private Function0<Unit> pendingAction;
    private float contentAlpha;
    @Deprecated
    public static final float CARD_BORDER = 0.33f;
    @Deprecated
    public static final int BUTTON_WIDTH = 130;
    @Deprecated
    public static final float BUTTON_HEIGHT = 25.0f;
    @Deprecated
    public static final float LINK_HOVER_DURATION = 200.0f;
    @Deprecated
    public static final float SCREEN_TRANSITION_DURATION = 260.0f;
    @Deprecated
    public static final float SCREEN_ZOOM = 0.035f;
    @Deprecated
    public static final int LEAVE_BUTTON_WIDTH = 65;
    @Deprecated
    public static final float USER_HEIGHT = 32.0f;

    public RainMainMenuScreen() {
        super((class_2561)class_2561.method_43470((String)"Rain Visuals"));
        Object[] objectArray = new Link[]{new Link("t.me/RainVisuals", "https://t.me/RainVisuals", "B", 0, 0, 0, 0, 120, null), new Link("discord.gg/RainVisuals", "https://discord.gg/RainVisuals", "A", 0, 0, 0, 0, 120, null)};
        this.links = CollectionsKt.listOf(objectArray);
        objectArray = new Btn[]{new Btn(this, "\u041e\u0434\u0438\u043d\u043e\u0447\u043d\u0430\u044f \u0438\u0433\u0440\u0430", "u", 0, () -> RainMainMenuScreen.buttons$lambda$0(this), 4, null), new Btn(this, "\u041c\u0443\u043b\u044c\u0442\u0438\u043f\u043b\u0435\u0435\u0440", "v", 0, () -> RainMainMenuScreen.buttons$lambda$1(this), 4, null), new Btn(this, "\u0410\u043a\u043a\u0430\u0443\u043d\u0442\u044b", "w", 0, () -> RainMainMenuScreen.buttons$lambda$2(this), 4, null), new Btn(this, "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438", "x", 0, () -> RainMainMenuScreen.buttons$lambda$3(this), 4, null), new Btn(this, "\u0412\u044b\u0439\u0442\u0438", "y", 65, () -> RainMainMenuScreen.buttons$lambda$4(this))};
        this.buttons = CollectionsKt.listOf(objectArray);
        this.screenTransition = new b(1.0f);
        this.contentAlpha = 1.0f;
    }

    protected void method_25426() {
        kotakbaz.rain.client.listener.listeners.a_0.INSTANCE.ensureLoaded();
        this.pendingAction = null;
        this.screenTransition = new b(1.0f);
    }

    /*
     * WARNING - void declaration
     */
    public void method_25394(@NotNull class_332 context, int mouseX, int mouseY, float delta) {
        Intrinsics.checkNotNullParameter(context, "context");
        kotakbaz.rain.client.listener.listeners.a_0.INSTANCE.ensureLoaded();
        float transition2 = this.screenTransition.animate(this.pendingAction == null ? 0.0f : 1.0f, 260.0f, (Function1<? super Float, Float>)new Function1<Float, Float>((Object)kotakbaz.rain.client.util.animations.A.INSTANCE){

            public final Float invoke(float p0) {
                return Float.valueOf(((kotakbaz.rain.client.util.animations.A)this.receiver).standardDecelerate(p0));
            }
        });
        this.drawBackground(context, transition2);
        context.method_25294(0, 0, this.field_22789, this.field_22790, this.argb(0, 0, 0, 92));
        this.contentAlpha = 1.0f - transition2;
        this.drawTitle(context);
        this.drawUser(context);
        Iterable $this$forEachIndexed$iv = this.buttons;
        boolean $i$f$forEachIndexed = false;
        int index$iv = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            void b2;
            int n;
            if ((n = index$iv++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Btn btn = (Btn)item$iv;
            int i2 = n;
            boolean bl = false;
            b2.draw(context, mouseX, mouseY, this.field_22789 / 2 - b2.getW() / 2, this.buttonY(i2));
        }
        this.drawLinks(context, mouseX, mouseY);
        this.contentAlpha = 1.0f;
        if (transition2 > 0.0f) {
            context.method_25294(0, 0, this.field_22789, this.field_22790, this.argb(0, 0, 0, MathKt.roundToInt((float)210 * transition2)));
        }
        this.finishTransition(transition2);
    }

    public boolean method_25402(double mouseX, double mouseY, int button) {
        block7: {
            Object v2;
            block6: {
                Object object;
                Object v0;
                Object it;
                boolean $i$f$firstOrNull;
                Iterable $this$firstOrNull$iv;
                block5: {
                    if (this.pendingAction != null) {
                        return true;
                    }
                    if (button != 0) break block7;
                    $this$firstOrNull$iv = this.buttons;
                    $i$f$firstOrNull = false;
                    for (Object element$iv : $this$firstOrNull$iv) {
                        it = (Btn)element$iv;
                        boolean bl = false;
                        if (!((Btn)it).hit((int)mouseX, (int)mouseY, this.field_22789 / 2 - ((Btn)it).getW() / 2, this.buttonY(this.buttons.indexOf(it)))) continue;
                        v0 = element$iv;
                        break block5;
                    }
                    v0 = null;
                }
                if ((object = (Btn)v0) != null && (object = ((Btn)object).getClick()) != null) {
                    object.invoke();
                }
                $this$firstOrNull$iv = this.links;
                $i$f$firstOrNull = false;
                for (Object element$iv : $this$firstOrNull$iv) {
                    it = (Link)element$iv;
                    boolean bl = false;
                    if (!((Link)it).hit((int)mouseX, (int)mouseY)) continue;
                    v2 = element$iv;
                    break block6;
                }
                v2 = null;
            }
            Link link = v2;
            if (link != null) {
                Link it = link;
                boolean bl = false;
                class_156.method_668().method_673(URI.create(it.getUrl()));
            }
        }
        return true;
    }

    public boolean method_25421() {
        return false;
    }

    public boolean method_25422() {
        return false;
    }

    private final int buttonY(int i2) {
        return MathKt.roundToInt((float)this.field_22790 / 1.6f - (float)135 + (float)(i2 * 28));
    }

    private final void transitionTo(Function0<Unit> action) {
        if (this.pendingAction == null) {
            this.pendingAction = action;
        }
    }

    private final void openScreen(class_437 screen) {
        class_310 class_3102 = this.field_22787;
        if (class_3102 != null) {
            class_3102.method_1507(screen);
        }
        ScreenTransition.fadeIn();
    }

    private final void openIASScreen() {
        try {
            Class<?> iasClass = Class.forName("ru.vidtu.ias.screen.AccountScreen");
            Class[] classArray = new Class[]{class_437.class};
            Constructor<?> constructor = iasClass.getConstructor(classArray);
            Object[] objectArray = new Object[]{this};
            Object obj = constructor.newInstance(objectArray);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type net.minecraft.client.gui.screen.Screen");
            class_437 screen = (class_437)obj;
            this.transitionTo(() -> RainMainMenuScreen.openIASScreen$lambda$0(this, screen));
        }
        catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void finishTransition(float progress2) {
        Function0<Unit> function0 = this.pendingAction;
        if (function0 == null) {
            return;
        }
        Function0<Unit> action = function0;
        if (progress2 < 0.995f) {
            return;
        }
        this.pendingAction = null;
        action.invoke();
    }

    private final void drawBackground(class_332 context, float transition2) {
        float zoom = 1.0f + 0.035f * transition2;
        int w = MathKt.roundToInt((float)this.field_22789 * zoom);
        int h2 = MathKt.roundToInt((float)this.field_22790 * zoom);
        context.method_25302(class_10799.field_56883, this.bg, (this.field_22789 - w) / 2, (this.field_22790 - h2) / 2, 0.0f, 0.0f, w, h2, 3840, 2160, 3840, 2160);
    }

    private final void drawTitle(class_332 c2) {
        float x2 = (float)this.field_22789 * 0.5f;
        float y2 = (float)this.field_22790 / 4.3f;
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        this.icon("a", x2 - -3.0f, y2 - -11.0f, 24.0f, color);
        Color color2 = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color2, "WHITE");
        this.center("Rain Visuals", x2, y2 + 38.0f, 7.0f, color2);
        this.center("Welcome Back!", x2, y2 + 47.5f, 5.0f, RainMainMenuScreen.rgba$default(this, 128, 128, 128, 0, 8, null));
    }

    private final void drawUser(class_332 c2) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3 = kotakbaz.rain.guard.a_0.username();
        if (StringsKt.isBlank(charSequence3)) {
            boolean bl = false;
            charSequence2 = "User";
        } else {
            charSequence2 = charSequence3;
        }
        String name = (String)charSequence2;
        CharSequence bl = kotakbaz.rain.guard.a_0.subscriptionEnd();
        if (StringsKt.isBlank(bl)) {
            boolean bl2 = false;
            charSequence = "-";
        } else {
            charSequence = bl;
        }
        String subscription = (String)charSequence;
        E e2 = D.INSTANCE.getGS_MEDIUM();
        Intrinsics.checkNotNull(name);
        int w = MathKt.roundToInt(E.getWidth$default(e2, name, 6.0f, 0.0f, 4, null)) + 48;
        int x2 = this.field_22789 - w - 24;
        this.card((float)x2 + (float)3, 24.0f, (float)w - 3.0f, 32.0f, 7.0f, this.rgba(12, 12, 12, 220));
        float f2 = (float)x2 + 34.0f;
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        this.text(name, f2, 30.5f, 7.2f, color);
        this.text("\u0434\u043e " + subscription, (float)x2 + 34.0f, 40.5f, 5.5f, RainMainMenuScreen.rgba$default(this, 128, 128, 128, 0, 8, null));
        this.avatar((float)x2 + 9.0f, 30.0f, 20.0f);
    }

    private final void drawLinks(class_332 c2, int mouseX, int mouseY) {
        float size = 6.0f;
        float iconSize = 6.8f;
        float centerX = (float)this.field_22789 * 0.5f;
        float y2 = (float)this.field_22790 / 1.12f;
        this.center("|", centerX, y2, size, RainMainMenuScreen.rgba$default(this, 96, 96, 96, 0, 8, null));
        this.drawLink(this.links.get(0), centerX - 8.0f, y2, size, iconSize, true, mouseX, mouseY);
        this.drawLink(this.links.get(1), centerX + 8.0f, y2, size, iconSize, false, mouseX, mouseY);
    }

    private final void drawLink(Link link, float edgeX, float y2, float textSize, float iconSize, boolean alignRight, int mx, int my) {
        float gap = 5.0f;
        float iconW = E.getWidth$default(D.INSTANCE.getICON(), link.getIcon(), iconSize, 0.0f, 4, null);
        float textW = E.getWidth$default(D.INSTANCE.getGS_MEDIUM(), link.getText(), textSize, 0.0f, 4, null);
        float totalW = iconW + gap + textW;
        float x2 = alignRight ? edgeX - totalW : edgeX;
        link.set(MathKt.roundToInt(x2), MathKt.roundToInt(y2), MathKt.roundToInt(totalW), 10);
        float t2 = link.getHover().animate(link.hit(mx, my) ? 1.0f : 0.0f, 200.0f, (Function1<? super Float, Float>)new Function1<Float, Float>((Object)kotakbaz.rain.client.util.animations.A.INSTANCE){

            public final Float invoke(float p0) {
                return Float.valueOf(((kotakbaz.rain.client.util.animations.A)this.receiver).standardDecelerate(p0));
            }
        });
        Color color = this.mix(RainMainMenuScreen.rgba$default(this, 134, 134, 134, 0, 8, null), RainMainMenuScreen.rgba$default(this, 214, 214, 214, 0, 8, null), t2);
        this.iconText(link.getIcon(), x2, y2 + 0.4f, iconSize, color);
        this.text(link.getText(), x2 + iconW + gap, y2, textSize, color);
    }

    private final void card(float x2, float y2, float w, float h2, float r, Color color) {
        this.rect(x2, y2, w, h2, r, this.rgba(255, 255, 255, 20));
        this.rect(x2 + 0.33f, y2 + 0.33f, w - 0.66f, h2 - 0.66f, RangesKt.coerceAtLeast(r - 0.33f, 0.0f), color);
    }

    private final void rect(float x2, float y2, float w, float h2, float r, Color color) {
        A.INSTANCE.getBASIC_RECT().priority(ClientRenderPipeline.GUI_RECT).round(r).color(this.fade(color)).draw(x2, y2, w, h2);
    }

    private final void text(String s2, float x2, float y2, float size, Color color) {
        D.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.GUI_TEXT).size(size).color(this.fade(color)).drawText(s2, x2, y2);
    }

    private final void center(String s2, float x2, float y2, float size, Color color) {
        E.drawCenteredText$default(D.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.GUI_TEXT), s2, x2, y2, size, this.fade(color), 0.0f, 32, null);
    }

    private final void icon(String s2, float x2, float y2, float size, Color color) {
        E.drawCenteredText$default(D.INSTANCE.getICON().priority(ClientRenderPipeline.GUI_TEXT), s2, x2, y2, size, this.fade(color), 0.0f, 32, null);
    }

    private final void iconText(String s2, float x2, float y2, float size, Color color) {
        D.INSTANCE.getICON().priority(ClientRenderPipeline.GUI_TEXT).size(size).color(this.fade(color)).drawText(s2, x2, y2);
    }

    private final void avatar(float x2, float y2, float size) {
        this.rect(x2, y2, size, size, size * 0.5f, this.rgba(255, 255, 255, 27));
        kotakbaz.rain.client.render.texture.texture.a_0 a_02 = a_0.INSTANCE.get("interface_avatar");
        if (a_02 == null) {
            return;
        }
        kotakbaz.rain.client.render.texture.texture.a_0 avatarTexture = a_02;
        C c2 = A.INSTANCE.getTEXTURE_RECT().priority(ClientRenderPipeline.GUI_SPECIAL).texture(avatarTexture.getTexId());
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        C.draw$default(c2, x2, y2, size, size, this.fade(color), RangesKt.coerceAtLeast(size * 0.5f - 1.0f, 0.0f), 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 2048, null);
    }

    private final int argb(int r, int g2, int b2, int a2) {
        return new Color(r, g2, b2, a2).getRGB();
    }

    static /* synthetic */ int argb$default(RainMainMenuScreen rainMainMenuScreen, int n, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 8) != 0) {
            n4 = 255;
        }
        return rainMainMenuScreen.argb(n, n2, n3, n4);
    }

    private final Color rgba(int r, int g2, int b2, int a2) {
        return new Color(r, g2, b2, a2);
    }

    static /* synthetic */ Color rgba$default(RainMainMenuScreen rainMainMenuScreen, int n, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 8) != 0) {
            n4 = 255;
        }
        return rainMainMenuScreen.rgba(n, n2, n3, n4);
    }

    private final Color mix(Color from, Color to, float t2) {
        return kotakbaz.rain.client.util.color.a_0.INSTANCE.interpolateColor(from, to, t2);
    }

    private final Color fade(Color color) {
        return kotakbaz.rain.client.util.color.a_0.INSTANCE.setAlpha(color, (float)color.getAlpha() / 255.0f * this.contentAlpha);
    }

    private static final Unit buttons$lambda$0$0(RainMainMenuScreen this$0) {
        this$0.openScreen((class_437)new class_526((class_437)this$0));
        return Unit.INSTANCE;
    }

    private static final Unit buttons$lambda$1$0(RainMainMenuScreen this$0) {
        this$0.openScreen((class_437)new class_500((class_437)this$0));
        return Unit.INSTANCE;
    }

    private static final Unit buttons$lambda$3$0(RainMainMenuScreen this$0) {
        this$0.openScreen((class_437)new class_429((class_437)this$0, class_310.method_1551().field_1690));
        return Unit.INSTANCE;
    }

    private static final Unit buttons$lambda$4$0(RainMainMenuScreen this$0) {
        block0: {
            class_310 class_3102 = this$0.field_22787;
            if (class_3102 == null) break block0;
            class_3102.method_1592();
        }
        return Unit.INSTANCE;
    }

    private static final Unit buttons$lambda$0(RainMainMenuScreen this$0) {
        this$0.transitionTo(() -> RainMainMenuScreen.buttons$lambda$0$0(this$0));
        return Unit.INSTANCE;
    }

    private static final Unit buttons$lambda$1(RainMainMenuScreen this$0) {
        this$0.transitionTo(() -> RainMainMenuScreen.buttons$lambda$1$0(this$0));
        return Unit.INSTANCE;
    }

    private static final Unit buttons$lambda$2(RainMainMenuScreen this$0) {
        this$0.openIASScreen();
        return Unit.INSTANCE;
    }

    private static final Unit buttons$lambda$3(RainMainMenuScreen this$0) {
        this$0.transitionTo(() -> RainMainMenuScreen.buttons$lambda$3$0(this$0));
        return Unit.INSTANCE;
    }

    private static final Unit buttons$lambda$4(RainMainMenuScreen this$0) {
        this$0.transitionTo(() -> RainMainMenuScreen.buttons$lambda$4$0(this$0));
        return Unit.INSTANCE;
    }

    private static final Unit openIASScreen$lambda$0(RainMainMenuScreen this$0, class_437 $screen) {
        this$0.openScreen($screen);
        return Unit.INSTANCE;
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006\u00a2\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\"\u0010#\u00a8\u0006$"}, d2={"Lkotakbaz/rain/ui/mainmenu/RainMainMenuScreen$Btn;", "", "", "text", "icon", "", "w", "Lkotlin/Function0;", "", "click", "<init>", "(Lkotakbaz/rain/ui/mainmenu/RainMainMenuScreen;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/functions/Function0;)V", "Lnet/minecraft/class_332;", "c", "mx", "my", "x", "y", "draw", "(Lnet/minecraft/class_332;IIII)V", "", "hit", "(IIII)Z", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "getIcon", "I", "getW", "()I", "Lkotlin/jvm/functions/Function0;", "getClick", "()Lkotlin/jvm/functions/Function0;", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "hover", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "rain-visuals"})
    private final class Btn {
        @NotNull
        private final String text;
        @NotNull
        private final String icon;
        private final int w;
        @NotNull
        private final Function0<Unit> click;
        @NotNull
        private final b hover;
        final /* synthetic */ RainMainMenuScreen this$0;

        public Btn(@NotNull RainMainMenuScreen this$0, @NotNull String text, String icon, @NotNull int w, Function0<Unit> click) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(click, "click");
            this.this$0 = this$0;
            super();
            this.text = text;
            this.icon = icon;
            this.w = w;
            this.click = click;
            this.hover = new b(0.0f, 1, null);
        }

        public /* synthetic */ Btn(RainMainMenuScreen rainMainMenuScreen, String string, String string2, int n, Function0 function0, int n2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((n2 & 4) != 0) {
                n = 130;
            }
            this(rainMainMenuScreen, string, string2, n, function0);
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public final int getW() {
            return this.w;
        }

        @NotNull
        public final Function0<Unit> getClick() {
            return this.click;
        }

        public final void draw(@NotNull class_332 c2, int mx, int my, int x2, int y2) {
            Intrinsics.checkNotNullParameter(c2, "c");
            float t2 = this.hover.animate(this.hit(mx, my, x2, y2) ? 1.0f : 0.0f, 200.0f, (Function1<? super Float, Float>)new Function1<Float, Float>((Object)kotakbaz.rain.client.util.animations.A.INSTANCE){

                public final Float invoke(float p0) {
                    return Float.valueOf(((kotakbaz.rain.client.util.animations.A)this.receiver).standardDecelerate(p0));
                }
            });
            Color color = this.this$0.rgba(12, 12, 12, 220);
            Color color2 = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue(color2, "WHITE");
            Color color3 = this.this$0.mix(color, color2, t2);
            Color color4 = RainMainMenuScreen.rgba$default(this.this$0, 154, 154, 154, 0, 8, null);
            Color color5 = Color.BLACK;
            Intrinsics.checkNotNullExpressionValue(color5, "BLACK");
            Color textColor = this.this$0.mix(color4, color5, t2);
            Color dotColor = this.this$0.mix(RainMainMenuScreen.rgba$default(this.this$0, 100, 100, 100, 0, 8, null), RainMainMenuScreen.rgba$default(this.this$0, 63, 63, 63, 0, 8, null), t2);
            float textSize = 7.0f;
            float iconSize = 6.9f;
            float gap = 4.0f;
            float iconW = E.getWidth$default(D.INSTANCE.getICON(), this.icon, iconSize, 0.0f, 4, null);
            float textW = E.getWidth$default(D.INSTANCE.getGS_MEDIUM(), this.text, textSize, 0.0f, 4, null);
            float startX = (float)x2 + ((float)this.w - iconW - gap - textW) * 0.5f;
            this.this$0.card(x2, y2, this.w, 25.0f, 7.0f, color3);
            this.this$0.rect((float)(x2 + this.w) - 10.0f, (float)y2 + 5.0f, 2.5f, 2.5f, 1.25f, dotColor);
            this.this$0.iconText(this.icon, startX, (float)y2 + 9.0f, iconSize, textColor);
            this.this$0.text(this.text, startX + iconW + gap, (float)y2 + 8.3f, textSize, textColor);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final boolean hit(int mx, int my, int x2, int y2) {
            if (x2 > mx) return false;
            if (mx > x2 + this.w) return false;
            boolean bl = true;
            if (!bl) return false;
            if (y2 > my) return false;
            if (my > y2 + MathKt.roundToInt(25.0f)) return false;
            return true;
        }
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0006\u00a8\u0006\u0010"}, d2={"Lkotakbaz/rain/ui/mainmenu/RainMainMenuScreen$Companion;", "", "<init>", "()V", "", "CARD_BORDER", "F", "", "BUTTON_WIDTH", "I", "BUTTON_HEIGHT", "LINK_HOVER_DURATION", "SCREEN_TRANSITION_DURATION", "SCREEN_ZOOM", "LEAVE_BUTTON_WIDTH", "USER_HEIGHT", "rain-visuals"})
    private static final class Companion {
        private Companion() {
            super();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\b!\u0010\u001eJV\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b%\u0010&J\u0011\u0010'\u001a\u00020\u0006H\u00d6\u0081\u0004\u00a2\u0006\u0004\b'\u0010\u001eJ\u0011\u0010(\u001a\u00020\u0002H\u00d6\u0081\u0004\u00a2\u0006\u0004\b(\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u00100R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\b\u0010-\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u00100R\"\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\t\u0010-\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u00100R\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\n\u0010-\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u00100R\u0017\u00108\u001a\u0002078\u0006\u00a2\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\u00a8\u0006<"}, d2={"Lkotakbaz/rain/ui/mainmenu/RainMainMenuScreen$Link;", "", "", "text", "url", "icon", "", "x", "y", "w", "h", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIII)V", "nx", "ny", "nw", "nh", "", "set", "(IIII)V", "mx", "my", "", "hit", "(II)Z", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIII)Lkotakbaz/rain/ui/mainmenu/RainMainMenuScreen$Link;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getText", "getUrl", "getIcon", "I", "getX", "setX", "(I)V", "getY", "setY", "getW", "setW", "getH", "setH", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "hover", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "getHover", "()Lkotakbaz/rain/client/util/animations/AnimationUtil;", "rain-visuals"})
    private static final class Link {
        @NotNull
        private final String text;
        @NotNull
        private final String url;
        @NotNull
        private final String icon;
        private int x;
        private int y;
        private int w;
        private int h;
        @NotNull
        private final b hover;

        public Link(@NotNull String text, @NotNull String url, @NotNull String icon, int x2, int y2, int w, int h2) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(icon, "icon");
            super();
            this.text = text;
            this.url = url;
            this.icon = icon;
            this.x = x2;
            this.y = y2;
            this.w = w;
            this.h = h2;
            this.hover = new b(0.0f, 1, null);
        }

        public /* synthetic */ Link(String string, String string2, String string3, int n, int n2, int n3, int n4, int n5, DefaultConstructorMarker defaultConstructorMarker) {
            if ((n5 & 8) != 0) {
                n = 0;
            }
            if ((n5 & 0x10) != 0) {
                n2 = 0;
            }
            if ((n5 & 0x20) != 0) {
                n3 = 0;
            }
            if ((n5 & 0x40) != 0) {
                n4 = 0;
            }
            this(string, string2, string3, n, n2, n3, n4);
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public final int getX() {
            return this.x;
        }

        public final void setX(int n) {
            this.x = n;
        }

        public final int getY() {
            return this.y;
        }

        public final void setY(int n) {
            this.y = n;
        }

        public final int getW() {
            return this.w;
        }

        public final void setW(int n) {
            this.w = n;
        }

        public final int getH() {
            return this.h;
        }

        public final void setH(int n) {
            this.h = n;
        }

        @NotNull
        public final b getHover() {
            return this.hover;
        }

        public final void set(int nx, int ny, int nw, int nh) {
            this.x = nx;
            this.y = ny;
            this.w = nw;
            this.h = nh;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final boolean hit(int mx, int my) {
            int n = this.x;
            if (mx > this.x + this.w) return false;
            if (n > mx) return false;
            boolean bl = true;
            if (!bl) return false;
            n = this.y;
            if (my > this.y + this.h) return false;
            if (n > my) return false;
            return true;
        }

        @NotNull
        public final String component1() {
            return this.text;
        }

        @NotNull
        public final String component2() {
            return this.url;
        }

        @NotNull
        public final String component3() {
            return this.icon;
        }

        public final int component4() {
            return this.x;
        }

        public final int component5() {
            return this.y;
        }

        public final int component6() {
            return this.w;
        }

        public final int component7() {
            return this.h;
        }

        @NotNull
        public final Link copy(@NotNull String text, @NotNull String url, @NotNull String icon, int x2, int y2, int w, int h2) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new Link(text, url, icon, x2, y2, w, h2);
        }

        public static /* synthetic */ Link copy$default(Link link, String string, String string2, String string3, int n, int n2, int n3, int n4, int n5, Object object) {
            if ((n5 & 1) != 0) {
                string = link.text;
            }
            if ((n5 & 2) != 0) {
                string2 = link.url;
            }
            if ((n5 & 4) != 0) {
                string3 = link.icon;
            }
            if ((n5 & 8) != 0) {
                n = link.x;
            }
            if ((n5 & 0x10) != 0) {
                n2 = link.y;
            }
            if ((n5 & 0x20) != 0) {
                n3 = link.w;
            }
            if ((n5 & 0x40) != 0) {
                n4 = link.h;
            }
            return link.copy(string, string2, string3, n, n2, n3, n4);
        }

        @NotNull
        public String toString() {
            return "Link(text=" + this.text + ", url=" + this.url + ", icon=" + this.icon + ", x=" + this.x + ", y=" + this.y + ", w=" + this.w + ", h=" + this.h + ")";
        }

        public int hashCode() {
            int result = this.text.hashCode();
            result = result * 31 + this.url.hashCode();
            result = result * 31 + this.icon.hashCode();
            result = result * 31 + Integer.hashCode(this.x);
            result = result * 31 + Integer.hashCode(this.y);
            result = result * 31 + Integer.hashCode(this.w);
            result = result * 31 + Integer.hashCode(this.h);
            return result;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Link)) {
                return false;
            }
            Link link = (Link)other;
            if (!Intrinsics.areEqual(this.text, link.text)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.url, link.url)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.icon, link.icon)) {
                return false;
            }
            if (this.x != link.x) {
                return false;
            }
            if (this.y != link.y) {
                return false;
            }
            if (this.w != link.w) {
                return false;
            }
            return this.h == link.h;
        }
    }
}

