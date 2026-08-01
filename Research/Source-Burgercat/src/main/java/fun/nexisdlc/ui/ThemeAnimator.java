package fun.nexisdlc.ui;

public final class ThemeAnimator {
    private static final long DUR_MS = 300L;

    private static boolean first = true;
    private static long start = 0L;
    private static HudTheme target;

    private static float bgR, bgG, bgB, bgA;
    private static float sidebarR, sidebarG, sidebarB, sidebarA;
    private static float cardR, cardG, cardB, cardA;
    private static float cardHoverR, cardHoverG, cardHoverB, cardHoverA;
    private static float accentR, accentG, accentB, accentA;
    private static float accentHoverR, accentHoverG, accentHoverB, accentHoverA;
    private static float textR, textG, textB, textA;
    private static float textDimR, textDimG, textDimB, textDimA;
    private static float tagBgR, tagBgG, tagBgB, tagBgA;
    private static float headerR, headerG, headerB, headerA;
    private static float separatorR, separatorG, separatorB, separatorA;

    private static float fBgR, fBgG, fBgB, fBgA;
    private static float fSidebarR, fSidebarG, fSidebarB, fSidebarA;
    private static float fCardR, fCardG, fCardB, fCardA;
    private static float fCardHoverR, fCardHoverG, fCardHoverB, fCardHoverA;
    private static float fAccentR, fAccentG, fAccentB, fAccentA;
    private static float fAccentHoverR, fAccentHoverG, fAccentHoverB, fAccentHoverA;
    private static float fTextR, fTextG, fTextB, fTextA;
    private static float fTextDimR, fTextDimG, fTextDimB, fTextDimA;
    private static float fTagBgR, fTagBgG, fTagBgB, fTagBgA;
    private static float fHeaderR, fHeaderG, fHeaderB, fHeaderA;
    private static float fSeparatorR, fSeparatorG, fSeparatorB, fSeparatorA;

    private ThemeAnimator() {}

    public static void setTarget(HudTheme theme) {
        if (target == theme && !first) return;
        captureFrom();
        target = theme;
        if (first) {
            snap();
            first = false;
        } else {
            start = System.currentTimeMillis();
        }
    }

    public static void snapTarget(HudTheme theme) {
        target = theme;
        snap();
        first = false;
    }

    private static void captureFrom() {
        fBgR = bgR; fBgG = bgG; fBgB = bgB; fBgA = bgA;
        fSidebarR = sidebarR; fSidebarG = sidebarG; fSidebarB = sidebarB; fSidebarA = sidebarA;
        fCardR = cardR; fCardG = cardG; fCardB = cardB; fCardA = cardA;
        fCardHoverR = cardHoverR; fCardHoverG = cardHoverG; fCardHoverB = cardHoverB; fCardHoverA = cardHoverA;
        fAccentR = accentR; fAccentG = accentG; fAccentB = accentB; fAccentA = accentA;
        fAccentHoverR = accentHoverR; fAccentHoverG = accentHoverG; fAccentHoverB = accentHoverB; fAccentHoverA = accentHoverA;
        fTextR = textR; fTextG = textG; fTextB = textB; fTextA = textA;
        fTextDimR = textDimR; fTextDimG = textDimG; fTextDimB = textDimB; fTextDimA = textDimA;
        fTagBgR = tagBgR; fTagBgG = tagBgG; fTagBgB = tagBgB; fTagBgA = tagBgA;
        fHeaderR = headerR; fHeaderG = headerG; fHeaderB = headerB; fHeaderA = headerA;
        fSeparatorR = separatorR; fSeparatorG = separatorG; fSeparatorB = separatorB; fSeparatorA = separatorA;
    }

    private static void snap() {
        if (target == null) target = HudTheme.MIDNIGHT;
        bgR = target.bgR; bgG = target.bgG; bgB = target.bgB; bgA = target.bgA;
        sidebarR = target.sidebarR; sidebarG = target.sidebarG; sidebarB = target.sidebarB; sidebarA = target.sidebarA;
        cardR = target.cardR; cardG = target.cardG; cardB = target.cardB; cardA = target.cardA;
        cardHoverR = target.cardHoverR; cardHoverG = target.cardHoverG; cardHoverB = target.cardHoverB; cardHoverA = target.cardHoverA;
        accentR = target.accentR; accentG = target.accentG; accentB = target.accentB; accentA = target.accentA;
        accentHoverR = target.accentHoverR; accentHoverG = target.accentHoverG; accentHoverB = target.accentHoverB; accentHoverA = target.accentHoverA;
        textR = target.textR; textG = target.textG; textB = target.textB; textA = target.textA;
        textDimR = target.textDimR; textDimG = target.textDimG; textDimB = target.textDimB; textDimA = target.textDimA;
        tagBgR = target.tagBgR; tagBgG = target.tagBgG; tagBgB = target.tagBgB; tagBgA = target.tagBgA;
        headerR = target.headerR; headerG = target.headerG; headerB = target.headerB; headerA = target.headerA;
        separatorR = target.separatorR; separatorG = target.separatorG; separatorB = target.separatorB; separatorA = target.separatorA;
        start = 0;
    }

    private static void update() {
        if (start == 0 || target == null) return;
        long e = System.currentTimeMillis() - start;
        if (e >= DUR_MS) { snap(); start = 0; return; }
        float t = e / (float) DUR_MS;
        t = t * t * (3f - 2f * t);
        bgR = fBgR + (target.bgR - fBgR) * t; bgG = fBgG + (target.bgG - fBgG) * t; bgB = fBgB + (target.bgB - fBgB) * t; bgA = fBgA + (target.bgA - fBgA) * t;
        sidebarR = fSidebarR + (target.sidebarR - fSidebarR) * t; sidebarG = fSidebarG + (target.sidebarG - fSidebarG) * t; sidebarB = fSidebarB + (target.sidebarB - fSidebarB) * t; sidebarA = fSidebarA + (target.sidebarA - fSidebarA) * t;
        cardR = fCardR + (target.cardR - fCardR) * t; cardG = fCardG + (target.cardG - fCardG) * t; cardB = fCardB + (target.cardB - fCardB) * t; cardA = fCardA + (target.cardA - fCardA) * t;
        cardHoverR = fCardHoverR + (target.cardHoverR - fCardHoverR) * t; cardHoverG = fCardHoverG + (target.cardHoverG - fCardHoverG) * t; cardHoverB = fCardHoverB + (target.cardHoverB - fCardHoverB) * t; cardHoverA = fCardHoverA + (target.cardHoverA - fCardHoverA) * t;
        accentR = fAccentR + (target.accentR - fAccentR) * t; accentG = fAccentG + (target.accentG - fAccentG) * t; accentB = fAccentB + (target.accentB - fAccentB) * t; accentA = fAccentA + (target.accentA - fAccentA) * t;
        accentHoverR = fAccentHoverR + (target.accentHoverR - fAccentHoverR) * t; accentHoverG = fAccentHoverG + (target.accentHoverG - fAccentHoverG) * t; accentHoverB = fAccentHoverB + (target.accentHoverB - fAccentHoverB) * t; accentHoverA = fAccentHoverA + (target.accentHoverA - fAccentHoverA) * t;
        textR = fTextR + (target.textR - fTextR) * t; textG = fTextG + (target.textG - fTextG) * t; textB = fTextB + (target.textB - fTextB) * t; textA = fTextA + (target.textA - fTextA) * t;
        textDimR = fTextDimR + (target.textDimR - fTextDimR) * t; textDimG = fTextDimG + (target.textDimG - fTextDimG) * t; textDimB = fTextDimB + (target.textDimB - fTextDimB) * t; textDimA = fTextDimA + (target.textDimA - fTextDimA) * t;
        tagBgR = fTagBgR + (target.tagBgR - fTagBgR) * t; tagBgG = fTagBgG + (target.tagBgG - fTagBgG) * t; tagBgB = fTagBgB + (target.tagBgB - fTagBgB) * t; tagBgA = fTagBgA + (target.tagBgA - fTagBgA) * t;
        headerR = fHeaderR + (target.headerR - fHeaderR) * t; headerG = fHeaderG + (target.headerG - fHeaderG) * t; headerB = fHeaderB + (target.headerB - fHeaderB) * t; headerA = fHeaderA + (target.headerA - fHeaderA) * t;
        separatorR = fSeparatorR + (target.separatorR - fSeparatorR) * t; separatorG = fSeparatorG + (target.separatorG - fSeparatorG) * t; separatorB = fSeparatorB + (target.separatorB - fSeparatorB) * t; separatorA = fSeparatorA + (target.separatorA - fSeparatorA) * t;
    }

    public static float getBgR()       { update(); return bgR; }
    public static float getBgG()       { update(); return bgG; }
    public static float getBgB()       { update(); return bgB; }
    public static float getBgA()       { update(); return bgA; }
    public static float getSidebarR()  { update(); return sidebarR; }
    public static float getSidebarG()  { update(); return sidebarG; }
    public static float getSidebarB()  { update(); return sidebarB; }
    public static float getSidebarA()  { update(); return sidebarA; }
    public static float getCardR()     { update(); return cardR; }
    public static float getCardG()     { update(); return cardG; }
    public static float getCardB()     { update(); return cardB; }
    public static float getCardA()     { update(); return cardA; }
    public static float getCardHoverR(){ update(); return cardHoverR; }
    public static float getCardHoverG(){ update(); return cardHoverG; }
    public static float getCardHoverB(){ update(); return cardHoverB; }
    public static float getCardHoverA(){ update(); return cardHoverA; }
    public static float getAccentR()   { update(); return accentR; }
    public static float getAccentG()   { update(); return accentG; }
    public static float getAccentB()   { update(); return accentB; }
    public static float getAccentA()   { update(); return accentA; }
    public static float getAccentHoverR(){ update(); return accentHoverR; }
    public static float getAccentHoverG(){ update(); return accentHoverG; }
    public static float getAccentHoverB(){ update(); return accentHoverB; }
    public static float getAccentHoverA(){ update(); return accentHoverA; }
    public static float getTextR()     { update(); return textR; }
    public static float getTextG()     { update(); return textG; }
    public static float getTextB()     { update(); return textB; }
    public static float getTextA()     { update(); return textA; }
    public static float getTextDimR()  { update(); return textDimR; }
    public static float getTextDimG()  { update(); return textDimG; }
    public static float getTextDimB()  { update(); return textDimB; }
    public static float getTextDimA()  { update(); return textDimA; }
    public static float getTagBgR()    { update(); return tagBgR; }
    public static float getTagBgG()    { update(); return tagBgG; }
    public static float getTagBgB()    { update(); return tagBgB; }
    public static float getTagBgA()    { update(); return tagBgA; }
    public static float getHeaderR()   { update(); return headerR; }
    public static float getHeaderG()   { update(); return headerG; }
    public static float getHeaderB()   { update(); return headerB; }
    public static float getHeaderA()   { update(); return headerA; }
    public static float getSeparatorR(){ update(); return separatorR; }
    public static float getSeparatorG(){ update(); return separatorG; }
    public static float getSeparatorB(){ update(); return separatorB; }
    public static float getSeparatorA(){ update(); return separatorA; }
}
