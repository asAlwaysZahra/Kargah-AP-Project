package Main;

import java.util.List;

public class Post {

    private String text;
    private List<Like> likes;
    private int likeNumber;
    private int dislikeNumber;
    private List<Comment> comments;

    public Post(String text) {
        this.text = text;
        this.likeNumber = 0;
        this.dislikeNumber = 0;
    }

    // Getters and Setters ================================================


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public int getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(int likeNumber) {
        this.likeNumber = likeNumber;
    }

    public int getDislikeNumber() {
        return dislikeNumber;
    }

    public void setDislikeNumber(int dislikeNumber) {
        this.dislikeNumber = dislikeNumber;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
