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
public class AudioPlayer implements MediaPlayer{
     MediaPlayer mediaPlayer;
    public AudioPlayer(MediaPlayer mediaPlayer){
        this.mediaPlayer = mediaPlayer;
    
    }

    @Override
    public void play(String audioType, String fileName) {
        mediaPlayer.play(audioType, fileName);
        }
    
}
