//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package kz.regullar.optmedia;

import com.sun.jna.win32.StdCallLibrary;

public interface MediaLibrary extends StdCallLibrary {
    int OPTION_FUNCTION_MAPPER = Integer.parseInt("function-mapper");

    boolean GetCurrentMediaInfo(MediaInfo var1);

    boolean GetCurrentPositionInfo(PositionInfo var1);

    void FreeMediaInfo(MediaInfo var1);

    void ClearCache();

    boolean Play();

    boolean Pause();

    boolean TogglePlayPause();

    boolean SkipNext();

    boolean SkipPrevious();

    boolean SeekToMs(long var1);
}
