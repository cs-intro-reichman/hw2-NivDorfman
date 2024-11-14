public class TimeCalc {
    public static void main(String[] args) {
           int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
           int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
           int minuteAdd = Integer.parseInt(args[1]);
        
           minutes += hours*60 +minuteAdd;
           hours = minutes/60;
           int newHour = hours % 24;
           int newMinutes = minutes - hours * 60;

           System.out.println(newHour + ":" + newMinutes);    }
}
