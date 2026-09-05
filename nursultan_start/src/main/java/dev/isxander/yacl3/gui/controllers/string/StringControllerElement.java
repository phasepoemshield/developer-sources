/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.OptionEventListener$Event
 *  dev.isxander.yacl3.api.utils.Dimension
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class05936
 *  minecraft.class06197
 *  minecraft.class06541
 *  minecraft.class06608
 */
package dev.isxander.yacl3.gui.controllers.string;

import dev.isxander.yacl3.api.OptionEventListener;
import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.ControllerWidget;
import dev.isxander.yacl3.gui.controllers.string.IStringController;
import dev.isxander.yacl3.gui.utils.GuiUtils;
import dev.isxander.yacl3.gui.utils.KeyUtils;
import dev.isxander.yacl3.gui.utils.UndoRedoHelper;
import java.util.Objects;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class05936;
import minecraft.class06197;
import minecraft.class06541;
import minecraft.class06608;

public class StringControllerElement
extends ControllerWidget<IStringController<?>> {
    protected final boolean instantApply;
    protected String inputField;
    protected Dimension<Integer> inputFieldBounds;
    protected boolean inputFieldFocused;
    protected int caretPos;
    protected int previousCaretPos;
    protected int selectionLength;
    protected int renderOffset;
    protected UndoRedoHelper undoRedoHelper;
    protected float ticks;
    protected float caretTicks;
    private final class00392 emptyText;

    public StringControllerElement(IStringController<?> iStringController, YACLScreen yACLScreen, Dimension<Integer> dimension, boolean bl) {
        super(iStringController, yACLScreen, dimension);
        this.instantApply = bl;
        this.inputField = iStringController.getString();
        this.inputFieldFocused = false;
        this.selectionLength = 0;
        this.emptyText = class00392.y((String)"Click to type...").N(class06541.field_1080);
        iStringController.option().addEventListener((option, event) -> {
            if (event == OptionEventListener.Event.STATE_CHANGE) {
                this.inputField = iStringController.getString();
            }
        });
        this.setDimension(dimension);
    }

    public void write(String string) {
        if (this.selectionLength == 0) {
            if (this.modifyInput(stringBuilder -> stringBuilder.insert(this.caretPos, string))) {
                this.caretPos += string.length();
                this.checkRenderOffset();
            }
        } else {
            int n;
            int n2 = this.getSelectionStart();
            if (this.modifyInput(arg_0 -> StringControllerElement.lambda$write$1(n2, n = this.getSelectionEnd(), string, arg_0))) {
                this.caretPos = n2 + string.length();
                this.selectionLength = 0;
                this.checkRenderOffset();
            }
        }
    }

    @Override
    public class00392 getValueText() {
        if (!this.inputFieldFocused && this.inputField.isEmpty()) {
            return this.emptyText;
        }
        return this.instantApply || !this.inputFieldFocused ? ((IStringController)this.control).formatValue() : class00392.y((String)this.inputField);
    }

    @Override
    public void method_25365(boolean bl) {
        super.method_25365(bl);
        this.inputFieldFocused = bl;
    }

    @Override
    public void setDimension(Dimension<Integer> dimension) {
        super.setDimension(dimension);
        int n = Math.max(6, Math.min(this.textRenderer.N((class05936)this.getValueText()), this.getUnshiftedLength()));
        int n2 = (Integer)dimension.xLimit() - this.getXPadding() - n;
        int n3 = (Integer)dimension.centerY();
        Objects.requireNonNull(this.textRenderer);
        int n4 = n3 - 9 / 2;
        Objects.requireNonNull(this.textRenderer);
        this.inputFieldBounds = Dimension.ofInt((int)n2, (int)n4, (int)n, (int)9);
    }

    @Override
    public int getUnhoveredControlWidth() {
        return !this.isHovered() ? Math.min(this.getHoveredControlWidth(), this.getMaxUnwrapLength()) : this.getHoveredControlWidth();
    }

    @Override
    public int getHoveredControlWidth() {
        return Math.min(this.textRenderer.N((class05936)this.getValueText()), this.getUnshiftedLength());
    }

    private boolean isHoveredInputField(double d, double d2) {
        return this.inputFieldBounds.isPointInside((Number)((int)d), (Number)((int)d2));
    }

    @Override
    public void unfocus() {
        super.unfocus();
        this.inputFieldFocused = false;
        this.renderOffset = 0;
        if (!this.instantApply) {
            this.updateControl();
        }
    }

    protected boolean doCopy() {
        if (this.selectionLength != 0) {
            ((class06197)this.client.L_3).N(this.getSelection());
            return true;
        }
        return false;
    }

    protected boolean doPaste() {
        this.write(((class06197)this.client.L_3).N());
        this.updateUndoHistory();
        return true;
    }

    protected boolean doCut() {
        if (this.selectionLength != 0) {
            ((class06197)this.client.L_3).N(this.getSelection());
            this.write("");
            this.updateUndoHistory();
            return true;
        }
        return false;
    }

    protected void doDelete() {
        if (this.selectionLength != 0) {
            this.write("");
        } else if (this.caretPos < this.inputField.length()) {
            this.modifyInput(stringBuilder -> stringBuilder.deleteCharAt(this.caretPos));
        }
        this.updateUndoHistory();
    }

    private static /* synthetic */ void lambda$write$1(int n, int n2, String string, StringBuilder stringBuilder) {
        stringBuilder.replace(n, n2, string);
    }

    protected String getSelection() {
        return this.inputField.substring(this.getSelectionStart(), this.getSelectionEnd());
    }

    @Override
    public boolean onCharTyped(char c, String string, int n) {
        if (!this.inputFieldFocused) {
            return false;
        }
        if (!KeyUtils.hasControlDown(n)) {
            this.write(string);
            this.updateUndoHistory();
            return true;
        }
        return false;
    }

    @Override
    public boolean onMouseClicked(double d, double d2, int n) {
        if (this.isAvailable() && this.getDimension().isPointInside((Number)((int)d), (Number)((int)d2))) {
            this.inputFieldFocused = true;
            if (!this.isHoveredInputField(d, d2)) {
                this.caretPos = this.getDefaultCaretPos();
            } else {
                int n2 = (int)d - ((Integer)this.inputFieldBounds.xLimit() - this.textRenderer.N((class05936)this.getValueText()));
                int n3 = -1;
                int n4 = 0;
                for (char c : this.inputField.toCharArray()) {
                    ++n3;
                    int n5 = this.textRenderer.y(String.valueOf(c));
                    if (n4 + n5 / 2 > n2) {
                        this.caretPos = n3;
                        break;
                    }
                    if (n3 == this.inputField.length() - 1) {
                        this.caretPos = n3 + 1;
                    }
                    n4 += n5;
                }
                this.selectionLength = 0;
            }
            return true;
        }
        this.unfocus();
        return false;
    }

    @Override
    public boolean onKeyPressed(int n, int n2, int n3) {
        if (!this.inputFieldFocused) {
            return false;
        }
        switch (n) {
            case 256: 
            case 257: {
                this.unfocus();
                return true;
            }
            case 263: {
                if (KeyUtils.hasShiftDown(n3)) {
                    if (KeyUtils.hasControlDown(n3)) {
                        int n4 = this.findSpaceIndex(true);
                        this.selectionLength += this.caretPos - n4;
                        this.caretPos = n4;
                    } else if (this.caretPos > 0) {
                        --this.caretPos;
                        ++this.selectionLength;
                    }
                    this.checkRenderOffset();
                } else {
                    if (this.caretPos > 0) {
                        this.caretPos = KeyUtils.hasControlDown(n3) ? this.findSpaceIndex(true) : (this.selectionLength != 0 ? (this.caretPos += Math.min(this.selectionLength, 0)) : --this.caretPos);
                    }
                    this.checkRenderOffset();
                    this.selectionLength = 0;
                }
                return true;
            }
            case 262: {
                if (KeyUtils.hasShiftDown(n3)) {
                    if (KeyUtils.hasControlDown(n3)) {
                        int n5 = this.findSpaceIndex(false);
                        this.selectionLength -= n5 - this.caretPos;
                        this.caretPos = n5;
                    } else if (this.caretPos < this.inputField.length()) {
                        ++this.caretPos;
                        --this.selectionLength;
                    }
                    this.checkRenderOffset();
                } else {
                    if (this.caretPos < this.inputField.length()) {
                        this.caretPos = KeyUtils.hasControlDown(n3) ? this.findSpaceIndex(false) : (this.selectionLength != 0 ? (this.caretPos += Math.max(this.selectionLength, 0)) : ++this.caretPos);
                        this.checkRenderOffset();
                    }
                    this.selectionLength = 0;
                }
                return true;
            }
            case 259: {
                this.doBackspace();
                return true;
            }
            case 261: {
                this.doDelete();
                return true;
            }
            case 269: {
                this.selectionLength = KeyUtils.hasShiftDown(n3) ? (this.selectionLength -= this.inputField.length() - this.caretPos) : 0;
                this.caretPos = this.inputField.length();
                this.checkRenderOffset();
                return true;
            }
            case 268: {
                if (KeyUtils.hasShiftDown(n3)) {
                    this.selectionLength += this.caretPos;
                    this.caretPos = 0;
                } else {
                    this.caretPos = 0;
                    this.selectionLength = 0;
                }
                this.checkRenderOffset();
                return true;
            }
        }
        if (KeyUtils.isPaste(n, n3)) {
            return this.doPaste();
        }
        if (KeyUtils.isCopy(n, n3)) {
            return this.doCopy();
        }
        if (KeyUtils.isCut(n, n3)) {
            return this.doCut();
        }
        if (KeyUtils.isSelectAll(n, n3)) {
            return this.doSelectAll();
        }
        return false;
    }

    protected boolean doSelectAll() {
        this.caretPos = this.inputField.length();
        this.checkRenderOffset();
        this.selectionLength = -this.caretPos;
        return true;
    }

    protected int getDefaultCaretPos() {
        return this.inputField.length();
    }

    @Override
    public void drawHoveredControl(class01054 class010542, int n, int n2, float f) {
    }

    public boolean modifyInput(Consumer<StringBuilder> consumer) {
        StringBuilder stringBuilder = new StringBuilder(this.inputField);
        consumer.accept(stringBuilder);
        if (!((IStringController)this.control).isInputValid(stringBuilder.toString())) {
            return false;
        }
        this.inputField = stringBuilder.toString();
        if (this.instantApply) {
            this.updateControl();
        }
        return true;
    }

    @Override
    public void drawValueText(class01054 class010542, int n, int n2, float f) {
        class00392 class003922 = this.getValueText();
        if (!this.isHovered()) {
            class003922 = class00392.y((String)GuiUtils.shortenString(class003922.getString(), this.textRenderer, this.getMaxUnwrapLength(), "...")).y(class003922.method_10866());
        }
        int n3 = (Integer)this.getDimension().xLimit() - this.textRenderer.N((class05936)class003922) + this.renderOffset - this.getXPadding();
        class010542.L(((Integer)this.inputFieldBounds.x()).intValue(), (Integer)this.inputFieldBounds.y() - 2, (Integer)this.inputFieldBounds.xLimit() + 1, (Integer)this.inputFieldBounds.yLimit() + 4);
        class010542.N(this.textRenderer, class003922, n3, this.getTextY(), this.getValueColor(), true);
        if (this.isHovered()) {
            this.ticks += f;
            String string = this.getValueText().getString();
            class010542.N(((Integer)this.inputFieldBounds.x()).intValue(), ((Integer)this.inputFieldBounds.yLimit()).intValue(), ((Integer)this.inputFieldBounds.xLimit()).intValue(), (Integer)this.inputFieldBounds.yLimit() + 1, -1);
            class010542.N((Integer)this.inputFieldBounds.x() + 1, (Integer)this.inputFieldBounds.yLimit() + 1, (Integer)this.inputFieldBounds.xLimit() + 1, (Integer)this.inputFieldBounds.yLimit() + 2, -12566464);
            if (this.inputFieldFocused || this.focused) {
                float f2;
                if (this.caretPos > string.length()) {
                    this.caretPos = string.length();
                }
                int n4 = n3 + this.textRenderer.y(string.substring(0, this.caretPos));
                if (string.isEmpty()) {
                    n4 = (Integer)this.inputFieldBounds.x() + (Integer)this.inputFieldBounds.width() / 2;
                }
                if (this.selectionLength != 0) {
                    int n5 = n3 + this.textRenderer.y(string.substring(0, this.caretPos + this.selectionLength));
                    class010542.N(n4, (Integer)this.inputFieldBounds.y() - 2, n5, (Integer)this.inputFieldBounds.yLimit() - 1, -2144325377);
                }
                if (this.caretPos != this.previousCaretPos) {
                    this.previousCaretPos = this.caretPos;
                    this.caretTicks = 0.0f;
                }
                this.caretTicks += f;
                if (f2 % 20.0f <= 10.0f) {
                    class010542.N(n4, (Integer)this.inputFieldBounds.y() - 2, n4 + 1, (Integer)this.inputFieldBounds.yLimit() - 1, -1);
                }
            }
        }
        class010542.R();
        if (this.isHoveredInputField(n, n2)) {
            class010542.N(this.isAvailable() ? class06608.y : class06608.B);
        } else if (this.hovered) {
            class010542.N(this.isAvailable() ? class06608.u : class06608.B);
        }
    }

    protected void doBackspace() {
        if (this.selectionLength != 0) {
            this.write("");
        } else if (this.caretPos > 0 && this.modifyInput(stringBuilder -> stringBuilder.deleteCharAt(this.caretPos - 1))) {
            --this.caretPos;
            this.checkRenderOffset();
        }
        this.updateUndoHistory();
    }

    protected void updateControl() {
        ((IStringController)this.control).setFromString(this.inputField);
    }

    protected int findSpaceIndex(boolean bl) {
        int n;
        int n2 = this.caretPos;
        if (bl) {
            if (this.caretPos > 0) {
                n2 -= 2;
            }
            n = this.inputField.lastIndexOf(" ", n2) + 1;
        } else {
            if (this.caretPos < this.inputField.length()) {
                ++n2;
            }
            if ((n = this.inputField.indexOf(" ", n2) + 1) == 0) {
                n = this.inputField.length();
            }
        }
        return n;
    }

    public int getSelectionEnd() {
        return Math.max(this.caretPos, this.caretPos + this.selectionLength);
    }

    public int getUnshiftedLength() {
        if (this.optionNameString.isEmpty()) {
            return (Integer)this.getDimension().width() - this.getXPadding() * 2;
        }
        return (Integer)this.getDimension().width() / 8 * 5;
    }

    public int getMaxUnwrapLength() {
        if (this.optionNameString.isEmpty()) {
            return (Integer)this.getDimension().width() - this.getXPadding() * 2;
        }
        return (Integer)this.getDimension().width() / 2;
    }

    protected void checkRenderOffset() {
        if (this.textRenderer.y(this.inputField) < this.getUnshiftedLength()) {
            this.renderOffset = 0;
            return;
        }
        int n = (Integer)this.getDimension().xLimit() - this.textRenderer.y(this.inputField) - this.getXPadding();
        int n2 = n + this.textRenderer.y(this.inputField.substring(0, this.caretPos));
        int n3 = (Integer)this.getDimension().xLimit() - this.getXPadding() - this.getUnshiftedLength();
        int n4 = n3 + this.getUnshiftedLength();
        if (n2 + this.renderOffset < n3) {
            this.renderOffset = n3 - n2;
        } else if (n2 + this.renderOffset > n4) {
            this.renderOffset = n4 - n2;
        }
    }

    protected void updateUndoHistory() {
    }

    public int getSelectionStart() {
        return Math.min(this.caretPos, this.caretPos + this.selectionLength);
    }

    @Override
    public boolean isHovered() {
        return super.isHovered() || this.inputFieldFocused;
    }
}

