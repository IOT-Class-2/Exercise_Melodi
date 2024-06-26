package mext.test.rectangle.iki;

public class Engineer extends Employee { // public bu sınıfın her yerinden erişilebilir olduğunu belirtir.
    //'extends' employee engineer classını(sınıfını) employee sınıfından şifre aldığını belirtir.
    //'employee' sınıfından miras aldığını belirtir.yani engineer sınıfının tüm özelliklerine ve metotlarına sahip olur.

    public Engineer(String name, double salary, int age) { //bu sınıfın yapıcı örneğini oluşturulurken çağırılan metodudur.
        super(name, salary, age); // 'employee' sınıfının yapıcı metodunu çağırır.'name','salary','age', parametrelerini
        //'employee'sınıfına iletir.
    }
    public double getAnnualBonus() { // enginner ın yıllık bonusunu hesaplayan metottur ve bu metotu döndürür.
        return super.salary * .85;
        // bu metot employee sınıfından alınan maaş/salary değişkenine erişir.
        //Ne ile erişir? super anahtar kelimesi ile erişir.
        //Metotun genel işlevi ise maaşın %5 ini hesaplar ve döndürür.Bu engineerın yıllık bonusunu belirler.
    }
}
