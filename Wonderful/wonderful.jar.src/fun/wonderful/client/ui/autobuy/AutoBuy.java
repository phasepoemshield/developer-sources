package fun.wonderful.client.ui.autobuy;

import fun.wonderful.api.QClient;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.api.utils.math.HoveringUtils;
import fun.wonderful.api.utils.render.RenderUtils;
import fun.wonderful.api.utils.render.fonts.msdf.Font;
import fun.wonderful.api.utils.render.fonts.msdf.Fonts;
import fun.wonderful.api.utils.scissor.ScissorUtils;
import fun.wonderful.client.modules.impl.misc.AutoBuy;
import java.util.List;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;

public class AutoBuy
extends Screen
implements QClient {
    private static final float WIDTH = 284.5f;
    private static final float HEIGHT = 290.0f;
    private static final float CARD = 21.0f;
    private static final float CARD_SPACING = 6.0f;
    private static final float SCROLLBAR_WIDTH = 2.0f;
    private static final int COLUMNS = 10;
    private boolean pickingItems;
    private AutoBuy.AuctionItem selectedAuctionItem;
    private AutoBuy.TargetItem selectedTargetItem;
    private int selectedCount = 1;
    private String countInput = "1";
    private boolean editingCount;
    private String searchInput = "";
    private boolean editingSearch;
    private float scroll;
    private float smoothedScroll;
    private long buttonClickTime;

    public AutoBuy() {
        super(Text.of((String)"AutoBuy"));
    }

    public AutoBuy(boolean openItems) {
        this();
        this.pickingItems = openItems;
    }

    public void renderBackground(DrawContext context, int mouseX, int mouseY, float delta) {
    }

    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        MatrixStack matrix = context.getMatrices();
        float x2 = this.x();
        float y2 = this.y();
        RenderUtils.drawRoundedRect(matrix, 0.0f, 0.0f, mc.getWindow().getScaledWidth(), mc.getWindow().getScaledHeight(), 0.0f, ColorUtils.rgba(0, 0, 0, 100));
        RenderUtils.drawRoundedRect(matrix, x2, y2, 284.5f, 290.0f, 6.0f, this.bg());
        this.renderItemsList(context, matrix, mouseX, mouseY);
        this.renderBottom(context, matrix, mouseX, mouseY);
        this.renderCategory(context, matrix);
        this.renderScrollbar(matrix);
        this.renderSettingsPanel(context, matrix);
        super.render(context, mouseX, mouseY, delta);
    }

    private void renderCategory(DrawContext context, MatrixStack matrix) {
        float x2 = this.x();
        float y2 = this.y();
        float categoryWidth = 274.5f;
        float categoryX = x2 + 5.0f;
        float categoryY = y2 + 4.0f;
        int theme = ColorUtils.getThemeColor();
        int theme2 = ColorUtils.darken(theme, 0.55f);
        matrix.push();
        matrix.translate(0.0f, 0.0f, 200.0f);
        RenderUtils.drawGradientRect(matrix, categoryX, categoryY, categoryWidth, 22.0f, 4.0f, theme, theme2, true);
        RenderUtils.drawRoundedRect(matrix, categoryX - 4.0f, categoryY - 4.0f, categoryWidth + 8.0f, 30.0f, 8.0f, ColorUtils.rgba(255, 255, 255, 5));
        RenderUtils.drawGradientRect(matrix, categoryX - 3.0f, categoryY - 3.0f, categoryWidth + 6.0f, 28.0f, 7.0f, ColorUtils.setAlphaColor(theme, 120), ColorUtils.setAlphaColor(theme2, 120), true);
        RenderUtils.drawGradientRect(matrix, categoryX - 2.0f, categoryY - 2.0f, categoryWidth + 4.0f, 26.0f, 6.0f, ColorUtils.setAlphaColor(theme, 135), ColorUtils.setAlphaColor(theme2, 135), true);
        this.drawText(context, this.pickingItems ? "AutoBuy [Auction]" : "AutoBuy [Targets]", x2 + 10.0f, y2 + 12.5f, this.text(), 18);
        this.drawTextRight(context, this.module().getStatus(), x2 + 284.5f - 12.0f, y2 + 13.0f, ColorUtils.rgba(230, 230, 235, 210), 13);
        matrix.pop();
    }

    private void renderItemsList(DrawContext context, MatrixStack matrix, int mouseX, int mouseY) {
        float x2 = this.x();
        float y2 = this.y();
        this.renderSearchBox(context, matrix, mouseX, mouseY);
        float listY = this.listY();
        float listHeight = this.listHeight();
        int count = this.itemCount();
        float maxScroll = Math.max(0.0f, this.contentHeight(count) - 6.0f - listHeight);
        this.scroll = MathHelper.clamp((float)this.scroll, (float)(-maxScroll), (float)0.0f);
        this.smoothedScroll = ColorUtils.interpolate(this.smoothedScroll, this.scroll, (double)0.15f).floatValue();
        ScissorUtils.push();
        ScissorUtils.setFromComponentCoordinates(x2, listY - 4.0f, 284.5, listHeight + 3.0f);
        for (int i2 = 0; i2 < count; ++i2) {
            Object item;
            int col = i2 % 10;
            int row = i2 / 10;
            float cardX = x2 + 8.0f + (float)col * 27.0f;
            float cardY = listY + this.smoothedScroll + (float)row * 27.0f;
            if (cardY + 21.0f < listY || cardY > listY + listHeight) continue;
            if (this.pickingItems) {
                item = this.filteredAuctionItems().get(i2);
                this.renderItemCard(context, matrix, ((AutoBuy.AuctionItem)item).icon(), cardX, cardY, mouseX, mouseY, this.selectedAuctionItem == item, ((AutoBuy.AuctionItem)item).price() > 0L);
                continue;
            }
            item = this.module().getTargets().get(i2);
            this.renderItemCard(context, matrix, ((AutoBuy.TargetItem)item).icon(), cardX, cardY, mouseX, mouseY, this.selectedTargetItem == item, true);
            this.drawBadge(context, "x" + ((AutoBuy.TargetItem)item).count(), cardX + 21.0f - 2.0f, cardY + 21.0f - 7.0f);
        }
        ScissorUtils.pop();
        if (count == 0) {
            this.drawCenteredText(context, this.pickingItems ? (this.searchInput.isBlank() ? "Scan /ah first" : "Nothing found") : "No targets selected", x2 + 142.25f, y2 + 126.0f, ColorUtils.rgba(137, 137, 140, 255), 15);
        }
    }

    private void renderSearchBox(DrawContext context, MatrixStack matrix, int mouseX, int mouseY) {
        if (!this.pickingItems) {
            return;
        }
        float x2 = this.x() + 8.0f;
        float y2 = this.y() + 32.0f;
        float width = 268.5f;
        int outline = this.editingSearch ? ColorUtils.getThemeColor() : ColorUtils.rgba(47, 47, 50, 255);
        RenderUtils.drawRoundedRectOutline(matrix, x2, y2, width, 18.0f, 5.0f, 5.0f, 5.0f, 5.0f, 1.2f, outline);
        RenderUtils.drawRoundedRect(matrix, x2, y2, width, 18.0f, 5.0f, this.offBg());
        this.drawText(context, this.searchInput.isEmpty() ? "Search" : this.searchInput, x2 + 6.0f, y2 + 6.0f, this.searchInput.isEmpty() ? ColorUtils.rgba(137, 137, 140, 255) : this.text(), 14);
    }

    private void renderItemCard(DrawContext context, MatrixStack matrix, ItemStack stack, float x2, float y2, int mouseX, int mouseY, boolean selected, boolean accented) {
        int base;
        boolean hovered = this.hit(mouseX, mouseY, x2, y2, 21.0f, 21.0f);
        int n2 = base = hovered || selected ? ColorUtils.rgba(38, 38, 42, 255) : this.settingsBg();
        if (accented || selected) {
            int theme = ColorUtils.getThemeColor();
            RenderUtils.drawRoundedRectOutline(matrix, x2 - 2.01f, y2 - 2.01f, 25.02f, 25.02f, 6.0f, 6.0f, 6.0f, 6.0f, 2.0f, ColorUtils.rgba(87, 87, 90, selected ? 255 : 120));
            if (selected) {
                RenderUtils.drawGradientRect(matrix, x2, y2, 21.0f, 21.0f, 4.0f, theme, ColorUtils.darken(theme, 0.55f), true);
            } else {
                RenderUtils.drawRoundedRect(matrix, x2, y2, 21.0f, 21.0f, 4.0f, base);
            }
        } else {
            RenderUtils.drawRoundedRect(matrix, x2, y2, 21.0f, 21.0f, 4.0f, base);
        }
        context.drawItem(stack, (int)(x2 + 2.5f), (int)(y2 + 2.5f));
    }

    private void renderBottom(DrawContext context, MatrixStack matrix, int mouseX, int mouseY) {
        float x2 = this.x();
        float y2 = this.y();
        float inputHeight = 20.0f;
        float buttonWidth = 70.0f;
        float inputY = y2 + 290.0f - 8.0f - inputHeight;
        float inputX = x2 + 8.0f;
        float inputWidth = 276.5f - buttonWidth - 8.0f - 8.0f;
        float buttonX = inputX + inputWidth + 8.0f;
        this.renderSelectedLine(context, matrix, inputX, inputY);
        RenderUtils.drawRoundedRectOutline(matrix, inputX, inputY, inputWidth, inputHeight, 6.0f, 6.0f, 6.0f, 6.0f, 2.0f, ColorUtils.rgba(47, 47, 50, 255));
        RenderUtils.drawRoundedRect(matrix, inputX, inputY, inputWidth, inputHeight, 6.0f, this.offBg());
        String displayText = this.bottomText();
        ScissorUtils.push();
        ScissorUtils.setFromComponentCoordinates(inputX - 1.0f, inputY, inputWidth, inputHeight);
        this.drawText(context, displayText, inputX + 5.0f, inputY + inputHeight / 2.0f - 1.5f, ColorUtils.rgba(137, 137, 140, 255), 15);
        ScissorUtils.pop();
        this.renderActionButton(context, matrix, mouseX, mouseY, buttonX, inputY, buttonWidth, inputHeight);
    }

    private void renderSelectedLine(DrawContext context, MatrixStack matrix, float inputX, float inputY) {
        ItemStack stack = this.selectedStack();
        if (stack == null || stack.isEmpty()) {
            return;
        }
        float nameY = inputY - 20.0f;
        matrix.push();
        matrix.scale(0.7f, 0.7f, 1.0f);
        context.drawItem(stack, (int)(inputX / 0.7f), (int)((nameY + 4.5f) / 0.7f));
        matrix.pop();
        this.drawText(context, this.selectedName(), inputX + 13.5f, nameY + 9.0f, this.text(), 14);
    }

    private void renderActionButton(DrawContext context, MatrixStack matrix, int mouseX, int mouseY, float x2, float y2, float width, float height) {
        boolean hovered = this.hit(mouseX, mouseY, x2, y2, width, height);
        boolean clicked = System.currentTimeMillis() - this.buttonClickTime < 200L;
        int theme = clicked ? ColorUtils.rgba(255, 255, 255, 5) : ColorUtils.getThemeColor();
        int theme2 = clicked ? ColorUtils.rgba(255, 255, 255, 5) : ColorUtils.darken(theme, 0.55f);
        float scale = hovered ? 1.03f : 1.0f;
        float sx = x2 + (width - width * scale) / 2.0f;
        float sy = y2 + (height - height * scale) / 2.0f;
        RenderUtils.drawGradientRect(matrix, sx, sy, width * scale, height * scale, 4.0f, theme, theme2, true);
        this.drawCenteredText(context, this.buttonText(), x2 + width / 2.0f, y2 + height / 2.0f - 1.5f, this.text(), 15);
    }

    private void renderSettingsPanel(DrawContext context, MatrixStack matrix) {
        ItemStack stack = this.selectedStack();
        if (stack == null || stack.isEmpty()) {
            return;
        }
        float mainX = this.x();
        float mainY = this.y();
        float panelWidth = 129.31818f;
        float panelHeight = 88.0f;
        float panelX = mainX + 284.5f + 10.0f;
        float panelY = mainY;
        int theme = ColorUtils.getThemeColor();
        int theme2 = ColorUtils.darken(theme, 0.55f);
        RenderUtils.drawRoundedRect(matrix, panelX, panelY, panelWidth, panelHeight, 6.0f, this.bg());
        RenderUtils.drawGradientRect(matrix, panelX + 5.0f, panelY + 4.0f, panelWidth - 10.0f, 22.0f, 4.0f, theme, theme2, true);
        RenderUtils.drawRoundedRect(matrix, panelX + 1.0f, panelY, panelWidth - 2.0f, 30.0f, 8.0f, ColorUtils.rgba(255, 255, 255, 5));
        this.drawText(context, "Settings", panelX + 10.0f, panelY + 12.0f, this.text(), 18);
        RenderUtils.drawRoundedRect(matrix, panelX + 10.0f, panelY + 38.0f, 18.0f, 18.0f, 4.0f, this.settingsBg());
        context.drawItem(stack, (int)(panelX + 11.0f), (int)(panelY + 39.0f));
        this.drawText(context, "Count", panelX + 34.0f, panelY + 42.5f, this.text(), 15);
        if (this.pickingItems) {
            float inputX = panelX + 10.0f;
            float inputY = panelY + 62.0f;
            float okX = panelX + 86.0f;
            int outline = this.editingCount ? ColorUtils.getThemeColor() : ColorUtils.rgba(47, 47, 50, 255);
            RenderUtils.drawRoundedRectOutline(matrix, inputX, inputY, 70.0f, 18.0f, 3.0f, 3.0f, 3.0f, 3.0f, 1.2f, outline);
            RenderUtils.drawRoundedRect(matrix, inputX, inputY, 70.0f, 18.0f, 3.0f, this.offBg());
            RenderUtils.drawGradientRect(matrix, okX, inputY, 32.0f, 18.0f, 3.0f, ColorUtils.getThemeColor(), ColorUtils.darken(ColorUtils.getThemeColor(), 0.55f), true);
            this.drawText(context, this.countInput.isEmpty() ? "" : this.countInput, inputX + 6.0f, inputY + 5.5f, ColorUtils.rgba(230, 230, 235, 255), 15);
            this.drawCenteredText(context, "OK", okX + 16.0f, inputY + 5.5f, this.text(), 13);
        } else {
            this.drawTextRight(context, String.valueOf(this.selectedCount), panelX + panelWidth - 10.0f, panelY + 42.5f, ColorUtils.rgba(230, 230, 235, 255), 15);
        }
    }

    private void renderScrollbar(MatrixStack matrix) {
        int count = this.itemCount();
        if (count == 0) {
            return;
        }
        float x2 = this.x();
        float y2 = this.y();
        float listY = this.listY();
        float listHeight = this.listHeight();
        float contentHeight = this.contentHeight(count);
        float scrollbarX = x2 + 284.5f - 8.0f - 2.0f + 2.5f;
        RenderUtils.drawRoundedRect(matrix, scrollbarX, listY, 2.0f, listHeight, 1.0f, ColorUtils.rgba(27, 27, 30, 255));
        if (contentHeight > listHeight) {
            float maxScroll = contentHeight - listHeight;
            float progress = Math.abs(this.smoothedScroll) / maxScroll;
            float thumbHeight = Math.max(15.0f, listHeight / contentHeight * listHeight);
            float thumbY = listY + progress * (listHeight - thumbHeight);
            RenderUtils.drawRoundedRect(matrix, scrollbarX, thumbY, 2.0f, thumbHeight, 1.0f, ColorUtils.getThemeColor());
        }
    }

    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (button != 0) {
            return super.mouseClicked(mouseX, mouseY, button);
        }
        float x2 = this.x();
        float y2 = this.y();
        float inputY = y2 + 290.0f - 28.0f;
        float inputX = x2 + 8.0f;
        float buttonX = inputX + 190.5f + 8.0f;
        if (this.pickingItems && this.hit(mouseX, mouseY, x2 + 8.0f, y2 + 32.0f, 268.5f, 18.0f)) {
            this.editingSearch = true;
            this.editingCount = false;
            return true;
        }
        if (this.pickingItems && this.selectedAuctionItem != null && this.hit(mouseX, mouseY, x2 + 284.5f + 20.0f, y2 + 62.0f, 70.0f, 18.0f)) {
            this.editingCount = true;
            this.editingSearch = false;
            return true;
        }
        if (this.pickingItems && this.selectedAuctionItem != null && this.hit(mouseX, mouseY, x2 + 284.5f + 96.0f, y2 + 62.0f, 32.0f, 18.0f)) {
            this.applyCountInput();
            this.editingCount = false;
            return true;
        }
        this.editingCount = false;
        this.editingSearch = false;
        if (this.hit(mouseX, mouseY, buttonX, inputY, 70.0f, 20.0f)) {
            this.buttonClickTime = System.currentTimeMillis();
            this.clickAction();
            return true;
        }
        int index = this.hoveredIndex(mouseX, mouseY);
        if (index >= 0) {
            if (this.pickingItems) {
                List<AutoBuy.AuctionItem> items = this.filteredAuctionItems();
                if (index < items.size()) {
                    this.selectedAuctionItem = items.get(index);
                    this.selectedTargetItem = null;
                    this.selectedCount = Math.max(1, this.selectedAuctionItem.icon().getCount());
                    this.countInput = String.valueOf(this.selectedCount);
                    this.editingCount = true;
                }
            } else {
                List<AutoBuy.TargetItem> targets = this.module().getTargets();
                if (index < targets.size()) {
                    this.selectedTargetItem = targets.get(index);
                    this.selectedAuctionItem = null;
                    this.selectedCount = Math.max(1, this.selectedTargetItem.count());
                }
            }
            return true;
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }

    public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
        if (this.hit(mouseX, mouseY, this.x() + 1.5f, this.y() + 1.0f, 281.5f, 267.0f)) {
            this.scroll += (float)verticalAmount * 20.0f;
            return true;
        }
        return super.mouseScrolled(mouseX, mouseY, horizontalAmount, verticalAmount);
    }

    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (this.editingCount) {
            if (keyCode == 259) {
                if (!this.countInput.isEmpty()) {
                    this.countInput = this.countInput.substring(0, this.countInput.length() - 1);
                }
                return true;
            }
            if (keyCode == 257 || keyCode == 335) {
                this.applyCountInput();
                this.editingCount = false;
                return true;
            }
            if (keyCode == 256) {
                this.countInput = String.valueOf(this.selectedCount);
                this.editingCount = false;
                return true;
            }
        }
        if (this.editingSearch) {
            if (keyCode == 259) {
                if (!this.searchInput.isEmpty()) {
                    this.searchInput = this.searchInput.substring(0, this.searchInput.length() - 1);
                    this.resetScroll();
                }
                return true;
            }
            if (keyCode == 257 || keyCode == 335 || keyCode == 256) {
                this.editingSearch = false;
                return true;
            }
        }
        if (keyCode == 259 && !this.pickingItems && this.selectedTargetItem != null) {
            this.module().removeTarget(this.selectedTargetItem);
            this.selectedTargetItem = null;
            return true;
        }
        return super.keyPressed(keyCode, scanCode, modifiers);
    }

    public boolean charTyped(char chr, int modifiers) {
        if (this.editingCount && Character.isDigit(chr)) {
            if (this.countInput.length() < 4) {
                this.countInput = this.countInput + chr;
            }
            return true;
        }
        if (this.editingSearch && !Character.isISOControl(chr)) {
            this.searchInput = this.searchInput + chr;
            this.resetScroll();
            return true;
        }
        return super.charTyped(chr, modifiers);
    }

    private void clickAction() {
        if (this.pickingItems) {
            if (this.selectedAuctionItem != null) {
                this.applyCountInput();
                this.module().addTarget(this.selectedAuctionItem, this.selectedCount);
                this.selectedAuctionItem = null;
                this.selectedCount = 1;
                this.countInput = "1";
                this.editingCount = false;
                this.pickingItems = false;
                this.resetScroll();
            } else {
                this.pickingItems = false;
                this.resetScroll();
            }
            return;
        }
        if (this.module().getTargets().isEmpty()) {
            if (this.module().getScannedItems().isEmpty()) {
                this.module().startScan();
            } else {
                this.pickingItems = true;
                this.resetScroll();
            }
            return;
        }
        if (this.selectedTargetItem == null) {
            this.pickingItems = true;
            this.resetScroll();
            return;
        }
        if (this.module().isWorking()) {
            this.module().stopWork();
        } else {
            this.module().startBuy();
        }
    }

    private void applyCountInput() {
        try {
            this.selectedCount = Math.max(1, Math.min(2304, Integer.parseInt(this.countInput)));
        }
        catch (NumberFormatException ignored) {
            this.selectedCount = 1;
        }
        this.countInput = String.valueOf(this.selectedCount);
    }

    private int hoveredIndex(double mouseX, double mouseY) {
        float x2 = this.x();
        float y2 = this.y();
        float listY = this.listY();
        float listHeight = this.listHeight();
        int count = this.itemCount();
        for (int i2 = 0; i2 < count; ++i2) {
            int col = i2 % 10;
            int row = i2 / 10;
            float cardX = x2 + 8.0f + (float)col * 27.0f;
            float cardY = listY + this.smoothedScroll + (float)row * 27.0f;
            if (!(cardY + 21.0f >= listY) || !(cardY <= listY + listHeight) || !this.hit(mouseX, mouseY, cardX, cardY, 21.0f, 21.0f)) continue;
            return i2;
        }
        return -1;
    }

    private String buttonText() {
        if (this.pickingItems) {
            return this.selectedAuctionItem == null ? "Back" : "Add";
        }
        if (this.module().getTargets().isEmpty()) {
            return this.module().getScannedItems().isEmpty() ? "Scan" : "Add";
        }
        if (this.selectedTargetItem == null) {
            return "Add";
        }
        return this.module().isWorking() ? "Stop" : "Start";
    }

    private String bottomText() {
        if (this.pickingItems) {
            return this.selectedAuctionItem == null ? "Select item" : "Count: " + this.selectedCount;
        }
        return this.selectedTargetItem == null ? "Select target or Add" : this.selectedTargetItem.name() + " x" + this.selectedTargetItem.count();
    }

    private String selectedName() {
        if (this.selectedAuctionItem != null) {
            return this.trim(this.selectedAuctionItem.name(), 220.0f, 14);
        }
        if (this.selectedTargetItem != null) {
            return this.trim(this.selectedTargetItem.name(), 220.0f, 14);
        }
        return "";
    }

    private ItemStack selectedStack() {
        if (this.selectedAuctionItem != null) {
            return this.selectedAuctionItem.icon();
        }
        if (this.selectedTargetItem != null) {
            return this.selectedTargetItem.icon();
        }
        return ItemStack.EMPTY;
    }

    private int itemCount() {
        return this.pickingItems ? this.filteredAuctionItems().size() : this.module().getTargets().size();
    }

    private float listHeight() {
        float reserved;
        float f2 = reserved = this.pickingItems ? 112.0f : 85.0f;
        if (!this.selectedStack().isEmpty()) {
            reserved += 26.5f;
        }
        return 290.0f - reserved;
    }

    private float listY() {
        return this.y() + (this.pickingItems ? 56.0f : 31.0f);
    }

    private List<AutoBuy.AuctionItem> filteredAuctionItems() {
        List<AutoBuy.AuctionItem> items = this.module().getScannedItems();
        String query = this.searchInput.trim().toLowerCase();
        if (query.isEmpty()) {
            return items;
        }
        return items.stream().filter(item -> item.name().toLowerCase().contains(query) || item.searchQuery().toLowerCase().contains(query)).toList();
    }

    private float contentHeight(int count) {
        int rows = (int)Math.ceil((double)count / 10.0);
        return (float)rows * 27.0f;
    }

    private void resetScroll() {
        this.scroll = 0.0f;
        this.smoothedScroll = 0.0f;
    }

    private void drawBadge(DrawContext context, String text, float rightX, float y2) {
        float width = Math.max(12.0f, this.textWidth(text, 10) + 4.0f);
        RenderUtils.drawRoundedRect(context.getMatrices(), rightX - width, y2, width, 8.0f, 2.0f, ColorUtils.rgba(8, 8, 10, 210));
        this.drawTextRight(context, text, rightX - 2.0f, y2 + 2.0f, ColorUtils.rgba(245, 245, 250, 255), 10);
    }

    private boolean hit(double mouseX, double mouseY, float x2, float y2, float w2, float h2) {
        return HoveringUtils.isHovered(mouseX, mouseY, x2, y2, w2, h2);
    }

    private void drawText(DrawContext context, String text, float x2, float y2, int color, int size) {
        this.drawText(context, text, x2, y2, color, size, "suisse");
    }

    private void drawText(DrawContext context, String text, float x2, float y2, int color, int size, String fontName) {
        Font font = this.font(fontName, size);
        if (font != null) {
            font.draw(context.getMatrices(), text, x2, y2, color);
        } else {
            context.drawText(AutoBuy.mc.textRenderer, text, (int)x2, (int)y2, color, false);
        }
    }

    private void drawCenteredText(DrawContext context, String text, float x2, float y2, int color, int size) {
        this.drawText(context, text, x2 - this.textWidth(text, size) / 2.0f, y2, color, size);
    }

    private void drawTextRight(DrawContext context, String text, float rightX, float y2, int color, int size) {
        this.drawText(context, text, rightX - this.textWidth(text, size), y2, color, size);
    }

    private float textWidth(String text, int size) {
        Font font = this.font("suisse", size);
        return font != null ? font.getWidth(text) : (float)AutoBuy.mc.textRenderer.getWidth(text);
    }

    private Font font(String name, int size) {
        Font font = Fonts.getFont(name, size);
        return font != null ? font : Fonts.getFont("sf_regular", size);
    }

    private String trim(String text, float width, int size) {
        if (this.textWidth(text, size) <= width) {
            return text;
        }
        String value = text;
        while (!value.isEmpty() && this.textWidth(value + "...", size) > width) {
            value = value.substring(0, value.length() - 1);
        }
        return value + "...";
    }

    private float x() {
        return (float)mc.getWindow().getScaledWidth() / 2.0f - 142.25f;
    }

    private float y() {
        return (float)mc.getWindow().getScaledHeight() / 2.0f - 145.0f;
    }

    private int bg() {
        return ColorUtils.rgba(16, 16, 19, 245);
    }

    private int settingsBg() {
        return ColorUtils.rgba(31, 31, 35, 255);
    }

    private int offBg() {
        return ColorUtils.rgba(22, 22, 25, 255);
    }

    private int text() {
        return ColorUtils.rgba(245, 245, 248, 255);
    }

    private fun.wonderful.client.modules.impl.misc.AutoBuy module() {
        return fun.wonderful.client.modules.impl.misc.AutoBuy.INSTANCE;
    }
}