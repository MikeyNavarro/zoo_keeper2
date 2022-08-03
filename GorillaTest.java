public class GorillaTest {
  public static void main(String[] args){
    Gorilla gorilla = new Gorilla();

    // have the gorilla climb three times utilizing a while loop

    int i = 0;
    while(i <= 3){
      gorilla.climb();
      i++;
  }
    gorilla.eatBannas();
    gorilla.eatBannas();
    gorilla.climb();

}
}