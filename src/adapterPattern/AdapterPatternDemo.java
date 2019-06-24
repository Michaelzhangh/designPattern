package adapterPattern;

/**
 * @author zhangh
 * @create 2019-06-24
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","beyond the horizon.mp3");
        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("vlc","far far away.vlc");
        audioPlayer.play("avi","mind me.avi");

        /**
         *   执行结果如下：
         * Playing mp3 file. Name: beyond the horizon.mp3
         * Playing mp4 file. Name: alone.mp4
         * Playing vlc file. Name: far far away.vlc
         * Invalid media. avi format not supported
         */

    }
}
