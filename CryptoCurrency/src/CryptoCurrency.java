import java.util.Random;public abstract class CryptoCurrency {
    double valueInUSD;
    protected Random generator=new Random(); // cream un generator de tip random
    // si il declaram protected pentru a-l putea folosi si in celelalte clase
  public CryptoCurrency(double valueInUSD) { //cream constructorul
    this.valueInUSD = valueInUSD;
  }

  public abstract void changeValue(); //cream metoda abstracta changeValue()
}
