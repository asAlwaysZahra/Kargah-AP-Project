package Main;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

    public static List<UserAccount> allUsers = new ArrayList<>();
    public static UserAccount userLoggedIn;

    public static boolean login(String ID, String password) {
        for (UserAccount user: allUsers)
            if (user.getID().equals(ID)) {

                if (user.getPassword().equals(password)) {

                    userLoggedIn = user;
                    return true;

                } else {
                    //todo wrong password exception
                }

            } else {
                //todo wrong ID exception
            }

        return false;
    }
    // -----------------------------------------------------------------------------
    public static ArrayList<UserAccount> didntFollow() {
        ArrayList<UserAccount> accounts = new ArrayList<>();

        for (UserAccount u1: userLoggedIn.getFollowing()) {
            boolean found = false;
            for (UserAccount u2 : u1.getFollowing())
                if (u2.equals(userLoggedIn)) {
                    found = true;
                    break;
                }
            if (!found)
                accounts.add(u1);
        }

        return accounts;
    }
    // -----------------------------------------------------------------------------
    public static ArrayList<UserAccount> tarafdarHa() {
        ArrayList<UserAccount> accounts = new ArrayList<>();

        for (UserAccount u1: userLoggedIn.getFollowers()) {
            boolean found = false;
            for (UserAccount u2 : userLoggedIn.getFollowing())
                if (u2.equals(u1)) {
                    found = true;
                    break;
                }
            if (!found)
                accounts.add(u1);
        }

        return accounts;
    }
    // -----------------------------------------------------------------------------
    public static ArrayList<UserAccount> followBack() {
        ArrayList<UserAccount> accounts = new ArrayList<>();

        for (UserAccount u1: userLoggedIn.getFollowers()) {
            boolean found = false;
            for (UserAccount u2 : userLoggedIn.getFollowing())
                if (u2.equals(u1)) {
                    found = true;
                    break;
                }
            if (found)
                accounts.add(u1);
        }

        return accounts;
    }
    // -----------------------------------------------------------------------------
    public static UserAccount theMostLikes() {
        // element i -> follower i likes
        int[] likesNumber = new int[userLoggedIn.getFollowers().size()];

        for (Post p : userLoggedIn.getPosts())
            for (Like like : p.getLikes())
                for (int i = 0; i < likesNumber.length; i++)
                    if (userLoggedIn.getFollowers().get(i).equals(like.getUser())) {
                        likesNumber[i]++;
                        break;
                    }

        int maxIndex = 0;
        for (int i : likesNumber)
            if (likesNumber[maxIndex] < likesNumber[i])
                maxIndex = i;


        return userLoggedIn.getFollowers().get(maxIndex);
    }
    // -----------------------------------------------------------------------------
    public static UserAccount theMostComments() {
        // element i -> follower i comments
        int[] commentsNumber = new int[userLoggedIn.getFollowers().size()];

        for (Post p : userLoggedIn.getPosts())
            for (Comment c: p.getComments())
                for (int i = 0; i < commentsNumber.length; i++)
                    if (userLoggedIn.getFollowers().get(i).equals(c.getUser())) {
                        commentsNumber[i]++;
                        break;
                    }

        int maxIndex = 0;
        for (int i : commentsNumber)
            if (commentsNumber[maxIndex] < commentsNumber[i])
                maxIndex = i;


        return userLoggedIn.getFollowers().get(maxIndex);
    }
    // -----------------------------------------------------------------------------
    public static ArrayList<UserAccount> suggestions() {
        ArrayList<UserAccount> accounts = new ArrayList<>();
        ArrayList<UserAccount> followingsOfFollowers = new ArrayList<>();

        for (UserAccount u1 : UserManager.followBack())
            followingsOfFollowers.addAll(u1.getFollowing());

        for (int i = 0; i < followingsOfFollowers.size()-1; i++)
            for (int j = i+1; j < followingsOfFollowers.size(); j++)
                if (followingsOfFollowers.get(i).equals(followingsOfFollowers.get(j))) {
                    accounts.add(followingsOfFollowers.get(j));
                    break;
                }

        if (accounts != null)
            return accounts;
        else
            return followingsOfFollowers;
    }
    // -----------------------------------------------------------------------------
}
