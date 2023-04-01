public class Bitcoin extends CryptoCurrency {
  public Bitcoin(double valueInUSD) { //cream constructorul clasei Bitcoin
    super(valueInUSD);
  }

  @Override
  public void changeValue() {                     //in aceasta metoda, verificam fluctuatiile cursului Bitcoin
    int probabilitate = generator.nextInt(11);                  //luam o variabila "probabilitate", care
                                //va primi o valoare random, cuprinsa intre 0 si 10 [bound-ul este setat la 11]
    if (probabilitate <= 4) {                                 //Bitcoin are o probabilitate de 40% de a scadea
      valueInUSD -= 80.0;                   //iar valoarea cu care va scadea, va fi, de fiecare data, cu 80 USD
      System.out.println("Bitcoin a scazut cu 80 USD");  //afisam si un mesaj corespunzator fluctuatiei de pret
    } else {                                                  //Bitcoin are o probabilitate de 60% de a screste
      valueInUSD += 100.0;                 //iar valoarea cu care va creste, va fi, de fiecare data, cu 100 USD
      System.out.println("Bitcoin a crescut cu 100 USD");//afisam si un mesaj corespunzator fluctuatiei de pret
    }
  }
}
