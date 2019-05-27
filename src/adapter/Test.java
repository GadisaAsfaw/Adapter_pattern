/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author gadisa
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MediaPlayerAdapter mpa = new MediaPlayerAdapter(new VlcPlayer(),new Mp4Player());
        MediaPlayer  audioPlayer = new AudioPlayer(mpa);
        
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
        
        
        
        
        
        
        
        
    }
    
}
