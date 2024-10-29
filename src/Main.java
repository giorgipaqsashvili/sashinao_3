public class Main {
    public static void main(String[] args) {
    /*
    1) დაწერეთ პროგრამა, რომელიც გამოთვლის მოცემული სამი მთელი რიცხვის საშუალოს
     */
    int num_1 = 3;
    int num_2 = 6;
    int num_3 = 8;

    double sashualo = (num_1 + num_2 + num_3) / 3D;
    System.out.println(sashualo);


    /*
    2) მოცემული გაქვთ რიცხვი, დაადგინეთ არის თუ არა ეს რიცხვი ლუწი თუ კენტი,
       ტერნერული if-ის გამოყენებით
     */

     int ricxvi = 65;
     boolean luwia = ((ricxvi % 2) > 0) ? false : true;
     System.out.println(luwia);


     /*
     3) მოცემული გაქვთ ორი რიცხვი, დაადგინეთ უდიდესი მათგანი, ტერნერული if-ის
        გამოყენებით
      */
     int x = 14;
     int y = 54;

     String metia = (x > y) ? "x metia" : "y metia";
     System.out.println(metia);

     /*
     4) დაწერეთ პროგრამა, რომელიც გამოითვლის მოცემული რიცხვის ციფრების ჯამს.
        (მხოლოდ 4 ნიშნა რიცხვებისთვის)
      */
     int num = 1234;

     int jami_1 = num % 10;
     int jami_2 = (int) (num/10) % 10;
     int jami_3 = (int) (num/100) % 10;
     int jami_4 = (int) (num/1000) % 10;

     int jami_egaa = jami_1 + jami_2 + jami_3 +jami_4;
     System.out.println(jami_egaa);


     /*
     5) დაადგინეთ არის თუ არა სამი რიცხვისგან შესაძლებელი სამკუთხედის აშენება. ეს რიცხვბი
        წარმოადგენენ სამკუთხედის კუთხის ზომებს
      */

      int a = 80;
      int b = 70;
      int c = 30;

      if (a + b + c == 180){
          if (a != 180){
              if (b != 180){
                  if (c != 180){
                      System.out.println("shedgeba");
                  }else {
                      System.out.println("ar shedgeba");
                  }
              }else {
                  System.out.println("ar shedgeba");
              }
          }else {
              System.out.println("ar shedgeba");
          }
          ;
      }else {
          System.out.println("ar shedgeba");
      }




    }
}