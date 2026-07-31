package ru.destra.font;

@FunctionalInterface
public interface TextRenderCallback {
    void render(String text, int color, boolean bold);
}
