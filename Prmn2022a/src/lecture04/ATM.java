package lecture04;

import java.util.ArrayList;

public class ATM {
    private ArrayList<Account> List;

    public ATM(){
        List = new ArrayList<>();
    }

    public void registerAccount(String name, String number) {
        if(existAccount(name, number)) {
            System.out.println("名前:"+name+" 口座番号:"+number+" は存在します。");
        }else{
            System.out.println("名前:"+name+" 口座番号:"+number+" は存在しません。");
            List.add(new Account(name, number));
            System.out.println(name + "さんのアカウントを口座番号:" + number + "で登録しました。");
        }
    }

    private boolean existAccount(String name, String number) {
        for (Account account : List) {
            if( account.getName().equals(name) && account.getNumber().equals(number)) {
                return true;
            }
        }
        return false;
    }

    public void deposit(String number, long money) {
        for (Account account : List) {
            if (account.getNumber().equals(number)) {
                account.setBalance(account.getBalance() + money);
                System.out.println("口座番号:" + number + " に " + money + " 円入金しました。");
                return;
            }
            System.out.println("口座番号:"+number+" は存在しません。");
        }
    }

    public long withdraw(String number, long money) {
        for (Account account : List) {
            if(account.getNumber().equals(number)) {
                if(account.getBalance() <= money){
                    System.out.print("口座番号:"+number+" から "+money+" 円引き出せませんでした。");
                }else{
                    account.setBalance(account.getBalance() - money);
                    System.out.print("口座番号:"+number+" から "+money+" 円引き出しました。");
                }
                System.out.println("残高:"+account.getBalance()+"円です。");
                return account.getBalance();
            }
        }
        System.out.println("口座番号:"+number+" は存在しません。");
        return -1;
    }
}
