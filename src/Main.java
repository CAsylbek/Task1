import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum ac tincidunt massa. Suspendisse bibendum quam vitae neque consequat, sed sagittis turpis tincidunt. Nulla nec tincidunt risus. Vestibulum velit dui, viverra at justo ac, feugiat mattis libero. Morbi at molestie odio, sit amet consectetur lacus. Sed mattis neque pharetra hendrerit varius. Vivamus id feugiat sapien. Nulla porta justo vitae lorem congue, sed accumsan lacus lacinia. Quisque purus elit, suscipit ut metus eget, dictum ornare leo. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Maecenas quam magna, malesuada vulputate dapibus eu, volutpat sit amet tellus. Sed non tortor porta, dapibus lacus ut, vulputate nisl. Vivamus interdum felis non sapien pulvinar convallis. Aenean id imperdiet quam. Phasellus ultricies justo lectus, sit amet volutpat lacus porttitor sed. Maecenas sed dolor risus.\n" +
                "\n" +
                "Vestibulum sed nisl posuere, ornare nisi nec, egestas ligula. Aliquam feugiat congue ligula, at tincidunt elit convallis a. Aliquam nibh justo, gravida aliquam facilisis non, vulputate et tellus. Integer eros velit, auctor sit amet bibendum sodales, rutrum porttitor sem. Nunc ullamcorper eu quam in venenatis. Cras sit amet tincidunt lectus. Cras pharetra nibh sed lectus ornare, eu consequat erat rhoncus. Praesent ac fringilla purus. Suspendisse ut orci non diam tempus commodo ac sit amet tellus. Fusce vehicula sagittis ullamcorper. Vivamus eleifend vestibulum fermentum. Ut cursus ultricies neque vel viverra.\n" +
                "\n" +
                "In arcu lorem, porttitor non est a, condimentum hendrerit ante. Donec vitae interdum diam. Mauris quis tortor blandit, semper sem porttitor, mollis odio. Pellentesque ac velit dignissim, finibus metus et, commodo sapien. Duis efficitur, turpis at sodales pretium, magna ligula elementum nunc, feugiat ultrices turpis velit at diam. Phasellus nunc enim, blandit sit amet felis in, luctus bibendum sem. Vivamus quis sem eu orci sodales imperdiet in eu dui. Morbi eget elementum est, at aliquam nulla. Aliquam id risus sit amet nulla pretium egestas. Etiam pellentesque ligula a lobortis posuere. Proin quis molestie sem. Aliquam pulvinar leo vitae accumsan ullamcorper. Proin ornare, elit non viverra tristique, massa metus scelerisque augue, ac consectetur sem orci eleifend mi. Proin et ipsum egestas, cursus quam in, consequat felis.\n" +
                "\n" +
                "Mauris non tincidunt tortor. Vestibulum euismod non nisl molestie vehicula. Vivamus tincidunt orci nibh. Vivamus dictum bibendum vestibulum. Praesent sem odio, suscipit nec interdum posuere, varius vitae felis. Quisque vel laoreet enim. Nam laoreet nisi et odio laoreet accumsan. Vivamus id commodo tellus, et vestibulum neque. Quisque tristique vulputate enim eget viverra. Sed consequat iaculis sem, in egestas velit blandit in. Quisque luctus, odio vitae iaculis pulvinar, augue mauris venenatis libero, dapibus commodo justo velit at augue. Proin dignissim mi eget sem bibendum tempus. Maecenas nulla lectus, mollis id est id, placerat elementum arcu. Maecenas euismod ipsum vel auctor pulvinar. Aliquam scelerisque neque mauris, vitae vestibulum mauris interdum ut.\n" +
                "\n" +
                "Integer vitae nibh ante. Sed eleifend, eros consectetur maximus ultrices, turpis libero convallis neque, sed mollis erat nisi sit amet lectus. Sed in varius risus. Nam interdum risus ut metus euismod vehicula. In consectetur rutrum arcu et finibus. Etiam convallis sed erat sit amet molestie. Maecenas vitae tellus vel quam cursus sollicitudin et vel nisl. Quisque accumsan rutrum lacus, ac tempor augue tincidunt non. Cras eleifend ac dui nec consectetur. Donec vehicula sodales magna, id faucibus lorem facilisis eget. Sed consectetur id lorem at dignissim.";

        Scanner in = new Scanner(System.in);
//        String text = in.nextLine();
        String text = str;
        while (text.contains("\n\n")) {
            text = text.replaceAll("\n\n", "\n");
        }
        String[] paragraphs = text.split("\n");
        int[] strLength = new int[paragraphs.length];

        for (int index = 0; index < paragraphs.length; index++) {
            strLength[index] = paragraphs[index].split("\s").length;
            System.out.println(strLength[index]);
        }

    }
}


