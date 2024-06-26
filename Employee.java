package mext.test.rectangle.iki;

public class Employee { // "public" bu sınıfın her yerden erişilebilir olduğunu belirtir
    // çalışanın adını tutan değişken
    private String name; //"private" bu değişkenin sadece bu sınıfın içinden erişilebilir olduğunu belirtir.
    // çalışsanın maaşını tutan ondalıklı sayı değişkeni
    protected double salary; // bu değişkene aynı paket içerisinden veya alt sınıflardan erişilebilir
    // çalışanın yaşını tutan tam sayı değişkeni
    private int age; //"private" bu değişkenin sadece bu sınıfın içinden erişilebilir olduğunu belirtir.

    public Employee(String name, double salary, int age){ // bu sınıfın bir örneği oluşturulurken çağırılan metottur.
        this.name = name; //"name" parametresini sınıfın name değişkenine atar.
        this.salary = salary; //"salary" parametresini sınıfın salary değişkenine atar.
        this.age = age; //"age" parametresini sınıfın age değişkenine atar.
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter ve Setter metotları;
    // Bu metotlar, özel değişkenlerin değerlerini dış dünyaya (başka sınıflara yani) vermek için kullanılır.
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double salary(){
        return this.salary;
    }
    public void raiseSalary() {
        this.salary = this.salary * 1.2;
    }
}
