package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){

        //Given
        User millennial = new Millenials("Millennial");
        User yGeneration = new YGeneration("yGeneration");
        User zGeneration = new ZGeneration("zGeneration");

        //When
        String millennialSocial = millennial.publish();
        String yGenSocial = yGeneration.publish();
        String zGenSocial = zGeneration.publish();
        System.out.println(millennialSocial);
        System.out.println(yGenSocial);
        System.out.println(zGenSocial);

        //Then
        assertEquals("Twitter", millennialSocial);
        assertEquals("Facebook", yGenSocial);
        assertEquals("Snapchat", zGenSocial);
    }

    @Test
    public void testIndividualSharingStrategy(){

        //Given
        User millennial = new Millenials("Millennial");

        //When
        String millennialSocial = millennial.publish();
        System.out.println(millennialSocial);
        millennial.setSocialPublisher(new SnapchatPublisher());
        millennialSocial = millennial.publish();
        System.out.println(millennialSocial);

        //Then
        assertEquals("Snapchat", millennialSocial);
    }
}
