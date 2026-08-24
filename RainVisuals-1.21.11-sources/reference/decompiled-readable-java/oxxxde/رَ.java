/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.List;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.client.util.render.font.FontBuilder;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010 \n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001b\u0010\u001a\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010R\u001b\u0010\u001d\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010R\u001b\u0010 \u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001f\u0010\u0010R\u001b\u0010#\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b\"\u0010\u0010R!\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070$8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\u000e\u001a\u0004\b&\u0010'\u00a8\u0006)"}, d2={"Loxxxde/\u0631\u064e;", "", "<init>", "()V", "", "folder", "name", "Loxxxde/\u062c\u064b;", "get", "(Ljava/lang/String;Ljava/lang/String;)Lkotakbaz/rain/client/util/render/font/Font;", "GS", "Ljava/lang/String;", "RAIN", "GS_BOLD$delegate", "Lkotlin/Lazy;", "getGS_BOLD", "()Lkotakbaz/rain/client/util/render/font/Font;", "GS_BOLD", "GS_SEMI$delegate", "getGS_SEMI", "GS_SEMI", "GS_MEDIUM$delegate", "getGS_MEDIUM", "GS_MEDIUM", "GS_REGULAR$delegate", "getGS_REGULAR", "GS_REGULAR", "ICON$delegate", "getICON", "ICON", "ICON2$delegate", "getICON2", "ICON2", "LOGO$delegate", "getLOGO", "LOGO", "", "all$delegate", "getAll", "()Ljava/util/List;", "all", "rain-visuals"})
public final class \u0631\u064e {
    @NotNull
    private static final Lazy ICON2$delegate;
    @NotNull
    public static final \u0631\u064e INSTANCE;
    @NotNull
    private static final Lazy GS_BOLD$delegate;
    @NotNull
    public static final String GS = "google_sans";
    @NotNull
    private static final Lazy GS_SEMI$delegate;
    @NotNull
    public static final String RAIN = "rain";
    @NotNull
    private static final Lazy ICON$delegate;
    @NotNull
    private static final Lazy GS_REGULAR$delegate;
    @NotNull
    private static final Lazy all$delegate;
    @NotNull
    private static final Lazy GS_MEDIUM$delegate;
    @NotNull
    private static final Lazy LOGO$delegate;

    private static final Font ICON2_delegate$lambda$0() {
        return INSTANCE.get(RAIN, "icon2");
    }

    private static final Font GS_BOLD_delegate$lambda$0() {
        return INSTANCE.get(GS, "google_sans_bold");
    }

    private static final Font ICON_delegate$lambda$0() {
        return INSTANCE.get(RAIN, "icon");
    }

    static {
        INSTANCE = new \u0631\u064e();
        GS_BOLD$delegate = LazyKt.lazy(\u0631\u064e::GS_BOLD_delegate$lambda$0);
        GS_SEMI$delegate = LazyKt.lazy(\u0631\u064e::GS_SEMI_delegate$lambda$0);
        GS_MEDIUM$delegate = LazyKt.lazy(\u0631\u064e::GS_MEDIUM_delegate$lambda$0);
        GS_REGULAR$delegate = LazyKt.lazy(\u0631\u064e::GS_REGULAR_delegate$lambda$0);
        ICON$delegate = LazyKt.lazy(\u0631\u064e::ICON_delegate$lambda$0);
        ICON2$delegate = LazyKt.lazy(\u0631\u064e::ICON2_delegate$lambda$0);
        LOGO$delegate = LazyKt.lazy(\u0631\u064e::LOGO_delegate$lambda$0);
        all$delegate = LazyKt.lazy(\u0631\u064e::all_delegate$lambda$0);
    }

    @NotNull
    public final Font getGS_MEDIUM() {
        Lazy lazy = GS_MEDIUM$delegate;
        return (Font)lazy.getValue();
    }

    private \u0631\u064e() {
    }

    private static final Font GS_REGULAR_delegate$lambda$0() {
        return INSTANCE.get(GS, "google_sans_regular");
    }

    @NotNull
    public final Font getGS_REGULAR() {
        Lazy lazy = GS_REGULAR$delegate;
        return (Font)lazy.getValue();
    }

    @NotNull
    public final Font getLOGO() {
        Lazy lazy = LOGO$delegate;
        return (Font)lazy.getValue();
    }

    private static final Font LOGO_delegate$lambda$0() {
        return INSTANCE.get(RAIN, "logo");
    }

    @NotNull
    public final Font getICON2() {
        Lazy lazy = ICON2$delegate;
        return (Font)lazy.getValue();
    }

    private final Font get(String folder, String name) {
        return new FontBuilder().find(folder + "/" + name).build();
    }

    @NotNull
    public final Font getICON() {
        Lazy lazy = ICON$delegate;
        return (Font)lazy.getValue();
    }

    @NotNull
    public final Font getGS_SEMI() {
        Lazy lazy = GS_SEMI$delegate;
        return (Font)lazy.getValue();
    }

    private static final Font GS_MEDIUM_delegate$lambda$0() {
        return INSTANCE.get(GS, "google_sans_medium");
    }

    @NotNull
    public final List<Font> getAll() {
        Lazy lazy = all$delegate;
        return (List)lazy.getValue();
    }

    private static final Font GS_SEMI_delegate$lambda$0() {
        return INSTANCE.get(GS, "google_sans_semi");
    }

    @NotNull
    public final Font getGS_BOLD() {
        Lazy lazy = GS_BOLD$delegate;
        return (Font)lazy.getValue();
    }

    private static final List all_delegate$lambda$0() {
        Font[] fontArray = new Font[7];
        fontArray[0] = INSTANCE.getGS_BOLD();
        fontArray[1] = INSTANCE.getGS_SEMI();
        fontArray[2] = INSTANCE.getGS_MEDIUM();
        fontArray[3] = INSTANCE.getGS_REGULAR();
        fontArray[4] = INSTANCE.getICON();
        fontArray[5] = INSTANCE.getICON2();
        fontArray[6] = INSTANCE.getLOGO();
        return CollectionsKt.listOf(fontArray);
    }
}

