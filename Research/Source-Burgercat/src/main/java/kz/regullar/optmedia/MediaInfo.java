//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package kz.regullar.optmedia;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.Structure.FieldOrder;
import java.nio.charset.StandardCharsets;

@FieldOrder({"title", "artist", "sourceApp", "albumArtPng", "albumArtSize", "isPlaying", "durationMs", "positionMs", "trackChanged"})
public class MediaInfo extends Structure {
    public byte[] title = new byte[512];
    public byte[] artist = new byte[512];
    public byte[] sourceApp = new byte[256];
    public Pointer albumArtPng;
    public int albumArtSize;
    public byte isPlaying;
    public long durationMs;
    public long positionMs;
    public byte trackChanged;

    public MediaInfo() {
        super(1);
    }

    public String getTitle() {
        return this.extractString(this.title);
    }

    public String getArtist() {
        return this.extractString(this.artist);
    }

    public String getSource() {
        return this.extractString(this.sourceApp);
    }

    private String extractString(byte[] bytes) {
        int len;
        for(len = 0; len < bytes.length && bytes[len] != 0; ++len) {
        }

        return new String(bytes, 0, len, StandardCharsets.UTF_8);
    }

    public byte[] getAlbumArt() {
        return this.albumArtPng != null && this.albumArtSize > 0 ? this.albumArtPng.getByteArray(0L, this.albumArtSize) : null;
    }

    public boolean isPlaying() {
        return this.isPlaying != 0;
    }

    public boolean hasTrackChanged() {
        return this.trackChanged != 0;
    }
}
