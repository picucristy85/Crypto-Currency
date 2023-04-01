public class XRP extends CryptoCurrency {
  public XRP(double valueInUSD) {
    super(valueInUSD);
  }

  @Override
  public void changeValue() {                         //in aceasta metoda, verificam fluctuatiile cursului XRP
    int probabilitate = generator.nextInt(11);                 //luam o variabila "probabilitate", care
                                //va primi o valoare random, cuprinsa intre 0 si 10 [bound-ul este setat la 11]
    if (probabilitate <= 2) {   //XRP are o probabilitate de 20% de a scadea
      valueInUSD -= 30.0;       //iar valoarea cu care va scadea, va fi, de fiecare data, cu 30 USD
      System.out.println("XRP a scazut cu 30 USD");      //afisam si un mesaj corespunzator fluctuatiei de pret
    } else {                    //XRP are o probabilitate de 80% de a scadea
      valueInUSD += 10.0;       //iar valoarea cu care va creste, va fi, de fiecare data, cu 10 USD
      System.out.println("XRP a crescut cu 10 USD");     //afisam si un mesaj corespunzator fluctuatiei de pret
    }
  }
}
