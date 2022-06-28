package Main;

import java.util.Scanner;

public class UserMenu {
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        while (true) {
            System.out.println("--- User Menu ---");
            System.out.println("[1] Add Request");
            System.out.println("[2] Edit Info");
            System.out.println("[3] New Post");
            System.out.println("[4] Remove Post");
            System.out.println("[5] Edit Post");
            System.out.println("[6] Reply Comment");
            System.out.println("[7] Delete Comment");
            System.out.println("[8] Your Saved Post");
            System.out.println("[9] Follow Nakonandegan");
            System.out.println("[10] Tarafdarha");
            System.out.println("[11] Follow backs");
            System.out.println("[12] Recently Unfollowers");
            System.out.println("[13] Your Recently Unfollows");
            System.out.println("[14] Sort Posts (by likes)");
            System.out.println("[15] Sort Posts (by comments)");
            System.out.println("[16] The Most Hated Post");
            System.out.println("[17] The Most Popular Post");
            System.out.println("[18] Follower With The Most Like");
            System.out.println("[19] Follower With The Most Comment");
            System.out.println("[20] Followers With No Likes");
            System.out.println("[21] Followers With No Comments");
            System.out.println("[22] Unfollowers"); // 16
            System.out.println("[23] Your Requests");
            
            int n = sc.nextInt();

            switch (n) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:

                    break;

                case 9:

                    break;

                case 10:

                    break;

                case 11:

                    break;

                case 12:

                    break;

                case 13:

                    break;

                case 14:

                    break;

                case 15:

                    break;

                case 16:

                    break;

                case 17:

                    break;

                case 18:

                    break;

                case 19:

                    break;

                case 20:

                    break;

                case 21:

                    break;

                case 22:

                    break;

                case 23:

                    break;

                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
}
