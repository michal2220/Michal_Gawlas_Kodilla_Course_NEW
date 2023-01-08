package com.kodilla.stream;

import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.person.People;
import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;

import java.math.BigDecimal;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() =='M')
                .filter(forumUser -> forumUser.getBirthYear()<= 2002)
                .filter(forumUser -> forumUser.getPostCount()>0)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));



        resultMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


        Continent asia = new Continent("asia");
        Continent europe = new Continent("europe");
        Country china = new Country("China" , new BigDecimal("10012031023"));
        Country malesia = new Country("China" , new BigDecimal("10012031023"));
        Country india = new Country("China" , new BigDecimal("10012031023"));

        asia.addCountry(new Country("china", new BigDecimal("10")));
        asia.addCountry(malesia);
        europe.addCountry(new Country("poland",new BigDecimal(123)));
        World world = new World();
        world.addContinent(asia);
        world.addContinent(europe);

        System.out.println(world);


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        System.out.println();

        People.getList().stream()
                .filter(s->s.length()>11)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println();

        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(s -> s.getYearOfPublication() > 2005)
                .forEach(System.out::println);


    }


}

