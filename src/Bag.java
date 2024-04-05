public class Bag {
    //
    String color;
    //кошелек
    private Wallet wallet;
    //мобильник
    private Phone phone;

    public Bag(String color, Wallet wallet, Phone phone) {
        this.color = color;
        this.wallet = wallet;
        this.phone = phone;
    }

    public Bag(String color) {
        this.color = color;
        //кошелек и телефон отсуствуют - ссылки содержат null
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getColor() {
        return color;
    }

    public boolean hasPhone(){
        return phone != null;
    }

    public boolean hasWallet(){
        return wallet != null;
    }

    public int getWalletMoney(){
        if (hasWallet())
            return wallet.getMoney();
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "color='" + color + '\'' +
                ", wallet=" + wallet +
                ", phone=" + phone +
                '}';
    }
}
