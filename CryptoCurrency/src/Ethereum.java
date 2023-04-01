public class Ethereum extends CryptoCurrency {
  public Ethereum(double valueInUSD) {
    super(valueInUSD);
  }

  @Override
  public void changeValue() {                    //in aceasta metoda, verificam fluctuatiile cursului Ethereum
    int probabilitate = generator.nextInt(11);                  //luam o variabila "probabilitate", care
                                //va primi o valoare random, cuprinsa intre 0 si 10 [bound-ul este setat la 11]
    if (probabilitate <= 5) {    //Ethereum are o probabilitate de 50% de a scadea
      valueInUSD -= 50.0;       //iar valoarea cu care va scadea, va fi, de fiecare data, cu 50 USD
      System.out.println("Ethereum a scazut cu 50 USD"); //afisam si un mesaj corespunzator fluctuatiei de pret
    } else {                     //Ethereum are o probabilitate de 50% de a creste
      valueInUSD += 50.0;        //iar valoarea cu care va creste, va fi, de fiecare data, cu 50 USD
      System.out.println("Ethereum a crescut cu 50 USD");//afisam si un mesaj corespunzator fluctuatiei de pret
    }
  }
}
