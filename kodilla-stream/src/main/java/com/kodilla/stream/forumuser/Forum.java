package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1,"Greg",'M',1994,10,21,7));
        userList.add(new ForumUser(2, "Martha",'F',1976,5,4,2));
        userList.add(new ForumUser(3,"Mike",'M',2000,9,9,0));
        userList.add(new ForumUser(4,"Tammy",'F',1988,3,20,0));
        userList.add(new ForumUser(5,"Bobby",'M',2010,7,30,25));

    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(userList);
    }
}
