import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private String text;
    private Date postDate;
    private int likes;
    private List<String> comments;

    public Post(String text, Date postDate) {
        this.text = text;
        this.postDate = postDate;
        this.likes = 0;
        this.comments = new ArrayList<>();
    }

    // Getters and setters

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<String> getComments() {
        return comments;
    }

    public void addLike() {
        this.likes++;
    }

    public void addComment(String comment) {
        this.comments.add(comment);
    }
}