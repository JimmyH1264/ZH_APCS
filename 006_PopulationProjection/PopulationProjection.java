public class PopulationProjection
//this you always need to start java, the things after class is the name of the file
{
    public static void main(String[] args){
        int thePPL = 312032486;
        //the total population of the US, got the number from the assignment
        int theDayOfTheYear = 365;
        //weird numbers, but means howmany days are in the year
        int theHouOfTheDay = 24;
        //how many hours are in the days
        int theSecOfTheHou = 3600;
        //how many second are in the hours
        int theSecOfTheYear = theDayOfTheYear * theHouOfTheDay * theSecOfTheHou;
        //i thought it will be good to let java work for me so i did the calculation in there, this means how many seconds in a year
        int theB = theSecOfTheYear/7;
        // how many 7 seconds in a year which reflects people born ever 7 sec
        int theD = theSecOfTheYear/-13;
        // how many -13 seconds in a year which reflects people die every 13 sec
        int theImm = theSecOfTheYear/45;
        //how many 45 seconds are in a year which reflects people move in every 45 sec
        int theGain = theB + theD + theImm;
        // the total number of people who born die and move in in a year
        System.out.println("original PPL "+ thePPL );
        //original ppl
        System.out.println("1st year     " + (thePPL+theGain));
        //first year
        System.out.println("2nd year     " + (thePPL + theGain*2));
        //second year so basicall added the total number changed in ppl in a year two times
        System.out.println("3rd year     " + (thePPL + theGain*3));
        //3 times
        System.out.println("4th year     " + (thePPL + theGain*4));
        System.out.println("5th year     " + (thePPL + theGain*5));
        System.out.println("All those numbers are just estimation");
        //just explaining
    }
}