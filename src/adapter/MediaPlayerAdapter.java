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
public class MediaPlayerAdapter implements MediaPlayer {
    AdvancedMediaPlayer vlcPlayer;
    AdvancedMediaPlayer mp4Player;
    
    public MediaPlayerAdapter(AdvancedMediaPlayer vlcPlayer,AdvancedMediaPlayer mp4Player){
        this.vlcPlayer = vlcPlayer;
        this.mp4Player = mp4Player;
    
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType == "vlc"){
            vlcPlayer.playVlc(fileName);
        }
        else if(audioType == "mp4"){
            mp4Player.playMp4(fileName);
        }
        else{
        System.out.println("Audo file  "+ audioType+"  not Supported");
        }
        
        
        
          }
    
}
