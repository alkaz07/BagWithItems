public class Main {
    public static void main(String[] args) {
        Bag bag1 = new Bag("красная");
        Bag bag2 = new Bag("белая", new Wallet("кож","синий", 2, 1500), new Phone("Моторола", 95));

        System.out.println("первая сумка содержит телефон: "+bag1.getPhone());
        System.out.println("вторая сумка содержит телефон: "+bag2.getPhone());
        //доступ к свойствам телефона в сумке с проеркой ссылки
        if(bag1.getPhone() != null)
            System.out.println("модель телефона, который есть в первой сумке: "+bag1.getPhone().getModel());
        if(bag2.getPhone() != null)
            System.out.println("модель телефона, который есть во второй сумке: "+bag2.getPhone().getModel());

        //доступ к свойствам кошелька с проверкой наличия
        if(bag1.hasWallet())
            System.out.println("в сумочке 1 есть кошелек а в нем: "+bag1.getWallet().getMoney());
        if(bag2.hasWallet())
            System.out.println("в сумочке 2 есть кошелек а в нем: "+bag2.getWallet().getMoney());

        //доступ к свойствам кошелька отдельным методом сумки
        System.out.println("порывшись в 1 сумке, можно найти "+bag1.getWalletMoney()+" денег внутри кошелька");
        System.out.println("порывшись в 2 сумке, можно найти "+bag2.getWalletMoney()+" денег внутри кошелька");
    }
}