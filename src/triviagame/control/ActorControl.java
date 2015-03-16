/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.control;

import triviagame.model.Actor;
import triviagame.model.CountryMusic;

/**
 *
 * @author carri_000
 */
public class ActorControl {
    private static ActorControl[] ActorControl;
    public static ActorControl[] createActorList() {
             ActorControl[][] newActorControl = null;
        ActorControl[] ActorNew = 
                new ActorControl[3];
        ActorControl RyanSeacrest = new ActorControl();
        RyanSeacrest.setDescription("He is the celebrity game show host.");
        ActorNew [Actor.RyanSeacrest.ordinal()] = RyanSeacrest;
        
        ActorControl StevenTyler = new ActorControl();
        StevenTyler.setDescription("He is the lead singer of areosmith and an 80's Rock Legend.");
        ActorNew [Actor.StevenTyler.ordinal()] = StevenTyler;
        
        ActorControl RebaMcEntire = new ActorControl();
        RebaMcEntire.setDescription("She is an 80's Country Singer");
        ActorNew[Actor.RebaMcEntire.ordinal()] = RebaMcEntire;
        
        ActorControl MichaelJackson = new ActorControl();
        MichaelJackson.setDescription("He is an 80's Pop legend");
        ActorNew [Actor.MichaelJackson.ordinal()] = MichaelJackson;
        
        return ActorNew;
        
        
        
    }

    private void setDescription(String he_is_the_celebrity_game_show_host) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

