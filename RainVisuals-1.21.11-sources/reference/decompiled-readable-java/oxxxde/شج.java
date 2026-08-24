/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.registry.RegistryWrapper$WrapperLookup
 *  org.lwjgl.glfw.GLFW
 */
package oxxxde;

import java.awt.Color;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotakbaz.rain.client.util.other.CustomScreen;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.ui.api.PipelinedRender;
import kotakbaz.rain.ui.inventory.InventoryCard;
import kotakbaz.rain.ui.inventory.InventorySnapshot;
import kotakbaz.rain.ui.inventory.SearchLayout;
import kotakbaz.rain.ui.inventory.UiRect;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;
import oxxxde.\u0628\u062d;
import oxxxde.\u0628\u0641;
import oxxxde.\u062a\u0624;
import oxxxde.\u062b\u0652;
import oxxxde.\u062c\u0650;
import oxxxde.\u0630\u0631;
import oxxxde.\u0631\u064e;
import oxxxde.\u0633\u0652;
import oxxxde.\u0635\u064a;
import oxxxde.\u0636\u0638;
import oxxxde.\u0636\u0643;
import oxxxde.\u0636\u0652;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000b\u0010\u0004J'\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u001b\u0010\u0016J%\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b \u0010\u0016J\u001f\u0010!\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b!\u0010\u0016J/\u0010\"\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\"\u0010#J'\u0010(\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b(\u0010)J'\u0010-\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b-\u0010.J'\u00100\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010/\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b0\u00101J'\u00103\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u00102\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b3\u0010\u0012J'\u00104\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010/\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b4\u00101J\u000f\u00105\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b5\u0010\nJ\u0017\u00108\u001a\u00020\u00052\u0006\u00107\u001a\u000206H\u0002\u00a2\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b:\u0010\u0004J\u000f\u0010;\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b;\u0010\u0004J\u0011\u0010=\u001a\u0004\u0018\u00010<H\u0002\u00a2\u0006\u0004\b=\u0010>J/\u0010?\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\bA\u0010\u0016J\u000f\u0010C\u001a\u00020BH\u0016\u00a2\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020BH\u0016\u00a2\u0006\u0004\bE\u0010DJ\u000f\u0010F\u001a\u00020BH\u0016\u00a2\u0006\u0004\bF\u0010DR\u0016\u0010G\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u0002068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bK\u0010HR\u0016\u0010L\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010P\u001a\u0004\u0018\u0001068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bN\u0010OR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020R0Q8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bS\u0010T\u00a8\u0006V"}, d2={"Loxxxde/\u0634\u062c;", "Loxxxde/\u062c\u0639;", "Loxxxde/\u0627\u0633;", "<init>", "()V", "", "init", "close", "", "shouldRemove", "()Z", "clearLoadedSelection", "", "mouseX", "mouseY", "", "partialTicks", "render", "(IIF)V", "panelX", "panelY", "renderPanelBorder", "(FF)V", "renderViewLabel", "renderViewPreview", "x", "y", "renderViewSlot", "Lnet/minecraft/class_332;", "graphics", "renderSavedInventoryItems", "(Lnet/minecraft/class_332;II)Z", "renderEmptyState", "renderSearch", "renderSavedCards", "(FFII)V", "Loxxxde/\u0638\u0622;", "bounds", "reveal", "hover", "renderCardDelete", "(Lkotakbaz/rain/ui/inventory/UiRect;FF)V", "cardY", "listBounds", "selection", "renderCardAction", "(FLkotakbaz/rain/ui/inventory/UiRect;F)V", "button", "onMouseClick", "(III)V", "vertical", "onMouseScroll", "onKeyPress", "isShiftDown", "", "value", "appendSearchText", "(Ljava/lang/String;)V", "addCardFromInput", "reloadSavedCards", "Loxxxde/\u0651;", "captureInventory", "()Lkotakbaz/rain/ui/inventory/InventorySnapshot;", "handleCardActionClick", "(FFFF)Z", "renderTopInfo", "Loxxxde/\u0635\u0624;", "rectPipeline", "()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "textPipeline", "iconsPipeline", "closing", "Z", "searchText", "Ljava/lang/String;", "searchFocused", "listScroll", "F", "getSelectedCardName", "()Ljava/lang/String;", "selectedCardName", "", "Loxxxde/\u062b\u063a;", "getSavedCards", "()Ljava/util/List;", "savedCards", "rain-visuals"})
public final class \u0634\u062c
extends CustomScreen
implements PipelinedRender {
    private static boolean closing;
    @NotNull
    private static String searchText;
    private static float listScroll;
    private static boolean searchFocused;
    @NotNull
    public static final \u0634\u062c INSTANCE;

    private final String getSelectedCardName() {
        return \u062a\u0624.INSTANCE.getSelectedName();
    }

    private final void renderCardDelete(UiRect bounds, float reveal, float hover) {
        if (reveal <= 0.001f) {
            return;
        }
        float iconX = bounds.getX() + (bounds.getWidth() - Font.getWidth$default(\u0631\u064e.INSTANCE.getICON(), "i", 6.2f, 0.0f, 4, null)) * 0.5f;
        float iconY = bounds.getY() + (bounds.getHeight() - \u0631\u064e.INSTANCE.getICON().getHeight(6.2f)) * 0.5f - 0.2f;
        Color iconColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.icon(0.42f * reveal), \u062b\u0652.INSTANCE.title(0.82f * reveal), hover);
        Font.drawText$default(\u0631\u064e.INSTANCE.getICON().priority(this.iconsPipeline()), "i", iconX, iconY, 6.2f, iconColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
    }

    private final void renderTopInfo(float panelX, float panelY) {
        float infoX = panelX + 197.09999f;
        float infoY = panelY + 12.0f;
        float infoWidth = 228.90001f;
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).round(4.0f).color(\u062b\u0652.INSTANCE.surface(0.01f)).border(1.0f, \u062b\u0652.INSTANCE.surface(0.06f)).draw(infoX, infoY, infoWidth, 27.0f);
        float iconSize = 9.45f;
        float textSize = 8.0f;
        float iconX = infoX + 7.5f;
        float iconY = infoY + (27.0f - iconSize) * 0.5f;
        float iconWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getICON(), "N", iconSize, 0.0f, 4, null);
        float textX = iconX + iconWidth + 5.0f;
        float textY = infoY + (27.0f - textSize) * 0.46f;
        float sectionRight = infoX + infoWidth - 7.5f;
        Font.drawText$default(\u0631\u064e.INSTANCE.getICON().priority(this.iconsPipeline()), "N", iconX, iconY, iconSize, \u062b\u0652.INSTANCE.icon(0.86f), 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        Font.drawText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()), "InvManager", textX, textY, textSize, \u062b\u0652.INSTANCE.title(0.86f), 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        float descWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), "\u041c\u0435\u043d\u0435\u0434\u0436\u0435\u0440 \u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u0435\u0439", textSize, 0.0f, 4, null);
        Font.drawText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()).resetFade(), "\u041c\u0435\u043d\u0435\u0434\u0436\u0435\u0440 \u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u0435\u0439", sectionRight - descWidth, textY, textSize, \u062b\u0652.INSTANCE.value(0.4f), 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
    }

    @Override
    public void onMouseScroll(int mouseX, int mouseY, float vertical) {
        super.onMouseScroll(mouseX, mouseY, vertical);
        if (closing || this.getSavedCards().isEmpty()) {
            return;
        }
        float panelX = (float)\u0636\u0643.getMc().getWindow().getScaledWidth() * 0.5f - 219.0f;
        float panelY = (float)\u0636\u0643.getMc().getWindow().getScaledHeight() * 0.5f - 117.0f;
        UiRect bounds = \u0635\u064a.cardListBounds(panelX, panelY);
        if (!bounds.contains(mouseX, mouseY)) {
            return;
        }
        listScroll = RangesKt.coerceIn(listScroll - vertical * 38.0f, 0.0f, \u0635\u064a.maxListScroll(this.getSavedCards().size()));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        void var5_5;
        float x = (float)\u0636\u0643.getMc().getWindow().getScaledWidth() * 0.5f - 219.0f;
        float y = (float)\u0636\u0643.getMc().getWindow().getScaledHeight() * 0.5f - 117.0f;
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).round(9.36f).color(\u062b\u0652.panel$default(\u062b\u0652.INSTANCE, 0.0f, 1, null)).mix(0.95f).draw(x, y, 438.0f, 234.0f);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).round(9.36f).color(\u062b\u0652.surface$default(\u062b\u0652.INSTANCE, 0.0f, 1, null)).mix(0.95f).draw(x + 12.0f, y + 12.0f, 173.09999f, 210.0f);
        this.renderTopInfo(x, y);
        this.renderViewLabel(x, y);
        this.renderViewPreview(x, y);
        this.renderEmptyState(x, y);
        this.renderSearch(x, y);
        this.renderSavedCards(x, y, mouseX, mouseY);
        this.renderPanelBorder(x, (float)var5_5);
    }

    private \u0634\u062c() {
    }

    private final void renderViewSlot(float x, float y) {
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(\u062b\u0652.INSTANCE.value(0.45f)).round(1.0f).mix(0.95f).draw(x, y, 22.0f, 22.0f);
    }

    private final List<InventoryCard> getSavedCards() {
        return \u062a\u0624.INSTANCE.getCards();
    }

    private final void appendSearchText(String value) {
        boolean bl = ((CharSequence)value).length() == 0;
        if (bl || searchText.length() >= 20) {
            return;
        }
        searchText = StringsKt.take(searchText + value, 20);
    }

    @Override
    public void onKeyPress(int mouseX, int mouseY, int button) {
        String string;
        super.onKeyPress(mouseX, mouseY, button);
        if (closing || !searchFocused) {
            return;
        }
        switch (button) {
            case 257: 
            case 335: {
                this.addCardFromInput();
                return;
            }
            case 259: {
                if (((CharSequence)searchText).length() > 0) {
                    searchText = StringsKt.dropLast(searchText, 1);
                }
                return;
            }
            case 261: {
                searchText = "";
                return;
            }
            case 32: {
                this.appendSearchText(" ");
                return;
            }
        }
        String string2 = GLFW.glfwGetKeyName((int)button, (int)0);
        if (string2 == null) {
            return;
        }
        String keyName = string2;
        if (keyName.length() != 1) {
            return;
        }
        if (this.isShiftDown()) {
            String string3 = keyName.toUpperCase(Locale.ROOT);
            string = string3;
            Intrinsics.checkNotNullExpressionValue(string3, "toUpperCase(...)");
        } else {
            String string4 = keyName.toLowerCase(Locale.ROOT);
            string = string4;
            Intrinsics.checkNotNullExpressionValue(string4, "toLowerCase(...)");
        }
        this.appendSearchText(string);
    }

    @Override
    public void onMouseClick(int mouseX, int mouseY, int button) {
        block6: {
            block5: {
                super.onMouseClick(mouseX, mouseY, button);
                if (closing) break block5;
                if (button == 0) break block6;
            }
            return;
        }
        float panelX = (float)\u0636\u0643.getMc().getWindow().getScaledWidth() * 0.5f - 219.0f;
        float panelY = (float)\u0636\u0643.getMc().getWindow().getScaledHeight() * 0.5f - 117.0f;
        SearchLayout layout = \u0635\u064a.searchLayout(panelX, panelY);
        float pointX = mouseX;
        float pointY = mouseY;
        if (layout.isInsideAction(pointX, pointY)) {
            searchFocused = true;
            this.addCardFromInput();
            return;
        }
        if (this.handleCardActionClick(panelX, panelY, pointX, pointY)) {
            searchFocused = false;
            return;
        }
        searchFocused = layout.isInsideSearch(pointX, pointY);
    }

    private final InventorySnapshot captureInventory() {
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return null;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        return InventorySnapshot.Companion.capture((PlayerEntity)player);
    }

    @Override
    @NotNull
    public ClientRenderPipeline textPipeline() {
        return ClientRenderPipeline.GUI_TEXT;
    }

    private final void renderPanelBorder(float panelX, float panelY) {
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).round(9.36f).color(\u062b\u0652.INSTANCE.panel(0.0f)).border(1.0f, \u062b\u0652.INSTANCE.title(0.08f)).draw(panelX, panelY, 438.0f, 234.0f);
    }

    private static final void renderSavedInventoryItems$renderStack(DrawContext $graphics, int $mouseX, int $mouseY, Ref.ObjectRef<ItemStack> hoveredStack, Ref.BooleanRef renderedAny, ItemStack stack, float slotX, float slotY) {
        if (stack.isEmpty()) {
            return;
        }
        float itemInset = 3.0f;
        int itemX = MathKt.roundToInt(slotX + itemInset);
        int itemY = MathKt.roundToInt(slotY + itemInset);
        $graphics.drawItem(stack, itemX, itemY);
        if (stack.getCount() != 1) {
            String countText = String.valueOf(stack.getCount());
            $graphics.drawText(\u0636\u0643.getMc().textRenderer, countText, itemX + 17 - \u0636\u0643.getMc().textRenderer.getWidth(countText), itemY + 9, -1, true);
        }
        float f = slotX + 22.0f;
        float f2 = $mouseX;
        boolean bl = slotX <= f2 ? f2 <= f : false;
        if (bl) {
            f = slotY + 22.0f;
            f2 = $mouseY;
            boolean bl2 = slotY <= f2 ? f2 <= f : false;
            if (bl2) {
                hoveredStack.element = stack;
            }
        }
        var4_4.element = true;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean renderSavedInventoryItems(@NotNull DrawContext graphics, int mouseX, int mouseY) {
        void var14_20;
        block10: {
            void var1_1;
            void var3_3;
            void var2_2;
            void var18_25;
            int index;
            ItemStack stack;
            int n;
            Object object;
            Object v1;
            block9: {
                Intrinsics.checkNotNullParameter(graphics, "graphics");
                String string = this.getSelectedCardName();
                if (string == null) {
                    return false;
                }
                String selectedName = string;
                Iterable $this$firstOrNull$iv = this.getSavedCards();
                boolean $i$f$firstOrNull = false;
                for (Object element$iv : $this$firstOrNull$iv) {
                    InventoryCard it = (InventoryCard)element$iv;
                    boolean bl = false;
                    if (!Intrinsics.areEqual(it.getName(), selectedName)) continue;
                    v1 = element$iv;
                    break block9;
                }
                v1 = null;
            }
            if ((object = (InventoryCard)v1) == null || (object = ((InventoryCard)object).getSnapshot()) == null) {
                return false;
            }
            Object snapshot = object;
            float panelX = (float)\u0636\u0643.getMc().getWindow().getScaledWidth() * 0.5f - 219.0f;
            float panelY = (float)\u0636\u0643.getMc().getWindow().getScaledHeight() * 0.5f - 117.0f;
            float previewX = panelX + 197.09999f;
            float labelY = panelY + 12.0f + 27.0f + 16.0f;
            float previewY = labelY + 8.0f + 8.0f;
            float slotStep = 25.0f;
            float inventoryStartY = previewY + 22.0f + 8.0f;
            float hotbarY = inventoryStartY + (float)2 * slotStep + 22.0f + 8.0f;
            Ref.BooleanRef renderedAny = new Ref.BooleanRef();
            Ref.ObjectRef<ItemStack> hoveredStack = new Ref.ObjectRef<ItemStack>();
            Iterable $this$forEachIndexed$iv = ((InventorySnapshot)snapshot).getArmor();
            boolean $i$f$forEachIndexed = false;
            int index$iv = 0;
            for (Object item$iv : $this$forEachIndexed$iv) {
                if ((n = index$iv++) < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                stack = (ItemStack)item$iv;
                index = n;
                boolean bl = false;
                \u0634\u062c.renderSavedInventoryItems$renderStack(graphics, mouseX, mouseY, hoveredStack, renderedAny, stack, previewX + (float)index * slotStep, previewY);
            }
            \u0634\u062c.renderSavedInventoryItems$renderStack(graphics, mouseX, mouseY, hoveredStack, renderedAny, ((InventorySnapshot)snapshot).getOffhand(), previewX + (float)8 * slotStep, previewY);
            $this$forEachIndexed$iv = ((InventorySnapshot)snapshot).getInventory();
            $i$f$forEachIndexed = false;
            index$iv = 0;
            for (Object item$iv : $this$forEachIndexed$iv) {
                if ((n = index$iv++) < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                stack = (ItemStack)item$iv;
                index = n;
                boolean bl = false;
                \u0634\u062c.renderSavedInventoryItems$renderStack(graphics, mouseX, mouseY, hoveredStack, renderedAny, stack, previewX + (float)(index % 9) * slotStep, inventoryStartY + (float)(index / 9) * slotStep);
            }
            $this$forEachIndexed$iv = ((InventorySnapshot)snapshot).getHotbar();
            $i$f$forEachIndexed = false;
            index$iv = 0;
            for (Object item$iv : $this$forEachIndexed$iv) {
                void var23_31;
                void var22_30;
                if ((n = index$iv++) < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                stack = (ItemStack)item$iv;
                index = n;
                boolean bl = false;
                \u0634\u062c.renderSavedInventoryItems$renderStack(graphics, mouseX, mouseY, hoveredStack, renderedAny, (ItemStack)var22_30, previewX + (float)var23_31 * slotStep, hotbarY);
            }
            ItemStack itemStack = (ItemStack)hoveredStack.element;
            if (itemStack == null) break block10;
            ItemStack stack2 = itemStack;
            boolean bl = false;
            graphics.drawItemTooltip(\u0636\u0643.getMc().textRenderer, (ItemStack)var18_25, (int)var2_2, (int)var3_3);
            var1_1.drawDeferredElements();
        }
        return var14_20.element;
    }

    private final void addCardFromInput() {
        String name = ((Object)StringsKt.trim((CharSequence)searchText)).toString();
        boolean bl = ((CharSequence)name).length() == 0;
        if (bl) {
            return;
        }
        InventorySnapshot inventorySnapshot = this.captureInventory();
        if (inventorySnapshot == null) {
            return;
        }
        InventorySnapshot snapshot = inventorySnapshot;
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null || (clientWorld = clientWorld.getRegistryManager()) == null) {
            return;
        }
        ClientWorld registries = clientWorld;
        if (!\u062a\u0624.INSTANCE.add(name, snapshot, (RegistryWrapper.WrapperLookup)registries)) {
            return;
        }
        searchText = "";
        listScroll = \u0635\u064a.maxListScroll(this.getSavedCards().size());
    }

    @Override
    public boolean shouldRemove() {
        return closing;
    }

    private final void reloadSavedCards() {
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null || (clientWorld = clientWorld.getRegistryManager()) == null) {
            return;
        }
        ClientWorld registries = clientWorld;
        \u062a\u0624.INSTANCE.reload((RegistryWrapper.WrapperLookup)registries);
    }

    /*
     * Unable to fully structure code
     */
    private final void renderSavedCards(float panelX, float panelY, int mouseX, int mouseY) {
        if (this.getSavedCards().isEmpty()) {
            return;
        }
        bounds = \u0635\u064a.cardListBounds(panelX, panelY);
        \u0634\u062c.listScroll = RangesKt.coerceIn(\u0634\u062c.listScroll, 0.0f, \u0635\u064a.maxListScroll(this.getSavedCards().size()));
        \u062c\u0650.INSTANCE.start(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight());
        $this$forEachIndexed$iv = this.getSavedCards();
        $i$f$forEachIndexed = false;
        index$iv = 0;
        for (T item$iv : $this$forEachIndexed$iv) {
            if ((var11_11 = index$iv++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            card = (InventoryCard)item$iv;
            index = var11_11;
            $i$a$-forEachIndexed-InventoryManagerScreen$renderSavedCards$1 = false;
            cardY = bounds.getY() + (float)index * 38.0f - \u0634\u062c.listScroll;
            if (cardY + 33.0f < bounds.getY() || cardY > bounds.getY() + bounds.getHeight()) continue;
            selected = Intrinsics.areEqual(\u0634\u062c.INSTANCE.getSelectedCardName(), card.getName());
            var17_18 = \u0628\u0641.INSTANCE;
            selection = RangesKt.coerceIn(card.getSelectionAnimation().animate(selected ? 1.0f : 0.0f, 220.0f, new \u0636\u0638(var17_18)), 0.0f, 1.0f);
            if (!bounds.contains(mouseX, mouseY)) ** GOTO lbl-1000
            if (new UiRect(bounds.getX(), cardY, bounds.getWidth(), 33.0f).contains(mouseX, mouseY)) {
                v0 = true;
            } else lbl-1000:
            // 2 sources

            {
                v0 = false;
            }
            cardHovered = v0;
            deleteBounds = \u0635\u064a.cardDeleteBounds(bounds, cardY);
            if (!cardHovered) ** GOTO lbl-1000
            if (deleteBounds.contains(mouseX, mouseY)) {
                v1 = true;
            } else lbl-1000:
            // 2 sources

            {
                v1 = false;
            }
            deleteHovered = v1;
            var21_23 = \u0628\u0641.INSTANCE;
            deleteReveal = RangesKt.coerceIn(card.getDeleteRevealAnimation().animate(cardHovered ? 1.0f : 0.0f, 180.0f, new \u0633\u0652(var21_23)), 0.0f, 1.0f);
            var23_25 = \u0628\u0641.INSTANCE;
            deleteHover = RangesKt.coerceIn(card.getDeleteHoverAnimation().animate(deleteHovered ? 1.0f : 0.0f, 180.0f, new \u0636\u0652(var23_25)), 0.0f, 1.0f);
            backgroundColor = \u062b\u0652.INSTANCE.surface(0.05f + 0.09f * selection);
            borderColor = \u062b\u0652.INSTANCE.title(0.08f + 0.12f * selection);
            \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(\u0634\u062c.INSTANCE.rectPipeline()).color(backgroundColor).round(4.0f).mix(0.95f).border(1.0f, borderColor).draw(bounds.getX(), cardY, bounds.getWidth(), 33.0f);
            nameSize = 8.0f;
            nameY = cardY + (33.0f - nameSize) * 0.5f - 1.0f;
            Font.drawText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(\u0634\u062c.INSTANCE.textPipeline()), card.getName(), bounds.getX() + 7.5f, nameY, nameSize, \u062b\u0652.title$default(\u062b\u0652.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
            indicatorColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.value$default(\u062b\u0652.INSTANCE, 0.0f, 1, null), \u062b\u0652.title$default(\u062b\u0652.INSTANCE, 0.0f, 1, null), selection);
            \u0630\u0631.INSTANCE.getBASIC_RECT().priority(\u0634\u062c.INSTANCE.rectPipeline()).color(indicatorColor).round(0.3f).draw(bounds.getX() + bounds.getWidth() - 7.5f, (float)(var15_15 + 5.0f), 2.5f, 2.5f);
            \u0634\u062c.INSTANCE.renderCardAction((float)var15_15, (UiRect)var5_5, (float)var18_19);
            \u0634\u062c.INSTANCE.renderCardDelete((UiRect)var19_20, (float)var22_24, (float)var21_22);
        }
        \u062c\u0650.INSTANCE.end();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isShiftDown() {
        long window = \u0636\u0643.getMc().getWindow().getHandle();
        if (GLFW.glfwGetKey((long)window, (int)340) == 1) return true;
        if (GLFW.glfwGetKey((long)window, (int)344) != 1) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private final void renderSearch(float panelX, float panelY) {
        void var9_10;
        void var10_12;
        void var3_3;
        CharSequence charSequence;
        SearchLayout layout = \u0635\u064a.searchLayout(panelX, panelY);
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).round(4.0f).color(\u062b\u0652.INSTANCE.surface(0.01f)).border(1.0f, \u062b\u0652.INSTANCE.surface(0.07f)).draw(layout.getSearchX(), layout.getY(), layout.getSearchWidth(), 27.0f);
        float textSize = 8.0f;
        float textX = layout.getSearchX() + 6.5f;
        float textY = layout.getY() + (27.0f - textSize) * 0.46f;
        CharSequence charSequence2 = searchText;
        if (StringsKt.isBlank(charSequence2)) {
            boolean bl = false;
            charSequence = searchFocused ? " " : "\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043d\u0430\u0437\u0432\u0430\u043d\u0438\u0435..";
        } else {
            charSequence = charSequence2;
        }
        String displayedText = (String)charSequence;
        Color textColor = StringsKt.isBlank(searchText) ? \u062b\u0652.INSTANCE.value(0.45f) : \u062b\u0652.INSTANCE.title(0.76f);
        Font.drawText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()), displayedText, textX, textY, textSize, textColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        Font.drawText$default(\u0631\u064e.INSTANCE.getICON().priority(this.iconsPipeline()), "g", layout.getSearchX() + layout.getSearchWidth() - 13.5f, textY + 1.0f, textSize, \u062b\u0652.INSTANCE.icon(0.45f), 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        if (searchFocused) {
            if (System.currentTimeMillis() / 450L % 2L == 0L) {
                float textWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), searchText, textSize, 0.0f, 4, null);
                float maxCaretX = layout.getSearchX() + layout.getSearchWidth() - 20.0f;
                Font.drawText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()), "|", RangesKt.coerceAtMost(textX + textWidth + 1.0f, maxCaretX), textY, textSize, \u062b\u0652.INSTANCE.title(0.86f), 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
            }
        }
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).round(4.0f).color(\u062b\u0652.INSTANCE.surface(0.01f)).border(1.0f, \u062b\u0652.INSTANCE.surface(0.07f)).draw(layout.getActionX(), layout.getY(), 27.0f, 27.0f);
        float actionIconSize = 12.15f;
        float actionIconY = layout.getY() + (27.0f - actionIconSize) * 0.5f - 2.1f;
        Font.drawCenteredText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()), "+", var3_3.getActionX() + 13.5f + -0.7f, (float)var10_12, (float)var9_10, \u062b\u0652.INSTANCE.title(0.8f), 0.0f, 32, null);
    }

    static {
        INSTANCE = new \u0634\u062c();
        searchText = "";
    }

    private final void renderViewPreview(float panelX, float panelY) {
        int n;
        if (this.getSelectedCardName() == null) {
            return;
        }
        float previewX = panelX + 197.09999f;
        float labelY = panelY + 12.0f + 27.0f + 16.0f;
        float previewY = labelY + 8.0f + 8.0f;
        float slotStep = 25.0f;
        int n2 = 4;
        int n3 = 0;
        while (n3 < n2) {
            int index = n3++;
            boolean bl = false;
            INSTANCE.renderViewSlot(previewX + (float)index * slotStep, previewY);
        }
        this.renderViewSlot(previewX + (float)8 * slotStep, previewY);
        float inventoryStartY = previewY + 22.0f + 8.0f;
        n3 = 3;
        for (n = 0; n < n3; ++n) {
            int row = n;
            boolean bl = false;
            float rowY = inventoryStartY + (float)row * slotStep;
            int n4 = 9;
            int n5 = 0;
            while (n5 < n4) {
                int column = n5++;
                boolean bl2 = false;
                INSTANCE.renderViewSlot(previewX + (float)column * slotStep, rowY);
            }
        }
        float hotbarY = inventoryStartY + (float)2 * slotStep + 22.0f + 8.0f;
        n = 9;
        int n6 = 0;
        while (n6 < n) {
            int column = n6++;
            boolean bl = false;
            INSTANCE.renderViewSlot(previewX + (float)column * slotStep, hotbarY);
        }
    }

    public final void clearLoadedSelection() {
        \u062a\u0624.INSTANCE.clearSelection();
    }

    @Override
    @NotNull
    public ClientRenderPipeline iconsPipeline() {
        return ClientRenderPipeline.GUI_SPECIAL;
    }

    @Override
    public void close() {
        closing = true;
        searchFocused = false;
    }

    @Override
    public void init() {
        closing = false;
        searchText = "";
        searchFocused = false;
        this.reloadSavedCards();
        listScroll = RangesKt.coerceIn(listScroll, 0.0f, \u0635\u064a.maxListScroll(this.getSavedCards().size()));
    }

    private final void renderEmptyState(float panelX, float panelY) {
        if (this.getSelectedCardName() != null) {
            return;
        }
        float areaX = panelX + 197.09999f;
        float areaY = panelY + 12.0f + 27.0f + 8.0f;
        float areaWidth = 228.90001f;
        float areaHeight = 175.0f;
        float textSize = 11.0f;
        Font.drawCenteredText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()), "\u0417\u0434\u0435\u0441\u044c \u043f\u043e\u043a\u0430 \u0447\u0442\u043e \u043f\u0443\u0441\u0442\u043e >_<", areaX + areaWidth * 0.5f, areaY + (areaHeight - textSize) * 0.46f, textSize, \u062b\u0652.INSTANCE.value(0.5f), 0.0f, 32, null);
    }

    private final void renderViewLabel(float panelX, float panelY) {
        String string = this.getSelectedCardName();
        if (string == null) {
            return;
        }
        String selectedName = string;
        float labelX = panelX + 197.09999f;
        float labelY = panelY + 12.0f + 27.0f + 16.0f;
        Font labelFont = \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.textPipeline());
        Font.drawText$default(labelFont, "\u041f\u0440\u043e\u0441\u043c\u043e\u0442\u0440:", labelX, labelY, 8.0f, \u062b\u0652.title$default(\u062b\u0652.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        Font.drawText$default(labelFont, selectedName, labelX + Font.getWidth$default(labelFont, "\u041f\u0440\u043e\u0441\u043c\u043e\u0442\u0440:", 8.0f, 0.0f, 4, null) + 4.0f, labelY, 8.0f, \u062b\u0652.INSTANCE.value(0.75f), 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
    }

    private final void renderCardAction(float cardY, UiRect listBounds, float selection) {
        UiRect actionBounds = \u0635\u064a.cardActionBounds(listBounds, cardY);
        Color neutralBackground = \u062b\u0652.INSTANCE.surface(0.04f);
        Color unloadBackground = new Color(125, 28, 38, 220);
        Color neutralBorder = \u062b\u0652.INSTANCE.title(0.08f);
        Color unloadBorder = new Color(180, 48, 58, 235);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(\u0628\u062d.INSTANCE.interpolateColor(neutralBackground, unloadBackground, selection)).round(3.0f).mix(0.95f).border(1.0f, \u0628\u062d.INSTANCE.interpolateColor(neutralBorder, unloadBorder, selection)).draw(actionBounds.getX(), actionBounds.getY(), actionBounds.getWidth(), actionBounds.getHeight());
        float textY = actionBounds.getY() + (actionBounds.getHeight() - 6.2f) * 0.46f - 0.3f;
        float textX = actionBounds.getX() + actionBounds.getWidth() * 0.5f;
        if (selection < 0.999f) {
            Font.drawCenteredText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()), "\u0417\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u044c", textX, textY, 6.2f, \u0628\u062d.INSTANCE.setAlpha(\u062b\u0652.title$default(\u062b\u0652.INSTANCE, 0.0f, 1, null), 0.78f * (1.0f - selection)), 0.0f, 32, null);
        }
        if (selection > 0.001f) {
            Font font = \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.textPipeline());
            Color color = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue(color, "WHITE");
            Font.drawCenteredText$default(font, "\u0412\u044b\u0433\u0440\u0443\u0437\u0438\u0442\u044c", textX, textY, 6.2f, \u0628\u062d.INSTANCE.setAlpha(color, selection), 0.0f, 32, null);
        }
    }

    /*
     * WARNING - void declaration
     */
    private final boolean handleCardActionClick(float panelX, float panelY, float mouseX, float mouseY) {
        UiRect listBounds = \u0635\u064a.cardListBounds(panelX, panelY);
        if (!listBounds.contains(mouseX, mouseY)) {
            return false;
        }
        int index = 0;
        int n = ((Collection)this.getSavedCards()).size();
        while (index < n) {
            void var6_6;
            InventoryCard card = this.getSavedCards().get(index);
            float cardY = listBounds.getY() + (float)index * 38.0f - listScroll;
            if (!(cardY + 33.0f < listBounds.getY()) && !(cardY > listBounds.getY() + listBounds.getHeight())) {
                if (\u0635\u064a.cardDeleteBounds(listBounds, cardY).contains(mouseX, mouseY)) {
                    if (!\u062a\u0624.INSTANCE.delete(index)) {
                        return true;
                    }
                    listScroll = RangesKt.coerceIn(listScroll, 0.0f, \u0635\u064a.maxListScroll(this.getSavedCards().size()));
                    return true;
                }
                if (\u0635\u064a.cardActionBounds(listBounds, cardY).contains(mouseX, mouseY)) {
                    \u062a\u0624.INSTANCE.toggle(card);
                    return true;
                }
            }
            ++var6_6;
        }
        return false;
    }

    @Override
    @NotNull
    public ClientRenderPipeline rectPipeline() {
        return ClientRenderPipeline.GUI_RECT;
    }
}

