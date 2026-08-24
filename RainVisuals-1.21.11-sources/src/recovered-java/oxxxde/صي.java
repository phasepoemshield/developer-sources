/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotakbaz.rain.ui.inventory.SearchLayout;
import kotakbaz.rain.ui.inventory.UiRect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=2, xi=48, d1={"\u0000(\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b)\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\b\r\u0010\f\u001a\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u00128\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00128\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00128\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00128\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00128\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0014\"\u0014\u0010\u0019\u001a\u00020\u00128\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u0014\"\u0014\u0010\u001a\u001a\u00020\u00128\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u0014\"\u0014\u0010\u001b\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b\u001f\u0010\u001c\"\u0014\u0010 \u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b \u0010\u001c\"\u0014\u0010!\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b!\u0010\u001c\"\u0014\u0010\"\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b\"\u0010\u001c\"\u0014\u0010#\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b#\u0010\u001c\"\u0014\u0010$\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b$\u0010\u001c\"\u0014\u0010%\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b%\u0010\u001c\"\u0014\u0010&\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b&\u0010\u001c\"\u0014\u0010'\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b'\u0010\u001c\"\u0014\u0010(\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b(\u0010\u001c\"\u0014\u0010)\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b)\u0010\u001c\"\u0014\u0010*\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b*\u0010\u001c\"\u0014\u0010+\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b+\u0010\u001c\"\u0014\u0010,\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b,\u0010\u001c\"\u0014\u0010-\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b-\u0010\u001c\"\u0014\u0010.\u001a\u00020\u000e8\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b.\u0010/\"\u0014\u00100\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b0\u0010\u001c\"\u0014\u00101\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b1\u0010\u001c\"\u0014\u00102\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b2\u0010\u001c\"\u0014\u00103\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b3\u0010\u001c\"\u0014\u00104\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b4\u0010\u001c\"\u0014\u00105\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b5\u0010\u001c\"\u0014\u00106\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b6\u0010\u001c\"\u0014\u00107\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b7\u0010\u001c\"\u0014\u00108\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b8\u0010\u001c\"\u0014\u00109\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b9\u0010\u001c\"\u0014\u0010:\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b:\u0010\u001c\u00a8\u0006;"}, d2={"", "panelX", "panelY", "Loxxxde/\u0638\u0626;", "searchLayout", "(FF)Lkotakbaz/rain/ui/inventory/SearchLayout;", "Loxxxde/\u0638\u0622;", "cardListBounds", "(FF)Lkotakbaz/rain/ui/inventory/UiRect;", "list", "cardY", "cardActionBounds", "(Lkotakbaz/rain/ui/inventory/UiRect;F)Lkotakbaz/rain/ui/inventory/UiRect;", "cardDeleteBounds", "", "cardCount", "maxListScroll", "(I)F", "", "SEARCH_PLACEHOLDER", "Ljava/lang/String;", "SEARCH_ICON", "INFO_ICON", "INFO_TITLE", "INFO_DESCRIPTION", "EMPTY_STATE_TEXT", "VIEW_LABEL_TEXT", "CONTENT_TEXT_SIZE", "F", "VIEW_LABEL_SIZE", "VIEW_LABEL_GAP", "VIEW_PREVIEW_SIZE", "VIEW_PREVIEW_GAP", "VIEW_PREVIEW_ITEM_GAP", "VIEW_PREVIEW_ROW_GAP", "VIEW_PREVIEW_RADIUS", "PANEL_WIDTH", "PANEL_HEIGHT", "LEFT_PANEL_WIDTH", "INNER_PANEL_INSET", "CORNER_RADIUS", "TOP_INFO_HEIGHT", "TOP_INFO_PADDING", "SEARCH_INSET", "SEARCH_ACTION_GAP", "ADD_ICON_X_OFFSET", "MAX_CARD_NAME_LENGTH", "I", "CARD_LIST_TOP_GAP", "CARD_HEIGHT", "CARD_GAP", "CARD_PADDING", "CARD_SCROLL_STEP", "CARD_ACTION_WIDTH", "CARD_ACTION_HEIGHT", "CARD_ACTION_TEXT_SIZE", "CARD_DELETE_AREA_SIZE", "CARD_DELETE_ICON_SIZE", "CARD_DELETE_GAP", "rain-visuals"})
public final class \u0635\u064a {
    public static final float CARD_LIST_TOP_GAP = 8.0f;
    public static final float PANEL_WIDTH = 438.0f;
    @NotNull
    public static final String INFO_ICON = "N";
    public static final float SEARCH_ACTION_GAP = 5.0f;
    public static final float CARD_DELETE_ICON_SIZE = 6.2f;
    public static final float VIEW_PREVIEW_SIZE = 22.0f;
    public static final float TOP_INFO_HEIGHT = 27.0f;
    public static final float SEARCH_INSET = 8.0f;
    public static final float VIEW_PREVIEW_ROW_GAP = 8.0f;
    @NotNull
    public static final String INFO_DESCRIPTION = "\u041c\u0435\u043d\u0435\u0434\u0436\u0435\u0440 \u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u0435\u0439";
    public static final int MAX_CARD_NAME_LENGTH = 20;
    public static final float CARD_GAP = 5.0f;
    public static final float CONTENT_TEXT_SIZE = 8.0f;
    public static final float VIEW_PREVIEW_RADIUS = 1.0f;
    public static final float CARD_PADDING = 5.0f;
    public static final float INNER_PANEL_INSET = 12.0f;
    public static final float LEFT_PANEL_WIDTH = 197.09999f;
    public static final float VIEW_LABEL_SIZE = 8.0f;
    public static final float CARD_ACTION_WIDTH = 42.0f;
    @NotNull
    public static final String SEARCH_ICON = "g";
    public static final float TOP_INFO_PADDING = 5.0f;
    @NotNull
    public static final String VIEW_LABEL_TEXT = "\u041f\u0440\u043e\u0441\u043c\u043e\u0442\u0440:";
    public static final float VIEW_PREVIEW_GAP = 8.0f;
    @NotNull
    public static final String INFO_TITLE = "InvManager";
    public static final float VIEW_PREVIEW_ITEM_GAP = 3.0f;
    public static final float CARD_SCROLL_STEP = 38.0f;
    public static final float CARD_DELETE_AREA_SIZE = 14.0f;
    public static final float CARD_ACTION_HEIGHT = 17.0f;
    public static final float PANEL_HEIGHT = 234.0f;
    public static final float CARD_HEIGHT = 33.0f;
    public static final float ADD_ICON_X_OFFSET = -0.7f;
    @NotNull
    public static final String SEARCH_PLACEHOLDER = "\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043d\u0430\u0437\u0432\u0430\u043d\u0438\u0435..";
    @NotNull
    public static final String EMPTY_STATE_TEXT = "\u0417\u0434\u0435\u0441\u044c \u043f\u043e\u043a\u0430 \u0447\u0442\u043e \u043f\u0443\u0441\u0442\u043e >_<";
    public static final float CARD_ACTION_TEXT_SIZE = 6.2f;
    public static final float CORNER_RADIUS = 9.36f;
    public static final float VIEW_LABEL_GAP = 16.0f;
    public static final float CARD_DELETE_GAP = 3.0f;

    @NotNull
    public static final UiRect cardListBounds(float panelX, float panelY) {
        SearchLayout search = \u0635\u064a.searchLayout(panelX, panelY);
        float y = search.getY() + 27.0f + 8.0f;
        float bottom = panelY + 234.0f - 12.0f - 8.0f;
        return new UiRect(search.getSearchX(), y, search.getRowWidth(), RangesKt.coerceAtLeast(bottom - y, 0.0f));
    }

    public static final float maxListScroll(int cardCount) {
        float contentHeight = RangesKt.coerceAtLeast((float)cardCount * 38.0f - 5.0f, 0.0f);
        float viewHeight = 159.0f;
        return RangesKt.coerceAtLeast(contentHeight - viewHeight, 0.0f);
    }

    @NotNull
    public static final SearchLayout searchLayout(float panelX, float panelY) {
        float x = panelX + 12.0f + 8.0f;
        float y = panelY + 12.0f + 8.0f;
        float rowWidth = 157.09999f;
        float searchWidth = rowWidth - 5.0f - 27.0f;
        return new SearchLayout(x, y, searchWidth, x + searchWidth + 5.0f, rowWidth);
    }

    @NotNull
    public static final UiRect cardActionBounds(@NotNull UiRect list, float cardY) {
        Intrinsics.checkNotNullParameter(list, "list");
        return new UiRect(list.getX() + list.getWidth() - 7.5f - 42.0f, cardY + 8.0f, 42.0f, 17.0f);
    }

    @NotNull
    public static final UiRect cardDeleteBounds(@NotNull UiRect list, float cardY) {
        Intrinsics.checkNotNullParameter(list, "list");
        UiRect action = \u0635\u064a.cardActionBounds(list, cardY);
        return new UiRect(action.getX() - 3.0f - 14.0f, cardY + 9.5f, 14.0f, 14.0f);
    }
}

