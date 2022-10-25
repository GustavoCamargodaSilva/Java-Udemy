package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Entities.comment;
import Entities.post;

public class program2 {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        comment c1 = new comment("Have a nice trip!");
        comment c2 = new comment("Wow that's awesome!");
        post p1 = new post(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to new Zealand", 12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        scan.close();
    }
}
