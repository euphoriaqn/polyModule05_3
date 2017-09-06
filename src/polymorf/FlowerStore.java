package polymorf;

/**
 * Created by user22 on 22.08.2017.
 */
public class FlowerStore {
    private int Wallet;
    public Flower[] sell(int numbRoses, int numbCharmomile, int numbTulip){
        replenishWallet(numbRoses, numbCharmomile, numbTulip);
        Flower flower[] = new Flower[numbCharmomile+numbRoses+numbTulip];
        for (int i = 0; i <numbRoses; i++){
            flower[i] = new Rose(100);
        }
        for (int i = numbRoses; i< numbRoses+numbCharmomile; i ++){
            flower[i] = new Chamomile(70);
        }
        for (int i = numbCharmomile+numbRoses; i < numbCharmomile+numbRoses+numbTulip; i++){
            flower[i] = new Tulip(45);
        }
        return flower;
    }

    public Flower[] sellSequence(int numbRoses, int numbCharmomile, int numbTulip){
        replenishWallet(numbRoses, numbCharmomile, numbTulip);
        Flower flower[] = new Flower[numbCharmomile+numbRoses+numbTulip];
        int countRoses = numbRoses;
        int countCharmimile = numbCharmomile;
        int countTulip = numbTulip;
        int iCount = 0;
        while (countRoses > 0 || countCharmimile > 0 || countTulip > 0){
            if (countRoses > 0) {flower[iCount] = new Rose(100);
            iCount++;
            countRoses--;
            }
            if (countCharmimile > 0) {flower[iCount] = new Chamomile(70);
            iCount++;
            countCharmimile--;
            }
            if (countTulip > 0) {flower[iCount] = new Tulip(45);
            iCount++;
            countTulip--;
            }
        }
        return flower;
    }

    public void replenishWallet(int numbRoses, int numbCharmomile, int numbTulip){
        Wallet = Wallet + numbRoses*new Rose(100).getPrice() + numbCharmomile*new Chamomile(70).getPrice() + numbTulip*new Tulip(45).getPrice();
    }
    public int getWallet(){
        return Wallet;
    }
}
