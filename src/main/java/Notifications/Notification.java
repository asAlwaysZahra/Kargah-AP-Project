package Notifications;

import Main.Post;
import Main.UserAccount;

public abstract class Notification {

    private UserAccount user;
    private Post post;
    private String notifText;

    public Notification(UserAccount user, Post post, String notifText) {
        this.user = user;
        this.post = post;
        this.notifText = notifText;
    }

    // Getters and Setters ================================================


    public UserAccount getUser() {
        return user;
    }

    public void setUser(UserAccount user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getNotifText() {
        return notifText;
    }

    public void setNotifText(String notifText) {
        this.notifText = notifText;
    }
}
