/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.math;

public final class Color {
    private final int a;

    private Color(int n) {
        this.a = n;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        return this.a == ((Color)object).a;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }

    public final int hashCode() {
        return this.a;
    }

    public final int getColor() {
        return this.a;
    }

    public final int getRed() {
        return this.a >> 16 & 0xFF;
    }

    public final int getGreen() {
        return this.a >> 8 & 0xFF;
    }

    public final int getBlue() {
        return this.a & 0xFF;
    }

    public final int getAlpha() {
        return this.a >>> 24;
    }

    public static int HSBtoRGB(float f, float f2, float f3) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        if (f2 == 0.0f) {
            n2 = n3 = (int)(f3 * 255.0f + 0.5f);
            n = n3;
        } else {
            float f4 = f;
            f = (f4 - (float)Math.floor(f4)) * 6.0f;
            float f5 = f - (float)Math.floor(f);
            float f6 = f3 * (1.0f - f2);
            float f7 = f3 * (1.0f - f2 * f5);
            f2 = f3 * (1.0f - f2 * (1.0f - f5));
            switch ((int)f) {
                case 0: {
                    n = (int)(f3 * 255.0f + 0.5f);
                    n2 = (int)(f2 * 255.0f + 0.5f);
                    n3 = (int)(f6 * 255.0f + 0.5f);
                    break;
                }
                case 1: {
                    n = (int)(f7 * 255.0f + 0.5f);
                    n2 = (int)(f3 * 255.0f + 0.5f);
                    n3 = (int)(f6 * 255.0f + 0.5f);
                    break;
                }
                case 2: {
                    n = (int)(f6 * 255.0f + 0.5f);
                    n2 = (int)(f3 * 255.0f + 0.5f);
                    n3 = (int)(f2 * 255.0f + 0.5f);
                    break;
                }
                case 3: {
                    n = (int)(f6 * 255.0f + 0.5f);
                    n2 = (int)(f7 * 255.0f + 0.5f);
                    n3 = (int)(f3 * 255.0f + 0.5f);
                    break;
                }
                case 4: {
                    n = (int)(f2 * 255.0f + 0.5f);
                    n2 = (int)(f6 * 255.0f + 0.5f);
                    n3 = (int)(f3 * 255.0f + 0.5f);
                    break;
                }
                case 5: {
                    n = (int)(f3 * 255.0f + 0.5f);
                    n2 = (int)(f6 * 255.0f + 0.5f);
                    n3 = (int)(f7 * 255.0f + 0.5f);
                }
            }
        }
        return 0xFF000000 | n << 16 | n2 << 8 | n3;
    }

    public final Color brighter(double d) {
        int n = this.getRed();
        int n2 = this.getGreen();
        int n3 = this.getBlue();
        int n4 = (int)(1.0 / (1.0 - 1.0 / d));
        if (n == 0 && n2 == 0 && n3 == 0) {
            int n5 = n4;
            return Color.ofRGBA(n5, n5, n4, this.getAlpha());
        }
        if (n > 0 && n < n4) {
            n = n4;
        }
        if (n2 > 0 && n2 < n4) {
            n2 = n4;
        }
        if (n3 > 0 && n3 < n4) {
            n3 = n4;
        }
        return Color.ofRGBA(Math.min((int)((double)n / (1.0 / d)), 255), Math.min((int)((double)n2 / (1.0 / d)), 255), Math.min((int)((double)n3 / (1.0 / d)), 255), this.getAlpha());
    }

    public final Color darker(double d) {
        return Color.ofRGBA(Math.max((int)((double)this.getRed() * (1.0 / d)), 0), Math.max((int)((double)this.getGreen() * (1.0 / d)), 0), Math.max((int)((double)this.getBlue() * (1.0 / d)), 0), this.getAlpha());
    }

    public static Color ofRGB(int n, int n2, int n3) {
        return Color.ofRGBA(n, n2, n3, 255);
    }

    public static Color ofRGB(float f, float f2, float f3) {
        return Color.ofRGBA(f, f2, f3, 1.0f);
    }

    public static Color ofOpaque(int n) {
        return new Color(0xFF000000 | n);
    }

    public static Color ofHSB(float f, float f2, float f3) {
        return Color.ofOpaque(Color.HSBtoRGB(f, f2, f3));
    }

    public static Color ofRGBA(int n, int n2, int n3, int n4) {
        return new Color((n4 & 0xFF) << 24 | (n & 0xFF) << 16 | (n2 & 0xFF) << 8 | n3 & 0xFF);
    }

    public static Color ofRGBA(float f, float f2, float f3, float f4) {
        return Color.ofRGBA((int)((double)(f * 255.0f) + 0.5), (int)((double)(f2 * 255.0f) + 0.5), (int)((double)(f3 * 255.0f) + 0.5), (int)((double)(f4 * 255.0f) + 0.5));
    }

    public static Color ofTransparent(int n) {
        return new Color(n);
    }
}

