package oxxxde

// $VF: Compiled from heavy
internal const val CARD_LIST_TOP_GAP: Float = 8.0F
internal const val PANEL_WIDTH: Float = 438.0F
internal const val INFO_ICON: String = "N"
internal const val SEARCH_ACTION_GAP: Float = 5.0F
internal const val CARD_DELETE_ICON_SIZE: Float = 6.2F
internal const val VIEW_PREVIEW_SIZE: Float = 22.0F
internal const val TOP_INFO_HEIGHT: Float = 27.0F
internal const val SEARCH_INSET: Float = 8.0F
internal const val VIEW_PREVIEW_ROW_GAP: Float = 8.0F
internal const val INFO_DESCRIPTION: String = "Менеджер инвентарей"
internal const val MAX_CARD_NAME_LENGTH: Int = 20
internal const val CARD_GAP: Float = 5.0F
internal const val CONTENT_TEXT_SIZE: Float = 8.0F
internal const val VIEW_PREVIEW_RADIUS: Float = 1.0F
internal const val CARD_PADDING: Float = 5.0F
internal const val INNER_PANEL_INSET: Float = 12.0F
internal const val LEFT_PANEL_WIDTH: Float = 197.09999F
internal const val VIEW_LABEL_SIZE: Float = 8.0F
internal const val CARD_ACTION_WIDTH: Float = 42.0F
internal const val SEARCH_ICON: String = "g"
internal const val TOP_INFO_PADDING: Float = 5.0F
internal const val VIEW_LABEL_TEXT: String = "Просмотр:"
internal const val VIEW_PREVIEW_GAP: Float = 8.0F
internal const val INFO_TITLE: String = "InvManager"
internal const val VIEW_PREVIEW_ITEM_GAP: Float = 3.0F
internal const val CARD_SCROLL_STEP: Float = 38.0F
internal const val CARD_DELETE_AREA_SIZE: Float = 14.0F
internal const val CARD_ACTION_HEIGHT: Float = 17.0F
internal const val PANEL_HEIGHT: Float = 234.0F
internal const val CARD_HEIGHT: Float = 33.0F
internal const val ADD_ICON_X_OFFSET: Float = -0.7F
internal const val SEARCH_PLACEHOLDER: String = "Введите название.."
internal const val EMPTY_STATE_TEXT: String = "Здесь пока что пусто >_<"
internal const val CARD_ACTION_TEXT_SIZE: Float = 6.2F
internal const val CORNER_RADIUS: Float = 9.36F
internal const val VIEW_LABEL_GAP: Float = 16.0F
internal const val CARD_DELETE_GAP: Float = 3.0F

internal fun cardListBounds(panelX: Float, panelY: Float): ظآ {
   val search: ظئ = searchLayout(panelX, panelY)
   val y: Float = search.y + 27.0F + 8.0F
   return ظآ(search.searchX, y, search.rowWidth, RangesKt.coerceAtLeast(panelY + 234.0F - 12.0F - 8.0F - y, 0.0F))
}

internal fun maxListScroll(cardCount: Int): Float {
   return RangesKt.coerceAtLeast(RangesKt.coerceAtLeast((float)cardCount * 38.0F - 5.0F, 0.0F) - 159.0F, 0.0F)
}

internal fun searchLayout(panelX: Float, panelY: Float): ظئ {
   return ظئ(panelX + 12.0F + 8.0F, panelY + 12.0F + 8.0F, 157.09999F - 5.0F - 27.0F, panelX + 12.0F + 8.0F + (157.09999F - 5.0F - 27.0F) + 5.0F, 157.09999F)
}

internal fun cardActionBounds(list: ظآ, cardY: Float): ظآ {
   return ظآ(list.x + list.width - 7.5F - 42.0F, cardY + 8.0F, 42.0F, 17.0F)
}

internal fun cardDeleteBounds(list: ظآ, cardY: Float): ظآ {
   return ظآ(cardActionBounds(list, cardY).x - 3.0F - 14.0F, cardY + 9.5F, 14.0F, 14.0F)
}
