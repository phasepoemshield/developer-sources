//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package kz.regullar.optmedia;

import com.sun.jna.Structure;
import com.sun.jna.Structure.FieldOrder;

@FieldOrder({"isPlaying", "durationMs", "positionMs"})
public class PositionInfo extends Structure {
    public byte isPlaying;
    public long durationMs;
    public long positionMs;

    public PositionInfo() {
        super(1);
    }

    public boolean isPlaying() {
        return this.isPlaying != 0;
    }
}
