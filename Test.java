public class Test{

    int val = 0;
    int[] arr = new int[10];

    //default constructor
    public Test(){
    }

    //generate constructor initialize val
    public Test(int val){
        this.val = val; //AUTO GENERATED
    }

    //increment val
    public void incrementVal()
    {
        val++; //AUTO GENERATED
    }

    public int getRandomNumber(int max){
        return (int)(Math.random() * max); //AUTO GENERATED
    }

    //get random number from array
    public int getRandomNumberFromArray(){
        return arr[getRandomNumber(arr.length)]; //AUTO GENERATED
    }
}