package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import exceptions.*;

// for test
public class Main {

    public static List<UserAccount> allUsers = new ArrayList<>();
    public static UserAccount userLoggedIn;

    public static void main(String[] args) {
    }


    public static void print(Object o)
    {
        System.out.println(o);
    }

    public static List<UserAccount> userNotLiked()
    {
        List < UserAccount> FoundUsers=new ArrayList<>();
        boolean hasEverLiked=false;

        for (UserAccount user : userLoggedIn.getFollowers())
            for (Post eachPost : userLoggedIn.getPosts()) {
                for (Like like : eachPost.getLikes()) {
                    if (like.getUser() == user)
                        hasEverLiked = true;
                }
                if (hasEverLiked)
                    FoundUsers.add(user);
                hasEverLiked=false;
            }

        return FoundUsers;
    }

    public static List<UserAccount> userNotCommented() {

        List<UserAccount> FoundUsers = new ArrayList<>();
        boolean hasEverCommented = false;

        for (UserAccount user : userLoggedIn.getFollowers())
            for (Post eachPost : userLoggedIn.getPosts()) {
                for (Comment comment : eachPost.getComments()) {
                    if (comment.getUser() == user)
                        hasEverCommented = true;
                }
                if (hasEverCommented)
                    FoundUsers.add(user);
                hasEverCommented = false;
            }

        return FoundUsers;
    }

    public static void deleteUser(UserAccount user)
    {
        //delete from all users
        int index=0;
        for (UserAccount eachUser : allUsers)
        {
            if (user==eachUser)
            {
                allUsers.remove(index);
                break;
            }
            ++index;
        }

        //delete all the user comments and likes
        for (UserAccount other_user : allUsers)
        {
            for (Post post : other_user.getPosts())
            {
                //deleting the user comments
                index=0;
                for (Comment comment : post.getComments())
                {
                    if (comment.getUser() == other_user)
                        post.getComments().remove(index);
                        ++index;
                }
                //deleting likes
                index=0;
                for (Like like : post.getLikes())
                {
                    if (like.getUser()==other_user) {
                        post.getLikes().remove(index);
                        if (like.isLike())
                            post.setLikeNumber(post.getLikeNumber()-1);
                        else
                            post.setDislikeNumber(post.getDislikeNumber()-1);
                    }
                    ++index;
                }
            }
        }

    }

    public static void UserEditProfile(String [] order , String [] change)throws wrongID
    {
        //order and change always be the same sizes
        for(int i=0 ; i<order.length;++i) {

            switch (order[i]) {
                case "NAME":
                    userLoggedIn.setName(change[i]);
                    break;
                case "BIO":
                    userLoggedIn.setBio(change[i]);
                    break;
                case "PHONE NUMBER":
                    userLoggedIn.setPhoneNumber(change[i]);
                    break;
                case "BIRTH DATE":
                    userLoggedIn.setBirthDay(change[i]);
                    break;
                case "PASSWORD":
                    userLoggedIn.setPassword(change[i]);
                    break;
                case "TYPE":
                    userLoggedIn.setType(UserAccount.AccountType.valueOf(change[i]));
                    break;
                case "ID":
                    checkID(change[i]);
                    userLoggedIn.setID(change[i]);
                    break;
            }
        }
    }

    public static void checkID(String ID) throws wrongID
    {
        for (UserAccount user : allUsers)
        {
            if (user.getID().equals(ID))
                throw new wrongID();
        }
    }

    public static void postOrganizing(UserAccount user)
    {
        //organizing from the most liked to the least
        Collections.sort(user.getPosts());

        for (Post post : user.getPosts())
            print(post.toString());

    }

}
