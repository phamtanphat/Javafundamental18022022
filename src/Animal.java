public class Animal {
    public String weight;
    public String height;

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

    // getter , setter
    public String getWeight(){
        return weight;
    }

    public void setWeight(String weight){
        if (weight.length() <= 0){
            System.out.println("Giá trị rỗng");
        }else{
            this.weight = weight;
        }
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
