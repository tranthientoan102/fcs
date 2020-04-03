public class Student{

    public String name;
    public int age;
    public String favoriteFood;
    public String grade;
    public double height;
    public double weight;
    public int numberOfSubject;


    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("\t name: ").append(this.name).append("\n");
        builder.append("\t age: ").append(this.age).append("\n");
        builder.append("\t favorite food: ").append(this.favoriteFood).append("\n");
        builder.append("\t grade: ").append(this.grade).append("\n");
        builder.append("\t height: ").append(height).append("\n");
        builder.append("\t weight: ").append(this.weight).append("\n");
        builder.append("\t numberOfSubject: ").append(this.numberOfSubject).append("\n");

        return builder.toString();
    }


}
