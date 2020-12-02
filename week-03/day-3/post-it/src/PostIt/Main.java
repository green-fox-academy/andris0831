package PostIt;

public class Main {
    public static void main(String[] args) {
        PostIt firstPost = new PostIt();
        firstPost.backgroundColor = "orange";
        firstPost.text = "Idea 1";
        firstPost.textColor = "blue";

        PostIt secondPost = new PostIt();
        secondPost.backgroundColor = "pink";
        secondPost.text = "Awesome";
        secondPost.textColor = "black";

        PostIt thirdPost = new PostIt();
        thirdPost.backgroundColor = "yellow";
        thirdPost.text = "Superb!";
        thirdPost.textColor = "green";

        System.out.println(firstPost.backgroundColor + ", " + firstPost.text + ", " + firstPost.textColor);
        System.out.println(secondPost.backgroundColor + ", " + secondPost.text + ", " + secondPost.textColor);
        System.out.println(thirdPost.backgroundColor + ", " + thirdPost.text + ", " + thirdPost.textColor);
    }
}
