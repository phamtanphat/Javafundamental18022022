public class Animal {
    String weight;
    String height;


    //constructor method
    public Animal(String weight , String height){
        this.weight = weight;
        this.height = height;
    }


    // print properties
    public void showInfo(){
        System.out.println("Weight : " + weight);
        System.out.println("Height : " + height);
    }
}
