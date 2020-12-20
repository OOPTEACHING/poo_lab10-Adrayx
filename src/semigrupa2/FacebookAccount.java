package semigrupa2;

import java.util.ArrayList;

public class FacebookAccount {
    private String name;
    private int age;
    private String currentLocation;
    private ArrayList<FacebookAccount> friends;
    private int numFriends;

    public FacebookAccount(String name, int age, String currentLocation)
    {
        this.name = name;
        this.age = age;
        this.currentLocation = currentLocation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getCurrentLocation()
    {
        return currentLocation;
    }

    public boolean equals(FacebookAccount person)
    {
        if(this.name.contentEquals(person.name) && this.age == person.age && this.currentLocation == person.currentLocation)
            return true;
        else
            return false;
    }

    public void addFriend(FacebookAccount person)
    {
        this.friends.add(person);
        numFriends++;
    }

    public void clearFriendList()
    {
        this.friends.clear();
        numFriends = 0;
    }

    public void removeFriend(FacebookAccount person)
    {
        if(friends.isEmpty()) {
            System.out.println("Friends list is already empty");
            return;
        }
        if(friends.contains(person))
        {
            friends.remove(person);
        }
        else
        {
            System.out.println("This person doesn't exist in the friends list");
        }
    }

    public void removeFriend(String name, int age)
    {
        if(friends.isEmpty()) {
            System.out.println("Friends list is already empty");
            return;
        }
        for(FacebookAccount friend : friends)
        {
            if(friend.name.contentEquals(name) && friend.age == age)
            {
                friends.remove(friend);
                return;
            }
        }
    }

    public void removeFriendsLocation(String location)
    {
        if(friends.isEmpty()) {
            System.out.println("Friends list is already empty");
            return;
        }
        int count = 0;
        for(FacebookAccount friend : friends)
        {
            if(friend.currentLocation.contentEquals(location))
            {
                friends.remove(friend);
                count++;
            }
        }
        System.out.println(count + "Have been removed");
    }
}
