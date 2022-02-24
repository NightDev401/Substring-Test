package org.scorpion;

/**
 * @author Lukas on 2/24/2022
 */
public class SubLukas {

    public static void main(String[] s) {
        String time = "mute lukas test 22h";
        String[] args = time.split(" ");

        System.out.println(sortData(args[3])[0]);
        System.out.println(sortData(args[3])[1]);

    }

    public static Object[] sortData(String input){
        String format = input.substring(input.length()-1);
        long du = Long.parseLong(input.substring(0, input.length()-1));
        return new Object[] {format,du};
    }


}
