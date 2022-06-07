package Main;

import java.util.ArrayList;
import java.util.List;

public class UserAccount {

    private AccountType type;
    private String name;
    private String birthDay;
    private String phoneNumber;
    private String ID;
    private String password;
    private String bio;
    private List<UserAccount> followers;
    private List<UserAccount> following;
    private List<Post> posts;
    private List<UserAccount> requests;
    private List<UserAccount> unfollowers;
    private List <UserAccount> unfollowed_you;
    private List <Notification> notifications;

    public UserAccount(AccountType type, String name, String birthDay,
                       String phoneNumber, String ID, String password, String bio)
    {
        this.type = type;
        this.name = name;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
        this.ID = ID;
        this.password = password;
        this.bio = bio;

        followers = new ArrayList<>();
        following = new ArrayList<>();
        posts = new ArrayList<>();
        requests = new ArrayList<>();
        unfollowers = new ArrayList<>();
    }

    public enum AccountType {
        PRIVATE, PUBLIC
    }

    // Getters and Setters ================================================

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<UserAccount> getFollowers() {
        return followers;
    }

    public void setFollowers(UserAccount follower) {
        this.followers.add(follower);
    }

    public List<UserAccount> getFollowing() {
        return following;
    }

    public void setFollowing(UserAccount following) {
        this.following.add(following);
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(Post post) {
        this.posts.add(post);
    }

    public List<UserAccount> getRequests() {
        return requests;
    }

    public void setRequests(UserAccount request) {
        this.requests.add(request);
    }

    public List<UserAccount> getUnfollowers() {
        return unfollowers;
    }

    public void setUnfollowers(UserAccount unfollower) {
        this.unfollowers.add(unfollower);
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(Notification notifications) {
        this.notifications.add(notifications);
    }

    public List<UserAccount> getUnfollowed_you() {
        return unfollowed_you;
    }

    public void setUnfollowed_you(UserAccount unfollowed_you) {
        this.unfollowed_you.add( unfollowed_you) ;
    }
}
