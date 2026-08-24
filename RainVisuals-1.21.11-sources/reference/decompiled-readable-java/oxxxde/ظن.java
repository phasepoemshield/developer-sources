/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.List;
import kotakbaz.rain.client.extensions.Category;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=2, xi=48, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0005\"\u0017\u0010\u0001\u001a\u00020\u00008\u0006\u00a2\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u0017\u0010\t\u001a\u00020\u00008\u0006\u00a2\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u0017\u0010\u000b\u001a\u00020\u00008\u0006\u00a2\u0006\f\n\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0004\"\u0017\u0010\r\u001a\u00020\u00008\u0006\u00a2\u0006\f\n\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0004\"\u0017\u0010\u000f\u001a\u00020\u00008\u0006\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u0017\u0010\u0011\u001a\u00020\u00008\u0006\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0004\"\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00138\u0006\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2={"Loxxxde/\u0638\u0635;", "RENDER", "Loxxxde/\u0638\u0635;", "getRENDER", "()Lkotakbaz/rain/client/extensions/Category;", "PLAYER", "getPLAYER", "HUD", "getHUD", "FRIENDS", "getFRIENDS", "POINTS", "getPOINTS", "CONFIGS", "getCONFIGS", "EVENTS", "getEVENTS", "MODELS", "getMODELS", "", "categories", "Ljava/util/List;", "getCategories", "()Ljava/util/List;", "rain-visuals"})
public final class \u0638\u0646 {
    @NotNull
    private static final Category CONFIGS;
    @NotNull
    private static final Category RENDER;
    @NotNull
    private static final Category POINTS;
    @NotNull
    private static final Category MODELS;
    @NotNull
    private static final Category PLAYER;
    @NotNull
    private static final List<Category> categories;
    @NotNull
    private static final Category EVENTS;
    @NotNull
    private static final Category FRIENDS;
    @NotNull
    private static final Category HUD;

    @NotNull
    public static final Category getFRIENDS() {
        return FRIENDS;
    }

    @NotNull
    public static final Category getCONFIGS() {
        return CONFIGS;
    }

    static {
        RENDER = new Category("Render", "b", "\u0412\u0438\u0437\u0443\u0430\u043b\u044c\u043d\u044b\u0435 \u043c\u043e\u0434\u0443\u043b\u0438", null, null, 24, null);
        PLAYER = new Category("Player", "c", "\u0418\u0433\u0440\u043e\u0432\u044b\u0435 \u0443\u043f\u0440\u043e\u0449\u0435\u043d\u0438\u044f \u0438 \u0443\u0442\u0438\u043b\u0438\u0442\u044b", null, null, 24, null);
        HUD = new Category("Hud", "d", "\u041c\u043e\u0434\u0443\u043b\u0438 \u0438\u043d\u0442\u0435\u0440\u0444\u0435\u0439\u0441\u0430", null, null, 24, null);
        FRIENDS = new Category("Friends", "w", "\u0421\u043f\u0438\u0441\u043e\u043a \u0434\u0440\u0443\u0437\u0435\u0439", null, null, 24, null);
        POINTS = new Category("WayPoint", "s", "\u041c\u0435\u0442\u043a\u0438 \u0438 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b", null, null, 24, null);
        CONFIGS = new Category("Configs", "e", "\u041a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u0438 \u043a\u043b\u0438\u0435\u043d\u0442\u0430", null, null, 24, null);
        EVENTS = new Category("Events", "M", "\u0421\u043e\u0431\u044b\u0442\u0438\u044f \u0441\u0435\u0440\u0432\u0435\u0440\u0430 FunTime", null, null, 24, null);
        MODELS = new Category("Models", "u", "\u041c\u043e\u0434\u0435\u043b\u044c\u043a\u0438 \u0438 \u043a\u043e\u0441\u043c\u0435\u0442\u0438\u043a\u0430", "\u041d\u0430\u0437\u0432\u0430\u043d\u0438\u0435 \u043c\u043e\u0434\u0435\u043b\u0438..", "N");
        Category[] categoryArray = new Category[7];
        categoryArray[0] = RENDER;
        categoryArray[1] = PLAYER;
        categoryArray[2] = HUD;
        categoryArray[3] = FRIENDS;
        categoryArray[4] = POINTS;
        categoryArray[5] = MODELS;
        categoryArray[6] = EVENTS;
        categories = CollectionsKt.listOf(categoryArray);
    }

    @NotNull
    public static final Category getMODELS() {
        return MODELS;
    }

    @NotNull
    public static final Category getPOINTS() {
        return POINTS;
    }

    @NotNull
    public static final List<Category> getCategories() {
        return categories;
    }

    @NotNull
    public static final Category getPLAYER() {
        return PLAYER;
    }

    @NotNull
    public static final Category getRENDER() {
        return RENDER;
    }

    @NotNull
    public static final Category getEVENTS() {
        return EVENTS;
    }

    @NotNull
    public static final Category getHUD() {
        return HUD;
    }
}

