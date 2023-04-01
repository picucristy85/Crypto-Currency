public class Main {
  public static void main(String[] args) {
    Bitcoin bitcoin = new Bitcoin(1000);      //valoarea initiala pentru Bitcoin
    Ethereum ethereum = new Ethereum(1000);   //valoarea initiala pentru Ethereum
    XRP xrp = new XRP(1000);                  //valoarea initiala pentru XRP

    for (int i = 0; i < 30; i++) {      //Fluctuatiile monedelor timp de 30 de zile
      bitcoin.changeValue();
      ethereum.changeValue();
      xrp.changeValue();
    }

    System.out.println(" ");
    //in continuare, vom afisa valorile finale ale monedelor
    System.out.println("Bitcoin a ajuns la valoarea finala de " + bitcoin.valueInUSD);
    System.out.println("Ethereum a ajuns la valoarea finala de " + ethereum.valueInUSD);
    System.out.println("XRP a ajuns la valoarea finala de " + xrp.valueInUSD);
  }
}
