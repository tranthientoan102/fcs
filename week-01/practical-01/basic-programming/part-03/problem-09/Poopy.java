public class Poopy{

    public String name;
    public int age;
    public String favoriteFood;
    public double height;
    public double weight;
    public String favoriteToy;
    public String ownerName;


    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("\t name: ").append(this.name).append("\n");
        builder.append("\t age: ").append(this.age).append("\n");
        builder.append("\t favoriteFood: ").append(this.favoriteFood).append("\n");
        builder.append("\t height: ").append(height).append("\n");
        builder.append("\t weight: ").append(this.weight).append("\n");
        builder.append("\t favoriteToy: ").append(this.favoriteToy).append("\n");
        builder.append("\t ownerName: ").append(this.ownerName).append("\n");

        return builder.toString();
    }


}