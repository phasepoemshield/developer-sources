/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 */
package minecraft;

import minecraft.class04995;

public class class08173 {
    public static float w(float f) {
        return f * f;
    }

    public static float L(float f) {
        return class04995.U((float)f);
    }

    public static float M(float f) {
        return class04995.z((float)class04995.z((float)f)) * f;
    }

    public static float P(float f) {
        float f2 = 7.5625f;
        float f3 = 2.75f;
        if (f < 0.36363637f) {
            return 7.5625f * class04995.z((float)f);
        }
        if (f < 0.72727275f) {
            return 7.5625f * class04995.z((float)(f - 0.54545456f)) + 0.75f;
        }
        if ((double)f < 0.9090909090909091) {
            return 7.5625f * class04995.z((float)(f - 0.8181818f)) + 0.9375f;
        }
        return 7.5625f * class04995.z((float)(f - 0.95454544f)) + 0.984375f;
    }

    public static float T(float f) {
        if (f == 1.0f) {
            return 1.0f;
        }
        return 1.0f - (float)Math.pow(2.0, -10.0 * (double)f);
    }

    public static float Q(float f) {
        return (float)(-Math.sqrt(1.0f - f * f)) + 1.0f;
    }

    public static float B(float f) {
        return 1.0f - class04995.P((double)(f * 1.5707964f));
    }

    public static float Z(float f) {
        if (f < 0.5f) {
            return (1.0f - class08173.P(1.0f - 2.0f * f)) / 2.0f;
        }
        return (1.0f + class08173.P(2.0f * f - 1.0f)) / 2.0f;
    }

    public static float i(float f) {
        return f == 0.0f ? 0.0f : (float)Math.pow(2.0, 10.0 * (double)f - 10.0);
    }

    public static float b(float f) {
        return 1.0f - class04995.z((float)(1.0f - f));
    }

    public static float s(float f) {
        float f2 = 2.0943952f;
        if (f == 0.0f) {
            return 0.0f;
        }
        if (f == 1.0f) {
            return 1.0f;
        }
        return (float)(Math.pow(2.0, -10.0 * (double)f) * Math.sin(((double)f * 10.0 - 0.75) * 2.094395160675049) + 1.0);
    }

    public static float n(float f) {
        return -(class04995.P((double)((float)Math.PI * f)) - 1.0f) / 2.0f;
    }

    public static float l(float f) {
        return 1.0f - class04995.U((float)(1.0f - f));
    }

    public static float d(float f) {
        if (f < 0.5f) {
            return f == 0.0f ? 0.0f : (float)(Math.pow(2.0, 20.0 * (double)f - 10.0) / 2.0);
        }
        return f == 1.0f ? 1.0f : (float)((2.0 - Math.pow(2.0, -20.0 * (double)f + 10.0)) / 2.0);
    }

    public static float m(float f) {
        if ((double)f < 0.5) {
            return 16.0f * f * f * f * f * f;
        }
        return (float)(1.0 - Math.pow(-2.0 * (double)f + 2.0, 5.0) / 2.0);
    }

    public static float k(float f) {
        return (float)Math.sqrt(1.0f - class04995.z((float)(f - 1.0f)));
    }

    public static float t(float f) {
        float f2 = 1.70158f;
        float f3 = 2.70158f;
        return 1.0f + 2.70158f * class04995.U((float)(f - 1.0f)) + 1.70158f * class04995.z((float)(f - 1.0f));
    }

    public static float v(float f) {
        return class04995.m((double)(f * 1.5707964f));
    }

    public static float j(float f) {
        return 1.0f - (float)Math.pow(1.0 - (double)f, 5.0);
    }

    public static float U(float f) {
        if (f < 0.5f) {
            return 4.0f * class04995.U((float)f);
        }
        return (float)(1.0 - Math.pow(-2.0 * (double)f + 2.0, 3.0) / 2.0);
    }

    public static float z(float f) {
        if (f < 0.5f) {
            return (float)((1.0 - Math.sqrt(1.0 - Math.pow(2.0 * (double)f, 2.0))) / 2.0);
        }
        return (float)((Math.sqrt(1.0 - Math.pow(-2.0 * (double)f + 2.0, 2.0)) + 1.0) / 2.0);
    }

    public static float u(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        if (f == 1.0f) {
            return 1.0f;
        }
        float f2 = 2.0943952f;
        return (float)(-Math.pow(2.0, 10.0 * (double)f - 10.0) * Math.sin(((double)f * 10.0 - 10.75) * 2.094395160675049));
    }

    public static float y(float f) {
        return 1.0f - class08173.P(1.0f - f);
    }

    public static float E(float f) {
        if (f < 0.5f) {
            return 2.0f * class04995.z((float)f);
        }
        return (float)(1.0 - Math.pow(-2.0 * (double)f + 2.0, 2.0) / 2.0);
    }

    public static float N(float f) {
        float f2 = 1.70158f;
        float f3 = 2.70158f;
        return class04995.z((float)f) * (2.70158f * f - 1.70158f);
    }

    public static float W(float f) {
        if (f < 0.5f) {
            return 8.0f * class04995.z((float)class04995.z((float)f));
        }
        return (float)(1.0 - Math.pow(-2.0 * (double)f + 2.0, 4.0) / 2.0);
    }

    public static float R(float f) {
        return class04995.z((float)class04995.z((float)f));
    }

    public static float O(float f) {
        float f2 = 1.70158f;
        float f3 = 2.5949094f;
        if (f < 0.5f) {
            return 4.0f * f * f * (7.189819f * f - 2.5949094f) / 2.0f;
        }
        float f4 = 2.0f * f - 2.0f;
        return (f4 * f4 * (3.5949094f * f4 + 2.5949094f) + 2.0f) / 2.0f;
    }

    public static float G(float f) {
        return 1.0f - class04995.z((float)class04995.z((float)(1.0f - f)));
    }

    public static float Y(float f) {
        float f2 = 1.3962635f;
        if (f == 0.0f) {
            return 0.0f;
        }
        if (f == 1.0f) {
            return 1.0f;
        }
        double d = Math.sin((20.0 * (double)f - 11.125) * 1.3962634801864624);
        if (f < 0.5f) {
            return (float)(-(Math.pow(2.0, 20.0 * (double)f - 10.0) * d) / 2.0);
        }
        return (float)(Math.pow(2.0, -20.0 * (double)f + 10.0) * d / 2.0 + 1.0);
    }
}

