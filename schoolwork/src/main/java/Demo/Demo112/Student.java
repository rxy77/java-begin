package Demo.Demo112;

public class Student {
    private String name;
    private int age;
    private boolean isMale;
    private double score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                ", score=" + score +
                '}';
    }

    public Student(String name, int age, boolean isMale, double score) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.score = score;
    }

    public void show(){
        String m;
        if (this.isMale==true){
            m="MALE";
        }else {
            m="FEMALE";
        }
        System.out.println(this.name+","+this.age+","+m+","+this.score);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
