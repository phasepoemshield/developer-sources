package fun.nexisdlc.ui.gui.elements;

import fun.nexisdlc.client.utils.render.color.ColorUtils;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontObject;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Predicate;

public class TextInputField {
    public static TextInputField focusedField = null;

    private String text = "";
    private int cursor = 0;
    private int selectionAnchor = -1;
    private float scrollX = 0f;

    private boolean focused = false;
    private boolean dragging = false;
    private float dragOriginX = 0f;
    private long lastBlinkMs = 0L;
    private boolean cursorVisible = true;

    private FontObject font;
    private float fontSize = 13f;
    private float padX = 10f;
    private float padY = 0f;
    private int maxLength = Integer.MAX_VALUE;
    private boolean multiline = false;
    private Predicate<Character> charFilter = null;
    private Runnable onSubmit = null;
    private Runnable onChange = null;
    private String placeholder = "";

    private int textColor = 0xFFE5E5E5;
    private int placeholderColor = 0xFF858585;
    private int cursorColor = 0xFFFFFFFF;
    private int selectionColor = 0x803478FF;

    private final Deque<Snapshot> undoStack = new ArrayDeque<>();
    private final Deque<Snapshot> redoStack = new ArrayDeque<>();
    private static final int UNDO_LIMIT = 100;
    private long lastSnapshotMs = 0L;
    private static final long SNAPSHOT_DEBOUNCE_MS = 350L;

    public TextInputField() {
        this.font = FontRegistry.SF_MEDIUM;
        snapshot();
    }

    public TextInputField setText(String t) {
        if (t == null) t = "";
        if (t.length() > maxLength) t = t.substring(0, maxLength);
        this.text = t;
        this.cursor = Math.min(Math.max(0, cursor), t.length());
        this.selectionAnchor = -1;
        return this;
    }

    public String getText() { return text; }
    public int getCursor() { return cursor; }
    public boolean isFocused() { return focused; }

    public TextInputField setFont(FontObject f) { if (f != null) this.font = f; return this; }
    public TextInputField setFontSize(float s) { this.fontSize = s; return this; }
    public TextInputField setPadding(float px, float py) { this.padX = px; this.padY = py; return this; }
    public TextInputField setMaxLength(int m) { this.maxLength = Math.max(0, m); return this; }
    public TextInputField setMultiline(boolean m) { this.multiline = m; return this; }
    public TextInputField setCharFilter(Predicate<Character> f) { this.charFilter = f; return this; }
    public TextInputField setOnSubmit(Runnable r) { this.onSubmit = r; return this; }
    public TextInputField setOnChange(Runnable r) { this.onChange = r; return this; }
    public TextInputField setPlaceholder(String p) { this.placeholder = p == null ? "" : p; return this; }
    public TextInputField setColors(int textCol, int placeholderCol, int cursorCol, int selectionCol) {
        this.textColor = textCol;
        this.placeholderColor = placeholderCol;
        this.cursorColor = cursorCol;
        this.selectionColor = selectionCol;
        return this;
    }

    public void focus() {
        if (focusedField != null && focusedField != this) focusedField.blur();
        this.focused = true;
        focusedField = this;
        this.lastBlinkMs = System.currentTimeMillis();
        this.cursorVisible = true;
    }

    public void blur() {
        this.focused = false;
        this.selectionAnchor = -1;
        this.dragging = false;
        if (focusedField == this) focusedField = null;
    }

    public boolean hasSelection() {
        if (selectionAnchor < 0) return false;
        int s = clampPos(selectionAnchor);
        int c = clampPos(cursor);
        return s != c;
    }

    public int selStart() {
        if (selectionAnchor < 0) return clampPos(cursor);
        return Math.min(clampPos(cursor), clampPos(selectionAnchor));
    }

    public int selEnd() {
        if (selectionAnchor < 0) return clampPos(cursor);
        return Math.max(clampPos(cursor), clampPos(selectionAnchor));
    }

    public String getSelectedText() {
        if (!hasSelection()) return "";
        return safeSubstring(selStart(), selEnd());
    }

    private float lastFieldX = 0f;
    private float lastFieldY = 0f;
    private float lastFieldW = 0f;
    private float lastFieldH = 0f;
    private final java.util.List<int[]> wrapSpans = new java.util.ArrayList<>();

    public int getWrappedLineCount(float visibleW) {
        if (!multiline) return 1;
        rebuildWrap(visibleW);
        return Math.max(1, wrapSpans.size());
    }

    public void render(Renderer2D r, float x, float y, float w, float h, float alphaProgress) {
        cursor = clampPos(cursor);
        if (selectionAnchor >= 0) selectionAnchor = clampPos(selectionAnchor);
        lastFieldX = x;
        lastFieldY = y;
        lastFieldW = w;
        lastFieldH = h;

        updateBlink();

        float textX = x + padX;
        float visibleW = Math.max(0f, w - padX * 2f);
        float lineH = font.getLineHeight(fontSize);

        int alpha = (int) (255 * Math.max(0f, Math.min(1f, alphaProgress)));
        r.pushClipRect((int) Math.floor(x), (int) Math.floor(y), (int) Math.ceil(w), (int) Math.ceil(h));

        if (multiline) {
            rebuildWrap(visibleW);
            int lineCount = Math.max(1, wrapSpans.size());
            float totalH = lineCount * lineH;
            float startY = y + Math.max(padY, (h - totalH) * 0.5f);

            int selS = focused && hasSelection() ? selStart() : -1;
            int selE = focused && hasSelection() ? selEnd() : -1;
            int tCol = applyAlpha(textColor, alpha);
            int selCol = ColorUtils.multAlpha(selectionColor, alphaProgress);
            float selH = Math.max(8f, fontSize + 4f);

            if (text.isEmpty() && !placeholder.isEmpty()) {
                float baseline = startY + lineH * 0.5f + FontRegistry.centeredBaselineOffset(font, 'H', fontSize);
                r.text(font, textX, baseline, fontSize, placeholder, applyAlpha(placeholderColor, alpha));
            } else {
                for (int i = 0; i < wrapSpans.size(); i++) {
                    int[] span = wrapSpans.get(i);
                    String ln = safeSubstring(span[0], span[1]);
                    float lineY = startY + i * lineH;
                    if (selS >= 0 && selE > selS) {
                        int from = Math.max(span[0], selS);
                        int to = Math.min(span[1], selE);
                        if (to > from) {
                            float xs = textX + measureWidth(safeSubstring(span[0], from));
                            float xe = textX + measureWidth(safeSubstring(span[0], to));
                            r.rect(xs, lineY + (lineH - selH) * 0.5f, Math.max(1f, xe - xs), selH, 0f, selCol);
                        }
                        if (selS <= span[1] && selE > span[1] && i < wrapSpans.size() - 1) {
                            float trailX = textX + measureWidth(ln);
                            r.rect(trailX, lineY + (lineH - selH) * 0.5f, 4f, selH, 0f, selCol);
                        }
                    }
                    float baseline = lineY + lineH * 0.5f + FontRegistry.centeredBaselineOffset(font, 'H', fontSize);
                    r.text(font, textX, baseline, fontSize, ln, tCol);
                }
            }

            if (focused && cursorVisible) {
                int[] cl = cursorLineSpan();
                if (cl != null) {
                    int li = cl[0];
                    int[] span = wrapSpans.get(li);
                    float lineY = startY + li * lineH;
                    float cx = textX + measureWidth(safeSubstring(span[0], cursor));
                    float ch = Math.max(8f, fontSize + 2f);
                    float cy = lineY + (lineH - ch) * 0.5f;
                    r.rect(cx, cy, 1.6f, ch, 0.8f, applyAlpha(cursorColor, alpha));
                }
            }
        } else {
            float baseline = y + h * 0.5f + FontRegistry.centeredBaselineOffset(font, 'H', fontSize);
            ensureCursorVisible(visibleW);

            if (focused && hasSelection()) {
                int s = selStart();
                int e = selEnd();
                float xs = textX - scrollX + measureWidth(safeSubstring(0, s));
                float xe = textX - scrollX + measureWidth(safeSubstring(0, e));
                float selH = Math.max(8f, fontSize + 4f);
                float selY = y + (h - selH) * 0.5f;
                int selCol = ColorUtils.multAlpha(selectionColor, alphaProgress);
                r.rect(xs, selY, Math.max(1f, xe - xs), selH, 0f, selCol);
            }

            if (text.isEmpty()) {
                if (!placeholder.isEmpty()) {
                    int phCol = applyAlpha(placeholderColor, alpha);
                    r.text(font, textX, baseline, fontSize, placeholder, phCol);
                }
            } else {
                int tCol = applyAlpha(textColor, alpha);
                r.text(font, textX - scrollX, baseline, fontSize, text, tCol);
            }

            if (focused && cursorVisible) {
                float cx = textX - scrollX + measureWidth(safeSubstring(0, cursor));
                float ch = Math.max(8f, fontSize + 2f);
                float cy = y + (h - ch) * 0.5f;
                int cCol = applyAlpha(cursorColor, alpha);
                r.rect(cx, cy, 1.6f, ch, 0.8f, cCol);
            }
        }

        r.popClipRect();
    }

    private int[] cursorLineSpan() {
        if (wrapSpans.isEmpty()) return null;
        int c = clampPos(cursor);
        for (int i = 0; i < wrapSpans.size(); i++) {
            int[] sp = wrapSpans.get(i);
            if (c >= sp[0] && c <= sp[1]) return new int[]{i, sp[0], sp[1]};
        }
        int[] last = wrapSpans.get(wrapSpans.size() - 1);
        return new int[]{wrapSpans.size() - 1, last[0], last[1]};
    }

    private void rebuildWrap(float maxWidth) {
        wrapSpans.clear();
        if (maxWidth <= 0f) {
            wrapSpans.add(new int[]{0, text.length()});
            return;
        }
        int n = text.length();
        if (n == 0) {
            wrapSpans.add(new int[]{0, 0});
            return;
        }
        int lineStart = 0;
        int lastBreakable = -1;
        float widthSinceStart = 0f;
        float widthAtBreak = 0f;
        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            if (ch == '\n') {
                wrapSpans.add(new int[]{lineStart, i});
                lineStart = i + 1;
                lastBreakable = -1;
                widthSinceStart = 0f;
                widthAtBreak = 0f;
                continue;
            }
            float cw = font.getWidth(text.substring(i, i + 1), fontSize);
            if (widthSinceStart + cw > maxWidth && i > lineStart) {
                int breakAt;
                if (lastBreakable > lineStart) {
                    breakAt = lastBreakable;
                    wrapSpans.add(new int[]{lineStart, breakAt});
                    lineStart = breakAt + 1;
                } else {
                    breakAt = i;
                    wrapSpans.add(new int[]{lineStart, breakAt});
                    lineStart = breakAt;
                }
                lastBreakable = -1;
                widthSinceStart = 0f;
                widthAtBreak = 0f;
                if (lineStart <= i) {
                    for (int j = lineStart; j <= i; j++) {
                        char cj = text.charAt(j);
                        if (cj == ' ' || cj == '\t') {
                            lastBreakable = j;
                            widthAtBreak = widthSinceStart;
                        }
                        widthSinceStart += font.getWidth(text.substring(j, j + 1), fontSize);
                    }
                    continue;
                }
            }
            if (ch == ' ' || ch == '\t') {
                lastBreakable = i;
                widthAtBreak = widthSinceStart;
            }
            widthSinceStart += cw;
        }
        wrapSpans.add(new int[]{lineStart, n});
    }

    public boolean mouseClicked(double mx, double my, int button, float x, float y, float w, float h) {
        if (button != GLFW.GLFW_MOUSE_BUTTON_LEFT) return false;
        boolean inside = mx >= x && mx <= x + w && my >= y && my <= y + h;
        if (!inside) {
            if (focused) blur();
            return false;
        }
        focus();
        int pos = positionFromMouseX(mx, x);
        boolean shift = isShiftDown();
        if (shift) {
            if (selectionAnchor < 0) selectionAnchor = cursor;
        } else {
            selectionAnchor = pos;
        }
        cursor = pos;
        dragging = true;
        dragOriginX = x;
        return true;
    }

    public void mouseReleased(int button) {
        if (button == GLFW.GLFW_MOUSE_BUTTON_LEFT) {
            dragging = false;
            if (selectionAnchor == cursor) selectionAnchor = -1;
        }
    }

    public void tickDrag(double mx, double my) {
        if (!dragging || !focused) return;
        int pos = positionFromMouse(mx, my, lastFieldX, lastFieldY, lastFieldW, lastFieldH);
        if (pos != cursor) {
            cursor = pos;
            lastBlinkMs = System.currentTimeMillis();
            cursorVisible = true;
        }
    }

    public boolean keyPressed(int key, int modifiers) {
        if (!focused) return false;
        boolean ctrl = (modifiers & GLFW.GLFW_MOD_CONTROL) != 0;
        boolean shift = (modifiers & GLFW.GLFW_MOD_SHIFT) != 0;

        if (ctrl) {
            switch (key) {
                case GLFW.GLFW_KEY_A -> { selectAll(); return true; }
                case GLFW.GLFW_KEY_C -> { copySelection(); return true; }
                case GLFW.GLFW_KEY_X -> { cutSelection(); return true; }
                case GLFW.GLFW_KEY_V -> { pasteFromClipboard(); return true; }
                case GLFW.GLFW_KEY_Z -> {
                    if (shift) redo(); else undo();
                    return true;
                }
                case GLFW.GLFW_KEY_Y -> { redo(); return true; }
                case GLFW.GLFW_KEY_LEFT -> { moveByWord(-1, shift); return true; }
                case GLFW.GLFW_KEY_RIGHT -> { moveByWord(1, shift); return true; }
                case GLFW.GLFW_KEY_BACKSPACE -> { deleteWord(-1); return true; }
                case GLFW.GLFW_KEY_DELETE -> { deleteWord(1); return true; }
            }
        }

        switch (key) {
            case GLFW.GLFW_KEY_LEFT -> { moveCursor(-1, shift); return true; }
            case GLFW.GLFW_KEY_RIGHT -> { moveCursor(1, shift); return true; }
            case GLFW.GLFW_KEY_HOME -> { jumpTo(0, shift); return true; }
            case GLFW.GLFW_KEY_END -> { jumpTo(text.length(), shift); return true; }
            case GLFW.GLFW_KEY_BACKSPACE -> { backspace(); return true; }
            case GLFW.GLFW_KEY_DELETE -> { deleteForward(); return true; }
            case GLFW.GLFW_KEY_ENTER, GLFW.GLFW_KEY_KP_ENTER -> {
                if (multiline && !shift) {
                    insertText("\n");
                } else if (onSubmit != null) {
                    onSubmit.run();
                }
                return true;
            }
            case GLFW.GLFW_KEY_ESCAPE -> { blur(); return true; }
        }
        return false;
    }

    public boolean charTyped(char c) {
        if (!focused) return false;
        if (c < 32 || c == 127) return false;
        if (charFilter != null && !charFilter.test(c)) return false;
        insertText(String.valueOf(c));
        return true;
    }

    public void insertText(String s) {
        if (s == null || s.isEmpty()) return;
        snapshotIfNeeded();
        if (hasSelection()) {
            int s0 = selStart(), e0 = selEnd();
            text = safeSubstring(0, s0) + safeSubstring(e0, text.length());
            cursor = s0;
            selectionAnchor = -1;
        }
        int free = maxLength - text.length();
        if (free <= 0) return;
        if (s.length() > free) s = s.substring(0, free);
        cursor = clampPos(cursor);
        text = safeSubstring(0, cursor) + s + safeSubstring(cursor, text.length());
        cursor += s.length();
        afterChange();
    }

    private void backspace() {
        if (hasSelection()) { deleteSelection(); return; }
        if (cursor == 0) return;
        snapshot();
        text = safeSubstring(0, cursor - 1) + safeSubstring(cursor, text.length());
        cursor--;
        afterChange();
    }

    private void deleteForward() {
        if (hasSelection()) { deleteSelection(); return; }
        if (cursor >= text.length()) return;
        snapshot();
        text = safeSubstring(0, cursor) + safeSubstring(cursor + 1, text.length());
        afterChange();
    }

    private void deleteSelection() {
        if (!hasSelection()) return;
        snapshot();
        int s = selStart(), e = selEnd();
        text = safeSubstring(0, s) + safeSubstring(e, text.length());
        cursor = s;
        selectionAnchor = -1;
        afterChange();
    }

    private void deleteWord(int dir) {
        if (hasSelection()) { deleteSelection(); return; }
        snapshot();
        if (dir < 0) {
            int end = cursor;
            int start = wordBoundary(cursor, -1);
            text = safeSubstring(0, start) + safeSubstring(end, text.length());
            cursor = start;
        } else {
            int start = cursor;
            int end = wordBoundary(cursor, 1);
            text = safeSubstring(0, start) + safeSubstring(end, text.length());
        }
        afterChange();
    }

    private void moveCursor(int dir, boolean shift) {
        int newPos = Math.max(0, Math.min(text.length(), cursor + dir));
        applyMove(newPos, shift);
    }

    private void moveByWord(int dir, boolean shift) {
        int newPos = wordBoundary(cursor, dir);
        applyMove(newPos, shift);
    }

    private void jumpTo(int pos, boolean shift) {
        applyMove(Math.max(0, Math.min(text.length(), pos)), shift);
    }

    private void applyMove(int newPos, boolean shift) {
        if (shift) {
            if (selectionAnchor < 0) selectionAnchor = cursor;
        } else {
            selectionAnchor = -1;
        }
        cursor = newPos;
        lastBlinkMs = System.currentTimeMillis();
        cursorVisible = true;
    }

    private int wordBoundary(int from, int dir) {
        int pos = clampPos(from);
        int n = text.length();
        if (dir < 0) {
            while (pos > 0 && Character.isWhitespace(text.charAt(pos - 1))) pos--;
            while (pos > 0 && !Character.isWhitespace(text.charAt(pos - 1))) pos--;
        } else {
            while (pos < n && !Character.isWhitespace(text.charAt(pos))) pos++;
            while (pos < n && Character.isWhitespace(text.charAt(pos))) pos++;
        }
        return pos;
    }

    public void selectAll() {
        if (text.isEmpty()) return;
        selectionAnchor = 0;
        cursor = text.length();
    }

    public void copySelection() {
        if (!hasSelection()) return;
        try {
            MinecraftClient.getInstance().keyboard.setClipboard(getSelectedText());
        } catch (Exception ignored) {}
    }

    public void cutSelection() {
        if (!hasSelection()) return;
        copySelection();
        deleteSelection();
    }

    public void pasteFromClipboard() {
        try {
            String clip = MinecraftClient.getInstance().keyboard.getClipboard();
            if (clip == null || clip.isEmpty()) return;
            if (!multiline) clip = clip.replace("\r\n", " ").replace('\n', ' ').replace('\r', ' ');
            if (charFilter != null) {
                StringBuilder sb = new StringBuilder();
                for (char c : clip.toCharArray()) {
                    if (charFilter.test(c)) sb.append(c);
                }
                clip = sb.toString();
            }
            insertText(clip);
        } catch (Exception ignored) {}
    }

    public void undo() {
        if (undoStack.size() <= 1) return;
        Snapshot current = undoStack.pop();
        redoStack.push(current);
        Snapshot prev = undoStack.peek();
        if (prev != null) {
            text = prev.text;
            cursor = Math.min(prev.cursor, text.length());
            selectionAnchor = -1;
            if (onChange != null) onChange.run();
        }
    }

    public void redo() {
        if (redoStack.isEmpty()) return;
        Snapshot next = redoStack.pop();
        undoStack.push(next);
        text = next.text;
        cursor = Math.min(next.cursor, text.length());
        selectionAnchor = -1;
        if (onChange != null) onChange.run();
    }

    private void snapshot() {
        if (!undoStack.isEmpty() && undoStack.peek().text.equals(text)) {
            undoStack.peek().cursor = cursor;
            return;
        }
        undoStack.push(new Snapshot(text, cursor));
        redoStack.clear();
        while (undoStack.size() > UNDO_LIMIT) undoStack.removeLast();
        lastSnapshotMs = System.currentTimeMillis();
    }

    private void snapshotIfNeeded() {
        long now = System.currentTimeMillis();
        if (now - lastSnapshotMs > SNAPSHOT_DEBOUNCE_MS) snapshot();
    }

    private void afterChange() {
        cursor = clampPos(cursor);
        lastBlinkMs = System.currentTimeMillis();
        cursorVisible = true;
        if (onChange != null) onChange.run();
    }

    private void ensureCursorVisible(float visibleW) {
        if (visibleW <= 0f) return;
        float cw = measureWidth(safeSubstring(0, cursor));
        if (cw - scrollX > visibleW - 6f) scrollX = cw - (visibleW - 6f);
        else if (cw < scrollX + 4f) scrollX = Math.max(0f, cw - 4f);
        float full = measureWidth(text);
        float maxScroll = Math.max(0f, full - visibleW);
        scrollX = Math.max(0f, Math.min(scrollX, maxScroll));
    }

    private int positionFromMouseX(double mx, float fieldX) {
        return positionFromMouse(mx, lastFieldY + lastFieldH * 0.5, fieldX, lastFieldY, lastFieldW, lastFieldH);
    }

    private int positionFromMouse(double mx, double my, float fieldX, float fieldY, float fieldW, float fieldH) {
        if (multiline && !wrapSpans.isEmpty()) {
            float lineH = font.getLineHeight(fontSize);
            float totalH = wrapSpans.size() * lineH;
            float startY = fieldY + Math.max(padY, (fieldH - totalH) * 0.5f);
            int li = (int) Math.floor((my - startY) / lineH);
            if (li < 0) li = 0;
            if (li >= wrapSpans.size()) li = wrapSpans.size() - 1;
            int[] span = wrapSpans.get(li);
            float rel = (float) (mx - fieldX - padX);
            if (rel <= 0f) return span[0];
            String ln = safeSubstring(span[0], span[1]);
            float cum = 0f;
            for (int i = 0; i < ln.length(); i++) {
                float cw = font.getWidth(ln.substring(i, i + 1), fontSize);
                if (rel < cum + cw * 0.5f) return span[0] + i;
                cum += cw;
            }
            return span[1];
        }
        float relative = (float) (mx - fieldX - padX) + scrollX;
        if (relative <= 0f) return 0;
        int n = text.length();
        if (n == 0) return 0;
        float cumulative = 0f;
        for (int i = 0; i < n; i++) {
            float ch = font.getWidth(text.substring(i, i + 1), fontSize);
            if (relative < cumulative + ch * 0.5f) return i;
            cumulative += ch;
        }
        return n;
    }

    private float measureWidth(String s) {
        if (s == null || s.isEmpty()) return 0f;
        return font.getWidth(s, fontSize);
    }

    private void updateBlink() {
        if (!focused) {
            cursorVisible = true;
            return;
        }
        long now = System.currentTimeMillis();
        if (dragging) {
            cursorVisible = true;
            lastBlinkMs = now;
            return;
        }
        if (now - lastBlinkMs > 530) {
            cursorVisible = !cursorVisible;
            lastBlinkMs = now;
        }
    }



    private static boolean isShiftDown() {
        long handle = MinecraftClient.getInstance().getWindow().getHandle();
        return GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_LEFT_SHIFT) == GLFW.GLFW_PRESS
                || GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_RIGHT_SHIFT) == GLFW.GLFW_PRESS;
    }

    private int clampPos(int p) {
        if (p < 0) return 0;
        if (p > text.length()) return text.length();
        return p;
    }

    private String safeSubstring(int from, int to) {
        int len = text.length();
        int a = Math.max(0, Math.min(from, len));
        int b = Math.max(a, Math.min(to, len));
        return text.substring(a, b);
    }

    private static int applyAlpha(int rgba, int alpha) {
        return ColorUtils.multAlpha(rgba, alpha / 255f);
    }

    private static final class Snapshot {
        String text;
        int cursor;
        Snapshot(String t, int c) { this.text = t; this.cursor = c; }
    }
}
