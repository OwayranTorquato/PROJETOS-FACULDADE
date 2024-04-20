
import java.util.Date;

public class Main {
    public static void main(String[] args){
        User user1 = new User("John Doe", "john@example.com", "password123", new Date(1990, 5, 15));
        User user2 = new User("Jane Smith", "jane@example.com", "password456", new Date(1985, 8, 20));

        // Creating posts
        Post post1 = new Post("Hello World!", new Date());
        Post post2 = new Post("This is my first post.", new Date());

        // Adding posts to users
        user1.addPost(post1);
        user2.addPost(post2);

        // Liking posts
        post1.addLike();
        post1.addLike();
        post2.addLike();

        // Adding comments to posts
        post1.addComment("Nice post!");
        post1.addComment("Keep it up!");
        post2.addComment("Great job!");

        // Displaying information
        System.out.println("User 1: " + user1.getName());
        System.out.println("User 1's Posts:");
        for (Post post : user1.getPosts()) {
            System.out.println("Post: " + post.getText());
            System.out.println("Likes: " + post.getLikes());
            System.out.println("Comments: " + post.getComments());
            System.out.println();
        }

        System.out.println("User 2: " + user2.getName());
        System.out.println("User 2's Posts:");
        for (Post post : user2.getPosts()) {
            System.out.println("Post: " + post.getText());
            System.out.println("Likes: " + post.getLikes());
            System.out.println("Comments: " + post.getComments());
            System.out.println();
        }
    }
}
  
