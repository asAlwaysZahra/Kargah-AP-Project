package Main;

import java.util.ArrayList;
import java.util.List;

public class PostManager {

    public static List<Post> allPosts = new ArrayList<>();

    // kimia -----------------------------------------------------------------------
    public static void unpopularPosts() {

        double aveDislikeNum = 0;

        for (Post allPost : allPosts){
            aveDislikeNum += allPost.getDislikeNumber();
        }
        aveDislikeNum /= allPosts.size();

        for (Post allPost : allPosts){
            if (allPost.getDislikeNumber() > aveDislikeNum)
                System.out.println(allPost);
        }
    }
}
