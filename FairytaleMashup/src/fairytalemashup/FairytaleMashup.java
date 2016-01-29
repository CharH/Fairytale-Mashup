/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup;

import fairytalemashup.model.Guidebook;
import fairytalemashup.model.Location;
import fairytalemashup.model.Map;
import fairytalemashup.model.ResourceGathering;

/**
 *
 * @author charlottehuyett
 */
public class FairytaleMashup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Guidebook test
        Guidebook guidebookThing = new Guidebook();
        
        guidebookThing.setFairytaleDescription("Girl gets new shoes and marries a Prince.");
        guidebookThing.setItemsAvailable(7.5);
        guidebookThing.setChallengesAvailable("Fight a giant");
        guidebookThing.setChallengeScore(0.86);
        guidebookThing.setChallengesCompleted(2);
        guidebookThing.setLocationDescription("Pretty forest");
        
        String guidebookInfo = guidebookThing.toString();
        System.out.println(guidebookInfo);
    //Map test
        Map mapTest = new Map();
        
        mapTest.setColumnCount(4);
        mapTest.setRowCount(7);
        
        String mapInfo = mapTest.toString();
        System.out.println(mapInfo);
        
    //Location test
        Location locationTest = new Location();
        
        locationTest.setColumn(3);
        locationTest.setRow(9);
        locationTest.setVisited(false);
        locationTest.setLocationName("Enchanted Forest");
        locationTest.setLocationDescription("Lots and lots of trees plus a unicorn or two.");
        
        String locationInfo = locationTest.toString();
        System.out.println(locationInfo);
        
    //ResourceGathering test
        ResourceGathering gatheringTest = new ResourceGathering();
    
        gatheringTest.setRow(1);
        gatheringTest.setColumn(3);
        gatheringTest.setResourceType("Spell Ingredient");
        gatheringTest.setResourceAmount(0);
        gatheringTest.setRenewalTimer(60);
        
        String gatheringInfo = gatheringTest.toString();
        System.out.println(gatheringInfo);
        
    }
    
}
